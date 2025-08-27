package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import kotlin.Lazy;
import ru.ok.messages.settings.view.BrightnessSeekBar;

/* renamed from: ls0  reason: default package */
public final class ls0 extends pzc {
    public final BrightnessSeekBar D0;
    public fyd E0;
    public boolean F0;

    public ls0(View view, b0e b0e) {
        super(view);
        BrightnessSeekBar brightnessSeekBar = (BrightnessSeekBar) view.findViewById(lic.row_setting_brightness__seek_bar);
        this.D0 = brightnessSeekBar;
        brightnessSeekBar.setMax(100);
        brightnessSeekBar.setOnSeekBarChangeListener(new ks0(this, b0e));
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        iq.a0(brightnessSeekBar.getProgressDrawable(), k0.l);
        iq.a0(brightnessSeekBar.getThumb(), k0.l);
        view.findViewById(lic.row_setting__separator).setBackgroundColor(k0.I);
        int i = k0.G;
        ((ImageView) view.findViewById(lic.row_setting_brightness__iv_brigthness_low)).setColorFilter(i);
        ((ImageView) view.findViewById(lic.row_setting_brightness__iv_brigthness_high)).setColorFilter(i);
    }
}
