package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;

/* renamed from: r8a  reason: default package */
public final class r8a extends LinearLayout {
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        while (true) {
            if (i < getChildCount()) {
                int i2 = i + 1;
                View childAt = getChildAt(i);
                if (childAt != null) {
                    ((g7e) childAt).b.d();
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                return;
            }
        }
    }

    public final void setTabs(int i) {
        removeAllViews();
        for (int i2 = 0; i2 < i; i2++) {
            g7e g7e = new g7e(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(MathKt.roundToInt(((float) 86) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density));
            float f = (float) 4;
            marginLayoutParams.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
            marginLayoutParams.setMarginEnd(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
            g7e.setLayoutParams(marginLayoutParams);
            g7e.setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 8.0f));
            g7e.setBackgroundColor(fu4.k.e(g7e.getContext()).f().c().i);
            b0h.H(g7e, new sa(3, (Continuation) null, 21));
            addView(g7e, i2);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            int i2 = 0;
            while (true) {
                if (i2 < getChildCount()) {
                    int i3 = i2 + 1;
                    View childAt = getChildAt(i2);
                    if (childAt != null) {
                        ((g7e) childAt).b.c();
                        i2 = i3;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    return;
                }
            }
        } else {
            int i4 = 0;
            while (true) {
                if (i4 < getChildCount()) {
                    int i5 = i4 + 1;
                    View childAt2 = getChildAt(i4);
                    if (childAt2 != null) {
                        ((g7e) childAt2).b.d();
                        i4 = i5;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    return;
                }
            }
        }
    }
}
