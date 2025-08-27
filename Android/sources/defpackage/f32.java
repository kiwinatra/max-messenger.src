package defpackage;

import kotlin.Lazy;

/* renamed from: f32  reason: default package */
public final class f32 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public f32(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = lazy2;
        this.b = lazy;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0256  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r20, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r23
            boolean r2 = r1 instanceof defpackage.e32
            if (r2 == 0) goto L_0x0017
            r2 = r1
            e32 r2 = (defpackage.e32) r2
            int r3 = r2.z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.z = r3
            goto L_0x001c
        L_0x0017:
            e32 r2 = new e32
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.x
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.z
            r5 = 0
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L_0x0086
            if (r4 == r9) goto L_0x0077
            if (r4 == r8) goto L_0x0069
            if (r4 == r7) goto L_0x0050
            if (r4 != r6) goto L_0x0048
            boolean r0 = r2.w
            java.util.List r3 = r2.o
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r2.c
            java.util.List r4 = (java.util.List) r4
            java.lang.Comparable r5 = r2.b
            a32 r5 = (defpackage.a32) r5
            f32 r2 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x019e
        L_0x0048:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0050:
            boolean r0 = r2.w
            java.util.List r4 = r2.v
            java.util.List r4 = (java.util.List) r4
            java.util.List r7 = r2.o
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r2.c
            zx5 r8 = (defpackage.zx5) r8
            java.lang.Comparable r10 = r2.b
            a32 r10 = (defpackage.a32) r10
            f32 r11 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x013e
        L_0x0069:
            java.lang.Object r0 = r2.c
            a32 r0 = (defpackage.a32) r0
            java.lang.Comparable r4 = r2.b
            java.lang.String r4 = (java.lang.String) r4
            f32 r8 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00ce
        L_0x0077:
            java.lang.Comparable r0 = r2.b
            java.lang.String r0 = (java.lang.String) r0
            f32 r4 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            r18 = r4
            r4 = r0
            r0 = r18
            goto L_0x00a4
        L_0x0086:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.Lazy r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            qx2 r1 = (defpackage.qx2) r1
            r2.a = r0
            r4 = r22
            r2.b = r4
            r2.z = r9
            my2 r1 = (defpackage.my2) r1
            r10 = r20
            java.lang.Object r1 = r1.l(r10, r2)
            if (r1 != r3) goto L_0x00a4
            return r3
        L_0x00a4:
            a32 r1 = (defpackage.a32) r1
            if (r1 != 0) goto L_0x00ad
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        L_0x00ad:
            if (r4 == 0) goto L_0x00d7
            kotlin.Lazy r10 = r0.c
            java.lang.Object r10 = r10.getValue()
            u82 r10 = (defpackage.u82) r10
            r2.a = r0
            r2.b = r4
            r2.c = r1
            r2.z = r8
            ia2 r10 = (defpackage.ia2) r10
            java.lang.Object r8 = r10.d(r4, r2)
            if (r8 != r3) goto L_0x00c8
            return r3
        L_0x00c8:
            r18 = r8
            r8 = r0
            r0 = r1
            r1 = r18
        L_0x00ce:
            zx5 r1 = (defpackage.zx5) r1
            r12 = r4
            r18 = r8
            r8 = r1
            r1 = r18
            goto L_0x00de
        L_0x00d7:
            r12 = r4
            r8 = r5
            r18 = r1
            r1 = r0
            r0 = r18
        L_0x00de:
            kotlin.Lazy r4 = r1.d
            java.lang.Object r4 = r4.getValue()
            x23 r4 = (defpackage.x23) r4
            qjd r4 = (defpackage.qjd) r4
            long r10 = r4.s()
            m72 r4 = r0.b
            boolean r4 = r4.h(r10)
            java.util.List r16 = kotlin.collections.CollectionsKt.createListBuilder()
            if (r8 == 0) goto L_0x0152
            boolean r10 = r8.b()
            if (r10 != r9) goto L_0x0152
            kotlin.Lazy r10 = r1.c
            java.lang.Object r10 = r10.getValue()
            u82 r10 = (defpackage.u82) r10
            m72 r11 = r0.b
            long r13 = r11.a
            r2.a = r1
            r2.b = r0
            r2.c = r8
            r11 = r16
            java.util.List r11 = (java.util.List) r11
            r2.o = r11
            r2.v = r11
            r2.w = r4
            r2.z = r7
            r7 = r10
            ia2 r7 = (defpackage.ia2) r7
            r7.getClass()
            o92 r15 = new o92
            r17 = 0
            r10 = r15
            r11 = r7
            r6 = r15
            r15 = r17
            r10.<init>(r11, r12, r13, r15)
            kotlin.coroutines.CoroutineContext r7 = r7.x
            java.lang.Object r6 = defpackage.ev0.I(r7, r6, r2)
            if (r6 != r3) goto L_0x0137
            return r3
        L_0x0137:
            r10 = r0
            r11 = r1
            r0 = r4
            r1 = r6
            r4 = r16
            r7 = r4
        L_0x013e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x014c
            c32 r1 = defpackage.c32.a
            r4.add(r1)
            goto L_0x0158
        L_0x014c:
            c32 r1 = defpackage.c32.b
            r4.add(r1)
            goto L_0x0158
        L_0x0152:
            r10 = r0
            r11 = r1
            r0 = r4
            r4 = r16
            r7 = r4
        L_0x0158:
            if (r8 == 0) goto L_0x0161
            boolean r1 = r8.b()
            if (r1 != r9) goto L_0x0161
            goto L_0x0163
        L_0x0161:
            if (r8 != 0) goto L_0x01c5
        L_0x0163:
            boolean r1 = r10.O()
            if (r1 == 0) goto L_0x016f
            c32 r1 = defpackage.c32.o
            r4.add(r1)
            goto L_0x01c5
        L_0x016f:
            kotlin.Lazy r1 = r11.a
            java.lang.Object r1 = r1.getValue()
            fu2 r1 = (defpackage.fu2) r1
            r2.a = r11
            r2.b = r10
            r2.c = r7
            r6 = r4
            java.util.List r6 = (java.util.List) r6
            r2.o = r6
            r2.v = r5
            r2.w = r0
            r5 = 4
            r2.z = r5
            my2 r1 = (defpackage.my2) r1
            r62 r1 = r1.n()
            int r1 = r1.L()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            if (r1 != r3) goto L_0x019a
            return r3
        L_0x019a:
            r3 = r4
            r4 = r7
            r5 = r10
            r2 = r11
        L_0x019e:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            kotlin.Lazy r6 = r2.e
            java.lang.Object r6 = r6.getValue()
            bud r6 = (defpackage.bud) r6
            akd r6 = (defpackage.akd) r6
            r6.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f65maxfavoritechats
            r8 = 5
            long r8 = (long) r8
            long r6 = r6.r(r7, r8)
            int r6 = (int) r6
            if (r1 >= r6) goto L_0x01c1
            c32 r1 = defpackage.c32.c
            r3.add(r1)
        L_0x01c1:
            r11 = r2
            r7 = r4
            r10 = r5
            r4 = r3
        L_0x01c5:
            boolean r1 = r10.H()
            m72 r2 = r10.b
            a89 r3 = r10.c
            if (r1 != 0) goto L_0x01e1
            boolean r1 = r10.f0()
            if (r1 == 0) goto L_0x01e1
            int r1 = r2.m
            if (r1 != 0) goto L_0x01e1
            if (r3 == 0) goto L_0x01e1
            c32 r1 = defpackage.c32.v
            r4.add(r1)
            goto L_0x01f2
        L_0x01e1:
            boolean r1 = r10.f0()
            if (r1 == 0) goto L_0x01f2
            int r1 = r2.m
            if (r1 <= 0) goto L_0x01f2
            if (r3 == 0) goto L_0x01f2
            c32 r1 = defpackage.c32.w
            r4.add(r1)
        L_0x01f2:
            if (r0 != 0) goto L_0x022c
            boolean r1 = r10.E()
            if (r1 == 0) goto L_0x022c
            boolean r1 = r10.h0()
            if (r1 == 0) goto L_0x020e
            boolean r1 = r10.g0()
            if (r1 != 0) goto L_0x022c
            if (r3 == 0) goto L_0x022c
            c32 r1 = defpackage.c32.A0
            r4.add(r1)
            goto L_0x022c
        L_0x020e:
            kotlin.Lazy r1 = r11.d
            java.lang.Object r1 = r1.getValue()
            x23 r1 = (defpackage.x23) r1
            boolean r1 = r10.X(r1)
            if (r1 == 0) goto L_0x0223
            c32 r1 = defpackage.c32.y
            boolean r1 = r4.add(r1)
            goto L_0x0229
        L_0x0223:
            c32 r1 = defpackage.c32.x
            boolean r1 = r4.add(r1)
        L_0x0229:
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
        L_0x022c:
            c32 r1 = defpackage.c32.y0
            r4.add(r1)
            if (r0 != 0) goto L_0x0256
            boolean r1 = r10.K()
            if (r1 == 0) goto L_0x0256
            boolean r0 = r10.e0()
            if (r0 == 0) goto L_0x024b
            c32 r0 = defpackage.c32.X
            r4.add(r0)
            c32 r0 = defpackage.c32.Z
            boolean r0 = r4.add(r0)
            goto L_0x0251
        L_0x024b:
            c32 r0 = defpackage.c32.Y
            boolean r0 = r4.add(r0)
        L_0x0251:
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            goto L_0x02f8
        L_0x0256:
            if (r0 == 0) goto L_0x0261
            if (r3 == 0) goto L_0x02f8
            c32 r0 = defpackage.c32.D0
            r4.add(r0)
            goto L_0x02f8
        L_0x0261:
            boolean r0 = r10.U()
            if (r0 != 0) goto L_0x026d
            boolean r0 = r10.M()
            if (r0 == 0) goto L_0x027a
        L_0x026d:
            boolean r0 = r10.g0()
            if (r0 != 0) goto L_0x027a
            c32 r0 = defpackage.c32.z
            r4.add(r0)
            goto L_0x02f8
        L_0x027a:
            boolean r0 = r10.J()
            if (r0 == 0) goto L_0x02cb
            boolean r0 = r10.g0()
            if (r0 != 0) goto L_0x0293
            boolean r0 = r10.h0()
            if (r0 != 0) goto L_0x0293
            if (r3 == 0) goto L_0x0293
            c32 r0 = defpackage.c32.A0
            r4.add(r0)
        L_0x0293:
            kotlin.Lazy r0 = r11.e
            java.lang.Object r0 = r0.getValue()
            bud r0 = (defpackage.bud) r0
            akd r0 = (defpackage.akd) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f11botcomplaintenabled
            r2 = 0
            boolean r0 = r0.m(r1, r2)
            if (r0 == 0) goto L_0x02ae
            c32 r0 = defpackage.c32.z0
            r4.add(r0)
        L_0x02ae:
            boolean r0 = r10.g0()
            if (r0 != 0) goto L_0x02c5
            boolean r0 = r10.h0()
            if (r0 != 0) goto L_0x02c5
            c32 r0 = defpackage.c32.B0
            r4.add(r0)
            c32 r0 = defpackage.c32.C0
            r4.add(r0)
            goto L_0x02f8
        L_0x02c5:
            c32 r0 = defpackage.c32.w0
            r4.add(r0)
            goto L_0x02f8
        L_0x02cb:
            boolean r0 = r10.N()
            if (r0 == 0) goto L_0x02e2
            boolean r0 = r10.g0()
            if (r0 != 0) goto L_0x02e2
            c32 r0 = defpackage.c32.x0
            r4.add(r0)
            c32 r0 = defpackage.c32.w0
            r4.add(r0)
            goto L_0x02f8
        L_0x02e2:
            boolean r0 = r10.g0()
            if (r0 != 0) goto L_0x02f8
            c32 r0 = defpackage.c32.z
            r4.add(r0)
            boolean r0 = r10.c0()
            if (r0 == 0) goto L_0x02f8
            c32 r0 = defpackage.c32.v0
            r4.add(r0)
        L_0x02f8:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f32.a(long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
