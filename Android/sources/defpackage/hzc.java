package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: hzc  reason: default package */
public final class hzc {
    public final ArrayList a;
    public ArrayList b = null;
    public final ArrayList c = new ArrayList();
    public final List d;
    public int e;
    public int f;
    public b g;
    public final /* synthetic */ RecyclerView h;

    public hzc(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(pzc pzc, boolean z) {
        RecyclerView.o(pzc);
        RecyclerView recyclerView = this.h;
        rzc rzc = recyclerView.x1;
        if (rzc != null) {
            v3 j = rzc.j();
            boolean z2 = j instanceof qzc;
            View view = pzc.a;
            gag.j(view, z2 ? (v3) ((qzc) j).e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.A0;
            if (arrayList.size() <= 0) {
                tyc tyc = recyclerView.y0;
                if (tyc != null) {
                    tyc.z(pzc);
                }
                if (recyclerView.q1 != null) {
                    recyclerView.x.I(pzc);
                }
                if (RecyclerView.K1) {
                    Objects.toString(pzc);
                }
            } else {
                rae.w(arrayList.get(0));
                throw null;
            }
        }
        pzc.B0 = null;
        pzc.A0 = null;
        c().putRecycledView(pzc);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.q1.b()) {
            return !recyclerView.q1.h ? i : recyclerView.v.z(i, 0);
        }
        StringBuilder o = wj6.o(i, "invalid position ", ". State item count is ");
        o.append(recyclerView.q1.b());
        o.append(recyclerView.F());
        throw new IndexOutOfBoundsException(o.toString());
    }

    public final b c() {
        if (this.g == null) {
            this.g = new b();
            d();
        }
        return this.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r2.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r2 = this;
            androidx.recyclerview.widget.b r0 = r2.g
            if (r0 == 0) goto L_0x0011
            androidx.recyclerview.widget.RecyclerView r2 = r2.h
            tyc r1 = r2.y0
            if (r1 == 0) goto L_0x0011
            boolean r2 = r2.E0
            if (r2 == 0) goto L_0x0011
            r0.attachForPoolingContainer(r1)
        L_0x0011:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzc.d():void");
    }

    public final void e() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            f(size);
        }
        this.c.clear();
        if (RecyclerView.P1) {
            e13 e13 = this.h.p1;
            int[] iArr = e13.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            e13.d = 0;
        }
    }

    public final void f(int i) {
        boolean z = RecyclerView.J1;
        pzc pzc = (pzc) this.c.get(i);
        if (RecyclerView.K1) {
            Objects.toString(pzc);
        }
        a(pzc, true);
        this.c.remove(i);
    }

    public final void g(View view) {
        pzc V = RecyclerView.V(view);
        boolean E = V.E();
        RecyclerView recyclerView = this.h;
        if (E) {
            recyclerView.removeDetachedView(view, false);
        }
        if (V.C()) {
            V.w0.k(V);
        } else if (V.L()) {
            V.X &= -33;
        }
        h(V);
        if (recyclerView.Y0 != null && !V.A()) {
            recyclerView.Y0.j(V);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.pzc r12) {
        /*
            r11 = this;
            boolean r0 = r12.C()
            r1 = 0
            r2 = 1
            androidx.recyclerview.widget.RecyclerView r3 = r11.h
            android.view.View r4 = r12.a
            if (r0 != 0) goto L_0x0121
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0014
            goto L_0x0121
        L_0x0014:
            boolean r0 = r12.E()
            if (r0 != 0) goto L_0x010d
            boolean r0 = r12.K()
            if (r0 != 0) goto L_0x00fc
            int r0 = r12.X
            r0 = r0 & 16
            if (r0 != 0) goto L_0x0030
            java.util.WeakHashMap r0 = defpackage.gag.a
            boolean r0 = r4.hasTransientState()
            if (r0 == 0) goto L_0x0030
            r0 = r2
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            tyc r5 = r3.y0
            if (r5 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x003f
            boolean r5 = r5.w(r12)
            if (r5 == 0) goto L_0x003f
            r5 = r2
            goto L_0x0040
        L_0x003f:
            r5 = r1
        L_0x0040:
            boolean r6 = androidx.recyclerview.widget.RecyclerView.J1
            if (r6 == 0) goto L_0x0061
            java.util.ArrayList r6 = r11.c
            boolean r6 = r6.contains(r12)
            if (r6 != 0) goto L_0x004d
            goto L_0x0061
        L_0x004d:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "cached view received recycle internal? "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = defpackage.a81.k(r3, r0)
            r11.<init>(r12)
            throw r11
        L_0x0061:
            if (r5 != 0) goto L_0x0074
            boolean r5 = r12.A()
            if (r5 == 0) goto L_0x006a
            goto L_0x0074
        L_0x006a:
            boolean r11 = androidx.recyclerview.widget.RecyclerView.K1
            if (r11 == 0) goto L_0x0071
            r3.F()
        L_0x0071:
            r2 = r1
            goto L_0x00e8
        L_0x0074:
            int r5 = r11.f
            if (r5 <= 0) goto L_0x00de
            r5 = 526(0x20e, float:7.37E-43)
            boolean r5 = r12.v(r5)
            if (r5 != 0) goto L_0x00de
            java.util.ArrayList r5 = r11.c
            int r5 = r5.size()
            int r6 = r11.f
            if (r5 < r6) goto L_0x0091
            if (r5 <= 0) goto L_0x0091
            r11.f(r1)
            int r5 = r5 + -1
        L_0x0091:
            boolean r6 = androidx.recyclerview.widget.RecyclerView.P1
            if (r6 == 0) goto L_0x00d7
            if (r5 <= 0) goto L_0x00d7
            e13 r6 = r3.p1
            int r7 = r12.c
            int[] r8 = r6.c
            if (r8 == 0) goto L_0x00b0
            int r8 = r6.d
            int r8 = r8 * 2
            r9 = r1
        L_0x00a4:
            if (r9 >= r8) goto L_0x00b0
            int[] r10 = r6.c
            r10 = r10[r9]
            if (r10 != r7) goto L_0x00ad
            goto L_0x00d7
        L_0x00ad:
            int r9 = r9 + 2
            goto L_0x00a4
        L_0x00b0:
            int r5 = r5 - r2
        L_0x00b1:
            if (r5 < 0) goto L_0x00d6
            java.util.ArrayList r6 = r11.c
            java.lang.Object r6 = r6.get(r5)
            pzc r6 = (defpackage.pzc) r6
            int r6 = r6.c
            e13 r7 = r3.p1
            int[] r8 = r7.c
            if (r8 == 0) goto L_0x00d6
            int r8 = r7.d
            int r8 = r8 * 2
            r9 = r1
        L_0x00c8:
            if (r9 >= r8) goto L_0x00d6
            int[] r10 = r7.c
            r10 = r10[r9]
            if (r10 != r6) goto L_0x00d3
            int r5 = r5 + -1
            goto L_0x00b1
        L_0x00d3:
            int r9 = r9 + 2
            goto L_0x00c8
        L_0x00d6:
            int r5 = r5 + r2
        L_0x00d7:
            java.util.ArrayList r6 = r11.c
            r6.add(r5, r12)
            r5 = r2
            goto L_0x00df
        L_0x00de:
            r5 = r1
        L_0x00df:
            if (r5 != 0) goto L_0x00e6
            r11.a(r12, r2)
        L_0x00e4:
            r1 = r5
            goto L_0x00e8
        L_0x00e6:
            r2 = r1
            goto L_0x00e4
        L_0x00e8:
            ox0 r11 = r3.x
            r11.I(r12)
            if (r1 != 0) goto L_0x00fb
            if (r2 != 0) goto L_0x00fb
            if (r0 == 0) goto L_0x00fb
            defpackage.tqb.a(r4)
            r11 = 0
            r12.B0 = r11
            r12.A0 = r11
        L_0x00fb:
            return
        L_0x00fc:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            r12.<init>(r0)
            java.lang.String r12 = defpackage.a81.k(r3, r12)
            r11.<init>(r12)
            throw r11
        L_0x010d:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = defpackage.a81.k(r3, r0)
            r11.<init>(r12)
            throw r11
        L_0x0121:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "Scrapped or attached views may not be recycled. isScrap:"
            r0.<init>(r5)
            boolean r12 = r12.C()
            r0.append(r12)
            java.lang.String r12 = " isAttached:"
            r0.append(r12)
            android.view.ViewParent r12 = r4.getParent()
            if (r12 == 0) goto L_0x013d
            r1 = r2
        L_0x013d:
            r0.append(r1)
            java.lang.String r12 = r3.F()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzc.h(pzc):void");
    }

    public final void i(View view) {
        yyc yyc;
        pzc V = RecyclerView.V(view);
        boolean v = V.v(12);
        RecyclerView recyclerView = this.h;
        if (!v && V.G() && (yyc = recyclerView.Y0) != null && !yyc.f(V, V.t())) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            V.w0 = this;
            V.x0 = true;
            this.b.add(V);
        } else if (!V.z() || V.B() || recyclerView.y0.b) {
            V.w0 = this;
            V.x0 = false;
            this.a.add(V);
        } else {
            throw new IllegalArgumentException(a81.k(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02f7, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x03f1, code lost:
        if (r11.z() == false) goto L_0x03f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.pzc j(int r22, long r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = -1
            r8 = 1
            androidx.recyclerview.widget.RecyclerView r9 = r0.h
            if (r1 < 0) goto L_0x04ec
            lzc r3 = r9.q1
            int r3 = r3.b()
            if (r1 >= r3) goto L_0x04ec
            lzc r10 = r9.q1
            boolean r3 = r10.h
            r12 = 0
            r4 = 32
            if (r3 == 0) goto L_0x0084
            java.util.ArrayList r3 = r0.b
            if (r3 == 0) goto L_0x007d
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0026
            goto L_0x007d
        L_0x0026:
            r5 = r12
        L_0x0027:
            if (r5 >= r3) goto L_0x0043
            java.util.ArrayList r6 = r0.b
            java.lang.Object r6 = r6.get(r5)
            pzc r6 = (defpackage.pzc) r6
            boolean r7 = r6.L()
            if (r7 != 0) goto L_0x0041
            int r7 = r6.s()
            if (r7 != r1) goto L_0x0041
            r6.n(r4)
            goto L_0x007e
        L_0x0041:
            int r5 = r5 + r8
            goto L_0x0027
        L_0x0043:
            tyc r5 = r9.y0
            boolean r5 = r5.b
            if (r5 == 0) goto L_0x007d
            u9 r5 = r9.v
            int r5 = r5.z(r1, r12)
            if (r5 <= 0) goto L_0x007d
            tyc r6 = r9.y0
            int r6 = r6.j()
            if (r5 >= r6) goto L_0x007d
            tyc r6 = r9.y0
            long r5 = r6.k(r5)
            r7 = r12
        L_0x0060:
            if (r7 >= r3) goto L_0x007d
            java.util.ArrayList r13 = r0.b
            java.lang.Object r13 = r13.get(r7)
            pzc r13 = (defpackage.pzc) r13
            boolean r14 = r13.L()
            if (r14 != 0) goto L_0x007b
            long r14 = r13.v
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 != 0) goto L_0x007b
            r13.n(r4)
            r6 = r13
            goto L_0x007e
        L_0x007b:
            int r7 = r7 + r8
            goto L_0x0060
        L_0x007d:
            r6 = 0
        L_0x007e:
            if (r6 == 0) goto L_0x0082
            r3 = r8
            goto L_0x0086
        L_0x0082:
            r3 = r12
            goto L_0x0086
        L_0x0084:
            r3 = r12
            r6 = 0
        L_0x0086:
            if (r6 != 0) goto L_0x024e
            java.util.ArrayList r5 = r0.a
            int r5 = r5.size()
            r6 = r12
        L_0x008f:
            if (r6 >= r5) goto L_0x00bd
            java.util.ArrayList r7 = r0.a
            java.lang.Object r7 = r7.get(r6)
            pzc r7 = (defpackage.pzc) r7
            boolean r13 = r7.L()
            if (r13 != 0) goto L_0x00bb
            int r13 = r7.s()
            if (r13 != r1) goto L_0x00bb
            boolean r13 = r7.z()
            if (r13 != 0) goto L_0x00bb
            boolean r13 = r10.h
            if (r13 != 0) goto L_0x00b5
            boolean r13 = r7.B()
            if (r13 != 0) goto L_0x00bb
        L_0x00b5:
            r7.n(r4)
        L_0x00b8:
            r6 = r7
            goto L_0x01ba
        L_0x00bb:
            int r6 = r6 + r8
            goto L_0x008f
        L_0x00bd:
            mqf r5 = r9.w
            java.lang.Object r6 = r5.w
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r7 = r6.size()
            r13 = r12
        L_0x00c8:
            if (r13 >= r7) goto L_0x00f0
            java.lang.Object r14 = r6.get(r13)
            android.view.View r14 = (android.view.View) r14
            java.lang.Object r15 = r5.o
            u6h r15 = (defpackage.u6h) r15
            r15.getClass()
            pzc r15 = androidx.recyclerview.widget.RecyclerView.V(r14)
            int r11 = r15.s()
            if (r11 != r1) goto L_0x00ee
            boolean r11 = r15.z()
            if (r11 != 0) goto L_0x00ee
            boolean r11 = r15.B()
            if (r11 != 0) goto L_0x00ee
            goto L_0x00f1
        L_0x00ee:
            int r13 = r13 + r8
            goto L_0x00c8
        L_0x00f0:
            r14 = 0
        L_0x00f1:
            if (r14 == 0) goto L_0x0186
            pzc r5 = androidx.recyclerview.widget.RecyclerView.V(r14)
            mqf r6 = r9.w
            java.lang.Object r7 = r6.o
            u6h r7 = (defpackage.u6h) r7
            java.lang.Object r7 = r7.b
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            int r7 = r7.indexOfChild(r14)
            if (r7 < 0) goto L_0x0172
            java.lang.Object r11 = r6.v
            jz2 r11 = (defpackage.jz2) r11
            boolean r13 = r11.S(r7)
            if (r13 == 0) goto L_0x015e
            r11.P(r7)
            r6.a0(r14)
            mqf r6 = r9.w
            java.lang.Object r7 = r6.o
            u6h r7 = (defpackage.u6h) r7
            java.lang.Object r7 = r7.b
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            int r7 = r7.indexOfChild(r14)
            if (r7 != r2) goto L_0x0129
        L_0x0127:
            r7 = r2
            goto L_0x0139
        L_0x0129:
            java.lang.Object r6 = r6.v
            jz2 r6 = (defpackage.jz2) r6
            boolean r11 = r6.S(r7)
            if (r11 == 0) goto L_0x0134
            goto L_0x0127
        L_0x0134:
            int r6 = r6.Q(r7)
            int r7 = r7 - r6
        L_0x0139:
            if (r7 == r2) goto L_0x014a
            mqf r6 = r9.w
            r6.y(r7)
            r0.i(r14)
            r6 = 8224(0x2020, float:1.1524E-41)
            r5.n(r6)
            r6 = r5
            goto L_0x01ba
        L_0x014a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "layout index should not be -1 after unhiding a view:"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = defpackage.a81.k(r9, r1)
            r0.<init>(r1)
            throw r0
        L_0x015e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "trying to unhide a view that was not hidden"
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0172:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "view is not a child, cannot hide "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0186:
            java.util.ArrayList r5 = r0.c
            int r5 = r5.size()
            r6 = r12
        L_0x018d:
            if (r6 >= r5) goto L_0x01b9
            java.util.ArrayList r7 = r0.c
            java.lang.Object r7 = r7.get(r6)
            pzc r7 = (defpackage.pzc) r7
            boolean r11 = r7.z()
            if (r11 != 0) goto L_0x01b7
            int r11 = r7.s()
            if (r11 != r1) goto L_0x01b7
            boolean r11 = r7.x()
            if (r11 != 0) goto L_0x01b7
            java.util.ArrayList r5 = r0.c
            r5.remove(r6)
            boolean r5 = androidx.recyclerview.widget.RecyclerView.K1
            if (r5 == 0) goto L_0x00b8
            r7.toString()
            goto L_0x00b8
        L_0x01b7:
            int r6 = r6 + r8
            goto L_0x018d
        L_0x01b9:
            r6 = 0
        L_0x01ba:
            if (r6 == 0) goto L_0x024e
            boolean r5 = r6.B()
            if (r5 == 0) goto L_0x01df
            boolean r5 = androidx.recyclerview.widget.RecyclerView.J1
            if (r5 == 0) goto L_0x01dc
            boolean r5 = r10.h
            if (r5 == 0) goto L_0x01cb
            goto L_0x01dc
        L_0x01cb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "should not receive a removed view unless it is pre layout"
            r1.<init>(r2)
            java.lang.String r1 = defpackage.a81.k(r9, r1)
            r0.<init>(r1)
            throw r0
        L_0x01dc:
            boolean r5 = r10.h
            goto L_0x0210
        L_0x01df:
            int r5 = r6.c
            if (r5 < 0) goto L_0x023a
            tyc r7 = r9.y0
            int r7 = r7.j()
            if (r5 >= r7) goto L_0x023a
            boolean r5 = r10.h
            if (r5 != 0) goto L_0x01fd
            tyc r5 = r9.y0
            int r7 = r6.c
            int r5 = r5.l(r7)
            int r7 = r6.w
            if (r5 == r7) goto L_0x01fd
        L_0x01fb:
            r5 = r12
            goto L_0x0210
        L_0x01fd:
            tyc r5 = r9.y0
            boolean r7 = r5.b
            if (r7 == 0) goto L_0x020f
            long r13 = r6.v
            int r7 = r6.c
            long r16 = r5.k(r7)
            int r5 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r5 != 0) goto L_0x01fb
        L_0x020f:
            r5 = r8
        L_0x0210:
            if (r5 != 0) goto L_0x0238
            r5 = 4
            r6.n(r5)
            boolean r5 = r6.C()
            if (r5 == 0) goto L_0x0227
            android.view.View r5 = r6.a
            r9.removeDetachedView(r5, r12)
            hzc r5 = r6.w0
            r5.k(r6)
            goto L_0x0233
        L_0x0227:
            boolean r5 = r6.L()
            if (r5 == 0) goto L_0x0233
            int r5 = r6.X
            r5 = r5 & -33
            r6.X = r5
        L_0x0233:
            r0.h(r6)
            r6 = 0
            goto L_0x024e
        L_0x0238:
            r3 = r8
            goto L_0x024e
        L_0x023a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Inconsistency detected. Invalid view holder adapter position"
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = defpackage.a81.k(r9, r1)
            r0.<init>(r1)
            throw r0
        L_0x024e:
            if (r6 != 0) goto L_0x039f
            u9 r5 = r9.v
            int r5 = r5.z(r1, r12)
            if (r5 < 0) goto L_0x037d
            tyc r7 = r9.y0
            int r7 = r7.j()
            if (r5 >= r7) goto L_0x037d
            tyc r7 = r9.y0
            int r11 = r7.l(r5)
            tyc r7 = r9.y0
            boolean r15 = r7.b
            if (r15 == 0) goto L_0x0304
            long r6 = r7.k(r5)
            java.util.ArrayList r15 = r0.a
            int r15 = r15.size()
            int r15 = r15 - r8
        L_0x0277:
            if (r15 < 0) goto L_0x02ca
            java.util.ArrayList r13 = r0.a
            java.lang.Object r13 = r13.get(r15)
            pzc r13 = (defpackage.pzc) r13
            r18 = r3
            long r2 = r13.v
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x02c5
            boolean r2 = r13.L()
            if (r2 != 0) goto L_0x02c5
            int r2 = r13.w
            if (r11 != r2) goto L_0x02a9
            r13.n(r4)
            boolean r2 = r13.B()
            if (r2 == 0) goto L_0x02fc
            boolean r2 = r10.h
            if (r2 != 0) goto L_0x02fc
            int r2 = r13.X
            r2 = r2 & -15
            r2 = r2 | 2
            r13.X = r2
            goto L_0x02fc
        L_0x02a9:
            java.util.ArrayList r2 = r0.a
            r2.remove(r15)
            android.view.View r2 = r13.a
            r9.removeDetachedView(r2, r12)
            pzc r2 = androidx.recyclerview.widget.RecyclerView.V(r2)
            r3 = 0
            r2.w0 = r3
            r2.x0 = r12
            int r3 = r2.X
            r3 = r3 & -33
            r2.X = r3
            r0.h(r2)
        L_0x02c5:
            r2 = -1
            int r15 = r15 + r2
            r3 = r18
            goto L_0x0277
        L_0x02ca:
            r18 = r3
            java.util.ArrayList r2 = r0.c
            int r2 = r2.size()
            int r2 = r2 - r8
        L_0x02d3:
            if (r2 < 0) goto L_0x02f7
            java.util.ArrayList r3 = r0.c
            java.lang.Object r3 = r3.get(r2)
            pzc r3 = (defpackage.pzc) r3
            long r14 = r3.v
            int r13 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r13 != 0) goto L_0x02f9
            boolean r13 = r3.x()
            if (r13 != 0) goto L_0x02f9
            int r4 = r3.w
            if (r11 != r4) goto L_0x02f4
            java.util.ArrayList r4 = r0.c
            r4.remove(r2)
            r13 = r3
            goto L_0x02fc
        L_0x02f4:
            r0.f(r2)
        L_0x02f7:
            r13 = 0
            goto L_0x02fc
        L_0x02f9:
            r3 = -1
            int r2 = r2 + r3
            goto L_0x02d3
        L_0x02fc:
            if (r13 == 0) goto L_0x0302
            r13.c = r5
            r18 = r8
        L_0x0302:
            r6 = r13
            goto L_0x0306
        L_0x0304:
            r18 = r3
        L_0x0306:
            if (r6 != 0) goto L_0x0318
            boolean r2 = androidx.recyclerview.widget.RecyclerView.J1
            androidx.recyclerview.widget.b r2 = r21.c()
            pzc r2 = r2.getRecycledView(r11)
            if (r2 == 0) goto L_0x0317
            r2.I()
        L_0x0317:
            r6 = r2
        L_0x0318:
            if (r6 != 0) goto L_0x036d
            long r13 = r9.getNanoTime()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r23 > r2 ? 1 : (r23 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0335
            androidx.recyclerview.widget.b r2 = r0.g
            r3 = r11
            r4 = r13
            r6 = r23
            boolean r2 = r2.willCreateInTime(r3, r4, r6)
            if (r2 != 0) goto L_0x0335
            r2 = 0
            return r2
        L_0x0335:
            tyc r2 = r9.y0
            r2.getClass()
            java.lang.String r3 = "RV CreateView"
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x036f }
            pzc r6 = r2.u(r9, r11)     // Catch:{ all -> 0x036f }
            android.view.View r2 = r6.a     // Catch:{ all -> 0x036f }
            android.view.ViewParent r2 = r2.getParent()     // Catch:{ all -> 0x036f }
            if (r2 != 0) goto L_0x0371
            r6.w = r11     // Catch:{ all -> 0x036f }
            android.os.Trace.endSection()
            boolean r2 = androidx.recyclerview.widget.RecyclerView.P1
            if (r2 == 0) goto L_0x0363
            android.view.View r2 = r6.a
            androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.L(r2)
            if (r2 == 0) goto L_0x0363
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r6.b = r3
        L_0x0363:
            long r2 = r9.getNanoTime()
            androidx.recyclerview.widget.b r4 = r0.g
            long r2 = r2 - r13
            r4.factorInCreateTime(r11, r2)
        L_0x036d:
            r11 = r6
            goto L_0x03a2
        L_0x036f:
            r0 = move-exception
            goto L_0x0379
        L_0x0371:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x036f }
            java.lang.String r1 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
            r0.<init>(r1)     // Catch:{ all -> 0x036f }
            throw r0     // Catch:{ all -> 0x036f }
        L_0x0379:
            android.os.Trace.endSection()
            throw r0
        L_0x037d:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "Inconsistency detected. Invalid item position "
            java.lang.String r3 = "(offset:"
            java.lang.String r4 = ").state:"
            java.lang.StringBuilder r1 = defpackage.a81.n(r2, r1, r3, r5, r4)
            int r2 = r10.b()
            r1.append(r2)
            java.lang.String r2 = r9.F()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x039f:
            r18 = r3
            goto L_0x036d
        L_0x03a2:
            if (r18 == 0) goto L_0x03cd
            boolean r2 = r10.h
            if (r2 != 0) goto L_0x03cd
            r2 = 8192(0x2000, float:1.14794E-41)
            boolean r2 = r11.v(r2)
            if (r2 == 0) goto L_0x03cd
            int r2 = r11.X
            r2 = r2 & -8193(0xffffffffffffdfff, float:NaN)
            r11.X = r2
            boolean r2 = r10.k
            if (r2 == 0) goto L_0x03cd
            int r2 = defpackage.yyc.e(r11)
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            yyc r3 = r9.Y0
            java.util.List r4 = r11.t()
            ft r2 = r3.o(r10, r11, r2, r4)
            r9.n0(r11, r2)
        L_0x03cd:
            boolean r2 = r10.h
            android.view.View r13 = r11.a
            if (r2 == 0) goto L_0x03dc
            boolean r2 = r11.y()
            if (r2 == 0) goto L_0x03dc
            r11.x = r1
            goto L_0x03f4
        L_0x03dc:
            boolean r2 = r11.y()
            if (r2 == 0) goto L_0x03f7
            int r2 = r11.X
            r2 = r2 & 2
            if (r2 == 0) goto L_0x03ea
            r2 = r8
            goto L_0x03eb
        L_0x03ea:
            r2 = r12
        L_0x03eb:
            if (r2 != 0) goto L_0x03f7
            boolean r2 = r11.z()
            if (r2 == 0) goto L_0x03f4
            goto L_0x03f7
        L_0x03f4:
            r0 = r12
            goto L_0x04bf
        L_0x03f7:
            boolean r2 = androidx.recyclerview.widget.RecyclerView.J1
            if (r2 == 0) goto L_0x0416
            boolean r2 = r11.B()
            if (r2 != 0) goto L_0x0402
            goto L_0x0416
        L_0x0402:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Removed holder should be bound and it should come here only in pre-layout. Holder: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r1 = defpackage.a81.k(r9, r1)
            r0.<init>(r1)
            throw r0
        L_0x0416:
            u9 r2 = r9.v
            int r14 = r2.z(r1, r12)
            r15 = 0
            r11.B0 = r15
            r11.A0 = r9
            int r3 = r11.w
            long r19 = r9.getNanoTime()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x043d
            androidx.recyclerview.widget.b r2 = r0.g
            r4 = r19
            r6 = r23
            boolean r2 = r2.willBindInTime(r3, r4, r6)
            if (r2 != 0) goto L_0x043d
            goto L_0x03f4
        L_0x043d:
            boolean r2 = r11.E()
            if (r2 == 0) goto L_0x0450
            int r2 = r9.getChildCount()
            android.view.ViewGroup$LayoutParams r3 = r13.getLayoutParams()
            r9.attachViewToParent(r13, r2, r3)
            r2 = r8
            goto L_0x0451
        L_0x0450:
            r2 = r12
        L_0x0451:
            tyc r3 = r9.y0
            r3.h(r11, r14)
            if (r2 == 0) goto L_0x045b
            r9.detachViewFromParent(r13)
        L_0x045b:
            long r2 = r9.getNanoTime()
            androidx.recyclerview.widget.b r0 = r0.g
            int r4 = r11.w
            long r2 = r2 - r19
            r0.factorInBindTime(r4, r2)
            android.view.accessibility.AccessibilityManager r0 = r9.N0
            if (r0 == 0) goto L_0x0474
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0474
            r0 = r8
            goto L_0x0475
        L_0x0474:
            r0 = r12
        L_0x0475:
            if (r0 == 0) goto L_0x04b8
            java.util.WeakHashMap r0 = defpackage.gag.a
            int r0 = r13.getImportantForAccessibility()
            if (r0 != 0) goto L_0x0482
            r13.setImportantForAccessibility(r8)
        L_0x0482:
            rzc r0 = r9.x1
            if (r0 != 0) goto L_0x0487
            goto L_0x04b8
        L_0x0487:
            v3 r0 = r0.j()
            boolean r2 = r0 instanceof defpackage.qzc
            if (r2 == 0) goto L_0x04b5
            r2 = r0
            qzc r2 = (defpackage.qzc) r2
            r2.getClass()
            android.view.View$AccessibilityDelegate r3 = defpackage.bag.a(r13)
            if (r3 != 0) goto L_0x049c
            goto L_0x04ac
        L_0x049c:
            boolean r4 = r3 instanceof defpackage.u3
            if (r4 == 0) goto L_0x04a6
            u3 r3 = (defpackage.u3) r3
            v3 r3 = r3.a
            r15 = r3
            goto L_0x04ac
        L_0x04a6:
            v3 r4 = new v3
            r4.<init>(r3)
            r15 = r4
        L_0x04ac:
            if (r15 == 0) goto L_0x04b5
            if (r15 == r2) goto L_0x04b5
            java.util.WeakHashMap r2 = r2.e
            r2.put(r13, r15)
        L_0x04b5:
            defpackage.gag.j(r13, r0)
        L_0x04b8:
            boolean r0 = r10.h
            if (r0 == 0) goto L_0x04be
            r11.x = r1
        L_0x04be:
            r0 = r8
        L_0x04bf:
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            if (r1 != 0) goto L_0x04cf
            android.view.ViewGroup$LayoutParams r1 = r9.generateDefaultLayoutParams()
            bzc r1 = (defpackage.bzc) r1
            r13.setLayoutParams(r1)
            goto L_0x04e1
        L_0x04cf:
            boolean r2 = r9.checkLayoutParams(r1)
            if (r2 != 0) goto L_0x04df
            android.view.ViewGroup$LayoutParams r1 = r9.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
            bzc r1 = (defpackage.bzc) r1
            r13.setLayoutParams(r1)
            goto L_0x04e1
        L_0x04df:
            bzc r1 = (defpackage.bzc) r1
        L_0x04e1:
            r1.a = r11
            if (r18 == 0) goto L_0x04e8
            if (r0 == 0) goto L_0x04e8
            goto L_0x04e9
        L_0x04e8:
            r8 = r12
        L_0x04e9:
            r1.o = r8
            return r11
        L_0x04ec:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "Invalid item position "
            java.lang.String r3 = "("
            java.lang.String r4 = "). Item count:"
            java.lang.StringBuilder r1 = defpackage.a81.n(r2, r1, r3, r1, r4)
            lzc r2 = r9.q1
            int r2 = r2.b()
            r1.append(r2)
            java.lang.String r2 = r9.F()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzc.j(int, long):pzc");
    }

    public final void k(pzc pzc) {
        if (pzc.x0) {
            this.b.remove(pzc);
        } else {
            this.a.remove(pzc);
        }
        pzc.w0 = null;
        pzc.x0 = false;
        pzc.X &= -33;
    }

    public final void l() {
        a aVar = this.h.z0;
        this.f = this.e + (aVar != null ? aVar.j : 0);
        for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
            f(size);
        }
    }
}
