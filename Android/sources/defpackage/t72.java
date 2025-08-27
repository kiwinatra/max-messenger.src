package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;

/* renamed from: t72  reason: default package */
public final class t72 extends View implements phf {
    public final int a = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
    public final int b;
    public final int c;
    public final TextPaint o;
    public final Drawable v;
    public List w;

    public t72(Context context) {
        super(context, (AttributeSet) null);
        float f = (float) 12;
        this.b = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.c = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
        TextPaint textPaint = new TextPaint(1);
        puf.r.a(textPaint, context.getResources().getDisplayMetrics(), uy4.b);
        this.o = textPaint;
        Drawable b2 = ew3.b(getContext(), cad.h);
        b2.setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        this.v = b2;
        this.w = CollectionsKt.emptyList();
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public final void onDraw(Canvas canvas) {
        String str;
        super.onDraw(canvas);
        TextPaint textPaint = this.o;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int i = this.a;
        int i2 = ((int) (fontMetrics.descent - fontMetrics.ascent)) + i;
        int paddingTop = getPaddingTop() + i;
        for (CharSequence charSequence : this.w) {
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            float f = fontMetrics.ascent;
            float f2 = ((float) paddingTop) - f;
            float f3 = ((f + fontMetrics.descent) / ((float) 2)) + f2;
            int i3 = this.b;
            int paddingLeft = getPaddingLeft();
            int paddingLeft2 = getPaddingLeft() + i3;
            Drawable drawable = this.v;
            drawable.setBounds(paddingLeft, (int) (f3 - ((float) (i3 / 2))), paddingLeft2, (int) (f3 + ((float) (i3 / 2))));
            drawable.draw(canvas);
            canvas.drawText(str, (float) (getPaddingLeft() + i3 + this.c), f2, textPaint);
            paddingTop += i2;
        }
    }

    public final void onMeasure(int i, int i2) {
        String str;
        TextPaint textPaint = this.o;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + ((int) (((float) this.w.size()) * ((fontMetrics.descent - fontMetrics.ascent) + ((float) this.a))));
        Iterable<CharSequence> iterable = this.w;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (CharSequence charSequence : iterable) {
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            arrayList.add(Float.valueOf(textPaint.measureText(str)));
        }
        Float t = CollectionsKt___CollectionsKt.maxOrNull(arrayList);
        setMeasuredDimension(View.resolveSize((int) (((float) (getPaddingLeft() + this.b + this.c)) + (t != null ? t.floatValue() : c44.DEFAULT_ASPECT_RATIO) + ((float) getPaddingRight())), i), View.resolveSize(paddingBottom, i2));
    }

    public final void onThemeChanged(k2b k2b) {
        this.o.setColor(k2b.getText().g);
        this.v.setTint(k2b.a().l().e.g);
        invalidate();
    }
}
