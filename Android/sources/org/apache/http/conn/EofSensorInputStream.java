package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;

@Deprecated
public class EofSensorInputStream extends InputStream implements ConnectionReleaseTrigger {
    private EofSensorWatcher eofWatcher;
    private boolean selfClosed;
    protected InputStream wrappedStream;

    public EofSensorInputStream(InputStream inputStream, EofSensorWatcher eofSensorWatcher) {
        if (inputStream != null) {
            this.wrappedStream = inputStream;
            this.selfClosed = false;
            this.eofWatcher = eofSensorWatcher;
            return;
        }
        throw new IllegalArgumentException("Wrapped stream may not be null.");
    }

    public void abortConnection() throws IOException {
        this.selfClosed = true;
        checkAbort();
    }

    public int available() throws IOException {
        if (!isReadAllowed()) {
            return 0;
        }
        try {
            return this.wrappedStream.available();
        } catch (IOException e) {
            checkAbort();
            throw e;
        }
    }

    public void checkAbort() throws IOException {
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null) {
            try {
                EofSensorWatcher eofSensorWatcher = this.eofWatcher;
                if (eofSensorWatcher != null ? eofSensorWatcher.streamAbort(inputStream) : true) {
                    this.wrappedStream.close();
                }
                this.wrappedStream = null;
            } catch (Throwable th) {
                this.wrappedStream = null;
                throw th;
            }
        }
    }

    public void checkClose() throws IOException {
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null) {
            try {
                EofSensorWatcher eofSensorWatcher = this.eofWatcher;
                if (eofSensorWatcher != null ? eofSensorWatcher.streamClosed(inputStream) : true) {
                    this.wrappedStream.close();
                }
                this.wrappedStream = null;
            } catch (Throwable th) {
                this.wrappedStream = null;
                throw th;
            }
        }
    }

    public void checkEOF(int i) throws IOException {
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null && i < 0) {
            try {
                EofSensorWatcher eofSensorWatcher = this.eofWatcher;
                if (eofSensorWatcher != null ? eofSensorWatcher.eofDetected(inputStream) : true) {
                    this.wrappedStream.close();
                }
                this.wrappedStream = null;
            } catch (Throwable th) {
                this.wrappedStream = null;
                throw th;
            }
        }
    }

    public void close() throws IOException {
        this.selfClosed = true;
        checkClose();
    }

    public boolean isReadAllowed() throws IOException {
        if (!this.selfClosed) {
            return this.wrappedStream != null;
        }
        throw new IOException("Attempted read on closed stream.");
    }

    public int read() throws IOException {
        if (!isReadAllowed()) {
            return -1;
        }
        try {
            int read = this.wrappedStream.read();
            checkEOF(read);
            return read;
        } catch (IOException e) {
            checkAbort();
            throw e;
        }
    }

    public void releaseConnection() throws IOException {
        close();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!isReadAllowed()) {
            return -1;
        }
        try {
            int read = this.wrappedStream.read(bArr, i, i2);
            checkEOF(read);
            return read;
        } catch (IOException e) {
            checkAbort();
            throw e;
        }
    }

    public int read(byte[] bArr) throws IOException {
        if (!isReadAllowed()) {
            return -1;
        }
        try {
            int read = this.wrappedStream.read(bArr);
            checkEOF(read);
            return read;
        } catch (IOException e) {
            checkAbort();
            throw e;
        }
    }
}
