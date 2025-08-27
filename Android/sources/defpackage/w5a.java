package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: w5a  reason: default package */
public final class w5a extends SuspendLambda implements Function2 {
    public n78 a;
    public h8b b;
    public int c;
    public final /* synthetic */ z5a o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w5a(z5a z5a, Continuation continuation) {
        super(2, continuation);
        this.o = z5a;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new w5a(this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w5a) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: n78} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: h8b} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        r3 = r5.e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.c
            r2 = 1
            r3 = 2
            z5a r4 = r7.o
            if (r1 == 0) goto L_0x0025
            if (r1 == r2) goto L_0x001d
            if (r1 != r3) goto L_0x0015
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00e1
        L_0x0015:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x001d:
            h8b r1 = r7.b
            n78 r5 = r7.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0047
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.concurrent.atomic.AtomicReference r8 = r4.k
            java.lang.Object r8 = r8.get()
            r5 = r8
            n78 r5 = (defpackage.n78) r5
            java.util.concurrent.atomic.AtomicReference r8 = r4.j
            java.lang.Object r8 = r8.get()
            r1 = r8
            h8b r1 = (defpackage.h8b) r1
            r7.a = r5
            r7.b = r1
            r7.c = r2
            java.lang.Object r8 = defpackage.z5a.a(r4, r7)
            if (r8 != r0) goto L_0x0047
            return r0
        L_0x0047:
            if (r1 != 0) goto L_0x004b
            h8b r1 = defpackage.h8b.e
        L_0x004b:
            r8 = 0
            r7.a = r8
            r7.b = r8
            r7.c = r3
            r4.getClass()
            if (r5 == 0) goto L_0x0062
            java.util.Map r3 = r5.e
            if (r3 == 0) goto L_0x0062
            java.lang.String r6 = "screen_to"
            java.lang.Object r3 = r3.get(r6)
            goto L_0x0063
        L_0x0062:
            r3 = r8
        L_0x0063:
            boolean r6 = r3 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x006a
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L_0x006b
        L_0x006a:
            r3 = r8
        L_0x006b:
            jgd r6 = defpackage.jgd.APPLICATION_BACKGROUND
            if (r3 != 0) goto L_0x0070
            goto L_0x008c
        L_0x0070:
            int r6 = r3.intValue()
            if (r6 != r2) goto L_0x008c
            if (r5 == 0) goto L_0x0083
            java.util.Map r3 = r5.e
            if (r3 == 0) goto L_0x0083
            java.lang.String r6 = "screen_from"
            java.lang.Object r3 = r3.get(r6)
            goto L_0x0084
        L_0x0083:
            r3 = r8
        L_0x0084:
            boolean r6 = r3 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x008b
            r8 = r3
            java.lang.Integer r8 = (java.lang.Integer) r8
        L_0x008b:
            r3 = r8
        L_0x008c:
            if (r3 != 0) goto L_0x009c
            java.lang.Class<z5a> r7 = defpackage.z5a.class
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "Can't send WARM_START event because last screenTo is empty"
            defpackage.z68.p(r7, r8)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            goto L_0x00de
        L_0x009c:
            int r8 = r3.intValue()
            java.util.Map r8 = r4.b(r8, r5, r1)
            md r1 = defpackage.md.WARM_START
            n78 r8 = r4.c(r1, r8)
            java.util.concurrent.atomic.AtomicReference r1 = r4.k
            n01 r3 = new n01
            r5 = 5
            r3.<init>(r5, r8)
            r1.updateAndGet(r3)
            kotlin.Lazy r1 = r4.c
            java.lang.Object r1 = r1.getValue()
            nd r1 = (defpackage.nd) r1
            r1.j(r8)
            kotlin.Lazy r8 = r1.b
            java.lang.Object r8 = r8.getValue()
            k78 r8 = (defpackage.k78) r8
            java.lang.Object r7 = r8.g(r2, r7)
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r8) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L_0x00d5:
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r8) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L_0x00de:
            if (r7 != r0) goto L_0x00e1
            return r0
        L_0x00e1:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
