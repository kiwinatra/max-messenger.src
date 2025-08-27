package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: d01  reason: default package */
public final class d01 implements rj1 {
    public final npg a;
    public final jc1 b;

    public d01(npg npg, jc1 jc1) {
        this.a = npg;
        this.b = jc1;
        jc1.h.a.add(this);
    }

    public final void a(xe8 xe8) {
        yz0 yz0 = (yz0) xe8.b;
        jc1 jc1 = this.b;
        ywd ywd = (ywd) xe8.c;
        if (yz0 == null) {
            jc1.m.onAsrRecordStopped(new a01(ywd));
        } else {
            jc1.m.onAsrRecordStarted(new zz0(ywd, yz0));
        }
    }

    public final void b(JSONObject jSONObject) {
        npg npg = this.a;
        npg.getClass();
        nt ntVar = null;
        try {
            yz0 P = npg.P(jSONObject.getJSONObject("asrInfo"));
            if (P != null) {
                ((nfd) npg.c).getClass();
                ntVar = new nt(nfd.s(jSONObject), P);
            }
        } catch (JSONException e) {
            ((voc) npg.b).logException("AsrParser", "Can't parse record start info", e);
        }
        if (ntVar != null) {
            this.b.m.onAsrRecordStarted(new zz0(ntVar.a, ntVar.b));
        }
    }

    public final void c(JSONObject jSONObject) {
        ot otVar;
        npg npg = this.a;
        npg.getClass();
        try {
            ((nfd) npg.c).getClass();
            otVar = new ot(nfd.s(jSONObject));
        } catch (JSONException e) {
            ((voc) npg.b).logException("AsrParser", "Can't parse record stop info", e);
            otVar = null;
        }
        if (otVar != null) {
            this.b.m.onAsrRecordStopped(new a01(otVar.a));
        }
    }
}
