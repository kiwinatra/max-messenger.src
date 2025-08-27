package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ew7  reason: default package */
public class ew7 {
    public int a = -1;
    public RecyclerView b;
    public a c;
    public boolean d;
    public boolean e;
    public View f;
    public final cb4 g;
    public final LinearInterpolator h;
    public final DecelerateInterpolator i;
    public PointF j;
    public final DisplayMetrics k;
    public boolean l;
    public float m;
    public int n;
    public int o;

    public ew7(Context context) {
        cb4 cb4 = new cb4(2);
        cb4.f = -1;
        cb4.b = false;
        cb4.c = 0;
        cb4.d = 0;
        cb4.e = IntCompanionObject.MIN_VALUE;
        cb4.g = null;
        this.g = cb4;
        this.h = new LinearInterpolator();
        this.i = new DecelerateInterpolator();
        this.l = false;
        this.n = 0;
        this.o = 0;
        this.k = context.getResources().getDisplayMetrics();
    }

    public static int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int b(View view, int i2) {
        a aVar = this.c;
        if (aVar == null || !aVar.e()) {
            return 0;
        }
        bzc bzc = (bzc) view.getLayoutParams();
        return a(a.B(view) - bzc.leftMargin, a.E(view) + bzc.rightMargin, aVar.J(), aVar.n - aVar.K(), i2);
    }

    public int c(View view, int i2) {
        a aVar = this.c;
        if (aVar == null || !aVar.f()) {
            return 0;
        }
        bzc bzc = (bzc) view.getLayoutParams();
        return a(a.F(view) - bzc.topMargin, a.z(view) + bzc.bottomMargin, aVar.L(), aVar.o - aVar.I(), i2);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public final int e(int i2) {
        return (int) Math.ceil(((double) f(i2)) / 0.3356d);
    }

    public int f(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.l) {
            this.m = d(this.k);
            this.l = true;
        }
        return (int) Math.ceil((double) (abs * this.m));
    }

    public PointF g(int i2) {
        a aVar = this.c;
        if (aVar instanceof kzc) {
            return ((kzc) aVar).a(i2);
        }
        return null;
    }

    public int h() {
        PointF pointF = this.j;
        if (pointF != null) {
            float f2 = pointF.y;
            if (f2 != c44.DEFAULT_ASPECT_RATIO) {
                return f2 > c44.DEFAULT_ASPECT_RATIO ? 1 : -1;
            }
        }
        return 0;
    }

    public final void i(int i2, int i3) {
        PointF g2;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            k();
        }
        if (this.d && this.f == null && this.c != null && (g2 = g(this.a)) != null) {
            float f2 = g2.x;
            if (!(f2 == c44.DEFAULT_ASPECT_RATIO && g2.y == c44.DEFAULT_ASPECT_RATIO)) {
                recyclerView.y0((int[]) null, (int) Math.signum(f2), (int) Math.signum(g2.y));
            }
        }
        boolean z = false;
        this.d = false;
        View view = this.f;
        cb4 cb4 = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.T(view) == this.a) {
                View view2 = this.f;
                lzc lzc = recyclerView.q1;
                j(view2, cb4);
                cb4.a(recyclerView);
                k();
            } else {
                this.f = null;
            }
        }
        if (this.e) {
            lzc lzc2 = recyclerView.q1;
            if (this.b.z0.w() == 0) {
                k();
            } else {
                int i4 = this.n;
                int i5 = i4 - i2;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                this.n = i5;
                int i6 = this.o;
                int i7 = i6 - i3;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.o = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF g3 = g(this.a);
                    if (g3 != null) {
                        float f3 = g3.x;
                        if (!(f3 == c44.DEFAULT_ASPECT_RATIO && g3.y == c44.DEFAULT_ASPECT_RATIO)) {
                            float f4 = g3.y;
                            float sqrt = (float) Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
                            float f5 = g3.x / sqrt;
                            g3.x = f5;
                            float f6 = g3.y / sqrt;
                            g3.y = f6;
                            this.j = g3;
                            this.n = (int) (f5 * 10000.0f);
                            this.o = (int) (f6 * 10000.0f);
                            cb4.d((int) (((float) this.n) * 1.2f), (int) (((float) this.o) * 1.2f), (int) (((float) f(10000)) * 1.2f), this.h);
                        }
                    }
                    cb4.f = this.a;
                    k();
                }
            }
            if (cb4.f >= 0) {
                z = true;
            }
            cb4.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.n1.b();
            }
        }
    }

    public void j(View view, cb4 cb4) {
        int i2;
        PointF pointF = this.j;
        int b2 = b(view, (pointF == null || pointF.x == c44.DEFAULT_ASPECT_RATIO) ? 0 : i2 > 0 ? 1 : -1);
        int c2 = c(view, h());
        int e2 = e((int) Math.sqrt((double) ((c2 * c2) + (b2 * b2))));
        if (e2 > 0) {
            cb4.d(-b2, -c2, e2, this.i);
        }
    }

    public final void k() {
        if (this.e) {
            this.e = false;
            this.o = 0;
            this.n = 0;
            this.j = null;
            this.b.q1.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            a aVar = this.c;
            if (aVar.e == this) {
                aVar.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
