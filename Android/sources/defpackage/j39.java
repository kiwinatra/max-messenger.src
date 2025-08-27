package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: j39  reason: default package */
public final class j39 extends zyc implements phf {
    public final /* synthetic */ int a;
    public final Paint b;
    public final Rect c;
    public final Object o;

    public j39(k2b k2b, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.FILL);
                this.b = paint;
                this.o = new RectF();
                this.c = new Rect();
                onThemeChanged(k2b);
                return;
            default:
                Paint paint2 = new Paint();
                paint2.setStrokeWidth(vo4.c().getDisplayMetrics().density * 0.5f);
                this.b = paint2;
                this.c = new Rect();
                this.o = new pl7(0);
                onThemeChanged(k2b);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: y29} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean i(android.view.View r6, androidx.recyclerview.widget.RecyclerView r7) {
        /*
            tyc r7 = r7.getAdapter()
            boolean r0 = r7 instanceof defpackage.pae
            r1 = 0
            if (r0 == 0) goto L_0x000c
            pae r7 = (defpackage.pae) r7
            goto L_0x000d
        L_0x000c:
            r7 = r1
        L_0x000d:
            r0 = 0
            if (r7 != 0) goto L_0x0011
            return r0
        L_0x0011:
            int r6 = androidx.recyclerview.widget.RecyclerView.S(r6)
            int r2 = r6 + -1
            if (r6 > 0) goto L_0x001a
            return r0
        L_0x001a:
            int r3 = r7.l(r6)
            int r4 = r7.l(r2)
            java.lang.Object r7 = r7.o
            ov r7 = (defpackage.ov) r7
            java.util.List r5 = r7.f
            java.lang.Object r6 = kotlin.collections.CollectionsKt.getOrNull(r5, r6)
            boolean r5 = r6 instanceof defpackage.y29
            if (r5 == 0) goto L_0x0033
            y29 r6 = (defpackage.y29) r6
            goto L_0x0034
        L_0x0033:
            r6 = r1
        L_0x0034:
            r5 = 1
            if (r6 == 0) goto L_0x003d
            boolean r6 = r6.z
            if (r6 != 0) goto L_0x003d
            r6 = r5
            goto L_0x003e
        L_0x003d:
            r6 = r0
        L_0x003e:
            java.util.List r7 = r7.f
            java.lang.Object r7 = kotlin.collections.CollectionsKt.getOrNull(r7, r2)
            boolean r2 = r7 instanceof defpackage.y29
            if (r2 == 0) goto L_0x004b
            r1 = r7
            y29 r1 = (defpackage.y29) r1
        L_0x004b:
            if (r1 == 0) goto L_0x0053
            boolean r7 = r1.z
            if (r7 != r5) goto L_0x0053
            r7 = r5
            goto L_0x0054
        L_0x0053:
            r7 = r0
        L_0x0054:
            int r1 = defpackage.cwa.F
            if (r3 != r1) goto L_0x005c
            int r1 = defpackage.cwa.D
            if (r4 == r1) goto L_0x0060
        L_0x005c:
            if (r6 == 0) goto L_0x0061
            if (r7 == 0) goto L_0x0061
        L_0x0060:
            r0 = r5
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j39.i(android.view.View, androidx.recyclerview.widget.RecyclerView):boolean");
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, lzc lzc) {
        int S;
        switch (this.a) {
            case 0:
                super.f(rect, view, recyclerView, lzc);
                if (i(view, recyclerView)) {
                    rect.top = (int) (((float) (MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density) * 2)) + 0.5f);
                }
                ((pl7) this.o).c(rect, view, recyclerView);
                return;
            default:
                pzc U = recyclerView.U(view);
                if (U != null && (U instanceof zr2) && (S = RecyclerView.S(view)) != -1) {
                    Boolean valueOf = Boolean.valueOf(((zr2) U).w == as2.b);
                    if (lzc.b == null) {
                        lzc.b = new SparseArray();
                    }
                    lzc.b.put(S, valueOf);
                    return;
                }
                return;
        }
    }

    public void g(Canvas canvas, RecyclerView recyclerView, lzc lzc) {
        switch (this.a) {
            case 1:
                RectF rectF = (RectF) this.o;
                rectF.set(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int S = RecyclerView.S(childAt);
                    if (recyclerView.U(childAt) instanceof zr2) {
                        SparseArray sparseArray = lzc.b;
                        boolean areEqual = Intrinsics.areEqual(sparseArray == null ? null : sparseArray.get(S), (Object) Boolean.TRUE);
                        if (areEqual) {
                            Rect rect = this.c;
                            RecyclerView.W(rect, childAt);
                            if (rectF.height() == c44.DEFAULT_ASPECT_RATIO) {
                                rectF.set(rect);
                            } else {
                                rectF.left = Math.min(rectF.left, (float) rect.left);
                                rectF.top = Math.min(rectF.top, (float) rect.top);
                                rectF.right = Math.max(rectF.right, (float) rect.right);
                                rectF.bottom = Math.max(rectF.bottom, (float) rect.bottom);
                            }
                        }
                        if ((!areEqual || i == recyclerView.getChildCount() - 1) && rectF.height() != c44.DEFAULT_ASPECT_RATIO) {
                            canvas.drawRect(rectF, this.b);
                            rectF.set(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
                        }
                    }
                }
                return;
            default:
                return;
        }
    }

    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    if (i < recyclerView.getChildCount()) {
                        int i2 = i + 1;
                        View childAt = recyclerView.getChildAt(i);
                        if (childAt != null) {
                            if (i(childAt, recyclerView)) {
                                int S = RecyclerView.S(childAt);
                                Rect rect = this.c;
                                ((pl7) this.o).b(rect, childAt, S);
                                canvas.drawLine((float) rect.left, (float) rect.centerY(), (float) rect.right, (float) rect.centerY(), this.b);
                            }
                            i = i2;
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

    public final void onThemeChanged(k2b k2b) {
        switch (this.a) {
            case 0:
                this.b.setColor(k2b.h().j);
                return;
            default:
                this.b.setColor(k2b.c().k);
                return;
        }
    }
}
