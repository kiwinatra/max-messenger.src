package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public class LoggingSessionInputBuffer implements SessionInputBuffer {
    private final SessionInputBuffer in;
    private final Wire wire;

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire2) {
        this.in = sessionInputBuffer;
        this.wire = wire2;
    }

    public HttpTransportMetrics getMetrics() {
        return this.in.getMetrics();
    }

    public boolean isDataAvailable(int i) throws IOException {
        return this.in.isDataAvailable(i);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (this.wire.enabled() && read > 0) {
            this.wire.input(bArr, i, read);
        }
        return read;
    }

    public String readLine() throws IOException {
        String readLine = this.in.readLine();
        if (this.wire.enabled() && readLine != null) {
            this.wire.input(readLine.concat("[EOL]"));
        }
        return readLine;
    }

    public int read() throws IOException {
        int read = this.in.read();
        if (this.wire.enabled() && read > 0) {
            this.wire.input(read);
        }
        return read;
    }

    public int readLine(CharArrayBuffer charArrayBuffer) throws IOException {
        int readLine = this.in.readLine(charArrayBuffer);
        if (this.wire.enabled() && readLine > 0) {
            this.wire.input(new String(charArrayBuffer.buffer(), charArrayBuffer.length() - readLine, readLine).concat("[EOL]"));
        }
        return readLine;
    }

    public int read(byte[] bArr) throws IOException {
        int read = this.in.read(bArr);
        if (this.wire.enabled() && read > 0) {
            this.wire.input(bArr, 0, read);
        }
        return read;
    }
}
