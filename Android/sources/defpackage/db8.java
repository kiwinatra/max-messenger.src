package defpackage;

import kotlin.jvm.internal.Intrinsics;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;

/* renamed from: db8  reason: default package */
public final class db8 extends RLottieImageView implements RLottieDrawable.OnNextFrameRenderedListener, RLottieDrawable.DrawableLoadListener, fb8 {
    public bb8 v0;
    public String x;
    public boolean y;
    public cb8 z;

    public final boolean a(int i, int i2, String str) {
        if (str == null || str.length() == 0) {
            RLottieImageViewUtils.release(this);
            this.x = null;
            return true;
        }
        String str2 = this.x;
        if (str2 != null && Intrinsics.areEqual((Object) str2, (Object) str)) {
            return false;
        }
        this.y = true;
        this.x = str;
        RLottieDrawable create = RLottieFactory.create(new RLottieFactory.Config.Builder().setAutoStart(true).setAutoRepeat(true).setWay(((RLottieFactory.Way.Url.Builder) new RLottieFactory.Way.Url.Builder().setUrl(str).setSize(i, i2)).setNetworkFetchEnabled(true).build()).build());
        create.addDrawableLoadListener(this);
        create.addOnNextFrameRenderedListener(this);
        RLottieImageViewUtils.setLottieDrawable(this, create);
        return true;
    }

    public final void onError(Throwable th) {
        bb8 bb8 = this.v0;
        if (bb8 != null) {
            z68.f(((ob8) bb8).a.getClass().getName(), "lottie set animation failed: ", th);
        }
    }

    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        z68.c(db8.class.getName(), "onLoaded %s", rLottieDrawable);
    }

    public final void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i) {
        if (this.y) {
            cb8 cb8 = this.z;
            if (cb8 != null) {
                cb8.b();
            }
            this.y = false;
        }
    }

    public final void setFailureListener(bb8 bb8) {
        this.v0 = bb8;
    }

    public final void setOnFirstFrameListener(cb8 cb8) {
        this.z = cb8;
        this.y = true;
    }
}
