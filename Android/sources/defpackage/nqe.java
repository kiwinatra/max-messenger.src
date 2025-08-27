package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: nqe  reason: default package */
public final class nqe {
    public long a = -1;
    public boolean b;
    public Object c = new ArrayList();
    public Object d;
    public Object e;
    public Object f = new nmf(this);

    public void a() {
        if (this.b) {
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                ((ecg) it.next()).b();
            }
            this.b = false;
        }
    }

    public void b() {
        View view;
        if (!this.b) {
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                ecg ecg = (ecg) it.next();
                long j = this.a;
                if (j >= 0) {
                    ecg.c(j);
                }
                Interpolator interpolator = (Interpolator) this.d;
                if (!(interpolator == null || (view = (View) ecg.a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (((fcg) this.e) != null) {
                    ecg.d((nmf) this.f);
                }
                View view2 = (View) ecg.a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.b = true;
        }
    }
}
