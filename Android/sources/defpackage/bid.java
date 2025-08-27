package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: bid  reason: default package */
public final class bid extends fzc {
    public xbg a;
    public final ViewPager2 b;
    public final RecyclerView c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final aid g = new Object();
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, aid] */
    public bid(ViewPager2 viewPager2) {
        this.b = viewPager2;
        acg acg = viewPager2.v0;
        this.c = acg;
        this.d = (LinearLayoutManager) acg.getLayoutManager();
        d();
    }

    public final void a(RecyclerView recyclerView, int i2) {
        xbg xbg;
        xbg xbg2;
        int i3 = this.e;
        boolean z = true;
        if (!(i3 == 1 && this.f == 1) && i2 == 1) {
            this.m = false;
            this.e = 1;
            int i4 = this.i;
            if (i4 != -1) {
                this.h = i4;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.d.V0();
            }
            c(1);
            return;
        }
        if (!(i3 == 1 || i3 == 4) || i2 != 2) {
            if (!(i3 == 1 || i3 == 4)) {
                z = false;
            }
            aid aid = this.g;
            if (z && i2 == 0) {
                e();
                if (!this.k) {
                    int i5 = aid.b;
                    if (!(i5 == -1 || (xbg2 = this.a) == null)) {
                        xbg2.b(i5, c44.DEFAULT_ASPECT_RATIO, 0);
                    }
                } else if (aid.c == 0) {
                    int i6 = this.h;
                    int i7 = aid.b;
                    if (!(i6 == i7 || (xbg = this.a) == null)) {
                        xbg.c(i7);
                    }
                }
                c(0);
                d();
            }
            if (this.e == 2 && i2 == 0 && this.l) {
                e();
                if (aid.c == 0) {
                    int i8 = this.i;
                    int i9 = aid.b;
                    if (i8 != i9) {
                        if (i9 == -1) {
                            i9 = 0;
                        }
                        xbg xbg3 = this.a;
                        if (xbg3 != null) {
                            xbg3.c(i9);
                        }
                    }
                    c(0);
                    d();
                }
            }
        } else if (this.k) {
            c(2);
            this.j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if ((r7 < 0) == (r5.b.x.H() == 1)) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.k = r6
            r5.e()
            boolean r0 = r5.j
            aid r1 = r5.g
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L_0x0040
            r5.j = r3
            if (r8 > 0) goto L_0x0028
            if (r8 != 0) goto L_0x0030
            if (r7 >= 0) goto L_0x0018
            r7 = r6
            goto L_0x0019
        L_0x0018:
            r7 = r3
        L_0x0019:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.b
            wbg r8 = r8.x
            int r8 = r8.H()
            if (r8 != r6) goto L_0x0025
            r8 = r6
            goto L_0x0026
        L_0x0025:
            r8 = r3
        L_0x0026:
            if (r7 != r8) goto L_0x0030
        L_0x0028:
            int r7 = r1.c
            if (r7 == 0) goto L_0x0030
            int r7 = r1.b
            int r7 = r7 + r6
            goto L_0x0032
        L_0x0030:
            int r7 = r1.b
        L_0x0032:
            r5.i = r7
            int r8 = r5.h
            if (r8 == r7) goto L_0x0050
            xbg r8 = r5.a
            if (r8 == 0) goto L_0x0050
            r8.c(r7)
            goto L_0x0050
        L_0x0040:
            int r7 = r5.e
            if (r7 != 0) goto L_0x0050
            int r7 = r1.b
            if (r7 != r2) goto L_0x0049
            r7 = r3
        L_0x0049:
            xbg r8 = r5.a
            if (r8 == 0) goto L_0x0050
            r8.c(r7)
        L_0x0050:
            int r7 = r1.b
            if (r7 != r2) goto L_0x0055
            r7 = r3
        L_0x0055:
            float r8 = r1.a
            int r0 = r1.c
            xbg r4 = r5.a
            if (r4 == 0) goto L_0x0060
            r4.b(r7, r8, r0)
        L_0x0060:
            int r7 = r1.b
            int r8 = r5.i
            if (r7 == r8) goto L_0x0068
            if (r8 != r2) goto L_0x0076
        L_0x0068:
            int r7 = r1.c
            if (r7 != 0) goto L_0x0076
            int r7 = r5.f
            if (r7 == r6) goto L_0x0076
            r5.c(r3)
            r5.d()
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bid.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i2) {
        if ((this.e != 3 || this.f != 0) && this.f != i2) {
            this.f = i2;
            xbg xbg = this.a;
            if (xbg != null) {
                xbg.a(i2);
            }
        }
    }

    public final void d() {
        this.e = 0;
        this.f = 0;
        aid aid = this.g;
        aid.b = -1;
        aid.a = c44.DEFAULT_ASPECT_RATIO;
        aid.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0130, code lost:
        if (r4[r12 - 1][1] >= r5) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0137, code lost:
        if (r0.w() <= 1) goto L_0x0139;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r12 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r12.d
            int r1 = r0.V0()
            aid r2 = r12.g
            r2.b = r1
            r3 = 0
            r4 = 0
            r5 = -1
            if (r1 != r5) goto L_0x0016
            r2.b = r5
            r2.a = r4
            r2.c = r3
            return
        L_0x0016:
            android.view.View r1 = r0.r(r1)
            if (r1 != 0) goto L_0x0023
            r2.b = r5
            r2.a = r4
            r2.c = r3
            return
        L_0x0023:
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            bzc r5 = (defpackage.bzc) r5
            android.graphics.Rect r5 = r5.b
            int r5 = r5.left
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            bzc r6 = (defpackage.bzc) r6
            android.graphics.Rect r6 = r6.b
            int r6 = r6.right
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            bzc r7 = (defpackage.bzc) r7
            android.graphics.Rect r7 = r7.b
            int r7 = r7.top
            android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()
            bzc r8 = (defpackage.bzc) r8
            android.graphics.Rect r8 = r8.b
            int r8 = r8.bottom
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            boolean r10 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r10 == 0) goto L_0x0061
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            int r10 = r9.leftMargin
            int r5 = r5 + r10
            int r10 = r9.rightMargin
            int r6 = r6 + r10
            int r10 = r9.topMargin
            int r7 = r7 + r10
            int r9 = r9.bottomMargin
            int r8 = r8 + r9
        L_0x0061:
            int r9 = r1.getHeight()
            int r9 = r9 + r7
            int r9 = r9 + r8
            int r8 = r1.getWidth()
            int r8 = r8 + r5
            int r8 = r8 + r6
            int r6 = r0.p
            r10 = 1
            androidx.recyclerview.widget.RecyclerView r11 = r12.c
            if (r6 != 0) goto L_0x008b
            int r1 = r1.getLeft()
            int r1 = r1 - r5
            int r5 = r11.getPaddingLeft()
            int r1 = r1 - r5
            androidx.viewpager2.widget.ViewPager2 r12 = r12.b
            wbg r12 = r12.x
            int r12 = r12.H()
            if (r12 != r10) goto L_0x0089
            int r1 = -r1
        L_0x0089:
            r9 = r8
            goto L_0x0096
        L_0x008b:
            int r12 = r1.getTop()
            int r12 = r12 - r7
            int r1 = r11.getPaddingTop()
            int r1 = r12 - r1
        L_0x0096:
            int r12 = -r1
            r2.c = r12
            if (r12 >= 0) goto L_0x0164
            af r12 = new af
            int r12 = r0.w()
            if (r12 != 0) goto L_0x00a5
            goto L_0x0133
        L_0x00a5:
            int r1 = r0.p
            if (r1 != 0) goto L_0x00ab
            r1 = r10
            goto L_0x00ac
        L_0x00ab:
            r1 = r3
        L_0x00ac:
            r4 = 2
            int[] r5 = new int[r4]
            r5[r10] = r4
            r5[r3] = r12
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r5)
            int[][] r4 = (int[][]) r4
            r5 = r3
        L_0x00bc:
            if (r5 >= r12) goto L_0x0106
            android.view.View r6 = r0.v(r5)
            if (r6 == 0) goto L_0x00fe
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            boolean r8 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L_0x00cf
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            goto L_0x00d1
        L_0x00cf:
            android.view.ViewGroup$MarginLayoutParams r7 = defpackage.af.a
        L_0x00d1:
            r8 = r4[r5]
            if (r1 == 0) goto L_0x00dd
            int r9 = r6.getLeft()
            int r11 = r7.leftMargin
        L_0x00db:
            int r9 = r9 - r11
            goto L_0x00e4
        L_0x00dd:
            int r9 = r6.getTop()
            int r11 = r7.topMargin
            goto L_0x00db
        L_0x00e4:
            r8[r3] = r9
            r8 = r4[r5]
            if (r1 == 0) goto L_0x00f2
            int r6 = r6.getRight()
            int r7 = r7.rightMargin
        L_0x00f0:
            int r6 = r6 + r7
            goto L_0x00f9
        L_0x00f2:
            int r6 = r6.getBottom()
            int r7 = r7.bottomMargin
            goto L_0x00f0
        L_0x00f9:
            r8[r10] = r6
            int r5 = r5 + 1
            goto L_0x00bc
        L_0x00fe:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "null view contained in the view hierarchy"
            r12.<init>(r0)
            throw r12
        L_0x0106:
            cx4 r1 = new cx4
            r5 = 6
            r1.<init>(r5)
            java.util.Arrays.sort(r4, r1)
            r1 = r10
        L_0x0110:
            if (r1 >= r12) goto L_0x0122
            int r5 = r1 + -1
            r5 = r4[r5]
            r5 = r5[r10]
            r6 = r4[r1]
            r6 = r6[r3]
            if (r5 == r6) goto L_0x011f
            goto L_0x0139
        L_0x011f:
            int r1 = r1 + 1
            goto L_0x0110
        L_0x0122:
            r1 = r4[r3]
            r5 = r1[r10]
            r1 = r1[r3]
            int r5 = r5 - r1
            if (r1 > 0) goto L_0x0139
            int r12 = r12 - r10
            r12 = r4[r12]
            r12 = r12[r10]
            if (r12 >= r5) goto L_0x0133
            goto L_0x0139
        L_0x0133:
            int r12 = r0.w()
            if (r12 > r10) goto L_0x0154
        L_0x0139:
            int r12 = r0.w()
        L_0x013d:
            if (r3 >= r12) goto L_0x0154
            android.view.View r1 = r0.v(r3)
            boolean r1 = defpackage.af.a(r1)
            if (r1 != 0) goto L_0x014c
            int r3 = r3 + 1
            goto L_0x013d
        L_0x014c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            r12.<init>(r0)
            throw r12
        L_0x0154:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.util.Locale r0 = java.util.Locale.US
            int r0 = r2.c
            java.lang.String r1 = "Page can only be offset by a positive amount, not by "
            java.lang.String r0 = defpackage.wj6.h(r0, r1)
            r12.<init>(r0)
            throw r12
        L_0x0164:
            if (r9 != 0) goto L_0x0167
            goto L_0x016b
        L_0x0167:
            float r12 = (float) r12
            float r0 = (float) r9
            float r4 = r12 / r0
        L_0x016b:
            r2.a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bid.e():void");
    }
}
