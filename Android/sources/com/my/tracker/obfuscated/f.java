package com.my.tracker.obfuscated;

import android.text.TextUtils;
import org.json.JSONObject;

public class f {
    private final JSONObject a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final boolean f;
    private final long g;
    private JSONObject h;
    private Long i;

    public f(JSONObject jSONObject, String str, String str2, String str3, int i2, boolean z, long j) {
        this.b = str;
        this.a = jSONObject;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = z;
        this.g = j;
    }

    public String a() {
        return this.b;
    }

    public Long b() {
        return this.i;
    }

    public String c() {
        return this.d;
    }

    public JSONObject d() {
        return this.h;
    }

    public JSONObject e() {
        return this.a;
    }

    public String f() {
        return this.c;
    }

    public int g() {
        return this.e;
    }

    public long h() {
        return this.g;
    }

    public static f a(String str, String str2, String str3, int i2, long j) {
        String str4 = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("productId");
            if (TextUtils.isEmpty(optString)) {
                x2.a("RawPurchase: empty productId in data " + str);
                return null;
            }
            return new f(jSONObject, str2, str3, optString, i2, jSONObject.has("priceType") && jSONObject.getInt("priceType") == 2, j);
        } catch (Throwable th) {
            x2.b("RawPurchase error: creating object failed", th);
            return null;
        }
    }

    public f a(Long l) {
        this.i = l;
        return this;
    }

    public f a(JSONObject jSONObject) {
        this.h = jSONObject;
        return this;
    }
}
