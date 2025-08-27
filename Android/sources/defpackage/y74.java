package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: y74  reason: default package */
public final class y74 extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ z74 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y74(z74 z74, int i) {
        super(null);
        this.a = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.b = z74;
                super(bool);
                return;
            default:
                this.b = z74;
                return;
        }
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                if (!Intrinsics.areEqual((Object) (CharSequence) obj, (Object) charSequence) && charSequence != null && charSequence.length() != 0) {
                    z74 z74 = this.b;
                    BoringLayout.Metrics a2 = z74.getMetrics();
                    TextPaint textPaint = z74.C0;
                    a2.width = MathKt.roundToInt(textPaint.measureText(charSequence, 0, charSequence.length()));
                    textPaint.setColor(z74.y);
                    z74.x0 = BoringLayout.make(charSequence, textPaint, a2.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, c44.DEFAULT_ASPECT_RATIO, a2, false);
                    z74.invalidate();
                    z74.requestLayout();
                    return;
                }
                return;
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    z74 z742 = this.b;
                    z742.d(z742.v0);
                    z742.invalidate();
                    return;
                }
                return;
        }
    }
}
