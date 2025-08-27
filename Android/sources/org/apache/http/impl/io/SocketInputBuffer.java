package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import kotlin.io.ConstantsKt;
import org.apache.http.params.HttpParams;

@Deprecated
public class SocketInputBuffer extends AbstractSessionInputBuffer {
    private final Socket socket;

    public SocketInputBuffer(Socket socket2, int i, HttpParams httpParams) throws IOException {
        if (socket2 != null) {
            this.socket = socket2;
            init(socket2.getInputStream(), ConstantsKt.DEFAULT_BUFFER_SIZE, httpParams);
            return;
        }
        throw new IllegalArgumentException("Socket may not be null");
    }

    public boolean isDataAvailable(int i) throws IOException {
        boolean hasBufferedData = hasBufferedData();
        if (!hasBufferedData) {
            int soTimeout = this.socket.getSoTimeout();
            try {
                this.socket.setSoTimeout(i);
                fillBuffer();
                hasBufferedData = hasBufferedData();
            } catch (InterruptedIOException e) {
                if (!(e instanceof SocketTimeoutException)) {
                    throw e;
                }
            } catch (Throwable th) {
                this.socket.setSoTimeout(soTimeout);
                throw th;
            }
            this.socket.setSoTimeout(soTimeout);
        }
        return hasBufferedData;
    }

    public boolean isStale() throws IOException {
        boolean z = false;
        if (hasBufferedData()) {
            return false;
        }
        int soTimeout = this.socket.getSoTimeout();
        try {
            this.socket.setSoTimeout(1);
            if (fillBuffer() == -1) {
                z = true;
            }
        } catch (SocketTimeoutException unused) {
        } catch (IOException unused2) {
            this.socket.setSoTimeout(soTimeout);
            return true;
        } catch (Throwable th) {
            this.socket.setSoTimeout(soTimeout);
            throw th;
        }
        this.socket.setSoTimeout(soTimeout);
        return z;
    }
}
