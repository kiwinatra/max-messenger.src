package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.b;
import kotlin.Lazy;
import ru.ok.messages.views.fragments.base.FrgBaseProfileLinkDescription;

/* renamed from: x1c  reason: default package */
public final class x1c extends pzc implements ny7 {
    public final AppCompatImageView D0;
    public final TextView E0;
    public final TextView F0;
    public final FrgBaseProfileLinkDescription G0;

    public x1c(View view, FrgBaseProfileLinkDescription frgBaseProfileLinkDescription) {
        super(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(lic.row_profile_info__ll_holder);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(lic.row_profile_info__iv_icon);
        this.D0 = appCompatImageView;
        TextView textView = (TextView) view.findViewById(lic.row_profile_info__tv_link);
        this.E0 = textView;
        ImageButton imageButton = (ImageButton) view.findViewById(lic.row_profile_info__btn_copy);
        TextView textView2 = (TextView) view.findViewById(lic.row_profile_info__tv_link_description);
        this.F0 = textView2;
        if (frgBaseProfileLinkDescription != null) {
            qy7 qy7 = new qy7();
            textView2.setTransformationMethod(qy7);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            qy7.a = this;
        }
        y64.n(imageButton, new w1c(this, 0));
        y64.n(viewGroup, new w1c(this, 1));
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        viewGroup.setBackground(k0.e());
        int i = k0.K;
        appCompatImageView.setColorFilter(i);
        textView.setTextColor(i);
        imageButton.setColorFilter(k0.l);
        imageButton.setBackground(k0.d());
        textView2.setTextColor(k0.N);
        textView2.setBackgroundColor(k0.I);
        this.G0 = frgBaseProfileLinkDescription;
    }

    public final void X(String str, sy7 sy7, ClickableSpan clickableSpan, View view) {
        b M1;
        FrgBaseProfileLinkDescription frgBaseProfileLinkDescription = this.G0;
        if (frgBaseProfileLinkDescription != null && (M1 = frgBaseProfileLinkDescription.M1()) != null) {
            te8.f(M1, frgBaseProfileLinkDescription.C3());
            hi7.b0(0, M1, frgBaseProfileLinkDescription.S1(qad.z0));
        }
    }

    public final void Z0(ta9 ta9) {
    }
}
