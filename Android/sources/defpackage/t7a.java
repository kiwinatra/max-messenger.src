package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: t7a  reason: default package */
public final class t7a extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u7a c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t7a(u7a u7a, Continuation continuation) {
        super(2, continuation);
        this.c = u7a;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        t7a t7a = new t7a(this.c, continuation);
        t7a.b = obj;
        return t7a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t7a) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ds5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 == r4) goto L_0x001e
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001a:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x008a
        L_0x001e:
            java.lang.Object r1 = r6.b
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0026 }
            goto L_0x0055
        L_0x0026:
            r7 = move-exception
            goto L_0x0062
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.b
            r1 = r7
            ds5 r1 = (defpackage.ds5) r1
            u7a r7 = r6.c
            ytb r5 = r7.a
            if (r5 != 0) goto L_0x0081
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x0026 }
            kotlin.Lazy r7 = r7.b     // Catch:{ all -> 0x0026 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0026 }
            coa r7 = (defpackage.coa) r7     // Catch:{ all -> 0x0026 }
            r6.b = r1     // Catch:{ all -> 0x0026 }
            r6.a = r4     // Catch:{ all -> 0x0026 }
            kotlin.Lazy r7 = r7.a     // Catch:{ all -> 0x0026 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0026 }
            ocf r7 = (defpackage.ocf) r7     // Catch:{ all -> 0x0026 }
            wtb r2 = defpackage.wtb.v     // Catch:{ all -> 0x0026 }
            java.lang.Object r7 = r7.e(r2, r6)     // Catch:{ all -> 0x0026 }
            if (r7 != r0) goto L_0x0055
            return r0
        L_0x0055:
            xtb r7 = (defpackage.xtb) r7     // Catch:{ all -> 0x0026 }
            java.util.List r7 = r7.c     // Catch:{ all -> 0x0026 }
            ytb r7 = defpackage.h88.N(r7)     // Catch:{ all -> 0x0026 }
            java.lang.Object r7 = kotlin.Result.m23constructorimpl(r7)     // Catch:{ all -> 0x0026 }
            goto L_0x006c
        L_0x0062:
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.m23constructorimpl(r7)
        L_0x006c:
            boolean r2 = kotlin.Result.m29isFailureimpl(r7)
            r4 = 0
            if (r2 == 0) goto L_0x0074
            r7 = r4
        L_0x0074:
            ytb r7 = (defpackage.ytb) r7
            r6.b = r4
            r6.a = r3
            java.lang.Object r6 = r1.a(r7, r6)
            if (r6 != r0) goto L_0x008a
            return r0
        L_0x0081:
            r6.a = r2
            java.lang.Object r6 = r1.a(r5, r6)
            if (r6 != r0) goto L_0x008a
            return r0
        L_0x008a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
