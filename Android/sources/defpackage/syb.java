package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: syb  reason: default package */
public final class syb extends xag {
    public static final /* synthetic */ KProperty[] C0;
    public final wie A0;
    public final etc B0;
    public final Lazy X;
    public final Lazy Y;
    public final xme Z;
    public final long b;
    public final long c;
    public final eyb o;
    public final boolean v;
    public final xme v0 = f6e.a((Object) null);
    public final qx2 w;
    public final boolean w0;
    public final eu3 x;
    public final s85 x0;
    public final Lazy y;
    public final s85 y0;
    public final Lazy z;
    public final wie z0;

    static {
        Class<syb> cls = syb.class;
        C0 = new KProperty[]{rae.s(cls, "goToProfileJob", "getGoToProfileJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "disableActionClickJob", "getDisableActionClickJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public syb(long j, long j2, eyb eyb, boolean z2, qx2 qx2, eu3 eu3, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.b = j;
        this.c = j2;
        this.o = eyb;
        this.v = z2;
        this.w = qx2;
        this.x = eu3;
        this.y = lazy;
        this.z = lazy3;
        this.X = lazy2;
        this.Y = lazy4;
        xme a = f6e.a((Object) null);
        this.Z = a;
        this.w0 = eyb == eyb.SETUP_NEW_ADMIN;
        this.x0 = new s85(0);
        this.y0 = new s85(0);
        this.z0 = o5a.U();
        this.A0 = o5a.U();
        if (z2) {
            bs0.K(bs0.F(new ps5(new eu5(new sbd(new oyb(new i21(new on2(((my2) qx2).o(j), 28), new on2(eu3.c(j2), 28), fyb.a, 4), (Continuation) null, this)), 0), new gyb(this, (Continuation) null), 5), ((osa) ((gaf) lazy3.getValue())).a()), this.a);
        } else {
            bs0.K(bs0.F(new ps5(new sbd(new qyb(new i21(new on2(((my2) qx2).o(j), 28), new on2(eu3.c(j2), 28), new x2(this, (Continuation) null, 25), 4), (Continuation) null, this)), new hyb(this, (Continuation) null), 5), ((osa) ((gaf) lazy3.getValue())).a()), this.a);
        }
        this.B0 = bs0.X(bs0.F(bs0.w(new zjb(new on2(a, 28), this, 3)), ((osa) ((gaf) lazy3.getValue())).a()), this.a, z6e.a, new iyb());
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0198 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.syb r29, defpackage.a32 r30, defpackage.vk3 r31, boolean r32, kotlin.coroutines.Continuation r33) {
        /*
            r0 = r29
            r1 = r30
            r2 = r33
            r29.getClass()
            boolean r3 = r2 instanceof defpackage.ryb
            if (r3 == 0) goto L_0x001c
            r3 = r2
            ryb r3 = (defpackage.ryb) r3
            int r4 = r3.x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.x = r4
            goto L_0x0021
        L_0x001c:
            ryb r3 = new ryb
            r3.<init>(r0, r2)
        L_0x0021:
            java.lang.Object r2 = r3.v
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.x
            r6 = 1
            if (r5 == 0) goto L_0x0044
            if (r5 != r6) goto L_0x003c
            int r0 = r3.o
            boolean r1 = r3.c
            vk3 r4 = r3.b
            a32 r3 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            r8 = r1
            r1 = r3
            goto L_0x0074
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r2)
            long r8 = r31.r()
            m72 r2 = r1.b
            long r10 = r2.d
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0055
            r2 = r6
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            r3.a = r1
            r5 = r31
            r3.b = r5
            r8 = r32
            r3.c = r8
            r3.o = r2
            r3.x = r6
            eu3 r0 = r0.x
            vk3 r0 = r0.d()
            if (r0 != r4) goto L_0x006e
            goto L_0x02e3
        L_0x006e:
            r4 = r5
            r28 = r2
            r2 = r0
            r0 = r28
        L_0x0074:
            vk3 r2 = (defpackage.vk3) r2
            long r2 = r2.r()
            boolean r5 = r1.e0()
            long r9 = r4.r()
            int r9 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x0088
            r9 = r6
            goto L_0x0089
        L_0x0088:
            r9 = 0
        L_0x0089:
            boolean r10 = r1.K()
            r11 = 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x009e
            long r12 = r4.r()
            int r10 = r1.f(r12)
            boolean r10 = defpackage.ld9.F(r10, r11)
            goto L_0x00aa
        L_0x009e:
            long r12 = r4.r()
            int r10 = r1.f(r12)
            boolean r10 = defpackage.ld9.F(r10, r6)
        L_0x00aa:
            boolean r12 = r1.K()
            if (r12 == 0) goto L_0x00b9
            int r12 = r1.f(r2)
            boolean r11 = defpackage.ld9.F(r12, r11)
            goto L_0x00bd
        L_0x00b9:
            boolean r11 = r1.y()
        L_0x00bd:
            boolean r12 = r1.K()
            r13 = 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x00d2
            long r14 = r4.r()
            int r12 = r1.f(r14)
            boolean r12 = defpackage.ld9.F(r12, r13)
            goto L_0x00de
        L_0x00d2:
            long r14 = r4.r()
            int r12 = r1.f(r14)
            boolean r12 = defpackage.ld9.F(r12, r6)
        L_0x00de:
            boolean r14 = r1.K()
            if (r14 == 0) goto L_0x00ed
            int r14 = r1.f(r2)
            boolean r13 = defpackage.ld9.F(r14, r13)
            goto L_0x00f1
        L_0x00ed:
            boolean r13 = r1.y()
        L_0x00f1:
            boolean r14 = r1.K()
            r15 = 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0108
            r29 = r8
            long r7 = r4.r()
            int r7 = r1.f(r7)
            boolean r7 = defpackage.ld9.F(r7, r15)
            goto L_0x0116
        L_0x0108:
            r29 = r8
            long r7 = r4.r()
            int r7 = r1.f(r7)
            boolean r7 = defpackage.ld9.F(r7, r6)
        L_0x0116:
            boolean r8 = r1.K()
            if (r8 == 0) goto L_0x0125
            int r8 = r1.f(r2)
            boolean r8 = defpackage.ld9.F(r8, r15)
            goto L_0x0129
        L_0x0125:
            boolean r8 = r1.y()
        L_0x0129:
            long r14 = r4.r()
            int r14 = r1.f(r14)
            r15 = 16
            boolean r14 = defpackage.ld9.F(r14, r15)
            boolean r15 = r1.x()
            r30 = r7
            long r6 = r4.r()
            int r6 = r1.f(r6)
            r7 = 8
            boolean r6 = defpackage.ld9.F(r6, r7)
            boolean r7 = r1.v()
            r31 = r9
            r32 = r10
            long r9 = r4.r()
            int r9 = r1.f(r9)
            r10 = 2
            boolean r9 = defpackage.ld9.F(r9, r10)
            r17 = r9
            int r9 = r1.f(r2)
            boolean r9 = defpackage.ld9.F(r9, r10)
            r18 = r9
            long r9 = r4.r()
            boolean r9 = r1.t(r9)
            boolean r10 = r1.s()
            r19 = r6
            r20 = r7
            long r6 = r4.r()
            java.lang.Long r6 = r1.e(r6)
            if (r6 != 0) goto L_0x0187
            goto L_0x0191
        L_0x0187:
            long r6 = r6.longValue()
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0191
            if (r10 != 0) goto L_0x0193
        L_0x0191:
            if (r5 == 0) goto L_0x0195
        L_0x0193:
            r2 = 1
            goto L_0x0196
        L_0x0195:
            r2 = 0
        L_0x0196:
            if (r5 == 0) goto L_0x01b7
            if (r29 == 0) goto L_0x01b7
            byb r0 = new byb
            r2 = 1
            r0.<init>(r2, r2)
            byb r3 = new byb
            r5 = 0
            r3.<init>(r5, r2)
            r20 = r0
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r3
        L_0x01b4:
            r6 = 1
            goto L_0x02b5
        L_0x01b7:
            if (r29 == 0) goto L_0x01f1
            byb r0 = new byb
            r0.<init>(r11, r11)
            byb r2 = new byb
            r2.<init>(r13, r13)
            byb r3 = new byb
            r3.<init>(r8, r8)
            byb r5 = new byb
            r5.<init>(r15, r15)
            byb r6 = new byb
            r7 = r20
            r6.<init>(r7, r7)
            byb r7 = new byb
            r8 = r18
            r7.<init>(r8, r8)
            byb r8 = new byb
            r9 = 0
            r10 = 1
            r8.<init>(r9, r10)
            r20 = r0
            r21 = r2
            r22 = r3
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            goto L_0x01b4
        L_0x01f1:
            r5 = r18
            r7 = r20
            r3 = 0
            if (r31 == 0) goto L_0x022a
            byb r0 = new byb
            r0.<init>(r11, r3)
            byb r2 = new byb
            r2.<init>(r13, r3)
            byb r6 = new byb
            r6.<init>(r8, r3)
            byb r8 = new byb
            r8.<init>(r15, r3)
            byb r9 = new byb
            r9.<init>(r7, r3)
            byb r7 = new byb
            r7.<init>(r5, r3)
            byb r5 = new byb
            r5.<init>(r10, r3)
            r20 = r0
            r21 = r2
            r26 = r5
            r22 = r6
            r25 = r7
            r23 = r8
            r24 = r9
            goto L_0x01b4
        L_0x022a:
            if (r0 == 0) goto L_0x0242
            byb r0 = new byb
            r6 = 1
            r0.<init>(r6, r3)
            r20 = r0
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            goto L_0x02b5
        L_0x0242:
            r6 = 1
            byb r0 = new byb
            if (r11 == 0) goto L_0x024d
            if (r2 == 0) goto L_0x024d
            r3 = r32
            r11 = r6
            goto L_0x0250
        L_0x024d:
            r11 = r3
            r3 = r32
        L_0x0250:
            r0.<init>(r3, r11)
            byb r3 = new byb
            if (r13 == 0) goto L_0x025b
            if (r2 == 0) goto L_0x025b
            r11 = r6
            goto L_0x025c
        L_0x025b:
            r11 = 0
        L_0x025c:
            r3.<init>(r12, r11)
            byb r11 = new byb
            if (r8 == 0) goto L_0x0269
            if (r2 == 0) goto L_0x0269
            r12 = r30
            r8 = r6
            goto L_0x026c
        L_0x0269:
            r12 = r30
            r8 = 0
        L_0x026c:
            r11.<init>(r12, r8)
            byb r8 = new byb
            if (r15 == 0) goto L_0x0277
            if (r2 == 0) goto L_0x0277
            r12 = r6
            goto L_0x0278
        L_0x0277:
            r12 = 0
        L_0x0278:
            r8.<init>(r14, r12)
            byb r12 = new byb
            if (r7 == 0) goto L_0x0285
            if (r2 == 0) goto L_0x0285
            r7 = r6
            r13 = r19
            goto L_0x0288
        L_0x0285:
            r13 = r19
            r7 = 0
        L_0x0288:
            r12.<init>(r13, r7)
            byb r7 = new byb
            if (r5 == 0) goto L_0x0295
            if (r2 == 0) goto L_0x0295
            r5 = r6
            r13 = r17
            goto L_0x0298
        L_0x0295:
            r13 = r17
            r5 = 0
        L_0x0298:
            r7.<init>(r13, r5)
            byb r5 = new byb
            if (r10 == 0) goto L_0x02a3
            if (r2 == 0) goto L_0x02a3
            r2 = r6
            goto L_0x02a4
        L_0x02a3:
            r2 = 0
        L_0x02a4:
            r5.<init>(r9, r2)
            r20 = r0
            r21 = r3
            r26 = r5
            r25 = r7
            r23 = r8
            r22 = r11
            r24 = r12
        L_0x02b5:
            cyb r0 = new cyb
            if (r29 != 0) goto L_0x02d2
            boolean r2 = r1.L()
            if (r2 == 0) goto L_0x02d2
            long r2 = r4.r()
            int r1 = r1.f(r2)
            r2 = 128(0x80, float:1.794E-43)
            boolean r1 = defpackage.ld9.F(r1, r2)
            if (r1 == 0) goto L_0x02d2
            r19 = r6
            goto L_0x02d4
        L_0x02d2:
            r19 = 0
        L_0x02d4:
            r16 = 0
            r27 = 31
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r4 = r0
        L_0x02e3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.syb.j(syb, a32, vk3, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void k() {
        long j;
        a32 a32;
        int w2;
        xme xme = this.Z;
        cyb cyb = (cyb) xme.getValue();
        s85 s85 = this.y0;
        boolean z2 = this.v;
        if (cyb == null || cyb.a || cyb.b || cyb.c || cyb.d || cyb.e || cyb.f || z2) {
            boolean areEqual = Intrinsics.areEqual(this.v0.getValue(), xme.getValue());
            long j2 = this.b;
            eyb eyb = this.o;
            if (!areEqual || (z2 && eyb == eyb.SETUP_NEW_ADMIN)) {
                cyb cyb2 = (cyb) xme.getValue();
                if (cyb2 != null && (a32 = (a32) ((my2) this.w).o(j2).a.getValue()) != null) {
                    long j3 = a32.b.a;
                    if (z2) {
                        a32 l = l();
                        boolean K = l != null ? l.K() : false;
                        byb byb = cyb2.i;
                        j = j2;
                        w2 = ld9.w(K ? false : byb.a, cyb2.l.a, cyb2.m.a, cyb2.k.a, cyb2.j.a, cyb2.f, K ? cyb2.g.a : false, K ? cyb2.h.a : false, K ? byb.a : false);
                    } else {
                        j = j2;
                        w2 = ld9.w(cyb2.b, cyb2.e, cyb2.a, cyb2.d, cyb2.c, cyb2.f, false, false, false);
                    }
                    int i = w2;
                    List listOf = CollectionsKt.listOf(Long.valueOf(this.c));
                    jna jna = (jna) ((rl) this.X.getValue());
                    jna.z(jna, new bk2(((ltb) jna.D()).a.n(), this.b, j3, 1, listOf, ij2.ADMIN, true, 0, i));
                } else {
                    return;
                }
            } else {
                j = j2;
            }
            eyb eyb2 = eyb.SETUP_NEW_ADMIN;
            s85 s852 = this.x0;
            if (eyb == eyb2) {
                if (z2) {
                    xag.h(s85, new xxb(new igf(ixa.I0), Integer.valueOf(cad.B)));
                }
                vzb.b.getClass();
                xag.h(s852, new pa4(":profile/members?id=" + j + "&type=ADMIN"));
                return;
            }
            xag.h(s852, p33.b);
            return;
        }
        xag.h(s85, new xxb(new igf(ixa.L0), (Integer) null));
    }

    public final a32 l() {
        return (a32) ((my2) this.w).o(this.b).a.getValue();
    }

    public final vk3 m() {
        return (vk3) this.x.c(this.c).a.getValue();
    }

    public final void n(long j, boolean z2) {
        cyb cyb;
        byb byb;
        kgf kgf;
        int i = (j > ((long) fxa.D) ? 1 : (j == ((long) fxa.D) ? 0 : -1));
        s85 s85 = this.y0;
        String str = null;
        boolean z3 = true;
        if (i == 0) {
            a32 l = l();
            igf igf = (l == null || !l.K()) ? new igf(ixa.S0) : new igf(ixa.S0);
            a32 l2 = l();
            String str2 = "";
            if (l2 == null || !l2.K()) {
                int i2 = ixa.Q0;
                a32 l3 = l();
                if (l3 != null) {
                    str = l3.r();
                }
                if (str != null) {
                    str2 = str;
                }
                kgf = new kgf(i2, ArraysKt.toList((T[]) new Object[]{str2}));
            } else {
                int i3 = ixa.p1;
                vk3 m = m();
                String f = m != null ? m.f() : null;
                if (f == null) {
                    f = str2;
                }
                a32 l4 = l();
                if (l4 != null) {
                    str = l4.r();
                }
                if (str != null) {
                    str2 = str;
                }
                kgf = new kgf(i3, ArraysKt.toList((T[]) new Object[]{f, str2}));
            }
            xag.h(s85, new wxb(igf, kgf, CollectionsKt.listOf(new pg3(fxa.H, new igf(ixa.P0), og3.o), new pg3(fxa.G, new igf(ixa.O0), og3.b))));
        } else if (j == ((long) fxa.M)) {
            boolean z4 = this.v;
            xme xme = this.Z;
            if (!z4 || (cyb = (cyb) xme.getValue()) == null || (byb = cyb.l) == null || !byb.a) {
                z3 = false;
            }
            cyb cyb2 = (cyb) xme.getValue();
            if (cyb2 != null && !cyb2.e && !z3) {
                xag.h(s85, new xxb(new igf(ixa.N0), (Integer) null));
            }
        } else if (z2) {
            o();
        }
    }

    public final void o() {
        if (this.v) {
            aje u = ev0.u(this.a, ((osa) ((gaf) this.z.getValue())).a(), f14.b, new kyb(this, (Continuation) null));
            this.A0.setValue(this, C0[1], u);
        }
    }

    public final void q() {
        if (!Intrinsics.areEqual(this.v0.getValue(), this.Z.getValue())) {
            xag.h(this.y0, new wxb(new igf(ixa.T), (ngf) null, CollectionsKt.listOf(new pg3(fxa.d0, new igf(ixa.U), og3.c), new pg3(fxa.c0, new igf(ixa.S), og3.b))));
            return;
        }
        xag.h(this.x0, p33.b);
    }
}
