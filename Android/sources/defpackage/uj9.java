package defpackage;

import android.text.TextPaint;
import kotlin.Lazy;
import kotlin.Pair;

/* renamed from: uj9  reason: default package */
public final class uj9 extends tb8 {
    public final /* synthetic */ Lazy g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uj9(int i, Lazy lazy) {
        super(i);
        this.g = lazy;
    }

    public final Object a(Object obj) {
        Pair pair = (Pair) obj;
        int intValue = ((Number) pair.component1()).intValue();
        float floatValue = ((Number) pair.component2()).floatValue();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setAntiAlias(true);
        textPaint.setColor(intValue);
        textPaint.setTextSize(floatValue);
        textPaint.linkColor = ((et0) this.g.getValue()).c();
        return textPaint;
    }
}
