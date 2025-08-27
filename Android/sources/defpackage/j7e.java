package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.math.MathKt;

/* renamed from: j7e  reason: default package */
public final class j7e extends TextView {
    public final Paint a;
    public final f7e b;
    public boolean c = true;

    public j7e(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint();
        this.a = paint;
        f7e f7e = new f7e();
        this.b = f7e;
        setWillNotDraw(false);
        f7e.setCallback(this);
        p3a p3a = new p3a(6);
        c7e c7e = (c7e) p3a.a;
        c7e.k = false;
        c7e.i = c44.DEFAULT_ASPECT_RATIO;
        js9 js9 = fu4.k;
        p3a.x(js9.e(getContext()).f().getText().g);
        js9.e(getContext()).f().getText().getClass();
        c7e.d = -1;
        p3a.w();
        p3a.z(MathKt.roundToInt(((float) 360) * vo4.c().getDisplayMetrics().density));
        c7e q = p3a.q();
        f7e.b(q);
        if (q.j) {
            setLayerType(2, paint);
        } else {
            setLayerType(0, (Paint) null);
        }
    }

    public final void a(boolean z) {
        f7e f7e = this.b;
        if (z) {
            this.c = true;
            if (z) {
                f7e.c();
                return;
            }
            return;
        }
        f7e.d();
        this.c = false;
        invalidate();
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
