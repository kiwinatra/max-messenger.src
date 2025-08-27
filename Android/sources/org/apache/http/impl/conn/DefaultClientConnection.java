package org.apache.http.impl.conn;

import java.io.IOException;
import java.net.Socket;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.impl.SocketHttpClientConnection;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParams;

@Deprecated
public class DefaultClientConnection extends SocketHttpClientConnection implements OperatedClientConnection {
    private boolean connSecure;
    private final Log headerLog = LogFactory.getLog("org.apache.http.headers");
    private final Log log = LogFactory.getLog((Class) getClass());
    private volatile boolean shutdown;
    private volatile Socket socket;
    private HttpHost targetHost;
    private final Log wireLog = LogFactory.getLog("org.apache.http.wire");

    public void close() throws IOException {
        this.log.debug("Connection closed");
        super.close();
    }

    public HttpMessageParser createResponseParser(SessionInputBuffer sessionInputBuffer, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        return new DefaultResponseParser(sessionInputBuffer, (LineParser) null, httpResponseFactory, httpParams);
    }

    public SessionInputBuffer createSessionInputBuffer(Socket socket2, int i, HttpParams httpParams) throws IOException {
        SessionInputBuffer createSessionInputBuffer = super.createSessionInputBuffer(socket2, i, httpParams);
        return this.wireLog.isDebugEnabled() ? new LoggingSessionInputBuffer(createSessionInputBuffer, new Wire(this.wireLog)) : createSessionInputBuffer;
    }

    public SessionOutputBuffer createSessionOutputBuffer(Socket socket2, int i, HttpParams httpParams) throws IOException {
        SessionOutputBuffer createSessionOutputBuffer = super.createSessionOutputBuffer(socket2, i, httpParams);
        return this.wireLog.isDebugEnabled() ? new LoggingSessionOutputBuffer(createSessionOutputBuffer, new Wire(this.wireLog)) : createSessionOutputBuffer;
    }

    public final Socket getSocket() {
        return this.socket;
    }

    public final HttpHost getTargetHost() {
        return this.targetHost;
    }

    public final boolean isSecure() {
        return this.connSecure;
    }

    public void openCompleted(boolean z, HttpParams httpParams) throws IOException {
        assertNotOpen();
        if (httpParams != null) {
            this.connSecure = z;
            bind(this.socket, httpParams);
            return;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    public void opening(Socket socket2, HttpHost httpHost) throws IOException {
        assertNotOpen();
        this.socket = socket2;
        this.targetHost = httpHost;
        if (this.shutdown) {
            socket2.close();
            throw new IOException("Connection already shutdown");
        }
    }

    public HttpResponse receiveResponseHeader() throws HttpException, IOException {
        HttpResponse receiveResponseHeader = super.receiveResponseHeader();
        if (this.headerLog.isDebugEnabled()) {
            this.headerLog.debug("<< " + receiveResponseHeader.getStatusLine().toString());
            for (Header header : receiveResponseHeader.getAllHeaders()) {
                this.headerLog.debug("<< " + header.toString());
            }
        }
        return receiveResponseHeader;
    }

    public void sendRequestHeader(HttpRequest httpRequest) throws HttpException, IOException {
        super.sendRequestHeader(httpRequest);
        if (this.headerLog.isDebugEnabled()) {
            this.headerLog.debug(">> " + httpRequest.getRequestLine().toString());
            for (Header header : httpRequest.getAllHeaders()) {
                this.headerLog.debug(">> " + header.toString());
            }
        }
    }

    public void shutdown() throws IOException {
        this.log.debug("Connection shut down");
        this.shutdown = true;
        super.shutdown();
        Socket socket2 = this.socket;
        if (socket2 != null) {
            socket2.close();
        }
    }

    public void update(Socket socket2, HttpHost httpHost, boolean z, HttpParams httpParams) throws IOException {
        assertOpen();
        if (httpHost == null) {
            throw new IllegalArgumentException("Target host must not be null.");
        } else if (httpParams != null) {
            if (socket2 != null) {
                this.socket = socket2;
                bind(socket2, httpParams);
            }
            this.targetHost = httpHost;
            this.connSecure = z;
        } else {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
    }
}
