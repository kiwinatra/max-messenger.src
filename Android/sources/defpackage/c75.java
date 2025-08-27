package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;

/* renamed from: c75  reason: default package */
public final class c75 {
    public final Drawable a;
    public final AnimatorSet b;
    public final boolean c;

    public c75(Drawable drawable, AnimatorSet animatorSet) {
        this.a = drawable;
        AnimatorSet clone = animatorSet.clone();
        this.b = clone;
        this.c = clone.getTotalDuration() == -1;
    }
}
