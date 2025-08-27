package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: nl9  reason: default package */
public final class nl9 extends SuspendLambda implements Function2 {
    public long a;
    public boolean b;
    public boolean c;
    public ybe o;
    public int v;
    public final /* synthetic */ en9 w;
    public final /* synthetic */ ui9 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nl9(en9 en9, ui9 ui9, Continuation continuation) {
        super(2, continuation);
        this.w = en9;
        this.x = ui9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new nl9(this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nl9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: l20} */
    /* JADX WARNING: type inference failed for: r0v39, types: [o00] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01c9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0250 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01cf  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r7 = r21
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.v
            d20 r6 = defpackage.d20.c
            r1 = 1
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            ui9 r10 = r7.x
            en9 r11 = r7.w
            if (r0 == 0) goto L_0x0053
            if (r0 == r1) goto L_0x004c
            if (r0 == r5) goto L_0x003d
            if (r0 == r4) goto L_0x0038
            if (r0 == r3) goto L_0x0028
            if (r0 != r2) goto L_0x0020
            goto L_0x0038
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0028:
            boolean r0 = r7.c
            boolean r1 = r7.b
            long r3 = r7.a
            ybe r5 = r7.o
            kotlin.ResultKt.throwOnFailure(r22)
            r15 = r1
            r1 = r22
            goto L_0x0221
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r22)
            goto L_0x0287
        L_0x003d:
            boolean r0 = r7.c
            boolean r1 = r7.b
            long r2 = r7.a
            kotlin.ResultKt.throwOnFailure(r22)
            r14 = r0
            r12 = r2
            r0 = r22
            goto L_0x0199
        L_0x004c:
            kotlin.ResultKt.throwOnFailure(r22)
            r0 = r22
            goto L_0x00f2
        L_0x0053:
            kotlin.ResultKt.throwOnFailure(r22)
            cx9 r0 = r11.v()
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x007a
            boolean r0 = r10 instanceof defpackage.pi9
            if (r0 != 0) goto L_0x006c
            boolean r0 = r10 instanceof defpackage.qi9
            if (r0 != 0) goto L_0x006c
            boolean r0 = r10 instanceof defpackage.ti9
            if (r0 == 0) goto L_0x007a
        L_0x006c:
            cx9 r0 = r11.v()
            long r1 = r10.m()
            r0.f(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x007a:
            boolean r0 = r10 instanceof defpackage.si9
            cpb r12 = r11.x
            if (r0 == 0) goto L_0x00a8
            si9 r10 = (defpackage.si9) r10
            long r0 = r10.b
            r2 = 10
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            bcb r1 = defpackage.bcb.a
            s85 r4 = r11.q1
            if (r0 >= 0) goto L_0x0091
            defpackage.xag.h(r4, r1)
        L_0x0091:
            long r5 = r10.c
            long r7 = r10.b
            long r5 = r5 - r7
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x009d
            defpackage.xag.h(r4, r1)
        L_0x009d:
            long r0 = r10.b
            dy9 r2 = r12.a
            xy9 r2 = (defpackage.xy9) r2
            r2.v(r0)
            goto L_0x0287
        L_0x00a8:
            boolean r0 = r10 instanceof defpackage.oi9
            if (r0 == 0) goto L_0x00cd
            oi9 r10 = (defpackage.oi9) r10
            l50 r0 = r10.b
            r12.getClass()
            long r13 = r0.a
            java.lang.String r1 = r0.e
            java.lang.String r2 = r0.d
            long r3 = r0.b
            java.lang.String r5 = r0.f
            java.lang.String r0 = r0.g
            r15 = r3
            r17 = r1
            r18 = r2
            r19 = r5
            r20 = r0
            r12.b(r13, r15, r17, r18, r19, r20)
            goto L_0x0287
        L_0x00cd:
            boolean r0 = r10 instanceof defpackage.pi9
            if (r0 == 0) goto L_0x0108
            pi9 r10 = (defpackage.pi9) r10
            o00 r0 = r10.b
            boolean r2 = r0 instanceof defpackage.dl3
            if (r2 == 0) goto L_0x00dd
            r9 = r0
            dl3 r9 = (defpackage.dl3) r9
            goto L_0x00de
        L_0x00dd:
            r9 = 0
        L_0x00de:
            if (r9 != 0) goto L_0x00e3
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00e3:
            r7.v = r1
            qx2 r0 = r11.y
            my2 r0 = (defpackage.my2) r0
            long r1 = r9.a
            java.lang.Object r0 = r0.u(r1, r7)
            if (r0 != r8) goto L_0x00f2
            return r8
        L_0x00f2:
            a32 r0 = (defpackage.a32) r0
            if (r0 != 0) goto L_0x00f9
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00f9:
            s85 r1 = r11.t1
            fk9 r2 = defpackage.fk9.b
            long r3 = r0.a
            pa4 r0 = r2.o1(r3)
            defpackage.xag.h(r1, r0)
            goto L_0x0287
        L_0x0108:
            boolean r0 = r10 instanceof defpackage.qi9
            if (r0 == 0) goto L_0x013b
            qi9 r10 = (defpackage.qi9) r10
            o00 r0 = r10.b
            boolean r1 = r0 instanceof defpackage.dl3
            if (r1 == 0) goto L_0x0118
            r9 = r0
            dl3 r9 = (defpackage.dl3) r9
            goto L_0x0119
        L_0x0118:
            r9 = 0
        L_0x0119:
            if (r9 != 0) goto L_0x011e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x011e:
            cl3 r0 = defpackage.cl3.o
            cl3 r1 = r9.f
            long r2 = r9.a
            if (r1 != r0) goto L_0x0136
            m4b r0 = new m4b
            java.lang.String r1 = r9.b
            java.lang.String r4 = r9.c
            r0.<init>(r2, r1, r4)
            s85 r1 = r11.t1
            defpackage.xag.h(r1, r0)
            goto L_0x0287
        L_0x0136:
            r11.z(r2)
            goto L_0x0287
        L_0x013b:
            boolean r0 = r10 instanceof defpackage.ti9
            if (r0 == 0) goto L_0x0158
            ti9 r10 = (defpackage.ti9) r10
            o00 r0 = r10.b
            boolean r1 = r0 instanceof defpackage.w4e
            if (r1 == 0) goto L_0x014b
            r9 = r0
            w4e r9 = (defpackage.w4e) r9
            goto L_0x014c
        L_0x014b:
            r9 = 0
        L_0x014c:
            if (r9 != 0) goto L_0x0151
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0151:
            java.lang.String r0 = r9.b
            r11.x(r0)
            goto L_0x0287
        L_0x0158:
            boolean r0 = r10 instanceof defpackage.ri9
            if (r0 == 0) goto L_0x028a
            r0 = r10
            ri9 r0 = (defpackage.ri9) r0
            long r12 = r0.b
            kotlin.Lazy r14 = r11.Y0
            java.lang.Object r15 = r14.getValue()
            ed2 r15 = (defpackage.ed2) r15
            boolean r15 = r15.e()
            java.lang.Object r14 = r14.getValue()
            ed2 r14 = (defpackage.ed2) r14
            boolean r14 = r14.c(r1)
            o00 r0 = r0.a
            boolean r2 = r0 instanceof defpackage.o43
            kotlin.Lazy r9 = r11.O0
            if (r2 == 0) goto L_0x01fc
            java.lang.Object r0 = r9.getValue()
            c48 r0 = (defpackage.c48) r0
            mka r0 = r0.a(r12, r1)
            r7.a = r12
            r7.b = r15
            r7.c = r14
            r7.v = r5
            java.lang.Object r0 = defpackage.bs0.f(r0, r7)
            if (r0 != r8) goto L_0x0198
            return r8
        L_0x0198:
            r1 = r15
        L_0x0199:
            a89 r0 = (defpackage.a89) r0
            ha9 r0 = r0.a
            w28 r0 = r0.x0
            if (r0 == 0) goto L_0x01f9
            java.lang.Object r0 = r0.b
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x01f9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x01ad:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01c9
            java.lang.Object r2 = r0.next()
            r3 = r2
            l20 r3 = (defpackage.l20) r3
            java.lang.String r3 = r3.q
            r5 = r10
            ri9 r5 = (defpackage.ri9) r5
            java.lang.String r5 = r5.c
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r5)
            if (r3 == 0) goto L_0x01ad
            r9 = r2
            goto L_0x01ca
        L_0x01c9:
            r9 = 0
        L_0x01ca:
            l20 r9 = (defpackage.l20) r9
            if (r9 != 0) goto L_0x01cf
            goto L_0x01f9
        L_0x01cf:
            boolean r0 = r9.d()
            if (r0 == 0) goto L_0x01d6
            goto L_0x01d7
        L_0x01d6:
            r14 = r1
        L_0x01d7:
            d20 r0 = r9.n
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0287
            if (r14 == 0) goto L_0x0287
            kotlin.reflect.KProperty[] r0 = defpackage.en9.A1
            swf r0 = r11.u()
            go9 r1 = r11.b
            long r1 = r1.a
            r7.v = r4
            java.lang.String r5 = r9.q
            r3 = r12
            r7 = r21
            java.lang.Object r0 = r0.a(r1, r3, r5, r6, r7)
            if (r0 != r8) goto L_0x0287
            return r8
        L_0x01f9:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01fc:
            boolean r2 = r0 instanceof defpackage.ybe
            if (r2 == 0) goto L_0x0287
            java.lang.Object r2 = r9.getValue()
            c48 r2 = (defpackage.c48) r2
            mka r1 = r2.a(r12, r1)
            r2 = r0
            ybe r2 = (defpackage.ybe) r2
            r7.o = r2
            r7.a = r12
            r7.b = r15
            r7.c = r14
            r7.v = r3
            java.lang.Object r1 = defpackage.bs0.f(r1, r7)
            if (r1 != r8) goto L_0x021e
            return r8
        L_0x021e:
            r5 = r0
            r3 = r12
            r0 = r14
        L_0x0221:
            a89 r1 = (defpackage.a89) r1
            ha9 r1 = r1.a
            w28 r1 = r1.x0
            if (r1 == 0) goto L_0x0284
            java.lang.Object r1 = r1.b
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0284
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0235:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0250
            java.lang.Object r2 = r1.next()
            r9 = r2
            l20 r9 = (defpackage.l20) r9
            java.lang.String r9 = r9.q
            r10 = r5
            ybe r10 = (defpackage.ybe) r10
            java.lang.String r10 = r10.b
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x0235
            goto L_0x0251
        L_0x0250:
            r2 = 0
        L_0x0251:
            l20 r2 = (defpackage.l20) r2
            if (r2 != 0) goto L_0x0256
            goto L_0x0284
        L_0x0256:
            boolean r1 = r2.d()
            if (r1 == 0) goto L_0x025d
            goto L_0x025e
        L_0x025d:
            r0 = r15
        L_0x025e:
            d20 r1 = r2.n
            boolean r1 = r1.c()
            if (r1 != 0) goto L_0x0287
            if (r0 == 0) goto L_0x0287
            kotlin.reflect.KProperty[] r0 = defpackage.en9.A1
            swf r0 = r11.u()
            go9 r1 = r11.b
            long r9 = r1.a
            r1 = 0
            r7.o = r1
            r1 = 5
            r7.v = r1
            java.lang.String r5 = r2.q
            r1 = r9
            r7 = r21
            java.lang.Object r0 = r0.a(r1, r3, r5, r6, r7)
            if (r0 != r8) goto L_0x0287
            return r8
        L_0x0284:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0287:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x028a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
