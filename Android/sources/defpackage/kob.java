package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: kob  reason: default package */
public final class kob {
    public final ArrayList a = new ArrayList();
    public int b;
    public long c;
    public long d;
    public float e;
    public long f;
    public int g;
    public CharSequence h;
    public long i;
    public long j = -1;
    public Bundle k;

    public final void a(lob lob) {
        this.a.add(lob);
    }

    public final mob b() {
        return new mob(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.j, this.k);
    }

    public final void c(long j2) {
        this.f = j2;
    }

    public final void d(long j2) {
        this.j = j2;
    }

    public final void e(long j2) {
        this.d = j2;
    }

    public final void f(int i2, String str) {
        this.g = i2;
        this.h = str;
    }

    public final void g(Bundle bundle) {
        this.k = bundle;
    }

    public final void h(int i2, long j2, float f2, long j3) {
        this.b = i2;
        this.c = j2;
        this.i = j3;
        this.e = f2;
    }
}
