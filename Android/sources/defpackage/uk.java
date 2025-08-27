package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import one.me.rlottie.RLottieDrawable;

/* renamed from: uk  reason: default package */
public final class uk extends ReplacementSpan {
    public static final Lazy Z = LazyKt.lazy(LazyThreadSafetyMode.NONE, new m(5));
    public final Rect X = new Rect();
    public final Paint Y;
    public final RLottieDrawable a;
    public final kuf b;
    public final Bitmap c;
    public final int o;
    public boolean v;
    public int w;
    public int x;
    public boolean y;
    public final Rect z = new Rect();

    public uk(RLottieDrawable rLottieDrawable, kuf kuf, Bitmap bitmap, int i) {
        this.a = rLottieDrawable;
        this.b = kuf;
        this.c = bitmap;
        this.o = i;
        ejd ejd = ii.a;
        if (ii.b) {
            Paint paint = new Paint();
            paint.setColor(-16776961);
            paint.setAlpha(80);
            this.Y = paint;
        }
        rLottieDrawable.addDrawableLoadListener(new tk(this));
    }

    public final void a(Canvas canvas, int i, Paint paint, Bitmap bitmap, float f, float f2) {
        if (ii.b) {
            Objects.toString(canvas);
            ii.a.getClass();
        }
        if (bitmap != null) {
            canvas.save();
            float f3 = f + ((float) this.w);
            Rect rect = this.z;
            canvas.translate(f3, (f2 - ((float) rect.height())) - ((float) this.w));
            Paint paint2 = this.Y;
            if (paint2 != null) {
                int save = canvas.save();
                paint2.setColor(-65536);
                paint2.setAlpha(80);
                canvas.translate(c44.DEFAULT_ASPECT_RATIO, -(f2 - ((float) rect.height())));
                canvas.drawRect(rect, paint2);
                canvas.restoreToCount(save);
            }
            RLottieDrawable rLottieDrawable = this.a;
            canvas.scale(((float) rect.width()) / ((float) rLottieDrawable.getIntrinsicWidth()), ((float) rect.height()) / ((float) rLottieDrawable.getIntrinsicHeight()));
            canvas.drawBitmap(bitmap, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, paint);
            canvas.restore();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r1 == null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r16, java.lang.CharSequence r17, int r18, int r19, float r20, int r21, int r22, int r23, android.graphics.Paint r24) {
        /*
            r15 = this;
            r8 = r15
            r9 = r16
            r2 = r17
            r10 = r24
            boolean r0 = r10 instanceof android.text.TextPaint
            if (r0 == 0) goto L_0x0019
            int r0 = r8.w
            if (r0 == 0) goto L_0x0013
            int r0 = r8.x
            if (r0 != 0) goto L_0x0019
        L_0x0013:
            r0 = r10
            android.text.TextPaint r0 = (android.text.TextPaint) r0
            r15.updateDrawState(r0)
        L_0x0019:
            kotlin.jvm.internal.Ref$IntRef r11 = new kotlin.jvm.internal.Ref$IntRef
            r11.<init>()
            r0 = -1
            r11.element = r0
            boolean r1 = defpackage.ii.b
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x006a
            boolean r1 = r2 instanceof android.text.Spannable
            if (r1 == 0) goto L_0x002f
            r1 = r2
            android.text.Spannable r1 = (android.text.Spannable) r1
            goto L_0x0030
        L_0x002f:
            r1 = r3
        L_0x0030:
            if (r1 == 0) goto L_0x0042
            int r5 = r1.length()
            java.lang.Class<uk> r6 = defpackage.uk.class
            java.lang.Object[] r1 = r1.getSpans(r4, r5, r6)     // Catch:{ all -> 0x003d }
            goto L_0x003e
        L_0x003d:
            r1 = r3
        L_0x003e:
            uk[] r1 = (defpackage.uk[]) r1
            if (r1 != 0) goto L_0x0044
        L_0x0042:
            uk[] r1 = new defpackage.uk[r4]
        L_0x0044:
            int r5 = kotlin.collections.ArraysKt.getLastIndex((T[]) r1)
            if (r5 < 0) goto L_0x006a
            r7 = r0
            r6 = r4
        L_0x004c:
            r12 = r1[r6]
            if (r12 != r8) goto L_0x0055
            r11.element = r6
            if (r7 != r0) goto L_0x0065
            goto L_0x006a
        L_0x0055:
            one.me.rlottie.RLottieDrawable r13 = r12.a
            one.me.rlottie.RLottieDrawable r14 = r8.a
            if (r13 != r14) goto L_0x0065
            boolean r12 = r12.y
            if (r12 == 0) goto L_0x0065
            int r7 = r11.element
            if (r7 == r0) goto L_0x0064
            goto L_0x006a
        L_0x0064:
            r7 = r6
        L_0x0065:
            if (r6 == r5) goto L_0x006a
            int r6 = r6 + 1
            goto L_0x004c
        L_0x006a:
            int r1 = r11.element
            if (r1 != r0) goto L_0x0070
            r11.element = r4
        L_0x0070:
            boolean r0 = r8.v
            if (r0 == 0) goto L_0x0107
            one.me.rlottie.RLottieDrawable r0 = r8.a
            android.graphics.Rect r1 = r8.z
            r0.setBounds(r1)
            kotlin.Lazy r0 = defpackage.ii.d
            java.lang.Object r0 = r0.getValue()
            r12 = r0
            moc r12 = (defpackage.moc) r12
            one.me.rlottie.RLottieDrawable r13 = r8.a
            sk r14 = new sk
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r11
            r4 = r24
            r5 = r20
            r6 = r21
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r12.getClass()
            java.lang.String r0 = r13.B1
            if (r0 != 0) goto L_0x00a7
            r14.invoke(r9)
            r13.draw(r9)
            goto L_0x013c
        L_0x00a7:
            long r1 = java.lang.System.currentTimeMillis()
            android.util.SparseLongArray r3 = r12.b
            int r4 = r0.hashCode()
            r5 = 0
            long r3 = r3.get(r4, r5)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x00d3
            android.util.SparseLongArray r3 = r12.b
            int r4 = r3.size()
            int r4 = r4 + 1
            int r5 = r12.a
            if (r4 >= r5) goto L_0x00ce
            int r0 = r0.hashCode()
            r3.put(r0, r1)
        L_0x00ce:
            r14.invoke(r9)
            goto L_0x013c
        L_0x00d3:
            long r3 = r1 - r3
            int r5 = r13.o
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00f3
            android.util.SparseLongArray r3 = r12.b
            int r4 = r3.size()
            int r4 = r4 + 1
            int r5 = r12.a
            if (r4 >= r5) goto L_0x00ef
            int r0 = r0.hashCode()
            r3.put(r0, r1)
        L_0x00ef:
            r14.invoke(r9)
            goto L_0x013c
        L_0x00f3:
            android.graphics.Bitmap r4 = r13.G0
            int r2 = r11.element
            r11 = r23
            float r6 = (float) r11
            r0 = r15
            r1 = r16
            r3 = r24
            r5 = r20
            r0.a(r1, r2, r3, r4, r5, r6)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x013c
        L_0x0107:
            r11 = r23
            android.graphics.Bitmap r0 = r8.c
            if (r0 == 0) goto L_0x0125
            r16.save()
            int r0 = r8.w
            int r0 = r21 + r0
            float r0 = (float) r0
            r5 = r20
            r9.translate(r5, r0)
            android.graphics.Bitmap r0 = r8.c
            android.graphics.Rect r1 = r8.X
            r9.drawBitmap(r0, r3, r1, r10)
            r16.restore()
            goto L_0x013c
        L_0x0125:
            r5 = r20
            kuf r0 = r8.b
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return this.b.getSize(paint, charSequence, i, i2, fontMetricsInt);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        this.b.updateDrawState(textPaint);
        textPaint.setAntiAlias(true);
        textPaint.setFilterBitmap(true);
        textPaint.setDither(true);
        updateMeasureState(textPaint);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        this.b.updateMeasureState(textPaint);
        this.w = (int) (textPaint.getFontMetrics().descent / 4.0f);
        this.x = this.b.getSize(textPaint, (CharSequence) null, 0, 0, (Paint.FontMetricsInt) null);
        float f = textPaint.getFontMetrics().ascent - textPaint.getFontMetrics().top;
        int i = this.w;
        int i2 = (int) f;
        int i3 = i2 * 2;
        int i4 = this.x;
        int i5 = i4 - i;
        int i6 = i4 + i2;
        Rect rect = this.z;
        rect.set(i, i3, i5, i6);
        this.a.setBounds(rect);
        int i7 = this.w;
        int i8 = this.x;
        this.X.set(i7, i7, i8 - i7, i8 - i7);
    }
}
