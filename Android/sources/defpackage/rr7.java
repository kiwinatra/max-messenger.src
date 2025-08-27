package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import ru.ok.messages.views.dialogs.FrgDlgLangChoose;

/* renamed from: rr7  reason: default package */
public final class rr7 extends pzc {
    public final FrgDlgLangChoose D0;
    public final TextView E0;
    public final TextView F0;
    public final ImageView G0;

    public rr7(View view, FrgDlgLangChoose frgDlgLangChoose) {
        super(view);
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        TextView textView = (TextView) view.findViewById(lic.row_language__tv_title);
        this.E0 = textView;
        textView.setTextColor(k0.G);
        TextView textView2 = (TextView) view.findViewById(lic.row_language__tv_subtitle);
        this.F0 = textView2;
        textView2.setTextColor(k0.N);
        ImageView imageView = (ImageView) view.findViewById(lic.row_language__ivCheckbox);
        this.G0 = imageView;
        imageView.setColorFilter(k0.m);
        imageView.setBackground(i8b.K(Integer.valueOf(k0.l), (Integer) null, (Integer) null));
        this.D0 = frgDlgLangChoose;
    }
}
