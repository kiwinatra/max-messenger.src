package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vg2  reason: default package */
public final class vg2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ m29 b;
    public final /* synthetic */ gh2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vg2(gh2 gh2, m29 m29, Continuation continuation) {
        super(2, continuation);
        this.b = m29;
        this.c = gh2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new vg2(this.c, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vg2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: l20} */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ba, code lost:
        if (r6 == null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f3, code lost:
        if (r6 == null) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0126, code lost:
        if (r6 == null) goto L_0x0149;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r7 = r19
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.a
            gh2 r9 = r7.c
            r1 = 3
            r2 = 2
            r3 = 1
            m29 r4 = r7.b
            if (r0 == 0) goto L_0x0031
            if (r0 == r3) goto L_0x002c
            if (r0 == r2) goto L_0x0026
            if (r0 != r1) goto L_0x001e
            kotlin.ResultKt.throwOnFailure(r20)
            r0 = r20
            goto L_0x013f
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r20)
            r0 = r20
            goto L_0x0074
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r20)
            goto L_0x0172
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r20)
            boolean r0 = r4 instanceof defpackage.i29
            if (r0 == 0) goto L_0x0043
            i29 r4 = (defpackage.i29) r4
            r7.a = r3
            java.lang.Object r0 = defpackage.gh2.k(r9, r4, r7)
            if (r0 != r8) goto L_0x0172
            return r8
        L_0x0043:
            boolean r0 = r4 instanceof defpackage.j29
            if (r0 == 0) goto L_0x0060
            j29 r4 = (defpackage.j29) r4
            java.lang.CharSequence r0 = r4.x
            if (r0 != 0) goto L_0x0050
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0050:
            s85 r1 = r9.I0
            hf2 r2 = new hf2
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            defpackage.xag.h(r1, r2)
            goto L_0x0172
        L_0x0060:
            boolean r0 = r4 instanceof defpackage.l29
            if (r0 == 0) goto L_0x014c
            r0 = r4
            l29 r0 = (defpackage.l29) r0
            long r5 = r0.b
            r7.a = r2
            kotlin.reflect.KProperty[] r0 = defpackage.gh2.P0
            java.lang.Object r0 = r9.t(r5, r7)
            if (r0 != r8) goto L_0x0074
            return r8
        L_0x0074:
            a89 r0 = (defpackage.a89) r0
            if (r0 != 0) goto L_0x007b
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x007b:
            l29 r4 = (defpackage.l29) r4
            k29 r5 = r4.v
            int r5 = r5.ordinal()
            r6 = 0
            ha9 r0 = r0.a
            if (r5 == 0) goto L_0x00f8
            if (r5 == r3) goto L_0x00c5
            if (r5 != r2) goto L_0x00bf
            w28 r0 = r0.x0
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r0.b
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00bc
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x009c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b8
            java.lang.Object r2 = r0.next()
            r3 = r2
            l20 r3 = (defpackage.l20) r3
            if (r3 == 0) goto L_0x009c
            x10 r3 = r3.b
            if (r3 == 0) goto L_0x009c
            long r10 = r4.c
            long r12 = r3.y
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x009c
            r6 = r2
        L_0x00b8:
            l20 r6 = (defpackage.l20) r6
            if (r6 != 0) goto L_0x0129
        L_0x00bc:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00bf:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00c5:
            w28 r0 = r0.x0
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r0.b
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00f5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x00d5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00f1
            java.lang.Object r2 = r0.next()
            r3 = r2
            l20 r3 = (defpackage.l20) r3
            if (r3 == 0) goto L_0x00d5
            k20 r3 = r3.d
            if (r3 == 0) goto L_0x00d5
            long r10 = r4.c
            long r12 = r3.a
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x00d5
            r6 = r2
        L_0x00f1:
            l20 r6 = (defpackage.l20) r6
            if (r6 != 0) goto L_0x0129
        L_0x00f5:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00f8:
            w28 r0 = r0.x0
            if (r0 == 0) goto L_0x0149
            java.lang.Object r0 = r0.b
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0149
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0108:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0124
            java.lang.Object r2 = r0.next()
            r3 = r2
            l20 r3 = (defpackage.l20) r3
            if (r3 == 0) goto L_0x0108
            x10 r3 = r3.b
            if (r3 == 0) goto L_0x0108
            long r10 = r4.c
            long r12 = r3.y
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0108
            r6 = r2
        L_0x0124:
            l20 r6 = (defpackage.l20) r6
            if (r6 != 0) goto L_0x0129
            goto L_0x0149
        L_0x0129:
            long r2 = r9.b
            long r4 = r4.b
            r7.a = r1
            java.lang.String r6 = r6.q
            r10 = 0
            r0 = r9
            r1 = r2
            r3 = r6
            r6 = r10
            r7 = r19
            java.lang.Object r0 = r0.u(r1, r3, r4, r6, r7)
            if (r0 != r8) goto L_0x013f
            return r8
        L_0x013f:
            mf2 r0 = (defpackage.mf2) r0
            if (r0 == 0) goto L_0x0172
            s85 r1 = r9.I0
            defpackage.xag.h(r1, r0)
            goto L_0x0172
        L_0x0149:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x014c:
            boolean r0 = r4 instanceof defpackage.c29
            if (r0 == 0) goto L_0x0175
            kotlin.reflect.KProperty[] r0 = defpackage.gh2.P0
            kotlin.Lazy r0 = r9.y0
            java.lang.Object r0 = r0.getValue()
            r10 = r0
            cpb r10 = (defpackage.cpb) r10
            c29 r4 = (defpackage.c29) r4
            long r13 = r4.b
            java.lang.String r15 = r4.o
            java.lang.String r0 = r4.v
            java.lang.String r1 = r4.y
            java.lang.String r2 = r4.w
            long r11 = r9.b
            r16 = r0
            r17 = r1
            r18 = r2
            r10.b(r11, r13, r15, r16, r17, r18)
        L_0x0172:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0175:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
