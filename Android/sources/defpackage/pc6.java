package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: pc6  reason: default package */
public final class pc6 extends AnimationSet implements Runnable {
    public final ViewGroup a;
    public final View b;
    public boolean c;
    public boolean o;
    public boolean v = true;

    public pc6(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.a = viewGroup;
        this.b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j, Transformation transformation) {
        this.v = true;
        if (this.c) {
            return !this.o;
        }
        if (!super.getTransformation(j, transformation)) {
            this.c = true;
            u3b.a(this.a, this);
        }
        return true;
    }

    public final void run() {
        boolean z = this.c;
        ViewGroup viewGroup = this.a;
        if (z || !this.v) {
            viewGroup.endViewTransition(this.b);
            this.o = true;
            return;
        }
        this.v = false;
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.v = true;
        if (this.c) {
            return !this.o;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.c = true;
            u3b.a(this.a, this);
        }
        return true;
    }
}
