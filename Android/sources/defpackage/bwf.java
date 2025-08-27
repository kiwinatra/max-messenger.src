package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.math.MathKt;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: bwf  reason: default package */
public final class bwf extends zyc implements phf {
    public final xj9 a;
    public final RecyclerView b;
    public long c;
    public final pl7 o = new pl7(0);
    public final Rect v = new Rect();
    public FrameLayout w;
    public uy4 x = uy4.b;

    public bwf(xj9 xj9, EndlessRecyclerView2 endlessRecyclerView2) {
        this.a = xj9;
        this.b = endlessRecyclerView2;
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, lzc lzc) {
        super.f(rect, view, recyclerView, lzc);
        recyclerView.getClass();
        int S = RecyclerView.S(view);
        pl7 pl7 = this.o;
        if (S >= 0) {
            xj9 xj9 = this.a;
            if (S < ((ov) xj9.o).f.size()) {
                long j = this.c;
                if (j != 0) {
                    int L = xj9.L(j);
                    MessageModel N = xj9.N(L);
                    Long valueOf = N != null ? Long.valueOf(N.c) : null;
                    if (L == S && (valueOf == null || valueOf.longValue() != j)) {
                        rect.top = i().getMeasuredHeight() + rect.top;
                    }
                }
                pl7.c(rect, view, recyclerView);
                return;
            }
        }
        pl7.c(rect, view, recyclerView);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int L;
        MessageModel N;
        if (recyclerView.getChildCount() > 0) {
            xj9 xj9 = this.a;
            if (xj9.j() > 0) {
                long j = this.c;
                if (j != 0 && (L = xj9.L(j)) != -1) {
                    int i = 0;
                    while (true) {
                        if (i < recyclerView.getChildCount()) {
                            int i2 = i + 1;
                            View childAt = recyclerView.getChildAt(i);
                            if (childAt != null) {
                                int S = RecyclerView.S(childAt);
                                if (S == L && (N = xj9.N(S)) != null) {
                                    if (N.c != this.c) {
                                        View i3 = i();
                                        pl7 pl7 = this.o;
                                        Rect rect = this.v;
                                        pl7.b(rect, childAt, S);
                                        int i4 = rect.top;
                                        ViewGroup.LayoutParams layoutParams = i3.getLayoutParams();
                                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                                        int i5 = ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) / 2) + i4;
                                        canvas.save();
                                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) i3.getLayoutParams();
                                        int i6 = marginLayoutParams2.leftMargin;
                                        ct.A(i6, marginLayoutParams2.topMargin, (i3.getMeasuredWidth() + i6) - marginLayoutParams2.rightMargin, (i3.getMeasuredHeight() + marginLayoutParams2.topMargin) - marginLayoutParams2.bottomMargin, i3, this.b);
                                        canvas.translate(c44.DEFAULT_ASPECT_RATIO, (float) i5);
                                        i3.draw(canvas);
                                        canvas.restore();
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
            }
        }
    }

    public final View i() {
        FrameLayout frameLayout = this.w;
        if (frameLayout != null) {
            return frameLayout;
        }
        RecyclerView recyclerView = this.b;
        int measuredWidth = recyclerView.getMeasuredWidth();
        int measuredHeight = recyclerView.getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return new Space(recyclerView.getContext());
        }
        FrameLayout frameLayout2 = new FrameLayout(recyclerView.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f = (float) 8;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        layoutParams.topMargin = roundToInt;
        layoutParams.bottomMargin = roundToInt;
        frameLayout2.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        js9 js9 = fu4.k;
        gradientDrawable.setColors(js9.e(frameLayout2.getContext()).f().a().l().a.k);
        frameLayout2.setBackground(gradientDrawable);
        TextView textView = new TextView(recyclerView.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 17);
        int roundToInt2 = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        layoutParams2.topMargin = roundToInt2;
        layoutParams2.bottomMargin = roundToInt2;
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        textView.setTextColor(js9.e(textView.getContext()).f().a().l().b.b);
        textView.setText(textView.getContext().getString(ewa.k0));
        tr2.f.b(textView, this.x);
        frameLayout2.addView(textView);
        frameLayout2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredHeight(), 0, frameLayout2.getLayoutParams().height));
        this.w = frameLayout2;
        return frameLayout2;
    }

    public final void onThemeChanged(k2b k2b) {
        FrameLayout frameLayout;
        if (k2b != null && (frameLayout = this.w) != null) {
            Drawable background = frameLayout.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColors(k2b.a().l().a.k);
            }
            ((TextView) frameLayout.getChildAt(0)).setTextColor(k2b.a().l().b.b);
        }
    }
}
