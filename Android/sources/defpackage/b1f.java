package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: b1f  reason: default package */
public final class b1f extends pzc implements wcf {
    public final TextView D0;
    public final ImageView E0;
    public final Drawable F0;
    public final Drawable G0;
    public final View H0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b1f(android.view.ViewGroup r4) {
        /*
            r3 = this;
            android.view.LayoutInflater r0 = defpackage.f6e.s(r4)
            int r1 = defpackage.ujc.row_suggests_search_contacts
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r4, r2)
            r3.<init>(r0)
            int r1 = defpackage.lic.row_suggests__search_contacts
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3.D0 = r1
            int r1 = defpackage.lic.row_suggests__search_icon
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r3.E0 = r1
            android.content.Context r1 = r4.getContext()
            int r2 = defpackage.nad.t1
            android.graphics.drawable.Drawable r1 = defpackage.ew3.b(r1, r2)
            r3.F0 = r1
            android.content.Context r1 = r4.getContext()
            int r2 = defpackage.nad.u
            android.graphics.drawable.Drawable r1 = defpackage.ew3.b(r1, r2)
            r3.G0 = r1
            int r1 = defpackage.lic.row_suggests__divider1
            android.view.View r0 = r0.findViewById(r1)
            r3.H0 = r0
            boolean r0 = r4.isInEditMode()
            if (r0 == 0) goto L_0x004b
            vi4 r4 = defpackage.vi4.f0
            goto L_0x0055
        L_0x004b:
            android.content.Context r4 = r4.getContext()
            kotlin.Lazy r0 = defpackage.scf.b0
            scf r4 = defpackage.j4b.k0(r4)
        L_0x0055:
            r3.L0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1f.<init>(android.view.ViewGroup):void");
    }

    public final void L0(scf scf) {
        this.D0.setTextColor(scf.l);
        Drawable drawable = this.F0;
        int i = scf.l;
        drawable.setTint(i);
        this.G0.setTint(i);
        this.a.setBackground(i8b.H(scf.n, scf.j));
        this.H0.setBackgroundColor(scf.L);
    }
}
