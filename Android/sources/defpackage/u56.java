package defpackage;

import android.view.View;
import kotlin.math.MathKt;
import kotlin.uuid.Uuid;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

/* renamed from: u56  reason: default package */
public final class u56 extends OneMeEmptyView {
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(a81.f((float) 12, vo4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i2)) - MathKt.roundToInt(((float) Uuid.SIZE_BITS) * vo4.c().getDisplayMetrics().density), 1073741824));
    }
}
