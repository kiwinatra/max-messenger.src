package org.apache.http.client.protocol;

import java.util.List;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.protocol.HttpContext;

@Deprecated
public class ClientContextConfigurer implements ClientContext {
    private final HttpContext context;

    public ClientContextConfigurer(HttpContext httpContext) {
        if (httpContext != null) {
            this.context = httpContext;
            return;
        }
        throw new IllegalArgumentException("HTTP context may not be null");
    }

    public void setAuthSchemePref(List<String> list) {
        this.context.setAttribute(ClientContext.AUTH_SCHEME_PREF, list);
    }

    public void setAuthSchemeRegistry(AuthSchemeRegistry authSchemeRegistry) {
        this.context.setAttribute(ClientContext.AUTHSCHEME_REGISTRY, authSchemeRegistry);
    }

    public void setCookieSpecRegistry(CookieSpecRegistry cookieSpecRegistry) {
        this.context.setAttribute(ClientContext.COOKIESPEC_REGISTRY, cookieSpecRegistry);
    }

    public void setCookieStore(CookieStore cookieStore) {
        this.context.setAttribute(ClientContext.COOKIE_STORE, cookieStore);
    }

    public void setCredentialsProvider(CredentialsProvider credentialsProvider) {
        this.context.setAttribute(ClientContext.CREDS_PROVIDER, credentialsProvider);
    }
}
