package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import kotlin.Lazy;

/* renamed from: c12  reason: default package */
public final class c12 extends pzc {
    public final TextView D0;

    public c12(View view, gy7 gy7) {
        super(view);
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        int i = k0.l;
        view.setBackground(k0.e());
        TextView textView = (TextView) view.findViewById(lic.row_profile_descr__tv);
        this.D0 = textView;
        textView.setTransformationMethod(new qy7());
        textView.setMovementMethod(ce5.a());
        int i2 = k0.K;
        textView.setTextColor(i2);
        textView.setLinkTextColor(i2);
        if (gy7 != null) {
            qy7 qy7 = new qy7();
            textView.setTransformationMethod(qy7);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            qy7.a = gy7;
        }
    }
}
