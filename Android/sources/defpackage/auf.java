package defpackage;

import android.text.Layout;

/* renamed from: auf  reason: default package */
public final class auf {
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
    public jff r;
    public float s = Float.MAX_VALUE;

    public final void a(auf auf) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (auf != null) {
            if (!this.c && auf.c) {
                this.b = auf.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = auf.h;
            }
            if (this.i == -1) {
                this.i = auf.i;
            }
            if (this.a == null && (str = auf.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = auf.f;
            }
            if (this.g == -1) {
                this.g = auf.g;
            }
            if (this.n == -1) {
                this.n = auf.n;
            }
            if (this.o == null && (alignment2 = auf.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = auf.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = auf.q;
            }
            if (this.j == -1) {
                this.j = auf.j;
                this.k = auf.k;
            }
            if (this.r == null) {
                this.r = auf.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = auf.s;
            }
            if (!this.e && auf.e) {
                this.d = auf.d;
                this.e = true;
            }
            if (this.m == -1 && (i2 = auf.m) != -1) {
                this.m = i2;
            }
        }
    }
}
