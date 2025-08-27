package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;

public class ViewPager extends ViewGroup {
    public static final int[] i1 = {16842931};
    public static final ed7 j1 = new ed7(15);
    public static final vl7 k1 = new vl7(4);
    public int A0;
    public int B0;
    public float C0 = -3.4028235E38f;
    public float D0 = Float.MAX_VALUE;
    public int E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0 = 1;
    public boolean J0;
    public boolean K0;
    public final int L0;
    public int M0;
    public final int N0;
    public float O0;
    public float P0;
    public float Q0;
    public float R0;
    public int S0 = -1;
    public VelocityTracker T0;
    public final int U0;
    public final int V0;
    public final int W0;
    public final int X0;
    public final EdgeEffect Y0;
    public final EdgeEffect Z0;
    public int a;
    public boolean a1 = true;
    public final ArrayList b = new ArrayList();
    public boolean b1;
    public final pbg c = new Object();
    public int c1;
    public ArrayList d1;
    public rbg e1;
    public ArrayList f1;
    public final haf g1 = new haf(10, (Object) this);
    public int h1 = 0;
    public final Rect o = new Rect();
    public q7b v;
    public final Scroller v0;
    public int w;
    public boolean w0;
    public int x = -1;
    public v44 x0;
    public Parcelable y = null;
    public int y0;
    public ClassLoader z = null;
    public Drawable z0;

    /* JADX WARNING: type inference failed for: r4v2, types: [pbg, java.lang.Object] */
    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.v0 = new Scroller(context2, k1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.N0 = viewConfiguration.getScaledPagingTouchSlop();
        this.U0 = (int) (400.0f * f);
        this.V0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Y0 = new EdgeEffect(context2);
        this.Z0 = new EdgeEffect(context2);
        this.W0 = (int) (25.0f * f);
        this.X0 = (int) (2.0f * f);
        this.L0 = (int) (f * 16.0f);
        gag.j(this, new el0(7, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        v9g.u(this, new nbg(this));
    }

    public static boolean d(int i, int i2, int i3, View view, boolean z2) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && d(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.G0 != z2) {
            this.G0 = z2;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [pbg, java.lang.Object] */
    public final pbg a(int i, int i2) {
        ? obj = new Object();
        obj.b = i;
        obj.a = this.v.f(this, i);
        this.v.getClass();
        obj.d = 1.0f;
        ArrayList arrayList = this.b;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(obj);
        } else {
            arrayList.add(i2, obj);
        }
        return obj;
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        pbg i3;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (i3 = i(childAt)) != null && i3.b == this.w) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public final void addTouchables(ArrayList arrayList) {
        pbg i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (i = i(childAt)) != null && i.b == this.w) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        qbg qbg = (qbg) layoutParams;
        boolean z2 = qbg.a | (view.getClass().getAnnotation(obg.class) != null);
        qbg.a = z2;
        if (!this.F0) {
            super.addView(view, i, layoutParams);
        } else if (!z2) {
            qbg.d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public final void b(rbg rbg) {
        if (this.d1 == null) {
            this.d1 = new ArrayList();
        }
        this.d1.add(rbg);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 0
            if (r0 != r7) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x002b
        L_0x0009:
            if (r0 == 0) goto L_0x002b
            android.view.ViewParent r2 = r0.getParent()
        L_0x000f:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x001b
            if (r2 != r7) goto L_0x0016
            goto L_0x002b
        L_0x0016:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x000f
        L_0x001b:
            android.view.ViewParent r0 = r0.getParent()
        L_0x001f:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0007
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x001f
        L_0x002b:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            r2 = 1
            r3 = 0
            r4 = 66
            r5 = 17
            if (r1 == 0) goto L_0x007e
            if (r1 == r0) goto L_0x007e
            android.graphics.Rect r6 = r7.o
            if (r8 != r5) goto L_0x0062
            android.graphics.Rect r4 = r7.h(r6, r1)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.h(r6, r0)
            int r5 = r5.left
            if (r0 == 0) goto L_0x005c
            if (r4 < r5) goto L_0x005c
            int r0 = r7.w
            if (r0 <= 0) goto L_0x0098
            int r0 = r0 - r2
            r7.H0 = r3
            r7.v(r0, r3, r2, r3)
            goto L_0x0099
        L_0x005c:
            boolean r0 = r1.requestFocus()
        L_0x0060:
            r3 = r0
            goto L_0x009a
        L_0x0062:
            if (r8 != r4) goto L_0x009a
            android.graphics.Rect r2 = r7.h(r6, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.h(r6, r0)
            int r3 = r3.left
            if (r0 == 0) goto L_0x0079
            if (r2 > r3) goto L_0x0079
            boolean r0 = r7.n()
            goto L_0x0060
        L_0x0079:
            boolean r0 = r1.requestFocus()
            goto L_0x0060
        L_0x007e:
            if (r8 == r5) goto L_0x008d
            if (r8 != r2) goto L_0x0083
            goto L_0x008d
        L_0x0083:
            if (r8 == r4) goto L_0x0088
            r0 = 2
            if (r8 != r0) goto L_0x009a
        L_0x0088:
            boolean r3 = r7.n()
            goto L_0x009a
        L_0x008d:
            int r0 = r7.w
            if (r0 <= 0) goto L_0x0098
            int r0 = r0 - r2
            r7.H0 = r3
            r7.v(r0, r3, r2, r3)
            goto L_0x0099
        L_0x0098:
            r2 = r3
        L_0x0099:
            r3 = r2
        L_0x009a:
            if (r3 == 0) goto L_0x00a3
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        L_0x00a3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    public final boolean canScrollHorizontally(int i) {
        if (this.v == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.C0)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.D0));
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof qbg) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        this.w0 = true;
        Scroller scroller = this.v0;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!o(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = gag.a;
        postInvalidateOnAnimation();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L_0x0066
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0061
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0048
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x0061
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r5 = r5.c(r4)
            goto L_0x0062
        L_0x002b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L_0x0061
            boolean r5 = r5.c(r1)
            goto L_0x0062
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0041
            boolean r5 = r5.n()
            goto L_0x0062
        L_0x0041:
            r6 = 66
            boolean r5 = r5.c(r6)
            goto L_0x0062
        L_0x0048:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x005a
            int r6 = r5.w
            if (r6 <= 0) goto L_0x0061
            int r6 = r6 - r1
            r5.H0 = r2
            r5.v(r6, r2, r1, r2)
            r5 = r1
            goto L_0x0062
        L_0x005a:
            r6 = 17
            boolean r5 = r5.c(r6)
            goto L_0x0062
        L_0x0061:
            r5 = r2
        L_0x0062:
            if (r5 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        pbg i;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (i = i(childAt)) != null && i.b == this.w && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        q7b q7b;
        EdgeEffect edgeEffect = this.Z0;
        EdgeEffect edgeEffect2 = this.Y0;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (q7b = this.v) != null && q7b.c() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) (getPaddingTop() + (-height)), this.C0 * ((float) width));
                edgeEffect2.setSize(height, width);
                z2 = edgeEffect2.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!edgeEffect.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.D0 + 1.0f)) * ((float) width2));
                edgeEffect.setSize(height2, width2);
                z2 |= edgeEffect.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (z2) {
            WeakHashMap weakHashMap = gag.a;
            postInvalidateOnAnimation();
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.z0;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e(boolean z2) {
        Scroller scroller = this.v0;
        boolean z3 = this.h1 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.H0 = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            pbg pbg = (pbg) arrayList.get(i);
            if (pbg.c) {
                pbg.c = false;
                z3 = true;
            }
            i++;
        }
        if (z3) {
            haf haf = this.g1;
            if (z2) {
                WeakHashMap weakHashMap = gag.a;
                postOnAnimation(haf);
                return;
            }
            haf.run();
        }
    }

    public final void f() {
        int c2 = this.v.c();
        this.a = c2;
        ArrayList arrayList = this.b;
        boolean z2 = arrayList.size() < (this.I0 * 2) + 1 && arrayList.size() < c2;
        int i = this.w;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < arrayList.size()) {
            pbg pbg = (pbg) arrayList.get(i2);
            int d = this.v.d(pbg.a);
            if (d != -1) {
                if (d == -2) {
                    arrayList.remove(i2);
                    i2--;
                    if (!z3) {
                        this.v.l(this);
                        z3 = true;
                    }
                    this.v.a(this, pbg.b, pbg.a);
                    int i3 = this.w;
                    if (i3 == pbg.b) {
                        i = Math.max(0, Math.min(i3, c2 - 1));
                    }
                } else {
                    int i4 = pbg.b;
                    if (i4 != d) {
                        if (i4 == this.w) {
                            i = d;
                        }
                        pbg.b = d;
                    }
                }
                z2 = true;
            }
            i2++;
        }
        if (z3) {
            this.v.b();
        }
        Collections.sort(arrayList, j1);
        if (z2) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                qbg qbg = (qbg) getChildAt(i5).getLayoutParams();
                if (!qbg.a) {
                    qbg.c = c44.DEFAULT_ASPECT_RATIO;
                }
            }
            v(i, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i) {
        rbg rbg = this.e1;
        if (rbg != null) {
            rbg.m(i);
        }
        ArrayList arrayList = this.d1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                rbg rbg2 = (rbg) this.d1.get(i2);
                if (rbg2 != null) {
                    rbg2.m(i);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.ViewGroup$LayoutParams, qbg] */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.c = c44.DEFAULT_ASPECT_RATIO;
        return layoutParams;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public q7b getAdapter() {
        return this.v;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return this.w;
    }

    public int getOffscreenPageLimit() {
        return this.I0;
    }

    public int getPageMargin() {
        return this.y0;
    }

    public final Rect h(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final pbg i(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return null;
            }
            pbg pbg = (pbg) arrayList.get(i);
            if (this.v.g(view, pbg.a)) {
                return pbg;
            }
            i++;
        }
    }

    public final pbg j() {
        pbg pbg;
        int i;
        int clientWidth = getClientWidth();
        float f = c44.DEFAULT_ASPECT_RATIO;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.y0) / ((float) clientWidth) : 0.0f;
        int i2 = 0;
        boolean z2 = true;
        pbg pbg2 = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return pbg2;
            }
            pbg pbg3 = (pbg) arrayList.get(i2);
            if (z2 || pbg3.b == (i = i3 + 1)) {
                pbg = pbg3;
            } else {
                pbg pbg4 = this.c;
                pbg4.e = f + f3 + f2;
                pbg4.b = i;
                this.v.getClass();
                pbg4.d = 1.0f;
                i2--;
                pbg = pbg4;
            }
            f = pbg.e;
            float f4 = pbg.d + f + f2;
            if (!z2 && scrollX < f) {
                return pbg2;
            }
            if (scrollX < f4 || i2 == arrayList.size() - 1) {
                return pbg;
            }
            int i4 = pbg.b;
            float f5 = pbg.d;
            i2++;
            z2 = false;
            pbg pbg5 = pbg;
            i3 = i4;
            f3 = f5;
            pbg2 = pbg5;
        }
        return pbg;
    }

    public final pbg k(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            pbg pbg = (pbg) arrayList.get(i2);
            if (pbg.b == i) {
                return pbg;
            }
            i2++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.c1
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L_0x006c
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L_0x001b:
            if (r6 >= r5) goto L_0x006c
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            qbg r8 = (defpackage.qbg) r8
            boolean r9 = r8.a
            if (r9 != 0) goto L_0x002c
            goto L_0x0069
        L_0x002c:
            int r8 = r8.b
            r8 = r8 & 7
            if (r8 == r1) goto L_0x0050
            r9 = 3
            if (r8 == r9) goto L_0x004a
            r9 = 5
            if (r8 == r9) goto L_0x003a
            r8 = r2
            goto L_0x005d
        L_0x003a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L_0x0046:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L_0x005d
        L_0x004a:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L_0x005d
        L_0x0050:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L_0x0046
        L_0x005d:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L_0x0068
            r7.offsetLeftAndRight(r2)
        L_0x0068:
            r2 = r8
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x006c:
            rbg r14 = r11.e1
            if (r14 == 0) goto L_0x0073
            r14.f(r13, r12)
        L_0x0073:
            java.util.ArrayList r14 = r11.d1
            if (r14 == 0) goto L_0x008d
            int r14 = r14.size()
        L_0x007b:
            if (r0 >= r14) goto L_0x008d
            java.util.ArrayList r2 = r11.d1
            java.lang.Object r2 = r2.get(r0)
            rbg r2 = (defpackage.rbg) r2
            if (r2 == 0) goto L_0x008a
            r2.f(r13, r12)
        L_0x008a:
            int r0 = r0 + 1
            goto L_0x007b
        L_0x008d:
            r11.b1 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.l(int, float, int):void");
    }

    public final void m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.S0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.O0 = motionEvent.getX(i);
            this.S0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.T0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean n() {
        q7b q7b = this.v;
        if (q7b == null || this.w >= q7b.c() - 1) {
            return false;
        }
        this.H0 = false;
        v(this.w + 1, 0, true, false);
        return true;
    }

    public final boolean o(int i) {
        if (this.b.size() != 0) {
            pbg j = j();
            int clientWidth = getClientWidth();
            int i2 = this.y0;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = j.b;
            float f2 = ((((float) i) / f) - j.e) / (j.d + (((float) i2) / f));
            this.b1 = false;
            l(i4, f2, (int) (((float) i3) * f2));
            if (this.b1) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.a1) {
            return false;
        } else {
            this.b1 = false;
            l(0, c44.DEFAULT_ASPECT_RATIO, 0);
            if (this.b1) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a1 = true;
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.g1);
        Scroller scroller = this.v0;
        if (scroller != null && !scroller.isFinished()) {
            this.v0.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r18
            super.onDraw(r19)
            int r1 = r0.y0
            if (r1 <= 0) goto L_0x00a8
            android.graphics.drawable.Drawable r1 = r0.z0
            if (r1 == 0) goto L_0x00a8
            java.util.ArrayList r1 = r0.b
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x00a8
            q7b r2 = r0.v
            if (r2 == 0) goto L_0x00a8
            int r2 = r18.getScrollX()
            int r3 = r18.getWidth()
            int r4 = r0.y0
            float r4 = (float) r4
            float r5 = (float) r3
            float r4 = r4 / r5
            r6 = 0
            java.lang.Object r7 = r1.get(r6)
            pbg r7 = (defpackage.pbg) r7
            float r8 = r7.e
            int r9 = r1.size()
            int r10 = r7.b
            int r11 = r9 + -1
            java.lang.Object r11 = r1.get(r11)
            pbg r11 = (defpackage.pbg) r11
            int r11 = r11.b
        L_0x003f:
            if (r10 >= r11) goto L_0x00a8
        L_0x0041:
            int r12 = r7.b
            if (r10 <= r12) goto L_0x0050
            if (r6 >= r9) goto L_0x0050
            int r6 = r6 + 1
            java.lang.Object r7 = r1.get(r6)
            pbg r7 = (defpackage.pbg) r7
            goto L_0x0041
        L_0x0050:
            if (r10 != r12) goto L_0x005c
            float r8 = r7.e
            float r12 = r7.d
            float r13 = r8 + r12
            float r13 = r13 * r5
            float r8 = r8 + r12
            float r8 = r8 + r4
            goto L_0x0069
        L_0x005c:
            q7b r12 = r0.v
            r12.getClass()
            r12 = 1065353216(0x3f800000, float:1.0)
            float r13 = r8 + r12
            float r13 = r13 * r5
            float r12 = r12 + r4
            float r12 = r12 + r8
            r8 = r12
        L_0x0069:
            int r12 = r0.y0
            float r12 = (float) r12
            float r12 = r12 + r13
            float r14 = (float) r2
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x0093
            android.graphics.drawable.Drawable r12 = r0.z0
            int r14 = java.lang.Math.round(r13)
            int r15 = r0.A0
            r16 = r1
            int r1 = r0.y0
            float r1 = (float) r1
            float r1 = r1 + r13
            int r1 = java.lang.Math.round(r1)
            r17 = r4
            int r4 = r0.B0
            r12.setBounds(r14, r15, r1, r4)
            android.graphics.drawable.Drawable r1 = r0.z0
            r4 = r19
            r1.draw(r4)
            goto L_0x0099
        L_0x0093:
            r16 = r1
            r17 = r4
            r4 = r19
        L_0x0099:
            int r1 = r2 + r3
            float r1 = (float) r1
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a1
            goto L_0x00a8
        L_0x00a1:
            int r10 = r10 + 1
            r1 = r16
            r4 = r17
            goto L_0x003f
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.N0;
        Scroller scroller = this.v0;
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 3 || action == 1) {
            t();
            return false;
        }
        if (action != 0) {
            if (this.J0) {
                return true;
            }
            if (this.K0) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.Q0 = x2;
            this.O0 = x2;
            float y2 = motionEvent.getY();
            this.R0 = y2;
            this.P0 = y2;
            this.S0 = motionEvent.getPointerId(0);
            this.K0 = false;
            this.w0 = true;
            scroller.computeScrollOffset();
            if (this.h1 != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.X0) {
                e(false);
                this.J0 = false;
            } else {
                scroller.abortAnimation();
                this.H0 = false;
                q();
                this.J0 = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.S0;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x3 = motionEvent.getX(findPointerIndex);
                float f = x3 - this.O0;
                float abs = Math.abs(f);
                float y3 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.R0);
                int i3 = (f > c44.DEFAULT_ASPECT_RATIO ? 1 : (f == c44.DEFAULT_ASPECT_RATIO ? 0 : -1));
                if (i3 != 0) {
                    float f2 = this.O0;
                    if ((f2 >= ((float) this.M0) || i3 <= 0) && ((f2 <= ((float) (getWidth() - this.M0)) || f >= c44.DEFAULT_ASPECT_RATIO) && d((int) f, (int) x3, (int) y3, this, false))) {
                        this.O0 = x3;
                        this.P0 = y3;
                        this.K0 = true;
                        return false;
                    }
                }
                float f3 = (float) i;
                if (abs > f3 && abs * 0.5f > abs2) {
                    this.J0 = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.Q0;
                    float f5 = (float) i;
                    this.O0 = i3 > 0 ? f4 + f5 : f4 - f5;
                    this.P0 = y3;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f3) {
                    this.K0 = true;
                }
                if (this.J0 && p(x3)) {
                    WeakHashMap weakHashMap = gag.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m(motionEvent);
        }
        if (this.T0 == null) {
            this.T0 = VelocityTracker.obtain();
        }
        this.T0.addMovement(motionEvent);
        return this.J0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b8
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b4
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            qbg r12 = (defpackage.qbg) r12
            boolean r14 = r12.a
            if (r14 == 0) goto L_0x00b4
            int r12 = r12.b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x0061
            r15 = 3
            if (r14 == r15) goto L_0x005b
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006e
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
        L_0x0055:
            r17 = r14
            r14 = r4
            r4 = r17
            goto L_0x006e
        L_0x005b:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006e
        L_0x0061:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
            goto L_0x0055
        L_0x006e:
            r15 = 16
            if (r12 == r15) goto L_0x0094
            r15 = 48
            if (r12 == r15) goto L_0x008e
            r15 = 80
            if (r12 == r15) goto L_0x007c
            r12 = r5
            goto L_0x00a1
        L_0x007c:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
        L_0x0088:
            r17 = r12
            r12 = r5
            r5 = r17
            goto L_0x00a1
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x00a1
        L_0x0094:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
            goto L_0x0088
        L_0x00a1:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r16 + r5
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b4:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b8:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00bb:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            qbg r9 = (defpackage.qbg) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L_0x0105
            pbg r10 = r0.i(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.d = r14
            float r9 = r9.c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00bb
        L_0x0108:
            r0.A0 = r5
            int r3 = r3 - r7
            r0.B0 = r3
            r0.c1 = r11
            boolean r1 = r0.a1
            if (r1 == 0) goto L_0x011a
            int r1 = r0.w
            r2 = 0
            r0.u(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.a1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i, int i2) {
        qbg qbg;
        qbg qbg2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.M0 = Math.min(measuredWidth / 10, this.L0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (!(childAt.getVisibility() == 8 || (qbg2 = (qbg) childAt.getLayoutParams()) == null || !qbg2.a)) {
                int i6 = qbg2.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z3 = i8 == 48 || i8 == 80;
                if (!(i7 == 3 || i7 == 5)) {
                    z2 = false;
                }
                int i9 = IntCompanionObject.MIN_VALUE;
                if (z3) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = qbg2.width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = qbg2.height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.E0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.F0 = true;
        q();
        this.F0 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((qbg = (qbg) childAt2.getLayoutParams()) == null || !qbg.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * qbg.c), 1073741824), this.E0);
            }
        }
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        pbg i5;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i4 = 0;
            i2 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
            i2 = -1;
        }
        while (i4 != i3) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (i5 = i(childAt)) != null && i5.b == this.w && childAt.requestFocus(i, rect)) {
                return true;
            }
            i4 += i2;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sbg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sbg sbg = (sbg) parcelable;
        super.onRestoreInstanceState(sbg.a);
        q7b q7b = this.v;
        ClassLoader classLoader = sbg.v;
        if (q7b != null) {
            q7b.i(sbg.o, classLoader);
            v(sbg.c, 0, false, true);
            return;
        }
        this.x = sbg.c;
        this.y = sbg.o;
        this.z = classLoader;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, sbg, z] */
    public final Parcelable onSaveInstanceState() {
        ? zVar = new z(super.onSaveInstanceState());
        zVar.c = this.w;
        q7b q7b = this.v;
        if (q7b != null) {
            zVar.o = q7b.j();
        }
        return zVar;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.y0;
            s(i, i3, i5, i5);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        q7b q7b;
        int i = this.N0;
        boolean z2 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (q7b = this.v) == null || q7b.c() == 0) {
            return false;
        }
        if (this.T0 == null) {
            this.T0 = VelocityTracker.obtain();
        }
        this.T0.addMovement(motionEvent);
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            this.v0.abortAnimation();
            this.H0 = false;
            q();
            float x2 = motionEvent.getX();
            this.Q0 = x2;
            this.O0 = x2;
            float y2 = motionEvent.getY();
            this.R0 = y2;
            this.P0 = y2;
            this.S0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.J0) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.S0);
                    if (findPointerIndex == -1) {
                        z2 = t();
                    } else {
                        float x3 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x3 - this.O0);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y3 - this.P0);
                        if (abs > ((float) i) && abs > abs2) {
                            this.J0 = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f = this.Q0;
                            float f2 = (float) i;
                            this.O0 = x3 - f > c44.DEFAULT_ASPECT_RATIO ? f + f2 : f - f2;
                            this.P0 = y3;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.J0) {
                    z2 = p(motionEvent.getX(motionEvent.findPointerIndex(this.S0)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.O0 = motionEvent.getX(actionIndex);
                    this.S0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m(motionEvent);
                    this.O0 = motionEvent.getX(motionEvent.findPointerIndex(this.S0));
                }
            } else if (this.J0) {
                u(this.w, 0, true, false);
                z2 = t();
            }
        } else if (this.J0) {
            VelocityTracker velocityTracker = this.T0;
            velocityTracker.computeCurrentVelocity(1000, (float) this.V0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.S0);
            this.H0 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            pbg j = j();
            float f3 = (float) clientWidth;
            float f4 = ((float) this.y0) / f3;
            int i2 = j.b;
            float f5 = ((((float) scrollX) / f3) - j.e) / (j.d + f4);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.S0)) - this.Q0)) <= this.W0 || Math.abs(xVelocity) <= this.U0) {
                i2 += (int) (f5 + (i2 >= this.w ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i2++;
            }
            ArrayList arrayList = this.b;
            if (arrayList.size() > 0) {
                i2 = Math.max(((pbg) arrayList.get(0)).b, Math.min(i2, ((pbg) a81.h(1, arrayList)).b));
            }
            v(i2, xVelocity, true, true);
            z2 = t();
        }
        if (z2) {
            WeakHashMap weakHashMap = gag.a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final boolean p(float f) {
        boolean z2;
        boolean z3;
        float f2 = this.O0 - f;
        this.O0 = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.C0 * clientWidth;
        float f4 = this.D0 * clientWidth;
        ArrayList arrayList = this.b;
        boolean z4 = false;
        pbg pbg = (pbg) arrayList.get(0);
        pbg pbg2 = (pbg) a81.h(1, arrayList);
        if (pbg.b != 0) {
            f3 = pbg.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (pbg2.b != this.v.c() - 1) {
            f4 = pbg2.e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f3) {
            if (z2) {
                this.Y0.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z3) {
                this.Z0.onPull(Math.abs(scrollX - f4) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.O0 = (scrollX - ((float) i)) + this.O0;
        scrollTo(i, getScrollY());
        o(i);
        return z4;
    }

    public final void q() {
        r(this.w);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r10 == r11) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.w
            if (r2 == r1) goto L_0x000f
            pbg r2 = r0.k(r2)
            r0.w = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            q7b r1 = r0.v
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            boolean r1 = r0.H0
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0021
            return
        L_0x0021:
            q7b r1 = r0.v
            r1.l(r0)
            int r1 = r0.I0
            int r4 = r0.w
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            q7b r6 = r0.v
            int r6 = r6.c()
            int r7 = r6 + -1
            int r8 = r0.w
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.a
            if (r6 != r7) goto L_0x0317
            r7 = r5
        L_0x0044:
            java.util.ArrayList r8 = r0.b
            int r9 = r8.size()
            if (r7 >= r9) goto L_0x005e
            java.lang.Object r9 = r8.get(r7)
            pbg r9 = (defpackage.pbg) r9
            int r10 = r9.b
            int r11 = r0.w
            if (r10 < r11) goto L_0x005b
            if (r10 != r11) goto L_0x005e
            goto L_0x005f
        L_0x005b:
            int r7 = r7 + 1
            goto L_0x0044
        L_0x005e:
            r9 = 0
        L_0x005f:
            if (r9 != 0) goto L_0x0069
            if (r6 <= 0) goto L_0x0069
            int r9 = r0.w
            pbg r9 = r0.a(r9, r7)
        L_0x0069:
            if (r9 == 0) goto L_0x0291
            int r11 = r7 + -1
            if (r11 < 0) goto L_0x0076
            java.lang.Object r12 = r8.get(r11)
            pbg r12 = (defpackage.pbg) r12
            goto L_0x0077
        L_0x0076:
            r12 = 0
        L_0x0077:
            int r13 = r17.getClientWidth()
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 > 0) goto L_0x0081
            r3 = 0
            goto L_0x008d
        L_0x0081:
            float r15 = r9.d
            float r15 = r14 - r15
            int r3 = r17.getPaddingLeft()
            float r3 = (float) r3
            float r5 = (float) r13
            float r3 = r3 / r5
            float r3 = r3 + r15
        L_0x008d:
            int r5 = r0.w
            int r5 = r5 + -1
            r15 = 0
        L_0x0092:
            if (r5 < 0) goto L_0x00ea
            int r16 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00bf
            if (r5 >= r4) goto L_0x00bf
            if (r12 != 0) goto L_0x009d
            goto L_0x00ea
        L_0x009d:
            int r10 = r12.b
            if (r5 != r10) goto L_0x00e7
            boolean r10 = r12.c
            if (r10 != 0) goto L_0x00e7
            r8.remove(r11)
            q7b r10 = r0.v
            java.lang.Object r12 = r12.a
            r10.a(r0, r5, r12)
            int r11 = r11 + -1
            int r7 = r7 + -1
            if (r11 < 0) goto L_0x00bc
            java.lang.Object r10 = r8.get(r11)
            pbg r10 = (defpackage.pbg) r10
            goto L_0x00bd
        L_0x00bc:
            r10 = 0
        L_0x00bd:
            r12 = r10
            goto L_0x00e7
        L_0x00bf:
            if (r12 == 0) goto L_0x00d3
            int r10 = r12.b
            if (r5 != r10) goto L_0x00d3
            float r10 = r12.d
            float r15 = r15 + r10
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x00bc
            java.lang.Object r10 = r8.get(r11)
            pbg r10 = (defpackage.pbg) r10
            goto L_0x00bd
        L_0x00d3:
            int r10 = r11 + 1
            pbg r10 = r0.a(r5, r10)
            float r10 = r10.d
            float r15 = r15 + r10
            int r7 = r7 + 1
            if (r11 < 0) goto L_0x00bc
            java.lang.Object r10 = r8.get(r11)
            pbg r10 = (defpackage.pbg) r10
            goto L_0x00bd
        L_0x00e7:
            int r5 = r5 + -1
            goto L_0x0092
        L_0x00ea:
            float r3 = r9.d
            int r4 = r7 + 1
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 >= 0) goto L_0x016d
            int r5 = r8.size()
            if (r4 >= r5) goto L_0x00ff
            java.lang.Object r5 = r8.get(r4)
            pbg r5 = (defpackage.pbg) r5
            goto L_0x0100
        L_0x00ff:
            r5 = 0
        L_0x0100:
            if (r13 > 0) goto L_0x0104
            r10 = 0
            goto L_0x010c
        L_0x0104:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r13
            float r10 = r10 / r11
            float r10 = r10 + r14
        L_0x010c:
            int r11 = r0.w
            int r11 = r11 + 1
            r12 = r4
        L_0x0111:
            if (r11 >= r6) goto L_0x016d
            int r13 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x013d
            if (r11 <= r1) goto L_0x013d
            if (r5 != 0) goto L_0x011c
            goto L_0x016d
        L_0x011c:
            int r13 = r5.b
            if (r11 != r13) goto L_0x016a
            boolean r13 = r5.c
            if (r13 != 0) goto L_0x016a
            r8.remove(r12)
            q7b r13 = r0.v
            java.lang.Object r5 = r5.a
            r13.a(r0, r11, r5)
            int r5 = r8.size()
            if (r12 >= r5) goto L_0x013b
            java.lang.Object r5 = r8.get(r12)
            pbg r5 = (defpackage.pbg) r5
            goto L_0x016a
        L_0x013b:
            r5 = 0
            goto L_0x016a
        L_0x013d:
            if (r5 == 0) goto L_0x0155
            int r13 = r5.b
            if (r11 != r13) goto L_0x0155
            float r5 = r5.d
            float r3 = r3 + r5
            int r12 = r12 + 1
            int r5 = r8.size()
            if (r12 >= r5) goto L_0x013b
            java.lang.Object r5 = r8.get(r12)
            pbg r5 = (defpackage.pbg) r5
            goto L_0x016a
        L_0x0155:
            pbg r5 = r0.a(r11, r12)
            int r12 = r12 + 1
            float r5 = r5.d
            float r3 = r3 + r5
            int r5 = r8.size()
            if (r12 >= r5) goto L_0x013b
            java.lang.Object r5 = r8.get(r12)
            pbg r5 = (defpackage.pbg) r5
        L_0x016a:
            int r11 = r11 + 1
            goto L_0x0111
        L_0x016d:
            q7b r1 = r0.v
            int r1 = r1.c()
            int r3 = r17.getClientWidth()
            if (r3 <= 0) goto L_0x017f
            int r5 = r0.y0
            float r5 = (float) r5
            float r3 = (float) r3
            float r5 = r5 / r3
            goto L_0x0180
        L_0x017f:
            r5 = 0
        L_0x0180:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x020f
            int r6 = r2.b
            int r10 = r9.b
            if (r6 >= r10) goto L_0x01d0
            float r10 = r2.e
            float r2 = r2.d
            float r10 = r10 + r2
            float r10 = r10 + r5
            int r6 = r6 + 1
            r2 = 0
        L_0x0193:
            int r11 = r9.b
            if (r6 > r11) goto L_0x020f
            int r11 = r8.size()
            if (r2 >= r11) goto L_0x020f
            java.lang.Object r11 = r8.get(r2)
            pbg r11 = (defpackage.pbg) r11
        L_0x01a3:
            int r12 = r11.b
            if (r6 <= r12) goto L_0x01b8
            int r12 = r8.size()
            int r12 = r12 + -1
            if (r2 >= r12) goto L_0x01b8
            int r2 = r2 + 1
            java.lang.Object r11 = r8.get(r2)
            pbg r11 = (defpackage.pbg) r11
            goto L_0x01a3
        L_0x01b8:
            int r12 = r11.b
            if (r6 >= r12) goto L_0x01c7
            q7b r12 = r0.v
            r12.getClass()
            float r12 = r3 + r5
            float r10 = r10 + r12
            int r6 = r6 + 1
            goto L_0x01b8
        L_0x01c7:
            r11.e = r10
            float r11 = r11.d
            float r11 = r11 + r5
            float r10 = r10 + r11
            int r6 = r6 + 1
            goto L_0x0193
        L_0x01d0:
            if (r6 <= r10) goto L_0x020f
            int r10 = r8.size()
            int r10 = r10 + -1
            float r2 = r2.e
            int r6 = r6 + -1
        L_0x01dc:
            int r11 = r9.b
            if (r6 < r11) goto L_0x020f
            if (r10 < 0) goto L_0x020f
            java.lang.Object r11 = r8.get(r10)
            pbg r11 = (defpackage.pbg) r11
        L_0x01e8:
            int r12 = r11.b
            if (r6 >= r12) goto L_0x01f7
            if (r10 <= 0) goto L_0x01f7
            int r10 = r10 + -1
            java.lang.Object r11 = r8.get(r10)
            pbg r11 = (defpackage.pbg) r11
            goto L_0x01e8
        L_0x01f7:
            int r12 = r11.b
            if (r6 <= r12) goto L_0x0206
            q7b r12 = r0.v
            r12.getClass()
            float r12 = r3 + r5
            float r2 = r2 - r12
            int r6 = r6 + -1
            goto L_0x01f7
        L_0x0206:
            float r12 = r11.d
            float r12 = r12 + r5
            float r2 = r2 - r12
            r11.e = r2
            int r6 = r6 + -1
            goto L_0x01dc
        L_0x020f:
            int r2 = r8.size()
            float r6 = r9.e
            int r10 = r9.b
            int r11 = r10 + -1
            if (r10 != 0) goto L_0x021d
            r12 = r6
            goto L_0x0220
        L_0x021d:
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0220:
            r0.C0 = r12
            int r1 = r1 + -1
            if (r10 != r1) goto L_0x022b
            float r10 = r9.d
            float r10 = r10 + r6
            float r10 = r10 - r3
            goto L_0x022e
        L_0x022b:
            r10 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x022e:
            r0.D0 = r10
            int r7 = r7 + -1
        L_0x0232:
            if (r7 < 0) goto L_0x0258
            java.lang.Object r10 = r8.get(r7)
            pbg r10 = (defpackage.pbg) r10
        L_0x023a:
            int r12 = r10.b
            if (r11 <= r12) goto L_0x0249
            q7b r12 = r0.v
            int r11 = r11 + -1
            r12.getClass()
            float r12 = r3 + r5
            float r6 = r6 - r12
            goto L_0x023a
        L_0x0249:
            float r13 = r10.d
            float r13 = r13 + r5
            float r6 = r6 - r13
            r10.e = r6
            if (r12 != 0) goto L_0x0253
            r0.C0 = r6
        L_0x0253:
            int r7 = r7 + -1
            int r11 = r11 + -1
            goto L_0x0232
        L_0x0258:
            float r6 = r9.e
            float r7 = r9.d
            float r6 = r6 + r7
            float r6 = r6 + r5
            int r7 = r9.b
        L_0x0260:
            int r7 = r7 + 1
            if (r4 >= r2) goto L_0x028a
            java.lang.Object r10 = r8.get(r4)
            pbg r10 = (defpackage.pbg) r10
        L_0x026a:
            int r11 = r10.b
            if (r7 >= r11) goto L_0x0279
            q7b r11 = r0.v
            int r7 = r7 + 1
            r11.getClass()
            float r11 = r3 + r5
            float r6 = r6 + r11
            goto L_0x026a
        L_0x0279:
            if (r11 != r1) goto L_0x0281
            float r11 = r10.d
            float r11 = r11 + r6
            float r11 = r11 - r3
            r0.D0 = r11
        L_0x0281:
            r10.e = r6
            float r10 = r10.d
            float r10 = r10 + r5
            float r6 = r6 + r10
            int r4 = r4 + 1
            goto L_0x0260
        L_0x028a:
            q7b r1 = r0.v
            java.lang.Object r2 = r9.a
            r1.k(r2)
        L_0x0291:
            q7b r1 = r0.v
            r1.b()
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x029b:
            if (r2 >= r1) goto L_0x02c9
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            qbg r4 = (defpackage.qbg) r4
            r4.getClass()
            boolean r5 = r4.a
            if (r5 != 0) goto L_0x02c5
            float r5 = r4.c
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x02c6
            pbg r3 = r0.i(r3)
            if (r3 == 0) goto L_0x02c6
            float r5 = r3.d
            r4.c = r5
            int r3 = r3.b
            r4.getClass()
            goto L_0x02c6
        L_0x02c5:
            r6 = 0
        L_0x02c6:
            int r2 = r2 + 1
            goto L_0x029b
        L_0x02c9:
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0316
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x02eb
        L_0x02d5:
            android.view.ViewParent r2 = r1.getParent()
            if (r2 == r0) goto L_0x02e6
            if (r2 == 0) goto L_0x02eb
            boolean r1 = r2 instanceof android.view.View
            if (r1 != 0) goto L_0x02e2
            goto L_0x02eb
        L_0x02e2:
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            goto L_0x02d5
        L_0x02e6:
            pbg r3 = r0.i(r1)
            goto L_0x02ec
        L_0x02eb:
            r3 = 0
        L_0x02ec:
            if (r3 == 0) goto L_0x02f4
            int r1 = r3.b
            int r2 = r0.w
            if (r1 == r2) goto L_0x0316
        L_0x02f4:
            r5 = 0
        L_0x02f5:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x0316
            android.view.View r1 = r0.getChildAt(r5)
            pbg r2 = r0.i(r1)
            if (r2 == 0) goto L_0x0313
            int r2 = r2.b
            int r3 = r0.w
            if (r2 != r3) goto L_0x0313
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x0313
            goto L_0x0316
        L_0x0313:
            int r5 = r5 + 1
            goto L_0x02f5
        L_0x0316:
            return
        L_0x0317:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x0324 }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x0324 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0324 }
            goto L_0x032c
        L_0x0324:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x032c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.<init>(r4)
            int r4 = r0.a
            java.lang.String r5 = ", found: "
            java.lang.String r7 = " Pager id: "
            defpackage.g63.o(r3, r4, r5, r6, r7)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            q7b r0 = r0.v
            java.lang.Class r0 = r0.getClass()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.r(int):void");
    }

    public final void removeView(View view) {
        if (this.F0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.b.isEmpty()) {
            pbg k = k(this.w);
            int min = (int) ((k != null ? Math.min(k.e, this.D0) : c44.DEFAULT_ASPECT_RATIO) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                e(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.v0.isFinished()) {
            this.v0.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    public void setAdapter(q7b q7b) {
        ArrayList arrayList;
        q7b q7b2 = this.v;
        if (q7b2 != null) {
            synchronized (q7b2) {
                q7b2.b = null;
            }
            this.v.l(this);
            int i = 0;
            while (true) {
                arrayList = this.b;
                if (i >= arrayList.size()) {
                    break;
                }
                pbg pbg = (pbg) arrayList.get(i);
                this.v.a(this, pbg.b, pbg.a);
                i++;
            }
            this.v.b();
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((qbg) getChildAt(i2).getLayoutParams()).a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.w = 0;
            scrollTo(0, 0);
        }
        this.v = q7b;
        this.a = 0;
        if (q7b != null) {
            if (this.x0 == null) {
                this.x0 = new v44(3, this);
            }
            q7b q7b3 = this.v;
            v44 v44 = this.x0;
            synchronized (q7b3) {
                q7b3.b = v44;
            }
            this.H0 = false;
            boolean z2 = this.a1;
            this.a1 = true;
            this.a = this.v.c();
            if (this.x >= 0) {
                this.v.i(this.y, this.z);
                v(this.x, 0, false, true);
                this.x = -1;
                this.y = null;
                this.z = null;
            } else if (!z2) {
                q();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList2 = this.f1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = this.f1.size();
            for (int i3 = 0; i3 < size; i3++) {
                j8f j8f = (j8f) this.f1.get(i3);
                TabLayout tabLayout = j8f.b;
                if (tabLayout.a1 == this) {
                    tabLayout.n(q7b, j8f.a);
                }
            }
        }
    }

    public void setCurrentItem(int i) {
        this.H0 = false;
        v(i, 0, !this.a1, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.I0) {
            this.I0 = i;
            q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(rbg rbg) {
        this.e1 = rbg;
    }

    public void setPageMargin(int i) {
        int i2 = this.y0;
        this.y0 = i;
        int width = getWidth();
        s(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.z0 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.h1 != i) {
            this.h1 = i;
            rbg rbg = this.e1;
            if (rbg != null) {
                rbg.l(i);
            }
            ArrayList arrayList = this.d1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    rbg rbg2 = (rbg) this.d1.get(i2);
                    if (rbg2 != null) {
                        rbg2.l(i);
                    }
                }
            }
        }
    }

    public final boolean t() {
        this.S0 = -1;
        this.J0 = false;
        this.K0 = false;
        VelocityTracker velocityTracker = this.T0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.T0 = null;
        }
        this.Y0.onRelease();
        this.Z0.onRelease();
        return this.Y0.isFinished() || this.Z0.isFinished();
    }

    public final void u(int i, int i2, boolean z2, boolean z3) {
        int scrollX;
        int i3;
        Scroller scroller = this.v0;
        pbg k = k(i);
        int max = k != null ? (int) (Math.max(this.C0, Math.min(k.e, this.D0)) * ((float) getClientWidth())) : 0;
        if (z2) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                if (scroller == null || scroller.isFinished()) {
                    scrollX = getScrollX();
                } else {
                    scrollX = this.w0 ? scroller.getCurrX() : scroller.getStartX();
                    scroller.abortAnimation();
                    setScrollingCacheEnabled(false);
                }
                int i4 = scrollX;
                int scrollY = getScrollY();
                int i5 = max - i4;
                int i6 = 0 - scrollY;
                if (i5 == 0 && i6 == 0) {
                    e(false);
                    q();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i7 = clientWidth / 2;
                    float f = (float) clientWidth;
                    float f2 = (float) i7;
                    float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2) + f2;
                    int abs = Math.abs(i2);
                    if (abs > 0) {
                        i3 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                    } else {
                        this.v.getClass();
                        i3 = (int) (((((float) Math.abs(i5)) / ((f * 1.0f) + ((float) this.y0))) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(i3, 600);
                    this.w0 = false;
                    this.v0.startScroll(i4, scrollY, i5, i6, min);
                    WeakHashMap weakHashMap = gag.a;
                    postInvalidateOnAnimation();
                }
            }
            if (z3) {
                g(i);
                return;
            }
            return;
        }
        if (z3) {
            g(i);
        }
        e(false);
        scrollTo(max, 0);
        o(max);
    }

    public final void v(int i, int i2, boolean z2, boolean z3) {
        q7b q7b = this.v;
        boolean z4 = false;
        if (q7b == null || q7b.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.b;
        if (z3 || this.w != i || arrayList.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.v.c()) {
                i = this.v.c() - 1;
            }
            int i3 = this.I0;
            int i4 = this.w;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((pbg) arrayList.get(i5)).c = true;
                }
            }
            if (this.w != i) {
                z4 = true;
            }
            if (this.a1) {
                this.w = i;
                if (z4) {
                    g(i);
                }
                requestLayout();
                return;
            }
            r(i);
            u(i, i2, z2, z4);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.z0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, qbg] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.c = c44.DEFAULT_ASPECT_RATIO;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1);
        layoutParams.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(ew3.b(getContext(), i));
    }
}
