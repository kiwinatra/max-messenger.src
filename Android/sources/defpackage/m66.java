package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* renamed from: m66  reason: default package */
public final class m66 extends zyc implements phf {
    public final /* synthetic */ int a = 1;
    public final Parcelable b;
    public final pl7 c;
    public final Object o;
    public final Object v;

    public m66(d19 d19) {
        this.o = d19;
        this.b = new Rect();
        TextPaint textPaint = new TextPaint();
        d19.H(textPaint);
        this.v = textPaint;
        this.c = new pl7(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r1 = r3.l(r4);
        r2 = defpackage.gua.l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean i(androidx.recyclerview.widget.RecyclerView r3, int r4) {
        /*
            tyc r3 = r3.getAdapter()
            r0 = 0
            if (r3 != 0) goto L_0x0008
            return r0
        L_0x0008:
            r1 = -1
            if (r4 == r1) goto L_0x001e
            if (r4 == 0) goto L_0x001e
            int r1 = r3.l(r4)
            int r2 = defpackage.gua.l
            if (r1 != r2) goto L_0x001e
            r1 = 1
            int r4 = r4 - r1
            int r3 = r3.l(r4)
            if (r3 == r2) goto L_0x001e
            r0 = r1
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m66.i(androidx.recyclerview.widget.RecyclerView, int):boolean");
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, lzc lzc) {
        int S;
        switch (this.a) {
            case 0:
                super.f(rect, view, recyclerView, lzc);
                tyc adapter = recyclerView.getAdapter();
                if (adapter != null && (S = RecyclerView.S(view)) > 0 && adapter.l(S) == gua.i) {
                    rect.top = (int) (((float) (MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density) * 2)) + 0.5f);
                }
                this.c.c(rect, view, recyclerView);
                return;
            case 1:
                super.f(rect, view, recyclerView, lzc);
                recyclerView.getClass();
                if (i(recyclerView, RecyclerView.S(view))) {
                    rect.top = MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density);
                }
                this.c.c(rect, view, recyclerView);
                return;
            case 2:
                int roundToInt = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
                rect.set(roundToInt, roundToInt, roundToInt, roundToInt);
                this.c.c(rect, view, recyclerView);
                return;
            case 3:
                super.f(rect, view, recyclerView, lzc);
                if (j(view, recyclerView)) {
                    rect.top = (int) (((float) (MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density) * 2)) + 0.5f);
                }
                this.c.c(rect, view, recyclerView);
                return;
            default:
                super.f(rect, view, recyclerView, lzc);
                recyclerView.getClass();
                if (((d19) this.o).C(RecyclerView.S(view))) {
                    int i = rect.top;
                    TextPaint textPaint = (TextPaint) this.v;
                    rect.top = (MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density) * 2) + ((int) (textPaint.descent() - textPaint.ascent())) + i;
                }
                this.c.c(rect, view, recyclerView);
                return;
        }
    }

    public void g(Canvas canvas, RecyclerView recyclerView, lzc lzc) {
        int S;
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    if (i < recyclerView.getChildCount()) {
                        int i2 = i + 1;
                        View childAt = recyclerView.getChildAt(i);
                        if (childAt != null) {
                            tyc adapter = recyclerView.getAdapter();
                            if (adapter != null && (S = RecyclerView.S(childAt)) > 0 && adapter.l(S) == gua.i) {
                                int S2 = RecyclerView.S(childAt);
                                pl7 pl7 = this.c;
                                Rect rect = (Rect) this.b;
                                pl7.b(rect, childAt, S2);
                                float f = (float) 12;
                                Canvas canvas2 = canvas;
                                canvas2.drawRect((float) g63.b(f, vo4.c().getDisplayMetrics().density, rect.left), (float) rect.top, (float) a81.e(f, vo4.c().getDisplayMetrics().density, rect.right), (float) rect.bottom, (Paint) this.v);
                                float f2 = (float) 24;
                                canvas2.drawLine((float) g63.b(f2, vo4.c().getDisplayMetrics().density, rect.left), (float) rect.centerY(), (float) a81.e(f2, vo4.c().getDisplayMetrics().density, rect.right), (float) rect.centerY(), (Paint) this.o);
                            }
                            i = i2;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            case 1:
                int i3 = 0;
                while (true) {
                    if (i3 < recyclerView.getChildCount()) {
                        int i4 = i3 + 1;
                        View childAt2 = recyclerView.getChildAt(i3);
                        if (childAt2 != null) {
                            recyclerView.getClass();
                            int S3 = RecyclerView.S(childAt2);
                            if (i(recyclerView, S3)) {
                                String upperCase = ((Context) this.o).getString(iua.b).toUpperCase(Locale.ROOT);
                                pl7 pl72 = this.c;
                                Rect rect2 = (Rect) this.b;
                                pl72.b(rect2, childAt2, S3);
                                canvas.drawText(upperCase, ((float) rect2.left) + ((float) MathKt.roundToInt(((float) 28) * vo4.c().getDisplayMetrics().density)), ((float) rect2.bottom) - ((float) MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density)), (TextPaint) this.v);
                            }
                            i3 = i4;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            default:
                return;
        }
    }

    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 2:
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int S = RecyclerView.S(childAt);
                    if (S != -1) {
                        if (((Boolean) ((Function1) this.v).invoke(Integer.valueOf(S))).booleanValue()) {
                            int roundToInt = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
                            RectF rectF = (RectF) this.b;
                            rectF.set((float) (childAt.getLeft() - roundToInt), (float) (childAt.getTop() - roundToInt), (float) (childAt.getRight() + roundToInt), (float) (childAt.getBottom() + roundToInt));
                            float f = (float) 2;
                            canvas.drawRoundRect(rectF, rectF.width() / f, rectF.width() / f, (Paint) this.o);
                        }
                    }
                }
                return;
            case 3:
                int i2 = 0;
                while (true) {
                    if (i2 < recyclerView.getChildCount()) {
                        int i3 = i2 + 1;
                        View childAt2 = recyclerView.getChildAt(i2);
                        if (childAt2 != null) {
                            if (j(childAt2, recyclerView)) {
                                int roundToInt2 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                                int roundToInt3 = MathKt.roundToInt(((float) 18) * vo4.c().getDisplayMetrics().density);
                                int S2 = RecyclerView.S(childAt2);
                                pl7 pl7 = this.c;
                                Rect rect = (Rect) this.b;
                                pl7.b(rect, childAt2, S2);
                                canvas.drawLine((float) (rect.left + roundToInt2), (float) rect.centerY(), (float) (rect.right - roundToInt3), (float) rect.centerY(), (Paint) this.o);
                            }
                            i2 = i3;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            case 4:
                int i4 = 0;
                while (true) {
                    if (i4 < recyclerView.getChildCount()) {
                        int i5 = i4 + 1;
                        View childAt3 = recyclerView.getChildAt(i4);
                        if (childAt3 != null) {
                            recyclerView.getClass();
                            int S3 = RecyclerView.S(childAt3);
                            if (S3 != -1) {
                                d19 d19 = (d19) this.o;
                                if (d19.C(S3)) {
                                    pl7 pl72 = this.c;
                                    Rect rect2 = (Rect) this.b;
                                    pl72.b(rect2, childAt3, S3);
                                    float roundToInt4 = ((float) rect2.left) + ((float) MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density));
                                    TextPaint textPaint = (TextPaint) this.v;
                                    canvas.drawText((String) d19.c, roundToInt4, textPaint.descent() + ((float) rect2.centerY()), textPaint);
                                }
                            }
                            i4 = i5;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r2 = r4.l((r3 = androidx.recyclerview.widget.RecyclerView.S(r3)));
        r1 = defpackage.rra.s;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(android.view.View r3, androidx.recyclerview.widget.RecyclerView r4) {
        /*
            r2 = this;
            tyc r4 = r4.getAdapter()
            r0 = 0
            if (r4 != 0) goto L_0x0008
            return r0
        L_0x0008:
            int r3 = androidx.recyclerview.widget.RecyclerView.S(r3)
            if (r3 <= 0) goto L_0x002a
            java.lang.Object r2 = r2.v
            uo3 r2 = (defpackage.uo3) r2
            boolean r2 = r2.c(r3)
            if (r2 == 0) goto L_0x0019
            goto L_0x002a
        L_0x0019:
            int r2 = r4.l(r3)
            int r1 = defpackage.rra.s
            if (r2 != r1) goto L_0x002a
            r2 = 1
            int r3 = r3 - r2
            int r3 = r4.l(r3)
            if (r3 == r1) goto L_0x002a
            r0 = r2
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m66.j(android.view.View, androidx.recyclerview.widget.RecyclerView):boolean");
    }

    public final void onThemeChanged(k2b k2b) {
        switch (this.a) {
            case 0:
                ((Paint) this.o).setColor(k2b.h().j);
                ((Paint) this.v).setColor(k2b.c().f);
                return;
            case 1:
                ogf ogf = puf.q;
                DisplayMetrics displayMetrics = ((Context) this.o).getResources().getDisplayMetrics();
                TextPaint textPaint = (TextPaint) this.v;
                ogf.a(textPaint, displayMetrics, uy4.b);
                textPaint.setColor(k2b.getText().f);
                return;
            case 2:
                k2b.c().a.getClass();
                ((Paint) this.o).setColor(-16745729);
                return;
            case 3:
                ((Paint) this.o).setColor(k2b.h().j);
                return;
            default:
                ((d19) this.o).H((TextPaint) this.v);
                return;
        }
    }

    public m66(z7a z7a, Context context) {
        this.v = z7a;
        this.c = new pl7(0);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(vo4.c().getDisplayMetrics().density * 3.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.o = paint;
        this.b = new RectF();
        onThemeChanged(fu4.k.e(context).f());
    }

    public m66(k2b k2b) {
        Paint paint = new Paint();
        paint.setStrokeWidth(vo4.c().getDisplayMetrics().density * 0.5f);
        this.o = paint;
        this.v = new Paint();
        this.b = new Rect();
        this.c = new pl7(0);
        onThemeChanged(k2b);
    }

    public m66(k2b k2b, fle fle) {
        this.v = fle;
        Paint paint = new Paint();
        paint.setStrokeWidth(vo4.c().getDisplayMetrics().density * 0.5f);
        this.o = paint;
        this.b = new Rect();
        this.c = new pl7(0);
        onThemeChanged(k2b);
    }

    public m66(Context context) {
        this.o = context;
        this.b = new Rect();
        this.v = new TextPaint();
        onThemeChanged(fu4.k.e(context).f());
        this.c = new pl7(0);
    }
}
