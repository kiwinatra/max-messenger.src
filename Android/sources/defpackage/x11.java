package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmOverloads;

/* renamed from: x11  reason: default package */
public final class x11 extends uh {
    public final n31 Y;
    public final Lazy Z;
    public final Lazy v0;
    public final Lazy w0;
    public final Lazy x0;
    public final Lazy y0;

    @JvmOverloads
    public x11() {
        this((n31) null, 3);
    }

    public static boolean o(View view) {
        return view != null && view.getId() == qqa.p0;
    }

    public final Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        boolean o = o(view2);
        Lazy lazy = this.x0;
        n31 n31 = this.Y;
        if (o && n31 == n31.b) {
            return ((w31) lazy.getValue()).l(viewGroup, view, view2, z, z2);
        }
        boolean o2 = o(view2);
        Lazy lazy2 = this.v0;
        if (o2 && n31 == n31.a) {
            return ((xg1) lazy2.getValue()).l(viewGroup, view, view2, z, z2);
        }
        Lazy lazy3 = this.Z;
        if (view != null && view.getId() == qqa.q0 && o(view2)) {
            return (AnimatorSet) lazy3.getValue();
        }
        Lazy lazy4 = this.w0;
        if ((view2 != null && view2.getId() == qqa.q0) || (view != null && view.getId() == qqa.q0)) {
            return ((gk1) lazy4.getValue()).l(viewGroup, view, view2, z, z2);
        }
        if ((view != null && view.getId() == qqa.c0) || (view2 != null && view2.getId() == qqa.c0)) {
            return (AnimatorSet) lazy3.getValue();
        }
        boolean o3 = o(view);
        Lazy lazy5 = this.y0;
        return (!o3 || !((mp1) ((dp1) lazy5.getValue())).o() || !((mp1) ((dp1) lazy5.getValue())).w()) ? (!o(view) || !((mp1) ((dp1) lazy5.getValue())).o()) ? ((mp1) ((dp1) lazy5.getValue())).o() ? ((gk1) lazy4.getValue()).l(viewGroup, view, view2, z, z2) : ((w31) lazy.getValue()).l(viewGroup, view, view2, z, z2) : ((gk1) lazy4.getValue()).l(viewGroup, view, view2, z, z2) : ((xg1) lazy2.getValue()).l(viewGroup, view, view2, z, z2);
    }

    public final void n(View view) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x11(n31 n31, int i) {
        super(0);
        n31 = (i & 1) != 0 ? n31.c : n31;
        this.Y = n31;
        v11 v11 = new v11(0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Z = LazyKt.lazy(lazyThreadSafetyMode, v11);
        this.v0 = LazyKt.lazy(lazyThreadSafetyMode, new w11(250, 0));
        this.w0 = LazyKt.lazy(lazyThreadSafetyMode, new w11(250, 1));
        this.x0 = LazyKt.lazy(lazyThreadSafetyMode, new w11(250, 2));
        this.y0 = LazyKt.lazy(lazyThreadSafetyMode, new v11(1));
    }
}
