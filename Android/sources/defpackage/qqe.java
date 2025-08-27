package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: qqe  reason: default package */
public final class qqe extends pzc implements bif, rq7 {
    public final hre D0;
    public final TextView E0;
    public final TextView F0;
    public final Button G0;
    public final RecyclerView H0;
    public final View I0;
    public final View J0;
    public sq7 K0;
    public oqe L0;
    public final ro4 M0 = ro4.b();
    public tq7 N0;
    public final gb8 O0;

    public qqe(View view, gb8 gb8, hre hre) {
        super(view);
        this.O0 = gb8;
        this.D0 = hre;
        view.getContext();
        this.E0 = (TextView) view.findViewById(lic.row_sticker_set_showcase__tv_title);
        this.F0 = (TextView) view.findViewById(lic.row_sticker_set_showcase__tv_description);
        Button button = (Button) view.findViewById(lic.row_sticker_set_showcase__b_set_add);
        this.G0 = button;
        y64.n(button, new pqe(this, hre, 0));
        this.H0 = (RecyclerView) view.findViewById(lic.row_sticker_set_showcase__rv_stickers);
        this.I0 = view.findViewById(lic.row_sticker_set_showcase__v_delimiter);
        View findViewById = view.findViewById(lic.row_sticker_set_showcase__cl_set_header);
        this.J0 = findViewById;
        y64.n(findViewById, new pqe(this, hre, 1));
        c();
    }

    public final void D(qq7 qq7) {
        b0 b0Var;
        boe a = this.N0.a(qq7);
        hre hre = this.D0;
        if (hre != null && a != null) {
            goe goe = goe.a;
            gre gre = hre.v;
            if (gre != null && (b0Var = ((yqe) gre).x) != null) {
                b0Var.z(a, (String) null, goe);
            }
        }
    }

    public final void M(boolean z) {
        scf g = scf.g(this.a.getContext());
        ro4 ro4 = this.M0;
        Button button = this.G0;
        if (z) {
            iq.f(g, button, ro4.l, g.J, g.x, 48);
            button.setText(qad.W1);
            return;
        }
        iq.f(g, button, ro4.l, g.l, g.m, 48);
        button.setText(qad.c);
    }

    public final void c() {
        scf g = scf.g(this.a.getContext());
        int i = g.G;
        TextView textView = this.E0;
        textView.setTextColor(i);
        this.F0.setTextColor(g.N);
        this.I0.setBackgroundColor(g.L);
        this.J0.setBackground(g.e());
        oqe oqe = this.L0;
        if (oqe != null) {
            M(oqe.f);
            textView.setText(this.L0.b);
        }
    }

    public final void l(qq7 qq7) {
        b0 b0Var;
        boe a = this.N0.a(qq7);
        hre hre = this.D0;
        if (hre != null && a != null) {
            goe goe = goe.a;
            gre gre = hre.v;
            if (gre != null && (b0Var = ((yqe) gre).x) != null) {
                b0Var.z(a, (String) null, goe);
            }
        }
    }

    public final void u() {
    }

    public final void w(qq7 qq7) {
        b0 b0Var;
        boe a = this.N0.a(qq7);
        hre hre = this.D0;
        if (hre != null && a != null) {
            goe goe = goe.b;
            gre gre = hre.v;
            if (gre != null && (b0Var = ((yqe) gre).x) != null) {
                b0Var.z(a, (String) null, goe);
            }
        }
    }
}
