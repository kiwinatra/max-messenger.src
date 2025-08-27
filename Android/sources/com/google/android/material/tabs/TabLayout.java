package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;

@obg
public class TabLayout extends HorizontalScrollView {
    public static final int i1 = hnc.Widget_Design_TabLayout;
    public static final xqb j1 = new xqb(16);
    public Drawable A0;
    public int B0 = 0;
    public final PorterDuff.Mode C0;
    public final float D0;
    public final float E0;
    public final int F0;
    public int G0 = IntCompanionObject.MAX_VALUE;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public int L0;
    public final int M0;
    public int N0;
    public int O0;
    public boolean P0;
    public boolean Q0;
    public int R0 = -1;
    public int S0;
    public boolean T0;
    public v02 U0;
    public final TimeInterpolator V0;
    public k8f W0;
    public final ArrayList X0 = new ArrayList();
    public n8a Y0;
    public ValueAnimator Z0;
    public int a = -1;
    public ViewPager a1;
    public final ArrayList b = new ArrayList();
    public q7b b1;
    public o8f c;
    public v44 c1;
    public p8f d1;
    public j8f e1;
    public boolean f1;
    public int g1;
    public final wqb h1 = new wqb(12);
    public final n8f o;
    public final int v;
    public final int v0;
    public final int w;
    public final int w0 = -1;
    public final int x;
    public ColorStateList x0;
    public final int y;
    public ColorStateList y0;
    public final int z;
    public ColorStateList z0;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int r3 = defpackage.edc.tabStyle
            int r4 = i1
            android.content.Context r10 = defpackage.fh8.a(r10, r11, r3, r4)
            r9.<init>(r10, r11, r3)
            r10 = -1
            r9.a = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.b = r0
            r9.w0 = r10
            r6 = 0
            r9.B0 = r6
            r0 = 2147483647(0x7fffffff, float:NaN)
            r9.G0 = r0
            r9.R0 = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.X0 = r0
            wqb r0 = new wqb
            r1 = 12
            r0.<init>(r1)
            r9.h1 = r0
            android.content.Context r7 = r9.getContext()
            r9.setHorizontalScrollBarEnabled(r6)
            n8f r8 = new n8f
            r8.<init>(r9, r7)
            r9.o = r8
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r10)
            super.addView(r8, r6, r0)
            int[] r2 = defpackage.tnc.TabLayout
            int r0 = defpackage.tnc.TabLayout_tabTextAppearance
            int[] r5 = new int[]{r0}
            r0 = r7
            r1 = r11
            android.content.res.TypedArray r11 = defpackage.vhf.d(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r0 = r9.getBackground()
            android.content.res.ColorStateList r0 = defpackage.gsg.m(r0)
            if (r0 == 0) goto L_0x0077
            bh8 r1 = new bh8
            r1.<init>()
            r1.l(r0)
            r1.j(r7)
            java.util.WeakHashMap r0 = defpackage.gag.a
            float r0 = defpackage.v9g.i(r9)
            r1.k(r0)
            r9.setBackground(r1)
        L_0x0077:
            int r0 = defpackage.tnc.TabLayout_tabIndicator
            android.graphics.drawable.Drawable r0 = defpackage.m5a.E(r7, r11, r0)
            r9.setSelectedTabIndicator((android.graphics.drawable.Drawable) r0)
            int r0 = defpackage.tnc.TabLayout_tabIndicatorColor
            int r0 = r11.getColor(r0, r6)
            r9.setSelectedTabIndicatorColor(r0)
            int r0 = defpackage.tnc.TabLayout_tabIndicatorHeight
            int r0 = r11.getDimensionPixelSize(r0, r10)
            r8.b(r0)
            int r0 = defpackage.tnc.TabLayout_tabIndicatorGravity
            int r0 = r11.getInt(r0, r6)
            r9.setSelectedTabIndicatorGravity(r0)
            int r0 = defpackage.tnc.TabLayout_tabIndicatorAnimationMode
            int r0 = r11.getInt(r0, r6)
            r9.setTabIndicatorAnimationMode(r0)
            int r0 = defpackage.tnc.TabLayout_tabIndicatorFullWidth
            r1 = 1
            boolean r0 = r11.getBoolean(r0, r1)
            r9.setTabIndicatorFullWidth(r0)
            int r0 = defpackage.tnc.TabLayout_tabPadding
            int r0 = r11.getDimensionPixelSize(r0, r6)
            r9.y = r0
            r9.x = r0
            r9.w = r0
            r9.v = r0
            int r2 = defpackage.tnc.TabLayout_tabPaddingStart
            int r2 = r11.getDimensionPixelSize(r2, r0)
            r9.v = r2
            int r2 = defpackage.tnc.TabLayout_tabPaddingTop
            int r2 = r11.getDimensionPixelSize(r2, r0)
            r9.w = r2
            int r2 = defpackage.tnc.TabLayout_tabPaddingEnd
            int r2 = r11.getDimensionPixelSize(r2, r0)
            r9.x = r2
            int r2 = defpackage.tnc.TabLayout_tabPaddingBottom
            int r0 = r11.getDimensionPixelSize(r2, r0)
            r9.y = r0
            int r0 = defpackage.edc.isMaterial3Theme
            boolean r0 = defpackage.b59.U(r0, r7, r6)
            if (r0 == 0) goto L_0x00e9
            int r0 = defpackage.edc.textAppearanceTitleSmall
            r9.z = r0
            goto L_0x00ed
        L_0x00e9:
            int r0 = defpackage.edc.textAppearanceButton
            r9.z = r0
        L_0x00ed:
            int r0 = defpackage.tnc.TabLayout_tabTextAppearance
            int r2 = defpackage.hnc.TextAppearance_Design_Tab
            int r0 = r11.getResourceId(r0, r2)
            r9.v0 = r0
            int[] r2 = defpackage.koc.TextAppearance
            android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r0, r2)
            int r3 = defpackage.koc.TextAppearance_android_textSize     // Catch:{ all -> 0x0216 }
            int r3 = r2.getDimensionPixelSize(r3, r6)     // Catch:{ all -> 0x0216 }
            float r3 = (float) r3     // Catch:{ all -> 0x0216 }
            r9.D0 = r3     // Catch:{ all -> 0x0216 }
            int r4 = defpackage.koc.TextAppearance_android_textColor     // Catch:{ all -> 0x0216 }
            android.content.res.ColorStateList r4 = defpackage.m5a.C(r7, r2, r4)     // Catch:{ all -> 0x0216 }
            r9.x0 = r4     // Catch:{ all -> 0x0216 }
            r2.recycle()
            int r2 = defpackage.tnc.TabLayout_tabSelectedTextAppearance
            boolean r2 = r11.hasValue(r2)
            if (r2 == 0) goto L_0x0121
            int r2 = defpackage.tnc.TabLayout_tabSelectedTextAppearance
            int r0 = r11.getResourceId(r2, r0)
            r9.w0 = r0
        L_0x0121:
            int r0 = r9.w0
            if (r0 == r10) goto L_0x015f
            int[] r2 = defpackage.koc.TextAppearance
            android.content.res.TypedArray r0 = r7.obtainStyledAttributes(r0, r2)
            int r2 = defpackage.koc.TextAppearance_android_textSize     // Catch:{ all -> 0x0155 }
            int r3 = (int) r3     // Catch:{ all -> 0x0155 }
            r0.getDimensionPixelSize(r2, r3)     // Catch:{ all -> 0x0155 }
            int r2 = defpackage.koc.TextAppearance_android_textColor     // Catch:{ all -> 0x0155 }
            android.content.res.ColorStateList r2 = defpackage.m5a.C(r7, r0, r2)     // Catch:{ all -> 0x0155 }
            if (r2 == 0) goto L_0x0157
            android.content.res.ColorStateList r3 = r9.x0     // Catch:{ all -> 0x0155 }
            int r3 = r3.getDefaultColor()     // Catch:{ all -> 0x0155 }
            r4 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r4 = new int[]{r4}     // Catch:{ all -> 0x0155 }
            int r5 = r2.getDefaultColor()     // Catch:{ all -> 0x0155 }
            int r2 = r2.getColorForState(r4, r5)     // Catch:{ all -> 0x0155 }
            android.content.res.ColorStateList r2 = f(r3, r2)     // Catch:{ all -> 0x0155 }
            r9.x0 = r2     // Catch:{ all -> 0x0155 }
            goto L_0x0157
        L_0x0155:
            r9 = move-exception
            goto L_0x015b
        L_0x0157:
            r0.recycle()
            goto L_0x015f
        L_0x015b:
            r0.recycle()
            throw r9
        L_0x015f:
            int r0 = defpackage.tnc.TabLayout_tabTextColor
            boolean r0 = r11.hasValue(r0)
            if (r0 == 0) goto L_0x016f
            int r0 = defpackage.tnc.TabLayout_tabTextColor
            android.content.res.ColorStateList r0 = defpackage.m5a.C(r7, r11, r0)
            r9.x0 = r0
        L_0x016f:
            int r0 = defpackage.tnc.TabLayout_tabSelectedTextColor
            boolean r0 = r11.hasValue(r0)
            if (r0 == 0) goto L_0x0189
            int r0 = defpackage.tnc.TabLayout_tabSelectedTextColor
            int r0 = r11.getColor(r0, r6)
            android.content.res.ColorStateList r2 = r9.x0
            int r2 = r2.getDefaultColor()
            android.content.res.ColorStateList r0 = f(r2, r0)
            r9.x0 = r0
        L_0x0189:
            int r0 = defpackage.tnc.TabLayout_tabIconTint
            android.content.res.ColorStateList r0 = defpackage.m5a.C(r7, r11, r0)
            r9.y0 = r0
            int r0 = defpackage.tnc.TabLayout_tabIconTintMode
            int r0 = r11.getInt(r0, r10)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = defpackage.ct.D(r0, r2)
            r9.C0 = r0
            int r0 = defpackage.tnc.TabLayout_tabRippleColor
            android.content.res.ColorStateList r0 = defpackage.m5a.C(r7, r11, r0)
            r9.z0 = r0
            int r0 = defpackage.tnc.TabLayout_tabIndicatorAnimationDuration
            r2 = 300(0x12c, float:4.2E-43)
            int r0 = r11.getInt(r0, r2)
            r9.M0 = r0
            int r0 = defpackage.edc.motionEasingEmphasizedInterpolator
            gh5 r2 = defpackage.xg.b
            android.animation.TimeInterpolator r0 = defpackage.ld8.o0(r7, r0, r2)
            r9.V0 = r0
            int r0 = defpackage.tnc.TabLayout_tabMinWidth
            int r0 = r11.getDimensionPixelSize(r0, r10)
            r9.H0 = r0
            int r0 = defpackage.tnc.TabLayout_tabMaxWidth
            int r10 = r11.getDimensionPixelSize(r0, r10)
            r9.I0 = r10
            int r10 = defpackage.tnc.TabLayout_tabBackground
            int r10 = r11.getResourceId(r10, r6)
            r9.F0 = r10
            int r10 = defpackage.tnc.TabLayout_tabContentStart
            int r10 = r11.getDimensionPixelSize(r10, r6)
            r9.K0 = r10
            int r10 = defpackage.tnc.TabLayout_tabMode
            int r10 = r11.getInt(r10, r1)
            r9.O0 = r10
            int r10 = defpackage.tnc.TabLayout_tabGravity
            int r10 = r11.getInt(r10, r6)
            r9.L0 = r10
            int r10 = defpackage.tnc.TabLayout_tabInlineLabel
            boolean r10 = r11.getBoolean(r10, r6)
            r9.P0 = r10
            int r10 = defpackage.tnc.TabLayout_tabUnboundedRipple
            boolean r10 = r11.getBoolean(r10, r6)
            r9.T0 = r10
            r11.recycle()
            android.content.res.Resources r10 = r9.getResources()
            int r11 = defpackage.iec.design_tab_text_size_2line
            int r11 = r10.getDimensionPixelSize(r11)
            float r11 = (float) r11
            r9.E0 = r11
            int r11 = defpackage.iec.design_tab_scrollable_min_width
            int r10 = r10.getDimensionPixelSize(r11)
            r9.J0 = r10
            r9.d()
            return
        L_0x0216:
            r9 = move-exception
            r2.recycle()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static ColorStateList f(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            o8f o8f = (o8f) arrayList.get(i);
            if (o8f == null || o8f.b == null || TextUtils.isEmpty(o8f.c)) {
                i++;
            } else if (!this.P0) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.H0;
        if (i != -1) {
            return i;
        }
        int i2 = this.O0;
        if (i2 == 0 || i2 == 2) {
            return this.J0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.o.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        n8f n8f = this.o;
        int childCount = n8f.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = n8f.getChildAt(i2);
                boolean z2 = true;
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    if (i2 != i) {
                        z2 = false;
                    }
                    childAt.setActivated(z2);
                } else {
                    childAt.setSelected(i2 == i);
                    if (i2 != i) {
                        z2 = false;
                    }
                    childAt.setActivated(z2);
                    if (childAt instanceof q8f) {
                        ((q8f) childAt).g();
                    }
                }
                i2++;
            }
        }
    }

    public final void a(k8f k8f) {
        ArrayList arrayList = this.X0;
        if (!arrayList.contains(k8f)) {
            arrayList.add(k8f);
        }
    }

    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(o8f o8f, boolean z2) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (o8f.g == this) {
            o8f.e = size;
            arrayList.add(size, o8f);
            int size2 = arrayList.size();
            int i = -1;
            for (int i2 = size + 1; i2 < size2; i2++) {
                if (((o8f) arrayList.get(i2)).e == this.a) {
                    i = i2;
                }
                ((o8f) arrayList.get(i2)).e = i2;
            }
            this.a = i;
            q8f q8f = o8f.h;
            q8f.setSelected(false);
            q8f.setActivated(false);
            int i3 = o8f.e;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.O0 == 1 && this.L0 == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = c44.DEFAULT_ASPECT_RATIO;
            }
            this.o.addView(q8f, i3, layoutParams);
            if (z2) {
                TabLayout tabLayout = o8f.g;
                if (tabLayout != null) {
                    tabLayout.m(o8f, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void c(int i) {
        if (i != -1) {
            if (getWindowToken() != null) {
                WeakHashMap weakHashMap = gag.a;
                if (isLaidOut()) {
                    n8f n8f = this.o;
                    int childCount = n8f.getChildCount();
                    int i2 = 0;
                    while (i2 < childCount) {
                        if (n8f.getChildAt(i2).getWidth() > 0) {
                            i2++;
                        }
                    }
                    int scrollX = getScrollX();
                    int e = e(c44.DEFAULT_ASPECT_RATIO, i);
                    if (scrollX != e) {
                        g();
                        this.Z0.setIntValues(new int[]{scrollX, e});
                        this.Z0.start();
                    }
                    ValueAnimator valueAnimator = n8f.a;
                    if (!(valueAnimator == null || !valueAnimator.isRunning() || n8f.b.a == i)) {
                        n8f.a.cancel();
                    }
                    n8f.d(i, this.M0, true);
                    return;
                }
            }
            o(i, c44.DEFAULT_ASPECT_RATIO, true, true, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r0 != 2) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r4 = this;
            int r0 = r4.O0
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x000b
            if (r0 != r1) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = r2
            goto L_0x0014
        L_0x000b:
            int r0 = r4.K0
            int r3 = r4.v
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0014:
            java.util.WeakHashMap r3 = defpackage.gag.a
            n8f r3 = r4.o
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r4.O0
            r2 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r2) goto L_0x0025
            if (r0 == r1) goto L_0x0025
            goto L_0x003c
        L_0x0025:
            r3.setGravity(r2)
            goto L_0x003c
        L_0x0029:
            int r0 = r4.L0
            if (r0 == 0) goto L_0x0036
            if (r0 == r2) goto L_0x0032
            if (r0 == r1) goto L_0x0036
            goto L_0x003c
        L_0x0032:
            r3.setGravity(r2)
            goto L_0x003c
        L_0x0036:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L_0x003c:
            r4.q(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.d():void");
    }

    public final int e(float f, int i) {
        n8f n8f;
        View childAt;
        int i2 = this.O0;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = n8f.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        View childAt2 = i4 < n8f.getChildCount() ? (n8f = this.o).getChildAt(i4) : null;
        int width = childAt.getWidth();
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        WeakHashMap weakHashMap = gag.a;
        return getLayoutDirection() == 0 ? left + i5 : left - i5;
    }

    public final void g() {
        if (this.Z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.Z0 = valueAnimator;
            valueAnimator.setInterpolator(this.V0);
            this.Z0.setDuration((long) this.M0);
            this.Z0.addUpdateListener(new sk0(7, this));
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        o8f o8f = this.c;
        if (o8f != null) {
            return o8f.e;
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.L0;
    }

    public ColorStateList getTabIconTint() {
        return this.y0;
    }

    public int getTabIndicatorAnimationMode() {
        return this.S0;
    }

    public int getTabIndicatorGravity() {
        return this.N0;
    }

    public int getTabMaxWidth() {
        return this.G0;
    }

    public int getTabMode() {
        return this.O0;
    }

    public ColorStateList getTabRippleColor() {
        return this.z0;
    }

    public Drawable getTabSelectedIndicator() {
        return this.A0;
    }

    public ColorStateList getTabTextColors() {
        return this.x0;
    }

    public final o8f h(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (o8f) this.b.get(i);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, o8f] */
    public final o8f i() {
        o8f o8f = (o8f) j1.c();
        o8f o8f2 = o8f;
        if (o8f == null) {
            ? obj = new Object();
            obj.e = -1;
            obj.i = -1;
            o8f2 = obj;
        }
        o8f2.g = this;
        wqb wqb = this.h1;
        q8f q8f = wqb != null ? (q8f) wqb.c() : null;
        if (q8f == null) {
            q8f = new q8f(this, getContext());
        }
        q8f.setTab(o8f2);
        q8f.setFocusable(true);
        q8f.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(o8f2.d)) {
            q8f.setContentDescription(o8f2.c);
        } else {
            q8f.setContentDescription(o8f2.d);
        }
        o8f2.h = q8f;
        int i = o8f2.i;
        if (i != -1) {
            q8f.setId(i);
        }
        return o8f2;
    }

    public final void j() {
        int currentItem;
        k();
        q7b q7b = this.b1;
        if (q7b != null) {
            int c2 = q7b.c();
            for (int i = 0; i < c2; i++) {
                o8f i2 = i();
                i2.b(this.b1.e(i));
                b(i2, false);
            }
            ViewPager viewPager = this.a1;
            if (viewPager != null && c2 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                m(h(currentItem), true);
            }
        }
    }

    public final void k() {
        for (int childCount = this.o.getChildCount() - 1; childCount >= 0; childCount--) {
            l(childCount);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            o8f o8f = (o8f) it.next();
            it.remove();
            o8f.g = null;
            o8f.h = null;
            o8f.a = null;
            o8f.b = null;
            o8f.i = -1;
            o8f.c = null;
            o8f.d = null;
            o8f.e = -1;
            o8f.f = null;
            j1.b(o8f);
        }
        this.c = null;
    }

    public final void l(int i) {
        n8f n8f = this.o;
        q8f q8f = (q8f) n8f.getChildAt(i);
        n8f.removeViewAt(i);
        if (q8f != null) {
            q8f.setTab((o8f) null);
            q8f.setSelected(false);
            this.h1.b(q8f);
        }
        requestLayout();
    }

    public final void m(o8f o8f, boolean z2) {
        o8f o8f2 = this.c;
        ArrayList arrayList = this.X0;
        if (o8f2 != o8f) {
            int i = o8f != null ? o8f.e : -1;
            if (z2) {
                if ((o8f2 == null || o8f2.e == -1) && i != -1) {
                    o(i, c44.DEFAULT_ASPECT_RATIO, true, true, true);
                } else {
                    c(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.c = o8f;
            if (!(o8f2 == null || o8f2.g == null)) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((k8f) arrayList.get(size)).h(o8f2);
                }
            }
            if (o8f != null) {
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((k8f) arrayList.get(size2)).E(o8f);
                }
            }
        } else if (o8f2 != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((k8f) arrayList.get(size3)).getClass();
            }
            c(o8f.e);
        }
    }

    public final void n(q7b q7b, boolean z2) {
        v44 v44;
        q7b q7b2 = this.b1;
        if (!(q7b2 == null || (v44 = this.c1) == null)) {
            q7b2.a.unregisterObserver(v44);
        }
        this.b1 = q7b;
        if (z2 && q7b != null) {
            if (this.c1 == null) {
                this.c1 = new v44(2, this);
            }
            q7b.a.registerObserver(this.c1);
        }
        j();
    }

    public final void o(int i, float f, boolean z2, boolean z3, boolean z4) {
        float f2 = ((float) i) + f;
        int round = Math.round(f2);
        if (round >= 0) {
            n8f n8f = this.o;
            if (round < n8f.getChildCount()) {
                if (z3) {
                    n8f.b.a = Math.round(f2);
                    ValueAnimator valueAnimator = n8f.a;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        n8f.a.cancel();
                    }
                    n8f.c(n8f.getChildAt(i), n8f.getChildAt(i + 1), f);
                }
                ValueAnimator valueAnimator2 = this.Z0;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.Z0.cancel();
                }
                int e = e(f, i);
                int scrollX = getScrollX();
                boolean z5 = (i < getSelectedTabPosition() && e >= scrollX) || (i > getSelectedTabPosition() && e <= scrollX) || i == getSelectedTabPosition();
                WeakHashMap weakHashMap = gag.a;
                if (getLayoutDirection() == 1) {
                    z5 = (i < getSelectedTabPosition() && e <= scrollX) || (i > getSelectedTabPosition() && e >= scrollX) || i == getSelectedTabPosition();
                }
                if (z5 || this.g1 == 1 || z4) {
                    if (i < 0) {
                        e = 0;
                    }
                    scrollTo(e, 0);
                }
                if (z2) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof bh8) {
            o5a.g0(this, (bh8) background);
        }
        if (this.a1 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                p((ViewPager) parent, true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1) {
            setupWithViewPager((ViewPager) null);
            this.f1 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r1 = (defpackage.q8f) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            n8f r1 = r7.o
            int r2 = r1.getChildCount()
            if (r0 >= r2) goto L_0x0032
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof defpackage.q8f
            if (r2 == 0) goto L_0x002f
            q8f r1 = (defpackage.q8f) r1
            android.graphics.drawable.Drawable r2 = r1.z
            if (r2 == 0) goto L_0x002f
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.z
            r1.draw(r8)
        L_0x002f:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0032:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e4.q(1, getTabCount(), 1).b);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    public final void onMeasure(int i, int i2) {
        int round = Math.round(ct.j(getDefaultHeight(), getContext()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.I0;
            if (i3 <= 0) {
                i3 = (int) (((float) size) - ct.j(56, getContext()));
            }
            this.G0 = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.O0;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                } else if (i4 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(ViewPager viewPager, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.a1;
        if (viewPager2 != null) {
            p8f p8f = this.d1;
            if (!(p8f == null || (arrayList2 = viewPager2.d1) == null)) {
                arrayList2.remove(p8f);
            }
            j8f j8f = this.e1;
            if (!(j8f == null || (arrayList = this.a1.f1) == null)) {
                arrayList.remove(j8f);
            }
        }
        n8a n8a = this.Y0;
        if (n8a != null) {
            this.X0.remove(n8a);
            this.Y0 = null;
        }
        if (viewPager != null) {
            this.a1 = viewPager;
            if (this.d1 == null) {
                this.d1 = new p8f(this);
            }
            p8f p8f2 = this.d1;
            p8f2.c = 0;
            p8f2.b = 0;
            viewPager.b(p8f2);
            n8a n8a2 = new n8a(1, viewPager);
            this.Y0 = n8a2;
            a(n8a2);
            q7b adapter = viewPager.getAdapter();
            if (adapter != null) {
                n(adapter, true);
            }
            if (this.e1 == null) {
                this.e1 = new j8f(this);
            }
            j8f j8f2 = this.e1;
            j8f2.a = true;
            if (viewPager.f1 == null) {
                viewPager.f1 = new ArrayList();
            }
            viewPager.f1.add(j8f2);
            o(viewPager.getCurrentItem(), c44.DEFAULT_ASPECT_RATIO, true, true, true);
        } else {
            this.a1 = null;
            n((q7b) null, false);
        }
        this.f1 = z2;
    }

    public final void q(boolean z2) {
        int i = 0;
        while (true) {
            n8f n8f = this.o;
            if (i < n8f.getChildCount()) {
                View childAt = n8f.getChildAt(i);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.O0 == 1 && this.L0 == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = c44.DEFAULT_ASPECT_RATIO;
                }
                if (z2) {
                    childAt.requestLayout();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof bh8) {
            ((bh8) background).k(f);
        }
    }

    public void setInlineLabel(boolean z2) {
        if (this.P0 != z2) {
            this.P0 = z2;
            int i = 0;
            while (true) {
                n8f n8f = this.o;
                if (i < n8f.getChildCount()) {
                    View childAt = n8f.getChildAt(i);
                    if (childAt instanceof q8f) {
                        q8f q8f = (q8f) childAt;
                        q8f.setOrientation(q8f.w0.P0 ^ true ? 1 : 0);
                        TextView textView = q8f.x;
                        if (textView == null && q8f.y == null) {
                            q8f.h(q8f.b, q8f.c, true);
                        } else {
                            q8f.h(textView, q8f.y, false);
                        }
                    }
                    i++;
                } else {
                    d();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(l8f l8f) {
        setOnTabSelectedListener((k8f) l8f);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.Z0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.A0 = mutate;
        int i = this.B0;
        if (i != 0) {
            ru4.g(mutate, i);
        } else {
            ru4.h(mutate, (ColorStateList) null);
        }
        int i2 = this.R0;
        if (i2 == -1) {
            i2 = this.A0.getIntrinsicHeight();
        }
        this.o.b(i2);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.B0 = i;
        Drawable drawable = this.A0;
        if (i != 0) {
            ru4.g(drawable, i);
        } else {
            ru4.h(drawable, (ColorStateList) null);
        }
        q(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.N0 != i) {
            this.N0 = i;
            WeakHashMap weakHashMap = gag.a;
            this.o.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.R0 = i;
        this.o.b(i);
    }

    public void setTabGravity(int i) {
        if (this.L0 != i) {
            this.L0 = i;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((o8f) arrayList.get(i)).c();
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(q8.j(i, getContext()));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [v02, java.lang.Object] */
    public void setTabIndicatorAnimationMode(int i) {
        this.S0 = i;
        if (i == 0) {
            this.U0 = new Object();
        } else if (i == 1) {
            this.U0 = new t05(0);
        } else if (i == 2) {
            this.U0 = new t05(1);
        } else {
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        this.Q0 = z2;
        int i = n8f.c;
        n8f n8f = this.o;
        n8f.a(n8f.b.getSelectedTabPosition());
        WeakHashMap weakHashMap = gag.a;
        n8f.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.O0) {
            this.O0 = i;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            int i = 0;
            while (true) {
                n8f n8f = this.o;
                if (i < n8f.getChildCount()) {
                    View childAt = n8f.getChildAt(i);
                    if (childAt instanceof q8f) {
                        Context context = getContext();
                        int i2 = q8f.x0;
                        ((q8f) childAt).f(context);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(q8.j(i, getContext()));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.x0 != colorStateList) {
            this.x0 = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((o8f) arrayList.get(i)).c();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(q7b q7b) {
        n(q7b, false);
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.T0 != z2) {
            this.T0 = z2;
            int i = 0;
            while (true) {
                n8f n8f = this.o;
                if (i < n8f.getChildCount()) {
                    View childAt = n8f.getChildAt(i);
                    if (childAt instanceof q8f) {
                        Context context = getContext();
                        int i2 = q8f.x0;
                        ((q8f) childAt).f(context);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        p(viewPager, false);
    }

    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final FrameLayout.LayoutParams m3generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(k8f k8f) {
        k8f k8f2 = this.W0;
        if (k8f2 != null) {
            this.X0.remove(k8f2);
        }
        this.W0 = k8f;
        if (k8f != null) {
            a(k8f);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(iq.D(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
