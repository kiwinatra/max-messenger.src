package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;

/* renamed from: fze  reason: default package */
public final class fze {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final TextPaint f;
    public final Paint g;
    public final Paint h;
    public CharSequence i;
    public Layout.Alignment j;
    public Bitmap k;
    public float l;
    public int m;
    public int n;
    public float o;
    public int p;
    public float q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public float z;

    public fze(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.a = round;
        this.b = round;
        this.c = round;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z2) {
        if (z2) {
            StaticLayout staticLayout = this.E;
            StaticLayout staticLayout2 = this.F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate((float) this.G, (float) this.H);
                if (Color.alpha(this.u) > 0) {
                    Paint paint = this.g;
                    paint.setColor(this.u);
                    canvas.drawRect((float) (-this.I), c44.DEFAULT_ASPECT_RATIO, (float) (staticLayout.getWidth() + this.I), (float) staticLayout.getHeight(), paint);
                }
                int i2 = this.w;
                TextPaint textPaint = this.f;
                boolean z3 = true;
                if (i2 == 1) {
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStrokeWidth(this.a);
                    textPaint.setColor(this.v);
                    textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas);
                } else {
                    float f2 = this.b;
                    if (i2 == 2) {
                        float f3 = this.c;
                        textPaint.setShadowLayer(f2, f3, f3, this.v);
                    } else if (i2 == 3 || i2 == 4) {
                        if (i2 != 3) {
                            z3 = false;
                        }
                        int i3 = -1;
                        int i4 = z3 ? -1 : this.v;
                        if (z3) {
                            i3 = this.v;
                        }
                        float f4 = f2 / 2.0f;
                        textPaint.setColor(this.s);
                        textPaint.setStyle(Paint.Style.FILL);
                        float f5 = -f4;
                        textPaint.setShadowLayer(f2, f5, f5, i4);
                        staticLayout2.draw(canvas);
                        textPaint.setShadowLayer(f2, f4, f4, i3);
                    }
                }
                textPaint.setColor(this.s);
                textPaint.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                textPaint.setShadowLayer(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        this.J.getClass();
        this.k.getClass();
        canvas.drawBitmap(this.k, (Rect) null, this.J, this.h);
    }
}
