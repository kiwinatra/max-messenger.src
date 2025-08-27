package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.Lazy;
import ru.ok.messages.settings.view.LedSeekBar;

/* renamed from: ts7  reason: default package */
public final class ts7 extends pzc {
    public final LedSeekBar D0;
    public final b0e E0;
    public final SwitchCompat F0;
    public final View G0;
    public final View H0;
    public final TextView I0;
    public fyd J0;

    public ts7(View view, b0e b0e) {
        super(view);
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        this.E0 = b0e;
        LedSeekBar ledSeekBar = (LedSeekBar) view.findViewById(lic.row_setting_led__ls_seekbar);
        this.D0 = ledSeekBar;
        TextView textView = (TextView) view.findViewById(lic.row_setting_led__title);
        this.I0 = textView;
        textView.setTextColor(k0.G);
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(lic.row_setting_led__cb_check);
        this.F0 = switchCompat;
        iq.j(k0, switchCompat);
        View findViewById = view.findViewById(lic.row_setting__separator);
        this.G0 = findViewById;
        findViewById.setBackgroundColor(k0.I);
        view.findViewById(lic.row_setting_led__separator_small).setBackgroundColor(k0.L);
        this.H0 = view.findViewById(lic.row_setting_led__ll_led_container);
        ledSeekBar.setListener(new ib4(27, this, b0e));
        view.findViewById(lic.row_setting_led__ll_root).setOnClickListener(new xu3(22, (Object) this));
    }
}
