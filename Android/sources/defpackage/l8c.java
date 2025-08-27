package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: l8c  reason: default package */
public final class l8c {
    public static final float[] i = {1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, -1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f};
    public static final float[] j = {1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, -0.5f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};
    public static final float[] k = {0.5f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, -1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f};
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object g;
    public Object h;

    public l8c(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.g = constraintLayout2;
    }

    public static boolean a(int i2, int i3, int i4) {
        if (i2 == i3) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
        }
        return false;
    }

    public static boolean b(k8c k8c) {
        yy[] yyVarArr = k8c.a.a;
        if (yyVarArr.length != 1 || yyVarArr[0].a != 0) {
            return false;
        }
        yy[] yyVarArr2 = k8c.b.a;
        return yyVarArr2.length == 1 && yyVarArr2[0].a == 0;
    }

    public void c(tj3 tj3, xl0 xl0) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        tj3 tj32 = tj3;
        xl0 xl02 = xl0;
        if (tj32 != null) {
            if (tj32.g0 == 8) {
                xl02.g = 0;
                xl02.h = 0;
                xl02.i = 0;
            } else if (tj32.T != null) {
                int i9 = xl02.b;
                int i10 = xl02.d;
                int i11 = xl02.e;
                int i12 = xl02.f;
                int i13 = this.a + this.b;
                int i14 = this.c;
                View view = (View) tj32.f0;
                int y = tr1.y(i9);
                aj3 aj3 = tj32.K;
                aj3 aj32 = tj32.I;
                if (y == 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                } else if (y == 1) {
                    i2 = ViewGroup.getChildMeasureSpec(this.e, i14, -2);
                } else if (y == 2) {
                    i2 = ViewGroup.getChildMeasureSpec(this.e, i14, -2);
                    boolean z2 = tj32.r == 1;
                    int i15 = xl02.j;
                    if (i15 == 1 || i15 == 2) {
                        boolean z3 = view.getMeasuredHeight() == tj3.k();
                        if (xl02.j == 2 || !z2 || ((z2 && z3) || tj3.A())) {
                            i2 = View.MeasureSpec.makeMeasureSpec(tj3.q(), 1073741824);
                        }
                    }
                } else if (y != 3) {
                    i2 = 0;
                } else {
                    int i16 = this.e;
                    int i17 = aj32 != null ? aj32.g : 0;
                    if (aj3 != null) {
                        i17 += aj3.g;
                    }
                    i2 = ViewGroup.getChildMeasureSpec(i16, i14 + i17, -1);
                }
                int y2 = tr1.y(i10);
                if (y2 == 0) {
                    i3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                } else if (y2 == 1) {
                    i3 = ViewGroup.getChildMeasureSpec(this.f, i13, -2);
                } else if (y2 == 2) {
                    i3 = ViewGroup.getChildMeasureSpec(this.f, i13, -2);
                    boolean z4 = tj32.s == 1;
                    int i18 = xl02.j;
                    if (i18 == 1 || i18 == 2) {
                        boolean z5 = view.getMeasuredWidth() == tj3.q();
                        if (xl02.j == 2 || !z4 || ((z4 && z5) || tj3.B())) {
                            i3 = View.MeasureSpec.makeMeasureSpec(tj3.k(), 1073741824);
                        }
                    }
                } else if (y2 != 3) {
                    i3 = 0;
                } else {
                    int i19 = this.f;
                    int i20 = aj32 != null ? tj32.J.g : 0;
                    if (aj3 != null) {
                        i20 += tj32.L.g;
                    }
                    i3 = ViewGroup.getChildMeasureSpec(i19, i13 + i20, -1);
                }
                uj3 uj3 = (uj3) tj32.T;
                ConstraintLayout constraintLayout = (ConstraintLayout) this.h;
                if (uj3 == null || !ev0.k(constraintLayout.z, 256) || view.getMeasuredWidth() != tj3.q() || view.getMeasuredWidth() >= uj3.q() || view.getMeasuredHeight() != tj3.k() || view.getMeasuredHeight() >= uj3.k() || view.getBaseline() != tj32.a0 || tj3.z() || !a(tj32.G, i2, tj3.q()) || !a(tj32.H, i3, tj3.k())) {
                    boolean z6 = i9 == 3;
                    boolean z7 = i10 == 3;
                    boolean z8 = i10 == 4 || i10 == 1;
                    boolean z9 = i9 == 4 || i9 == 1;
                    boolean z10 = z6 && tj32.W > c44.DEFAULT_ASPECT_RATIO;
                    boolean z11 = z7 && tj32.W > c44.DEFAULT_ASPECT_RATIO;
                    if (view != null) {
                        fj3 fj3 = (fj3) view.getLayoutParams();
                        int i21 = xl02.j;
                        if (i21 == 1 || i21 == 2 || !z6 || tj32.r != 0 || !z7 || tj32.s != 0) {
                            if (!(view instanceof kdg) || !(tj32 instanceof cs5)) {
                                view.measure(i2, i3);
                            } else {
                                ((kdg) view).l((cs5) tj32, i2, i3);
                            }
                            tj32.G = i2;
                            tj32.H = i3;
                            tj32.g = false;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            int baseline = view.getBaseline();
                            int i22 = tj32.u;
                            i4 = i22 > 0 ? Math.max(i22, measuredWidth) : measuredWidth;
                            int i23 = tj32.v;
                            if (i23 > 0) {
                                i4 = Math.min(i23, i4);
                            }
                            int i24 = tj32.x;
                            if (i24 > 0) {
                                i5 = Math.max(i24, measuredHeight);
                                i8 = i2;
                            } else {
                                i8 = i2;
                                i5 = measuredHeight;
                            }
                            int i25 = tj32.y;
                            if (i25 > 0) {
                                i5 = Math.min(i25, i5);
                            }
                            if (!ev0.k(constraintLayout.z, 1)) {
                                if (z10 && z8) {
                                    i4 = (int) ((((float) i5) * tj32.W) + 0.5f);
                                } else if (z11 && z9) {
                                    i5 = (int) ((((float) i4) / tj32.W) + 0.5f);
                                }
                            }
                            if (measuredWidth == i4 && measuredHeight == i5) {
                                i6 = baseline;
                                i7 = -1;
                                z = false;
                            } else {
                                int makeMeasureSpec = measuredWidth != i4 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : i8;
                                if (measuredHeight != i5) {
                                    i3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                                }
                                view.measure(makeMeasureSpec, i3);
                                tj32.G = makeMeasureSpec;
                                tj32.H = i3;
                                z = false;
                                tj32.g = false;
                                int measuredWidth2 = view.getMeasuredWidth();
                                int measuredHeight2 = view.getMeasuredHeight();
                                i6 = view.getBaseline();
                                i4 = measuredWidth2;
                                i5 = measuredHeight2;
                                i7 = -1;
                            }
                        } else {
                            i7 = -1;
                            i6 = 0;
                            z = false;
                            i5 = 0;
                            i4 = 0;
                        }
                        boolean z12 = i6 != i7 ? true : z;
                        if (!(i4 == xl02.e && i5 == xl02.f)) {
                            z = true;
                        }
                        xl02.k = z;
                        boolean z13 = fj3.c0 ? true : z12;
                        if (!(!z13 || i6 == -1 || tj32.a0 == i6)) {
                            xl02.k = true;
                        }
                        xl02.g = i4;
                        xl02.h = i5;
                        xl02.c = z13;
                        xl02.i = i6;
                        return;
                    }
                    return;
                }
                xl02.g = tj3.q();
                xl02.h = tj3.k();
                xl02.i = tj32.a0;
            }
        }
    }
}
