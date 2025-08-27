package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: i9f  reason: default package */
public final class i9f extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zc4 c;
    public final /* synthetic */ String o;
    public final /* synthetic */ tqd v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i9f(zc4 zc4, String str, tqd tqd, Continuation continuation) {
        super(2, continuation);
        this.c = zc4;
        this.o = str;
        this.v = tqd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i9f i9f = new i9f(this.c, this.o, this.v, continuation);
        i9f.b = obj;
        return i9f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i9f) create((z08) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: z08} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r4) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x008a
        L_0x0014:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001c:
            java.lang.Object r1 = r8.b
            z08 r1 = (defpackage.z08) r1
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x0024 }
            goto L_0x005f
        L_0x0024:
            r9 = move-exception
            goto L_0x0067
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.b
            r1 = r9
            z08 r1 = (defpackage.z08) r1
            zc4 r9 = r8.c
            java.lang.String r5 = r8.o
            tqd r6 = r8.v
            r8.b = r1     // Catch:{ all -> 0x0024 }
            r8.a = r4     // Catch:{ all -> 0x0024 }
            java.lang.Object r4 = r9.o     // Catch:{ all -> 0x0024 }
            gaf r4 = (defpackage.gaf) r4     // Catch:{ all -> 0x0024 }
            osa r4 = (defpackage.osa) r4     // Catch:{ all -> 0x0024 }
            q04 r4 = r4.b()     // Catch:{ all -> 0x0024 }
            java.lang.Object r7 = r9.v     // Catch:{ all -> 0x0024 }
            faf r7 = (defpackage.faf) r7     // Catch:{ all -> 0x0024 }
            kotlin.coroutines.CoroutineContext r4 = r4.plus(r7)     // Catch:{ all -> 0x0024 }
            h9f r7 = new h9f     // Catch:{ all -> 0x0024 }
            r7.<init>(r9, r5, r6, r2)     // Catch:{ all -> 0x0024 }
            java.lang.Object r9 = defpackage.ev0.I(r4, r7, r8)     // Catch:{ all -> 0x0024 }
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ all -> 0x0024 }
            if (r9 != r4) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0024 }
        L_0x005c:
            if (r9 != r0) goto L_0x005f
            return r0
        L_0x005f:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0024 }
            s4d r4 = new s4d     // Catch:{ all -> 0x0024 }
            r4.<init>(r9)     // Catch:{ all -> 0x0024 }
            goto L_0x006c
        L_0x0067:
            r4d r4 = new r4d
            r4.<init>(r9)
        L_0x006c:
            r8.b = r2
            r8.a = r3
            r1.getClass()
            y08 r9 = new y08
            r9.<init>(r1, r4, r2)
            kotlin.coroutines.CoroutineContext r1 = r1.b
            java.lang.Object r8 = defpackage.ev0.I(r1, r9, r8)
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r9) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L_0x0087:
            if (r8 != r0) goto L_0x008a
            return r0
        L_0x008a:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i9f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
