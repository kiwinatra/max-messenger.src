package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: g87  reason: default package */
public final class g87 extends vzf {
    public static final e87 t = new Object();
    public final h87 o;
    public final Object p = new Object();
    public bwd q;
    public za7 r;
    public cwd s;

    public g87(j87 j87) {
        super(j87);
        if (((Integer) ((j87) this.f).k(j87.b, 0)).intValue() == 1) {
            this.o = new h87();
        } else {
            this.o = new m87((Executor) j87.k(cif.i0, ryg.C()));
        }
        this.o.b = E();
        this.o.c = ((Boolean) ((j87) this.f).k(j87.x, Boolean.FALSE)).booleanValue();
    }

    public final void A(Rect rect) {
        this.i = rect;
        h87 h87 = this.o;
        synchronized (h87.Z) {
            h87.w = rect;
            new Rect(h87.w);
            h87.getClass();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bwd D(defpackage.j87 r14, defpackage.hc0 r15) {
        /*
            r13 = this;
            defpackage.ev0.g()
            android.util.Size r0 = r15.a
            ky6 r1 = defpackage.ryg.C()
            la0 r2 = defpackage.cif.i0
            java.lang.Object r1 = r14.k(r2, r1)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r1.getClass()
            zzf r2 = r13.f
            j87 r2 = (defpackage.j87) r2
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            la0 r5 = defpackage.j87.b
            java.lang.Object r2 = r2.k(r5, r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = 1
            if (r2 != r4) goto L_0x0042
            zzf r2 = r13.f
            j87 r2 = (defpackage.j87) r2
            r5 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            la0 r6 = defpackage.j87.c
            java.lang.Object r2 = r2.k(r6, r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x0043
        L_0x0042:
            r2 = 4
        L_0x0043:
            la0 r5 = defpackage.j87.o
            r6 = 0
            java.lang.Object r5 = r14.k(r5, r6)
            defpackage.rae.w(r5)
            obd r5 = new obd
            int r7 = r0.getWidth()
            int r8 = r0.getHeight()
            zzf r9 = r13.f
            int r9 = r9.getInputFormat()
            he r2 = defpackage.b59.n(r7, r8, r9, r2)
            r5.<init>(r2)
            su1 r2 = r13.c()
            if (r2 == 0) goto L_0x008c
            su1 r2 = r13.c()
            zzf r7 = r13.f
            j87 r7 = (defpackage.j87) r7
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            la0 r9 = defpackage.j87.x
            java.lang.Object r7 = r7.k(r9, r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x008c
            int r2 = r13.h(r2, r3)
            int r2 = r2 % 180
            if (r2 == 0) goto L_0x008c
            r2 = r4
            goto L_0x008d
        L_0x008c:
            r2 = r3
        L_0x008d:
            if (r2 == 0) goto L_0x0094
            int r7 = r0.getHeight()
            goto L_0x0098
        L_0x0094:
            int r7 = r0.getWidth()
        L_0x0098:
            if (r2 == 0) goto L_0x009f
            int r2 = r0.getWidth()
            goto L_0x00a3
        L_0x009f:
            int r2 = r0.getHeight()
        L_0x00a3:
            int r8 = r13.E()
            r9 = 2
            r10 = 35
            if (r8 != r9) goto L_0x00ae
            r8 = r4
            goto L_0x00af
        L_0x00ae:
            r8 = r10
        L_0x00af:
            zzf r11 = r13.f
            int r11 = r11.getInputFormat()
            if (r11 != r10) goto L_0x00bf
            int r11 = r13.E()
            if (r11 != r9) goto L_0x00bf
            r9 = r4
            goto L_0x00c0
        L_0x00bf:
            r9 = r3
        L_0x00c0:
            zzf r11 = r13.f
            int r11 = r11.getInputFormat()
            if (r11 != r10) goto L_0x00ed
            su1 r10 = r13.c()
            if (r10 == 0) goto L_0x00d8
            su1 r10 = r13.c()
            int r10 = r13.h(r10, r3)
            if (r10 != 0) goto L_0x00ee
        L_0x00d8:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            zzf r11 = r13.f
            j87 r11 = (defpackage.j87) r11
            la0 r12 = defpackage.j87.w
            java.lang.Object r11 = r11.k(r12, r6)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r4 = r3
        L_0x00ee:
            if (r9 != 0) goto L_0x00f2
            if (r4 == 0) goto L_0x00ff
        L_0x00f2:
            obd r6 = new obd
            int r4 = r5.o()
            he r2 = defpackage.b59.n(r7, r2, r8, r4)
            r6.<init>(r2)
        L_0x00ff:
            if (r6 == 0) goto L_0x010d
            h87 r2 = r13.o
            java.lang.Object r4 = r2.Z
            monitor-enter(r4)
            r2.o = r6     // Catch:{ all -> 0x010a }
            monitor-exit(r4)     // Catch:{ all -> 0x010a }
            goto L_0x010d
        L_0x010a:
            r13 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x010a }
            throw r13
        L_0x010d:
            su1 r2 = r13.c()
            if (r2 == 0) goto L_0x011b
            h87 r4 = r13.o
            int r2 = r13.h(r2, r3)
            r4.a = r2
        L_0x011b:
            h87 r2 = r13.o
            r5.k(r2, r1)
            android.util.Size r1 = r15.a
            bwd r14 = defpackage.bwd.d(r14, r1)
            je3 r1 = r15.d
            if (r1 == 0) goto L_0x012f
            u40 r2 = r14.b
            r2.c(r1)
        L_0x012f:
            za7 r1 = r13.r
            if (r1 == 0) goto L_0x0136
            r1.a()
        L_0x0136:
            za7 r1 = new za7
            android.view.Surface r2 = r5.getSurface()
            zzf r3 = r13.f
            int r3 = r3.getInputFormat()
            r1.<init>(r2, r0, r3)
            r13.r = r1
            go1 r0 = r1.e
            zz7 r0 = defpackage.hd8.J(r0)
            uo5 r1 = new uo5
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r6)
            ew6 r2 = defpackage.ryg.G()
            r0.d(r1, r2)
            android.util.Range r0 = r15.c
            u40 r1 = r14.b
            r1.getClass()
            la0 r2 = defpackage.bx1.k
            java.lang.Object r1 = r1.f
            pz9 r1 = (defpackage.pz9) r1
            r1.f(r2, r0)
            za7 r0 = r13.r
            vy4 r15 = r15.b
            r1 = -1
            r14.b(r0, r15, r1)
            cwd r15 = r13.s
            if (r15 == 0) goto L_0x017a
            r15.b()
        L_0x017a:
            cwd r15 = new cwd
            b87 r0 = new b87
            r1 = 0
            r0.<init>(r1, r13)
            r15.<init>(r0)
            r13.s = r15
            r14.f = r15
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g87.D(j87, hc0):bwd");
    }

    public final int E() {
        return ((Integer) ((j87) this.f).k(j87.v, 1)).intValue();
    }

    public final zzf f(boolean z, c0g c0g) {
        t.getClass();
        j87 j87 = e87.a;
        je3 a = c0g.a(j87.O(), 1);
        if (z) {
            a = je3.L(a, j87);
        }
        if (a == null) {
            return null;
        }
        return new j87(c5b.a(((d87) k(a)).b));
    }

    public final yzf k(je3 je3) {
        return new d87(pz9.d(je3), 0);
    }

    public final void q() {
        this.o.v0 = true;
    }

    public final zzf s(qu1 qu1, yzf yzf) {
        Boolean bool = (Boolean) ((j87) this.f).k(j87.w, (Object) null);
        qu1.q().e(OnePixelShiftQuirk.class);
        h87 h87 = this.o;
        if (bool != null) {
            bool.booleanValue();
        }
        h87.getClass();
        synchronized (this.p) {
        }
        return yzf.s();
    }

    public final String toString() {
        return "ImageAnalysis:".concat(g());
    }

    public final hc0 v(je3 je3) {
        this.q.a(je3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.q.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        q13 a = this.g.a();
        a.v = je3;
        return a.h();
    }

    public final hc0 w(hc0 hc0, hc0 hc02) {
        e();
        bwd D = D((j87) this.f, hc0);
        this.q = D;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{D.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        return hc0;
    }

    public final void x() {
        ev0.g();
        cwd cwd = this.s;
        if (cwd != null) {
            cwd.b();
            this.s = null;
        }
        za7 za7 = this.r;
        if (za7 != null) {
            za7.a();
            this.r = null;
        }
        h87 h87 = this.o;
        h87.v0 = false;
        h87.c();
    }

    public final void y(Matrix matrix) {
        super.y(matrix);
        h87 h87 = this.o;
        synchronized (h87.Z) {
            h87.x = matrix;
            new Matrix(h87.x);
            h87.getClass();
        }
    }
}
