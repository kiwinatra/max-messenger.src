package defpackage;

import java.util.Iterator;

/* renamed from: vug  reason: default package */
public final /* synthetic */ class vug implements Runnable {
    public final /* synthetic */ syc a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ vug(syc syc, boolean z, boolean z2) {
        this.a = syc;
        this.b = z;
        this.c = z2;
    }

    public final void run() {
        syc syc = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        voc voc = ((v48) syc.b).n;
        voc.log("OKRTCLmsAdapter", "capture state changed, isCapturing=" + z + ", isFailedStart=" + z2);
        mt1 mt1 = ((v48) syc.b).r;
        if (mt1 != null) {
            if (z) {
                Iterator it = mt1.f.iterator();
                while (it.hasNext()) {
                    ((v48) it.next()).getClass();
                }
            } else if (!z2) {
                mt1.b();
            } else {
                return;
            }
        }
        ykb ykb = ((v48) syc.b).x;
        if (ykb != null) {
            ((hz0) ykb.b).k(b51.x, Boolean.valueOf(z));
        }
        v48 v48 = (v48) syc.b;
        Iterator it2 = v48.c.iterator();
        while (it2.hasNext()) {
            ((x48) it2.next()).b(v48);
        }
    }
}
