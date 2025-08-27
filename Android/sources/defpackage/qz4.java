package defpackage;

import kotlin.Lazy;

/* renamed from: qz4  reason: default package */
public final class qz4 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public qz4() {
        bzb bzb = bzb.a;
        this.a = bzb.getAccessor().h(bud.class);
        this.b = bzb.getAccessor().h(uj5.class);
        this.c = bzb.getAccessor().h(pid.class);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        r7 = r7.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(defpackage.xz4 r35) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            java.lang.String r2 = "6M"
            r3 = -1
            r4 = 2
            boolean r5 = r1 instanceof defpackage.m82
            a1e r14 = defpackage.a1e.a
            mgf r19 = defpackage.ngf.a
            r15 = 0
            r13 = 1
            if (r5 == 0) goto L_0x0467
            m82 r1 = (defpackage.m82) r1
            boolean r2 = r1.C
            r5 = 0
            kotlin.Lazy r6 = r0.b
            xme r7 = r1.k
            if (r2 == 0) goto L_0x0257
            java.lang.Object r2 = r7.getValue()
            nz4 r2 = (defpackage.nz4) r2
            if (r2 != 0) goto L_0x002b
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0639
        L_0x002b:
            java.util.concurrent.atomic.AtomicBoolean r7 = r1.p
            boolean r7 = r7.get()
            java.lang.String r8 = r2.f
            c63 r14 = r2.e
            java.lang.String r2 = r2.d
            if (r7 == 0) goto L_0x022c
            a32 r7 = r1.p()
            if (r7 == 0) goto L_0x0046
            m72 r7 = r7.b
            if (r7 == 0) goto L_0x0046
            int r7 = r7.r0
            goto L_0x0047
        L_0x0046:
            r7 = r15
        L_0x0047:
            if (r7 != 0) goto L_0x004b
            r7 = r3
            goto L_0x0053
        L_0x004b:
            int[] r16 = defpackage.pz4.$EnumSwitchMapping$0
            int r7 = defpackage.tr1.y(r7)
            r7 = r16[r7]
        L_0x0053:
            if (r7 == r3) goto L_0x006f
            if (r7 == r13) goto L_0x0067
            if (r7 != r4) goto L_0x0061
            int r3 = defpackage.ixa.t
            igf r7 = new igf
            r7.<init>(r3)
            goto L_0x0071
        L_0x0061:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0067:
            int r3 = defpackage.ixa.u
            igf r7 = new igf
            r7.<init>(r3)
            goto L_0x0071
        L_0x006f:
            r7 = r19
        L_0x0071:
            java.util.List r3 = kotlin.collections.CollectionsKt.createListBuilder()
            tp5 r9 = new tp5
            r9.<init>(r2, r14)
            r3.add(r9)
            jm4 r2 = new jm4
            int r9 = defpackage.ixa.c0
            igf r14 = new igf
            r14.<init>(r9)
            bud r0 = r34.b()
            akd r0 = (defpackage.akd) r0
            int r0 = r0.s()
            r2.<init>(r8, r14, r0)
            r3.add(r2)
            java.lang.Object r0 = r6.getValue()
            uj5 r0 = (defpackage.uj5) r0
            vj5 r0 = (defpackage.vj5) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f32editchanneltypescreenenabled
            boolean r0 = r0.m(r2, r15)
            boolean r8 = r1.D
            if (r0 == 0) goto L_0x0100
            if (r8 == 0) goto L_0x0100
            a32 r0 = r1.p()
            if (r0 == 0) goto L_0x00ba
            m72 r0 = r0.b
            if (r0 == 0) goto L_0x00ba
            int r0 = r0.r0
            goto L_0x00bb
        L_0x00ba:
            r0 = r15
        L_0x00bb:
            if (r0 != r4) goto L_0x00bf
            r0 = r13
            goto L_0x00c0
        L_0x00bf:
            r0 = r15
        L_0x00c0:
            p7 r9 = new p7
            int r14 = defpackage.fxa.g
            s1e r13 = new s1e
            long r11 = (long) r14
            int r10 = defpackage.ixa.a
            igf r15 = new igf
            r15.<init>(r10)
            int r10 = defpackage.cad.f2
            java.lang.Integer r23 = java.lang.Integer.valueOf(r10)
            b1e r10 = new b1e
            r10.<init>(r7, r5)
            r25 = 0
            r28 = 920(0x398, float:1.289E-42)
            r19 = 0
            r21 = 0
            r22 = 0
            r26 = 0
            r27 = 0
            r16 = r13
            r17 = r11
            r20 = r15
            r24 = r10
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r0 == 0) goto L_0x00f8
            r0 = 536871936(0x20000400, float:1.0843345E-19)
            goto L_0x00fa
        L_0x00f8:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x00fa:
            r9.<init>(r14, r13, r0)
            r3.add(r9)
        L_0x0100:
            boolean r0 = r1.E
            if (r0 == 0) goto L_0x0166
            a32 r0 = r1.p()
            if (r0 == 0) goto L_0x0111
            m72 r0 = r0.b
            if (r0 == 0) goto L_0x0111
            int r0 = r0.r0
            goto L_0x0112
        L_0x0111:
            r0 = 0
        L_0x0112:
            if (r0 != r4) goto L_0x0166
            java.lang.Object r0 = r6.getValue()
            uj5 r0 = (defpackage.uj5) r0
            vj5 r0 = (defpackage.vj5) r0
            r0.getClass()
            r1 = 0
            boolean r0 = r0.m(r2, r1)
            if (r0 == 0) goto L_0x012a
            if (r8 == 0) goto L_0x012a
            r15 = 1
            goto L_0x012b
        L_0x012a:
            r15 = 0
        L_0x012b:
            p7 r0 = new p7
            int r1 = defpackage.fxa.h0
            s1e r2 = new s1e
            long r4 = (long) r1
            int r6 = defpackage.ixa.i0
            igf r7 = new igf
            r7.<init>(r6)
            int r6 = defpackage.cad.h1
            java.lang.Integer r23 = java.lang.Integer.valueOf(r6)
            r25 = 0
            r28 = 984(0x3d8, float:1.379E-42)
            r19 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r16 = r2
            r17 = r4
            r20 = r7
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r15 == 0) goto L_0x015e
            r9 = -2147482624(0xffffffff80000400, float:-1.435E-42)
            goto L_0x0160
        L_0x015e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0160:
            r0.<init>(r1, r2, r9)
            r3.add(r0)
        L_0x0166:
            if (r8 == 0) goto L_0x0196
            p7 r0 = new p7
            int r1 = defpackage.fxa.D
            s1e r2 = new s1e
            long r10 = (long) r1
            int r4 = defpackage.ixa.e
            igf r13 = new igf
            r13.<init>(r4)
            int r4 = defpackage.cad.T0
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            r18 = 0
            r21 = 984(0x3d8, float:1.379E-42)
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r9 = r2
            r9.<init>(r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r10 = 536871936(0x20000400, float:1.0843345E-19)
            r0.<init>(r1, r2, r10)
            r3.add(r0)
        L_0x0196:
            if (r8 == 0) goto L_0x01c6
            p7 r0 = new p7
            int r1 = defpackage.fxa.h
            s1e r2 = new s1e
            long r10 = (long) r1
            int r4 = defpackage.ixa.c
            igf r13 = new igf
            r13.<init>(r4)
            int r4 = defpackage.cad.y
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            r18 = 0
            r21 = 984(0x3d8, float:1.379E-42)
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r9 = r2
            r9.<init>(r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r12 = 1073742848(0x40000400, float:2.0002441)
            r0.<init>(r1, r2, r12)
            r3.add(r0)
        L_0x01c6:
            if (r8 == 0) goto L_0x01f7
            p7 r0 = new p7
            int r1 = defpackage.fxa.v
            long r10 = (long) r1
            int r2 = defpackage.ixa.f
            igf r13 = new igf
            r13.<init>(r2)
            int r2 = defpackage.cad.C
            h1e r14 = defpackage.h1e.c
            s1e r4 = new s1e
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)
            r18 = 0
            r21 = 976(0x3d0, float:1.368E-42)
            r12 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r9 = r4
            r9.<init>(r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = -2147482624(0xffffffff80000400, float:-1.435E-42)
            r0.<init>(r1, r4, r2)
            r3.add(r0)
        L_0x01f7:
            if (r8 == 0) goto L_0x0226
            p7 r0 = new p7
            int r1 = defpackage.fxa.n
            long r5 = (long) r1
            int r2 = defpackage.ixa.E
            igf r8 = new igf
            r8.<init>(r2)
            int r2 = defpackage.nad.P1
            h1e r9 = defpackage.h1e.c
            s1e r15 = new s1e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r13 = 0
            r16 = 976(0x3d0, float:1.368E-42)
            r7 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r2 = 0
            r4 = r15
            r29 = r15
            r15 = r2
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2 = r29
            r0.<init>(r1, r2)
            r3.add(r0)
        L_0x0226:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r3)
            goto L_0x0639
        L_0x022c:
            java.util.List r1 = kotlin.collections.CollectionsKt.createListBuilder()
            tp5 r3 = new tp5
            r3.<init>(r2, r14)
            r1.add(r3)
            jm4 r2 = new jm4
            int r3 = defpackage.ixa.c0
            igf r4 = new igf
            r4.<init>(r3)
            bud r0 = r34.b()
            akd r0 = (defpackage.akd) r0
            int r0 = r0.s()
            r2.<init>(r8, r4, r0)
            r1.add(r2)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r1)
            goto L_0x0639
        L_0x0257:
            r2 = -2147482624(0xffffffff80000400, float:-1.435E-42)
            r10 = 536871936(0x20000400, float:1.0843345E-19)
            r12 = 1073742848(0x40000400, float:2.0002441)
            java.lang.Object r7 = r7.getValue()
            nz4 r7 = (defpackage.nz4) r7
            if (r7 != 0) goto L_0x026e
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0639
        L_0x026e:
            java.util.concurrent.atomic.AtomicBoolean r8 = r1.p
            boolean r8 = r8.get()
            java.lang.String r9 = r7.f
            c63 r11 = r7.e
            java.lang.String r7 = r7.d
            if (r8 == 0) goto L_0x043c
            a32 r1 = r1.p()
            if (r1 == 0) goto L_0x0289
            m72 r1 = r1.b
            if (r1 == 0) goto L_0x0289
            int r1 = r1.r0
            goto L_0x028a
        L_0x0289:
            r1 = 0
        L_0x028a:
            if (r1 != 0) goto L_0x028e
            r1 = r3
            goto L_0x0296
        L_0x028e:
            int[] r8 = defpackage.pz4.$EnumSwitchMapping$0
            int r1 = defpackage.tr1.y(r1)
            r1 = r8[r1]
        L_0x0296:
            if (r1 == r3) goto L_0x02b3
            r13 = 1
            if (r1 == r13) goto L_0x02ab
            if (r1 != r4) goto L_0x02a5
            int r1 = defpackage.ixa.t
            igf r3 = new igf
            r3.<init>(r1)
            goto L_0x02b5
        L_0x02a5:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02ab:
            int r1 = defpackage.ixa.u
            igf r3 = new igf
            r3.<init>(r1)
            goto L_0x02b5
        L_0x02b3:
            r3 = r19
        L_0x02b5:
            java.util.List r1 = kotlin.collections.CollectionsKt.createListBuilder()
            tp5 r4 = new tp5
            r4.<init>(r7, r11)
            r1.add(r4)
            jm4 r4 = new jm4
            int r7 = defpackage.ixa.d0
            igf r8 = new igf
            r8.<init>(r7)
            bud r0 = r34.b()
            akd r0 = (defpackage.akd) r0
            int r0 = r0.s()
            r4.<init>(r9, r8, r0)
            r1.add(r4)
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
            java.lang.Object r4 = r6.getValue()
            uj5 r4 = (defpackage.uj5) r4
            vj5 r4 = (defpackage.vj5) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f33editchattypescreenenabled
            r7 = 0
            boolean r4 = r4.m(r6, r7)
            if (r4 == 0) goto L_0x032c
            p7 r4 = new p7
            int r6 = defpackage.fxa.g
            s1e r7 = new s1e
            long r8 = (long) r6
            int r11 = defpackage.ixa.b
            igf r13 = new igf
            r13.<init>(r11)
            int r11 = defpackage.cad.f2
            java.lang.Integer r22 = java.lang.Integer.valueOf(r11)
            b1e r11 = new b1e
            r11.<init>(r3, r5)
            r25 = 0
            r26 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r27 = 920(0x398, float:1.289E-42)
            r15 = r7
            r16 = r8
            r19 = r13
            r23 = r11
            r15.<init>(r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = 1024(0x400, float:1.435E-42)
            r4.<init>(r6, r7, r3)
            r0.add(r4)
            goto L_0x032e
        L_0x032c:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x032e:
            p7 r4 = new p7
            int r5 = defpackage.fxa.E
            s1e r15 = new s1e
            long r7 = (long) r5
            int r6 = defpackage.ixa.h
            igf r11 = new igf
            r11.<init>(r6)
            int r6 = defpackage.cad.f1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r16 = 0
            r17 = 0
            r9 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 920(0x398, float:1.289E-42)
            r6 = r15
            r2 = r10
            r10 = r11
            r11 = r18
            r12 = r19
            r2 = r15
            r15 = r20
            r18 = r21
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.<init>(r5, r2, r3)
            r0.add(r4)
            p7 r2 = new p7
            int r3 = defpackage.fxa.D
            s1e r15 = new s1e
            long r5 = (long) r3
            int r4 = defpackage.ixa.e
            igf r8 = new igf
            r8.<init>(r4)
            int r4 = defpackage.cad.T0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r14 = 0
            r16 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r17 = 984(0x3d8, float:1.379E-42)
            r4 = r15
            r30 = r15
            r15 = r16
            r16 = r17
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5 = r30
            r4 = 536871936(0x20000400, float:1.0843345E-19)
            r2.<init>(r3, r5, r4)
            r0.add(r2)
            p7 r2 = new p7
            int r3 = defpackage.fxa.k
            s1e r15 = new s1e
            long r5 = (long) r3
            int r4 = defpackage.ixa.d
            igf r8 = new igf
            r8.<init>(r4)
            int r4 = defpackage.cad.y
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r14 = 0
            r16 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r17 = 984(0x3d8, float:1.379E-42)
            r4 = r15
            r31 = r15
            r15 = r16
            r16 = r17
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5 = r31
            r4 = 1073742848(0x40000400, float:2.0002441)
            r2.<init>(r3, r5, r4)
            r0.add(r2)
            p7 r2 = new p7
            int r3 = defpackage.fxa.z
            long r5 = (long) r3
            int r4 = defpackage.ixa.g
            igf r8 = new igf
            r8.<init>(r4)
            int r4 = defpackage.cad.C
            h1e r17 = defpackage.h1e.c
            s1e r15 = new s1e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r14 = 0
            r16 = 0
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r18 = 976(0x3d0, float:1.368E-42)
            r4 = r15
            r9 = r17
            r32 = r15
            r15 = r16
            r16 = r18
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5 = r32
            r4 = -2147482624(0xffffffff80000400, float:-1.435E-42)
            r2.<init>(r3, r5, r4)
            r0.add(r2)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            p7 r0 = new p7
            int r2 = defpackage.fxa.r
            long r10 = (long) r2
            int r3 = defpackage.ixa.L
            igf r13 = new igf
            r13.<init>(r3)
            int r3 = defpackage.nad.P1
            s1e r4 = new s1e
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)
            r18 = 0
            r21 = 976(0x3d0, float:1.368E-42)
            r12 = 0
            r15 = 0
            r3 = 0
            r19 = 0
            r20 = 0
            r9 = r4
            r14 = r17
            r17 = r3
            r9.<init>(r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0.<init>(r2, r4)
            r1.add(r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r1)
            goto L_0x0639
        L_0x043c:
            java.util.List r1 = kotlin.collections.CollectionsKt.createListBuilder()
            tp5 r2 = new tp5
            r2.<init>(r7, r11)
            r1.add(r2)
            jm4 r2 = new jm4
            int r3 = defpackage.ixa.d0
            igf r4 = new igf
            r4.<init>(r3)
            bud r0 = r34.b()
            akd r0 = (defpackage.akd) r0
            int r0 = r0.s()
            r2.<init>(r9, r4, r0)
            r1.add(r2)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r1)
            goto L_0x0639
        L_0x0467:
            boolean r5 = r1 instanceof defpackage.pn3
            if (r5 == 0) goto L_0x063a
            pn3 r1 = (defpackage.pn3) r1
            xme r5 = r1.k
            java.lang.Object r5 = r5.getValue()
            oz4 r5 = (defpackage.oz4) r5
            if (r5 != 0) goto L_0x047d
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0639
        L_0x047d:
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.C
            boolean r1 = r1.get()
            c63 r6 = r5.g
            java.lang.String r7 = r5.f
            c63 r8 = r5.e
            java.lang.String r9 = r5.c
            if (r1 == 0) goto L_0x05f2
            java.util.List r1 = kotlin.collections.CollectionsKt.createListBuilder()
            tp5 r10 = new tp5
            r10.<init>(r9, r8)
            r1.add(r10)
            wr7 r8 = new wr7
            r8.<init>(r7, r6)
            r1.add(r8)
            jm4 r6 = new jm4
            int r7 = defpackage.ixa.e0
            igf r8 = new igf
            r8.<init>(r7)
            bud r7 = r34.b()
            akd r7 = (defpackage.akd) r7
            int r7 = r7.s()
            java.lang.String r9 = r5.h
            r6.<init>(r9, r8, r7)
            r1.add(r6)
            bud r6 = r34.b()
            akd r6 = (defpackage.akd) r6
            r6.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f6accountnicknameenabled
            r15 = 0
            boolean r6 = r6.m(r7, r15)
            if (r6 == 0) goto L_0x0513
            p7 r12 = new p7
            int r11 = defpackage.fxa.v0
            long r7 = (long) r11
            int r6 = defpackage.ixa.I1
            igf r10 = new igf
            r10.<init>(r6)
            s1e r9 = new s1e
            r16 = 0
            r18 = 696(0x2b8, float:9.75E-43)
            r17 = 0
            ngf r6 = r5.i
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = r6
            r6 = r9
            r3 = r9
            r9 = r17
            r17 = r10
            r10 = r24
            r4 = r11
            r11 = r20
            r33 = r12
            r12 = r21
            r13 = r16
            r20 = r15
            r15 = r22
            r16 = r17
            r17 = r23
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r6 = r33
            r6.<init>(r4, r3)
            r1.add(r6)
            goto L_0x0515
        L_0x0513:
            r20 = r15
        L_0x0515:
            m0g r3 = r5.k
            if (r3 == 0) goto L_0x051d
            java.lang.String r3 = r3.a
            if (r3 != 0) goto L_0x052f
        L_0x051d:
            kotlin.Lazy r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            pid r0 = (defpackage.pid) r0
            hq r0 = (defpackage.hq) r0
            ls7 r0 = r0.g
            java.lang.String r3 = "app.privacy.inactive.ttl"
            java.lang.String r3 = r0.getString(r3, r2)
        L_0x052f:
            m0g r0 = defpackage.m0g.TTL_6M
            if (r3 == 0) goto L_0x0564
            int r4 = r3.hashCode()
            switch(r4) {
                case 1596: goto L_0x0550;
                case 1658: goto L_0x0545;
                case 1751: goto L_0x053c;
                default: goto L_0x053a;
            }
        L_0x053a:
            r3 = -1
            goto L_0x055b
        L_0x053c:
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0543
            goto L_0x053a
        L_0x0543:
            r3 = 2
            goto L_0x055b
        L_0x0545:
            java.lang.String r2 = "3M"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x054e
            goto L_0x053a
        L_0x054e:
            r3 = 1
            goto L_0x055b
        L_0x0550:
            java.lang.String r2 = "1M"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0559
            goto L_0x053a
        L_0x0559:
            r3 = r20
        L_0x055b:
            switch(r3) {
                case 0: goto L_0x0562;
                case 1: goto L_0x055f;
                case 2: goto L_0x0564;
                default: goto L_0x055e;
            }
        L_0x055e:
            goto L_0x0564
        L_0x055f:
            m0g r0 = defpackage.m0g.TTL_3M
            goto L_0x0564
        L_0x0562:
            m0g r0 = defpackage.m0g.TTL_1M
        L_0x0564:
            ae7 r2 = new ae7
            int r3 = defpackage.hxa.b
            int r0 = r0.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            ggf r6 = new ggf
            java.util.List r4 = kotlin.collections.ArraysKt.toList((T[]) r4)
            r6.<init>(r4, r3, r0)
            r2.<init>(r6)
            r1.add(r2)
            r98 r0 = defpackage.r98.a
            r1.add(r0)
            boolean r0 = r5.l
            if (r0 == 0) goto L_0x05de
            yv1 r0 = new yv1
            java.lang.Long r2 = r5.m
            if (r2 != 0) goto L_0x0593
        L_0x0590:
            r2 = r19
            goto L_0x05d7
        L_0x0593:
            bzb r3 = defpackage.bzb.a
            q4 r3 = r3.getAccessor()
            java.lang.Class<x23> r4 = defpackage.x23.class
            kotlin.Lazy r3 = r3.h(r4)
            java.lang.Object r3 = r3.getValue()
            x23 r3 = (defpackage.x23) r3
            qjd r3 = (defpackage.qjd) r3
            long r3 = r3.m()
            long r5 = r2.longValue()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x05b4
            goto L_0x0590
        L_0x05b4:
            long r5 = r2.longValue()
            long r5 = r5 - r3
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 / r2
            int r2 = (int) r5
            int r2 = r2 / 24
            r3 = 1
            if (r2 <= r3) goto L_0x05cd
            int r3 = defpackage.hxa.c
            egf r4 = new egf
            r4.<init>(r3, r2)
            r19 = r4
            goto L_0x0590
        L_0x05cd:
            int r2 = defpackage.ixa.H0
            igf r3 = new igf
            r3.<init>(r2)
            r19 = r3
            goto L_0x0590
        L_0x05d7:
            r0.<init>(r2)
            r1.add(r0)
            goto L_0x05ed
        L_0x05de:
            vl4 r0 = new vl4
            int r2 = defpackage.ixa.X
            igf r3 = new igf
            r3.<init>(r2)
            r0.<init>(r3)
            r1.add(r0)
        L_0x05ed:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r1)
            goto L_0x0639
        L_0x05f2:
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
            tp5 r1 = new tp5
            r1.<init>(r9, r8)
            r0.add(r1)
            wr7 r1 = new wr7
            r1.<init>(r7, r6)
            r0.add(r1)
            p7 r1 = new p7
            int r2 = defpackage.fxa.e0
            long r4 = (long) r2
            int r3 = defpackage.ixa.W
            igf r7 = new igf
            r7.<init>(r3)
            int r3 = defpackage.nad.P1
            h1e r8 = defpackage.h1e.c
            s1e r15 = new s1e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r12 = 0
            r16 = 976(0x3d0, float:1.368E-42)
            r6 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r3 = r15
            r34 = r0
            r0 = r15
            r15 = r16
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.<init>(r2, r0)
            r0 = r34
            r0.add(r1)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r0)
        L_0x0639:
            return r0
        L_0x063a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz4.a(xz4):java.util.List");
    }

    public final bud b() {
        return (bud) this.a.getValue();
    }
}
