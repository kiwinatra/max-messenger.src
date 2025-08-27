package org.apache.http.conn.scheme;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
public final class PlainSocketFactory implements SocketFactory {
    private static final PlainSocketFactory DEFAULT_FACTORY = new PlainSocketFactory();
    private final HostNameResolver nameResolver;

    public PlainSocketFactory(HostNameResolver hostNameResolver) {
        this.nameResolver = hostNameResolver;
    }

    public static PlainSocketFactory getSocketFactory() {
        return DEFAULT_FACTORY;
    }

    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        } else if (httpParams != null) {
            if (socket == null) {
                socket = createSocket();
            }
            if (inetAddress != null || i2 > 0) {
                if (i2 < 0) {
                    i2 = 0;
                }
                socket.bind(new InetSocketAddress(inetAddress, i2));
            }
            int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpParams);
            InetSocketAddress inetSocketAddress = this.nameResolver != null ? new InetSocketAddress(this.nameResolver.resolve(str), i) : new InetSocketAddress(str, i);
            try {
                socket.connect(inetSocketAddress, connectionTimeout);
                return socket;
            } catch (SocketTimeoutException unused) {
                throw new ConnectTimeoutException("Connect to " + inetSocketAddress + " timed out");
            }
        } else {
            throw new IllegalArgumentException("Parameters may not be null.");
        }
    }

    public Socket createSocket() {
        return new Socket();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return PlainSocketFactory.class.hashCode();
    }

    public final boolean isSecure(Socket socket) throws IllegalArgumentException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null.");
        } else if (socket.getClass() != Socket.class) {
            throw new IllegalArgumentException("Socket not created by this factory.");
        } else if (!socket.isClosed()) {
            return false;
        } else {
            throw new IllegalArgumentException("Socket is closed.");
        }
    }

    public PlainSocketFactory() {
        this((HostNameResolver) null);
    }
}
