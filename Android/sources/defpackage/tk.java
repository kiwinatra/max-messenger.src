package defpackage;

import one.me.rlottie.RLottieDrawable;

/* renamed from: tk  reason: default package */
public final class tk implements RLottieDrawable.DrawableLoadListener {
    public final /* synthetic */ uk a;

    public tk(uk ukVar) {
        this.a = ukVar;
    }

    public final void onError(Throwable th) {
        uk ukVar = this.a;
        ukVar.v = false;
        ukVar.a.invalidateInternal();
    }

    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        this.a.v = true;
        rLottieDrawable.invalidateInternal();
    }
}
