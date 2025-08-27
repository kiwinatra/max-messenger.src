package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: o3e  reason: default package */
public final class o3e extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ y3e c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o3e(y3e y3e, Continuation continuation) {
        super(2, continuation);
        this.c = y3e;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        o3e o3e = new o3e(this.c, continuation);
        o3e.b = obj;
        return o3e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o3e) create((tzd) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: wvd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: wvd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: wvd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: wvd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 2
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r10.a
            r3 = 1
            if (r2 == 0) goto L_0x001c
            if (r2 == r3) goto L_0x0017
            if (r2 != r0) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0017:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x011e
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.b
            tzd r11 = (defpackage.tzd) r11
            boolean r2 = r11 instanceof defpackage.szd
            r4 = 0
            y3e r5 = r10.c
            if (r2 == 0) goto L_0x009f
            szd r11 = (defpackage.szd) r11
            vxd r2 = r11.a
            long r6 = r2.a
            java.lang.Long r2 = r5.A0
            if (r2 != 0) goto L_0x0036
            goto L_0x011e
        L_0x0036:
            long r8 = r2.longValue()
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x011e
            r5.A0 = r4
            vxd r11 = r11.a
            java.util.List r11 = r11.b
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r2 = r11.iterator()
        L_0x004a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x005c
            java.lang.Object r6 = r2.next()
            r7 = r6
            wvd r7 = (defpackage.wvd) r7
            boolean r7 = r7.v
            if (r7 == 0) goto L_0x004a
            r4 = r6
        L_0x005c:
            wvd r4 = (defpackage.wvd) r4
            r5.C0 = r4
            java.util.ArrayList r2 = r5.D0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x006b:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x0081
            java.lang.Object r6 = r11.next()
            r7 = r6
            wvd r7 = (defpackage.wvd) r7
            boolean r7 = r7.v
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x006b
            r4.add(r6)
            goto L_0x006b
        L_0x0081:
            ui0 r11 = new ui0
            r6 = 21
            r11.<init>(r6)
            xm4 r6 = new xm4
            r6.<init>(r11, r0)
            java.util.List r11 = kotlin.collections.CollectionsKt.sortedWith(r4, r6)
            java.util.Collection r11 = (java.util.Collection) r11
            r2.addAll(r11)
            r10.a = r3
            java.lang.Object r10 = defpackage.y3e.j(r5, r10)
            if (r10 != r1) goto L_0x011e
            return r1
        L_0x009f:
            boolean r2 = r11 instanceof defpackage.pzd
            if (r2 == 0) goto L_0x00c3
            pzd r11 = (defpackage.pzd) r11
            sh3 r10 = r11.a
            int r10 = r10.b
            r11 = 3
            if (r10 != r11) goto L_0x011e
            kotlin.reflect.KProperty[] r10 = defpackage.y3e.I0
            java.lang.Long r10 = r5.A0
            if (r10 != 0) goto L_0x011e
            rl r10 = r5.k()
            jna r10 = (defpackage.jna) r10
            long r10 = r10.V()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r5.A0 = r10
            goto L_0x011e
        L_0x00c3:
            boolean r2 = r11 instanceof defpackage.rzd
            if (r2 == 0) goto L_0x00e8
            rzd r11 = (defpackage.rzd) r11
            txd r11 = r11.a
            long r2 = r11.a
            java.lang.Long r11 = r5.B0
            if (r11 != 0) goto L_0x00d2
            goto L_0x011e
        L_0x00d2:
            long r6 = r11.longValue()
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 != 0) goto L_0x011e
            java.util.ArrayList r11 = r5.D0
            r11.clear()
            r10.a = r0
            java.lang.Object r10 = defpackage.y3e.j(r5, r10)
            if (r10 != r1) goto L_0x011e
            return r1
        L_0x00e8:
            boolean r10 = r11 instanceof defpackage.qzd
            if (r10 == 0) goto L_0x0121
            qzd r11 = (defpackage.qzd) r11
            long r10 = r11.a
            java.lang.Long r0 = r5.B0
            if (r0 != 0) goto L_0x00f5
            goto L_0x010f
        L_0x00f5:
            long r0 = r0.longValue()
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x010f
            r5.B0 = r4
            yzd r10 = new yzd
            int r11 = defpackage.vza.x
            igf r0 = new igf
            r0.<init>(r11)
            r10.<init>(r0)
            r5.q(r10)
            goto L_0x011e
        L_0x010f:
            java.lang.Long r0 = r5.A0
            if (r0 != 0) goto L_0x0114
            goto L_0x011e
        L_0x0114:
            long r0 = r0.longValue()
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x011e
            r5.A0 = r4
        L_0x011e:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x0121:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o3e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
