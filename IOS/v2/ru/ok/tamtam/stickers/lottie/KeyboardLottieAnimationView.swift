package ru.ok.tamtam.stickers.lottie;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;

@Deprecated
public class KeyboardLottieAnimationView extends RLottieImageView implements RLottieDrawable.OnNextFrameRenderedListener, RLottieDrawable.DrawableLoadListener, eb8 {
    public lq7 v0;
    public String x;
    public boolean y;
    public mq7 z;

    public KeyboardLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a(int i, int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            RLottieImageViewUtils.release(this);
            this.x = null;
            return true;
        }
        String str2 = this.x;
        if (str2 != null && str2.equals(str)) {
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
        lq7 lq7 = this.v0;
        if (lq7 != null) {
            lq7.onError(th);
        }
    }

    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        z68.c("ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView", "onLoaded %s", rLottieDrawable);
    }

    public final void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i) {
        if (this.y) {
            mq7 mq7 = this.z;
            if (mq7 != null) {
                mq7.b();
            }
            this.y = false;
        }
    }

    public void setFailureListener(lq7 lq7) {
        this.v0 = lq7;
    }

    public void setOnFirstFrameListener(mq7 mq7) {
        this.z = mq7;
        this.y = true;
    }
}
