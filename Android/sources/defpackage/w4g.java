package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: w4g  reason: default package */
public final class w4g extends fbf implements i9g {
    public final AccelerateDecelerateInterpolator X = new AccelerateDecelerateInterpolator();
    public Function2 v;
    public Function2 w;
    public o00 x;
    public Long y;
    public ObjectAnimator z;

    public w4g() {
        super((Function1) new duc(28));
    }

    public final void a() {
        Lazy lazy = (Lazy) this.c;
        if (lazy.isInitialized()) {
            h9g h9g = (h9g) lazy.getValue();
            ObjectAnimator objectAnimator = this.z;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            h9g.setAlpha(c44.DEFAULT_ASPECT_RATIO);
            h9g.setVisibility(8);
            h9g.b();
        }
    }

    public final void m(f9g f9g, t87 t87, long j, boolean z2) {
        ObjectAnimator objectAnimator;
        this.y = Long.valueOf(j);
        this.x = t87;
        ((h9g) Q()).a(f9g);
        h9g h9g = (h9g) Q();
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup == null) {
            viewGroup = null;
        }
        float[] fArr = ((r89) viewGroup.getBackground()).q;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        if (z2) {
            copyOf[0] = 0.0f;
            copyOf[1] = 0.0f;
            copyOf[2] = 0.0f;
            copyOf[3] = 0.0f;
        }
        h9g.setCorners(copyOf);
        ct.G(Q(), 300, new dte(7, this));
        ((h9g) Q()).setOnLongClickListener(new z20(19, this));
        u();
        if (((h9g) Q()).getAlpha() < 1.0f && ((objectAnimator = this.z) == null || !objectAnimator.isRunning())) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(Q(), View.ALPHA, new float[]{((h9g) Q()).getAlpha(), 1.0f});
            ofFloat.setDuration(500);
            ofFloat.setInterpolator(this.X);
            ofFloat.start();
            this.z = ofFloat;
        }
        View Q = Q();
        if (!Q.isAttachedToWindow()) {
            h9g h9g2 = (h9g) Q();
            if (h9g2.b != null && h9g2.getChildCount() > 0) {
                a();
                return;
            }
            return;
        }
        Q.addOnAttachStateChangeListener(new p50(12, Q, this));
    }

    public final boolean o() {
        return y7e.L((Lazy) this.c);
    }

    public final boolean r() {
        Lazy lazy = (Lazy) this.c;
        if (lazy.isInitialized()) {
            h9g h9g = (h9g) lazy.getValue();
            return h9g.b != null && h9g.getChildCount() > 0;
        }
    }

    public final void setVideoClickListener(Function2 function2) {
        this.v = function2;
    }

    public final void setVideoLongClickListener(Function2 function2) {
        this.w = function2;
    }
}
