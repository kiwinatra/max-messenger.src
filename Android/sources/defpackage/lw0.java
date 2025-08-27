package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;

/* renamed from: lw0  reason: default package */
public final class lw0 extends View {
    public final Drawable A0;
    public final Drawable B0;
    public final Drawable C0;
    public final Drawable D0;
    public te7 E0;
    public final Path F0 = new Path();
    public final RectF G0 = new RectF();
    public final float[] H0 = new float[8];
    public final Size I0;
    public boolean J0;
    public final GestureDetector K0;
    public final int a = MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
    public final int b = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
    public final float c = (vo4.c().getDisplayMetrics().density * 6.0f);
    public final int o = MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density);
    public final int v = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
    public final Paint v0;
    public int w;
    public final TextPaint w0;
    public ArrayList x = new ArrayList();
    public jw0 x0;
    public eq7 y;
    public xv0 y0;
    public final Paint z;
    public dw0 z0;

    public lw0(Context context) {
        super(context, (AttributeSet) null);
        this.K0 = new GestureDetector(context, new q00(2, this));
        this.I0 = new Size(h88.A(context).getWidth(), h88.A(context).getHeight());
        int i = bwa.l;
        js9 js9 = fu4.k;
        js9.e(getContext()).f().getIcon().getClass();
        this.A0 = iq.E(i, -1, context);
        int i2 = bwa.k;
        js9.e(getContext()).f().getIcon().getClass();
        this.B0 = iq.E(i2, -1, context);
        int i3 = bwa.b;
        js9.e(getContext()).f().getIcon().getClass();
        this.D0 = iq.E(i3, -1, context);
        int i4 = bwa.a;
        js9.e(getContext()).f().getIcon().getClass();
        this.C0 = iq.E(i4, -1, context);
        TextPaint textPaint = new TextPaint();
        this.w0 = textPaint;
        int i5 = js9.e(getContext()).f().a().a(true).a.a.a;
        Paint paint = new Paint();
        paint.setColor(i5);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setAntiAlias(true);
        this.z = paint;
        int i6 = js9.e(getContext()).f().a().a(true).a.a.c;
        Paint paint2 = new Paint();
        paint2.setColor(i6);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setAntiAlias(true);
        this.v0 = paint2;
        js9.e(getContext()).f().getText().getClass();
        textPaint.setColor(-1);
        puf.B.a(textPaint, getResources().getDisplayMetrics(), uy4.b);
        textPaint.setTextSize(vo4.c().getDisplayMetrics().density * 16.0f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        b0h.H(this, new mh0(3, (Continuation) null, 1));
    }

    public final eq7 getKeyboard() {
        return this.y;
    }

    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        if (!this.x.isEmpty()) {
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                uq0 uq0 = (uq0) it.next();
                a20 a20 = uq0.b;
                RectF rectF = this.G0;
                rectF.set(a20.b, a20.c, a20.d, a20.e);
                xv0 xv0 = this.y0;
                xv0 xv02 = uq0.a;
                if (xv02 == xv0) {
                    int i = kw0.$EnumSwitchMapping$1[tr1.y(xv02.c)];
                    paint = this.v0;
                } else {
                    int i2 = kw0.$EnumSwitchMapping$1[tr1.y(xv02.c)];
                    paint = this.z;
                }
                a20 a202 = uq0.b;
                float[] fArr = uq0.g;
                if (fArr != null) {
                    Path path = this.F0;
                    path.reset();
                    float f = fArr[0];
                    float[] fArr2 = this.H0;
                    fArr2[0] = f;
                    fArr2[1] = fArr[0];
                    float f2 = fArr[1];
                    fArr2[2] = f2;
                    fArr2[3] = f2;
                    float f3 = fArr[2];
                    fArr2[4] = f3;
                    fArr2[5] = f3;
                    float f4 = fArr[3];
                    fArr2[6] = f4;
                    fArr2[7] = f4;
                    path.addRoundRect(rectF, fArr2, Path.Direction.CCW);
                    canvas2.drawPath(path, paint);
                } else {
                    rectF.set(a202.b, a202.c, a202.d, a202.e);
                    float f5 = this.c;
                    canvas2.drawRoundRect(rectF, f5, f5, paint);
                }
                if (xv02.y) {
                    te7 te7 = this.E0;
                    if (te7 != null) {
                        float f6 = a202.b;
                        float f7 = a202.d;
                        int i3 = this.o / 2;
                        float f8 = a202.c;
                        float f9 = a202.e;
                        te7.setBounds(((int) ((f6 + f7) * 0.5f)) - i3, ((int) ((f8 + f9) * 0.5f)) - i3, ((int) ((f6 + f7) * 0.5f)) + i3, i3 + ((int) ((f8 + f9) * 0.5f)));
                    }
                    te7 te72 = this.E0;
                    if (te72 != null) {
                        te72.draw(canvas2);
                    }
                } else {
                    TextPaint textPaint = this.w0;
                    canvas2.drawText(uq0.h, (a202.b + a202.d) * 0.5f, ((a202.c + a202.e) * 0.5f) - ((textPaint.ascent() + textPaint.descent()) / ((float) 2)), textPaint);
                }
                int i4 = this.b;
                int i5 = ((int) a202.d) - i4;
                int i6 = this.v;
                int i7 = i5 - i6;
                int i8 = ((int) a202.c) + i4;
                int i9 = i6 + i8;
                int ordinal = xv02.b.ordinal();
                Drawable drawable = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 5 ? null : this.A0 : this.D0 : this.C0 : this.B0;
                if (drawable != null) {
                    drawable.setBounds(i7, i8, i5, i9);
                    drawable.draw(canvas2);
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        eq7 eq7 = this.y;
        if (this.x.size() == 0 || eq7 == null) {
            super.onMeasure(i, i2);
            return;
        }
        int size = eq7.a().size();
        int size2 = View.MeasureSpec.getSize(i);
        if (!this.J0) {
            Size size3 = this.I0;
            if (((double) size2) > Math.min((double) size3.getWidth(), (double) size3.getHeight())) {
                size2 = (int) (((float) (size3.getWidth() * size2)) / ((float) size3.getHeight()));
            }
        }
        int i3 = this.a;
        int i4 = this.b;
        setMeasuredDimension(size2, (i3 + i4) * size);
        int i5 = 0;
        a20 a20 = ((uq0) this.x.get(0)).b;
        if ((a20.b == c44.DEFAULT_ASPECT_RATIO && a20.c == c44.DEFAULT_ASPECT_RATIO && a20.d == c44.DEFAULT_ASPECT_RATIO && a20.e == c44.DEFAULT_ASPECT_RATIO) || this.w != getMeasuredWidth()) {
            int measuredWidth = getMeasuredWidth();
            ArrayList arrayList = this.x;
            l lVar = new l(16, this);
            Iterator it = arrayList.iterator();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (it.hasNext()) {
                uq0 uq0 = (uq0) it.next();
                int i9 = uq0.c;
                if (i9 != -1) {
                    i8 = (measuredWidth - (i9 * i4)) / i9;
                    i6 = i5;
                }
                boolean z2 = uq0.f;
                if (z2) {
                    i8 += i4;
                }
                float f = (float) i6;
                float f2 = (float) i7;
                int i10 = uq0.d ? i6 + measuredWidth : i6 + i8;
                int i11 = i7 + i3;
                int i12 = measuredWidth;
                a20 a202 = uq0.b;
                a202.b = f;
                a202.c = f2;
                a202.d = (float) i10;
                a202.e = (float) i11;
                lVar.invoke(uq0);
                i6 = i6 + i8 + i4;
                if (z2) {
                    i7 = i11 + i4;
                }
                measuredWidth = i12;
                i5 = 0;
            }
        }
        this.w = getMeasuredWidth();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        this.K0.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        v7b v7b = null;
        if (action == 0) {
            ArrayList arrayList = this.x;
            eq7 eq7 = this.y;
            List a2 = eq7 != null ? eq7.a() : null;
            if (a2 == null) {
                a2 = CollectionsKt.emptyList();
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!arrayList.isEmpty() && !a2.isEmpty()) {
                int y2 = (int) (motionEvent.getY() / ((float) (measuredHeight / a2.size())));
                int size = a2.size() - 1;
                Class<vq0> cls = vq0.class;
                if (y2 > size) {
                    String name = cls.getName();
                    a67 a67 = z68.b;
                    if (a67 != null && a67.c()) {
                        a67.d(w78.x, name, g63.h("Calculated wrong row index=", y2, size, ", correct index="), (Throwable) null);
                    }
                    y2 = size;
                }
                ew0 ew0 = (ew0) a2.get(y2);
                if (!ew0.isEmpty()) {
                    int x2 = (int) (motionEvent.getX() / ((float) (measuredWidth / ew0.size())));
                    int size2 = ew0.size() - 1;
                    if (x2 > size2) {
                        String name2 = cls.getName();
                        a67 a672 = z68.b;
                        if (a672 != null && a672.c()) {
                            a672.d(w78.x, name2, g63.h("Calculated wrong column index=", x2, size2, ", correct index="), (Throwable) null);
                        }
                        x2 = size2;
                    }
                    v7b = new v7b(new dw0(y2, x2), ew0.get(x2));
                }
            }
            if (v7b == null) {
                return true;
            }
            this.z0 = (dw0) v7b.a;
            this.y0 = (xv0) v7b.b;
            invalidate();
            return true;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            this.y0 = null;
            this.z0 = null;
            invalidate();
            return false;
        }
    }

    public final void setClickListener(jw0 jw0) {
        this.x0 = jw0;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof te7) || super.verifyDrawable(drawable);
    }
}
