package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* renamed from: uqc  reason: default package */
public final class uqc implements RLottieDrawable.OnAllFramesRenderedListener {
    public boolean a;
    public final /* synthetic */ vqc b;
    public final /* synthetic */ RLottieImageView c;

    public uqc(vqc vqc, RLottieImageView rLottieImageView) {
        this.b = vqc;
        this.c = rLottieImageView;
    }

    public final void onAllFramesRendered(RLottieDrawable rLottieDrawable, boolean z) {
        vqc vqc = this.b;
        String str = vqc.a;
        boolean z2 = this.a;
        z68.c(str, "Reaction effect. OnAllFramesRendered, called:" + z2, new Object[0]);
        if (!this.a) {
            vqc.post(new x55((Object) this, (Object) vqc, (Object) this.c, 25));
        }
    }
}
