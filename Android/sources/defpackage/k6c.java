package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: k6c  reason: default package */
public final class k6c extends ClickableSpan {
    public final String a;
    public final int b;
    public oy7 c;

    public k6c(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void onClick(View view) {
        oy7 oy7 = this.c;
        if (oy7 != null) {
            qy7 qy7 = oy7.a;
            qy7.e.b(view, new sz0((Object) qy7, (Object) this.a, (Object) view, 3));
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}
