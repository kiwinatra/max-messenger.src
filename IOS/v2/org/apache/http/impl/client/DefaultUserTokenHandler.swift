package org.apache.http.impl.client;

import java.security.Principal;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.UserTokenHandler;

@Deprecated
public class DefaultUserTokenHandler implements UserTokenHandler {
    private static Principal getAuthPrincipal(AuthState authState) {
        Credentials credentials;
        AuthScheme authScheme = authState.getAuthScheme();
        if (authScheme == null || !authScheme.isComplete() || !authScheme.isConnectionBased() || (credentials = authState.getCredentials()) == null) {
            return null;
        }
        return credentials.getUserPrincipal();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        r2 = r2.getSSLSession();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getUserToken(org.apache.http.protocol.HttpContext r2) {
        /*
            r1 = this;
            java.lang.String r1 = "http.auth.target-scope"
            java.lang.Object r1 = r2.getAttribute(r1)
            org.apache.http.auth.AuthState r1 = (org.apache.http.auth.AuthState) r1
            if (r1 == 0) goto L_0x001d
            java.security.Principal r1 = getAuthPrincipal(r1)
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = "http.auth.proxy-scope"
            java.lang.Object r1 = r2.getAttribute(r1)
            org.apache.http.auth.AuthState r1 = (org.apache.http.auth.AuthState) r1
            java.security.Principal r1 = getAuthPrincipal(r1)
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r1 != 0) goto L_0x0038
            java.lang.String r0 = "http.connection"
            java.lang.Object r2 = r2.getAttribute(r0)
            org.apache.http.conn.ManagedClientConnection r2 = (org.apache.http.conn.ManagedClientConnection) r2
            boolean r0 = r2.isOpen()
            if (r0 == 0) goto L_0x0038
            javax.net.ssl.SSLSession r2 = r2.getSSLSession()
            if (r2 == 0) goto L_0x0038
            java.security.Principal r1 = r2.getLocalPrincipal()
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.DefaultUserTokenHandler.getUserToken(org.apache.http.protocol.HttpContext):java.lang.Object");
    }
}
