package ru.ok.onechat.reactions.ui.animation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ok/onechat/reactions/ui/animation/AddReactionAnimationView;", "Landroid/widget/FrameLayout;", "", "loopAnimation", "", "setLoopAnimation", "(Z)V", "", "count", "setLottieMaxCount", "(I)V", "offsetDy", "setScrollOffset", "Lnb8;", "b", "Lnb8;", "getLottieReactAnimationView$reactions_release", "()Lnb8;", "lottieReactAnimationView", "reactions_release"}, k = 1, mv = {2, 0, 0})
public final class AddReactionAnimationView extends FrameLayout {
    public final uh4 a;
    public final nb8 b;

    /* JADX WARNING: type inference failed for: r1v0, types: [uh4, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r2v1, types: [nb8, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    @JvmOverloads
    public AddReactionAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ? frameLayout = new FrameLayout(context, attributeSet, 0);
        frameLayout.setClipChildren(false);
        frameLayout.setId(kic.one_chat_react_default_react_anim_view);
        this.a = frameLayout;
        ? frameLayout2 = new FrameLayout(context, attributeSet, 0);
        frameLayout2.a = 3;
        frameLayout2.setClipChildren(false);
        frameLayout2.setId(kic.one_chat_react_lottie_react_anim_view);
        this.b = frameLayout2;
        setBackgroundColor(0);
        setClipChildren(false);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
    }

    public final nb8 getLottieReactAnimationView$reactions_release() {
        return this.b;
    }

    public final void setLoopAnimation(boolean z) {
        this.a.setLoopAnimation(z);
        this.b.setLoopAnimation(z);
    }

    public final void setLottieMaxCount(int i) {
        this.b.setLottieMaxCount(i);
    }

    public final void setScrollOffset(int i) {
        this.a.setScrollOffset(i);
        this.b.setScrollOffset(i);
    }
}
