package defpackage;

import android.animation.IntEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.collections.ArrayDeque;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: c80  reason: default package */
public final class c80 extends View implements phf {
    public static final IntEvaluator D0 = new IntEvaluator();
    public long A0;
    public boolean B0;
    public b80 C0;
    public final int[] a = new int[2];
    public final float b;
    public final float c;
    public final float o;
    public byte[] v;
    public final Paint v0;
    public long w;
    public final Paint w0;
    public boolean x;
    public final Path x0 = new Path();
    public boolean y;
    public ArrayDeque y0;
    public final Paint z;
    public Byte z0;

    public c80(Context context) {
        super(context, (AttributeSet) null, 0);
        setLayerType(1, (Paint) null);
        setPadding((int) ((vo4.c().getDisplayMetrics().density * 2.0f) + (vo4.c().getDisplayMetrics().density * 4.0f)), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        this.b = vo4.c().getDisplayMetrics().density * 4.0f;
        this.c = vo4.c().getDisplayMetrics().density * 2.0f;
        float f = vo4.c().getDisplayMetrics().density * 2.0f;
        this.o = f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        this.z = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.w0 = paint2;
        this.v0 = new Paint(paint);
        ct.b(this);
        if (ct.y(getContext())) {
            setScaleX(-1.0f);
        }
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public final float a(MotionEvent motionEvent) {
        int[] iArr = this.a;
        getLocationOnScreen(iArr);
        float rawX = motionEvent.getRawX();
        int paddingLeft = getPaddingLeft() + iArr[0];
        int width = getWidth();
        if (width == 0) {
            return c44.DEFAULT_ASPECT_RATIO;
        }
        if (rawX >= ((float) (paddingLeft + width))) {
            return 1.0f;
        }
        float f = (float) paddingLeft;
        return rawX <= f ? c44.DEFAULT_ASPECT_RATIO : (rawX - f) / ((float) width);
    }

    public final long getDuration() {
        return this.A0;
    }

    public final int getPeaksCount() {
        return (int) (((float) (getMeasuredWidth() - getPaddingLeft())) / (this.c + this.o));
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        float f;
        Path path = this.x0;
        if (!path.isEmpty()) {
            float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
            float width = ((((float) this.w) / ((float) this.A0)) * ((float) getWidth())) + ((float) getPaddingLeft());
            boolean z2 = this.y || this.B0;
            float f2 = vo4.c().getDisplayMetrics().density * 4.0f;
            if (this.B0) {
                f2 += vo4.c().getDisplayMetrics().density * 2.0f;
            }
            if (z2) {
                canvas.save();
                f = width > ((float) getWidth()) - f2 ? ((float) getWidth()) - f2 : width;
            } else {
                f = 0.0f;
            }
            Paint paint = this.z;
            if (!z2) {
                canvas.drawPath(path, paint);
                return;
            }
            int save = canvas.save();
            try {
                canvas.clipRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, width, (float) canvas.getHeight());
                canvas.drawPath(path, this.v0);
                canvas.restoreToCount(save);
                int save2 = canvas.save();
                try {
                    canvas.clipRect(width, c44.DEFAULT_ASPECT_RATIO, (float) canvas.getWidth(), (float) canvas.getHeight());
                    canvas.drawPath(path, paint);
                    canvas.restoreToCount(save2);
                    canvas.drawCircle(f, measuredHeight, f2, this.w0);
                } catch (Throwable th) {
                    canvas.restoreToCount(save2);
                    throw th;
                }
            } catch (Throwable th2) {
                canvas.restoreToCount(save);
                throw th2;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        if (this.v == null) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
    }

    public final void onThemeChanged(k2b k2b) {
        int i;
        if (this.x) {
            k2b.getIcon().getClass();
            i = i8b.Y(0.5f, -1);
        } else {
            k2b.getIcon().getClass();
            i = i8b.Y(0.5f, -16745729);
        }
        this.z.setColor(i);
        k2b.getIcon().getClass();
        this.w0.setColor(-1);
        k2b.getIcon().getClass();
        this.v0.setColor(-1);
        invalidate();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.y && !this.B0) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else if (!this.B0) {
                    return false;
                } else {
                    this.w = (long) (a(motionEvent) * ((float) this.A0));
                    b80 b80 = this.C0;
                    if (b80 != null) {
                        xe8 xe8 = (xe8) b80;
                        String d = b0h.d((long) (((float) ((c80) xe8.b).getDuration()) * a(motionEvent)));
                        KProperty[] kPropertyArr = RecordControlsWidget.g1;
                        ((RecordControlsWidget) xe8.c).r0().setText(d);
                    }
                    postInvalidate();
                }
            }
            this.B0 = false;
            b80 b802 = this.C0;
            if (b802 != null) {
                float a2 = a(motionEvent);
                KProperty[] kPropertyArr2 = RecordControlsWidget.g1;
                pwc D02 = ((RecordControlsWidget) ((xe8) b802).c).D0();
                Long l = (Long) D02.x0.a.getValue();
                if (l != null) {
                    ((xy9) ((c50) D02.n()).b()).v((long) (a2 * ((float) l.longValue())));
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (!this.x) {
            return false;
        } else {
            this.B0 = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public final void setLinesColor(int i) {
        this.z.setColor(i);
        invalidate();
    }

    public final void setListener(b80 b80) {
        this.C0 = b80;
    }
}
