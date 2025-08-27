package defpackage;

/* renamed from: r18  reason: default package */
public final class r18 extends enf {
    public u18 D0;

    public final void M(n18 n18, boolean z, int i) {
        super.M(n18, z, i);
        u18 u18 = this.D0;
        u18.L0 = n18;
        u18.H0.setText(n18.c);
        CharSequence charSequence = n18.d;
        if (cvg.A(charSequence)) {
            u18.H0.setSingleLine(false);
            u18.H0.setMaxLines(2);
            u18.I0.setVisibility(8);
        } else {
            u18.H0.setSingleLine(true);
            u18.H0.setMaxLines(1);
            u18.I0.setVisibility(0);
            u18.I0.setText(charSequence);
        }
        if (n18.j) {
            u18.F0.setImageResource(nad.L0);
            u18.G0.setVisibility(0);
        } else {
            u18.F0.setImageResource(nad.K0);
            u18.G0.setVisibility(8);
        }
        u18.L();
        u18.M();
    }
}
