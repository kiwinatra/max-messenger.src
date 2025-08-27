package defpackage;

import org.json.JSONObject;

/* renamed from: ty0  reason: default package */
public final /* synthetic */ class ty0 implements n9e {
    public final /* synthetic */ hz0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ue1 c;
    public final /* synthetic */ zwd o;

    public /* synthetic */ ty0(hz0 hz0, boolean z, ue1 ue1, zwd zwd) {
        this.a = hz0;
        this.b = z;
        this.c = ue1;
        this.o = zwd;
    }

    public final void k(JSONObject jSONObject) {
        hz0 hz0 = this.a;
        hz0.getClass();
        if (jSONObject.optString("error").isEmpty()) {
            boolean z = this.b;
            ue1 ue1 = this.c;
            ue1 ue12 = z ? ue1 : null;
            zwd zwd = this.o;
            if (zwd instanceof ywd) {
                hz0.W1.b(!z, ue1, (ywd) zwd);
            } else {
                hz0.G1 = ue12;
            }
            hz0.k(b51.H0, ue12);
        }
    }
}
