package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import kotlin.Lazy;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: mk3  reason: default package */
public final class mk3 extends pzc {
    public final TamAvatarView D0;
    public final TextView E0;
    public final TextView F0;
    public final View G0;
    public ck3 H0;

    public mk3(View view, ms1 ms1) {
        super(view);
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        this.D0 = (TamAvatarView) view.findViewById(lic.row_constructor__av_avatar);
        TextView textView = (TextView) view.findViewById(lic.row_constructor__tv_name);
        this.E0 = textView;
        cvg.x(textView).b();
        TextView textView2 = (TextView) view.findViewById(lic.row_constructor__tv_description);
        this.F0 = textView2;
        View findViewById = view.findViewById(lic.row_constructor__divider);
        this.G0 = findViewById;
        y64.n(view, new p00(1, this, ms1));
        view.setBackground(k0.e());
        textView.setTextColor(k0.G);
        textView2.setTextColor(k0.N);
        findViewById.setBackgroundColor(k0.L);
    }
}
