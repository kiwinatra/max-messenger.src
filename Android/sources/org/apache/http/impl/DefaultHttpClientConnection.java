package org.apache.http.impl;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
public class DefaultHttpClientConnection extends SocketHttpClientConnection {
    public void bind(Socket socket, HttpParams httpParams) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        } else if (httpParams != null) {
            assertNotOpen();
            socket.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(httpParams));
            socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
            int linger = HttpConnectionParams.getLinger(httpParams);
            if (linger >= 0) {
                socket.setSoLinger(linger > 0, linger);
            }
            super.bind(socket, httpParams);
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        if (isOpen()) {
            stringBuffer.append(getRemotePort());
        } else {
            stringBuffer.append("closed");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
