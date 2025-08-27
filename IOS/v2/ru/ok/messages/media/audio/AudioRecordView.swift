package ru.ok.messages.media.audio;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;

public class AudioRecordView extends ConstraintLayout implements phf {
    public float E0 = 1.0f;
    public x60 F0;
    public final TextView G0;
    public final TextView H0;
    public final TextView I0;
    public final ImageView J0;
    public final View K0;
    public final View L0;
    public final View M0;
    public final View N0;
    public final ImageView O0;
    public final View P0;
    public final boolean Q0;
    public final ch R0;

    public AudioRecordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ct.b(this);
        if (ct.y(getContext())) {
            this.Q0 = true;
        }
        getContext();
        this.R0 = ((qra) ym.e()).d();
        LayoutInflater.from(getContext()).inflate(ujc.view_audio_record, this, true);
        this.G0 = (TextView) findViewById(lic.view_audio_record__tv_duration);
        this.H0 = (TextView) findViewById(lic.view_audio_record__tv_swipe_cancel);
        this.J0 = (ImageView) findViewById(lic.frg_chat__iv_icon);
        TextView textView = (TextView) findViewById(lic.view_audio_record__tv_click_cancel);
        this.I0 = textView;
        this.K0 = findViewById(lic.view_audio_record__duration_panel);
        View findViewById = findViewById(lic.view_audio_record__static_circle);
        this.L0 = findViewById;
        this.M0 = findViewById(lic.view_audio_record__audio_circle);
        View findViewById2 = findViewById(lic.view_audio_record__slide_panel);
        this.N0 = findViewById2;
        ImageView imageView = (ImageView) findViewById(lic.view_audio_record__im_arrow);
        this.O0 = imageView;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
        this.P0 = findViewById(lic.view_audio_record__root_panel);
        y64.n(findViewById2, new v60(this, 0));
        y64.n(findViewById, new v60(this, 1));
        y64.n(textView, new v60(this, 2));
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    private int getStaticCircleSize() {
        int width = this.L0.getWidth();
        return width == 0 ? getResources().getDimensionPixelSize(ydc.audio_record_static_circle_size) : width;
    }

    public final void L() {
        View view = this.P0;
        view.clearAnimation();
        this.J0.clearAnimation();
        this.L0.clearAnimation();
        View view2 = this.M0;
        view2.clearAnimation();
        View view3 = this.N0;
        view3.clearAnimation();
        ImageView imageView = this.O0;
        imageView.clearAnimation();
        view2.setVisibility(8);
        float width = (float) view.getWidth();
        float width2 = (float) view3.getWidth();
        if (width2 > c44.DEFAULT_ASPECT_RATIO) {
            view3.setX((width - width2) / 2.0f);
        }
        this.E0 = 1.0f;
        view3.setAlpha(1.0f);
        imageView.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
    }

    public final TranslateAnimation M(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, -1.0f, 1, c44.DEFAULT_ASPECT_RATIO, 0, c44.DEFAULT_ASPECT_RATIO, 0, c44.DEFAULT_ASPECT_RATIO);
        ch chVar = this.R0;
        translateAnimation.setDuration(chVar.a.b());
        translateAnimation.setInterpolator(chVar.a.d());
        translateAnimation.setAnimationListener(new wg(view, 5));
        view.setAnimation(translateAnimation);
        return translateAnimation;
    }

    public final TranslateAnimation N(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, c44.DEFAULT_ASPECT_RATIO, 0, c44.DEFAULT_ASPECT_RATIO, 0, c44.DEFAULT_ASPECT_RATIO);
        ch chVar = this.R0;
        translateAnimation.setDuration(chVar.a.b());
        translateAnimation.setInterpolator(chVar.a.d());
        translateAnimation.setAnimationListener(new wg(view, 4));
        view.setAnimation(translateAnimation);
        return translateAnimation;
    }

    public final void onThemeChanged(k2b k2b) {
        zqg f = fu4.k.e(getContext()).f().a().f();
        ogf ogf = puf.k;
        TextView textView = this.G0;
        ogf.b(textView, uy4.b);
        textView.setTextColor(k2b.getText().e);
        this.J0.setColorFilter(k2b.getIcon().b);
        k2b.e().getClass();
        this.L0.setBackground(i8b.K(-16745729, (Integer) null, (Integer) null));
        k2b.e().getClass();
        Lazy lazy = scf.b0;
        this.M0.setBackground(i8b.K(Integer.valueOf(j4b.l0(0.2f, -16745729)), (Integer) null, (Integer) null));
        iq.a0(this.O0.getDrawable(), k2b.getText().f);
        ogf ogf2 = puf.o;
        TextView textView2 = this.H0;
        ogf2.b(textView2, uy4.b);
        textView2.setTextColor(k2b.getText().f);
        TextView textView3 = this.I0;
        ogf2.b(textView3, uy4.b);
        textView3.setTextColor(k2b.getText().b);
        this.P0.setBackgroundColor(f.a.a);
    }

    public void setListener(x60 x60) {
        this.F0 = x60;
    }
}
