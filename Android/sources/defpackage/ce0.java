package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: ce0  reason: default package */
public final class ce0 {
    public final TextPaint a;
    public final wi6 b = new wi6(100, 0);

    public ce0() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setColor(-1);
    }
}
