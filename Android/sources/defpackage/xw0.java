package defpackage;

import org.json.JSONObject;

/* renamed from: xw0  reason: default package */
public final class xw0 implements n9e {
    public final /* synthetic */ o9e a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ o9e c;

    public xw0(o9e o9e, mgd mgd) {
        this.c = o9e;
        this.b = mgd;
        this.a = o9e;
    }

    public final void k(JSONObject jSONObject) {
        this.c.c.removeCallbacks(this.b);
        this.a.g();
    }
}
