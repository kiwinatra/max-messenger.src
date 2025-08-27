package org.apache.http.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public abstract class AbstractSessionOutputBuffer implements SessionOutputBuffer {
    private static final byte[] CRLF = {13, 10};
    private static final int MAX_CHUNK = 256;
    private boolean ascii = true;
    private ByteArrayBuffer buffer;
    private String charset = "US-ASCII";
    private HttpTransportMetricsImpl metrics;
    private OutputStream outstream;

    public void flush() throws IOException {
        flushBuffer();
        this.outstream.flush();
    }

    public void flushBuffer() throws IOException {
        int length = this.buffer.length();
        if (length > 0) {
            this.outstream.write(this.buffer.buffer(), 0, length);
            this.buffer.clear();
            this.metrics.incrementBytesTransferred((long) length);
        }
    }

    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }

    public void init(OutputStream outputStream, int i, HttpParams httpParams) {
        if (outputStream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (i <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        } else if (httpParams != null) {
            this.outstream = outputStream;
            this.buffer = new ByteArrayBuffer(i);
            String httpElementCharset = HttpProtocolParams.getHttpElementCharset(httpParams);
            this.charset = httpElementCharset;
            this.ascii = httpElementCharset.equalsIgnoreCase("US-ASCII") || this.charset.equalsIgnoreCase(HTTP.ASCII);
            this.metrics = new HttpTransportMetricsImpl();
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            if (i2 > MAX_CHUNK || i2 > this.buffer.capacity()) {
                flushBuffer();
                this.outstream.write(bArr, i, i2);
                this.metrics.incrementBytesTransferred((long) i2);
                return;
            }
            if (i2 > this.buffer.capacity() - this.buffer.length()) {
                flushBuffer();
            }
            this.buffer.append(bArr, i, i2);
        }
    }

    public void writeLine(String str) throws IOException {
        if (str != null) {
            if (str.length() > 0) {
                write(str.getBytes(this.charset));
            }
            write(CRLF);
        }
    }

    public void writeLine(CharArrayBuffer charArrayBuffer) throws IOException {
        if (charArrayBuffer != null) {
            if (this.ascii) {
                int length = charArrayBuffer.length();
                int i = 0;
                while (length > 0) {
                    int min = Math.min(this.buffer.capacity() - this.buffer.length(), length);
                    if (min > 0) {
                        this.buffer.append(charArrayBuffer, i, min);
                    }
                    if (this.buffer.isFull()) {
                        flushBuffer();
                    }
                    i += min;
                    length -= min;
                }
            } else {
                write(charArrayBuffer.toString().getBytes(this.charset));
            }
            write(CRLF);
        }
    }

    public void write(byte[] bArr) throws IOException {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
        }
    }

    public void write(int i) throws IOException {
        if (this.buffer.isFull()) {
            flushBuffer();
        }
        this.buffer.append(i);
    }
}
