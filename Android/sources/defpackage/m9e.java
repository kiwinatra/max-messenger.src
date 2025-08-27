package defpackage;

import org.json.JSONObject;

/* renamed from: m9e  reason: default package */
public final /* synthetic */ class m9e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o9e b;
    public final /* synthetic */ n9e c;
    public final /* synthetic */ JSONObject o;

    public /* synthetic */ m9e(o9e o9e, n9e n9e, JSONObject jSONObject, int i) {
        this.a = i;
        this.b = o9e;
        this.c = n9e;
        this.o = jSONObject;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                n9e n9e = this.c;
                o9e o9e = this.b;
                voc voc = o9e.b;
                try {
                    boolean z = n9e instanceof xw0;
                    JSONObject jSONObject = this.o;
                    if (z) {
                        ((xw0) n9e).k(jSONObject);
                        return;
                    } else if (o9e.p) {
                        n9e.k(jSONObject);
                        return;
                    } else {
                        voc.log("OKSignaling", "<!> ignoring " + jSONObject);
                        return;
                    }
                } catch (Exception e) {
                    voc.reportException("OKSignaling", "signaling.response", e);
                    return;
                }
            default:
                n9e n9e2 = this.c;
                o9e o9e2 = this.b;
                voc voc2 = o9e2.b;
                try {
                    boolean z2 = n9e2 instanceof xw0;
                    JSONObject jSONObject2 = this.o;
                    if (z2) {
                        ((xw0) n9e2).k(jSONObject2);
                        return;
                    } else if (o9e2.p) {
                        n9e2.k(jSONObject2);
                        return;
                    } else {
                        voc2.log("OKSignaling", "<!> ignoring " + jSONObject2);
                        return;
                    }
                } catch (Exception e2) {
                    voc2.reportException("OKSignaling", "signaling.response", e2);
                    return;
                }
        }
    }
}
