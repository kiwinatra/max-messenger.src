package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* renamed from: y6g  reason: default package */
public final class y6g implements lxc, s6g {
    public static final jv1 D0 = jv1.b;
    public ValueAnimator A0;
    public tu1 B0;
    public final AtomicBoolean C0;
    public lu7 X;
    public final xme Y;
    public final etc Z;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public cvb v;
    public volatile nyc v0;
    public final Lazy w = LazyKt.lazy(new yta((aua) wqg.a.getAccessor().g(aua.class), 2));
    public volatile sa3 w0;
    public bub x;
    public final xme x0;
    public lyc y;
    public final etc y0;
    public r3g z;
    public float z0;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0057, code lost:
        r3 = (defpackage.yrg) (r3 = ((defpackage.p4d) r3).b.s()).d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y6g(kotlin.Lazy r3, kotlin.Lazy r4, kotlin.Lazy r5, kotlin.Lazy r6) {
        /*
            r2 = this;
            wqg r0 = defpackage.wqg.a
            q4 r0 = r0.getAccessor()
            java.lang.Class<aua> r1 = defpackage.aua.class
            java.lang.Object r0 = r0.g(r1)
            aua r0 = (defpackage.aua) r0
            r2.<init>()
            r2.a = r3
            r2.b = r5
            r2.c = r6
            r2.o = r4
            yta r3 = new yta
            r4 = 2
            r3.<init>(r0, r4)
            kotlin.Lazy r3 = kotlin.LazyKt.lazy(r3)
            r2.w = r3
            r6g r3 = new r6g
            r4 = 0
            r3.<init>(r4, r4)
            xme r3 = defpackage.f6e.a(r3)
            r2.Y = r3
            etc r5 = new etc
            r5.<init>(r3)
            r2.Z = r5
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            xme r3 = defpackage.f6e.a(r3)
            r2.x0 = r3
            etc r5 = new etc
            r5.<init>(r3)
            r2.y0 = r5
            qu1 r3 = r2.l()
            if (r3 == 0) goto L_0x0064
            p4d r3 = (defpackage.p4d) r3
            qu1 r3 = r3.b
            u08 r3 = r3.s()
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r3.d()
            yrg r3 = (defpackage.yrg) r3
            if (r3 == 0) goto L_0x0064
            float r3 = r3.c()
            goto L_0x0066
        L_0x0064:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0066:
            r2.z0 = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>(r4)
            r2.C0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y6g.<init>(kotlin.Lazy, kotlin.Lazy, kotlin.Lazy, kotlin.Lazy):void");
    }

    public final int a() {
        return 0;
    }

    public final boolean b() {
        return this.v0 != null;
    }

    public final void c() {
        String name = y6g.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, name, "stopRecording videoMessage", (Throwable) null);
        }
        tu1 tu1 = this.B0;
        if (tu1 != null) {
            tu1.b.e(hu7.ON_STOP);
        }
        nyc nyc = this.v0;
        if (nyc != null) {
            nyc.close();
        }
        this.v0 = null;
    }

    public final void d() {
        String name = y6g.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, name, "resumeRecording videoMessage", (Throwable) null);
        }
        tu1 tu1 = this.B0;
        if (tu1 != null) {
            tu1.b.e(hu7.ON_RESUME);
        }
        nyc nyc = this.v0;
        if (nyc != null) {
            nyc.n();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.u6g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            u6g r0 = (defpackage.u6g) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            u6g r0 = new u6g
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0057
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Lazy r7 = r4.b
            java.lang.Object r7 = r7.getValue()
            ln5 r7 = (defpackage.ln5) r7
            java.lang.String r5 = java.lang.String.valueOf(r5)
            po5 r7 = (defpackage.po5) r7
            java.io.File r5 = r7.n(r5)
            w6g r6 = new w6g
            r7 = 0
            r6.<init>(r4, r5, r7)
            r0.c = r3
            r4 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r7 = defpackage.okf.c(r4, r6, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            kotlin.Unit r7 = (kotlin.Unit) r7
            if (r7 == 0) goto L_0x005e
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L_0x005e:
            one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException r4 = new one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException
            r5 = 0
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y6g.e(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A[SYNTHETIC, Splitter:B:24:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(defpackage.kxc r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r14 = r15 instanceof defpackage.x6g
            if (r14 == 0) goto L_0x0013
            r14 = r15
            x6g r14 = (defpackage.x6g) r14
            int r0 = r14.o
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r14.o = r0
            goto L_0x0018
        L_0x0013:
            x6g r14 = new x6g
            r14.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r14.b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.o
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            y6g r13 = r14.a
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x002c }
            goto L_0x0049
        L_0x002c:
            r14 = move-exception
            goto L_0x00a7
        L_0x002f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r15)
            sa3 r15 = r13.w0     // Catch:{ all -> 0x002c }
            if (r15 == 0) goto L_0x00a6
            r14.a = r13     // Catch:{ all -> 0x002c }
            r14.o = r2     // Catch:{ all -> 0x002c }
            java.lang.Object r15 = r15.a(r14)     // Catch:{ all -> 0x002c }
            if (r15 != r0) goto L_0x0049
            return r0
        L_0x0049:
            android.net.Uri r15 = (android.net.Uri) r15     // Catch:{ all -> 0x002c }
            if (r15 != 0) goto L_0x004e
            goto L_0x00a6
        L_0x004e:
            kotlin.Result$Companion r14 = kotlin.Result.Companion     // Catch:{ all -> 0x0067 }
            kotlin.Lazy r13 = r13.c     // Catch:{ all -> 0x0067 }
            java.lang.Object r13 = r13.getValue()     // Catch:{ all -> 0x0067 }
            ou8 r13 = (defpackage.ou8) r13     // Catch:{ all -> 0x0067 }
            java.lang.String r14 = r15.toString()     // Catch:{ all -> 0x0067 }
            wj0 r13 = (defpackage.wj0) r13     // Catch:{ all -> 0x0067 }
            i7g r13 = r13.d(r14)     // Catch:{ all -> 0x0067 }
            java.lang.Object r13 = kotlin.Result.m23constructorimpl(r13)     // Catch:{ all -> 0x0067 }
            goto L_0x0072
        L_0x0067:
            r13 = move-exception
            kotlin.Result$Companion r14 = kotlin.Result.Companion
            java.lang.Object r13 = kotlin.ResultKt.createFailure(r13)
            java.lang.Object r13 = kotlin.Result.m23constructorimpl(r13)
        L_0x0072:
            boolean r14 = kotlin.Result.m29isFailureimpl(r13)
            if (r14 == 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r3 = r13
        L_0x007a:
            i7g r3 = (defpackage.i7g) r3
            if (r3 == 0) goto L_0x0082
            java.lang.String r13 = r3.a
        L_0x0080:
            r5 = r13
            goto L_0x0087
        L_0x0082:
            java.lang.String r13 = r15.toString()
            goto L_0x0080
        L_0x0087:
            java.lang.String r4 = r15.toString()
            o9a r13 = defpackage.sq9.b
            java.lang.String r13 = r15.toString()
            int r13 = r13.hashCode()
            long r2 = (long) r13
            d48 r13 = new d48
            r10 = 0
            r12 = 0
            r1 = 3
            r6 = 0
            r7 = 0
            java.lang.String r9 = "video/mp4"
            r0 = r13
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r10, r12)
            return r13
        L_0x00a6:
            return r3
        L_0x00a7:
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.String r15 = "We couldn't get a video file after recording"
            defpackage.z68.f(r13, r15, r14)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y6g.f(kxc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void g() {
        String name = y6g.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, name, "pauseRecording videoMessage", (Throwable) null);
        }
        tu1 tu1 = this.B0;
        if (tu1 != null) {
            tu1.b.e(hu7.ON_PAUSE);
        }
        nyc nyc = this.v0;
        if (nyc != null) {
            nyc.m();
        }
    }

    public final boolean h() {
        return ((edb) this.o.getValue()).b(edb.l);
    }

    public final void i(pwc pwc) {
    }

    public final void j(jv7 jv7, jv1 jv1) {
        cvb cvb = this.v;
        if (cvb != null) {
            cvb.f();
        }
        lu7 lu7 = null;
        try {
            cvb cvb2 = this.v;
            if (cvb2 != null) {
                lu7 = cvb2.c(jv7, jv1, this.x, this.z);
            }
        } catch (Throwable th) {
            z68.f(y6g.class.getName(), "fail to bindCameraToLifecycle", th);
        }
        this.X = lu7;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [xc0, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(defpackage.kub r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.t6g
            if (r0 == 0) goto L_0x0013
            r0 = r11
            t6g r0 = (defpackage.t6g) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            t6g r0 = new t6g
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 0
            java.lang.String r4 = "Required value was null."
            r5 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r5) goto L_0x0036
            y6g r9 = r0.c
            kub r10 = r0.b
            y6g r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x0033 }
            goto L_0x00b6
        L_0x0033:
            r9 = move-exception
            goto L_0x01b4
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.concurrent.atomic.AtomicBoolean r11 = r9.C0
            boolean r11 = r11.get()
            java.lang.Class<y6g> r2 = defpackage.y6g.class
            if (r11 == 0) goto L_0x0086
            java.lang.String r10 = r2.getName()
            a67 r11 = defpackage.z68.b
            if (r11 != 0) goto L_0x0054
            goto L_0x0061
        L_0x0054:
            boolean r0 = r11.c()
            if (r0 == 0) goto L_0x0061
            w78 r0 = defpackage.w78.o
            java.lang.String r1 = "Resume camera preview"
            r11.d(r0, r10, r1, r3)
        L_0x0061:
            tu1 r10 = r9.B0
            if (r10 == 0) goto L_0x007c
            qu1 r11 = r9.l()
            if (r11 == 0) goto L_0x0075
            ob6 r11 = (defpackage.ob6) r11
            qu1 r11 = r11.a
            jv1 r11 = r11.j()
            if (r11 != 0) goto L_0x0077
        L_0x0075:
            jv1 r11 = D0
        L_0x0077:
            r9.j(r10, r11)
            goto L_0x018f
        L_0x007c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r4.toString()
            r9.<init>(r10)
            throw r9
        L_0x0086:
            java.lang.String r11 = r2.getName()
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x008f
            goto L_0x009c
        L_0x008f:
            boolean r6 = r2.c()
            if (r6 == 0) goto L_0x009c
            w78 r6 = defpackage.w78.o
            java.lang.String r7 = "Start binding camera preview"
            r2.d(r6, r11, r7, r3)
        L_0x009c:
            tu1 r11 = new tu1
            r11.<init>()
            r9.B0 = r11
            r0.a = r9     // Catch:{ all -> 0x01b2 }
            r0.b = r10     // Catch:{ all -> 0x01b2 }
            r0.getClass()     // Catch:{ all -> 0x01b2 }
            r0.c = r9     // Catch:{ all -> 0x01b2 }
            r0.w = r5     // Catch:{ all -> 0x01b2 }
            java.lang.Object r11 = r9.m(r0)     // Catch:{ all -> 0x01b2 }
            if (r11 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            r0 = r9
        L_0x00b6:
            cvb r11 = (defpackage.cvb) r11     // Catch:{ all -> 0x0033 }
            r9.v = r11
            ts1 r9 = defpackage.lyc.n0
            d19 r11 = defpackage.lb0.a()
            kotlin.Lazy r1 = r0.w
            java.lang.Object r1 = r1.getValue()
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1
            java.lang.String r2 = "The specified executor can't be null."
            defpackage.bs0.q(r1, r2)
            yb0 r2 = defpackage.yb0.d
            zqd r2 = defpackage.zqd.t(r2)
            java.lang.Object r6 = r11.b
            yc0 r6 = (defpackage.yc0) r6
            if (r6 == 0) goto L_0x01a7
            xc0 r7 = new xc0
            r7.<init>()
            zqd r8 = r6.a
            r7.a = r8
            android.util.Range r8 = r6.b
            r7.b = r8
            android.util.Range r8 = r6.c
            r7.c = r8
            int r6 = r6.d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.d = r6
            r7.a = r2
            yc0 r2 = r7.a()
            r11.b = r2
            lyc r2 = new lyc
            lb0 r11 = r11.f()
            r2.<init>(r1, r11, r9, r9)
            r0.y = r2
            p3g r9 = defpackage.r3g.C
            d87 r9 = new d87
            r9.<init>((defpackage.h7g) r2)
            r3g r11 = new r3g
            s3g r1 = new s3g
            pz9 r9 = r9.b
            c5b r9 = defpackage.c5b.a(r9)
            r1.<init>(r9)
            r11.<init>(r1)
            r0.z = r11
            d87 r9 = new d87
            r11 = 2
            r9.<init>((int) r11)
            int r11 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            if (r11 < r1) goto L_0x0136
            la0 r11 = defpackage.x97.I
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            pz9 r6 = r9.b
            r6.f(r11, r1)
        L_0x0136:
            bub r9 = r9.b()
            aub r10 = r10.getSurfaceProvider()
            r9.E(r10)
            r0.x = r9
            tu1 r9 = r0.B0
            if (r9 == 0) goto L_0x019d
            jv1 r10 = D0
            r0.j(r9, r10)
            xme r9 = r0.Y
            r6g r10 = new r6g
            qu1 r11 = r0.l()
            if (r11 == 0) goto L_0x015f
            p4d r11 = (defpackage.p4d) r11
            qu1 r11 = r11.b
            boolean r11 = r11.n()
            goto L_0x0160
        L_0x015f:
            r11 = r2
        L_0x0160:
            qu1 r1 = r0.l()
            if (r1 == 0) goto L_0x0180
            p4d r1 = (defpackage.p4d) r1
            qu1 r1 = r1.b
            u08 r1 = r1.f()
            if (r1 == 0) goto L_0x0180
            java.lang.Object r1 = r1.d()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0179
            goto L_0x0180
        L_0x0179:
            int r1 = r1.intValue()
            if (r1 != r5) goto L_0x0180
            r2 = r5
        L_0x0180:
            r10.<init>(r11, r2)
            r9.getClass()
            r9.m(r3, r10)
            java.util.concurrent.atomic.AtomicBoolean r9 = r0.C0
            r9.set(r5)
            r9 = r0
        L_0x018f:
            tu1 r9 = r9.B0
            if (r9 == 0) goto L_0x019a
            lv7 r9 = r9.b
            hu7 r10 = defpackage.hu7.ON_RESUME
            r9.e(r10)
        L_0x019a:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x019d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r4.toString()
            r9.<init>(r10)
            throw r9
        L_0x01a7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Property \"videoSpec\" has not been set"
            r9.<init>(r10)
            throw r9
        L_0x01af:
            r0 = r9
            r9 = r10
            goto L_0x01b4
        L_0x01b2:
            r10 = move-exception
            goto L_0x01af
        L_0x01b4:
            java.lang.Class r10 = r0.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "fail to bindPreview"
            defpackage.z68.f(r10, r11, r9)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y6g.k(kub, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final qu1 l() {
        lu7 lu7 = this.X;
        if (lu7 != null) {
            return lu7.c.A0;
        }
        return null;
    }

    public final Object m(t6g t6g) {
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(t6g));
        lw1.u();
        cvb cvb = cvb.f;
        Lazy lazy = this.a;
        cz1 A = kv0.A((Context) lazy.getValue());
        A.d(new ij3(lw1, A, this, 8), iw3.a((Context) lazy.getValue()));
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(t6g);
        }
        return t;
    }
}
