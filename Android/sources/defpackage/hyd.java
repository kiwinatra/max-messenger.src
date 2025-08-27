package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;

/* renamed from: hyd  reason: default package */
public class hyd extends pzc {
    public final ro4 D0 = ro4.b();
    public final ImageView E0;
    public final TextView F0;
    public final TextView G0;
    public final TextView H0;
    public TextView I0;
    public final View J0;
    public final View K0;
    public fyd L0;
    public final b0e M0;
    public final scf N0;

    public hyd(View view, b0e b0e) {
        super(view);
        ym ymVar = ym.v;
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        this.N0 = k0;
        view.setBackground(k0.e());
        ImageView imageView = (ImageView) view.findViewById(lic.row_setting__iv_icon);
        this.E0 = imageView;
        if (imageView != null) {
            imageView.setColorFilter(k0.x);
        }
        TextView textView = (TextView) view.findViewById(lic.row_setting__tv_title);
        this.F0 = textView;
        if (textView != null) {
            textView.setTextColor(k0.l);
        }
        TextView textView2 = (TextView) view.findViewById(lic.row_setting__tv_subtitle);
        this.G0 = textView2;
        int i = k0.N;
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
        TextView textView3 = (TextView) view.findViewById(lic.row_setting__tv_description);
        this.H0 = textView3;
        if (textView3 != null) {
            textView3.setTextColor(i);
        }
        View findViewById = view.findViewById(lic.row_setting__separator);
        this.J0 = findViewById;
        if (findViewById != null) {
            findViewById.setBackgroundColor(k0.I);
        }
        View findViewById2 = view.findViewById(lic.row_setting__small_separator);
        this.K0 = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setBackgroundColor(k0.L);
        }
        this.M0 = b0e;
        if (b0e != null) {
            view.setOnClickListener(new u99(25, (Object) this));
        }
    }

    public void M(fyd fyd, boolean z) {
        this.L0 = fyd;
        boolean z2 = fyd.z;
        View view = this.a;
        view.setEnabled(z2);
        view.setAlpha(fyd.v0);
        int i = 8;
        ImageView imageView = this.E0;
        if (imageView != null) {
            this.L0.getClass();
            imageView.setVisibility(8);
        }
        scf scf = this.N0;
        TextView textView = this.F0;
        if (textView != null) {
            textView.setText(this.L0.b);
            textView.setEnabled(this.L0.z);
            fyd fyd2 = this.L0;
            int i2 = fyd2.Y;
            if (i2 != 0) {
                textView.setTextColor(i2);
            } else if (fyd2.y == 3) {
                textView.setTextColor(scf.l);
            } else {
                textView.setTextColor(scf.G);
            }
            if (this.L0.Z) {
                textView.setTypeface((Typeface) null, 1);
            } else {
                textView.setTypeface((Typeface) null, 0);
            }
            this.L0.getClass();
            textView.setSingleLine(false);
            textView.setMaxLines(999);
        }
        TextView textView2 = this.G0;
        if (textView2 != null) {
            if (TextUtils.isEmpty(this.L0.c)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(this.L0.c);
                textView2.setVisibility(0);
            }
        }
        View view2 = this.J0;
        if (view2 != null) {
            view2.setVisibility(this.L0.X ? 0 : 8);
        }
        View view3 = this.K0;
        if (view3 != null) {
            view3.setVisibility(!this.L0.X ? 0 : 8);
            iq.N(view3, z ? 0 : this.D0.s);
        }
        TextView textView3 = this.H0;
        if (textView3 != null) {
            if (TextUtils.isEmpty(this.L0.o)) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(this.L0.o);
                textView3.setVisibility(0);
            }
        }
        fyd fyd3 = this.L0;
        if (fyd3.y == 0) {
            TextView textView4 = this.I0;
            if (textView4 != null || fyd3.w0) {
                if (textView4 == null) {
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(lic.row_setting__fl_value);
                    TextView textView5 = (TextView) LayoutInflater.from(view.getContext()).inflate(ujc.row_setting_warning, frameLayout, false);
                    this.I0 = textView5;
                    textView5.setTextColor(scf.R);
                    iq.a0(this.I0.getBackground(), scf.Q);
                    frameLayout.addView(this.I0);
                    frameLayout.setVisibility(0);
                }
                TextView textView6 = this.I0;
                if (this.L0.w0) {
                    i = 0;
                }
                textView6.setVisibility(i);
            }
        }
    }
}
