package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: tk9  reason: default package */
public final class tk9 extends SuspendLambda implements Function2 {
    public tz9 a;
    public en9 b;
    public Object c;
    public int o;
    public final /* synthetic */ en9 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tk9(en9 en9, Continuation continuation) {
        super(2, continuation);
        this.v = en9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new tk9(this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tk9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003d A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.o
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            java.lang.Object r1 = r5.c
            en9 r3 = r5.b
            tz9 r4 = r5.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x003e
        L_0x0015:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x001d:
            kotlin.ResultKt.throwOnFailure(r6)
            en9 r6 = r5.v
            xme r1 = r6.y1
            r3 = r6
            r4 = r1
        L_0x0026:
            java.lang.Object r1 = r4.getValue()
            r6 = r1
            gpe r6 = (defpackage.gpe) r6
            nbg r6 = r3.z
            r5.a = r4
            r5.b = r3
            r5.c = r1
            r5.o = r2
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L_0x003e
            return r0
        L_0x003e:
            gpe r6 = (defpackage.gpe) r6
            boolean r6 = r4.b(r1, r6)
            if (r6 == 0) goto L_0x0026
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
