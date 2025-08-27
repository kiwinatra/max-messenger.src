package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* renamed from: o5f  reason: default package */
public final class o5f extends Drawable {
    public final djf a;
    public final String b;
    public final int c;
    public final int d;
    public final m5f e;

    public o5f(String str, int i, int i2, m5f m5f, djf djf) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = m5f;
        this.a = djf;
    }

    /* renamed from: a */
    public final o5f mutate() {
        djf djf = this.a;
        djf.getClass();
        Paint paint = new Paint(djf.g);
        djf djf2 = new djf(djf.a, djf.b, djf.c);
        djf2.g = paint;
        djf2.j = true;
        return new o5f(this.b, this.c, this.d, this.e, djf2);
    }

    public final void draw(Canvas canvas) {
        djf djf = this.a;
        if (djf.j) {
            float f = djf.f;
            int save = canvas.save();
            canvas.scale(f, f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
            try {
                canvas.drawPaint(djf.g);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            z68.p(djf.class.getSimpleName(), "error: cant' render svg, incorrect data!");
        }
    }

    public final int getIntrinsicHeight() {
        return this.a.e;
    }

    public final int getIntrinsicWidth() {
        return this.a.d;
    }

    public final int getOpacity() {
        return -2;
    }

    public final void setAlpha(int i) {
        this.a.g.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.g.setColorFilter(colorFilter);
    }

    public o5f(String str, int i, int i2) {
        m5f m5f = m5f.a;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = m5f;
        if (n5f.$EnumSwitchMapping$0[0] == 1) {
            djf djf = new djf(str, i, i2);
            Unit unit = (Unit) djf.h.getValue();
            this.a = djf;
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}
