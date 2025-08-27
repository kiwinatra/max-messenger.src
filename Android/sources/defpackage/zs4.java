package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: zs4  reason: default package */
public final class zs4 implements j4f {
    public final /* synthetic */ DownloadFileFromWebAppWorker a;

    public zs4(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker) {
        this.a = downloadFileFromWebAppWorker;
    }

    public final Unit a() {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            ydf c = downloadFileFromWebAppWorker.c();
            a67.d(w78, "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onFileDownloadFailed: " + c, (Throwable) null);
        }
        sv0 d = this.a.d();
        long j = this.a.c().a;
        String str = this.a.c().c;
        d.c(new bm5(j));
        this.a.v0 = ss4.a;
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(float r9, long r10, long r12, kotlin.coroutines.Continuation r14) {
        /*
            r8 = this;
            boolean r10 = r14 instanceof defpackage.ys4
            if (r10 == 0) goto L_0x0013
            r10 = r14
            ys4 r10 = (defpackage.ys4) r10
            int r11 = r10.o
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = r11 & r12
            if (r13 == 0) goto L_0x0013
            int r11 = r11 - r12
            r10.o = r11
            goto L_0x0018
        L_0x0013:
            ys4 r10 = new ys4
            r10.<init>(r8, r14)
        L_0x0018:
            java.lang.Object r11 = r10.b
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r13 = r10.o
            r14 = 0
            r0 = 2
            r1 = 1
            if (r13 == 0) goto L_0x003d
            if (r13 == r1) goto L_0x0036
            if (r13 != r0) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00c3
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r8 = r10.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00b6
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r11)
            long r2 = java.lang.System.currentTimeMillis()
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r11 = r8.a
            long r4 = r11.Z
            long r4 = r2 - r4
            r6 = 500(0x1f4, double:2.47E-321)
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 >= 0) goto L_0x0053
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x0053:
            r11.Z = r2
            us4 r13 = new us4
            ydf r2 = r11.c()
            long r4 = r2.e
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r2 = r8.a
            ydf r2 = r2.c()
            long r6 = r2.b
            r2 = r13
            r3 = r9
            r2.<init>(r3, r4, r6)
            r11.v0 = r13
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r9 = r8.a
            vs4 r9 = r9.v0
            boolean r11 = r9 instanceof defpackage.us4
            if (r11 == 0) goto L_0x0077
            us4 r9 = (defpackage.us4) r9
            goto L_0x0078
        L_0x0077:
            r9 = r14
        L_0x0078:
            if (r9 != 0) goto L_0x007d
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x007d:
            a67 r11 = defpackage.z68.b
            if (r11 != 0) goto L_0x0082
            goto L_0x009f
        L_0x0082:
            boolean r13 = r11.c()
            if (r13 == 0) goto L_0x009f
            w78 r13 = defpackage.w78.o
            float r2 = r9.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "update notification "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker"
            r11.d(r13, r3, r2, r14)
        L_0x009f:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r11 = r8.a
            float r9 = r9.a
            boolean r9 = r11.needToShowNotification(r9)
            if (r9 == 0) goto L_0x00c6
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r8 = r8.a
            r10.a = r8
            r10.o = r1
            java.lang.Object r11 = r8.getForegroundInfo(r10)
            if (r11 != r12) goto L_0x00b6
            return r12
        L_0x00b6:
            o96 r11 = (defpackage.o96) r11
            r10.a = r14
            r10.o = r0
            java.lang.Object r8 = r8.setForeground(r11, r10)
            if (r8 != r12) goto L_0x00c3
            return r12
        L_0x00c3:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x00c6:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs4.b(float, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object c(Continuation continuation) {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            ydf c = downloadFileFromWebAppWorker.c();
            a67.d(w78, "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onFileDownloadCancelled: " + c, (Throwable) null);
        }
        sv0 d = this.a.d();
        long j = this.a.c().a;
        String str = this.a.c().c;
        d.c(new zl5(j));
        this.a.v0 = qs4.a;
        return Unit.INSTANCE;
    }

    public final Unit d() {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onUrlExpired", (Throwable) null);
        }
        sv0 d = this.a.d();
        long j = this.a.c().a;
        String str = this.a.c().c;
        d.c(new bm5(j));
        return Unit.INSTANCE;
    }

    public final Unit e(boolean z, boolean z2) {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            ydf c = downloadFileFromWebAppWorker.c();
            int i = downloadFileFromWebAppWorker.Y.get();
            a67.d(w78, "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onFileDownloadInterrupted: " + c + ", isNetworkProblem:" + z + ", retryCount:" + i, (Throwable) null);
        }
        sv0 d = this.a.d();
        long j = this.a.c().a;
        String str = this.a.c().c;
        d.c(new bm5(j));
        int incrementAndGet = z ? this.a.Y.incrementAndGet() : 0;
        this.a.v0 = (!z || incrementAndGet > 10) ? new ts4(false) : new ts4(true);
        return Unit.INSTANCE;
    }

    public final Object f(File file, Continuation continuation) {
        z68.c("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onFileDownloadCompleted: %s", this.a.c());
        if (file != null) {
            this.a.d().c(new cm5(this.a.c().a, this.a.c().c));
            ((hm5) this.a.w.getValue()).b(file);
        }
        this.a.v0 = rs4.a;
        return Unit.INSTANCE;
    }

    public final String getDownloadContext() {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        long j = downloadFileFromWebAppWorker.c().b;
        long j2 = downloadFileFromWebAppWorker.c().e;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(j2);
        return sb.toString();
    }
}
