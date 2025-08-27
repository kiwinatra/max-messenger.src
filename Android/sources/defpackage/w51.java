package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.math.MathKt;

/* renamed from: w51  reason: default package */
public final class w51 extends zyc {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ w51(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, lzc lzc) {
        int S;
        int S2;
        switch (this.a) {
            case 0:
                tyc adapter = recyclerView.getAdapter();
                if (adapter != null && (S = RecyclerView.S(view)) >= 0 && S <= adapter.j() && view.getLayoutParams().width != 0) {
                    int i = this.b;
                    rect.bottom = i;
                    rect.top = i;
                    rect.left = i;
                    rect.right = i;
                    return;
                }
                return;
            case 1:
                tyc adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && (S2 = RecyclerView.S(view)) >= 0 && S2 <= adapter2.j()) {
                    int i2 = this.b;
                    rect.bottom = i2;
                    rect.top = i2;
                    rect.left = i2;
                    rect.right = i2;
                    return;
                }
                return;
            case 2:
                recyclerView.getClass();
                int S3 = RecyclerView.S(view);
                int i3 = this.b;
                if (S3 == 0) {
                    rect.top += i3;
                }
                tyc adapter3 = recyclerView.getAdapter();
                if (S3 == (adapter3 != null ? adapter3.j() : 0) - 1) {
                    rect.bottom = MathKt.roundToInt(((double) i3) * 1.0d) + rect.bottom;
                    return;
                }
                return;
            case 3:
                int i4 = this.b;
                rect.bottom = i4;
                rect.top = i4;
                rect.right = i4;
                rect.left = i4;
                return;
            case 4:
                recyclerView.getClass();
                int S4 = RecyclerView.S(view);
                int b2 = lzc.b() - 1;
                int i5 = this.b;
                if (S4 == b2) {
                    rect.left = i5;
                    rect.right = 0;
                    return;
                } else if (RecyclerView.S(view) == 0) {
                    rect.left = 0;
                    rect.right = i5;
                    return;
                } else {
                    rect.left = i5;
                    rect.right = i5;
                    return;
                }
            case 5:
                int i6 = this.b;
                rect.right = i6;
                rect.left = i6;
                return;
            default:
                recyclerView.getClass();
                int S5 = RecyclerView.S(view);
                int b3 = lzc.b() - 1;
                int i7 = this.b;
                if (S5 == b3) {
                    rect.bottom = i7;
                    rect.top = 0;
                }
                if (RecyclerView.S(view) == 0) {
                    rect.top = i7;
                    rect.bottom = 0;
                    return;
                }
                return;
        }
    }
}
