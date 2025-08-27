package ru.ok.messages.calls.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;

public class ChatCallView extends ConstraintLayout {
    public static final /* synthetic */ int H0 = 0;
    public ro4 E0;
    public TextView F0;
    public ImageView G0;

    public ChatCallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        L();
    }

    public final void L() {
        getContext();
        this.E0 = ro4.b();
        LayoutInflater.from(getContext()).inflate(ujc.view_chat_call, this);
        setLayoutParams(new fj3(-1, getResources().getDimensionPixelOffset(ydc.chat_top_panel_height)));
        this.F0 = (TextView) findViewById(lic.view_chat_call__tv_call);
        ImageView imageView = (ImageView) findViewById(lic.view_chat_call__iv_call);
        this.G0 = imageView;
        y64.n(imageView, new b5(6, this));
        y64.n(this, new b5(6, this));
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        this.F0.setTextColor(k0.G);
        this.G0.setColorFilter(k0.x, PorterDuff.Mode.SRC_IN);
        setBackground(i8b.f(k0.y, k0.j, 0, this.E0.d));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setCallDurationProvider(wl1 wl1) {
    }

    public void setCallTitle(long j) {
        String str;
        if (j <= 0) {
            this.F0.setText(qad.T);
            return;
        }
        TextView textView = this.F0;
        Resources resources = getResources();
        int i = qad.U;
        Context context = getContext();
        String[] strArr = ghf.c;
        long days = TimeUnit.MILLISECONDS.toDays(j);
        if (days >= 1) {
            str = j4b.v(zjc.tt_dates_days, (int) days, context);
        } else {
            str = b0h.c(j);
        }
        textView.setText(resources.getString(i, new Object[]{str}));
    }

    public void setListener(f42 f42) {
    }
}
