package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;

/* renamed from: vqc  reason: default package */
public final class vqc extends FrameLayout {
    public final String a = vqc.class.getName();
    public int b = 3;

    public vqc(Context context) {
        super(context, (AttributeSet) null, 0);
        setBackgroundColor(0);
        setClipChildren(false);
    }

    public static float c(int i, Rect rect) {
        return ((float) ((MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density) / 2) + g63.b((float) 10, vo4.c().getDisplayMetrics().density, rect.left))) - (((float) i) / 2.0f);
    }

    private final Sequence<RLottieImageView> getLotties() {
        return SequencesKt.filter(new mag(0, this), m61.X);
    }

    public final void a(long j, RLottieDrawable rLottieDrawable, Rect rect) {
        for (RLottieImageView next : SequencesKt.filter(getLotties(), new hg2(j, 8))) {
            next.stopAnimation();
            removeView(next);
        }
        int childCount = getChildCount();
        int i = this.b;
        String str = this.a;
        if (childCount >= i) {
            z68.p(str, "Reaction effect. Reached max count of lotties effects");
            return;
        }
        int intrinsicWidth = rLottieDrawable.getIntrinsicWidth();
        int intrinsicHeight = rLottieDrawable.getIntrinsicHeight();
        RLottieImageView rLottieImageView = new RLottieImageView(getContext());
        RLottieImageViewUtils.setLottieDrawable(rLottieImageView, rLottieDrawable);
        rLottieImageView.playAnimation();
        vzg.H(kic.tag_reaction_effects_view, rLottieImageView, Long.valueOf(j));
        setLayoutDirection(0);
        rLottieImageView.setLayoutParams(new FrameLayout.LayoutParams(intrinsicWidth, intrinsicHeight));
        rLottieImageView.setX(c(intrinsicWidth, rect));
        rLottieImageView.setY(((float) rect.centerY()) - (((float) intrinsicHeight) / 2.0f));
        addView(rLottieImageView);
        tqc tqc = new tqc(this, rLottieImageView);
        rLottieDrawable.addDrawableLoadListener(tqc);
        uqc uqc = new uqc(this, rLottieImageView);
        rLottieDrawable.addOnAllFramesRenderedListener(uqc);
        if (!rLottieImageView.isAttachedToWindow()) {
            z68.c(str, "onDetach", new Object[0]);
            rLottieDrawable.removeDrawableLoadListener(tqc);
            rLottieDrawable.removeOnAllFramesRenderedListener(uqc);
            return;
        }
        rLottieImageView.addOnAttachStateChangeListener(new sqc(rLottieImageView, this, rLottieDrawable, tqc, uqc));
    }

    public final void b() {
        for (RLottieImageView next : getLotties()) {
            next.stopAnimation();
            removeView(next);
        }
    }

    public final void d(long j, Rect rect) {
        RLottieImageView rLottieImageView;
        Iterator<RLottieImageView> it = getLotties().iterator();
        while (true) {
            if (!it.hasNext()) {
                rLottieImageView = null;
                break;
            }
            rLottieImageView = it.next();
            if (Intrinsics.areEqual(vzg.w(rLottieImageView, kic.tag_reaction_effects_view), (Object) Long.valueOf(j))) {
                break;
            }
        }
        RLottieImageView rLottieImageView2 = rLottieImageView;
        if (rLottieImageView2 != null) {
            if (!rLottieImageView2.isPlaying()) {
                z68.c(this.a, "Reaction effect. Skip move", new Object[0]);
                return;
            }
            Drawable drawable = rLottieImageView2.getDrawable();
            rLottieImageView2.setX(c(drawable.getIntrinsicWidth(), rect));
            rLottieImageView2.setY(((float) rect.centerY()) - (((float) drawable.getIntrinsicHeight()) / 2.0f));
        }
    }

    public final int getLottieMaxCount() {
        return this.b;
    }

    public final void setLottieMaxCount(int i) {
        this.b = i;
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
