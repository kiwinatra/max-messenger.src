package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.uuid.Uuid;

/* renamed from: ud5  reason: default package */
public abstract class ud5 extends v3 {
    public static final Rect n = new Rect(IntCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE);
    public static final dbe o = new dbe(11);
    public static final ece p = new ece(11);
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public final AccessibilityManager h;
    public final View i;
    public td5 j;
    public int k = IntCompanionObject.MIN_VALUE;
    public int l = IntCompanionObject.MIN_VALUE;
    public int m = IntCompanionObject.MIN_VALUE;

    public ud5(View view) {
        if (view != null) {
            this.i = view;
            this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap weakHashMap = gag.a;
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final grg b(View view) {
        if (this.j == null) {
            this.j = new td5(this);
        }
        return this.j;
    }

    public final void d(View view, g4 g4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, g4Var.a);
        t(g4Var);
    }

    public final boolean j(int i2) {
        if (this.l != i2) {
            return false;
        }
        this.l = IntCompanionObject.MIN_VALUE;
        v(i2, false);
        x(i2, 8);
        return true;
    }

    public final AccessibilityEvent k(int i2, int i3) {
        View view = this.i;
        if (i2 != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
            g4 r = r(i2);
            obtain.getText().add(r.g());
            AccessibilityNodeInfo accessibilityNodeInfo = r.a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
                obtain.setClassName(accessibilityNodeInfo.getClassName());
                obtain.setSource(view, i2);
                obtain.setPackageName(view.getContext().getPackageName());
                return obtain;
            }
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i3);
        view.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    public final g4 l(int i2) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        g4 g4Var = new g4(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        g4Var.h("android.view.View");
        Rect rect = n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        g4Var.b = -1;
        View view = this.i;
        obtain.setParent(view);
        u(i2, g4Var);
        if (g4Var.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        g4Var.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & Uuid.SIZE_BITS) == 0) {
                obtain.setPackageName(view.getContext().getPackageName());
                g4Var.c = i2;
                obtain.setSource(view, i2);
                if (this.k == i2) {
                    obtain.setAccessibilityFocused(true);
                    g4Var.a(Uuid.SIZE_BITS);
                } else {
                    obtain.setAccessibilityFocused(false);
                    g4Var.a(64);
                }
                boolean z = this.l == i2;
                if (z) {
                    g4Var.a(2);
                } else if (obtain.isFocusable()) {
                    g4Var.a(1);
                }
                obtain.setFocused(z);
                int[] iArr = this.g;
                view.getLocationOnScreen(iArr);
                Rect rect3 = this.d;
                obtain.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    g4Var.f(rect3);
                    if (g4Var.b != -1) {
                        g4 g4Var2 = new g4(AccessibilityNodeInfo.obtain());
                        for (int i3 = g4Var.b; i3 != -1; i3 = g4Var2.b) {
                            g4Var2.b = -1;
                            AccessibilityNodeInfo accessibilityNodeInfo = g4Var2.a;
                            accessibilityNodeInfo.setParent(view, -1);
                            accessibilityNodeInfo.setBoundsInParent(rect);
                            u(i3, g4Var2);
                            g4Var2.f(rect2);
                            rect3.offset(rect2.left, rect2.top);
                        }
                    }
                    rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                }
                Rect rect4 = this.f;
                if (view.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    if (rect3.intersect(rect4)) {
                        g4Var.a.setBoundsInScreen(rect3);
                        if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                            ViewParent parent = view.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view2 = (View) parent;
                                    if (view2.getAlpha() <= c44.DEFAULT_ASPECT_RATIO || view2.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view2.getParent();
                                } else if (parent != null) {
                                    obtain.setVisibleToUser(true);
                                }
                            }
                        }
                    }
                }
                return g4Var;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public final boolean m(MotionEvent motionEvent) {
        int i2;
        AccessibilityManager accessibilityManager = this.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int n2 = n(motionEvent.getX(), motionEvent.getY());
            int i3 = this.m;
            if (i3 != n2) {
                this.m = n2;
                x(n2, Uuid.SIZE_BITS);
                x(i3, 256);
            }
            return n2 != Integer.MIN_VALUE;
        } else if (action != 10 || (i2 = this.m) == Integer.MIN_VALUE) {
            return false;
        } else {
            if (i2 != Integer.MIN_VALUE) {
                this.m = IntCompanionObject.MIN_VALUE;
                x(i2, 256);
            }
            return true;
        }
    }

    public abstract int n(float f2, float f3);

    public abstract void o(ArrayList arrayList);

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r3.i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(int r4) {
        /*
            r3 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L_0x0021
            android.view.accessibility.AccessibilityManager r0 = r3.h
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0021
            android.view.View r0 = r3.i
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0021
            r2 = 2048(0x800, float:2.87E-42)
            android.view.accessibility.AccessibilityEvent r3 = r3.k(r4, r2)
            r4 = 0
            r3.setContentChangeTypes(r4)
            r1.requestSendAccessibilityEvent(r0, r3)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud5.p(int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: g4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: g4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: g4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: g4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.o(r4)
            kge r5 = new kge
            r6 = 0
            r5.<init>(r6)
            r7 = r6
        L_0x0016:
            int r8 = r4.size()
            if (r7 >= r8) goto L_0x0039
            java.lang.Object r8 = r4.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            g4 r8 = r0.l(r8)
            java.lang.Object r9 = r4.get(r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r5.g(r9, r8)
            int r7 = r7 + r3
            goto L_0x0016
        L_0x0039:
            int r4 = r0.l
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r8) goto L_0x0041
            r4 = 0
            goto L_0x0047
        L_0x0041:
            java.lang.Object r4 = r5.f(r4)
            g4 r4 = (defpackage.g4) r4
        L_0x0047:
            dbe r9 = o
            ece r10 = p
            android.view.View r11 = r0.i
            r12 = 2
            if (r1 == r3) goto L_0x015d
            if (r1 == r12) goto L_0x015d
            r12 = 130(0x82, float:1.82E-43)
            r14 = 66
            r15 = 33
            r7 = 17
            if (r1 == r7) goto L_0x006b
            if (r1 == r15) goto L_0x006b
            if (r1 == r14) goto L_0x006b
            if (r1 != r12) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r0.<init>(r1)
            throw r0
        L_0x006b:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            int r6 = r0.l
            java.lang.String r13 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r6 == r8) goto L_0x0080
            g4 r2 = r0.r(r6)
            r2.f(r3)
        L_0x007d:
            r18 = -1
            goto L_0x00b9
        L_0x0080:
            if (r2 == 0) goto L_0x0086
            r3.set(r2)
            goto L_0x007d
        L_0x0086:
            int r2 = r11.getWidth()
            int r6 = r11.getHeight()
            if (r1 == r7) goto L_0x00b3
            if (r1 == r15) goto L_0x00ac
            if (r1 == r14) goto L_0x00a4
            if (r1 != r12) goto L_0x009e
            r6 = -1
            r11 = 0
            r3.set(r11, r6, r2, r6)
            r18 = r6
            goto L_0x00b9
        L_0x009e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r13)
            throw r0
        L_0x00a4:
            r2 = -1
            r11 = 0
            r3.set(r2, r11, r2, r6)
            r18 = r2
            goto L_0x00b9
        L_0x00ac:
            r11 = 0
            r18 = -1
            r3.set(r11, r6, r2, r6)
            goto L_0x00b9
        L_0x00b3:
            r11 = 0
            r18 = -1
            r3.set(r2, r11, r2, r6)
        L_0x00b9:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r3)
            if (r1 == r7) goto L_0x00ef
            if (r1 == r15) goto L_0x00e4
            if (r1 == r14) goto L_0x00d8
            if (r1 != r12) goto L_0x00d2
            int r6 = r3.height()
            r7 = 1
            int r6 = r6 + r7
            int r6 = -r6
            r14 = 0
            r2.offset(r14, r6)
            goto L_0x00f9
        L_0x00d2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r13)
            throw r0
        L_0x00d8:
            r7 = 1
            r14 = 0
            int r6 = r3.width()
            int r6 = r6 + r7
            int r6 = -r6
            r2.offset(r6, r14)
            goto L_0x00f9
        L_0x00e4:
            r7 = 1
            r14 = 0
            int r6 = r3.height()
            int r6 = r6 + r7
            r2.offset(r14, r6)
            goto L_0x00f9
        L_0x00ef:
            r7 = 1
            r14 = 0
            int r6 = r3.width()
            int r6 = r6 + r7
            r2.offset(r6, r14)
        L_0x00f9:
            r10.getClass()
            int r6 = r5.c
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r11 = r14
            r16 = 0
        L_0x0106:
            if (r11 >= r6) goto L_0x0159
            java.lang.Object[] r10 = r5.b
            r10 = r10[r11]
            g4 r10 = (defpackage.g4) r10
            if (r10 != r4) goto L_0x0111
            goto L_0x0156
        L_0x0111:
            r9.getClass()
            r10.f(r7)
            boolean r12 = defpackage.n54.u(r1, r3, r7)
            if (r12 != 0) goto L_0x011e
            goto L_0x0156
        L_0x011e:
            boolean r12 = defpackage.n54.u(r1, r3, r2)
            if (r12 != 0) goto L_0x0125
            goto L_0x0151
        L_0x0125:
            boolean r12 = defpackage.n54.c(r1, r3, r7, r2)
            if (r12 == 0) goto L_0x012c
            goto L_0x0151
        L_0x012c:
            boolean r12 = defpackage.n54.c(r1, r3, r2, r7)
            if (r12 == 0) goto L_0x0133
            goto L_0x0156
        L_0x0133:
            int r12 = defpackage.n54.A(r1, r3, r7)
            int r13 = defpackage.n54.B(r1, r3, r7)
            int r15 = r12 * 13
            int r15 = r15 * r12
            int r13 = r13 * r13
            int r13 = r13 + r15
            int r12 = defpackage.n54.A(r1, r3, r2)
            int r15 = defpackage.n54.B(r1, r3, r2)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r15 = r15 * r15
            int r15 = r15 + r17
            if (r13 >= r15) goto L_0x0156
        L_0x0151:
            r2.set(r7)
            r16 = r10
        L_0x0156:
            r13 = 1
            int r11 = r11 + r13
            goto L_0x0106
        L_0x0159:
            r1 = r16
            goto L_0x01ca
        L_0x015d:
            r13 = r3
            r14 = r6
            r18 = -1
            java.util.WeakHashMap r2 = defpackage.gag.a
            int r2 = r11.getLayoutDirection()
            if (r2 != r13) goto L_0x016b
            r2 = 1
            goto L_0x016c
        L_0x016b:
            r2 = r14
        L_0x016c:
            r10.getClass()
            int r3 = r5.c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            r11 = r14
        L_0x0177:
            if (r11 >= r3) goto L_0x0185
            java.lang.Object[] r7 = r5.b
            r7 = r7[r11]
            g4 r7 = (defpackage.g4) r7
            r6.add(r7)
            r7 = 1
            int r11 = r11 + r7
            goto L_0x0177
        L_0x0185:
            r7 = 1
            yx5 r3 = new yx5
            r3.<init>(r2, r9)
            java.util.Collections.sort(r6, r3)
            if (r1 == r7) goto L_0x01b1
            if (r1 != r12) goto L_0x01a9
            int r1 = r6.size()
            if (r4 != 0) goto L_0x019b
            r2 = r18
            goto L_0x019f
        L_0x019b:
            int r2 = r6.lastIndexOf(r4)
        L_0x019f:
            int r2 = r2 + r7
            if (r2 >= r1) goto L_0x01a7
            java.lang.Object r7 = r6.get(r2)
            goto L_0x01c5
        L_0x01a7:
            r7 = 0
            goto L_0x01c5
        L_0x01a9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r0.<init>(r1)
            throw r0
        L_0x01b1:
            int r1 = r6.size()
            if (r4 != 0) goto L_0x01b9
        L_0x01b7:
            r2 = 1
            goto L_0x01be
        L_0x01b9:
            int r1 = r6.indexOf(r4)
            goto L_0x01b7
        L_0x01be:
            int r1 = r1 - r2
            if (r1 < 0) goto L_0x01a7
            java.lang.Object r7 = r6.get(r1)
        L_0x01c5:
            r16 = r7
            g4 r16 = (defpackage.g4) r16
            goto L_0x0159
        L_0x01ca:
            if (r1 != 0) goto L_0x01cd
            goto L_0x01e3
        L_0x01cd:
            int r2 = r5.c
            r6 = r14
        L_0x01d0:
            if (r6 >= r2) goto L_0x01dd
            java.lang.Object[] r3 = r5.b
            r3 = r3[r6]
            if (r3 != r1) goto L_0x01da
            r13 = r6
            goto L_0x01df
        L_0x01da:
            r3 = 1
            int r6 = r6 + r3
            goto L_0x01d0
        L_0x01dd:
            r13 = r18
        L_0x01df:
            int[] r1 = r5.a
            r8 = r1[r13]
        L_0x01e3:
            boolean r0 = r0.w(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud5.q(int, android.graphics.Rect):boolean");
    }

    public final g4 r(int i2) {
        if (i2 != -1) {
            return l(i2);
        }
        View view = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        g4 g4Var = new g4(obtain);
        WeakHashMap weakHashMap = gag.a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                g4Var.a.addChild(view, ((Integer) arrayList.get(i3)).intValue());
            }
            return g4Var;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract boolean s(int i2, int i3, Bundle bundle);

    public void t(g4 g4Var) {
    }

    public abstract void u(int i2, g4 g4Var);

    public void v(int i2, boolean z) {
    }

    public final boolean w(int i2) {
        int i3;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i3 = this.l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            j(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i2;
        v(i2, true);
        x(i2, 8);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = r2.i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(int r3, int r4) {
        /*
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r0) goto L_0x001d
            android.view.accessibility.AccessibilityManager r0 = r2.h
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x000d
            goto L_0x001d
        L_0x000d:
            android.view.View r0 = r2.i
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L_0x0016
            return
        L_0x0016:
            android.view.accessibility.AccessibilityEvent r2 = r2.k(r3, r4)
            r1.requestSendAccessibilityEvent(r0, r2)
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud5.x(int, int):void");
    }
}
