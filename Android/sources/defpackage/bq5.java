package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.widget.TextView;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: bq5  reason: default package */
public class bq5 extends ImageSpan implements ibg, phf {
    public final vp5 a;
    public final boolean b;
    public final RectF c;
    public final RectF o;
    public final Rect v;
    public final WeakHashMap w;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bq5(Drawable drawable, vp5 vp5, int i) {
        this(drawable, (i & 2) != 0 ? vp5.b : vp5, true);
    }

    public final void c(TextView textView) {
        WeakHashMap weakHashMap = this.w;
        weakHashMap.remove(textView);
        if (weakHashMap.isEmpty()) {
            Drawable drawable = getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.stop();
            }
            getDrawable().setCallback((Drawable.Callback) null);
        }
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(f, (float) i3);
        canvas.clipRect(this.c);
        getDrawable().draw(canvas);
        canvas.restore();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.bq5) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.bq5
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            bq5 r5 = (defpackage.bq5) r5
            vp5 r1 = r5.a
            vp5 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            android.graphics.drawable.Drawable r5 = r5.getDrawable()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0022
            return r2
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq5.equals(java.lang.Object):boolean");
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        float f2;
        float f3;
        float f4;
        Drawable drawable = getDrawable();
        RectF rectF = this.c;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            float f5 = (float) (fontMetricsInt2.descent - fontMetricsInt2.ascent);
            rectF.set(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, f5, f5);
            RectF rectF2 = this.o;
            rectF2.set(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float width = rectF2.width() == -1.0f ? rectF.width() : rectF2.width();
            float height = rectF2.height() == -1.0f ? rectF.height() : rectF2.height();
            int i3 = aq5.$EnumSwitchMapping$0[this.a.ordinal()];
            Rect rect = this.v;
            if (i3 == 1) {
                rect.set((int) ((float) Math.floor((double) rectF.left)), (int) ((float) Math.floor((double) rectF.top)), (int) ((float) Math.ceil((double) rectF.right)), (int) ((float) Math.ceil((double) rectF.bottom)));
            } else if (i3 == 2) {
                float f6 = width / height;
                if (f6 > 1.0f) {
                    f2 = rectF.height() * f6;
                    f = rectF.height();
                } else {
                    f2 = rectF.width();
                    f = rectF.width() / f6;
                }
                float f7 = (float) 2;
                float width2 = ((rectF.width() - f2) / f7) + rectF.left;
                float height2 = ((rectF.height() - f) / f7) + rectF.top;
                rect.set((int) ((float) Math.floor((double) width2)), (int) ((float) Math.floor((double) height2)), (int) ((float) Math.ceil((double) (width2 + f2))), (int) ((float) Math.ceil((double) (height2 + f))));
            } else if (i3 == 3) {
                float f8 = width / height;
                if (f8 > rectF.width() / rectF.height()) {
                    f4 = rectF.width();
                    f3 = rectF.width() / f8;
                } else {
                    f3 = rectF.height();
                    f4 = rectF.height() * f8;
                }
                float f9 = (float) 2;
                float width3 = ((rectF.width() - f4) / f9) + rectF.left;
                float height3 = ((rectF.height() - f3) / f9) + rectF.top;
                rect.set((int) ((float) Math.floor((double) width3)), (int) ((float) Math.floor((double) height3)), (int) ((float) Math.ceil((double) (width3 + f4))), (int) ((float) Math.ceil((double) (height3 + f3))));
            } else if (i3 == 4) {
                float f10 = (float) 2;
                float width4 = ((rectF.width() - width) / f10) + rectF.left;
                float height4 = ((rectF.height() - height) / f10) + rectF.top;
                rect.set((int) ((float) Math.floor((double) width4)), (int) ((float) Math.floor((double) height4)), (int) ((float) Math.ceil((double) (width4 + width))), (int) ((float) Math.ceil((double) (height4 + height))));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            drawable.setBounds(rect);
        }
        return (int) rectF.right;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + getDrawable().hashCode();
    }

    public final void onThemeChanged(k2b k2b) {
        Drawable drawable = getDrawable();
        phf phf = drawable instanceof phf ? (phf) drawable : null;
        if (phf != null) {
            phf.onThemeChanged(k2b);
        }
    }

    public bq5(Drawable drawable, vp5 vp5, boolean z) {
        super(drawable);
        this.a = vp5;
        this.b = z;
        this.c = new RectF();
        this.o = new RectF();
        this.v = new Rect();
        this.w = new WeakHashMap();
    }
}
