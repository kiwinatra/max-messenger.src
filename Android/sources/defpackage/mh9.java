package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* renamed from: mh9  reason: default package */
public final class mh9 extends xag {
    public static final /* synthetic */ KProperty[] K0 = {rae.s(mh9.class, "sendTypingJob", "getSendTypingJob()Lkotlinx/coroutines/Job;", 0)};
    public final etc A0;
    public final xme B0;
    public final etc C0;
    public final xme D0;
    public final etc E0;
    public final xme F0;
    public final etc G0;
    public final ql8 H0;
    public final s85 I0;
    public final etc J0;
    public final Lazy X;
    public final wie Y = o5a.U();
    public final s85 Z;
    public final ome b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final xme v0;
    public final Lazy w;
    public final etc w0;
    public final Lazy x;
    public final xme x0;
    public final Lazy y;
    public final etc y0;
    public final Lazy z;
    public final xme z0;

    public mh9(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, etc etc) {
        this.b = etc;
        this.c = lazy;
        this.o = lazy3;
        this.v = lazy4;
        this.w = lazy5;
        this.x = lazy7;
        this.y = lazy2;
        this.z = lazy6;
        this.X = lazy8;
        m5a.b(0, IntCompanionObject.MAX_VALUE, (cu0) null, 4);
        this.Z = new s85(0);
        xme a = f6e.a((Object) null);
        this.v0 = a;
        this.w0 = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.x0 = a2;
        this.y0 = new etc(a2);
        xme a3 = f6e.a((Object) null);
        this.z0 = a3;
        this.A0 = new etc(a3);
        xme a4 = f6e.a((Object) null);
        this.B0 = a4;
        this.C0 = new etc(a4);
        xme a5 = f6e.a((Object) null);
        this.D0 = a5;
        bs5 F = bs0.F(new ih9(a5, this, 0), ((osa) ((gaf) lazy2.getValue())).b());
        o9a o9a = z6e.a;
        this.E0 = bs0.X(F, this.a, o9a, (Object) null);
        xme a6 = f6e.a((Object) null);
        this.F0 = a6;
        this.G0 = bs0.X(bs0.F(new ih9(a6, this, 1), ((osa) ((gaf) lazy2.getValue())).b()), this.a, o9a, (Object) null);
        this.H0 = new ql8(etc, 3);
        this.I0 = new s85(0);
        this.J0 = bs0.X(bs0.w(new ql8(etc, 4)), this.a, o9a, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.mh9 r13, defpackage.tg9 r14, kotlin.coroutines.Continuation r15) {
        /*
            r13.getClass()
            boolean r0 = r15 instanceof defpackage.ch9
            if (r0 == 0) goto L_0x0016
            r0 = r15
            ch9 r0 = (defpackage.ch9) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x001b
        L_0x0016:
            ch9 r0 = new ch9
            r0.<init>(r13, r15)
        L_0x001b:
            java.lang.Object r15 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 != r4) goto L_0x0037
            vg9 r13 = r0.c
            tg9 r14 = r0.b
            mh9 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r15)
            r10 = r13
            goto L_0x0081
        L_0x0037:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003f:
            tg9 r14 = r0.b
            mh9 r13 = r0.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0063
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r15)
            if (r14 != 0) goto L_0x004f
        L_0x004c:
            r1 = r3
            goto L_0x00d4
        L_0x004f:
            long r6 = r14.a
            java.lang.Long r15 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
            r0.a = r13
            r0.b = r14
            r0.w = r5
            java.lang.Object r15 = r13.m(r15, r5, r0)
            if (r15 != r1) goto L_0x0063
            goto L_0x00d4
        L_0x0063:
            vg9 r15 = (defpackage.vg9) r15
            kotlin.Lazy r2 = r13.v
            java.lang.Object r2 = r2.getValue()
            to9 r2 = (defpackage.to9) r2
            long r6 = r14.a
            r0.a = r13
            r0.b = r14
            r0.c = r15
            r0.w = r4
            java.lang.Object r0 = r2.a(r6, r0)
            if (r0 != r1) goto L_0x007e
            goto L_0x00d4
        L_0x007e:
            r10 = r15
            r15 = r0
            r0 = r13
        L_0x0081:
            ha9 r15 = (defpackage.ha9) r15
            if (r10 == 0) goto L_0x004c
            if (r15 != 0) goto L_0x0088
            goto L_0x004c
        L_0x0088:
            kotlin.Lazy r13 = r0.z
            java.lang.Object r13 = r13.getValue()
            yva r13 = (defpackage.yva) r13
            java.lang.String r1 = r15.y
            java.util.List r2 = r15.P0
            java.lang.CharSequence r13 = r13.m(r1, r2)
            kotlin.Lazy r0 = r0.z
            java.lang.Object r0 = r0.getValue()
            yva r0 = (defpackage.yva) r0
            r1 = 20
            float r1 = (float) r1
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r4, r1, r3)
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            java.lang.CharSequence r9 = r0.l(r1, r13, r2)
            sg9 r1 = new sg9
            long r7 = r14.a
            g20 r13 = defpackage.g20.c
            boolean r13 = r15.n(r13)
            if (r13 != 0) goto L_0x00cd
            g20 r13 = defpackage.g20.o
            boolean r13 = r15.n(r13)
            if (r13 == 0) goto L_0x00cc
            goto L_0x00cd
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            r11 = r5
            boolean r12 = r14.b
            r6 = r1
            r6.<init>(r7, r9, r10, r11, r12)
        L_0x00d4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh9.j(mh9, tg9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void n(mh9 mh9, boolean z2, boolean z3, int i) {
        og9 og9;
        mg9 mg9;
        if ((i & 1) != 0) {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z3 = false;
        }
        xme xme = mh9.v0;
        o85 o85 = (o85) xme.getValue();
        pg9 pg9 = o85 != null ? (pg9) o85.a : null;
        if (z3) {
            if ((pg9 != null ? pg9.a : null) != og9.b) {
                return;
            }
        }
        o85 o852 = (o85) mh9.x0.getValue();
        if (o852 == null || (mg9 = (mg9) o852.a) == null || !mg9.a) {
            if (z3) {
                og9 = og9.o;
            } else if (z2) {
                og9 = og9.a;
            } else {
                og9 og92 = pg9 != null ? pg9.a : null;
                og9 og93 = og9.b;
                og9 = og92 == og93 ? og9.c : og93;
            }
            xme.m((Object) null, new o85(new pg9(og9)));
            return;
        }
        mh9.q(lg9.c, (tb9) null);
    }

    public static void o(mh9 mh9, lg9 lg9, int i) {
        if ((i & 1) != 0) {
            lg9 = lg9.a;
        }
        mh9.q(lg9, (tb9) null);
    }

    public final Long k() {
        tg9 tg9 = (tg9) this.F0.getValue();
        if (tg9 != null) {
            return Long.valueOf(tg9.a);
        }
        return null;
    }

    public final Long l() {
        return (Long) this.D0.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0136 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(java.lang.Long r18, boolean r19, kotlin.coroutines.Continuation r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof defpackage.dh9
            if (r2 == 0) goto L_0x0018
            r2 = r1
            dh9 r2 = (defpackage.dh9) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.x = r3
        L_0x0016:
            r8 = r2
            goto L_0x001e
        L_0x0018:
            dh9 r2 = new dh9
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r8.v
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r8.x
            r4 = 3
            r5 = 2
            r10 = 0
            r11 = 0
            r12 = 1
            if (r3 == 0) goto L_0x0063
            if (r3 == r12) goto L_0x0054
            if (r3 == r5) goto L_0x0047
            if (r3 != r4) goto L_0x003f
            int r0 = r8.o
            java.lang.Object r2 = r8.a
            ngf r2 = (defpackage.ngf) r2
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r2
            goto L_0x013d
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            boolean r0 = r8.c
            ha9 r3 = r8.b
            java.lang.Object r5 = r8.a
            mh9 r5 = (defpackage.mh9) r5
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00d2
        L_0x0054:
            boolean r0 = r8.c
            java.lang.Object r3 = r8.a
            mh9 r3 = (defpackage.mh9) r3
            kotlin.ResultKt.throwOnFailure(r1)
            r16 = r3
            r3 = r0
            r0 = r16
            goto L_0x0084
        L_0x0063:
            kotlin.ResultKt.throwOnFailure(r1)
            if (r18 != 0) goto L_0x0069
            return r11
        L_0x0069:
            kotlin.Lazy r1 = r0.v
            java.lang.Object r1 = r1.getValue()
            to9 r1 = (defpackage.to9) r1
            long r6 = r18.longValue()
            r8.a = r0
            r3 = r19
            r8.c = r3
            r8.x = r12
            java.lang.Object r1 = r1.a(r6, r8)
            if (r1 != r2) goto L_0x0084
            return r2
        L_0x0084:
            ha9 r1 = (defpackage.ha9) r1
            if (r1 != 0) goto L_0x0089
            return r11
        L_0x0089:
            if (r3 == 0) goto L_0x0098
            int r5 = defpackage.yya.k
            igf r6 = new igf
            r6.<init>(r5)
        L_0x0092:
            r5 = r1
            r13 = r6
            r1 = r10
            r6 = r3
            goto L_0x00ff
        L_0x0098:
            kotlin.Lazy r6 = r0.c
            java.lang.Object r6 = r6.getValue()
            x23 r6 = (defpackage.x23) r6
            qjd r6 = (defpackage.qjd) r6
            long r6 = r6.s()
            long r13 = r1.w
            int r6 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00b4
            int r5 = defpackage.yya.l
            igf r6 = new igf
            r6.<init>(r5)
            goto L_0x0092
        L_0x00b4:
            kotlin.Lazy r6 = r0.o
            java.lang.Object r6 = r6.getValue()
            eu3 r6 = (defpackage.eu3) r6
            r8.a = r0
            r8.b = r1
            r8.c = r3
            r8.x = r5
            java.lang.Object r5 = r6.b(r13, r8)
            if (r5 != r2) goto L_0x00cb
            return r2
        L_0x00cb:
            r16 = r5
            r5 = r0
            r0 = r3
            r3 = r1
            r1 = r16
        L_0x00d2:
            vk3 r1 = (defpackage.vk3) r1
            if (r1 == 0) goto L_0x00de
            boolean r6 = r1.z()
            if (r6 != r12) goto L_0x00de
            r6 = r12
            goto L_0x00df
        L_0x00de:
            r6 = r10
        L_0x00df:
            int r7 = defpackage.yya.m
            if (r1 == 0) goto L_0x00e8
            java.lang.String r1 = r1.f()
            goto L_0x00e9
        L_0x00e8:
            r1 = r11
        L_0x00e9:
            if (r1 != 0) goto L_0x00ed
            java.lang.String r1 = ""
        L_0x00ed:
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            kgf r9 = new kgf
            java.util.List r1 = kotlin.collections.ArraysKt.toList((T[]) r1)
            r9.<init>(r7, r1)
            r1 = r6
            r13 = r9
            r6 = r0
            r0 = r5
            r5 = r3
        L_0x00ff:
            kotlin.Lazy r0 = r0.x
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            oz r3 = (defpackage.oz) r3
            ogf r0 = defpackage.puf.l
            r0.getClass()
            uy4 r7 = defpackage.uy4.b
            long r14 = r0.g(r7)
            float r0 = defpackage.so4.e(r14)
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r0 = r0 * r7
            int r7 = (int) r0
            r8.a = r13
            r8.b = r11
            r8.o = r1
            r8.x = r4
            r0 = 0
            r9 = 4
            r4 = r5
            r5 = r6
            r6 = r0
            java.lang.Object r0 = defpackage.oz.b(r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r2) goto L_0x0137
            return r2
        L_0x0137:
            r3 = r13
            r16 = r1
            r1 = r0
            r0 = r16
        L_0x013d:
            jz r1 = (defpackage.jz) r1
            java.lang.CharSequence r2 = r1.a
            if (r2 == 0) goto L_0x0148
            mgf r11 = new mgf
            r11.<init>(r2)
        L_0x0148:
            r5 = r11
            vg9 r9 = new vg9
            if (r0 == 0) goto L_0x014f
            r4 = r12
            goto L_0x0150
        L_0x014f:
            r4 = r10
        L_0x0150:
            java.lang.Integer r7 = r1.c
            java.lang.Integer r8 = r1.d
            java.lang.String r6 = r1.b
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh9.m(java.lang.Long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r1 = (defpackage.mg9) r1.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(defpackage.lg9 r5, defpackage.tb9 r6) {
        /*
            r4 = this;
            xme r0 = r4.x0
            java.lang.Object r1 = r0.getValue()
            o85 r1 = (defpackage.o85) r1
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.Object r1 = r1.a
            mg9 r1 = (defpackage.mg9) r1
            if (r1 == 0) goto L_0x0014
            boolean r1 = r1.a
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            if (r6 != 0) goto L_0x002a
            lg9 r6 = defpackage.lg9.c
            if (r5 == r6) goto L_0x0028
            lg9 r6 = defpackage.lg9.b
            if (r5 != r6) goto L_0x0020
            goto L_0x0028
        L_0x0020:
            if (r1 == 0) goto L_0x0025
            tb9 r6 = defpackage.tb9.c
            goto L_0x002a
        L_0x0025:
            tb9 r6 = defpackage.tb9.b
            goto L_0x002a
        L_0x0028:
            tb9 r6 = defpackage.tb9.a
        L_0x002a:
            ng9 r3 = new ng9
            r3.<init>(r6)
            o85 r6 = new o85
            r6.<init>(r3)
            xme r4 = r4.z0
            r4.getClass()
            r3 = 0
            r4.m(r3, r6)
            if (r1 != 0) goto L_0x0049
            lg9 r4 = defpackage.lg9.o
            if (r5 != r4) goto L_0x0049
            mg9 r4 = new mg9
            r4.<init>(r2, r5)
            goto L_0x005c
        L_0x0049:
            if (r1 != 0) goto L_0x0055
            r5.getClass()
            lg9 r4 = defpackage.lg9.a
            if (r5 != r4) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r4 = r3
            goto L_0x005c
        L_0x0055:
            mg9 r4 = new mg9
            r6 = r1 ^ 1
            r4.<init>(r6, r5)
        L_0x005c:
            if (r4 == 0) goto L_0x0069
            o85 r5 = new o85
            r5.<init>(r4)
            r0.getClass()
            r0.m(r3, r5)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh9.q(lg9, tb9):void");
    }

    public final void r(CharSequence charSequence, boolean z2) {
        if (charSequence != null) {
            if ((!StringsKt.isBlank(charSequence) ? charSequence : null) != null) {
                ev0.v(this.a, ((osa) ((gaf) this.y.getValue())).a(), (f14) null, new eh9(this, charSequence, (Long) this.D0.getValue(), z2, (Continuation) null), 2);
                xag.h(this.Z, yg9.a);
            }
        }
    }

    public final void t(Long l, boolean z2) {
        xme xme = this.D0;
        tg9 tg9 = null;
        if (xme.getValue() != null) {
            xme.setValue((Object) null);
        }
        if (l != null) {
            tg9 = new tg9(l.longValue(), z2);
        }
        this.F0.setValue(tg9);
    }

    public final void u(Long l) {
        xme xme = this.F0;
        if (xme.getValue() != null) {
            xme.setValue((Object) null);
        }
        this.D0.setValue(l);
    }
}
