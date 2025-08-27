package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.Lazy;
import ru.ok.messages.views.fragments.FrgProfileSettings;

/* renamed from: v0e  reason: default package */
public final class v0e extends pzc {
    public final Resources D0 = ym.v.getResources();
    public final FrgProfileSettings E0;
    public final AppCompatImageView F0;
    public final TextView G0;
    public final SwitchCompat H0;
    public final TextView I0;
    public final scf J0;

    public v0e(View view, boolean z, FrgProfileSettings frgProfileSettings) {
        super(view);
        view.getContext();
        int i = ro4.b().K;
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        this.J0 = k0;
        this.E0 = frgProfileSettings;
        if (z) {
            this.F0 = (AppCompatImageView) view.findViewById(lic.row_checkbox_setting__iv_icon);
            TextView textView = (TextView) view.findViewById(lic.row_checkbox_setting__tv_value);
            this.G0 = textView;
            SwitchCompat switchCompat = (SwitchCompat) view.findViewById(lic.row_checkbox_setting__cb_check);
            this.H0 = switchCompat;
            iq.j(k0, switchCompat);
            ct.G(view, 300, new u99(27, (Object) this));
            iq.M(textView, i);
            this.I0 = null;
            return;
        }
        ct.G(view, 300, new kqc(7, (Object) frgProfileSettings, (Object) view));
        this.F0 = (AppCompatImageView) view.findViewById(lic.row_setting__iv_icon);
        this.G0 = (TextView) view.findViewById(lic.row_setting__tv_title);
        TextView textView2 = (TextView) view.findViewById(lic.row_setting__tv_warning);
        this.I0 = textView2;
        textView2.setTextColor(k0.R);
        iq.a0(textView2.getBackground(), k0.Q);
        this.H0 = null;
    }
}
