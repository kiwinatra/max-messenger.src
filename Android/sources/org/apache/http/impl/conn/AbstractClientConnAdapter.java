package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.LongCompanionObject;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.OperatedClientConnection;

@Deprecated
public abstract class AbstractClientConnAdapter implements ManagedClientConnection {
    private volatile boolean aborted;
    private volatile ClientConnectionManager connManager;
    private volatile long duration;
    private final Thread executionThread = Thread.currentThread();
    private volatile boolean markedReusable;
    private volatile OperatedClientConnection wrappedConnection;

    public AbstractClientConnAdapter(ClientConnectionManager clientConnectionManager, OperatedClientConnection operatedClientConnection) {
        this.connManager = clientConnectionManager;
        this.wrappedConnection = operatedClientConnection;
        this.markedReusable = false;
        this.aborted = false;
        this.duration = LongCompanionObject.MAX_VALUE;
    }

    public void abortConnection() {
        if (!this.aborted) {
            this.aborted = true;
            unmarkReusable();
            try {
                shutdown();
            } catch (IOException unused) {
            }
            if (this.executionThread.equals(Thread.currentThread())) {
                releaseConnection();
            }
        }
    }

    public final void assertNotAborted() throws InterruptedIOException {
        if (this.aborted) {
            throw new InterruptedIOException("Connection has been shut down.");
        }
    }

    public final void assertValid(OperatedClientConnection operatedClientConnection) {
        if (operatedClientConnection == null) {
            throw new IllegalStateException("No wrapped connection.");
        }
    }

    public void detach() {
        this.wrappedConnection = null;
        this.connManager = null;
        this.duration = LongCompanionObject.MAX_VALUE;
    }

    public void flush() throws IOException {
        assertNotAborted();
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        wrappedConnection2.flush();
    }

    public InetAddress getLocalAddress() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.getLocalAddress();
    }

    public int getLocalPort() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.getLocalPort();
    }

    public ClientConnectionManager getManager() {
        return this.connManager;
    }

    public HttpConnectionMetrics getMetrics() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.getMetrics();
    }

    public InetAddress getRemoteAddress() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.getRemoteAddress();
    }

    public int getRemotePort() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.getRemotePort();
    }

    public SSLSession getSSLSession() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        if (!isOpen()) {
            return null;
        }
        Socket socket = wrappedConnection2.getSocket();
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getSession();
        }
        return null;
    }

    public int getSocketTimeout() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.getSocketTimeout();
    }

    public OperatedClientConnection getWrappedConnection() {
        return this.wrappedConnection;
    }

    public boolean isMarkedReusable() {
        return this.markedReusable;
    }

    public boolean isOpen() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        if (wrappedConnection2 == null) {
            return false;
        }
        return wrappedConnection2.isOpen();
    }

    public boolean isResponseAvailable(int i) throws IOException {
        assertNotAborted();
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.isResponseAvailable(i);
    }

    public boolean isSecure() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.isSecure();
    }

    public boolean isStale() {
        OperatedClientConnection wrappedConnection2;
        if (!this.aborted && (wrappedConnection2 = getWrappedConnection()) != null) {
            return wrappedConnection2.isStale();
        }
        return true;
    }

    public void markReusable() {
        this.markedReusable = true;
    }

    public void receiveResponseEntity(HttpResponse httpResponse) throws HttpException, IOException {
        assertNotAborted();
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        unmarkReusable();
        wrappedConnection2.receiveResponseEntity(httpResponse);
    }

    public HttpResponse receiveResponseHeader() throws HttpException, IOException {
        assertNotAborted();
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        unmarkReusable();
        return wrappedConnection2.receiveResponseHeader();
    }

    public void releaseConnection() {
        if (this.connManager != null) {
            this.connManager.releaseConnection(this, this.duration, TimeUnit.MILLISECONDS);
        }
    }

    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) throws HttpException, IOException {
        assertNotAborted();
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        unmarkReusable();
        wrappedConnection2.sendRequestEntity(httpEntityEnclosingRequest);
    }

    public void sendRequestHeader(HttpRequest httpRequest) throws HttpException, IOException {
        assertNotAborted();
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        unmarkReusable();
        wrappedConnection2.sendRequestHeader(httpRequest);
    }

    public void setIdleDuration(long j, TimeUnit timeUnit) {
        if (j > 0) {
            this.duration = timeUnit.toMillis(j);
        } else {
            this.duration = -1;
        }
    }

    public void setSocketTimeout(int i) {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        wrappedConnection2.setSocketTimeout(i);
    }

    public void unmarkReusable() {
        this.markedReusable = false;
    }
}
