package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

public class CoordinatorLayout extends ViewGroup implements j6a, k6a {
    public static final String E0;
    public static final Class[] F0 = {Context.class, AttributeSet.class};
    public static final ThreadLocal G0 = new ThreadLocal();
    public static final cx4 H0 = new cx4(18);
    public static final xqb I0 = new xqb(12);
    public Drawable A0;
    public ViewGroup.OnHierarchyChangeListener B0;
    public er7 C0;
    public final ft D0;
    public final ArrayList a;
    public final qpg b;
    public final ArrayList c;
    public final int[] o;
    public final int[] v;
    public View v0;
    public boolean w;
    public xz3 w0;
    public boolean x;
    public boolean x0;
    public final int[] y;
    public iog y0;
    public View z;
    public boolean z0;

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        E0 = packageR != null ? packageR.getName() : null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zcc.coordinatorLayoutStyle);
    }

    public static Rect a() {
        Rect rect = (Rect) I0.c();
        return rect == null ? new Rect() : rect;
    }

    public static void g(int i, Rect rect, Rect rect2, wz3 wz3, int i2, int i3) {
        int i4 = wz3.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = wz3.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public static wz3 h(View view) {
        wz3 wz3 = (wz3) view.getLayoutParams();
        if (!wz3.b) {
            if (view instanceof sz3) {
                wz3.b(((sz3) view).getBehavior());
                wz3.b = true;
            } else {
                uz3 uz3 = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    uz3 = (uz3) cls.getAnnotation(uz3.class);
                    if (uz3 != null) {
                        break;
                    }
                }
                if (uz3 != null) {
                    try {
                        wz3.b((tz3) uz3.value().getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
                    } catch (Exception unused) {
                        uz3.value().getClass();
                    }
                }
                wz3.b = true;
            }
        }
        return wz3;
    }

    public static void w(View view, int i) {
        wz3 wz3 = (wz3) view.getLayoutParams();
        int i2 = wz3.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = gag.a;
            view.offsetLeftAndRight(i - i2);
            wz3.i = i;
        }
    }

    public static void x(View view, int i) {
        wz3 wz3 = (wz3) view.getLayoutParams();
        int i2 = wz3.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = gag.a;
            view.offsetTopAndBottom(i - i2);
            wz3.j = i;
        }
    }

    public final void b(wz3 wz3, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + wz3.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - wz3.rightMargin));
        int max2 = Math.max(getPaddingTop() + wz3.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - wz3.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void c(View view) {
        ArrayList arrayList = (ArrayList) ((qae) this.b.b).get(view);
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                View view2 = (View) arrayList.get(i);
                tz3 tz3 = ((wz3) view2.getLayoutParams()).a;
                if (tz3 != null) {
                    tz3.h(this, view2, view);
                }
            }
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof wz3) && super.checkLayoutParams(layoutParams);
    }

    public final void d(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            f(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        tz3 tz3 = ((wz3) view.getLayoutParams()).a;
        if (tz3 != null) {
            tz3.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final List e(View view) {
        qae qae = (qae) this.b.b;
        int i = qae.c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) qae.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(qae.f(i2));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public final void f(Rect rect, View view) {
        ThreadLocal threadLocal = oag.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = oag.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        oag.a(this, view, matrix);
        ThreadLocal threadLocal3 = oag.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new wz3(-2, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new wz3(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.a);
    }

    public final iog getLastWindowInsets() {
        return this.y0;
    }

    public int getNestedScrollAxes() {
        ft ftVar = this.D0;
        return ftVar.c | ftVar.b;
    }

    public Drawable getStatusBarBackground() {
        return this.A0;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final boolean i(View view, int i, int i2) {
        xqb xqb = I0;
        Rect a2 = a();
        f(a2, view);
        try {
            return a2.contains(i, i2);
        } finally {
            a2.setEmpty();
            xqb.b(a2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0044 A[EDGE_INSN: B:139:0x0044->B:8:0x0044 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(int r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.util.WeakHashMap r7 = defpackage.gag.a
            int r7 = r25.getLayoutDirection()
            java.util.ArrayList r14 = r0.a
            int r15 = r14.size()
            android.graphics.Rect r13 = a()
            android.graphics.Rect r12 = a()
            android.graphics.Rect r11 = a()
            r9 = 0
        L_0x001d:
            xqb r8 = I0
            if (r9 >= r15) goto L_0x0321
            java.lang.Object r16 = r14.get(r9)
            r2 = r16
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r16 = r2.getLayoutParams()
            r3 = r16
            wz3 r3 = (defpackage.wz3) r3
            if (r1 != 0) goto L_0x0047
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x0047
            r5 = r1
            r6 = r7
            r21 = r9
            r8 = r11
            r4 = r12
            r7 = r13
            r3 = r14
            r10 = 0
        L_0x0044:
            r12 = 1
            goto L_0x0317
        L_0x0047:
            r4 = 0
        L_0x0048:
            if (r4 >= r9) goto L_0x010d
            java.lang.Object r5 = r14.get(r4)
            android.view.View r5 = (android.view.View) r5
            android.view.View r6 = r3.l
            if (r6 != r5) goto L_0x00e5
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            wz3 r5 = (defpackage.wz3) r5
            android.view.View r6 = r5.k
            if (r6 == 0) goto L_0x00e5
            android.graphics.Rect r6 = a()
            android.graphics.Rect r10 = a()
            r18 = r14
            android.graphics.Rect r14 = a()
            r19 = r8
            android.view.View r8 = r5.k
            r0.f(r6, r8)
            r8 = 0
            r0.d(r2, r10, r8)
            r17 = r15
            int r15 = r2.getMeasuredWidth()
            int r1 = r2.getMeasuredHeight()
            r20 = r3
            r3 = r19
            r19 = r8
            r8 = r7
            r21 = r9
            r9 = r6
            r19 = r7
            r7 = r10
            r10 = r14
            r22 = r11
            r11 = r5
            r23 = r12
            r12 = r15
            r24 = r13
            r13 = r1
            g(r8, r9, r10, r11, r12, r13)
            int r8 = r14.left
            int r9 = r7.left
            if (r8 != r9) goto L_0x00aa
            int r8 = r14.top
            int r9 = r7.top
            if (r8 == r9) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r10 = 0
            goto L_0x00ab
        L_0x00aa:
            r10 = 1
        L_0x00ab:
            r0.b(r5, r14, r15, r1)
            int r1 = r14.left
            int r8 = r7.left
            int r1 = r1 - r8
            int r8 = r14.top
            int r9 = r7.top
            int r8 = r8 - r9
            if (r1 == 0) goto L_0x00bf
            java.util.WeakHashMap r9 = defpackage.gag.a
            r2.offsetLeftAndRight(r1)
        L_0x00bf:
            if (r8 == 0) goto L_0x00c6
            java.util.WeakHashMap r1 = defpackage.gag.a
            r2.offsetTopAndBottom(r8)
        L_0x00c6:
            if (r10 == 0) goto L_0x00d1
            tz3 r1 = r5.a
            if (r1 == 0) goto L_0x00d1
            android.view.View r5 = r5.k
            r1.h(r0, r2, r5)
        L_0x00d1:
            r6.setEmpty()
            r3.b(r6)
            r7.setEmpty()
            r3.b(r7)
            r14.setEmpty()
            r3.b(r14)
        L_0x00e3:
            r1 = 1
            goto L_0x00f7
        L_0x00e5:
            r20 = r3
            r19 = r7
            r3 = r8
            r21 = r9
            r22 = r11
            r23 = r12
            r24 = r13
            r18 = r14
            r17 = r15
            goto L_0x00e3
        L_0x00f7:
            int r4 = r4 + r1
            r1 = r26
            r8 = r3
            r15 = r17
            r14 = r18
            r7 = r19
            r3 = r20
            r9 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            goto L_0x0048
        L_0x010d:
            r20 = r3
            r19 = r7
            r3 = r8
            r21 = r9
            r22 = r11
            r4 = r12
            r24 = r13
            r18 = r14
            r17 = r15
            r1 = 1
            r0.d(r2, r4, r1)
            r1 = r20
            int r5 = r1.g
            if (r5 == 0) goto L_0x0184
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0184
            int r5 = r1.g
            r6 = r19
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r7 = r5 & 112(0x70, float:1.57E-43)
            r8 = 48
            if (r7 == r8) goto L_0x0154
            r8 = 80
            if (r7 == r8) goto L_0x0142
            r7 = r24
            goto L_0x0160
        L_0x0142:
            r7 = r24
            int r8 = r7.bottom
            int r9 = r25.getHeight()
            int r10 = r4.top
            int r9 = r9 - r10
            int r8 = java.lang.Math.max(r8, r9)
            r7.bottom = r8
            goto L_0x0160
        L_0x0154:
            r7 = r24
            int r8 = r7.top
            int r9 = r4.bottom
            int r8 = java.lang.Math.max(r8, r9)
            r7.top = r8
        L_0x0160:
            r5 = r5 & 7
            r8 = 3
            if (r5 == r8) goto L_0x0179
            r8 = 5
            if (r5 == r8) goto L_0x0169
            goto L_0x0188
        L_0x0169:
            int r5 = r7.right
            int r8 = r25.getWidth()
            int r9 = r4.left
            int r8 = r8 - r9
            int r5 = java.lang.Math.max(r5, r8)
            r7.right = r5
            goto L_0x0188
        L_0x0179:
            int r5 = r7.left
            int r8 = r4.right
            int r5 = java.lang.Math.max(r5, r8)
            r7.left = r5
            goto L_0x0188
        L_0x0184:
            r6 = r19
            r7 = r24
        L_0x0188:
            int r1 = r1.h
            if (r1 == 0) goto L_0x029b
            int r1 = r2.getVisibility()
            if (r1 != 0) goto L_0x029b
            java.util.WeakHashMap r1 = defpackage.gag.a
            boolean r1 = r2.isLaidOut()
            if (r1 != 0) goto L_0x019c
            goto L_0x029b
        L_0x019c:
            int r1 = r2.getWidth()
            if (r1 <= 0) goto L_0x029b
            int r1 = r2.getHeight()
            if (r1 > 0) goto L_0x01aa
            goto L_0x029b
        L_0x01aa:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            wz3 r1 = (defpackage.wz3) r1
            tz3 r5 = r1.a
            android.graphics.Rect r8 = a()
            android.graphics.Rect r9 = a()
            int r10 = r2.getLeft()
            int r11 = r2.getTop()
            int r12 = r2.getRight()
            int r13 = r2.getBottom()
            r9.set(r10, r11, r12, r13)
            if (r5 == 0) goto L_0x0200
            boolean r5 = r5.e(r8, r2)
            if (r5 == 0) goto L_0x0200
            boolean r5 = r9.contains(r8)
            if (r5 == 0) goto L_0x01dc
            goto L_0x0203
        L_0x01dc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Rect should be within the child's bounds. Rect:"
            r1.<init>(r2)
            java.lang.String r2 = r8.toShortString()
            r1.append(r2)
            java.lang.String r2 = " | Bounds:"
            r1.append(r2)
            java.lang.String r2 = r9.toShortString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0200:
            r8.set(r9)
        L_0x0203:
            r9.setEmpty()
            r3.b(r9)
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L_0x0217
            r8.setEmpty()
            r3.b(r8)
            goto L_0x029b
        L_0x0217:
            int r5 = r1.h
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r9 = 48
            r10 = r5 & 48
            if (r10 != r9) goto L_0x0237
            int r10 = r8.top
            int r11 = r1.topMargin
            int r10 = r10 - r11
            int r11 = r1.j
            int r10 = r10 - r11
            int r11 = r7.top
            if (r10 >= r11) goto L_0x0237
            int r11 = r11 - r10
            x(r2, r11)
            r10 = 1
        L_0x0234:
            r11 = 80
            goto L_0x0239
        L_0x0237:
            r10 = 0
            goto L_0x0234
        L_0x0239:
            r12 = r5 & 80
            if (r12 != r11) goto L_0x0253
            int r12 = r25.getHeight()
            int r13 = r8.bottom
            int r12 = r12 - r13
            int r13 = r1.bottomMargin
            int r12 = r12 - r13
            int r13 = r1.j
            int r12 = r12 + r13
            int r13 = r7.bottom
            if (r12 >= r13) goto L_0x0253
            int r12 = r12 - r13
            x(r2, r12)
            r10 = 1
        L_0x0253:
            if (r10 != 0) goto L_0x025b
            r10 = 0
            x(r2, r10)
        L_0x0259:
            r12 = 3
            goto L_0x025d
        L_0x025b:
            r10 = 0
            goto L_0x0259
        L_0x025d:
            r13 = r5 & 3
            if (r13 != r12) goto L_0x0274
            int r13 = r8.left
            int r14 = r1.leftMargin
            int r13 = r13 - r14
            int r14 = r1.i
            int r13 = r13 - r14
            int r14 = r7.left
            if (r13 >= r14) goto L_0x0274
            int r14 = r14 - r13
            w(r2, r14)
            r13 = 1
        L_0x0272:
            r14 = 5
            goto L_0x0276
        L_0x0274:
            r13 = r10
            goto L_0x0272
        L_0x0276:
            r5 = r5 & r14
            if (r5 != r14) goto L_0x028f
            int r5 = r25.getWidth()
            int r15 = r8.right
            int r5 = r5 - r15
            int r15 = r1.rightMargin
            int r5 = r5 - r15
            int r1 = r1.i
            int r5 = r5 + r1
            int r1 = r7.right
            if (r5 >= r1) goto L_0x028f
            int r5 = r5 - r1
            w(r2, r5)
            r13 = 1
        L_0x028f:
            if (r13 != 0) goto L_0x0294
            w(r2, r10)
        L_0x0294:
            r8.setEmpty()
            r3.b(r8)
            goto L_0x02a2
        L_0x029b:
            r9 = 48
            r10 = 0
            r11 = 80
            r12 = 3
            r14 = 5
        L_0x02a2:
            r1 = 2
            r5 = r26
            if (r5 == r1) goto L_0x02cd
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            wz3 r3 = (defpackage.wz3) r3
            android.graphics.Rect r3 = r3.q
            r8 = r22
            r8.set(r3)
            boolean r3 = r8.equals(r4)
            if (r3 == 0) goto L_0x02c0
            r15 = r17
            r3 = r18
            goto L_0x0044
        L_0x02c0:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            wz3 r3 = (defpackage.wz3) r3
            android.graphics.Rect r3 = r3.q
            r3.set(r4)
        L_0x02cb:
            r3 = 1
            goto L_0x02d0
        L_0x02cd:
            r8 = r22
            goto L_0x02cb
        L_0x02d0:
            int r13 = r21 + 1
            r15 = r17
        L_0x02d4:
            r3 = r18
            if (r13 >= r15) goto L_0x0044
            java.lang.Object r16 = r3.get(r13)
            r9 = r16
            android.view.View r9 = (android.view.View) r9
            android.view.ViewGroup$LayoutParams r16 = r9.getLayoutParams()
            r11 = r16
            wz3 r11 = (defpackage.wz3) r11
            tz3 r12 = r11.a
            if (r12 == 0) goto L_0x02fa
            boolean r16 = r12.f(r9, r2)
            if (r16 == 0) goto L_0x02fa
            if (r5 != 0) goto L_0x02fc
            boolean r14 = r11.p
            if (r14 == 0) goto L_0x02fc
            r11.p = r10
        L_0x02fa:
            r12 = 1
            goto L_0x030d
        L_0x02fc:
            if (r5 == r1) goto L_0x0304
            boolean r9 = r12.h(r0, r9, r2)
        L_0x0302:
            r12 = 1
            goto L_0x0309
        L_0x0304:
            r12.i(r0, r2)
            r9 = 1
            goto L_0x0302
        L_0x0309:
            if (r5 != r12) goto L_0x030d
            r11.p = r9
        L_0x030d:
            int r13 = r13 + r12
            r18 = r3
            r9 = 48
            r11 = 80
            r12 = 3
            r14 = 5
            goto L_0x02d4
        L_0x0317:
            int r9 = r21 + 1
            r14 = r3
            r12 = r4
            r1 = r5
            r13 = r7
            r11 = r8
            r7 = r6
            goto L_0x001d
        L_0x0321:
            r3 = r8
            r8 = r11
            r4 = r12
            r7 = r13
            r7.setEmpty()
            r3.b(r7)
            r4.setEmpty()
            r3.b(r4)
            r8.setEmpty()
            r3.b(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.j(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(android.view.View r13, int r14) {
        /*
            r12 = this;
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            wz3 r0 = (defpackage.wz3) r0
            android.view.View r1 = r0.k
            if (r1 != 0) goto L_0x0018
            int r2 = r0.f
            r3 = -1
            if (r2 != r3) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."
            r12.<init>(r13)
            throw r12
        L_0x0018:
            xqb r2 = I0
            if (r1 == 0) goto L_0x0068
            android.graphics.Rect r0 = a()
            android.graphics.Rect r9 = a()
            r12.f(r0, r1)     // Catch:{ all -> 0x005a }
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()     // Catch:{ all -> 0x005a }
            wz3 r1 = (defpackage.wz3) r1     // Catch:{ all -> 0x005a }
            int r10 = r13.getMeasuredWidth()     // Catch:{ all -> 0x005a }
            int r11 = r13.getMeasuredHeight()     // Catch:{ all -> 0x005a }
            r3 = r14
            r4 = r0
            r5 = r9
            r6 = r1
            r7 = r10
            r8 = r11
            g(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x005a }
            r12.b(r1, r9, r10, r11)     // Catch:{ all -> 0x005a }
            int r12 = r9.left     // Catch:{ all -> 0x005a }
            int r14 = r9.top     // Catch:{ all -> 0x005a }
            int r1 = r9.right     // Catch:{ all -> 0x005a }
            int r3 = r9.bottom     // Catch:{ all -> 0x005a }
            r13.layout(r12, r14, r1, r3)     // Catch:{ all -> 0x005a }
            r0.setEmpty()
            r2.b(r0)
            r9.setEmpty()
            r2.b(r9)
            goto L_0x01a8
        L_0x005a:
            r12 = move-exception
            r0.setEmpty()
            r2.b(r0)
            r9.setEmpty()
            r2.b(r9)
            throw r12
        L_0x0068:
            int r0 = r0.e
            if (r0 < 0) goto L_0x00fd
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            wz3 r1 = (defpackage.wz3) r1
            int r2 = r1.c
            if (r2 != 0) goto L_0x0079
            r2 = 8388661(0x800035, float:1.1755018E-38)
        L_0x0079:
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r14)
            r3 = r2 & 7
            r2 = r2 & 112(0x70, float:1.57E-43)
            int r4 = r12.getWidth()
            int r5 = r12.getHeight()
            int r6 = r13.getMeasuredWidth()
            int r7 = r13.getMeasuredHeight()
            r8 = 1
            if (r14 != r8) goto L_0x0096
            int r0 = r4 - r0
        L_0x0096:
            int[] r14 = r12.y
            r9 = 0
            if (r14 != 0) goto L_0x00a0
            r12.toString()
        L_0x009e:
            r14 = r9
            goto L_0x00ad
        L_0x00a0:
            if (r0 < 0) goto L_0x00a9
            int r10 = r14.length
            if (r0 < r10) goto L_0x00a6
            goto L_0x00a9
        L_0x00a6:
            r14 = r14[r0]
            goto L_0x00ad
        L_0x00a9:
            r12.toString()
            goto L_0x009e
        L_0x00ad:
            int r14 = r14 - r6
            if (r3 == r8) goto L_0x00b6
            r0 = 5
            if (r3 == r0) goto L_0x00b4
            goto L_0x00b9
        L_0x00b4:
            int r14 = r14 + r6
            goto L_0x00b9
        L_0x00b6:
            int r0 = r6 / 2
            int r14 = r14 + r0
        L_0x00b9:
            r0 = 16
            if (r2 == r0) goto L_0x00c4
            r0 = 80
            if (r2 == r0) goto L_0x00c2
            goto L_0x00c6
        L_0x00c2:
            r9 = r7
            goto L_0x00c6
        L_0x00c4:
            int r9 = r7 / 2
        L_0x00c6:
            int r0 = r12.getPaddingLeft()
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r12.getPaddingRight()
            int r4 = r4 - r2
            int r4 = r4 - r6
            int r2 = r1.rightMargin
            int r4 = r4 - r2
            int r14 = java.lang.Math.min(r14, r4)
            int r14 = java.lang.Math.max(r0, r14)
            int r0 = r12.getPaddingTop()
            int r2 = r1.topMargin
            int r0 = r0 + r2
            int r12 = r12.getPaddingBottom()
            int r5 = r5 - r12
            int r5 = r5 - r7
            int r12 = r1.bottomMargin
            int r5 = r5 - r12
            int r12 = java.lang.Math.min(r9, r5)
            int r12 = java.lang.Math.max(r0, r12)
            int r6 = r6 + r14
            int r7 = r7 + r12
            r13.layout(r14, r12, r6, r7)
            goto L_0x01a8
        L_0x00fd:
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            wz3 r0 = (defpackage.wz3) r0
            android.graphics.Rect r1 = a()
            int r3 = r12.getPaddingLeft()
            int r4 = r0.leftMargin
            int r3 = r3 + r4
            int r4 = r12.getPaddingTop()
            int r5 = r0.topMargin
            int r4 = r4 + r5
            int r5 = r12.getWidth()
            int r6 = r12.getPaddingRight()
            int r5 = r5 - r6
            int r6 = r0.rightMargin
            int r5 = r5 - r6
            int r6 = r12.getHeight()
            int r7 = r12.getPaddingBottom()
            int r6 = r6 - r7
            int r7 = r0.bottomMargin
            int r6 = r6 - r7
            r1.set(r3, r4, r5, r6)
            iog r3 = r12.y0
            if (r3 == 0) goto L_0x016e
            java.util.WeakHashMap r3 = defpackage.gag.a
            boolean r3 = r12.getFitsSystemWindows()
            if (r3 == 0) goto L_0x016e
            boolean r3 = r13.getFitsSystemWindows()
            if (r3 != 0) goto L_0x016e
            int r3 = r1.left
            iog r4 = r12.y0
            int r4 = r4.b()
            int r4 = r4 + r3
            r1.left = r4
            int r3 = r1.top
            iog r4 = r12.y0
            int r4 = r4.d()
            int r4 = r4 + r3
            r1.top = r4
            int r3 = r1.right
            iog r4 = r12.y0
            int r4 = r4.c()
            int r3 = r3 - r4
            r1.right = r3
            int r3 = r1.bottom
            iog r12 = r12.y0
            int r12 = r12.a()
            int r3 = r3 - r12
            r1.bottom = r3
        L_0x016e:
            android.graphics.Rect r12 = a()
            int r0 = r0.c
            r3 = r0 & 7
            if (r3 != 0) goto L_0x017c
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r0 = r0 | r3
        L_0x017c:
            r3 = r0 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0182
            r0 = r0 | 48
        L_0x0182:
            r3 = r0
            int r4 = r13.getMeasuredWidth()
            int r5 = r13.getMeasuredHeight()
            r6 = r1
            r7 = r12
            r8 = r14
            android.view.Gravity.apply(r3, r4, r5, r6, r7, r8)
            int r14 = r12.left
            int r0 = r12.top
            int r3 = r12.right
            int r4 = r12.bottom
            r13.layout(r14, r0, r3, r4)
            r1.setEmpty()
            r2.b(r1)
            r12.setEmpty()
            r2.b(r12)
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.k(android.view.View, int):void");
    }

    public final void l(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    public final boolean m(tz3 tz3, View view, MotionEvent motionEvent, int i) {
        if (i == 0) {
            return tz3.k(this, view, motionEvent);
        }
        if (i == 1) {
            return tz3.v(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    public final void n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        tz3 tz3;
        boolean z2;
        int min;
        int childCount = getChildCount();
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                wz3 wz3 = (wz3) childAt.getLayoutParams();
                if (wz3.a(i5) && (tz3 = wz3.a) != null) {
                    int[] iArr2 = this.o;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    int[] iArr3 = iArr2;
                    tz3.p(this, childAt, view, i, i2, i3, i4, i5, iArr3);
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    if (i4 > 0) {
                        z2 = true;
                        min = Math.max(i7, iArr3[1]);
                    } else {
                        z2 = true;
                        min = Math.min(i7, iArr3[1]);
                    }
                    i7 = min;
                    z3 = z2;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z3) {
            j(1);
        }
    }

    public final void o(View view, int i, int i2, int i3, int i4, int i5) {
        n(view, i, i2, i3, i4, 0, this.v);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        if (this.x0) {
            if (this.w0 == null) {
                this.w0 = new xz3(0, this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.w0);
        }
        if (this.y0 == null) {
            WeakHashMap weakHashMap = gag.a;
            if (getFitsSystemWindows()) {
                t9g.c(this);
            }
        }
        this.x = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
        if (this.x0 && this.w0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.w0);
        }
        View view = this.v0;
        if (view != null) {
            s(view, 0);
        }
        this.x = false;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.z0 && this.A0 != null) {
            iog iog = this.y0;
            int d = iog != null ? iog.d() : 0;
            if (d > 0) {
                this.A0.setBounds(0, 0, getWidth(), d);
                this.A0.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v();
        }
        boolean q = q(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.z = null;
            v();
        }
        return q;
    }

    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        tz3 tz3;
        WeakHashMap weakHashMap = gag.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((tz3 = ((wz3) view.getLayoutParams()).a) == null || !tz3.l(this, view, layoutDirection))) {
                k(view, layoutDirection);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0193, code lost:
        if (r0.m(r30, r20, r8, r21, r24) == false) goto L_0x01a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r6 = r30
            r7 = 0
            r8 = 1
            r30.u()
            int r0 = r30.getChildCount()
            r1 = r7
        L_0x000c:
            if (r1 >= r0) goto L_0x0031
            android.view.View r2 = r6.getChildAt(r1)
            qpg r3 = r6.b
            java.lang.Object r3 = r3.b
            qae r3 = (defpackage.qae) r3
            int r4 = r3.c
            r5 = r7
        L_0x001b:
            if (r5 >= r4) goto L_0x002f
            java.lang.Object r9 = r3.i(r5)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002d
            boolean r9 = r9.contains(r2)
            if (r9 == 0) goto L_0x002d
            r0 = r8
            goto L_0x0032
        L_0x002d:
            int r5 = r5 + r8
            goto L_0x001b
        L_0x002f:
            int r1 = r1 + r8
            goto L_0x000c
        L_0x0031:
            r0 = r7
        L_0x0032:
            boolean r1 = r6.x0
            if (r0 == r1) goto L_0x0066
            if (r0 == 0) goto L_0x0053
            boolean r0 = r6.x
            if (r0 == 0) goto L_0x0050
            xz3 r0 = r6.w0
            if (r0 != 0) goto L_0x0047
            xz3 r0 = new xz3
            r0.<init>(r7, r6)
            r6.w0 = r0
        L_0x0047:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            xz3 r1 = r6.w0
            r0.addOnPreDrawListener(r1)
        L_0x0050:
            r6.x0 = r8
            goto L_0x0066
        L_0x0053:
            boolean r0 = r6.x
            if (r0 == 0) goto L_0x0064
            xz3 r0 = r6.w0
            if (r0 == 0) goto L_0x0064
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            xz3 r1 = r6.w0
            r0.removeOnPreDrawListener(r1)
        L_0x0064:
            r6.x0 = r7
        L_0x0066:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            java.util.WeakHashMap r2 = defpackage.gag.a
            int r11 = r30.getLayoutDirection()
            if (r11 != r8) goto L_0x0080
            r12 = r8
            goto L_0x0081
        L_0x0080:
            r12 = r7
        L_0x0081:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            iog r2 = r6.y0
            if (r2 == 0) goto L_0x00aa
            boolean r2 = r30.getFitsSystemWindows()
            if (r2 == 0) goto L_0x00aa
            r19 = r8
            goto L_0x00ac
        L_0x00aa:
            r19 = r7
        L_0x00ac:
            java.util.ArrayList r5 = r6.a
            int r4 = r5.size()
            r3 = r0
            r2 = r1
            r0 = r7
            r1 = r0
        L_0x00b6:
            if (r1 >= r4) goto L_0x01f3
            java.lang.Object r20 = r5.get(r1)
            android.view.View r20 = (android.view.View) r20
            int r8 = r20.getVisibility()
            r7 = 8
            if (r8 != r7) goto L_0x00d5
            r22 = r1
            r27 = r4
            r28 = r5
            r23 = r9
            r25 = r10
            r26 = r11
        L_0x00d2:
            r1 = 1
            goto L_0x01e2
        L_0x00d5:
            android.view.ViewGroup$LayoutParams r7 = r20.getLayoutParams()
            wz3 r7 = (defpackage.wz3) r7
            int r8 = r7.e
            if (r8 < 0) goto L_0x0134
            if (r13 == 0) goto L_0x0134
            r22 = r0
            int[] r0 = r6.y
            if (r0 != 0) goto L_0x00ee
            r30.toString()
            r23 = r1
        L_0x00ec:
            r0 = 0
            goto L_0x00fd
        L_0x00ee:
            r23 = r1
            if (r8 < 0) goto L_0x00f9
            int r1 = r0.length
            if (r8 < r1) goto L_0x00f6
            goto L_0x00f9
        L_0x00f6:
            r0 = r0[r8]
            goto L_0x00fd
        L_0x00f9:
            r30.toString()
            goto L_0x00ec
        L_0x00fd:
            int r1 = r7.c
            if (r1 != 0) goto L_0x0104
            r1 = 8388661(0x800035, float:1.1755018E-38)
        L_0x0104:
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r11)
            r1 = r1 & 7
            r8 = 3
            if (r1 != r8) goto L_0x010f
            if (r12 == 0) goto L_0x0114
        L_0x010f:
            r8 = 5
            if (r1 != r8) goto L_0x0120
            if (r12 == 0) goto L_0x0120
        L_0x0114:
            int r1 = r14 - r10
            int r1 = r1 - r0
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            r8 = r0
            r21 = r1
            goto L_0x013b
        L_0x0120:
            if (r1 != r8) goto L_0x0124
            if (r12 == 0) goto L_0x0129
        L_0x0124:
            r8 = 3
            if (r1 != r8) goto L_0x0132
            if (r12 == 0) goto L_0x0132
        L_0x0129:
            int r0 = r0 - r9
            r8 = 0
            int r0 = java.lang.Math.max(r8, r0)
            r21 = r0
            goto L_0x013b
        L_0x0132:
            r8 = 0
            goto L_0x0139
        L_0x0134:
            r22 = r0
            r23 = r1
            goto L_0x0132
        L_0x0139:
            r21 = r8
        L_0x013b:
            if (r19 == 0) goto L_0x016d
            boolean r0 = r20.getFitsSystemWindows()
            if (r0 != 0) goto L_0x016d
            iog r0 = r6.y0
            int r0 = r0.b()
            iog r1 = r6.y0
            int r1 = r1.c()
            int r1 = r1 + r0
            iog r0 = r6.y0
            int r0 = r0.d()
            iog r8 = r6.y0
            int r8 = r8.a()
            int r8 = r8 + r0
            int r0 = r14 - r1
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r1 = r16 - r8
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r15)
            r8 = r0
            r24 = r1
            goto L_0x0171
        L_0x016d:
            r8 = r31
            r24 = r32
        L_0x0171:
            tz3 r0 = r7.a
            if (r0 == 0) goto L_0x0196
            r1 = r22
            r22 = r23
            r23 = r9
            r9 = r1
            r1 = r30
            r25 = r10
            r10 = r2
            r2 = r20
            r26 = r11
            r11 = r3
            r3 = r8
            r27 = r4
            r4 = r21
            r28 = r5
            r5 = r24
            boolean r0 = r0.m(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x01b5
            goto L_0x01a8
        L_0x0196:
            r27 = r4
            r28 = r5
            r25 = r10
            r26 = r11
            r10 = r2
            r11 = r3
            r29 = r23
            r23 = r9
            r9 = r22
            r22 = r29
        L_0x01a8:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r8
            r3 = r21
            r4 = r24
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01b5:
            int r0 = r20.getMeasuredWidth()
            int r0 = r0 + r17
            int r1 = r7.leftMargin
            int r0 = r0 + r1
            int r1 = r7.rightMargin
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r11, r0)
            int r1 = r20.getMeasuredHeight()
            int r1 = r1 + r18
            int r2 = r7.topMargin
            int r1 = r1 + r2
            int r2 = r7.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r10, r1)
            int r2 = r20.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r9, r2)
            r3 = r0
            r0 = r2
            r2 = r1
            goto L_0x00d2
        L_0x01e2:
            int r4 = r22 + 1
            r8 = r1
            r1 = r4
            r9 = r23
            r10 = r25
            r11 = r26
            r4 = r27
            r5 = r28
            r7 = 0
            goto L_0x00b6
        L_0x01f3:
            r9 = r0
            r10 = r2
            r11 = r3
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r9
            r1 = r31
            int r0 = android.view.View.resolveSizeAndState(r11, r1, r0)
            int r1 = r9 << 16
            r2 = r32
            int r1 = android.view.View.resolveSizeAndState(r10, r2, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                wz3 wz3 = (wz3) childAt.getLayoutParams();
                if (wz3.a(0)) {
                    tz3 tz3 = wz3.a;
                }
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        tz3 tz3;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                wz3 wz3 = (wz3) childAt.getLayoutParams();
                if (wz3.a(0) && (tz3 = wz3.a) != null) {
                    z2 |= tz3.n(view);
                }
            }
        }
        return z2;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        t(view, i, i2, iArr, 0);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        o(view, i, i2, i3, i4, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        r(view, view2, i, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof yz3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        yz3 yz3 = (yz3) parcelable;
        super.onRestoreInstanceState(yz3.a);
        SparseArray sparseArray = yz3.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            tz3 tz3 = h(childAt).a;
            if (!(id == -1 || tz3 == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                tz3.r(childAt, parcelable2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [yz3, android.os.Parcelable, z] */
    public final Parcelable onSaveInstanceState() {
        Parcelable s;
        ? zVar = new z(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            tz3 tz3 = ((wz3) childAt.getLayoutParams()).a;
            if (!(id == -1 || tz3 == null || (s = tz3.s(childAt)) == null)) {
                sparseArray.append(id, s);
            }
        }
        zVar.c = sparseArray;
        return zVar;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return p(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        s(view, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.z;
        boolean z3 = false;
        if (view != null) {
            tz3 tz3 = ((wz3) view.getLayoutParams()).a;
            z2 = tz3 != null ? tz3.v(this, this.z, motionEvent) : false;
        } else {
            z2 = q(motionEvent, 1);
            if (actionMasked != 0 && z2) {
                z3 = true;
            }
        }
        if (this.z == null || actionMasked == 3) {
            z2 |= super.onTouchEvent(motionEvent);
        } else if (z3) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            super.onTouchEvent(obtain);
            obtain.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.z = null;
            v();
        }
        return z2;
    }

    public final boolean p(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                wz3 wz3 = (wz3) childAt.getLayoutParams();
                tz3 tz3 = wz3.a;
                if (tz3 != null) {
                    boolean t = tz3.t(this, childAt, view, view2, i, i2);
                    z2 |= t;
                    if (i3 == 0) {
                        wz3.n = t;
                    } else if (i3 == 1) {
                        wz3.o = t;
                    }
                } else if (i3 == 0) {
                    wz3.n = false;
                } else if (i3 == 1) {
                    wz3.o = false;
                }
            }
        }
        return z2;
    }

    public final boolean q(MotionEvent motionEvent, int i) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        cx4 cx4 = H0;
        if (cx4 != null) {
            Collections.sort(arrayList, cx4);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            wz3 wz3 = (wz3) view.getLayoutParams();
            tz3 tz3 = wz3.a;
            if ((!z3 && !z4) || actionMasked == 0) {
                if (!z4 && !z3 && tz3 != null && (z3 = m(tz3, view, motionEvent, i))) {
                    this.z = view;
                    if (!(actionMasked == 3 || actionMasked == 1)) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            View view2 = (View) arrayList.get(i4);
                            tz3 tz32 = ((wz3) view2.getLayoutParams()).a;
                            if (tz32 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = MotionEvent.obtain(motionEvent);
                                    motionEvent2.setAction(3);
                                }
                                m(tz32, view2, motionEvent2, i);
                            }
                        }
                    }
                }
                if (wz3.a == null) {
                    wz3.m = false;
                }
                boolean z5 = wz3.m;
                if (z5) {
                    z2 = true;
                } else {
                    wz3.m = z5;
                    z2 = z5;
                }
                z4 = z2 && !z5;
                if (z2 && !z4) {
                    break;
                }
            } else if (tz3 != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = MotionEvent.obtain(motionEvent);
                    motionEvent2.setAction(3);
                }
                m(tz3, view, motionEvent2, i);
            }
        }
        arrayList.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z3;
    }

    public final void r(View view, View view2, int i, int i2) {
        ft ftVar = this.D0;
        if (i2 == 1) {
            ftVar.c = i;
        } else {
            ftVar.b = i;
        }
        this.v0 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((wz3) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        tz3 tz3 = ((wz3) view.getLayoutParams()).a;
        if (tz3 == null || !tz3.q(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.w) {
            if (this.z == null) {
                int childCount = getChildCount();
                MotionEvent motionEvent = null;
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    tz3 tz3 = ((wz3) childAt.getLayoutParams()).a;
                    if (tz3 != null) {
                        if (motionEvent == null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 0);
                        }
                        tz3.k(this, childAt, motionEvent);
                    }
                }
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
            }
            v();
            this.w = true;
        }
    }

    public final void s(View view, int i) {
        ft ftVar = this.D0;
        if (i == 1) {
            ftVar.c = 0;
        } else {
            ftVar.b = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            wz3 wz3 = (wz3) childAt.getLayoutParams();
            if (wz3.a(i)) {
                tz3 tz3 = wz3.a;
                if (tz3 != null) {
                    tz3.u(this, childAt, view, i);
                }
                if (i == 0) {
                    wz3.n = false;
                } else if (i == 1) {
                    wz3.o = false;
                }
                wz3.p = false;
            }
        }
        this.v0 = null;
    }

    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        y();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.B0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
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
                if (drawable3.isStateful()) {
                    this.A0.setState(getDrawableState());
                }
                Drawable drawable4 = this.A0;
                WeakHashMap weakHashMap = gag.a;
                su4.b(drawable4, getLayoutDirection());
                this.A0.setVisible(getVisibility() == 0, false);
                this.A0.setCallback(this);
            }
            WeakHashMap weakHashMap2 = gag.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? ew3.b(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.A0;
        if (drawable != null && drawable.isVisible() != z2) {
            this.A0.setVisible(z2, false);
        }
    }

    public final void t(View view, int i, int i2, int[] iArr, int i3) {
        tz3 tz3;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                wz3 wz3 = (wz3) childAt.getLayoutParams();
                if (wz3.a(i3) && (tz3 = wz3.a) != null) {
                    int[] iArr2 = this.o;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    int[] iArr3 = iArr2;
                    tz3.o(this, childAt, view, i, i2, iArr2, i3);
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    i5 = i2 > 0 ? Math.max(i5, iArr3[1]) : Math.min(i5, iArr3[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            j(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f9, code lost:
        if ((android.view.Gravity.getAbsoluteGravity(r8.h, r12) & r13) == r13) goto L_0x0106;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r15 = this;
            java.util.ArrayList r0 = r15.a
            r0.clear()
            qpg r1 = r15.b
            java.lang.Object r2 = r1.b
            qae r2 = (defpackage.qae) r2
            int r3 = r2.c
            r4 = 0
            r5 = r4
        L_0x000f:
            java.lang.Object r6 = r1.a
            wqb r6 = (defpackage.wqb) r6
            if (r5 >= r3) goto L_0x0026
            java.lang.Object r7 = r2.i(r5)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto L_0x0023
            r7.clear()
            r6.b(r7)
        L_0x0023:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x0026:
            r2.clear()
            int r2 = r15.getChildCount()
            r3 = r4
        L_0x002e:
            java.lang.Object r5 = r1.b
            qae r5 = (defpackage.qae) r5
            if (r3 >= r2) goto L_0x016f
            android.view.View r7 = r15.getChildAt(r3)
            wz3 r8 = h(r7)
            int r9 = r8.f
            r10 = 0
            r11 = -1
            if (r9 != r11) goto L_0x0048
            r8.l = r10
            r8.k = r10
            goto L_0x00c7
        L_0x0048:
            android.view.View r11 = r8.k
            if (r11 == 0) goto L_0x0074
            int r11 = r11.getId()
            if (r11 == r9) goto L_0x0053
            goto L_0x0074
        L_0x0053:
            android.view.View r11 = r8.k
            android.view.ViewParent r12 = r11.getParent()
        L_0x0059:
            if (r12 == r15) goto L_0x0071
            if (r12 == 0) goto L_0x006c
            if (r12 != r7) goto L_0x0060
            goto L_0x006c
        L_0x0060:
            boolean r13 = r12 instanceof android.view.View
            if (r13 == 0) goto L_0x0067
            r11 = r12
            android.view.View r11 = (android.view.View) r11
        L_0x0067:
            android.view.ViewParent r12 = r12.getParent()
            goto L_0x0059
        L_0x006c:
            r8.l = r10
            r8.k = r10
            goto L_0x0074
        L_0x0071:
            r8.l = r11
            goto L_0x00c7
        L_0x0074:
            android.view.View r11 = r15.findViewById(r9)
            r8.k = r11
            if (r11 == 0) goto L_0x00bd
            if (r11 != r15) goto L_0x0091
            boolean r9 = r15.isInEditMode()
            if (r9 == 0) goto L_0x0089
            r8.l = r10
            r8.k = r10
            goto L_0x00c7
        L_0x0089:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "View can not be anchored to the the parent CoordinatorLayout"
            r15.<init>(r0)
            throw r15
        L_0x0091:
            android.view.ViewParent r9 = r11.getParent()
        L_0x0095:
            if (r9 == r15) goto L_0x00ba
            if (r9 == 0) goto L_0x00ba
            if (r9 != r7) goto L_0x00ae
            boolean r9 = r15.isInEditMode()
            if (r9 == 0) goto L_0x00a6
            r8.l = r10
            r8.k = r10
            goto L_0x00c7
        L_0x00a6:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Anchor must not be a descendant of the anchored view"
            r15.<init>(r0)
            throw r15
        L_0x00ae:
            boolean r12 = r9 instanceof android.view.View
            if (r12 == 0) goto L_0x00b5
            r11 = r9
            android.view.View r11 = (android.view.View) r11
        L_0x00b5:
            android.view.ViewParent r9 = r9.getParent()
            goto L_0x0095
        L_0x00ba:
            r8.l = r11
            goto L_0x00c7
        L_0x00bd:
            boolean r11 = r15.isInEditMode()
            if (r11 == 0) goto L_0x014b
            r8.l = r10
            r8.k = r10
        L_0x00c7:
            boolean r9 = r5.containsKey(r7)
            if (r9 != 0) goto L_0x00d0
            r5.put(r7, r10)
        L_0x00d0:
            r9 = r4
        L_0x00d1:
            if (r9 >= r2) goto L_0x0147
            if (r9 != r3) goto L_0x00d6
            goto L_0x013c
        L_0x00d6:
            android.view.View r11 = r15.getChildAt(r9)
            android.view.View r12 = r8.l
            if (r11 == r12) goto L_0x0106
            java.util.WeakHashMap r12 = defpackage.gag.a
            int r12 = r15.getLayoutDirection()
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            wz3 r13 = (defpackage.wz3) r13
            int r13 = r13.g
            int r13 = android.view.Gravity.getAbsoluteGravity(r13, r12)
            if (r13 == 0) goto L_0x00fc
            int r14 = r8.h
            int r12 = android.view.Gravity.getAbsoluteGravity(r14, r12)
            r12 = r12 & r13
            if (r12 != r13) goto L_0x00fc
            goto L_0x0106
        L_0x00fc:
            tz3 r12 = r8.a
            if (r12 == 0) goto L_0x013c
            boolean r12 = r12.f(r7, r11)
            if (r12 == 0) goto L_0x013c
        L_0x0106:
            boolean r12 = r5.containsKey(r11)
            if (r12 != 0) goto L_0x0115
            boolean r12 = r5.containsKey(r11)
            if (r12 != 0) goto L_0x0115
            r5.put(r11, r10)
        L_0x0115:
            boolean r12 = r5.containsKey(r11)
            if (r12 == 0) goto L_0x013f
            boolean r12 = r5.containsKey(r7)
            if (r12 == 0) goto L_0x013f
            java.lang.Object r12 = r5.get(r11)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            if (r12 != 0) goto L_0x0139
            java.lang.Object r12 = r6.c()
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            if (r12 != 0) goto L_0x0136
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x0136:
            r5.put(r11, r12)
        L_0x0139:
            r12.add(r7)
        L_0x013c:
            int r9 = r9 + 1
            goto L_0x00d1
        L_0x013f:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "All nodes must be present in the graph before being added as an edge"
            r15.<init>(r0)
            throw r15
        L_0x0147:
            int r3 = r3 + 1
            goto L_0x002e
        L_0x014b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id "
            r1.<init>(r2)
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r9)
            r1.append(r15)
            java.lang.String r15 = " to anchor view "
            r1.append(r15)
            r1.append(r7)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L_0x016f:
            java.lang.Object r15 = r1.c
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            r15.clear()
            java.lang.Object r2 = r1.o
            java.util.HashSet r2 = (java.util.HashSet) r2
            r2.clear()
            int r3 = r5.c
        L_0x017f:
            if (r4 >= r3) goto L_0x018b
            java.lang.Object r6 = r5.f(r4)
            r1.h(r6, r15, r2)
            int r4 = r4 + 1
            goto L_0x017f
        L_0x018b:
            r0.addAll(r15)
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v() {
        View view = this.z;
        if (view != null) {
            tz3 tz3 = ((wz3) view.getLayoutParams()).a;
            if (tz3 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 0);
                tz3.v(this, this.z, obtain);
                obtain.recycle();
            }
            this.z = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((wz3) getChildAt(i).getLayoutParams()).m = false;
        }
        this.w = false;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0;
    }

    public final void y() {
        WeakHashMap weakHashMap = gag.a;
        if (getFitsSystemWindows()) {
            if (this.C0 == null) {
                this.C0 = new er7(13, (Object) this);
            }
            v9g.u(this, this.C0);
            setSystemUiVisibility(1280);
            return;
        }
        v9g.u(this, (vla) null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.a = new ArrayList();
        this.b = new qpg(5);
        this.c = new ArrayList();
        this.o = new int[2];
        this.v = new int[2];
        this.D0 = new ft(6);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, eoc.CoordinatorLayout, 0, enc.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, eoc.CoordinatorLayout, i, 0);
        }
        if (i == 0) {
            int[] iArr = eoc.CoordinatorLayout;
            int i2 = enc.Widget_Support_CoordinatorLayout;
            WeakHashMap weakHashMap = gag.a;
            bag.d(this, context, iArr, attributeSet, typedArray, 0, i2);
        } else {
            int[] iArr2 = eoc.CoordinatorLayout;
            WeakHashMap weakHashMap2 = gag.a;
            bag.d(this, context, iArr2, attributeSet, typedArray, i, 0);
        }
        int resourceId = typedArray.getResourceId(eoc.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.y = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr3 = this.y;
                iArr3[i3] = (int) (((float) iArr3[i3]) * f);
            }
        }
        this.A0 = typedArray.getDrawable(eoc.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        y();
        super.setOnHierarchyChangeListener(new vz3(0, this));
        WeakHashMap weakHashMap3 = gag.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof wz3) {
            return new wz3((wz3) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new wz3((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new wz3(layoutParams);
    }
}
