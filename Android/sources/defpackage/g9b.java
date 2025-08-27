package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: g9b  reason: default package */
public final class g9b implements jf1 {
    public final /* synthetic */ int a;
    public final Object b;

    public g9b() {
        this.a = 0;
        this.b = new CopyOnWriteArraySet();
    }

    private final void a(gf1 gf1) {
    }

    private final void b(hf1 hf1) {
    }

    private final void c(if1 if1) {
    }

    public final void onCallParticipantsAdded(ff1 ff1) {
        switch (this.a) {
            case 0:
                if (!ff1.b.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((jf1) it.next()).onCallParticipantsAdded(ff1);
                    }
                    return;
                }
                return;
            default:
                wsb wsb = (wsb) this.b;
                if (!((hz0) wsb.a).s() && !((hz0) wsb.a).n1.i().isEmpty()) {
                    hz0 hz0 = (hz0) wsb.a;
                    hz0.B(hz0.w1.f);
                    return;
                }
                return;
        }
    }

    public final void onCallParticipantsChanged(gf1 gf1) {
        switch (this.a) {
            case 0:
                if (!gf1.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((jf1) it.next()).onCallParticipantsChanged(gf1);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onCallParticipantsDeAnonimized(hf1 hf1) {
        switch (this.a) {
            case 0:
                if (!hf1.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((jf1) it.next()).onCallParticipantsDeAnonimized(hf1);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onCallParticipantsRemoved(if1 if1) {
        switch (this.a) {
            case 0:
                if (!if1.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((jf1) it.next()).onCallParticipantsRemoved(if1);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public g9b(wsb wsb) {
        this.a = 1;
        this.b = wsb;
    }
}
