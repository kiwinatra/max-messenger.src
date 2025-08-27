package defpackage;

import android.graphics.drawable.Drawable;
import one.me.rlottie.RLottieDrawable;

/* renamed from: zk  reason: default package */
public final class zk implements RLottieDrawable.DrawableLoadListener {
    public final /* synthetic */ cl a;
    public final /* synthetic */ String b;

    public zk(cl clVar, String str) {
        this.a = clVar;
        this.b = str;
    }

    public final void onError(Throwable th) {
        cl clVar = this.a;
        z68.f(clVar.y, "Animoji lottie download. Fail", th);
        String str = this.b;
        if (str == null || str.length() == 0) {
            clVar.e(xk.a);
        } else {
            clVar.c(str);
        }
        RLottieDrawable rLottieDrawable = clVar.v0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback((Drawable.Callback) null);
        }
        clVar.v0 = null;
    }

    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        String str = this.a.y;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            String currentUrl = rLottieDrawable.getCurrentUrl();
            a67.d(w78, str, "Animoji lottie download. Success, url:" + currentUrl + ", class: " + rLottieDrawable, (Throwable) null);
        }
        rLottieDrawable.setCallback(this.a.z);
        cl clVar = this.a;
        clVar.v0 = rLottieDrawable;
        clVar.e(xk.c);
        if (!rLottieDrawable.isRunning() && e14.f(this.a.w0)) {
            rLottieDrawable.start();
        }
        if (rLottieDrawable.getBounds().isEmpty() && !this.a.getBounds().isEmpty()) {
            rLottieDrawable.setBounds(this.a.getBounds());
        }
        rLottieDrawable.invalidateInternal();
        rLottieDrawable.removeDrawableLoadListener(this);
    }
}
