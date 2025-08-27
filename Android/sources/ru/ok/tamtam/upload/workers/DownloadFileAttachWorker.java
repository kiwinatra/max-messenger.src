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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadFileAttachWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "hs4", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDownloadFileAttachWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadFileAttachWorker.kt\nru/ok/tamtam/upload/workers/DownloadFileAttachWorker\n+ 2 ConnectionInfo.kt\nru/ok/tamtam/ConnectionInfoKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,566:1\n31#2:567\n32#2,5:577\n51#2:582\n52#2,6:584\n351#3,9:568\n360#3,2:590\n5#4:583\n1#5:592\n*S KotlinDebug\n*F\n+ 1 DownloadFileAttachWorker.kt\nru/ok/tamtam/upload/workers/DownloadFileAttachWorker\n*L\n306#1:567\n306#1:577,5\n306#1:582\n306#1:584,6\n306#1:568,9\n306#1:590,2\n306#1:583\n*E\n"})
public final class DownloadFileAttachWorker extends ForegroundWorker {
    public int A0;
    public long B0;
    public volatile hs4 C0;
    public File D0;
    public final ns4 E0 = new ns4(this);
    public final Lazy X = LazyKt.lazy(new zr4(this, 6));
    public final Lazy Y = LazyKt.lazy(new zr4(this, 7));
    public final Lazy Z = LazyKt.lazy(new zr4(this, 8));
    public final Lazy a = LazyKt.lazy(new zr4(this, 0));
    public final Lazy b = LazyKt.lazy(new zr4(this, 13));
    public final Lazy c = LazyKt.lazy(new zr4(this, 14));
    public final Lazy o = LazyKt.lazy(new zr4(this, 15));
    public final Lazy v = LazyKt.lazy(new zr4(this, 1));
    public final Lazy v0 = LazyKt.lazy(new zr4(this, 9));
    public final Lazy w = LazyKt.lazy(new zr4(this, 2));
    public final Lazy w0 = LazyKt.lazy(new zr4(this, 10));
    public final Lazy x = LazyKt.lazy(new zr4(this, 3));
    public final Lazy x0 = LazyKt.lazy(new zr4(this, 11));
    public final Lazy y = LazyKt.lazy(new zr4(this, 4));
    public final Lazy y0 = LazyKt.lazy(new zr4(this, 12));
    public final Lazy z = LazyKt.lazy(new zr4(this, 5));
    public final AtomicInteger z0 = new AtomicInteger();

    public DownloadFileAttachWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final Object c(ContinuationImpl continuationImpl) {
        File file = this.D0;
        File file2 = null;
        if (file == null) {
            file = null;
        }
        z68.c("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "File download. CancelLoading: %s", file);
        k4f k4f = (k4f) this.w.getValue();
        File file3 = this.D0;
        if (file3 != null) {
            file2 = file3;
        }
        Object b2 = k4f.a.b(file2, g().b, continuationImpl);
        return b2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b2 : Unit.INSTANCE;
    }

    public final Object createForegroundInfo(Continuation continuation) {
        long j;
        long j2;
        float f;
        Object obj;
        PendingIntent c2 = dpg.d(getApplicationContext()).c(getId());
        hs4 hs4 = this.C0;
        File file = null;
        fs4 fs4 = hs4 instanceof fs4 ? (fs4) hs4 : null;
        if (fs4 != null) {
            f = fs4.a;
            long j3 = fs4.b;
            j2 = fs4.c;
            j = j3;
        } else {
            j2 = 0;
            f = -1.0f;
            j = 0;
        }
        a32 G = ((r62) this.v.getValue()).G(j2);
        String string = getApplicationContext().getString(((lm5) this.v0.getValue()).e);
        lm5 lm5 = (lm5) this.v0.getValue();
        Long boxLong = Boxing.boxLong(j);
        Long boxLong2 = Boxing.boxLong(g().a);
        String r = G != null ? G.r() : null;
        try {
            Result.Companion companion = Result.Companion;
            File file2 = this.D0;
            if (file2 != null) {
                file = file2;
            }
            obj = Result.m23constructorimpl(file.getName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(obj)) {
            obj = "";
        }
        return new o96(((Number) this.b.getValue()).intValue(), lm5.b(j2, boxLong, boxLong2, r, string + " " + obj, MathKt.roundToInt(f), false, c2), 1);
    }

    public final ln5 d() {
        return (ln5) this.c.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[Catch:{ all -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093 A[Catch:{ all -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0101 A[Catch:{ all -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0103 A[Catch:{ all -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0123 A[Catch:{ all -> 0x0045 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012a A[Catch:{ all -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0143 A[Catch:{ all -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r14) {
        /*
            r13 = this;
            r0 = 2
            boolean r1 = r14 instanceof defpackage.is4
            if (r1 == 0) goto L_0x0014
            r1 = r14
            is4 r1 = (defpackage.is4) r1
            int r2 = r1.o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0014
            int r2 = r2 - r3
            r1.o = r2
            goto L_0x0019
        L_0x0014:
            is4 r1 = new is4
            r1.<init>(r13, r14)
        L_0x0019:
            java.lang.Object r14 = r1.b
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.o
            r3 = 3
            java.lang.String r10 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            r11 = 4
            r4 = 1
            r12 = 0
            if (r2 == 0) goto L_0x0055
            if (r2 == r4) goto L_0x004f
            if (r2 == r0) goto L_0x0048
            if (r2 == r3) goto L_0x003e
            if (r2 != r11) goto L_0x0036
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x01b6
        L_0x0036:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003e:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r13 = r1.a
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x0045 }
            goto L_0x0124
        L_0x0045:
            r14 = move-exception
            goto L_0x01a3
        L_0x0048:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r13 = r1.a
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x0045 }
            goto L_0x00ef
        L_0x004f:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r13 = r1.a
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x0045 }
            goto L_0x0083
        L_0x0055:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.String r14 = "File download. doWork %s"
            pdf r2 = r13.g()     // Catch:{ all -> 0x0045 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x0045 }
            defpackage.z68.c(r10, r14, r2)     // Catch:{ all -> 0x0045 }
            kotlin.Lazy r14 = r13.w0     // Catch:{ all -> 0x0045 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ all -> 0x0045 }
            gaf r14 = (defpackage.gaf) r14     // Catch:{ all -> 0x0045 }
            osa r14 = (defpackage.osa) r14     // Catch:{ all -> 0x0045 }
            q04 r14 = r14.b()     // Catch:{ all -> 0x0045 }
            js4 r2 = new js4     // Catch:{ all -> 0x0045 }
            r2.<init>(r13, r12)     // Catch:{ all -> 0x0045 }
            r1.a = r13     // Catch:{ all -> 0x0045 }
            r1.o = r4     // Catch:{ all -> 0x0045 }
            java.lang.Object r14 = defpackage.ev0.I(r14, r2, r1)     // Catch:{ all -> 0x0045 }
            if (r14 != r9) goto L_0x0083
            return r9
        L_0x0083:
            java.io.File r14 = (java.io.File) r14     // Catch:{ all -> 0x0045 }
            if (r14 != 0) goto L_0x0093
            tk5 r14 = defpackage.tk5.b     // Catch:{ all -> 0x0045 }
            t64 r14 = r14.a()     // Catch:{ all -> 0x0045 }
            a08 r0 = new a08     // Catch:{ all -> 0x0045 }
            r0.<init>(r14)     // Catch:{ all -> 0x0045 }
            return r0
        L_0x0093:
            r13.D0 = r14     // Catch:{ all -> 0x0045 }
            kotlin.Lazy r14 = r13.x0     // Catch:{ all -> 0x0045 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ all -> 0x0045 }
            rh3 r14 = (defpackage.rh3) r14     // Catch:{ all -> 0x0045 }
            r1.a = r13     // Catch:{ all -> 0x0045 }
            r1.getClass()     // Catch:{ all -> 0x0045 }
            r1.o = r0     // Catch:{ all -> 0x0045 }
            lw1 r2 = new lw1     // Catch:{ all -> 0x0045 }
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)     // Catch:{ all -> 0x0045 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x0045 }
            r2.u()     // Catch:{ all -> 0x0045 }
            boolean r4 = r14.e()     // Catch:{ all -> 0x0045 }
            if (r4 == 0) goto L_0x00c2
            kotlin.Result$Companion r14 = kotlin.Result.Companion     // Catch:{ all -> 0x0045 }
            kotlin.Unit r14 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0045 }
            java.lang.Object r14 = kotlin.Result.m23constructorimpl(r14)     // Catch:{ all -> 0x0045 }
            r2.resumeWith(r14)     // Catch:{ all -> 0x0045 }
            goto L_0x00df
        L_0x00c2:
            th3 r4 = new th3     // Catch:{ all -> 0x0045 }
            r4.<init>(r14, r2)     // Catch:{ all -> 0x0045 }
            java.lang.Class r5 = r14.getClass()     // Catch:{ all -> 0x0045 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0045 }
            java.lang.String r6 = "Network connection lost, waiting network."
            defpackage.z68.c(r5, r6, new java.lang.Object[0])     // Catch:{ all -> 0x0045 }
            r14.c(r4)     // Catch:{ all -> 0x0045 }
            ak2 r5 = new ak2     // Catch:{ all -> 0x0045 }
            r5.<init>(r0, r14, r4)     // Catch:{ all -> 0x0045 }
            r2.k(r5)     // Catch:{ all -> 0x0045 }
        L_0x00df:
            java.lang.Object r14 = r2.t()     // Catch:{ all -> 0x0045 }
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ all -> 0x0045 }
            if (r14 != r0) goto L_0x00ec
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r1)     // Catch:{ all -> 0x0045 }
        L_0x00ec:
            if (r14 != r9) goto L_0x00ef
            return r9
        L_0x00ef:
            kotlin.Lazy r14 = r13.w     // Catch:{ all -> 0x0045 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ all -> 0x0045 }
            k4f r14 = (defpackage.k4f) r14     // Catch:{ all -> 0x0045 }
            pdf r0 = r13.g()     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = r0.g     // Catch:{ all -> 0x0045 }
            java.io.File r2 = r13.D0     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x0103
            r4 = r12
            goto L_0x0104
        L_0x0103:
            r4 = r2
        L_0x0104:
            ns4 r5 = r13.E0     // Catch:{ all -> 0x0045 }
            pdf r2 = r13.g()     // Catch:{ all -> 0x0045 }
            java.lang.String r6 = r2.b     // Catch:{ all -> 0x0045 }
            pdf r2 = r13.g()     // Catch:{ all -> 0x0045 }
            boolean r7 = r2.m     // Catch:{ all -> 0x0045 }
            r1.a = r13     // Catch:{ all -> 0x0045 }
            r1.getClass()     // Catch:{ all -> 0x0045 }
            r1.o = r3     // Catch:{ all -> 0x0045 }
            l4f r2 = r14.a     // Catch:{ all -> 0x0045 }
            r3 = r0
            r8 = r1
            java.lang.Object r14 = r2.a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0045 }
            if (r14 != r9) goto L_0x0124
            return r9
        L_0x0124:
            i4f r14 = (defpackage.i4f) r14     // Catch:{ all -> 0x0045 }
            i4f r0 = defpackage.i4f.a     // Catch:{ all -> 0x0045 }
            if (r14 != r0) goto L_0x0143
            java.lang.String r14 = "File download. Process: already downloading file %s"
            pdf r0 = r13.g()     // Catch:{ all -> 0x0045 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0045 }
            defpackage.z68.c(r10, r14, r0)     // Catch:{ all -> 0x0045 }
            tk5 r14 = defpackage.tk5.a     // Catch:{ all -> 0x0045 }
            t64 r14 = r14.a()     // Catch:{ all -> 0x0045 }
            a08 r0 = new a08     // Catch:{ all -> 0x0045 }
            r0.<init>(r14)     // Catch:{ all -> 0x0045 }
            return r0
        L_0x0143:
            hs4 r14 = r13.C0     // Catch:{ all -> 0x0045 }
            boolean r0 = r14 instanceof defpackage.es4     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0162
            es4 r14 = (defpackage.es4) r14     // Catch:{ all -> 0x0045 }
            boolean r14 = r14.a     // Catch:{ all -> 0x0045 }
            if (r14 == 0) goto L_0x0155
            b08 r14 = new b08     // Catch:{ all -> 0x0045 }
            r14.<init>()     // Catch:{ all -> 0x0045 }
            goto L_0x01c1
        L_0x0155:
            tk5 r14 = defpackage.tk5.c     // Catch:{ all -> 0x0045 }
            t64 r14 = r14.a()     // Catch:{ all -> 0x0045 }
            a08 r0 = new a08     // Catch:{ all -> 0x0045 }
            r0.<init>(r14)     // Catch:{ all -> 0x0045 }
        L_0x0160:
            r14 = r0
            goto L_0x01c1
        L_0x0162:
            ds4 r0 = defpackage.ds4.a     // Catch:{ all -> 0x0045 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r0)     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0176
            tk5 r14 = defpackage.tk5.o     // Catch:{ all -> 0x0045 }
            t64 r14 = r14.a()     // Catch:{ all -> 0x0045 }
            a08 r0 = new a08     // Catch:{ all -> 0x0045 }
            r0.<init>(r14)     // Catch:{ all -> 0x0045 }
            goto L_0x0160
        L_0x0176:
            bs4 r0 = defpackage.bs4.a     // Catch:{ all -> 0x0045 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r0)     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x018a
            tk5 r14 = defpackage.tk5.v     // Catch:{ all -> 0x0045 }
            t64 r14 = r14.a()     // Catch:{ all -> 0x0045 }
            a08 r0 = new a08     // Catch:{ all -> 0x0045 }
            r0.<init>(r14)     // Catch:{ all -> 0x0045 }
            goto L_0x0160
        L_0x018a:
            gs4 r0 = defpackage.gs4.a     // Catch:{ all -> 0x0045 }
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r0)     // Catch:{ all -> 0x0045 }
            if (r14 == 0) goto L_0x019e
            tk5 r14 = defpackage.tk5.w     // Catch:{ all -> 0x0045 }
            t64 r14 = r14.a()     // Catch:{ all -> 0x0045 }
            a08 r0 = new a08     // Catch:{ all -> 0x0045 }
            r0.<init>(r14)     // Catch:{ all -> 0x0045 }
            goto L_0x0160
        L_0x019e:
            c08 r14 = defpackage.d08.b()     // Catch:{ all -> 0x0045 }
            goto L_0x01c1
        L_0x01a3:
            java.lang.String r0 = "File download. Cancelled!"
            defpackage.z68.o(r10, r0, r14)
            r1.a = r12
            r1.getClass()
            r1.o = r11
            java.lang.Object r13 = r13.c(r1)
            if (r13 != r9) goto L_0x01b6
            return r9
        L_0x01b6:
            tk5 r13 = defpackage.tk5.v
            t64 r13 = r13.a()
            a08 r14 = new a08
            r14.<init>(r13)
        L_0x01c1:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileAttachWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final fa9 e() {
        return (fa9) this.o.getValue();
    }

    public final pdf g() {
        return (pdf) this.a.getValue();
    }

    public final q04 getCoroutineContext() {
        return (q04) ((osa) ((gaf) this.w0.getValue())).e.getValue();
    }

    public final String getName() {
        String e = getInputData().e("taskName");
        return e == null ? "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker" : e;
    }

    public final long getWorkDelay() {
        return 500;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(defpackage.ha9 r20, defpackage.d20 r21, int r22, long r23, long r25, java.io.File r27, kotlin.coroutines.Continuation r28) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r10 = r22
            r2 = r28
            boolean r3 = r2 instanceof defpackage.os4
            if (r3 == 0) goto L_0x001b
            r3 = r2
            os4 r3 = (defpackage.os4) r3
            int r4 = r3.w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001b
            int r4 = r4 - r5
            r3.w = r4
            goto L_0x0020
        L_0x001b:
            os4 r3 = new os4
            r3.<init>(r0, r2)
        L_0x0020:
            java.lang.Object r2 = r3.o
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.w
            r6 = 1
            if (r5 == 0) goto L_0x0042
            if (r5 != r6) goto L_0x003a
            long r0 = r3.c
            ha9 r4 = r3.b
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r3 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            r12 = r0
            r0 = r3
            r1 = r4
            goto L_0x0084
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r2)
            if (r1 == 0) goto L_0x0138
            qe9 r2 = r1.Y
            qe9 r5 = defpackage.qe9.DELETED
            if (r2 != r5) goto L_0x004f
            goto L_0x0138
        L_0x004f:
            pdf r2 = r19.g()
            java.lang.String r2 = r2.b
            l20 r11 = defpackage.ld8.B(r1, r2)
            if (r11 != 0) goto L_0x005e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x005e:
            d20 r2 = r11.n
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x009d
            boolean r2 = r21.a()
            if (r2 != 0) goto L_0x009d
            java.lang.String r2 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            java.lang.String r5 = "File download. updateAttachStatus: cancelled!"
            defpackage.z68.p(r2, r5)
            r3.a = r0
            r3.b = r1
            r12 = r25
            r3.c = r12
            r3.w = r6
            java.lang.Object r2 = r0.c(r3)
            if (r2 != r4) goto L_0x0084
            return r4
        L_0x0084:
            bs4 r2 = defpackage.bs4.a
            r0.C0 = r2
            kotlin.Lazy r0 = r0.y0
            java.lang.Object r0 = r0.getValue()
            h00 r0 = (defpackage.h00) r0
            bqc r2 = new bqc
            long r3 = r1.b
            r2.<init>(r3, r12)
            r0.a(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x009d:
            r12 = r25
            r0.A0 = r10
            fa9 r14 = r19.e()
            pdf r2 = r19.g()
            long r7 = r2.a
            java.lang.String r15 = r11.q
            as4 r9 = new as4
            r2 = r9
            r3 = r21
            r4 = r22
            r5 = r23
            r12 = r7
            r7 = r25
            r10 = r9
            r9 = r27
            r2.<init>(r3, r4, r5, r7, r9)
            r14.x(r12, r15, r10)
            int r2 = r21.ordinal()
            r3 = 2
            if (r2 == r3) goto L_0x0104
            r3 = 4
            if (r2 == r3) goto L_0x00e1
            kotlin.Lazy r2 = r0.y0
            java.lang.Object r2 = r2.getValue()
            h00 r2 = (defpackage.h00) r2
            bqc r3 = new bqc
            long r4 = r1.b
            long r6 = r11.t
            r3.<init>(r4, r6)
            r2.a(r3)
            goto L_0x0118
        L_0x00e1:
            kotlin.Lazy r2 = r0.y0
            java.lang.Object r2 = r2.getValue()
            h00 r2 = (defpackage.h00) r2
            long r8 = r1.b
            s10 r3 = r11.j
            long r12 = r3.a
            r4 = r22
            float r14 = (float) r4
            long r3 = r3.b
            aqc r5 = new aqc
            r7 = r5
            r10 = r25
            r15 = r23
            r17 = r3
            r7.<init>(r8, r10, r12, r14, r15, r17)
            r2.a(r5)
            goto L_0x0118
        L_0x0104:
            kotlin.Lazy r2 = r0.y0
            java.lang.Object r2 = r2.getValue()
            h00 r2 = (defpackage.h00) r2
            cqc r3 = new cqc
            long r4 = r1.b
            long r6 = r11.t
            r3.<init>(r4, r6)
            r2.a(r3)
        L_0x0118:
            kotlin.Lazy r0 = r0.Y
            java.lang.Object r0 = r0.getValue()
            sv0 r0 = (defpackage.sv0) r0
            twf r2 = new twf
            long r3 = r1.z
            long r5 = r1.b
            r1 = 0
            r19 = r2
            r20 = r1
            r21 = r3
            r23 = r5
            r19.<init>(r20, r21, r23)
            r0.c(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0138:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileAttachWorker.h(ha9, d20, int, long, long, java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object onStopWork(Continuation continuation) {
        z68.c("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "File download. OnStopWork", new Object[0]);
        k4f k4f = (k4f) this.w.getValue();
        File file = this.D0;
        if (file == null) {
            file = null;
        }
        Object c2 = k4f.a.c(file, g().b, continuation);
        return c2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c2 : Unit.INSTANCE;
    }
}
