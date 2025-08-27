package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import kotlin.Lazy;

/* renamed from: pmd  reason: default package */
public final class pmd extends pzc {
    public final TextView D0;

    public pmd(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(lic.row_sticker_section__tv_header);
        this.D0 = textView;
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        textView.setTextColor(j4b.k0(context).N);
    }
}
