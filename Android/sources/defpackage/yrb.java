package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import kotlin.math.MathKt;

/* renamed from: yrb  reason: default package */
public final class yrb implements View.OnLayoutChangeListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ View c;

    public yrb(View view, float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = view;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        int roundToInt = MathKt.roundToInt(this.a);
        int roundToInt2 = MathKt.roundToInt(this.b);
        View view2 = this.c;
        View rootView = view2.getRootView();
        Rect rect = zrb.a;
        rootView.getWindowVisibleDisplayFrame(rect);
        if (Build.VERSION.SDK_INT >= 30) {
            rect.bottom -= rootView.getRootWindowInsets().getInsets(8).bottom;
        }
        float f = (float) 8;
        int e = a81.e(f, vo4.c().getDisplayMetrics().density, rect.bottom - roundToInt2);
        int e2 = a81.e(f, vo4.c().getDisplayMetrics().density, rect.top + roundToInt2);
        int measuredHeight = view2.getMeasuredHeight();
        if (e > measuredHeight) {
            roundToInt2 = g63.b(f, vo4.c().getDisplayMetrics().density, roundToInt2);
        } else if (e2 > measuredHeight) {
            roundToInt2 = a81.e(f, vo4.c().getDisplayMetrics().density, roundToInt2 - measuredHeight);
        }
        int measuredWidth = view2.getMeasuredWidth();
        if (roundToInt + measuredWidth >= rootView.getWidth()) {
            roundToInt = (rootView.getWidth() - measuredWidth) - 8;
        }
        view2.setX((float) roundToInt);
        view2.setY((float) roundToInt2);
    }
}
