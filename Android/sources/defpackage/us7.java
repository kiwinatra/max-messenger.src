package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: us7  reason: default package */
public final class us7 extends kv0 {
    public final /* synthetic */ int i;
    public final SideSheetBehavior j;

    public /* synthetic */ us7(SideSheetBehavior sideSheetBehavior, int i2) {
        this.i = i2;
        this.j = sideSheetBehavior;
    }

    public final int C() {
        switch (this.i) {
            case 0:
                return this.j.o;
            default:
                return this.j.m;
        }
    }

    public final int D() {
        switch (this.i) {
            case 0:
                return -this.j.l;
            default:
                return y();
        }
    }

    public final int E(View view) {
        switch (this.i) {
            case 0:
                return view.getRight() + this.j.o;
            default:
                return view.getLeft() - this.j.o;
        }
    }

    public final int F(CoordinatorLayout coordinatorLayout) {
        switch (this.i) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    public final int G() {
        switch (this.i) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final boolean L(float f) {
        switch (this.i) {
            case 0:
                return f > c44.DEFAULT_ASPECT_RATIO;
            default:
                return f < c44.DEFAULT_ASPECT_RATIO;
        }
    }

    public final boolean N(View view) {
        switch (this.i) {
            case 0:
                return view.getRight() < (y() - z()) / 2;
            default:
                return view.getLeft() > (y() + this.j.m) / 2;
        }
    }

    public final boolean O(float f, float f2) {
        switch (this.i) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    float abs = Math.abs(f);
                    this.j.getClass();
                    if (abs > ((float) 500)) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    float abs2 = Math.abs(f);
                    this.j.getClass();
                    if (abs2 > ((float) 500)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final boolean Z(View view, float f) {
        switch (this.i) {
            case 0:
                return Math.abs((f * this.j.k) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f * this.j.k) + ((float) view.getRight())) > 0.5f;
        }
    }

    public final void a0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        switch (this.i) {
            case 0:
                marginLayoutParams.leftMargin = i2;
                return;
            default:
                marginLayoutParams.rightMargin = i2;
                return;
        }
    }

    public final void b0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
        switch (this.i) {
            case 0:
                if (i2 <= this.j.m) {
                    marginLayoutParams.leftMargin = i3;
                    return;
                }
                return;
            default:
                int i4 = this.j.m;
                if (i2 <= i4) {
                    marginLayoutParams.rightMargin = i4 - i2;
                    return;
                }
                return;
        }
    }

    public final int l(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.i) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final float m(int i2) {
        switch (this.i) {
            case 0:
                float z = (float) z();
                return (((float) i2) - z) / (((float) y()) - z);
            default:
                float f = (float) this.j.m;
                return (f - ((float) i2)) / (f - ((float) y()));
        }
    }

    public final int x(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.i) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final int y() {
        switch (this.i) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.j;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.j;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    public final int z() {
        switch (this.i) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.j;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.j.m;
        }
    }
}
