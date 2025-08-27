package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.comparisons.ComparisonsKt;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: sc9  reason: default package */
public final class sc9 extends ViewGroup implements gq2 {
    public static final /* synthetic */ KProperty[] A0 = {rae.s(sc9.class, "drawMode", "getDrawMode()Lone/me/messages/list/ui/view/delegates/views/MessageLinkView$Mode;", 0)};
    public final bl a = new bl(this);
    public Layout b;
    public Layout c;
    public Layout o;
    public Layout v;
    public Layout v0;
    public final Lazy w;
    public final Lazy w0;
    public Layout x;
    public final Paint x0;
    public Layout y;
    public final TextPaint y0;
    public int z;
    public final bj z0;

    public sc9(Context context) {
        super(context);
        Delegates delegates = Delegates.INSTANCE;
        qc9 qc9 = qc9.a;
        p35 p35 = new p35(context, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.w = LazyKt.lazy(lazyThreadSafetyMode, p35);
        this.w0 = LazyKt.lazy(lazyThreadSafetyMode, new p35(context, 14));
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(vo4.c().getDisplayMetrics().density * 2.0f);
        this.x0 = paint;
        TextPaint textPaint = new TextPaint();
        tr2.c.a(textPaint, context.getResources().getDisplayMetrics(), uy4.b);
        this.y0 = textPaint;
        this.z0 = new bj(2, this);
    }

    private final OneMeAvatarView getAvatarView() {
        return (OneMeAvatarView) this.w.getValue();
    }

    private final qc9 getDrawMode() {
        return (qc9) this.a.getValue(this, A0[0]);
    }

    private final OneMeDraweeView getImageView() {
        return (OneMeDraweeView) this.w0.getValue();
    }

    private final void setDrawMode(qc9 qc9) {
        this.a.setValue(this, A0[0], qc9);
    }

    public final void a(Canvas canvas, float f) {
        if (this.z > 1) {
            float f2 = (float) 11;
            float roundToInt = f + ((float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
            float bottom = ((float) getImageView().getBottom()) - ((float) MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
            TextPaint textPaint = this.y0;
            js9 js9 = fu4.k;
            textPaint.setColor(js9.e(getContext()).f().c().d);
            canvas.drawCircle(roundToInt, bottom, (float) MathKt.roundToInt(((float) 9) * vo4.c().getDisplayMetrics().density), textPaint);
            textPaint.setColor(js9.e(getContext()).f().a().l().b.a);
            float f3 = (float) 2;
            float measureText = roundToInt - (textPaint.measureText(String.valueOf(this.z)) / f3);
            float descent = textPaint.descent();
            canvas.drawText(String.valueOf(this.z), measureText, bottom - ((textPaint.ascent() + descent) / f3), textPaint);
        }
    }

    public final void b(ws0 ws0) {
        TextPaint paint;
        TextPaint paint2;
        TextPaint paint3;
        TextPaint paint4;
        TextPaint paint5;
        TextPaint paint6;
        TextPaint paint7;
        this.x0.setColor(ws0.d.a);
        Layout layout = this.b;
        zs0 zs0 = ws0.b;
        if (!(layout == null || (paint7 = layout.getPaint()) == null)) {
            paint7.setColor(zs0.h);
        }
        Layout layout2 = this.c;
        if (!(layout2 == null || (paint6 = layout2.getPaint()) == null)) {
            paint6.setColor(zs0.i);
        }
        Layout layout3 = this.c;
        if (layout3 != null) {
            CharSequence text = layout3.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                Object[] spans = spanned.getSpans(0, layout3.getText().length(), Object.class);
                if (spans != null) {
                    for (Object obj : spans) {
                        gq2 gq2 = obj instanceof gq2 ? (gq2) obj : null;
                        if (gq2 != null) {
                            gq2.b(ws0);
                        }
                    }
                }
            }
        }
        Layout layout4 = this.v;
        if (!(layout4 == null || (paint5 = layout4.getPaint()) == null)) {
            paint5.setColor(zs0.i);
        }
        Layout layout5 = this.o;
        if (!(layout5 == null || (paint4 = layout5.getPaint()) == null)) {
            paint4.setColor(zs0.i);
        }
        Layout layout6 = this.x;
        if (!(layout6 == null || (paint3 = layout6.getPaint()) == null)) {
            paint3.setColor(zs0.i);
        }
        Layout layout7 = this.y;
        if (!(layout7 == null || (paint2 = layout7.getPaint()) == null)) {
            paint2.setColor(zs0.i);
        }
        Layout layout8 = this.v0;
        if (!(layout8 == null || (paint = layout8.getPaint()) == null)) {
            paint.setColor(zs0.i);
        }
        invalidate();
    }

    public final void c(Canvas canvas) {
        boolean y2 = ct.y(getContext());
        Paint paint = this.x0;
        float measuredWidth = y2 ? ((float) getMeasuredWidth()) - (paint.getStrokeWidth() / ((float) 2)) : paint.getStrokeWidth() / ((float) 2);
        int save = canvas.save();
        try {
            canvas.drawLine(measuredWidth, vo4.c().getDisplayMetrics().density * 2.0f, measuredWidth, ((float) getMeasuredHeight()) - (vo4.c().getDisplayMetrics().density * 2.0f), paint);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void d(ic9 ic9) {
        f6e.c(this, getImageView(), -1);
        OneMeDraweeView imageView = getImageView();
        String str = ic9.a;
        int i = 0;
        if (!(!(str == null || str.length() == 0))) {
            i = 8;
        }
        imageView.setVisibility(i);
        OneMeDraweeView imageView2 = getImageView();
        qa7 qa7 = null;
        String str2 = ic9.a;
        qa7 b2 = str2 != null ? qa7.b(str2) : null;
        Uri uri = ic9.d;
        if (uri != null) {
            qa7 = qa7.a(uri);
        }
        imageView2.o(b2, qa7);
        this.z = ic9.b;
        this.v0 = ic9.c;
    }

    /* JADX INFO: finally extract failed */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        super.dispatchDraw(canvas);
        qc9 drawMode = getDrawMode();
        qc9 qc9 = qc9.w;
        Paint paint = this.x0;
        float f2 = c44.DEFAULT_ASPECT_RATIO;
        if (drawMode == qc9 || getDrawMode() == qc9.c) {
            f = 0.0f;
        } else {
            c(canvas);
            f = paint.getStrokeWidth() + ((float) MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density)) + c44.DEFAULT_ASPECT_RATIO;
            float roundToInt = ((float) MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density)) + c44.DEFAULT_ASPECT_RATIO;
            int save = canvas.save();
            canvas.translate(f, roundToInt);
            try {
                Layout layout = this.b;
                if (layout != null) {
                    layout.draw(canvas);
                }
                canvas.restoreToCount(save);
                f2 = ((float) ld8.N(this.b)) + roundToInt;
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
        int ordinal = getDrawMode().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                float roundToInt2 = f2 + ((float) MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density));
                float b2 = f + ((float) g63.b((float) 6, vo4.c().getDisplayMetrics().density, MathKt.roundToInt(((float) 28) * vo4.c().getDisplayMetrics().density)));
                int save2 = canvas.save();
                canvas.translate(b2, roundToInt2);
                try {
                    Layout layout2 = this.o;
                    if (layout2 != null) {
                        layout2.draw(canvas);
                    }
                    canvas.restoreToCount(save2);
                    float N = roundToInt2 + ((float) ld8.N(this.o));
                    int save3 = canvas.save();
                    canvas.translate(b2, N);
                    try {
                        Layout layout3 = this.v;
                        if (layout3 != null) {
                            layout3.draw(canvas);
                        }
                        return;
                    } finally {
                        canvas.restoreToCount(save3);
                    }
                } catch (Throwable th2) {
                    canvas.restoreToCount(save2);
                    throw th2;
                }
            } else if (ordinal == 2) {
                c(canvas);
                float strokeWidth = paint.getStrokeWidth() + ((float) MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density)) + f;
                a(canvas, strokeWidth);
                float b3 = strokeWidth + ((float) g63.b((float) 4, vo4.c().getDisplayMetrics().density, MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density)));
                float f3 = (float) 2;
                float roundToInt3 = f2 + ((float) (MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3) * 2));
                float measuredHeight = (((((float) getMeasuredHeight()) - roundToInt3) / f3) - ((float) ((ld8.N(this.v0) + ld8.N(this.b)) / 2))) + roundToInt3;
                int save4 = canvas.save();
                canvas.translate(b3, measuredHeight);
                try {
                    Layout layout4 = this.b;
                    if (layout4 != null) {
                        layout4.draw(canvas);
                    }
                    canvas.restoreToCount(save4);
                    float N2 = measuredHeight + ((float) ld8.N(this.b));
                    int save5 = canvas.save();
                    canvas.translate(b3, N2);
                    try {
                        Layout layout5 = this.v0;
                        if (layout5 != null) {
                            layout5.draw(canvas);
                        }
                        return;
                    } finally {
                        canvas.restoreToCount(save5);
                    }
                } catch (Throwable th3) {
                    canvas.restoreToCount(save4);
                    throw th3;
                }
            } else if (ordinal != 3) {
                if (ordinal == 4) {
                    int save6 = canvas.save();
                    canvas.translate(f, f2);
                    try {
                        Layout layout6 = this.x;
                        if (layout6 != null) {
                            layout6.draw(canvas);
                        }
                        canvas.restoreToCount(save6);
                        float N3 = f2 + ((float) ld8.N(this.x));
                        a(canvas, f);
                        float b4 = f + ((float) g63.b((float) 4, vo4.c().getDisplayMetrics().density, getImageView().getMeasuredWidth()));
                        float roundToInt4 = N3 + ((float) MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density));
                        int save7 = canvas.save();
                        canvas.translate(b4, roundToInt4);
                        try {
                            Layout layout7 = this.y;
                            if (layout7 != null) {
                                layout7.draw(canvas);
                            }
                            canvas.restoreToCount(save7);
                            float N4 = roundToInt4 + ((float) ld8.N(this.y));
                            int save8 = canvas.save();
                            canvas.translate(b4, N4);
                            try {
                                Layout layout8 = this.v0;
                                if (layout8 != null) {
                                    layout8.draw(canvas);
                                }
                                return;
                            } finally {
                                canvas.restoreToCount(save8);
                            }
                        } catch (Throwable th4) {
                            canvas.restoreToCount(save7);
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        canvas.restoreToCount(save6);
                        throw th5;
                    }
                } else if (ordinal == 5) {
                    int save9 = canvas.save();
                    canvas.translate(f, f2);
                    try {
                        Layout layout9 = this.x;
                        if (layout9 != null) {
                            layout9.draw(canvas);
                        }
                        canvas.restoreToCount(save9);
                        float b5 = f2 + ((float) g63.b((float) 2, vo4.c().getDisplayMetrics().density, ld8.N(this.x)));
                        int save10 = canvas.save();
                        canvas.translate(f, b5);
                        try {
                            Layout layout10 = this.y;
                            if (layout10 != null) {
                                layout10.draw(canvas);
                            }
                            return;
                        } finally {
                            canvas.restoreToCount(save10);
                        }
                    } catch (Throwable th6) {
                        canvas.restoreToCount(save9);
                        throw th6;
                    }
                } else {
                    return;
                }
            }
        }
        if (getDrawMode() == qc9.o) {
            int save11 = canvas.save();
            canvas.translate(f, f2);
            try {
                Layout layout11 = this.x;
                if (layout11 != null) {
                    layout11.draw(canvas);
                }
                canvas.restoreToCount(save11);
                float b6 = f2 + ((float) g63.b((float) 2, vo4.c().getDisplayMetrics().density, ld8.N(this.x)));
                int save12 = canvas.save();
                canvas.translate(f, b6);
                try {
                    Layout layout12 = this.y;
                    if (layout12 != null) {
                        layout12.draw(canvas);
                    }
                    canvas.restoreToCount(save12);
                    f2 = b6 + ((float) g63.b((float) 6, vo4.c().getDisplayMetrics().density, ld8.N(this.y)));
                } catch (Throwable th7) {
                    canvas.restoreToCount(save12);
                    throw th7;
                }
            } catch (Throwable th8) {
                canvas.restoreToCount(save11);
                throw th8;
            }
        }
        int save13 = canvas.save();
        canvas.translate(f, f2);
        try {
            Layout layout13 = this.c;
            if (layout13 != null) {
                layout13.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(save13);
        }
    }

    public final void e(Layout layout, hc9 hc9) {
        setDrawMode(qc9.b);
        this.b = layout;
        this.o = hc9.a;
        this.v = hc9.b;
        f6e.c(this, getAvatarView(), -1);
        getAvatarView().setVisibility(0);
        getAvatarView().setAvatarUrl(hc9.e);
        getAvatarView().f(new gd0(hc9.d, hc9.c), true);
    }

    public final void f(Layout layout, ic9 ic9, gc9 gc9) {
        setDrawMode(qc9.v);
        this.b = layout;
        d(ic9);
        this.x = gc9.b();
        this.y = gc9.a();
    }

    public final void g(Layout layout, ic9 ic9) {
        setDrawMode(qc9.c);
        this.b = layout;
        d(ic9);
    }

    public final void h(Layout layout, Layout layout2, gc9 gc9) {
        setDrawMode(qc9.o);
        this.b = layout;
        this.c = layout2;
        this.x = gc9.b();
        this.y = gc9.a();
    }

    public final void i(Layout layout, Layout layout2) {
        setDrawMode(qc9.a);
        this.b = layout;
        this.c = layout2;
        hsg.H(this, layout2, this.z0);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Layout layout = this.c;
        if (layout != null) {
            hsg.H(this, layout, this.z0);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Layout layout = this.c;
        if (layout != null) {
            hsg.I(layout, this.z0);
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int b2 = g63.b((float) 6, vo4.c().getDisplayMetrics().density, (int) this.x0.getStrokeWidth());
        float f = (float) 2;
        int N = ld8.N(this.b) + MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        int ordinal = getDrawMode().ordinal();
        if (ordinal == 1) {
            ev0.x(getAvatarView(), b2, g63.b(f, vo4.c().getDisplayMetrics().density, N), 0, 12);
        } else if (ordinal == 2) {
            ev0.x(getImageView(), b2, (getMeasuredHeight() / 2) - (getImageView().getMeasuredHeight() / 2), 0, 12);
        } else if (ordinal == 4) {
            ev0.x(getImageView(), b2, ld8.N(this.x) + N, 0, 12);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        if (rc9.$EnumSwitchMapping$0[getDrawMode().ordinal()] == 6) {
            i4 = ld8.N(this.y) + g63.b((float) 2, vo4.c().getDisplayMetrics().density, ld8.N(this.x));
            i3 = Math.max(ld8.O(this.x), ld8.O(this.y));
        } else {
            float f = (float) 2;
            int N = ld8.N(this.b) + (MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f) * 2);
            float f2 = (float) 6;
            int b2 = g63.b(f2, vo4.c().getDisplayMetrics().density, MathKt.roundToInt(this.x0.getStrokeWidth()));
            int ordinal = getDrawMode().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                i4 = N;
                                i3 = b2;
                            }
                        }
                    }
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density), 1073741824);
                    getImageView().measure(makeMeasureSpec, makeMeasureSpec);
                    int max = getDrawMode() == qc9.c ? Math.max(ld8.O(this.b), ld8.O(this.v0)) + getImageView().getMeasuredWidth() + b2 : Math.max(ld8.O(this.y) + getImageView().getMeasuredWidth(), ld8.O(this.x)) + b2;
                    int max2 = Math.max(getImageView().getMeasuredHeight(), ld8.N(this.b) + ld8.N(this.v0)) + N;
                    int i5 = max;
                    i4 = getDrawMode() == qc9.v ? ld8.N(this.x) + max2 : max2 - ld8.N(this.b);
                    i3 = i5;
                } else {
                    int roundToInt = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
                    float f3 = (float) 28;
                    i4 = tr1.e(f3, vo4.c().getDisplayMetrics().density, roundToInt, N);
                    i3 = Math.max(ld8.O(this.b), Math.max(ld8.O(this.v), ld8.O(this.o)) + g63.b(f2, vo4.c().getDisplayMetrics().density, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3))) + b2;
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density), 1073741824);
                    getAvatarView().measure(makeMeasureSpec2, makeMeasureSpec2);
                }
            }
            i4 = ld8.N(this.c) + N;
            i3 = ComparisonsKt.maxOf(ld8.O(this.b), ld8.O(this.c), ld8.O(this.x), ld8.O(this.y)) + b2;
            if (getDrawMode() == qc9.o) {
                i4 = tr1.e(f2, vo4.c().getDisplayMetrics().density, ld8.N(this.y) + g63.b(f, vo4.c().getDisplayMetrics().density, ld8.N(this.x)), i4);
            }
        }
        setMeasuredDimension(RangesKt.coerceAtMost(i3, size), i4);
    }

    public final void setSingleForward(gc9 gc9) {
        setDrawMode(qc9.w);
        this.x = gc9.b();
        this.y = gc9.a();
    }
}
