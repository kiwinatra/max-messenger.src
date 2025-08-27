package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: dff  reason: default package */
public final class dff {
    public final TextPaint a = new TextPaint(1);
    public final oz2 b = new oz2(1, this);
    public float c;
    public float d;
    public boolean e = true;
    public final WeakReference f = new WeakReference((Object) null);
    public vef g;

    public dff(cff cff) {
        this.f = new WeakReference(cff);
    }

    public final float a(String str) {
        if (!this.e) {
            return this.c;
        }
        b(str);
        return this.c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.a;
        float f2 = c44.DEFAULT_ASPECT_RATIO;
        this.c = str == null ? 0.0f : textPaint.measureText(str, 0, str.length());
        if (str != null) {
            f2 = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = f2;
        this.e = false;
    }

    public final void c(vef vef, Context context) {
        if (this.g != vef) {
            this.g = vef;
            if (vef != null) {
                TextPaint textPaint = this.a;
                oz2 oz2 = this.b;
                vef.f(context, textPaint, oz2);
                cff cff = (cff) this.f.get();
                if (cff != null) {
                    textPaint.drawableState = cff.getState();
                }
                vef.e(context, textPaint, oz2);
                this.e = true;
            }
            cff cff2 = (cff) this.f.get();
            if (cff2 != null) {
                cff2.a();
                cff2.onStateChange(cff2.getState());
            }
        }
    }
}
