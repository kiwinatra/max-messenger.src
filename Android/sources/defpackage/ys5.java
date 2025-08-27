package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ys5  reason: default package */
public final class ys5 extends SuspendLambda implements Function2 {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ TimeUnit o;
    public final /* synthetic */ long v = 0;
    public final /* synthetic */ long w = 100;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ys5(TimeUnit timeUnit, Continuation continuation) {
        super(2, continuation);
        this.o = timeUnit;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ys5 ys5 = new ys5(this.o, continuation);
        ys5.c = obj;
        return ys5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ys5) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ds5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.b
            java.util.concurrent.TimeUnit r2 = r9.o
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r5) goto L_0x002f
            if (r1 == r4) goto L_0x0025
            if (r1 != r3) goto L_0x001d
            long r5 = r9.a
            java.lang.Object r1 = r9.c
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0052
        L_0x001d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0025:
            long r5 = r9.a
            java.lang.Object r1 = r9.c
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0067
        L_0x002f:
            java.lang.Object r1 = r9.c
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0050
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.c
            r1 = r10
            ds5 r1 = (defpackage.ds5) r1
            long r6 = r9.v
            long r6 = r2.toMillis(r6)
            r9.c = r1
            r9.b = r5
            java.lang.Object r10 = defpackage.xk4.b(r6, r9)
            if (r10 != r0) goto L_0x0050
            return r0
        L_0x0050:
            r5 = 0
        L_0x0052:
            r7 = 1
            long r7 = r7 + r5
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            r9.c = r1
            r9.a = r7
            r9.b = r4
            java.lang.Object r10 = r1.a(r10, r9)
            if (r10 != r0) goto L_0x0066
            return r0
        L_0x0066:
            r5 = r7
        L_0x0067:
            long r7 = r9.w
            long r7 = r2.toMillis(r7)
            r9.c = r1
            r9.a = r5
            r9.b = r3
            java.lang.Object r10 = defpackage.xk4.b(r7, r9)
            if (r10 != r0) goto L_0x0052
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
