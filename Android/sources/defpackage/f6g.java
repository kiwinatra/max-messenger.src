package defpackage;

import android.view.Display;
import android.view.Surface;

/* renamed from: f6g  reason: default package */
public final class f6g {
    public final /* synthetic */ int a;
    public boolean b;
    public Surface c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public final Object p;
    public final b6g q;
    public final Object r;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        r5 = (android.hardware.display.DisplayManager) r5.getSystemService("display");
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f6g(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r4.a = r6
            switch(r6) {
                case 1: goto L_0x0070;
                default: goto L_0x0005;
            }
        L_0x0005:
            r4.<init>()
            iq5 r6 = new iq5
            r0 = 0
            r6.<init>(r0)
            hq5 r0 = new hq5
            r1 = 0
            r0.<init>(r1)
            r6.e = r0
            hq5 r0 = new hq5
            r0.<init>(r1)
            r6.f = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.c = r0
            r4.p = r6
            r6 = 0
            if (r5 == 0) goto L_0x0057
            android.content.Context r5 = r5.getApplicationContext()
            int r2 = defpackage.t0g.a
            r3 = 17
            if (r2 < r3) goto L_0x0043
            java.lang.String r2 = "display"
            java.lang.Object r2 = r5.getSystemService(r2)
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            if (r2 == 0) goto L_0x0043
            c6g r3 = new c6g
            r3.<init>(r2)
            goto L_0x0044
        L_0x0043:
            r3 = r6
        L_0x0044:
            if (r3 != 0) goto L_0x0058
            java.lang.String r2 = "window"
            java.lang.Object r5 = r5.getSystemService(r2)
            android.view.WindowManager r5 = (android.view.WindowManager) r5
            if (r5 == 0) goto L_0x0057
            p3a r2 = new p3a
            r2.<init>((java.lang.Object) r5)
            r3 = r2
            goto L_0x0058
        L_0x0057:
            r3 = r6
        L_0x0058:
            r4.q = r3
            if (r3 == 0) goto L_0x005e
            d6g r6 = defpackage.d6g.v
        L_0x005e:
            r4.r = r6
            r4.i = r0
            r4.j = r0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.d = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.g = r5
            r5 = 0
            r4.h = r5
            return
        L_0x0070:
            r4.<init>()
            iq5 r6 = new iq5
            r0 = 1
            r6.<init>(r0)
            hq5 r0 = new hq5
            r1 = 1
            r0.<init>(r1)
            r6.e = r0
            hq5 r0 = new hq5
            r0.<init>(r1)
            r6.f = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.c = r0
            r4.p = r6
            r6 = 0
            if (r5 != 0) goto L_0x0096
        L_0x0094:
            r2 = r6
            goto L_0x00a5
        L_0x0096:
            java.lang.String r2 = "display"
            java.lang.Object r5 = r5.getSystemService(r2)
            android.hardware.display.DisplayManager r5 = (android.hardware.display.DisplayManager) r5
            if (r5 == 0) goto L_0x0094
            c6g r2 = new c6g
            r2.<init>(r4, r5)
        L_0x00a5:
            r4.q = r2
            if (r2 == 0) goto L_0x00ab
            e6g r6 = defpackage.e6g.v
        L_0x00ab:
            r4.r = r6
            r4.i = r0
            r4.j = r0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.d = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.g = r5
            r5 = 0
            r4.h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f6g.<init>(android.content.Context, int):void");
    }

    public static void a(f6g f6g, Display display) {
        f6g.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            f6g.i = refreshRate;
            f6g.j = (refreshRate * 80) / 100;
            return;
        }
        i8b.V("Unable to query display refresh rate");
        f6g.i = -9223372036854775807L;
        f6g.j = -9223372036854775807L;
    }

    public final void b() {
        Surface surface;
        Surface surface2;
        switch (this.a) {
            case 0:
                if (t0g.a >= 30 && (surface = this.c) != null && this.h != Integer.MIN_VALUE && this.f != c44.DEFAULT_ASPECT_RATIO) {
                    this.f = c44.DEFAULT_ASPECT_RATIO;
                    z5g.a(surface, c44.DEFAULT_ASPECT_RATIO);
                    return;
                }
                return;
            default:
                if (v0g.a >= 30 && (surface2 = this.c) != null && this.h != Integer.MIN_VALUE && this.f != c44.DEFAULT_ASPECT_RATIO) {
                    this.f = c44.DEFAULT_ASPECT_RATIO;
                    a6g.a(surface2, c44.DEFAULT_ASPECT_RATIO);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r9 = this;
            int r0 = r9.a
            switch(r0) {
                case 0: goto L_0x00a1;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = defpackage.v0g.a
            r1 = 30
            if (r0 < r1) goto L_0x00a0
            android.view.Surface r0 = r9.c
            if (r0 != 0) goto L_0x0011
            goto L_0x00a0
        L_0x0011:
            java.lang.Object r0 = r9.p
            iq5 r0 = (defpackage.iq5) r0
            java.lang.Object r2 = r0.e
            hq5 r2 = (defpackage.hq5) r2
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r0.e
            hq5 r2 = (defpackage.hq5) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r0.e
            hq5 r2 = (defpackage.hq5) r2
            long r4 = r2.f
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            long r6 = r2.g
            long r6 = r6 / r4
        L_0x003b:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L_0x0048
        L_0x0044:
            r2 = r3
            goto L_0x0048
        L_0x0046:
            float r2 = r9.d
        L_0x0048:
            float r4 = r9.e
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x004f
            goto L_0x00a0
        L_0x004f:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0093
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0093
            java.lang.Object r1 = r0.e
            hq5 r1 = (defpackage.hq5) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0084
            java.lang.Object r1 = r0.e
            hq5 r1 = (defpackage.hq5) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0072
            java.lang.Object r0 = r0.e
            hq5 r0 = (defpackage.hq5) r0
            long r0 = r0.g
            goto L_0x0077
        L_0x0072:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0077:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0084
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L_0x0086
        L_0x0084:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0086:
            float r1 = r9.e
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00a0
            goto L_0x009a
        L_0x0093:
            if (r5 == 0) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            int r0 = r0.d
            if (r0 < r1) goto L_0x00a0
        L_0x009a:
            r9.e = r2
            r0 = 0
            r9.d(r0)
        L_0x00a0:
            return
        L_0x00a1:
            int r0 = defpackage.t0g.a
            r1 = 30
            if (r0 < r1) goto L_0x013c
            android.view.Surface r0 = r9.c
            if (r0 != 0) goto L_0x00ad
            goto L_0x013c
        L_0x00ad:
            java.lang.Object r0 = r9.p
            iq5 r0 = (defpackage.iq5) r0
            java.lang.Object r2 = r0.e
            hq5 r2 = (defpackage.hq5) r2
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L_0x00e2
            java.lang.Object r2 = r0.e
            hq5 r2 = (defpackage.hq5) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r0.e
            hq5 r2 = (defpackage.hq5) r2
            long r4 = r2.f
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x00d4
            goto L_0x00d7
        L_0x00d4:
            long r6 = r2.g
            long r6 = r6 / r4
        L_0x00d7:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L_0x00e4
        L_0x00e0:
            r2 = r3
            goto L_0x00e4
        L_0x00e2:
            float r2 = r9.d
        L_0x00e4:
            float r4 = r9.e
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x00eb
            goto L_0x013c
        L_0x00eb:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x012f
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x012f
            java.lang.Object r1 = r0.e
            hq5 r1 = (defpackage.hq5) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0120
            java.lang.Object r1 = r0.e
            hq5 r1 = (defpackage.hq5) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x010e
            java.lang.Object r0 = r0.e
            hq5 r0 = (defpackage.hq5) r0
            long r0 = r0.g
            goto L_0x0113
        L_0x010e:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0113:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0120
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L_0x0122
        L_0x0120:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0122:
            float r1 = r9.e
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x013c
            goto L_0x0136
        L_0x012f:
            if (r5 == 0) goto L_0x0132
            goto L_0x0136
        L_0x0132:
            int r0 = r0.d
            if (r0 < r1) goto L_0x013c
        L_0x0136:
            r9.e = r2
            r0 = 0
            r9.d(r0)
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f6g.c():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(boolean r4) {
        /*
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L_0x0036;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = defpackage.v0g.a
            r1 = 30
            if (r0 < r1) goto L_0x0035
            android.view.Surface r0 = r3.c
            if (r0 == 0) goto L_0x0035
            int r1 = r3.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L_0x0016
            goto L_0x0035
        L_0x0016:
            boolean r1 = r3.b
            if (r1 == 0) goto L_0x0026
            float r1 = r3.e
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0026
            float r2 = r3.g
            float r1 = r1 * r2
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            if (r4 != 0) goto L_0x0030
            float r4 = r3.f
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x0030
            goto L_0x0035
        L_0x0030:
            r3.f = r1
            defpackage.a6g.a(r0, r1)
        L_0x0035:
            return
        L_0x0036:
            int r0 = defpackage.t0g.a
            r1 = 30
            if (r0 < r1) goto L_0x0066
            android.view.Surface r0 = r3.c
            if (r0 == 0) goto L_0x0066
            int r1 = r3.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L_0x0047
            goto L_0x0066
        L_0x0047:
            boolean r1 = r3.b
            if (r1 == 0) goto L_0x0057
            float r1 = r3.e
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0057
            float r2 = r3.g
            float r1 = r1 * r2
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            if (r4 != 0) goto L_0x0061
            float r4 = r3.f
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r3.f = r1
            defpackage.z5g.a(r0, r1)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f6g.d(boolean):void");
    }
}
