package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* renamed from: e54  reason: default package */
public abstract class e54 extends tyc implements bne {
    public Cloneable X;
    public xbg Y;
    public final /* synthetic */ int o;
    public final zx3 v;
    public List w;
    public int x;
    public final SparseArray y;
    public int z;

    public e54(zx3 zx3, int i) {
        this.o = i;
        switch (i) {
            case 1:
                this.v = zx3;
                this.X = new LongSparseArray();
                this.w = new ArrayList();
                this.x = IntCompanionObject.MAX_VALUE;
                this.y = new SparseArray();
                C(true);
                return;
            default:
                this.v = zx3;
                this.X = new ya8((Object) null);
                this.w = new ArrayList();
                this.x = IntCompanionObject.MAX_VALUE;
                this.y = new SparseArray();
                C(true);
                return;
        }
    }

    public static ViewPager2 J(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        ViewPager2 viewPager2 = parent instanceof ViewPager2 ? (ViewPager2) parent : null;
        if (viewPager2 != null) {
            return viewPager2;
        }
        throw new IllegalStateException(("Expected ViewPager2 instance. Got: " + recyclerView.getParent()).toString());
    }

    public static ViewPager2 K(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        ViewPager2 viewPager2 = parent instanceof ViewPager2 ? (ViewPager2) parent : null;
        if (viewPager2 != null) {
            return viewPager2;
        }
        ViewParent parent2 = recyclerView.getParent();
        throw new IllegalStateException(("Expected ViewPager2 instance. Got: " + parent2).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E(defpackage.j9d r8, int r9) {
        /*
            r7 = this;
            long r0 = r7.k(r9)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            zx3 r3 = r7.v
            oz1 r4 = r8.D0
            r5 = 1
            r6 = 0
            e9d r2 = r3.getChildRouter(r4, r2, r5, r6)
            r2.e = r5
            e9d r4 = r8.E0
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r4 != 0) goto L_0x0023
            e9d r4 = r8.E0
            if (r4 == 0) goto L_0x0023
            r3.removeChildRouter(r4)
        L_0x0023:
            r8.E0 = r2
            r8.F0 = r0
            boolean r3 = r2.n()
            if (r3 != 0) goto L_0x004d
            java.lang.Cloneable r3 = r7.X
            ya8 r3 = (defpackage.ya8) r3
            java.lang.Object r3 = r3.f(r0)
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r3 == 0) goto L_0x004d
            r2.N(r3)
            java.lang.Cloneable r3 = r7.X
            ya8 r3 = (defpackage.ya8) r3
            r3.j(r0)
            java.util.List r3 = r7.w
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.remove(r0)
            r6 = r5
        L_0x004d:
            java.util.ArrayList r0 = r2.e()
            java.lang.Object r0 = kotlin.collections.CollectionsKt.lastOrNull(r0)
            i9d r0 = (defpackage.i9d) r0
            if (r0 == 0) goto L_0x0062
            zx3 r0 = r0.a
            if (r0 == 0) goto L_0x0062
            zx3 r0 = r0.getTargetController()
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            if (r0 == 0) goto L_0x007e
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Router adapter. Attach router, target exist | router restored:"
            r1.<init>(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
        L_0x007e:
            r2.I()
            r7.G(r2, r9)
            int r0 = r7.z
            if (r9 == r0) goto L_0x00a2
            java.util.ArrayList r0 = r2.e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0090:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a2
            java.lang.Object r1 = r0.next()
            i9d r1 = (defpackage.i9d) r1
            zx3 r1 = r1.a
            r1.setOptionsMenuHidden(r5)
            goto L_0x0090
        L_0x00a2:
            android.util.SparseArray r7 = r7.y
            r7.put(r9, r2)
            r8.G0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e54.E(j9d, int):void");
    }

    public void F(k9d k9d, int i) {
        Bundle bundle;
        e9d e9d;
        long k = k(i);
        String valueOf = String.valueOf(k);
        zx3 zx3 = this.v;
        e9d childRouter = zx3.getChildRouter(k9d.D0, valueOf, true, false);
        childRouter.e = 1;
        if (!Intrinsics.areEqual((Object) childRouter, (Object) k9d.E0) && (e9d = k9d.E0) != null) {
            zx3.removeChildRouter(e9d);
        }
        k9d.E0 = childRouter;
        k9d.G0 = k;
        if (!childRouter.n() && (bundle = (Bundle) ((LongSparseArray) this.X).get(k)) != null) {
            childRouter.N(bundle);
            ((LongSparseArray) this.X).remove(k);
            this.w.remove(Long.valueOf(k));
        }
        childRouter.I();
        G(childRouter, i);
        if (i != this.z) {
            Iterator it = childRouter.e().iterator();
            while (it.hasNext()) {
                ((i9d) it.next()).a.setOptionsMenuHidden(true);
            }
        }
        this.y.put(i, childRouter);
        k9d.H0 = true;
    }

    public abstract void G(e9d e9d, int i);

    public void H(j9d j9d) {
        if (j9d.G0) {
            e9d e9d = j9d.E0;
            if (e9d != null) {
                e9d.F();
                O(j9d.F0, e9d);
                SparseArray sparseArray = this.y;
                if (Intrinsics.areEqual(sparseArray.get(j9d.p()), (Object) e9d)) {
                    sparseArray.remove(j9d.p());
                }
            }
            j9d.G0 = false;
        }
    }

    public void I(k9d k9d) {
        if (k9d.H0) {
            e9d e9d = k9d.E0;
            if (e9d != null) {
                e9d.F();
                N(k9d.G0, e9d);
                SparseArray sparseArray = this.y;
                if (Intrinsics.areEqual(sparseArray.get(k9d.F0), (Object) e9d)) {
                    sparseArray.remove(k9d.F0);
                }
            }
            k9d.H0 = false;
        }
    }

    public void L(k9d k9d) {
        I(k9d);
        e9d e9d = k9d.E0;
        if (e9d != null) {
            this.v.removeChildRouter(e9d);
            k9d.E0 = null;
        }
    }

    public void N(long j, e9d e9d) {
        Bundle bundle = new Bundle();
        e9d.O(bundle);
        ((LongSparseArray) this.X).put(j, bundle);
        this.w.remove(Long.valueOf(j));
        this.w.add(Long.valueOf(j));
        while (((LongSparseArray) this.X).size() > this.x) {
            ((LongSparseArray) this.X).remove(((Number) this.w.remove(0)).longValue());
        }
    }

    public void O(long j, e9d e9d) {
        Bundle bundle = new Bundle();
        e9d.O(bundle);
        ((ya8) this.X).i(j, bundle);
        this.w.remove(Long.valueOf(j));
        this.w.add(Long.valueOf(j));
        while (((ya8) this.X).k() > this.x) {
            ((ya8) this.X).j(((Number) this.w.remove(0)).longValue());
        }
    }

    public final Parcelable a() {
        switch (this.o) {
            case 0:
                SparseArray sparseArray = this.y;
                IntRange until = RangesKt.until(0, sparseArray.size());
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
                Iterator it = until.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(sparseArray.keyAt(((IntIterator) it).nextInt())));
                }
                List mutableList = CollectionsKt.toMutableList(arrayList);
                while (!mutableList.isEmpty()) {
                    int intValue = ((Number) mutableList.remove(CollectionsKt.getLastIndex(mutableList))).intValue();
                    O(k(intValue), (e9d) sparseArray.get(intValue));
                    if (!mutableList.isEmpty()) {
                        int intValue2 = ((Number) mutableList.remove(0)).intValue();
                        O(k(intValue2), (e9d) sparseArray.get(intValue2));
                    }
                }
                IntRange until2 = RangesKt.until(0, ((ya8) this.X).k());
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until2, 10));
                Iterator it2 = until2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((ya8) this.X).h(((IntIterator) it2).nextInt())));
                }
                IntRange until3 = RangesKt.until(0, ((ya8) this.X).k());
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until3, 10));
                Iterator it3 = until3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add((Bundle) ((ya8) this.X).l(((IntIterator) it3).nextInt()));
                }
                return new d54(arrayList2, arrayList3, this.w, this.x);
            default:
                SparseArray sparseArray2 = this.y;
                IntRange until4 = RangesKt.until(0, sparseArray2.size());
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until4, 10));
                Iterator it4 = until4.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(Integer.valueOf(sparseArray2.keyAt(((IntIterator) it4).nextInt())));
                }
                List mutableList2 = CollectionsKt.toMutableList(arrayList4);
                while (!mutableList2.isEmpty()) {
                    int intValue3 = ((Number) mutableList2.remove(CollectionsKt.getLastIndex(mutableList2))).intValue();
                    N(k(intValue3), (e9d) sparseArray2.get(intValue3));
                    if (!mutableList2.isEmpty()) {
                        int intValue4 = ((Number) mutableList2.remove(0)).intValue();
                        N(k(intValue4), (e9d) sparseArray2.get(intValue4));
                    }
                }
                IntRange until5 = RangesKt.until(0, ((LongSparseArray) this.X).size());
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until5, 10));
                Iterator it5 = until5.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(Long.valueOf(((LongSparseArray) this.X).keyAt(((IntIterator) it5).nextInt())));
                }
                IntRange until6 = RangesKt.until(0, ((LongSparseArray) this.X).size());
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until6, 10));
                Iterator it6 = until6.iterator();
                while (it6.hasNext()) {
                    arrayList6.add((Bundle) ((LongSparseArray) this.X).valueAt(((IntIterator) it6).nextInt()));
                }
                return new h9d(arrayList5, arrayList6, this.w, this.x);
        }
    }

    public final void c(Parcelable parcelable) {
        switch (this.o) {
            case 0:
                if (parcelable instanceof d54) {
                    this.X = new ya8((Object) null);
                    d54 d54 = (d54) parcelable;
                    Iterator it = CollectionsKt.getIndices(d54.a).iterator();
                    while (it.hasNext()) {
                        int nextInt = ((IntIterator) it).nextInt();
                        ((ya8) this.X).i(((Number) d54.a.get(nextInt)).longValue(), d54.b.get(nextInt));
                    }
                    this.w = CollectionsKt.toMutableList(d54.c);
                    this.x = d54.o;
                    return;
                }
                return;
            default:
                if (parcelable instanceof h9d) {
                    this.X = new LongSparseArray();
                    h9d h9d = (h9d) parcelable;
                    Iterator it2 = CollectionsKt.getIndices(h9d.a).iterator();
                    while (it2.hasNext()) {
                        int nextInt2 = ((IntIterator) it2).nextInt();
                        ((LongSparseArray) this.X).put(((Number) h9d.a.get(nextInt2)).longValue(), h9d.b.get(nextInt2));
                    }
                    this.w = CollectionsKt.toMutableList(h9d.c);
                    this.x = h9d.o;
                    return;
                }
                return;
        }
    }

    public long k(int i) {
        return (long) i;
    }

    public final void r(RecyclerView recyclerView) {
        switch (this.o) {
            case 0:
                ViewPager2 K = K(recyclerView);
                gi0 gi0 = new gi0(6, this);
                K.b(gi0);
                this.Y = gi0;
                return;
            default:
                ViewPager2 J = J(recyclerView);
                gi0 gi02 = new gi0(9, this);
                J.b(gi02);
                this.Y = gi02;
                return;
        }
    }

    public final void s(pzc pzc, int i) {
        switch (this.o) {
            case 0:
                E((j9d) pzc, i);
                return;
            default:
                k9d k9d = (k9d) pzc;
                k9d.F0 = i;
                F(k9d, i);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [oz1, android.widget.FrameLayout, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v5, types: [oz1, android.widget.FrameLayout, android.view.View] */
    public final pzc u(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                int i2 = j9d.H0;
                ? frameLayout = new FrameLayout(viewGroup.getContext());
                WeakHashMap weakHashMap = gag.a;
                frameLayout.setId(View.generateViewId());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.setSaveEnabled(false);
                return new j9d(frameLayout);
            default:
                int i3 = k9d.I0;
                ? frameLayout2 = new FrameLayout(viewGroup.getContext());
                WeakHashMap weakHashMap2 = gag.a;
                frameLayout2.setId(View.generateViewId());
                frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout2.setSaveEnabled(false);
                return new k9d(frameLayout2);
        }
    }

    public final void v(RecyclerView recyclerView) {
        switch (this.o) {
            case 0:
                ViewPager2 K = K(recyclerView);
                gi0 gi0 = (gi0) this.Y;
                if (gi0 != null) {
                    K.g(gi0);
                }
                this.Y = null;
                return;
            default:
                ViewPager2 J = J(recyclerView);
                gi0 gi02 = (gi0) this.Y;
                if (gi02 != null) {
                    J.g(gi02);
                }
                this.Y = null;
                return;
        }
    }

    public final /* bridge */ /* synthetic */ boolean w(pzc pzc) {
        switch (this.o) {
            case 0:
                j9d j9d = (j9d) pzc;
                return true;
            default:
                k9d k9d = (k9d) pzc;
                return true;
        }
    }

    public final void x(pzc pzc) {
        switch (this.o) {
            case 0:
                j9d j9d = (j9d) pzc;
                if (!j9d.G0) {
                    E(j9d, j9d.p());
                    return;
                }
                return;
            default:
                k9d k9d = (k9d) pzc;
                if (!k9d.H0) {
                    F(k9d, k9d.F0);
                    return;
                }
                return;
        }
    }

    public final void y(pzc pzc) {
        switch (this.o) {
            case 0:
                j9d j9d = (j9d) pzc;
                H(j9d);
                j9d.D0.removeAllViews();
                return;
            default:
                k9d k9d = (k9d) pzc;
                I(k9d);
                k9d.D0.removeAllViews();
                return;
        }
    }

    public void z(pzc pzc) {
        switch (this.o) {
            case 0:
                j9d j9d = (j9d) pzc;
                H(j9d);
                e9d e9d = j9d.E0;
                if (e9d != null) {
                    this.v.removeChildRouter(e9d);
                    j9d.E0 = null;
                    return;
                }
                return;
            default:
                L((k9d) pzc);
                return;
        }
    }
}
