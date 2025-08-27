package defpackage;

import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import ru.ok.messages.calls.views.CallGridView;

/* renamed from: l61  reason: default package */
public final class l61 extends fw7 {
    public h5b f;
    public h5b g;
    public final int h = 8388611;
    public boolean i = false;
    public final j61 j;
    public RecyclerView k;

    public l61(j61 j61) {
        this.j = j61;
    }

    public static void k(l61 l61) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView = l61.k;
        if (recyclerView != null && (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) != null) {
            int S0 = linearLayoutManager.S0();
            int W0 = linearLayoutManager.W0();
            if (S0 != -1 && W0 != -1) {
                CallGridView callGridView = (CallGridView) l61.j;
                callGridView.getClass();
                z68.c("ru.ok.messages.calls.views.CallGridView", "onSnapFinished: firstVisible: %s, lastVisible: %s", Integer.valueOf(S0), Integer.valueOf(W0));
                callGridView.v.d(new Pair(Integer.valueOf(S0), Integer.valueOf(W0)));
                callGridView.b.getAdapterController();
                throw null;
            }
        }
    }

    public final void a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.i = false;
        }
        super.a(recyclerView);
        this.k = recyclerView;
        recyclerView.m(new k61(0, this));
    }

    public final int[] b(a aVar, View view) {
        int[] iArr = new int[2];
        boolean e = aVar.e();
        int i2 = this.h;
        if (!e) {
            iArr[0] = 0;
        } else if (i2 == 8388611) {
            if (this.g == null) {
                this.g = new h5b(aVar, 0);
            }
            h5b h5b = this.g;
            iArr[0] = this.i ? l(view, h5b) : h5b.f(view) - h5b.m();
        } else {
            if (this.g == null) {
                this.g = new h5b(aVar, 0);
            }
            iArr[0] = l(view, this.g);
        }
        if (!aVar.f()) {
            iArr[1] = 0;
        } else if (i2 == 48) {
            if (this.f == null) {
                this.f = new h5b(aVar, 1);
            }
            h5b h5b2 = this.f;
            iArr[1] = this.i ? l(view, h5b2) : h5b2.f(view) - h5b2.m();
        } else {
            if (this.f == null) {
                this.f = new h5b(aVar, 1);
            }
            iArr[1] = l(view, this.f);
        }
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        r2 = r3.r((r1 = androidx.recyclerview.widget.a.M(r0)) + (r2 = r1 % r2));
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View d(androidx.recyclerview.widget.a r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x0065
            int r0 = r2.h
            r1 = 48
            if (r0 == r1) goto L_0x0052
            r1 = 80
            if (r0 == r1) goto L_0x003f
            r1 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 == r1) goto L_0x002c
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 == r1) goto L_0x0019
            goto L_0x0065
        L_0x0019:
            h5b r0 = r2.g
            if (r0 != 0) goto L_0x0025
            h5b r0 = new h5b
            r1 = 0
            r0.<init>(r3, r1)
            r2.g = r0
        L_0x0025:
            h5b r0 = r2.g
            android.view.View r0 = r2.m(r3, r0)
            goto L_0x0069
        L_0x002c:
            h5b r0 = r2.g
            if (r0 != 0) goto L_0x0038
            h5b r0 = new h5b
            r1 = 0
            r0.<init>(r3, r1)
            r2.g = r0
        L_0x0038:
            h5b r0 = r2.g
            android.view.View r0 = r2.n(r3, r0)
            goto L_0x0069
        L_0x003f:
            h5b r0 = r2.f
            if (r0 != 0) goto L_0x004b
            h5b r0 = new h5b
            r1 = 1
            r0.<init>(r3, r1)
            r2.f = r0
        L_0x004b:
            h5b r0 = r2.f
            android.view.View r0 = r2.m(r3, r0)
            goto L_0x0069
        L_0x0052:
            h5b r0 = r2.f
            if (r0 != 0) goto L_0x005e
            h5b r0 = new h5b
            r1 = 1
            r0.<init>(r3, r1)
            r2.f = r0
        L_0x005e:
            h5b r0 = r2.f
            android.view.View r0 = r2.n(r3, r0)
            goto L_0x0069
        L_0x0065:
            android.view.View r0 = super.d(r3)
        L_0x0069:
            if (r0 != 0) goto L_0x006d
            r2 = 0
            return r2
        L_0x006d:
            j61 r2 = r2.j
            int r2 = r2.getSpanCount()
            r1 = 1
            if (r2 != r1) goto L_0x0077
            return r0
        L_0x0077:
            int r1 = androidx.recyclerview.widget.a.M(r0)
            int r2 = r1 % r2
            if (r2 != 0) goto L_0x0080
            return r0
        L_0x0080:
            int r1 = r1 + r2
            android.view.View r2 = r3.r(r1)
            if (r2 == 0) goto L_0x0088
            return r2
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l61.d(androidx.recyclerview.widget.a):android.view.View");
    }

    public final int l(View view, vo7 vo7) {
        int c;
        int h2;
        if (this.i) {
            c = vo7.f(view);
            h2 = vo7.m();
        } else {
            c = vo7.c(view);
            h2 = vo7.h();
        }
        return c - h2;
    }

    public final View m(a aVar, vo7 vo7) {
        if (!(aVar instanceof LinearLayoutManager)) {
            return super.d(aVar);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) aVar;
        int X0 = linearLayoutManager.X0();
        if (X0 == -1) {
            return null;
        }
        View r = aVar.r(X0);
        if ((vo7.d(r) / 2) + vo7.f(r) <= vo7.n()) {
            return r;
        }
        if (linearLayoutManager.S0() == 0) {
            return null;
        }
        return aVar.r(X0 - 1);
    }

    public final View n(a aVar, vo7 vo7) {
        if (!(aVar instanceof LinearLayoutManager)) {
            return super.d(aVar);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) aVar;
        int V0 = linearLayoutManager.V0();
        if (V0 == -1) {
            return null;
        }
        View r = aVar.r(V0);
        if (vo7.c(r) >= vo7.d(r) / 2 && vo7.c(r) > 0) {
            return r;
        }
        if (linearLayoutManager.W0() == aVar.G() - 1) {
            return null;
        }
        return aVar.r(V0 + 1);
    }
}
