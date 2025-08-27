package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.CancellationException;

/* renamed from: x50  reason: default package */
public final class x50 extends d99 {
    public final /* synthetic */ int R0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x50(Context context, ViewGroup viewGroup, int i) {
        super(context, viewGroup);
        this.R0 = i;
    }

    public void O() {
        switch (this.R0) {
            case 0:
                q50 q50 = (q50) this.G0;
                q50.removeOnAttachStateChangeListener(q50.R0);
                pm7 pm7 = q50.Q0;
                if (pm7 != null) {
                    pm7.b((CancellationException) null);
                }
                q50.Q0 = null;
                pm7 pm72 = q50.P0;
                if (pm72 != null) {
                    pm72.b((CancellationException) null);
                }
                q50.P0 = null;
                return;
            case 4:
                zm5 zm5 = (zm5) this.G0;
                zm5.removeOnAttachStateChangeListener(zm5.C0);
                pm7 pm73 = zm5.D0;
                if (pm73 != null) {
                    pm73.b((CancellationException) null);
                }
                zm5.D0 = null;
                return;
            case 9:
                jde jde = (jde) this.G0;
                jde.removeOnAttachStateChangeListener(jde.H0);
                pm7 pm74 = jde.I0;
                if (pm74 != null) {
                    pm74.b((CancellationException) null);
                }
                jde.I0 = null;
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r5v13, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void W(one.me.messages.list.loader.MessageModel r6) {
        /*
            r5 = this;
            int r0 = r5.R0
            switch(r0) {
                case 0: goto L_0x01ab;
                case 1: goto L_0x0005;
                case 2: goto L_0x0194;
                case 3: goto L_0x017d;
                case 4: goto L_0x0166;
                case 5: goto L_0x0146;
                case 6: goto L_0x0055;
                case 7: goto L_0x0034;
                case 8: goto L_0x0005;
                case 9: goto L_0x001d;
                case 10: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            xz r6 = r6.X
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.ede
            if (r0 == 0) goto L_0x0011
            ede r6 = (defpackage.ede) r6
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            if (r6 != 0) goto L_0x0015
            goto L_0x001c
        L_0x0015:
            android.view.View r5 = r5.G0
            hde r5 = (defpackage.hde) r5
            r5.d(r6)
        L_0x001c:
            return
        L_0x001d:
            xz r6 = r6.X
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.ede
            if (r0 == 0) goto L_0x0028
            ede r6 = (defpackage.ede) r6
            goto L_0x0029
        L_0x0028:
            r6 = 0
        L_0x0029:
            if (r6 != 0) goto L_0x002c
            goto L_0x0033
        L_0x002c:
            android.view.View r5 = r5.G0
            jde r5 = (defpackage.jde) r5
            r5.u(r6)
        L_0x0033:
            return
        L_0x0034:
            xz r6 = r6.X
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.toe
            r1 = 0
            if (r0 == 0) goto L_0x0040
            toe r6 = (defpackage.toe) r6
            goto L_0x0041
        L_0x0040:
            r6 = r1
        L_0x0041:
            if (r6 != 0) goto L_0x0044
            goto L_0x0054
        L_0x0044:
            android.view.View r5 = r5.G0
            boolean r0 = r5 instanceof defpackage.roe
            if (r0 == 0) goto L_0x004d
            r1 = r5
            roe r1 = (defpackage.roe) r1
        L_0x004d:
            if (r1 == 0) goto L_0x0054
            gpe r5 = r6.a
            r1.a(r5)
        L_0x0054:
            return
        L_0x0055:
            xz r0 = r6.X
            o00 r0 = r0.d
            boolean r1 = r0 instanceof defpackage.w4e
            if (r1 == 0) goto L_0x0060
            w4e r0 = (defpackage.w4e) r0
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            if (r0 != 0) goto L_0x0065
            goto L_0x0145
        L_0x0065:
            android.view.View r5 = r5.G0
            a6e r5 = (defpackage.a6e) r5
            int r6 = r6.F0
            r1 = 2080374784(0x7c000000, float:2.658456E36)
            r6 = r6 & r1
            boolean r6 = defpackage.ct0.b(r6)
            js9 r1 = defpackage.fu4.k
            android.content.Context r2 = r5.getContext()
            fu4 r1 = r1.e(r2)
            k2b r1 = r1.f()
            hq2 r1 = r1.a()
            ws0 r6 = r1.a(r6)
            r5.w = r6
            java.lang.String r6 = r0.c
            r1 = 8
            r2 = 0
            kotlin.Lazy r3 = r5.A0
            if (r6 == 0) goto L_0x00a3
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            r4 = r3
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r4.setText(r6)
            r3.setVisibility(r2)
            goto L_0x00b2
        L_0x00a3:
            boolean r6 = r3.isInitialized()
            if (r6 == 0) goto L_0x00b2
            java.lang.Object r6 = r3.getValue()
            android.view.View r6 = (android.view.View) r6
            r6.setVisibility(r1)
        L_0x00b2:
            kotlin.Lazy r6 = r5.B0
            java.lang.String r3 = r0.d
            if (r3 == 0) goto L_0x00c8
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r4 = r6
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r4.setText(r3)
            r6.setVisibility(r2)
            goto L_0x00d7
        L_0x00c8:
            boolean r3 = r6.isInitialized()
            if (r3 == 0) goto L_0x00d7
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r6.setVisibility(r1)
        L_0x00d7:
            kotlin.Lazy r6 = r5.C0
            java.lang.String r3 = r0.e
            if (r3 == 0) goto L_0x00ed
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r4 = r6
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r4.setText(r3)
            r6.setVisibility(r2)
            goto L_0x00fc
        L_0x00ed:
            boolean r3 = r6.isInitialized()
            if (r3 == 0) goto L_0x00fc
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r6.setVisibility(r1)
        L_0x00fc:
            kotlin.Lazy r6 = r5.D0
            p87 r3 = r0.f
            if (r3 == 0) goto L_0x0112
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r1 = r6
            s87 r1 = (defpackage.s87) r1
            r1.setImageAttach(r3)
            r6.setVisibility(r2)
            goto L_0x0121
        L_0x0112:
            boolean r2 = r6.isInitialized()
            if (r2 == 0) goto L_0x0121
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r6.setVisibility(r1)
        L_0x0121:
            android.content.Context r6 = r5.getContext()
            vra r1 = new vra
            r2 = 24
            r1.<init>(r2, r5, r0)
            t53 r0 = new t53
            r2 = 5
            r0.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r1)
            android.view.GestureDetector r1 = new android.view.GestureDetector
            r1.<init>(r6, r0)
            r6 = 1
            r1.setIsLongpressEnabled(r6)
            pg6 r6 = new pg6
            r0 = 8
            r6.<init>(r1, r0)
            r5.setOnTouchListener(r6)
        L_0x0145:
            return
        L_0x0146:
            xz r0 = r6.X
            o00 r0 = r0.d
            boolean r1 = r0 instanceof defpackage.vp6
            if (r1 == 0) goto L_0x0151
            vp6 r0 = (defpackage.vp6) r0
            goto L_0x0152
        L_0x0151:
            r0 = 0
        L_0x0152:
            if (r0 != 0) goto L_0x0155
            goto L_0x0165
        L_0x0155:
            android.view.View r5 = r5.G0
            wp6 r5 = (defpackage.wp6) r5
            int r6 = r6.F0
            r1 = 2080374784(0x7c000000, float:2.658456E36)
            r6 = r6 & r1
            boolean r6 = defpackage.ct0.b(r6)
            r5.b(r0, r6)
        L_0x0165:
            return
        L_0x0166:
            xz r6 = r6.X
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.bl5
            if (r0 == 0) goto L_0x0171
            bl5 r6 = (defpackage.bl5) r6
            goto L_0x0172
        L_0x0171:
            r6 = 0
        L_0x0172:
            if (r6 != 0) goto L_0x0175
            goto L_0x017c
        L_0x0175:
            android.view.View r5 = r5.G0
            zm5 r5 = (defpackage.zm5) r5
            r5.setFileInfo(r6)
        L_0x017c:
            return
        L_0x017d:
            xz r6 = r6.X
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.dl3
            if (r0 == 0) goto L_0x0188
            dl3 r6 = (defpackage.dl3) r6
            goto L_0x0189
        L_0x0188:
            r6 = 0
        L_0x0189:
            if (r6 != 0) goto L_0x018c
            goto L_0x0193
        L_0x018c:
            android.view.View r5 = r5.G0
            zq3 r5 = (defpackage.zq3) r5
            r5.i(r6)
        L_0x0193:
            return
        L_0x0194:
            xz r6 = r6.X
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.i01
            if (r0 == 0) goto L_0x019f
            i01 r6 = (defpackage.i01) r6
            goto L_0x01a0
        L_0x019f:
            r6 = 0
        L_0x01a0:
            if (r6 != 0) goto L_0x01a3
            goto L_0x01aa
        L_0x01a3:
            android.view.View r5 = r5.G0
            oc1 r5 = (defpackage.oc1) r5
            r5.c(r6)
        L_0x01aa:
            return
        L_0x01ab:
            xz r6 = r6.X
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.l50
            if (r0 == 0) goto L_0x01b6
            l50 r6 = (defpackage.l50) r6
            goto L_0x01b7
        L_0x01b6:
            r6 = 0
        L_0x01b7:
            if (r6 != 0) goto L_0x01ba
            goto L_0x01c1
        L_0x01ba:
            android.view.View r5 = r5.G0
            q50 r5 = (defpackage.q50) r5
            r5.setAudio(r6)
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x50.W(one.me.messages.list.loader.MessageModel):void");
    }

    public void Y(ws0 ws0) {
        switch (this.R0) {
            case 0:
                ((q50) this.G0).b();
                return;
            case 1:
                View view = this.G0;
                cn0 cn0 = view instanceof cn0 ? (cn0) view : null;
                if (cn0 != null && !cn0.v.b()) {
                    cn0.setDateTextColor(ws0.b.f);
                    return;
                }
                return;
            case 2:
                ((oc1) this.G0).b();
                return;
            case 3:
                ((zq3) this.G0).d();
                return;
            case 4:
                ((zm5) this.G0).t(ws0);
                return;
            case 5:
                ((wp6) this.G0).c(ws0);
                return;
            case 6:
                ((a6e) this.G0).m(ws0);
                return;
            case 7:
                View view2 = this.G0;
                epe epe = view2 instanceof epe ? (epe) view2 : null;
                if (epe != null && !epe.w.b()) {
                    epe.setDateTextColor(ws0.b.f);
                    return;
                }
                return;
            case 8:
                View view3 = this.G0;
                a84 a84 = view3 instanceof a84 ? (a84) view3 : null;
                if (a84 != null) {
                    a84.setDateTextColor(ws0.b.f);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void Z(a93 a93) {
        switch (this.R0) {
            case 1:
                View view = this.G0;
                cn0 cn0 = view instanceof cn0 ? (cn0) view : null;
                if (cn0 != null && cn0.v.b()) {
                    cn0.setDateTextColor(a93.b.a);
                    return;
                }
                return;
            case 7:
                View view2 = this.G0;
                epe epe = view2 instanceof epe ? (epe) view2 : null;
                if (epe != null && epe.w.b()) {
                    epe.setDateTextColor(a93.b.a);
                    return;
                }
                return;
            case 9:
                jde jde = (jde) this.G0;
                jde.setDateTextColor(a93.b.a);
                jde.z0.onThemeChanged(fu4.k.e(jde.getContext()).f());
                return;
            case 10:
                hde hde = (hde) this.G0;
                hde.setDateTextColor(a93.b.a);
                hde.x.onThemeChanged(fu4.k.e(hde.getContext()).f());
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x50(Context context) {
        super(context, new vff(context));
        this.R0 = 8;
    }
}
