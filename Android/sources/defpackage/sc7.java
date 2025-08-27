package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.List;

/* renamed from: sc7  reason: default package */
public final /* synthetic */ class sc7 implements ima, lma, hma {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc7 b;

    public /* synthetic */ sc7(tc7 tc7, int i) {
        this.a = i;
        this.b = tc7;
    }

    public void onFailure(Exception exc) {
        if (this.b.d != null) {
            xc7 xc7 = xc7.a;
            o9a.q();
        }
    }

    public void q(Task task) {
        tc7 tc7 = this.b;
        switch (this.a) {
            case 0:
                if (task.h()) {
                    tc7.c = (f5d) task.f();
                    return;
                }
                return;
            default:
                if (tc7.d != null) {
                    xc7 xc7 = xc7.a;
                    qc7 r = qra.a.r();
                    if (r != null) {
                        List list = qc7.p;
                        r.c(xc7, (Integer) null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void r() {
        if (this.b.d != null) {
            xc7 xc7 = xc7.a;
            o9a.q();
        }
    }
}
