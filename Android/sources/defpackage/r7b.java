package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.a;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: r7b  reason: default package */
public class r7b extends hfe {
    public h5b d;
    public h5b e;

    public static int g(View view, vo7 vo7) {
        return ((vo7.d(view) / 2) + vo7.f(view)) - ((vo7.n() / 2) + vo7.m());
    }

    public static View h(a aVar, vo7 vo7) {
        int w = aVar.w();
        View view = null;
        if (w == 0) {
            return null;
        }
        int n = (vo7.n() / 2) + vo7.m();
        int i = IntCompanionObject.MAX_VALUE;
        for (int i2 = 0; i2 < w; i2++) {
            View v = aVar.v(i2);
            int abs = Math.abs(((vo7.d(v) / 2) + vo7.f(v)) - n);
            if (abs < i) {
                view = v;
                i = abs;
            }
        }
        return view;
    }

    public final int[] b(a aVar, View view) {
        int[] iArr = new int[2];
        if (aVar.e()) {
            iArr[0] = g(view, i(aVar));
        } else {
            iArr[0] = 0;
        }
        if (aVar.f()) {
            iArr[1] = g(view, j(aVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final ew7 c(a aVar) {
        if (!(aVar instanceof kzc)) {
            return null;
        }
        return new nx1(this, this.a.getContext(), 1);
    }

    public View d(a aVar) {
        if (aVar.f()) {
            return h(aVar, j(aVar));
        }
        if (aVar.e()) {
            return h(aVar, i(aVar));
        }
        return null;
    }

    public final int e(a aVar, int i, int i2) {
        PointF a;
        int G = aVar.G();
        if (G == 0) {
            return -1;
        }
        View view = null;
        vo7 j = aVar.f() ? j(aVar) : aVar.e() ? i(aVar) : null;
        if (j == null) {
            return -1;
        }
        int w = aVar.w();
        boolean z = false;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < w; i5++) {
            View v = aVar.v(i5);
            if (v != null) {
                int g = g(v, j);
                if (g <= 0 && g > i4) {
                    view2 = v;
                    i4 = g;
                }
                if (g >= 0 && g < i3) {
                    view = v;
                    i3 = g;
                }
            }
        }
        int i6 = 1;
        boolean z2 = !aVar.e() ? i2 > 0 : i > 0;
        if (z2 && view != null) {
            return a.M(view);
        }
        if (!z2 && view2 != null) {
            return a.M(view2);
        }
        if (z2) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int M = a.M(view);
        int G2 = aVar.G();
        if ((aVar instanceof kzc) && (a = ((kzc) aVar).a(G2 - 1)) != null && (a.x < c44.DEFAULT_ASPECT_RATIO || a.y < c44.DEFAULT_ASPECT_RATIO)) {
            z = true;
        }
        if (z == z2) {
            i6 = -1;
        }
        int i7 = M + i6;
        if (i7 < 0 || i7 >= G) {
            return -1;
        }
        return i7;
    }

    public final vo7 i(a aVar) {
        h5b h5b = this.e;
        if (h5b == null || ((a) h5b.b) != aVar) {
            this.e = new h5b(aVar, 0);
        }
        return this.e;
    }

    public final vo7 j(a aVar) {
        h5b h5b = this.d;
        if (h5b == null || ((a) h5b.b) != aVar) {
            this.d = new h5b(aVar, 1);
        }
        return this.d;
    }
}
