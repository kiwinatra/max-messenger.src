package ru.ok.onechat.widgets;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.math.MathKt;

public class NumberTextView extends View {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final TextPaint c = new TextPaint(1);
    public ObjectAnimator o;
    public float v = c44.DEFAULT_ASPECT_RATIO;
    public float v0 = 255.0f;
    public int w = 1;
    public boolean x;
    public float y;
    public float z;

    public NumberTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        if (isInEditMode()) {
            a(88);
        }
    }

    public final void a(int i) {
        String str;
        int i2 = i;
        ObjectAnimator objectAnimator = this.o;
        String str2 = null;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.o = null;
        }
        ArrayList arrayList = this.b;
        arrayList.clear();
        ArrayList arrayList2 = this.a;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        Locale locale = Locale.US;
        int i3 = this.w;
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i2);
        String sb4 = sb3.toString();
        TextPaint textPaint = this.c;
        this.y = textPaint.measureText(sb4);
        float measureText = textPaint.measureText(sb2);
        this.z = measureText;
        int i4 = 0;
        boolean z2 = this.x && this.y != measureText;
        boolean z3 = String.valueOf(this.w).length() != String.valueOf(i).length();
        this.w = i2;
        this.v = c44.DEFAULT_ASPECT_RATIO;
        while (i4 < sb4.length()) {
            int i5 = i4 + 1;
            String substring = sb4.substring(i4, i5);
            String substring2 = (arrayList.isEmpty() || i4 >= sb2.length()) ? str2 : sb2.substring(i4, i5);
            if (z2 || substring2 == null || !substring2.equals(substring)) {
                if (!z2 || substring2 != null) {
                    str = substring;
                } else {
                    StaticLayout staticLayout = r7;
                    str = substring;
                    StaticLayout staticLayout2 = new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, c44.DEFAULT_ASPECT_RATIO, false);
                    arrayList.add(staticLayout);
                }
                arrayList2.add(new StaticLayout(str, textPaint, (int) Math.ceil((double) textPaint.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, c44.DEFAULT_ASPECT_RATIO, false));
            } else {
                arrayList2.add((StaticLayout) arrayList.get(i4));
                arrayList.set(i4, str2);
            }
            str2 = null;
            i4 = i5;
        }
        if (z3) {
            requestLayout();
        }
        invalidate();
    }

    public final void b(int i, boolean z2) {
        TextPaint textPaint = this.c;
        if (z2) {
            Lazy lazy = vo4.a;
            getContext();
            textPaint.setTextSize(TypedValue.applyDimension(2, (float) i, vo4.c().getDisplayMetrics()));
        } else {
            textPaint.setTextSize((float) i);
        }
        this.b.clear();
        this.a.clear();
        a(this.w);
    }

    public float getAlpha() {
        return this.v0;
    }

    public float getOldTextWidth() {
        return this.z;
    }

    @Keep
    public float getProgress() {
        return this.v;
    }

    public float getTextWidth() {
        return this.y;
    }

    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        Canvas canvas2 = canvas;
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            float height = (float) ((StaticLayout) arrayList.get(0)).getHeight();
            if (this.x) {
                f2 = (((float) getMeasuredWidth()) - this.y) / 2.0f;
                f = ((((float) getMeasuredWidth()) - this.z) / 2.0f) - f2;
            } else {
                f2 = 0.0f;
                f = 0.0f;
            }
            canvas.save();
            canvas2.translate(((float) getPaddingLeft()) + f2, (((float) getMeasuredHeight()) - height) / 2.0f);
            int size = arrayList.size();
            ArrayList arrayList2 = this.b;
            int max = Math.max(size, arrayList2.size());
            int i = 0;
            while (i < max) {
                canvas.save();
                StaticLayout staticLayout = null;
                StaticLayout staticLayout2 = i < arrayList2.size() ? (StaticLayout) arrayList2.get(i) : null;
                if (i < arrayList.size()) {
                    staticLayout = (StaticLayout) arrayList.get(i);
                }
                float f4 = this.v;
                int i2 = (f4 > c44.DEFAULT_ASPECT_RATIO ? 1 : (f4 == c44.DEFAULT_ASPECT_RATIO ? 0 : -1));
                TextPaint textPaint = this.c;
                if (i2 > 0) {
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) (this.v0 * f4));
                        canvas.save();
                        canvas2.translate(f, (this.v - 1.0f) * height);
                        staticLayout2.draw(canvas2);
                        canvas.restore();
                        if (staticLayout != null) {
                            textPaint.setAlpha((int) (this.v0 * (1.0f - this.v)));
                            canvas2.translate(c44.DEFAULT_ASPECT_RATIO, this.v * height);
                        }
                    } else {
                        textPaint.setAlpha((int) this.v0);
                    }
                } else if (f4 < c44.DEFAULT_ASPECT_RATIO) {
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) (this.v0 * (-f4)));
                        canvas.save();
                        canvas2.translate(f, (this.v + 1.0f) * height);
                        staticLayout2.draw(canvas2);
                        canvas.restore();
                    }
                    if (staticLayout != null) {
                        if (i == max - 1 || staticLayout2 != null) {
                            textPaint.setAlpha((int) ((this.v + 1.0f) * this.v0));
                            canvas2.translate(c44.DEFAULT_ASPECT_RATIO, this.v * height);
                        } else {
                            textPaint.setAlpha((int) this.v0);
                        }
                    }
                } else if (staticLayout != null) {
                    textPaint.setAlpha((int) this.v0);
                }
                if (staticLayout != null) {
                    staticLayout.draw(canvas2);
                }
                canvas.restore();
                if (staticLayout != null) {
                    f3 = staticLayout.getLineMax(0);
                } else {
                    float lineMax = staticLayout2.getLineMax(0);
                    Lazy lazy = vo4.a;
                    Integer num = 1;
                    f3 = lineMax + ((float) MathKt.roundToInt(num.floatValue() * getContext().getResources().getDisplayMetrics().density));
                }
                canvas2.translate(f3, c44.DEFAULT_ASPECT_RATIO);
                if (!(staticLayout == null || staticLayout2 == null)) {
                    f = (staticLayout2.getLineMax(0) - staticLayout.getLineMax(0)) + f;
                }
                i++;
            }
            canvas.restore();
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) this.y, 1073741824), i2);
    }

    public void setAlpha(float f) {
        this.v0 = f * 255.0f;
    }

    public void setBold(boolean z2) {
        this.c.setFakeBoldText(z2);
    }

    public void setCenterAlign(boolean z2) {
        this.x = z2;
    }

    public void setDuration(long j) {
    }

    public void setOnTextWidthProgressChangedListener(uga uga) {
    }

    @Keep
    public void setProgress(float f) {
        if (this.v != f) {
            this.v = f;
            invalidate();
        }
    }

    public void setTextColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public void setTextSize(int i) {
        b(i, true);
    }

    public void setTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
        this.b.clear();
        this.a.clear();
        a(this.w);
    }
}
