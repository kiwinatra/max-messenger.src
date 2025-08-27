package defpackage;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* renamed from: awf  reason: default package */
public final class awf implements Spannable {
    public boolean a = false;
    public Spannable b;

    public awf(Spannable spannable) {
        this.b = spannable;
    }

    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    public final IntStream chars() {
        return this.b.chars();
    }

    public final IntStream codePoints() {
        return this.b.codePoints();
    }

    public final int getSpanEnd(Object obj) {
        return this.b.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.b.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.b.getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.b.getSpans(i, i2, cls);
    }

    public final int length() {
        return this.b.length();
    }

    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.b.nextSpanTransition(i, i2, cls);
    }

    public final void removeSpan(Object obj) {
        Spannable spannable = this.b;
        if (!this.a && (spannable instanceof PrecomputedText)) {
            this.b = new SpannableString(spannable);
        }
        this.a = true;
        this.b.removeSpan(obj);
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.b;
        if (!this.a && (spannable instanceof PrecomputedText)) {
            this.b = new SpannableString(spannable);
        }
        this.a = true;
        this.b.setSpan(obj, i, i2, i3);
    }

    public final CharSequence subSequence(int i, int i2) {
        return this.b.subSequence(i, i2);
    }

    public final String toString() {
        return this.b.toString();
    }
}
