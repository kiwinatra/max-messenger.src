package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* renamed from: fz2  reason: default package */
public final class fz2 extends zyc implements phf {
    public final Function0 a;
    public final Function1 b;
    public final Function1 c;
    public final Function1 o;
    public Drawable v;
    public final Rect w = new Rect();
    public final Rect x = new Rect();
    public final int[] y = {16842912};
    public final int[] z = {-16842912};

    public fz2(Function0 function0, Function1 function1, Function1 function12, Function1 function13) {
        this.a = function0;
        this.b = function1;
        this.c = function12;
        this.o = function13;
        this.v = (Drawable) function0.invoke();
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, lzc lzc) {
        recyclerView.getClass();
        if (((Boolean) this.c.invoke(Integer.valueOf(RecyclerView.S(view)))).booleanValue()) {
            rect.left = g63.b((float) 36, vo4.c().getDisplayMetrics().density, rect.left);
        }
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, lzc lzc) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((Boolean) this.c.invoke(Integer.valueOf(i))).booleanValue()) {
                Drawable background = recyclerView.getChildAt(i).getBackground();
                RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                if (rippleDrawable != null) {
                    kne.P(rippleDrawable, MathKt.roundToInt(((float) -36) * vo4.c().getDisplayMetrics().density), 0, 0, 14);
                }
            }
        }
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        int roundToInt2 = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density) / 2;
        int i = 0;
        while (true) {
            if (i < recyclerView.getChildCount()) {
                int i2 = i + 1;
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    recyclerView.getClass();
                    int S = RecyclerView.S(childAt);
                    if (((Boolean) this.o.invoke(Integer.valueOf(S))).booleanValue()) {
                        Rect rect = this.w;
                        RecyclerView.W(rect, childAt);
                        Rect rect2 = this.x;
                        childAt.getDrawingRect(rect2);
                        int height = (rect.height() - rect2.height()) / 2;
                        this.v.setAlpha(MathKt.roundToInt(childAt.getAlpha() * ((float) KotlinVersion.MAX_COMPONENT_VALUE)));
                        if (((Boolean) this.b.invoke(Integer.valueOf(S))).booleanValue()) {
                            Drawable drawable = this.v;
                            drawable.setState(this.y);
                            drawable.setBounds(rect.left + roundToInt, (rect.centerY() - roundToInt2) + height, (roundToInt2 * 2) + rect.left + roundToInt, rect.centerY() + roundToInt2 + height);
                            drawable.draw(canvas);
                        } else {
                            Drawable drawable2 = this.v;
                            drawable2.setState(this.z);
                            drawable2.setBounds(rect.left + roundToInt, (rect.centerY() - roundToInt2) + height, (roundToInt2 * 2) + rect.left + roundToInt, rect.centerY() + roundToInt2 + height);
                            drawable2.draw(canvas);
                        }
                    }
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                return;
            }
        }
    }

    public final void onThemeChanged(k2b k2b) {
        this.v = (Drawable) this.a.invoke();
    }
}
