package defpackage;

import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: t09  reason: default package */
public final /* synthetic */ class t09 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u09 b;

    public /* synthetic */ t09(u09 u09, int i) {
        this.a = i;
        this.b = u09;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                u09 u09 = this.b;
                if (u09.a == null) {
                    return null;
                }
                try {
                    return new JSONObject(u09.a);
                } catch (JSONException e) {
                    z68.f(u09.b, "Failed to parse media transform params", e);
                    return null;
                }
            case 1:
                JSONObject jSONObject = (JSONObject) this.b.c.getValue();
                boolean z = false;
                if (jSONObject != null) {
                    z = jSONObject.optBoolean("enabled", false);
                }
                return Boolean.valueOf(z);
            case 2:
                JSONObject jSONObject2 = (JSONObject) this.b.c.getValue();
                boolean z2 = false;
                if (jSONObject2 != null) {
                    z2 = jSONObject2.optBoolean("hevc_enabled", false);
                }
                return Boolean.valueOf(z2);
            default:
                JSONObject jSONObject3 = (JSONObject) this.b.c.getValue();
                boolean z3 = false;
                if (jSONObject3 != null) {
                    z3 = jSONObject3.optBoolean("hdr_enabled", false);
                }
                return Boolean.valueOf(z3);
        }
    }
}
