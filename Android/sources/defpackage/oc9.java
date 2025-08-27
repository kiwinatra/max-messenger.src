package defpackage;

import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* renamed from: oc9  reason: default package */
public final class oc9 extends fbf implements tc9 {
    public Function2 v;
    public Function1 w;
    public nc9 x;

    public oc9() {
        super((Function1) new wg7(20));
    }

    public final void X(View view) {
        ct.G((sc9) view, 300, new u99(1, (Object) this));
    }

    public final void e(ws0 ws0) {
        Lazy lazy = (Lazy) this.c;
        if (lazy.isInitialized()) {
            ((sc9) lazy.getValue()).b(ws0);
        }
    }

    public final void n() {
        this.x = null;
        Lazy lazy = (Lazy) this.c;
        if (lazy.isInitialized()) {
            ((sc9) lazy.getValue()).setVisibility(8);
        }
    }

    public final void setForwardClickListener(Function1 function1) {
        this.w = function1;
    }

    public final void setLink(nc9 nc9) {
        this.x = nc9;
        ViewGroup viewGroup = (ViewGroup) this.b;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        boolean z = false;
        if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
            viewGroup.addOnLayoutChangeListener(new dr0(7, this));
        } else {
            ViewGroup viewGroup3 = (ViewGroup) this.b;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            int coerceAtLeast = RangesKt.coerceAtLeast(a81.e((float) 10, vo4.c().getDisplayMetrics().density, viewGroup3.getMeasuredWidth()) - L(), 0);
            ViewGroup viewGroup4 = (ViewGroup) this.b;
            if (viewGroup4 != null) {
                viewGroup2 = viewGroup4;
            }
            b59.x(0, 0, coerceAtLeast, 0, viewGroup2, Q());
        }
        kc9 kc9 = nc9.d;
        boolean z2 = kc9 != null;
        gc9 gc9 = nc9.e;
        if (gc9 != null) {
            z = true;
        }
        if (!z || z2) {
            Layout layout = nc9.c;
            if (z && (kc9 instanceof jc9)) {
                sc9 sc9 = (sc9) Q();
                if (layout != null) {
                    sc9.h(layout, ((jc9) kc9).a, gc9);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (kc9 instanceof jc9) {
                sc9 sc92 = (sc9) Q();
                if (layout != null) {
                    sc92.i(layout, ((jc9) kc9).a);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (z && (kc9 instanceof ic9)) {
                sc9 sc93 = (sc9) Q();
                if (layout != null) {
                    sc93.f(layout, (ic9) kc9, gc9);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (kc9 instanceof ic9) {
                sc9 sc94 = (sc9) Q();
                if (layout != null) {
                    sc94.g(layout, (ic9) kc9);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (kc9 instanceof hc9) {
                sc9 sc95 = (sc9) Q();
                if (layout != null) {
                    sc95.e(layout, (hc9) kc9);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
        } else {
            ((sc9) Q()).setSingleForward(gc9);
        }
        u();
    }

    public final void setReplyClickListener(Function2 function2) {
        this.v = function2;
    }
}
