package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.Lazy;

/* renamed from: cgf  reason: default package */
public final class cgf extends hyd {
    public final TextView O0;

    public cgf(ViewGroup viewGroup, LayoutInflater layoutInflater, b0e b0e) {
        super(viewGroup, b0e);
        TextView textView = (TextView) layoutInflater.inflate(ujc.row_setting_text, viewGroup, false);
        this.O0 = textView;
        Context context = textView.getContext();
        Lazy lazy = scf.b0;
        textView.setTextColor(j4b.k0(context).G);
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(lic.row_setting__fl_value);
        frameLayout.addView(textView);
        frameLayout.setVisibility(0);
    }

    public final void M(fyd fyd, boolean z) {
        super.M(fyd, z);
        Object obj = fyd.w;
        TextView textView = this.O0;
        if (obj != null) {
            textView.setVisibility(0);
            textView.setText((String) fyd.w);
            return;
        }
        textView.setVisibility(8);
    }
}
