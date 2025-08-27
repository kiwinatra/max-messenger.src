package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.Unit;

/* renamed from: lq0  reason: default package */
public final class lq0 extends ClickableSpan {
    public final String a;
    public final int b;
    public ly7 c;

    public lq0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void onClick(View view) {
        ly7 ly7 = this.c;
        if (ly7 != null) {
            sy7 sy7 = sy7.c;
            ClickableSpan clickableSpan = (ClickableSpan) ly7.b;
            qy7 qy7 = ly7.a;
            a94 a94 = qy7.e;
            if (a94.b) {
                a94.b = false;
                ny7 ny7 = qy7.a;
                if (ny7 == null) {
                    ny7 = view instanceof ny7 ? (ny7) view : null;
                }
                if (ny7 != null) {
                    ny7.X(this.a, sy7, clickableSpan, (View) null);
                }
                Unit unit = Unit.INSTANCE;
                view.postDelayed(new cf(14, (nm1) a94.c), a94.a);
            }
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}
