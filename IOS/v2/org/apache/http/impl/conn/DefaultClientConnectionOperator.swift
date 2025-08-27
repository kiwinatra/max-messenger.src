package org.apache.http.impl.conn;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@Deprecated
public class DefaultClientConnectionOperator implements ClientConnectionOperator {
    private static final PlainSocketFactory staticPlainSocketFactory = new PlainSocketFactory();
    protected SchemeRegistry schemeRegistry;

    public DefaultClientConnectionOperator(SchemeRegistry schemeRegistry2) {
        if (schemeRegistry2 != null) {
            this.schemeRegistry = schemeRegistry2;
            return;
        }
        throw new IllegalArgumentException("Scheme registry must not be null.");
    }

    public OperatedClientConnection createConnection() {
        return new DefaultClientConnection();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        r4 = r24;
        r18 = r9;
        r19 = r10;
        r17 = r14;
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cf, code lost:
        r4 = r24;
        r7 = r9;
        r5 = r10;
        r17 = r14;
        r14 = 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0 A[ExcHandler: ConnectTimeoutException (e org.apache.http.conn.ConnectTimeoutException), Splitter:B:14:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00da A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openConnection(org.apache.http.conn.OperatedClientConnection r21, org.apache.http.HttpHost r22, java.net.InetAddress r23, org.apache.http.protocol.HttpContext r24, org.apache.http.params.HttpParams r25) throws java.io.IOException {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            r11 = r25
            if (r2 == 0) goto L_0x0114
            if (r3 == 0) goto L_0x010c
            if (r11 == 0) goto L_0x0104
            boolean r0 = r21.isOpen()
            if (r0 != 0) goto L_0x00fc
            org.apache.http.conn.scheme.SchemeRegistry r0 = r1.schemeRegistry
            java.lang.String r4 = r22.getSchemeName()
            org.apache.http.conn.scheme.Scheme r12 = r0.getScheme((java.lang.String) r4)
            org.apache.http.conn.scheme.SocketFactory r13 = r12.getSocketFactory()
            boolean r0 = r13 instanceof org.apache.http.conn.scheme.LayeredSocketFactory
            if (r0 == 0) goto L_0x002e
            org.apache.http.conn.scheme.PlainSocketFactory r0 = staticPlainSocketFactory
            r4 = r13
            org.apache.http.conn.scheme.LayeredSocketFactory r4 = (org.apache.http.conn.scheme.LayeredSocketFactory) r4
            r14 = r0
            r15 = r4
            goto L_0x0031
        L_0x002e:
            r4 = 0
            r15 = r4
            r14 = r13
        L_0x0031:
            java.lang.String r0 = r22.getHostName()
            java.net.InetAddress[] r10 = java.net.InetAddress.getAllByName(r0)
            r0 = 0
            r9 = r0
        L_0x003b:
            int r0 = r10.length
            if (r9 >= r0) goto L_0x00fb
            java.net.Socket r0 = r14.createSocket()
            r2.opening(r0, r3)
            r8 = 1
            r4 = r10[r9]     // Catch:{ SocketException -> 0x00ce, ConnectTimeoutException -> 0x00b0 }
            java.lang.String r6 = r4.getHostAddress()     // Catch:{ SocketException -> 0x00bb, ConnectTimeoutException -> 0x00b0 }
            int r4 = r22.getPort()     // Catch:{ SocketException -> 0x00bb, ConnectTimeoutException -> 0x00b0 }
            int r7 = r12.resolvePort(r4)     // Catch:{ SocketException -> 0x00bb, ConnectTimeoutException -> 0x00b0 }
            r16 = 0
            r4 = r14
            r5 = r0
            r17 = r14
            r14 = r8
            r8 = r23
            r18 = r9
            r9 = r16
            r19 = r10
            r10 = r25
            java.net.Socket r4 = r4.connectSocket(r5, r6, r7, r8, r9, r10)     // Catch:{ SocketException -> 0x0078, ConnectTimeoutException -> 0x0072 }
            if (r0 == r4) goto L_0x006f
            r2.opening(r4, r3)     // Catch:{ SocketException -> 0x0078, ConnectTimeoutException -> 0x0072 }
            r0 = r4
        L_0x006f:
            r4 = r24
            goto L_0x0081
        L_0x0072:
            r0 = move-exception
            r4 = r24
        L_0x0075:
            r5 = r19
            goto L_0x00c6
        L_0x0078:
            r0 = move-exception
            r4 = r24
        L_0x007b:
            r7 = r18
            r5 = r19
            goto L_0x00d6
        L_0x0081:
            r1.prepareSocket(r0, r4, r11)     // Catch:{ SocketException -> 0x009e, ConnectTimeoutException -> 0x009c }
            if (r15 == 0) goto L_0x00a8
            java.lang.String r5 = r22.getHostName()     // Catch:{ SocketException -> 0x009e, ConnectTimeoutException -> 0x009c }
            int r6 = r22.getPort()     // Catch:{ SocketException -> 0x009e, ConnectTimeoutException -> 0x009c }
            int r6 = r12.resolvePort(r6)     // Catch:{ SocketException -> 0x009e, ConnectTimeoutException -> 0x009c }
            java.net.Socket r5 = r15.createSocket(r0, r5, r6, r14)     // Catch:{ SocketException -> 0x009e, ConnectTimeoutException -> 0x009c }
            if (r5 == r0) goto L_0x00a0
            r2.opening(r5, r3)     // Catch:{ SocketException -> 0x009e, ConnectTimeoutException -> 0x009c }
            goto L_0x00a0
        L_0x009c:
            r0 = move-exception
            goto L_0x0075
        L_0x009e:
            r0 = move-exception
            goto L_0x007b
        L_0x00a0:
            boolean r0 = r13.isSecure(r5)     // Catch:{ SocketException -> 0x009e, ConnectTimeoutException -> 0x009c }
            r2.openCompleted(r0, r11)     // Catch:{ SocketException -> 0x009e, ConnectTimeoutException -> 0x009c }
            goto L_0x00fb
        L_0x00a8:
            boolean r0 = r13.isSecure(r0)     // Catch:{ SocketException -> 0x009e, ConnectTimeoutException -> 0x009c }
            r2.openCompleted(r0, r11)     // Catch:{ SocketException -> 0x009e, ConnectTimeoutException -> 0x009c }
            goto L_0x00fb
        L_0x00b0:
            r0 = move-exception
            r4 = r24
            r18 = r9
            r19 = r10
            r17 = r14
            r14 = r8
            goto L_0x0075
        L_0x00bb:
            r0 = move-exception
            r4 = r24
            r18 = r9
            r19 = r10
            r17 = r14
            r14 = r8
            goto L_0x007b
        L_0x00c6:
            int r6 = r5.length
            int r6 = r6 - r14
            r7 = r18
            if (r7 == r6) goto L_0x00cd
            goto L_0x00f4
        L_0x00cd:
            throw r0
        L_0x00ce:
            r0 = move-exception
            r4 = r24
            r7 = r9
            r5 = r10
            r17 = r14
            r14 = r8
        L_0x00d6:
            int r6 = r5.length
            int r6 = r6 - r14
            if (r7 != r6) goto L_0x00f4
            boolean r1 = r0 instanceof java.net.ConnectException
            if (r1 == 0) goto L_0x00e1
            java.net.ConnectException r0 = (java.net.ConnectException) r0
            goto L_0x00ee
        L_0x00e1:
            java.net.ConnectException r1 = new java.net.ConnectException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2)
            r1.initCause(r0)
            r0 = r1
        L_0x00ee:
            org.apache.http.conn.HttpHostConnectException r1 = new org.apache.http.conn.HttpHostConnectException
            r1.<init>(r3, r0)
            throw r1
        L_0x00f4:
            int r9 = r7 + 1
            r10 = r5
            r14 = r17
            goto L_0x003b
        L_0x00fb:
            return
        L_0x00fc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Connection must not be open."
            r0.<init>(r1)
            throw r0
        L_0x0104:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Parameters must not be null."
            r0.<init>(r1)
            throw r0
        L_0x010c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Target host must not be null."
            r0.<init>(r1)
            throw r0
        L_0x0114:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Connection must not be null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(org.apache.http.conn.OperatedClientConnection, org.apache.http.HttpHost, java.net.InetAddress, org.apache.http.protocol.HttpContext, org.apache.http.params.HttpParams):void");
    }

    public void prepareSocket(Socket socket, HttpContext httpContext, HttpParams httpParams) throws IOException {
        socket.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(httpParams));
        socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
        int linger = HttpConnectionParams.getLinger(httpParams);
        if (linger >= 0) {
            socket.setSoLinger(linger > 0, linger);
        }
    }

    public void updateSecureConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, HttpContext httpContext, HttpParams httpParams) throws IOException {
        if (operatedClientConnection == null) {
            throw new IllegalArgumentException("Connection must not be null.");
        } else if (httpHost == null) {
            throw new IllegalArgumentException("Target host must not be null.");
        } else if (httpParams == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (operatedClientConnection.isOpen()) {
            Scheme scheme = this.schemeRegistry.getScheme(httpHost.getSchemeName());
            if (scheme.getSocketFactory() instanceof LayeredSocketFactory) {
                LayeredSocketFactory layeredSocketFactory = (LayeredSocketFactory) scheme.getSocketFactory();
                try {
                    Socket createSocket = layeredSocketFactory.createSocket(operatedClientConnection.getSocket(), httpHost.getHostName(), scheme.resolvePort(httpHost.getPort()), true);
                    prepareSocket(createSocket, httpContext, httpParams);
                    operatedClientConnection.update(createSocket, httpHost, layeredSocketFactory.isSecure(createSocket), httpParams);
                } catch (ConnectException e) {
                    throw new HttpHostConnectException(httpHost, e);
                }
            } else {
                throw new IllegalArgumentException("Target scheme (" + scheme.getName() + ") must have layered socket factory.");
            }
        } else {
            throw new IllegalArgumentException("Connection must be open.");
        }
    }
}
