package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ct3  reason: default package */
public final class ct3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ dkb b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ct3(dkb dkb, long j, Continuation continuation) {
        super(2, continuation);
        this.b = dkb;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ct3 ct3 = new ct3(this.b, this.c, continuation);
        ct3.a = obj;
        return ct3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ct3) create((po3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: zo3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: zo3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: zo3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: zo3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: zo3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: zo3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: zo3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.a
            po3 r7 = (defpackage.po3) r7
            dkb r0 = r6.b
            ckb r0 = r0.b
            int r0 = r0.ordinal()
            r1 = 1
            long r2 = r6.c
            r6 = 0
            if (r0 == r1) goto L_0x003d
            r1 = 2
            if (r0 == r1) goto L_0x001c
            goto L_0x005d
        L_0x001c:
            java.util.List r7 = r7.c
            if (r7 == 0) goto L_0x005d
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0026:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r7.next()
            r1 = r0
            zo3 r1 = (defpackage.zo3) r1
            long r4 = r1.a
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0026
            r6 = r0
        L_0x003a:
            zo3 r6 = (defpackage.zo3) r6
            goto L_0x005d
        L_0x003d:
            java.util.List r7 = r7.a
            if (r7 == 0) goto L_0x005d
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0047:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r7.next()
            r1 = r0
            zo3 r1 = (defpackage.zo3) r1
            long r4 = r1.a
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0047
            r6 = r0
        L_0x005b:
            zo3 r6 = (defpackage.zo3) r6
        L_0x005d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
