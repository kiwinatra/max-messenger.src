package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadFileFromWebAppWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "vs4", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDownloadFileFromWebAppWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadFileFromWebAppWorker.kt\nru/ok/tamtam/upload/workers/DownloadFileFromWebAppWorker\n+ 2 ConnectionInfo.kt\nru/ok/tamtam/ConnectionInfoKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n31#2:341\n32#2,5:351\n51#2:356\n52#2,6:358\n351#3,9:342\n360#3,2:364\n5#4:357\n1#5:366\n*S KotlinDebug\n*F\n+ 1 DownloadFileFromWebAppWorker.kt\nru/ok/tamtam/upload/workers/DownloadFileFromWebAppWorker\n*L\n200#1:341\n200#1:351,5\n200#1:356\n200#1:358,6\n200#1:342,9\n200#1:364,2\n200#1:357\n*E\n"})
public final class DownloadFileFromWebAppWorker extends ForegroundWorker {
    public final Lazy X = LazyKt.lazy(new ps4(this, 9));
    public final AtomicInteger Y = new AtomicInteger();
    public long Z;
    public final Lazy a = LazyKt.lazy(new ps4(this, 0));
    public final Lazy b = LazyKt.lazy(new ps4(this, 1));
    public final Lazy c = LazyKt.lazy(new ps4(this, 2));
    public final Lazy o = LazyKt.lazy(new ps4(this, 3));
    public final Lazy v = LazyKt.lazy(new ps4(this, 4));
    public volatile vs4 v0;
    public final Lazy w = LazyKt.lazy(new ps4(this, 5));
    public File w0;
    public final Lazy x = LazyKt.lazy(new ps4(this, 6));
    public final zs4 x0 = new zs4(this);
    public final Lazy y = LazyKt.lazy(new ps4(this, 7));
    public final Lazy z = LazyKt.lazy(new ps4(this, 8));

    public DownloadFileFromWebAppWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final ydf c() {
        return (ydf) this.a.getValue();
    }

    public final Object createForegroundInfo(Continuation continuation) {
        long j;
        long j2;
        float f;
        Object obj;
        PendingIntent c2 = dpg.d(getApplicationContext()).c(getId());
        vs4 vs4 = this.v0;
        us4 us4 = vs4 instanceof us4 ? (us4) vs4 : null;
        if (us4 != null) {
            f = us4.a;
            j2 = us4.b;
            j = us4.c;
        } else {
            j2 = 0;
            f = -1.0f;
            j = 0;
        }
        String string = getApplicationContext().getString(((lm5) this.x.getValue()).e);
        vk3 vk3 = (vk3) ((eu3) this.X.getValue()).c(j).a.getValue();
        String f2 = vk3 != null ? vk3.f() : null;
        lm5 lm5 = (lm5) this.x.getValue();
        try {
            Result.Companion companion = Result.Companion;
            File file = this.w0;
            if (file == null) {
                file = null;
            }
            obj = Result.m23constructorimpl(file.getName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(obj)) {
            obj = "";
        }
        String str = string + " " + obj;
        int roundToInt = MathKt.roundToInt(f);
        lm5.getClass();
        int hashCode = Long.hashCode(j);
        pwa pwa = lm5.b;
        pwa.getClass();
        zb8 zb8 = zb8.b;
        kfg kfg = kfg.FROM_NOTIFICATION;
        zb8.getClass();
        return new o96(((Number) this.b.getValue()).intValue(), lm5.a(f2, str, Long.valueOf(j2), false, roundToInt, ld9.x(lm5.a, hashCode, pwa.j(zb8.q1(j, kfg, (String) null))), c2), 1);
    }

    public final sv0 d() {
        return (sv0) this.o.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6 A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dd A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e2 A[Catch:{ all -> 0x0047 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f5 A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f7 A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010d A[Catch:{ all -> 0x0047 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0114 A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012d A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r15) {
        /*
            r14 = this;
            r0 = 2
            boolean r1 = r15 instanceof defpackage.ws4
            if (r1 == 0) goto L_0x0014
            r1 = r15
            ws4 r1 = (defpackage.ws4) r1
            int r2 = r1.o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0014
            int r2 = r2 - r3
            r1.o = r2
            goto L_0x0019
        L_0x0014:
            ws4 r1 = new ws4
            r1.<init>(r14, r15)
        L_0x0019:
            java.lang.Object r15 = r1.b
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.o
            qs4 r10 = defpackage.qs4.a
            r3 = 3
            r11 = 4
            r4 = 1
            java.lang.String r12 = "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker"
            r13 = 0
            if (r2 == 0) goto L_0x0057
            if (r2 == r4) goto L_0x0051
            if (r2 == r0) goto L_0x004a
            if (r2 == r3) goto L_0x0040
            if (r2 != r11) goto L_0x0038
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x01e6
        L_0x0038:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0040:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r14 = r1.a
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x0047 }
            goto L_0x010e
        L_0x0047:
            r15 = move-exception
            goto L_0x0193
        L_0x004a:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r14 = r1.a
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x0047 }
            goto L_0x00e3
        L_0x0051:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r14 = r1.a
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x0047 }
            goto L_0x0085
        L_0x0057:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.String r15 = "File download. doWork %s"
            ydf r2 = r14.c()     // Catch:{ all -> 0x0047 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x0047 }
            defpackage.z68.c(r12, r15, r2)     // Catch:{ all -> 0x0047 }
            kotlin.Lazy r15 = r14.y     // Catch:{ all -> 0x0047 }
            java.lang.Object r15 = r15.getValue()     // Catch:{ all -> 0x0047 }
            gaf r15 = (defpackage.gaf) r15     // Catch:{ all -> 0x0047 }
            osa r15 = (defpackage.osa) r15     // Catch:{ all -> 0x0047 }
            q04 r15 = r15.b()     // Catch:{ all -> 0x0047 }
            xs4 r2 = new xs4     // Catch:{ all -> 0x0047 }
            r2.<init>(r14, r13)     // Catch:{ all -> 0x0047 }
            r1.a = r14     // Catch:{ all -> 0x0047 }
            r1.o = r4     // Catch:{ all -> 0x0047 }
            java.lang.Object r15 = defpackage.ev0.I(r15, r2, r1)     // Catch:{ all -> 0x0047 }
            if (r15 != r9) goto L_0x0085
            return r9
        L_0x0085:
            java.io.File r15 = (java.io.File) r15     // Catch:{ all -> 0x0047 }
            r14.w0 = r15     // Catch:{ all -> 0x0047 }
            kotlin.Lazy r15 = r14.z     // Catch:{ all -> 0x0047 }
            java.lang.Object r15 = r15.getValue()     // Catch:{ all -> 0x0047 }
            rh3 r15 = (defpackage.rh3) r15     // Catch:{ all -> 0x0047 }
            r1.a = r14     // Catch:{ all -> 0x0047 }
            r1.getClass()     // Catch:{ all -> 0x0047 }
            r1.o = r0     // Catch:{ all -> 0x0047 }
            lw1 r2 = new lw1     // Catch:{ all -> 0x0047 }
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)     // Catch:{ all -> 0x0047 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x0047 }
            r2.u()     // Catch:{ all -> 0x0047 }
            boolean r4 = r15.e()     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x00b6
            kotlin.Result$Companion r15 = kotlin.Result.Companion     // Catch:{ all -> 0x0047 }
            kotlin.Unit r15 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0047 }
            java.lang.Object r15 = kotlin.Result.m23constructorimpl(r15)     // Catch:{ all -> 0x0047 }
            r2.resumeWith(r15)     // Catch:{ all -> 0x0047 }
            goto L_0x00d3
        L_0x00b6:
            th3 r4 = new th3     // Catch:{ all -> 0x0047 }
            r4.<init>(r15, r2)     // Catch:{ all -> 0x0047 }
            java.lang.Class r5 = r15.getClass()     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0047 }
            java.lang.String r6 = "Network connection lost, waiting network."
            defpackage.z68.c(r5, r6, new java.lang.Object[0])     // Catch:{ all -> 0x0047 }
            r15.c(r4)     // Catch:{ all -> 0x0047 }
            ak2 r5 = new ak2     // Catch:{ all -> 0x0047 }
            r5.<init>(r0, r15, r4)     // Catch:{ all -> 0x0047 }
            r2.k(r5)     // Catch:{ all -> 0x0047 }
        L_0x00d3:
            java.lang.Object r15 = r2.t()     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ all -> 0x0047 }
            if (r15 != r0) goto L_0x00e0
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r1)     // Catch:{ all -> 0x0047 }
        L_0x00e0:
            if (r15 != r9) goto L_0x00e3
            return r9
        L_0x00e3:
            kotlin.Lazy r15 = r14.v     // Catch:{ all -> 0x0047 }
            java.lang.Object r15 = r15.getValue()     // Catch:{ all -> 0x0047 }
            k4f r15 = (defpackage.k4f) r15     // Catch:{ all -> 0x0047 }
            ydf r0 = r14.c()     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x0047 }
            java.io.File r2 = r14.w0     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x00f7
            r4 = r13
            goto L_0x00f8
        L_0x00f7:
            r4 = r2
        L_0x00f8:
            zs4 r5 = r14.x0     // Catch:{ all -> 0x0047 }
            r1.a = r14     // Catch:{ all -> 0x0047 }
            r1.getClass()     // Catch:{ all -> 0x0047 }
            r1.o = r3     // Catch:{ all -> 0x0047 }
            l4f r2 = r15.a     // Catch:{ all -> 0x0047 }
            r6 = 0
            r7 = 1
            r3 = r0
            r8 = r1
            java.lang.Object r15 = r2.a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0047 }
            if (r15 != r9) goto L_0x010e
            return r9
        L_0x010e:
            i4f r15 = (defpackage.i4f) r15     // Catch:{ all -> 0x0047 }
            i4f r0 = defpackage.i4f.a     // Catch:{ all -> 0x0047 }
            if (r15 != r0) goto L_0x012d
            java.lang.String r15 = "File download. Process: already downloading file %s"
            ydf r0 = r14.c()     // Catch:{ all -> 0x0047 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0047 }
            defpackage.z68.c(r12, r15, r0)     // Catch:{ all -> 0x0047 }
            tk5 r15 = defpackage.tk5.a     // Catch:{ all -> 0x0047 }
            t64 r15 = r15.a()     // Catch:{ all -> 0x0047 }
            a08 r0 = new a08     // Catch:{ all -> 0x0047 }
            r0.<init>(r15)     // Catch:{ all -> 0x0047 }
            return r0
        L_0x012d:
            vs4 r15 = r14.v0     // Catch:{ all -> 0x0047 }
            boolean r0 = r15 instanceof defpackage.ts4     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x014e
            ts4 r15 = (defpackage.ts4) r15     // Catch:{ all -> 0x0047 }
            boolean r15 = r15.a     // Catch:{ all -> 0x0047 }
            if (r15 == 0) goto L_0x0140
            b08 r15 = new b08     // Catch:{ all -> 0x0047 }
            r15.<init>()     // Catch:{ all -> 0x0047 }
            goto L_0x01f1
        L_0x0140:
            tk5 r15 = defpackage.tk5.c     // Catch:{ all -> 0x0047 }
            t64 r15 = r15.a()     // Catch:{ all -> 0x0047 }
            a08 r0 = new a08     // Catch:{ all -> 0x0047 }
            r0.<init>(r15)     // Catch:{ all -> 0x0047 }
        L_0x014b:
            r15 = r0
            goto L_0x01f1
        L_0x014e:
            ss4 r0 = defpackage.ss4.a     // Catch:{ all -> 0x0047 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r0)     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0162
            tk5 r15 = defpackage.tk5.o     // Catch:{ all -> 0x0047 }
            t64 r15 = r15.a()     // Catch:{ all -> 0x0047 }
            a08 r0 = new a08     // Catch:{ all -> 0x0047 }
            r0.<init>(r15)     // Catch:{ all -> 0x0047 }
            goto L_0x014b
        L_0x0162:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r10)     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0174
            tk5 r15 = defpackage.tk5.v     // Catch:{ all -> 0x0047 }
            t64 r15 = r15.a()     // Catch:{ all -> 0x0047 }
            a08 r0 = new a08     // Catch:{ all -> 0x0047 }
            r0.<init>(r15)     // Catch:{ all -> 0x0047 }
            goto L_0x014b
        L_0x0174:
            rs4 r0 = defpackage.rs4.a     // Catch:{ all -> 0x0047 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r0)     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x018e
            if (r15 != 0) goto L_0x017f
            goto L_0x018e
        L_0x017f:
            boolean r15 = r15 instanceof defpackage.us4     // Catch:{ all -> 0x0047 }
            if (r15 == 0) goto L_0x0188
            c08 r15 = defpackage.d08.b()     // Catch:{ all -> 0x0047 }
            goto L_0x01f1
        L_0x0188:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0047 }
            r15.<init>()     // Catch:{ all -> 0x0047 }
            throw r15     // Catch:{ all -> 0x0047 }
        L_0x018e:
            c08 r15 = defpackage.d08.b()     // Catch:{ all -> 0x0047 }
            goto L_0x01f1
        L_0x0193:
            java.lang.String r0 = "File download. Cancelled!"
            defpackage.z68.o(r12, r0, r15)
            r1.a = r13
            r1.getClass()
            r1.o = r11
            java.io.File r15 = r14.w0
            if (r15 != 0) goto L_0x01a4
            r15 = r13
        L_0x01a4:
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.lang.String r0 = "File download. CancelLoading: %s"
            defpackage.z68.c(r12, r0, r15)
            sv0 r15 = r14.d()
            zl5 r0 = new zl5
            ydf r2 = r14.c()
            long r2 = r2.a
            ydf r4 = r14.c()
            java.lang.String r4 = r4.c
            r0.<init>(r2)
            r15.c(r0)
            r14.v0 = r10
            kotlin.Lazy r15 = r14.v
            java.lang.Object r15 = r15.getValue()
            k4f r15 = (defpackage.k4f) r15
            java.io.File r14 = r14.w0
            if (r14 != 0) goto L_0x01d4
            r14 = r13
        L_0x01d4:
            l4f r15 = r15.a
            java.lang.Object r14 = r15.b(r14, r13, r1)
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r14 != r15) goto L_0x01e1
            goto L_0x01e3
        L_0x01e1:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
        L_0x01e3:
            if (r14 != r9) goto L_0x01e6
            return r9
        L_0x01e6:
            tk5 r14 = defpackage.tk5.v
            t64 r14 = r14.a()
            a08 r15 = new a08
            r15.<init>(r14)
        L_0x01f1:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final q04 getCoroutineContext() {
        return (q04) ((osa) ((gaf) this.y.getValue())).e.getValue();
    }

    public final String getName() {
        String e = getInputData().e("taskName");
        return e == null ? "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker" : e;
    }

    public final long getWorkDelay() {
        return 500;
    }

    public final Object onStopWork(Continuation continuation) {
        z68.c("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "File download. OnStopWork", new Object[0]);
        sv0 d = d();
        long j = c().a;
        String str = c().c;
        d.c(new zl5(j));
        this.v0 = qs4.a;
        k4f k4f = (k4f) this.v.getValue();
        File file = this.w0;
        if (file == null) {
            file = null;
        }
        Object c2 = k4f.a.c(file, (String) null, continuation);
        return c2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c2 : Unit.INSTANCE;
    }
}
