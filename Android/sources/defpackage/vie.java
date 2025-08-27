package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: vie  reason: default package */
public final class vie {
    public final ArrayList a = new ArrayList();
    public int b = IntCompanionObject.MIN_VALUE;
    public int c = IntCompanionObject.MIN_VALUE;
    public int d = 0;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public vie(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public final void a() {
        View view = (View) a81.h(1, this.a);
        this.c = this.f.r.c(view);
        ((sie) view.getLayoutParams()).getClass();
    }

    public final void b() {
        this.a.clear();
        this.b = IntCompanionObject.MIN_VALUE;
        this.c = IntCompanionObject.MIN_VALUE;
        this.d = 0;
    }

    public final int c() {
        boolean z = this.f.w;
        ArrayList arrayList = this.a;
        return z ? e(arrayList.size() - 1, -1, false, true) : e(0, arrayList.size(), false, true);
    }

    public final int d() {
        boolean z = this.f.w;
        ArrayList arrayList = this.a;
        return z ? e(0, arrayList.size(), false, true) : e(arrayList.size() - 1, -1, false, true);
    }

    public final int e(int i, int i2, boolean z, boolean z2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int m = staggeredGridLayoutManager.r.m();
        int h = staggeredGridLayoutManager.r.h();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.a.get(i);
            int f2 = staggeredGridLayoutManager.r.f(view);
            int c2 = staggeredGridLayoutManager.r.c(view);
            boolean z3 = false;
            boolean z4 = !z2 ? f2 < h : f2 <= h;
            if (!z2 ? c2 > m : c2 >= m) {
                z3 = true;
            }
            if (z4 && z3) {
                if (z) {
                    return a.M(view);
                }
                if (f2 < m || c2 > h) {
                    return a.M(view);
                }
            }
            i += i3;
        }
        return -1;
    }

    public final int f(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        a();
        return this.c;
    }

    public final View g(int i, int i2) {
        ArrayList arrayList = this.a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && a.M(view2) >= i) || ((!staggeredGridLayoutManager.w && a.M(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.w && a.M(view3) <= i) || ((!staggeredGridLayoutManager.w && a.M(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        View view = (View) this.a.get(0);
        this.b = this.f.r.f(view);
        ((sie) view.getLayoutParams()).getClass();
        return this.b;
    }
}
