package defpackage;

import android.text.TextPaint;
import android.util.LruCache;
import kotlin.Pair;

/* renamed from: df9  reason: default package */
public final class df9 extends LruCache {
    public final /* synthetic */ ef9 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public df9(int i, ef9 ef9) {
        super(i);
        this.a = ef9;
    }

    public final Object create(Object obj) {
        Pair pair = (Pair) obj;
        int intValue = ((Number) pair.component1()).intValue();
        float floatValue = ((Number) pair.component2()).floatValue();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setAntiAlias(true);
        textPaint.setColor(intValue);
        textPaint.setTextSize(floatValue);
        textPaint.linkColor = ((et0) this.a.d.getValue()).c();
        return textPaint;
    }
}
