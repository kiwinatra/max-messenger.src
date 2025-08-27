package ru.ok.messages.calls.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Locale;
import kotlin.Lazy;

public class CallDebugView extends FrameLayout {
    public final float a = -1.0f;
    public final int b = -1;
    public final int c = -1;
    public final int o = -1;
    public final AppCompatTextView v;

    public CallDebugView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        ro4 b2 = ro4.b();
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.v = appCompatTextView;
        appCompatTextView.setTextColor(-1);
        AppCompatTextView appCompatTextView2 = this.v;
        Lazy lazy = scf.b0;
        appCompatTextView2.setBackgroundColor(j4b.l0(0.5f, -16777216));
        this.v.setTextSize(13.0f);
        AppCompatTextView appCompatTextView3 = this.v;
        int i = b2.c;
        appCompatTextView3.setPadding(i, i, i, i);
        this.v.setVisibility(8);
        addView(this.v, new FrameLayout.LayoutParams(-2, -2));
        iq.u(this, b2.e);
    }

    private String getTextString() {
        return String.format(Locale.ENGLISH, "fps: %.1f \nframesReceived: %d \nframesRendered: %d \nframesDropped: %d \nid: %d", new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.o), 0L});
    }
}
