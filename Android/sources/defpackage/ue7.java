package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* renamed from: ue7  reason: default package */
public final class ue7 extends av4 {
    public final qv4 Z;
    public fbf v0;
    public Drawable w0;

    public ue7(Context context, nk0 nk0, qv4 qv4, fbf fbf) {
        super(context, nk0);
        this.Z = qv4;
        this.v0 = fbf;
        fbf.b = this;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        Canvas canvas2 = canvas;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas2.getClipBounds(rect)) {
            boolean z = this.c != null && Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f) == c44.DEFAULT_ASPECT_RATIO;
            nk0 nk0 = this.b;
            if (!z || (drawable = this.w0) == null) {
                canvas.save();
                qv4 qv4 = this.Z;
                Rect bounds = getBounds();
                float b = b();
                ValueAnimator valueAnimator = this.o;
                boolean z2 = valueAnimator != null && valueAnimator.isRunning();
                ValueAnimator valueAnimator2 = this.v;
                boolean z3 = valueAnimator2 != null && valueAnimator2.isRunning();
                qv4.a.a();
                qv4.a(canvas, bounds, b, z2, z3);
                int i = nk0.g;
                int i2 = this.X;
                Paint paint = this.z;
                if (i == 0) {
                    this.Z.d(canvas, paint, c44.DEFAULT_ASPECT_RATIO, 1.0f, nk0.d, i2, 0);
                } else {
                    pv4 pv4 = (pv4) ((ArrayList) this.v0.c).get(0);
                    pv4 pv42 = (pv4) a81.h(1, (ArrayList) this.v0.c);
                    qv4 qv42 = this.Z;
                    if (qv42 instanceof tv7) {
                        qv4 qv43 = qv42;
                        Canvas canvas3 = canvas;
                        Paint paint2 = paint;
                        int i3 = i2;
                        int i4 = i;
                        qv43.d(canvas3, paint2, c44.DEFAULT_ASPECT_RATIO, pv4.a, nk0.d, i3, i4);
                        this.Z.d(canvas3, paint2, pv42.b, 1.0f, nk0.d, i3, i4);
                    } else {
                        i2 = 0;
                        qv42.d(canvas, paint, pv42.b, pv4.a + 1.0f, nk0.d, 0, i);
                    }
                }
                for (int i5 = 0; i5 < ((ArrayList) this.v0.c).size(); i5++) {
                    pv4 pv43 = (pv4) ((ArrayList) this.v0.c).get(i5);
                    this.Z.c(canvas2, paint, pv43, this.X);
                    if (i5 > 0 && i > 0) {
                        this.Z.d(canvas, paint, ((pv4) ((ArrayList) this.v0.c).get(i5 - 1)).b, pv43.a, nk0.d, i2, i);
                    }
                }
                canvas.restore();
                return;
            }
            drawable.setBounds(getBounds());
            ru4.g(this.w0, nk0.c[0]);
            this.w0.draw(canvas2);
        }
    }

    public final boolean e(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean e = super.e(z, z2, z3);
        if (this.c != null && Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f) == c44.DEFAULT_ASPECT_RATIO && (drawable = this.w0) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.v0.x();
        }
        if (z && z3) {
            this.v0.d0();
        }
        return e;
    }

    public final int getIntrinsicHeight() {
        return this.Z.e();
    }

    public final int getIntrinsicWidth() {
        return this.Z.f();
    }
}
