package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* renamed from: mnd  reason: default package */
public final class mnd extends zyc implements phf {
    public final float[] X;
    public final Path Y;
    public final pl7 Z;
    public final knd a;
    public final int b;
    public final Function1 c;
    public final Paint o;
    public final RectF v;
    public final Rect w;
    public final ez9 x;
    public final ez9 y;
    public final ez9 z;

    public mnd(k2b k2b, knd knd, h9 h9Var, int i) {
        int i2 = (i & 4) != 0 ? 4 : 0;
        Function1 duc = (i & 8) != 0 ? new duc(4) : h9Var;
        this.a = knd;
        this.b = i2;
        this.c = duc;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.o = paint;
        this.v = new RectF();
        this.w = new Rect();
        ez9 ez9 = ri7.a;
        this.x = new ez9();
        this.y = new ez9();
        this.z = new ez9();
        this.X = new float[8];
        this.Y = new Path();
        this.Z = new pl7(0);
        onThemeChanged(k2b);
    }

    public static final void i(mnd mnd, Canvas canvas) {
        Path path = mnd.Y;
        RectF rectF = mnd.v;
        Path.Direction direction = Path.Direction.CCW;
        float[] fArr = mnd.X;
        path.addRoundRect(rectF, fArr, direction);
        Path path2 = mnd.Y;
        canvas.drawPath(path2, mnd.o);
        path2.reset();
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        ArraysKt___ArraysJvmKt.fill$default(fArr, (float) c44.DEFAULT_ASPECT_RATIO, 0, 0, 6, (Object) null);
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, lzc lzc) {
        Rect rect2 = rect;
        View view2 = view;
        recyclerView.getClass();
        int S = RecyclerView.S(view);
        if (S != -1) {
            jnd j = this.a.j(S);
            ez9 ez9 = this.x;
            ez9.h(S);
            ez9 ez92 = this.y;
            ez92.h(S);
            ez9 ez93 = this.z;
            ez93.h(S);
            int i = j == null ? -1 : lnd.$EnumSwitchMapping$0[j.ordinal()];
            if (i != -1) {
                int i2 = this.b;
                if (i == 1) {
                    rect2.top = g63.b((float) i2, vo4.c().getDisplayMetrics().density, rect2.top);
                    ez9.b(S);
                    i5d i5d = view2 instanceof i5d ? (i5d) view2 : null;
                    if (i5d != null) {
                        i5d.setRippleMask(new RoundRectShape(new float[]{vo4.c().getDisplayMetrics().density * 16.0f, vo4.c().getDisplayMetrics().density * 16.0f, vo4.c().getDisplayMetrics().density * 16.0f, vo4.c().getDisplayMetrics().density * 16.0f, 0.0f, 0.0f, 0.0f, 0.0f}, (RectF) null, (float[]) null));
                    }
                } else if (i == 2) {
                    rect2.bottom = g63.b((float) i2, vo4.c().getDisplayMetrics().density, rect2.bottom);
                    ez93.b(S);
                    i5d i5d2 = view2 instanceof i5d ? (i5d) view2 : null;
                    if (i5d2 != null) {
                        i5d2.setRippleMask(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, vo4.c().getDisplayMetrics().density * 16.0f, vo4.c().getDisplayMetrics().density * 16.0f, vo4.c().getDisplayMetrics().density * 16.0f, vo4.c().getDisplayMetrics().density * 16.0f}, (RectF) null, (float[]) null));
                    }
                } else if (i == 3) {
                    float f = (float) i2;
                    rect2.top = g63.b(f, vo4.c().getDisplayMetrics().density, rect2.top);
                    rect2.bottom = g63.b(f, vo4.c().getDisplayMetrics().density, rect2.bottom);
                    ez9.b(S);
                    ez93.b(S);
                    i5d i5d3 = view2 instanceof i5d ? (i5d) view2 : null;
                    if (i5d3 != null) {
                        i5d3.setRippleMask(new RoundRectShape(new float[]{vo4.c().getDisplayMetrics().density * 16.0f, vo4.c().getDisplayMetrics().density * 16.0f, vo4.c().getDisplayMetrics().density * 16.0f, vo4.c().getDisplayMetrics().density * 16.0f, vo4.c().getDisplayMetrics().density * 16.0f, vo4.c().getDisplayMetrics().density * 16.0f, vo4.c().getDisplayMetrics().density * 16.0f, vo4.c().getDisplayMetrics().density * 16.0f}, (RectF) null, (float[]) null));
                    }
                } else if (i == 4) {
                    ez92.b(S);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            this.Z.c(rect2, view2, recyclerView);
        }
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, lzc lzc) {
        RectF rectF = this.v;
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int S = RecyclerView.S(childAt);
            pl7 pl7 = this.Z;
            Rect rect = this.w;
            pl7.a(rect, childAt, S);
            ez9 ez9 = this.x;
            boolean a2 = ez9.a(S);
            int i2 = this.b;
            float[] fArr = this.X;
            if (a2) {
                float f = vo4.c().getDisplayMetrics().density * 16.0f;
                fArr[0] = f;
                fArr[1] = f;
                fArr[2] = f;
                fArr[3] = f;
                rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
                int i3 = -MathKt.roundToInt(((float) i2) * vo4.c().getDisplayMetrics().density);
                Drawable background = childAt.getBackground();
                RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                if (rippleDrawable != null) {
                    kne.P(rippleDrawable, 0, i3, 0, 13);
                }
            }
            boolean a3 = this.y.a(S);
            ez9 ez92 = this.z;
            if (a3 || ez92.a(S)) {
                rectF.left = Math.min(rectF.left, (float) rect.left);
                rectF.top = Math.min(rectF.top, (float) rect.top);
                rectF.right = Math.max(rectF.right, (float) rect.right);
                rectF.bottom = Math.max(rectF.bottom, (float) rect.bottom);
                if (ez92.a(S)) {
                    float f2 = vo4.c().getDisplayMetrics().density * 16.0f;
                    fArr[4] = f2;
                    fArr[5] = f2;
                    fArr[6] = f2;
                    fArr[7] = f2;
                    int e = ez9.a(S) ? a81.e((float) i2, vo4.c().getDisplayMetrics().density, rect.height()) : rect.height();
                    Drawable background2 = childAt.getBackground();
                    RippleDrawable rippleDrawable2 = background2 instanceof RippleDrawable ? (RippleDrawable) background2 : null;
                    if (rippleDrawable2 != null) {
                        kne.P(rippleDrawable2, 0, 0, e, 7);
                    }
                    i(this, canvas);
                }
            }
        }
        if (rectF.height() > c44.DEFAULT_ASPECT_RATIO) {
            i(this, canvas);
        }
    }

    public final void onThemeChanged(k2b k2b) {
        this.o.setColor(((Number) this.c.invoke(k2b)).intValue());
    }
}
