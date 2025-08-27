package defpackage;

import java.util.ArrayList;

/* renamed from: csf  reason: default package */
public final class csf extends bsf {
    public final /* synthetic */ ts a;
    public final /* synthetic */ dsf b;

    public csf(dsf dsf, ts tsVar) {
        this.b = dsf;
        this.a = tsVar;
    }

    public final void c(yrf yrf) {
        ((ArrayList) this.a.get(this.b.b)).remove(yrf);
        yrf.D(this);
    }
}
