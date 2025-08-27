package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* renamed from: my7  reason: default package */
public final class my7 extends URLSpan {
    public ny7 a = null;
    public int b;
    public final boolean c;
    public final boolean o;
    public final a94 v;

    public my7(String str, int i, boolean z, boolean z2) {
        super(str);
        this.b = i;
        this.c = z;
        this.o = z2;
        this.v = new a94();
    }

    public final void onClick(View view) {
        this.v.b(view, new j35(18, (Object) view, (Object) this));
    }

    public final void updateDrawState(TextPaint textPaint) {
        int i = textPaint.bgColor;
        int i2 = this.b;
        if (i != i2) {
            textPaint.setColor(i2);
        }
        textPaint.setUnderlineText(this.c);
        if (this.o) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
    }
}
