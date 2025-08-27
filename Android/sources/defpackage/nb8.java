package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import one.me.rlottie.RLottieImageView;

/* renamed from: nb8  reason: default package */
public final class nb8 extends FrameLayout {
    public int a;

    private final Sequence<RLottieImageView> getLotties() {
        return SequencesKt.filter(new mag(0, this), m61.z);
    }

    public final int getLottieMaxCount() {
        return this.a;
    }

    public final void setLoopAnimation(boolean z) {
        for (RLottieImageView autoRepeat : getLotties()) {
            autoRepeat.setAutoRepeat(z);
        }
    }

    public final void setLottieMaxCount(int i) {
        this.a = i;
    }

    public final void setScrollOffset(int i) {
        float f = (float) i;
        z69 z69 = new z69(1, this);
        while (z69.hasNext()) {
            View view = (View) z69.next();
            view.setTranslationY(view.getTranslationY() + f);
        }
    }
}
