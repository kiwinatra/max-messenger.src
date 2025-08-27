package one.me.rlottie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.HashMap;
import java.util.Map;

public class RLottieImageView extends AppCompatImageView {
    public HashMap a;
    public RLottieDrawable b;
    public boolean c;
    public boolean cached;
    public boolean o;
    public boolean v;
    public boolean w;

    public RLottieImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void clearAnimationDrawable() {
        RLottieDrawable rLottieDrawable = this.b;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
        this.b = null;
        setImageDrawable((Drawable) null);
    }

    public void clearLayerColors() {
        this.a.clear();
    }

    public RLottieDrawable getAnimatedDrawable() {
        return this.b;
    }

    public ImageReceiver getImageReceiver() {
        return null;
    }

    public boolean isPlaying() {
        RLottieDrawable rLottieDrawable = this.b;
        return rLottieDrawable != null && rLottieDrawable.isRunning();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o = true;
        RLottieDrawable rLottieDrawable = this.b;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(this);
            if (this.v) {
                this.b.start();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o = false;
        RLottieDrawable rLottieDrawable = this.b;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
    }

    public void playAnimation() {
        RLottieDrawable rLottieDrawable = this.b;
        if (rLottieDrawable != null) {
            this.v = true;
            if (this.o && rLottieDrawable != null) {
                rLottieDrawable.start();
            }
        }
    }

    public void replaceColors(int[] iArr) {
        RLottieDrawable rLottieDrawable = this.b;
        if (rLottieDrawable != null) {
            rLottieDrawable.replaceColors(iArr);
        }
    }

    public void setAnimation(int i, int i2, int i3) {
        setAnimation(i, i2, i3, (int[]) null);
    }

    public void setAutoRepeat(boolean z) {
        this.c = z;
        this.w = true;
        RLottieDrawable rLottieDrawable = this.b;
        if (rLottieDrawable != null && z) {
            rLottieDrawable.setAutoRepeat(1);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof RLottieDrawable) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
            this.b = rLottieDrawable;
            if (this.w) {
                if (this.c) {
                    rLottieDrawable.setAutoRepeat(1);
                } else {
                    rLottieDrawable.setAutoRepeat(0);
                }
            }
            this.b.setMasterParent(this);
            if (this.c) {
                this.b.setAutoRepeat(1);
            }
            if (this.a != null) {
                this.b.beginApplyLayerColors();
                for (Map.Entry entry : this.a.entrySet()) {
                    this.b.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
                this.b.commitApplyLayerColors();
            }
            this.b.setAllowDecodeSingleFrame(true);
            this.v = this.b.Z0;
        } else {
            this.v = false;
        }
        super.setImageDrawable(this.b);
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        this.b = null;
    }

    public void setLayerColor(String str, int i) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, Integer.valueOf(i));
        RLottieDrawable rLottieDrawable = this.b;
        if (rLottieDrawable != null) {
            rLottieDrawable.setLayerColor(str, i);
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        RLottieDrawable rLottieDrawable = this.b;
        if (rLottieDrawable != null) {
            rLottieDrawable.setOnAnimationEndListener(runnable);
        }
    }

    public void setOnlyLastFrame(boolean z) {
    }

    public void setProgress(float f) {
        RLottieDrawable rLottieDrawable = this.b;
        if (rLottieDrawable != null) {
            rLottieDrawable.setProgress(f);
        }
    }

    public void setReverse() {
        RLottieDrawable rLottieDrawable = this.b;
        if (rLottieDrawable != null) {
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            RLottieDrawable rLottieDrawable2 = this.b;
            rLottieDrawable2.setCurrentFrame(rLottieDrawable2.getFramesCount());
            this.b.setCustomEndFrame(0);
        }
    }

    public void stopAnimation() {
        RLottieDrawable rLottieDrawable = this.b;
        if (rLottieDrawable != null) {
            this.v = false;
            if (this.o && rLottieDrawable != null) {
                rLottieDrawable.stop();
            }
        }
    }

    public RLottieImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = false;
    }

    public void setAnimation(int i, int i2, int i3, int[] iArr) {
        setAnimation(new RLottieDrawable(i, wj6.h(i, ""), a.a((float) i2), a.a((float) i3), false, iArr));
    }

    public void setAnimation(RLottieDrawable rLottieDrawable) {
        if (this.b != rLottieDrawable) {
            this.b = rLottieDrawable;
            rLottieDrawable.setMasterParent(this);
            if (this.c) {
                this.b.setAutoRepeat(1);
            }
            if (this.a != null) {
                this.b.beginApplyLayerColors();
                for (Map.Entry entry : this.a.entrySet()) {
                    this.b.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
                this.b.commitApplyLayerColors();
            }
            this.b.setAllowDecodeSingleFrame(true);
            setImageDrawable(this.b);
        }
    }
}
