package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: st7  reason: default package */
public final class st7 extends SuspendLambda implements Function2 {
    public xz9 a;
    public tt7 b;
    public nuf c;
    public int o;
    public final /* synthetic */ tt7 v;
    public final /* synthetic */ nuf w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public st7(tt7 tt7, nuf nuf, Continuation continuation) {
        super(2, continuation);
        this.v = tt7;
        this.w = nuf;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new st7(this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((st7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [xz9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.o
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0034
            if (r1 == r4) goto L_0x0027
            if (r1 == r3) goto L_0x0024
            if (r1 != r2) goto L_0x001c
            xz9 r10 = r10.a
        L_0x0014:
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x0019 }
            goto L_0x0082
        L_0x0019:
            r11 = move-exception
            goto L_0x0090
        L_0x001c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0024:
            xz9 r10 = r10.a
            goto L_0x0014
        L_0x0027:
            nuf r1 = r10.c
            tt7 r4 = r10.b
            xz9 r6 = r10.a
            kotlin.ResultKt.throwOnFailure(r11)
            r9 = r6
            r6 = r1
            r1 = r9
            goto L_0x004d
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r11)
            tt7 r11 = r10.v
            a0a r1 = r11.f
            r10.a = r1
            r10.b = r11
            nuf r6 = r10.w
            r10.c = r6
            r10.o = r4
            java.lang.Object r4 = r1.d(r10)
            if (r4 != r0) goto L_0x004c
            return r0
        L_0x004c:
            r4 = r11
        L_0x004d:
            ne7 r11 = r4.a     // Catch:{ all -> 0x0070 }
            long r7 = r6.b     // Catch:{ all -> 0x0070 }
            java.util.concurrent.ConcurrentHashMap r11 = r11.k     // Catch:{ all -> 0x008e }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x008e }
            boolean r11 = r11.containsKey(r7)     // Catch:{ all -> 0x008e }
            long r6 = r6.b
            if (r11 == 0) goto L_0x0073
            r10.a = r1     // Catch:{ all -> 0x0070 }
            r10.b = r5     // Catch:{ all -> 0x0070 }
            r10.c = r5     // Catch:{ all -> 0x0070 }
            r10.o = r3     // Catch:{ all -> 0x0070 }
            kotlin.Unit r10 = defpackage.tt7.a(r4, r6)     // Catch:{ all -> 0x0070 }
            if (r10 != r0) goto L_0x006e
            return r0
        L_0x006e:
            r10 = r1
            goto L_0x0082
        L_0x0070:
            r11 = move-exception
        L_0x0071:
            r10 = r1
            goto L_0x0090
        L_0x0073:
            r10.a = r1     // Catch:{ all -> 0x0070 }
            r10.b = r5     // Catch:{ all -> 0x0070 }
            r10.c = r5     // Catch:{ all -> 0x0070 }
            r10.o = r2     // Catch:{ all -> 0x0070 }
            kotlin.Unit r10 = defpackage.tt7.b(r4, r6)     // Catch:{ all -> 0x0070 }
            if (r10 != r0) goto L_0x006e
            return r0
        L_0x0082:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0019 }
            a0a r10 = (defpackage.a0a) r10
            r10.e(r5)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x008c:
            r11 = r10
            goto L_0x0071
        L_0x008e:
            r10 = move-exception
            goto L_0x008c
        L_0x0090:
            a0a r10 = (defpackage.a0a) r10
            r10.e(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
