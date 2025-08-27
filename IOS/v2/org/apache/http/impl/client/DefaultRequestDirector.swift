package org.apache.http.impl.client;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

@Deprecated
public class DefaultRequestDirector implements RequestDirector {
    private static Method cleartextTrafficPermittedMethod;
    private static Object networkSecurityPolicy;
    protected final ClientConnectionManager connManager;
    protected final HttpProcessor httpProcessor;
    protected final ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log = LogFactory.getLog((Class) getClass());
    protected ManagedClientConnection managedConn;
    private int maxRedirects;
    protected final HttpParams params;
    private final AuthenticationHandler proxyAuthHandler;
    private final AuthState proxyAuthState;
    private int redirectCount;
    protected final RedirectHandler redirectHandler;
    protected final HttpRequestExecutor requestExec;
    protected final HttpRequestRetryHandler retryHandler;
    protected final ConnectionReuseStrategy reuseStrategy;
    protected final HttpRoutePlanner routePlanner;
    private final AuthenticationHandler targetAuthHandler;
    private final AuthState targetAuthState;
    private final UserTokenHandler userTokenHandler;

    public DefaultRequestDirector(HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor2, HttpRequestRetryHandler httpRequestRetryHandler, RedirectHandler redirectHandler2, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler2, HttpParams httpParams) {
        if (httpRequestExecutor == null) {
            throw new IllegalArgumentException("Request executor may not be null.");
        } else if (clientConnectionManager == null) {
            throw new IllegalArgumentException("Client connection manager may not be null.");
        } else if (connectionReuseStrategy == null) {
            throw new IllegalArgumentException("Connection reuse strategy may not be null.");
        } else if (connectionKeepAliveStrategy == null) {
            throw new IllegalArgumentException("Connection keep alive strategy may not be null.");
        } else if (httpRoutePlanner == null) {
            throw new IllegalArgumentException("Route planner may not be null.");
        } else if (httpProcessor2 == null) {
            throw new IllegalArgumentException("HTTP protocol processor may not be null.");
        } else if (httpRequestRetryHandler == null) {
            throw new IllegalArgumentException("HTTP request retry handler may not be null.");
        } else if (redirectHandler2 == null) {
            throw new IllegalArgumentException("Redirect handler may not be null.");
        } else if (authenticationHandler == null) {
            throw new IllegalArgumentException("Target authentication handler may not be null.");
        } else if (authenticationHandler2 == null) {
            throw new IllegalArgumentException("Proxy authentication handler may not be null.");
        } else if (userTokenHandler2 == null) {
            throw new IllegalArgumentException("User token handler may not be null.");
        } else if (httpParams != null) {
            this.requestExec = httpRequestExecutor;
            this.connManager = clientConnectionManager;
            this.reuseStrategy = connectionReuseStrategy;
            this.keepAliveStrategy = connectionKeepAliveStrategy;
            this.routePlanner = httpRoutePlanner;
            this.httpProcessor = httpProcessor2;
            this.retryHandler = httpRequestRetryHandler;
            this.redirectHandler = redirectHandler2;
            this.targetAuthHandler = authenticationHandler;
            this.proxyAuthHandler = authenticationHandler2;
            this.userTokenHandler = userTokenHandler2;
            this.params = httpParams;
            this.managedConn = null;
            this.redirectCount = 0;
            this.maxRedirects = httpParams.getIntParameter(ClientPNames.MAX_REDIRECTS, 100);
            this.targetAuthState = new AuthState();
            this.proxyAuthState = new AuthState();
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    private void abortConnection() {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection != null) {
            this.managedConn = null;
            try {
                managedClientConnection.abortConnection();
            } catch (IOException e) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug(e.getMessage(), e);
                }
            }
            try {
                managedClientConnection.releaseConnection();
            } catch (IOException e2) {
                this.log.debug("Error releasing connection", e2);
            }
        }
    }

    private static boolean isCleartextTrafficPermitted(String str) {
        Object obj;
        Method method;
        try {
            synchronized (DefaultRequestDirector.class) {
                if (cleartextTrafficPermittedMethod == null) {
                    Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
                    networkSecurityPolicy = cls.getMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
                    cleartextTrafficPermittedMethod = cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class});
                }
                obj = networkSecurityPolicy;
                method = cleartextTrafficPermittedMethod;
            }
            return ((Boolean) method.invoke(obj, new Object[]{str})).booleanValue();
        } catch (ReflectiveOperationException unused) {
            return true;
        } catch (Throwable th) {
            while (true) {
            }
            throw th;
        }
    }

    private void processChallenges(Map<String, Header> map, AuthState authState, AuthenticationHandler authenticationHandler, HttpResponse httpResponse, HttpContext httpContext) throws MalformedChallengeException, AuthenticationException {
        AuthScheme authScheme = authState.getAuthScheme();
        if (authScheme == null) {
            authScheme = authenticationHandler.selectScheme(map, httpResponse, httpContext);
            authState.setAuthScheme(authScheme);
        }
        String schemeName = authScheme.getSchemeName();
        Header header = map.get(schemeName.toLowerCase(Locale.ENGLISH));
        if (header != null) {
            authScheme.processChallenge(header);
            this.log.debug("Authorization challenge processed");
            return;
        }
        throw new AuthenticationException(schemeName.concat(" authorization challenge expected, but not found"));
    }

    private void updateAuthState(AuthState authState, HttpHost httpHost, CredentialsProvider credentialsProvider) {
        if (authState.isValid()) {
            String hostName = httpHost.getHostName();
            int port = httpHost.getPort();
            if (port < 0) {
                port = this.connManager.getSchemeRegistry().getScheme(httpHost).getDefaultPort();
            }
            AuthScheme authScheme = authState.getAuthScheme();
            AuthScope authScope = new AuthScope(hostName, port, authScheme.getRealm(), authScheme.getSchemeName());
            if (this.log.isDebugEnabled()) {
                Log log2 = this.log;
                log2.debug("Authentication scope: " + authScope);
            }
            Credentials credentials = authState.getCredentials();
            if (credentials == null) {
                credentials = credentialsProvider.getCredentials(authScope);
                if (this.log.isDebugEnabled()) {
                    if (credentials != null) {
                        this.log.debug("Found credentials");
                    } else {
                        this.log.debug("Credentials not found");
                    }
                }
            } else if (authScheme.isComplete()) {
                this.log.debug("Authentication failed");
                credentials = null;
            }
            authState.setAuthScope(authScope);
            authState.setCredentials(credentials);
        }
    }

    private RequestWrapper wrapRequest(HttpRequest httpRequest) throws ProtocolException {
        return httpRequest instanceof HttpEntityEnclosingRequest ? new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpRequest) : new RequestWrapper(httpRequest);
    }

    public HttpRequest createConnectRequest(HttpRoute httpRoute, HttpContext httpContext) {
        HttpHost targetHost = httpRoute.getTargetHost();
        String hostName = targetHost.getHostName();
        int port = targetHost.getPort();
        if (port < 0) {
            port = this.connManager.getSchemeRegistry().getScheme(targetHost.getSchemeName()).getDefaultPort();
        }
        StringBuilder sb = new StringBuilder(hostName.length() + 6);
        sb.append(hostName);
        sb.append(':');
        sb.append(Integer.toString(port));
        return new BasicHttpRequest("CONNECT", sb.toString(), HttpProtocolParams.getVersion(this.params));
    }

    public boolean createTunnelToProxy(HttpRoute httpRoute, int i, HttpContext httpContext) throws HttpException, IOException {
        throw new UnsupportedOperationException("Proxy chains are not supported.");
    }

    public boolean createTunnelToTarget(HttpRoute httpRoute, HttpContext httpContext) throws HttpException, IOException {
        HttpHost proxyHost = httpRoute.getProxyHost();
        HttpHost targetHost = httpRoute.getTargetHost();
        HttpResponse httpResponse = null;
        boolean z = false;
        while (true) {
            if (z) {
                break;
            }
            if (!this.managedConn.isOpen()) {
                this.managedConn.open(httpRoute, httpContext, this.params);
            }
            HttpRequest createConnectRequest = createConnectRequest(httpRoute, httpContext);
            String userAgent = HttpProtocolParams.getUserAgent(this.params);
            if (userAgent != null) {
                createConnectRequest.addHeader(HTTP.USER_AGENT, userAgent);
            }
            createConnectRequest.addHeader(HTTP.TARGET_HOST, targetHost.toHostString());
            AuthScheme authScheme = this.proxyAuthState.getAuthScheme();
            AuthScope authScope = this.proxyAuthState.getAuthScope();
            Credentials credentials = this.proxyAuthState.getCredentials();
            if (credentials != null && (authScope != null || !authScheme.isConnectionBased())) {
                try {
                    createConnectRequest.addHeader(authScheme.authenticate(credentials, createConnectRequest));
                } catch (AuthenticationException e) {
                    if (this.log.isErrorEnabled()) {
                        this.log.error("Proxy authentication error: " + e.getMessage());
                    }
                }
            }
            httpResponse = this.requestExec.execute(createConnectRequest, this.managedConn, httpContext);
            if (httpResponse.getStatusLine().getStatusCode() >= 200) {
                CredentialsProvider credentialsProvider = (CredentialsProvider) httpContext.getAttribute(ClientContext.CREDS_PROVIDER);
                boolean z2 = true;
                if (credentialsProvider != null && HttpClientParams.isAuthenticating(this.params)) {
                    if (this.proxyAuthHandler.isAuthenticationRequested(httpResponse, httpContext)) {
                        this.log.debug("Proxy requested authentication");
                        try {
                            processChallenges(this.proxyAuthHandler.getChallenges(httpResponse, httpContext), this.proxyAuthState, this.proxyAuthHandler, httpResponse, httpContext);
                        } catch (AuthenticationException e2) {
                            if (this.log.isWarnEnabled()) {
                                this.log.warn("Authentication error: " + e2.getMessage());
                                break;
                            }
                        }
                        updateAuthState(this.proxyAuthState, proxyHost, credentialsProvider);
                        if (this.proxyAuthState.getCredentials() != null) {
                            if (this.reuseStrategy.keepAlive(httpResponse, httpContext)) {
                                this.log.debug("Connection kept alive");
                                HttpEntity entity = httpResponse.getEntity();
                                if (entity != null) {
                                    entity.consumeContent();
                                }
                            } else {
                                this.managedConn.close();
                            }
                            z2 = false;
                        }
                    } else {
                        this.proxyAuthState.setAuthScope((AuthScope) null);
                    }
                }
                z = z2;
            } else {
                throw new HttpException("Unexpected response to CONNECT request: " + httpResponse.getStatusLine());
            }
        }
        if (httpResponse.getStatusLine().getStatusCode() > 299) {
            HttpEntity entity2 = httpResponse.getEntity();
            if (entity2 != null) {
                httpResponse.setEntity(new BufferedHttpEntity(entity2));
            }
            this.managedConn.close();
            throw new TunnelRefusedException("CONNECT refused by proxy: " + httpResponse.getStatusLine(), httpResponse);
        }
        this.managedConn.markReusable();
        return false;
    }

    public HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException {
        String str;
        String str2;
        String str3;
        URI uri;
        if (httpHost == null) {
            httpHost = (HttpHost) httpRequest.getParams().getParameter(ClientPNames.DEFAULT_HOST);
        }
        if (httpHost != null) {
            return this.routePlanner.determineRoute(httpHost, httpRequest, httpContext);
        }
        if (!(httpRequest instanceof HttpUriRequest) || (uri = ((HttpUriRequest) httpRequest).getURI()) == null) {
            str2 = null;
            str3 = null;
            str = null;
        } else {
            str2 = uri.getScheme();
            str = uri.getHost();
            str3 = uri.getPath();
        }
        StringBuilder r = rae.r("Target host must not be null, or set in parameters. scheme=", str2, ", host=", str, ", path=");
        r.append(str3);
        throw new IllegalStateException(r.toString());
    }

    public void establishRoute(HttpRoute httpRoute, HttpContext httpContext) throws HttpException, IOException {
        int nextStep;
        BasicRouteDirector basicRouteDirector = new BasicRouteDirector();
        do {
            HttpRoute route = this.managedConn.getRoute();
            nextStep = basicRouteDirector.nextStep(httpRoute, route);
            switch (nextStep) {
                case -1:
                    throw new IllegalStateException("Unable to establish route.\nplanned = " + httpRoute + "\ncurrent = " + route);
                case 0:
                    break;
                case 1:
                case 2:
                    this.managedConn.open(httpRoute, httpContext, this.params);
                    continue;
                case 3:
                    boolean createTunnelToTarget = createTunnelToTarget(httpRoute, httpContext);
                    this.log.debug("Tunnel to target created.");
                    this.managedConn.tunnelTarget(createTunnelToTarget, this.params);
                    continue;
                case 4:
                    int hopCount = route.getHopCount() - 1;
                    boolean createTunnelToProxy = createTunnelToProxy(httpRoute, hopCount, httpContext);
                    this.log.debug("Tunnel to proxy created.");
                    this.managedConn.tunnelProxy(httpRoute.getHopTarget(hopCount), createTunnelToProxy, this.params);
                    continue;
                case 5:
                    this.managedConn.layerProtocol(httpContext, this.params);
                    continue;
                default:
                    throw new IllegalStateException(a81.j(nextStep, "Unknown step indicator ", " from RouteDirector."));
            }
        } while (nextStep > 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02b5, code lost:
        abortConnection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02b8, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02b9, code lost:
        abortConnection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02bc, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02bd, code lost:
        abortConnection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c0, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3 = new java.io.InterruptedIOException();
        r3.initCause(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0140, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r1.log.debug("Closing the connection.");
        r1.managedConn.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0191, code lost:
        if (r1.retryHandler.retryRequest(r2, r12, r3) != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0199, code lost:
        if (r1.log.isInfoEnabled() != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019b, code lost:
        r8 = r1.log;
        r15 = new java.lang.StringBuilder();
        r16 = r5;
        r15.append("I/O exception (");
        r15.append(r2.getClass().getName());
        r15.append(") caught when processing request: ");
        r15.append(r2.getMessage());
        r8.info(r15.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c8, code lost:
        r16 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d0, code lost:
        if (r1.log.isDebugEnabled() != false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d2, code lost:
        r1.log.debug(r2.getMessage(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01db, code lost:
        r1.log.info("Retrying request");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e7, code lost:
        if (r14.getHopCount() == 1) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e9, code lost:
        r1.log.debug("Reopening the direct connection.");
        r1.managedConn.open(r14, r3, r1.params);
        r2 = r20;
        r8 = 1;
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fe, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ff, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051 A[ExcHandler: HttpException (r0v0 'e' org.apache.http.HttpException A[CUSTOM_DECLARE]), Splitter:B:2:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0049 A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:37:0x00b3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.HttpResponse execute(org.apache.http.HttpHost r19, org.apache.http.HttpRequest r20, org.apache.http.protocol.HttpContext r21) throws org.apache.http.HttpException, java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            r3 = r21
            java.lang.String r4 = "http.user-token"
            org.apache.http.impl.client.RequestWrapper r5 = r1.wrapRequest(r2)
            org.apache.http.params.HttpParams r6 = r1.params
            r5.setParams(r6)
            r6 = r19
            org.apache.http.conn.routing.HttpRoute r6 = r1.determineRoute(r6, r5, r3)
            org.apache.http.impl.client.RoutedRequest r7 = new org.apache.http.impl.client.RoutedRequest
            r7.<init>(r5, r6)
            org.apache.http.params.HttpParams r5 = r1.params
            long r5 = org.apache.http.conn.params.ConnManagerParams.getTimeout(r5)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0026:
            if (r10 != 0) goto L_0x0288
            org.apache.http.impl.client.RequestWrapper r13 = r7.getRequest()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.conn.routing.HttpRoute r14 = r7.getRoute()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.Object r15 = r3.getAttribute(r4)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r8 != 0) goto L_0x008c
            org.apache.http.conn.ClientConnectionManager r8 = r1.connManager     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.conn.ClientConnectionRequest r8 = r8.requestConnection(r14, r15)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            boolean r15 = r2 instanceof org.apache.http.client.methods.AbortableHttpRequest     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r15 == 0) goto L_0x0055
            r15 = r2
            org.apache.http.client.methods.AbortableHttpRequest r15 = (org.apache.http.client.methods.AbortableHttpRequest) r15     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r15.setConnectionRequest(r8)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            goto L_0x0055
        L_0x0049:
            r0 = move-exception
            r2 = r0
            goto L_0x02b5
        L_0x004d:
            r0 = move-exception
            r2 = r0
            goto L_0x02b9
        L_0x0051:
            r0 = move-exception
            r2 = r0
            goto L_0x02bd
        L_0x0055:
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0081 }
            org.apache.http.conn.ManagedClientConnection r8 = r8.getConnection(r5, r15)     // Catch:{ InterruptedException -> 0x0081 }
            r1.managedConn = r8     // Catch:{ InterruptedException -> 0x0081 }
            org.apache.http.params.HttpParams r8 = r1.params     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            boolean r8 = org.apache.http.params.HttpConnectionParams.isStaleCheckingEnabled(r8)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r8 == 0) goto L_0x008c
            org.apache.commons.logging.Log r8 = r1.log     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r15 = "Stale connection check"
            r8.debug(r15)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            boolean r8 = r8.isStale()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r8 == 0) goto L_0x008c
            org.apache.commons.logging.Log r8 = r1.log     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r15 = "Stale connection detected"
            r8.debug(r15)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ IOException -> 0x008c, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            r8.close()     // Catch:{ IOException -> 0x008c, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            goto L_0x008c
        L_0x0081:
            r0 = move-exception
            r2 = r0
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r3.<init>()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r3.initCause(r2)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            throw r3     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x008c:
            boolean r8 = r2 instanceof org.apache.http.client.methods.AbortableHttpRequest     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r8 == 0) goto L_0x0098
            r8 = r2
            org.apache.http.client.methods.AbortableHttpRequest r8 = (org.apache.http.client.methods.AbortableHttpRequest) r8     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.conn.ManagedClientConnection r15 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r8.setReleaseTrigger(r15)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x0098:
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            boolean r8 = r8.isOpen()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r8 != 0) goto L_0x00a8
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.params.HttpParams r15 = r1.params     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r8.open(r14, r3, r15)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            goto L_0x00b3
        L_0x00a8:
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.params.HttpParams r15 = r1.params     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            int r15 = org.apache.http.params.HttpConnectionParams.getSoTimeout(r15)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r8.setSocketTimeout(r15)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x00b3:
            r1.establishRoute(r14, r3)     // Catch:{ TunnelRefusedException -> 0x0271 }
            r13.resetHeaders()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r1.rewriteRequestURI(r13, r14)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.params.HttpParams r8 = r13.getParams()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r11 = "http.virtual-host"
            java.lang.Object r8 = r8.getParameter(r11)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.HttpHost r8 = (org.apache.http.HttpHost) r8     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r8 != 0) goto L_0x00ce
            org.apache.http.HttpHost r8 = r14.getTargetHost()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x00ce:
            org.apache.http.HttpHost r11 = r14.getProxyHost()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r15 = "http.target_host"
            r3.setAttribute(r15, r8)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r8 = "http.proxy_host"
            r3.setAttribute(r8, r11)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r8 = "http.connection"
            org.apache.http.conn.ManagedClientConnection r11 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r3.setAttribute(r8, r11)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r8 = "http.auth.target-scope"
            org.apache.http.auth.AuthState r11 = r1.targetAuthState     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r3.setAttribute(r8, r11)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r8 = "http.auth.proxy-scope"
            org.apache.http.auth.AuthState r11 = r1.proxyAuthState     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r3.setAttribute(r8, r11)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.protocol.HttpRequestExecutor r8 = r1.requestExec     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.protocol.HttpProcessor r11 = r1.httpProcessor     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r8.preProcess(r13, r11, r3)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r8 = "http.request"
            r3.setAttribute(r8, r13)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r8 = 1
            r11 = r8
        L_0x00ff:
            if (r11 == 0) goto L_0x0200
            int r12 = r12 + 1
            r13.incrementExecCount()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            int r15 = r13.getExecCount()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r15 <= r8) goto L_0x011b
            boolean r15 = r13.isRepeatable()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r15 == 0) goto L_0x0113
            goto L_0x011b
        L_0x0113:
            org.apache.http.client.NonRepeatableRequestException r2 = new org.apache.http.client.NonRepeatableRequestException     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r3 = "Cannot retry request with a non-repeatable request entity"
            r2.<init>(r3)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            throw r2     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x011b:
            org.apache.commons.logging.Log r15 = r1.log     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            boolean r15 = r15.isDebugEnabled()     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            if (r15 == 0) goto L_0x0142
            org.apache.commons.logging.Log r15 = r1.log     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            r8.<init>()     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            java.lang.String r2 = "Attempt "
            r8.append(r2)     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            r8.append(r12)     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            java.lang.String r2 = " to execute request"
            r8.append(r2)     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            java.lang.String r2 = r8.toString()     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            r15.debug(r2)     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            goto L_0x0142
        L_0x013f:
            r0 = move-exception
            r2 = r0
            goto L_0x017f
        L_0x0142:
            boolean r2 = r14.isSecure()     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            if (r2 != 0) goto L_0x0172
            org.apache.http.HttpHost r2 = r14.getTargetHost()     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            java.lang.String r2 = r2.getHostName()     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            boolean r2 = isCleartextTrafficPermitted(r2)     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            if (r2 == 0) goto L_0x0157
            goto L_0x0172
        L_0x0157:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            r8.<init>()     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            java.lang.String r15 = "Cleartext traffic not permitted: "
            r8.append(r15)     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            org.apache.http.HttpHost r15 = r14.getTargetHost()     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            r8.append(r15)     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            r2.<init>(r8)     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            throw r2     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
        L_0x0172:
            org.apache.http.protocol.HttpRequestExecutor r2 = r1.requestExec     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            org.apache.http.HttpResponse r9 = r2.execute(r13, r8, r3)     // Catch:{ IOException -> 0x013f, HttpException -> 0x0051, RuntimeException -> 0x0049 }
            r2 = r20
            r8 = 1
            r11 = 0
            goto L_0x00ff
        L_0x017f:
            org.apache.commons.logging.Log r8 = r1.log     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r15 = "Closing the connection."
            r8.debug(r15)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r8.close()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.client.HttpRequestRetryHandler r8 = r1.retryHandler     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            boolean r8 = r8.retryRequest(r2, r12, r3)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r8 == 0) goto L_0x01ff
            org.apache.commons.logging.Log r8 = r1.log     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            boolean r8 = r8.isInfoEnabled()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r8 == 0) goto L_0x01c8
            org.apache.commons.logging.Log r8 = r1.log     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r15.<init>()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r16 = r5
            java.lang.String r5 = "I/O exception ("
            r15.append(r5)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.Class r5 = r2.getClass()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r5 = r5.getName()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r15.append(r5)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r5 = ") caught when processing request: "
            r15.append(r5)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r5 = r2.getMessage()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r15.append(r5)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r5 = r15.toString()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r8.info(r5)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            goto L_0x01ca
        L_0x01c8:
            r16 = r5
        L_0x01ca:
            org.apache.commons.logging.Log r5 = r1.log     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            boolean r5 = r5.isDebugEnabled()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r5 == 0) goto L_0x01db
            org.apache.commons.logging.Log r5 = r1.log     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r6 = r2.getMessage()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r5.debug(r6, r2)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x01db:
            org.apache.commons.logging.Log r5 = r1.log     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r6 = "Retrying request"
            r5.info(r6)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            int r5 = r14.getHopCount()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r6 = 1
            if (r5 != r6) goto L_0x01fe
            org.apache.commons.logging.Log r2 = r1.log     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r5 = "Reopening the direct connection."
            r2.debug(r5)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.conn.ManagedClientConnection r2 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.params.HttpParams r5 = r1.params     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r2.open(r14, r3, r5)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r2 = r20
            r8 = r6
            r5 = r16
            goto L_0x00ff
        L_0x01fe:
            throw r2     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x01ff:
            throw r2     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x0200:
            r16 = r5
            r6 = r8
            org.apache.http.params.HttpParams r2 = r1.params     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r9.setParams(r2)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.protocol.HttpRequestExecutor r2 = r1.requestExec     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.protocol.HttpProcessor r5 = r1.httpProcessor     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r2.postProcess(r9, r5, r3)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.ConnectionReuseStrategy r2 = r1.reuseStrategy     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            boolean r11 = r2.keepAlive(r9, r3)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r11 == 0) goto L_0x0224
            org.apache.http.conn.ConnectionKeepAliveStrategy r2 = r1.keepAliveStrategy     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            long r13 = r2.getKeepAliveDuration(r9, r3)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.conn.ManagedClientConnection r2 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r2.setIdleDuration(r13, r5)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x0224:
            org.apache.http.impl.client.RoutedRequest r2 = r1.handleResponse(r7, r9, r3)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r2 != 0) goto L_0x022c
            r10 = r6
            goto L_0x025b
        L_0x022c:
            if (r11 == 0) goto L_0x0244
            org.apache.commons.logging.Log r5 = r1.log     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r6 = "Connection kept alive"
            r5.debug(r6)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.HttpEntity r5 = r9.getEntity()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r5 == 0) goto L_0x023e
            r5.consumeContent()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x023e:
            org.apache.http.conn.ManagedClientConnection r5 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r5.markReusable()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            goto L_0x0249
        L_0x0244:
            org.apache.http.conn.ManagedClientConnection r5 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r5.close()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x0249:
            org.apache.http.conn.routing.HttpRoute r5 = r2.getRoute()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.conn.routing.HttpRoute r6 = r7.getRoute()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            boolean r5 = r5.equals(r6)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r5 != 0) goto L_0x025a
            r18.releaseConnection()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x025a:
            r7 = r2
        L_0x025b:
            org.apache.http.client.UserTokenHandler r2 = r1.userTokenHandler     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.Object r2 = r2.getUserToken(r3)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r3.setAttribute(r4, r2)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.conn.ManagedClientConnection r5 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r5 == 0) goto L_0x026b
            r5.setState(r2)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x026b:
            r2 = r20
            r5 = r16
            goto L_0x0026
        L_0x0271:
            r0 = move-exception
            r2 = r0
            org.apache.commons.logging.Log r3 = r1.log     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            boolean r3 = r3.isDebugEnabled()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r3 == 0) goto L_0x0284
            org.apache.commons.logging.Log r3 = r1.log     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            java.lang.String r4 = r2.getMessage()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r3.debug(r4)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x0284:
            org.apache.http.HttpResponse r9 = r2.getResponse()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x0288:
            if (r9 == 0) goto L_0x02aa
            org.apache.http.HttpEntity r2 = r9.getEntity()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r2 == 0) goto L_0x02aa
            org.apache.http.HttpEntity r2 = r9.getEntity()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            boolean r2 = r2.isStreaming()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            if (r2 != 0) goto L_0x029b
            goto L_0x02aa
        L_0x029b:
            org.apache.http.HttpEntity r2 = r9.getEntity()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.conn.BasicManagedEntity r3 = new org.apache.http.conn.BasicManagedEntity     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            org.apache.http.conn.ManagedClientConnection r4 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r3.<init>(r2, r4, r11)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r9.setEntity(r3)     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            goto L_0x02b4
        L_0x02aa:
            if (r11 == 0) goto L_0x02b1
            org.apache.http.conn.ManagedClientConnection r2 = r1.managedConn     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
            r2.markReusable()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x02b1:
            r18.releaseConnection()     // Catch:{ HttpException -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049 }
        L_0x02b4:
            return r9
        L_0x02b5:
            r18.abortConnection()
            throw r2
        L_0x02b9:
            r18.abortConnection()
            throw r2
        L_0x02bd:
            r18.abortConnection()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.DefaultRequestDirector.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):org.apache.http.HttpResponse");
    }

    public RoutedRequest handleResponse(RoutedRequest routedRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        HttpRoute route = routedRequest.getRoute();
        HttpHost proxyHost = route.getProxyHost();
        RequestWrapper request = routedRequest.getRequest();
        HttpParams params2 = request.getParams();
        if (!HttpClientParams.isRedirecting(params2) || !this.redirectHandler.isRedirectRequested(httpResponse, httpContext)) {
            CredentialsProvider credentialsProvider = (CredentialsProvider) httpContext.getAttribute(ClientContext.CREDS_PROVIDER);
            if (credentialsProvider != null && HttpClientParams.isAuthenticating(params2)) {
                if (this.targetAuthHandler.isAuthenticationRequested(httpResponse, httpContext)) {
                    HttpHost httpHost = (HttpHost) httpContext.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
                    if (httpHost == null) {
                        httpHost = route.getTargetHost();
                    }
                    this.log.debug("Target requested authentication");
                    try {
                        processChallenges(this.targetAuthHandler.getChallenges(httpResponse, httpContext), this.targetAuthState, this.targetAuthHandler, httpResponse, httpContext);
                    } catch (AuthenticationException e) {
                        if (this.log.isWarnEnabled()) {
                            Log log2 = this.log;
                            log2.warn("Authentication error: " + e.getMessage());
                            return null;
                        }
                    }
                    updateAuthState(this.targetAuthState, httpHost, credentialsProvider);
                    if (this.targetAuthState.getCredentials() != null) {
                        return routedRequest;
                    }
                    return null;
                }
                this.targetAuthState.setAuthScope((AuthScope) null);
                if (this.proxyAuthHandler.isAuthenticationRequested(httpResponse, httpContext)) {
                    this.log.debug("Proxy requested authentication");
                    try {
                        processChallenges(this.proxyAuthHandler.getChallenges(httpResponse, httpContext), this.proxyAuthState, this.proxyAuthHandler, httpResponse, httpContext);
                    } catch (AuthenticationException e2) {
                        if (this.log.isWarnEnabled()) {
                            Log log3 = this.log;
                            log3.warn("Authentication error: " + e2.getMessage());
                            return null;
                        }
                    }
                    updateAuthState(this.proxyAuthState, proxyHost, credentialsProvider);
                    if (this.proxyAuthState.getCredentials() != null) {
                        return routedRequest;
                    }
                    return null;
                }
                this.proxyAuthState.setAuthScope((AuthScope) null);
            }
            return null;
        }
        int i = this.redirectCount;
        if (i < this.maxRedirects) {
            this.redirectCount = i + 1;
            URI locationURI = this.redirectHandler.getLocationURI(httpResponse, httpContext);
            HttpHost httpHost2 = new HttpHost(locationURI.getHost(), locationURI.getPort(), locationURI.getScheme());
            HttpGet httpGet = new HttpGet(locationURI);
            httpGet.setHeaders(request.getOriginal().getAllHeaders());
            RequestWrapper requestWrapper = new RequestWrapper(httpGet);
            requestWrapper.setParams(params2);
            HttpRoute determineRoute = determineRoute(httpHost2, requestWrapper, httpContext);
            RoutedRequest routedRequest2 = new RoutedRequest(requestWrapper, determineRoute);
            if (this.log.isDebugEnabled()) {
                Log log4 = this.log;
                log4.debug("Redirecting to '" + locationURI + "' via " + determineRoute);
            }
            return routedRequest2;
        }
        throw new RedirectException(wj6.l(new StringBuilder("Maximum redirects ("), this.maxRedirects, ") exceeded"));
    }

    public void releaseConnection() {
        try {
            this.managedConn.releaseConnection();
        } catch (IOException e) {
            this.log.debug("IOException releasing connection", e);
        }
        this.managedConn = null;
    }

    public void rewriteRequestURI(RequestWrapper requestWrapper, HttpRoute httpRoute) throws ProtocolException {
        try {
            URI uri = requestWrapper.getURI();
            if (httpRoute.getProxyHost() == null || httpRoute.isTunnelled()) {
                if (uri.isAbsolute()) {
                    requestWrapper.setURI(URIUtils.rewriteURI(uri, (HttpHost) null));
                }
            } else if (!uri.isAbsolute()) {
                requestWrapper.setURI(URIUtils.rewriteURI(uri, httpRoute.getTargetHost()));
            }
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid URI: " + requestWrapper.getRequestLine().getUri(), e);
        }
    }
}
