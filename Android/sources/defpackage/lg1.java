package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: lg1  reason: default package */
public final class lg1 implements sj1 {
    public final ox0 a;
    public final jc1 b;

    public lg1(ox0 ox0, jc1 jc1) {
        this.a = ox0;
        this.b = jc1;
        jc1.g.a.add(this);
    }

    public final void a(ox0 ox0) {
        dae dae = (dae) ox0.c;
        jc1 jc1 = this.b;
        ywd ywd = (ywd) ox0.b;
        if (dae == null) {
            jc1.i.onRecordStopped(new jg1((ue1) null, ywd));
        } else {
            jc1.i.onRecordStarted(new ig1(ywd, te8.A(dae)));
        }
    }

    public final void b(JSONObject jSONObject) {
        ata ata;
        ox0 ox0 = this.a;
        ox0.getClass();
        try {
            dae p = ox0.p(jSONObject.getJSONObject("recordInfo"));
            ((nfd) ox0.b).getClass();
            ata = new ata(24, p, nfd.s(jSONObject));
        } catch (JSONException e) {
            ((voc) ox0.c).logException("RecordInfoParser", "Can't parse record start info", e);
            ata = null;
        }
        if (ata != null) {
            this.b.i.onRecordStarted(new ig1((zwd) ata.c, te8.A((dae) ata.b)));
        }
    }

    public final void c(JSONObject jSONObject) {
        ox0 ox0 = this.a;
        ox0.getClass();
        wsb wsb = null;
        try {
            String C = ct.C(jSONObject, "participant");
            ue1 a2 = C != null ? ue1.a(C) : null;
            if (jSONObject.has("recordMovieId")) {
                jSONObject.optLong("recordMovieId");
            }
            ((nfd) ox0.b).getClass();
            wsb = new wsb(nfd.s(jSONObject), a2);
        } catch (JSONException e) {
            ((voc) ox0.c).logException("RecordInfoParser", "Can't parse record stop info", e);
        }
        if (wsb != null) {
            this.b.i.onRecordStopped(new jg1((ue1) wsb.b, (zwd) wsb.a));
        }
    }
}
