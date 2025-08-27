package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: tm5  reason: default package */
public final class tm5 extends SuspendLambda implements Function2 {
    public xz9 a;
    public um5 b;
    public String c;
    public int o;
    public final /* synthetic */ um5 v;
    public final /* synthetic */ String w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tm5(um5 um5, String str, Continuation continuation) {
        super(2, continuation);
        this.v = um5;
        this.w = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new tm5(this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tm5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [xz9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.o
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x002c
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            xz9 r7 = r7.a
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x0015 }
            goto L_0x0057
        L_0x0015:
            r8 = move-exception
            goto L_0x0065
        L_0x0017:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x001f:
            java.lang.String r1 = r7.c
            um5 r3 = r7.b
            xz9 r5 = r7.a
            kotlin.ResultKt.throwOnFailure(r8)
            r6 = r5
            r5 = r1
            r1 = r6
            goto L_0x0045
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r8)
            um5 r8 = r7.v
            a0a r1 = r8.k
            r7.a = r1
            r7.b = r8
            java.lang.String r5 = r7.w
            r7.c = r5
            r7.o = r3
            java.lang.Object r3 = r1.d(r7)
            if (r3 != r0) goto L_0x0044
            return r0
        L_0x0044:
            r3 = r8
        L_0x0045:
            n6e r8 = r3.l     // Catch:{ all -> 0x0063 }
            r7.a = r1     // Catch:{ all -> 0x0063 }
            r7.b = r4     // Catch:{ all -> 0x0063 }
            r7.c = r4     // Catch:{ all -> 0x0063 }
            r7.o = r2     // Catch:{ all -> 0x0063 }
            java.lang.Object r7 = r8.a(r5, r7)     // Catch:{ all -> 0x0063 }
            if (r7 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r7 = r1
        L_0x0057:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0015 }
            a0a r7 = (defpackage.a0a) r7
            r7.e(r4)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x0061:
            r7 = r1
            goto L_0x0065
        L_0x0063:
            r8 = move-exception
            goto L_0x0061
        L_0x0065:
            a0a r7 = (defpackage.a0a) r7
            r7.e(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
