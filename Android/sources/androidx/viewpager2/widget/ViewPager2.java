package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;

public final class ViewPager2 extends ViewGroup {
    public o7b A0;
    public yyc B0 = null;
    public boolean C0 = false;
    public boolean D0 = true;
    public int E0 = -1;
    public srd F0;
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final gi0 c = new gi0();
    public int o;
    public boolean v = false;
    public acg v0;
    public final tbg w = new tbg(0, this);
    public zbg w0;
    public wbg x;
    public bid x0;
    public int y = -1;
    public gi0 y0;
    public Parcelable z;
    public e4 z0;

    public ViewPager2(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r2v0, types: [srd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v2, types: [java.lang.Object, czc] */
    public final void a(Context context, AttributeSet attributeSet) {
        ? obj = new Object();
        obj.o = this;
        obj.a = new syc(11, obj);
        obj.b = new yu9(14, (Object) obj);
        this.F0 = obj;
        acg acg = new acg(this, context);
        this.v0 = acg;
        acg.setId(View.generateViewId());
        this.v0.setDescendantFocusability(131072);
        wbg wbg = new wbg(this);
        this.x = wbg;
        this.v0.setLayoutManager(wbg);
        this.v0.setScrollingTouchSlop(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pnc.ViewPager2);
        int[] iArr = pnc.ViewPager2;
        WeakHashMap weakHashMap = gag.a;
        bag.d(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(pnc.ViewPager2_android_orientation, 0));
            obtainStyledAttributes.recycle();
            this.v0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.v0.k(new Object());
            bid bid = new bid(this);
            this.x0 = bid;
            this.z0 = new e4(17, (Object) bid);
            zbg zbg = new zbg(this);
            this.w0 = zbg;
            zbg.a(this.v0);
            this.v0.m(this.x0);
            gi0 gi0 = new gi0();
            this.y0 = gi0;
            this.x0.a = gi0;
            ubg ubg = new ubg(this, 0);
            ubg ubg2 = new ubg(this, 1);
            ((ArrayList) gi0.b).add(ubg);
            ((ArrayList) this.y0.b).add(ubg2);
            this.F0.M(this.v0);
            gi0 gi02 = this.y0;
            ((ArrayList) gi02.b).add(this.c);
            o7b o7b = new o7b(this.x);
            this.A0 = o7b;
            ((ArrayList) this.y0.b).add(o7b);
            acg acg2 = this.v0;
            attachViewToParent(acg2, 0, acg2.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(xbg xbg) {
        ((ArrayList) this.c.b).add(xbg);
    }

    public final void c() {
        if (this.A0.b != null) {
            bid bid = this.x0;
            bid.e();
            aid aid = bid.g;
            double d = ((double) aid.b) + ((double) aid.a);
            int i = (int) d;
            float f = (float) (d - ((double) i));
            this.A0.b(i, f, Math.round(((float) getPageSize()) * f));
        }
    }

    public final boolean canScrollHorizontally(int i) {
        return this.v0.canScrollHorizontally(i);
    }

    public final boolean canScrollVertically(int i) {
        return this.v0.canScrollVertically(i);
    }

    public final void d() {
        tyc adapter;
        if (this.y != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.z;
            if (parcelable != null) {
                if (adapter instanceof bne) {
                    ((bne) adapter).c(parcelable);
                }
                this.z = null;
            }
            int max = Math.max(0, Math.min(this.y, adapter.j() - 1));
            this.o = max;
            this.y = -1;
            this.v0.z0(max);
            this.F0.P();
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof bcg) {
            int i = ((bcg) parcelable).a;
            sparseArray.put(this.v0.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public final void e(int i, boolean z2) {
        if (!((bid) this.z0.b).m) {
            f(i, z2);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public final void f(int i, boolean z2) {
        xbg xbg;
        tyc adapter = getAdapter();
        boolean z3 = false;
        if (adapter == null) {
            if (this.y != -1) {
                this.y = Math.max(i, 0);
            }
        } else if (adapter.j() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.j() - 1);
            int i2 = this.o;
            if (min != i2 || this.x0.f != 0) {
                if (min != i2 || !z2) {
                    double d = (double) i2;
                    this.o = min;
                    this.F0.P();
                    bid bid = this.x0;
                    if (bid.f != 0) {
                        bid.e();
                        aid aid = bid.g;
                        d = ((double) aid.b) + ((double) aid.a);
                    }
                    bid bid2 = this.x0;
                    bid2.getClass();
                    bid2.e = z2 ? 2 : 3;
                    bid2.m = false;
                    if (bid2.i != min) {
                        z3 = true;
                    }
                    bid2.i = min;
                    bid2.c(2);
                    if (z3 && (xbg = bid2.a) != null) {
                        xbg.c(min);
                    }
                    if (!z2) {
                        this.v0.z0(min);
                        return;
                    }
                    double d2 = (double) min;
                    if (Math.abs(d2 - d) > 3.0d) {
                        this.v0.z0(d2 > d ? min - 3 : min + 3);
                        acg acg = this.v0;
                        acg.post(new tk0(acg, min));
                        return;
                    }
                    this.v0.D0(min);
                }
            }
        }
    }

    public final void g(xbg xbg) {
        ((ArrayList) this.c.b).remove(xbg);
    }

    public CharSequence getAccessibilityClassName() {
        this.F0.getClass();
        this.F0.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public tyc getAdapter() {
        return this.v0.getAdapter();
    }

    public int getCurrentItem() {
        return this.o;
    }

    public int getItemDecorationCount() {
        return this.v0.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.E0;
    }

    public int getOrientation() {
        return this.x.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        acg acg = this.v0;
        if (getOrientation() == 0) {
            height = acg.getWidth() - acg.getPaddingLeft();
            paddingBottom = acg.getPaddingRight();
        } else {
            height = acg.getHeight() - acg.getPaddingTop();
            paddingBottom = acg.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.x0.f;
    }

    public final void h() {
        zbg zbg = this.w0;
        if (zbg != null) {
            View d = zbg.d(this.x);
            if (d != null) {
                this.x.getClass();
                int M = a.M(d);
                if (M != this.o && getScrollState() == 0) {
                    this.y0.c(M);
                }
                this.v = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int j;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.F0.o;
        if (viewPager2.getAdapter() == null) {
            i2 = 0;
            i = 0;
        } else if (viewPager2.getOrientation() == 1) {
            i2 = viewPager2.getAdapter().j();
            i = 1;
        } else {
            i = viewPager2.getAdapter().j();
            i2 = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e4.q(i2, i, 0).b);
        tyc adapter = viewPager2.getAdapter();
        if (adapter != null && (j = adapter.j()) != 0 && viewPager2.D0) {
            if (viewPager2.o > 0) {
                accessibilityNodeInfo.addAction(ConstantsKt.DEFAULT_BUFFER_SIZE);
            }
            if (viewPager2.o < j - 1) {
                accessibilityNodeInfo.addAction(ConstantsKt.DEFAULT_BLOCK_SIZE);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int measuredWidth = this.v0.getMeasuredWidth();
        int measuredHeight = this.v0.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.v0.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.v) {
            h();
        }
    }

    public final void onMeasure(int i, int i2) {
        measureChild(this.v0, i, i2);
        int measuredWidth = this.v0.getMeasuredWidth();
        int measuredHeight = this.v0.getMeasuredHeight();
        int measuredState = this.v0.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof bcg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bcg bcg = (bcg) parcelable;
        super.onRestoreInstanceState(bcg.getSuperState());
        this.y = bcg.b;
        this.z = bcg.c;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, bcg] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.a = this.v0.getId();
        int i = this.y;
        if (i == -1) {
            i = this.o;
        }
        baseSavedState.b = i;
        Parcelable parcelable = this.z;
        if (parcelable != null) {
            baseSavedState.c = parcelable;
        } else {
            tyc adapter = this.v0.getAdapter();
            if (adapter instanceof bne) {
                baseSavedState.c = ((bne) adapter).a();
            }
        }
        return baseSavedState;
    }

    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.F0.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        srd srd = this.F0;
        srd.getClass();
        if (i == 8192 || i == 4096) {
            ViewPager2 viewPager2 = (ViewPager2) srd.o;
            int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
            if (viewPager2.D0) {
                viewPager2.f(currentItem, true);
            }
            return true;
        }
        throw new IllegalStateException();
    }

    public void setAdapter(tyc tyc) {
        tyc adapter = this.v0.getAdapter();
        srd srd = this.F0;
        if (adapter != null) {
            adapter.D((tbg) srd.c);
        } else {
            srd.getClass();
        }
        tbg tbg = this.w;
        if (adapter != null) {
            adapter.D(tbg);
        }
        this.v0.setAdapter(tyc);
        this.o = 0;
        d();
        srd srd2 = this.F0;
        srd2.P();
        if (tyc != null) {
            tyc.A((tbg) srd2.c);
        }
        if (tyc != null) {
            tyc.A(tbg);
        }
    }

    public void setCurrentItem(int i) {
        e(i, true);
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.F0.P();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.E0 = i;
            this.v0.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        this.x.n1(i);
        this.F0.P();
    }

    public void setPageTransformer(ybg ybg) {
        if (ybg != null) {
            if (!this.C0) {
                this.B0 = this.v0.getItemAnimator();
                this.C0 = true;
            }
            this.v0.setItemAnimator((yyc) null);
        } else if (this.C0) {
            this.v0.setItemAnimator(this.B0);
            this.B0 = null;
            this.C0 = false;
        }
        o7b o7b = this.A0;
        if (ybg != o7b.b) {
            o7b.b = ybg;
            c();
        }
    }

    public void setUserInputEnabled(boolean z2) {
        this.D0 = z2;
        this.F0.P();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }
}
