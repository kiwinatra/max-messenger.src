package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import one.me.sdk.zoom.ZoomableDraweeView;

/* renamed from: lfb  reason: default package */
public final class lfb extends ZoomableDraweeView {
    public final String E0 = lfb.class.getName();
    public final GestureDetector F0;
    public kfb G0;
    public p87 H0;
    public boolean I0;

    public lfb(Context context) {
        super(context);
        GestureDetector gestureDetector = new GestureDetector(context, new q00(19, this));
        this.F0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        tp6 tp6 = new tp6(getResources());
        tp6.l = ydd.p;
        tp6.b = 0;
        setHierarchy(tp6.a());
    }

    private final knb getControllerBuilder() {
        knb a = ld9.p.get();
        p87 p87 = this.H0;
        boolean z = false;
        if (p87 != null && p87.e) {
            z = true;
        }
        a.j = z;
        Uri uri = p87 != null ? p87.b : null;
        if (uri != null) {
            a.e = ra7.d(uri).a();
        } else {
            a.e = null;
        }
        a.k = true;
        a.l = getController();
        return a;
    }

    public final boolean getFailure() {
        return this.I0;
    }

    public final void n(Throwable th) {
        super.n(th);
        this.I0 = true;
        z68.f(this.E0, "Set photo attach failed", th);
        kfb kfb = this.G0;
        if (kfb != null) {
            kfb.A();
        }
    }

    public final void o(k97 k97) {
        super.o(k97);
        this.I0 = false;
        kfb kfb = this.G0;
        if (kfb != null) {
            kfb.i();
        }
    }

    public final void onDraw(Canvas canvas) {
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.F0.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public final void r(p87 p87, boolean z) {
        boolean z2 = !Intrinsics.areEqual((Object) p87, (Object) this.H0) || z;
        this.H0 = p87;
        this.I0 = false;
        if (z2) {
            knb controllerBuilder = getControllerBuilder();
            Uri uri = p87.g;
            if (uri != null) {
                controllerBuilder.f = ra7.d(uri).a();
            }
            qa7 qa7 = (qa7) controllerBuilder.e;
            setController(controllerBuilder.a());
        }
    }

    public final void setListener(kfb kfb) {
        this.G0 = kfb;
    }
}
