package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: o7g  reason: default package */
public final class o7g extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n7g c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o7g(n7g n7g, long j, Continuation continuation) {
        super(2, continuation);
        this.c = n7g;
        this.o = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        o7g o7g = new o7g(this.c, this.o, continuation);
        o7g.b = obj;
        return o7g;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o7g) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            java.lang.Object r1 = r6.b
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x002e
        L_0x0016:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001e:
            java.lang.Object r1 = r6.b
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004f
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.b
            ds5 r7 = (defpackage.ds5) r7
            r1 = r7
        L_0x002e:
            n7g r7 = r6.c
            boolean r4 = r7.a()
            if (r4 == 0) goto L_0x004f
            long r4 = r7.F0()
            kotlin.time.DurationUnit r7 = kotlin.time.DurationUnit.MILLISECONDS
            long r4 = kotlin.time.DurationKt.toDuration((long) r4, (kotlin.time.DurationUnit) r7)
            kotlin.time.Duration r7 = kotlin.time.Duration.m1351boximpl(r4)
            r6.b = r1
            r6.a = r3
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L_0x004f
            return r0
        L_0x004f:
            r6.b = r1
            r6.a = r2
            long r4 = r6.o
            java.lang.Object r7 = defpackage.xk4.c(r4, r6)
            if (r7 != r0) goto L_0x002e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
