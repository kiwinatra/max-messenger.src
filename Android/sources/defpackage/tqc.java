package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* renamed from: tqc  reason: default package */
public final class tqc implements RLottieDrawable.DrawableLoadListener {
    public boolean a;
    public final /* synthetic */ vqc b;
    public final /* synthetic */ RLottieImageView c;

    public tqc(vqc vqc, RLottieImageView rLottieImageView) {
        this.b = vqc;
        this.c = rLottieImageView;
    }

    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        String str = this.b.a;
        boolean z = this.a;
        z68.c(str, "Reaction effect. OnLoaded, called:" + z, new Object[0]);
        if (!this.a) {
            this.a = true;
            this.c.playAnimation();
        }
    }
}
