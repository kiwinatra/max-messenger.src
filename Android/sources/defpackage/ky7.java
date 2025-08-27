package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.text.StringsKt;

/* renamed from: ky7  reason: default package */
public final class ky7 extends ClickableSpan implements jf8 {
    public int a;
    public final String b;
    public jy7 c;
    public final if8 o = if8.w;

    public ky7(String str, int i) {
        this.a = i;
        this.b = StringsKt.trim((CharSequence) str).toString();
    }

    public final zz3 copy() {
        return new ky7(this.b, this.a);
    }

    public final if8 getType() {
        return this.o;
    }

    public final void onClick(View view) {
        jy7 jy7 = this.c;
        if (jy7 != null) {
            jy7.a(view, this.b);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a);
        textPaint.linkColor = this.a;
        textPaint.setUnderlineText(true);
    }
}
