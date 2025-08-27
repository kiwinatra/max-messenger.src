package defpackage;

/* renamed from: xy0  reason: default package */
public final /* synthetic */ class xy0 implements Runnable {
    public final /* synthetic */ hz0 a;
    public final /* synthetic */ baa b;
    public final /* synthetic */ t6e c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ String w;

    public /* synthetic */ xy0(hz0 hz0, baa baa, t6e t6e, boolean z, boolean z2, String str) {
        this.a = hz0;
        this.b = baa;
        this.c = t6e;
        this.o = z;
        this.v = z2;
        this.w = str;
    }

    public final void run() {
        hz0 hz0 = this.a;
        baa baa = this.b;
        t6e t6e = this.c;
        boolean z = this.o;
        boolean z2 = this.v;
        String str = this.w;
        hz0.getClass();
        Runnable runnable = baa.m;
        t6e.getClass();
        t6e.a.execute(new q6e(t6e, z, 2));
        t6e.d.setPreprocessorParams(z2, baa.e, str, baa.g, baa.h, baa.i, baa.j, baa.k, baa.l, z2 ? new az0(hz0, runnable, 0) : new gc(4));
    }
}
