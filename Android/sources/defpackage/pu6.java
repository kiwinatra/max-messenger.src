package defpackage;

import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: pu6  reason: default package */
public final class pu6 {
    public final boolean a;
    public int b = IntCompanionObject.MIN_VALUE;
    public int c = IntCompanionObject.MIN_VALUE;
    public o5h d;
    public boolean e = false;
    public o5h f;
    public boolean g = false;
    public o5h h;
    public boolean i = false;
    public int[] j;
    public boolean k = false;
    public int[] l;
    public boolean m = false;
    public nu6[] n;
    public boolean o = false;
    public int[] p;
    public boolean q = false;
    public boolean r;
    public boolean s = false;
    public int[] t;
    public boolean u = true;
    public final tu6 v = new tu6(0);
    public final tu6 w = new tu6(-100000);
    public final /* synthetic */ GridLayout x;

    public pu6(GridLayout gridLayout, boolean z) {
        this.x = gridLayout;
        this.a = z;
    }

    public static void k(ArrayList arrayList, ru6 ru6, tu6 tu6, boolean z) {
        if (ru6.a() != 0) {
            if (z) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((nu6) it.next()).a.equals(ru6)) {
                        return;
                    }
                }
            }
            arrayList.add(new nu6(ru6, tu6));
        }
    }

    public static boolean n(int[] iArr, nu6 nu6) {
        if (!nu6.c) {
            return false;
        }
        ru6 ru6 = nu6.a;
        int i2 = ru6.a;
        int i3 = iArr[i2] + nu6.b.a;
        int i4 = ru6.b;
        if (i3 <= iArr[i4]) {
            return false;
        }
        iArr[i4] = i3;
        return true;
    }

    public final String a(ArrayList arrayList) {
        StringBuilder sb;
        String str = this.a ? "x" : "y";
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            nu6 nu6 = (nu6) it.next();
            if (z) {
                z = false;
            } else {
                sb2.append(", ");
            }
            ru6 ru6 = nu6.a;
            int i2 = ru6.a;
            int i3 = nu6.b.a;
            int i4 = ru6.b;
            if (i2 < i4) {
                sb.append(str);
                sb.append(i4);
                sb.append("-");
                sb.append(str);
                sb.append(i2);
                sb.append(">=");
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(i2);
                sb.append("-");
                sb.append(str);
                sb.append(i4);
                sb.append("<=");
                i3 = -i3;
            }
            sb.append(i3);
            sb2.append(sb.toString());
        }
        return sb2.toString();
    }

    public final void b(o5h o5h, boolean z) {
        tu6[] tu6Arr = (tu6[]) ((Object[]) o5h.c);
        for (tu6 tu6 : tu6Arr) {
            tu6.a = IntCompanionObject.MIN_VALUE;
        }
        qu6[] qu6Arr = (qu6[]) ((Object[]) g().c);
        for (int i2 = 0; i2 < qu6Arr.length; i2++) {
            int d2 = qu6Arr[i2].d(z);
            tu6 tu62 = (tu6) ((Object[]) o5h.c)[((int[]) o5h.a)[i2]];
            int i3 = tu62.a;
            if (!z) {
                d2 = -d2;
            }
            tu62.a = Math.max(i3, d2);
        }
    }

    public final void c(boolean z) {
        int[] iArr = z ? this.j : this.l;
        GridLayout gridLayout = this.x;
        int childCount = gridLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = gridLayout.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                su6 su6 = (su6) childAt.getLayoutParams();
                boolean z2 = this.a;
                ru6 ru6 = (z2 ? su6.b : su6.a).b;
                int i3 = z ? ru6.a : ru6.b;
                iArr[i3] = Math.max(iArr[i3], gridLayout.f(childAt, z2, z));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [tu6, java.lang.Object] */
    public final o5h d(boolean z) {
        ru6 ru6;
        ou6 ou6 = new ou6(ru6.class, tu6.class);
        uu6[] uu6Arr = (uu6[]) ((Object[]) g().b);
        int length = uu6Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (z) {
                ru6 = uu6Arr[i2].b;
            } else {
                ru6 ru62 = uu6Arr[i2].b;
                ru6 = new ru6(ru62.b, ru62.a);
            }
            ? obj = new Object();
            obj.a = IntCompanionObject.MIN_VALUE;
            ou6.add(Pair.create(ru6, obj));
        }
        return ou6.e();
    }

    public final nu6[] e() {
        if (this.n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f == null) {
                this.f = d(true);
            }
            if (!this.g) {
                b(this.f, true);
                this.g = true;
            }
            o5h o5h = this.f;
            int i2 = 0;
            while (true) {
                ru6[] ru6Arr = (ru6[]) ((Object[]) o5h.b);
                if (i2 >= ru6Arr.length) {
                    break;
                }
                k(arrayList, ru6Arr[i2], ((tu6[]) ((Object[]) o5h.c))[i2], false);
                i2++;
            }
            if (this.h == null) {
                this.h = d(false);
            }
            if (!this.i) {
                b(this.h, false);
                this.i = true;
            }
            o5h o5h2 = this.h;
            int i3 = 0;
            while (true) {
                ru6[] ru6Arr2 = (ru6[]) ((Object[]) o5h2.b);
                if (i3 >= ru6Arr2.length) {
                    break;
                }
                k(arrayList2, ru6Arr2[i3], ((tu6[]) ((Object[]) o5h2.c))[i3], false);
                i3++;
            }
            if (this.u) {
                int i4 = 0;
                while (i4 < f()) {
                    int i5 = i4 + 1;
                    k(arrayList, new ru6(i4, i5), new tu6(0), true);
                    i4 = i5;
                }
            }
            int f2 = f();
            k(arrayList, new ru6(0, f2), this.v, false);
            k(arrayList2, new ru6(f2, 0), this.w, false);
            nu6[] r2 = r(arrayList);
            nu6[] r3 = r(arrayList2);
            LogPrinter logPrinter = GridLayout.z;
            Object[] objArr = (Object[]) Array.newInstance(r2.getClass().getComponentType(), r2.length + r3.length);
            System.arraycopy(r2, 0, objArr, 0, r2.length);
            System.arraycopy(r3, 0, objArr, r2.length, r3.length);
            this.n = (nu6[]) objArr;
        }
        if (!this.o) {
            if (this.f == null) {
                this.f = d(true);
            }
            if (!this.g) {
                b(this.f, true);
                this.g = true;
            }
            if (this.h == null) {
                this.h = d(false);
            }
            if (!this.i) {
                b(this.h, false);
                this.i = true;
            }
            this.o = true;
        }
        return this.n;
    }

    public final int f() {
        return Math.max(this.b, i());
    }

    public final o5h g() {
        int i2;
        int i3;
        o5h o5h = this.d;
        boolean z = this.a;
        GridLayout gridLayout = this.x;
        if (o5h == null) {
            ou6 ou6 = new ou6(uu6.class, qu6.class);
            int childCount = gridLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                su6 su6 = (su6) gridLayout.getChildAt(i4).getLayoutParams();
                uu6 uu6 = z ? su6.b : su6.a;
                ou6.add(Pair.create(uu6, uu6.a(z).o()));
            }
            this.d = ou6.e();
        }
        if (!this.e) {
            qu6[] qu6Arr = (qu6[]) ((Object[]) this.d.c);
            for (qu6 c2 : qu6Arr) {
                c2.c();
            }
            int childCount2 = gridLayout.getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt = gridLayout.getChildAt(i5);
                su6 su62 = (su6) childAt.getLayoutParams();
                uu6 uu62 = z ? su62.b : su62.a;
                if (childAt.getVisibility() == 8) {
                    i2 = 0;
                } else {
                    LogPrinter logPrinter = GridLayout.z;
                    i2 = gridLayout.e(childAt, z, false) + gridLayout.e(childAt, z, true) + (z ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight());
                }
                if (uu62.d == c44.DEFAULT_ASPECT_RATIO) {
                    i3 = 0;
                } else {
                    if (this.t == null) {
                        this.t = new int[gridLayout.getChildCount()];
                    }
                    i3 = this.t[i5];
                }
                int i6 = i2 + i3;
                o5h o5h2 = this.d;
                qu6 qu6 = (qu6) ((Object[]) o5h2.c)[((int[]) o5h2.a)[i5]];
                qu6.c = ((uu62.c == GridLayout.D0 && uu62.d == c44.DEFAULT_ASPECT_RATIO) ? 0 : 2) & qu6.c;
                int n2 = uu62.a(z).n(childAt, i6, gridLayout.getLayoutMode());
                qu6.b(n2, i6 - n2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] h() {
        boolean z;
        if (this.p == null) {
            this.p = new int[(f() + 1)];
        }
        if (!this.q) {
            int[] iArr = this.p;
            boolean z2 = this.s;
            GridLayout gridLayout = this.x;
            float f2 = c44.DEFAULT_ASPECT_RATIO;
            boolean z3 = this.a;
            if (!z2) {
                int childCount = gridLayout.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        z = false;
                        break;
                    }
                    View childAt = gridLayout.getChildAt(i2);
                    if (childAt.getVisibility() != 8) {
                        su6 su6 = (su6) childAt.getLayoutParams();
                        if ((z3 ? su6.b : su6.a).d != c44.DEFAULT_ASPECT_RATIO) {
                            z = true;
                            break;
                        }
                    }
                    i2++;
                }
                this.r = z;
                this.s = true;
            }
            if (!this.r) {
                q(e(), iArr, true);
            } else {
                if (this.t == null) {
                    this.t = new int[gridLayout.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                q(e(), iArr, true);
                int childCount2 = (gridLayout.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = gridLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount3; i3++) {
                        View childAt2 = gridLayout.getChildAt(i3);
                        if (childAt2.getVisibility() != 8) {
                            su6 su62 = (su6) childAt2.getLayoutParams();
                            f2 += (z3 ? su62.b : su62.a).d;
                        }
                    }
                    int i4 = -1;
                    boolean z4 = true;
                    int i5 = 0;
                    while (i5 < childCount2) {
                        int i6 = (int) ((((long) i5) + ((long) childCount2)) / 2);
                        m();
                        p(f2, i6);
                        boolean q2 = q(e(), iArr, false);
                        if (q2) {
                            i5 = i6 + 1;
                            i4 = i6;
                        } else {
                            childCount2 = i6;
                        }
                        z4 = q2;
                    }
                    if (i4 > 0 && !z4) {
                        m();
                        p(f2, i4);
                        q(e(), iArr, true);
                    }
                }
            }
            if (!this.u) {
                int i7 = iArr[0];
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    iArr[i8] = iArr[i8] - i7;
                }
            }
            this.q = true;
        }
        return this.p;
    }

    public final int i() {
        int i2 = this.c;
        int i3 = IntCompanionObject.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            GridLayout gridLayout = this.x;
            int childCount = gridLayout.getChildCount();
            int i4 = -1;
            for (int i5 = 0; i5 < childCount; i5++) {
                su6 su6 = (su6) gridLayout.getChildAt(i5).getLayoutParams();
                ru6 ru6 = (this.a ? su6.b : su6.a).b;
                i4 = Math.max(Math.max(Math.max(i4, ru6.a), ru6.b), ru6.a());
            }
            if (i4 != -1) {
                i3 = i4;
            }
            this.c = Math.max(0, i3);
        }
        return this.c;
    }

    public final int j(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            this.v.a = 0;
            this.w.a = -size;
            this.q = false;
            return h()[f()];
        } else if (mode == 0) {
            this.v.a = 0;
            this.w.a = -100000;
            this.q = false;
            return h()[f()];
        } else if (mode != 1073741824) {
            return 0;
        } else {
            this.v.a = size;
            this.w.a = -size;
            this.q = false;
            return h()[f()];
        }
    }

    public final void l() {
        this.c = IntCompanionObject.MIN_VALUE;
        this.d = null;
        this.f = null;
        this.h = null;
        this.j = null;
        this.l = null;
        this.n = null;
        this.p = null;
        this.t = null;
        this.s = false;
        m();
    }

    public final void m() {
        this.e = false;
        this.g = false;
        this.i = false;
        this.k = false;
        this.m = false;
        this.o = false;
        this.q = false;
    }

    public final void o(int i2) {
        if (i2 == Integer.MIN_VALUE || i2 >= i()) {
            this.b = i2;
        } else {
            GridLayout.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void p(float f2, int i2) {
        Arrays.fill(this.t, 0);
        GridLayout gridLayout = this.x;
        int childCount = gridLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = gridLayout.getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                su6 su6 = (su6) childAt.getLayoutParams();
                float f3 = (this.a ? su6.b : su6.a).d;
                if (f3 != c44.DEFAULT_ASPECT_RATIO) {
                    int round = Math.round((((float) i2) * f3) / f2);
                    this.t[i3] = round;
                    i2 -= round;
                    f2 -= f3;
                }
            }
        }
    }

    public final boolean q(nu6[] nu6Arr, int[] iArr, boolean z) {
        String str = this.a ? "horizontal" : "vertical";
        int f2 = f() + 1;
        boolean[] zArr = null;
        for (int i2 = 0; i2 < nu6Arr.length; i2++) {
            Arrays.fill(iArr, 0);
            for (int i3 = 0; i3 < f2; i3++) {
                boolean z2 = false;
                for (nu6 n2 : nu6Arr) {
                    z2 |= n(iArr, n2);
                }
                if (!z2) {
                    if (zArr != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i4 = 0; i4 < nu6Arr.length; i4++) {
                            nu6 nu6 = nu6Arr[i4];
                            if (zArr[i4]) {
                                arrayList.add(nu6);
                            }
                            if (!nu6.c) {
                                arrayList2.add(nu6);
                            }
                        }
                        Printer printer = this.x.y;
                        StringBuilder m2 = g63.m(str, " constraints: ");
                        m2.append(a(arrayList));
                        m2.append(" are inconsistent; permanently removing: ");
                        m2.append(a(arrayList2));
                        m2.append(". ");
                        printer.println(m2.toString());
                    }
                    return true;
                }
            }
            if (!z) {
                return false;
            }
            boolean[] zArr2 = new boolean[nu6Arr.length];
            for (int i5 = 0; i5 < f2; i5++) {
                int length = nu6Arr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    zArr2[i6] = zArr2[i6] | n(iArr, nu6Arr[i6]);
                }
            }
            if (i2 == 0) {
                zArr = zArr2;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= nu6Arr.length) {
                    break;
                }
                if (zArr2[i7]) {
                    nu6 nu62 = nu6Arr[i7];
                    ru6 ru6 = nu62.a;
                    if (ru6.a >= ru6.b) {
                        nu62.c = false;
                        break;
                    }
                }
                i7++;
            }
        }
        return true;
    }

    public final nu6[] r(ArrayList arrayList) {
        mqf mqf = new mqf(this, (nu6[]) arrayList.toArray(new nu6[arrayList.size()]));
        int length = ((nu6[][]) mqf.v).length;
        for (int i2 = 0; i2 < length; i2++) {
            mqf.c0(i2);
        }
        return (nu6[]) mqf.o;
    }
}
