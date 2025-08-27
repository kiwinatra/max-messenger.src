package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: cg  reason: default package */
public final class cg {
    public static final p3a c = new p3a(4);
    public final Context a;
    public final Resources b;

    public cg(Context context) {
        this.a = context;
        this.b = context.getResources();
    }

    public static boolean c(Animator animator) {
        String str = null;
        AnimatorSet animatorSet = animator instanceof AnimatorSet ? (AnimatorSet) animator : null;
        if (animatorSet != null) {
            ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
            if ((childAnimations instanceof Collection) && childAnimations.isEmpty()) {
                return false;
            }
            for (Animator animator2 : childAnimations) {
                ObjectAnimator objectAnimator = animator2 instanceof ObjectAnimator ? (ObjectAnimator) animator2 : null;
                if (Boolean.valueOf(Intrinsics.areEqual((Object) objectAnimator != null ? objectAnimator.getPropertyName() : null, (Object) "pathData")).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        ObjectAnimator objectAnimator2 = animator instanceof ObjectAnimator ? (ObjectAnimator) animator : null;
        if (objectAnimator2 != null) {
            str = objectAnimator2.getPropertyName();
        }
        return Boolean.valueOf(Intrinsics.areEqual((Object) str, (Object) "pathData")).booleanValue();
    }

    public final Animator a(int i) {
        yh yhVar = new yh(this.a);
        p3a p3a = yh.c;
        Animator animator = (Animator) ((LruCache) p3a.a).get(Integer.valueOf(i));
        if (animator != null) {
            return animator.clone();
        }
        Animator a2 = yhVar.a(yhVar.b.getAnimation(i), (AnimatorSet) null, 0);
        if (a2 != null) {
            ((LruCache) p3a.a).put(Integer.valueOf(i), a2.clone());
            return a2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final EnhancedVectorDrawable b(XmlResourceParser xmlResourceParser) {
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i = 0;
        while (true) {
            if (i >= attributeCount) {
                break;
            } else if (Intrinsics.areEqual((Object) xmlResourceParser.getAttributeName(i), (Object) "drawable")) {
                int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
                if (attributeResourceValue != 0) {
                    return new EnhancedVectorDrawable(this.b, attributeResourceValue);
                }
            } else {
                i++;
            }
        }
        throw new IllegalStateException();
    }
}
