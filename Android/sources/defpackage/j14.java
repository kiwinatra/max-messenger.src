package defpackage;

import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: j14  reason: default package */
public final class j14 extends SuspendLambda implements Function2 {
    public lu0 a;
    public int b;
    public final /* synthetic */ i6d c;
    public final /* synthetic */ k14 o;
    public final /* synthetic */ x02 v;
    public final /* synthetic */ Callable w;
    public final /* synthetic */ x02 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j14(i6d i6d, k14 k14, ru0 ru0, Callable callable, ru0 ru02, Continuation continuation) {
        super(2, continuation);
        this.c = i6d;
        this.o = k14;
        this.v = ru0;
        this.w = callable;
        this.x = ru02;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new j14(this.c, this.o, (ru0) this.v, this.w, (ru0) this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j14) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d A[Catch:{ all -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.b
            r2 = 2
            r3 = 1
            k14 r4 = r8.o
            i6d r5 = r8.c
            if (r1 == 0) goto L_0x0029
            if (r1 == r3) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            lu0 r1 = r8.a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x0019 }
        L_0x0017:
            r9 = r1
            goto L_0x0037
        L_0x0019:
            r8 = move-exception
            goto L_0x006b
        L_0x001b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0023:
            lu0 r1 = r8.a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x0019 }
            goto L_0x0045
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r9)
            uj7 r9 = r5.e
            r9.a(r4)
            x02 r9 = r8.v     // Catch:{ all -> 0x0019 }
            lu0 r9 = r9.iterator()     // Catch:{ all -> 0x0019 }
        L_0x0037:
            r8.a = r9     // Catch:{ all -> 0x0019 }
            r8.b = r3     // Catch:{ all -> 0x0019 }
            java.lang.Object r1 = r9.b(r8)     // Catch:{ all -> 0x0019 }
            if (r1 != r0) goto L_0x0042
            return r0
        L_0x0042:
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x0045:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0019 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0019 }
            if (r9 == 0) goto L_0x0063
            r1.c()     // Catch:{ all -> 0x0019 }
            java.util.concurrent.Callable r9 = r8.w     // Catch:{ all -> 0x0019 }
            java.lang.Object r9 = r9.call()     // Catch:{ all -> 0x0019 }
            x02 r6 = r8.x     // Catch:{ all -> 0x0019 }
            r8.a = r1     // Catch:{ all -> 0x0019 }
            r8.b = r2     // Catch:{ all -> 0x0019 }
            java.lang.Object r9 = r6.t(r9, r8)     // Catch:{ all -> 0x0019 }
            if (r9 != r0) goto L_0x0017
            return r0
        L_0x0063:
            uj7 r8 = r5.e
            r8.c(r4)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x006b:
            uj7 r9 = r5.e
            r9.c(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j14.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
