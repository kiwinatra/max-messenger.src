package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public abstract class AbstractSessionInputBuffer implements SessionInputBuffer {
    private boolean ascii = true;
    private byte[] buffer;
    private int bufferlen;
    private int bufferpos;
    private String charset = "US-ASCII";
    private InputStream instream;
    private ByteArrayBuffer linebuffer = null;
    private int maxLineLen = -1;
    private HttpTransportMetricsImpl metrics;

    private int lineFromLineBuffer(CharArrayBuffer charArrayBuffer) throws IOException {
        int length = this.linebuffer.length();
        if (length > 0) {
            if (this.linebuffer.byteAt(length - 1) == 10) {
                length--;
                this.linebuffer.setLength(length);
            }
            if (length > 0 && this.linebuffer.byteAt(length - 1) == 13) {
                this.linebuffer.setLength(length - 1);
            }
        }
        int length2 = this.linebuffer.length();
        if (this.ascii) {
            charArrayBuffer.append(this.linebuffer, 0, length2);
        } else {
            charArrayBuffer.append(new String(this.linebuffer.buffer(), 0, length2, this.charset));
        }
        return length2;
    }

    private int lineFromReadBuffer(CharArrayBuffer charArrayBuffer, int i) throws IOException {
        int i2 = this.bufferpos;
        this.bufferpos = i + 1;
        if (i > i2 && this.buffer[i - 1] == 13) {
            i--;
        }
        int i3 = i - i2;
        if (this.ascii) {
            charArrayBuffer.append(this.buffer, i2, i3);
        } else {
            charArrayBuffer.append(new String(this.buffer, i2, i3, this.charset));
        }
        return i3;
    }

    private int locateLF() {
        for (int i = this.bufferpos; i < this.bufferlen; i++) {
            if (this.buffer[i] == 10) {
                return i;
            }
        }
        return -1;
    }

    public int fillBuffer() throws IOException {
        int i = this.bufferpos;
        if (i > 0) {
            int i2 = this.bufferlen - i;
            if (i2 > 0) {
                byte[] bArr = this.buffer;
                System.arraycopy(bArr, i, bArr, 0, i2);
            }
            this.bufferpos = 0;
            this.bufferlen = i2;
        }
        int i3 = this.bufferlen;
        byte[] bArr2 = this.buffer;
        int read = this.instream.read(bArr2, i3, bArr2.length - i3);
        if (read == -1) {
            return -1;
        }
        this.bufferlen = i3 + read;
        this.metrics.incrementBytesTransferred((long) read);
        return read;
    }

    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }

    public boolean hasBufferedData() {
        return this.bufferpos < this.bufferlen;
    }

    public void init(InputStream inputStream, int i, HttpParams httpParams) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (i <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        } else if (httpParams != null) {
            this.instream = inputStream;
            this.buffer = new byte[i];
            boolean z = false;
            this.bufferpos = 0;
            this.bufferlen = 0;
            this.linebuffer = new ByteArrayBuffer(i);
            String httpElementCharset = HttpProtocolParams.getHttpElementCharset(httpParams);
            this.charset = httpElementCharset;
            if (httpElementCharset.equalsIgnoreCase("US-ASCII") || this.charset.equalsIgnoreCase(HTTP.ASCII)) {
                z = true;
            }
            this.ascii = z;
            this.maxLineLen = httpParams.getIntParameter("http.connection.max-line-length", -1);
            this.metrics = new HttpTransportMetricsImpl();
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    public int read() throws IOException {
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.buffer;
        int i = this.bufferpos;
        this.bufferpos = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r2 == -1) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int readLine(org.apache.http.util.CharArrayBuffer r8) throws java.io.IOException {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0075
            org.apache.http.util.ByteArrayBuffer r0 = r7.linebuffer
            r0.clear()
            r0 = 1
            r1 = 0
            r2 = r1
        L_0x000a:
            r3 = -1
            if (r0 == 0) goto L_0x0065
            int r4 = r7.locateLF()
            if (r4 == r3) goto L_0x0031
            org.apache.http.util.ByteArrayBuffer r0 = r7.linebuffer
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0020
            int r7 = r7.lineFromReadBuffer(r8, r4)
            return r7
        L_0x0020:
            int r4 = r4 + 1
            int r0 = r7.bufferpos
            int r3 = r4 - r0
            org.apache.http.util.ByteArrayBuffer r5 = r7.linebuffer
            byte[] r6 = r7.buffer
            r5.append((byte[]) r6, (int) r0, (int) r3)
            r7.bufferpos = r4
        L_0x002f:
            r0 = r1
            goto L_0x004e
        L_0x0031:
            boolean r2 = r7.hasBufferedData()
            if (r2 == 0) goto L_0x0047
            int r2 = r7.bufferlen
            int r4 = r7.bufferpos
            int r2 = r2 - r4
            org.apache.http.util.ByteArrayBuffer r5 = r7.linebuffer
            byte[] r6 = r7.buffer
            r5.append((byte[]) r6, (int) r4, (int) r2)
            int r2 = r7.bufferlen
            r7.bufferpos = r2
        L_0x0047:
            int r2 = r7.fillBuffer()
            if (r2 != r3) goto L_0x004e
            goto L_0x002f
        L_0x004e:
            int r3 = r7.maxLineLen
            if (r3 <= 0) goto L_0x000a
            org.apache.http.util.ByteArrayBuffer r3 = r7.linebuffer
            int r3 = r3.length()
            int r4 = r7.maxLineLen
            if (r3 >= r4) goto L_0x005d
            goto L_0x000a
        L_0x005d:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Maximum line length limit exceeded"
            r7.<init>(r8)
            throw r7
        L_0x0065:
            if (r2 != r3) goto L_0x0070
            org.apache.http.util.ByteArrayBuffer r0 = r7.linebuffer
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0070
            return r3
        L_0x0070:
            int r7 = r7.lineFromLineBuffer(r8)
            return r7
        L_0x0075:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Char array buffer may not be null"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.io.AbstractSessionInputBuffer.readLine(org.apache.http.util.CharArrayBuffer):int");
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return 0;
        }
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        int i3 = this.bufferlen;
        int i4 = this.bufferpos;
        int i5 = i3 - i4;
        if (i5 <= i2) {
            i2 = i5;
        }
        System.arraycopy(this.buffer, i4, bArr, i, i2);
        this.bufferpos += i2;
        return i2;
    }

    public int read(byte[] bArr) throws IOException {
        if (bArr == null) {
            return 0;
        }
        return read(bArr, 0, bArr.length);
    }

    public String readLine() throws IOException {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        if (readLine(charArrayBuffer) != -1) {
            return charArrayBuffer.toString();
        }
        return null;
    }
}
