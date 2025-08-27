package org.apache.http.impl;

import java.io.IOException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.impl.entity.EntityDeserializer;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.io.HttpRequestWriter;
import org.apache.http.impl.io.HttpResponseParser;
import org.apache.http.impl.io.SocketInputBuffer;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParams;

@Deprecated
public abstract class AbstractHttpClientConnection implements HttpClientConnection {
    private final EntityDeserializer entitydeserializer = createEntityDeserializer();
    private final EntitySerializer entityserializer = createEntitySerializer();
    private SessionInputBuffer inbuffer = null;
    private HttpConnectionMetricsImpl metrics = null;
    private SessionOutputBuffer outbuffer = null;
    private HttpMessageWriter requestWriter = null;
    private HttpMessageParser responseParser = null;

    public abstract void assertOpen() throws IllegalStateException;

    public EntityDeserializer createEntityDeserializer() {
        return new EntityDeserializer(new LaxContentLengthStrategy());
    }

    public EntitySerializer createEntitySerializer() {
        return new EntitySerializer(new StrictContentLengthStrategy());
    }

    public HttpResponseFactory createHttpResponseFactory() {
        return new DefaultHttpResponseFactory();
    }

    public HttpMessageWriter createRequestWriter(SessionOutputBuffer sessionOutputBuffer, HttpParams httpParams) {
        return new HttpRequestWriter(sessionOutputBuffer, (LineFormatter) null, httpParams);
    }

    public HttpMessageParser createResponseParser(SessionInputBuffer sessionInputBuffer, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        return new HttpResponseParser(sessionInputBuffer, (LineParser) null, httpResponseFactory, httpParams);
    }

    public void doFlush() throws IOException {
        this.outbuffer.flush();
    }

    public void flush() throws IOException {
        assertOpen();
        doFlush();
    }

    public HttpConnectionMetrics getMetrics() {
        return this.metrics;
    }

    public void init(SessionInputBuffer sessionInputBuffer, SessionOutputBuffer sessionOutputBuffer, HttpParams httpParams) {
        if (sessionInputBuffer == null) {
            throw new IllegalArgumentException("Input session buffer may not be null");
        } else if (sessionOutputBuffer != null) {
            this.inbuffer = sessionInputBuffer;
            this.outbuffer = sessionOutputBuffer;
            this.responseParser = createResponseParser(sessionInputBuffer, createHttpResponseFactory(), httpParams);
            this.requestWriter = createRequestWriter(sessionOutputBuffer, httpParams);
            this.metrics = new HttpConnectionMetricsImpl(sessionInputBuffer.getMetrics(), sessionOutputBuffer.getMetrics());
        } else {
            throw new IllegalArgumentException("Output session buffer may not be null");
        }
    }

    public boolean isResponseAvailable(int i) throws IOException {
        assertOpen();
        return this.inbuffer.isDataAvailable(i);
    }

    public boolean isStale() {
        if (!isOpen()) {
            return true;
        }
        try {
            SessionInputBuffer sessionInputBuffer = this.inbuffer;
            if (sessionInputBuffer instanceof SocketInputBuffer) {
                return ((SocketInputBuffer) sessionInputBuffer).isStale();
            }
            sessionInputBuffer.isDataAvailable(1);
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public void receiveResponseEntity(HttpResponse httpResponse) throws HttpException, IOException {
        if (httpResponse != null) {
            assertOpen();
            httpResponse.setEntity(this.entitydeserializer.deserialize(this.inbuffer, httpResponse));
            return;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    public HttpResponse receiveResponseHeader() throws HttpException, IOException {
        assertOpen();
        HttpResponse httpResponse = (HttpResponse) this.responseParser.parse();
        if (httpResponse.getStatusLine().getStatusCode() >= 200) {
            this.metrics.incrementResponseCount();
        }
        return httpResponse;
    }

    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) throws HttpException, IOException {
        if (httpEntityEnclosingRequest != null) {
            assertOpen();
            if (httpEntityEnclosingRequest.getEntity() != null) {
                this.entityserializer.serialize(this.outbuffer, httpEntityEnclosingRequest, httpEntityEnclosingRequest.getEntity());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }

    public void sendRequestHeader(HttpRequest httpRequest) throws HttpException, IOException {
        if (httpRequest != null) {
            assertOpen();
            this.requestWriter.write(httpRequest);
            this.metrics.incrementRequestCount();
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }
}
