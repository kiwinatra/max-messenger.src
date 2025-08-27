package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ChatMsgSearchResultView extends ConstraintLayout implements phf {
    public static final /* synthetic */ int J0 = 0;
    public final TextView E0 = ((TextView) findViewById(lic.chat_msg_search_result_view__result));
    public final ImageView F0;
    public final ImageView G0;
    public final ProgressBar H0;
    public final View I0;

    public ChatMsgSearchResultView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, ujc.chat_msg_search_result_view, this);
        ImageView imageView = (ImageView) findViewById(lic.chat_msg_search_result_view__next);
        this.F0 = imageView;
        ct.G(imageView, 100, new x4(23, (Object) this));
        ImageView imageView2 = (ImageView) findViewById(lic.chat_msg_search_result_view__prev);
        this.G0 = imageView2;
        ct.G(imageView2, 100, new x4(23, (Object) this));
        this.H0 = (ProgressBar) findViewById(lic.chat_msg_search_result_view__pb_loading);
        this.I0 = findViewById(lic.chat_msg_search_result_view_next_prev_separator);
        c();
    }

    public final void c() {
        js9 js9 = fu4.k;
        k2b f = js9.e(getContext()).f();
        setBackgroundColor(f.a().f().a.a);
        ImageView imageView = this.F0;
        boolean isEnabled = imageView.isEnabled();
        boolean z = !isEnabled;
        k2b f2 = js9.e(getContext()).f();
        imageView.setColorFilter(z ? f2.b().b.f : f2.getIcon().f);
        imageView.setEnabled(isEnabled);
        imageView.setVisibility(0);
        ImageView imageView2 = this.G0;
        boolean isEnabled2 = imageView2.isEnabled();
        boolean z2 = !isEnabled2;
        k2b f3 = js9.e(getContext()).f();
        imageView2.setColorFilter(z2 ? f3.b().b.f : f3.getIcon().f);
        imageView2.setEnabled(isEnabled2);
        imageView2.setVisibility(0);
        f.e().getClass();
        iq.b0(this.H0, -16745729);
        ogf ogf = puf.k;
        uy4 uy4 = uy4.b;
        TextView textView = this.E0;
        ogf.b(textView, uy4);
        textView.setTextColor(f.getText().g);
        this.I0.setBackgroundColor(f.getIcon().g);
    }

    public final void onThemeChanged(k2b k2b) {
        c();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
