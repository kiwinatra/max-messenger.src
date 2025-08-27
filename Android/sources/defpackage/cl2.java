package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.math.MathKt;

/* renamed from: cl2  reason: default package */
public final class cl2 extends zyc {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    public cl2(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
                this.c = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                return;
            default:
                this.b = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
                this.c = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                return;
        }
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, lzc lzc) {
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int S = RecyclerView.S(view);
                tyc adapter = recyclerView.getAdapter();
                k1e k1e = adapter instanceof k1e ? (k1e) adapter : null;
                if (k1e != null && S >= 0 && S < k1e.j()) {
                    i1e i1e = (i1e) ((lz7) k1e.E(S));
                    i1e i1e2 = (i1e) k1e.I(S + 1);
                    int i = 0;
                    rect.top = S == 0 ? this.b : 0;
                    if (i1e2 == null || i1e.s() != i1e2.s()) {
                        i = this.c;
                    }
                    rect.bottom = i;
                    return;
                }
                return;
            case 1:
                recyclerView.getClass();
                int S2 = RecyclerView.S(view);
                tyc adapter2 = recyclerView.getAdapter();
                k1e k1e2 = adapter2 instanceof k1e ? (k1e) adapter2 : null;
                if (k1e2 != null && S2 >= 0 && S2 < k1e2.j()) {
                    rect.top = S2 == 0 ? this.b : this.c;
                    return;
                }
                return;
            case 2:
                int i2 = this.b;
                rect.top = i2;
                rect.bottom = i2;
                if (lzc.b() == 1) {
                    rect.left = i2;
                    rect.right = i2;
                    return;
                }
                recyclerView.getClass();
                int S3 = RecyclerView.S(view);
                int b2 = lzc.b() - 1;
                int i3 = this.c;
                if (S3 == b2) {
                    rect.left = i3 / 2;
                    rect.right = i2;
                    return;
                } else if (RecyclerView.S(view) == 0) {
                    rect.left = i2;
                    rect.right = i3 / 2;
                    return;
                } else {
                    int i4 = i3 / 2;
                    rect.left = i4;
                    rect.right = i4;
                    return;
                }
            case 3:
                recyclerView.getClass();
                int S4 = RecyclerView.S(view);
                int i5 = this.b;
                int max = S4 % ((int) Math.max(1.0d, (double) i5));
                int max2 = (int) Math.max(1.0d, (double) i5);
                int i6 = this.c;
                rect.left = (max * i6) / max2;
                rect.right = i6 - (((max + 1) * i6) / max2);
                if (S4 >= max2) {
                    rect.top = i6;
                    return;
                }
                return;
            case 4:
                int i7 = this.c;
                rect.left = i7;
                rect.right = i7;
                rect.top = this.b;
                return;
            case 5:
                recyclerView.getClass();
                int S5 = RecyclerView.S(view);
                int i8 = this.b;
                if (S5 == 0) {
                    rect.right = i8 / 2;
                } else if (S5 == lzc.b() - 1) {
                    rect.left = i8 / 2;
                } else {
                    int i9 = i8 / 2;
                    rect.left = i9;
                    rect.right = i9;
                }
                int i10 = this.c;
                rect.top = i10;
                rect.bottom = i10;
                return;
            default:
                recyclerView.getClass();
                int S6 = RecyclerView.S(view);
                int b3 = lzc.b() - 1;
                int i11 = this.c;
                int i12 = this.b;
                if (S6 == b3) {
                    rect.top = i12;
                    rect.bottom = i11;
                    return;
                } else if (RecyclerView.S(view) == 0) {
                    rect.top = i11;
                    rect.bottom = i12;
                    return;
                } else {
                    rect.top = i12;
                    rect.bottom = i12;
                    return;
                }
        }
    }

    public /* synthetic */ cl2(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
