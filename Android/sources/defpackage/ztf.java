package defpackage;

import android.text.Layout;

/* renamed from: ztf  reason: default package */
public final class ztf {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public float k;
    public String l;
    public int m = -1;
    public int n = -1;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public int q = -1;
    public iff r;
    public float s = Float.MAX_VALUE;

    public final void a(ztf ztf) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ztf != null) {
            if (!this.c && ztf.c) {
                this.b = ztf.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = ztf.h;
            }
            if (this.i == -1) {
                this.i = ztf.i;
            }
            if (this.a == null && (str = ztf.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = ztf.f;
            }
            if (this.g == -1) {
                this.g = ztf.g;
            }
            if (this.n == -1) {
                this.n = ztf.n;
            }
            if (this.o == null && (alignment2 = ztf.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = ztf.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = ztf.q;
            }
            if (this.j == -1) {
                this.j = ztf.j;
                this.k = ztf.k;
            }
            if (this.r == null) {
                this.r = ztf.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = ztf.s;
            }
            if (!this.e && ztf.e) {
                this.d = ztf.d;
                this.e = true;
            }
            if (this.m == -1 && (i2 = ztf.m) != -1) {
                this.m = i2;
            }
        }
    }
}
