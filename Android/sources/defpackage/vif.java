package defpackage;

import android.util.Pair;

/* renamed from: vif  reason: default package */
public final class vif extends hl4 {
    public final /* synthetic */ wif c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vif(wif wif, zi0 zi0) {
        super(zi0);
        this.c = wif;
    }

    public final void d() {
        this.b.c();
        m();
    }

    public final void f(Throwable th) {
        this.b.e(th);
        m();
    }

    public final void h(int i, Object obj) {
        this.b.g(i, obj);
        if (zi0.a(i)) {
            m();
        }
    }

    public final void m() {
        Pair pair;
        synchronized (this.c) {
            try {
                pair = (Pair) this.c.c.poll();
                if (pair == null) {
                    wif wif = this.c;
                    wif.b--;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (pair != null) {
            this.c.d.execute(new uj6((Object) this, (Object) pair, false, 26));
        }
    }
}
