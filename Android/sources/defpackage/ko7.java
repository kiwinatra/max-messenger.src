package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ko7  reason: default package */
public final class ko7 extends SuspendLambda implements Function2 {
    public lu0 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lo7 o;
    public final /* synthetic */ Function2 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ko7(lo7 lo7, jgg jgg, Continuation continuation) {
        super(2, continuation);
        this.o = lo7;
        this.v = jgg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ko7 ko7 = new ko7(this.o, (jgg) this.v, continuation);
        ko7.c = obj;
        return ko7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ko7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c A[Catch:{ all -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r3) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            lu0 r1 = r6.a
            java.lang.Object r4 = r6.c
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0019 }
        L_0x0017:
            r7 = r4
            goto L_0x0044
        L_0x0019:
            r6 = move-exception
            goto L_0x0073
        L_0x001b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0023:
            lu0 r1 = r6.a
            java.lang.Object r4 = r6.c
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0019 }
            goto L_0x0054
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.c
            d14 r7 = (defpackage.d14) r7
            lo7 r7 = r6.o
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x0019 }
            ru0 r7 = r7.a     // Catch:{ all -> 0x0019 }
            r7.getClass()     // Catch:{ all -> 0x0019 }
            lu0 r1 = new lu0     // Catch:{ all -> 0x0019 }
            r1.<init>(r7)     // Catch:{ all -> 0x0019 }
            kotlin.jvm.functions.Function2 r7 = r6.v
        L_0x0044:
            r6.c = r7     // Catch:{ all -> 0x0019 }
            r6.a = r1     // Catch:{ all -> 0x0019 }
            r6.b = r3     // Catch:{ all -> 0x0019 }
            java.lang.Object r4 = r1.b(r6)     // Catch:{ all -> 0x0019 }
            if (r4 != r0) goto L_0x0051
            return r0
        L_0x0051:
            r5 = r4
            r4 = r7
            r7 = r5
        L_0x0054:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0019 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0019 }
            if (r7 == 0) goto L_0x006d
            java.lang.Object r7 = r1.c()     // Catch:{ all -> 0x0019 }
            r6.c = r4     // Catch:{ all -> 0x0019 }
            r6.a = r1     // Catch:{ all -> 0x0019 }
            r6.b = r2     // Catch:{ all -> 0x0019 }
            java.lang.Object r7 = r4.invoke(r7, r6)     // Catch:{ all -> 0x0019 }
            if (r7 != r0) goto L_0x0017
            return r0
        L_0x006d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0019 }
            kotlin.Result.m23constructorimpl(r6)     // Catch:{ all -> 0x0019 }
            goto L_0x007c
        L_0x0073:
            kotlin.Result$Companion r7 = kotlin.Result.Companion
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)
            kotlin.Result.m23constructorimpl(r6)
        L_0x007c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
