package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import kotlin.math.MathKt;

/* renamed from: n27  reason: default package */
public final class n27 extends zyc {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public n27(fl2 fl2) {
        this.b = fl2;
    }

    public void f(Rect rect, View view, RecyclerView recyclerView, lzc lzc) {
        switch (this.a) {
            case 2:
                super.f(rect, view, recyclerView, lzc);
                recyclerView.getClass();
                int S = RecyclerView.S(view);
                fl2 fl2 = (fl2) this.b;
                Character d = fl2.d(S);
                if (d != null) {
                    char charValue = d.charValue();
                    if (S > 0) {
                        Character d2 = fl2.d(S - 1);
                        if (d2 == null || charValue != d2.charValue()) {
                            rect.top = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.f(rect, view, recyclerView, lzc);
                return;
        }
    }

    public void g(Canvas canvas, RecyclerView recyclerView, lzc lzc) {
        switch (this.a) {
            case 1:
                if ((recyclerView.getAdapter() instanceof krg) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    krg krg = (krg) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    ((MaterialCalendar) this.b).getClass();
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int bottom = childAt.getBottom() + ((bzc) childAt.getLayoutParams()).bottomMargin;
                    Drawable drawable = (Drawable) this.b;
                    drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                    drawable.draw(canvas);
                }
                return;
            default:
                return;
        }
    }

    public n27(ColorDrawable colorDrawable) {
        this.b = colorDrawable.mutate();
    }

    public n27(MaterialCalendar materialCalendar) {
        this.b = materialCalendar;
        q0g.d((Calendar) null);
        q0g.d((Calendar) null);
    }
}
