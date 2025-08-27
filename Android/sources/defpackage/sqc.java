package defpackage;

import android.view.View;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* renamed from: sqc  reason: default package */
public final class sqc implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ vqc b;
    public final /* synthetic */ RLottieDrawable c;
    public final /* synthetic */ tqc o;
    public final /* synthetic */ uqc v;

    public sqc(RLottieImageView rLottieImageView, vqc vqc, RLottieDrawable rLottieDrawable, tqc tqc, uqc uqc) {
        this.a = rLottieImageView;
        this.b = vqc;
        this.c = rLottieDrawable;
        this.o = tqc;
        this.v = uqc;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        z68.c(this.b.a, "onDetach", new Object[0]);
        RLottieDrawable rLottieDrawable = this.c;
        rLottieDrawable.removeDrawableLoadListener(this.o);
        rLottieDrawable.removeOnAllFramesRenderedListener(this.v);
    }
}
