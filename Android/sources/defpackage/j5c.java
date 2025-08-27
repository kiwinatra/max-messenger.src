package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* renamed from: j5c  reason: default package */
public final class j5c implements lwb {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public j5c(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
    }

    public static void c(List list, vk3 vk3, ngf ngf, String str, boolean z, eyb eyb) {
        long r = vk3.r();
        String f = vk3.f();
        if (f == null) {
            f = "";
        }
        String str2 = f;
        List list2 = list;
        list.add(new lo3(r, str2, eyb == eyb.SETUP_NEW_ADMIN ? ngf.a : ngf, str, z, vk3.q(), eyb, 0, true, Uuid.SIZE_BITS));
    }

    public static void d(List list, cyb cyb, boolean z) {
        List list2 = list;
        int i = fxa.I;
        long j = gxa.c;
        igf igf = new igf(ixa.T0);
        byb byb = cyb.m;
        boolean z2 = byb.b;
        s1e s1e = r3;
        s1e s1e2 = new s1e(j, 0, igf, z2 ? h1e.b : h1e.o, (ngf) null, (Integer) null, new d1e(byb.a, z2), (y0e) null, (ngf) null, 0, 944);
        p7 p7Var = new p7(i, s1e);
        List list3 = list;
        list3.add(p7Var);
        if (z) {
            list3.add(new nmd(new igf(ixa.U0), puf.o, ConstantsKt.DEFAULT_BLOCK_SIZE, 2));
        }
    }

    public static void e(List list, cyb cyb, boolean z) {
        int i = fxa.F;
        long j = gxa.b;
        igf igf = new igf(z ? ixa.w1 : ixa.G1);
        igf igf2 = new igf(ixa.H1);
        byb byb = cyb.k;
        boolean z2 = byb.b;
        list.add(new p7(i, new s1e(j, 0, igf, z2 ? h1e.b : h1e.o, igf2, (Integer) null, new d1e(byb.a, z2), (y0e) null, (ngf) null, 0, 928)));
    }

    public static void g(List list, boolean z, boolean z2, eyb eyb) {
        List list2 = list;
        if (z && eyb == eyb.CHANGE_ADMIN) {
            if (z2) {
                int i = fxa.D;
                s1e s1e = r3;
                s1e s1e2 = new s1e(gxa.a, 0, new igf(ixa.e), (h1e) null, (ngf) null, Integer.valueOf(cad.T0), a1e.a, (y0e) null, (ngf) null, 0, 920);
                p7 p7Var = new p7(i, s1e, 1024);
                list2 = list;
                list2.add(p7Var);
            }
            list2.add(new vl4(new igf(ixa.V0)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0110 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.vk3 r32, defpackage.a32 r33, defpackage.cyb r34, defpackage.eyb r35, java.lang.Long r36, kotlin.coroutines.Continuation r37) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r36
            r4 = r37
            boolean r5 = r4 instanceof defpackage.e5c
            if (r5 == 0) goto L_0x001d
            r5 = r4
            e5c r5 = (defpackage.e5c) r5
            int r6 = r5.v0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.v0 = r6
            goto L_0x0022
        L_0x001d:
            e5c r5 = new e5c
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r4 = r5.Y
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r7 = r5.v0
            r8 = 2
            r10 = 1
            if (r7 == 0) goto L_0x0087
            if (r7 == r10) goto L_0x005b
            if (r7 != r8) goto L_0x0053
            int r0 = r5.X
            java.lang.Object r1 = r5.z
            ngf r1 = (defpackage.ngf) r1
            java.lang.Object r2 = r5.y
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r3 = r5.x
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r6 = r5.w
            java.util.List r6 = (java.util.List) r6
            eyb r7 = r5.v
            cyb r8 = r5.o
            a32 r11 = r5.c
            vk3 r12 = r5.b
            j5c r5 = r5.a
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x011c
        L_0x0053:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005b:
            int r0 = r5.X
            java.lang.Object r1 = r5.z
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r5.y
            java.util.List r2 = (java.util.List) r2
            java.util.List r3 = r5.x
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r7 = r5.w
            java.lang.Long r7 = (java.lang.Long) r7
            eyb r11 = r5.v
            cyb r12 = r5.o
            a32 r13 = r5.c
            vk3 r14 = r5.b
            j5c r15 = r5.a
            kotlin.ResultKt.throwOnFailure(r4)
            r29 = r2
            r2 = r1
            r1 = r4
            r4 = r29
            r30 = r7
            r7 = r3
            r3 = r30
            goto L_0x00eb
        L_0x0087:
            kotlin.ResultKt.throwOnFailure(r4)
            java.util.List r4 = kotlin.collections.CollectionsKt.createListBuilder()
            kotlin.Lazy r7 = r0.a
            java.lang.Object r7 = r7.getValue()
            ptb r7 = (defpackage.ptb) r7
            long r11 = r32.r()
            mtb r7 = r7.b(r11)
            r11 = 10
            int r7 = r7.a
            if (r7 == r11) goto L_0x00ae
            r11 = 20
            if (r7 == r11) goto L_0x00ae
            r11 = 40
            if (r7 == r11) goto L_0x00ae
            r7 = 0
            goto L_0x00af
        L_0x00ae:
            r7 = r10
        L_0x00af:
            kl0 r11 = defpackage.kl0.c
            java.lang.String r11 = r1.t(r11)
            if (r11 != 0) goto L_0x00b9
            java.lang.String r11 = ""
        L_0x00b9:
            r5.a = r0
            r5.b = r1
            r5.c = r2
            r12 = r34
            r5.o = r12
            r13 = r35
            r5.v = r13
            r5.w = r3
            r14 = r4
            java.util.List r14 = (java.util.List) r14
            r5.x = r14
            r5.y = r4
            r5.z = r11
            r5.X = r7
            r5.v0 = r10
            java.lang.Object r14 = r0.j(r3, r1, r2, r5)
            if (r14 != r6) goto L_0x00dd
            return r6
        L_0x00dd:
            r15 = r0
            r0 = r7
            r7 = r4
            r29 = r14
            r14 = r1
            r1 = r29
            r30 = r13
            r13 = r2
            r2 = r11
            r11 = r30
        L_0x00eb:
            ngf r1 = (defpackage.ngf) r1
            boolean r9 = r13.s()
            r5.a = r15
            r5.b = r14
            r5.c = r13
            r5.o = r12
            r5.v = r11
            r5.w = r7
            r10 = r4
            java.util.List r10 = (java.util.List) r10
            r5.x = r10
            r5.y = r2
            r5.z = r1
            r5.X = r0
            r5.v0 = r8
            java.lang.Object r3 = r15.h(r3, r9, r13, r5)
            if (r3 != r6) goto L_0x0111
            return r6
        L_0x0111:
            r6 = r7
            r7 = r11
            r8 = r12
            r11 = r13
            r12 = r14
            r5 = r15
            r29 = r4
            r4 = r3
            r3 = r29
        L_0x011c:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r0 == 0) goto L_0x0126
            r0 = 1
            goto L_0x0127
        L_0x0126:
            r0 = 0
        L_0x0127:
            r5.getClass()
            r31 = r3
            r32 = r12
            r33 = r1
            r34 = r2
            r35 = r0
            r36 = r7
            c(r31, r32, r33, r34, r35, r36)
            r0 = 1
            e(r3, r8, r0)
            p7 r0 = new p7
            int r1 = defpackage.fxa.R
            s1e r2 = new s1e
            long r17 = defpackage.gxa.i
            int r9 = defpackage.ixa.u1
            igf r10 = new igf
            r10.<init>(r9)
            byb r9 = r8.g
            boolean r13 = r9.b
            if (r13 == 0) goto L_0x0157
            h1e r14 = defpackage.h1e.b
        L_0x0154:
            r21 = r14
            goto L_0x015a
        L_0x0157:
            h1e r14 = defpackage.h1e.o
            goto L_0x0154
        L_0x015a:
            d1e r14 = new d1e
            boolean r9 = r9.a
            r14.<init>(r9, r13)
            r25 = 0
            r28 = 944(0x3b0, float:1.323E-42)
            r19 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r16 = r2
            r20 = r10
            r24 = r14
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r9 = 536871936(0x20000400, float:1.0843345E-19)
            r0.<init>(r1, r2, r9)
            r3.add(r0)
            p7 r0 = new p7
            int r1 = defpackage.fxa.O
            s1e r2 = new s1e
            long r17 = defpackage.gxa.g
            int r9 = defpackage.ixa.t1
            igf r10 = new igf
            r10.<init>(r9)
            byb r9 = r8.h
            boolean r13 = r9.b
            if (r13 == 0) goto L_0x019b
            h1e r14 = defpackage.h1e.b
        L_0x0198:
            r21 = r14
            goto L_0x019e
        L_0x019b:
            h1e r14 = defpackage.h1e.o
            goto L_0x0198
        L_0x019e:
            d1e r14 = new d1e
            boolean r9 = r9.a
            r14.<init>(r9, r13)
            r25 = 0
            r28 = 944(0x3b0, float:1.323E-42)
            r19 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r16 = r2
            r20 = r10
            r24 = r14
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r9 = 1073742848(0x40000400, float:2.0002441)
            r0.<init>(r1, r2, r9)
            r3.add(r0)
            p7 r0 = new p7
            int r1 = defpackage.fxa.L
            s1e r2 = new s1e
            long r17 = defpackage.gxa.d
            int r10 = defpackage.ixa.q1
            igf r13 = new igf
            r13.<init>(r10)
            byb r10 = r8.i
            boolean r14 = r10.b
            if (r14 == 0) goto L_0x01df
            h1e r15 = defpackage.h1e.b
        L_0x01dc:
            r21 = r15
            goto L_0x01e2
        L_0x01df:
            h1e r15 = defpackage.h1e.o
            goto L_0x01dc
        L_0x01e2:
            d1e r15 = new d1e
            boolean r10 = r10.a
            r15.<init>(r10, r14)
            r25 = 0
            r28 = 944(0x3b0, float:1.323E-42)
            r19 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r16 = r2
            r20 = r13
            r24 = r15
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0.<init>(r1, r2, r9)
            r3.add(r0)
            p7 r0 = new p7
            int r1 = defpackage.fxa.P
            s1e r2 = new s1e
            long r17 = defpackage.gxa.h
            int r9 = defpackage.ixa.h1
            igf r10 = new igf
            r10.<init>(r9)
            byb r9 = r8.j
            boolean r13 = r9.b
            if (r13 == 0) goto L_0x0220
            h1e r14 = defpackage.h1e.b
        L_0x021d:
            r21 = r14
            goto L_0x0223
        L_0x0220:
            h1e r14 = defpackage.h1e.o
            goto L_0x021d
        L_0x0223:
            d1e r14 = new d1e
            boolean r9 = r9.a
            r14.<init>(r9, r13)
            r25 = 0
            r28 = 944(0x3b0, float:1.323E-42)
            r19 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r16 = r2
            r20 = r10
            r24 = r14
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r9 = -2147482624(0xffffffff80000400, float:-1.435E-42)
            r0.<init>(r1, r2, r9)
            r3.add(r0)
            r0 = 0
            r1 = 1
            r5.f(r3, r8, r1, r0)
            boolean r2 = r12.w
            if (r2 != 0) goto L_0x025f
            long r9 = r12.r()
            boolean r5 = r11.Z(r9)
            if (r5 != 0) goto L_0x025f
            r5 = r1
            goto L_0x0260
        L_0x025f:
            r5 = r0
        L_0x0260:
            d(r3, r8, r5)
            if (r4 == 0) goto L_0x0273
            if (r2 != 0) goto L_0x0273
            long r4 = r12.r()
            boolean r2 = r11.Z(r4)
            if (r2 != 0) goto L_0x0273
            r9 = r1
            goto L_0x0274
        L_0x0273:
            r9 = r0
        L_0x0274:
            boolean r0 = r11.e0()
            g(r3, r9, r0, r7)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5c.a(vk3, a32, cyb, eyb, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0110 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.vk3 r32, defpackage.a32 r33, defpackage.cyb r34, defpackage.eyb r35, java.lang.Long r36, kotlin.coroutines.Continuation r37) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r36
            r4 = r37
            boolean r5 = r4 instanceof defpackage.f5c
            if (r5 == 0) goto L_0x001d
            r5 = r4
            f5c r5 = (defpackage.f5c) r5
            int r6 = r5.v0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.v0 = r6
            goto L_0x0022
        L_0x001d:
            f5c r5 = new f5c
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r4 = r5.Y
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r7 = r5.v0
            r8 = 2
            r10 = 1
            if (r7 == 0) goto L_0x0087
            if (r7 == r10) goto L_0x005b
            if (r7 != r8) goto L_0x0053
            int r0 = r5.X
            java.lang.Object r1 = r5.z
            ngf r1 = (defpackage.ngf) r1
            java.lang.Object r2 = r5.y
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r3 = r5.x
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r6 = r5.w
            java.util.List r6 = (java.util.List) r6
            eyb r7 = r5.v
            cyb r8 = r5.o
            a32 r11 = r5.c
            vk3 r12 = r5.b
            j5c r5 = r5.a
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x011c
        L_0x0053:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005b:
            int r0 = r5.X
            java.lang.Object r1 = r5.z
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r5.y
            java.util.List r2 = (java.util.List) r2
            java.util.List r3 = r5.x
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r7 = r5.w
            java.lang.Long r7 = (java.lang.Long) r7
            eyb r11 = r5.v
            cyb r12 = r5.o
            a32 r13 = r5.c
            vk3 r14 = r5.b
            j5c r15 = r5.a
            kotlin.ResultKt.throwOnFailure(r4)
            r29 = r2
            r2 = r1
            r1 = r4
            r4 = r29
            r30 = r7
            r7 = r3
            r3 = r30
            goto L_0x00eb
        L_0x0087:
            kotlin.ResultKt.throwOnFailure(r4)
            java.util.List r4 = kotlin.collections.CollectionsKt.createListBuilder()
            kotlin.Lazy r7 = r0.a
            java.lang.Object r7 = r7.getValue()
            ptb r7 = (defpackage.ptb) r7
            long r11 = r32.r()
            mtb r7 = r7.b(r11)
            r11 = 10
            int r7 = r7.a
            if (r7 == r11) goto L_0x00ae
            r11 = 20
            if (r7 == r11) goto L_0x00ae
            r11 = 40
            if (r7 == r11) goto L_0x00ae
            r7 = 0
            goto L_0x00af
        L_0x00ae:
            r7 = r10
        L_0x00af:
            kl0 r11 = defpackage.kl0.c
            java.lang.String r11 = r1.t(r11)
            if (r11 != 0) goto L_0x00b9
            java.lang.String r11 = ""
        L_0x00b9:
            r5.a = r0
            r5.b = r1
            r5.c = r2
            r12 = r34
            r5.o = r12
            r13 = r35
            r5.v = r13
            r5.w = r3
            r14 = r4
            java.util.List r14 = (java.util.List) r14
            r5.x = r14
            r5.y = r4
            r5.z = r11
            r5.X = r7
            r5.v0 = r10
            java.lang.Object r14 = r0.j(r3, r1, r2, r5)
            if (r14 != r6) goto L_0x00dd
            return r6
        L_0x00dd:
            r15 = r0
            r0 = r7
            r7 = r4
            r29 = r14
            r14 = r1
            r1 = r29
            r30 = r13
            r13 = r2
            r2 = r11
            r11 = r30
        L_0x00eb:
            ngf r1 = (defpackage.ngf) r1
            boolean r10 = r13.s()
            r5.a = r15
            r5.b = r14
            r5.c = r13
            r5.o = r12
            r5.v = r11
            r5.w = r7
            r9 = r4
            java.util.List r9 = (java.util.List) r9
            r5.x = r9
            r5.y = r2
            r5.z = r1
            r5.X = r0
            r5.v0 = r8
            java.lang.Object r3 = r15.h(r3, r10, r13, r5)
            if (r3 != r6) goto L_0x0111
            return r6
        L_0x0111:
            r6 = r7
            r7 = r11
            r8 = r12
            r11 = r13
            r12 = r14
            r5 = r15
            r29 = r4
            r4 = r3
            r3 = r29
        L_0x011c:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x012c
            byb r9 = r8.l
            boolean r9 = r9.a
            if (r9 == 0) goto L_0x012c
            r9 = 1
            goto L_0x012d
        L_0x012c:
            r9 = 0
        L_0x012d:
            if (r0 == 0) goto L_0x0131
            r0 = 1
            goto L_0x0132
        L_0x0131:
            r0 = 0
        L_0x0132:
            r5.getClass()
            r31 = r3
            r32 = r12
            r33 = r1
            r34 = r2
            r35 = r0
            r36 = r7
            c(r31, r32, r33, r34, r35, r36)
            r0 = 0
            e(r3, r8, r0)
            p7 r0 = new p7
            int r1 = defpackage.fxa.O
            s1e r2 = new s1e
            long r17 = defpackage.gxa.d
            int r10 = defpackage.ixa.b1
            igf r13 = new igf
            r13.<init>(r10)
            byb r10 = r8.i
            boolean r14 = r10.b
            if (r14 == 0) goto L_0x0162
            h1e r15 = defpackage.h1e.b
        L_0x015f:
            r21 = r15
            goto L_0x0165
        L_0x0162:
            h1e r15 = defpackage.h1e.o
            goto L_0x015f
        L_0x0165:
            d1e r15 = new d1e
            boolean r10 = r10.a
            r15.<init>(r10, r14)
            r25 = 0
            r28 = 944(0x3b0, float:1.323E-42)
            r19 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r16 = r2
            r20 = r13
            r24 = r15
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r10 = 536871936(0x20000400, float:1.0843345E-19)
            r0.<init>(r1, r2, r10)
            r3.add(r0)
            p7 r0 = new p7
            int r1 = defpackage.fxa.P
            s1e r2 = new s1e
            long r17 = defpackage.gxa.h
            int r10 = defpackage.ixa.h1
            igf r13 = new igf
            r13.<init>(r10)
            byb r10 = r8.j
            boolean r14 = r10.b
            if (r14 == 0) goto L_0x01a6
            h1e r15 = defpackage.h1e.b
        L_0x01a3:
            r21 = r15
            goto L_0x01a9
        L_0x01a6:
            h1e r15 = defpackage.h1e.o
            goto L_0x01a3
        L_0x01a9:
            d1e r15 = new d1e
            boolean r10 = r10.a
            r15.<init>(r10, r14)
            r25 = 0
            r28 = 944(0x3b0, float:1.323E-42)
            r19 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r16 = r2
            r20 = r13
            r24 = r15
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r10 = -2147482624(0xffffffff80000400, float:-1.435E-42)
            r0.<init>(r1, r2, r10)
            r3.add(r0)
            r0 = 0
            r5.f(r3, r8, r0, r9)
            boolean r1 = r12.w
            if (r1 != 0) goto L_0x01e4
            long r9 = r12.r()
            boolean r2 = r11.Z(r9)
            if (r2 != 0) goto L_0x01e4
            r2 = 1
            goto L_0x01e5
        L_0x01e4:
            r2 = r0
        L_0x01e5:
            d(r3, r8, r2)
            if (r4 == 0) goto L_0x01f8
            if (r1 != 0) goto L_0x01f8
            long r1 = r12.r()
            boolean r1 = r11.Z(r1)
            if (r1 != 0) goto L_0x01f8
            r9 = 1
            goto L_0x01f9
        L_0x01f8:
            r9 = r0
        L_0x01f9:
            boolean r0 = r11.e0()
            g(r3, r9, r0, r7)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5c.b(vk3, a32, cyb, eyb, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(List list, cyb cyb, boolean z, boolean z2) {
        List list2 = list;
        cyb cyb2 = cyb;
        int i = fxa.N;
        long j = gxa.f;
        igf igf = new igf(z ? ixa.r1 : ixa.a1);
        byb byb = cyb2.l;
        boolean z3 = byb.b;
        byb byb2 = byb;
        s1e s1e = r4;
        s1e s1e2 = new s1e(j, 0, igf, z3 ? h1e.b : h1e.o, (ngf) null, (Integer) null, new d1e(byb.a, z3), (y0e) null, (ngf) null, 0, 944);
        Lazy lazy = this.d;
        list2.add(new p7(i, s1e, (!((vj5) ((uj5) lazy.getValue())).n() || z) ? 1024 : 536871936));
        if (((vj5) ((uj5) lazy.getValue())).n() && !z) {
            list2.add(new p7(fxa.M, new s1e(gxa.e, 0, new igf(ixa.Z0), byb2.b ? h1e.b : h1e.o, (ngf) null, (Integer) null, new d1e(cyb2.f, z2), (y0e) null, (ngf) null, 0, 912), -2147482624));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.Long r5, boolean r6, defpackage.a32 r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.g5c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            g5c r0 = (defpackage.g5c) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            g5c r0 = new g5c
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            boolean r6 = r0.a
            java.lang.Long r5 = r0.c
            a32 r7 = r0.b
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0051
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.Lazy r4 = r4.c
            java.lang.Object r4 = r4.getValue()
            eu3 r4 = (defpackage.eu3) r4
            r0.b = r7
            r0.c = r5
            r0.a = r6
            r0.w = r3
            vk3 r8 = r4.d()
            if (r8 != r1) goto L_0x0051
            return r1
        L_0x0051:
            vk3 r8 = (defpackage.vk3) r8
            long r0 = r8.r()
            if (r5 != 0) goto L_0x005a
            goto L_0x0064
        L_0x005a:
            long r4 = r5.longValue()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0064
            if (r6 != 0) goto L_0x006c
        L_0x0064:
            boolean r4 = r7.e0()
            if (r4 == 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r3 = 0
        L_0x006c:
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5c.h(java.lang.Long, boolean, a32, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.Long r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.h5c
            if (r0 == 0) goto L_0x0013
            r0 = r12
            h5c r0 = (defpackage.h5c) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            h5c r0 = new h5c
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0088
        L_0x002d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0035:
            long r10 = r0.c
            long r6 = r0.b
            j5c r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0063
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r12)
            if (r11 == 0) goto L_0x00a1
            long r11 = r11.longValue()
            kotlin.Lazy r2 = r10.c
            java.lang.Object r2 = r2.getValue()
            eu3 r2 = (defpackage.eu3) r2
            r0.a = r10
            r0.b = r11
            r0.c = r11
            r0.w = r4
            vk3 r2 = r2.d()
            if (r2 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r6 = r11
            r12 = r2
            r2 = r10
            r10 = r6
        L_0x0063:
            vk3 r12 = (defpackage.vk3) r12
            long r8 = r12.r()
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0075
            int r10 = defpackage.ixa.e1
            igf r5 = new igf
            r5.<init>(r10)
            goto L_0x00a1
        L_0x0075:
            kotlin.Lazy r10 = r2.c
            java.lang.Object r10 = r10.getValue()
            eu3 r10 = (defpackage.eu3) r10
            r0.a = r5
            r0.w = r3
            java.lang.Object r12 = r10.b(r6, r0)
            if (r12 != r1) goto L_0x0088
            return r1
        L_0x0088:
            vk3 r12 = (defpackage.vk3) r12
            if (r12 == 0) goto L_0x00a1
            java.lang.String r10 = r12.f()
            if (r10 == 0) goto L_0x00a1
            int r11 = defpackage.ixa.d1
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            kgf r5 = new kgf
            java.util.List r10 = kotlin.collections.ArraysKt.toList((T[]) r10)
            r5.<init>(r11, r10)
        L_0x00a1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5c.i(java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.Long r5, defpackage.vk3 r6, defpackage.a32 r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.i5c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            i5c r0 = (defpackage.i5c) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            i5c r0 = new i5c
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            a32 r7 = r0.c
            vk3 r6 = r0.b
            j5c r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.a = r4
            r0.b = r6
            r0.c = r7
            r0.w = r3
            java.lang.Object r8 = r4.i(r5, r0)
            if (r8 != r1) goto L_0x0049
            return r1
        L_0x0049:
            ngf r8 = (defpackage.ngf) r8
            boolean r5 = r6.w
            if (r5 == 0) goto L_0x0057
            int r4 = defpackage.ixa.f1
            igf r8 = new igf
            r8.<init>(r4)
            goto L_0x0084
        L_0x0057:
            long r0 = r6.r()
            boolean r5 = r7.Z(r0)
            if (r5 == 0) goto L_0x0069
            int r4 = defpackage.ixa.c1
            igf r8 = new igf
            r8.<init>(r4)
            goto L_0x0084
        L_0x0069:
            if (r8 != 0) goto L_0x0084
            kotlin.Lazy r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            ttb r4 = (defpackage.ttb) r4
            kotlin.Lazy r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            rtb r4 = (defpackage.rtb) r4
            java.lang.CharSequence r4 = r4.d(r6, r3)
            mgf r8 = new mgf
            r8.<init>(r4)
        L_0x0084:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5c.j(java.lang.Long, vk3, a32, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
