package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bh2  reason: default package */
public final class bh2 extends SuspendLambda implements Function2 {
    public l20 a;
    public int b;
    public final /* synthetic */ gh2 c;
    public final /* synthetic */ m29 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bh2(gh2 gh2, m29 m29, Continuation continuation) {
        super(2, continuation);
        this.c = gh2;
        this.o = m29;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bh2(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bh2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            m29 r9 = r0.o
            gh2 r10 = r0.c
            if (r2 == 0) goto L_0x003f
            if (r2 == r8) goto L_0x0039
            if (r2 == r7) goto L_0x0030
            if (r2 == r6) goto L_0x002b
            if (r2 == r5) goto L_0x002b
            if (r2 != r4) goto L_0x0023
            kotlin.ResultKt.throwOnFailure(r25)
            goto L_0x00e0
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r25)
            goto L_0x01cf
        L_0x0030:
            l20 r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r25)
            r4 = r25
            goto L_0x018f
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r25)
            r2 = r25
            goto L_0x0052
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r25)
            r2 = r9
            l29 r2 = (defpackage.l29) r2
            long r11 = r2.b
            r0.b = r8
            kotlin.reflect.KProperty[] r2 = defpackage.gh2.P0
            java.lang.Object r2 = r10.t(r11, r0)
            if (r2 != r1) goto L_0x0052
            return r1
        L_0x0052:
            a89 r2 = (defpackage.a89) r2
            if (r2 != 0) goto L_0x0059
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0059:
            l29 r9 = (defpackage.l29) r9
            k29 r11 = r9.v
            int r11 = r11.ordinal()
            ha9 r2 = r2.a
            if (r11 == 0) goto L_0x0121
            if (r11 == r8) goto L_0x0071
            if (r11 != r7) goto L_0x006b
            goto L_0x0121
        L_0x006b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0071:
            w28 r5 = r2.x0
            if (r5 == 0) goto L_0x011e
            java.lang.Object r5 = r5.b
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x011e
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0081:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x009d
            java.lang.Object r6 = r5.next()
            r7 = r6
            l20 r7 = (defpackage.l20) r7
            if (r7 == 0) goto L_0x0081
            k20 r7 = r7.d
            if (r7 == 0) goto L_0x0081
            long r11 = r9.c
            long r13 = r7.a
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0081
            goto L_0x009e
        L_0x009d:
            r6 = r3
        L_0x009e:
            l20 r6 = (defpackage.l20) r6
            if (r6 != 0) goto L_0x00a4
            goto L_0x011e
        L_0x00a4:
            kotlin.reflect.KProperty[] r5 = defpackage.gh2.P0
            a32 r5 = r10.o()
            if (r5 == 0) goto L_0x011b
            m72 r5 = r5.b
            long r13 = r5.a
            jxb r5 = defpackage.jxb.a
            q4 r5 = r5.getAccessor()
            java.lang.Class<rh3> r7 = defpackage.rh3.class
            kotlin.Lazy r5 = r5.h(r7)
            java.lang.Object r5 = r5.getValue()
            rh3 r5 = (defpackage.rh3) r5
            boolean r5 = r5.e()
            if (r5 != 0) goto L_0x00e3
            gaf r2 = r10.q()
            osa r2 = (defpackage.osa) r2
            gc8 r2 = r2.c()
            ah2 r5 = new ah2
            r5.<init>(r10, r3)
            r0.b = r4
            java.lang.Object r0 = defpackage.ev0.I(r2, r5, r0)
            if (r0 != r1) goto L_0x00e0
            return r1
        L_0x00e0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00e3:
            long r0 = r9.c
            long r3 = r9.b
            k20 r5 = r6.d
            java.lang.String r5 = r5.l
            rl r7 = r10.w
            r11 = r7
            jna r11 = (defpackage.jna) r11
            java.lang.String r6 = r6.q
            r22 = 1
            r12 = 1
            r25 = r9
            long r8 = r2.c
            r15 = r13
            r13 = r0
            r17 = r8
            r19 = r3
            r21 = r6
            r23 = r5
            r11.W(r12, r13, r15, r17, r19, r21, r22, r23)
            xme r0 = r10.G0
            java.lang.Object r0 = r0.getValue()
            gz9 r0 = (defpackage.gz9) r0
            r9 = r25
            long r1 = r9.b
            r0.a(r1)
            r0 = 1
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            goto L_0x01cf
        L_0x011b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x011e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0121:
            w28 r2 = r2.x0
            if (r2 == 0) goto L_0x01d2
            java.lang.Object r2 = r2.b
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x01d2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0131:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x014d
            java.lang.Object r4 = r2.next()
            r8 = r4
            l20 r8 = (defpackage.l20) r8
            if (r8 == 0) goto L_0x0131
            x10 r8 = r8.b
            if (r8 == 0) goto L_0x0131
            long r11 = r9.c
            long r13 = r8.y
            int r8 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x0131
            goto L_0x014e
        L_0x014d:
            r4 = r3
        L_0x014e:
            r2 = r4
            l20 r2 = (defpackage.l20) r2
            if (r2 != 0) goto L_0x0155
            goto L_0x01d2
        L_0x0155:
            boolean r4 = r2.d()
            x10 r8 = r2.b
            if (r4 == 0) goto L_0x0174
            java.lang.String r4 = r8.a
            boolean r8 = defpackage.cvg.A(r4)
            if (r8 != 0) goto L_0x016b
            boolean r8 = defpackage.cvg.A(r4)
            if (r8 == 0) goto L_0x016d
        L_0x016b:
            r4 = r3
            goto L_0x0178
        L_0x016d:
            java.lang.String r8 = "&fn=legacy_44"
            java.lang.String r4 = defpackage.tr1.j(r4, r8)
            goto L_0x0178
        L_0x0174:
            java.lang.String r4 = r8.a()
        L_0x0178:
            kotlin.Lazy r8 = r10.Z
            java.lang.Object r8 = r8.getValue()
            vcd r8 = (defpackage.vcd) r8
            boolean r9 = r2.d()
            r0.a = r2
            r0.b = r7
            java.lang.Object r4 = r8.b(r4, r9, r0)
            if (r4 != r1) goto L_0x018f
            return r1
        L_0x018f:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01b3
            kotlin.reflect.KProperty[] r4 = defpackage.gh2.P0
            gaf r4 = r10.q()
            osa r4 = (defpackage.osa) r4
            gc8 r4 = r4.c()
            yg2 r5 = new yg2
            r5.<init>(r2, r10, r3)
            r0.a = r3
            r0.b = r6
            java.lang.Object r0 = defpackage.ev0.I(r4, r5, r0)
            if (r0 != r1) goto L_0x01cf
            return r1
        L_0x01b3:
            kotlin.reflect.KProperty[] r2 = defpackage.gh2.P0
            gaf r2 = r10.q()
            osa r2 = (defpackage.osa) r2
            gc8 r2 = r2.c()
            zg2 r4 = new zg2
            r4.<init>(r10, r3)
            r0.a = r3
            r0.b = r5
            java.lang.Object r0 = defpackage.ev0.I(r2, r4, r0)
            if (r0 != r1) goto L_0x01cf
            return r1
        L_0x01cf:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01d2:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
