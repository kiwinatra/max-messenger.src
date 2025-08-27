package org.apache.http.client.protocol;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.ProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;

@Deprecated
public class RequestAddCookies implements HttpRequestInterceptor {
    private final Log log = LogFactory.getLog((Class) getClass());

    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        URI uri;
        Header versionHeader;
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpContext != null) {
            CookieStore cookieStore = (CookieStore) httpContext.getAttribute(ClientContext.COOKIE_STORE);
            if (cookieStore == null) {
                this.log.info("Cookie store not available in HTTP context");
                return;
            }
            CookieSpecRegistry cookieSpecRegistry = (CookieSpecRegistry) httpContext.getAttribute(ClientContext.COOKIESPEC_REGISTRY);
            if (cookieSpecRegistry == null) {
                this.log.info("CookieSpec registry not available in HTTP context");
                return;
            }
            HttpHost httpHost = (HttpHost) httpContext.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
            if (httpHost != null) {
                ManagedClientConnection managedClientConnection = (ManagedClientConnection) httpContext.getAttribute(ExecutionContext.HTTP_CONNECTION);
                if (managedClientConnection != null) {
                    String cookiePolicy = HttpClientParams.getCookiePolicy(httpRequest.getParams());
                    if (this.log.isDebugEnabled()) {
                        Log log2 = this.log;
                        log2.debug("CookieSpec selected: " + cookiePolicy);
                    }
                    if (httpRequest instanceof HttpUriRequest) {
                        uri = ((HttpUriRequest) httpRequest).getURI();
                    } else {
                        try {
                            uri = new URI(httpRequest.getRequestLine().getUri());
                        } catch (URISyntaxException e) {
                            throw new ProtocolException("Invalid request URI: " + httpRequest.getRequestLine().getUri(), e);
                        }
                    }
                    String hostName = httpHost.getHostName();
                    int port = httpHost.getPort();
                    if (port < 0) {
                        port = managedClientConnection.getRemotePort();
                    }
                    CookieOrigin cookieOrigin = new CookieOrigin(hostName, port, uri.getPath(), managedClientConnection.isSecure());
                    CookieSpec cookieSpec = cookieSpecRegistry.getCookieSpec(cookiePolicy, httpRequest.getParams());
                    ArrayList arrayList = new ArrayList(cookieStore.getCookies());
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Cookie cookie = (Cookie) it.next();
                        if (cookieSpec.match(cookie, cookieOrigin)) {
                            if (this.log.isDebugEnabled()) {
                                Log log3 = this.log;
                                log3.debug("Cookie " + cookie + " match " + cookieOrigin);
                            }
                            arrayList2.add(cookie);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        for (Header addHeader : cookieSpec.formatCookies(arrayList2)) {
                            httpRequest.addHeader(addHeader);
                        }
                    }
                    int version = cookieSpec.getVersion();
                    if (version > 0) {
                        Iterator it2 = arrayList2.iterator();
                        boolean z = false;
                        while (it2.hasNext()) {
                            if (version != ((Cookie) it2.next()).getVersion()) {
                                z = true;
                            }
                        }
                        if (z && (versionHeader = cookieSpec.getVersionHeader()) != null) {
                            httpRequest.addHeader(versionHeader);
                        }
                    }
                    httpContext.setAttribute(ClientContext.COOKIE_SPEC, cookieSpec);
                    httpContext.setAttribute(ClientContext.COOKIE_ORIGIN, cookieOrigin);
                    return;
                }
                throw new IllegalStateException("Client connection not specified in HTTP context");
            }
            throw new IllegalStateException("Target host not specified in HTTP context");
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}
