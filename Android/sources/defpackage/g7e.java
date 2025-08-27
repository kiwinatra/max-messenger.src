package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.math.MathKt;

/* renamed from: g7e  reason: default package */
public final class g7e extends FrameLayout {
    public final Paint a = new Paint();
    public final f7e b;
    public boolean c;

    public g7e(Context context) {
        super(context, (AttributeSet) null, 0);
        f7e f7e = new f7e();
        this.b = f7e;
        this.c = true;
        setWillNotDraw(false);
        f7e.setCallback(this);
        p3a p3a = new p3a(6);
        c7e c7e = (c7e) p3a.a;
        c7e.k = false;
        c7e.i = c44.DEFAULT_ASPECT_RATIO;
        js9 js9 = fu4.k;
        p3a.x(js9.e(getContext()).f().getText().e);
        c7e.d = js9.e(getContext()).f().e().a;
        p3a.w();
        p3a.z(MathKt.roundToInt(((float) 360) * vo4.c().getDisplayMetrics().density));
        a(p3a.q());
    }

    public final void a(c7e c7e) {
        this.b.b(c7e);
        if (c7e.j) {
            setLayerType(2, this.a);
        } else {
            setLayerType(0, (Paint) null);
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.d();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }
}
