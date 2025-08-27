package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* renamed from: awb  reason: default package */
public final class awb {
    public final ContentResolver a;
    public final Resources b;
    public final AssetManager c;
    public final qp6 d;
    public final e97 e;
    public final d6a f;
    public final nt4 g;
    public final boolean h;
    public final boolean i = false;
    public final ma5 j;
    public final p7d k;
    public final r2f l;
    public final z59 m;
    public final z59 n;
    public final cd4 o;
    public final ynb p;
    public final b8d q;
    public final int r;
    public final boolean s;

    public awb(Context context, qp6 qp6, e97 e97, d6a d6a, nt4 nt4, boolean z, ma5 ma5, p7d p7d, zqd zqd, zqd zqd2, r2f r2f, cd4 cd4, ynb ynb, int i2, b8d b8d) {
        this.a = context.getApplicationContext().getContentResolver();
        this.b = context.getApplicationContext().getResources();
        this.c = context.getApplicationContext().getAssets();
        this.d = qp6;
        this.e = e97;
        this.f = d6a;
        this.g = nt4;
        this.h = z;
        this.j = ma5;
        this.k = p7d;
        this.n = zqd;
        this.m = zqd2;
        this.l = r2f;
        this.o = cd4;
        this.p = ynb;
        new sq6();
        new sq6();
        this.r = i2;
        this.q = b8d;
        this.s = false;
    }

    public final w94 a(xvb xvb) {
        return new w94(this.d, this.j.a(), this.e, this.f, this.g, this.h, this.i, xvb, this.r, this.q);
    }

    public final u3d b(xvb xvb, boolean z, ta7 ta7) {
        return new u3d(this.j.c(), this.k, xvb, z, ta7);
    }
}
