package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: n7a  reason: default package */
public final class n7a extends OneMeDraweeView implements phf {
    public boolean A0 = true;
    public final Lazy B0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new c28(17, this));

    public n7a(Context context) {
        super(context);
        setClipToOutline(true);
        tp6 tp6 = new tp6(getResources());
        tp6.d = getShimmerDrawable();
        b9d b9d = new b9d();
        b9d.b = true;
        tp6.p = b9d;
        setHierarchy(tp6.a());
    }

    private final m7a getShimmerDrawable() {
        return (m7a) this.B0.getValue();
    }

    public static c7e q(k2b k2b) {
        p3a p3a = new p3a(6);
        c7e c7e = (c7e) p3a.a;
        c7e.k = false;
        c7e.i = c44.DEFAULT_ASPECT_RATIO;
        p3a.x(k2b.c().j);
        c7e.d = k2b.c().i;
        p3a.w();
        p3a.z(MathKt.roundToInt(((float) 64) * vo4.c().getDisplayMetrics().density));
        return p3a.q();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClickable(!this.A0);
        if (!this.A0) {
            getShimmerDrawable().c();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.A0) {
            getShimmerDrawable().d();
        }
    }

    public final void onThemeChanged(k2b k2b) {
        getShimmerDrawable().b(q(k2b));
    }

    public final void p(k97 k97, Animatable animatable) {
        this.A0 = false;
        getShimmerDrawable().d();
        setClickable(!this.A0);
    }
}
