package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.collections.CollectionsKt;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* renamed from: d75  reason: default package */
public final class d75 extends AnimatorListenerAdapter {
    public final /* synthetic */ EnhancedAnimatedVectorDrawable a;

    public d75(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable) {
        this.a = enhancedAnimatedVectorDrawable;
    }

    public final void onAnimationEnd(Animator animator) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.a;
        for (ye a2 : CollectionsKt.toList(enhancedAnimatedVectorDrawable.animationCallbacks)) {
            a2.a(enhancedAnimatedVectorDrawable);
        }
    }

    public final void onAnimationStart(Animator animator) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.a;
        for (ye b : CollectionsKt.toList(enhancedAnimatedVectorDrawable.animationCallbacks)) {
            b.b(enhancedAnimatedVectorDrawable);
        }
    }
}
