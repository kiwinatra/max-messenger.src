package defpackage;

import android.os.Bundle;

/* renamed from: c0d  reason: default package */
public final class c0d extends hw8 implements zzc {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public yzc f;
    public int g;
    public final /* synthetic */ d0d h;

    public c0d(d0d d0d, String str, String str2) {
        this.h = d0d;
        this.a = str;
        this.b = str2;
    }

    public final int a() {
        return this.g;
    }

    public final void b(yzc yzc) {
        this.f = yzc;
        int i = yzc.e;
        yzc.e = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i2 = yzc.d;
        yzc.d = i2 + 1;
        yzc.b(3, i2, i, (Bundle) null, bundle);
        this.g = i;
        if (this.c) {
            yzc.a(i);
            int i3 = this.d;
            if (i3 >= 0) {
                yzc.c(this.g, i3);
                this.d = -1;
            }
            int i4 = this.e;
            if (i4 != 0) {
                yzc.d(this.g, i4);
                this.e = 0;
            }
        }
    }

    public final void c() {
        yzc yzc = this.f;
        if (yzc != null) {
            int i = this.g;
            int i2 = yzc.d;
            yzc.d = i2 + 1;
            yzc.b(4, i2, i, (Bundle) null, (Bundle) null);
            this.f = null;
            this.g = 0;
        }
    }

    public final void d() {
        d0d d0d = this.h;
        d0d.Y.remove(this);
        c();
        d0d.m();
    }

    public final void e() {
        this.c = true;
        yzc yzc = this.f;
        if (yzc != null) {
            yzc.a(this.g);
        }
    }

    public final void f(int i) {
        yzc yzc = this.f;
        if (yzc != null) {
            yzc.c(this.g, i);
            return;
        }
        this.d = i;
        this.e = 0;
    }

    public final void g() {
        h(0);
    }

    public final void h(int i) {
        this.c = false;
        yzc yzc = this.f;
        if (yzc != null) {
            int i2 = this.g;
            Bundle g2 = wj6.g(i, "unselectReason");
            int i3 = yzc.d;
            yzc.d = i3 + 1;
            yzc.b(6, i3, i2, (Bundle) null, g2);
        }
    }

    public final void i(int i) {
        yzc yzc = this.f;
        if (yzc != null) {
            yzc.d(this.g, i);
        } else {
            this.e += i;
        }
    }
}
