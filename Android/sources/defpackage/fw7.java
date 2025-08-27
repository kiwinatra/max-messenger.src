package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.a;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: fw7  reason: default package */
public abstract class fw7 extends hfe {
    public h5b d;
    public h5b e;

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

    public int[] b(a aVar, View view) {
        int[] iArr = new int[2];
        if (aVar.e()) {
            vo7 i = i(aVar);
            iArr[0] = ((i.d(view) / 2) + i.f(view)) - ((i.n() / 2) + i.m());
        } else {
            iArr[0] = 0;
        }
        if (aVar.f()) {
            vo7 j = j(aVar);
            iArr[1] = ((j.d(view) / 2) + j.f(view)) - ((j.n() / 2) + j.m());
        } else {
            iArr[1] = 0;
        }
        return iArr;
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
        int G;
        View d2;
        int M;
        int i3;
        PointF a;
        int i4;
        int i5;
        if (!(aVar instanceof kzc) || (G = aVar.G()) == 0 || (d2 = d(aVar)) == null || (M = a.M(d2)) == -1 || (a = ((kzc) aVar).a(i3)) == null) {
            return -1;
        }
        int i6 = 0;
        if (aVar.e()) {
            i4 = g(aVar, i(aVar), i, 0);
            if (a.x < c44.DEFAULT_ASPECT_RATIO) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (aVar.f()) {
            i5 = g(aVar, j(aVar), 0, i2);
            if (a.y < c44.DEFAULT_ASPECT_RATIO) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (aVar.f()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = M + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= G ? G - 1 : i6;
    }

    public final int g(a aVar, vo7 vo7, int i, int i2) {
        int max;
        this.b.fling(0, 0, i, i2, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int w = aVar.w();
        float f = 1.0f;
        if (w != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < w; i5++) {
                View v = aVar.v(i5);
                int M = a.M(v);
                if (M != -1) {
                    if (M < i4) {
                        view = v;
                        i4 = M;
                    }
                    if (M > i3) {
                        view2 = v;
                        i3 = M;
                    }
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(vo7.c(view), vo7.c(view2)) - Math.min(vo7.f(view), vo7.f(view2))) == 0)) {
                f = (((float) max) * 1.0f) / ((float) ((i3 - i4) + 1));
            }
        }
        if (f <= c44.DEFAULT_ASPECT_RATIO) {
            return 0;
        }
        return Math.round(((float) (Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1])) / f);
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
