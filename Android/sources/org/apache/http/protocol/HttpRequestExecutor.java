package org.apache.http.protocol;

import java.io.IOException;
import java.net.ProtocolException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.params.CoreProtocolPNames;

@Deprecated
public class HttpRequestExecutor {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r0 = r2.getStatusLine().getStatusCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean canResponseHaveBody(org.apache.http.HttpRequest r1, org.apache.http.HttpResponse r2) {
        /*
            r0 = this;
            org.apache.http.RequestLine r0 = r1.getRequestLine()
            java.lang.String r0 = r0.getMethod()
            java.lang.String r1 = "HEAD"
            boolean r0 = r1.equalsIgnoreCase(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0012
            return r1
        L_0x0012:
            org.apache.http.StatusLine r0 = r2.getStatusLine()
            int r0 = r0.getStatusCode()
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L_0x002b
            r2 = 204(0xcc, float:2.86E-43)
            if (r0 == r2) goto L_0x002b
            r2 = 304(0x130, float:4.26E-43)
            if (r0 == r2) goto L_0x002b
            r2 = 205(0xcd, float:2.87E-43)
            if (r0 == r2) goto L_0x002b
            r1 = 1
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.protocol.HttpRequestExecutor.canResponseHaveBody(org.apache.http.HttpRequest, org.apache.http.HttpResponse):boolean");
    }

    public HttpResponse doReceiveResponse(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) throws HttpException, IOException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpClientConnection == null) {
            throw new IllegalArgumentException("HTTP connection may not be null");
        } else if (httpContext != null) {
            HttpResponse httpResponse = null;
            int i = 0;
            while (true) {
                if (httpResponse != null && i >= 200) {
                    return httpResponse;
                }
                httpResponse = httpClientConnection.receiveResponseHeader();
                if (canResponseHaveBody(httpRequest, httpResponse)) {
                    httpClientConnection.receiveResponseEntity(httpResponse);
                }
                i = httpResponse.getStatusLine().getStatusCode();
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    public HttpResponse doSendRequest(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) throws IOException, HttpException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpClientConnection == null) {
            throw new IllegalArgumentException("HTTP connection may not be null");
        } else if (httpContext != null) {
            httpContext.setAttribute(ExecutionContext.HTTP_REQ_SENT, Boolean.FALSE);
            httpClientConnection.sendRequestHeader(httpRequest);
            HttpResponse httpResponse = null;
            if (httpRequest instanceof HttpEntityEnclosingRequest) {
                ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
                HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest) httpRequest;
                boolean z = true;
                if (httpEntityEnclosingRequest.expectContinue() && !protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                    httpClientConnection.flush();
                    if (httpClientConnection.isResponseAvailable(httpRequest.getParams().getIntParameter(CoreProtocolPNames.WAIT_FOR_CONTINUE, 2000))) {
                        HttpResponse receiveResponseHeader = httpClientConnection.receiveResponseHeader();
                        if (canResponseHaveBody(httpRequest, receiveResponseHeader)) {
                            httpClientConnection.receiveResponseEntity(receiveResponseHeader);
                        }
                        int statusCode = receiveResponseHeader.getStatusLine().getStatusCode();
                        if (statusCode >= 200) {
                            z = false;
                            httpResponse = receiveResponseHeader;
                        } else if (statusCode != 100) {
                            throw new ProtocolException("Unexpected response: " + receiveResponseHeader.getStatusLine());
                        }
                    }
                }
                if (z) {
                    httpClientConnection.sendRequestEntity(httpEntityEnclosingRequest);
                }
            }
            httpClientConnection.flush();
            httpContext.setAttribute(ExecutionContext.HTTP_REQ_SENT, Boolean.TRUE);
            return httpResponse;
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    public HttpResponse execute(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) throws IOException, HttpException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpClientConnection == null) {
            throw new IllegalArgumentException("Client connection may not be null");
        } else if (httpContext != null) {
            try {
                HttpResponse doSendRequest = doSendRequest(httpRequest, httpClientConnection, httpContext);
                return doSendRequest == null ? doReceiveResponse(httpRequest, httpClientConnection, httpContext) : doSendRequest;
            } catch (IOException e) {
                httpClientConnection.close();
                throw e;
            } catch (HttpException e2) {
                httpClientConnection.close();
                throw e2;
            } catch (RuntimeException e3) {
                httpClientConnection.close();
                throw e3;
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    public void postProcess(HttpResponse httpResponse, HttpProcessor httpProcessor, HttpContext httpContext) throws HttpException, IOException {
        if (httpResponse == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        } else if (httpProcessor == null) {
            throw new IllegalArgumentException("HTTP processor may not be null");
        } else if (httpContext != null) {
            httpProcessor.process(httpResponse, httpContext);
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    public void preProcess(HttpRequest httpRequest, HttpProcessor httpProcessor, HttpContext httpContext) throws HttpException, IOException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpProcessor == null) {
            throw new IllegalArgumentException("HTTP processor may not be null");
        } else if (httpContext != null) {
            httpProcessor.process(httpRequest, httpContext);
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}
