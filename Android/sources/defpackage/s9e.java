package defpackage;

import org.json.JSONObject;

/* renamed from: s9e  reason: default package */
public final class s9e implements r9e {
    public final zq0 a;

    public s9e(zq0 zq0) {
        this.a = zq0;
    }

    public final JSONObject a() {
        JSONObject put = new JSONObject().put("command", (Object) "update-media-modifiers");
        zq0 zq0 = this.a;
        zq0.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("denoise", zq0.a);
            jSONObject.put("denoiseAnn", zq0.b);
        } catch (Exception unused) {
        }
        return put.put("mediaModifiers", (Object) jSONObject);
    }
}
