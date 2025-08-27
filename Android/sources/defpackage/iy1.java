package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* renamed from: iy1  reason: default package */
public final class iy1 {
    public static final int[] A = {3, 3, 3, 3, 3, 3, 1};
    public static final boolean[] B = {false, false, false, true, true, true, false};
    public static final int[] C;
    public static final int[] D = {0, 1, 2, 3, 4, 3, 4};
    public static final int[] E = {0, 0, 0, 0, 0, 3, 3};
    public static final int[] F;
    public static final int w = c(2, 2, 2, 0);
    public static final int x;
    public static final int[] y = {0, 0, 0, 0, 0, 2, 0};
    public static final int[] z = {0, 0, 0, 0, 0, 0, 2};
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
    public boolean k;
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
    public int v;

    static {
        int c2 = c(0, 0, 0, 0);
        x = c2;
        int c3 = c(0, 0, 0, 3);
        int i2 = c2;
        int i3 = c2;
        C = new int[]{c2, c3, i2, i3, c3, c2, c2};
        F = new int[]{c2, c2, i2, i3, c2, c3, c3};
    }

    public iy1() {
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
            defpackage.y64.i(r4, r0)
            defpackage.y64.i(r5, r0)
            defpackage.y64.i(r6, r0)
            defpackage.y64.i(r7, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy1.c(int, int, int, int):int");
    }

    public final void a(char c2) {
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (c2 == 10) {
            ArrayList arrayList = this.a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.p != -1) {
                this.p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.r != -1) {
                this.r = 0;
            }
            if (this.t != -1) {
                this.t = 0;
            }
            while (true) {
                if ((this.k && arrayList.size() >= this.j) || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
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
            if (this.p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
            }
            if (this.q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
            }
            if (this.r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
            }
            if (this.t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.a.clear();
        this.b.clear();
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.t = -1;
        this.v = 0;
        this.c = false;
        this.d = false;
        this.e = 4;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 15;
        this.k = true;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        int i2 = x;
        this.o = i2;
        this.s = w;
        this.u = i2;
    }

    public final void e(boolean z2, boolean z3) {
        int i2 = this.p;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (i2 != -1) {
            if (!z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.p, spannableStringBuilder.length(), 33);
                this.p = -1;
            }
        } else if (z2) {
            this.p = spannableStringBuilder.length();
        }
        if (this.q != -1) {
            if (!z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, spannableStringBuilder.length(), 33);
                this.q = -1;
            }
        } else if (z3) {
            this.q = spannableStringBuilder.length();
        }
    }

    public final void f(int i2, int i3) {
        int i4 = this.r;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (!(i4 == -1 || this.s == i2)) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, spannableStringBuilder.length(), 33);
        }
        if (i2 != w) {
            this.r = spannableStringBuilder.length();
            this.s = i2;
        }
        if (!(this.t == -1 || this.u == i3)) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, spannableStringBuilder.length(), 33);
        }
        if (i3 != x) {
            this.t = spannableStringBuilder.length();
            this.u = i3;
        }
    }
}
