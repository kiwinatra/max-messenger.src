package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.internal.IntCompanionObject;

public class ActionBarContextView extends ViewGroup {
    public TextView A0;
    public TextView B0;
    public final int C0;
    public final int D0;
    public boolean E0;
    public final int F0;
    public final w a;
    public final Context b;
    public ActionMenuView c;
    public w7 o;
    public int v;
    public CharSequence v0;
    public ecg w;
    public View w0;
    public boolean x;
    public View x0;
    public boolean y;
    public View y0;
    public CharSequence z;
    public LinearLayout z0;

    /* JADX WARNING: type inference failed for: r1v0, types: [w, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        r1 = r7.getResourceId(r0, 0);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContextView(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            int r0 = defpackage.hdc.actionModeStyle
            r5.<init>(r6, r7, r0)
            w r1 = new w
            r1.<init>()
            r1.c = r5
            r2 = 0
            r1.b = r2
            r5.a = r1
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            int r3 = defpackage.hdc.actionBarPopupTheme
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r1, r4)
            if (r2 == 0) goto L_0x0031
            int r2 = r1.resourceId
            if (r2 == 0) goto L_0x0031
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            int r1 = r1.resourceId
            r2.<init>(r6, r1)
            r5.b = r2
            goto L_0x0033
        L_0x0031:
            r5.b = r6
        L_0x0033:
            int[] r1 = defpackage.koc.ActionMode
            r2 = 0
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1, r0, r2)
            int r0 = defpackage.koc.ActionMode_background
            boolean r1 = r7.hasValue(r0)
            if (r1 == 0) goto L_0x004d
            int r1 = r7.getResourceId(r0, r2)
            if (r1 == 0) goto L_0x004d
            android.graphics.drawable.Drawable r6 = defpackage.iq.D(r6, r1)
            goto L_0x0051
        L_0x004d:
            android.graphics.drawable.Drawable r6 = r7.getDrawable(r0)
        L_0x0051:
            r5.setBackground(r6)
            int r6 = defpackage.koc.ActionMode_titleTextStyle
            int r6 = r7.getResourceId(r6, r2)
            r5.C0 = r6
            int r6 = defpackage.koc.ActionMode_subtitleTextStyle
            int r6 = r7.getResourceId(r6, r2)
            r5.D0 = r6
            int r6 = defpackage.koc.ActionMode_height
            int r6 = r7.getLayoutDimension(r6, r2)
            r5.v = r6
            int r6 = defpackage.koc.ActionMode_closeItemLayout
            int r0 = defpackage.vjc.abc_action_mode_close_item_material
            int r6 = r7.getResourceId(r6, r0)
            r5.F0 = r6
            r7.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, IntCompanionObject.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(int i, int i2, int i3, View view, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z2) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void c(b8 b8Var) {
        View view = this.w0;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.F0, this, false);
            this.w0 = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.w0);
        }
        View findViewById = this.w0.findViewById(egc.action_mode_close_button);
        this.x0 = findViewById;
        findViewById.setOnClickListener(new wld(1, b8Var));
        m69 c2 = b8Var.c();
        w7 w7Var = this.o;
        if (w7Var != null) {
            w7Var.b();
            t7 t7Var = w7Var.C0;
            if (t7Var != null && t7Var.b()) {
                t7Var.j.dismiss();
            }
        }
        w7 w7Var2 = new w7(getContext());
        this.o = w7Var2;
        w7Var2.Z = true;
        w7Var2.v0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.o, this.b);
        w7 w7Var3 = this.o;
        l79 l79 = w7Var3.y;
        if (l79 == null) {
            l79 l792 = (l79) w7Var3.o.inflate(w7Var3.w, this, false);
            w7Var3.y = l792;
            l792.b(w7Var3.c);
            w7Var3.h();
        }
        l79 l793 = w7Var3.y;
        if (l79 != l793) {
            ((ActionMenuView) l793).setPresenter(w7Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) l793;
        this.c = actionMenuView;
        actionMenuView.setBackground((Drawable) null);
        addView(this.c, layoutParams);
    }

    public final void d() {
        if (this.z0 == null) {
            LayoutInflater.from(getContext()).inflate(vjc.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.z0 = linearLayout;
            this.A0 = (TextView) linearLayout.findViewById(egc.action_bar_title);
            this.B0 = (TextView) this.z0.findViewById(egc.action_bar_subtitle);
            int i = this.C0;
            if (i != 0) {
                this.A0.setTextAppearance(getContext(), i);
            }
            int i2 = this.D0;
            if (i2 != 0) {
                this.B0.setTextAppearance(getContext(), i2);
            }
        }
        this.A0.setText(this.z);
        this.B0.setText(this.v0);
        boolean z2 = !TextUtils.isEmpty(this.z);
        boolean z3 = !TextUtils.isEmpty(this.v0);
        int i3 = 8;
        this.B0.setVisibility(z3 ? 0 : 8);
        LinearLayout linearLayout2 = this.z0;
        if (z2 || z3) {
            i3 = 0;
        }
        linearLayout2.setVisibility(i3);
        if (this.z0.getParent() == null) {
            addView(this.z0);
        }
    }

    public final void e() {
        removeAllViews();
        this.y0 = null;
        this.c = null;
        this.o = null;
        View view = this.x0;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.w != null ? this.a.a : getVisibility();
    }

    public int getContentHeight() {
        return this.v;
    }

    public CharSequence getSubtitle() {
        return this.v0;
    }

    public CharSequence getTitle() {
        return this.z;
    }

    /* renamed from: h */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            ecg ecg = this.w;
            if (ecg != null) {
                ecg.b();
            }
            super.setVisibility(i);
        }
    }

    public final ecg i(int i, long j) {
        ecg ecg = this.w;
        if (ecg != null) {
            ecg.b();
        }
        w wVar = this.a;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(c44.DEFAULT_ASPECT_RATIO);
            }
            ecg a2 = gag.a(this);
            a2.a(1.0f);
            a2.c(j);
            ((ActionBarContextView) wVar.c).w = a2;
            wVar.a = i;
            a2.d(wVar);
            return a2;
        }
        ecg a3 = gag.a(this);
        a3.a(c44.DEFAULT_ASPECT_RATIO);
        a3.c(j);
        ((ActionBarContextView) wVar.c).w = a3;
        wVar.a = i;
        a3.d(wVar);
        return a3;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, koc.ActionBar, hdc.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(koc.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        w7 w7Var = this.o;
        if (w7Var != null) {
            Configuration configuration2 = w7Var.b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            w7Var.y0 = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            m69 m69 = w7Var.c;
            if (m69 != null) {
                m69.p(true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w7 w7Var = this.o;
        if (w7Var != null) {
            w7Var.b();
            t7 t7Var = this.o.C0;
            if (t7Var != null && t7Var.b()) {
                t7Var.j.dismiss();
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.y = false;
        }
        if (!this.y) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.y = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.y = false;
        }
        return true;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.w0;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w0.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int g = g(i7, paddingTop, paddingTop2, this.w0, z3) + i7;
            paddingRight = z3 ? g - i6 : g + i6;
        }
        LinearLayout linearLayout = this.z0;
        if (!(linearLayout == null || this.y0 != null || linearLayout.getVisibility() == 8)) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.z0, z3);
        }
        View view2 = this.y0;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z3);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.v;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, IntCompanionObject.MIN_VALUE);
            View view = this.w0;
            if (view != null) {
                int f = f(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w0.getLayoutParams();
                paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = f(this.c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.z0;
            if (linearLayout != null && this.y0 == null) {
                if (this.E0) {
                    this.z0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.z0.getMeasuredWidth();
                    boolean z2 = measuredWidth <= paddingLeft;
                    if (z2) {
                        paddingLeft -= measuredWidth;
                    }
                    this.z0.setVisibility(z2 ? 0 : 8);
                } else {
                    paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.y0;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.y0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.v <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.x = false;
        }
        if (!this.x) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.x = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.x = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.v = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.y0;
        if (view2 != null) {
            removeView(view2);
        }
        this.y0 = view;
        if (!(view == null || (linearLayout = this.z0) == null)) {
            removeView(linearLayout);
            this.z0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.v0 = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.z = charSequence;
        d();
        gag.k(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.E0) {
            requestLayout();
        }
        this.E0 = z2;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
