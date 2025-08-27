package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: rp5  reason: default package */
public final class rp5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public rp5(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = eye.a;
        vzg.o("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static rp5 a(Context context) {
        ata ata = new ata(context, 26);
        String w = ata.w("google_app_id");
        if (TextUtils.isEmpty(w)) {
            return null;
        }
        return new rp5(w, ata.w("google_api_key"), ata.w("firebase_database_url"), ata.w("ga_trackingId"), ata.w("gcm_defaultSenderId"), ata.w("google_storage_bucket"), ata.w("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rp5)) {
            return false;
        }
        rp5 rp5 = (rp5) obj;
        return kne.o(this.b, rp5.b) && kne.o(this.a, rp5.a) && kne.o(this.c, rp5.c) && kne.o(this.d, rp5.d) && kne.o(this.e, rp5.e) && kne.o(this.f, rp5.f) && kne.o(this.g, rp5.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        fj fjVar = new fj((Object) this);
        fjVar.k(this.b, "applicationId");
        fjVar.k(this.a, "apiKey");
        fjVar.k(this.c, "databaseUrl");
        fjVar.k(this.e, "gcmSenderId");
        fjVar.k(this.f, "storageBucket");
        fjVar.k(this.g, "projectId");
        return fjVar.toString();
    }
}
