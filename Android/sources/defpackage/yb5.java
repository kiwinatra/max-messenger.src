package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: yb5  reason: default package */
public final class yb5 implements t1d {
    public final jz2 a = new jz2(15);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final e43 e;
    public final int f;
    public final ut g;

    public yb5(boolean z, boolean z2, boolean z3, o5h o5h, int i, ut utVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = o5h;
        this.f = i;
        this.g = utVar;
    }

    public final pk0[] a(Handler handler, nc5 nc5, nc5 nc52, nc5 nc53, nc5 nc54) {
        ArrayList arrayList = new ArrayList();
        boolean z = this.b;
        e43 e43 = this.e;
        if (!z) {
            arrayList.add(new gb5((o5h) e43, this.a, this.g));
        }
        if (!this.c) {
            int i = this.f;
            arrayList.add(new ib5(this.d, (o5h) e43, i, this.a, this.g));
        }
        return (pk0[]) arrayList.toArray(new pk0[arrayList.size()]);
    }
}
