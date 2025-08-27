package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: fr  reason: default package */
public final class fr extends zyc {
    public final /* synthetic */ int a;

    public /* synthetic */ fr(int i) {
        this.a = i;
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, lzc lzc) {
        int S;
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int S2 = RecyclerView.S(view);
                tyc adapter = recyclerView.getAdapter();
                lr0 lr0 = null;
                Integer valueOf = adapter != null ? Integer.valueOf(adapter.j()) : null;
                if (S2 != -1 && valueOf != null) {
                    view.setClipToOutline(true);
                    if (S2 == 0) {
                        lr0 = new lr0(vo4.c().getDisplayMetrics().density * 16.0f, 1);
                    } else if (S2 == valueOf.intValue() - 1) {
                        lr0 = new lr0(vo4.c().getDisplayMetrics().density * 16.0f, 0);
                    }
                    view.setOutlineProvider(lr0);
                    return;
                }
                return;
            case 1:
                recyclerView.getClass();
                int S3 = RecyclerView.S(view);
                if (ct.z(view)) {
                    rect.right = MathKt.roundToInt((S3 == 0 ? (float) 16 : (float) 8) * vo4.c().getDisplayMetrics().density);
                    return;
                } else {
                    rect.left = MathKt.roundToInt((S3 == 0 ? (float) 16 : (float) 8) * vo4.c().getDisplayMetrics().density);
                    return;
                }
            case 2:
                pzc U = recyclerView.U(view);
                if (U != null) {
                    int i = U.w;
                    if (i == hra.a || i == hra.b || i == hra.u || i == hra.v) {
                        float f = (float) 6;
                        rect.set(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                recyclerView.getClass();
                int S4 = RecyclerView.S(view);
                rect.set((S4 == -1 || S4 == 0) ? 0 : MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density), rect.right, 0);
                return;
            case 4:
                super.f(rect, view, recyclerView, lzc);
                tyc adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && (S = RecyclerView.S(view)) > 0) {
                    int l = adapter2.l(S);
                    if ((l == rra.m || l == rra.s) && adapter2.l(S - 1) == wua.c) {
                        rect.top = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                recyclerView.getClass();
                int S5 = RecyclerView.S(view);
                tyc adapter3 = recyclerView.getAdapter();
                Integer valueOf2 = adapter3 != null ? Integer.valueOf(adapter3.j()) : null;
                if (S5 != -1 && valueOf2 != null) {
                    int i2 = 0;
                    rect.top = S5 == 0 ? MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density) : 0;
                    float f2 = (float) 12;
                    rect.left = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
                    rect.right = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density);
                    if (S5 == valueOf2.intValue() - 1) {
                        i2 = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                    }
                    rect.bottom = i2;
                    return;
                }
                return;
            case 6:
                recyclerView.getClass();
                int S6 = RecyclerView.S(view);
                tyc adapter4 = recyclerView.getAdapter();
                Integer valueOf3 = adapter4 != null ? Integer.valueOf(adapter4.j()) : null;
                if (S6 != -1 && valueOf3 != null) {
                    rect.top = S6 == 0 ? MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density) : 0;
                    return;
                }
                return;
            case 7:
                tyc adapter5 = recyclerView.getAdapter();
                if (adapter5 != null) {
                    if (RecyclerView.S(view) != adapter5.j() - 1) {
                    }
                    rect.left = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
                    rect.top = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
                    rect.right = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
                    rect.bottom = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                    return;
                }
                return;
            case 8:
                recyclerView.getClass();
                if (RecyclerView.S(view) != -1 && (view instanceof OneMeButton)) {
                    rect.set(rect.left, MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density), rect.right, rect.bottom);
                    return;
                }
                return;
            default:
                recyclerView.getClass();
                int S7 = RecyclerView.S(view);
                if (S7 != -1 && S7 != 0 && (view instanceof AppCompatTextView)) {
                    rect.set(rect.left, MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density), rect.right, rect.bottom);
                    return;
                }
                return;
        }
    }
}
