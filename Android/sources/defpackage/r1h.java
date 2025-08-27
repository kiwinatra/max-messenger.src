package defpackage;

import com.google.android.gms.tasks.Task;

/* renamed from: r1h  reason: default package */
public final class r1h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r1h(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [com.google.android.gms.cloudmessaging.zzt, java.lang.Exception] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L_0x00b7;
                case 1: goto L_0x007b;
                case 2: goto L_0x0055;
                case 3: goto L_0x0026;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.b
            s7h r0 = (defpackage.s7h) r0
            java.lang.Object r4 = r4.c     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
            java.util.concurrent.Callable r4 = (java.util.concurrent.Callable) r4     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
            java.lang.Object r4 = r4.call()     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
            r0.n(r4)     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
            goto L_0x0025
        L_0x0015:
            r4 = move-exception
            goto L_0x0019
        L_0x0017:
            r4 = move-exception
            goto L_0x0022
        L_0x0019:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r4)
            r0.m(r1)
            goto L_0x0025
        L_0x0022:
            r0.m(r4)
        L_0x0025:
            return
        L_0x0026:
            java.lang.Object r0 = r4.b
            m6h r0 = (defpackage.m6h) r0
            java.lang.Object r4 = r4.c
            w6h r4 = (defpackage.w6h) r4
            int r4 = r4.a
            monitor-enter(r0)
            android.util.SparseArray r1 = r0.v     // Catch:{ all -> 0x0050 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0050 }
            w6h r1 = (defpackage.w6h) r1     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004e
            android.util.SparseArray r2 = r0.v     // Catch:{ all -> 0x0050 }
            r2.remove(r4)     // Catch:{ all -> 0x0050 }
            java.lang.String r4 = "Timed out waiting for response"
            com.google.android.gms.cloudmessaging.zzt r2 = new com.google.android.gms.cloudmessaging.zzt     // Catch:{ all -> 0x0050 }
            r3 = 0
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0050 }
            r1.c(r2)     // Catch:{ all -> 0x0050 }
            r0.c()     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r0)
            goto L_0x0052
        L_0x0050:
            r4 = move-exception
            goto L_0x0053
        L_0x0052:
            return
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r4
        L_0x0055:
            java.lang.Object r0 = r4.c
            d4h r0 = (defpackage.d4h) r0
            java.lang.Object r0 = r0.c
            monitor-enter(r0)
            java.lang.Object r1 = r4.c     // Catch:{ all -> 0x0075 }
            d4h r1 = (defpackage.d4h) r1     // Catch:{ all -> 0x0075 }
            java.lang.Object r1 = r1.o     // Catch:{ all -> 0x0075 }
            lma r1 = (defpackage.lma) r1     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0077
            java.lang.Object r4 = r4.b     // Catch:{ all -> 0x0075 }
            com.google.android.gms.tasks.Task r4 = (com.google.android.gms.tasks.Task) r4     // Catch:{ all -> 0x0075 }
            java.lang.Exception r4 = r4.e()     // Catch:{ all -> 0x0075 }
            defpackage.vzg.m(r4)     // Catch:{ all -> 0x0075 }
            r1.onFailure(r4)     // Catch:{ all -> 0x0075 }
            goto L_0x0077
        L_0x0075:
            r4 = move-exception
            goto L_0x0079
        L_0x0077:
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            return
        L_0x0079:
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            throw r4
        L_0x007b:
            java.lang.Object r0 = r4.b
            m6h r0 = (defpackage.m6h) r0
            java.lang.Object r4 = r4.c
            android.os.IBinder r4 = (android.os.IBinder) r4
            monitor-enter(r0)
            r1 = 0
            if (r4 != 0) goto L_0x0090
            java.lang.String r4 = "Null service connection"
            r0.a(r1, r4)     // Catch:{ all -> 0x008e }
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            goto L_0x00b4
        L_0x008e:
            r4 = move-exception
            goto L_0x00b5
        L_0x0090:
            n6h r2 = new n6h     // Catch:{ RemoteException -> 0x00ab }
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x00ab }
            r0.c = r2     // Catch:{ RemoteException -> 0x00ab }
            r4 = 2
            r0.a = r4     // Catch:{ all -> 0x008e }
            m7h r4 = r0.w     // Catch:{ all -> 0x008e }
            java.lang.Object r4 = r4.o     // Catch:{ all -> 0x008e }
            java.util.concurrent.ScheduledExecutorService r4 = (java.util.concurrent.ScheduledExecutorService) r4     // Catch:{ all -> 0x008e }
            a5h r1 = new a5h     // Catch:{ all -> 0x008e }
            r2 = 0
            r1.<init>(r0, r2)     // Catch:{ all -> 0x008e }
            r4.execute(r1)     // Catch:{ all -> 0x008e }
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            goto L_0x00b4
        L_0x00ab:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x008e }
            r0.a(r1, r4)     // Catch:{ all -> 0x008e }
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
        L_0x00b4:
            return
        L_0x00b5:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            throw r4
        L_0x00b7:
            java.lang.Object r0 = r4.c
            f0h r0 = (defpackage.f0h) r0
            mx3 r1 = r0.c     // Catch:{ RuntimeExecutionException -> 0x00e2, Exception -> 0x00e0 }
            java.lang.Object r4 = r4.b     // Catch:{ RuntimeExecutionException -> 0x00e2, Exception -> 0x00e0 }
            com.google.android.gms.tasks.Task r4 = (com.google.android.gms.tasks.Task) r4     // Catch:{ RuntimeExecutionException -> 0x00e2, Exception -> 0x00e0 }
            java.lang.Object r4 = r1.n(r4)     // Catch:{ RuntimeExecutionException -> 0x00e2, Exception -> 0x00e0 }
            com.google.android.gms.tasks.Task r4 = (com.google.android.gms.tasks.Task) r4     // Catch:{ RuntimeExecutionException -> 0x00e2, Exception -> 0x00e0 }
            if (r4 != 0) goto L_0x00d4
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r1 = "Continuation returned null"
            r4.<init>(r1)
            r0.onFailure(r4)
            goto L_0x0103
        L_0x00d4:
            ep4 r1 = defpackage.xdf.b
            r4.d(r1, r0)
            r4.c(r1, r0)
            r4.a(r1, r0)
            goto L_0x0103
        L_0x00e0:
            r4 = move-exception
            goto L_0x00e4
        L_0x00e2:
            r4 = move-exception
            goto L_0x00ea
        L_0x00e4:
            s7h r0 = r0.o
            r0.m(r4)
            goto L_0x0103
        L_0x00ea:
            java.lang.Throwable r1 = r4.getCause()
            boolean r1 = r1 instanceof java.lang.Exception
            if (r1 == 0) goto L_0x00fe
            s7h r0 = r0.o
            java.lang.Throwable r4 = r4.getCause()
            java.lang.Exception r4 = (java.lang.Exception) r4
            r0.m(r4)
            goto L_0x0103
        L_0x00fe:
            s7h r0 = r0.o
            r0.m(r4)
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1h.run():void");
    }

    public /* synthetic */ r1h(s6h s6h, Task task, int i) {
        this.a = i;
        this.c = s6h;
        this.b = task;
    }
}
