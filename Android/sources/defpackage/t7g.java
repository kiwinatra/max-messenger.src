package defpackage;

import android.content.Context;
import android.view.View;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: t7g  reason: default package */
public final class t7g extends OneMeDraweeView {
    public final int[] A0 = new int[2];
    public b3g B0;

    public t7g(Context context) {
        super(context);
    }

    public final void onMeasure(int i, int i2) {
        b3g b3g = this.B0;
        if (b3g == null || View.MeasureSpec.getMode(i2) == 1073741824) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = b3g.c;
        int i4 = b3g.d;
        int[] iArr = this.A0;
        ryg.p(size, size2, i3, i4, iArr);
        setMeasuredDimension(iArr[0], iArr[1]);
    }
}
