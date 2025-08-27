package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: iz5  reason: default package */
public final class iz5 extends zyc {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final int c;
    public final Object o;

    public iz5(int i, t68 t68) {
        this.b = i;
        this.o = t68;
        this.c = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, lzc lzc) {
        GridLayoutManager u;
        xu6 xu6;
        int S;
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int S2 = RecyclerView.S(view);
                tyc adapter = recyclerView.getAdapter();
                if (adapter != null && S2 >= 0 && S2 < adapter.j()) {
                    int i = this.c;
                    rect.left = i;
                    rect.right = i;
                    jnd j = ((knd) this.o).j(S2);
                    if (j == null || j == jnd.a || j == jnd.o) {
                        rect.top = this.b;
                        return;
                    }
                    return;
                }
                return;
            default:
                tyc adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && (u = y7e.u(recyclerView)) != null && (xu6 = u.K) != null && (S = RecyclerView.S(view)) >= 0 && S < adapter2.j()) {
                    int b2 = xu6.b(S, 8);
                    int a2 = xu6.a(S, 8);
                    int a3 = xu6.a(adapter2.j() - 1, 8);
                    int i2 = this.c / 2;
                    if (((Boolean) ((Function0) this.o).invoke()).booleanValue()) {
                        if (a2 == 0) {
                            rect.bottom = i2;
                        } else if (a2 == a3) {
                            rect.top = i2;
                        } else {
                            rect.bottom = i2;
                            rect.top = i2;
                        }
                    }
                    int i3 = this.b;
                    rect.left = (b2 * i3) / 8;
                    rect.right = i3 - (((b2 + 1) * i3) / 8);
                    return;
                }
                return;
        }
    }

    public iz5(lc5 lc5) {
        this.o = lc5;
        this.b = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        this.c = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
    }
}
