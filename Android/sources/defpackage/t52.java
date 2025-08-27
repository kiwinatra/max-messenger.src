package defpackage;

import android.content.Context;

/* renamed from: t52  reason: default package */
public final /* synthetic */ class t52 implements osb, u2f {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t52(r62 r62, boolean z, boolean z2) {
        this.c = r62;
        this.a = z;
        this.b = z2;
    }

    public Object get() {
        return ghf.g((Context) this.c, this.a, this.b);
    }

    public boolean test(Object obj) {
        a32 a32 = (a32) obj;
        r62 r62 = (r62) this.c;
        r62.getClass();
        int i = a32.b.m;
        boolean z = this.a;
        return (i > 0 || (z && a32.j0())) && (this.b || !a32.X(((ltb) r62.n).a) || a32.C()) && !a32.H() && ((a32.f0() && a32.i0()) || (z && a32.j0()));
    }

    public /* synthetic */ t52(Context context, boolean z) {
        this.c = context;
        this.a = z;
        this.b = true;
    }
}
