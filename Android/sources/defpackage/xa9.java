package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: xa9  reason: default package */
public final class xa9 extends ClickableSpan {
    public final ta9 a;
    public int b;
    public py7 c;

    public xa9(ta9 ta9, int i) {
        this.a = ta9;
        this.b = i;
    }

    public final void onClick(View view) {
        py7 py7 = this.c;
        if (py7 != null) {
            qy7 qy7 = py7.a;
            qy7.e.b(view, new sz0((Object) qy7, (Object) view, (Object) this.a, 4));
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}
