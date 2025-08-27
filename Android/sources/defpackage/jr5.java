package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior;
import java.util.WeakHashMap;

/* renamed from: jr5  reason: default package */
public abstract class jr5 extends qdg implements sd5, u4e, sz3 {
    public static final int C0 = hnc.Widget_Design_FloatingActionButton;
    public final w A0;
    public sr5 B0;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public ColorStateList o;
    public PorterDuff.Mode v;
    public int v0;
    public ColorStateList w;
    public boolean w0;
    public int x;
    public final Rect x0 = new Rect();
    public int y;
    public final Rect y0 = new Rect();
    public int z;
    public final ko z0;

    /* JADX WARNING: type inference failed for: r1v8, types: [w, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jr5(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            int r8 = defpackage.edc.floatingActionButtonStyle
            int r9 = C0
            r1 = r17
            android.content.Context r1 = defpackage.fh8.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            int r1 = r16.getVisibility()
            r0.a = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.x0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.y0 = r1
            android.content.Context r10 = r16.getContext()
            int[] r3 = defpackage.tnc.FloatingActionButton
            r11 = 0
            int[] r6 = new int[r11]
            r1 = r10
            r2 = r18
            r4 = r8
            r5 = r9
            android.content.res.TypedArray r1 = defpackage.vhf.d(r1, r2, r3, r4, r5, r6)
            int r2 = defpackage.tnc.FloatingActionButton_backgroundTint
            android.content.res.ColorStateList r2 = defpackage.m5a.C(r10, r1, r2)
            r0.b = r2
            int r2 = defpackage.tnc.FloatingActionButton_backgroundTintMode
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            r4 = 0
            android.graphics.PorterDuff$Mode r2 = defpackage.ct.D(r2, r4)
            r0.c = r2
            int r2 = defpackage.tnc.FloatingActionButton_rippleColor
            android.content.res.ColorStateList r2 = defpackage.m5a.C(r10, r1, r2)
            r0.w = r2
            int r2 = defpackage.tnc.FloatingActionButton_fabSize
            int r2 = r1.getInt(r2, r3)
            r0.x = r2
            int r2 = defpackage.tnc.FloatingActionButton_fabCustomSize
            int r2 = r1.getDimensionPixelSize(r2, r11)
            r0.y = r2
            int r2 = defpackage.tnc.FloatingActionButton_borderWidth
            int r2 = r1.getDimensionPixelSize(r2, r11)
            int r3 = defpackage.tnc.FloatingActionButton_elevation
            r4 = 0
            float r3 = r1.getDimension(r3, r4)
            int r5 = defpackage.tnc.FloatingActionButton_hoveredFocusedTranslationZ
            float r5 = r1.getDimension(r5, r4)
            int r6 = defpackage.tnc.FloatingActionButton_pressedTranslationZ
            float r4 = r1.getDimension(r6, r4)
            int r6 = defpackage.tnc.FloatingActionButton_useCompatPadding
            boolean r6 = r1.getBoolean(r6, r11)
            r0.w0 = r6
            android.content.res.Resources r6 = r16.getResources()
            int r12 = defpackage.iec.mtrl_fab_min_touch_target
            int r6 = r6.getDimensionPixelSize(r12)
            int r12 = defpackage.tnc.FloatingActionButton_maxImageSize
            int r12 = r1.getDimensionPixelSize(r12, r11)
            r0.setMaxImageSize(r12)
            int r12 = defpackage.tnc.FloatingActionButton_showMotionSpec
            pt9 r12 = defpackage.pt9.a(r10, r1, r12)
            int r13 = defpackage.tnc.FloatingActionButton_hideMotionSpec
            pt9 r13 = defpackage.pt9.a(r10, r1, r13)
            s0d r14 = defpackage.j4e.m
            int[] r15 = defpackage.tnc.MaterialShape
            android.content.res.TypedArray r9 = r10.obtainStyledAttributes(r7, r15, r8, r9)
            int r15 = defpackage.tnc.MaterialShape_shapeAppearance
            int r15 = r9.getResourceId(r15, r11)
            r17 = r13
            int r13 = defpackage.tnc.MaterialShape_shapeAppearanceOverlay
            int r13 = r9.getResourceId(r13, r11)
            r9.recycle()
            ypg r9 = defpackage.j4e.a(r10, r15, r13, r14)
            j4e r9 = r9.c()
            int r10 = defpackage.tnc.FloatingActionButton_ensureMinTouchTargetSize
            boolean r10 = r1.getBoolean(r10, r11)
            int r11 = defpackage.tnc.FloatingActionButton_android_enabled
            r13 = 1
            boolean r11 = r1.getBoolean(r11, r13)
            r0.setEnabled(r11)
            r1.recycle()
            ko r1 = new ko
            r1.<init>(r0)
            r0.z0 = r1
            r1.b(r7, r8)
            w r1 = new w
            r7 = r0
            ru.ok.messages.views.widgets.AnimatedFab r7 = (ru.ok.messages.views.widgets.AnimatedFab) r7
            r1.<init>()
            r8 = 0
            r1.b = r8
            r1.a = r8
            r1.c = r7
            r0.A0 = r1
            qr5 r1 = r16.getImpl()
            r1.n(r9)
            qr5 r1 = r16.getImpl()
            android.content.res.ColorStateList r7 = r0.b
            android.graphics.PorterDuff$Mode r8 = r0.c
            android.content.res.ColorStateList r9 = r0.w
            r1.g(r7, r8, r9, r2)
            qr5 r1 = r16.getImpl()
            r1.k = r6
            qr5 r1 = r16.getImpl()
            float r2 = r1.h
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0121
            r1.h = r3
            float r2 = r1.i
            float r6 = r1.j
            r1.k(r3, r2, r6)
        L_0x0121:
            qr5 r1 = r16.getImpl()
            float r2 = r1.i
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0134
            r1.i = r5
            float r2 = r1.h
            float r3 = r1.j
            r1.k(r2, r5, r3)
        L_0x0134:
            qr5 r1 = r16.getImpl()
            float r2 = r1.j
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0147
            r1.j = r4
            float r2 = r1.h
            float r3 = r1.i
            r1.k(r2, r3, r4)
        L_0x0147:
            qr5 r1 = r16.getImpl()
            r1.m = r12
            qr5 r1 = r16.getImpl()
            r2 = r17
            r1.n = r2
            qr5 r1 = r16.getImpl()
            r1.f = r10
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX
            r0.setScaleType(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr5.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [qr5, sr5] */
    private qr5 getImpl() {
        if (this.B0 == null) {
            this.B0 = new qr5(this, new wie(20, (Object) this));
        }
        return this.B0;
    }

    public final int c(int i) {
        int i2 = this.y;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(iec.design_fab_size_normal) : resources.getDimensionPixelSize(iec.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final void d(gf gfVar, boolean z2) {
        qr5 impl = getImpl();
        er7 er7 = gfVar == null ? null : new er7(this, (iq) gfVar);
        jr5 jr5 = impl.s;
        if (jr5.getVisibility() == 0) {
            if (impl.r == 1) {
                return;
            }
        } else if (impl.r != 2) {
            return;
        }
        Animator animator = impl.l;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap weakHashMap = gag.a;
        jr5 jr52 = impl.s;
        if (!jr52.isLaidOut() || jr52.isInEditMode()) {
            jr5.a(z2 ? 8 : 4, z2);
            if (er7 != null) {
                ((iq) er7.b).Q();
                return;
            }
            return;
        }
        pt9 pt9 = impl.n;
        AnimatorSet b2 = pt9 != null ? impl.b(pt9, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO) : impl.c(c44.DEFAULT_ASPECT_RATIO, 0.4f, 0.4f, qr5.C, qr5.D);
        b2.addListener(new kr5(impl, z2, er7));
        impl.getClass();
        b2.start();
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.o;
            if (colorStateList == null) {
                drawable.clearColorFilter();
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.v;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(ho.c(colorForState, mode));
        }
    }

    public final void f(gf gfVar, boolean z2) {
        qr5 impl = getImpl();
        er7 er7 = gfVar == null ? null : new er7(this, (iq) gfVar);
        if (impl.s.getVisibility() != 0) {
            if (impl.r == 2) {
                return;
            }
        } else if (impl.r != 1) {
            return;
        }
        Animator animator = impl.l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z3 = impl.m == null;
        WeakHashMap weakHashMap = gag.a;
        jr5 jr5 = impl.s;
        boolean z4 = jr5.isLaidOut() && !jr5.isInEditMode();
        Matrix matrix = impl.x;
        if (z4) {
            if (jr5.getVisibility() != 0) {
                float f = c44.DEFAULT_ASPECT_RATIO;
                jr5.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                jr5.setScaleY(z3 ? 0.4f : 0.0f);
                jr5.setScaleX(z3 ? 0.4f : 0.0f);
                if (z3) {
                    f = 0.4f;
                }
                impl.p = f;
                impl.a(f, matrix);
                jr5.setImageMatrix(matrix);
            }
            pt9 pt9 = impl.m;
            AnimatorSet b2 = pt9 != null ? impl.b(pt9, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, qr5.A, qr5.B);
            b2.addListener(new dg5(impl, z2, er7, 1));
            impl.getClass();
            b2.start();
            return;
        }
        jr5.a(0, z2);
        jr5.setAlpha(1.0f);
        jr5.setScaleY(1.0f);
        jr5.setScaleX(1.0f);
        impl.p = 1.0f;
        impl.a(1.0f, matrix);
        jr5.setImageMatrix(matrix);
        if (er7 != null) {
            ((iq) er7.b).R();
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.c;
    }

    public tz3 getBehavior() {
        return new FloatingActionButton$Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.y;
    }

    public int getExpandedComponentIdHint() {
        return this.A0.a;
    }

    public pt9 getHideMotionSpec() {
        return getImpl().n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.w;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.w;
    }

    public j4e getShapeAppearanceModel() {
        j4e j4e = getImpl().a;
        j4e.getClass();
        return j4e;
    }

    public pt9 getShowMotionSpec() {
        return getImpl().m;
    }

    public int getSize() {
        return this.x;
    }

    public int getSizeDimension() {
        return c(this.x);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.o;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.v;
    }

    public boolean getUseCompatPadding() {
        return this.w0;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qr5 impl = getImpl();
        bh8 bh8 = impl.b;
        jr5 jr5 = impl.s;
        if (bh8 != null) {
            o5a.g0(jr5, bh8);
        }
        if (!(impl instanceof sr5)) {
            ViewTreeObserver viewTreeObserver = jr5.getViewTreeObserver();
            if (impl.y == null) {
                impl.y = new xz3(1, impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.y);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qr5 impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.s.getViewTreeObserver();
        xz3 xz3 = impl.y;
        if (xz3 != null) {
            viewTreeObserver.removeOnPreDrawListener(xz3);
            impl.y = null;
        }
    }

    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.z = (sizeDimension - this.v0) / 2;
        getImpl().q();
        int min = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.x0;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ae5)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ae5 ae5 = (ae5) parcelable;
        super.onRestoreInstanceState(ae5.a);
        Bundle bundle = (Bundle) ae5.c.get("expandableWidgetHelper");
        bundle.getClass();
        w wVar = this.A0;
        wVar.getClass();
        wVar.b = bundle.getBoolean("expanded", false);
        wVar.a = bundle.getInt("expandedComponentIdHint", 0);
        if (wVar.b) {
            View view = (View) wVar.c;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).c(view);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ae5 ae5 = new ae5(onSaveInstanceState);
        qae qae = ae5.c;
        w wVar = this.A0;
        wVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", wVar.b);
        bundle.putInt("expandedComponentIdHint", wVar.a);
        qae.put("expandableWidgetHelper", bundle);
        return ae5;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.y0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i = rect.left;
            Rect rect2 = this.x0;
            rect.left = i + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            sr5 sr5 = this.B0;
            int i2 = -(sr5.f ? Math.max((sr5.k - sr5.s.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i2, i2);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            qr5 impl = getImpl();
            bh8 bh8 = impl.b;
            if (bh8 != null) {
                bh8.setTintList(colorStateList);
            }
            jq0 jq0 = impl.d;
            if (jq0 != null) {
                if (colorStateList != null) {
                    jq0.m = colorStateList.getColorForState(jq0.getState(), jq0.m);
                }
                jq0.p = colorStateList;
                jq0.n = true;
                jq0.invalidateSelf();
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != mode) {
            this.c = mode;
            bh8 bh8 = getImpl().b;
            if (bh8 != null) {
                bh8.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        qr5 impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.k(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        qr5 impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.k(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        qr5 impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.k(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.y) {
            this.y = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        bh8 bh8 = getImpl().b;
        if (bh8 != null) {
            bh8.k(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        if (z2 != getImpl().f) {
            getImpl().f = z2;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.A0.a = i;
    }

    public void setHideMotionSpec(pt9 pt9) {
        getImpl().n = pt9;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(pt9.b(i, getContext()));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            qr5 impl = getImpl();
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.x;
            impl.a(f, matrix);
            impl.s.setImageMatrix(matrix);
            if (this.o != null) {
                e();
            }
        }
    }

    public void setImageResource(int i) {
        this.z0.c(i);
        e();
    }

    public void setMaxImageSize(int i) {
        this.v0 = i;
        qr5 impl = getImpl();
        if (impl.q != i) {
            impl.q = i;
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.x;
            impl.a(f, matrix);
            impl.s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().getClass();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z2) {
        qr5 impl = getImpl();
        impl.g = z2;
        impl.q();
    }

    public void setShapeAppearanceModel(j4e j4e) {
        getImpl().n(j4e);
    }

    public void setShowMotionSpec(pt9 pt9) {
        getImpl().m = pt9;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(pt9.b(i, getContext()));
    }

    public void setSize(int i) {
        this.y = 0;
        if (i != this.x) {
            this.x = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.v != mode) {
            this.v = mode;
            e();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().l();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().l();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.w0 != z2) {
            this.w0 = z2;
            getImpl().i();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            getImpl().m(this.w);
        }
    }
}
