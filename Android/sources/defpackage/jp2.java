package defpackage;

import android.view.View;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import one.me.pinbars.PinBarsWidget;

/* renamed from: jp2  reason: default package */
public final class jp2 extends SuspendLambda implements Function4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp2(Object obj, Object obj2, Continuation continuation, int i) {
        super(4, continuation);
        this.a = i;
        this.v = obj;
        this.w = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                jp2 jp2 = new jp2((Lazy) this.v, (lp2) this.w, (Continuation) obj4, 0);
                jp2.b = (a32) obj;
                jp2.c = (ngf) obj2;
                jp2.o = (ngf) obj3;
                return jp2.invokeSuspend(Unit.INSTANCE);
            default:
                jp2 jp22 = new jp2((PinBarsWidget) this.v, (View) this.w, (Continuation) obj4, 1);
                jp22.b = (nr9) obj;
                jp22.c = (emb) obj2;
                jp22.o = (ovf) obj3;
                return jp22.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 1
            r2 = 12
            r3 = 3
            r4 = 0
            r5 = 0
            int r6 = r0.a
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            switch(r6) {
                case 0: goto L_0x00fa;
                default: goto L_0x0010;
            }
        L_0x0010:
            kotlin.ResultKt.throwOnFailure(r20)
            java.lang.Object r1 = r0.b
            nr9 r1 = (defpackage.nr9) r1
            java.lang.Object r6 = r0.c
            emb r6 = (defpackage.emb) r6
            java.lang.Object r7 = r0.o
            ovf r7 = (defpackage.ovf) r7
            boolean r6 = r6 instanceof defpackage.cmb
            java.lang.Object r8 = r0.w
            android.view.View r8 = (android.view.View) r8
            java.lang.Object r0 = r0.v
            one.me.pinbars.PinBarsWidget r0 = (one.me.pinbars.PinBarsWidget) r0
            if (r6 == 0) goto L_0x00b5
            boolean r1 = r1 instanceof defpackage.lr9
            if (r1 == 0) goto L_0x00b5
            if (r7 == 0) goto L_0x00b5
            svf r1 = r0.w
            if (r1 != 0) goto L_0x0077
            svf r1 = new svf
            android.content.Context r6 = r0.getContext()
            r1.<init>(r6)
            int r6 = defpackage.axa.d
            r1.setId(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -1
            r9 = -2
            r6.<init>(r7, r9)
            r1.setLayoutParams(r6)
            clb r6 = new clb
            r6.<init>(r0, r3)
            r1.setOnAddContactClickListener(r6)
            clb r6 = new clb
            r7 = 4
            r6.<init>(r0, r7)
            r1.setOnBlockContactClickListener(r6)
            sa r6 = new sa
            r7 = 27
            r6.<init>((int) r3, (kotlin.coroutines.Continuation) r4, (int) r7)
            defpackage.b0h.H(r1, r6)
            r0.w = r1
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r3 = r8.getChildCount()
            int r3 = kotlin.ranges.RangesKt.coerceAtMost((int) r5, (int) r3)
            r8.addView(r1, r3)
        L_0x0077:
            blb r0 = r0.c0()
            rvf r0 = r0.o
            if (r0 == 0) goto L_0x00f7
            etc r1 = r0.i
            ome r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            ovf r1 = (defpackage.ovf) r1
            if (r1 == 0) goto L_0x00f7
            kotlin.Lazy r3 = r0.g
            java.lang.Object r3 = r3.getValue()
            x23 r3 = (defpackage.x23) r3
            qjd r3 = (defpackage.qjd) r3
            long r9 = r3.m()
            eu3 r0 = r0.b
            km3 r0 = r0.a
            r0.getClass()
            jm3 r3 = new jm3
            long r7 = r1.a
            r6 = 0
            r5 = r3
            r11 = r0
            r5.<init>(r6, r7, r9, r11)
            zb2 r1 = new zb2
            r1.<init>(r2)
            lfd r0 = r0.n
            defpackage.jbd.a(r3, r0, r4, r1, r4)
            goto L_0x00f7
        L_0x00b5:
            int r1 = defpackage.axa.d
            android.view.View r1 = r8.findViewById(r1)
            if (r1 == 0) goto L_0x00f7
            int r3 = one.me.pinbars.PinBarsWidget.x
            blb r3 = r0.c0()
            rvf r3 = r3.o
            if (r3 == 0) goto L_0x00f0
            etc r5 = r3.i
            ome r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            ovf r5 = (defpackage.ovf) r5
            if (r5 == 0) goto L_0x00f0
            eu3 r3 = r3.b
            km3 r3 = r3.a
            r3.getClass()
            jm3 r6 = new jm3
            long r11 = r5.a
            r13 = 0
            r10 = 0
            r9 = r6
            r15 = r3
            r9.<init>(r10, r11, r13, r15)
            zb2 r5 = new zb2
            r5.<init>(r2)
            lfd r2 = r3.n
            defpackage.jbd.a(r6, r2, r4, r5, r4)
        L_0x00f0:
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r8.removeView(r1)
            r0.w = r4
        L_0x00f7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00fa:
            kotlin.ResultKt.throwOnFailure(r20)
            java.lang.Object r2 = r0.b
            a32 r2 = (defpackage.a32) r2
            java.lang.Object r3 = r0.c
            ngf r3 = (defpackage.ngf) r3
            java.lang.Object r6 = r0.o
            ngf r6 = (defpackage.ngf) r6
            vk3 r7 = r2.m()
            if (r7 == 0) goto L_0x0118
            long r7 = r7.r()
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
            goto L_0x0119
        L_0x0118:
            r7 = r4
        L_0x0119:
            java.lang.Object r8 = r0.v
            kotlin.Lazy r8 = (kotlin.Lazy) r8
            java.lang.Object r8 = r8.getValue()
            x23 r8 = (defpackage.x23) r8
            qjd r8 = (defpackage.qjd) r8
            long r8 = r8.s()
            m72 r10 = r2.b
            boolean r8 = r10.h(r8)
            if (r8 == 0) goto L_0x0149
            u2b r7 = new u2b
            a3b r9 = new a3b
            int r10 = defpackage.cad.R0
            java.lang.Object r0 = r0.w
            lp2 r0 = (defpackage.lp2) r0
            ip2 r11 = new ip2
            r11.<init>(r0, r5)
            r9.<init>(r10, r11)
            r7.<init>(r4, r9)
        L_0x0146:
            r18 = r7
            goto L_0x017e
        L_0x0149:
            a3b r9 = new a3b
            int r10 = defpackage.cad.v0
            java.lang.Object r11 = r0.w
            lp2 r11 = (defpackage.lp2) r11
            ip2 r12 = new ip2
            r12.<init>(r11, r1)
            r9.<init>(r10, r12)
            boolean r10 = r11.n()
            if (r10 == 0) goto L_0x0178
            if (r7 == 0) goto L_0x0178
            boolean r10 = r2.J()
            if (r10 != 0) goto L_0x0178
            a3b r4 = new a3b
            int r10 = defpackage.cad.c0
            java.lang.Object r0 = r0.w
            lp2 r0 = (defpackage.lp2) r0
            wk r11 = new wk
            r12 = 5
            r11.<init>(r12, r0, r7)
            r4.<init>(r10, r11)
        L_0x0178:
            u2b r7 = new u2b
            r7.<init>(r4, r9)
            goto L_0x0146
        L_0x017e:
            if (r8 == 0) goto L_0x0189
            int r0 = defpackage.ewa.u0
            igf r3 = new igf
            r3.<init>(r0)
        L_0x0187:
            r14 = r3
            goto L_0x01a6
        L_0x0189:
            boolean r0 = r2.J()
            if (r0 == 0) goto L_0x0197
            int r0 = defpackage.ewa.u
            igf r3 = new igf
            r3.<init>(r0)
            goto L_0x0187
        L_0x0197:
            if (r6 != 0) goto L_0x01a5
            if (r3 != 0) goto L_0x0187
            java.lang.CharSequence r0 = r2.q(r1)
            mgf r3 = new mgf
            r3.<init>(r0)
            goto L_0x0187
        L_0x01a5:
            r14 = r6
        L_0x01a6:
            long r11 = r2.g()
            if (r8 != 0) goto L_0x01c0
            boolean r0 = r2.Y()
            if (r0 != 0) goto L_0x01be
            vk3 r0 = r2.m()
            if (r0 == 0) goto L_0x01c0
            boolean r0 = r0.z()
            if (r0 != r1) goto L_0x01c0
        L_0x01be:
            r15 = r1
            goto L_0x01c1
        L_0x01c0:
            r15 = r5
        L_0x01c1:
            r2.m0()
            java.lang.CharSequence r0 = r2.v0
            r2.l0()
            java.lang.CharSequence r13 = r2.X
            kl0 r1 = defpackage.kl0.b
            jl0 r3 = defpackage.jl0.a
            java.lang.String r16 = r2.h(r1, r3)
            gr2 r1 = new gr2
            r10 = r1
            r17 = r0
            r10.<init>(r11, r13, r14, r15, r16, r17, r18)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
