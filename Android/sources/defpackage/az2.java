package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import java.util.Set;
import kotlin.Lazy;

/* renamed from: az2  reason: default package */
public final class az2 extends hyd {
    public final /* synthetic */ int O0;
    public final View P0;
    public final View Q0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public az2(View view, b0e b0e) {
        super(view, b0e);
        this.O0 = 2;
        if (b0e != null) {
            y64.n(view, new yhf(this, 0));
        }
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        ImageView imageView = (ImageView) view.findViewById(lic.row_setting_theme__iv__selected);
        this.Q0 = imageView;
        imageView.setColorFilter(k0.l);
        ImageView imageView2 = (ImageView) view.findViewById(lic.row_setting_theme__iv__forward);
        this.P0 = imageView2;
        imageView2.setColorFilter(k0.l);
        imageView2.setBackground(k0.d());
        if (b0e != null) {
            y64.n(imageView2, new yhf(this, 1));
        }
    }

    public final void M(fyd fyd, boolean z) {
        switch (this.O0) {
            case 0:
                super.M(fyd, z);
                SwitchCompat switchCompat = (SwitchCompat) this.Q0;
                switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                switchCompat.setChecked(((Boolean) fyd.w).booleanValue());
                switchCompat.setOnCheckedChangeListener(new zy2(0, this));
                switchCompat.setEnabled(fyd.z);
                boolean isEmpty = TextUtils.isEmpty(fyd.v);
                TextView textView = (TextView) this.P0;
                if (isEmpty) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(fyd.v);
                    textView.setVisibility(0);
                }
                boolean z2 = this.L0.z;
                TextView textView2 = this.F0;
                if (z2) {
                    switchCompat.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    return;
                }
                switchCompat.setAlpha(0.5f);
                textView2.setAlpha(0.5f);
                return;
            case 1:
                super.M(fyd, z);
                boolean A = cvg.A((CharSequence) fyd.w);
                TextView textView3 = (TextView) this.P0;
                View view = this.Q0;
                if (!A) {
                    view.setVisibility(8);
                    textView3.setText((CharSequence) fyd.w);
                    return;
                }
                view.setVisibility(0);
                textView3.setText(qad.q6);
                return;
            default:
                super.M(fyd, z);
                scf scf = (scf) fyd.w;
                this.F0.setText(fqc.s(scf, this.a.getContext()));
                String str = scf.e;
                hq hqVar = ym.v.c().c;
                hqVar.getClass();
                boolean equals = str.equals(hqVar.g.getString("app.theme", vi4.f0.e));
                ImageView imageView = (ImageView) this.Q0;
                int i = 0;
                if (equals) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(4);
                }
                boolean contains = ((Set) scf.b0.getValue()).contains(scf);
                ImageView imageView2 = (ImageView) this.P0;
                if (contains) {
                    imageView2.setVisibility(4);
                } else {
                    imageView2.setVisibility(0);
                }
                if (!z) {
                    i = this.D0.J;
                }
                iq.N(this.K0, i);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public az2(ViewGroup viewGroup, LayoutInflater layoutInflater, b0e b0e, int i) {
        super(viewGroup, b0e);
        this.O0 = i;
        switch (i) {
            case 1:
                super(viewGroup, b0e);
                View inflate = layoutInflater.inflate(ujc.row_setting_online, viewGroup, false);
                View findViewById = inflate.findViewById(lic.row_setting_online__circle);
                this.Q0 = findViewById;
                findViewById.setBackground(i8b.K(Integer.valueOf(this.N0.l), (Integer) null, (Integer) null));
                TextView textView = (TextView) inflate.findViewById(lic.row_setting_online__tv);
                this.P0 = textView;
                Context context = textView.getContext();
                Lazy lazy = scf.b0;
                textView.setTextColor(j4b.k0(context).G);
                FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(lic.row_setting__fl_value);
                frameLayout.addView(inflate);
                frameLayout.setVisibility(0);
                return;
            default:
                Context context2 = viewGroup.getContext();
                Lazy lazy2 = scf.b0;
                scf k0 = j4b.k0(context2);
                View inflate2 = layoutInflater.inflate(ujc.row_setting_checkbox, viewGroup, false);
                FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(lic.row_setting__fl_value);
                frameLayout2.addView(inflate2);
                frameLayout2.setVisibility(0);
                SwitchCompat switchCompat = (SwitchCompat) inflate2.findViewById(lic.row_checkbox_setting__cb_check);
                this.Q0 = switchCompat;
                iq.j(k0, switchCompat);
                TextView textView2 = (TextView) inflate2.findViewById(lic.row_checkbox_setting__tv_value);
                this.P0 = textView2;
                textView2.setTextColor(k0.N);
                iq.M(this.G0, this.D0.K);
                viewGroup.setOnClickListener(new x4(25, (Object) this));
                return;
        }
    }
}
