package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: i53  reason: default package */
public class i53 extends FrameLayout {
    public static final int R0 = hnc.Widget_Design_CollapsingToolbar;
    public Drawable A0;
    public Drawable B0;
    public int C0;
    public boolean D0;
    public ValueAnimator E0;
    public long F0;
    public final TimeInterpolator G0;
    public final TimeInterpolator H0;
    public int I0 = -1;
    public g53 J0;
    public int K0;
    public int L0;
    public iog M0;
    public int N0 = 0;
    public boolean O0;
    public int P0 = 0;
    public boolean Q0;
    public boolean a = true;
    public final int b;
    public ViewGroup c;
    public View o;
    public View v;
    public final Rect v0 = new Rect();
    public int w;
    public final e53 w0;
    public int x;
    public final x05 x0;
    public int y;
    public boolean y0;
    public int z;
    public boolean z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i53(android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r13 = this;
            int r6 = defpackage.edc.collapsingToolbarLayoutStyle
            int r7 = R0
            android.content.Context r14 = defpackage.fh8.a(r14, r15, r6, r7)
            r13.<init>(r14, r15, r6)
            r14 = 1
            r13.a = r14
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r13.v0 = r0
            r8 = -1
            r13.I0 = r8
            r9 = 0
            r13.N0 = r9
            r13.P0 = r9
            android.content.Context r10 = r13.getContext()
            e53 r11 = new e53
            r11.<init>(r13)
            r13.w0 = r11
            android.view.animation.DecelerateInterpolator r0 = defpackage.xg.e
            r11.W = r0
            r11.i(r9)
            r11.J = r9
            x05 r0 = new x05
            r0.<init>(r10)
            r13.x0 = r0
            int[] r12 = defpackage.tnc.CollapsingToolbarLayout
            int[] r5 = new int[r9]
            defpackage.vhf.a(r10, r15, r6, r7)
            r0 = r10
            r1 = r15
            r2 = r12
            r3 = r6
            r4 = r7
            defpackage.vhf.b(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r15 = r10.obtainStyledAttributes(r15, r12, r6, r7)
            int r0 = defpackage.tnc.CollapsingToolbarLayout_expandedTitleGravity
            r1 = 8388691(0x800053, float:1.175506E-38)
            int r0 = r15.getInt(r0, r1)
            int r1 = r11.j
            if (r1 == r0) goto L_0x005d
            r11.j = r0
            r11.i(r9)
        L_0x005d:
            int r0 = defpackage.tnc.CollapsingToolbarLayout_collapsedTitleGravity
            r1 = 8388627(0x800013, float:1.175497E-38)
            int r0 = r15.getInt(r0, r1)
            r11.l(r0)
            int r0 = defpackage.tnc.CollapsingToolbarLayout_expandedTitleMargin
            int r0 = r15.getDimensionPixelSize(r0, r9)
            r13.z = r0
            r13.y = r0
            r13.x = r0
            r13.w = r0
            int r0 = defpackage.tnc.CollapsingToolbarLayout_expandedTitleMarginStart
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L_0x0087
            int r0 = defpackage.tnc.CollapsingToolbarLayout_expandedTitleMarginStart
            int r0 = r15.getDimensionPixelSize(r0, r9)
            r13.w = r0
        L_0x0087:
            int r0 = defpackage.tnc.CollapsingToolbarLayout_expandedTitleMarginEnd
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L_0x0097
            int r0 = defpackage.tnc.CollapsingToolbarLayout_expandedTitleMarginEnd
            int r0 = r15.getDimensionPixelSize(r0, r9)
            r13.y = r0
        L_0x0097:
            int r0 = defpackage.tnc.CollapsingToolbarLayout_expandedTitleMarginTop
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L_0x00a7
            int r0 = defpackage.tnc.CollapsingToolbarLayout_expandedTitleMarginTop
            int r0 = r15.getDimensionPixelSize(r0, r9)
            r13.x = r0
        L_0x00a7:
            int r0 = defpackage.tnc.CollapsingToolbarLayout_expandedTitleMarginBottom
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L_0x00b7
            int r0 = defpackage.tnc.CollapsingToolbarLayout_expandedTitleMarginBottom
            int r0 = r15.getDimensionPixelSize(r0, r9)
            r13.z = r0
        L_0x00b7:
            int r0 = defpackage.tnc.CollapsingToolbarLayout_titleEnabled
            boolean r0 = r15.getBoolean(r0, r14)
            r13.y0 = r0
            int r0 = defpackage.tnc.CollapsingToolbarLayout_title
            java.lang.CharSequence r0 = r15.getText(r0)
            r13.setTitle(r0)
            int r0 = defpackage.hnc.TextAppearance_Design_CollapsingToolbar_Expanded
            r11.n(r0)
            int r0 = defpackage.mnc.TextAppearance_AppCompat_Widget_ActionBar_Title
            r11.k(r0)
            int r0 = defpackage.tnc.CollapsingToolbarLayout_expandedTitleTextAppearance
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L_0x00e3
            int r0 = defpackage.tnc.CollapsingToolbarLayout_expandedTitleTextAppearance
            int r0 = r15.getResourceId(r0, r9)
            r11.n(r0)
        L_0x00e3:
            int r0 = defpackage.tnc.CollapsingToolbarLayout_collapsedTitleTextAppearance
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L_0x00f4
            int r0 = defpackage.tnc.CollapsingToolbarLayout_collapsedTitleTextAppearance
            int r0 = r15.getResourceId(r0, r9)
            r11.k(r0)
        L_0x00f4:
            int r0 = defpackage.tnc.CollapsingToolbarLayout_titleTextEllipsize
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L_0x0117
            int r0 = defpackage.tnc.CollapsingToolbarLayout_titleTextEllipsize
            int r0 = r15.getInt(r0, r8)
            if (r0 == 0) goto L_0x0112
            if (r0 == r14) goto L_0x010f
            r1 = 3
            if (r0 == r1) goto L_0x010c
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            goto L_0x0114
        L_0x010c:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MARQUEE
            goto L_0x0114
        L_0x010f:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x0114
        L_0x0112:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
        L_0x0114:
            r13.setTitleEllipsize(r0)
        L_0x0117:
            int r0 = defpackage.tnc.CollapsingToolbarLayout_expandedTitleTextColor
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L_0x012e
            int r0 = defpackage.tnc.CollapsingToolbarLayout_expandedTitleTextColor
            android.content.res.ColorStateList r0 = defpackage.m5a.C(r10, r15, r0)
            android.content.res.ColorStateList r1 = r11.n
            if (r1 == r0) goto L_0x012e
            r11.n = r0
            r11.i(r9)
        L_0x012e:
            int r0 = defpackage.tnc.CollapsingToolbarLayout_collapsedTitleTextColor
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L_0x0145
            int r0 = defpackage.tnc.CollapsingToolbarLayout_collapsedTitleTextColor
            android.content.res.ColorStateList r0 = defpackage.m5a.C(r10, r15, r0)
            android.content.res.ColorStateList r1 = r11.o
            if (r1 == r0) goto L_0x0145
            r11.o = r0
            r11.i(r9)
        L_0x0145:
            int r0 = defpackage.tnc.CollapsingToolbarLayout_scrimVisibleHeightTrigger
            int r0 = r15.getDimensionPixelSize(r0, r8)
            r13.I0 = r0
            int r0 = defpackage.tnc.CollapsingToolbarLayout_maxLines
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L_0x016e
            int r0 = defpackage.tnc.CollapsingToolbarLayout_maxLines
            int r14 = r15.getInt(r0, r14)
            int r0 = r11.n0
            if (r14 == r0) goto L_0x016e
            r11.n0 = r14
            android.graphics.Bitmap r14 = r11.K
            if (r14 == 0) goto L_0x016b
            r14.recycle()
            r14 = 0
            r11.K = r14
        L_0x016b:
            r11.i(r9)
        L_0x016e:
            int r14 = defpackage.tnc.CollapsingToolbarLayout_titlePositionInterpolator
            boolean r14 = r15.hasValue(r14)
            if (r14 == 0) goto L_0x0185
            int r14 = defpackage.tnc.CollapsingToolbarLayout_titlePositionInterpolator
            int r14 = r15.getResourceId(r14, r9)
            android.view.animation.Interpolator r14 = android.view.animation.AnimationUtils.loadInterpolator(r10, r14)
            r11.V = r14
            r11.i(r9)
        L_0x0185:
            int r14 = defpackage.tnc.CollapsingToolbarLayout_scrimAnimationDuration
            r0 = 600(0x258, float:8.41E-43)
            int r14 = r15.getInt(r14, r0)
            long r0 = (long) r14
            r13.F0 = r0
            int r14 = defpackage.edc.motionEasingStandardInterpolator
            fh5 r0 = defpackage.xg.c
            android.animation.TimeInterpolator r14 = defpackage.ld8.o0(r10, r14, r0)
            r13.G0 = r14
            int r14 = defpackage.edc.motionEasingStandardInterpolator
            fh5 r0 = defpackage.xg.d
            android.animation.TimeInterpolator r14 = defpackage.ld8.o0(r10, r14, r0)
            r13.H0 = r14
            int r14 = defpackage.tnc.CollapsingToolbarLayout_contentScrim
            android.graphics.drawable.Drawable r14 = r15.getDrawable(r14)
            r13.setContentScrim(r14)
            int r14 = defpackage.tnc.CollapsingToolbarLayout_statusBarScrim
            android.graphics.drawable.Drawable r14 = r15.getDrawable(r14)
            r13.setStatusBarScrim(r14)
            int r14 = defpackage.tnc.CollapsingToolbarLayout_titleCollapseMode
            int r14 = r15.getInt(r14, r9)
            r13.setTitleCollapseMode(r14)
            int r14 = defpackage.tnc.CollapsingToolbarLayout_toolbarId
            int r14 = r15.getResourceId(r14, r8)
            r13.b = r14
            int r14 = defpackage.tnc.CollapsingToolbarLayout_forceApplySystemWindowInsetTop
            boolean r14 = r15.getBoolean(r14, r9)
            r13.O0 = r14
            int r14 = defpackage.tnc.CollapsingToolbarLayout_extraMultilineHeightEnabled
            boolean r14 = r15.getBoolean(r14, r9)
            r13.Q0 = r14
            r15.recycle()
            r13.setWillNotDraw(r9)
            rt6 r14 = new rt6
            r15 = 12
            r14.<init>((int) r15, (java.lang.Object) r13)
            java.util.WeakHashMap r15 = defpackage.gag.a
            defpackage.v9g.u(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i53.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static lbg b(View view) {
        lbg lbg = (lbg) view.getTag(agc.view_offset_helper);
        if (lbg != null) {
            return lbg;
        }
        lbg lbg2 = new lbg(view);
        view.setTag(agc.view_offset_helper, lbg2);
        return lbg2;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        Context context = getContext();
        TypedValue T = b59.T(edc.colorSurfaceContainer, context);
        ColorStateList colorStateList = null;
        if (T != null) {
            int i = T.resourceId;
            if (i != 0) {
                colorStateList = q8.j(i, context);
            } else {
                int i2 = T.data;
                if (i2 != 0) {
                    colorStateList = ColorStateList.valueOf(i2);
                }
            }
        }
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        float dimension = getResources().getDimension(iec.design_appbar_elevation);
        x05 x05 = this.x0;
        return x05.a(dimension, x05.d);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            boolean r0 = r6.a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.c = r0
            r6.o = r0
            r1 = -1
            int r2 = r6.b
            if (r2 == r1) goto L_0x002f
            android.view.View r1 = r6.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.c = r1
            if (r1 == 0) goto L_0x002f
            android.view.ViewParent r2 = r1.getParent()
        L_0x001d:
            if (r2 == r6) goto L_0x002d
            if (r2 == 0) goto L_0x002d
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L_0x0028
            r1 = r2
            android.view.View r1 = (android.view.View) r1
        L_0x0028:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x001d
        L_0x002d:
            r6.o = r1
        L_0x002f:
            android.view.ViewGroup r1 = r6.c
            r2 = 0
            if (r1 != 0) goto L_0x0050
            int r1 = r6.getChildCount()
            r3 = r2
        L_0x0039:
            if (r3 >= r1) goto L_0x004e
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r5 != 0) goto L_0x004b
            boolean r5 = r4 instanceof android.widget.Toolbar
            if (r5 == 0) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            int r3 = r3 + 1
            goto L_0x0039
        L_0x004b:
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x004e:
            r6.c = r0
        L_0x0050:
            r6.e()
            r6.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i53.a():void");
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f53;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.c == null && (drawable = this.A0) != null && this.C0 > 0) {
            drawable.mutate().setAlpha(this.C0);
            this.A0.draw(canvas);
        }
        if (this.y0 && this.z0) {
            ViewGroup viewGroup = this.c;
            e53 e53 = this.w0;
            if (viewGroup == null || this.A0 == null || this.C0 <= 0 || this.L0 != 1 || e53.b >= e53.e) {
                e53.d(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.A0.getBounds(), Region.Op.DIFFERENCE);
                e53.d(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.B0 != null && this.C0 > 0) {
            iog iog = this.M0;
            int d = iog != null ? iog.d() : 0;
            if (d > 0) {
                this.B0.setBounds(0, -this.K0, getWidth(), d - this.K0);
                this.B0.mutate().setAlpha(this.C0);
                this.B0.draw(canvas);
            }
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z2;
        View view2;
        Drawable drawable = this.A0;
        if (drawable == null || this.C0 <= 0 || ((view2 = this.o) == null || view2 == this ? view != this.c : view != view2)) {
            z2 = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.L0 == 1 && view != null && this.y0) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.A0.mutate().setAlpha(this.C0);
            this.A0.draw(canvas);
            z2 = true;
        }
        return super.drawChild(canvas, view, j) || z2;
    }

    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.B0;
        boolean z2 = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.A0;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        e53 e53 = this.w0;
        if (e53 != null) {
            e53.R = drawableState;
            ColorStateList colorStateList2 = e53.o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = e53.n) != null && colorStateList.isStateful())) {
                e53.i(false);
                z2 = true;
            }
            state |= z2;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e() {
        View view;
        if (!this.y0 && (view = this.v) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.v);
            }
        }
        if (this.y0 && this.c != null) {
            if (this.v == null) {
                this.v = new View(getContext());
            }
            if (this.v.getParent() == null) {
                this.c.addView(this.v, -1, -1);
            }
        }
    }

    public final void f() {
        if (this.A0 != null || this.B0 != null) {
            setScrimsShown(getHeight() + this.K0 < getScrimVisibleHeightTrigger());
        }
    }

    public final void g(boolean z2, int i, int i2, int i3, int i4) {
        View view;
        int i5;
        int i6;
        int i7;
        if (this.y0 && (view = this.v) != null) {
            WeakHashMap weakHashMap = gag.a;
            int i8 = 0;
            boolean z3 = view.isAttachedToWindow() && this.v.getVisibility() == 0;
            this.z0 = z3;
            if (z3 || z2) {
                boolean z4 = getLayoutDirection() == 1;
                View view2 = this.o;
                if (view2 == null) {
                    view2 = this.c;
                }
                int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((f53) view2.getLayoutParams()).bottomMargin;
                View view3 = this.v;
                ThreadLocal threadLocal = im4.a;
                int width = view3.getWidth();
                int height2 = view3.getHeight();
                Rect rect = this.v0;
                rect.set(0, 0, width, height2);
                im4.b(this, view3, rect);
                ViewGroup viewGroup = this.c;
                if (viewGroup instanceof Toolbar) {
                    Toolbar toolbar = (Toolbar) viewGroup;
                    i8 = toolbar.getTitleMarginStart();
                    i6 = toolbar.getTitleMarginEnd();
                    i5 = toolbar.getTitleMarginTop();
                    i7 = toolbar.getTitleMarginBottom();
                } else if (viewGroup instanceof android.widget.Toolbar) {
                    android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                    i8 = toolbar2.getTitleMarginStart();
                    i6 = toolbar2.getTitleMarginEnd();
                    i5 = toolbar2.getTitleMarginTop();
                    i7 = toolbar2.getTitleMarginBottom();
                } else {
                    i7 = 0;
                    i6 = 0;
                    i5 = 0;
                }
                int i9 = rect.left + (z4 ? i6 : i8);
                int i10 = rect.top + height + i5;
                int i11 = rect.right;
                if (!z4) {
                    i8 = i6;
                }
                int i12 = i11 - i8;
                int i13 = (rect.bottom + height) - i7;
                e53 e53 = this.w0;
                Rect rect2 = e53.h;
                if (!(rect2.left == i9 && rect2.top == i10 && rect2.right == i12 && rect2.bottom == i13)) {
                    rect2.set(i9, i10, i12, i13);
                    e53.S = true;
                }
                int i14 = z4 ? this.y : this.w;
                int i15 = rect.top + this.x;
                int i16 = (i3 - i) - (z4 ? this.w : this.y);
                int i17 = (i4 - i2) - this.z;
                Rect rect3 = e53.g;
                if (!(rect3.left == i14 && rect3.top == i15 && rect3.right == i16 && rect3.bottom == i17)) {
                    rect3.set(i14, i15, i16, i17);
                    e53.S = true;
                }
                e53.i(z2);
            }
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f53(-1, -1);
    }

    public int getCollapsedTitleGravity() {
        return this.w0.k;
    }

    public float getCollapsedTitleTextSize() {
        return this.w0.m;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.w0.w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.A0;
    }

    public int getExpandedTitleGravity() {
        return this.w0.j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.z;
    }

    public int getExpandedTitleMarginEnd() {
        return this.y;
    }

    public int getExpandedTitleMarginStart() {
        return this.w;
    }

    public int getExpandedTitleMarginTop() {
        return this.x;
    }

    public float getExpandedTitleTextSize() {
        return this.w0.l;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.w0.z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.w0.q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.w0.i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.w0.i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.w0.i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.w0.n0;
    }

    public int getScrimAlpha() {
        return this.C0;
    }

    public long getScrimAnimationDuration() {
        return this.F0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.I0;
        if (i >= 0) {
            return i + this.N0 + this.P0;
        }
        iog iog = this.M0;
        int d = iog != null ? iog.d() : 0;
        WeakHashMap weakHashMap = gag.a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + d, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.B0;
    }

    public CharSequence getTitle() {
        if (this.y0) {
            return this.w0.G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.L0;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.w0.V;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.w0.F;
    }

    public final void h() {
        if (this.c != null && this.y0 && TextUtils.isEmpty(this.w0.G)) {
            ViewGroup viewGroup = this.c;
            setTitle(viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.L0 == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = gag.a;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.J0 == null) {
                this.J0 = new g53(this);
            }
            appBarLayout.a(this.J0);
            t9g.c(this);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.w0.h(configuration);
    }

    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        g53 g53 = this.J0;
        if (!(g53 == null || !(parent instanceof AppBarLayout) || (arrayList = ((AppBarLayout) parent).y) == null)) {
            arrayList.remove(g53);
        }
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        iog iog = this.M0;
        if (iog != null) {
            int d = iog.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap weakHashMap = gag.a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < d) {
                    childAt.offsetTopAndBottom(d);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            lbg b2 = b(getChildAt(i6));
            View view = b2.a;
            b2.b = view.getTop();
            b2.c = view.getLeft();
        }
        g(false, i, i2, i3, i4);
        h();
        f();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        iog iog = this.M0;
        int d = iog != null ? iog.d() : 0;
        if ((mode == 0 || this.O0) && d > 0) {
            this.N0 = d;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + d, 1073741824));
        }
        if (this.Q0) {
            e53 e53 = this.w0;
            if (e53.n0 > 1) {
                h();
                g(true, 0, 0, getMeasuredWidth(), getMeasuredHeight());
                int i5 = e53.p;
                if (i5 > 1) {
                    TextPaint textPaint = e53.U;
                    textPaint.setTextSize(e53.l);
                    textPaint.setTypeface(e53.z);
                    textPaint.setLetterSpacing(e53.g0);
                    this.P0 = (i5 - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.P0, 1073741824));
                }
            }
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            View view = this.o;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    i3 = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(i3);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                i4 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                i4 = view.getMeasuredHeight();
            }
            setMinimumHeight(i4);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A0;
        if (drawable != null) {
            ViewGroup viewGroup = this.c;
            if (this.L0 == 1 && viewGroup != null && this.y0) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.w0.l(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.w0.k(i);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        e53 e53 = this.w0;
        if (e53.o != colorStateList) {
            e53.o = colorStateList;
            e53.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f) {
        e53 e53 = this.w0;
        if (e53.m != f) {
            e53.m = f;
            e53.i(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        e53 e53 = this.w0;
        if (e53.m(typeface)) {
            e53.i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.A0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A0 = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.c;
                if (this.L0 == 1 && viewGroup != null && this.y0) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.A0.setCallback(this);
                this.A0.setAlpha(this.C0);
            }
            WeakHashMap weakHashMap = gag.a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(ew3.b(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        e53 e53 = this.w0;
        if (e53.j != i) {
            e53.j = i;
            e53.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.z = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.y = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.w = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.x = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.w0.n(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        e53 e53 = this.w0;
        if (e53.n != colorStateList) {
            e53.n = colorStateList;
            e53.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        e53 e53 = this.w0;
        if (e53.l != f) {
            e53.l = f;
            e53.i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        e53 e53 = this.w0;
        if (e53.o(typeface)) {
            e53.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z2) {
        this.Q0 = z2;
    }

    public void setForceApplySystemWindowInsetTop(boolean z2) {
        this.O0 = z2;
    }

    public void setHyphenationFrequency(int i) {
        this.w0.q0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.w0.o0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.w0.p0 = f;
    }

    public void setMaxLines(int i) {
        e53 e53 = this.w0;
        if (i != e53.n0) {
            e53.n0 = i;
            Bitmap bitmap = e53.K;
            if (bitmap != null) {
                bitmap.recycle();
                e53.K = null;
            }
            e53.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z2) {
        this.w0.J = z2;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.C0) {
            if (!(this.A0 == null || (viewGroup = this.c) == null)) {
                WeakHashMap weakHashMap = gag.a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.C0 = i;
            WeakHashMap weakHashMap2 = gag.a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.F0 = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.I0 != i) {
            this.I0 = i;
            f();
        }
    }

    public void setScrimsShown(boolean z2) {
        WeakHashMap weakHashMap = gag.a;
        int i = 0;
        boolean z3 = isLaidOut() && !isInEditMode();
        if (this.D0 != z2) {
            if (z3) {
                if (z2) {
                    i = 255;
                }
                a();
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.E0 = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.C0 ? this.G0 : this.H0);
                    this.E0.addUpdateListener(new sk0(2, this));
                } else if (valueAnimator.isRunning()) {
                    this.E0.cancel();
                }
                this.E0.setDuration(this.F0);
                this.E0.setIntValues(new int[]{this.C0, i});
                this.E0.start();
            } else {
                if (z2) {
                    i = 255;
                }
                setScrimAlpha(i);
            }
            this.D0 = z2;
        }
    }

    public void setStaticLayoutBuilderConfigurer(h53 h53) {
        e53 e53 = this.w0;
        if (h53 != null) {
            e53.i(true);
        } else {
            e53.getClass();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.B0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.B0 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.B0.setState(getDrawableState());
                }
                Drawable drawable4 = this.B0;
                WeakHashMap weakHashMap = gag.a;
                su4.b(drawable4, getLayoutDirection());
                this.B0.setVisible(getVisibility() == 0, false);
                this.B0.setCallback(this);
                this.B0.setAlpha(this.C0);
            }
            WeakHashMap weakHashMap2 = gag.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(ew3.b(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        e53 e53 = this.w0;
        if (charSequence == null || !TextUtils.equals(e53.G, charSequence)) {
            e53.G = charSequence;
            e53.H = null;
            Bitmap bitmap = e53.K;
            if (bitmap != null) {
                bitmap.recycle();
                e53.K = null;
            }
            e53.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.L0 = i;
        boolean z2 = i == 1;
        this.w0.c = z2;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.L0 == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z2 && this.A0 == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        e53 e53 = this.w0;
        e53.F = truncateAt;
        e53.i(false);
    }

    public void setTitleEnabled(boolean z2) {
        if (z2 != this.y0) {
            this.y0 = z2;
            setContentDescription(getTitle());
            e();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        e53 e53 = this.w0;
        e53.V = timeInterpolator;
        e53.i(false);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.B0;
        if (!(drawable == null || drawable.isVisible() == z2)) {
            this.B0.setVisible(z2, false);
        }
        Drawable drawable2 = this.A0;
        if (drawable2 != null && drawable2.isVisible() != z2) {
            this.A0.setVisible(z2, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0 || drawable == this.B0;
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final FrameLayout.LayoutParams m13generateDefaultLayoutParams() {
        return new f53(-1, -1);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [f53, android.widget.FrameLayout$LayoutParams] */
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? layoutParams = new FrameLayout.LayoutParams(context, attributeSet);
        layoutParams.a = 0;
        layoutParams.b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnc.CollapsingToolbarLayout_Layout);
        layoutParams.a = obtainStyledAttributes.getInt(tnc.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
        layoutParams.b = obtainStyledAttributes.getFloat(tnc.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [f53, android.view.ViewGroup$LayoutParams, android.widget.FrameLayout$LayoutParams] */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ? layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.a = 0;
        layoutParams2.b = 0.5f;
        return layoutParams2;
    }
}
