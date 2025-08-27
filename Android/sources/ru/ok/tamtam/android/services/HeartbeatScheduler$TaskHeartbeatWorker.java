package ru.ok.tamtam.android.services;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ru/ok/tamtam/android/services/HeartbeatScheduler$TaskHeartbeatWorker", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lyx6;", "heartbeatLogic", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lyx6;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class HeartbeatScheduler$TaskHeartbeatWorker extends SdkCoroutineWorker {
    public final yx6 a;

    public HeartbeatScheduler$TaskHeartbeatWorker(Context context, WorkerParameters workerParameters, yx6 yx6) {
        super(context, workerParameters);
        this.a = yx6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x012c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.zx6
            if (r0 == 0) goto L_0x0013
            r0 = r13
            zx6 r0 = (defpackage.zx6) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            zx6 r0 = new zx6
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            java.lang.String r3 = "ay6"
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker r12 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x012d
        L_0x002e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r13)
            java.util.UUID r13 = r12.getId()
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r2 = "work %s started"
            defpackage.z68.c(r3, r2, r13)
            r0.a = r12
            r0.o = r4
            yx6 r13 = r12.a
            kotlin.Lazy r2 = r13.a
            java.lang.Object r2 = r2.getValue()
            doa r2 = (defpackage.doa) r2
            boolean r2 = r2.e()
            kotlin.Lazy r5 = r13.b
            if (r2 == 0) goto L_0x00e2
            java.lang.Object r2 = r5.getValue()
            fn4 r2 = (defpackage.fn4) r2
            r2.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            kotlin.Lazy r2 = r13.c
            java.lang.Object r8 = r2.getValue()
            jtb r8 = (defpackage.jtb) r8
            ltb r8 = (defpackage.ltb) r8
            a33 r8 = r8.a
            ls7 r8 = r8.g
            java.lang.String r9 = "app.lastSuccessfulRequestTime"
            r10 = 0
            long r8 = r8.getLong(r9, r10)
            long r6 = r6 - r8
            double r6 = (double) r6
            double r6 = java.lang.Math.abs(r6)
            r8 = 4718496151362338816(0x417b774000000000, double:2.88E7)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a6
            java.lang.Object r2 = r2.getValue()
            jtb r2 = (defpackage.jtb) r2
            ltb r2 = (defpackage.ltb) r2
            a33 r2 = r2.a
            r2.w(r4)
            kotlin.Lazy r2 = r13.d
            java.lang.Object r2 = r2.getValue()
            bef r2 = (defpackage.bef) r2
            r2.a()
        L_0x00a6:
            java.lang.Object r2 = r5.getValue()
            fn4 r2 = (defpackage.fn4) r2
            boolean r2 = r2.d()
            if (r2 != 0) goto L_0x00e2
            kotlin.Lazy r2 = r13.e
            java.lang.Object r2 = r2.getValue()
            nh3 r2 = (defpackage.nh3) r2
            boolean r2 = r2.g()
            if (r2 == 0) goto L_0x00e2
            kotlin.Lazy r2 = r13.f
            java.lang.Object r2 = r2.getValue()
            rl r2 = (defpackage.rl) r2
            java.lang.Object r4 = r5.getValue()
            fn4 r4 = (defpackage.fn4) r4
            boolean r4 = r4.d()
            jna r2 = (defpackage.jna) r2
            r2.O(r4)
            kotlin.Lazy r2 = r13.g
            java.lang.Object r2 = r2.getValue()
            jqg r2 = (defpackage.jqg) r2
            defpackage.rvd.A(r2)
        L_0x00e2:
            kotlin.Lazy r13 = r13.h
            java.lang.Object r2 = r13.getValue()
            k78 r2 = (defpackage.k78) r2
            boolean r2 = r2.d()
            r4 = 0
            if (r2 == 0) goto L_0x0108
            java.lang.Object r2 = r5.getValue()
            fn4 r2 = (defpackage.fn4) r2
            boolean r2 = r2.d()
            if (r2 != 0) goto L_0x0108
            java.lang.Object r13 = r13.getValue()
            k78 r13 = (defpackage.k78) r13
            r0 = 3
            defpackage.k78.h(r13, r4, r0)
            goto L_0x0128
        L_0x0108:
            java.lang.Object r2 = r13.getValue()
            k78 r2 = (defpackage.k78) r2
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x0128
            java.lang.Object r13 = r13.getValue()
            k78 r13 = (defpackage.k78) r13
            java.lang.Object r13 = r13.g(r4, r0)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r13 != r0) goto L_0x0125
            goto L_0x012a
        L_0x0125:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            goto L_0x012a
        L_0x0128:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
        L_0x012a:
            if (r13 != r1) goto L_0x012d
            return r1
        L_0x012d:
            java.util.UUID r12 = r12.getId()
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r13 = "work %s finished"
            defpackage.z68.c(r3, r13, r12)
            c08 r12 = defpackage.d08.b()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
