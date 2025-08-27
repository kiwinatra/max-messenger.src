package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* renamed from: pt9  reason: default package */
public final class pt9 {
    public final qae a = new qae();
    public final qae b = new qae();

    public static pt9 a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(resourceId, context);
    }

    public static pt9 b(int i, Context context) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [qt9, java.lang.Object] */
    public static pt9 c(ArrayList arrayList) {
        pt9 pt9 = new pt9();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                pt9.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = xg.b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = xg.c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = xg.d;
                }
                ? obj = new Object();
                obj.d = 0;
                obj.e = 1;
                obj.a = startDelay;
                obj.b = duration;
                obj.c = interpolator;
                obj.d = objectAnimator.getRepeatCount();
                obj.e = objectAnimator.getRepeatMode();
                pt9.a.put(propertyName, obj);
                i++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return pt9;
    }

    public final qt9 d(String str) {
        qae qae = this.a;
        if (qae.get(str) != null) {
            return (qt9) qae.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt9)) {
            return false;
        }
        return this.a.equals(((pt9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + pt9.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
