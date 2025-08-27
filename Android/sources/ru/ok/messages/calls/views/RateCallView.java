package ru.ok.messages.calls.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Lazy;

public class RateCallView extends RelativeLayout implements SeekBar.OnSeekBarChangeListener {
    public final ImageView[] a;
    public int b;
    public final SeekBar c = ((SeekBar) findViewById(lic.view_call_rate__seek_bar));

    public RateCallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context2);
        LayoutInflater.from(getContext()).inflate(ujc.view_call_rate, this);
        AppCompatImageView[] appCompatImageViewArr = {(AppCompatImageView) findViewById(lic.view_call_rate__iv1), (AppCompatImageView) findViewById(lic.view_call_rate__iv2), (AppCompatImageView) findViewById(lic.view_call_rate__iv3), (AppCompatImageView) findViewById(lic.view_call_rate__iv4), (AppCompatImageView) findViewById(lic.view_call_rate__iv5)};
        this.a = appCompatImageViewArr;
        for (int i = 0; i < 5; i++) {
            AppCompatImageView appCompatImageView = appCompatImageViewArr[i];
            appCompatImageView.setColorFilter(k0.S);
            setDisabledIndicator(appCompatImageView);
        }
        this.c.setOnSeekBarChangeListener(this);
        this.c.setMax((int) (((float) this.a.length) * 10.0f));
    }

    private void setDisabledIndicator(ImageView imageView) {
        imageView.setAlpha(0.4f);
    }

    private void setEnabledIndicator(ImageView imageView) {
        imageView.setAlpha(1.0f);
    }

    public int getCurrentRate() {
        return this.b;
    }

    public ImageView[] getIndicators() {
        return this.a;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z || i > 0) {
            i = (!z || i > 0) ? (int) Math.ceil((double) (((float) i) / 10.0f)) : 1;
        }
        setRate(i);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public void setListener(opc opc) {
    }

    public void setRate(int i) {
        if (this.b != i) {
            this.b = i;
            ViewGroup viewGroup = (ViewGroup) findViewById(lic.view_call_rate__ll_iv_container);
            int i2 = 0;
            while (i2 < viewGroup.getChildCount()) {
                ImageView imageView = (ImageView) viewGroup.getChildAt(i2);
                i2++;
                if (i2 <= i) {
                    setEnabledIndicator(imageView);
                } else {
                    setDisabledIndicator(imageView);
                }
            }
        }
    }

    public void setTouchEnabled(boolean z) {
        this.c.setEnabled(z);
    }
}
