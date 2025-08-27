package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* renamed from: rd5  reason: default package */
public final class rd5 extends View implements phf {
    public final ds7 a = ((ds7) jxb.a.getAccessor().g(ds7.class));
    public final CharSequence b;
    public ogf c;
    public final TextPaint o;
    public SpannableString v;
    public boolean v0;
    public int w;
    public boolean w0;
    public Layout x;
    public boolean x0;
    public Layout y;
    public Integer y0;
    public Layout z;
    public yp0 z0;

    public rd5(Context context) {
        super(context);
        String b2 = new igf(lxa.l).b(getContext().getResources());
        this.b = b2 == null ? "" : b2;
        this.c = puf.i;
        TextPaint textPaint = new TextPaint(1);
        this.c.a(textPaint, getResources().getDisplayMetrics(), uy4.b);
        js9 js9 = fu4.k;
        textPaint.setColor(js9.e(getContext()).f().getText().e);
        this.o = textPaint;
        this.w = IntCompanionObject.MAX_VALUE;
        onThemeChanged(js9.e(getContext()).f());
    }

    public final Layout a(CharSequence charSequence, int i) {
        int i2 = gge.a;
        return this.a.a(sq6.A(charSequence, true), this.o, i, IntCompanionObject.MAX_VALUE, false, TextUtils.TruncateAt.END);
    }

    public final void b(int i) {
        Layout layout;
        Object obj;
        SpannableString spannableString = this.v;
        if (spannableString != null) {
            Layout a2 = a(spannableString, i);
            this.z = a2;
            if (a2.getLineCount() <= this.w) {
                layout = this.z;
            } else {
                StringBuilder sb = new StringBuilder("… ");
                CharSequence charSequence = this.b;
                sb.append(charSequence);
                String sb2 = sb.toString();
                TextPaint textPaint = this.o;
                float measureText = textPaint.measureText(sb2);
                SpannableStringBuilder append = new SpannableStringBuilder(spannableString).append(sb2);
                Layout a3 = a(append, i);
                int lineCount = a3.getLineCount();
                int i2 = this.w;
                if (lineCount > i2) {
                    int lineStart = a3.getLineStart(i2 - 1);
                    CharSequence subSequence = append.subSequence(0, a3.getLineEnd(this.w - 1));
                    while (true) {
                        if (((float) a3.getWidth()) > textPaint.measureText(subSequence, lineStart, subSequence.length()) + measureText) {
                            break;
                        }
                        subSequence = StringsKt___StringsKt.dropLast(subSequence, 1);
                    }
                    int length = subSequence.length() - 1;
                    if (length >= 0) {
                        while (true) {
                            int i3 = length - 1;
                            if (subSequence.charAt(length) != 10) {
                                obj = subSequence.subSequence(0, length + 1);
                                break;
                            } else if (i3 < 0) {
                                break;
                            } else {
                                length = i3;
                            }
                        }
                    }
                    obj = "";
                    append = (SpannableStringBuilder) obj;
                }
                layout = a(new SpannableStringBuilder(ld8.q0(append)).append("… ").append(charSequence, new gh7(2, this), 33), i);
            }
            this.y = layout;
            if (this.x0) {
                layout = this.z;
            }
            this.x = layout;
        }
    }

    public final void c() {
        if (isAttachedToWindow() && getMeasuredWidth() > 0) {
            b(getMeasuredWidth());
            this.v0 = true;
            requestLayout();
        } else if (this.z0 == null) {
            this.z0 = new yp0(1, this);
            getViewTreeObserver().addOnPreDrawListener(this.z0);
        }
    }

    public final SpannableString getText() {
        return this.v;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    public final void onDetachedFromWindow() {
        yp0 yp0 = this.z0;
        if (yp0 != null) {
            if (getViewTreeObserver().isAlive()) {
                getViewTreeObserver().removeOnPreDrawListener(yp0);
            }
            this.z0 = null;
        }
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int save = canvas.save();
        canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        try {
            Layout layout = this.x;
            if (layout != null) {
                layout.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        Integer num = this.y0;
        if (num == null) {
            Layout layout = this.x;
            num = layout != null ? Integer.valueOf(layout.getHeight()) : null;
            if (num == null) {
                i3 = 0;
                setMeasuredDimension(size, i3);
            }
        }
        i3 = num.intValue();
        setMeasuredDimension(size, i3);
    }

    public final void onThemeChanged(k2b k2b) {
        Object[] objArr;
        this.o.setColor(k2b.getText().e);
        SpannableString spannableString = this.v;
        if (spannableString != null) {
            try {
                objArr = spannableString.getSpans(0, spannableString.length(), my7.class);
            } catch (Throwable unused) {
                objArr = null;
            }
            my7[] my7Arr = (my7[]) objArr;
            if (my7Arr != null) {
                for (my7 my7 : my7Arr) {
                    fu4.k.e(getContext()).f().getText().getClass();
                    my7.b = -16745729;
                }
            }
        }
        invalidate();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharSequence text;
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        Layout layout = this.x;
        if (layout == null || (text = layout.getText()) == null) {
            return super.onTouchEvent(motionEvent);
        }
        Layout layout2 = this.x;
        if (layout2 == null) {
            return super.onTouchEvent(motionEvent);
        }
        int offsetForHorizontal = layout2.getOffsetForHorizontal(layout2.getLineForVertical((int) (motionEvent.getY() - ((float) getPaddingTop()))), motionEvent.getX() - ((float) getPaddingLeft()));
        float f = (float) 2;
        int coerceAtLeast = RangesKt.coerceAtLeast(offsetForHorizontal - MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0);
        int coerceAtMost = RangesKt.coerceAtMost(g63.b(f, vo4.c().getDisplayMetrics().density, offsetForHorizontal), text.length());
        Object[] objArr = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                objArr = spanned.getSpans(coerceAtLeast, coerceAtMost, ClickableSpan.class);
            }
        } catch (Throwable unused) {
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) objArr;
        if (clickableSpanArr == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (!(!(clickableSpanArr.length == 0))) {
            return super.onTouchEvent(motionEvent);
        }
        clickableSpanArr[0].onClick(this);
        return true;
    }

    public final void setCollapsedLines(int i) {
        this.w = i;
    }

    public final void setExpandWithAnimation(boolean z2) {
        this.w0 = z2;
    }

    public final void setText(SpannableString spannableString) {
        this.v = spannableString;
    }

    public final void setTextColor(int i) {
        this.o.setColor(i);
        invalidate();
    }

    public final void setTypography(ogf ogf) {
        this.c = ogf;
        invalidate();
        requestLayout();
    }

    public final void setText(CharSequence charSequence) {
        gge gge;
        fu4.k.e(getContext()).f().getText().getClass();
        Spannable p = bk3.p(charSequence, -16745729, 24);
        if (p != null) {
            int i = gge.a;
            gge = sq6.A(p, true);
        } else {
            gge = null;
        }
        this.v = gge;
        this.x0 = false;
        this.v0 = false;
        c();
    }
}
