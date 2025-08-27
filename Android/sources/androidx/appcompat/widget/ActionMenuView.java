package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import kotlin.jvm.internal.IntCompanionObject;

public class ActionMenuView extends yv7 implements l69, l79 {
    public m69 a;
    public Context b;
    public int c = 0;
    public boolean o;
    public w7 v;
    public final int v0;
    public h79 w;
    public final int w0;
    public k69 x;
    public z7 x0;
    public boolean y;
    public int z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.v0 = (int) (56.0f * f);
        this.w0 = (int) (f * 4.0f);
        this.b = context;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, y7] */
    public static y7 c() {
        ? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.a = false;
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, y7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.y7 e(android.view.ViewGroup.LayoutParams r1) {
        /*
            if (r1 == 0) goto L_0x0020
            boolean r0 = r1 instanceof defpackage.y7
            if (r0 == 0) goto L_0x0012
            y7 r0 = new y7
            y7 r1 = (defpackage.y7) r1
            r0.<init>(r1)
            boolean r1 = r1.a
            r0.a = r1
            goto L_0x0017
        L_0x0012:
            y7 r0 = new y7
            r0.<init>(r1)
        L_0x0017:
            int r1 = r0.gravity
            if (r1 > 0) goto L_0x001f
            r1 = 16
            r0.gravity = r1
        L_0x001f:
            return r0
        L_0x0020:
            y7 r1 = c()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.e(android.view.ViewGroup$LayoutParams):y7");
    }

    public final boolean a(u69 u69) {
        return this.a.q(u69, (i79) null, 0);
    }

    public final void b(m69 m69) {
        this.a = m69;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof y7;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final boolean f(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof x7)) {
            z2 = ((x7) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof x7)) ? z2 : z2 | ((x7) childAt2).e();
    }

    public Menu getMenu() {
        if (this.a == null) {
            Context context = getContext();
            m69 m69 = new m69(context);
            this.a = m69;
            m69.v = new b8d((Object) this);
            w7 w7Var = new w7(context);
            this.v = w7Var;
            w7Var.Z = true;
            w7Var.v0 = true;
            h79 h79 = this.w;
            if (h79 == null) {
                h79 = new ece(6);
            }
            w7Var.v = h79;
            this.a.b(w7Var, this.b);
            w7 w7Var2 = this.v;
            w7Var2.y = this;
            this.a = w7Var2.c;
        }
        return this.a;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        w7 w7Var = this.v;
        v7 v7Var = w7Var.z;
        if (v7Var != null) {
            return v7Var.getDrawable();
        }
        if (w7Var.Y) {
            return w7Var.X;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.c;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w7 w7Var = this.v;
        if (w7Var != null) {
            w7Var.h();
            if (this.v.i()) {
                this.v.b();
                this.v.k();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w7 w7Var = this.v;
        if (w7Var != null) {
            w7Var.b();
            t7 t7Var = w7Var.C0;
            if (t7Var != null && t7Var.b()) {
                t7Var.j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.y) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = getLayoutDirection() == 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                y7 y7Var = (y7) childAt.getLayoutParams();
                if (y7Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (f(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i5 = getPaddingLeft() + y7Var.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - y7Var.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + y7Var.leftMargin) + y7Var.rightMargin;
                    f(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (z3) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                y7 y7Var2 = (y7) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !y7Var2.a) {
                    int i17 = width - y7Var2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + y7Var2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            y7 y7Var3 = (y7) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !y7Var3.a) {
                int i20 = paddingLeft + y7Var3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + y7Var3.rightMargin + max + i20;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        int i12;
        m69 m69;
        boolean z4 = this.y;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.y = z5;
        if (z4 != z5) {
            this.z = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.y || (m69 = this.a) == null || size == this.z)) {
            this.z = size;
            m69.p(true);
        }
        int childCount = getChildCount();
        if (!this.y || childCount <= 0) {
            int i13 = i2;
            for (int i14 = 0; i14 < childCount; i14++) {
                y7 y7Var = (y7) getChildAt(i14).getLayoutParams();
                y7Var.rightMargin = 0;
                y7Var.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i15 = size2 - paddingRight;
        int i16 = this.v0;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = (i18 / i17) + i16;
        int childCount2 = getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z6 = false;
        int i23 = 0;
        int i24 = 0;
        long j = 0;
        while (true) {
            i3 = this.w0;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i25 = size3;
            if (childAt.getVisibility() == 8) {
                i10 = i15;
                i11 = paddingBottom;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i26 = i20 + 1;
                if (z7) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                y7 y7Var2 = (y7) childAt.getLayoutParams();
                y7Var2.f = false;
                y7Var2.c = 0;
                y7Var2.b = 0;
                y7Var2.d = false;
                y7Var2.leftMargin = 0;
                y7Var2.rightMargin = 0;
                y7Var2.e = z7 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i27 = y7Var2.a ? 1 : i17;
                int i28 = i26;
                y7 y7Var3 = (y7) childAt.getLayoutParams();
                i10 = i15;
                i11 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i27 <= 0 || (z8 && i27 < 2)) {
                    i12 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i27 * i19, IntCompanionObject.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i12 = measuredWidth / i19;
                    if (measuredWidth % i19 != 0) {
                        i12++;
                    }
                    if (z8 && i12 < 2) {
                        i12 = 2;
                    }
                }
                y7Var3.d = !y7Var3.a && z8;
                y7Var3.b = i12;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i19, 1073741824), makeMeasureSpec);
                i21 = Math.max(i21, i12);
                if (y7Var2.d) {
                    i23++;
                }
                if (y7Var2.a) {
                    z6 = true;
                }
                i17 -= i12;
                i24 = Math.max(i24, childAt.getMeasuredHeight());
                if (i12 == 1) {
                    j |= (long) (1 << i22);
                }
                i20 = i28;
            }
            i22++;
            size3 = i25;
            paddingBottom = i11;
            i15 = i10;
        }
        int i29 = i15;
        int i30 = size3;
        int i31 = i24;
        boolean z9 = z6 && i20 == 2;
        boolean z10 = false;
        while (true) {
            if (i23 <= 0 || i17 <= 0) {
                i4 = mode;
                i5 = i31;
                z2 = z10;
            } else {
                int i32 = IntCompanionObject.MAX_VALUE;
                int i33 = 0;
                int i34 = 0;
                long j2 = 0;
                while (i34 < childCount2) {
                    int i35 = i31;
                    y7 y7Var4 = (y7) getChildAt(i34).getLayoutParams();
                    boolean z11 = z10;
                    if (y7Var4.d) {
                        int i36 = y7Var4.b;
                        if (i36 < i32) {
                            j2 = 1 << i34;
                            i32 = i36;
                            i33 = 1;
                        } else if (i36 == i32) {
                            i33++;
                            j2 |= 1 << i34;
                        }
                    }
                    i34++;
                    z10 = z11;
                    i31 = i35;
                }
                i5 = i31;
                z2 = z10;
                j |= j2;
                if (i33 > i17) {
                    i4 = mode;
                    break;
                }
                int i37 = i32 + 1;
                int i38 = 0;
                while (i38 < childCount2) {
                    View childAt2 = getChildAt(i38);
                    y7 y7Var5 = (y7) childAt2.getLayoutParams();
                    int i39 = mode;
                    int i40 = childMeasureSpec;
                    int i41 = childCount2;
                    long j3 = (long) (1 << i38);
                    if ((j2 & j3) != 0) {
                        if (!z9 || !y7Var5.e) {
                            z3 = true;
                        } else {
                            z3 = true;
                            if (i17 == 1) {
                                childAt2.setPadding(i3 + i19, 0, i3, 0);
                            }
                        }
                        y7Var5.b += z3 ? 1 : 0;
                        y7Var5.f = z3;
                        i17--;
                    } else if (y7Var5.b == i37) {
                        j |= j3;
                    }
                    i38++;
                    childMeasureSpec = i40;
                    mode = i39;
                    childCount2 = i41;
                }
                i31 = i5;
                z10 = true;
            }
        }
        i4 = mode;
        i5 = i31;
        z2 = z10;
        int i42 = childMeasureSpec;
        int i43 = childCount2;
        boolean z12 = !z6 && i20 == 1;
        if (i17 <= 0 || j == 0 || (i17 >= i20 - 1 && !z12 && i21 <= 1)) {
            i6 = i43;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((y7) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i44 = i43 - 1;
                if ((j & ((long) (1 << i44))) != 0 && !((y7) getChildAt(i44).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i45 = bitCount > c44.DEFAULT_ASPECT_RATIO ? (int) (((float) (i17 * i19)) / bitCount) : 0;
            i6 = i43;
            for (int i46 = 0; i46 < i6; i46++) {
                if ((j & ((long) (1 << i46))) != 0) {
                    View childAt3 = getChildAt(i46);
                    y7 y7Var6 = (y7) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        y7Var6.c = i45;
                        y7Var6.f = true;
                        if (i46 == 0 && !y7Var6.e) {
                            y7Var6.leftMargin = (-i45) / 2;
                        }
                        z2 = true;
                    } else if (y7Var6.a) {
                        y7Var6.c = i45;
                        y7Var6.f = true;
                        y7Var6.rightMargin = (-i45) / 2;
                        z2 = true;
                    } else {
                        if (i46 != 0) {
                            y7Var6.leftMargin = i45 / 2;
                        }
                        if (i46 != i6 - 1) {
                            y7Var6.rightMargin = i45 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            int i47 = 0;
            while (i47 < i6) {
                View childAt4 = getChildAt(i47);
                y7 y7Var7 = (y7) childAt4.getLayoutParams();
                if (!y7Var7.f) {
                    i9 = i42;
                } else {
                    i9 = i42;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((y7Var7.b * i19) + y7Var7.c, 1073741824), i9);
                }
                i47++;
                i42 = i9;
            }
        }
        if (i4 != 1073741824) {
            i8 = i29;
            i7 = i5;
        } else {
            i7 = i30;
            i8 = i29;
        }
        setMeasuredDimension(i8, i7);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.v.z0 = z2;
    }

    public void setOnMenuItemClickListener(z7 z7Var) {
        this.x0 = z7Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        w7 w7Var = this.v;
        v7 v7Var = w7Var.z;
        if (v7Var != null) {
            v7Var.setImageDrawable(drawable);
            return;
        }
        w7Var.Y = true;
        w7Var.X = drawable;
    }

    public void setOverflowReserved(boolean z2) {
        this.o = z2;
    }

    public void setPopupTheme(int i) {
        if (this.c != i) {
            this.c = i;
            if (i == 0) {
                this.b = getContext();
            } else {
                this.b = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(w7 w7Var) {
        this.v = w7Var;
        w7Var.y = this;
        this.a = w7Var.c;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [xv7, android.widget.LinearLayout$LayoutParams] */
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final xv7 m0generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
