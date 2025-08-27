package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* renamed from: kuf  reason: default package */
public final class kuf extends ReplacementSpan {
    public static TextPaint w;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public final juf b;
    public short c = -1;
    public float o = 1.0f;
    public TextPaint v;

    public kuf(juf juf) {
        bs0.q(juf, "rasterizer cannot be null");
        this.b = juf;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        CharSequence charSequence2 = charSequence;
        int i6 = i3;
        int i7 = i5;
        TextPaint textPaint = paint;
        TextPaint textPaint2 = null;
        if (charSequence2 instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence2).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (!(characterStyleArr.length == 1 && characterStyleArr[0] == this)) {
                    TextPaint textPaint3 = this.v;
                    if (textPaint3 == null) {
                        textPaint3 = new TextPaint();
                        this.v = textPaint3;
                    }
                    textPaint2 = textPaint3;
                    textPaint2.set(textPaint);
                    for (CharacterStyle updateDrawState : characterStyleArr) {
                        updateDrawState.updateDrawState(textPaint2);
                    }
                }
            }
            if (textPaint instanceof TextPaint) {
                textPaint2 = (TextPaint) textPaint;
            }
        } else if (textPaint instanceof TextPaint) {
            textPaint2 = (TextPaint) textPaint;
        }
        TextPaint textPaint4 = textPaint2;
        if (!(textPaint4 == null || textPaint4.bgColor == 0)) {
            int color = textPaint4.getColor();
            Paint.Style style = textPaint4.getStyle();
            textPaint4.setColor(textPaint4.bgColor);
            textPaint4.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, (float) i6, f + ((float) this.c), (float) i7, textPaint4);
            textPaint4.setStyle(style);
            textPaint4.setColor(color);
        }
        if (s15.a().k) {
            float f2 = (float) i6;
            float f3 = f + ((float) this.c);
            float f4 = (float) i7;
            if (w == null) {
                TextPaint textPaint5 = new TextPaint();
                w = textPaint5;
                textPaint5.setColor(s15.a().l);
                w.setStyle(Paint.Style.FILL);
            }
            canvas.drawRect(f, f2, f3, f4, w);
        }
        float f5 = (float) i4;
        if (textPaint4 != null) {
            textPaint = textPaint4;
        }
        juf juf = this.b;
        gq9 gq9 = juf.b;
        Typeface typeface = gq9.d;
        Typeface typeface2 = textPaint.getTypeface();
        textPaint.setTypeface(typeface);
        canvas.drawText(gq9.b, juf.a * 2, 2, f, f5, textPaint);
        textPaint.setTypeface(typeface2);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        juf juf = this.b;
        yp9 c2 = juf.c();
        int a2 = c2.a(14);
        short s = 0;
        this.o = abs / ((float) (a2 != 0 ? ((ByteBuffer) c2.d).getShort(a2 + c2.a) : 0));
        yp9 c3 = juf.c();
        int a3 = c3.a(14);
        if (a3 != 0) {
            ((ByteBuffer) c3.d).getShort(a3 + c3.a);
        }
        yp9 c4 = juf.c();
        int a4 = c4.a(12);
        if (a4 != 0) {
            s = ((ByteBuffer) c4.d).getShort(a4 + c4.a);
        }
        short s2 = (short) ((int) (((float) s) * this.o));
        this.c = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
