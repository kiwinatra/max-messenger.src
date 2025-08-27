package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: z0f  reason: default package */
public final class z0f extends pzc implements wcf {
    public final TextView D0;
    public final TextView E0;
    public final View F0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z0f(android.view.ViewGroup r4) {
        /*
            r3 = this;
            android.view.LayoutInflater r0 = defpackage.f6e.s(r4)
            int r1 = defpackage.ujc.row_bot_command
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            r3.<init>(r4)
            int r0 = defpackage.lic.row_suggest__subtitle
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.D0 = r0
            int r0 = defpackage.lic.row_suggest__title
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.E0 = r0
            int r0 = defpackage.lic.row_suggest__divider
            android.view.View r0 = r4.findViewById(r0)
            r3.F0 = r0
            boolean r0 = r4.isInEditMode()
            if (r0 == 0) goto L_0x0033
            vi4 r4 = defpackage.vi4.f0
            goto L_0x003d
        L_0x0033:
            android.content.Context r4 = r4.getContext()
            kotlin.Lazy r0 = defpackage.scf.b0
            scf r4 = defpackage.j4b.k0(r4)
        L_0x003d:
            r3.L0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z0f.<init>(android.view.ViewGroup):void");
    }

    public final void L0(scf scf) {
        this.D0.setTextColor(scf.N);
        this.E0.setTextColor(scf.G);
        this.a.setBackground(i8b.H(scf.n, scf.j));
        this.F0.setBackgroundColor(scf.L);
    }
}
