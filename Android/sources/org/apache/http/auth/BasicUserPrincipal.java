package org.apache.http.auth;

import java.security.Principal;
import org.apache.http.util.LangUtils;

@Deprecated
public final class BasicUserPrincipal implements Principal {
    private final String username;

    public BasicUserPrincipal(String str) {
        if (str != null) {
            this.username = str;
            return;
        }
        throw new IllegalArgumentException("User name may not be null");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof BasicUserPrincipal) && LangUtils.equals((Object) this.username, (Object) ((BasicUserPrincipal) obj).username);
    }

    public String getName() {
        return this.username;
    }

    public int hashCode() {
        return LangUtils.hashCode(17, (Object) this.username);
    }

    public String toString() {
        return wj6.n(new StringBuilder("[principal: "), this.username, "]");
    }
}
