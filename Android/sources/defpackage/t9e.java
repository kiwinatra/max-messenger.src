package defpackage;

import org.json.JSONObject;

/* renamed from: t9e  reason: default package */
public final class t9e implements r9e {
    public final aae a;
    public final boolean b;
    public final boolean c;

    public t9e(aae aae, boolean z, boolean z2) {
        this.a = aae;
        this.b = z;
        this.c = z2;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", (Object) "change-media-settings");
        jSONObject.put("mediaSettings", (Object) tf6.r(this.a, this.b, this.c));
        return jSONObject;
    }
}
