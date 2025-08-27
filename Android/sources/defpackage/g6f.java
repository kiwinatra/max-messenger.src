package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* renamed from: g6f  reason: default package */
public final class g6f extends xl7 implements phf {
    public final Lazy X;
    public boolean Y = true;
    public boolean Z = true;
    public final RectF v0 = new RectF();
    public final WeakReference w;
    public final Paint w0;
    public final Context x;
    public final Paint x0;
    public final Function0 y;
    public PorterDuffColorFilter y0;
    public final Function1 z;
    public final Lazy z0;

    public g6f(Lazy lazy, WeakReference weakReference, hn hnVar, gn9 gn9, hn9 hn9) {
        super(0, 4);
        this.w = weakReference;
        this.x = hnVar;
        this.y = gn9;
        this.z = hn9;
        this.X = lazy;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.w0 = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.x0 = paint2;
        fu4.k.e(hnVar).f().getIcon().getClass();
        this.y0 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.z0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new vra(28, lazy, this));
    }

    public final void a(RecyclerView recyclerView, pzc pzc) {
        super.a(recyclerView, pzc);
        this.Z = true;
        this.Y = true;
    }

    public final float d(float f) {
        return Float.MAX_VALUE;
    }

    public final float e() {
        return 1.0f;
    }

    public final boolean g() {
        return ((Boolean) this.y.invoke()).booleanValue();
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, pzc pzc, float f, float f2, int i, boolean z2) {
        float f3;
        Canvas canvas2 = canvas;
        pzc pzc2 = pzc;
        if (pzc2 instanceof d99) {
            d99 d99 = (d99) pzc2;
            hcg hcg = d99.I0;
            hcg.getClass();
            if (hcg == hcg.Send || hcg == hcg.Seen || hcg == hcg.None) {
                float coerceIn = RangesKt.coerceIn(f, -(vo4.c().getDisplayMetrics().density * 96.0f), (float) c44.DEFAULT_ASPECT_RATIO);
                super.h(canvas, recyclerView, pzc, coerceIn, f2, i, z2);
                float abs = Math.abs(coerceIn) / (vo4.c().getDisplayMetrics().density * 96.0f);
                Paint paint = this.w0;
                paint.setAlpha((int) (((float) KotlinVersion.MAX_COMPONENT_VALUE) * abs));
                paint.setColorFilter(this.y0);
                js9 js9 = fu4.k;
                Context context = this.x;
                int alpha = Color.alpha(js9.e(context).f().a().l().a.g);
                Paint paint2 = this.x0;
                paint2.setColor(js9.e(context).f().a().l().a.g);
                paint2.setAlpha((int) (((float) alpha) * abs));
                View view = d99.G0;
                float right = (vo4.c().getDisplayMetrics().density * 8.0f) + ((float) view.getRight()) + coerceIn + ((((float) 1) - abs) * vo4.c().getDisplayMetrics().density * 32.0f) + (vo4.c().getDisplayMetrics().density * 20.0f);
                View view2 = pzc2.a;
                int bottom = ((RecyclerView) view2.getParent()).getBottom();
                float f4 = (vo4.c().getDisplayMetrics().density * 20.0f) + (vo4.c().getDisplayMetrics().density * 8.0f);
                float f5 = (vo4.c().getDisplayMetrics().density * 20.0f) + f4;
                if (((float) view.getHeight()) < f5 || ((float) (bottom - view2.getTop())) < f5) {
                    float top = (vo4.c().getDisplayMetrics().density * 20.0f) + ((float) view2.getTop());
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    f3 = top + ((float) (marginLayoutParams != null ? marginLayoutParams.topMargin : 0));
                } else if (view2.getBottom() < bottom) {
                    float bottom2 = (float) view2.getBottom();
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    f3 = bottom2 - (((float) (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0)) + f4);
                } else {
                    f3 = ((float) bottom) - f4;
                }
                canvas2.drawCircle(right, f3, vo4.c().getDisplayMetrics().density * 20.0f, paint2);
                RectF rectF = this.v0;
                float f6 = (vo4.c().getDisplayMetrics().density * 20.0f) / 2.0f;
                rectF.set(right - f6, f3 - f6, right + f6, f3 + f6);
                canvas2.drawBitmap((Bitmap) this.z0.getValue(), (Rect) null, rectF, paint);
                boolean z3 = coerceIn < (-(vo4.c().getDisplayMetrics().density * 70.0f));
                WeakReference weakReference = this.w;
                if (z3 && this.Y) {
                    View view3 = (View) weakReference.get();
                    if (view3 != null) {
                        b0h.K(view3, qw6.CONFIRM);
                    }
                    this.Y = false;
                } else if (!z3) {
                    this.Y = true;
                }
                if (!z2 && coerceIn < (-(vo4.c().getDisplayMetrics().density * 70.0f)) && this.Z) {
                    this.Z = false;
                    View view4 = (View) weakReference.get();
                    if (view4 != null) {
                        view4.post(new uo5(17, (Object) view4, (Object) view4));
                    }
                    this.z.invoke(Integer.valueOf(d99.q()));
                }
            }
        }
    }

    public final boolean i(pzc pzc, pzc pzc2) {
        return false;
    }

    public final void onThemeChanged(k2b k2b) {
        this.y0 = new PorterDuffColorFilter(k2b.getIcon().f, PorterDuff.Mode.SRC_IN);
    }
}
