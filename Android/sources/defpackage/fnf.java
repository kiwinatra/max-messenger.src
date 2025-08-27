package defpackage;

import java.util.List;

/* renamed from: fnf  reason: default package */
public final class fnf extends tyc {
    public final ir2 o;
    public final int v;
    public final int w;
    public final ro4 x;
    public List y;
    public final int z = vo4.b((int) 300.0f);

    public fnf(List list, ir2 ir2, int i, int i2, ro4 ro4) {
        this.y = list;
        this.o = ir2;
        this.v = i;
        this.w = i2;
        this.x = ro4;
        ro4.getClass();
        C(true);
    }

    public final int j() {
        return this.y.size();
    }

    public final long k(int i) {
        return ((n18) this.y.get(i)).a;
    }

    public final int l(int i) {
        return ((n18) this.y.get(i)).b.ordinal();
    }

    public final void s(pzc pzc, int i) {
        enf enf = (enf) pzc;
        int size = this.y.size();
        if (size <= i) {
            z68.c("fnf", "onBindViewHolder: failed to bind scrollable panel, size %d less than position %d", Integer.valueOf(size), Integer.valueOf(i));
            return;
        }
        n18 n18 = (n18) this.y.get(i);
        boolean z2 = size == 1;
        int i2 = this.z;
        int i3 = this.v;
        int i4 = i3 / i2;
        if (i4 < 1) {
            i4 = 1;
        }
        if (i4 > size) {
            i4 = size;
        }
        int i5 = this.w;
        float f = (float) (i3 - ((1 + i4) * i5));
        float f2 = (float) i4;
        enf.M(n18, z2, (int) ((f / f2) - (i4 < size ? ((float) (this.x.z + i5)) / f2 : c44.DEFAULT_ASPECT_RATIO)));
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.constraintlayout.widget.ConstraintLayout, ru.ok.messages.calls.views.ChatCallView, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v3, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, u18, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r6v31, types: [pzc, r18] */
    /* JADX WARNING: type inference failed for: r5v7, types: [hnf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.pzc u(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            dnf[] r2 = defpackage.dnf.values()
            r2 = r2[r7]
            int r2 = r2.ordinal()
            r3 = 0
            ir2 r5 = r5.o
            if (r2 == 0) goto L_0x0132
            if (r2 == r1) goto L_0x011e
            r4 = 3
            if (r2 == r4) goto L_0x0037
            r5 = 4
            if (r2 != r5) goto L_0x0029
            cxa r5 = new cxa
            android.content.Context r6 = r6.getContext()
            r5.<init>(r6, r3)
            pe1 r6 = new pe1
            r6.<init>(r5, r1)
            goto L_0x0153
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Developer should implement type "
            java.lang.String r0 = " in TopPanelAdapter"
            java.lang.String r6 = defpackage.a81.j(r7, r6, r0)
            r5.<init>(r6)
            throw r5
        L_0x0037:
            u18 r7 = new u18
            android.content.Context r6 = r6.getContext()
            r7.<init>(r6)
            r7.getContext()
            ro4 r6 = defpackage.ro4.b()
            r7.E0 = r6
            android.content.Context r6 = r7.getContext()
            int r2 = defpackage.ujc.view_live_location_panel
            android.view.View.inflate(r6, r2, r7)
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            android.content.res.Resources r2 = r7.getResources()
            int r4 = defpackage.ydc.chat_top_panel_height
            int r2 = r2.getDimensionPixelOffset(r4)
            r4 = -1
            r6.<init>(r4, r2)
            r7.setLayoutParams(r6)
            int r6 = defpackage.lic.view_live_location_panel__iv_pin
            android.view.View r6 = r7.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r7.F0 = r6
            int r6 = defpackage.lic.view_live_location_panel__pb_request_location
            android.view.View r6 = r7.findViewById(r6)
            android.widget.ProgressBar r6 = (android.widget.ProgressBar) r6
            r7.G0 = r6
            int r6 = defpackage.lic.view_live_location_panel__tv_title
            android.view.View r6 = r7.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7.H0 = r6
            int r6 = defpackage.lic.view_live_location_panel__tv_subtitle
            android.view.View r6 = r7.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7.I0 = r6
            int r6 = defpackage.lic.view_live_location_panel__ib_close
            android.view.View r6 = r7.findViewById(r6)
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r7.J0 = r6
            s18 r6 = new s18
            r6.<init>(r7, r0)
            defpackage.y64.n(r7, r6)
            android.widget.ImageButton r6 = r7.J0
            s18 r2 = new s18
            r2.<init>(r7, r1)
            defpackage.y64.n(r6, r2)
            android.content.Context r6 = r7.getContext()
            kotlin.Lazy r1 = defpackage.scf.b0
            scf r6 = defpackage.j4b.k0(r6)
            int r1 = r6.y
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            ro4 r2 = r7.E0
            int r2 = r2.d
            android.graphics.drawable.GradientDrawable r1 = defpackage.i8b.O(r1, r3, r3, r2)
            r7.setBackground(r1)
            r7.L()
            r7.M()
            android.widget.TextView r1 = r7.H0
            int r2 = r6.G
            r1.setTextColor(r2)
            android.widget.TextView r1 = r7.I0
            r4 = 1056964608(0x3f000000, float:0.5)
            int r2 = defpackage.j4b.l0(r4, r2)
            r1.setTextColor(r2)
            android.widget.ImageButton r1 = r7.J0
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            int r2 = r6.x
            defpackage.iq.a0(r1, r2)
            android.widget.ImageButton r1 = r7.J0
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.setColorFilter(r2, r4)
            android.widget.ImageButton r1 = r7.J0
            android.graphics.drawable.RippleDrawable r2 = r6.d()
            r1.setBackground(r2)
            ro4 r1 = r7.E0
            int r1 = r1.d
            int r2 = r6.y
            int r6 = r6.j
            android.graphics.drawable.RippleDrawable r6 = defpackage.i8b.f(r2, r6, r0, r1)
            r7.setBackground(r6)
            if (r5 == 0) goto L_0x0113
            java.lang.Class<t18> r6 = defpackage.t18.class
            hr2 r5 = (defpackage.hr2) r5
            hnf r5 = r5.a(r6)
            r3 = r5
            t18 r3 = (defpackage.t18) r3
        L_0x0113:
            r7.setListener(r3)
            r18 r6 = new r18
            r6.<init>(r7)
            r6.D0 = r7
            goto L_0x0153
        L_0x011e:
            ned r7 = new ned
            r7.<init>(r6)
            if (r5 == 0) goto L_0x0130
            java.lang.Class<med> r6 = defpackage.med.class
            hr2 r5 = (defpackage.hr2) r5
            hnf r5 = r5.a(r6)
            defpackage.rae.v(r5)
        L_0x0130:
            r6 = r7
            goto L_0x0153
        L_0x0132:
            ru.ok.messages.calls.views.ChatCallView r7 = new ru.ok.messages.calls.views.ChatCallView
            android.content.Context r6 = r6.getContext()
            r7.<init>(r6)
            r7.L()
            if (r5 == 0) goto L_0x014b
            java.lang.Class<f42> r6 = defpackage.f42.class
            hr2 r5 = (defpackage.hr2) r5
            hnf r5 = r5.a(r6)
            defpackage.rae.v(r5)
        L_0x014b:
            r7.setListener(r3)
            pe1 r6 = new pe1
            r6.<init>(r7, r0)
        L_0x0153:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnf.u(android.view.ViewGroup, int):pzc");
    }
}
