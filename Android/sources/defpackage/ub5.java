package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: ub5  reason: default package */
public final class ub5 {
    public final Context a;
    public final b7f b;
    public final s2f c;
    public final s2f d;
    public s2f e;
    public s2f f;
    public final s2f g;
    public final yi6 h;
    public final Looper i;
    public final h30 j;
    public final int k;
    public final boolean l;
    public final tnd m;
    public final qg4 n;
    public final long o;
    public boolean p;

    public ub5(Context context, ebf ebf) {
        ch4 ch4 = new ch4(5, ebf);
        tb5 tb5 = new tb5(context, 2);
        tb5 tb52 = new tb5(context, 3);
        ad3 ad3 = new ad3(3);
        tb5 tb53 = new tb5(context, 6);
        lw4 lw4 = new lw4(8);
        this.a = context;
        this.c = ch4;
        this.d = tb5;
        this.e = tb52;
        this.f = ad3;
        this.g = tb53;
        this.h = lw4;
        int i2 = t0g.a;
        Looper myLooper = Looper.myLooper();
        this.i = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.j = h30.x;
        this.k = 1;
        this.l = true;
        this.m = tnd.c;
        this.n = new qg4(0, t0g.D(20), 0.999f, t0g.D(500));
        this.b = b7f.a;
        this.o = 2000;
    }
}
