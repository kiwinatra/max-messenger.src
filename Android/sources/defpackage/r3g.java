package defpackage;

import android.graphics.Rect;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: r3g  reason: default package */
public final class r3g extends vzf {
    public static final p3g C = new Object();
    public cwd A;
    public final kcc B = new kcc(2, this);
    public lk4 o;
    public q3f p;
    public gc0 q = gc0.d;
    public bwd r = new awd();
    public go1 s = null;
    public z3f t;
    public int u = 3;
    public g6d v;
    public Rect w;
    public int x;
    public boolean y = false;
    public q3g z;

    /* JADX WARNING: type inference failed for: r2v2, types: [bwd, awd] */
    public r3g(s3g s3g) {
        super(s3g);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void D(java.util.HashSet r2, int r3, int r4, android.util.Size r5, defpackage.a5g r6) {
        /*
            int r0 = r5.getWidth()
            if (r3 > r0) goto L_0x0041
            int r5 = r5.getHeight()
            if (r4 <= r5) goto L_0x000d
            goto L_0x0041
        L_0x000d:
            android.util.Range r5 = r6.K0(r3)     // Catch:{ IllegalArgumentException -> 0x0027 }
            android.util.Size r0 = new android.util.Size     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.lang.Comparable r5 = r5.clamp(r1)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalArgumentException -> 0x0027 }
            int r5 = r5.intValue()     // Catch:{ IllegalArgumentException -> 0x0027 }
            r0.<init>(r3, r5)     // Catch:{ IllegalArgumentException -> 0x0027 }
            r2.add(r0)     // Catch:{ IllegalArgumentException -> 0x0027 }
        L_0x0027:
            android.util.Range r5 = r6.I0(r4)     // Catch:{ IllegalArgumentException -> 0x0041 }
            android.util.Size r6 = new android.util.Size     // Catch:{ IllegalArgumentException -> 0x0041 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0041 }
            java.lang.Comparable r3 = r5.clamp(r3)     // Catch:{ IllegalArgumentException -> 0x0041 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IllegalArgumentException -> 0x0041 }
            int r3 = r3.intValue()     // Catch:{ IllegalArgumentException -> 0x0041 }
            r6.<init>(r3, r4)     // Catch:{ IllegalArgumentException -> 0x0041 }
            r2.add(r6)     // Catch:{ IllegalArgumentException -> 0x0041 }
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3g.D(java.util.HashSet, int, int, android.util.Size, a5g):void");
    }

    public static int E(boolean z2, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z2 ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [v2f] */
    /* JADX WARNING: type inference failed for: r1v2, types: [z4g] */
    /* JADX WARNING: type inference failed for: r1v3, types: [ay2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.a5g M(defpackage.bj6 r9, defpackage.zc0 r10, defpackage.lb0 r11, android.util.Size r12, defpackage.vy4 r13, android.util.Range r14) {
        /*
            wc0 r0 = defpackage.e4g.b(r11, r13, r10)
            xjf r3 = defpackage.xjf.a
            yc0 r4 = r11.a
            sa0 r6 = r0.c
            if (r6 == 0) goto L_0x0018
            ay2 r11 = new ay2
            java.lang.String r2 = r0.a
            r1 = r11
            r5 = r12
            r7 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0023
        L_0x0018:
            z4g r11 = new z4g
            java.lang.String r2 = r0.a
            r1 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x0023:
            java.lang.Object r11 = r11.get()
            uc0 r11 = (defpackage.uc0) r11
            java.lang.Object r9 = r9.apply(r11)
            a5g r9 = (defpackage.a5g) r9
            r11 = 0
            if (r9 != 0) goto L_0x0033
            return r11
        L_0x0033:
            if (r10 == 0) goto L_0x0040
            android.util.Size r11 = new android.util.Size
            sa0 r10 = r10.f
            int r12 = r10.e
            int r10 = r10.f
            r11.<init>(r12, r10)
        L_0x0040:
            a5g r9 = defpackage.c5g.a(r9, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3g.M(bj6, zc0, lb0, android.util.Size, vy4, android.util.Range):a5g");
    }

    public final void A(Rect rect) {
        this.i = rect;
        N();
    }

    public final void F(bwd bwd, gc0 gc0, hc0 hc0) {
        lk4 lk4;
        boolean z2 = true;
        boolean z3 = gc0.a == -1;
        if (gc0.b != 1) {
            z2 = false;
        }
        if (!z3 || !z2) {
            bwd.a.clear();
            ((HashSet) bwd.b.e).clear();
            vy4 vy4 = hc0.b;
            if (!z3 && (lk4 = this.o) != null) {
                if (z2) {
                    bwd.b(lk4, vy4, -1);
                } else {
                    kwd a = dc0.a(lk4);
                    if (vy4 != null) {
                        a.f = vy4;
                        bwd.a.add(a.b());
                    } else {
                        throw new NullPointerException("Null dynamicRange");
                    }
                }
            }
            go1 go1 = this.s;
            if (go1 != null) {
                go1.cancel(false);
            }
            go1 F = m5a.F(new hzf(4, this, bwd));
            this.s = F;
            hd8.a(F, new he((Object) this, (Object) F, z2, 17), ryg.G());
            return;
        }
        throw new IllegalStateException("Unexpected stream state, stream is error but active");
    }

    public final void G() {
        ev0.g();
        cwd cwd = this.A;
        if (cwd != null) {
            cwd.b();
            this.A = null;
        }
        lk4 lk4 = this.o;
        if (lk4 != null) {
            lk4.a();
            this.o = null;
        }
        g6d g6d = this.v;
        if (g6d != null) {
            g6d.release();
            this.v = null;
        }
        q3f q3f = this.p;
        if (q3f != null) {
            q3f.c();
            this.p = null;
        }
        this.w = null;
        this.t = null;
        this.q = gc0.d;
        this.x = 0;
        this.y = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: lb0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: lb0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: lb0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bwd H(defpackage.s3g r28, defpackage.hc0 r29) {
        /*
            r27 = this;
            r0 = r27
            r8 = r28
            r9 = r29
            defpackage.ev0.g()
            su1 r10 = r27.c()
            r10.getClass()
            android.util.Size r7 = r9.a
            qof r11 = new qof
            r1 = 6
            r11.<init>(r1, r0)
            android.util.Range r1 = r9.c
            android.util.Range r2 = defpackage.hc0.f
            boolean r2 = java.util.Objects.equals(r1, r2)
            if (r2 == 0) goto L_0x0024
            android.util.Range r1 = defpackage.p3g.b
        L_0x0024:
            r12 = r1
            h7g r1 = r27.J()
            kha r1 = r1.a()
            zz7 r1 = r1.e()
            boolean r2 = r1.isDone()
            if (r2 != 0) goto L_0x0039
            r1 = 0
            goto L_0x003d
        L_0x0039:
            java.lang.Object r1 = r1.get()     // Catch:{ InterruptedException | ExecutionException -> 0x049b }
        L_0x003d:
            r3 = r1
            lb0 r3 = (defpackage.lb0) r3
            java.util.Objects.requireNonNull(r3)
            qu1 r1 = r10.n()
            h7g r2 = r27.J()
            k3g r1 = r2.g(r1)
            vy4 r14 = r9.b
            zc0 r2 = r1.a(r7, r14)
            la0 r1 = defpackage.s3g.c
            java.lang.Object r1 = r8.n(r1)
            bj6 r1 = (defpackage.bj6) r1
            java.util.Objects.requireNonNull(r1)
            r4 = r7
            r5 = r14
            r6 = r12
            a5g r1 = M(r1, r2, r3, r4, r5, r6)
            int r2 = r0.I(r10)
            r0.x = r2
            android.graphics.Rect r2 = r0.i
            r3 = 0
            if (r2 == 0) goto L_0x0073
            goto L_0x0080
        L_0x0073:
            android.graphics.Rect r2 = new android.graphics.Rect
            int r4 = r7.getWidth()
            int r5 = r7.getHeight()
            r2.<init>(r3, r3, r4, r5)
        L_0x0080:
            r15 = 1
            if (r1 == 0) goto L_0x0091
            int r4 = r2.width()
            int r5 = r2.height()
            boolean r4 = r1.B0(r4, r5)
            if (r4 == 0) goto L_0x0095
        L_0x0091:
            r16 = r11
            goto L_0x0202
        L_0x0095:
            java.lang.String r4 = defpackage.grf.f(r2)
            int r5 = r1.D0()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r1.L0()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.util.Range r13 = r1.M0()
            android.util.Range r3 = r1.R0()
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r5, r6, r13, r3}
            java.lang.String r4 = "Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s"
            java.lang.String.format(r4, r3)
            android.util.Range r3 = r1.M0()
            int r4 = r2.width()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x00df
            android.util.Range r3 = r1.R0()
            int r4 = r2.height()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x00df
            goto L_0x010f
        L_0x00df:
            boolean r3 = r1.F0()
            if (r3 == 0) goto L_0x010f
            android.util.Range r3 = r1.R0()
            int r4 = r2.width()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x010f
            android.util.Range r3 = r1.M0()
            int r4 = r2.height()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x010f
            p5f r3 = new p5f
            r3.<init>(r1)
            goto L_0x0110
        L_0x010f:
            r3 = r1
        L_0x0110:
            int r4 = r3.D0()
            int r5 = r3.L0()
            android.util.Range r6 = r3.M0()
            android.util.Range r13 = r3.R0()
            int r9 = r2.width()
            int r9 = E(r15, r9, r4, r6)
            int r15 = r2.width()
            r16 = r11
            r11 = 0
            int r4 = E(r11, r15, r4, r6)
            int r6 = r2.height()
            r15 = 1
            int r6 = E(r15, r6, r5, r13)
            int r15 = r2.height()
            int r5 = E(r11, r15, r5, r13)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            D(r11, r9, r6, r7, r3)
            D(r11, r9, r5, r7, r3)
            D(r11, r4, r6, r7, r3)
            D(r11, r4, r5, r7, r3)
            boolean r3 = r11.isEmpty()
            if (r3 == 0) goto L_0x015d
            goto L_0x0202
        L_0x015d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r11)
            r3.toString()
            ks3 r4 = new ks3
            r5 = 5
            r4.<init>(r5, r2)
            java.util.Collections.sort(r3, r4)
            r3.toString()
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            android.util.Size r3 = (android.util.Size) r3
            int r4 = r3.getWidth()
            int r3 = r3.getHeight()
            int r5 = r2.width()
            if (r4 != r5) goto L_0x018e
            int r5 = r2.height()
            if (r3 != r5) goto L_0x018e
            goto L_0x0202
        L_0x018e:
            int r5 = r4 % 2
            if (r5 != 0) goto L_0x01a5
            int r5 = r3 % 2
            if (r5 != 0) goto L_0x01a5
            int r5 = r7.getWidth()
            if (r4 > r5) goto L_0x01a5
            int r5 = r7.getHeight()
            if (r3 > r5) goto L_0x01a5
            r5 = 1
        L_0x01a3:
            r6 = 0
            goto L_0x01a7
        L_0x01a5:
            r5 = 0
            goto L_0x01a3
        L_0x01a7:
            defpackage.bs0.r(r6, r5)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r2)
            int r6 = r2.width()
            if (r4 == r6) goto L_0x01d5
            int r6 = r2.centerX()
            int r9 = r4 / 2
            int r6 = r6 - r9
            r9 = 0
            int r6 = java.lang.Math.max(r9, r6)
            r5.left = r6
            int r6 = r6 + r4
            r5.right = r6
            int r9 = r7.getWidth()
            if (r6 <= r9) goto L_0x01d5
            int r6 = r7.getWidth()
            r5.right = r6
            int r6 = r6 - r4
            r5.left = r6
        L_0x01d5:
            int r4 = r2.height()
            if (r3 == r4) goto L_0x01fb
            int r4 = r2.centerY()
            int r6 = r3 / 2
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r5.top = r4
            int r4 = r4 + r3
            r5.bottom = r4
            int r6 = r7.getHeight()
            if (r4 <= r6) goto L_0x01fb
            int r4 = r7.getHeight()
            r5.bottom = r4
            int r4 = r4 - r3
            r5.top = r4
        L_0x01fb:
            defpackage.grf.f(r2)
            defpackage.grf.f(r5)
            r2 = r5
        L_0x0202:
            int r3 = r0.x
            gc0 r4 = r0.q
            oc0 r4 = r4.c
            if (r4 == 0) goto L_0x0226
            r4.getClass()
            android.graphics.Rect r4 = r4.a
            android.util.Size r4 = defpackage.grf.e(r4)
            android.util.Size r3 = defpackage.grf.g(r4, r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r5 = r3.getWidth()
            int r3 = r3.getHeight()
            r6 = 0
            r4.<init>(r6, r6, r5, r3)
            goto L_0x0228
        L_0x0226:
            r6 = 0
            r4 = r2
        L_0x0228:
            r0.w = r4
            gc0 r3 = r0.q
            oc0 r3 = r3.c
            if (r3 == 0) goto L_0x0260
            boolean r3 = r4.equals(r2)
            if (r3 != 0) goto L_0x0260
            int r3 = r4.height()
            float r3 = (float) r3
            int r2 = r2.height()
            float r2 = (float) r2
            float r3 = r3 / r2
            android.util.Size r2 = new android.util.Size
            int r4 = r7.getWidth()
            float r4 = (float) r4
            float r4 = r4 * r3
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r5 = r7.getHeight()
            float r5 = (float) r5
            float r5 = r5 * r3
            r3 = r7
            double r6 = (double) r5
            double r5 = java.lang.Math.ceil(r6)
            int r5 = (int) r5
            r2.<init>(r4, r5)
            goto L_0x0262
        L_0x0260:
            r3 = r7
            r2 = r3
        L_0x0262:
            gc0 r4 = r0.q
            oc0 r4 = r4.c
            if (r4 == 0) goto L_0x026b
            r4 = 1
            r0.y = r4
        L_0x026b:
            android.graphics.Rect r4 = r0.w
            int r11 = r0.x
            boolean r5 = r0.K(r10, r8, r4, r3)
            ykb r6 = defpackage.on4.a
            java.lang.Class<androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk> r7 = androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk.class
            icc r6 = r6.g(r7)
            androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk r6 = (androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk) r6
            if (r6 == 0) goto L_0x02ed
            if (r5 == 0) goto L_0x0282
            goto L_0x0283
        L_0x0282:
            r11 = 0
        L_0x0283:
            android.util.Size r5 = defpackage.grf.e(r4)
            android.util.Size r5 = defpackage.grf.g(r5, r11)
            java.lang.String r6 = "motorola"
            java.lang.String r7 = android.os.Build.BRAND
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x02b2
            java.lang.String r6 = "moto c"
            java.lang.String r7 = android.os.Build.MODEL
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x02b2
            java.util.HashSet r6 = new java.util.HashSet
            android.util.Size r7 = new android.util.Size
            r9 = 720(0x2d0, float:1.009E-42)
            r11 = 1280(0x500, float:1.794E-42)
            r7.<init>(r9, r11)
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r6.<init>(r7)
            goto L_0x02b6
        L_0x02b2:
            java.util.Set r6 = java.util.Collections.emptySet()
        L_0x02b6:
            boolean r6 = r6.contains(r5)
            if (r6 != 0) goto L_0x02bd
            goto L_0x02ed
        L_0x02bd:
            if (r1 == 0) goto L_0x02c6
            int r1 = r1.L0()
            int r1 = r1 / 2
            goto L_0x02c8
        L_0x02c6:
            r1 = 8
        L_0x02c8:
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r4)
            int r4 = r4.width()
            int r5 = r5.getHeight()
            if (r4 != r5) goto L_0x02e2
            int r4 = r6.left
            int r4 = r4 + r1
            r6.left = r4
            int r4 = r6.right
            int r4 = r4 - r1
            r6.right = r4
            goto L_0x02ec
        L_0x02e2:
            int r4 = r6.top
            int r4 = r4 + r1
            r6.top = r4
            int r4 = r6.bottom
            int r4 = r4 - r1
            r6.bottom = r4
        L_0x02ec:
            r4 = r6
        L_0x02ed:
            r0.w = r4
            boolean r1 = r0.K(r10, r8, r4, r3)
            if (r1 == 0) goto L_0x0307
            g6d r6 = new g6d
            su1 r1 = r27.c()
            java.util.Objects.requireNonNull(r1)
            ti4 r3 = new ti4
            r3.<init>(r14)
            r6.<init>((defpackage.su1) r1, (defpackage.ti4) r3)
            goto L_0x0308
        L_0x0307:
            r6 = 0
        L_0x0308:
            r0.v = r6
            if (r6 != 0) goto L_0x0317
            boolean r1 = r10.l()
            if (r1 != 0) goto L_0x0313
            goto L_0x0317
        L_0x0313:
            xjf r1 = defpackage.xjf.a
        L_0x0315:
            r9 = r1
            goto L_0x0320
        L_0x0317:
            qu1 r1 = r10.n()
            xjf r1 = r1.i()
            goto L_0x0315
        L_0x0320:
            qu1 r1 = r10.n()
            xjf r1 = r1.i()
            java.util.Objects.toString(r1)
            java.util.Objects.toString(r9)
            q13 r1 = r29.a()
            if (r2 == 0) goto L_0x0493
            r1.b = r2
            if (r12 == 0) goto L_0x048b
            r1.o = r12
            hc0 r20 = r1.h()
            q3f r1 = r0.p
            if (r1 != 0) goto L_0x0345
            r1 = 1
        L_0x0343:
            r2 = 0
            goto L_0x0347
        L_0x0345:
            r1 = 0
            goto L_0x0343
        L_0x0347:
            defpackage.bs0.r(r2, r1)
            q3f r1 = new q3f
            android.graphics.Matrix r2 = r0.j
            boolean r22 = r10.l()
            android.graphics.Rect r3 = r0.w
            int r4 = r0.x
            int r25 = r27.b()
            boolean r5 = r10.l()
            if (r5 == 0) goto L_0x0369
            boolean r5 = r0.l(r10)
            if (r5 == 0) goto L_0x0369
            r26 = 1
            goto L_0x036b
        L_0x0369:
            r26 = 0
        L_0x036b:
            r18 = 2
            r19 = 34
            r17 = r1
            r21 = r2
            r23 = r3
            r24 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0.p = r1
            r2 = r16
            r1.a(r2)
            g6d r1 = r0.v
            if (r1 == 0) goto L_0x0413
            q3f r1 = r0.p
            int r2 = r1.f
            int r3 = r1.i
            android.graphics.Rect r4 = r1.d
            android.util.Size r5 = defpackage.grf.e(r4)
            android.util.Size r21 = defpackage.grf.g(r5, r3)
            int r3 = r1.i
            nb0 r5 = new nb0
            java.util.UUID r17 = java.util.UUID.randomUUID()
            int r6 = r1.a
            boolean r1 = r1.e
            r16 = r5
            r18 = r2
            r19 = r6
            r20 = r4
            r22 = r3
            r23 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            q3f r1 = r0.p
            java.util.List r2 = java.util.Collections.singletonList(r5)
            mc0 r3 = new mc0
            r3.<init>(r1, r2)
            g6d r1 = r0.v
            rx4 r1 = r1.z(r3)
            java.lang.Object r1 = r1.get(r5)
            r11 = r1
            q3f r11 = (defpackage.q3f) r11
            java.util.Objects.requireNonNull(r11)
            po1 r12 = new po1
            r7 = 10
            r1 = r12
            r2 = r27
            r3 = r11
            r4 = r10
            r5 = r28
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.a(r12)
            r1 = 1
            z3f r2 = r11.d(r10, r1)
            r0.t = r2
            q3f r1 = r0.p
            r1.getClass()
            defpackage.ev0.g()
            r1.b()
            boolean r2 = r1.j
            r3 = 1
            r2 = r2 ^ r3
            java.lang.String r4 = "Consumer can only be linked once."
            defpackage.bs0.r(r4, r2)
            r1.j = r3
            p3f r1 = r1.l
            r0.o = r1
            go1 r2 = r1.e
            zz7 r2 = defpackage.hd8.J(r2)
            s6e r3 = new s6e
            r4 = 19
            r3.<init>(r4, r0, r1)
            ew6 r1 = defpackage.ryg.G()
            r2.d(r3, r1)
            goto L_0x0420
        L_0x0413:
            q3f r1 = r0.p
            r2 = 1
            z3f r1 = r1.d(r10, r2)
            r0.t = r1
            za7 r1 = r1.l
            r0.o = r1
        L_0x0420:
            la0 r1 = defpackage.s3g.b
            java.lang.Object r1 = r8.n(r1)
            h7g r1 = (defpackage.h7g) r1
            java.util.Objects.requireNonNull(r1)
            z3f r2 = r0.t
            r1.f(r2, r9)
            r27.N()
            lk4 r1 = r0.o
            java.lang.Class<android.media.MediaCodec> r2 = android.media.MediaCodec.class
            r1.j = r2
            r1 = r29
            android.util.Size r2 = r1.a
            bwd r2 = defpackage.bwd.d(r8, r2)
            android.util.Range r3 = r1.c
            u40 r4 = r2.b
            r4.getClass()
            la0 r5 = defpackage.bx1.k
            java.lang.Object r4 = r4.f
            pz9 r4 = (defpackage.pz9) r4
            r4.f(r5, r3)
            int r3 = r28.P()
            if (r3 == 0) goto L_0x046b
            u40 r4 = r2.b
            r4.getClass()
            if (r3 == 0) goto L_0x046b
            la0 r5 = defpackage.zzf.t0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r4.f
            pz9 r4 = (defpackage.pz9) r4
            r4.f(r5, r3)
        L_0x046b:
            cwd r3 = r0.A
            if (r3 == 0) goto L_0x0472
            r3.b()
        L_0x0472:
            cwd r3 = new cwd
            b87 r4 = new b87
            r5 = 5
            r4.<init>(r5, r0)
            r3.<init>(r4)
            r0.A = r3
            r2.f = r3
            je3 r0 = r1.d
            if (r0 == 0) goto L_0x048a
            u40 r1 = r2.b
            r1.c(r0)
        L_0x048a:
            return r2
        L_0x048b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null expectedFrameRateRange"
            r0.<init>(r1)
            throw r0
        L_0x0493:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null resolution"
            r0.<init>(r1)
            throw r0
        L_0x049b:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3g.H(s3g, hc0):bwd");
    }

    public final int I(su1 su1) {
        boolean l = l(su1);
        int h = h(su1, l);
        oc0 oc0 = this.q.c;
        if (oc0 == null) {
            return h;
        }
        Objects.requireNonNull(oc0);
        boolean z2 = oc0.f;
        int i = oc0.b;
        if (l != z2) {
            i = -i;
        }
        return grf.h(h - i);
    }

    public final h7g J() {
        h7g h7g = (h7g) ((s3g) this.f).n(s3g.b);
        Objects.requireNonNull(h7g);
        return h7g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r4.booleanValue() != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean K(defpackage.su1 r3, defpackage.s3g r4, android.graphics.Rect r5, android.util.Size r6) {
        /*
            r2 = this;
            boolean r0 = r3.l()
            if (r0 == 0) goto L_0x001a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            la0 r1 = defpackage.s3g.o
            java.lang.Object r4 = r4.k(r1, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.util.Objects.requireNonNull(r4)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x001a
            goto L_0x0062
        L_0x001a:
            boolean r4 = r3.l()
            if (r4 == 0) goto L_0x0037
            ykb r4 = defpackage.on4.a
            boolean r4 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.d(r4)
            if (r4 != 0) goto L_0x0062
            qu1 r4 = r3.n()
            ykb r4 = r4.q()
            boolean r4 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.d(r4)
            if (r4 == 0) goto L_0x0037
            goto L_0x0062
        L_0x0037:
            int r4 = r6.getWidth()
            int r0 = r5.width()
            if (r4 != r0) goto L_0x0062
            int r4 = r6.getHeight()
            int r5 = r5.height()
            if (r4 == r5) goto L_0x004c
            goto L_0x0062
        L_0x004c:
            boolean r4 = r3.l()
            if (r4 == 0) goto L_0x0059
            boolean r3 = r2.l(r3)
            if (r3 == 0) goto L_0x0059
            goto L_0x0062
        L_0x0059:
            gc0 r2 = r2.q
            oc0 r2 = r2.c
            if (r2 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r2 = 0
            goto L_0x0063
        L_0x0062:
            r2 = 1
        L_0x0063:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3g.K(su1, s3g, android.graphics.Rect, android.util.Size):boolean");
    }

    public final void L() {
        if (c() != null) {
            G();
            hc0 hc0 = this.g;
            hc0.getClass();
            bwd H = H((s3g) this.f, hc0);
            this.r = H;
            F(H, this.q, this.g);
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{this.r.c()}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C(Collections.unmodifiableList(arrayList));
            o();
        }
    }

    public final void N() {
        su1 c = c();
        q3f q3f = this.p;
        if (c != null && q3f != null) {
            int I = I(c);
            this.x = I;
            ev0.E(new wt0(q3f, I, b(), 5));
        }
    }

    public final zzf f(boolean z2, c0g c0g) {
        C.getClass();
        s3g s3g = p3g.a;
        je3 a = c0g.a(s3g.O(), 1);
        if (z2) {
            a = je3.L(a, s3g);
        }
        if (a == null) {
            return null;
        }
        return new s3g(c5b.a(((d87) k(a)).b));
    }

    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    public final yzf k(je3 je3) {
        return new d87(pz9.d(je3), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: yb0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: yb0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.zzf s(defpackage.qu1 r20, defpackage.yzf r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = -1
            r3 = 1
            h7g r4 = r19.J()
            kha r4 = r4.a()
            zz7 r4 = r4.e()
            boolean r5 = r4.isDone()
            if (r5 != 0) goto L_0x001a
            r4 = 0
            goto L_0x001e
        L_0x001a:
            java.lang.Object r4 = r4.get()     // Catch:{ InterruptedException | ExecutionException -> 0x031b }
        L_0x001e:
            lb0 r4 = (defpackage.lb0) r4
            r5 = 0
            if (r4 == 0) goto L_0x0025
            r7 = r3
            goto L_0x0026
        L_0x0025:
            r7 = r5
        L_0x0026:
            java.lang.String r8 = "Unable to update target resolution by null MediaSpec."
            defpackage.bs0.m(r8, r7)
            zzf r7 = r0.f
            la0 r8 = defpackage.m97.E
            boolean r7 = r7.u(r8)
            if (r7 == 0) goto L_0x003d
            zzf r7 = r0.f
            vy4 r7 = r7.D()
        L_0x003b:
            r13 = r7
            goto L_0x0040
        L_0x003d:
            vy4 r7 = defpackage.p3g.c
            goto L_0x003b
        L_0x0040:
            h7g r7 = r19.J()
            k3g r14 = r7.g(r1)
            java.util.ArrayList r7 = r14.c(r13)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0054
            goto L_0x030e
        L_0x0054:
            yc0 r8 = r4.a
            zqd r9 = r8.a
            r9.getClass()
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L_0x0068
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x016c
        L_0x0068:
            r7.toString()
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            java.lang.Object r11 = r9.b
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x0078:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00aa
            java.lang.Object r12 = r11.next()
            yb0 r12 = (defpackage.yb0) r12
            yb0 r15 = defpackage.yb0.i
            if (r12 != r15) goto L_0x008c
            r10.addAll(r7)
            goto L_0x00aa
        L_0x008c:
            yb0 r15 = defpackage.yb0.h
            if (r12 != r15) goto L_0x009c
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r7)
            java.util.Collections.reverse(r11)
            r10.addAll(r11)
            goto L_0x00aa
        L_0x009c:
            boolean r15 = r7.contains(r12)
            if (r15 == 0) goto L_0x00a6
            r10.add(r12)
            goto L_0x0078
        L_0x00a6:
            java.util.Objects.toString(r12)
            goto L_0x0078
        L_0x00aa:
            boolean r11 = r7.isEmpty()
            if (r11 == 0) goto L_0x00b2
            goto L_0x0167
        L_0x00b2:
            boolean r11 = r10.containsAll(r7)
            if (r11 == 0) goto L_0x00ba
            goto L_0x0167
        L_0x00ba:
            java.lang.Object r11 = r9.c
            wa0 r11 = (defpackage.wa0) r11
            java.util.Objects.toString(r11)
            wa0 r12 = defpackage.wa0.c
            if (r11 != r12) goto L_0x00c7
            goto L_0x0167
        L_0x00c7:
            boolean r12 = r11 instanceof defpackage.wa0
            java.lang.String r15 = "Currently only support type RuleStrategy"
            defpackage.bs0.r(r15, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.List r15 = defpackage.yb0.l
            r12.<init>(r15)
            yb0 r15 = r11.a
            yb0 r6 = defpackage.yb0.i
            if (r15 != r6) goto L_0x00e3
            java.lang.Object r6 = r12.get(r5)
            r15 = r6
            yb0 r15 = (defpackage.yb0) r15
            goto L_0x00ee
        L_0x00e3:
            yb0 r6 = defpackage.yb0.h
            if (r15 != r6) goto L_0x00ee
            java.lang.Object r6 = defpackage.a81.h(r3, r12)
            r15 = r6
            yb0 r15 = (defpackage.yb0) r15
        L_0x00ee:
            int r6 = r12.indexOf(r15)
            if (r6 == r2) goto L_0x00f7
            r2 = r3
        L_0x00f5:
            r5 = 0
            goto L_0x00f9
        L_0x00f7:
            r2 = r5
            goto L_0x00f5
        L_0x00f9:
            defpackage.bs0.r(r5, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r18 = r6 + -1
            r5 = r18
        L_0x0105:
            if (r5 < 0) goto L_0x011c
            java.lang.Object r18 = r12.get(r5)
            r3 = r18
            yb0 r3 = (defpackage.yb0) r3
            boolean r18 = r7.contains(r3)
            if (r18 == 0) goto L_0x0118
            r2.add(r3)
        L_0x0118:
            r3 = -1
            int r5 = r5 + r3
            r3 = 1
            goto L_0x0105
        L_0x011c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0121:
            r5 = 1
            int r6 = r6 + r5
            int r5 = r12.size()
            if (r6 >= r5) goto L_0x0139
            java.lang.Object r5 = r12.get(r6)
            yb0 r5 = (defpackage.yb0) r5
            boolean r16 = r7.contains(r5)
            if (r16 == 0) goto L_0x0121
            r3.add(r5)
            goto L_0x0121
        L_0x0139:
            r5 = 1
            r12.toString()
            java.util.Objects.toString(r15)
            r2.toString()
            r3.toString()
            int r6 = r11.b
            if (r6 == 0) goto L_0x0167
            if (r6 != r5) goto L_0x0153
            r10.addAll(r2)
            r10.addAll(r3)
            goto L_0x0167
        L_0x0153:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unhandled fallback strategy: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0167:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r10)
        L_0x016c:
            r2.toString()
            r9.toString()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0313
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.ArrayList r5 = r14.c(r13)
            java.util.Iterator r5 = r5.iterator()
        L_0x0185:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01a7
            java.lang.Object r6 = r5.next()
            yb0 r6 = (defpackage.yb0) r6
            zc0 r7 = r14.b(r6, r13)
            java.util.Objects.requireNonNull(r7)
            android.util.Size r9 = new android.util.Size
            sa0 r7 = r7.f
            int r10 = r7.e
            int r7 = r7.f
            r9.<init>(r10, r7)
            r3.put(r6, r9)
            goto L_0x0185
        L_0x01a7:
            vac r5 = new vac
            zzf r0 = r0.f
            int r0 = r0.getInputFormat()
            java.util.List r0 = r1.r(r0)
            r5.<init>(r0, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L_0x01bf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01eb
            java.lang.Object r2 = r1.next()
            yb0 r2 = (defpackage.yb0) r2
            xb0 r6 = new xb0
            int r7 = r8.d
            r6.<init>(r2, r7)
            java.util.HashMap r2 = r5.a
            java.lang.Object r2 = r2.get(r6)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r6 = new java.util.ArrayList
            if (r2 == 0) goto L_0x01e3
            r6.<init>(r2)
            r2 = 0
            goto L_0x01e7
        L_0x01e3:
            r2 = 0
            r6.<init>(r2)
        L_0x01e7:
            r0.addAll(r6)
            goto L_0x01bf
        L_0x01eb:
            zzf r1 = r21.s()
            s3g r1 = (defpackage.s3g) r1
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x01f9
            goto L_0x0300
        L_0x01f9:
            java.util.Iterator r2 = r0.iterator()
        L_0x01fd:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0300
            java.lang.Object r5 = r2.next()
            android.util.Size r5 = (android.util.Size) r5
            boolean r6 = r3.containsValue(r5)
            if (r6 == 0) goto L_0x0210
            goto L_0x01fd
        L_0x0210:
            zc0 r6 = r14.a(r5, r13)
            if (r6 != 0) goto L_0x0217
            goto L_0x01fd
        L_0x0217:
            la0 r7 = defpackage.s3g.c
            java.lang.Object r7 = r1.n(r7)
            r15 = r7
            bj6 r15 = (defpackage.bj6) r15
            java.util.Objects.requireNonNull(r15)
            android.util.Range r7 = defpackage.p3g.b
            la0 r8 = defpackage.zzf.o0
            java.lang.Object r7 = r1.k(r8, r7)
            r16 = r7
            android.util.Range r16 = (android.util.Range) r16
            java.util.Objects.requireNonNull(r16)
            boolean r7 = r13.b()
            if (r7 == 0) goto L_0x0247
            r7 = r15
            r8 = r6
            r9 = r4
            r10 = r5
            r11 = r13
            r12 = r16
            a5g r6 = M(r7, r8, r9, r10, r11, r12)
            r19 = r1
            goto L_0x02e9
        L_0x0247:
            java.util.List r7 = r6.d
            java.util.Iterator r17 = r7.iterator()
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r7
            r18 = 0
        L_0x0252:
            boolean r7 = r17.hasNext()
            if (r7 == 0) goto L_0x02e5
            java.lang.Object r7 = r17.next()
            sa0 r7 = (defpackage.sa0) r7
            boolean r8 = defpackage.yy4.a(r7, r13)
            if (r8 == 0) goto L_0x02e1
            vy4 r11 = new vy4
            java.util.HashMap r8 = defpackage.yy4.d
            int r9 = r7.j
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            boolean r10 = r8.containsKey(r10)
            defpackage.bs0.n(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.get(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.util.Objects.requireNonNull(r8)
            int r8 = r8.intValue()
            java.util.HashMap r9 = defpackage.yy4.c
            int r7 = r7.h
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r10 = r9.containsKey(r10)
            defpackage.bs0.n(r10)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r9.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.util.Objects.requireNonNull(r7)
            int r7 = r7.intValue()
            r11.<init>(r8, r7)
            r7 = r15
            r8 = r6
            r9 = r4
            r10 = r5
            r19 = r1
            r1 = r12
            r12 = r16
            a5g r7 = M(r7, r8, r9, r10, r11, r12)
            if (r7 != 0) goto L_0x02bc
        L_0x02b8:
            r12 = r1
        L_0x02b9:
            r1 = r19
            goto L_0x0252
        L_0x02bc:
            android.util.Range r8 = r7.M0()
            java.lang.Comparable r8 = r8.getUpper()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            android.util.Range r9 = r7.R0()
            java.lang.Comparable r9 = r9.getUpper()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            android.util.Size r10 = defpackage.pde.a
            int r8 = r8 * r9
            if (r8 <= r1) goto L_0x02b8
            r18 = r7
            r12 = r8
            goto L_0x02b9
        L_0x02e1:
            r19 = r1
            r1 = r12
            goto L_0x02b8
        L_0x02e5:
            r19 = r1
            r6 = r18
        L_0x02e9:
            if (r6 == 0) goto L_0x02fc
            int r1 = r5.getWidth()
            int r5 = r5.getHeight()
            boolean r1 = r6.B0(r1, r5)
            if (r1 != 0) goto L_0x02fc
            r2.remove()
        L_0x02fc:
            r1 = r19
            goto L_0x01fd
        L_0x0300:
            r0.toString()
            yy9 r1 = r21.q()
            la0 r2 = defpackage.x97.O
            pz9 r1 = (defpackage.pz9) r1
            r1.f(r2, r0)
        L_0x030e:
            zzf r0 = r21.s()
            return r0
        L_0x0313:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to find supported quality by QualitySelector"
            r0.<init>(r1)
            throw r0
        L_0x031b:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3g.s(qu1, yzf):zzf");
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [q3g, java.lang.Object] */
    public final void t() {
        e();
        hc0 hc0 = this.g;
        if (hc0 != null && this.t == null) {
            kha d = J().d();
            Object obj = gc0.d;
            zz7 e = d.e();
            if (e.isDone()) {
                try {
                    obj = e.get();
                } catch (InterruptedException | ExecutionException e2) {
                    throw new IllegalStateException(e2);
                }
            }
            this.q = (gc0) obj;
            bwd H = H((s3g) this.f, hc0);
            this.r = H;
            F(H, this.q, hc0);
            ArrayList arrayList = new ArrayList(1);
            Object obj2 = new Object[]{this.r.c()}[0];
            Objects.requireNonNull(obj2);
            arrayList.add(obj2);
            C(Collections.unmodifiableList(arrayList));
            n();
            J().d().d(ryg.G(), this.B);
            q3g q3g = this.z;
            if (q3g != null) {
                bs0.r("SourceStreamRequirementObserver can be closed from main thread only", ev0.s());
                au1 au1 = q3g.a;
                if (au1 != null) {
                    if (q3g.b) {
                        q3g.b = false;
                        au1.a();
                    }
                    q3g.a = null;
                }
            }
            au1 d2 = d();
            ? obj3 = new Object();
            obj3.b = false;
            obj3.a = d2;
            this.z = obj3;
            J().e().d(ryg.G(), this.z);
            if (2 != this.u) {
                this.u = 2;
                J().b(2);
            }
        }
    }

    public final String toString() {
        return "VideoCapture:".concat(g());
    }

    public final void u() {
        bs0.r("VideoCapture can only be detached on the main thread.", ev0.s());
        if (this.z != null) {
            J().e().i(this.z);
            q3g q3g = this.z;
            q3g.getClass();
            bs0.r("SourceStreamRequirementObserver can be closed from main thread only", ev0.s());
            au1 au1 = q3g.a;
            if (au1 != null) {
                if (q3g.b) {
                    q3g.b = false;
                    au1.a();
                }
                q3g.a = null;
            }
            this.z = null;
        }
        if (3 != this.u) {
            this.u = 3;
            J().b(3);
        }
        J().d().i(this.B);
        go1 go1 = this.s;
        if (go1 != null) {
            go1.cancel(false);
        }
        G();
    }

    public final hc0 v(je3 je3) {
        this.r.a(je3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.r.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        hc0 hc0 = this.g;
        Objects.requireNonNull(hc0);
        q13 a = hc0.a();
        a.v = je3;
        return a.h();
    }

    public final hc0 w(hc0 hc0, hc0 hc02) {
        Objects.toString(hc0);
        ArrayList arrayList = null;
        List list = (List) ((s3g) this.f).k(x97.O, (Object) null);
        if (list != null) {
            arrayList = new ArrayList(list);
        }
        if (arrayList != null && !arrayList.contains(hc0.a)) {
            Objects.toString(hc0.a);
            arrayList.toString();
        }
        return hc0;
    }
}
