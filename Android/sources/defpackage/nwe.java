package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: nwe  reason: default package */
public final class nwe extends zyc {
    public lwe X;
    public final AtomicBoolean Y = new AtomicBoolean(true);
    public final kwe Z = new kwe(this, 0);
    public final SparseBooleanArray a = new SparseBooleanArray();
    public final tyc b;
    public final owe c;
    public final ay2 o;
    public final RecyclerView v;
    public final boolean w = true;
    public final Rect x = new Rect();
    public final Rect y = new Rect();
    public final pl7 z = new pl7(0);

    public nwe(RecyclerView recyclerView, tyc tyc, owe owe) {
        this.b = tyc;
        boolean z2 = tyc instanceof owe;
        this.c = owe;
        this.o = new ay2(recyclerView, tyc, owe);
        this.v = recyclerView;
        lwe lwe = new lwe(this, recyclerView, 0);
        tyc.A(lwe);
        this.X = lwe;
    }

    public static final void i(nwe nwe) {
        nwe.a.clear();
        if (nwe.Y.compareAndSet(true, false)) {
            kwe kwe = nwe.Z;
            RecyclerView recyclerView = nwe.v;
            kne.K(recyclerView, kwe);
            recyclerView.post(new kwe(nwe, 1));
        }
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, lzc lzc) {
        recyclerView.getClass();
        int S = RecyclerView.S(view);
        boolean k = k(S);
        pl7 pl7 = this.z;
        if (k) {
            ay2 ay2 = this.o;
            if (ay2.k(S) != null) {
                iwe l = ay2.l(S);
                int i = l.c;
                if (i < 0) {
                    rect.top -= i;
                }
                rect.top = l.a.getMeasuredHeight() + rect.top;
                pl7.c(rect, view, recyclerView);
                return;
            }
        }
        pl7.c(rect, view, recyclerView);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        tyc tyc = this.b;
        int j = tyc.j();
        if (childCount > 0 && j > 0) {
            int i = 0;
            while (true) {
                if (i < recyclerView.getChildCount()) {
                    int i2 = i + 1;
                    View childAt = recyclerView.getChildAt(i);
                    if (childAt != null) {
                        int S = RecyclerView.S(childAt);
                        if (S != -1) {
                            ay2 ay2 = this.o;
                            if (ay2.k(S) != null) {
                                boolean k = k(S);
                                pl7 pl7 = this.z;
                                Rect rect = this.x;
                                pl7.a(rect, childAt, S);
                                boolean z2 = rect.top <= 0 && rect.bottom > 0;
                                if (k || z2) {
                                    iwe l = ay2.l(S);
                                    boolean z3 = z2 && this.w;
                                    int measuredHeight = ay2.l(S).a.getMeasuredHeight();
                                    pl7.a(rect, childAt, S);
                                    Rect rect2 = this.y;
                                    pl7.b(rect2, childAt, S);
                                    if (z3) {
                                        if (S >= tyc.j() - 1 || !k(S + 1)) {
                                            this.c.getClass();
                                            if (!k || rect2.top < 0) {
                                                rect2.offsetTo(rect2.left, 0);
                                            }
                                        } else {
                                            int i3 = rect.bottom;
                                            if (measuredHeight > i3) {
                                                rect2.offsetTo(rect2.left, i3 - measuredHeight);
                                            } else {
                                                rect2.offsetTo(rect2.left, 0);
                                            }
                                        }
                                    }
                                    int save = canvas.save();
                                    canvas.translate(c44.DEFAULT_ASPECT_RATIO, (float) rect2.top);
                                    try {
                                        View view = l.a;
                                        if (ct.z(view)) {
                                            canvas.translate((float) ((canvas.getWidth() - view.getMeasuredWidth()) - l.b), c44.DEFAULT_ASPECT_RATIO);
                                        } else {
                                            canvas.translate((float) l.b, c44.DEFAULT_ASPECT_RATIO);
                                        }
                                        view.draw(canvas);
                                    } finally {
                                        canvas.restoreToCount(save);
                                    }
                                }
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

    public final void j() {
        ay2 ay2 = this.o;
        ((SparseArray) ay2.w).clear();
        ((SparseArray) ay2.v).clear();
        ((SparseArray) ay2.x).clear();
    }

    public final boolean k(int i) {
        Object k;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return sparseBooleanArray.get(i);
        }
        ay2 ay2 = this.o;
        Object k2 = ay2.k(i);
        boolean z2 = false;
        if (k2 != null && (i <= 0 || (k = ay2.k(i - 1)) == null || !Intrinsics.areEqual(k2, k))) {
            z2 = true;
        }
        sparseBooleanArray.put(i, z2);
        return z2;
    }
}
