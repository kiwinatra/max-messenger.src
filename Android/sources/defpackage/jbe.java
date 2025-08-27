package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.JvmOverloads;

/* renamed from: jbe  reason: default package */
public final class jbe extends ey3 implements View.OnAttachStateChangeListener {
    public boolean o;
    public final boolean v;
    public boolean w;
    public ViewGroup x;
    public cy3 y;

    @JvmOverloads
    public jbe() {
        this(true);
    }

    public final void a() {
        cy3 cy3 = this.y;
        if (cy3 != null) {
            cy3.n();
        }
        this.y = null;
        ViewGroup viewGroup = this.x;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this);
        }
        this.x = null;
    }

    public final ey3 b() {
        return new jbe(this.o);
    }

    public final boolean d() {
        return this.o;
    }

    public final boolean e() {
        return this.v;
    }

    public final void f() {
        this.w = true;
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, cy3 cy3) {
        if (!this.w) {
            if (view != null && (!z || this.o)) {
                viewGroup.removeView(view);
            }
            if (view2 != null && view2.getParent() == null) {
                viewGroup.addView(view2);
            }
            if (viewGroup.getWindowToken() != null) {
                cy3.n();
                return;
            }
            this.y = cy3;
            this.x = viewGroup;
            viewGroup.addOnAttachStateChangeListener(this);
        }
    }

    public final void h(Bundle bundle) {
        this.o = bundle.getBoolean("SimpleSwapChangeHandler.removesFromViewOnPush");
    }

    public final void i(Bundle bundle) {
        bundle.putBoolean("SimpleSwapChangeHandler.removesFromViewOnPush", this.o);
    }

    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        cy3 cy3 = this.y;
        if (cy3 != null) {
            cy3.n();
        }
        this.y = null;
        ViewGroup viewGroup = this.x;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this);
        }
        this.x = null;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public jbe(boolean z) {
        this.o = z;
        this.v = true;
    }
}
