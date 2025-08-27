package org.apache.http.impl.client;

import java.util.HashMap;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;

@Deprecated
public class BasicCredentialsProvider implements CredentialsProvider {
    private final HashMap<AuthScope, Credentials> credMap = new HashMap<>();

    private static Credentials matchCredentials(HashMap<AuthScope, Credentials> hashMap, AuthScope authScope) {
        Credentials credentials = hashMap.get(authScope);
        if (credentials != null) {
            return credentials;
        }
        int i = -1;
        AuthScope authScope2 = null;
        for (AuthScope next : hashMap.keySet()) {
            int match = authScope.match(next);
            if (match > i) {
                authScope2 = next;
                i = match;
            }
        }
        return authScope2 != null ? hashMap.get(authScope2) : credentials;
    }

    public synchronized void clear() {
        this.credMap.clear();
    }

    public synchronized Credentials getCredentials(AuthScope authScope) {
        if (authScope != null) {
        } else {
            throw new IllegalArgumentException("Authentication scope may not be null");
        }
        return matchCredentials(this.credMap, authScope);
    }

    public synchronized void setCredentials(AuthScope authScope, Credentials credentials) {
        if (authScope != null) {
            this.credMap.put(authScope, credentials);
        } else {
            throw new IllegalArgumentException("Authentication scope may not be null");
        }
    }

    public String toString() {
        return this.credMap.toString();
    }
}
