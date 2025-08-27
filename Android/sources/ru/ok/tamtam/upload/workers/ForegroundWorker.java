package ru.ok.tamtam.upload.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000  2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H@¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00158\u0014XD¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lo96;", "getForegroundInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "newProgress", "", "needToShowNotification", "(F)Z", "Ld08;", "doWork", "La6a;", "needUpdateWorkerProgressNotifUseCase", "La6a;", "", "startTime", "J", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isGetForegroundInfoCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "oldProgress", "F", "workDelay", "getWorkDelay", "()J", "Companion", "s96", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public abstract class ForegroundWorker extends SdkCoroutineWorker {
    public static final s96 Companion = new Object();
    private static final long WORK_DELAY = 1000;
    private AtomicBoolean isGetForegroundInfoCalled = new AtomicBoolean(false);
    private final a6a needUpdateWorkerProgressNotifUseCase = new a6a(hsg.j(new u75(10, this)));
    private float oldProgress;
    private long startTime;
    private final long workDelay = WORK_DELAY;

    public ForegroundWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract Object createForegroundInfo(Continuation continuation);

    public abstract Object doForegroundWork(Continuation continuation);

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super defpackage.d08> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.t96
            if (r0 == 0) goto L_0x0013
            r0 = r7
            t96 r0 = (defpackage.t96) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            t96 r0 = new t96
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            ru.ok.tamtam.upload.workers.ForegroundWorker r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0058
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r7)
            long r4 = java.lang.System.currentTimeMillis()
            r6.startTime = r4
            z9f r7 = r6.getTamComponent()
            sjd r7 = (defpackage.sjd) r7
            fn4 r7 = r7.k()
            java.lang.String r2 = r6.getName()
            r7.f(r2)
            r0.a = r6
            r0.o = r3
            java.lang.Object r7 = r6.doForegroundWork(r0)
            if (r7 != r1) goto L_0x0058
            return r1
        L_0x0058:
            d08 r7 = (defpackage.d08) r7
            z9f r0 = r6.getTamComponent()
            sjd r0 = (defpackage.sjd) r0
            fn4 r0 = r0.k()
            java.lang.String r6 = r6.getName()
            r0.g(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.ForegroundWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getForegroundInfo(kotlin.coroutines.Continuation<? super defpackage.o96> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.u96
            if (r0 == 0) goto L_0x0013
            r0 = r5
            u96 r0 = (defpackage.u96) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            u96 r0 = new u96
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            ru.ok.tamtam.upload.workers.ForegroundWorker r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0046
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.isGetForegroundInfoCalled
            r5.set(r3)
            r0.a = r4
            r0.o = r3
            java.lang.Object r5 = r4.createForegroundInfo(r0)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            o96 r5 = (defpackage.o96) r5
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "foreground info = %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            defpackage.z68.c(r4, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.ForegroundWorker.getForegroundInfo(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract String getName();

    public long getWorkDelay() {
        return this.workDelay;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
        if ((java.lang.System.currentTimeMillis() - r4) > r0.r(ru.ok.tamtam.android.prefs.PmsKey.f129workerprogresstimedifffornotifyms, androidx.work.WorkRequest.MIN_BACKOFF_MILLIS)) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean needToShowNotification(float r11) {
        /*
            r10 = this;
            boolean r0 = java.lang.Float.isNaN(r11)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.isGetForegroundInfoCalled
            boolean r0 = r0.get()
            java.lang.String r2 = r10.getName()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "needToShowNotification: 1 %b"
            defpackage.z68.c(r2, r4, r3)
            if (r0 == 0) goto L_0x0037
            int r2 = kotlin.math.MathKt.roundToInt((float) r11)
            float r3 = r10.oldProgress
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            if (r2 != r3) goto L_0x0037
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "needToShowNotification: 2 – needToShow && newProgress.roundToInt() == oldProgress.roundToInt()"
            defpackage.z68.c(r10, r11, new java.lang.Object[0])
            return r1
        L_0x0037:
            r2 = 1
            if (r0 != 0) goto L_0x00a2
            a6a r0 = r10.needUpdateWorkerProgressNotifUseCase
            float r3 = r10.oldProgress
            long r4 = r10.startTime
            r0.getClass()
            r6 = 0
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00a3
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x00a3
            int r6 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0051
            goto L_0x00a3
        L_0x0051:
            int r6 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a3
            int r6 = kotlin.math.MathKt.roundToInt((float) r11)
            if (r2 > r6) goto L_0x00a3
            r7 = 101(0x65, float:1.42E-43)
            if (r6 >= r7) goto L_0x00a3
            float r3 = r11 - r3
            kotlin.reflect.KProperty[] r6 = defpackage.a6a.b
            r7 = r6[r1]
            hs7 r0 = r0.a
            java.lang.Object r7 = r0.get()
            bud r7 = (defpackage.bud) r7
            akd r7 = (defpackage.akd) r7
            r7.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r8 = ru.ok.tamtam.android.prefs.PmsKey.f92progressdifffornotify
            java.lang.String r8 = r8.name()
            ls7 r7 = r7.g
            r9 = 1101004800(0x41a00000, float:20.0)
            float r7 = r7.getFloat(r8, r9)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a2
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r4
            r3 = r6[r1]
            java.lang.Object r0 = r0.get()
            bud r0 = (defpackage.bud) r0
            akd r0 = (defpackage.akd) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r3 = ru.ok.tamtam.android.prefs.PmsKey.f129workerprogresstimedifffornotifyms
            r4 = 10000(0x2710, double:4.9407E-320)
            long r3 = r0.r(r3, r4)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a3
        L_0x00a2:
            r1 = r2
        L_0x00a3:
            java.lang.String r0 = r10.getName()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            float r3 = r10.oldProgress
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Float r4 = java.lang.Float.valueOf(r11)
            long r5 = r10.startTime
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5}
            java.lang.String r3 = "needToShowNotification: 3 %b, oldProgress = %f, newProgress = %f, startTime = %d"
            defpackage.z68.c(r0, r3, r2)
            r10.oldProgress = r11
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.ForegroundWorker.needToShowNotification(float):boolean");
    }
}
