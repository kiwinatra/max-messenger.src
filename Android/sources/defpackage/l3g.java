package defpackage;

import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: l3g  reason: default package */
public final class l3g extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3g b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l3g(m3g m3g, int i) {
        super(null);
        this.a = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.b = m3g;
                super(bool);
                return;
            case 2:
                Boolean bool2 = Boolean.TRUE;
                this.b = m3g;
                super(bool2);
                return;
            default:
                this.b = m3g;
                return;
        }
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        Drawable drawable;
        switch (this.a) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                if (!Intrinsics.areEqual((Object) (CharSequence) obj, (Object) charSequence) && charSequence != null && charSequence.length() != 0) {
                    m3g m3g = this.b;
                    BoringLayout.Metrics b2 = m3g.getMetrics();
                    TextPaint textPaint = m3g.C0;
                    b2.width = MathKt.roundToInt(textPaint.measureText(charSequence, 0, charSequence.length()));
                    textPaint.setColor(m3g.z);
                    m3g.y0 = m3g.a.a(charSequence, textPaint, b2.width, 1, false, TextUtils.TruncateAt.END);
                    m3g.invalidate();
                    m3g.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    this.b.invalidate();
                    return;
                }
                return;
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    m3g m3g2 = this.b;
                    if (booleanValue) {
                        drawable = ew3.b(m3g2.getContext(), cad.k2);
                        int i = m3g2.c;
                        drawable.setBounds(0, 0, i, i);
                        drawable.setTint(m3g2.getDrawableColor());
                    } else {
                        drawable = null;
                    }
                    m3g2.x0 = drawable;
                    m3g2.requestLayout();
                    m3g2.invalidate();
                    return;
                }
                return;
        }
    }
}
