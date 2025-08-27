package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements ga4, j6a, k6a {
    public static final int[] O0 = {hdc.actionBarSize, 16842841};
    public static final iog P0;
    public static final Rect Q0 = new Rect();
    public final Rect A0 = new Rect();
    public final Rect B0 = new Rect();
    public iog C0;
    public iog D0;
    public iog E0;
    public iog F0;
    public b7 G0;
    public OverScroller H0;
    public ViewPropertyAnimator I0;
    public final z6 J0;
    public final a7 K0;
    public final a7 L0;
    public final ft M0;
    public final d7 N0;
    public int a;
    public int b = 0;
    public ContentFrameLayout c;
    public ActionBarContainer o;
    public ha4 v;
    public boolean v0;
    public Drawable w;
    public int w0;
    public boolean x;
    public int x0;
    public boolean y;
    public final Rect y0 = new Rect();
    public boolean z;
    public final Rect z0 = new Rect();

    static {
        zng yng = Build.VERSION.SDK_INT >= 30 ? new yng() : new xng();
        yng.f(wh7.b(0, 1, 0, 1));
        P0 = yng.b();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        iog iog = iog.b;
        this.C0 = iog;
        this.D0 = iog;
        this.E0 = iog;
        this.F0 = iog;
        this.J0 = new z6(0, (Object) this);
        this.K0 = new a7(this, 0);
        this.L0 = new a7(this, 1);
        c(context);
        this.M0 = new ft(6);
        d7 d7Var = new d7(context, 0);
        d7Var.setWillNotDraw(true);
        this.N0 = d7Var;
        addView(d7Var);
    }

    public static boolean a(View view, Rect rect, boolean z2) {
        boolean z3;
        int i;
        c7 c7Var = (c7) view.getLayoutParams();
        int i2 = c7Var.leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            c7Var.leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = c7Var.topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            c7Var.topMargin = i5;
            z3 = true;
        }
        int i6 = c7Var.rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            c7Var.rightMargin = i7;
            z3 = true;
        }
        if (!z2 || c7Var.bottomMargin == (i = rect.bottom)) {
            return z3;
        }
        c7Var.bottomMargin = i;
        return true;
    }

    public final void b() {
        removeCallbacks(this.K0);
        removeCallbacks(this.L0);
        ViewPropertyAnimator viewPropertyAnimator = this.I0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(O0);
        boolean z2 = false;
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.w = drawable;
        if (drawable == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        obtainStyledAttributes.recycle();
        this.H0 = new OverScroller(context);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c7;
    }

    public final void d(int i) {
        e();
        if (i == 2) {
            this.v.getClass();
        } else if (i == 5) {
            this.v.getClass();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.w != null) {
            if (this.o.getVisibility() == 0) {
                i = (int) (this.o.getTranslationY() + ((float) this.o.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.w.setBounds(0, i, getWidth(), this.w.getIntrinsicHeight() + i);
            this.w.draw(canvas);
        }
    }

    public final void e() {
        ha4 ha4;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(egc.action_bar_activity_content);
            this.o = (ActionBarContainer) findViewById(egc.action_bar_container);
            View findViewById = findViewById(egc.action_bar);
            if (findViewById instanceof ha4) {
                ha4 = (ha4) findViewById;
            } else if (findViewById instanceof Toolbar) {
                ha4 = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.v = ha4;
        }
    }

    public final void f(Menu menu, h79 h79) {
        e();
        omf omf = (omf) this.v;
        w7 w7Var = omf.m;
        Toolbar toolbar = omf.a;
        if (w7Var == null) {
            omf.m = new w7(toolbar.getContext());
        }
        w7 w7Var2 = omf.m;
        w7Var2.v = h79;
        m69 m69 = (m69) menu;
        if (m69 != null || toolbar.a != null) {
            toolbar.f();
            m69 m692 = toolbar.a.a;
            if (m692 != m69) {
                if (m692 != null) {
                    m692.r(toolbar.X0);
                    m692.r(toolbar.Y0);
                }
                if (toolbar.Y0 == null) {
                    toolbar.Y0 = new fmf(toolbar);
                }
                w7Var2.z0 = true;
                if (m69 != null) {
                    m69.b(w7Var2, toolbar.v0);
                    m69.b(toolbar.Y0, toolbar.v0);
                } else {
                    w7Var2.j(toolbar.v0, (m69) null);
                    toolbar.Y0.j(toolbar.v0, (m69) null);
                    w7Var2.h();
                    toolbar.Y0.h();
                }
                toolbar.a.setPopupTheme(toolbar.w0);
                toolbar.a.setPresenter(w7Var2);
                toolbar.X0 = w7Var2;
                toolbar.x();
            }
        }
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.o;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        ft ftVar = this.M0;
        return ftVar.c | ftVar.b;
    }

    public CharSequence getTitle() {
        e();
        return ((omf) this.v).a.getTitle();
    }

    public final void n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        o(view, i, i2, i3, i4, i5);
    }

    public final void o(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        e();
        iog g = iog.g(this, windowInsets);
        boolean a2 = a(this.o, new Rect(g.b(), g.d(), g.c(), g.a()), false);
        WeakHashMap weakHashMap = gag.a;
        Rect rect = this.y0;
        v9g.b(this, g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        fog fog = g.a;
        iog l = fog.l(i, i2, i3, i4);
        this.C0 = l;
        boolean z2 = true;
        if (!this.D0.equals(l)) {
            this.D0 = this.C0;
            a2 = true;
        }
        Rect rect2 = this.z0;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z2 = a2;
        }
        if (z2) {
            requestLayout();
        }
        return fog.a().a.c().a.b().f();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = gag.a;
        t9g.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                c7 c7Var = (c7) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = c7Var.leftMargin + paddingLeft;
                int i7 = c7Var.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            r11.e()
            androidx.appcompat.widget.ActionBarContainer r1 = r11.o
            r3 = 0
            r5 = 0
            r0 = r11
            r2 = r12
            r4 = r13
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.o
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            c7 r0 = (defpackage.c7) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r11.o
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r3 = r11.o
            int r3 = r3.getMeasuredHeight()
            int r4 = r0.topMargin
            int r3 = r3 + r4
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r2, r3)
            androidx.appcompat.widget.ActionBarContainer r3 = r11.o
            int r3 = r3.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r2, r3)
            java.util.WeakHashMap r4 = defpackage.gag.a
            int r4 = r11.getWindowSystemUiVisibility()
            r4 = r4 & 256(0x100, float:3.59E-43)
            r5 = 1
            if (r4 == 0) goto L_0x004d
            r4 = r5
            goto L_0x004e
        L_0x004d:
            r4 = r2
        L_0x004e:
            if (r4 == 0) goto L_0x0062
            int r6 = r11.a
            boolean r7 = r11.y
            if (r7 == 0) goto L_0x0074
            androidx.appcompat.widget.ActionBarContainer r7 = r11.o
            android.view.View r7 = r7.getTabContainer()
            if (r7 == 0) goto L_0x0074
            int r7 = r11.a
            int r6 = r6 + r7
            goto L_0x0074
        L_0x0062:
            androidx.appcompat.widget.ActionBarContainer r6 = r11.o
            int r6 = r6.getVisibility()
            r7 = 8
            if (r6 == r7) goto L_0x0073
            androidx.appcompat.widget.ActionBarContainer r6 = r11.o
            int r6 = r6.getMeasuredHeight()
            goto L_0x0074
        L_0x0073:
            r6 = r2
        L_0x0074:
            android.graphics.Rect r7 = r11.y0
            android.graphics.Rect r8 = r11.A0
            r8.set(r7)
            iog r7 = r11.C0
            r11.E0 = r7
            boolean r7 = r11.x
            if (r7 != 0) goto L_0x00ab
            if (r4 != 0) goto L_0x00ab
            d7 r4 = r11.N0
            iog r7 = P0
            android.graphics.Rect r9 = r11.B0
            defpackage.v9g.b(r4, r7, r9)
            android.graphics.Rect r4 = Q0
            boolean r4 = r9.equals(r4)
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x00ab
            int r4 = r8.top
            int r4 = r4 + r6
            r8.top = r4
            int r4 = r8.bottom
            r8.bottom = r4
            iog r4 = r11.E0
            fog r4 = r4.a
            iog r2 = r4.l(r2, r6, r2, r2)
            r11.E0 = r2
            goto L_0x00e4
        L_0x00ab:
            iog r2 = r11.E0
            int r2 = r2.b()
            iog r4 = r11.E0
            int r4 = r4.d()
            int r4 = r4 + r6
            iog r6 = r11.E0
            int r6 = r6.c()
            iog r7 = r11.E0
            int r7 = r7.a()
            wh7 r2 = defpackage.wh7.b(r2, r4, r6, r7)
            iog r4 = r11.E0
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r6 < r7) goto L_0x00d6
            yng r6 = new yng
            r6.<init>(r4)
            goto L_0x00db
        L_0x00d6:
            xng r6 = new xng
            r6.<init>(r4)
        L_0x00db:
            r6.f(r2)
            iog r2 = r6.b()
            r11.E0 = r2
        L_0x00e4:
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.c
            a(r2, r8, r5)
            iog r2 = r11.F0
            iog r4 = r11.E0
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00fc
            iog r2 = r11.E0
            r11.F0 = r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.c
            defpackage.gag.b(r4, r2)
        L_0x00fc:
            androidx.appcompat.widget.ContentFrameLayout r6 = r11.c
            r8 = 0
            r10 = 0
            r5 = r11
            r7 = r12
            r9 = r13
            r5.measureChildWithMargins(r6, r7, r8, r9, r10)
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.c
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            c7 r2 = (defpackage.c7) r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.c
            int r4 = r4.getMeasuredWidth()
            int r5 = r2.leftMargin
            int r4 = r4 + r5
            int r5 = r2.rightMargin
            int r4 = r4 + r5
            int r1 = java.lang.Math.max(r1, r4)
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.c
            int r4 = r4.getMeasuredHeight()
            int r5 = r2.topMargin
            int r4 = r4 + r5
            int r2 = r2.bottomMargin
            int r4 = r4 + r2
            int r0 = java.lang.Math.max(r0, r4)
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.c
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r3, r2)
            int r3 = r11.getPaddingLeft()
            int r4 = r11.getPaddingRight()
            int r4 = r4 + r3
            int r4 = r4 + r1
            int r1 = r11.getPaddingTop()
            int r3 = r11.getPaddingBottom()
            int r3 = r3 + r1
            int r3 = r3 + r0
            int r0 = r11.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r3, r0)
            int r1 = r11.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r4, r1)
            int r12 = android.view.View.resolveSizeAndState(r1, r12, r2)
            int r1 = r2 << 16
            int r13 = android.view.View.resolveSizeAndState(r0, r13, r1)
            r11.setMeasuredDimension(r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (!this.z || !z2) {
            return false;
        }
        this.H0.fling(0, 0, 0, (int) f2, 0, 0, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE);
        if (this.H0.getFinalY() > this.o.getHeight()) {
            b();
            this.L0.run();
        } else {
            b();
            this.K0.run();
        }
        this.v0 = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.w0 + i2;
        this.w0 = i5;
        setActionBarHideOffset(i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r0 = (defpackage.ong) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            ft r1 = r0.M0
            r1.b = r3
            int r1 = r0.getActionBarHideOffset()
            r0.w0 = r1
            r0.b()
            b7 r0 = r0.G0
            if (r0 == 0) goto L_0x001d
            ong r0 = (defpackage.ong) r0
            nqe r1 = r0.O
            if (r1 == 0) goto L_0x001d
            r1.a()
            r1 = 0
            r0.O = r1
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.o.getVisibility() != 0) {
            return false;
        }
        return this.z;
    }

    public final void onStopNestedScroll(View view) {
        if (this.z && !this.v0) {
            if (this.w0 <= this.o.getHeight()) {
                b();
                postDelayed(this.K0, 600);
                return;
            }
            b();
            postDelayed(this.L0, 600);
        }
    }

    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        e();
        int i2 = this.x0 ^ i;
        this.x0 = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        b7 b7Var = this.G0;
        if (b7Var != null) {
            ((ong) b7Var).K = !z3;
            if (z2 || !z3) {
                ong ong = (ong) b7Var;
                if (ong.L) {
                    ong.L = false;
                    ong.k0(true);
                }
            } else {
                ong ong2 = (ong) b7Var;
                if (!ong2.L) {
                    ong2.L = true;
                    ong2.k0(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.G0 != null) {
            WeakHashMap weakHashMap = gag.a;
            t9g.c(this);
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        b7 b7Var = this.G0;
        if (b7Var != null) {
            ((ong) b7Var).J = i;
        }
    }

    public final boolean p(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void r(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final void s(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public void setActionBarHideOffset(int i) {
        b();
        this.o.setTranslationY((float) (-Math.max(0, Math.min(i, this.o.getHeight()))));
    }

    public void setActionBarVisibilityCallback(b7 b7Var) {
        this.G0 = b7Var;
        if (getWindowToken() != null) {
            ((ong) this.G0).J = this.b;
            int i = this.x0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = gag.a;
                t9g.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.y = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.z) {
            this.z = z2;
            if (!z2) {
                b();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        e();
        omf omf = (omf) this.v;
        omf.d = i != 0 ? iq.D(omf.a.getContext(), i) : null;
        omf.c();
    }

    public void setLogo(int i) {
        e();
        omf omf = (omf) this.v;
        omf.e = i != 0 ? iq.D(omf.a.getContext(), i) : null;
        omf.c();
    }

    public void setOverlayMode(boolean z2) {
        this.x = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        e();
        ((omf) this.v).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        e();
        omf omf = (omf) this.v;
        if (!omf.g) {
            omf.h = charSequence;
            if ((omf.b & 8) != 0) {
                Toolbar toolbar = omf.a;
                toolbar.setTitle(charSequence);
                if (omf.g) {
                    gag.k(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(View view, int i, int i2, int[] iArr, int i3) {
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        e();
        omf omf = (omf) this.v;
        omf.d = drawable;
        omf.c();
    }
}
