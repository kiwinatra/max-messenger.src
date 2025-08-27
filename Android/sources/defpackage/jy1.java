package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* renamed from: jy1  reason: default package */
public final class jy1 {
    public static final boolean[] A = {false, false, false, true, true, true, false};
    public static final int[] B;
    public static final int[] C = {0, 1, 2, 3, 4, 3, 4};
    public static final int[] D = {0, 0, 0, 0, 0, 3, 3};
    public static final int[] E;
    public static final int v = c(2, 2, 2, 0);
    public static final int w;
    public static final int[] x = {0, 0, 0, 0, 0, 2, 0};
    public static final int[] y = {0, 0, 0, 0, 0, 0, 2};
    public static final int[] z = {3, 3, 3, 3, 3, 3, 1};
    public final ArrayList a = new ArrayList();
    public final SpannableStringBuilder b = new SpannableStringBuilder();
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    static {
        int c2 = c(0, 0, 0, 0);
        w = c2;
        int c3 = c(0, 0, 0, 3);
        int i2 = c2;
        int i3 = c2;
        B = new int[]{c2, c3, i2, i3, c3, c2, c2};
        E = new int[]{c2, c2, i2, i3, c2, c3, c3};
    }

    public jy1() {
        d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            defpackage.n79.i(r4, r0)
            defpackage.n79.i(r5, r0)
            defpackage.n79.i(r6, r0)
            defpackage.n79.i(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L_0x001b
            if (r7 == r1) goto L_0x001b
            r3 = 2
            if (r7 == r3) goto L_0x001f
            r3 = 3
            if (r7 == r3) goto L_0x001d
        L_0x001b:
            r7 = r2
            goto L_0x0021
        L_0x001d:
            r7 = r0
            goto L_0x0021
        L_0x001f:
            r7 = 127(0x7f, float:1.78E-43)
        L_0x0021:
            if (r4 <= r1) goto L_0x0025
            r4 = r2
            goto L_0x0026
        L_0x0025:
            r4 = r0
        L_0x0026:
            if (r5 <= r1) goto L_0x002a
            r5 = r2
            goto L_0x002b
        L_0x002a:
            r5 = r0
        L_0x002b:
            if (r6 <= r1) goto L_0x002e
            r0 = r2
        L_0x002e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy1.c(int, int, int, int):int");
    }

    public final void a(char c2) {
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (c2 == 10) {
            ArrayList arrayList = this.a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.o != -1) {
                this.o = 0;
            }
            if (this.p != -1) {
                this.p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.s != -1) {
                this.s = 0;
            }
            while (true) {
                if (arrayList.size() >= this.j || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
                    this.u = arrayList.size();
                    return;
                }
            }
        } else {
            spannableStringBuilder.append(c2);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.o, length, 33);
            }
            if (this.p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, length, 33);
            }
            if (this.q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, length, 33);
            }
            if (this.s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.a.clear();
        this.b.clear();
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.s = -1;
        this.u = 0;
        this.c = false;
        this.d = false;
        this.e = 4;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 15;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        int i2 = w;
        this.n = i2;
        this.r = v;
        this.t = i2;
    }

    public final void e(boolean z2, boolean z3) {
        int i2 = this.o;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (i2 != -1) {
            if (!z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.o, spannableStringBuilder.length(), 33);
                this.o = -1;
            }
        } else if (z2) {
            this.o = spannableStringBuilder.length();
        }
        if (this.p != -1) {
            if (!z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, spannableStringBuilder.length(), 33);
                this.p = -1;
            }
        } else if (z3) {
            this.p = spannableStringBuilder.length();
        }
    }

    public final void f(int i2, int i3) {
        int i4 = this.q;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (!(i4 == -1 || this.r == i2)) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, spannableStringBuilder.length(), 33);
        }
        if (i2 != v) {
            this.q = spannableStringBuilder.length();
            this.r = i2;
        }
        if (!(this.s == -1 || this.t == i3)) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, spannableStringBuilder.length(), 33);
        }
        if (i3 != w) {
            this.s = spannableStringBuilder.length();
            this.t = i3;
        }
    }
}
