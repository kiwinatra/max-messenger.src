package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import kotlin.Lazy;

/* renamed from: wm3  reason: default package */
public final class wm3 extends co3 {
    public final TextView D0;

    public wm3(View view) {
        super(view);
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        view.findViewById(lic.row_contact_divider__divider).setBackgroundColor(k0.L);
        TextView textView = (TextView) view.findViewById(lic.row_contact_divider__tv_title);
        this.D0 = textView;
        textView.setTextColor(k0.N);
    }
}
