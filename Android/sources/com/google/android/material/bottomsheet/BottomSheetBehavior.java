package com.google.android.material.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;

public class BottomSheetBehavior<V extends View> extends tz3 implements gg8 {
    public static final int f0 = hnc.Widget_Design_BottomSheet_Modal;
    public final ur0 A = new ur0(this);
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F = 0.5f;
    public int G;
    public final float H = -1.0f;
    public boolean I;
    public boolean J;
    public boolean K = true;
    public int L = 4;
    public kag M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q = 0.1f;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W = new ArrayList();
    public VelocityTracker X;
    public kg8 Y;
    public int Z;
    public final int a = 0;
    public int a0 = -1;
    public boolean b = true;
    public boolean b0;
    public final float c;
    public HashMap c0;
    public final int d;
    public final SparseIntArray d0 = new SparseIntArray();
    public int e;
    public final rr0 e0 = new rr0(0, this);
    public boolean f;
    public int g;
    public final int h;
    public final bh8 i;
    public final ColorStateList j;
    public final int k = -1;
    public final int l = -1;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final j4e y;
    public boolean z;

    public BottomSheetBehavior() {
    }

    public static View B(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = gag.a;
        if (v9g.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View B2 = B(viewGroup.getChildAt(i2));
                if (B2 != null) {
                    return B2;
                }
            }
        }
        return null;
    }

    public static BottomSheetBehavior C(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof wz3) {
            tz3 tz3 = ((wz3) layoutParams).a;
            if (tz3 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) tz3;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public static int D(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, IntCompanionObject.MIN_VALUE);
    }

    public final void A(int i2) {
        View view = (View) this.U.get();
        if (view != null) {
            ArrayList arrayList = this.W;
            if (!arrayList.isEmpty()) {
                int i3 = this.G;
                if (i2 <= i3 && i3 != E()) {
                    E();
                }
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((sr0) arrayList.get(i4)).b(view);
                }
            }
        }
    }

    public final int E() {
        if (this.b) {
            return this.D;
        }
        return Math.max(this.C, this.r ? 0 : this.w);
    }

    public final int F(int i2) {
        if (i2 == 3) {
            return E();
        }
        if (i2 == 4) {
            return this.G;
        }
        if (i2 == 5) {
            return this.T;
        }
        if (i2 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(wj6.h(i2, "Invalid state to get top offset: "));
    }

    public final boolean G() {
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final void H(boolean z2) {
        if (this.b != z2) {
            this.b = z2;
            if (this.U != null) {
                x();
            }
            L((!this.b || this.L != 6) ? this.L : 3);
            P(this.L, true);
            O();
        }
    }

    public final void I(boolean z2) {
        if (this.I != z2) {
            this.I = z2;
            if (!z2 && this.L == 5) {
                K(4);
            }
            O();
        }
    }

    public final void J(int i2) {
        if (i2 == -1) {
            if (!this.f) {
                this.f = true;
            } else {
                return;
            }
        } else if (this.f || this.e != i2) {
            this.f = false;
            this.e = Math.max(0, i2);
        } else {
            return;
        }
        R();
    }

    public final void K(int i2) {
        if (i2 == 1 || i2 == 2) {
            throw new IllegalArgumentException(wj6.n(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        } else if (this.I || i2 != 5) {
            int i3 = (i2 != 6 || !this.b || F(i2) > this.D) ? i2 : 3;
            WeakReference weakReference = this.U;
            if (weakReference == null || weakReference.get() == null) {
                L(i2);
                return;
            }
            View view = (View) this.U.get();
            cp cpVar = new cp(this, view, i3);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = gag.a;
                if (view.isAttachedToWindow()) {
                    view.post(cpVar);
                    return;
                }
            }
            cpVar.run();
        }
    }

    public final void L(int i2) {
        View view;
        if (this.L != i2) {
            this.L = i2;
            if (!(i2 == 4 || i2 == 3 || i2 == 6)) {
                boolean z2 = this.I;
            }
            WeakReference weakReference = this.U;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                int i3 = 0;
                if (i2 == 3) {
                    Q(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    Q(false);
                }
                P(i2, true);
                while (true) {
                    ArrayList arrayList = this.W;
                    if (i3 < arrayList.size()) {
                        ((sr0) arrayList.get(i3)).c(view, i2);
                        i3++;
                    } else {
                        O();
                        return;
                    }
                }
            }
        }
    }

    public final boolean M(View view, float f2) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f2 * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) z()) > 0.5f;
    }

    public final void N(int i2, View view, boolean z2) {
        int F2 = F(i2);
        kag kag = this.M;
        if (kag == null || (!z2 ? !kag.r(view, view.getLeft(), F2) : !kag.p(view.getLeft(), F2))) {
            L(i2);
            return;
        }
        L(2);
        P(i2, true);
        this.A.b(i2);
    }

    public final void O() {
        View view;
        int i2;
        WeakReference weakReference = this.U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            gag.h(view, 524288);
            gag.e(view, 0);
            gag.h(view, 262144);
            gag.e(view, 0);
            gag.h(view, 1048576);
            gag.e(view, 0);
            SparseIntArray sparseIntArray = this.d0;
            int i3 = sparseIntArray.get(0, -1);
            if (i3 != -1) {
                gag.h(view, i3);
                gag.e(view, 0);
                sparseIntArray.delete(0);
            }
            int i4 = 6;
            if (!this.b && this.L != 6) {
                String string = view.getResources().getString(ymc.bottomsheet_action_expand_halfway);
                ni0 ni0 = new ni0((Object) this, 6, 1);
                ArrayList c2 = gag.c(view);
                int i5 = 0;
                while (true) {
                    if (i5 >= c2.size()) {
                        int i6 = -1;
                        for (int i7 = 0; i7 < 32 && i6 == -1; i7++) {
                            int i8 = gag.b[i7];
                            boolean z2 = true;
                            for (int i9 = 0; i9 < c2.size(); i9++) {
                                z2 &= ((a4) c2.get(i9)).a() != i8;
                            }
                            if (z2) {
                                i6 = i8;
                            }
                        }
                        i2 = i6;
                    } else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((a4) c2.get(i5)).a).getLabel())) {
                        i2 = ((a4) c2.get(i5)).a();
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i2 != -1) {
                    a4 a4Var = new a4((Object) null, i2, string, ni0, (Class) null);
                    View.AccessibilityDelegate a2 = bag.a(view);
                    v3 v3Var = a2 == null ? null : a2 instanceof u3 ? ((u3) a2).a : new v3(a2);
                    if (v3Var == null) {
                        v3Var = new v3();
                    }
                    gag.j(view, v3Var);
                    gag.h(view, a4Var.a());
                    gag.c(view).add(a4Var);
                    gag.e(view, 0);
                }
                sparseIntArray.put(0, i2);
            }
            if (this.I && this.L != 5) {
                gag.i(view, a4.j, new ni0((Object) this, 5, 1));
            }
            int i10 = this.L;
            if (i10 == 3) {
                if (this.b) {
                    i4 = 4;
                }
                gag.i(view, a4.i, new ni0((Object) this, i4, 1));
            } else if (i10 == 4) {
                if (this.b) {
                    i4 = 3;
                }
                gag.i(view, a4.h, new ni0((Object) this, i4, 1));
            } else if (i10 == 6) {
                gag.i(view, a4.i, new ni0((Object) this, 4, 1));
                gag.i(view, a4.h, new ni0((Object) this, 3, 1));
            }
        }
    }

    public final void P(int i2, boolean z2) {
        bh8 bh8 = this.i;
        ValueAnimator valueAnimator = this.B;
        if (i2 != 2) {
            boolean z3 = this.L == 3 && (this.x || G());
            if (this.z != z3 && bh8 != null) {
                this.z = z3;
                float f2 = 1.0f;
                if (!z2 || valueAnimator == null) {
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        valueAnimator.cancel();
                    }
                    if (this.z) {
                        f2 = y();
                    }
                    ah8 ah8 = bh8.a;
                    if (ah8.j != f2) {
                        ah8.j = f2;
                        bh8.v = true;
                        bh8.invalidateSelf();
                    }
                } else if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                } else {
                    float f3 = bh8.a.j;
                    if (z3) {
                        f2 = y();
                    }
                    valueAnimator.setFloatValues(new float[]{f3, f2});
                    valueAnimator.start();
                }
            }
        }
    }

    public final void Q(boolean z2) {
        WeakReference weakReference = this.U;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z2) {
                    if (this.c0 == null) {
                        this.c0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.U.get() && z2) {
                        this.c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z2) {
                    this.c0 = null;
                }
            }
        }
    }

    public final void R() {
        View view;
        if (this.U != null) {
            x();
            if (this.L == 4 && (view = (View) this.U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void a() {
        kg8 kg8 = this.Y;
        if (kg8 != null) {
            we0 we0 = kg8.f;
            kg8.f = null;
            int i2 = 4;
            if (we0 == null || Build.VERSION.SDK_INT < 34) {
                if (this.I) {
                    i2 = 5;
                }
                K(i2);
                return;
            }
            boolean z2 = this.I;
            int i3 = kg8.d;
            int i4 = kg8.c;
            float f2 = we0.c;
            if (z2) {
                z6 z6Var = new z6(3, (Object) this);
                View view = kg8.b;
                float scaleY = view.getScaleY() * ((float) view.getHeight());
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{scaleY});
                ofFloat.setInterpolator(new gh5());
                ofFloat.setDuration((long) xg.c(i4, f2, i3));
                ofFloat.addListener(new z6(9, (Object) kg8));
                ofFloat.addListener(z6Var);
                ofFloat.start();
                return;
            }
            AnimatorSet a2 = kg8.a();
            a2.setDuration((long) xg.c(i4, f2, i3));
            a2.start();
            K(4);
        }
    }

    public final void b(we0 we0) {
        kg8 kg8 = this.Y;
        if (kg8 != null) {
            we0 we02 = kg8.f;
            kg8.f = we0;
            if (we02 != null) {
                kg8.b(we0.c);
            }
        }
    }

    public final void c(we0 we0) {
        kg8 kg8 = this.Y;
        if (kg8 != null) {
            kg8.f = we0;
        }
    }

    public final void d() {
        kg8 kg8 = this.Y;
        if (kg8 != null) {
            we0 we0 = kg8.f;
            kg8.f = null;
            if (we0 != null) {
                AnimatorSet a2 = kg8.a();
                a2.setDuration((long) kg8.e);
                a2.start();
            }
        }
    }

    public final void g(wz3 wz3) {
        this.U = null;
        this.M = null;
        this.Y = null;
    }

    public final void j() {
        this.U = null;
        this.M = null;
        this.Y = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r9.K
            if (r0 != 0) goto L_0x000e
            goto L_0x00dc
        L_0x000e:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L_0x0023
            r9.Z = r4
            r9.a0 = r4
            android.view.VelocityTracker r5 = r9.X
            if (r5 == 0) goto L_0x0023
            r5.recycle()
            r9.X = r3
        L_0x0023:
            android.view.VelocityTracker r5 = r9.X
            if (r5 != 0) goto L_0x002d
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.X = r5
        L_0x002d:
            android.view.VelocityTracker r5 = r9.X
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L_0x0046
            if (r0 == r2) goto L_0x003b
            r11 = 3
            if (r0 == r11) goto L_0x003b
            goto L_0x0089
        L_0x003b:
            r9.b0 = r1
            r9.Z = r4
            boolean r11 = r9.N
            if (r11 == 0) goto L_0x0089
            r9.N = r1
            return r1
        L_0x0046:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.a0 = r7
            int r7 = r9.L
            if (r7 == r5) goto L_0x0078
            java.lang.ref.WeakReference r7 = r9.V
            if (r7 == 0) goto L_0x0061
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0062
        L_0x0061:
            r7 = r3
        L_0x0062:
            if (r7 == 0) goto L_0x0078
            int r8 = r9.a0
            boolean r7 = r10.i(r7, r6, r8)
            if (r7 == 0) goto L_0x0078
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.Z = r7
            r9.b0 = r2
        L_0x0078:
            int r7 = r9.Z
            if (r7 != r4) goto L_0x0086
            int r7 = r9.a0
            boolean r11 = r10.i(r11, r6, r7)
            if (r11 != 0) goto L_0x0086
            r11 = r2
            goto L_0x0087
        L_0x0086:
            r11 = r1
        L_0x0087:
            r9.N = r11
        L_0x0089:
            boolean r11 = r9.N
            if (r11 != 0) goto L_0x0098
            kag r11 = r9.M
            if (r11 == 0) goto L_0x0098
            boolean r11 = r11.q(r12)
            if (r11 == 0) goto L_0x0098
            return r2
        L_0x0098:
            java.lang.ref.WeakReference r11 = r9.V
            if (r11 == 0) goto L_0x00a3
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x00a3:
            if (r0 != r5) goto L_0x00db
            if (r3 == 0) goto L_0x00db
            boolean r11 = r9.N
            if (r11 != 0) goto L_0x00db
            int r11 = r9.L
            if (r11 == r2) goto L_0x00db
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.i(r3, r11, r0)
            if (r10 != 0) goto L_0x00db
            kag r10 = r9.M
            if (r10 == 0) goto L_0x00db
            int r10 = r9.a0
            if (r10 == r4) goto L_0x00db
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            kag r9 = r9.M
            int r9 = r9.b
            float r9 = (float) r9
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x00db
            r1 = r2
        L_0x00db:
            return r1
        L_0x00dc:
            r9.N = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v15, types: [r3, java.lang.Object] */
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3 = this.l;
        bh8 bh8 = this.i;
        WeakHashMap weakHashMap = gag.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i4 = 0;
        if (this.U == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(iec.design_bottom_sheet_peek_height_min);
            boolean z2 = !this.n && !this.f;
            if (this.o || this.p || this.q || this.s || this.t || this.u || z2) {
                qr0 qr0 = new qr0((Object) this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ? obj = new Object();
                obj.a = paddingStart;
                obj.b = paddingEnd;
                obj.c = paddingBottom;
                v9g.u(view, new p7d(26, (Object) qr0, (Object) obj));
                if (view.isAttachedToWindow()) {
                    t9g.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new di7(1));
                }
            }
            gag.l(view, new xh7(view));
            this.U = new WeakReference(view);
            this.Y = new kg8(view);
            if (bh8 != null) {
                view.setBackground(bh8);
                float f2 = this.H;
                if (f2 == -1.0f) {
                    f2 = v9g.i(view);
                }
                bh8.k(f2);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    v9g.q(view, colorStateList);
                }
            }
            O();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.M == null) {
            this.M = new kag(coordinatorLayout.getContext(), coordinatorLayout, this.e0);
        }
        int top = view.getTop();
        coordinatorLayout.k(view, i2);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.R = height;
        int i5 = this.T;
        int i6 = i5 - height;
        int i7 = this.w;
        if (i6 < i7) {
            if (this.r) {
                if (i3 != -1) {
                    i5 = Math.min(i5, i3);
                }
                this.R = i5;
            } else {
                int i8 = i5 - i7;
                if (i3 != -1) {
                    i8 = Math.min(i8, i3);
                }
                this.R = i8;
            }
        }
        this.D = Math.max(0, this.T - this.R);
        this.E = (int) ((1.0f - this.F) * ((float) this.T));
        x();
        int i9 = this.L;
        if (i9 == 3) {
            view.offsetTopAndBottom(E());
        } else if (i9 == 6) {
            view.offsetTopAndBottom(this.E);
        } else if (this.I && i9 == 5) {
            view.offsetTopAndBottom(this.T);
        } else if (i9 == 4) {
            view.offsetTopAndBottom(this.G);
        } else if (i9 == 1 || i9 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        P(this.L, false);
        this.V = new WeakReference(B(view));
        while (true) {
            ArrayList arrayList = this.W;
            if (i4 >= arrayList.size()) {
                return true;
            }
            ((sr0) arrayList.get(i4)).a(view);
            i4++;
        }
    }

    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(D(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.k, marginLayoutParams.width), D(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    public final boolean n(View view) {
        WeakReference weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        if (i4 != 1) {
            WeakReference weakReference = this.V;
            if (view2 == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = view.getTop();
                int i5 = top - i3;
                if (i3 > 0) {
                    if (i5 < E()) {
                        int E2 = top - E();
                        iArr[1] = E2;
                        int i6 = -E2;
                        WeakHashMap weakHashMap = gag.a;
                        view.offsetTopAndBottom(i6);
                        L(3);
                    } else if (this.K) {
                        iArr[1] = i3;
                        WeakHashMap weakHashMap2 = gag.a;
                        view.offsetTopAndBottom(-i3);
                        L(1);
                    } else {
                        return;
                    }
                } else if (i3 < 0 && !view2.canScrollVertically(-1)) {
                    int i7 = this.G;
                    if (i5 > i7 && !this.I) {
                        int i8 = top - i7;
                        iArr[1] = i8;
                        int i9 = -i8;
                        WeakHashMap weakHashMap3 = gag.a;
                        view.offsetTopAndBottom(i9);
                        L(4);
                    } else if (this.K) {
                        iArr[1] = i3;
                        WeakHashMap weakHashMap4 = gag.a;
                        view.offsetTopAndBottom(-i3);
                        L(1);
                    } else {
                        return;
                    }
                }
                A(view.getTop());
                this.O = i3;
                this.P = true;
            }
        }
    }

    public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    public final void r(View view, Parcelable parcelable) {
        tr0 tr0 = (tr0) parcelable;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.e = tr0.o;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.b = tr0.v;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.I = tr0.w;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.J = tr0.x;
            }
        }
        int i3 = tr0.c;
        if (i3 == 1 || i3 == 2) {
            this.L = 4;
        } else {
            this.L = i3;
        }
    }

    public final Parcelable s(View view) {
        return new tr0(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        this.O = 0;
        this.P = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r4.getTop() <= r2.E) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (java.lang.Math.abs(r3 - r2.D) < java.lang.Math.abs(r3 - r2.G)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r3 < java.lang.Math.abs(r3 - r2.G)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.G)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.G)) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.E()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.L(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference r3 = r2.V
            if (r3 == 0) goto L_0x00b5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x00b5
            boolean r3 = r2.P
            if (r3 != 0) goto L_0x001f
            goto L_0x00b5
        L_0x001f:
            int r3 = r2.O
            r5 = 6
            if (r3 <= 0) goto L_0x0034
            boolean r3 = r2.b
            if (r3 == 0) goto L_0x002a
            goto L_0x00af
        L_0x002a:
            int r3 = r4.getTop()
            int r6 = r2.E
            if (r3 <= r6) goto L_0x00af
            goto L_0x00ae
        L_0x0034:
            boolean r3 = r2.I
            if (r3 == 0) goto L_0x0055
            android.view.VelocityTracker r3 = r2.X
            if (r3 != 0) goto L_0x003e
            r3 = 0
            goto L_0x004d
        L_0x003e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.X
            int r6 = r2.Z
            float r3 = r3.getYVelocity(r6)
        L_0x004d:
            boolean r3 = r2.M(r4, r3)
            if (r3 == 0) goto L_0x0055
            r0 = 5
            goto L_0x00af
        L_0x0055:
            int r3 = r2.O
            r6 = 4
            if (r3 != 0) goto L_0x0093
            int r3 = r4.getTop()
            boolean r1 = r2.b
            if (r1 == 0) goto L_0x0074
            int r5 = r2.D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0097
            goto L_0x00af
        L_0x0074:
            int r1 = r2.E
            if (r3 >= r1) goto L_0x0083
            int r6 = r2.G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L_0x00ae
            goto L_0x00af
        L_0x0083:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0097
            goto L_0x00ae
        L_0x0093:
            boolean r3 = r2.b
            if (r3 == 0) goto L_0x0099
        L_0x0097:
            r0 = r6
            goto L_0x00af
        L_0x0099:
            int r3 = r4.getTop()
            int r0 = r2.E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0097
        L_0x00ae:
            r0 = r5
        L_0x00af:
            r3 = 0
            r2.N(r0, r4, r3)
            r2.P = r3
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.L;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        kag kag = this.M;
        if (kag != null && (this.K || i2 == 1)) {
            kag.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Z = -1;
            this.a0 = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && ((this.K || this.L == 1) && actionMasked == 2 && !this.N)) {
            float abs = Math.abs(((float) this.a0) - motionEvent.getY());
            kag kag2 = this.M;
            if (abs > ((float) kag2.b)) {
                kag2.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void w(sr0 sr0) {
        ArrayList arrayList = this.W;
        if (!arrayList.contains(sr0)) {
            arrayList.add(sr0);
        }
    }

    public final void x() {
        int z2 = z();
        if (this.b) {
            this.G = Math.max(this.T - z2, this.D);
        } else {
            this.G = this.T - z2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float y() {
        /*
            r5 = this;
            bh8 r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L_0x0079
            java.lang.ref.WeakReference r0 = r5.U
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0079
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L_0x0079
            java.lang.ref.WeakReference r0 = r5.U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.G()
            if (r2 == 0) goto L_0x0079
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L_0x0079
            bh8 r2 = r5.i
            ah8 r3 = r2.a
            j4e r3 = r3.a
            m04 r3 = r3.e
            android.graphics.RectF r2 = r2.h()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = r0.getRoundedCorner(0)
            if (r3 == 0) goto L_0x004e
            int r3 = r3.getRadius()
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x004e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x004e
            float r3 = r3 / r2
            goto L_0x004f
        L_0x004e:
            r3 = r1
        L_0x004f:
            bh8 r5 = r5.i
            ah8 r2 = r5.a
            j4e r2 = r2.a
            m04 r2 = r2.f
            android.graphics.RectF r5 = r5.h()
            float r5 = r2.a(r5)
            android.view.RoundedCorner r0 = r0.getRoundedCorner(1)
            if (r0 == 0) goto L_0x0074
            int r0 = r0.getRadius()
            float r0 = (float) r0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0074
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0074
            float r1 = r0 / r5
        L_0x0074:
            float r5 = java.lang.Math.max(r3, r1)
            return r5
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.y():float");
    }

    public final int z() {
        int i2;
        int i3;
        int i4;
        if (this.f) {
            i2 = Math.min(Math.max(this.g, this.T - ((this.S * 9) / 16)), this.R);
            i3 = this.v;
        } else if (!this.n && !this.o && (i4 = this.m) > 0) {
            return Math.max(this.e, i4 + this.h);
        } else {
            i2 = this.e;
            i3 = this.v;
        }
        return i2 + i3;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        this.h = context.getResources().getDimensionPixelSize(iec.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnc.BottomSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(tnc.BottomSheetBehavior_Layout_backgroundTint)) {
            this.j = m5a.C(context, obtainStyledAttributes, tnc.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(tnc.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.y = j4e.b(context, attributeSet, edc.bottomSheetStyle, f0).c();
        }
        j4e j4e = this.y;
        if (j4e != null) {
            bh8 bh8 = new bh8(j4e);
            this.i = bh8;
            bh8.j(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{y(), 1.0f});
        this.B = ofFloat;
        ofFloat.setDuration(500);
        this.B.addUpdateListener(new sk0(1, this));
        this.H = obtainStyledAttributes.getDimension(tnc.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (obtainStyledAttributes.hasValue(tnc.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(tnc.BottomSheetBehavior_Layout_android_maxWidth, -1);
        }
        if (obtainStyledAttributes.hasValue(tnc.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(tnc.BottomSheetBehavior_Layout_android_maxHeight, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(tnc.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            J(obtainStyledAttributes.getDimensionPixelSize(tnc.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            J(i2);
        }
        I(obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.n = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        H(obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.J = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.K = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.a = obtainStyledAttributes.getInt(tnc.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f2 = obtainStyledAttributes.getFloat(tnc.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f2 <= c44.DEFAULT_ASPECT_RATIO || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.F = f2;
        if (this.U != null) {
            this.E = (int) ((1.0f - f2) * ((float) this.T));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(tnc.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(tnc.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);
            if (dimensionPixelOffset >= 0) {
                this.C = dimensionPixelOffset;
                P(this.L, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i3 = peekValue2.data;
            if (i3 >= 0) {
                this.C = i3;
                P(this.L, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.d = obtainStyledAttributes.getInt(tnc.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
        this.o = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.p = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.q = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.r = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.s = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.t = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.u = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.x = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
