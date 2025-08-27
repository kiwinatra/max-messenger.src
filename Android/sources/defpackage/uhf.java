package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: uhf  reason: default package */
public final class uhf extends Drawable {
    public final thf a;
    public final Lazy b = LazyKt.lazy(LazyThreadSafetyMode.NONE, new lce(13, this));

    public uhf(thf thf) {
        this.a = thf;
    }

    public final uhf a(float f) {
        o5f o5f;
        o5f o5f2;
        thf thf = this.a;
        shf shf = thf.a;
        shf shf2 = null;
        if (shf == null || (o5f2 = shf.a) == null) {
            o5f = null;
        } else {
            o5f = o5f2.mutate();
            o5f.a.f = f;
        }
        if (o5f != null) {
            shf.getClass();
            shf2 = new shf(o5f);
        }
        return new uhf(new thf(shf2, thf.b, thf.c));
    }

    public final void draw(Canvas canvas) {
        j1g j1g = (j1g) this.b.getValue();
        Canvas canvas2 = canvas;
        canvas2.drawRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) j1g.b.getValue());
        ArrayList arrayList = j1g.d;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                rae.w(it.next());
                throw null;
            }
        }
        shf shf = j1g.a.a;
        if (shf != null) {
            shf.a.draw(canvas);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final Drawable mutate() {
        return a(1.0f);
    }

    public final void onBoundsChange(Rect rect) {
        j1g j1g = (j1g) this.b.getValue();
        j1g.getClass();
        int width = rect.width();
        int height = rect.height();
        thf thf = j1g.a;
        rhf rhf = thf.b;
        if (rhf != null) {
            RectF rectF = new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) width, (float) height);
            float[] fArr = new float[2];
            float f = rhf.b;
            j1g.a(fArr, f, width, height);
            rectF.left = fArr[0];
            rectF.top = fArr[1];
            j1g.a(fArr, (f + 180.0f) % ((float) 360), width, height);
            rectF.right = fArr[0];
            rectF.bottom = fArr[1];
            ((Paint) j1g.b.getValue()).setShader(new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, rhf.a, (float[]) null, Shader.TileMode.CLAMP));
        }
        j1g.d.clear();
        Iterator it = thf.c.iterator();
        if (it.hasNext()) {
            rae.w(it.next());
            throw null;
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
