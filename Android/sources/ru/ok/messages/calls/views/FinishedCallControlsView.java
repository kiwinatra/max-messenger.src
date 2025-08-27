package ru.ok.messages.calls.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import kotlin.Lazy;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

public class FinishedCallControlsView extends FrameLayout {
    public static final /* synthetic */ int o = 0;
    public final Button a;
    public final Button b;
    public mq4 c;

    public FinishedCallControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), getLayoutId(), this);
        if (!isInEditMode()) {
            this.b = (Button) findViewById(lic.view_finished_call_controls__btn_close);
            this.a = (Button) findViewById(lic.view_finished_call_controls__btn_quality_poll);
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            scf k0 = j4b.k0(context2);
            int dimension = ((int) getResources().getDimension(ydc.call_finished_controls_buttons_height)) / 2;
            iq.d(k0, this.a, dimension);
            iq.f(k0, this.b, dimension, 0, j4b.l0(0.5f, k0.S), 48);
            y64.n(this.b, new b5(12, this));
            y64.n(this.a, new b5(12, this));
        }
    }

    public int getLayoutId() {
        return ujc.view_finished_call_controls;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mq4 mq4 = this.c;
        if (mq4 != null && !mq4.f()) {
            this.c.dispose();
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (!isInEditMode()) {
            int defaultColor = this.b.getTextColors().getDefaultColor();
            Context context = getContext();
            Lazy lazy = scf.b0;
            int i2 = j4b.k0(context).S;
            if (i == 0 && defaultColor != i2) {
                mq4 mq4 = this.c;
                if (mq4 != null && !mq4.f()) {
                    this.c.dispose();
                }
                this.c = y64.C(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, new l40(this, i2, 10));
            }
        }
    }

    public void setListener(dp5 dp5) {
    }
}
