package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;

/* renamed from: dx6  reason: default package */
public class dx6 extends pzc {
    public final ro4 D0 = ro4.b();
    public final View E0;
    public final TextView F0;
    public final ImageView G0;
    public final scf H0;
    public final cx6 I0;
    public kx6 J0;

    public dx6(View view, cx6 cx6) {
        super(view);
        view.getContext();
        this.I0 = cx6;
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        this.H0 = k0;
        view.setBackground(k0.e());
        this.E0 = view.findViewById(lic.row_promo__ll_content);
        this.F0 = (TextView) view.findViewById(lic.row_header__tv_name);
        ImageView imageView = (ImageView) view.findViewById(lic.row_header__iv_icon);
        this.G0 = imageView;
        if (imageView != null) {
            imageView.setColorFilter(k0.l);
        }
        y64.n(view, new p00(10, this, view));
    }

    public final void M() {
        Typeface create = Typeface.create("sans-serif-medium", 0);
        TextView textView = this.F0;
        textView.setTypeface(create);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(mad.c));
    }

    public void onClick(View view) {
        cx6 cx6 = this.I0;
        if (cx6 != null) {
            cx6.a0(this.J0);
        }
    }
}
