package defpackage;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.JvmOverloads;

/* renamed from: uh  reason: default package */
public abstract class uh extends ey3 {
    public boolean X;
    public long o;
    public boolean v;
    public boolean w;
    public boolean x;
    public Animator y;
    public sh z;

    @JvmOverloads
    public uh() {
        this(0, 3);
    }

    public final void a() {
        this.w = true;
        Animator animator = this.y;
        if (animator != null) {
            animator.end();
            return;
        }
        sh shVar = this.z;
        if (shVar != null) {
            shVar.a();
        }
    }

    public final boolean d() {
        return this.X;
    }

    public final void f() {
        this.v = true;
        Animator animator = this.y;
        if (animator != null) {
            animator.cancel();
            return;
        }
        sh shVar = this.z;
        if (shVar != null) {
            shVar.a();
        }
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z2, cy3 cy3) {
        boolean z3 = view2 != null && view2.getParent() == null;
        if (z3) {
            if (z2 || view == null) {
                viewGroup.addView(view2);
            } else if (view2.getParent() == null) {
                viewGroup.addView(view2, viewGroup.indexOfChild(view));
            }
            if (view2.getWidth() <= 0 && view2.getHeight() <= 0) {
                this.z = new sh(this, cy3, view, view2, viewGroup, z2);
                view2.getViewTreeObserver().addOnPreDrawListener(this.z);
                return;
            }
        }
        m(viewGroup, view, view2, z2, z3, cy3);
    }

    public final void h(Bundle bundle) {
        this.o = bundle.getLong("AnimatorChangeHandler.duration");
        this.X = bundle.getBoolean("AnimatorChangeHandler.removesFromViewOnPush");
    }

    public final void i(Bundle bundle) {
        bundle.putLong("AnimatorChangeHandler.duration", this.o);
        bundle.putBoolean("AnimatorChangeHandler.removesFromViewOnPush", this.X);
    }

    public final void k(cy3 cy3, Animator.AnimatorListener animatorListener) {
        if (!this.x) {
            this.x = true;
            cy3.n();
        }
        Animator animator = this.y;
        if (animator != null) {
            if (animatorListener != null) {
                animator.removeListener(animatorListener);
            }
            this.y.cancel();
            this.y = null;
        }
        this.z = null;
    }

    public abstract Animator l(ViewGroup viewGroup, View view, View view2, boolean z2, boolean z3);

    public final void m(ViewGroup viewGroup, View view, View view2, boolean z2, boolean z3, cy3 cy3) {
        if (this.v) {
            k(cy3, (Animator.AnimatorListener) null);
        } else if (this.w) {
            if (view != null && (!z2 || this.X)) {
                viewGroup.removeView(view);
            }
            k(cy3, (Animator.AnimatorListener) null);
            if (z2 && view != null) {
                n(view);
            }
        } else {
            Animator l = l(viewGroup, view, view2, z2, z3);
            this.y = l;
            long j = this.o;
            if (j > 0) {
                l.setDuration(j);
            }
            this.y.addListener(new th(this, cy3, view, view2, viewGroup, z2));
            this.y.start();
        }
    }

    public abstract void n(View view);

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uh(long j, int i) {
        this((i & 1) != 0 ? -1 : j, true);
    }

    public uh(long j, boolean z2) {
        this.o = j;
        this.X = z2;
    }

    public uh(int i) {
        this(-1, true);
    }
}
