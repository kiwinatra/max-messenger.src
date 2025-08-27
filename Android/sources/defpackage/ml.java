package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ml  reason: default package */
public final class ml extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g6d c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ml(g6d g6d, Continuation continuation) {
        super(2, continuation);
        this.c = g6d;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ml mlVar = new ml(this.c, continuation);
        mlVar.b = obj;
        return mlVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ml) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059 A[EDGE_INSN: B:22:0x0059->B:15:0x0059 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058 A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.a
            r2 = 3
            r3 = 2
            r4 = 1
            g6d r5 = r9.c
            if (r1 == 0) goto L_0x002c
            if (r1 == r4) goto L_0x0024
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            goto L_0x0024
        L_0x0014:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001c:
            java.lang.Object r1 = r9.b
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0074
        L_0x0024:
            java.lang.Object r1 = r9.b
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0034
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.b
            ds5 r10 = (defpackage.ds5) r10
            r1 = r10
        L_0x0034:
            java.lang.Object r10 = r5.o
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            java.lang.Object r10 = r10.invoke()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0059
            kotlin.time.Duration$Companion r10 = kotlin.time.Duration.Companion
            r10 = 10
            kotlin.time.DurationUnit r6 = kotlin.time.DurationUnit.SECONDS
            long r6 = kotlin.time.DurationKt.toDuration((int) r10, (kotlin.time.DurationUnit) r6)
            r9.b = r1
            r9.a = r4
            java.lang.Object r10 = defpackage.xk4.c(r6, r9)
            if (r10 != r0) goto L_0x0034
            return r0
        L_0x0059:
            java.lang.Object r10 = r5.b
            hl r10 = (defpackage.hl) r10
            long r6 = r10.a
            ll r10 = new ll
            r8 = 0
            r10.<init>(r5, r8)
            r9.b = r1
            r9.a = r3
            long r6 = defpackage.xk4.e(r6)
            java.lang.Object r10 = defpackage.okf.c(r6, r10, r9)
            if (r10 != r0) goto L_0x0074
            return r0
        L_0x0074:
            if (r10 != 0) goto L_0x0034
            il r10 = new il
            java.lang.Object r6 = r5.b
            hl r6 = (defpackage.hl) r6
            long r6 = r6.a
            java.lang.String r6 = kotlin.time.Duration.m1402toStringimpl(r6)
            java.lang.String r7 = "Application Not Responding for at least "
            java.lang.String r6 = defpackage.a81.m(r7, r6)
            r10.<init>(r6)
            r9.b = r1
            r9.a = r2
            java.lang.Object r10 = r1.a(r10, r9)
            if (r10 != r0) goto L_0x0034
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
