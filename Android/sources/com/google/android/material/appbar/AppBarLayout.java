package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class AppBarLayout extends LinearLayout implements sz3 {
    public static final int L0 = hnc.Widget_Design_AppBarLayout;
    public final boolean A0;
    public ValueAnimator B0;
    public final ValueAnimator.AnimatorUpdateListener C0;
    public final ArrayList D0;
    public final long E0;
    public final TimeInterpolator F0;
    public int[] G0;
    public Drawable H0;
    public Integer I0;
    public final float J0;
    public Behavior K0;
    public int a;
    public int b;
    public int c;
    public int o;
    public boolean v;
    public boolean v0;
    public int w;
    public boolean w0;
    public iog x;
    public boolean x0;
    public ArrayList y;
    public int y0;
    public boolean z;
    public WeakReference z0;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends ex6 {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout A(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            tz3 tz3 = ((wz3) view2.getLayoutParams()).a;
            if (tz3 instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) tz3).j) + this.e) - z(view2);
                WeakHashMap weakHashMap = gag.a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.x0) {
                return false;
            }
            appBarLayout.g(appBarLayout.h(view));
            return false;
        }

        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                gag.j(coordinatorLayout, (v3) null);
            }
        }

        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout A = A(coordinatorLayout.e(view));
            if (A != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    A.f(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnc.ScrollingViewBehavior_Layout);
            this.f = obtainStyledAttributes.getDimensionPixelSize(tnc.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, edc.appBarLayoutStyle);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, dn] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, dn] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.widget.LinearLayout$LayoutParams, dn] */
    public static dn c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ? layoutParams2 = new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.a = 1;
            return layoutParams2;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ? layoutParams3 = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.a = 1;
            return layoutParams3;
        } else {
            ? layoutParams4 = new LinearLayout.LayoutParams(layoutParams);
            layoutParams4.a = 1;
            return layoutParams4;
        }
    }

    public final void a(cn cnVar) {
        if (this.y == null) {
            this.y = new ArrayList();
        }
        if (cnVar != null && !this.y.contains(cnVar)) {
            this.y.add(cnVar);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, dn] */
    /* renamed from: b */
    public final dn generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? layoutParams = new LinearLayout.LayoutParams(context, attributeSet);
        layoutParams.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnc.AppBarLayout_Layout);
        layoutParams.a = obtainStyledAttributes.getInt(tnc.AppBarLayout_Layout_layout_scrollFlags, 0);
        layoutParams.b = obtainStyledAttributes.getInt(tnc.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new wsb(2);
        if (obtainStyledAttributes.hasValue(tnc.AppBarLayout_Layout_layout_scrollInterpolator)) {
            layoutParams.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(tnc.AppBarLayout_Layout_layout_scrollInterpolator, 0));
        }
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof dn;
    }

    public final void d() {
        Behavior behavior = this.K0;
        d J = (behavior == null || this.b == -1 || this.w != 0) ? null : behavior.J(z.b, this);
        this.b = -1;
        this.c = -1;
        this.o = -1;
        if (J != null) {
            Behavior behavior2 = this.K0;
            if (behavior2.m == null) {
                behavior2.m = J;
            }
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.H0 != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(c44.DEFAULT_ASPECT_RATIO, (float) (-this.a));
            this.H0.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.H0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(int i) {
        this.a = i;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = gag.a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cn cnVar = (cn) this.y.get(i2);
                if (cnVar != null) {
                    cnVar.i(this, i);
                }
            }
        }
    }

    public final void f(boolean z2, boolean z3, boolean z4) {
        int i = 0;
        int i2 = (z2 ? 1 : 2) | (z3 ? 4 : 0);
        if (z4) {
            i = 8;
        }
        this.w = i2 | i;
        requestLayout();
    }

    public final boolean g(boolean z2) {
        if (!(!this.z) || this.w0 == z2) {
            return false;
        }
        this.w0 = z2;
        refreshDrawableState();
        if (!(getBackground() instanceof bh8)) {
            return true;
        }
        boolean z3 = this.A0;
        float f = c44.DEFAULT_ASPECT_RATIO;
        if (z3) {
            float f2 = z2 ? 0.0f : 1.0f;
            if (z2) {
                f = 1.0f;
            }
            j(f2, f);
            return true;
        } else if (!this.x0) {
            return true;
        } else {
            float f3 = this.J0;
            float f4 = z2 ? 0.0f : f3;
            if (z2) {
                f = f3;
            }
            j(f4, f);
            return true;
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new dn(-1, -2);
    }

    public tz3 getBehavior() {
        Behavior behavior = new Behavior();
        this.K0 = behavior;
        return behavior;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getDownNestedPreScrollRange() {
        /*
            r11 = this;
            r0 = 5
            r1 = 8
            int r2 = r11.c
            r3 = -1
            if (r2 == r3) goto L_0x0009
            return r2
        L_0x0009:
            int r2 = r11.getChildCount()
            int r2 = r2 + -1
            r4 = 0
            r5 = r4
        L_0x0011:
            if (r2 < 0) goto L_0x0068
            android.view.View r6 = r11.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 != r1) goto L_0x001e
            goto L_0x0066
        L_0x001e:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            dn r7 = (defpackage.dn) r7
            int r8 = r6.getMeasuredHeight()
            int r9 = r7.a
            r10 = r9 & 5
            if (r10 != r0) goto L_0x0063
            int r10 = r7.topMargin
            int r7 = r7.bottomMargin
            int r10 = r10 + r7
            r7 = r9 & 8
            if (r7 == 0) goto L_0x003f
            java.util.WeakHashMap r7 = defpackage.gag.a
            int r7 = r6.getMinimumHeight()
        L_0x003d:
            int r7 = r7 + r10
            goto L_0x004e
        L_0x003f:
            r7 = r9 & 2
            if (r7 == 0) goto L_0x004c
            java.util.WeakHashMap r7 = defpackage.gag.a
            int r7 = r6.getMinimumHeight()
            int r7 = r8 - r7
            goto L_0x003d
        L_0x004c:
            int r7 = r10 + r8
        L_0x004e:
            if (r2 != 0) goto L_0x0061
            java.util.WeakHashMap r9 = defpackage.gag.a
            boolean r6 = r6.getFitsSystemWindows()
            if (r6 == 0) goto L_0x0061
            int r6 = r11.getTopInset()
            int r8 = r8 - r6
            int r7 = java.lang.Math.min(r7, r8)
        L_0x0061:
            int r5 = r5 + r7
            goto L_0x0066
        L_0x0063:
            if (r5 <= 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            int r2 = r2 + r3
            goto L_0x0011
        L_0x0068:
            int r0 = java.lang.Math.max(r4, r5)
            r11.c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                dn dnVar = (dn) childAt.getLayoutParams();
                int measuredHeight = dnVar.topMargin + dnVar.bottomMargin + childAt.getMeasuredHeight();
                int i4 = dnVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    WeakHashMap weakHashMap = gag.a;
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.o = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.y0;
    }

    public bh8 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof bh8) {
            return (bh8) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = gag.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.w;
    }

    public Drawable getStatusBarForeground() {
        return this.H0;
    }

    @Deprecated
    public float getTargetElevation() {
        return c44.DEFAULT_ASPECT_RATIO;
    }

    public final int getTopInset() {
        iog iog = this.x;
        if (iog != null) {
            return iog.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                dn dnVar = (dn) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = dnVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                int i5 = measuredHeight + dnVar.topMargin + dnVar.bottomMargin + i3;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = gag.a;
                    if (childAt.getFitsSystemWindows()) {
                        i5 -= getTopInset();
                    }
                }
                i3 = i5;
                if ((i4 & 2) != 0) {
                    WeakHashMap weakHashMap2 = gag.a;
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(android.view.View r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.z0
            r1 = -1
            r2 = 0
            if (r0 != 0) goto L_0x0031
            int r0 = r4.y0
            if (r0 == r1) goto L_0x0031
            if (r5 == 0) goto L_0x0011
            android.view.View r0 = r5.findViewById(r0)
            goto L_0x0012
        L_0x0011:
            r0 = r2
        L_0x0012:
            if (r0 != 0) goto L_0x0028
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0028
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r4.y0
            android.view.View r0 = r0.findViewById(r3)
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r4.z0 = r3
        L_0x0031:
            java.lang.ref.WeakReference r4 = r4.z0
            if (r4 == 0) goto L_0x003c
            java.lang.Object r4 = r4.get()
            r2 = r4
            android.view.View r2 = (android.view.View) r2
        L_0x003c:
            if (r2 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r5 = r2
        L_0x0040:
            if (r5 == 0) goto L_0x0050
            boolean r4 = r5.canScrollVertically(r1)
            if (r4 != 0) goto L_0x004e
            int r4 = r5.getScrollY()
            if (r4 <= 0) goto L_0x0050
        L_0x004e:
            r4 = 1
            goto L_0x0051
        L_0x0050:
            r4 = 0
        L_0x0051:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.h(android.view.View):boolean");
    }

    public final boolean i() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap weakHashMap = gag.a;
        return !childAt.getFitsSystemWindows();
    }

    public final void j(float f, float f2) {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        this.B0 = ofFloat;
        ofFloat.setDuration(this.E0);
        this.B0.setInterpolator(this.F0);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.C0;
        if (animatorUpdateListener != null) {
            this.B0.addUpdateListener(animatorUpdateListener);
        }
        this.B0.start();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof bh8) {
            o5a.g0(this, (bh8) background);
        }
    }

    public final int[] onCreateDrawableState(int i) {
        if (this.G0 == null) {
            this.G0 = new int[4];
        }
        int[] iArr = this.G0;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z2 = this.v0;
        int i2 = edc.state_liftable;
        if (!z2) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (!z2 || !this.w0) ? -edc.state_lifted : edc.state_lifted;
        int i3 = edc.state_collapsible;
        if (!z2) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (!z2 || !this.w0) ? -edc.state_collapsed : edc.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.z0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.z0 = null;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3 = true;
        super.onLayout(z2, i, i2, i3, i4);
        WeakHashMap weakHashMap = gag.a;
        if (getFitsSystemWindows() && i()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        d();
        this.v = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((dn) getChildAt(i5).getLayoutParams()).c != null) {
                this.v = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.H0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.z) {
            if (!this.x0) {
                int childCount3 = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount3) {
                        z3 = false;
                        break;
                    }
                    int i7 = ((dn) getChildAt(i6).getLayoutParams()).a;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        break;
                    }
                    i6++;
                }
            }
            if (this.v0 != z3) {
                this.v0 = z3;
                refreshDrawableState();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = gag.a;
            if (getFitsSystemWindows() && i()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = h88.l(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        d();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof bh8) {
            ((bh8) background).k(f);
        }
    }

    public void setExpanded(boolean z2) {
        WeakHashMap weakHashMap = gag.a;
        f(z2, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z2) {
        this.x0 = z2;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.y0 = -1;
        if (view == null) {
            WeakReference weakReference = this.z0;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.z0 = null;
            return;
        }
        this.z0 = new WeakReference(view);
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.y0 = i;
        WeakReference weakReference = this.z0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.z0 = null;
    }

    public void setLiftableOverrideEnabled(boolean z2) {
        this.z = z2;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.H0;
        if (drawable2 != drawable) {
            Integer num = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.H0 = mutate;
            if (mutate instanceof bh8) {
                num = Integer.valueOf(((bh8) mutate).D0);
            } else {
                ColorStateList m = gsg.m(mutate);
                if (m != null) {
                    num = Integer.valueOf(m.getDefaultColor());
                }
            }
            this.I0 = num;
            Drawable drawable3 = this.H0;
            boolean z2 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.H0.setState(getDrawableState());
                }
                Drawable drawable4 = this.H0;
                WeakHashMap weakHashMap = gag.a;
                su4.b(drawable4, getLayoutDirection());
                this.H0.setVisible(getVisibility() == 0, false);
                this.H0.setCallback(this);
            }
            if (this.H0 != null && getTopInset() > 0) {
                z2 = true;
            }
            setWillNotDraw(!z2);
            WeakHashMap weakHashMap2 = gag.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(iq.D(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        q8.N(this, f);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.H0;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.H0;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r6 = L0
            android.content.Context r12 = defpackage.fh8.a(r12, r13, r14, r6)
            r11.<init>(r12, r13, r14)
            r12 = -1
            r11.b = r12
            r11.c = r12
            r11.o = r12
            r7 = 0
            r11.w = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.D0 = r0
            android.content.Context r8 = r11.getContext()
            r9 = 1
            r11.setOrientation(r9)
            android.view.ViewOutlineProvider r0 = r11.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L_0x002f
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BOUNDS
            r11.setOutlineProvider(r0)
        L_0x002f:
            android.content.Context r10 = r11.getContext()
            int[] r2 = defpackage.q8.h
            int[] r5 = new int[r7]
            r0 = r10
            r1 = r13
            r3 = r14
            r4 = r6
            android.content.res.TypedArray r0 = defpackage.vhf.d(r0, r1, r2, r3, r4, r5)
            boolean r1 = r0.hasValue(r7)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0054
            int r1 = r0.getResourceId(r7, r7)     // Catch:{ all -> 0x0051 }
            android.animation.StateListAnimator r1 = android.animation.AnimatorInflater.loadStateListAnimator(r10, r1)     // Catch:{ all -> 0x0051 }
            r11.setStateListAnimator(r1)     // Catch:{ all -> 0x0051 }
            goto L_0x0054
        L_0x0051:
            r11 = move-exception
            goto L_0x015c
        L_0x0054:
            r0.recycle()
            int[] r2 = defpackage.tnc.AppBarLayout
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r13
            r3 = r14
            r4 = r6
            android.content.res.TypedArray r13 = defpackage.vhf.d(r0, r1, r2, r3, r4, r5)
            int r14 = defpackage.tnc.AppBarLayout_android_background
            android.graphics.drawable.Drawable r14 = r13.getDrawable(r14)
            java.util.WeakHashMap r0 = defpackage.gag.a
            r11.setBackground(r14)
            int r14 = defpackage.tnc.AppBarLayout_liftOnScrollColor
            android.content.res.ColorStateList r3 = defpackage.m5a.C(r8, r13, r14)
            if (r3 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r9 = r7
        L_0x0078:
            r11.A0 = r9
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            android.content.res.ColorStateList r2 = defpackage.gsg.m(r14)
            if (r2 == 0) goto L_0x00c8
            bh8 r14 = new bh8
            r14.<init>()
            r14.l(r2)
            if (r3 == 0) goto L_0x00bb
            android.content.Context r0 = r11.getContext()
            int r1 = defpackage.edc.colorSurface
            android.util.TypedValue r1 = defpackage.b59.T(r1, r0)
            if (r1 == 0) goto L_0x00ab
            int r4 = r1.resourceId
            if (r4 == 0) goto L_0x00a3
            int r0 = defpackage.fw3.a(r0, r4)
            goto L_0x00a5
        L_0x00a3:
            int r0 = r1.data
        L_0x00a5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00a9:
            r5 = r0
            goto L_0x00ad
        L_0x00ab:
            r0 = 0
            goto L_0x00a9
        L_0x00ad:
            an r6 = new an
            r0 = r6
            r1 = r11
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r11.C0 = r6
            r11.setBackground(r14)
            goto L_0x00c8
        L_0x00bb:
            r14.j(r8)
            bn r0 = new bn
            r0.<init>(r7, r11, r14)
            r11.C0 = r0
            r11.setBackground(r14)
        L_0x00c8:
            int r14 = defpackage.edc.motionDurationMedium2
            android.content.res.Resources r0 = r11.getResources()
            int r1 = defpackage.zic.app_bar_elevation_anim_duration
            int r0 = r0.getInteger(r1)
            int r14 = defpackage.ld8.n0(r14, r0, r8)
            long r0 = (long) r14
            r11.E0 = r0
            int r14 = defpackage.edc.motionEasingStandardInterpolator
            android.view.animation.LinearInterpolator r0 = defpackage.xg.a
            android.animation.TimeInterpolator r14 = defpackage.ld8.o0(r8, r14, r0)
            r11.F0 = r14
            int r14 = defpackage.tnc.AppBarLayout_expanded
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto L_0x00f6
            int r14 = defpackage.tnc.AppBarLayout_expanded
            boolean r14 = r13.getBoolean(r14, r7)
            r11.f(r14, r7, r7)
        L_0x00f6:
            int r14 = defpackage.tnc.AppBarLayout_elevation
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto L_0x0108
            int r14 = defpackage.tnc.AppBarLayout_elevation
            int r14 = r13.getDimensionPixelSize(r14, r7)
            float r14 = (float) r14
            defpackage.q8.N(r11, r14)
        L_0x0108:
            int r14 = defpackage.tnc.AppBarLayout_android_keyboardNavigationCluster
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto L_0x0119
            int r14 = defpackage.tnc.AppBarLayout_android_keyboardNavigationCluster
            boolean r14 = r13.getBoolean(r14, r7)
            r11.setKeyboardNavigationCluster(r14)
        L_0x0119:
            int r14 = defpackage.tnc.AppBarLayout_android_touchscreenBlocksFocus
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto L_0x012a
            int r14 = defpackage.tnc.AppBarLayout_android_touchscreenBlocksFocus
            boolean r14 = r13.getBoolean(r14, r7)
            r11.setTouchscreenBlocksFocus(r14)
        L_0x012a:
            android.content.res.Resources r14 = r11.getResources()
            int r0 = defpackage.iec.design_appbar_elevation
            float r14 = r14.getDimension(r0)
            r11.J0 = r14
            int r14 = defpackage.tnc.AppBarLayout_liftOnScroll
            boolean r14 = r13.getBoolean(r14, r7)
            r11.x0 = r14
            int r14 = defpackage.tnc.AppBarLayout_liftOnScrollTargetViewId
            int r12 = r13.getResourceId(r14, r12)
            r11.y0 = r12
            int r12 = defpackage.tnc.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r12 = r13.getDrawable(r12)
            r11.setStatusBarForeground(r12)
            r13.recycle()
            vs6 r12 = new vs6
            r13 = 3
            r12.<init>((int) r13, (java.lang.Object) r11)
            defpackage.v9g.u(r11, r12)
            return
        L_0x015c:
            r0.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m1generateDefaultLayoutParams() {
        return new dn(-1, -2);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends bx6 {
        public int j;
        public int k;
        public ValueAnimator l;
        public d m;
        public WeakReference n;

        public BaseBehavior() {
            this.f = -1;
            this.h = -1;
        }

        public static View C(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            baseBehavior.getClass();
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((wz3) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View E(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof h6a) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00cd  */
        /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void L(androidx.coordinatorlayout.widget.CoordinatorLayout r8, com.google.android.material.appbar.AppBarLayout r9, int r10, int r11, boolean r12) {
            /*
                r0 = 1
                int r1 = java.lang.Math.abs(r10)
                int r2 = r9.getChildCount()
                r3 = 0
                r4 = r3
            L_0x000b:
                r5 = 0
                if (r4 >= r2) goto L_0x0021
                android.view.View r6 = r9.getChildAt(r4)
                int r7 = r6.getTop()
                if (r1 < r7) goto L_0x001f
                int r7 = r6.getBottom()
                if (r1 > r7) goto L_0x001f
                goto L_0x0022
            L_0x001f:
                int r4 = r4 + r0
                goto L_0x000b
            L_0x0021:
                r6 = r5
            L_0x0022:
                if (r6 == 0) goto L_0x005d
                android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
                dn r1 = (defpackage.dn) r1
                int r1 = r1.a
                r2 = r1 & 1
                if (r2 == 0) goto L_0x005d
                java.util.WeakHashMap r2 = defpackage.gag.a
                int r2 = r6.getMinimumHeight()
                if (r11 <= 0) goto L_0x004b
                r11 = r1 & 12
                if (r11 == 0) goto L_0x004b
                int r10 = -r10
                int r11 = r6.getBottom()
                int r11 = r11 - r2
                int r1 = r9.getTopInset()
                int r11 = r11 - r1
                if (r10 < r11) goto L_0x005d
            L_0x0049:
                r10 = r0
                goto L_0x005e
            L_0x004b:
                r11 = r1 & 2
                if (r11 == 0) goto L_0x005d
                int r10 = -r10
                int r11 = r6.getBottom()
                int r11 = r11 - r2
                int r1 = r9.getTopInset()
                int r11 = r11 - r1
                if (r10 < r11) goto L_0x005d
                goto L_0x0049
            L_0x005d:
                r10 = r3
            L_0x005e:
                boolean r11 = r9.x0
                if (r11 == 0) goto L_0x006a
                android.view.View r10 = E(r8)
                boolean r10 = r9.h(r10)
            L_0x006a:
                boolean r10 = r9.g(r10)
                if (r12 != 0) goto L_0x00ad
                if (r10 == 0) goto L_0x00d4
                qpg r8 = r8.b
                java.lang.Object r8 = r8.b
                qae r8 = (defpackage.qae) r8
                java.lang.Object r8 = r8.get(r9)
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                if (r8 != 0) goto L_0x0081
                goto L_0x0086
            L_0x0081:
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r8)
            L_0x0086:
                if (r5 != 0) goto L_0x008c
                java.util.List r5 = java.util.Collections.emptyList()
            L_0x008c:
                int r8 = r5.size()
            L_0x0090:
                if (r3 >= r8) goto L_0x00d4
                java.lang.Object r10 = r5.get(r3)
                android.view.View r10 = (android.view.View) r10
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                wz3 r10 = (defpackage.wz3) r10
                tz3 r10 = r10.a
                boolean r11 = r10 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r11 == 0) goto L_0x00ab
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r10
                int r8 = r10.f
                if (r8 == 0) goto L_0x00d4
                goto L_0x00ad
            L_0x00ab:
                int r3 = r3 + r0
                goto L_0x0090
            L_0x00ad:
                android.graphics.drawable.Drawable r8 = r9.getBackground()
                if (r8 == 0) goto L_0x00ba
                android.graphics.drawable.Drawable r8 = r9.getBackground()
                r8.jumpToCurrentState()
            L_0x00ba:
                android.graphics.drawable.Drawable r8 = r9.getForeground()
                if (r8 == 0) goto L_0x00c7
                android.graphics.drawable.Drawable r8 = r9.getForeground()
                r8.jumpToCurrentState()
            L_0x00c7:
                android.animation.StateListAnimator r8 = r9.getStateListAnimator()
                if (r8 == 0) goto L_0x00d4
                android.animation.StateListAnimator r8 = r9.getStateListAnimator()
                r8.jumpToCurrentState()
            L_0x00d4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.L(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final int A(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            int i6 = i2;
            int i7 = 1;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int z = z();
            int i8 = 0;
            if (i6 == 0 || z < i6 || z > i3) {
                this.j = 0;
            } else {
                int l2 = h88.l(i, i2, i3);
                if (z != l2) {
                    if (appBarLayout.v) {
                        int abs = Math.abs(l2);
                        int childCount = appBarLayout.getChildCount();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i9);
                            dn dnVar = (dn) childAt.getLayoutParams();
                            Interpolator interpolator = dnVar.c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i9++;
                            } else if (interpolator != null) {
                                int i10 = dnVar.a;
                                if ((i10 & 1) != 0) {
                                    i5 = childAt.getHeight() + dnVar.topMargin + dnVar.bottomMargin;
                                    if ((i10 & 2) != 0) {
                                        WeakHashMap weakHashMap = gag.a;
                                        i5 -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    i5 = 0;
                                }
                                WeakHashMap weakHashMap2 = gag.a;
                                if (childAt.getFitsSystemWindows()) {
                                    i5 -= appBarLayout.getTopInset();
                                }
                                if (i5 > 0) {
                                    float f = (float) i5;
                                    i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f) * f)) * Integer.signum(l2);
                                }
                            }
                        }
                    }
                    i4 = l2;
                    boolean y = y(i4);
                    int i11 = z - l2;
                    this.j = l2 - i4;
                    if (y) {
                        for (int i12 = 0; i12 < appBarLayout.getChildCount(); i12 += i7) {
                            dn dnVar2 = (dn) appBarLayout.getChildAt(i12).getLayoutParams();
                            wsb wsb = dnVar2.b;
                            if (!(wsb == null || (dnVar2.a & i7) == 0)) {
                                View childAt2 = appBarLayout.getChildAt(i12);
                                Rect rect = (Rect) wsb.a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = ((float) rect.top) - Math.abs((float) w());
                                if (abs2 <= c44.DEFAULT_ASPECT_RATIO) {
                                    float k2 = 1.0f - h88.k(Math.abs(abs2 / ((float) rect.height())), c44.DEFAULT_ASPECT_RATIO, 1.0f);
                                    float height = (-abs2) - ((((float) rect.height()) * 0.3f) * (1.0f - (k2 * k2)));
                                    childAt2.setTranslationY(height);
                                    Rect rect2 = (Rect) wsb.b;
                                    childAt2.getDrawingRect(rect2);
                                    rect2.offset(0, (int) (-height));
                                    if (height >= ((float) rect2.height())) {
                                        childAt2.setVisibility(4);
                                    } else {
                                        childAt2.setVisibility(0);
                                    }
                                    WeakHashMap weakHashMap3 = gag.a;
                                    childAt2.setClipBounds(rect2);
                                } else {
                                    WeakHashMap weakHashMap4 = gag.a;
                                    childAt2.setClipBounds((Rect) null);
                                    childAt2.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                                    childAt2.setVisibility(0);
                                }
                                i7 = 1;
                            }
                        }
                    }
                    if (!y && appBarLayout.v) {
                        coordinatorLayout2.c(appBarLayout);
                    }
                    appBarLayout.e(w());
                    if (l2 < z) {
                        i7 = -1;
                    }
                    L(coordinatorLayout2, appBarLayout, l2, i7, false);
                    i8 = i11;
                }
            }
            WeakHashMap weakHashMap5 = gag.a;
            if (bag.a(coordinatorLayout) == null) {
                gag.j(coordinatorLayout2, new b(coordinatorLayout2, this, appBarLayout));
            }
            return i8;
        }

        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(z() - i);
            float abs2 = Math.abs(c44.DEFAULT_ASPECT_RATIO);
            int round = abs2 > c44.DEFAULT_ASPECT_RATIO ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            int z = z();
            if (z == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(xg.e);
                this.l.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration((long) Math.min(round, 600));
            this.l.setIntValues(new int[]{z, i});
            this.l.start();
        }

        /* renamed from: F */
        public void o(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -appBarLayout.getTotalScrollRange();
                    i5 = appBarLayout.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -appBarLayout.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                int i6 = i4;
                int i7 = i5;
                if (i6 != i7) {
                    iArr[1] = A(coordinatorLayout, appBarLayout, z() - i2, i6, i7);
                }
            }
            if (appBarLayout.x0) {
                appBarLayout.g(appBarLayout.h(view));
            }
        }

        /* renamed from: G */
        public void p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                AppBarLayout appBarLayout2 = appBarLayout;
                iArr[1] = A(coordinatorLayout2, appBarLayout2, z() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                WeakHashMap weakHashMap = gag.a;
                if (bag.a(coordinatorLayout) == null) {
                    gag.j(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
                }
            }
        }

        /* renamed from: H */
        public boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (appBarLayout.x0 || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.n = null;
            this.k = i2;
            return z;
        }

        /* renamed from: I */
        public void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (this.k == 0 || i == 1) {
                K(coordinatorLayout, appBarLayout);
                if (appBarLayout.x0) {
                    appBarLayout.g(appBarLayout.h(view));
                }
            }
            this.n = new WeakReference(view);
        }

        /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.material.appbar.d, z] */
        public final d J(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z = true;
            int w = w();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + w;
                if (childAt.getTop() + w > 0 || bottom < 0) {
                    i++;
                } else {
                    if (parcelable == null) {
                        parcelable = z.b;
                    }
                    ? zVar = new z(parcelable);
                    boolean z2 = w == 0;
                    zVar.o = z2;
                    zVar.c = !z2 && (-w) >= appBarLayout.getTotalScrollRange();
                    zVar.v = i;
                    WeakHashMap weakHashMap = gag.a;
                    if (bottom != appBarLayout.getTopInset() + childAt.getMinimumHeight()) {
                        z = false;
                    }
                    zVar.x = z;
                    zVar.w = ((float) bottom) / ((float) childAt.getHeight());
                    return zVar;
                }
            }
            return null;
        }

        public final void K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int z = z() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                dn dnVar = (dn) childAt.getLayoutParams();
                if ((dnVar.a & 32) == 32) {
                    top -= dnVar.topMargin;
                    bottom += dnVar.bottomMargin;
                }
                int i2 = -z;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                dn dnVar2 = (dn) childAt2.getLayoutParams();
                int i3 = dnVar2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap weakHashMap = gag.a;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            i4 -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap weakHashMap2 = gag.a;
                        i5 += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        WeakHashMap weakHashMap3 = gag.a;
                        int minimumHeight = childAt2.getMinimumHeight() + i5;
                        if (z < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        i4 += dnVar2.topMargin;
                        i5 -= dnVar2.bottomMargin;
                    }
                    if (z < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    D(coordinatorLayout, appBarLayout, h88.l(i4 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            d dVar = this.m;
            if (dVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i3 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            D(coordinatorLayout, appBarLayout, i3);
                        } else {
                            B(coordinatorLayout, appBarLayout, i3);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            D(coordinatorLayout, appBarLayout, 0);
                        } else {
                            B(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (dVar.c) {
                B(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (dVar.o) {
                B(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(dVar.v);
                int i4 = -childAt.getBottom();
                if (this.m.x) {
                    WeakHashMap weakHashMap = gag.a;
                    i2 = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i4;
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.m.w) + i4;
                }
                B(coordinatorLayout, appBarLayout, i2);
            }
            appBarLayout.w = 0;
            this.m = null;
            y(h88.l(w(), -appBarLayout.getTotalScrollRange(), 0));
            L(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.e(w());
            WeakHashMap weakHashMap2 = gag.a;
            if (bag.a(coordinatorLayout) == null) {
                gag.j(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            }
            return true;
        }

        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((wz3) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.l(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        public final void r(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof d) {
                this.m = (d) parcelable;
            } else {
                this.m = null;
            }
        }

        public final Parcelable s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            d J = J(absSavedState, (AppBarLayout) view);
            return J == null ? absSavedState : J;
        }

        public final int z() {
            return w() + this.j;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f = -1;
            this.h = -1;
        }
    }
}
