package defpackage;

import android.view.ViewGroup;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: w7d  reason: default package */
public final class w7d implements l9d {
    public final /* synthetic */ int a;
    public final e9d b;
    public final e9d c;
    public final int o;
    public final /* synthetic */ RootController v;

    public w7d(RootController rootController, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.v = rootController;
                this.b = rootController.x();
                this.c = rootController.K();
                rootController.j0();
                ViewGroup.LayoutParams layoutParams = rootController.i0().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                this.o = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
                return;
            default:
                this.v = rootController;
                this.b = rootController.x();
                this.c = rootController.K();
                rootController.j0();
                ViewGroup.LayoutParams layoutParams2 = rootController.i0().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                this.o = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
                return;
        }
    }

    public final e9d K() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public final boolean b(CallIndicatorWidget callIndicatorWidget, boolean z) {
        switch (this.a) {
            case 0:
                return this.v.b(callIndicatorWidget, z);
            default:
                return this.v.b(callIndicatorWidget, z);
        }
    }

    public final boolean j(CallIndicatorWidget callIndicatorWidget) {
        switch (this.a) {
            case 0:
                return this.v.j(callIndicatorWidget);
            default:
                return this.v.j(callIndicatorWidget);
        }
    }

    public final int p() {
        switch (this.a) {
            case 0:
                return this.o;
            default:
                return this.o;
        }
    }

    public final boolean w(boolean z) {
        switch (this.a) {
            case 0:
                return this.v.w(z);
            default:
                return this.v.w(z);
        }
    }

    public final e9d x() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public final boolean y() {
        switch (this.a) {
            case 0:
                return this.v.y();
            default:
                return this.v.y();
        }
    }
}
