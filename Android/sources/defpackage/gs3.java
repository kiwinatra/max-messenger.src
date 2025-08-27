package defpackage;

import android.view.View;
import android.widget.TextView;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: gs3  reason: default package */
public final class gs3 extends hyd {
    public final TamAvatarView O0;
    public final TextView P0;
    public final TextView Q0;

    public gs3(View view, b0e b0e) {
        super(view, b0e);
        this.O0 = (TamAvatarView) view.findViewById(lic.row_setting_contact__av_view);
        TextView textView = (TextView) view.findViewById(lic.row_contact_base__tv_name);
        this.P0 = textView;
        cvg.x(textView).b();
        textView.setTextColor(this.N0.G);
        TextView textView2 = (TextView) view.findViewById(lic.row_contact_base__tv_last_seen);
        this.Q0 = textView2;
        textView2.setTextColor(this.N0.N);
    }

    public final void M(fyd fyd, boolean z) {
        String str;
        super.M(fyd, z);
        vk3 vk3 = (vk3) fyd.w;
        this.O0.b(vk3, true);
        this.P0.setText(vk3.f());
        boolean x = vk3.x();
        View view = this.a;
        if (x) {
            str = vk3.A() ? view.getContext().getString(qad.T8) : view.getContext().getString(qad.J);
        } else {
            eaf.a().getClass();
            str = ((sjd) eaf.b()).v().d(vk3, false).toString();
        }
        this.Q0.setText(str);
        view.setEnabled(fyd.z);
    }
}
