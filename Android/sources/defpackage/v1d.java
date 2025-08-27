package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: v1d  reason: default package */
public final class v1d extends SuspendLambda implements Function2 {
    public xz9 a;
    public Function2 b;
    public int c;
    public final /* synthetic */ xz9 o;
    public final /* synthetic */ Function2 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v1d(xz9 xz9, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.o = xz9;
        this.v = function2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new v1d(this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v1d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [xz9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0028
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            xz9 r6 = r6.a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0015 }
            goto L_0x0051
        L_0x0015:
            r7 = move-exception
            goto L_0x005f
        L_0x0017:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001f:
            kotlin.jvm.functions.Function2 r1 = r6.b
            xz9 r3 = r6.a
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r3
            goto L_0x003e
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r7)
            xz9 r7 = r6.o
            r6.a = r7
            kotlin.jvm.functions.Function2 r1 = r6.v
            r6.b = r1
            r6.c = r3
            a0a r7 = (defpackage.a0a) r7
            java.lang.Object r3 = r7.d(r6)
            if (r3 != r0) goto L_0x003e
            return r0
        L_0x003e:
            u1d r3 = new u1d     // Catch:{ all -> 0x005b }
            r3.<init>(r1, r4)     // Catch:{ all -> 0x005b }
            r6.a = r7     // Catch:{ all -> 0x005b }
            r6.b = r4     // Catch:{ all -> 0x005b }
            r6.c = r2     // Catch:{ all -> 0x005b }
            java.lang.Object r6 = defpackage.e14.d(r3, r6)     // Catch:{ all -> 0x005b }
            if (r6 != r0) goto L_0x0050
            return r0
        L_0x0050:
            r6 = r7
        L_0x0051:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0015 }
            a0a r6 = (defpackage.a0a) r6
            r6.e(r4)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L_0x005b:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x005f:
            a0a r6 = (defpackage.a0a) r6
            r6.e(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v1d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
