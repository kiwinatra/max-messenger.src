package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: eaa  reason: default package */
public final class eaa extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ faa c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eaa(faa faa, Continuation continuation) {
        super(2, continuation);
        this.c = faa;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        eaa eaa = new eaa(this.c, continuation);
        eaa.b = obj;
        return eaa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eaa) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b A[Catch:{ all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.a
            r2 = 2
            r3 = 1
            faa r4 = r10.c
            if (r1 == 0) goto L_0x002a
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r1 = r10.b
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r1
            goto L_0x0031
        L_0x0019:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0021:
            java.lang.Object r1 = r10.b
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r1
            goto L_0x004e
        L_0x002a:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.b
            d14 r11 = (defpackage.d14) r11
        L_0x0031:
            kotlin.reflect.KProperty[] r1 = defpackage.faa.i
            boolean r1 = r4.e()
            if (r1 == 0) goto L_0x00c7
            boolean r1 = defpackage.e14.f(r11)
            if (r1 == 0) goto L_0x00c7
            long r5 = r4.b()
            r10.b = r11
            r10.a = r3
            java.lang.Object r1 = defpackage.xk4.c(r5, r10)
            if (r1 != r0) goto L_0x004e
            return r0
        L_0x004e:
            java.util.concurrent.locks.ReentrantLock r1 = r4.f
            jz9 r5 = r4.e
            r1.lock()
            boolean r6 = r5.b()     // Catch:{ all -> 0x0063 }
            if (r6 != 0) goto L_0x0065
            jz9 r6 = defpackage.wa8.a(r5)     // Catch:{ all -> 0x0063 }
            r5.g()     // Catch:{ all -> 0x0063 }
            goto L_0x0066
        L_0x0063:
            r10 = move-exception
            goto L_0x00c3
        L_0x0065:
            r6 = 0
        L_0x0066:
            r1.unlock()
            if (r6 == 0) goto L_0x0031
            boolean r1 = r6.b()
            if (r1 == 0) goto L_0x0072
            goto L_0x0031
        L_0x0072:
            kotlin.reflect.KProperty[] r1 = defpackage.faa.i
            r7 = 0
            r1 = r1[r7]
            wie r7 = r4.g
            java.lang.Object r1 = r7.getValue(r4, r1)
            pm7 r1 = (defpackage.pm7) r1
            java.util.concurrent.locks.ReentrantLock r7 = r4.f
            if (r1 == 0) goto L_0x00af
            boolean r1 = r1.isActive()
            if (r1 != 0) goto L_0x00af
            r7.lock()
            kotlin.time.Duration$Companion r1 = kotlin.time.Duration.Companion     // Catch:{ all -> 0x00aa }
            long r8 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00aa }
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS     // Catch:{ all -> 0x00aa }
            long r8 = kotlin.time.DurationKt.toDuration((long) r8, (kotlin.time.DurationUnit) r1)     // Catch:{ all -> 0x00aa }
            r4.h = r8     // Catch:{ all -> 0x00aa }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00aa }
            r7.unlock()
            r10.b = r11
            r10.a = r2
            java.lang.Object r1 = r4.c(r6, r10)
            if (r1 != r0) goto L_0x0031
            return r0
        L_0x00aa:
            r10 = move-exception
            r7.unlock()
            throw r10
        L_0x00af:
            r7.lock()
            boolean r1 = r5.f(r6)     // Catch:{ all -> 0x00be }
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)     // Catch:{ all -> 0x00be }
            r7.unlock()
            goto L_0x0031
        L_0x00be:
            r10 = move-exception
            r7.unlock()
            throw r10
        L_0x00c3:
            r1.unlock()
            throw r10
        L_0x00c7:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eaa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
