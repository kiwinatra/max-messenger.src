package defpackage;

import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ph3  reason: default package */
public final class ph3 {
    public final String a;
    public final String b;
    public final boolean c;

    public ph3(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = true;
    }

    public static ph3 a(JSONObject jSONObject) {
        boolean z;
        try {
            String string = jSONObject.isNull("host") ? null : jSONObject.getString("host");
            String string2 = jSONObject.isNull(ClientCookie.PORT_ATTR) ? null : jSONObject.getString(ClientCookie.PORT_ATTR);
            if (!jSONObject.isNull("tls")) {
                if (!jSONObject.getBoolean("tls")) {
                    z = false;
                    return new ph3(string, string2, z);
                }
            }
            z = true;
            return new ph3(string, string2, z);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", (Object) this.a);
            jSONObject.put(ClientCookie.PORT_ATTR, (Object) this.b);
            jSONObject.put("tls", this.c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ph3.class != obj.getClass()) {
            return false;
        }
        ph3 ph3 = (ph3) obj;
        if (this.c != ph3.c) {
            return false;
        }
        String str = ph3.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = ph3.b;
        String str4 = this.b;
        return str4 != null ? str4.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + (this.c ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionHost{host='");
        sb.append(this.a);
        sb.append("', port='");
        sb.append(this.b);
        sb.append("', tls=");
        return wzf.l(sb, this.c, '}');
    }

    public ph3(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
