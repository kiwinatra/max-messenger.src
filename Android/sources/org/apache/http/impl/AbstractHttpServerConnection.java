package org.apache.http.impl;

import java.io.IOException;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.HttpResponse;
import org.apache.http.HttpServerConnection;
import org.apache.http.impl.entity.EntityDeserializer;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.io.HttpRequestParser;
import org.apache.http.impl.io.HttpResponseWriter;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParams;

@Deprecated
public abstract class AbstractHttpServerConnection implements HttpServerConnection {
    private final EntityDeserializer entitydeserializer = createEntityDeserializer();
    private final EntitySerializer entityserializer = createEntitySerializer();
    private SessionInputBuffer inbuffer = null;
    private HttpConnectionMetricsImpl metrics = null;
    private SessionOutputBuffer outbuffer = null;
    private HttpMessageParser requestParser = null;
    private HttpMessageWriter responseWriter = null;

    public abstract void assertOpen() throws IllegalStateException;

    public EntityDeserializer createEntityDeserializer() {
        return new EntityDeserializer(new LaxContentLengthStrategy());
    }

    public EntitySerializer createEntitySerializer() {
        return new EntitySerializer(new StrictContentLengthStrategy());
    }

    public HttpRequestFactory createHttpRequestFactory() {
        return new DefaultHttpRequestFactory();
    }

    public HttpMessageParser createRequestParser(SessionInputBuffer sessionInputBuffer, HttpRequestFactory httpRequestFactory, HttpParams httpParams) {
        return new HttpRequestParser(sessionInputBuffer, (LineParser) null, httpRequestFactory, httpParams);
    }

    public HttpMessageWriter createResponseWriter(SessionOutputBuffer sessionOutputBuffer, HttpParams httpParams) {
        return new HttpResponseWriter(sessionOutputBuffer, (LineFormatter) null, httpParams);
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
            this.requestParser = createRequestParser(sessionInputBuffer, createHttpRequestFactory(), httpParams);
            this.responseWriter = createResponseWriter(sessionOutputBuffer, httpParams);
            this.metrics = new HttpConnectionMetricsImpl(sessionInputBuffer.getMetrics(), sessionOutputBuffer.getMetrics());
        } else {
            throw new IllegalArgumentException("Output session buffer may not be null");
        }
    }

    public boolean isStale() {
        assertOpen();
        try {
            this.inbuffer.isDataAvailable(1);
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public void receiveRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) throws HttpException, IOException {
        if (httpEntityEnclosingRequest != null) {
            assertOpen();
            httpEntityEnclosingRequest.setEntity(this.entitydeserializer.deserialize(this.inbuffer, httpEntityEnclosingRequest));
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }

    public HttpRequest receiveRequestHeader() throws HttpException, IOException {
        assertOpen();
        HttpRequest httpRequest = (HttpRequest) this.requestParser.parse();
        this.metrics.incrementRequestCount();
        return httpRequest;
    }

    public void sendResponseEntity(HttpResponse httpResponse) throws HttpException, IOException {
        if (httpResponse.getEntity() != null) {
            this.entityserializer.serialize(this.outbuffer, httpResponse, httpResponse.getEntity());
        }
    }

    public void sendResponseHeader(HttpResponse httpResponse) throws HttpException, IOException {
        if (httpResponse != null) {
            assertOpen();
            this.responseWriter.write(httpResponse);
            if (httpResponse.getStatusLine().getStatusCode() >= 200) {
                this.metrics.incrementResponseCount();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }
}
