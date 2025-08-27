package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* renamed from: h69  reason: default package */
public final class h69 extends ClickableSpan {
    public final int a;
    public final IntRange b;
    public final int c;
    public final Function2 o;

    public h69(int i, IntRange intRange, int i2, qo3 qo3) {
        this.a = i;
        this.b = intRange;
        this.c = i2;
        this.o = qo3;
    }

    public final void onClick(View view) {
        this.o.invoke(view, this);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.bgColor = this.a;
    }
}
