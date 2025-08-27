package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;

public class GridLayout extends ViewGroup {
    public static final int A0 = ioc.GridLayout_alignmentMode;
    public static final int B0 = ioc.GridLayout_rowOrderPreserved;
    public static final int C0 = ioc.GridLayout_columnOrderPreserved;
    public static final ku6 D0 = new ku6(0);
    public static final ku6 E0;
    public static final ku6 F0;
    public static final ku6 G0;
    public static final ku6 H0;
    public static final lu6 I0;
    public static final lu6 J0;
    public static final ku6 K0 = new ku6(3);
    public static final ku6 L0 = new ku6(4);
    public static final ku6 M0 = new ku6(5);
    public static final ju6 v0 = new Object();
    public static final int w0 = ioc.GridLayout_orientation;
    public static final int x0 = ioc.GridLayout_rowCount;
    public static final int y0 = ioc.GridLayout_columnCount;
    public static final LogPrinter z = new LogPrinter(3, GridLayout.class.getName());
    public static final int z0 = ioc.GridLayout_useDefaultMargins;
    public final pu6 a = new pu6(this, true);
    public final pu6 b = new pu6(this, false);
    public int c = 0;
    public boolean o = false;
    public int v = 1;
    public final int w;
    public int x = 0;
    public Printer y = z;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, ju6] */
    static {
        ku6 ku6 = new ku6(1);
        ku6 ku62 = new ku6(2);
        E0 = ku6;
        F0 = ku62;
        G0 = ku6;
        H0 = ku62;
        I0 = new lu6(ku6, ku62);
        J0 = new lu6(ku62, ku6);
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.w = context.getResources().getDimensionPixelOffset(fec.default_gap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ioc.GridLayout);
        try {
            setRowCount(obtainStyledAttributes.getInt(x0, IntCompanionObject.MIN_VALUE));
            setColumnCount(obtainStyledAttributes.getInt(y0, IntCompanionObject.MIN_VALUE));
            setOrientation(obtainStyledAttributes.getInt(w0, 0));
            setUseDefaultMargins(obtainStyledAttributes.getBoolean(z0, false));
            setAlignmentMode(obtainStyledAttributes.getInt(A0, 1));
            setRowOrderPreserved(obtainStyledAttributes.getBoolean(B0, true));
            setColumnOrderPreserved(obtainStyledAttributes.getBoolean(C0, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ryg d(int i, boolean z2) {
        int i2 = (i & (z2 ? 7 : 112)) >> (z2 ? 0 : 4);
        return i2 != 1 ? i2 != 3 ? i2 != 5 ? i2 != 7 ? i2 != 8388611 ? i2 != 8388613 ? D0 : H0 : G0 : M0 : z2 ? J0 : F0 : z2 ? I0 : E0 : K0;
    }

    public static void g(String str) {
        throw new IllegalArgumentException(tr1.j(str, ". "));
    }

    public static void k(su6 su6, int i, int i2, int i3, int i4) {
        ru6 ru6 = new ru6(i, i2 + i);
        uu6 uu6 = su6.a;
        su6.a = new uu6(uu6.a, ru6, uu6.c, uu6.d);
        ru6 ru62 = new ru6(i3, i4 + i3);
        uu6 uu62 = su6.b;
        su6.b = new uu6(uu62.a, ru62, uu62.c, uu62.d);
    }

    public static uu6 l(int i, int i2, ryg ryg, float f) {
        return new uu6(i != Integer.MIN_VALUE, new ru6(i, i2 + i), ryg, f);
    }

    public final void a(su6 su6, boolean z2) {
        String str = z2 ? "column" : "row";
        ru6 ru6 = (z2 ? su6.b : su6.a).b;
        int i = ru6.a;
        if (i == Integer.MIN_VALUE || i >= 0) {
            int i2 = (z2 ? this.a : this.b).b;
            if (i2 == Integer.MIN_VALUE) {
                return;
            }
            if (ru6.b > i2) {
                g(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            } else if (ru6.a() > i2) {
                g(str + " span mustn't exceed the " + str + " count");
                throw null;
            }
        } else {
            g(str.concat(" indices must be positive"));
            throw null;
        }
    }

    public final int b() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i = ((su6) childAt.getLayoutParams()).hashCode() + (i * 31);
            }
        }
        return i;
    }

    public final void c() {
        int i = this.x;
        if (i == 0) {
            boolean z2 = this.c == 0;
            int i2 = (z2 ? this.a : this.b).b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            int[] iArr = new int[i2];
            int childCount = getChildCount();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                su6 su6 = (su6) getChildAt(i5).getLayoutParams();
                uu6 uu6 = z2 ? su6.a : su6.b;
                ru6 ru6 = uu6.b;
                int a2 = ru6.a();
                boolean z3 = uu6.a;
                if (z3) {
                    i3 = ru6.a;
                }
                uu6 uu62 = z2 ? su6.b : su6.a;
                ru6 ru62 = uu62.b;
                int a3 = ru62.a();
                boolean z4 = uu62.a;
                int i6 = ru62.a;
                if (i2 != 0) {
                    a3 = Math.min(a3, i2 - (z4 ? Math.min(i6, i2) : 0));
                }
                if (z4) {
                    i4 = i6;
                }
                if (i2 != 0) {
                    if (!z3 || !z4) {
                        while (true) {
                            int i7 = i4 + a3;
                            if (i7 <= i2) {
                                int i8 = i4;
                                while (i8 < i7) {
                                    if (iArr[i8] <= i3) {
                                        i8++;
                                    }
                                }
                                break;
                            }
                            if (z4) {
                                i3++;
                            } else if (i7 <= i2) {
                                i4++;
                            } else {
                                i3++;
                                i4 = 0;
                            }
                        }
                    }
                    Arrays.fill(iArr, Math.min(i4, i2), Math.min(i4 + a3, i2), i3 + a2);
                }
                if (z2) {
                    k(su6, i3, a2, i4, a3);
                } else {
                    k(su6, i4, a3, i3, a2);
                }
                i4 += a3;
            }
            this.x = b();
        } else if (i != b()) {
            this.y.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
            h();
            c();
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof su6)) {
            return false;
        }
        su6 su6 = (su6) layoutParams;
        a(su6, true);
        a(su6, false);
        return true;
    }

    public final int e(View view, boolean z2, boolean z3) {
        int[] iArr;
        if (this.v == 1) {
            return f(view, z2, z3);
        }
        pu6 pu6 = z2 ? this.a : this.b;
        if (z3) {
            if (pu6.j == null) {
                pu6.j = new int[(pu6.f() + 1)];
            }
            if (!pu6.k) {
                pu6.c(true);
                pu6.k = true;
            }
            iArr = pu6.j;
        } else {
            if (pu6.l == null) {
                pu6.l = new int[(pu6.f() + 1)];
            }
            if (!pu6.m) {
                pu6.c(false);
                pu6.m = true;
            }
            iArr = pu6.l;
        }
        su6 su6 = (su6) view.getLayoutParams();
        ru6 ru6 = (z2 ? su6.b : su6.a).b;
        return iArr[z3 ? ru6.a : ru6.b];
    }

    public final int f(View view, boolean z2, boolean z3) {
        su6 su6 = (su6) view.getLayoutParams();
        int i = z2 ? z3 ? su6.leftMargin : su6.rightMargin : z3 ? su6.topMargin : su6.bottomMargin;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int i2 = 0;
        if (this.o) {
            uu6 uu6 = z2 ? su6.b : su6.a;
            pu6 pu6 = z2 ? this.a : this.b;
            ru6 ru6 = uu6.b;
            if (z2) {
                WeakHashMap weakHashMap = gag.a;
                if (getLayoutDirection() == 1) {
                    z3 = !z3;
                }
            }
            if (z3) {
                int i3 = ru6.a;
            } else {
                int i4 = ru6.b;
                pu6.f();
            }
            if (!(view.getClass() == age.class || view.getClass() == Space.class)) {
                i2 = this.w / 2;
            }
        }
        return i2;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new su6();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v0, types: [su6, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        uu6 uu6 = uu6.e;
        marginLayoutParams.a = uu6;
        marginLayoutParams.b = uu6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ioc.GridLayout_Layout);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(su6.d, IntCompanionObject.MIN_VALUE);
            marginLayoutParams.leftMargin = obtainStyledAttributes.getDimensionPixelSize(su6.e, dimensionPixelSize);
            marginLayoutParams.topMargin = obtainStyledAttributes.getDimensionPixelSize(su6.f, dimensionPixelSize);
            marginLayoutParams.rightMargin = obtainStyledAttributes.getDimensionPixelSize(su6.g, dimensionPixelSize);
            marginLayoutParams.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(su6.h, dimensionPixelSize);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ioc.GridLayout_Layout);
            try {
                int i = obtainStyledAttributes2.getInt(su6.o, 0);
                int i2 = obtainStyledAttributes2.getInt(su6.i, IntCompanionObject.MIN_VALUE);
                int i3 = su6.j;
                int i4 = su6.c;
                marginLayoutParams.b = l(i2, obtainStyledAttributes2.getInt(i3, i4), d(i, true), obtainStyledAttributes2.getFloat(su6.k, c44.DEFAULT_ASPECT_RATIO));
                marginLayoutParams.a = l(obtainStyledAttributes2.getInt(su6.l, IntCompanionObject.MIN_VALUE), obtainStyledAttributes2.getInt(su6.m, i4), d(i, false), obtainStyledAttributes2.getFloat(su6.n, c44.DEFAULT_ASPECT_RATIO));
                return marginLayoutParams;
            } finally {
                obtainStyledAttributes2.recycle();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public int getAlignmentMode() {
        return this.v;
    }

    public int getColumnCount() {
        return this.a.f();
    }

    public int getOrientation() {
        return this.c;
    }

    public Printer getPrinter() {
        return this.y;
    }

    public int getRowCount() {
        return this.b.f();
    }

    public boolean getUseDefaultMargins() {
        return this.o;
    }

    public final void h() {
        this.x = 0;
        pu6 pu6 = this.a;
        if (pu6 != null) {
            pu6.l();
        }
        pu6 pu62 = this.b;
        if (pu62 != null) {
            pu62.l();
        }
        if (pu6 != null && pu62 != null) {
            pu6.m();
            pu62.m();
        }
    }

    public final void i(View view, int i, int i2, int i3, int i4) {
        view.measure(ViewGroup.getChildMeasureSpec(i, e(view, true, false) + e(view, true, true), i3), ViewGroup.getChildMeasureSpec(i2, e(view, false, false) + e(view, false, true), i4));
    }

    public final void j(int i, int i2, boolean z2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                su6 su6 = (su6) childAt.getLayoutParams();
                if (z2) {
                    i(childAt, i, i2, su6.width, su6.height);
                } else {
                    boolean z3 = this.c == 0;
                    uu6 uu6 = z3 ? su6.b : su6.a;
                    if (uu6.a(z3) == M0) {
                        int[] h = (z3 ? this.a : this.b).h();
                        ru6 ru6 = uu6.b;
                        int e = (h[ru6.b] - h[ru6.a]) - (e(childAt, z3, false) + e(childAt, z3, true));
                        if (z3) {
                            i(childAt, i, i2, e, su6.height);
                        } else {
                            i(childAt, i, i2, su6.width, e);
                        }
                    }
                }
            }
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        pu6 pu6;
        pu6 pu62;
        int i5;
        boolean z3;
        int i6;
        View view;
        GridLayout gridLayout = this;
        c();
        int i7 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i8 = (i7 - paddingLeft) - paddingRight;
        pu6 pu63 = gridLayout.a;
        pu63.v.a = i8;
        pu63.w.a = -i8;
        boolean z4 = false;
        pu63.q = false;
        pu63.h();
        int i9 = ((i4 - i2) - paddingTop) - paddingBottom;
        pu6 pu64 = gridLayout.b;
        pu64.v.a = i9;
        pu64.w.a = -i9;
        pu64.q = false;
        pu64.h();
        int[] h = pu63.h();
        int[] h2 = pu64.h();
        int i10 = 0;
        for (int childCount = getChildCount(); i10 < childCount; childCount = i6) {
            View childAt = gridLayout.getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                i5 = i10;
                i6 = childCount;
                pu6 = pu63;
                z3 = z4;
                pu62 = pu64;
            } else {
                su6 su6 = (su6) childAt.getLayoutParams();
                uu6 uu6 = su6.b;
                uu6 uu62 = su6.a;
                ru6 ru6 = uu6.b;
                ru6 ru62 = uu62.b;
                int i11 = h[ru6.a];
                int i12 = childCount;
                int i13 = h2[ru62.a];
                int i14 = h[ru6.b] - i11;
                int i15 = h2[ru62.b] - i13;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ryg a2 = uu6.a(true);
                ryg a3 = uu62.a(false);
                o5h g = pu63.g();
                pu6 = pu63;
                qu6 qu6 = (qu6) ((Object[]) g.c)[((int[]) g.a)[i10]];
                o5h g2 = pu64.g();
                pu62 = pu64;
                qu6 qu62 = (qu6) ((Object[]) g2.c)[((int[]) g2.a)[i10]];
                int s = a2.s(childAt, i14 - qu6.d(true));
                int s2 = a3.s(childAt, i15 - qu62.d(true));
                int e = gridLayout.e(childAt, true, true);
                int e2 = gridLayout.e(childAt, false, true);
                int e3 = gridLayout.e(childAt, true, false);
                int i16 = e + e3;
                int e4 = e2 + gridLayout.e(childAt, false, false);
                ryg ryg = a3;
                qu6 qu63 = qu6;
                ryg ryg2 = a2;
                int i17 = measuredHeight;
                ryg ryg3 = ryg2;
                View view2 = childAt;
                i5 = i10;
                z3 = false;
                i6 = i12;
                int i18 = measuredWidth;
                int a4 = qu63.a(this, childAt, ryg3, measuredWidth + i16, true);
                int i19 = i17;
                ryg ryg4 = ryg;
                int a5 = qu62.a(this, view2, ryg4, i19 + e4, false);
                int y2 = ryg3.y(i18, i14 - i16);
                int y3 = ryg4.y(i19, i15 - e4);
                int i20 = i11 + s + a4;
                WeakHashMap weakHashMap = gag.a;
                int i21 = getLayoutDirection() == 1 ? (((i7 - y2) - paddingRight) - e3) - i20 : paddingLeft + e + i20;
                int i22 = paddingTop + i13 + s2 + a5 + e2;
                if (y2 == view2.getMeasuredWidth() && y3 == view2.getMeasuredHeight()) {
                    view = view2;
                } else {
                    view = view2;
                    view.measure(View.MeasureSpec.makeMeasureSpec(y2, 1073741824), View.MeasureSpec.makeMeasureSpec(y3, 1073741824));
                }
                view.layout(i21, i22, y2 + i21, y3 + i22);
            }
            i10 = i5 + 1;
            gridLayout = this;
            pu63 = pu6;
            pu64 = pu62;
            z4 = z3;
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        c();
        pu6 pu6 = this.b;
        pu6 pu62 = this.a;
        if (!(pu62 == null || pu6 == null)) {
            pu62.m();
            pu6.m();
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i), View.MeasureSpec.getMode(i));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i2), View.MeasureSpec.getMode(i2));
        j(makeMeasureSpec, makeMeasureSpec2, true);
        if (this.c == 0) {
            i3 = pu62.j(makeMeasureSpec);
            j(makeMeasureSpec, makeMeasureSpec2, false);
            i4 = pu6.j(makeMeasureSpec2);
        } else {
            i4 = pu6.j(makeMeasureSpec2);
            j(makeMeasureSpec, makeMeasureSpec2, false);
            i3 = pu62.j(makeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i3 + paddingRight, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(i4 + paddingBottom, getSuggestedMinimumHeight()), i2, 0));
    }

    public final void requestLayout() {
        super.requestLayout();
        h();
    }

    public void setAlignmentMode(int i) {
        this.v = i;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.a.o(i);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z2) {
        pu6 pu6 = this.a;
        pu6.u = z2;
        pu6.l();
        h();
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.c != i) {
            this.c = i;
            h();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = v0;
        }
        this.y = printer;
    }

    public void setRowCount(int i) {
        this.b.o(i);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z2) {
        pu6 pu6 = this.b;
        pu6.u = z2;
        pu6.l();
        h();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z2) {
        this.o = z2;
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [su6, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARNING: type inference failed for: r1v4, types: [su6, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARNING: type inference failed for: r1v5, types: [su6, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof su6) {
            su6 su6 = (su6) layoutParams;
            ? marginLayoutParams = new ViewGroup.MarginLayoutParams(su6);
            uu6 uu6 = uu6.e;
            marginLayoutParams.a = uu6;
            marginLayoutParams.b = uu6;
            marginLayoutParams.a = su6.a;
            marginLayoutParams.b = su6.b;
            return marginLayoutParams;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ? marginLayoutParams2 = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            uu6 uu62 = uu6.e;
            marginLayoutParams2.a = uu62;
            marginLayoutParams2.b = uu62;
            return marginLayoutParams2;
        } else {
            ? marginLayoutParams3 = new ViewGroup.MarginLayoutParams(layoutParams);
            uu6 uu63 = uu6.e;
            marginLayoutParams3.a = uu63;
            marginLayoutParams3.b = uu63;
            return marginLayoutParams3;
        }
    }
}
