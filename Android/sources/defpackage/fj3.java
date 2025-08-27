package defpackage;

import android.view.ViewGroup;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: fj3  reason: default package */
public final class fj3 extends ViewGroup.MarginLayoutParams {
    public int A = IntCompanionObject.MIN_VALUE;
    public int B = IntCompanionObject.MIN_VALUE;
    public int C = IntCompanionObject.MIN_VALUE;
    public int D = 0;
    public float E = 0.5f;
    public float F = 0.5f;
    public String G = null;
    public float H = -1.0f;
    public float I = -1.0f;
    public int J = 0;
    public int K = 0;
    public int L = 0;
    public int M = 0;
    public int N = 0;
    public int O = 0;
    public int P = 0;
    public int Q = 0;
    public float R = 1.0f;
    public float S = 1.0f;
    public int T = -1;
    public int U = -1;
    public int V = -1;
    public boolean W = false;
    public boolean X = false;
    public String Y = null;
    public int Z = 0;
    public int a = -1;
    public boolean a0 = true;
    public int b = -1;
    public boolean b0 = true;
    public float c = -1.0f;
    public boolean c0 = false;
    public boolean d = true;
    public boolean d0 = false;
    public int e = -1;
    public boolean e0 = false;
    public int f = -1;
    public int f0 = -1;
    public int g = -1;
    public int g0 = -1;
    public int h = -1;
    public int h0 = -1;
    public int i = -1;
    public int i0 = -1;
    public int j = -1;
    public int j0 = IntCompanionObject.MIN_VALUE;
    public int k = -1;
    public int k0 = IntCompanionObject.MIN_VALUE;
    public int l = -1;
    public float l0 = 0.5f;
    public int m = -1;
    public int m0;
    public int n = -1;
    public int n0;
    public int o = -1;
    public float o0;
    public int p = -1;
    public tj3 p0 = new tj3();
    public int q = 0;
    public float r = c44.DEFAULT_ASPECT_RATIO;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public int w = IntCompanionObject.MIN_VALUE;
    public int x = IntCompanionObject.MIN_VALUE;
    public int y = IntCompanionObject.MIN_VALUE;
    public int z = IntCompanionObject.MIN_VALUE;

    public fj3(int i2, int i3) {
        super(i2, i3);
    }

    public final void a() {
        this.d0 = false;
        this.a0 = true;
        this.b0 = true;
        int i2 = this.width;
        if (i2 == -2 && this.W) {
            this.a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i3 = this.height;
        if (i3 == -2 && this.X) {
            this.b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.a0 = false;
            if (i2 == 0 && this.L == 1) {
                this.width = -2;
                this.W = true;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.b0 = false;
            if (i3 == 0 && this.M == 1) {
                this.height = -2;
                this.X = true;
            }
        }
        if (this.c != -1.0f || this.a != -1 || this.b != -1) {
            this.d0 = true;
            this.a0 = true;
            this.b0 = true;
            if (!(this.p0 instanceof iv6)) {
                this.p0 = new iv6();
            }
            ((iv6) this.p0).S(this.V);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resolveLayoutDirection(int r11) {
        /*
            r10 = this;
            int r0 = r10.leftMargin
            int r1 = r10.rightMargin
            super.resolveLayoutDirection(r11)
            int r11 = r10.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r3 != r11) goto L_0x0011
            r11 = r3
            goto L_0x0012
        L_0x0011:
            r11 = r2
        L_0x0012:
            r4 = -1
            r10.h0 = r4
            r10.i0 = r4
            r10.f0 = r4
            r10.g0 = r4
            int r5 = r10.w
            r10.j0 = r5
            int r5 = r10.y
            r10.k0 = r5
            float r5 = r10.E
            r10.l0 = r5
            int r6 = r10.a
            r10.m0 = r6
            int r7 = r10.b
            r10.n0 = r7
            float r8 = r10.c
            r10.o0 = r8
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x0094
            int r11 = r10.s
            if (r11 == r4) goto L_0x003f
            r10.h0 = r11
        L_0x003d:
            r2 = r3
            goto L_0x0046
        L_0x003f:
            int r11 = r10.t
            if (r11 == r4) goto L_0x0046
            r10.i0 = r11
            goto L_0x003d
        L_0x0046:
            int r11 = r10.u
            if (r11 == r4) goto L_0x004d
            r10.g0 = r11
            r2 = r3
        L_0x004d:
            int r11 = r10.v
            if (r11 == r4) goto L_0x0054
            r10.f0 = r11
            r2 = r3
        L_0x0054:
            int r11 = r10.A
            if (r11 == r9) goto L_0x005a
            r10.k0 = r11
        L_0x005a:
            int r11 = r10.B
            if (r11 == r9) goto L_0x0060
            r10.j0 = r11
        L_0x0060:
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0068
            float r2 = r11 - r5
            r10.l0 = r2
        L_0x0068:
            boolean r2 = r10.d0
            if (r2 == 0) goto L_0x00b8
            int r2 = r10.V
            if (r2 != r3) goto L_0x00b8
            boolean r2 = r10.d
            if (r2 == 0) goto L_0x00b8
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0082
            float r11 = r11 - r8
            r10.o0 = r11
            r10.m0 = r4
            r10.n0 = r4
            goto L_0x00b8
        L_0x0082:
            if (r6 == r4) goto L_0x008b
            r10.n0 = r6
            r10.m0 = r4
            r10.o0 = r2
            goto L_0x00b8
        L_0x008b:
            if (r7 == r4) goto L_0x00b8
            r10.m0 = r7
            r10.n0 = r4
            r10.o0 = r2
            goto L_0x00b8
        L_0x0094:
            int r11 = r10.s
            if (r11 == r4) goto L_0x009a
            r10.g0 = r11
        L_0x009a:
            int r11 = r10.t
            if (r11 == r4) goto L_0x00a0
            r10.f0 = r11
        L_0x00a0:
            int r11 = r10.u
            if (r11 == r4) goto L_0x00a6
            r10.h0 = r11
        L_0x00a6:
            int r11 = r10.v
            if (r11 == r4) goto L_0x00ac
            r10.i0 = r11
        L_0x00ac:
            int r11 = r10.A
            if (r11 == r9) goto L_0x00b2
            r10.j0 = r11
        L_0x00b2:
            int r11 = r10.B
            if (r11 == r9) goto L_0x00b8
            r10.k0 = r11
        L_0x00b8:
            int r11 = r10.u
            if (r11 != r4) goto L_0x0102
            int r11 = r10.v
            if (r11 != r4) goto L_0x0102
            int r11 = r10.t
            if (r11 != r4) goto L_0x0102
            int r11 = r10.s
            if (r11 != r4) goto L_0x0102
            int r11 = r10.g
            if (r11 == r4) goto L_0x00d7
            r10.h0 = r11
            int r11 = r10.rightMargin
            if (r11 > 0) goto L_0x00e5
            if (r1 <= 0) goto L_0x00e5
            r10.rightMargin = r1
            goto L_0x00e5
        L_0x00d7:
            int r11 = r10.h
            if (r11 == r4) goto L_0x00e5
            r10.i0 = r11
            int r11 = r10.rightMargin
            if (r11 > 0) goto L_0x00e5
            if (r1 <= 0) goto L_0x00e5
            r10.rightMargin = r1
        L_0x00e5:
            int r11 = r10.e
            if (r11 == r4) goto L_0x00f4
            r10.f0 = r11
            int r11 = r10.leftMargin
            if (r11 > 0) goto L_0x0102
            if (r0 <= 0) goto L_0x0102
            r10.leftMargin = r0
            goto L_0x0102
        L_0x00f4:
            int r11 = r10.f
            if (r11 == r4) goto L_0x0102
            r10.g0 = r11
            int r11 = r10.leftMargin
            if (r11 > 0) goto L_0x0102
            if (r0 <= 0) goto L_0x0102
            r10.leftMargin = r0
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj3.resolveLayoutDirection(int):void");
    }
}
