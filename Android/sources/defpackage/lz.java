package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: lz  reason: default package */
public final class lz extends SuspendLambda implements Function2 {
    public final /* synthetic */ oz a;
    public final /* synthetic */ a89 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lz(oz ozVar, a89 a89, Long l, int i, Continuation continuation) {
        super(2, continuation);
        this.a = ozVar;
        this.b = a89;
        this.c = l;
        this.o = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new lz(this.a, this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lz) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r15)
            oz r15 = r14.a
            r15.getClass()
            a89 r0 = r14.b
            ha9 r1 = r0.a
            int r1 = r1.b()
            kotlin.Lazy r2 = r15.i
            int r3 = r14.o
            java.lang.String r4 = ""
            ha9 r5 = r0.a
            if (r1 != 0) goto L_0x003b
            java.lang.String r1 = r5.y
            if (r1 == 0) goto L_0x003b
            int r6 = r1.length()
            if (r6 != 0) goto L_0x0028
            goto L_0x003b
        L_0x0028:
            java.lang.Object r14 = r2.getValue()
            yva r14 = (defpackage.yva) r14
            java.util.List r15 = r5.P0
            java.lang.CharSequence r14 = r14.l(r3, r1, r15)
            if (r14 != 0) goto L_0x0038
            goto L_0x022b
        L_0x0038:
            r4 = r14
            goto L_0x022b
        L_0x003b:
            java.lang.Long r14 = r14.c
            r1 = 0
            r6 = 1
            if (r14 == 0) goto L_0x00d6
            long r7 = r14.longValue()
            w28 r14 = r5.x0
            if (r14 == 0) goto L_0x00d6
            java.lang.Object r14 = r14.b
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L_0x00d6
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
        L_0x0055:
            boolean r9 = r14.hasNext()
            if (r9 == 0) goto L_0x00d2
            java.lang.Object r9 = r14.next()
            r10 = r9
            l20 r10 = (defpackage.l20) r10
            g20 r11 = r10.a
            if (r11 != 0) goto L_0x0068
            r11 = -1
            goto L_0x0070
        L_0x0068:
            int[] r12 = defpackage.kz.$EnumSwitchMapping$0
            int r11 = r11.ordinal()
            r11 = r12[r11]
        L_0x0070:
            if (r11 == r6) goto L_0x00c7
            r12 = 2
            if (r11 == r12) goto L_0x00bc
            r12 = 3
            if (r11 == r12) goto L_0x00b1
            r12 = 4
            if (r11 == r12) goto L_0x00a6
            r12 = 5
            if (r11 != r12) goto L_0x0089
            i10 r10 = r10.e
            if (r10 == 0) goto L_0x0055
            long r10 = r10.a
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0055
            goto L_0x00d3
        L_0x0089:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Attach with given id = "
            r15.<init>(r0)
            r15.append(r7)
            java.lang.String r0 = " not found"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x00a6:
            s10 r10 = r10.j
            if (r10 == 0) goto L_0x0055
            long r10 = r10.a
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0055
            goto L_0x00d3
        L_0x00b1:
            c20 r10 = r10.g
            if (r10 == 0) goto L_0x0055
            long r10 = r10.a
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0055
            goto L_0x00d3
        L_0x00bc:
            k20 r10 = r10.d
            if (r10 == 0) goto L_0x0055
            long r10 = r10.a
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0055
            goto L_0x00d3
        L_0x00c7:
            x10 r10 = r10.b
            if (r10 == 0) goto L_0x0055
            long r10 = r10.y
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0055
            goto L_0x00d3
        L_0x00d2:
            r9 = r1
        L_0x00d3:
            l20 r9 = (defpackage.l20) r9
            goto L_0x00d7
        L_0x00d6:
            r9 = r1
        L_0x00d7:
            kotlin.Lazy r14 = r15.b
            r7 = 0
            if (r9 == 0) goto L_0x0158
            boolean r0 = r9.f()
            if (r0 == 0) goto L_0x00f0
            android.content.Context r14 = r15.a()
            x10 r15 = r9.b
            boolean r15 = r15.v
            java.lang.String r4 = defpackage.ghf.r(r14, r15, r7)
            goto L_0x022b
        L_0x00f0:
            boolean r0 = r9.g()
            if (r0 == 0) goto L_0x0120
            android.content.Context r14 = r15.a()
            java.lang.String[] r15 = defpackage.ghf.c
            c20 r15 = r9.g
            java.lang.String r0 = r15.e
            boolean r1 = defpackage.cvg.D(r0)
            if (r1 == 0) goto L_0x0109
        L_0x0106:
            r4 = r0
            goto L_0x022b
        L_0x0109:
            java.lang.String r15 = r15.c
            boolean r0 = defpackage.cvg.D(r15)
            if (r0 != 0) goto L_0x0114
        L_0x0111:
            r4 = r15
            goto L_0x022b
        L_0x0114:
            int r15 = defpackage.tmc.tt_link
            java.lang.String r14 = r14.getString(r15)
            java.lang.String r14 = kotlin.text.StringsKt.capitalize(r14)
            goto L_0x0038
        L_0x0120:
            boolean r0 = r9.c()
            if (r0 == 0) goto L_0x012c
            s10 r14 = r9.j
            java.lang.String r4 = r14.c
            goto L_0x022b
        L_0x012c:
            boolean r0 = r9.i()
            if (r0 == 0) goto L_0x013c
            android.content.Context r14 = r15.a()
            java.lang.String r4 = defpackage.ghf.t(r14, r7)
            goto L_0x022b
        L_0x013c:
            boolean r0 = r9.a()
            if (r0 == 0) goto L_0x022b
            android.content.Context r15 = r15.a()
            java.lang.Object r14 = r14.getValue()
            fq r14 = (defpackage.fq) r14
            pid r14 = (defpackage.pid) r14
            boolean r14 = r14.q()
            java.lang.String r4 = defpackage.ghf.g(r15, r7, r14)
            goto L_0x022b
        L_0x0158:
            java.lang.String r8 = r5.y
            if (r8 == 0) goto L_0x019a
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0163
            goto L_0x019a
        L_0x0163:
            boolean r8 = r5.F()
            if (r8 != 0) goto L_0x019a
            boolean r8 = r5.E()
            java.lang.String r9 = r5.y
            if (r8 != 0) goto L_0x0173
            r6 = r7
            goto L_0x0188
        L_0x0173:
            if (r9 == 0) goto L_0x0188
            int r8 = r9.length()
            if (r8 != 0) goto L_0x017c
            goto L_0x0188
        L_0x017c:
            c20 r6 = r5.k()
            if (r6 == 0) goto L_0x0184
            java.lang.String r1 = r6.b
        L_0x0184:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r1)
        L_0x0188:
            if (r6 != 0) goto L_0x019a
            java.lang.Object r14 = r2.getValue()
            yva r14 = (defpackage.yva) r14
            java.util.List r15 = r5.P0
            java.lang.CharSequence r14 = r14.l(r3, r9, r15)
            if (r14 != 0) goto L_0x0038
            goto L_0x022b
        L_0x019a:
            boolean r1 = r5.E()
            if (r1 == 0) goto L_0x01d8
            android.content.Context r14 = r15.a()
            c20 r15 = r5.k()
            if (r15 == 0) goto L_0x01cc
            java.lang.String[] r0 = defpackage.ghf.c
            java.lang.String r0 = r15.e
            boolean r1 = defpackage.cvg.D(r0)
            if (r1 == 0) goto L_0x01b6
            goto L_0x0106
        L_0x01b6:
            java.lang.String r15 = r15.c
            boolean r0 = defpackage.cvg.D(r15)
            if (r0 != 0) goto L_0x01c0
            goto L_0x0111
        L_0x01c0:
            int r15 = defpackage.tmc.tt_link
            java.lang.String r14 = r14.getString(r15)
            java.lang.String r14 = kotlin.text.StringsKt.capitalize(r14)
            goto L_0x0038
        L_0x01cc:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "Required value was null."
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x01d8:
            boolean r1 = r5.y()
            if (r1 == 0) goto L_0x01f3
            android.content.Context r14 = r15.a()
            n10 r0 = r5.e()
            kotlin.Lazy r15 = r15.h
            java.lang.Object r15 = r15.getValue()
            bl3 r15 = (defpackage.bl3) r15
            java.lang.String r4 = defpackage.ghf.j(r14, r0, r15, r7, r7)
            goto L_0x022b
        L_0x01f3:
            kotlin.Lazy r1 = r15.a
            java.lang.Object r1 = r1.getValue()
            r3 = r1
            ghf r3 = (defpackage.ghf) r3
            android.content.Context r4 = r15.a()
            java.lang.Object r1 = r2.getValue()
            r5 = r1
            yva r5 = (defpackage.yva) r5
            java.lang.Object r14 = r14.getValue()
            fq r14 = (defpackage.fq) r14
            pid r14 = (defpackage.pid) r14
            boolean r10 = r14.q()
            kotlin.Lazy r14 = r15.c
            java.lang.Object r14 = r14.getValue()
            x23 r14 = (defpackage.x23) r14
            qjd r14 = (defpackage.qjd) r14
            long r11 = r14.s()
            r8 = 0
            r9 = 0
            ha9 r6 = r0.a
            r7 = 0
            r13 = 0
            java.lang.String r4 = r3.f(r4, r5, r6, r7, r8, r9, r10, r11, r13)
        L_0x022b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
