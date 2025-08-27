package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: bn5  reason: default package */
public final /* synthetic */ class bn5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    public /* synthetic */ bn5(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = z;
        this.v = obj3;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((dn5) this.c).a((rz9) ((ced) this.o), this.b, (oz9) ((gha) this.v));
                return;
            case 1:
                ((do1) this.c).b(this.o);
                if (this.b) {
                    ((zz7) this.v).cancel(true);
                    return;
                }
                return;
            case 2:
                ((ef) this.c).j((ex8) this.o, (ni0) this.v, this.b);
                return;
            default:
                iy8 iy8 = (iy8) ((he) this.c).o;
                ypb ypb = iy8.w.s;
                kne.M(ypb, (dx8) this.o);
                int playbackState = ypb.getPlaybackState();
                if (playbackState == 1) {
                    if (ypb.J0(2)) {
                        ypb.prepare();
                    }
                } else if (playbackState == 4 && ypb.J0(4)) {
                    ypb.A();
                }
                boolean z = this.b;
                if (z && ypb.J0(1)) {
                    ypb.play();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int append : new int[]{31, 2}) {
                    n79.n(!false);
                    sparseBooleanArray.append(append, true);
                }
                if (z) {
                    n79.n(!false);
                    sparseBooleanArray.append(1, true);
                }
                n79.n(!false);
                iy8.w.p((cx8) this.v);
                return;
        }
    }

    public /* synthetic */ bn5(ef efVar, ex8 ex8, ni0 ni0, boolean z) {
        this.a = 2;
        this.c = efVar;
        this.o = ex8;
        this.v = ni0;
        this.b = z;
    }

    public /* synthetic */ bn5(do1 do1, go1 go1) {
        this.a = 1;
        this.c = do1;
        this.o = null;
        this.b = true;
        this.v = go1;
    }
}
