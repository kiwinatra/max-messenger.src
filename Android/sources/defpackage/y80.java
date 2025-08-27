package defpackage;

import android.net.Uri;

/* renamed from: y80  reason: default package */
public final class y80 extends e0 {
    public final String a;
    public final String b;

    public y80(String str, String str2) {
        this.a = str2;
        this.b = str;
    }

    public final mm getScope() {
        return mm.b;
    }

    public final Uri getUri() {
        return um.a("auth.anonymLogin");
    }

    public final void populateParams(gm gmVar) {
        gmVar.b("referrer", (String) null);
        String str = this.a;
        gmVar.b("deviceId", str);
        gmVar.a(new gq0("verification_supported", true));
        gmVar.b("verification_token", (String) null);
        gmVar.b("verification_supported_v", "1");
        gmVar.b("client", "test");
        gmVar.a(new gq0("gen_token", true));
        if (str == null) {
            str = "test";
        }
        String str2 = this.b;
        gmVar.b("session_data", str2 != null ? rae.p("{\"auth_token\": \"", str2, "\", \"version\": 3, \"device_id\": \"", str, "\", \"client_version\": 1}") : wj6.k("{\"version\": 2, \"device_id\": \"", str, "\", \"client_version\": 1}"));
    }
}
