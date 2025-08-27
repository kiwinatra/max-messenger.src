package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: m9g  reason: default package */
public final class m9g implements View.OnAttachStateChangeListener {
    public boolean a;
    public boolean b;
    public boolean c;
    public int o;
    public xv1 v;
    public zp0 w;

    public static View a(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() == 0) {
            return viewGroup;
        }
        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        return childAt instanceof ViewGroup ? a((ViewGroup) childAt) : childAt;
    }

    public final void b() {
        if (this.a && this.b && !this.c && this.o != 3) {
            this.o = 3;
            this.v.q();
        }
    }

    public final void c(boolean z) {
        boolean z2 = this.o == 2;
        if (z) {
            this.o = 2;
        } else {
            this.o = 1;
        }
        xv1 xv1 = this.v;
        if (!z2 || z) {
            xv1.r(z);
        } else {
            xv1.v();
        }
    }

    public final void onViewAttachedToWindow(View view) {
        if (!this.a) {
            this.a = true;
            bpa bpa = new bpa(13, this);
            if (!(view instanceof ViewGroup)) {
                this.b = true;
                b();
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                this.b = true;
                b();
                return;
            }
            this.w = new zp0(this, bpa);
            a(viewGroup).addOnAttachStateChangeListener(this.w);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        this.a = false;
        if (this.b) {
            this.b = false;
            c(false);
        }
    }
}
