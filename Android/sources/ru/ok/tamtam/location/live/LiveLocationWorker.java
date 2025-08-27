package ru.ok.tamtam.location.live;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/location/live/LiveLocationWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class LiveLocationWorker extends SdkCoroutineWorker {
    public final Lazy a = LazyKt.lazy(new v18(this, 0));
    public final Lazy b = LazyKt.lazy(new v18(this, 1));
    public final Lazy c = LazyKt.lazy(new v18(this, 2));

    public LiveLocationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final long c() {
        return ((Number) this.a.getValue()).longValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0133 A[Catch:{ all -> 0x0134, all -> 0x00a3 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.w18
            if (r0 == 0) goto L_0x0013
            r0 = r14
            w18 r0 = (defpackage.w18) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            w18 r0 = new w18
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            java.lang.String r4 = "LIVE_LOCATION_WORKER"
            r5 = 3
            r6 = 2
            if (r2 == 0) goto L_0x0065
            if (r2 == r3) goto L_0x0051
            if (r2 == r6) goto L_0x0046
            if (r2 != r5) goto L_0x003e
            java.lang.String r13 = r0.b
            ru.ok.tamtam.location.live.LiveLocationWorker r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x0038 }
            r14 = r13
            r13 = r2
            goto L_0x00a6
        L_0x0038:
            r14 = move-exception
            r0 = r14
            r14 = r13
            r13 = r2
            goto L_0x013d
        L_0x003e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0046:
            java.lang.String r13 = r0.b
            ru.ok.tamtam.location.live.LiveLocationWorker r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x0038 }
            r14 = r13
            r13 = r2
            goto L_0x0125
        L_0x0051:
            ru.ok.tamtam.location.live.LiveLocationWorker r13 = r0.c
            java.lang.String r2 = r0.b
            ru.ok.tamtam.location.live.LiveLocationWorker r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x005f }
            r12 = r2
            r2 = r14
            r14 = r12
            goto L_0x0112
        L_0x005f:
            r14 = move-exception
            r0 = r14
            r14 = r2
        L_0x0062:
            r13 = r7
            goto L_0x013d
        L_0x0065:
            kotlin.ResultKt.throwOnFailure(r14)
            t64 r14 = r13.getInputData()
            java.lang.String r2 = "workName"
            java.lang.String r14 = r14.e(r2)
            if (r14 != 0) goto L_0x0075
            r14 = r4
        L_0x0075:
            java.lang.String r2 = "doWork"
            defpackage.z68.c(r14, r2, new java.lang.Object[0])
            z9f r2 = r13.getTamComponent()
            sjd r2 = (defpackage.sjd) r2
            fn4 r2 = r2.k()
            r2.f(r14)
            long r7 = r13.c()     // Catch:{ all -> 0x00a3 }
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x00a6
            z9f r0 = r13.getTamComponent()     // Catch:{ all -> 0x00a3 }
            sjd r0 = (defpackage.sjd) r0     // Catch:{ all -> 0x00a3 }
            fn4 r0 = r0.k()     // Catch:{ all -> 0x00a3 }
            r0.g(r14)     // Catch:{ all -> 0x00a3 }
            a08 r13 = defpackage.d08.a()     // Catch:{ all -> 0x00a3 }
            return r13
        L_0x00a3:
            r0 = move-exception
            goto L_0x013d
        L_0x00a6:
            boolean r2 = r13.isStopped()     // Catch:{ all -> 0x00a3 }
            if (r2 != 0) goto L_0x0138
            r2 = 0
            kotlin.Lazy r7 = r13.c     // Catch:{ all -> 0x00e7 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x00e7 }
            d18 r7 = (defpackage.d18) r7     // Catch:{ all -> 0x00e7 }
            long r8 = r13.c()     // Catch:{ all -> 0x00e7 }
            j18 r7 = (defpackage.j18) r7     // Catch:{ all -> 0x00e7 }
            jtb r10 = r7.X     // Catch:{ all -> 0x00e7 }
            ltb r10 = (defpackage.ltb) r10     // Catch:{ all -> 0x00e7 }
            a33 r10 = r10.a     // Catch:{ all -> 0x00e7 }
            long r10 = r10.m()     // Catch:{ all -> 0x00e7 }
            cc2 r7 = r7.z     // Catch:{ all -> 0x00e7 }
            wh8 r7 = r7.b(r8, r10)     // Catch:{ all -> 0x00e7 }
            hi8 r8 = new hi8     // Catch:{ all -> 0x00e7 }
            r8.<init>(r7)     // Catch:{ all -> 0x00e7 }
            n77 r7 = new n77     // Catch:{ all -> 0x00e7 }
            r9 = 11
            r7.<init>(r9)     // Catch:{ all -> 0x00e7 }
            wbe r7 = r8.i(r7)     // Catch:{ all -> 0x00e7 }
            java.lang.Object r7 = r7.f()     // Catch:{ all -> 0x00e7 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00e7 }
            if (r7 == 0) goto L_0x00e7
            boolean r2 = r7.booleanValue()     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            if (r2 == 0) goto L_0x0138
            z9f r2 = r13.getTamComponent()     // Catch:{ all -> 0x00a3 }
            sjd r2 = (defpackage.sjd) r2     // Catch:{ all -> 0x00a3 }
            jtb r2 = r2.u()     // Catch:{ all -> 0x00a3 }
            ltb r2 = (defpackage.ltb) r2     // Catch:{ all -> 0x00a3 }
            cud r2 = r2.b     // Catch:{ all -> 0x00a3 }
            r2.getClass()     // Catch:{ all -> 0x00a3 }
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f55livelocationenabled     // Catch:{ all -> 0x00a3 }
            boolean r2 = r2.m(r7, r3)     // Catch:{ all -> 0x00a3 }
            if (r2 == 0) goto L_0x0138
            r0.a = r13     // Catch:{ all -> 0x00a3 }
            r0.b = r14     // Catch:{ all -> 0x00a3 }
            r0.c = r13     // Catch:{ all -> 0x00a3 }
            r0.w = r3     // Catch:{ all -> 0x00a3 }
            java.lang.Object r2 = r13.getForegroundInfo(r0)     // Catch:{ all -> 0x00a3 }
            if (r2 != r1) goto L_0x0111
            return r1
        L_0x0111:
            r7 = r13
        L_0x0112:
            o96 r2 = (defpackage.o96) r2     // Catch:{ all -> 0x0134 }
            r0.a = r7     // Catch:{ all -> 0x0134 }
            r0.b = r14     // Catch:{ all -> 0x0134 }
            r8 = 0
            r0.c = r8     // Catch:{ all -> 0x0134 }
            r0.w = r6     // Catch:{ all -> 0x0134 }
            java.lang.Object r13 = r13.setForeground(r2, r0)     // Catch:{ all -> 0x0134 }
            if (r13 != r1) goto L_0x0124
            return r1
        L_0x0124:
            r13 = r7
        L_0x0125:
            r0.a = r13     // Catch:{ all -> 0x00a3 }
            r0.b = r14     // Catch:{ all -> 0x00a3 }
            r0.w = r5     // Catch:{ all -> 0x00a3 }
            r7 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r2 = defpackage.xk4.b(r7, r0)     // Catch:{ all -> 0x00a3 }
            if (r2 != r1) goto L_0x00a6
            return r1
        L_0x0134:
            r13 = move-exception
            r0 = r13
            goto L_0x0062
        L_0x0138:
            c08 r0 = defpackage.d08.b()     // Catch:{ all -> 0x00a3 }
            goto L_0x015b
        L_0x013d:
            java.lang.String r1 = "failure!"
            defpackage.z68.f(r4, r1, r0)
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x0157
            kotlin.Lazy r0 = r13.c
            java.lang.Object r0 = r0.getValue()
            d18 r0 = (defpackage.d18) r0
            long r1 = r13.c()
            j18 r0 = (defpackage.j18) r0
            r0.m(r1)
        L_0x0157:
            a08 r0 = defpackage.d08.a()
        L_0x015b:
            z9f r13 = r13.getTamComponent()
            sjd r13 = (defpackage.sjd) r13
            fn4 r13 = r13.k()
            r13.g(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.location.live.LiveLocationWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object getForegroundInfo(Continuation continuation) {
        return new o96(Long.hashCode(c()) ^ -861719020, ((m18) this.b.getValue()).a(c(), dpg.d(getApplicationContext()).c(getId())), 8);
    }
}
