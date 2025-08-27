package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.Boxing;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: ns4  reason: default package */
public final class ns4 implements j4f {
    public final /* synthetic */ DownloadFileAttachWorker a;

    public ns4(DownloadFileAttachWorker downloadFileAttachWorker) {
        this.a = downloadFileAttachWorker;
    }

    public final Unit a() {
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            pdf g = downloadFileAttachWorker.g();
            a67.d(w78, "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "onFileDownloadFailed: " + g, (Throwable) null);
        }
        if (this.a.g().h) {
            ((sv0) this.a.Y.getValue()).c(new vr4(this.a.g().g, this.a.g().b, this.a.g().o, this.a.g().a));
        }
        this.a.C0 = ds4.a;
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        if ((r3.G() ? r3.x0.I(defpackage.g20.o).d : null) != null) goto L_0x00ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(float r18, long r19, long r21, kotlin.coroutines.Continuation r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r23
            boolean r2 = r1 instanceof defpackage.ms4
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ms4 r2 = (defpackage.ms4) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.v = r3
            goto L_0x001c
        L_0x0017:
            ms4 r2 = new ms4
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.c
            java.lang.Object r13 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.v
            d20 r14 = defpackage.d20.v
            r15 = 0
            r12 = 3
            r11 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0054
            if (r3 == r4) goto L_0x0048
            if (r3 == r11) goto L_0x003f
            if (r3 != r12) goto L_0x0037
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x016c
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            java.lang.Object r0 = r2.a
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = (ru.ok.tamtam.upload.workers.DownloadFileAttachWorker) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x015e
        L_0x0048:
            float r0 = r2.b
            java.lang.Object r3 = r2.a
            ns4 r3 = (defpackage.ns4) r3
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r0
            r0 = r3
            goto L_0x00b8
        L_0x0054:
            kotlin.ResultKt.throwOnFailure(r1)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r0.a
            pdf r1 = r1.g()
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0172
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r0.a
            pdf r1 = r1.g()
            boolean r1 = r1.h
            if (r1 != 0) goto L_0x006f
            goto L_0x0172
        L_0x006f:
            long r5 = java.lang.System.currentTimeMillis()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r3 = r0.a
            long r7 = r3.B0
            long r7 = r5 - r7
            r9 = 500(0x1f4, double:2.47E-321)
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x0082
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0082:
            r3.B0 = r5
            int r6 = kotlin.math.MathKt.roundToInt((float) r18)
            r2.a = r0
            r1 = r18
            r2.b = r1
            r2.v = r4
            fa9 r4 = r3.e()
            pdf r5 = r3.g()
            long r7 = r5.a
            ha9 r4 = r4.r(r7)
            r16 = 0
            r5 = r14
            r7 = r19
            r9 = r21
            r11 = r16
            r12 = r2
            java.lang.Object r3 = r3.h(r4, r5, r6, r7, r9, r11, r12)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
        L_0x00b5:
            if (r3 != r13) goto L_0x00b8
            return r13
        L_0x00b8:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r3 = r0.a
            fa9 r3 = r3.e()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r4 = r0.a
            pdf r4 = r4.g()
            long r4 = r4.a
            ha9 r3 = r3.r(r4)
            if (r3 == 0) goto L_0x0113
            boolean r4 = r3.o()
            if (r4 == 0) goto L_0x0113
            s10 r4 = r3.g()
            if (r4 != 0) goto L_0x00ec
            boolean r4 = r3.G()
            if (r4 == 0) goto L_0x00e9
            g20 r4 = defpackage.g20.o
            w28 r5 = r3.x0
            l20 r4 = r5.I(r4)
            k20 r4 = r4.d
            goto L_0x00ea
        L_0x00e9:
            r4 = r15
        L_0x00ea:
            if (r4 == 0) goto L_0x0113
        L_0x00ec:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r4 = r0.a
            pdf r4 = r4.g()
            java.lang.String r4 = r4.b
            l20 r4 = defpackage.ld8.B(r3, r4)
            if (r4 == 0) goto L_0x0113
            d20 r4 = r4.n
            if (r4 != r14) goto L_0x0113
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r4 = r0.a
            fs4 r5 = new fs4
            long r6 = r3.o
            long r8 = r3.z
            r17 = r5
            r18 = r1
            r19 = r6
            r21 = r8
            r17.<init>(r18, r19, r21)
            r4.C0 = r5
        L_0x0113:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r0.a
            hs4 r1 = r1.C0
            boolean r3 = r1 instanceof defpackage.fs4
            if (r3 == 0) goto L_0x011e
            fs4 r1 = (defpackage.fs4) r1
            goto L_0x011f
        L_0x011e:
            r1 = r15
        L_0x011f:
            if (r1 != 0) goto L_0x0124
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0124:
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x0129
            goto L_0x0146
        L_0x0129:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0146
            w78 r4 = defpackage.w78.o
            float r5 = r1.a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "update notification "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            r3.d(r4, r6, r5, r15)
        L_0x0146:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r3 = r0.a
            float r1 = r1.a
            boolean r1 = r3.needToShowNotification(r1)
            if (r1 == 0) goto L_0x016f
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r0.a
            r2.a = r0
            r1 = 2
            r2.v = r1
            java.lang.Object r1 = r0.getForegroundInfo(r2)
            if (r1 != r13) goto L_0x015e
            return r13
        L_0x015e:
            o96 r1 = (defpackage.o96) r1
            r2.a = r15
            r3 = 3
            r2.v = r3
            java.lang.Object r0 = r0.setForeground(r1, r2)
            if (r0 != r13) goto L_0x016c
            return r13
        L_0x016c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x016f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0172:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns4.b(float, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.ks4
            if (r0 == 0) goto L_0x0014
            r0 = r12
            ks4 r0 = (defpackage.ks4) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.o = r1
        L_0x0012:
            r10 = r0
            goto L_0x001a
        L_0x0014:
            ks4 r0 = new ks4
            r0.<init>(r11, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r12 = r10.b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.o
            r2 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            ns4 r11 = r10.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0098
        L_0x002d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r12)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r12 = r11.a
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x003f
            goto L_0x005f
        L_0x003f:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x005f
            w78 r3 = defpackage.w78.o
            pdf r12 = r12.g()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onFileDownloadCancelled: "
            r4.<init>(r5)
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r4 = 0
            java.lang.String r5 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            r1.d(r3, r5, r12, r4)
        L_0x005f:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r12 = r11.a
            pdf r12 = r12.g()
            boolean r12 = r12.a()
            if (r12 == 0) goto L_0x0098
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r11.a
            d20 r3 = defpackage.d20.b
            int r4 = r1.A0
            r10.a = r11
            r10.o = r2
            fa9 r12 = r1.e()
            pdf r2 = r1.g()
            long r5 = r2.a
            ha9 r2 = r12.r(r5)
            r9 = 0
            r5 = 0
            r7 = 0
            java.lang.Object r12 = r1.h(r2, r3, r4, r5, r7, r9, r10)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r12 != r1) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
        L_0x0095:
            if (r12 != r0) goto L_0x0098
            return r0
        L_0x0098:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r11 = r11.a
            bs4 r12 = defpackage.bs4.a
            r11.C0 = r12
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns4.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Unit d() {
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        a67 a67 = z68.b;
        File file = null;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", wj6.h(downloadFileAttachWorker.g().l, "invalidate count="), (Throwable) null);
        }
        int i = this.a.g().l;
        gs4 gs4 = gs4.a;
        if (i >= 10) {
            z68.f("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Reached max link invalidate count:", (Throwable) null);
            ((uta) ((m95) this.a.X.getValue())).c(new Exception("Reached max link invalidate count"), true);
            this.a.C0 = gs4;
            return Unit.INSTANCE;
        }
        ha9 r = this.a.e().r(this.a.g().a);
        if (r == null || !r.w() || r.Y == qe9.DELETED) {
            z68.f("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Message deleted or now audio", (Throwable) null);
            this.a.C0 = gs4;
            return Unit.INSTANCE;
        }
        a32 G = ((r62) this.a.v.getValue()).G(r.z);
        if (G != null) {
            z68.c("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Create invalidateAndDownloadAudio task", new Object[0]);
            rl rlVar = (rl) this.a.z.getValue();
            File file2 = this.a.D0;
            if (file2 != null) {
                file = file2;
            }
            String absolutePath = file.getAbsolutePath();
            long j = G.b.a;
            long j2 = r.c;
            pdf g = this.a.g();
            jna jna = (jna) rlVar;
            jna.getClass();
            Boxing.boxLong(ocf.d(jna.E(), new nj7(((ltb) jna.D()).a.n(), absolutePath, j, j2, g), false, 0, 12));
        } else {
            z68.f("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Chat is null", (Throwable) null);
            this.a.C0 = gs4;
        }
        return Unit.INSTANCE;
    }

    public final Unit e(boolean z, boolean z2) {
        hs4 hs4;
        d20 d20;
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            pdf g = downloadFileAttachWorker.g();
            int i = downloadFileAttachWorker.z0.get();
            a67.d(w78, "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "onFileDownloadInterrupted: " + g + ", isNetworkProblem:" + z + ", retryCount:" + i, (Throwable) null);
        }
        if (this.a.g().h) {
            ((sv0) this.a.Y.getValue()).c(new vr4(this.a.g().g, this.a.g().b, this.a.g().o, this.a.g().a));
        }
        l20 B = ld8.B(this.a.e().r(this.a.g().a), this.a.g().b);
        int incrementAndGet = z ? this.a.z0.incrementAndGet() : 0;
        DownloadFileAttachWorker downloadFileAttachWorker2 = this.a;
        if (B == null || (d20 = B.n) == null || !d20.a()) {
            hs4 = (!z || incrementAndGet > 10) ? new es4(false) : new es4(true);
        } else {
            z68.p("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "File download. onFileDownloadInterrupted: cancelled outside!");
            hs4 = bs4.a;
        }
        downloadFileAttachWorker2.C0 = hs4;
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(java.io.File r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.ls4
            if (r0 == 0) goto L_0x0014
            r0 = r15
            ls4 r0 = (defpackage.ls4) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.v = r1
        L_0x0012:
            r10 = r0
            goto L_0x001a
        L_0x0014:
            ls4 r0 = new ls4
            r0.<init>(r13, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r15 = r10.c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.v
            r2 = 1
            r11 = 0
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.io.File r14 = r10.b
            ns4 r13 = r10.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00d4
        L_0x0032:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r15)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r15 = r13.a
            pdf r15 = r15.g()
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.lang.String r1 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            java.lang.String r3 = "onFileDownloadCompleted: %s"
            defpackage.z68.c(r1, r3, r15)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r15 = r13.a
            fa9 r15 = r15.e()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pdf r1 = r1.g()
            long r3 = r1.a
            ha9 r15 = r15.r(r3)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pdf r1 = r1.g()
            long r3 = r1.e
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x00af
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            kotlin.Lazy r1 = r1.x
            java.lang.Object r1 = r1.getValue()
            ou8 r1 = (defpackage.ou8) r1
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r3 = r13.a
            ln5 r3 = r3.d()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r4 = r13.a
            pdf r4 = r4.g()
            long r4 = r4.e
            java.lang.String r4 = java.lang.String.valueOf(r4)
            po5 r3 = (defpackage.po5) r3
            java.io.File r3 = r3.l(r4)
            wj0 r1 = (defpackage.wj0) r1
            r1.b(r14, r3)
            if (r15 == 0) goto L_0x00af
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            fa9 r1 = r1.e()
            long r3 = r15.b
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r5 = r13.a
            pdf r5 = r5.g()
            java.lang.String r5 = r5.b
            tb4 r6 = new tb4
            r7 = 28
            r6.<init>(r7)
            r1.x(r3, r5, r6)
        L_0x00af:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pdf r1 = r1.g()
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x00d4
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            d20 r3 = defpackage.d20.c
            r10.a = r13
            r10.b = r14
            r10.v = r2
            r5 = 0
            r7 = 0
            r4 = 100
            r2 = r15
            r9 = r14
            java.lang.Object r15 = r1.h(r2, r3, r4, r5, r7, r9, r10)
            if (r15 != r0) goto L_0x00d4
            return r0
        L_0x00d4:
            r15 = 0
            if (r14 == 0) goto L_0x0153
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            pdf r0 = r0.g()
            boolean r0 = r0.h
            if (r0 == 0) goto L_0x0118
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            kotlin.Lazy r0 = r0.Y
            java.lang.Object r0 = r0.getValue()
            sv0 r0 = (defpackage.sv0) r0
            tr4 r9 = new tr4
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pdf r1 = r1.g()
            long r2 = r1.o
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pdf r1 = r1.g()
            java.lang.String r6 = r1.g
            java.lang.String r7 = r14.getAbsolutePath()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pdf r1 = r1.g()
            java.lang.String r8 = r1.b
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pdf r1 = r1.g()
            long r4 = r1.a
            r1 = r9
            r1.<init>(r2, r4, r6, r7, r8)
            r0.c(r9)
        L_0x0118:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            pdf r0 = r0.g()
            long r0 = r0.c
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0153
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            pdf r0 = r0.g()
            boolean r0 = r0.n
            if (r0 != 0) goto L_0x0153
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            kotlin.Lazy r0 = r0.x
            java.lang.Object r0 = r0.getValue()
            ou8 r0 = (defpackage.ou8) r0
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pdf r1 = r1.g()
            long r1 = r1.c
            qva r0 = (defpackage.qva) r0
            kotlin.Lazy r1 = r0.i
            java.lang.Object r1 = r1.getValue()
            d14 r1 = (defpackage.d14) r1
            pva r2 = new pva
            r2.<init>(r0, r14, r15)
            r0 = 3
            defpackage.ev0.v(r1, r15, r15, r2, r0)
        L_0x0153:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            pdf r0 = r0.g()
            long r0 = r0.j
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0160
            goto L_0x0161
        L_0x0160:
            r14 = r15
        L_0x0161:
            if (r14 == 0) goto L_0x0170
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r15 = r13.a
            kotlin.Lazy r15 = r15.Z
            java.lang.Object r15 = r15.getValue()
            hm5 r15 = (defpackage.hm5) r15
            r15.b(r14)
        L_0x0170:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r13 = r13.a
            cs4 r14 = defpackage.cs4.a
            r13.C0 = r14
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns4.f(java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String getDownloadContext() {
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        if (downloadFileAttachWorker.g().c > 0) {
            long j = downloadFileAttachWorker.g().a;
            long j2 = downloadFileAttachWorker.g().c;
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(j2);
            return sb.toString();
        } else if (downloadFileAttachWorker.g().d > 0) {
            long j3 = downloadFileAttachWorker.g().a;
            long j4 = downloadFileAttachWorker.g().d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j3);
            sb2.append(j4);
            return sb2.toString();
        } else if (downloadFileAttachWorker.g().e > 0) {
            long j5 = downloadFileAttachWorker.g().a;
            long j6 = downloadFileAttachWorker.g().e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j5);
            sb3.append(j6);
            return sb3.toString();
        } else if (downloadFileAttachWorker.g().f > 0) {
            long j7 = downloadFileAttachWorker.g().a;
            long j8 = downloadFileAttachWorker.g().f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(j7);
            sb4.append(j8);
            return sb4.toString();
        } else if (downloadFileAttachWorker.g().j > 0) {
            long j9 = downloadFileAttachWorker.g().a;
            long j10 = downloadFileAttachWorker.g().j;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(j9);
            sb5.append(j10);
            return sb5.toString();
        } else {
            throw new AssertionError("DownloadListener.getContext() must return not null value");
        }
    }
}
