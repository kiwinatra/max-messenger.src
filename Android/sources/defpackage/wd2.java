package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: wd2  reason: default package */
public final class wd2 extends xag {
    public final n6e X;
    public final dtc Y;
    public final xme Z;
    public final Context b;
    public final gaf c;
    public final vcd o;
    public final Lazy v;
    public final etc v0;
    public final Lazy w;
    public aje w0;
    public final Lazy x;
    public final AtomicReference x0 = new AtomicReference((Object) null);
    public final Lazy y;
    public final vd2 y0 = new vd2(this);
    public final Lazy z;

    public wd2(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Context context, gaf gaf, vcd vcd) {
        this.b = context;
        this.c = gaf;
        this.o = vcd;
        this.v = lazy;
        this.w = lazy2;
        this.x = lazy3;
        this.y = lazy4;
        this.z = lazy5;
        n6e a = m5a.a(1, IntCompanionObject.MAX_VALUE, cu0.b);
        this.X = a;
        this.Y = new dtc(a);
        xme a2 = f6e.a(Float.valueOf(c44.DEFAULT_ASPECT_RATIO));
        this.Z = a2;
        this.v0 = new etc(a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.wd2 r21, java.lang.String r22, defpackage.k20 r23, defpackage.ha9 r24, kotlin.coroutines.Continuation r25) {
        /*
            r1 = r21
            r2 = r23
            r0 = r24
            r3 = r25
            boolean r4 = r3 instanceof defpackage.td2
            if (r4 == 0) goto L_0x001c
            r4 = r3
            td2 r4 = (defpackage.td2) r4
            int r5 = r4.w
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.w = r5
        L_0x001a:
            r11 = r4
            goto L_0x0022
        L_0x001c:
            td2 r4 = new td2
            r4.<init>(r1, r3)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r3 = r11.o
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r11.w
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x0059
            if (r5 == r8) goto L_0x0047
            if (r5 == r7) goto L_0x0042
            if (r5 != r6) goto L_0x003a
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x0106
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x00cf
        L_0x0047:
            k20 r1 = r11.c
            java.lang.String r2 = r11.b
            wd2 r5 = r11.a
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x0054 }
            r0 = r3
            r3 = r1
            r1 = r5
            goto L_0x0091
        L_0x0054:
            r0 = move-exception
            r3 = r2
            r2 = r1
            r1 = r5
            goto L_0x00a5
        L_0x0059:
            kotlin.ResultKt.throwOnFailure(r3)
            jw9 r3 = new jw9
            long r13 = r2.a
            long r6 = r0.z
            long r8 = r0.c
            java.lang.String r0 = r2.l
            r12 = r3
            r15 = r6
            r17 = r8
            r19 = r0
            r12.<init>(r13, r15, r17, r19)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x00a2 }
            ud2 r0 = new ud2     // Catch:{ all -> 0x00a2 }
            r6 = 0
            r0.<init>(r1, r3, r6)     // Catch:{ all -> 0x00a2 }
            r11.a = r1     // Catch:{ all -> 0x00a2 }
            r3 = r22
            r11.b = r3     // Catch:{ all -> 0x00a0 }
            r11.c = r2     // Catch:{ all -> 0x00a0 }
            r6 = 1
            r11.w = r6     // Catch:{ all -> 0x00a0 }
            r6 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r0 = defpackage.okf.b(r6, r0, r11)     // Catch:{ all -> 0x00a0 }
            if (r0 != r4) goto L_0x008c
            goto L_0x0108
        L_0x008c:
            r20 = r3
            r3 = r2
            r2 = r20
        L_0x0091:
            k7g r0 = (defpackage.k7g) r0     // Catch:{ all -> 0x0099 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0099 }
            r9 = r2
            goto L_0x00b1
        L_0x0099:
            r0 = move-exception
            r20 = r3
            r3 = r2
            r2 = r20
            goto L_0x00a5
        L_0x00a0:
            r0 = move-exception
            goto L_0x00a5
        L_0x00a2:
            r0 = move-exception
            r3 = r22
        L_0x00a5:
            kotlin.Result$Companion r6 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
            r9 = r3
            r3 = r2
        L_0x00b1:
            boolean r2 = kotlin.Result.m29isFailureimpl(r0)
            if (r2 == 0) goto L_0x00b8
            r0 = 0
        L_0x00b8:
            k7g r0 = (defpackage.k7g) r0
            if (r0 != 0) goto L_0x00d2
            vd2 r0 = r1.y0
            r1 = 0
            r11.a = r1
            r11.b = r1
            r11.c = r1
            r1 = 2
            r11.w = r1
            kotlin.Unit r0 = r0.a()
            if (r0 != r4) goto L_0x00cf
            goto L_0x0108
        L_0x00cf:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L_0x0108
        L_0x00d2:
            java.util.Map r0 = r0.c
            java.lang.String r6 = defpackage.j4b.y(r0)
            kotlin.Lazy r0 = r1.y
            java.lang.Object r0 = r0.getValue()
            ln5 r0 = (defpackage.ln5) r0
            long r2 = r3.a
            po5 r0 = (defpackage.po5) r0
            java.io.File r7 = r0.t(r2)
            kotlin.Lazy r0 = r1.w
            java.lang.Object r0 = r0.getValue()
            k4f r0 = (defpackage.k4f) r0
            r2 = 0
            r11.a = r2
            r11.b = r2
            r11.c = r2
            r2 = 3
            r11.w = r2
            l4f r5 = r0.a
            vd2 r8 = r1.y0
            r10 = 0
            java.lang.Object r0 = r5.a(r6, r7, r8, r9, r10, r11)
            if (r0 != r4) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0108:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd2.j(wd2, java.lang.String, k20, ha9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static int n(sr4 sr4, boolean z2) {
        switch (sr4.ordinal()) {
            case 0:
                return hlc.media_share_dialog_share_video_fail;
            case 1:
            case 3:
            case 5:
                return z2 ? hlc.media_share_dialog_download_media_fail_not_enough_space : hlc.media_share_dialog_download_media_fail;
            case 2:
                return hlc.media_share_dialog_share_photo_fail;
            case 4:
                return hlc.media_share_dialog_share_gif_fail;
            case 6:
                return hlc.media_share_dialog_share_file_fail;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void k() {
        xag.g(this, ((osa) this.c).b().plus(caa.a), (f14) null, new nd2(this, (Continuation) null), 2);
        aje aje = this.w0;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.String r11, defpackage.s10 r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.qd2
            if (r0 == 0) goto L_0x0014
            r0 = r13
            qd2 r0 = (defpackage.qd2) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.w = r1
        L_0x0012:
            r7 = r0
            goto L_0x001a
        L_0x0014:
            qd2 r0 = new qd2
            r0.<init>(r10, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r13 = r7.o
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.w
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x004b
            if (r1 == r4) goto L_0x003f
            if (r1 == r3) goto L_0x003b
            if (r1 != r2) goto L_0x0033
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00cf
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x009c
        L_0x003f:
            s10 r12 = r7.c
            java.lang.String r11 = r7.b
            wd2 r10 = r7.a
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x0049 }
            goto L_0x006f
        L_0x0049:
            r13 = move-exception
            goto L_0x0076
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r13)
            np2 r13 = new np2
            long r8 = r12.a
            r1 = 15
            r13.<init>((long) r8, (int) r1)
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x0049 }
            rd2 r1 = new rd2     // Catch:{ all -> 0x0049 }
            r1.<init>(r10, r13, r5)     // Catch:{ all -> 0x0049 }
            r7.a = r10     // Catch:{ all -> 0x0049 }
            r7.b = r11     // Catch:{ all -> 0x0049 }
            r7.c = r12     // Catch:{ all -> 0x0049 }
            r7.w = r4     // Catch:{ all -> 0x0049 }
            r8 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r13 = defpackage.okf.b(r8, r1, r7)     // Catch:{ all -> 0x0049 }
            if (r13 != r0) goto L_0x006f
            return r0
        L_0x006f:
            am5 r13 = (defpackage.am5) r13     // Catch:{ all -> 0x0049 }
            java.lang.Object r13 = kotlin.Result.m23constructorimpl(r13)     // Catch:{ all -> 0x0049 }
            goto L_0x0080
        L_0x0076:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r13 = kotlin.ResultKt.createFailure(r13)
            java.lang.Object r13 = kotlin.Result.m23constructorimpl(r13)
        L_0x0080:
            boolean r1 = kotlin.Result.m29isFailureimpl(r13)
            if (r1 == 0) goto L_0x0087
            r13 = r5
        L_0x0087:
            am5 r13 = (defpackage.am5) r13
            if (r13 != 0) goto L_0x009f
            vd2 r10 = r10.y0
            r7.a = r5
            r7.b = r5
            r7.c = r5
            r7.w = r3
            kotlin.Unit r10 = r10.a()
            if (r10 != r0) goto L_0x009c
            return r0
        L_0x009c:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x009f:
            kotlin.Lazy r1 = r10.w
            java.lang.Object r1 = r1.getValue()
            k4f r1 = (defpackage.k4f) r1
            java.lang.String r13 = r13.c
            kotlin.Lazy r3 = r10.y
            java.lang.Object r3 = r3.getValue()
            ln5 r3 = (defpackage.ln5) r3
            java.lang.String r12 = r12.c
            po5 r3 = (defpackage.po5) r3
            java.io.File r3 = r3.i(r12)
            r7.a = r5
            r7.b = r5
            r7.c = r5
            r7.w = r2
            l4f r1 = r1.a
            vd2 r4 = r10.y0
            r6 = 0
            r2 = r13
            r5 = r11
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L_0x00cf
            return r0
        L_0x00cf:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd2.l(java.lang.String, s10, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void m(boolean z2) {
        ld2 ld2 = (ld2) this.x0.get();
        if (ld2 != null) {
            k();
            this.X.d(new wr4(n(ld2.d, z2)));
        }
    }
}
