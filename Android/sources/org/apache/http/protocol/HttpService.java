package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.HttpServerConnection;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.UnsupportedHttpVersionException;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.DefaultedHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EncodingUtils;

@Deprecated
public class HttpService {
    private ConnectionReuseStrategy connStrategy = null;
    private HttpExpectationVerifier expectationVerifier = null;
    private HttpRequestHandlerResolver handlerResolver = null;
    private HttpParams params = null;
    private HttpProcessor processor = null;
    private HttpResponseFactory responseFactory = null;

    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory) {
        setHttpProcessor(httpProcessor);
        setConnReuseStrategy(connectionReuseStrategy);
        setResponseFactory(httpResponseFactory);
    }

    public void doService(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        HttpRequestHandler httpRequestHandler;
        if (this.handlerResolver != null) {
            httpRequestHandler = this.handlerResolver.lookup(httpRequest.getRequestLine().getUri());
        } else {
            httpRequestHandler = null;
        }
        if (httpRequestHandler != null) {
            httpRequestHandler.handle(httpRequest, httpResponse, httpContext);
        } else {
            httpResponse.setStatusCode(HttpStatus.SC_NOT_IMPLEMENTED);
        }
    }

    public HttpParams getParams() {
        return this.params;
    }

    public void handleException(HttpException httpException, HttpResponse httpResponse) {
        if (httpException instanceof MethodNotSupportedException) {
            httpResponse.setStatusCode(HttpStatus.SC_NOT_IMPLEMENTED);
        } else if (httpException instanceof UnsupportedHttpVersionException) {
            httpResponse.setStatusCode(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED);
        } else if (httpException instanceof ProtocolException) {
            httpResponse.setStatusCode(HttpStatus.SC_BAD_REQUEST);
        } else {
            httpResponse.setStatusCode(500);
        }
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(EncodingUtils.getAsciiBytes(httpException.getMessage()));
        byteArrayEntity.setContentType("text/plain; charset=US-ASCII");
        httpResponse.setEntity(byteArrayEntity);
    }

    public void handleRequest(HttpServerConnection httpServerConnection, HttpContext httpContext) throws IOException, HttpException {
        HttpResponse httpResponse;
        HttpEntity entity;
        httpContext.setAttribute(ExecutionContext.HTTP_CONNECTION, httpServerConnection);
        try {
            HttpRequest receiveRequestHeader = httpServerConnection.receiveRequestHeader();
            receiveRequestHeader.setParams(new DefaultedHttpParams(receiveRequestHeader.getParams(), this.params));
            ProtocolVersion protocolVersion = receiveRequestHeader.getRequestLine().getProtocolVersion();
            HttpVersion httpVersion = HttpVersion.HTTP_1_1;
            if (!protocolVersion.lessEquals(httpVersion)) {
                protocolVersion = httpVersion;
            }
            httpResponse = null;
            if (receiveRequestHeader instanceof HttpEntityEnclosingRequest) {
                if (((HttpEntityEnclosingRequest) receiveRequestHeader).expectContinue()) {
                    HttpResponse newHttpResponse = this.responseFactory.newHttpResponse(protocolVersion, 100, httpContext);
                    newHttpResponse.setParams(new DefaultedHttpParams(newHttpResponse.getParams(), this.params));
                    HttpExpectationVerifier httpExpectationVerifier = this.expectationVerifier;
                    if (httpExpectationVerifier != null) {
                        try {
                            httpExpectationVerifier.verify(receiveRequestHeader, newHttpResponse, httpContext);
                        } catch (HttpException e) {
                            HttpResponse newHttpResponse2 = this.responseFactory.newHttpResponse(HttpVersion.HTTP_1_0, 500, httpContext);
                            newHttpResponse2.setParams(new DefaultedHttpParams(newHttpResponse2.getParams(), this.params));
                            handleException(e, newHttpResponse2);
                            newHttpResponse = newHttpResponse2;
                        }
                    }
                    if (newHttpResponse.getStatusLine().getStatusCode() < 200) {
                        httpServerConnection.sendResponseHeader(newHttpResponse);
                        httpServerConnection.flush();
                        httpServerConnection.receiveRequestEntity((HttpEntityEnclosingRequest) receiveRequestHeader);
                    } else {
                        httpResponse = newHttpResponse;
                    }
                } else {
                    httpServerConnection.receiveRequestEntity((HttpEntityEnclosingRequest) receiveRequestHeader);
                }
            }
            if (httpResponse == null) {
                httpResponse = this.responseFactory.newHttpResponse(protocolVersion, 200, httpContext);
                httpResponse.setParams(new DefaultedHttpParams(httpResponse.getParams(), this.params));
                httpContext.setAttribute(ExecutionContext.HTTP_REQUEST, receiveRequestHeader);
                httpContext.setAttribute(ExecutionContext.HTTP_RESPONSE, httpResponse);
                this.processor.process(receiveRequestHeader, httpContext);
                doService(receiveRequestHeader, httpResponse, httpContext);
            }
            if ((receiveRequestHeader instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) receiveRequestHeader).getEntity()) != null) {
                entity.consumeContent();
            }
        } catch (HttpException e2) {
            httpResponse = this.responseFactory.newHttpResponse(HttpVersion.HTTP_1_0, 500, httpContext);
            httpResponse.setParams(new DefaultedHttpParams(httpResponse.getParams(), this.params));
            handleException(e2, httpResponse);
        }
        this.processor.process(httpResponse, httpContext);
        httpServerConnection.sendResponseHeader(httpResponse);
        httpServerConnection.sendResponseEntity(httpResponse);
        httpServerConnection.flush();
        if (!this.connStrategy.keepAlive(httpResponse, httpContext)) {
            httpServerConnection.close();
        }
    }

    public void setConnReuseStrategy(ConnectionReuseStrategy connectionReuseStrategy) {
        if (connectionReuseStrategy != null) {
            this.connStrategy = connectionReuseStrategy;
            return;
        }
        throw new IllegalArgumentException("Connection reuse strategy may not be null");
    }

    public void setExpectationVerifier(HttpExpectationVerifier httpExpectationVerifier) {
        this.expectationVerifier = httpExpectationVerifier;
    }

    public void setHandlerResolver(HttpRequestHandlerResolver httpRequestHandlerResolver) {
        this.handlerResolver = httpRequestHandlerResolver;
    }

    public void setHttpProcessor(HttpProcessor httpProcessor) {
        if (httpProcessor != null) {
            this.processor = httpProcessor;
            return;
        }
        throw new IllegalArgumentException("HTTP processor may not be null.");
    }

    public void setParams(HttpParams httpParams) {
        this.params = httpParams;
    }

    public void setResponseFactory(HttpResponseFactory httpResponseFactory) {
        if (httpResponseFactory != null) {
            this.responseFactory = httpResponseFactory;
            return;
        }
        throw new IllegalArgumentException("Response factory may not be null");
    }
}
