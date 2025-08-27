package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import ru.ok.android.externcalls.sdk.Conversation;

/* renamed from: b03  reason: default package */
public final class b03 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b03(int i, Continuation continuation) {
        super(3, continuation);
        this.a = 4;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                b03 b03 = new b03(3, (Continuation) obj3, 0);
                b03.c = (ds5) obj;
                b03.o = (k9a) obj2;
                return b03.invokeSuspend(Unit.INSTANCE);
            case 1:
                b03 b032 = new b03(3, (Continuation) obj3, 1);
                b032.c = (ds5) obj;
                b032.o = (nyf) obj2;
                return b032.invokeSuspend(Unit.INSTANCE);
            case 2:
                ds5 ds5 = (ds5) obj;
                b03 b033 = new b03((do5) this.o, (Continuation) obj3);
                b033.c = (Throwable) obj2;
                return b033.invokeSuspend(Unit.INSTANCE);
            case 3:
                b03 b034 = new b03(3, (Continuation) obj3, 3);
                b034.c = (ds5) obj;
                b034.o = obj2;
                return b034.invokeSuspend(Unit.INSTANCE);
            case 4:
                b03 b035 = new b03(this.b, (Continuation) obj3);
                b035.c = (g7e) obj;
                b035.o = (k2b) obj2;
                return b035.invokeSuspend(Unit.INSTANCE);
            case 5:
                b03 b036 = new b03(3, (Continuation) obj3, 5);
                b036.c = (ds5) obj;
                b036.o = (Conversation) obj2;
                return b036.invokeSuspend(Unit.INSTANCE);
            default:
                ds5 ds52 = (ds5) obj;
                Throwable th = (Throwable) obj2;
                return new b03((h5f) this.c, (kxf) this.o, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x028e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.a
            switch(r0) {
                case 0: goto L_0x01fa;
                case 1: goto L_0x01b7;
                case 2: goto L_0x0125;
                case 3: goto L_0x00e0;
                case 4: goto L_0x009f;
                case 5: goto L_0x005c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.b
            r2 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0059
        L_0x0014:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.c
            h5f r15 = (defpackage.h5f) r15
            java.lang.String r15 = r15.b
            java.lang.Object r1 = r14.o
            kxf r1 = (defpackage.kxf) r1
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x002e
            goto L_0x0048
        L_0x002e:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0048
            w78 r4 = defpackage.w78.o
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "On uploading complete for="
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r5 = 0
            r3.d(r4, r15, r1, r5)
        L_0x0048:
            java.lang.Object r15 = r14.c
            h5f r15 = (defpackage.h5f) r15
            java.lang.Object r1 = r14.o
            kxf r1 = (defpackage.kxf) r1
            r14.b = r2
            java.lang.Object r14 = r15.g(r1, r14)
            if (r14 != r0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x005b:
            return r0
        L_0x005c:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x007a
            if (r1 == r3) goto L_0x0076
            if (r1 != r2) goto L_0x006e
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x009c
        L_0x006e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0076:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0091
        L_0x007a:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.c
            ds5 r15 = (defpackage.ds5) r15
            java.lang.Object r1 = r14.o
            ru.ok.android.externcalls.sdk.Conversation r1 = (ru.ok.android.externcalls.sdk.Conversation) r1
            r4 = 0
            r14.c = r4
            r14.b = r3
            java.lang.Object r15 = r15.a(r1, r14)
            if (r15 != r0) goto L_0x0091
            goto L_0x009e
        L_0x0091:
            r14.b = r2
            r1 = 300(0x12c, double:1.48E-321)
            java.lang.Object r14 = defpackage.xk4.b(r1, r14)
            if (r14 != r0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x009e:
            return r0
        L_0x009f:
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.c
            g7e r15 = (defpackage.g7e) r15
            java.lang.Object r0 = r14.o
            k2b r0 = (defpackage.k2b) r0
            p3a r1 = new p3a
            r2 = 6
            r1.<init>((int) r2)
            r2 = 0
            java.lang.Object r3 = r1.a
            c7e r3 = (defpackage.c7e) r3
            r3.k = r2
            r2 = 0
            r3.i = r2
            df0 r2 = r0.c()
            int r2 = r2.j
            r1.x(r2)
            df0 r0 = r0.c()
            int r0 = r0.i
            r3.d = r0
            r1.w()
            int r14 = r14.b
            r1.z(r14)
            c7e r14 = r1.q()
            r15.a(r14)
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L_0x00e0:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.b
            r2 = 1
            if (r1 == 0) goto L_0x00f7
            if (r1 != r2) goto L_0x00ef
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0122
        L_0x00ef:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x00f7:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.c
            ds5 r15 = (defpackage.ds5) r15
            java.lang.Object r1 = r14.o
            kx7 r1 = (defpackage.kx7) r1
            boolean r3 = r1 instanceof defpackage.bx7
            if (r3 == 0) goto L_0x0112
            ey7 r3 = new ey7
            r4 = 0
            r3.<init>(r1, r4)
            sbd r1 = new sbd
            r1.<init>(r3)
            goto L_0x0119
        L_0x0112:
            fs5 r3 = new fs5
            r4 = 3
            r3.<init>(r4, r1)
            r1 = r3
        L_0x0119:
            r14.b = r2
            java.lang.Object r14 = defpackage.bs0.x(r1, r15, r14)
            if (r14 != r0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0124:
            return r0
        L_0x0125:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.b
            r2 = 1
            if (r1 == 0) goto L_0x013c
            if (r1 != r2) goto L_0x0134
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x017e
        L_0x0134:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x013c:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.c
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            java.lang.Object r1 = r14.o
            do5 r1 = (defpackage.do5) r1
            java.lang.String r1 = r1.d
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x014e
            goto L_0x0168
        L_0x014e:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0168
            w78 r4 = defpackage.w78.o
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Releasing connectionFactory after using "
            r5.<init>(r6)
            r5.append(r15)
            java.lang.String r15 = r5.toString()
            r5 = 0
            r3.d(r4, r1, r15, r5)
        L_0x0168:
            java.lang.Object r15 = r14.o
            do5 r15 = (defpackage.do5) r15
            kotlin.Lazy r15 = r15.f
            java.lang.Object r15 = r15.getValue()
            xlf r15 = (defpackage.xlf) r15
            r14.b = r2
            r15.getClass()
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            if (r15 != r0) goto L_0x017e
            goto L_0x01b6
        L_0x017e:
            java.lang.Object r15 = r14.o
            do5 r15 = (defpackage.do5) r15
            kotlin.Lazy r15 = r15.g
            java.lang.Object r15 = r15.getValue()
            tt0 r15 = (defpackage.tt0) r15
            java.lang.Object r0 = r14.o
            do5 r0 = (defpackage.do5) r0
            kotlin.Lazy r0 = r0.m
            java.lang.Object r0 = r0.getValue()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r15.b(r0)
            java.lang.Object r15 = r14.o
            do5 r15 = (defpackage.do5) r15
            kotlin.Lazy r15 = r15.g
            java.lang.Object r15 = r15.getValue()
            tt0 r15 = (defpackage.tt0) r15
            java.lang.Object r14 = r14.o
            do5 r14 = (defpackage.do5) r14
            kotlin.Lazy r14 = r14.o
            java.lang.Object r14 = r14.getValue()
            java.nio.ByteBuffer r14 = (java.nio.ByteBuffer) r14
            r15.b(r14)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x01b6:
            return r0
        L_0x01b7:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.b
            r2 = 1
            if (r1 == 0) goto L_0x01d2
            if (r1 != r2) goto L_0x01ca
            java.lang.Object r14 = r14.c
            nyf r14 = (defpackage.nyf) r14
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x01e9
        L_0x01ca:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x01d2:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.c
            ds5 r15 = (defpackage.ds5) r15
            java.lang.Object r1 = r14.o
            nyf r1 = (defpackage.nyf) r1
            r14.c = r1
            r14.b = r2
            java.lang.Object r14 = r15.a(r1, r14)
            if (r14 != r0) goto L_0x01e8
            goto L_0x01f9
        L_0x01e8:
            r14 = r1
        L_0x01e9:
            float r14 = r14.a
            r15 = 1120403456(0x42c80000, float:100.0)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x01f3
            r14 = r2
            goto L_0x01f4
        L_0x01f3:
            r14 = 0
        L_0x01f4:
            r14 = r14 ^ r2
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r14)
        L_0x01f9:
            return r0
        L_0x01fa:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0229
            if (r1 == r3) goto L_0x021d
            if (r1 != r2) goto L_0x0215
            java.lang.Object r1 = r14.o
            k9a r1 = (defpackage.k9a) r1
            java.lang.Object r4 = r14.c
            ds5 r4 = (defpackage.ds5) r4
            kotlin.ResultKt.throwOnFailure(r15)
        L_0x0213:
            r15 = r4
            goto L_0x023c
        L_0x0215:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x021d:
            java.lang.Object r1 = r14.o
            k9a r1 = (defpackage.k9a) r1
            java.lang.Object r4 = r14.c
            ds5 r4 = (defpackage.ds5) r4
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x025f
        L_0x0229:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.c
            ds5 r15 = (defpackage.ds5) r15
            java.lang.Object r1 = r14.o
            k9a r1 = (defpackage.k9a) r1
            boolean r4 = r1 instanceof defpackage.i9a
            if (r4 != 0) goto L_0x023c
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x02bb
        L_0x023c:
            kotlin.coroutines.CoroutineContext r4 = r14.getContext()
            boolean r4 = defpackage.kv0.I(r4)
            if (r4 == 0) goto L_0x02b9
            r4 = r1
            i9a r4 = (defpackage.i9a) r4
            boolean r4 = r4.b()
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            r14.c = r15
            r14.o = r1
            r14.b = r3
            java.lang.Object r4 = r15.a(r4, r14)
            if (r4 != r0) goto L_0x025e
            goto L_0x02bb
        L_0x025e:
            r4 = r15
        L_0x025f:
            java.util.Calendar r15 = java.util.Calendar.getInstance()
            java.util.Date r15 = r15.getTime()
            r5 = r1
            i9a r5 = (defpackage.i9a) r5
            java.util.Date r6 = r5.a(r15)
            int r7 = r6.compareTo(r15)
            r8 = 1
            if (r7 >= 0) goto L_0x0284
            long r10 = r6.getTime()
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.DAYS
            long r12 = r7.toMillis(r8)
            long r12 = r12 + r10
            r6.setTime(r12)
        L_0x0284:
            java.util.Date r5 = r5.c(r15)
            int r7 = r5.compareTo(r15)
            if (r7 >= 0) goto L_0x029c
            long r10 = r5.getTime()
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.DAYS
            long r12 = r7.toMillis(r8)
            long r12 = r12 + r10
            r5.setTime(r12)
        L_0x029c:
            java.lang.Comparable r5 = kotlin.comparisons.ComparisonsKt.minOf(r5, r6)
            java.util.Date r5 = (java.util.Date) r5
            long r5 = r5.getTime()
            long r10 = r15.getTime()
            long r5 = r5 - r10
            long r5 = r5 + r8
            r14.c = r4
            r14.o = r1
            r14.b = r2
            java.lang.Object r15 = defpackage.xk4.b(r5, r14)
            if (r15 != r0) goto L_0x0213
            goto L_0x02bb
        L_0x02b9:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x02bb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b03.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b03(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b03(do5 do5, Continuation continuation) {
        super(3, continuation);
        this.a = 2;
        this.o = do5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b03(h5f h5f, kxf kxf, Continuation continuation) {
        super(3, continuation);
        this.a = 6;
        this.c = h5f;
        this.o = kxf;
    }
}
