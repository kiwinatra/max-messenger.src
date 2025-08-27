package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import androidx.fragment.app.a;
import java.util.Collections;
import java.util.List;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;

/* renamed from: n99  reason: default package */
public final class n99 implements w57 {
    public ni0 A0;
    public final d6a B0;
    public final aqg C0;
    public final gb8 D0;
    public i3a E0;
    public s3a F0;
    public soc X;
    public final ni3 Y;
    public s60 Z;
    public final dm4 a;
    public final ib8 b;
    public final uk2 c;
    public final FrgBaseProfile o;
    public k0a v;
    public ll5 v0;
    public final FrgBase w;
    public boolean w0;
    public final id3 x;
    public ju8 x0;
    public a32 y = null;
    public ju8 y0;
    public y50 z;
    public ju8 z0;

    /* JADX WARNING: type inference failed for: r7v1, types: [ni3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, gb8] */
    public n99(FrgBaseProfile frgBaseProfile, FrgBase frgBase, id3 id3, ib8 ib8, uk2 uk2) {
        this.o = frgBaseProfile;
        this.w = frgBase;
        this.x = id3;
        this.b = ib8;
        this.c = uk2;
        qra qra = (qra) id3;
        z9f h = tr1.h(qra);
        h48 s = qra.s();
        qra.y();
        ggd A = qra.A();
        ? obj = new Object();
        obj.a = frgBase;
        obj.c = h;
        obj.b = s;
        obj.d = A;
        obj.e = uk2;
        this.Y = obj;
        this.a = new dm4(22, (Object) frgBase);
        p99 p99 = (p99) ((sjd) tr1.h(qra)).getAccessor().g(p99.class);
        p99.getClass();
        b5 b5Var = new b5(24, p99);
        p79 p79 = new p79(5);
        nob nob = jbd.a;
        jbd.a(b5Var, xfd.a(), (x6) null, p79, (lfd) null);
        this.B0 = new d6a(9, (Object) qra.c());
        this.C0 = new aqg((bud) qra.y().b, frgBase);
        this.D0 = new Object();
    }

    public final void F0(int i) {
    }

    public final void T0(ij0 ij0) {
    }

    public final List U() {
        ((p99) ((sjd) tr1.h((qra) this.x)).getAccessor().g(p99.class)).getClass();
        return Collections.emptyList();
    }

    public final void a() {
        ju8 ju8 = this.x0;
        id3 id3 = this.x;
        if (ju8 != null) {
            ((qra) id3).t().o(this.x0);
        }
        if (this.y0 != null) {
            ((qra) id3).t().o(this.y0);
        }
        if (this.z0 != null) {
            ((qra) id3).t().o(this.z0);
        }
    }

    public final void b() {
        ju8 ju8 = this.x0;
        id3 id3 = this.x;
        if (ju8 != null) {
            ((qra) id3).t().s(this.x0);
        }
        if (this.y0 != null) {
            ((qra) id3).t().s(this.y0);
        }
        if (this.z0 != null) {
            ((qra) id3).t().s(this.z0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r0 = this;
            k0a r0 = r0.v
            if (r0 == 0) goto L_0x0014
            f2a r0 = r0.a
            if (r0 == 0) goto L_0x0014
            l2a r0 = (defpackage.l2a) r0
            ru.ok.messages.constructor.ConstructorPopupLayout r0 = r0.y
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n99.c():boolean");
    }

    public final void d() {
        FrgBaseProfile frgBaseProfile = this.o;
        m5 X2 = frgBaseProfile.X2();
        if (X2 != null) {
            cxe D = ((qra) ((id3) frgBaseProfile.p1.b)).D();
            a U1 = frgBaseProfile.U1(true);
            xt6 xt6 = (xt6) D;
            boolean a2 = xt6.a();
            String str = frgBaseProfile.l1;
            if (!a2) {
                dt6 dt6 = dt6.d;
                int c2 = xt6.c();
                int i = ot6.e;
                boolean z2 = false;
                if (c2 == 1 || c2 == 2 || c2 == 3 || c2 == 9) {
                    int c3 = xt6.c();
                    int i2 = ot6.e;
                    if (c3 == 18) {
                        z2 = true;
                    } else if (c3 == 1) {
                        z2 = ot6.b(X2);
                    }
                    if (true == z2) {
                        c3 = 18;
                    }
                    if (U1 == null) {
                        dt6.c(X2, c3, 127, (DialogInterface.OnCancelListener) null);
                    } else {
                        AlertDialog d = dt6.d(X2, c3, new awg(dt6.a(c3, X2, "d"), U1), (DialogInterface.OnCancelListener) null);
                        if (d != null) {
                            dt6.e(X2, d, "GooglePlayServicesErrorDialog", (DialogInterface.OnCancelListener) null);
                        }
                    }
                } else {
                    z68.f(str, "Failed request to resolve services error", (Throwable) null);
                    int i3 = qad.R3;
                    Handler handler = hi7.j;
                    hi7.b0(0, X2, X2.getString(i3));
                    return;
                }
            }
            z68.c(str, "Success request to resolve services error", new Object[0]);
        }
    }

    /* JADX WARNING: type inference failed for: r9v21, types: [v02, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x07aa  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0648  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.view.View r45, long r46, android.os.Bundle r48) {
        /*
            r44 = this;
            r15 = r44
            r14 = r45
            r12 = r46
            r11 = r48
            r5 = 0
            ru.ok.messages.views.fragments.base.FrgBase r2 = r15.w
            m5 r0 = r2.X2()
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            r15.y = r5
            k0a r1 = r15.v
            id3 r9 = r15.x
            if (r1 != 0) goto L_0x063a
            ll5 r1 = new ll5
            r25 = r9
            qra r25 = (defpackage.qra) r25
            nd r17 = r25.c()
            z9f r16 = defpackage.tr1.h(r25)
            sjd r16 = (defpackage.sjd) r16
            jqg r18 = r16.A()
            po5 r19 = r25.p()
            android.content.Context r20 = r2.O1()
            ru.ok.messages.views.fragments.base.FrgBase r3 = r15.w
            dac r4 = r3.x1
            if (r4 != 0) goto L_0x0043
            dac r4 = new dac
            r4.<init>()
            r3.x1 = r4
        L_0x0043:
            dac r4 = r3.x1
            fa9 r24 = r25.u()
            r22 = 0
            r16 = r1
            r21 = r3
            r23 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r15.v0 = r1
            java.lang.Object r3 = r1.b
            z9f r3 = (defpackage.z9f) r3
            sjd r3 = (defpackage.sjd) r3
            sv0 r3 = r3.f()
            r3.d(r1)
            r1.Q(r11)
            ll5 r1 = r15.v0
            r1.o = r15
            z9f r1 = defpackage.tr1.h(r25)
            sjd r1 = (defpackage.sjd) r1
            q4 r1 = r1.getAccessor()
            java.lang.Class<p99> r3 = defpackage.p99.class
            java.lang.Object r1 = r1.g(r3)
            r3 = r1
            p99 r3 = (defpackage.p99) r3
            if (r11 != 0) goto L_0x0082
            r3.a()
        L_0x0082:
            m1a r1 = defpackage.n1a.a
            r1.getClass()
            l1a r21 = defpackage.m1a.b
            k0a r4 = new k0a
            po5 r16 = r25.p()
            q4 r1 = r25.getAccessor()
            java.lang.Class<lk3> r5 = defpackage.lk3.class
            java.lang.Object r1 = r1.g(r5)
            r5 = r1
            lk3 r5 = (defpackage.lk3) r5
            yva r18 = r25.v()
            ed6 r1 = r0.v()
            java.lang.String r14 = "ru.ok.messages.stickers.FrgStickersLoader"
            androidx.fragment.app.a r1 = r1.E(r14)
            r19 = r1
            ru.ok.messages.stickers.FrgStickersLoader r19 = (ru.ok.messages.stickers.FrgStickersLoader) r19
            ed6 r0 = r0.v()
            java.lang.String r1 = "ru.ok.messages.stickers.FrgGifsLoader"
            androidx.fragment.app.a r0 = r0.E(r1)
            r20 = r0
            ru.ok.messages.stickers.FrgGifsLoader r20 = (ru.ok.messages.stickers.FrgGifsLoader) r20
            q4 r0 = r25.getAccessor()
            java.lang.Class<jre> r1 = defpackage.jre.class
            java.lang.Object r0 = r0.g(r1)
            jre r0 = (defpackage.jre) r0
            r0.getClass()
            mre r22 = new mre
            gcf r1 = r0.i
            obf r6 = r0.j
            moe r7 = r0.a
            vqe r8 = r0.b
            ai5 r10 = r0.c
            r38 = r9
            ir3 r9 = r0.d
            lfd r11 = r0.e
            lfd r12 = r0.f
            lfd r13 = r0.g
            rl r0 = r0.h
            r27 = r22
            r28 = r7
            r29 = r8
            r30 = r10
            r31 = r9
            r32 = r11
            r33 = r12
            r34 = r13
            r35 = r0
            r36 = r1
            r37 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            e4 r10 = new e4
            r0 = 28
            r10.<init>((int) r0, (java.lang.Object) r2)
            jd8 r11 = r25.J()
            ltb r12 = r25.y()
            h48 r13 = r25.s()
            q4 r0 = r25.getAccessor()
            java.lang.Class<bcf> r1 = defpackage.bcf.class
            java.lang.Object r0 = r0.g(r1)
            r27 = r0
            bcf r27 = (defpackage.bcf) r27
            z9f r0 = defpackage.tr1.h(r25)
            sjd r0 = (defpackage.sjd) r0
            km3 r28 = r0.i()
            nd r29 = r25.c()
            z9f r0 = defpackage.tr1.h(r25)
            sjd r0 = (defpackage.sjd) r0
            moe r30 = r0.x()
            jbf r31 = r25.H()
            z9f r0 = defpackage.tr1.h(r25)
            sjd r0 = (defpackage.sjd) r0
            q4 r0 = r0.getAccessor()
            java.lang.Class<ai5> r8 = defpackage.ai5.class
            java.lang.Object r0 = r0.g(r8)
            r32 = r0
            ai5 r32 = (defpackage.ai5) r32
            z9f r0 = defpackage.tr1.h(r25)
            sjd r0 = (defpackage.sjd) r0
            q4 r0 = r0.getAccessor()
            java.lang.Class<ve4> r1 = defpackage.ve4.class
            java.lang.Object r0 = r0.g(r1)
            r33 = r0
            ve4 r33 = (defpackage.ve4) r33
            uk2 r7 = r15.c
            r7.a()
            ni3 r9 = r15.Y
            r34 = r38
            r0 = r4
            r1 = r44
            r6 = r2
            r2 = r3
            r3 = r16
            r39 = r4
            r4 = r5
            r5 = r18
            r26 = r6
            r6 = r19
            r41 = r7
            r7 = r20
            r42 = r8
            r8 = r22
            r43 = r14
            r14 = r27
            r15 = r28
            r16 = r29
            r17 = r30
            r18 = r31
            r19 = r32
            r20 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = r44
            r1 = r39
            r0.v = r1
            mu8 r1 = r25.t()
            ju8 r2 = r0.x0
            if (r2 != 0) goto L_0x01b4
            nu8 r2 = defpackage.nu8.c
            z50 r3 = new z50
            r4 = 1
            r5 = 0
            r3.<init>(r4, r5, r5)
            r6 = 0
            m48 r2 = r1.q(r2, r3, r6)
            r0.x0 = r2
            goto L_0x01b7
        L_0x01b4:
            r4 = 1
            r5 = 0
            r6 = 0
        L_0x01b7:
            ju8 r2 = r0.y0
            if (r2 != 0) goto L_0x01c3
            nu8 r2 = defpackage.nu8.a
            ju8 r2 = r1.r(r2)
            r0.y0 = r2
        L_0x01c3:
            ju8 r2 = r0.z0
            if (r2 != 0) goto L_0x01cf
            nu8 r2 = defpackage.nu8.b
            ju8 r1 = r1.r(r2)
            r0.z0 = r1
        L_0x01cf:
            int r1 = defpackage.lic.vs_constructor
            r2 = r45
            android.view.View r1 = r2.findViewById(r1)
            boolean r3 = r1 instanceof android.view.ViewStub
            if (r3 == 0) goto L_0x01e4
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            android.view.View r1 = r1.inflate()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x01e7
        L_0x01e4:
            r1 = r2
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x01e7:
            s60 r3 = new s60
            android.content.Context r8 = r1.getContext()
            a32 r9 = r0.y
            int r7 = defpackage.lic.view_constructor__vs_audio_record
            android.view.View r7 = r1.findViewById(r7)
            r11 = r7
            android.view.ViewStub r11 = (android.view.ViewStub) r11
            int r7 = defpackage.lic.view_constructor__vs_audio_listen
            android.view.View r7 = r1.findViewById(r7)
            r12 = r7
            android.view.ViewStub r12 = (android.view.ViewStub) r12
            f40 r13 = r25.i()
            nd r14 = r25.c()
            po5 r15 = r25.p()
            hn4 r16 = r25.n()
            w21 r17 = r25.k()
            jd8 r18 = r25.J()
            q4 r7 = r25.getAccessor()
            java.lang.Class<xy9> r10 = defpackage.xy9.class
            java.lang.Object r7 = r7.g(r10)
            r19 = r7
            xy9 r19 = (defpackage.xy9) r19
            sz r20 = r25.g()
            r62 r21 = r25.l()
            uk2 r10 = r0.c
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0.Z = r3
            r26.M1()
            s3a r3 = new s3a
            android.content.Context r8 = r1.getContext()
            s60 r9 = r0.Z
            mu8 r11 = r25.t()
            nd r12 = r25.c()
            id3 r7 = defpackage.ym.e()
            qra r7 = (defpackage.qra) r7
            hn4 r7 = r7.n()
            r7.getClass()
            kotlin.Lazy r7 = defpackage.j2g.a
            kotlin.Lazy r7 = defpackage.j2g.a
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r13 = r7.booleanValue()
            id3 r7 = defpackage.ym.e()
            qra r7 = (defpackage.qra) r7
            ltb r7 = r7.y()
            cud r7 = r7.b
            r7.getClass()
            gga r7 = defpackage.df8.b
            r7.getClass()
            df8[] r7 = defpackage.df8.values()
            int r10 = r7.length
            r14 = r5
        L_0x027f:
            if (r14 >= r10) goto L_0x028b
            r15 = r7[r14]
            int r6 = r15.a
            if (r6 != 0) goto L_0x0288
            goto L_0x028c
        L_0x0288:
            int r14 = r14 + r4
            r6 = 0
            goto L_0x027f
        L_0x028b:
            r15 = 0
        L_0x028c:
            if (r15 != 0) goto L_0x0292
            df8 r6 = defpackage.df8.SYSTEM
            r14 = r6
            goto L_0x0293
        L_0x0292:
            r14 = r15
        L_0x0293:
            gaf r15 = r25.G()
            r7 = r3
            r10 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.F0 = r3
            int r6 = defpackage.lic.view_constructor__cv_input
            android.view.View r6 = r1.findViewById(r6)
            r3.J(r6)
            s3a r3 = r0.F0
            jv7 r6 = r26.X1()
            boolean r7 = r3.J0
            if (r7 == 0) goto L_0x02ce
            java.lang.Object r7 = r3.b
            android.content.Context r7 = (android.content.Context) r7
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            r8 = 2
            if (r7 != r8) goto L_0x02c3
            goto L_0x02cf
        L_0x02c3:
            ru.ok.messages.messages.widgets.MessageComposeEditText r6 = r3.X
            b8d r7 = new b8d
            r7.<init>((java.lang.Object) r3)
            r6.setMIUITextSelectListener(r7)
            goto L_0x0303
        L_0x02ce:
            r8 = 2
        L_0x02cf:
            df8 r7 = defpackage.df8.SYSTEM
            df8 r9 = r3.K0
            if (r9 != r7) goto L_0x02d6
            goto L_0x0303
        L_0x02d6:
            soc r7 = new soc
            ru.ok.messages.messages.widgets.MessageComposeEditText r12 = r3.X
            yu9 r15 = new yu9
            r15.<init>((int) r4, (java.lang.Object) r3)
            gaf r14 = r3.I0
            r13 = r6
            od6 r13 = (defpackage.od6) r13
            java.lang.Object r6 = r3.b
            r11 = r6
            android.content.Context r11 = (android.content.Context) r11
            r10 = r7
            r10.<init>((android.content.Context) r11, (android.widget.EditText) r12, (defpackage.od6) r13, (defpackage.gaf) r14, (defpackage.yu9) r15)
            r3.L0 = r7
            ru.ok.messages.messages.widgets.MessageComposeEditText r6 = r3.X
            j3a r7 = new j3a
            r7.<init>(r3, r5)
            r6.setOnLongClickListener(r7)
            ru.ok.messages.messages.widgets.MessageComposeEditText r6 = r3.X
            p3a r7 = new p3a
            r7.<init>((java.lang.Object) r3)
            r6.setTextSelectListener(r7)
        L_0x0303:
            s3a r3 = r0.F0
            ltb r6 = r25.y()
            cud r6 = r6.b
            r6.getClass()
            java.util.Set r6 = java.util.Collections.emptySet()
            hj r7 = defpackage.hj.a
            boolean r6 = defpackage.ryg.h(r6, r7)
            ru.ok.messages.messages.widgets.MessageComposeEditText r3 = r3.X
            if (r3 == 0) goto L_0x031f
            r3.setAnimojiEnabled(r6)
        L_0x031f:
            l2a r3 = new l2a
            android.content.Context r10 = r1.getContext()
            k0a r6 = r0.v
            i1a r11 = r6.z
            r25.c()
            s3a r12 = r0.F0
            ch r13 = r25.d()
            ju8 r14 = r0.x0
            ju8 r15 = r0.y0
            ju8 r6 = r0.z0
            r9 = r3
            r16 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r6 = defpackage.lic.frg_chat__vs_constructor_draft
            android.view.View r2 = r2.findViewById(r6)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            ltb r6 = r25.y()
            hq r6 = r6.c
            boolean r16 = r6.q()
            int r6 = defpackage.lic.layout_constructor__constructor_popup
            android.view.View r6 = r1.findViewById(r6)
            ru.ok.messages.constructor.ConstructorPopupLayout r6 = (ru.ok.messages.constructor.ConstructorPopupLayout) r6
            r3.y = r6
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            android.content.Context r9 = r1.getContext()
            int r10 = defpackage.lad.j
            int r9 = defpackage.fw3.a(r9, r10)
            r7.<init>(r9)
            r6.setBackground(r7)
            ru.ok.messages.constructor.ConstructorPopupLayout r6 = r3.y
            int r7 = defpackage.lic.layout_constructor__constructor
            android.view.View r6 = r6.findViewById(r7)
            ru.ok.messages.constructor.MessageConstructorView r6 = (ru.ok.messages.constructor.MessageConstructorView) r6
            r3.x = r6
            ju8 r7 = r3.o
            r6.Q0 = r7
            ju8 r7 = r3.v
            r6.R0 = r7
            ju8 r7 = r3.w
            r6.S0 = r7
            r6.setListener(r3)
            ru.ok.messages.constructor.MessageConstructorView r6 = r3.x
            i1a r7 = r3.Z
            r6.z = r7
            s3a r9 = r3.x0
            r6.v0 = r9
            ek3 r15 = new ek3
            android.content.Context r10 = r6.getContext()
            s99 r11 = r6.w
            java.util.List r12 = java.util.Collections.emptyList()
            ju8 r13 = r6.Q0
            ju8 r14 = r6.R0
            ju8 r9 = r6.S0
            id3 r17 = defpackage.ym.e()
            qra r17 = (defpackage.qra) r17
            nd r17 = r17.c()
            id3 r18 = defpackage.ym.e()
            qra r18 = (defpackage.qra) r18
            gaf r18 = r18.G()
            id3 r19 = defpackage.ym.e()
            qra r19 = (defpackage.qra) r19
            q4 r8 = r19.getAccessor()
            java.lang.Class<et0> r5 = defpackage.et0.class
            java.lang.Object r5 = r8.g(r5)
            r19 = r5
            et0 r19 = (defpackage.et0) r19
            id3 r5 = defpackage.ym.e()
            qra r5 = (defpackage.qra) r5
            m95 r20 = r5.o()
            r5 = r9
            r9 = r15
            r8 = r15
            r15 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r6.y = r8
            r8.C(r4)
            one.me.sdk.lists.widgets.EmptyRecyclerView r5 = r6.x
            ek3 r6 = r6.y
            r5.setAdapter(r6)
            int r5 = defpackage.lic.layout_constructor__constructor_list
            android.view.View r5 = r1.findViewById(r5)
            ru.ok.messages.constructor.ConstructorsListView r5 = (ru.ok.messages.constructor.ConstructorsListView) r5
            r3.z = r5
            td8 r6 = new td8
            r8 = 27
            r6.<init>(r8, r3)
            r5.setConstructorClickListener(r6)
            ru.ok.messages.constructor.ConstructorPopupLayout r5 = r3.y
            ru.ok.messages.constructor.MessageConstructorView r6 = r3.x
            ru.ok.messages.constructor.ConstructorsListView r8 = r3.z
            r5.v0 = r3
            r5.x = r6
            r5.y = r8
            r5.z = r7
            r3.X = r2
            z9f r2 = defpackage.tr1.h(r25)
            j4a r15 = new j4a
            android.content.Context r6 = r1.getContext()
            s3a r7 = r0.F0
            ru.ok.messages.constructor.ConstructorPopupLayout r5 = r3.y
            int r8 = defpackage.lic.view_constructor__toolbar_shadow
            android.view.View r8 = r5.findViewById(r8)
            ru.ok.messages.constructor.ConstructorPopupLayout r5 = r3.y
            int r9 = defpackage.lic.view_constructor__bottom_shadow
            android.view.View r9 = r5.findViewById(r9)
            ru.ok.messages.constructor.ConstructorPopupLayout r5 = r3.y
            int r10 = defpackage.lic.view_constructor__vs_stickers_toolbar
            android.view.View r5 = r5.findViewById(r10)
            r10 = r5
            android.view.ViewStub r10 = (android.view.ViewStub) r10
            s3a r5 = r0.F0
            g18 r11 = new g18
            r12 = 20
            r11.<init>(r12, r0, r5)
            sjd r2 = (defpackage.sjd) r2
            yva r12 = r2.s()
            fj r13 = new fj
            r14 = r26
            r13.<init>((androidx.fragment.app.a) r14)
            ise r16 = r25.C()
            gb8 r5 = r0.D0
            d6a r4 = r0.B0
            r17 = r5
            r5 = r15
            r24 = r14
            r14 = r4
            r4 = r15
            r15 = r16
            r16 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            ru.ok.messages.constructor.ConstructorPopupLayout r5 = r3.y
            r4.J(r5)
            m5 r5 = r24.X2()
            if (r5 != 0) goto L_0x046c
            goto L_0x063d
        L_0x046c:
            oh4 r16 = new oh4
            android.content.Context r7 = r24.O1()
            q4 r6 = r2.getAccessor()
            r8 = r42
            java.lang.Object r6 = r6.g(r8)
            r8 = r6
            ai5 r8 = (defpackage.ai5) r8
            q4 r6 = r2.getAccessor()
            java.lang.Class<vi5> r9 = defpackage.vi5.class
            java.lang.Object r6 = r6.g(r9)
            r9 = r6
            vi5 r9 = (defpackage.vi5) r9
            jbf r10 = r2.z()
            q4 r6 = r25.getAccessor()
            java.lang.Class<t25> r11 = defpackage.t25.class
            java.lang.Object r6 = r6.g(r11)
            r11 = r6
            t25 r11 = (defpackage.t25) r11
            q4 r6 = r2.getAccessor()
            java.lang.Class<gvc> r12 = defpackage.gvc.class
            java.lang.Object r6 = r6.g(r12)
            r12 = r6
            gvc r12 = (defpackage.gvc) r12
            q4 r6 = r25.getAccessor()
            java.lang.Class<c35> r15 = defpackage.c35.class
            java.lang.Object r6 = r6.g(r15)
            r13 = r6
            c35 r13 = (defpackage.c35) r13
            moe r14 = r2.x()
            r2.d()
            q4 r2 = r2.getAccessor()
            java.lang.Class<gcf> r6 = defpackage.gcf.class
            java.lang.Object r2 = r2.g(r6)
            gcf r2 = (defpackage.gcf) r2
            ed6 r2 = r5.v()
            r5 = r43
            androidx.fragment.app.a r2 = r2.E(r5)
            ru.ok.messages.stickers.FrgStickersLoader r2 = (ru.ok.messages.stickers.FrgStickersLoader) r2
            fk r22 = defpackage.ii.c
            r6 = r16
            r2 = r15
            r15 = r22
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            u2a r5 = new u2a
            android.content.Context r7 = r1.getContext()
            s3a r8 = r0.F0
            ch r9 = r25.d()
            ise r11 = r25.C()
            q4 r6 = r25.getAccessor()
            java.lang.Object r2 = r6.g(r2)
            r14 = r2
            c35 r14 = (defpackage.c35) r14
            gb8 r12 = r0.D0
            r6 = r5
            r10 = r16
            r13 = r22
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            int r2 = defpackage.lic.layout_constructor__constructor
            android.view.View r2 = r1.findViewById(r2)
            r5.J(r2)
            i3a r2 = new i3a
            androidx.fragment.app.b r6 = r24.M1()
            android.view.WindowManager r14 = r6.getWindowManager()
            wj8 r15 = new wj8
            r6 = r41
            r7 = 0
            r15.<init>(r7, r6)
            ltb r6 = r25.y()
            cud r6 = r6.b
            po5 r20 = r25.p()
            ggd r21 = r25.A()
            hn4 r23 = r25.n()
            dm4 r7 = r0.a
            ru.ok.messages.views.fragments.base.FrgBase r8 = r0.w
            r11 = r2
            r12 = r24
            r13 = r1
            r16 = r5
            r17 = r7
            r18 = r8
            r19 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.E0 = r2
            k0a r1 = r0.v
            i1a r1 = r1.z
            s3a r6 = r0.F0
            p1a r7 = r1.c
            r7.getClass()
            r7.a = r6
            boolean r8 = r6 instanceof defpackage.bif
            if (r8 == 0) goto L_0x055b
            r6.c()
        L_0x055b:
            r6.R(r7)
            jtb r7 = r7.b
            ltb r7 = (defpackage.ltb) r7
            hq r7 = r7.c
            ls7 r7 = r7.g
            java.lang.String r8 = "app.messages.send.by.enter"
            r9 = 0
            boolean r7 = r7.getBoolean(r8, r9)
            if (r7 == 0) goto L_0x0585
            ru.ok.messages.messages.widgets.MessageComposeEditText r8 = r6.X
            n3a r10 = new n3a
            r10.<init>(r9, r6)
            r8.setOnEditorActionListener(r10)
            ru.ok.messages.messages.widgets.MessageComposeEditText r8 = r6.X
            u2 r9 = new u2
            r10 = 9
            r9.<init>(r10, r6)
            r8.addTextChangedListener(r9)
        L_0x0585:
            ru.ok.messages.messages.widgets.MessageComposeEditText r8 = r6.X
            o3a r9 = new o3a
            r9.<init>(r6, r7)
            r8.setOnKeyListener(r9)
            a2a r6 = r1.e
            r6.getClass()
            r6.a = r4
            r4.R(r6)
            h1a r6 = r1.d
            r6.getClass()
            r6.a = r5
            r5.R(r6)
            k1a r1 = r1.f
            r1.getClass()
            r1.a = r2
            r2.R(r1)
            ru.ok.messages.constructor.ConstructorPopupLayout r1 = r3.y
            int r2 = defpackage.lic.view_constructor__rv_constructors
            android.view.View r1 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            ni0 r2 = new ni0
            int r5 = defpackage.lic.row_constructor_message__message
            r6 = 18
            r2.<init>((java.lang.Object) r1, (int) r5, (int) r6)
            r0.A0 = r2
            y50 r1 = new y50
            m5 r2 = r24.X2()
            a32 r5 = r0.y
            ru.ok.messages.views.fragments.base.FrgBase r6 = r0.w
            r1.<init>(r2, r5, r6)
            r0.z = r1
            java.lang.Object r2 = r1.b
            z9f r2 = (defpackage.z9f) r2
            sjd r2 = (defpackage.sjd) r2
            sv0 r2 = r2.f()
            r2.d(r1)
            y50 r1 = r0.z
            r1.o = r3
            v02 r9 = new v02
            r9.<init>()
            djd r5 = new djd
            ni0 r7 = r0.A0
            y50 r8 = r0.z
            fa9 r11 = r25.u()
            ru.ok.messages.views.fragments.base.FrgBase r6 = r0.w
            r10 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            soc r1 = new soc
            k0a r2 = r0.v
            i1a r4 = r2.z
            k1a r15 = r4.f
            s60 r5 = r0.Z
            ru.ok.messages.views.fragments.base.FrgBase r13 = r0.w
            ni3 r14 = r0.Y
            dm4 r6 = r0.a
            r12 = r1
            r16 = r5
            r17 = r6
            r12.<init>((ru.ok.messages.views.fragments.base.FrgBase) r13, (defpackage.ni3) r14, (defpackage.k1a) r15, (defpackage.s60) r16, (defpackage.dm4) r17)
            r0.X = r1
            r2.a = r3
            p1a r1 = r4.c
            yia r1 = r1.W()
            lfd r4 = defpackage.qe.a()
            lja r1 = r1.s(r4)
            td8 r4 = new td8
            r5 = 24
            r4.<init>(r5, r2)
            ekd r6 = defpackage.m58.g
            dj6 r7 = defpackage.m58.e
            or7 r8 = new or7
            r8.<init>(r4, r6, r7)
            r1.a(r8)
            r2.Y = r8
            r3.R(r2)
            goto L_0x063f
        L_0x063a:
            r34 = r9
            r0 = r15
        L_0x063d:
            r5 = 24
        L_0x063f:
            k0a r1 = r0.v
            r1.Z()
            r1 = r48
            if (r1 == 0) goto L_0x07aa
            k0a r0 = r0.v
            r0.getClass()
            java.lang.String r2 = "ru.ok.tamtam.extra.CONSTRUCTOR_ID"
            long r2 = r1.getLong(r2)
            r0.Z = r2
            f2a r2 = r0.a
            if (r2 == 0) goto L_0x06c2
            l2a r2 = (defpackage.l2a) r2
            java.lang.String r3 = "ru.ok.tamtam.extra.STATE"
            java.lang.String r3 = r1.getString(r3)
            if (r3 == 0) goto L_0x06ba
            java.lang.String r4 = "HIDDEN"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x066d
            r10 = 1
            goto L_0x068a
        L_0x066d:
            java.lang.String r4 = "LIST"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0677
            r10 = 2
            goto L_0x068a
        L_0x0677:
            java.lang.String r4 = "CONSTRUCTOR"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0681
            r10 = 3
            goto L_0x068a
        L_0x0681:
            java.lang.String r4 = "DRAFT"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x06ae
            r10 = 4
        L_0x068a:
            r2.w0 = r10
            ru.ok.messages.constructor.ConstructorPopupLayout r3 = r2.y
            r3.m(r1)
            int r3 = r2.w0
            r4 = 3
            if (r3 != r4) goto L_0x06a3
            ru.ok.messages.constructor.ConstructorPopupLayout r3 = r2.y
            ik3 r4 = defpackage.ik3.b
            r3.setState(r4)
            ru.ok.messages.constructor.MessageConstructorView r2 = r2.x
            r2.e(r1)
            goto L_0x06c2
        L_0x06a3:
            r4 = 2
            if (r3 != r4) goto L_0x06c2
            ru.ok.messages.constructor.ConstructorPopupLayout r2 = r2.y
            ik3 r3 = defpackage.ik3.a
            r2.setState(r3)
            goto L_0x06c2
        L_0x06ae:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No enum constant ru.ok.tamtam.android.messages.input.constructor.MvcViewConstructor.State."
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1)
            throw r0
        L_0x06ba:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Name is null"
            r0.<init>(r1)
            throw r0
        L_0x06c2:
            i1a r2 = r0.z
            k1a r3 = r2.f
            ni3 r4 = r3.b
            r4.getClass()
            java.lang.String r5 = "ru.ok.tamtam.extra.CAPTURE_URI"
            android.os.Parcelable r5 = r1.getParcelable(r5)
            android.net.Uri r5 = (android.net.Uri) r5
            r4.f = r5
            boolean r4 = r3.U()
            if (r4 == 0) goto L_0x0705
            f2a r4 = r3.a
            i3a r4 = (defpackage.i3a) r4
            o99 r5 = new o99
            r6 = 8
            r5.<init>(r6, r3)
            r4.getClass()
            java.lang.String r3 = "ru.ok.tamtam.extra.EXTRA_ATTACH_BAR_VISIBLE"
            java.lang.String r6 = "k0a"
            java.lang.String r3 = r3.concat(r6)
            boolean r3 = r1.getBoolean(r3)
            if (r3 == 0) goto L_0x0705
            x55 r3 = new x55
            r6 = 23
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r1, (java.lang.Object) r5, (int) r6)
            r4.y0 = r3
            android.view.View r4 = r4.o
            r4.post(r3)
        L_0x0705:
            a2a r3 = r2.e
            r3.getClass()
            o1a r4 = new o1a
            r5 = 1
            r4.<init>(r1, r5)
            r3.V(r4)
            boolean r3 = r3.X()
            p1a r4 = r2.c
            if (r3 == 0) goto L_0x072a
            f2a r3 = r4.a
            if (r3 != 0) goto L_0x0720
            goto L_0x072a
        L_0x0720:
            s3a r3 = (defpackage.s3a) r3
            java.lang.Object r3 = r3.c
            android.view.View r3 = (android.view.View) r3
            r5 = 4
            r3.setVisibility(r5)
        L_0x072a:
            h1a r3 = r2.d
            r3.getClass()
            f2a r3 = r3.a
            if (r3 != 0) goto L_0x0734
            goto L_0x0753
        L_0x0734:
            u2a r3 = (defpackage.u2a) r3
            d8b r5 = r3.X
            r5.getClass()
            java.lang.String r6 = "emoji-panel:is-showing"
            r7 = 0
            boolean r6 = r1.getBoolean(r6, r7)
            if (r6 == 0) goto L_0x0748
            r6 = 0
            r5.h(r6)
        L_0x0748:
            java.lang.String r5 = "ru.ok.tamtam.extra.EXTRA_EMOJI_VISIBLE"
            boolean r5 = r1.getBoolean(r5)
            if (r5 == 0) goto L_0x0753
            r3.Z()
        L_0x0753:
            r4.getClass()
            f2a r3 = r4.a
            if (r3 != 0) goto L_0x075b
            goto L_0x0798
        L_0x075b:
            s3a r3 = (defpackage.s3a) r3
            s60 r4 = r3.v
            r4.getClass()
            java.lang.String r3 = "ru.ok.tamtam.extra.AUDIO_VIEW_RECORD_STATE"
            java.io.Serializable r3 = r1.getSerializable(r3)
            r5 = r3
            r60 r5 = (defpackage.r60) r5
            java.lang.String r3 = "ru.ok.tamtam.extra.AUDIO_VIEW_RECORD_ID"
            r6 = 0
            long r8 = r1.getLong(r3, r6)
            java.lang.String r3 = "ru.ok.tamtam.extra.AUDIO_VIEW_RECORD_DURATION"
            long r10 = r1.getLong(r3, r6)
            java.lang.String r3 = "ru.ok.tamtam.extra.AUDIO_VIEW_WAVE_DATA"
            java.util.ArrayList r3 = r1.getIntegerArrayList(r3)
            java.lang.String r6 = "ru.ok.tamtam.extra.SERVER_ATTACH"
            byte[] r1 = r1.getByteArray(r6)
            if (r1 == 0) goto L_0x078e
            l20 r1 = defpackage.qe8.a(r1)
            r40 = r1
            goto L_0x0790
        L_0x078e:
            r40 = 0
        L_0x0790:
            r6 = r8
            r8 = r10
            r10 = r3
            r11 = r40
            r4.o(r5, r6, r8, r10, r11)
        L_0x0798:
            kotlin.Lazy r1 = r2.g
            java.lang.Object r1 = r1.getValue()
            n1a r1 = (defpackage.n1a) r1
            r1.getClass()
            f2a r0 = r0.a
            l2a r0 = (defpackage.l2a) r0
            int r0 = r0.w0
            goto L_0x0800
        L_0x07aa:
            r1 = -1
            r3 = r46
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x07b8
            k0a r0 = r0.v
            r0.f0(r3)
            goto L_0x0800
        L_0x07b8:
            r9 = r34
            qra r9 = (defpackage.qra) r9
            eaf r1 = r9.F()
            r1.getClass()
            defpackage.eaf.b()
            a32 r1 = r0.y
            if (r1 != 0) goto L_0x07cb
            goto L_0x07d4
        L_0x07cb:
            r2 = 1
            r0.w0 = r2
            m72 r1 = r1.b
            pt4 r1 = r1.f0
            rt4 r1 = (defpackage.rt4) r1
        L_0x07d4:
            k0a r0 = r0.v
            f2a r1 = r0.a
            if (r1 != 0) goto L_0x07db
            goto L_0x0800
        L_0x07db:
            r0.getClass()
            l2a r1 = (defpackage.l2a) r1
            p99 r0 = r0.v
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.g
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.d0(r2)
            b5 r1 = new b5
            r1.<init>(r5, r0)
            p79 r0 = new p79
            r2 = 5
            r0.<init>(r2)
            nob r2 = defpackage.jbd.a
            lfd r2 = defpackage.xfd.a()
            r3 = 0
            defpackage.jbd.a(r1, r2, r3, r0, r3)
        L_0x0800:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n99.e(android.view.View, long, android.os.Bundle):void");
    }

    public final boolean isActive() {
        return this.w.isActive();
    }

    public final void n0() {
    }
}
