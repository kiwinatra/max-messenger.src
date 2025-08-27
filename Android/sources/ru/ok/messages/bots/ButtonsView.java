package ru.ok.messages.bots;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
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
import kotlin.Lazy;

public class ButtonsView extends View {
    public static final /* synthetic */ int Q0 = 0;
    public xv0 A0;
    public dw0 B0;
    public yva C0;
    public Paint D0;
    public Paint E0;
    public Drawable F0;
    public Drawable G0;
    public Drawable H0;
    public r20 I0;
    public final RectF J0 = new RectF();
    public Size K0;
    public Path L0;
    public boolean M0;
    public boolean N0;
    public vs6 O0;
    public final q00 P0 = new q00(1, this);
    public int a;
    public int b;
    public float c;
    public int o;
    public int v;
    public Paint v0;
    public int w = 0;
    public Paint w0;
    public ArrayList x;
    public Paint x0;
    public eq7 y;
    public TextPaint y0;
    public Paint z;
    public iw0 z0;

    public ButtonsView(Context context) {
        super(context);
        b();
    }

    public static Paint c(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        return paint;
    }

    public final void a(eq7 eq7) {
        eq7 eq72 = eq7;
        eq7 eq73 = this.y;
        if (!(eq73 == null ? true : !eq73.b(eq72))) {
            invalidate();
            return;
        }
        try {
            if (ct.J(eq72, this.y, new hw0(this, 1))) {
                return;
            }
        } catch (Throwable th) {
            z68.f("ru.ok.messages.bots.ButtonsView", "createButtons: updateButtonsLoading finished with exception", th);
        }
        boolean z2 = false;
        this.M0 = false;
        this.y = eq72;
        int i = ct.j;
        ArrayList arrayList = new ArrayList();
        List a2 = eq7.a();
        int i2 = 0;
        while (i2 < a2.size()) {
            ew0 ew0 = (ew0) a2.get(i2);
            int size = ew0.size();
            boolean z3 = ew0.size() == 1 ? true : z2;
            int i3 = size;
            int i4 = z2;
            while (i4 < ew0.size()) {
                xv0 xv0 = (xv0) ew0.get(i4);
                boolean z4 = i4 == 0 ? true : z2;
                boolean z5 = i4 == ew0.size() - 1 ? true : z2;
                a2.size();
                a20 a20 = new a20(1);
                a20.b = c44.DEFAULT_ASPECT_RATIO;
                a20.c = c44.DEFAULT_ASPECT_RATIO;
                a20.d = c44.DEFAULT_ASPECT_RATIO;
                a20.e = c44.DEFAULT_ASPECT_RATIO;
                tq0 tq0 = r10;
                tq0 tq02 = new tq0(xv0, a20, i3, z3, z4, z5, (float[]) null);
                arrayList.add(tq0);
                i4++;
                i3 = -1;
                z2 = false;
            }
            i2++;
            z2 = false;
        }
        this.x = arrayList;
        if (this.I0 == null) {
            r20 r20 = new r20(getContext(), -1);
            r20.m.setColor(0);
            r20.setLevel(0);
            r20.setCallback(this);
            this.I0 = r20;
        }
        requestLayout();
    }

    public final void b() {
        getContext();
        ro4 b2 = ro4.b();
        this.N0 = ct.y(getContext());
        this.a = b2.z;
        this.b = b2.b;
        this.c = (float) b2.h;
        float f = b2.T;
        this.o = b2.q;
        this.v = b2.k;
        this.L0 = new Path();
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        qra qra = (qra) ym.e();
        this.C0 = ((sjd) tr1.h(qra)).s();
        hn4 n = qra.n();
        Context context2 = getContext();
        n.getClass();
        this.K0 = hn4.k(context2);
        this.F0 = iq.E(nad.a0, -1, getContext());
        this.H0 = iq.E(nad.J0, -1, getContext());
        this.G0 = iq.E(nad.V1, -1, getContext());
        this.z = c(j4b.l0(0.6f, k0.N));
        this.v0 = c(j4b.l0(1.0f, k0.N));
        int i = k0.z;
        this.w0 = c(j4b.l0(0.8f, i));
        this.D0 = c(j4b.l0(1.0f, i));
        int i2 = k0.l;
        this.x0 = c(j4b.l0(0.8f, i2));
        this.E0 = c(j4b.l0(1.0f, i2));
        TextPaint textPaint = new TextPaint();
        this.y0 = textPaint;
        textPaint.setTextSize(f);
        this.y0.setColor(k0.m);
        this.y0.setTypeface(Typeface.DEFAULT);
        this.y0.setTextAlign(Paint.Align.CENTER);
        this.y0.setAntiAlias(true);
        this.O0 = new vs6(getContext(), (GestureDetector.OnGestureListener) this.P0);
    }

    public eq7 getKeyboard() {
        return this.y;
    }

    public final void onDraw(Canvas canvas) {
        tq0 tq0;
        a20 a20;
        Paint paint;
        int i;
        int i2;
        char c2;
        Drawable drawable;
        Canvas canvas2 = canvas;
        char c3 = 0;
        char c4 = 3;
        if (!cjf.B(this.x)) {
            Iterator it = this.x.iterator();
            while (it.hasNext() && (a20 = tq0.b) != null) {
                RectF rectF = this.J0;
                if (this.N0) {
                    rectF.set(a20.d, a20.c, a20.b, a20.e);
                } else {
                    rectF.set(a20.b, a20.c, a20.d, a20.e);
                }
                xv0 xv0 = this.A0;
                xv0 xv02 = (tq0 = (tq0) it.next()).a;
                if (xv02 == xv0) {
                    int y2 = tr1.y(xv02.c);
                    paint = y2 != 1 ? y2 != 2 ? this.v0 : this.D0 : this.E0;
                } else {
                    int y3 = tr1.y(xv02.c);
                    paint = y3 != 1 ? y3 != 2 ? this.z : this.w0 : this.x0;
                }
                a20 a202 = tq0.b;
                float[] fArr = tq0.g;
                if (fArr != null) {
                    this.L0.reset();
                    Path path = this.L0;
                    float f = fArr[c3];
                    float f2 = fArr[1];
                    float f3 = fArr[2];
                    float f4 = fArr[c4];
                    float[] fArr2 = new float[8];
                    fArr2[c3] = f;
                    fArr2[1] = f;
                    fArr2[2] = f2;
                    fArr2[3] = f2;
                    fArr2[4] = f3;
                    fArr2[5] = f3;
                    fArr2[6] = f4;
                    fArr2[7] = f4;
                    path.addRoundRect(rectF, fArr2, Path.Direction.CCW);
                    canvas2.drawPath(this.L0, paint);
                } else {
                    if (this.N0) {
                        rectF.set(a202.d, a202.c, a202.b, a202.e);
                    } else {
                        rectF.set(a202.b, a202.c, a202.d, a202.e);
                    }
                    float f5 = this.c;
                    canvas2.drawRoundRect(rectF, f5, f5, paint);
                }
                if (xv02.y) {
                    r20 r20 = this.I0;
                    float f6 = a202.b;
                    float f7 = a202.d;
                    int i3 = this.o;
                    int i4 = ((int) ((f6 + f7) * 0.5f)) - (i3 / 2);
                    float f8 = a202.c;
                    float f9 = a202.e;
                    int i5 = ((int) ((f8 + f9) * 0.5f)) - (i3 / 2);
                    int i6 = (i3 / 2) + ((int) ((f6 + f7) * 0.5f));
                    int i7 = (i3 / 2) + ((int) ((f8 + f9) * 0.5f));
                    if (this.N0) {
                        r20.setBounds(i6, i5, i4, i7);
                    } else {
                        r20.setBounds(i4, i5, i6, i7);
                    }
                    this.I0.b(canvas2, true);
                } else {
                    canvas2.drawText(tq0.h, (a202.b + a202.d) * 0.5f, ((a202.c + a202.e) * 0.5f) - ((this.y0.ascent() + this.y0.descent()) / 2.0f), this.y0);
                }
                if (this.N0) {
                    i2 = ((int) a202.d) + this.b;
                    i = this.v + i2;
                } else {
                    i2 = ((int) a202.d) - this.b;
                    i = i2 - this.v;
                }
                int i8 = ((int) a202.c) + this.b;
                int i9 = this.v + i8;
                int ordinal = xv02.b.ordinal();
                if (ordinal == 1) {
                    c2 = 3;
                    drawable = this.F0;
                } else if (ordinal != 2) {
                    c2 = 3;
                    drawable = ordinal != 3 ? null : this.H0;
                } else {
                    c2 = 3;
                    drawable = this.G0;
                }
                if (drawable != null) {
                    if (this.N0) {
                        drawable.setBounds(i2, i8, i, i9);
                    } else {
                        drawable.setBounds(i, i8, i2, i9);
                    }
                    drawable.draw(canvas2);
                }
                c4 = c2;
                c3 = 0;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        ArrayList arrayList = this.x;
        if (arrayList == null || arrayList.size() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = this.y.a().size();
        int size2 = View.MeasureSpec.getSize(i);
        if (!this.M0 && size2 > Math.min(this.K0.getWidth(), this.K0.getHeight())) {
            size2 = (int) (((float) (this.K0.getWidth() * size2)) / ((float) this.K0.getHeight()));
        }
        setMeasuredDimension(size2, (this.a + this.b) * size);
        a20 a20 = ((tq0) this.x.get(0)).b;
        if ((a20.b == c44.DEFAULT_ASPECT_RATIO && a20.c == c44.DEFAULT_ASPECT_RATIO && a20.d == c44.DEFAULT_ASPECT_RATIO && a20.e == c44.DEFAULT_ASPECT_RATIO) || this.w != getMeasuredWidth()) {
            try {
                ct.d(getMeasuredWidth(), this.x, new hw0(this, 0), this.b, this.a, this.N0);
            } catch (Throwable th) {
                z68.f("ru.ok.messages.bots.ButtonsView", "onMeasure: calculateButtonsSize finished with exception", th);
            }
        }
        this.w = getMeasuredWidth();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        ((GestureDetector) this.O0.b).onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        v7b v7b = null;
        if (action == 0) {
            ArrayList arrayList = this.x;
            List a2 = this.y.a();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            boolean z2 = this.N0;
            int i = ct.j;
            if (!arrayList.isEmpty() && !a2.isEmpty()) {
                int y2 = (int) (motionEvent.getY() / ((float) (measuredHeight / a2.size())));
                int size = a2.size() - 1;
                if (y2 > size) {
                    z68.g("ct", "Calculated wrong row index = %d, correct index = %d", Integer.valueOf(y2), Integer.valueOf(size));
                    y2 = size;
                }
                ew0 ew0 = (ew0) a2.get(y2);
                if (!ew0.isEmpty()) {
                    int x2 = z2 ? (int) ((((float) measuredWidth) - motionEvent.getX()) / ((float) (measuredWidth / ew0.size()))) : (int) (motionEvent.getX() / ((float) (measuredWidth / ew0.size())));
                    int size2 = ew0.size() - 1;
                    if (x2 > size2) {
                        z68.g("ct", "Calculated wrong column index = %d, correct index = %d", Integer.valueOf(x2), Integer.valueOf(size2));
                        x2 = size2;
                    }
                    v7b = new v7b(new dw0(y2, x2), (xv0) ew0.get(x2));
                }
            }
            if (v7b == null) {
                return true;
            }
            this.B0 = (dw0) v7b.a;
            this.A0 = (xv0) v7b.b;
            invalidate();
            return true;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            this.A0 = null;
            this.B0 = null;
            invalidate();
            return false;
        }
    }

    public void setClickListener(iw0 iw0) {
        this.z0 = iw0;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable instanceof r20) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }

    public ButtonsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
