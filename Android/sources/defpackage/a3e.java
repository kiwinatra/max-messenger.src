package defpackage;

import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: a3e  reason: default package */
public final class a3e extends pzc implements CompoundButton.OnCheckedChangeListener {
    public final jwb D0;
    public final r62 E0;
    public final jtb F0;
    public final AppCompatImageView G0;
    public final TextView H0;
    public final SwitchCompat I0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a3e(android.view.ViewGroup r4, defpackage.jwb r5, defpackage.r62 r6, defpackage.jtb r7) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = defpackage.ujc.row_profile_setting_notifications
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            r3.<init>(r4)
            r3.D0 = r5
            r3.E0 = r6
            r3.F0 = r7
            android.content.Context r5 = r4.getContext()
            kotlin.Lazy r6 = defpackage.scf.b0
            scf r5 = defpackage.j4b.k0(r5)
            android.graphics.drawable.RippleDrawable r6 = r5.e()
            r4.setBackground(r6)
            int r6 = defpackage.lic.row_profile_setting__iv_icon
            android.view.View r6 = r4.findViewById(r6)
            androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
            r3.G0 = r6
            int r7 = r5.K
            r6.setColorFilter(r7)
            int r6 = defpackage.lic.row_profile_setting__tv_title
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.content.Context r0 = r4.getContext()
            int r1 = defpackage.qad.U5
            java.lang.String r0 = r0.getString(r1)
            r6.setText(r0)
            r6.setTextColor(r7)
            int r6 = defpackage.lic.row_profile_setting__tv_value
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r3.H0 = r6
            int r7 = r5.N
            r6.setTextColor(r7)
            int r6 = defpackage.lic.row_profile_setting__sw_mute
            android.view.View r6 = r4.findViewById(r6)
            androidx.appcompat.widget.SwitchCompat r6 = (androidx.appcompat.widget.SwitchCompat) r6
            r3.I0 = r6
            defpackage.iq.j(r5, r6)
            ivc r5 = new ivc
            r6 = 2
            r5.<init>(r6, r3)
            defpackage.y64.n(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3e.<init>(android.view.ViewGroup, jwb, r62, jtb):void");
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        jwb jwb = this.D0;
        if (jwb != null) {
            jwb.O0();
        }
    }
}
