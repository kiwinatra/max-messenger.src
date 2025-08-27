package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

public class RecyclerView extends ViewGroup implements nid, g6a {
    public static boolean J1 = false;
    public static boolean K1 = false;
    public static final int[] L1 = {16843830};
    public static final float M1 = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final boolean N1 = true;
    public static final boolean O1 = true;
    public static final boolean P1 = true;
    public static final Class[] Q1;
    public static final vl7 R1 = new vl7(2);
    public static final mzc S1 = new Object();
    public final ArrayList A0;
    public final int[] A1;
    public final ArrayList B0;
    public final int[] B1;
    public final ArrayList C0;
    public final int[] C1;
    public ezc D0;
    public final ArrayList D1;
    public boolean E0;
    public final ryc E1;
    public boolean F0;
    public boolean F1;
    public boolean G0;
    public int G1;
    public int H0;
    public int H1;
    public boolean I0;
    public final bpa I1;
    public boolean J0;
    public boolean K0;
    public int L0;
    public boolean M0;
    public final AccessibilityManager N0;
    public ArrayList O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public int S0;
    public xyc T0;
    public EdgeEffect U0;
    public EdgeEffect V0;
    public EdgeEffect W0;
    public EdgeEffect X0;
    public yyc Y0;
    public int Z0;
    public final float a;
    public int a1;
    public final t45 b;
    public VelocityTracker b1;
    public final hzc c;
    public int c1;
    public int d1;
    public int e1;
    public int f1;
    public int g1;
    public dzc h1;
    public final int i1;
    public final int j1;
    public final float k1;
    public final float l1;
    public boolean m1;
    public final ozc n1;
    public jzc o;
    public kp6 o1;
    public final e13 p1;
    public final lzc q1;
    public fzc r1;
    public ArrayList s1;
    public boolean t1;
    public boolean u1;
    public final u9 v;
    public final Rect v0;
    public final yu9 v1;
    public final mqf w;
    public final Rect w0;
    public boolean w1;
    public final ox0 x;
    public final RectF x0;
    public rzc x1;
    public boolean y;
    public tyc y0;
    public final int[] y1;
    public final ryc z;
    public a z0;
    public i6a z1;

    /* JADX WARNING: type inference failed for: r0v10, types: [mzc, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        Q1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ddc.recyclerViewStyle);
    }

    public static RecyclerView L(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView L = L(viewGroup.getChildAt(i));
            if (L != null) {
                return L;
            }
        }
        return null;
    }

    public static int S(View view) {
        pzc V = V(view);
        if (V != null) {
            return V.p();
        }
        return -1;
    }

    public static int T(View view) {
        pzc V = V(view);
        if (V != null) {
            return V.s();
        }
        return -1;
    }

    public static pzc V(View view) {
        if (view == null) {
            return null;
        }
        return ((bzc) view.getLayoutParams()).a;
    }

    public static void W(Rect rect, View view) {
        bzc bzc = (bzc) view.getLayoutParams();
        Rect rect2 = bzc.b;
        rect.set((view.getLeft() - rect2.left) - bzc.leftMargin, (view.getTop() - rect2.top) - bzc.topMargin, view.getRight() + rect2.right + bzc.rightMargin, view.getBottom() + rect2.bottom + bzc.bottomMargin);
    }

    private i6a getScrollingChildHelper() {
        if (this.z1 == null) {
            this.z1 = new i6a(this);
        }
        return this.z1;
    }

    public static void o(pzc pzc) {
        WeakReference weakReference = pzc.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != pzc.a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            pzc.b = null;
        }
    }

    public static int r(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && b0h.u(edgeEffect) != c44.DEFAULT_ASPECT_RATIO) {
            int round = Math.round(b0h.G(edgeEffect, (((float) (-i)) * 4.0f) / ((float) i2), 0.5f) * (((float) (-i2)) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        } else if (i >= 0 || edgeEffect2 == null || b0h.u(edgeEffect2) == c44.DEFAULT_ASPECT_RATIO) {
            return i;
        } else {
            float f = (float) i2;
            int round2 = Math.round(b0h.G(edgeEffect2, (((float) i) * 4.0f) / f, 0.5f) * (f / 4.0f));
            if (round2 != i) {
                edgeEffect2.finish();
            }
            return i - round2;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        J1 = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        K1 = z2;
    }

    public final void A(int i, int i2) {
        this.S0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        fzc fzc = this.r1;
        if (fzc != null) {
            fzc.b(this, i, i2);
        }
        ArrayList arrayList = this.s1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((fzc) this.s1.get(size)).b(this, i, i2);
            }
        }
        this.S0--;
    }

    public final void A0(tyc tyc, boolean z2, boolean z3) {
        tyc tyc2 = this.y0;
        t45 t45 = this.b;
        if (tyc2 != null) {
            tyc2.D(t45);
            this.y0.v(this);
        }
        if (!z2 || z3) {
            q0();
        }
        u9 u9Var = this.v;
        u9Var.H((ArrayList) u9Var.o);
        u9Var.H((ArrayList) u9Var.v);
        u9Var.b = 0;
        tyc tyc3 = this.y0;
        this.y0 = tyc;
        if (tyc != null) {
            tyc.A(t45);
            tyc.r(this);
        }
        a aVar = this.z0;
        if (aVar != null) {
            aVar.V();
        }
        hzc hzc = this.c;
        tyc tyc4 = this.y0;
        hzc.a.clear();
        hzc.e();
        b bVar = hzc.g;
        if (bVar != null) {
            bVar.detachForPoolingContainer(tyc3, true);
        }
        hzc.c().onAdapterChanged(tyc3, tyc4, z2);
        hzc.d();
        this.q1.g = true;
    }

    public final void B() {
        if (this.X0 == null) {
            EdgeEffect a2 = this.T0.a(this, 3);
            this.X0 = a2;
            if (this.y) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final boolean B0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float f = this.a * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / f));
        double d = (double) M1;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < b0h.u(edgeEffect) * ((float) i2);
    }

    public final void C() {
        if (this.U0 == null) {
            EdgeEffect a2 = this.T0.a(this, 0);
            this.U0 = a2;
            if (this.y) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void C0(int i, int i2, boolean z2) {
        a aVar = this.z0;
        if (aVar != null && !this.J0) {
            int i3 = 0;
            if (!aVar.e()) {
                i = 0;
            }
            if (!this.z0.f()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (z2) {
                    if (i != 0) {
                        i3 = 1;
                    }
                    if (i2 != 0) {
                        i3 |= 2;
                    }
                    getScrollingChildHelper().h(i3, 1);
                }
                this.n1.c(i, i2, IntCompanionObject.MIN_VALUE, (Interpolator) null);
            }
        }
    }

    public final void D() {
        if (this.W0 == null) {
            EdgeEffect a2 = this.T0.a(this, 2);
            this.W0 = a2;
            if (this.y) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void D0(int i) {
        a aVar;
        if (!this.J0 && (aVar = this.z0) != null) {
            aVar.H0(this, i);
        }
    }

    public final void E() {
        if (this.V0 == null) {
            EdgeEffect a2 = this.T0.a(this, 1);
            this.V0 = a2;
            if (this.y) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void E0() {
        int i = this.H0 + 1;
        this.H0 = i;
        if (i == 1 && !this.J0) {
            this.I0 = false;
        }
    }

    public final String F() {
        return " " + super.toString() + ", adapter:" + this.y0 + ", layout:" + this.z0 + ", context:" + getContext();
    }

    public final void F0(boolean z2) {
        if (this.H0 < 1) {
            if (!J1) {
                this.H0 = 1;
            } else {
                throw new IllegalStateException(a81.k(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z2 && !this.J0) {
            this.I0 = false;
        }
        if (this.H0 == 1) {
            if (z2 && this.I0 && !this.J0 && this.z0 != null && this.y0 != null) {
                v();
            }
            if (!this.J0) {
                this.I0 = false;
            }
        }
        this.H0--;
    }

    public final void G(lzc lzc) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.n1.c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            lzc.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        lzc.getClass();
    }

    public final void G0() {
        ew7 ew7;
        setScrollState(0);
        ozc ozc = this.n1;
        ozc.x.removeCallbacks(ozc);
        ozc.c.abortAnimation();
        a aVar = this.z0;
        if (aVar != null && (ew7 = aVar.e) != null) {
            ew7.k();
        }
    }

    public final View H(float f, float f2) {
        for (int E = this.w.E() - 1; E >= 0; E--) {
            View D = this.w.D(E);
            float translationX = D.getTranslationX();
            float translationY = D.getTranslationY();
            if (f >= ((float) D.getLeft()) + translationX && f <= ((float) D.getRight()) + translationX && f2 >= ((float) D.getTop()) + translationY && f2 <= ((float) D.getBottom()) + translationY) {
                return D;
            }
        }
        return null;
    }

    public final View I(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean J(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.C0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            ezc ezc = (ezc) arrayList.get(i);
            if (!ezc.c(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.D0 = ezc;
                return true;
            }
        }
        return false;
    }

    public final void K(int[] iArr) {
        int E = this.w.E();
        if (E == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = IntCompanionObject.MAX_VALUE;
        int i2 = IntCompanionObject.MIN_VALUE;
        for (int i3 = 0; i3 < E; i3++) {
            pzc V = V(this.w.D(i3));
            if (!V.K()) {
                int s = V.s();
                if (s < i) {
                    i = s;
                }
                if (s > i2) {
                    i2 = s;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final pzc M(int i) {
        pzc pzc = null;
        if (this.P0) {
            return null;
        }
        int I = this.w.I();
        for (int i2 = 0; i2 < I; i2++) {
            pzc V = V(this.w.H(i2));
            if (V != null && !V.B() && Q(V) == i) {
                if (!this.w.M(V.a)) {
                    return V;
                }
                pzc = V;
            }
        }
        return pzc;
    }

    public final pzc N(long j) {
        tyc tyc = this.y0;
        pzc pzc = null;
        if (tyc != null && tyc.b) {
            int I = this.w.I();
            for (int i = 0; i < I; i++) {
                pzc V = V(this.w.H(i));
                if (V != null && !V.B() && V.v == j) {
                    if (!this.w.M(V.a)) {
                        return V;
                    }
                    pzc = V;
                }
            }
        }
        return pzc;
    }

    public final pzc O(int i, boolean z2) {
        int I = this.w.I();
        pzc pzc = null;
        for (int i2 = 0; i2 < I; i2++) {
            pzc V = V(this.w.H(i2));
            if (V != null && !V.B()) {
                if (z2) {
                    if (V.c != i) {
                        continue;
                    }
                } else if (V.s() != i) {
                    continue;
                }
                if (!((ArrayList) this.w.w).contains(V.a)) {
                    return V;
                }
                pzc = V;
            }
        }
        return pzc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean P(int r12, int r13) {
        /*
            r11 = this;
            androidx.recyclerview.widget.a r0 = r11.z0
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r2 = r11.J0
            if (r2 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r0 = r0.e()
            androidx.recyclerview.widget.a r2 = r11.z0
            boolean r2 = r2.f()
            int r3 = r11.i1
            if (r0 == 0) goto L_0x001f
            int r4 = java.lang.Math.abs(r12)
            if (r4 >= r3) goto L_0x0020
        L_0x001f:
            r12 = r1
        L_0x0020:
            if (r2 == 0) goto L_0x0028
            int r4 = java.lang.Math.abs(r13)
            if (r4 >= r3) goto L_0x0029
        L_0x0028:
            r13 = r1
        L_0x0029:
            if (r12 != 0) goto L_0x002e
            if (r13 != 0) goto L_0x002e
            return r1
        L_0x002e:
            r3 = 0
            if (r12 == 0) goto L_0x0071
            android.widget.EdgeEffect r4 = r11.U0
            if (r4 == 0) goto L_0x0053
            float r4 = defpackage.b0h.u(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0053
            android.widget.EdgeEffect r4 = r11.U0
            int r5 = -r12
            int r6 = r11.getWidth()
            boolean r4 = r11.B0(r4, r5, r6)
            if (r4 == 0) goto L_0x0050
            android.widget.EdgeEffect r12 = r11.U0
            r12.onAbsorb(r5)
        L_0x004f:
            r12 = r1
        L_0x0050:
            r4 = r12
            r12 = r1
            goto L_0x0072
        L_0x0053:
            android.widget.EdgeEffect r4 = r11.W0
            if (r4 == 0) goto L_0x0071
            float r4 = defpackage.b0h.u(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0071
            android.widget.EdgeEffect r4 = r11.W0
            int r5 = r11.getWidth()
            boolean r4 = r11.B0(r4, r12, r5)
            if (r4 == 0) goto L_0x0050
            android.widget.EdgeEffect r4 = r11.W0
            r4.onAbsorb(r12)
            goto L_0x004f
        L_0x0071:
            r4 = r1
        L_0x0072:
            if (r13 == 0) goto L_0x00b3
            android.widget.EdgeEffect r5 = r11.V0
            if (r5 == 0) goto L_0x0095
            float r5 = defpackage.b0h.u(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0095
            android.widget.EdgeEffect r3 = r11.V0
            int r5 = -r13
            int r6 = r11.getHeight()
            boolean r3 = r11.B0(r3, r5, r6)
            if (r3 == 0) goto L_0x0093
            android.widget.EdgeEffect r13 = r11.V0
            r13.onAbsorb(r5)
        L_0x0092:
            r13 = r1
        L_0x0093:
            r3 = r1
            goto L_0x00b5
        L_0x0095:
            android.widget.EdgeEffect r5 = r11.X0
            if (r5 == 0) goto L_0x00b3
            float r5 = defpackage.b0h.u(r5)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00b3
            android.widget.EdgeEffect r3 = r11.X0
            int r5 = r11.getHeight()
            boolean r3 = r11.B0(r3, r13, r5)
            if (r3 == 0) goto L_0x0093
            android.widget.EdgeEffect r3 = r11.X0
            r3.onAbsorb(r13)
            goto L_0x0092
        L_0x00b3:
            r3 = r13
            r13 = r1
        L_0x00b5:
            ozc r5 = r11.n1
            int r6 = r11.j1
            if (r4 != 0) goto L_0x00bd
            if (r13 == 0) goto L_0x00d1
        L_0x00bd:
            int r7 = -r6
            int r4 = java.lang.Math.min(r4, r6)
            int r4 = java.lang.Math.max(r7, r4)
            int r13 = java.lang.Math.min(r13, r6)
            int r13 = java.lang.Math.max(r7, r13)
            r5.a(r4, r13)
        L_0x00d1:
            r7 = 1
            if (r12 != 0) goto L_0x00dc
            if (r3 != 0) goto L_0x00dc
            if (r4 != 0) goto L_0x00da
            if (r13 == 0) goto L_0x00db
        L_0x00da:
            r1 = r7
        L_0x00db:
            return r1
        L_0x00dc:
            float r13 = (float) r12
            float r4 = (float) r3
            boolean r8 = r11.dispatchNestedPreFling(r13, r4)
            if (r8 != 0) goto L_0x0155
            if (r0 != 0) goto L_0x00eb
            if (r2 == 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r8 = r1
            goto L_0x00ec
        L_0x00eb:
            r8 = r7
        L_0x00ec:
            r11.dispatchNestedFling(r13, r4, r8)
            dzc r13 = r11.h1
            if (r13 == 0) goto L_0x0133
            hfe r13 = (defpackage.hfe) r13
            androidx.recyclerview.widget.RecyclerView r4 = r13.a
            androidx.recyclerview.widget.a r4 = r4.getLayoutManager()
            if (r4 != 0) goto L_0x00fe
            goto L_0x0133
        L_0x00fe:
            androidx.recyclerview.widget.RecyclerView r9 = r13.a
            tyc r9 = r9.getAdapter()
            if (r9 != 0) goto L_0x0107
            goto L_0x0133
        L_0x0107:
            androidx.recyclerview.widget.RecyclerView r9 = r13.a
            int r9 = r9.getMinFlingVelocity()
            int r10 = java.lang.Math.abs(r3)
            if (r10 > r9) goto L_0x0119
            int r10 = java.lang.Math.abs(r12)
            if (r10 <= r9) goto L_0x0133
        L_0x0119:
            boolean r9 = r4 instanceof defpackage.kzc
            if (r9 != 0) goto L_0x011e
            goto L_0x0133
        L_0x011e:
            ew7 r9 = r13.c(r4)
            if (r9 != 0) goto L_0x0125
            goto L_0x0133
        L_0x0125:
            int r13 = r13.e(r4, r12, r3)
            r10 = -1
            if (r13 != r10) goto L_0x012d
            goto L_0x0133
        L_0x012d:
            r9.a = r13
            r4.I0(r9)
            return r7
        L_0x0133:
            if (r8 == 0) goto L_0x0155
            if (r2 == 0) goto L_0x0139
            r0 = r0 | 2
        L_0x0139:
            i6a r11 = r11.getScrollingChildHelper()
            r11.h(r0, r7)
            int r11 = -r6
            int r12 = java.lang.Math.min(r12, r6)
            int r12 = java.lang.Math.max(r11, r12)
            int r13 = java.lang.Math.min(r3, r6)
            int r11 = java.lang.Math.max(r11, r13)
            r5.a(r12, r11)
            return r7
        L_0x0155:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.P(int, int):boolean");
    }

    public final int Q(pzc pzc) {
        if (pzc.v(524) || !pzc.y()) {
            return -1;
        }
        u9 u9Var = this.v;
        int i = pzc.c;
        ArrayList arrayList = (ArrayList) u9Var.o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            t9 t9Var = (t9) arrayList.get(i2);
            int i3 = t9Var.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = t9Var.b;
                    if (i4 <= i) {
                        int i5 = t9Var.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = t9Var.b;
                    if (i6 == i) {
                        i = t9Var.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (t9Var.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (t9Var.b <= i) {
                i += t9Var.d;
            }
        }
        return i;
    }

    public final long R(pzc pzc) {
        return this.y0.b ? pzc.v : (long) pzc.c;
    }

    public final pzc U(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return V(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect X(View view) {
        bzc bzc = (bzc) view.getLayoutParams();
        boolean z2 = bzc.c;
        Rect rect = bzc.b;
        if (!z2) {
            return rect;
        }
        lzc lzc = this.q1;
        if (lzc.h && (bzc.a.G() || bzc.a.z())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.v0;
            rect2.set(0, 0, 0, 0);
            ((zyc) arrayList.get(i)).f(rect2, view, this, lzc);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        bzc.c = false;
        return rect;
    }

    public final zyc Y(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (zyc) this.B0.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public final boolean Z() {
        return !this.G0 || this.P0 || this.v.A();
    }

    public final void a(int i) {
        getScrollingChildHelper().i(i);
    }

    public void a0() {
        if (this.B0.size() != 0) {
            a aVar = this.z0;
            if (aVar != null) {
                aVar.c("Cannot invalidate item decorations during a scroll or layout");
            }
            d0();
            requestLayout();
        }
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        a aVar = this.z0;
        if (aVar != null) {
            aVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final boolean b0() {
        return this.R0 > 0;
    }

    public final void c0(int i) {
        if (this.z0 != null) {
            setScrollState(2);
            this.z0.x0(i);
            awakenScrollBars();
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof bzc) && this.z0.g((bzc) layoutParams);
    }

    public final int computeHorizontalScrollExtent() {
        a aVar = this.z0;
        if (aVar != null && aVar.e()) {
            return this.z0.k(this.q1);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        a aVar = this.z0;
        if (aVar != null && aVar.e()) {
            return this.z0.l(this.q1);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        a aVar = this.z0;
        if (aVar != null && aVar.e()) {
            return this.z0.m(this.q1);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        a aVar = this.z0;
        if (aVar != null && aVar.f()) {
            return this.z0.n(this.q1);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        a aVar = this.z0;
        if (aVar != null && aVar.f()) {
            return this.z0.o(this.q1);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        a aVar = this.z0;
        if (aVar != null && aVar.f()) {
            return this.z0.p(this.q1);
        }
        return 0;
    }

    public final void d0() {
        int I = this.w.I();
        for (int i = 0; i < I; i++) {
            ((bzc) this.w.H(i).getLayoutParams()).c = true;
        }
        hzc hzc = this.c;
        int size = hzc.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            bzc bzc = (bzc) ((pzc) hzc.c.get(i2)).a.getLayoutParams();
            if (bzc != null) {
                bzc.c = true;
            }
        }
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return getScrollingChildHelper().a(f, f2, z2);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(iArr, iArr2, i, i2, 0);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().e(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z2;
        boolean z3 = true;
        super.draw(canvas);
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i = 0; i < size; i++) {
            ((zyc) arrayList.get(i)).h(canvas, this);
        }
        EdgeEffect edgeEffect = this.U0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.y ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), c44.DEFAULT_ASPECT_RATIO);
            EdgeEffect edgeEffect2 = this.U0;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.V0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.y) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.V0;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.W0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.y ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.W0;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.X0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.y) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.X0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z2 |= z4;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.Y0 == null || arrayList.size() <= 0 || !this.Y0.n()) {
            z3 = z2;
        }
        if (z3) {
            WeakHashMap weakHashMap = gag.a;
            postInvalidateOnAnimation();
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(int i) {
        int E = this.w.E();
        for (int i2 = 0; i2 < E; i2++) {
            this.w.D(i2).offsetTopAndBottom(i);
        }
    }

    public final void f0(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int I = this.w.I();
        for (int i4 = 0; i4 < I; i4++) {
            pzc V = V(this.w.H(i4));
            if (V != null && !V.K()) {
                int i5 = V.c;
                lzc lzc = this.q1;
                if (i5 >= i3) {
                    if (K1) {
                        V.toString();
                    }
                    V.H(-i2, z2);
                    lzc.g = true;
                } else if (i5 >= i) {
                    if (K1) {
                        V.toString();
                    }
                    V.n(8);
                    V.H(-i2, z2);
                    V.c = i - 1;
                    lzc.g = true;
                }
            }
        }
        hzc hzc = this.c;
        for (int size = hzc.c.size() - 1; size >= 0; size--) {
            pzc pzc = (pzc) hzc.c.get(size);
            if (pzc != null) {
                int i6 = pzc.c;
                if (i6 >= i3) {
                    if (K1) {
                        pzc.toString();
                    }
                    pzc.H(-i2, z2);
                } else if (i6 >= i) {
                    pzc.n(8);
                    hzc.f(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0162, code lost:
        if (r7 > 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0179, code lost:
        if (r5 > 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x017c, code lost:
        if (r7 < 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x017f, code lost:
        if (r5 < 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0187, code lost:
        if ((r5 * r6) <= 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x018f, code lost:
        if ((r5 * r6) >= 0) goto L_0x0192;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.a r3 = r0.z0
            r3.getClass()
            tyc r3 = r0.y0
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0021
            androidx.recyclerview.widget.a r3 = r0.z0
            if (r3 == 0) goto L_0x0021
            boolean r3 = r16.b0()
            if (r3 != 0) goto L_0x0021
            boolean r3 = r0.J0
            if (r3 != 0) goto L_0x0021
            r3 = r4
            goto L_0x0022
        L_0x0021:
            r3 = r5
        L_0x0022:
            android.view.FocusFinder r6 = android.view.FocusFinder.getInstance()
            lzc r7 = r0.q1
            r8 = 17
            r10 = 33
            r12 = 0
            r13 = 2
            if (r3 == 0) goto L_0x0093
            if (r2 == r13) goto L_0x0034
            if (r2 != r4) goto L_0x0093
        L_0x0034:
            androidx.recyclerview.widget.a r3 = r0.z0
            boolean r3 = r3.f()
            if (r3 == 0) goto L_0x004a
            if (r2 != r13) goto L_0x0041
            r3 = 130(0x82, float:1.82E-43)
            goto L_0x0042
        L_0x0041:
            r3 = r10
        L_0x0042:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x004a
            r3 = r4
            goto L_0x004b
        L_0x004a:
            r3 = r5
        L_0x004b:
            if (r3 != 0) goto L_0x0075
            androidx.recyclerview.widget.a r14 = r0.z0
            boolean r14 = r14.e()
            if (r14 == 0) goto L_0x0075
            androidx.recyclerview.widget.a r3 = r0.z0
            int r3 = r3.H()
            if (r3 != r4) goto L_0x005f
            r3 = r4
            goto L_0x0060
        L_0x005f:
            r3 = r5
        L_0x0060:
            if (r2 != r13) goto L_0x0064
            r14 = r4
            goto L_0x0065
        L_0x0064:
            r14 = r5
        L_0x0065:
            r3 = r3 ^ r14
            if (r3 == 0) goto L_0x006b
            r3 = 66
            goto L_0x006c
        L_0x006b:
            r3 = r8
        L_0x006c:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x0074
            r3 = r4
            goto L_0x0075
        L_0x0074:
            r3 = r5
        L_0x0075:
            if (r3 == 0) goto L_0x008e
            r16.s()
            android.view.View r3 = r16.I(r17)
            if (r3 != 0) goto L_0x0081
            return r12
        L_0x0081:
            r16.E0()
            androidx.recyclerview.widget.a r3 = r0.z0
            hzc r14 = r0.c
            r3.Y(r1, r2, r14, r7)
            r0.F0(r5)
        L_0x008e:
            android.view.View r3 = r6.findNextFocus(r0, r1, r2)
            goto L_0x00b5
        L_0x0093:
            android.view.View r6 = r6.findNextFocus(r0, r1, r2)
            if (r6 != 0) goto L_0x00b4
            if (r3 == 0) goto L_0x00b4
            r16.s()
            android.view.View r3 = r16.I(r17)
            if (r3 != 0) goto L_0x00a5
            return r12
        L_0x00a5:
            r16.E0()
            androidx.recyclerview.widget.a r3 = r0.z0
            hzc r6 = r0.c
            android.view.View r3 = r3.Y(r1, r2, r6, r7)
            r0.F0(r5)
            goto L_0x00b5
        L_0x00b4:
            r3 = r6
        L_0x00b5:
            if (r3 == 0) goto L_0x00cc
            boolean r6 = r3.hasFocusable()
            if (r6 != 0) goto L_0x00cc
            android.view.View r4 = r16.getFocusedChild()
            if (r4 != 0) goto L_0x00c8
            android.view.View r0 = super.focusSearch(r17, r18)
            return r0
        L_0x00c8:
            r0.v0(r3, r12)
            return r1
        L_0x00cc:
            if (r3 == 0) goto L_0x0192
            if (r3 == r0) goto L_0x0192
            if (r3 != r1) goto L_0x00d4
            goto L_0x0192
        L_0x00d4:
            android.view.View r6 = r0.I(r3)
            if (r6 != 0) goto L_0x00dd
            r4 = r5
            goto L_0x0193
        L_0x00dd:
            if (r1 != 0) goto L_0x00e1
            goto L_0x0193
        L_0x00e1:
            android.view.View r6 = r16.I(r17)
            if (r6 != 0) goto L_0x00e9
            goto L_0x0193
        L_0x00e9:
            int r6 = r17.getWidth()
            int r7 = r17.getHeight()
            android.graphics.Rect r12 = r0.v0
            r12.set(r5, r5, r6, r7)
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            android.graphics.Rect r14 = r0.w0
            r14.set(r5, r5, r6, r7)
            r0.offsetDescendantRectToMyCoords(r1, r12)
            r0.offsetDescendantRectToMyCoords(r3, r14)
            androidx.recyclerview.widget.a r6 = r0.z0
            int r6 = r6.H()
            if (r6 != r4) goto L_0x0113
            r6 = -1
            goto L_0x0114
        L_0x0113:
            r6 = r4
        L_0x0114:
            int r15 = r12.left
            int r5 = r14.left
            if (r15 < r5) goto L_0x011e
            int r7 = r12.right
            if (r7 > r5) goto L_0x0126
        L_0x011e:
            int r7 = r12.right
            int r11 = r14.right
            if (r7 >= r11) goto L_0x0126
            r5 = r4
            goto L_0x0133
        L_0x0126:
            int r7 = r12.right
            int r11 = r14.right
            if (r7 > r11) goto L_0x012e
            if (r15 < r11) goto L_0x0132
        L_0x012e:
            if (r15 <= r5) goto L_0x0132
            r5 = -1
            goto L_0x0133
        L_0x0132:
            r5 = 0
        L_0x0133:
            int r7 = r12.top
            int r11 = r14.top
            if (r7 < r11) goto L_0x013d
            int r15 = r12.bottom
            if (r15 > r11) goto L_0x0145
        L_0x013d:
            int r15 = r12.bottom
            int r9 = r14.bottom
            if (r15 >= r9) goto L_0x0145
            r7 = r4
            goto L_0x0152
        L_0x0145:
            int r9 = r12.bottom
            int r12 = r14.bottom
            if (r9 > r12) goto L_0x014d
            if (r7 < r12) goto L_0x0151
        L_0x014d:
            if (r7 <= r11) goto L_0x0151
            r7 = -1
            goto L_0x0152
        L_0x0151:
            r7 = 0
        L_0x0152:
            if (r2 == r4) goto L_0x018a
            if (r2 == r13) goto L_0x0182
            if (r2 == r8) goto L_0x017f
            if (r2 == r10) goto L_0x017c
            r6 = 66
            if (r2 == r6) goto L_0x0179
            r6 = 130(0x82, float:1.82E-43)
            if (r2 != r6) goto L_0x0165
            if (r7 <= 0) goto L_0x0192
            goto L_0x0193
        L_0x0165:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid direction: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r0 = defpackage.a81.k(r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x0179:
            if (r5 <= 0) goto L_0x0192
            goto L_0x0193
        L_0x017c:
            if (r7 >= 0) goto L_0x0192
            goto L_0x0193
        L_0x017f:
            if (r5 >= 0) goto L_0x0192
            goto L_0x0193
        L_0x0182:
            if (r7 > 0) goto L_0x0193
            if (r7 != 0) goto L_0x0192
            int r5 = r5 * r6
            if (r5 <= 0) goto L_0x0192
            goto L_0x0193
        L_0x018a:
            if (r7 < 0) goto L_0x0193
            if (r7 != 0) goto L_0x0192
            int r5 = r5 * r6
            if (r5 >= 0) goto L_0x0192
            goto L_0x0193
        L_0x0192:
            r4 = 0
        L_0x0193:
            if (r4 == 0) goto L_0x0196
            goto L_0x019a
        L_0x0196:
            android.view.View r3 = super.focusSearch(r17, r18)
        L_0x019a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0() {
        this.R0++;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = this.z0;
        if (aVar != null) {
            return aVar.s();
        }
        throw new IllegalStateException(a81.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        a aVar = this.z0;
        if (aVar != null) {
            return aVar.t(getContext(), attributeSet);
        }
        throw new IllegalStateException(a81.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public tyc getAdapter() {
        return this.y0;
    }

    public int getBaseline() {
        a aVar = this.z0;
        if (aVar == null) {
            return super.getBaseline();
        }
        aVar.getClass();
        return -1;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public boolean getClipToPadding() {
        return this.y;
    }

    public rzc getCompatAccessibilityDelegate() {
        return this.x1;
    }

    public xyc getEdgeEffectFactory() {
        return this.T0;
    }

    public yyc getItemAnimator() {
        return this.Y0;
    }

    public int getItemDecorationCount() {
        return this.B0.size();
    }

    public a getLayoutManager() {
        return this.z0;
    }

    public int getMaxFlingVelocity() {
        return this.j1;
    }

    public int getMinFlingVelocity() {
        return this.i1;
    }

    public long getNanoTime() {
        if (P1) {
            return System.nanoTime();
        }
        return 0;
    }

    public dzc getOnFlingListener() {
        return this.h1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.m1;
    }

    public b getRecycledViewPool() {
        return this.c.c();
    }

    public int getScrollState() {
        return this.Z0;
    }

    public final void h0(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.R0 - 1;
        this.R0 = i2;
        if (i2 >= 1) {
            return;
        }
        if (!J1 || i2 >= 0) {
            this.R0 = 0;
            if (z2) {
                int i3 = this.L0;
                this.L0 = 0;
                if (!(i3 == 0 || (accessibilityManager = this.N0) == null || !accessibilityManager.isEnabled())) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.D1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    pzc pzc = (pzc) arrayList.get(size);
                    if (pzc.a.getParent() == this && !pzc.K() && (i = pzc.z0) != -1) {
                        WeakHashMap weakHashMap = gag.a;
                        pzc.a.setImportantForAccessibility(i);
                        pzc.z0 = -1;
                    }
                }
                arrayList.clear();
                return;
            }
            return;
        }
        throw new IllegalStateException(a81.k(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(pzc pzc) {
        View view = pzc.a;
        boolean z2 = view.getParent() == this;
        this.c.k(U(view));
        if (pzc.E()) {
            this.w.l(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.w.a(-1, view, true);
        } else {
            mqf mqf = this.w;
            int indexOfChild = ((RecyclerView) ((u6h) mqf.o).b).indexOfChild(view);
            if (indexOfChild >= 0) {
                ((jz2) mqf.v).b0(indexOfChild);
                mqf.J(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void i0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.a1) {
            int i = actionIndex == 0 ? 1 : 0;
            this.a1 = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.e1 = x2;
            this.c1 = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f1 = y2;
            this.d1 = y2;
        }
    }

    public final boolean isAttachedToWindow() {
        return this.E0;
    }

    public final boolean isLayoutSuppressed() {
        return this.J0;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(zyc zyc) {
        a aVar = this.z0;
        if (aVar != null) {
            aVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.B0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(zyc);
        d0();
        requestLayout();
    }

    public void j0() {
    }

    public final void k(czc czc) {
        if (this.O0 == null) {
            this.O0 = new ArrayList();
        }
        this.O0.add(czc);
    }

    public final void k0() {
        if (!this.w1 && this.E0) {
            WeakHashMap weakHashMap = gag.a;
            postOnAnimation(this.E1);
            this.w1 = true;
        }
    }

    public final void l(ezc ezc) {
        this.C0.add(ezc);
    }

    public final void l0() {
        boolean z2;
        boolean z3 = false;
        if (this.P0) {
            u9 u9Var = this.v;
            u9Var.H((ArrayList) u9Var.o);
            u9Var.H((ArrayList) u9Var.v);
            u9Var.b = 0;
            if (this.Q0) {
                this.z0.e0();
            }
        }
        if (this.Y0 == null || !this.z0.J0()) {
            this.v.l();
        } else {
            this.v.F();
        }
        boolean z4 = this.t1 || this.u1;
        boolean z5 = this.G0 && this.Y0 != null && ((z2 = this.P0) || z4 || this.z0.f) && (!z2 || this.y0.b);
        lzc lzc = this.q1;
        lzc.k = z5;
        if (z5 && z4 && !this.P0 && this.Y0 != null && this.z0.J0()) {
            z3 = true;
        }
        lzc.l = z3;
    }

    public void m(fzc fzc) {
        if (this.s1 == null) {
            this.s1 = new ArrayList();
        }
        this.s1.add(fzc);
    }

    public final void m0(boolean z2) {
        this.Q0 = z2 | this.Q0;
        this.P0 = true;
        int I = this.w.I();
        for (int i = 0; i < I; i++) {
            pzc V = V(this.w.H(i));
            if (V != null && !V.K()) {
                V.n(6);
            }
        }
        d0();
        hzc hzc = this.c;
        int size = hzc.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            pzc pzc = (pzc) hzc.c.get(i2);
            if (pzc != null) {
                pzc.n(6);
                pzc.n(1024);
            }
        }
        tyc tyc = hzc.h.y0;
        if (tyc == null || !tyc.b) {
            hzc.e();
        }
    }

    public void n(String str) {
        if (b0()) {
            if (str == null) {
                throw new IllegalStateException(a81.k(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.S0 > 0) {
            new IllegalStateException(a81.k(this, new StringBuilder("")));
        }
    }

    public final void n0(pzc pzc, ft ftVar) {
        pzc.X &= -8193;
        boolean z2 = this.q1.i;
        ox0 ox0 = this.x;
        if (z2 && pzc.G() && !pzc.B() && !pzc.K()) {
            ((ya8) ox0.b).i(R(pzc), pzc);
        }
        qae qae = (qae) ox0.c;
        pag pag = (pag) qae.get(pzc);
        if (pag == null) {
            pag = pag.a();
            qae.put(pzc, pag);
        }
        pag.b = ftVar;
        pag.a |= 4;
    }

    public final int o0(float f, int i) {
        float height = f / ((float) getHeight());
        float width = ((float) i) / ((float) getWidth());
        EdgeEffect edgeEffect = this.U0;
        float f2 = c44.DEFAULT_ASPECT_RATIO;
        if (edgeEffect == null || b0h.u(edgeEffect) == c44.DEFAULT_ASPECT_RATIO) {
            EdgeEffect edgeEffect2 = this.W0;
            if (!(edgeEffect2 == null || b0h.u(edgeEffect2) == c44.DEFAULT_ASPECT_RATIO)) {
                if (canScrollHorizontally(1)) {
                    this.W0.onRelease();
                } else {
                    float G = b0h.G(this.W0, width, height);
                    if (b0h.u(this.W0) == c44.DEFAULT_ASPECT_RATIO) {
                        this.W0.onRelease();
                    }
                    f2 = G;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.U0.onRelease();
            } else {
                float f3 = -b0h.G(this.U0, -width, 1.0f - height);
                if (b0h.u(this.U0) == c44.DEFAULT_ASPECT_RATIO) {
                    this.U0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * ((float) getWidth()));
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [kp6, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r1 >= 30.0f) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.R0 = r0
            r1 = 1
            r5.E0 = r1
            boolean r2 = r5.G0
            if (r2 == 0) goto L_0x0015
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0015
            r2 = r1
            goto L_0x0016
        L_0x0015:
            r2 = r0
        L_0x0016:
            r5.G0 = r2
            hzc r2 = r5.c
            r2.d()
            androidx.recyclerview.widget.a r2 = r5.z0
            if (r2 == 0) goto L_0x0026
            r2.g = r1
            r2.W(r5)
        L_0x0026:
            r5.w1 = r0
            boolean r0 = P1
            if (r0 == 0) goto L_0x0091
            java.lang.ThreadLocal r0 = defpackage.kp6.v
            java.lang.Object r1 = r0.get()
            kp6 r1 = (defpackage.kp6) r1
            r5.o1 = r1
            if (r1 != 0) goto L_0x0074
            kp6 r1 = new kp6
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.o = r2
            r5.o1 = r1
            java.util.WeakHashMap r1 = defpackage.gag.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x0066
            if (r1 == 0) goto L_0x0066
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0068:
            kp6 r2 = r5.o1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L_0x0074:
            kp6 r0 = r5.o1
            r0.getClass()
            boolean r1 = J1
            java.util.ArrayList r0 = r0.a
            if (r1 == 0) goto L_0x008e
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L_0x0086
            goto L_0x008e
        L_0x0086:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "RecyclerView already present in worker list!"
            r5.<init>(r0)
            throw r5
        L_0x008e:
            r0.add(r5)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onDetachedFromWindow() {
        kp6 kp6;
        super.onDetachedFromWindow();
        yyc yyc = this.Y0;
        if (yyc != null) {
            yyc.k();
        }
        G0();
        int i = 0;
        this.E0 = false;
        a aVar = this.z0;
        if (aVar != null) {
            aVar.g = false;
            aVar.X(this);
        }
        this.D1.clear();
        removeCallbacks(this.E1);
        this.x.getClass();
        do {
        } while (pag.d.c() != null);
        hzc hzc = this.c;
        for (int i2 = 0; i2 < hzc.c.size(); i2++) {
            tqb.a(((pzc) hzc.c.get(i2)).a);
        }
        tyc tyc = hzc.h.y0;
        b bVar = hzc.g;
        if (bVar != null) {
            bVar.detachForPoolingContainer(tyc, false);
        }
        int i3 = tqb.a;
        while (i < getChildCount()) {
            int i4 = i + 1;
            View childAt = getChildAt(i);
            if (childAt != null) {
                int i5 = tqb.a;
                uqb uqb = (uqb) childAt.getTag(i5);
                if (uqb == null) {
                    uqb = new uqb();
                    childAt.setTag(i5, uqb);
                }
                ArrayList arrayList = uqb.a;
                int lastIndex = CollectionsKt.getLastIndex(arrayList);
                if (-1 >= lastIndex) {
                    i = i4;
                } else {
                    rae.w(arrayList.get(lastIndex));
                    throw null;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        if (P1 && (kp6 = this.o1) != null) {
            boolean remove = kp6.a.remove(this);
            if (!J1 || remove) {
                this.o1 = null;
                return;
            }
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zyc) arrayList.get(i)).g(canvas, this, this.q1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            androidx.recyclerview.widget.a r0 = r6.z0
            r8 = 0
            if (r0 != 0) goto L_0x000a
            return r8
        L_0x000a:
            boolean r0 = r6.J0
            if (r0 == 0) goto L_0x000f
            return r8
        L_0x000f:
            int r0 = r17.getAction()
            r1 = 8
            if (r0 != r1) goto L_0x00ef
            int r0 = r17.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0042
            androidx.recyclerview.widget.a r0 = r6.z0
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0030
            r0 = 9
            float r0 = r7.getAxisValue(r0)
            float r0 = -r0
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            androidx.recyclerview.widget.a r2 = r6.z0
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0040
            r2 = 10
            float r2 = r7.getAxisValue(r2)
            goto L_0x0068
        L_0x0040:
            r2 = r1
            goto L_0x0068
        L_0x0042:
            int r0 = r17.getSource()
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0066
            r0 = 26
            float r0 = r7.getAxisValue(r0)
            androidx.recyclerview.widget.a r2 = r6.z0
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x005b
            float r0 = -r0
            goto L_0x0040
        L_0x005b:
            androidx.recyclerview.widget.a r2 = r6.z0
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0066
            r2 = r0
            r0 = r1
            goto L_0x0068
        L_0x0066:
            r0 = r1
            r2 = r0
        L_0x0068:
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0070
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00ef
        L_0x0070:
            float r1 = r6.k1
            float r2 = r2 * r1
            int r1 = (int) r2
            float r2 = r6.l1
            float r0 = r0 * r2
            int r0 = (int) r0
            androidx.recyclerview.widget.a r2 = r6.z0
            if (r2 != 0) goto L_0x007e
            goto L_0x00ef
        L_0x007e:
            boolean r3 = r6.J0
            if (r3 == 0) goto L_0x0084
            goto L_0x00ef
        L_0x0084:
            int[] r9 = r6.C1
            r9[r8] = r8
            r10 = 1
            r9[r10] = r8
            boolean r11 = r2.e()
            androidx.recyclerview.widget.a r2 = r6.z0
            boolean r12 = r2.f()
            if (r12 == 0) goto L_0x009a
            r2 = r11 | 2
            goto L_0x009b
        L_0x009a:
            r2 = r11
        L_0x009b:
            float r3 = r17.getY()
            float r4 = r17.getX()
            int r3 = r6.o0(r3, r1)
            int r13 = r1 - r3
            int r1 = r6.p0(r4, r0)
            int r14 = r0 - r1
            i6a r0 = r16.getScrollingChildHelper()
            r15 = 1
            r0.h(r2, r15)
            if (r11 == 0) goto L_0x00bb
            r3 = r13
            goto L_0x00bc
        L_0x00bb:
            r3 = r8
        L_0x00bc:
            if (r12 == 0) goto L_0x00c0
            r4 = r14
            goto L_0x00c1
        L_0x00c0:
            r4 = r8
        L_0x00c1:
            int[] r1 = r6.C1
            int[] r2 = r6.A1
            r0 = r16
            r5 = r15
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00d4
            r0 = r9[r8]
            int r13 = r13 - r0
            r0 = r9[r10]
            int r14 = r14 - r0
        L_0x00d4:
            if (r11 == 0) goto L_0x00d8
            r0 = r13
            goto L_0x00d9
        L_0x00d8:
            r0 = r8
        L_0x00d9:
            if (r12 == 0) goto L_0x00dd
            r1 = r14
            goto L_0x00de
        L_0x00dd:
            r1 = r8
        L_0x00de:
            r6.x0(r0, r1, r7, r15)
            kp6 r0 = r6.o1
            if (r0 == 0) goto L_0x00ec
            if (r13 != 0) goto L_0x00e9
            if (r14 == 0) goto L_0x00ec
        L_0x00e9:
            r0.a(r6, r13, r14)
        L_0x00ec:
            r6.a(r15)
        L_0x00ef:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (this.J0) {
            return false;
        }
        this.D0 = null;
        if (J(motionEvent)) {
            w0();
            setScrollState(0);
            return true;
        }
        a aVar = this.z0;
        if (aVar == null) {
            return false;
        }
        boolean e = aVar.e();
        boolean f = this.z0.f();
        if (this.b1 == null) {
            this.b1 = VelocityTracker.obtain();
        }
        this.b1.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.K0) {
                this.K0 = false;
            }
            this.a1 = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.e1 = x2;
            this.c1 = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1 = y2;
            this.d1 = y2;
            EdgeEffect edgeEffect = this.U0;
            if (edgeEffect == null || b0h.u(edgeEffect) == c44.DEFAULT_ASPECT_RATIO || canScrollHorizontally(-1)) {
                z2 = false;
            } else {
                b0h.G(this.U0, c44.DEFAULT_ASPECT_RATIO, 1.0f - (motionEvent.getY() / ((float) getHeight())));
                z2 = true;
            }
            EdgeEffect edgeEffect2 = this.W0;
            if (!(edgeEffect2 == null || b0h.u(edgeEffect2) == c44.DEFAULT_ASPECT_RATIO || canScrollHorizontally(1))) {
                b0h.G(this.W0, c44.DEFAULT_ASPECT_RATIO, motionEvent.getY() / ((float) getHeight()));
                z2 = true;
            }
            EdgeEffect edgeEffect3 = this.V0;
            if (!(edgeEffect3 == null || b0h.u(edgeEffect3) == c44.DEFAULT_ASPECT_RATIO || canScrollVertically(-1))) {
                b0h.G(this.V0, c44.DEFAULT_ASPECT_RATIO, motionEvent.getX() / ((float) getWidth()));
                z2 = true;
            }
            EdgeEffect edgeEffect4 = this.X0;
            if (!(edgeEffect4 == null || b0h.u(edgeEffect4) == c44.DEFAULT_ASPECT_RATIO || canScrollVertically(1))) {
                b0h.G(this.X0, c44.DEFAULT_ASPECT_RATIO, 1.0f - (motionEvent.getX() / ((float) getWidth())));
                z2 = true;
            }
            if (z2 || this.Z0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                a(1);
            }
            int[] iArr = this.B1;
            iArr[1] = 0;
            iArr[0] = 0;
            if (f) {
                e |= true;
            }
            getScrollingChildHelper().h(e ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.b1.clear();
            a(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.a1);
            if (findPointerIndex < 0) {
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.Z0 != 1) {
                int i = x3 - this.c1;
                int i2 = y3 - this.d1;
                if (!e || Math.abs(i) <= this.g1) {
                    z3 = false;
                } else {
                    this.e1 = x3;
                    z3 = true;
                }
                if (f && Math.abs(i2) > this.g1) {
                    this.f1 = y3;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            w0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.a1 = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.e1 = x4;
            this.c1 = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1 = y4;
            this.d1 = y4;
        } else if (actionMasked == 6) {
            i0(motionEvent);
        }
        return this.Z0 == 1;
    }

    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        v();
        Trace.endSection();
        this.G0 = true;
    }

    public void onMeasure(int i, int i2) {
        a aVar = this.z0;
        if (aVar == null) {
            t(i, i2);
            return;
        }
        boolean Q = aVar.Q();
        boolean z2 = false;
        lzc lzc = this.q1;
        if (Q) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.z0.b.t(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.F1 = z2;
            if (!z2 && this.y0 != null) {
                if (lzc.e == 1) {
                    w();
                }
                this.z0.A0(i, i2);
                lzc.j = true;
                x();
                this.z0.C0(i, i2);
                if (this.z0.F0()) {
                    this.z0.A0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    lzc.j = true;
                    x();
                    this.z0.C0(i, i2);
                }
                this.G1 = getMeasuredWidth();
                this.H1 = getMeasuredHeight();
            }
        } else if (this.F0) {
            this.z0.b.t(i, i2);
        } else {
            if (this.M0) {
                E0();
                g0();
                l0();
                h0(true);
                if (lzc.l) {
                    lzc.h = true;
                } else {
                    this.v.l();
                    lzc.h = false;
                }
                this.M0 = false;
                F0(false);
            } else if (lzc.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            tyc tyc = this.y0;
            if (tyc != null) {
                lzc.f = tyc.j();
            } else {
                lzc.f = 0;
            }
            E0();
            this.z0.b.t(i, i2);
            F0(false);
            lzc.h = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (b0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof jzc)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        jzc jzc = (jzc) parcelable;
        this.o = jzc;
        super.onRestoreInstanceState(jzc.a);
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [jzc, android.os.Parcelable, z] */
    public final Parcelable onSaveInstanceState() {
        ? zVar = new z(super.onSaveInstanceState());
        jzc jzc = this.o;
        if (jzc != null) {
            zVar.c = jzc.c;
        } else {
            a aVar = this.z0;
            if (aVar != null) {
                zVar.c = aVar.m0();
            } else {
                zVar.c = null;
            }
        }
        return zVar;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.X0 = null;
            this.V0 = null;
            this.W0 = null;
            this.U0 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            r20 = this;
            r6 = r20
            r7 = r21
            boolean r0 = r6.J0
            r8 = 0
            if (r0 != 0) goto L_0x01f9
            boolean r0 = r6.K0
            if (r0 == 0) goto L_0x000f
            goto L_0x01f9
        L_0x000f:
            ezc r0 = r6.D0
            r1 = 3
            r9 = 1
            if (r0 != 0) goto L_0x0022
            int r0 = r21.getAction()
            if (r0 != 0) goto L_0x001d
            r0 = r8
            goto L_0x0031
        L_0x001d:
            boolean r0 = r20.J(r21)
            goto L_0x0031
        L_0x0022:
            r0.a(r7)
            int r0 = r21.getAction()
            if (r0 == r1) goto L_0x002d
            if (r0 != r9) goto L_0x0030
        L_0x002d:
            r0 = 0
            r6.D0 = r0
        L_0x0030:
            r0 = r9
        L_0x0031:
            if (r0 == 0) goto L_0x003a
            r20.w0()
            r6.setScrollState(r8)
            return r9
        L_0x003a:
            androidx.recyclerview.widget.a r0 = r6.z0
            if (r0 != 0) goto L_0x003f
            return r8
        L_0x003f:
            boolean r10 = r0.e()
            androidx.recyclerview.widget.a r0 = r6.z0
            boolean r11 = r0.f()
            android.view.VelocityTracker r0 = r6.b1
            if (r0 != 0) goto L_0x0053
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.b1 = r0
        L_0x0053:
            int r0 = r21.getActionMasked()
            int r2 = r21.getActionIndex()
            int[] r12 = r6.B1
            if (r0 != 0) goto L_0x0063
            r12[r9] = r8
            r12[r8] = r8
        L_0x0063:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r21)
            r3 = r12[r8]
            float r3 = (float) r3
            r4 = r12[r9]
            float r4 = (float) r4
            r13.offsetLocation(r3, r4)
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01cb
            if (r0 == r9) goto L_0x018a
            r4 = 2
            if (r0 == r4) goto L_0x00ac
            if (r0 == r1) goto L_0x00a4
            r1 = 5
            if (r0 == r1) goto L_0x0088
            r1 = 6
            if (r0 == r1) goto L_0x0083
            goto L_0x01f0
        L_0x0083:
            r20.i0(r21)
            goto L_0x01f0
        L_0x0088:
            int r0 = r7.getPointerId(r2)
            r6.a1 = r0
            float r0 = r7.getX(r2)
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.e1 = r0
            r6.c1 = r0
            float r0 = r7.getY(r2)
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.f1 = r0
            r6.d1 = r0
            goto L_0x01f0
        L_0x00a4:
            r20.w0()
            r6.setScrollState(r8)
            goto L_0x01f0
        L_0x00ac:
            int r0 = r6.a1
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b5
            return r8
        L_0x00b5:
            float r1 = r7.getX(r0)
            float r1 = r1 + r3
            int r14 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r3
            int r15 = (int) r0
            int r0 = r6.e1
            int r0 = r0 - r14
            int r1 = r6.f1
            int r1 = r1 - r15
            int r2 = r6.Z0
            if (r2 == r9) goto L_0x00fe
            if (r10 == 0) goto L_0x00e2
            if (r0 <= 0) goto L_0x00d7
            int r2 = r6.g1
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00de
        L_0x00d7:
            int r2 = r6.g1
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00de:
            if (r0 == 0) goto L_0x00e2
            r2 = r9
            goto L_0x00e3
        L_0x00e2:
            r2 = r8
        L_0x00e3:
            if (r11 == 0) goto L_0x00f9
            if (r1 <= 0) goto L_0x00ef
            int r3 = r6.g1
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f6
        L_0x00ef:
            int r3 = r6.g1
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f6:
            if (r1 == 0) goto L_0x00f9
            r2 = r9
        L_0x00f9:
            if (r2 == 0) goto L_0x00fe
            r6.setScrollState(r9)
        L_0x00fe:
            int r2 = r6.Z0
            if (r2 != r9) goto L_0x01f0
            int[] r5 = r6.C1
            r5[r8] = r8
            r5[r9] = r8
            float r2 = r21.getY()
            int r2 = r6.o0(r2, r0)
            int r16 = r0 - r2
            float r0 = r21.getX()
            int r0 = r6.p0(r0, r1)
            int r17 = r1 - r0
            if (r10 == 0) goto L_0x0121
            r3 = r16
            goto L_0x0122
        L_0x0121:
            r3 = r8
        L_0x0122:
            if (r11 == 0) goto L_0x0127
            r4 = r17
            goto L_0x0128
        L_0x0127:
            r4 = r8
        L_0x0128:
            r18 = 0
            int[] r1 = r6.C1
            int[] r2 = r6.A1
            r0 = r20
            r19 = r5
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            int[] r1 = r6.A1
            if (r0 == 0) goto L_0x0159
            r0 = r19[r8]
            int r16 = r16 - r0
            r0 = r19[r9]
            int r17 = r17 - r0
            r0 = r12[r8]
            r2 = r1[r8]
            int r0 = r0 + r2
            r12[r8] = r0
            r0 = r12[r9]
            r2 = r1[r9]
            int r0 = r0 + r2
            r12[r9] = r0
            android.view.ViewParent r0 = r20.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0159:
            r0 = r16
            r2 = r17
            r3 = r1[r8]
            int r14 = r14 - r3
            r6.e1 = r14
            r1 = r1[r9]
            int r15 = r15 - r1
            r6.f1 = r15
            if (r10 == 0) goto L_0x016b
            r1 = r0
            goto L_0x016c
        L_0x016b:
            r1 = r8
        L_0x016c:
            if (r11 == 0) goto L_0x0170
            r3 = r2
            goto L_0x0171
        L_0x0170:
            r3 = r8
        L_0x0171:
            boolean r1 = r6.x0(r1, r3, r7, r8)
            if (r1 == 0) goto L_0x017e
            android.view.ViewParent r1 = r20.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x017e:
            kp6 r1 = r6.o1
            if (r1 == 0) goto L_0x01f0
            if (r0 != 0) goto L_0x0186
            if (r2 == 0) goto L_0x01f0
        L_0x0186:
            r1.a(r6, r0, r2)
            goto L_0x01f0
        L_0x018a:
            android.view.VelocityTracker r0 = r6.b1
            r0.addMovement(r13)
            android.view.VelocityTracker r0 = r6.b1
            int r1 = r6.j1
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            r0 = 0
            if (r10 == 0) goto L_0x01a6
            android.view.VelocityTracker r1 = r6.b1
            int r2 = r6.a1
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x01a7
        L_0x01a6:
            r1 = r0
        L_0x01a7:
            if (r11 == 0) goto L_0x01b3
            android.view.VelocityTracker r2 = r6.b1
            int r3 = r6.a1
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x01b4
        L_0x01b3:
            r2 = r0
        L_0x01b4:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01bc
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01c4
        L_0x01bc:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.P(r0, r1)
            if (r0 != 0) goto L_0x01c7
        L_0x01c4:
            r6.setScrollState(r8)
        L_0x01c7:
            r20.w0()
            goto L_0x01f5
        L_0x01cb:
            int r0 = r7.getPointerId(r8)
            r6.a1 = r0
            float r0 = r21.getX()
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.e1 = r0
            r6.c1 = r0
            float r0 = r21.getY()
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.f1 = r0
            r6.d1 = r0
            if (r11 == 0) goto L_0x01e9
            r10 = r10 | 2
        L_0x01e9:
            i6a r0 = r20.getScrollingChildHelper()
            r0.h(r10, r8)
        L_0x01f0:
            android.view.VelocityTracker r0 = r6.b1
            r0.addMovement(r13)
        L_0x01f5:
            r13.recycle()
            return r9
        L_0x01f9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        int I = this.w.I();
        for (int i = 0; i < I; i++) {
            pzc V = V(this.w.H(i));
            if (!V.K()) {
                V.o = -1;
                V.x = -1;
            }
        }
        hzc hzc = this.c;
        int size = hzc.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            pzc pzc = (pzc) hzc.c.get(i2);
            pzc.o = -1;
            pzc.x = -1;
        }
        int size2 = hzc.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            pzc pzc2 = (pzc) hzc.a.get(i3);
            pzc2.o = -1;
            pzc2.x = -1;
        }
        ArrayList arrayList = hzc.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                pzc pzc3 = (pzc) hzc.b.get(i4);
                pzc3.o = -1;
                pzc3.x = -1;
            }
        }
    }

    public final int p0(float f, int i) {
        float width = f / ((float) getWidth());
        float height = ((float) i) / ((float) getHeight());
        EdgeEffect edgeEffect = this.V0;
        float f2 = c44.DEFAULT_ASPECT_RATIO;
        if (edgeEffect == null || b0h.u(edgeEffect) == c44.DEFAULT_ASPECT_RATIO) {
            EdgeEffect edgeEffect2 = this.X0;
            if (!(edgeEffect2 == null || b0h.u(edgeEffect2) == c44.DEFAULT_ASPECT_RATIO)) {
                if (canScrollVertically(1)) {
                    this.X0.onRelease();
                } else {
                    float G = b0h.G(this.X0, height, 1.0f - width);
                    if (b0h.u(this.X0) == c44.DEFAULT_ASPECT_RATIO) {
                        this.X0.onRelease();
                    }
                    f2 = G;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.V0.onRelease();
            } else {
                float f3 = -b0h.G(this.V0, -height, width);
                if (b0h.u(this.V0) == c44.DEFAULT_ASPECT_RATIO) {
                    this.V0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * ((float) getHeight()));
    }

    public final void q(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.U0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.U0.onRelease();
            z2 = this.U0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.W0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.W0.onRelease();
            z2 |= this.W0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.V0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.V0.onRelease();
            z2 |= this.V0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.X0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.X0.onRelease();
            z2 |= this.X0.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = gag.a;
            postInvalidateOnAnimation();
        }
    }

    public final void q0() {
        yyc yyc = this.Y0;
        if (yyc != null) {
            yyc.k();
        }
        a aVar = this.z0;
        if (aVar != null) {
            aVar.r0(this.c);
            this.z0.s0(this.c);
        }
        hzc hzc = this.c;
        hzc.a.clear();
        hzc.e();
    }

    public final void r0(zyc zyc) {
        a aVar = this.z0;
        if (aVar != null) {
            aVar.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.B0;
        arrayList.remove(zyc);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        d0();
        requestLayout();
    }

    public final void removeDetachedView(View view, boolean z2) {
        pzc V = V(view);
        if (V != null) {
            if (V.E()) {
                V.X &= -257;
            } else if (!V.K()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(V);
                throw new IllegalArgumentException(a81.k(this, sb));
            }
        } else if (J1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(a81.k(this, sb2));
        }
        view.clearAnimation();
        u(view);
        super.removeDetachedView(view, z2);
    }

    public final void requestChildFocus(View view, View view2) {
        ew7 ew7 = this.z0.e;
        if ((ew7 == null || !ew7.e) && !b0() && view2 != null) {
            v0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.z0.u0(this, view, rect, z2, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.C0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ezc) arrayList.get(i)).e(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void requestLayout() {
        if (this.H0 != 0 || this.J0) {
            this.I0 = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        if (!this.G0 || this.P0) {
            Trace.beginSection("RV FullInvalidate");
            v();
            Trace.endSection();
        } else if (this.v.A()) {
            u9 u9Var = this.v;
            int i = u9Var.b;
            if ((i & 4) != 0 && (i & 11) == 0) {
                Trace.beginSection("RV PartialInvalidate");
                E0();
                g0();
                this.v.F();
                if (!this.I0) {
                    int E = this.w.E();
                    int i2 = 0;
                    while (true) {
                        if (i2 < E) {
                            pzc V = V(this.w.D(i2));
                            if (V != null && !V.K() && V.G()) {
                                v();
                                break;
                            }
                            i2++;
                        } else {
                            this.v.k();
                            break;
                        }
                    }
                }
                F0(true);
                h0(true);
                Trace.endSection();
            } else if (u9Var.A()) {
                Trace.beginSection("RV FullInvalidate");
                v();
                Trace.endSection();
            }
        }
    }

    public final void s0(czc czc) {
        ArrayList arrayList = this.O0;
        if (arrayList != null) {
            arrayList.remove(czc);
        }
    }

    public final void scrollBy(int i, int i2) {
        a aVar = this.z0;
        if (aVar != null && !this.J0) {
            boolean e = aVar.e();
            boolean f = this.z0.f();
            if (e || f) {
                if (!e) {
                    i = 0;
                }
                if (!f) {
                    i2 = 0;
                }
                x0(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    public final void scrollTo(int i, int i2) {
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (b0()) {
            int i = 0;
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i = contentChangeTypes;
            }
            this.L0 |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(rzc rzc) {
        this.x1 = rzc;
        gag.j(this, rzc);
    }

    public void setAdapter(tyc tyc) {
        setLayoutFrozen(false);
        A0(tyc, false, true);
        m0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(wyc wyc) {
        if (wyc != null) {
            setChildrenDrawingOrderEnabled(wyc != null);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.y) {
            this.X0 = null;
            this.V0 = null;
            this.W0 = null;
            this.U0 = null;
        }
        this.y = z2;
        super.setClipToPadding(z2);
        if (this.G0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(xyc xyc) {
        xyc.getClass();
        this.T0 = xyc;
        this.X0 = null;
        this.V0 = null;
        this.W0 = null;
        this.U0 = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.F0 = z2;
    }

    public void setItemAnimator(yyc yyc) {
        yyc yyc2 = this.Y0;
        if (yyc2 != null) {
            yyc2.k();
            this.Y0.a = null;
        }
        this.Y0 = yyc;
        if (yyc != null) {
            yyc.a = this.v1;
        }
    }

    public void setItemViewCacheSize(int i) {
        hzc hzc = this.c;
        hzc.e = i;
        hzc.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(a aVar) {
        u6h u6h;
        if (aVar != this.z0) {
            G0();
            if (this.z0 != null) {
                yyc yyc = this.Y0;
                if (yyc != null) {
                    yyc.k();
                }
                this.z0.r0(this.c);
                this.z0.s0(this.c);
                hzc hzc = this.c;
                hzc.a.clear();
                hzc.e();
                if (this.E0) {
                    a aVar2 = this.z0;
                    aVar2.g = false;
                    aVar2.X(this);
                }
                this.z0.D0((RecyclerView) null);
                this.z0 = null;
            } else {
                hzc hzc2 = this.c;
                hzc2.a.clear();
                hzc2.e();
            }
            mqf mqf = this.w;
            ((jz2) mqf.v).a0();
            ArrayList arrayList = (ArrayList) mqf.w;
            int size = arrayList.size() - 1;
            while (true) {
                u6h = (u6h) mqf.o;
                if (size < 0) {
                    break;
                }
                u6h.getClass();
                pzc V = V((View) arrayList.get(size));
                if (V != null) {
                    int i = V.y0;
                    RecyclerView recyclerView = (RecyclerView) u6h.b;
                    if (recyclerView.b0()) {
                        V.z0 = i;
                        recyclerView.D1.add(V);
                    } else {
                        WeakHashMap weakHashMap = gag.a;
                        V.a.setImportantForAccessibility(i);
                    }
                    V.y0 = 0;
                }
                arrayList.remove(size);
                size--;
            }
            RecyclerView recyclerView2 = (RecyclerView) u6h.b;
            int childCount = recyclerView2.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView2.getChildAt(i2);
                recyclerView2.u(childAt);
                childAt.clearAnimation();
            }
            recyclerView2.removeAllViews();
            this.z0 = aVar;
            if (aVar != null) {
                if (aVar.b == null) {
                    aVar.D0(this);
                    if (this.E0) {
                        a aVar3 = this.z0;
                        aVar3.g = true;
                        aVar3.W(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("LayoutManager ");
                    sb.append(aVar);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(a81.k(aVar.b, sb));
                }
            }
            this.c.l();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z2) {
        i6a scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = gag.a;
            v9g.z(scrollingChildHelper.c);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(dzc dzc) {
        this.h1 = dzc;
    }

    @Deprecated
    public void setOnScrollListener(fzc fzc) {
        this.r1 = fzc;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.m1 = z2;
    }

    public void setRecycledViewPool(b bVar) {
        hzc hzc = this.c;
        RecyclerView recyclerView = hzc.h;
        tyc tyc = recyclerView.y0;
        b bVar2 = hzc.g;
        if (bVar2 != null) {
            bVar2.detachForPoolingContainer(tyc, false);
        }
        b bVar3 = hzc.g;
        if (bVar3 != null) {
            bVar3.detach();
        }
        hzc.g = bVar;
        if (!(bVar == null || recyclerView.getAdapter() == null)) {
            hzc.g.attach();
        }
        hzc.d();
    }

    @Deprecated
    public void setRecyclerListener(izc izc) {
    }

    public void setScrollState(int i) {
        ew7 ew7;
        if (i != this.Z0) {
            if (K1) {
                new Exception();
            }
            this.Z0 = i;
            if (i != 2) {
                ozc ozc = this.n1;
                ozc.x.removeCallbacks(ozc);
                ozc.c.abortAnimation();
                a aVar = this.z0;
                if (!(aVar == null || (ew7 = aVar.e) == null)) {
                    ew7.k();
                }
            }
            a aVar2 = this.z0;
            if (aVar2 != null) {
                aVar2.n0(i);
            }
            j0();
            fzc fzc = this.r1;
            if (fzc != null) {
                fzc.a(this, i);
            }
            ArrayList arrayList = this.s1;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((fzc) this.s1.get(size)).a(this, i);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.g1 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.g1 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(nzc nzc) {
        this.c.getClass();
    }

    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().h(i, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    public final void suppressLayout(boolean z2) {
        if (z2 != this.J0) {
            n("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.J0 = false;
                if (!(!this.I0 || this.z0 == null || this.y0 == null)) {
                    requestLayout();
                }
                this.I0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 0));
            this.J0 = true;
            this.K0 = true;
            G0();
        }
    }

    public final void t(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = gag.a;
        setMeasuredDimension(a.h(i, paddingRight, getMinimumWidth()), a.h(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void t0(ezc ezc) {
        this.C0.remove(ezc);
        if (this.D0 == ezc) {
            this.D0 = null;
        }
    }

    public final void u(View view) {
        pzc V = V(view);
        tyc tyc = this.y0;
        if (!(tyc == null || V == null)) {
            tyc.y(V);
        }
        ArrayList arrayList = this.O0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((czc) this.O0.get(size)).b(view);
            }
        }
    }

    public void u0(fzc fzc) {
        ArrayList arrayList = this.s1;
        if (arrayList != null) {
            arrayList.remove(fzc);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:148:0x034c, code lost:
        if (((java.util.ArrayList) r0.w.w).contains(getFocusedChild()) == false) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0376, code lost:
        if (r3.hasFocusable() != false) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0379, code lost:
        r6 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r17 = this;
            r0 = r17
            tyc r1 = r0.y0
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.recyclerview.widget.a r1 = r0.z0
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            lzc r1 = r0.q1
            r2 = 0
            r1.j = r2
            boolean r3 = r0.F1
            r4 = 1
            if (r3 == 0) goto L_0x0028
            int r3 = r0.G1
            int r5 = r17.getWidth()
            if (r3 != r5) goto L_0x0026
            int r3 = r0.H1
            int r5 = r17.getHeight()
            if (r3 == r5) goto L_0x0028
        L_0x0026:
            r3 = r4
            goto L_0x0029
        L_0x0028:
            r3 = r2
        L_0x0029:
            r0.G1 = r2
            r0.H1 = r2
            r0.F1 = r2
            int r5 = r1.e
            if (r5 != r4) goto L_0x003f
            r17.w()
            androidx.recyclerview.widget.a r3 = r0.z0
            r3.z0(r0)
            r17.x()
            goto L_0x007b
        L_0x003f:
            u9 r5 = r0.v
            java.lang.Object r6 = r5.v
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0056
            java.lang.Object r5 = r5.o
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0056
            goto L_0x0073
        L_0x0056:
            if (r3 != 0) goto L_0x0073
            androidx.recyclerview.widget.a r3 = r0.z0
            int r3 = r3.n
            int r5 = r17.getWidth()
            if (r3 != r5) goto L_0x0073
            androidx.recyclerview.widget.a r3 = r0.z0
            int r3 = r3.o
            int r5 = r17.getHeight()
            if (r3 == r5) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            androidx.recyclerview.widget.a r3 = r0.z0
            r3.z0(r0)
            goto L_0x007b
        L_0x0073:
            androidx.recyclerview.widget.a r3 = r0.z0
            r3.z0(r0)
            r17.x()
        L_0x007b:
            r3 = 4
            r1.a(r3)
            r17.E0()
            r17.g0()
            r1.e = r4
            boolean r5 = r1.k
            r6 = 0
            ox0 r7 = r0.x
            if (r5 == 0) goto L_0x02b3
            mqf r5 = r0.w
            int r5 = r5.E()
            int r5 = r5 - r4
        L_0x0095:
            if (r5 < 0) goto L_0x01b4
            mqf r8 = r0.w
            android.view.View r8 = r8.D(r5)
            pzc r8 = V(r8)
            boolean r9 = r8.K()
            if (r9 == 0) goto L_0x00a9
            goto L_0x01b0
        L_0x00a9:
            long r9 = r0.R(r8)
            yyc r11 = r0.Y0
            r11.getClass()
            ft r11 = new ft
            r12 = 7
            r11.<init>(r12)
            android.view.View r12 = r8.a
            int r13 = r12.getLeft()
            r11.b = r13
            int r13 = r12.getTop()
            r11.c = r13
            r12.getRight()
            r12.getBottom()
            java.lang.Object r12 = r7.b
            ya8 r12 = (defpackage.ya8) r12
            java.lang.Object r12 = r12.f(r9)
            pzc r12 = (defpackage.pzc) r12
            if (r12 == 0) goto L_0x01ad
            boolean r13 = r12.K()
            if (r13 != 0) goto L_0x01ad
            java.lang.Object r13 = r7.c
            qae r13 = (defpackage.qae) r13
            java.lang.Object r14 = r13.get(r12)
            pag r14 = (defpackage.pag) r14
            if (r14 == 0) goto L_0x00f1
            int r14 = r14.a
            r14 = r14 & r4
            if (r14 == 0) goto L_0x00f1
            r14 = r4
            goto L_0x00f2
        L_0x00f1:
            r14 = r2
        L_0x00f2:
            java.lang.Object r13 = r13.get(r8)
            pag r13 = (defpackage.pag) r13
            if (r13 == 0) goto L_0x0101
            int r13 = r13.a
            r13 = r13 & r4
            if (r13 == 0) goto L_0x0101
            r13 = r4
            goto L_0x0102
        L_0x0101:
            r13 = r2
        L_0x0102:
            if (r14 == 0) goto L_0x010b
            if (r12 != r8) goto L_0x010b
            r7.t(r8, r11)
            goto L_0x01b0
        L_0x010b:
            ft r15 = r7.C(r12, r3)
            r7.t(r8, r11)
            r11 = 8
            ft r11 = r7.C(r8, r11)
            if (r15 != 0) goto L_0x0183
            mqf r11 = r0.w
            int r11 = r11.E()
            r13 = r2
        L_0x0121:
            if (r13 >= r11) goto L_0x0179
            mqf r14 = r0.w
            android.view.View r14 = r14.D(r13)
            pzc r14 = V(r14)
            if (r14 != r8) goto L_0x0130
            goto L_0x0176
        L_0x0130:
            long r15 = r0.R(r14)
            int r15 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x0176
            tyc r1 = r0.y0
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x015c
            boolean r1 = r1.b
            if (r1 == 0) goto L_0x015c
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r14)
            r3.append(r2)
            r3.append(r8)
            java.lang.String r0 = defpackage.a81.k(r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x015c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r14)
            r3.append(r2)
            r3.append(r8)
            java.lang.String r0 = defpackage.a81.k(r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x0176:
            int r13 = r13 + 1
            goto L_0x0121
        L_0x0179:
            java.util.Objects.toString(r12)
            java.util.Objects.toString(r8)
            r17.F()
            goto L_0x01b0
        L_0x0183:
            r12.J(r2)
            if (r14 == 0) goto L_0x018b
            r0.i(r12)
        L_0x018b:
            if (r12 == r8) goto L_0x01a1
            if (r13 == 0) goto L_0x0192
            r0.i(r8)
        L_0x0192:
            r12.y = r8
            r0.i(r12)
            hzc r9 = r0.c
            r9.k(r12)
            r8.J(r2)
            r8.z = r12
        L_0x01a1:
            yyc r9 = r0.Y0
            boolean r8 = r9.b(r12, r8, r15, r11)
            if (r8 == 0) goto L_0x01b0
            r17.k0()
            goto L_0x01b0
        L_0x01ad:
            r7.t(r8, r11)
        L_0x01b0:
            int r5 = r5 + -1
            goto L_0x0095
        L_0x01b4:
            java.lang.Object r3 = r7.c
            qae r3 = (defpackage.qae) r3
            int r5 = r3.c
            int r5 = r5 - r4
        L_0x01bb:
            if (r5 < 0) goto L_0x02b3
            java.lang.Object r8 = r3.f(r5)
            pzc r8 = (defpackage.pzc) r8
            java.lang.Object r9 = r3.g(r5)
            pag r9 = (defpackage.pag) r9
            int r10 = r9.a
            r11 = r10 & 3
            r12 = 3
            bpa r13 = r0.I1
            if (r11 != r12) goto L_0x01e1
            java.lang.Object r10 = r13.b
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            androidx.recyclerview.widget.a r11 = r10.z0
            android.view.View r8 = r8.a
            hzc r10 = r10.c
            r11.t0(r8, r10)
            goto L_0x02a4
        L_0x01e1:
            r11 = r10 & 1
            if (r11 == 0) goto L_0x0216
            ft r10 = r9.b
            if (r10 != 0) goto L_0x01f8
            java.lang.Object r10 = r13.b
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            androidx.recyclerview.widget.a r11 = r10.z0
            android.view.View r8 = r8.a
            hzc r10 = r10.c
            r11.t0(r8, r10)
            goto L_0x02a4
        L_0x01f8:
            ft r11 = r9.c
            java.lang.Object r12 = r13.b
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            hzc r13 = r12.c
            r13.k(r8)
            r12.i(r8)
            r8.J(r2)
            yyc r13 = r12.Y0
            boolean r8 = r13.c(r8, r10, r11)
            if (r8 == 0) goto L_0x02a4
            r12.k0()
            goto L_0x02a4
        L_0x0216:
            r11 = r10 & 14
            r12 = 14
            if (r11 != r12) goto L_0x0236
            ft r10 = r9.b
            ft r11 = r9.c
            java.lang.Object r12 = r13.b
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r12.getClass()
            r8.J(r2)
            yyc r13 = r12.Y0
            boolean r8 = r13.a(r8, r10, r11)
            if (r8 == 0) goto L_0x02a4
            r12.k0()
            goto L_0x02a4
        L_0x0236:
            r11 = r10 & 12
            r12 = 12
            if (r11 != r12) goto L_0x0266
            ft r10 = r9.b
            ft r11 = r9.c
            r13.getClass()
            r8.J(r2)
            java.lang.Object r12 = r13.b
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            boolean r13 = r12.P0
            if (r13 == 0) goto L_0x025a
            yyc r13 = r12.Y0
            boolean r8 = r13.b(r8, r8, r10, r11)
            if (r8 == 0) goto L_0x02a4
            r12.k0()
            goto L_0x02a4
        L_0x025a:
            yyc r13 = r12.Y0
            boolean r8 = r13.d(r8, r10, r11)
            if (r8 == 0) goto L_0x02a4
            r12.k0()
            goto L_0x02a4
        L_0x0266:
            r11 = r10 & 4
            if (r11 == 0) goto L_0x0287
            ft r10 = r9.b
            java.lang.Object r11 = r13.b
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            hzc r12 = r11.c
            r12.k(r8)
            r11.i(r8)
            r8.J(r2)
            yyc r12 = r11.Y0
            boolean r8 = r12.c(r8, r10, r6)
            if (r8 == 0) goto L_0x02a4
            r11.k0()
            goto L_0x02a4
        L_0x0287:
            r10 = r10 & 8
            if (r10 == 0) goto L_0x02a4
            ft r10 = r9.b
            ft r11 = r9.c
            java.lang.Object r12 = r13.b
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r12.getClass()
            r8.J(r2)
            yyc r13 = r12.Y0
            boolean r8 = r13.a(r8, r10, r11)
            if (r8 == 0) goto L_0x02a4
            r12.k0()
        L_0x02a4:
            r9.a = r2
            r9.b = r6
            r9.c = r6
            wqb r8 = defpackage.pag.d
            r8.b(r9)
            int r5 = r5 + -1
            goto L_0x01bb
        L_0x02b3:
            androidx.recyclerview.widget.a r3 = r0.z0
            hzc r5 = r0.c
            r3.s0(r5)
            int r3 = r1.f
            r1.c = r3
            r0.P0 = r2
            r0.Q0 = r2
            r1.k = r2
            r1.l = r2
            androidx.recyclerview.widget.a r3 = r0.z0
            r3.f = r2
            hzc r3 = r0.c
            java.util.ArrayList r3 = r3.b
            if (r3 == 0) goto L_0x02d3
            r3.clear()
        L_0x02d3:
            androidx.recyclerview.widget.a r3 = r0.z0
            boolean r5 = r3.k
            if (r5 == 0) goto L_0x02e2
            r3.j = r2
            r3.k = r2
            hzc r3 = r0.c
            r3.l()
        L_0x02e2:
            androidx.recyclerview.widget.a r3 = r0.z0
            r3.k0(r1)
            r0.h0(r4)
            r0.F0(r2)
            java.lang.Object r3 = r7.c
            qae r3 = (defpackage.qae) r3
            r3.clear()
            java.lang.Object r3 = r7.b
            ya8 r3 = (defpackage.ya8) r3
            r3.a()
            int[] r3 = r0.y1
            r5 = r3[r2]
            r7 = r3[r4]
            r0.K(r3)
            r8 = r3[r2]
            if (r8 != r5) goto L_0x030c
            r3 = r3[r4]
            if (r3 == r7) goto L_0x030f
        L_0x030c:
            r0.A(r2, r2)
        L_0x030f:
            boolean r3 = r0.m1
            r7 = -1
            r5 = -1
            if (r3 == 0) goto L_0x03d6
            tyc r3 = r0.y0
            if (r3 == 0) goto L_0x03d6
            boolean r3 = r17.hasFocus()
            if (r3 == 0) goto L_0x03d6
            int r3 = r17.getDescendantFocusability()
            r9 = 393216(0x60000, float:5.51013E-40)
            if (r3 == r9) goto L_0x03d6
            int r3 = r17.getDescendantFocusability()
            r9 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r9) goto L_0x0338
            boolean r3 = r17.isFocused()
            if (r3 == 0) goto L_0x0338
            goto L_0x03d6
        L_0x0338:
            boolean r3 = r17.isFocused()
            if (r3 != 0) goto L_0x0350
            android.view.View r3 = r17.getFocusedChild()
            mqf r9 = r0.w
            java.lang.Object r9 = r9.w
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            boolean r3 = r9.contains(r3)
            if (r3 != 0) goto L_0x0350
            goto L_0x03d6
        L_0x0350:
            long r9 = r1.n
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0361
            tyc r3 = r0.y0
            boolean r3 = r3.b
            if (r3 == 0) goto L_0x0361
            pzc r3 = r0.N(r9)
            goto L_0x0362
        L_0x0361:
            r3 = r6
        L_0x0362:
            if (r3 == 0) goto L_0x037b
            mqf r9 = r0.w
            java.lang.Object r9 = r9.w
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            android.view.View r3 = r3.a
            boolean r9 = r9.contains(r3)
            if (r9 != 0) goto L_0x037b
            boolean r9 = r3.hasFocusable()
            if (r9 != 0) goto L_0x0379
            goto L_0x037b
        L_0x0379:
            r6 = r3
            goto L_0x03bd
        L_0x037b:
            mqf r3 = r0.w
            int r3 = r3.E()
            if (r3 <= 0) goto L_0x03bd
            int r3 = r1.m
            if (r3 == r5) goto L_0x0388
            r2 = r3
        L_0x0388:
            int r3 = r1.b()
            r9 = r2
        L_0x038d:
            if (r9 >= r3) goto L_0x03a3
            pzc r10 = r0.M(r9)
            if (r10 != 0) goto L_0x0396
            goto L_0x03a3
        L_0x0396:
            android.view.View r10 = r10.a
            boolean r11 = r10.hasFocusable()
            if (r11 == 0) goto L_0x03a0
            r6 = r10
            goto L_0x03bd
        L_0x03a0:
            int r9 = r9 + 1
            goto L_0x038d
        L_0x03a3:
            int r2 = java.lang.Math.min(r3, r2)
            int r2 = r2 - r4
        L_0x03a8:
            if (r2 < 0) goto L_0x03bd
            pzc r3 = r0.M(r2)
            if (r3 != 0) goto L_0x03b1
            goto L_0x03bd
        L_0x03b1:
            android.view.View r3 = r3.a
            boolean r4 = r3.hasFocusable()
            if (r4 == 0) goto L_0x03ba
            goto L_0x0379
        L_0x03ba:
            int r2 = r2 + -1
            goto L_0x03a8
        L_0x03bd:
            if (r6 == 0) goto L_0x03d6
            int r0 = r1.o
            long r2 = (long) r0
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x03d3
            android.view.View r0 = r6.findViewById(r0)
            if (r0 == 0) goto L_0x03d3
            boolean r2 = r0.isFocusable()
            if (r2 == 0) goto L_0x03d3
            r6 = r0
        L_0x03d3:
            r6.requestFocus()
        L_0x03d6:
            r1.n = r7
            r1.m = r5
            r1.o = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v():void");
    }

    public final void v0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.v0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof bzc) {
            bzc bzc = (bzc) layoutParams;
            if (!bzc.c) {
                int i = rect.left;
                Rect rect2 = bzc.b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.z0.u0(this, view, this.v0, !this.G0, view2 == null);
    }

    public final void w() {
        pag pag;
        View I;
        lzc lzc = this.q1;
        lzc.a(1);
        G(lzc);
        lzc.j = false;
        E0();
        ox0 ox0 = this.x;
        ((qae) ox0.c).clear();
        ya8 ya8 = (ya8) ox0.b;
        ya8.a();
        g0();
        l0();
        pzc pzc = null;
        View focusedChild = (!this.m1 || !hasFocus() || this.y0 == null) ? null : getFocusedChild();
        if (!(focusedChild == null || (I = I(focusedChild)) == null)) {
            pzc = U(I);
        }
        long j = -1;
        if (pzc == null) {
            lzc.n = -1;
            lzc.m = -1;
            lzc.o = -1;
        } else {
            if (this.y0.b) {
                j = pzc.v;
            }
            lzc.n = j;
            lzc.m = this.P0 ? -1 : pzc.B() ? pzc.o : pzc.p();
            View view = pzc.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            lzc.o = id;
        }
        lzc.i = lzc.k && this.u1;
        this.u1 = false;
        this.t1 = false;
        lzc.h = lzc.l;
        lzc.f = this.y0.j();
        K(this.y1);
        boolean z2 = lzc.k;
        qae qae = (qae) ox0.c;
        if (z2) {
            int E = this.w.E();
            for (int i = 0; i < E; i++) {
                pzc V = V(this.w.D(i));
                if (!V.K() && (!V.z() || this.y0.b)) {
                    ft o2 = this.Y0.o(lzc, V, yyc.e(V), V.t());
                    pag pag2 = (pag) qae.get(V);
                    if (pag2 == null) {
                        pag2 = pag.a();
                        qae.put(V, pag2);
                    }
                    pag2.b = o2;
                    pag2.a |= 4;
                    if (lzc.i && V.G() && !V.B() && !V.K() && !V.z()) {
                        ya8.i(R(V), V);
                    }
                }
            }
        }
        if (lzc.l) {
            int I2 = this.w.I();
            int i2 = 0;
            while (i2 < I2) {
                pzc V2 = V(this.w.H(i2));
                if (!J1 || V2.c != -1 || V2.B()) {
                    if (!V2.K() && V2.o == -1) {
                        V2.o = V2.c;
                    }
                    i2++;
                } else {
                    throw new IllegalStateException(a81.k(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
            }
            boolean z3 = lzc.g;
            lzc.g = false;
            this.z0.j0(this.c, lzc);
            lzc.g = z3;
            for (int i3 = 0; i3 < this.w.E(); i3++) {
                pzc V3 = V(this.w.D(i3));
                if (!V3.K() && ((pag = (pag) qae.get(V3)) == null || (pag.a & 4) == 0)) {
                    int e = yyc.e(V3);
                    boolean v2 = V3.v(ConstantsKt.DEFAULT_BUFFER_SIZE);
                    if (!v2) {
                        e |= ConstantsKt.DEFAULT_BLOCK_SIZE;
                    }
                    ft o3 = this.Y0.o(lzc, V3, e, V3.t());
                    if (v2) {
                        n0(V3, o3);
                    } else {
                        pag pag3 = (pag) qae.get(V3);
                        if (pag3 == null) {
                            pag3 = pag.a();
                            qae.put(V3, pag3);
                        }
                        pag3.a |= 2;
                        pag3.b = o3;
                    }
                }
            }
            p();
        } else {
            p();
        }
        h0(true);
        F0(false);
        lzc.e = 2;
    }

    public final void w0() {
        VelocityTracker velocityTracker = this.b1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        a(0);
        EdgeEffect edgeEffect = this.U0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.U0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.V0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.V0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.W0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.W0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.X0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.X0.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = gag.a;
            postInvalidateOnAnimation();
        }
    }

    public final void x() {
        E0();
        g0();
        lzc lzc = this.q1;
        lzc.a(6);
        this.v.l();
        lzc.f = this.y0.j();
        lzc.d = 0;
        if (this.o != null) {
            tyc tyc = this.y0;
            int y2 = tr1.y(tyc.c);
            if (y2 == 1 ? tyc.j() > 0 : y2 != 2) {
                Parcelable parcelable = this.o.c;
                if (parcelable != null) {
                    this.z0.l0(parcelable);
                }
                this.o = null;
            }
        }
        lzc.h = false;
        this.z0.j0(this.c, lzc);
        lzc.g = false;
        lzc.k = lzc.k && this.Y0 != null;
        lzc.e = 4;
        h0(true);
        F0(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            r18.s()
            tyc r0 = r8.y0
            int[] r11 = r8.C1
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0027
            r11[r13] = r13
            r11[r12] = r13
            r8.y0(r11, r9, r10)
            r0 = r11[r13]
            r1 = r11[r12]
            int r2 = r9 - r0
            int r3 = r10 - r1
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            goto L_0x002d
        L_0x0027:
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L_0x002d:
            java.util.ArrayList r0 = r8.B0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r18.invalidate()
        L_0x0038:
            r11[r13] = r13
            r11[r12] = r13
            int[] r5 = r8.A1
            r0 = r18
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r22
            r7 = r11
            r0.z(r1, r2, r3, r4, r5, r6, r7)
            r0 = r11[r13]
            int r1 = r16 - r0
            r2 = r11[r12]
            int r3 = r17 - r2
            if (r0 != 0) goto L_0x005b
            if (r2 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r0 = r13
            goto L_0x005c
        L_0x005b:
            r0 = r12
        L_0x005c:
            int r2 = r8.e1
            int[] r4 = r8.A1
            r5 = r4[r13]
            int r2 = r2 - r5
            r8.e1 = r2
            int r2 = r8.f1
            r4 = r4[r12]
            int r2 = r2 - r4
            r8.f1 = r2
            int[] r2 = r8.B1
            r6 = r2[r13]
            int r6 = r6 + r5
            r2[r13] = r6
            r5 = r2[r12]
            int r5 = r5 + r4
            r2[r12] = r5
            int r2 = r18.getOverScrollMode()
            r4 = 2
            if (r2 == r4) goto L_0x0119
            if (r21 == 0) goto L_0x0116
            int r2 = r21.getSource()
            r4 = 8194(0x2002, float:1.1482E-41)
            r2 = r2 & r4
            if (r2 != r4) goto L_0x008c
            goto L_0x0116
        L_0x008c:
            float r2 = r21.getX()
            float r1 = (float) r1
            float r4 = r21.getY()
            float r3 = (float) r3
            r5 = 0
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 >= 0) goto L_0x00b6
            r18.C()
            android.widget.EdgeEffect r6 = r8.U0
            float r11 = -r1
            int r12 = r18.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            float r4 = r7 - r4
            defpackage.b0h.G(r6, r11, r4)
        L_0x00b4:
            r4 = 1
            goto L_0x00d1
        L_0x00b6:
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d0
            r18.D()
            android.widget.EdgeEffect r6 = r8.W0
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r11 = r1 / r11
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            defpackage.b0h.G(r6, r11, r4)
            goto L_0x00b4
        L_0x00d0:
            r4 = r13
        L_0x00d1:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ec
            r18.E()
            android.widget.EdgeEffect r4 = r8.V0
            float r6 = -r3
            int r7 = r18.getHeight()
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r18.getWidth()
            float r7 = (float) r7
            float r2 = r2 / r7
            defpackage.b0h.G(r4, r6, r2)
        L_0x00ea:
            r4 = 1
            goto L_0x0107
        L_0x00ec:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0107
            r18.B()
            android.widget.EdgeEffect r4 = r8.X0
            int r6 = r18.getHeight()
            float r6 = (float) r6
            float r6 = r3 / r6
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r2 = r2 / r11
            float r7 = r7 - r2
            defpackage.b0h.G(r4, r6, r7)
            goto L_0x00ea
        L_0x0107:
            if (r4 != 0) goto L_0x0111
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0111
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0116
        L_0x0111:
            java.util.WeakHashMap r1 = defpackage.gag.a
            r18.postInvalidateOnAnimation()
        L_0x0116:
            r18.q(r19, r20)
        L_0x0119:
            if (r14 != 0) goto L_0x011d
            if (r15 == 0) goto L_0x0120
        L_0x011d:
            r8.A(r14, r15)
        L_0x0120:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x0129
            r18.invalidate()
        L_0x0129:
            if (r0 != 0) goto L_0x0132
            if (r14 != 0) goto L_0x0132
            if (r15 == 0) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            r12 = r13
            goto L_0x0133
        L_0x0132:
            r12 = 1
        L_0x0133:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.x0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final boolean y(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        return getScrollingChildHelper().c(iArr, iArr2, i, i2, i3);
    }

    public final void y0(int[] iArr, int i, int i2) {
        pzc pzc;
        E0();
        g0();
        Trace.beginSection("RV Scroll");
        lzc lzc = this.q1;
        G(lzc);
        int w02 = i != 0 ? this.z0.w0(i, this.c, lzc) : 0;
        int y02 = i2 != 0 ? this.z0.y0(i2, this.c, lzc) : 0;
        Trace.endSection();
        int E = this.w.E();
        for (int i3 = 0; i3 < E; i3++) {
            View D = this.w.D(i3);
            pzc U = U(D);
            if (!(U == null || (pzc = U.z) == null)) {
                int left = D.getLeft();
                int top = D.getTop();
                View view = pzc.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        h0(true);
        F0(false);
        if (iArr != null) {
            iArr[0] = w02;
            iArr[1] = y02;
        }
    }

    public final void z(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void z0(int i) {
        if (!this.J0) {
            G0();
            a aVar = this.z0;
            if (aVar != null) {
                aVar.x0(i);
                awakenScrollBars();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: e13} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: e13} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: e13} */
    /* JADX WARNING: type inference failed for: r1v16, types: [lzc, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r20
            r0 = 2
            r14 = 4
            r17.<init>(r18, r19, r20)
            t45 r1 = new t45
            r2 = 8
            r1.<init>(r2, r10)
            r10.b = r1
            hzc r1 = new hzc
            r1.<init>(r10)
            r10.c = r1
            ox0 r1 = new ox0
            r3 = 26
            r1.<init>((int) r3)
            r10.x = r1
            ryc r1 = new ryc
            r15 = 0
            r1.<init>(r10, r15)
            r10.z = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.v0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.w0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r10.x0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.A0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.B0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.C0 = r1
            r10.H0 = r15
            r10.P0 = r15
            r10.Q0 = r15
            r10.R0 = r15
            r10.S0 = r15
            mzc r1 = S1
            r10.T0 = r1
            mg4 r1 = new mg4
            r1.<init>()
            r10.Y0 = r1
            r10.Z0 = r15
            r8 = -1
            r10.a1 = r8
            r1 = 1
            r10.k1 = r1
            r10.l1 = r1
            r9 = 1
            r10.m1 = r9
            ozc r1 = new ozc
            r1.<init>(r10)
            r10.n1 = r1
            boolean r1 = P1
            r7 = 0
            if (r1 == 0) goto L_0x008c
            e13 r1 = new e13
            r1.<init>()
            goto L_0x008d
        L_0x008c:
            r1 = r7
        L_0x008d:
            r10.p1 = r1
            lzc r1 = new lzc
            r1.<init>()
            r1.a = r8
            r1.c = r15
            r1.d = r15
            r1.e = r9
            r1.f = r15
            r1.g = r15
            r1.h = r15
            r1.i = r15
            r1.j = r15
            r1.k = r15
            r1.l = r15
            r10.q1 = r1
            r10.t1 = r15
            r10.u1 = r15
            yu9 r1 = new yu9
            r1.<init>((int) r14, (java.lang.Object) r10)
            r10.v1 = r1
            r10.w1 = r15
            int[] r3 = new int[r0]
            r10.y1 = r3
            int[] r3 = new int[r0]
            r10.A1 = r3
            int[] r3 = new int[r0]
            r10.B1 = r3
            int[] r3 = new int[r0]
            r10.C1 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10.D1 = r3
            ryc r3 = new ryc
            r3.<init>(r10, r9)
            r10.E1 = r3
            r10.G1 = r15
            r10.H1 = r15
            bpa r3 = new bpa
            r3.<init>(r0, r10)
            r10.I1 = r3
            r10.setScrollContainer(r9)
            r10.setFocusableInTouchMode(r9)
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r18)
            int r4 = r3.getScaledTouchSlop()
            r10.g1 = r4
            float r4 = defpackage.hag.a(r3)
            r10.k1 = r4
            float r4 = defpackage.hag.b(r3)
            r10.l1 = r4
            int r4 = r3.getScaledMinimumFlingVelocity()
            r10.i1 = r4
            int r3 = r3.getScaledMaximumFlingVelocity()
            r10.j1 = r3
            android.content.res.Resources r3 = r18.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r4 = 1126170624(0x43200000, float:160.0)
            float r3 = r3 * r4
            r4 = 1136724797(0x43c10b3d, float:386.0878)
            float r3 = r3 * r4
            r4 = 1062668861(0x3f570a3d, float:0.84)
            float r3 = r3 * r4
            r10.a = r3
            int r3 = r17.getOverScrollMode()
            if (r3 != r0) goto L_0x0129
            r3 = r9
            goto L_0x012a
        L_0x0129:
            r3 = r15
        L_0x012a:
            r10.setWillNotDraw(r3)
            yyc r3 = r10.Y0
            r3.a = r1
            u9 r1 = new u9
            syc r3 = new syc
            r3.<init>(r15, r10)
            r1.<init>(r3)
            r10.v = r1
            mqf r1 = new mqf
            u6h r3 = new u6h
            r4 = 29
            r3.<init>(r4, r10)
            r1.<init>((defpackage.u6h) r3)
            r10.w = r1
            java.util.WeakHashMap r1 = defpackage.gag.a
            int r1 = defpackage.y9g.c(r17)
            if (r1 != 0) goto L_0x0156
            defpackage.y9g.m(r10, r2)
        L_0x0156:
            int r1 = r17.getImportantForAccessibility()
            if (r1 != 0) goto L_0x015f
            r10.setImportantForAccessibility(r9)
        L_0x015f:
            android.content.Context r1 = r17.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r10.N0 = r1
            rzc r1 = new rzc
            r1.<init>(r10)
            r10.setAccessibilityDelegateCompat(r1)
            int[] r1 = defpackage.onc.RecyclerView
            android.content.res.TypedArray r6 = r11.obtainStyledAttributes(r12, r1, r13, r15)
            int[] r3 = defpackage.onc.RecyclerView
            r16 = 0
            r1 = r17
            r2 = r18
            r4 = r19
            r5 = r6
            r0 = r6
            r6 = r20
            r7 = r16
            defpackage.bag.d(r1, r2, r3, r4, r5, r6, r7)
            int r1 = defpackage.onc.RecyclerView_layoutManager
            java.lang.String r16 = r0.getString(r1)
            int r1 = defpackage.onc.RecyclerView_android_descendantFocusability
            int r1 = r0.getInt(r1, r8)
            if (r1 != r8) goto L_0x01a1
            r1 = 262144(0x40000, float:3.67342E-40)
            r10.setDescendantFocusability(r1)
        L_0x01a1:
            int r1 = defpackage.onc.RecyclerView_android_clipToPadding
            boolean r1 = r0.getBoolean(r1, r9)
            r10.y = r1
            int r1 = defpackage.onc.RecyclerView_fastScrollEnabled
            boolean r1 = r0.getBoolean(r1, r15)
            if (r1 == 0) goto L_0x020b
            int r1 = defpackage.onc.RecyclerView_fastScrollVerticalThumbDrawable
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            r3 = r1
            android.graphics.drawable.StateListDrawable r3 = (android.graphics.drawable.StateListDrawable) r3
            int r1 = defpackage.onc.RecyclerView_fastScrollVerticalTrackDrawable
            android.graphics.drawable.Drawable r4 = r0.getDrawable(r1)
            int r1 = defpackage.onc.RecyclerView_fastScrollHorizontalThumbDrawable
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            r5 = r1
            android.graphics.drawable.StateListDrawable r5 = (android.graphics.drawable.StateListDrawable) r5
            int r1 = defpackage.onc.RecyclerView_fastScrollHorizontalTrackDrawable
            android.graphics.drawable.Drawable r6 = r0.getDrawable(r1)
            if (r3 == 0) goto L_0x01fa
            if (r4 == 0) goto L_0x01fa
            if (r5 == 0) goto L_0x01fa
            if (r6 == 0) goto L_0x01fa
            android.content.Context r1 = r17.getContext()
            android.content.res.Resources r1 = r1.getResources()
            jh5 r2 = new jh5
            int r7 = defpackage.hec.fastscroll_default_thickness
            int r7 = r1.getDimensionPixelSize(r7)
            int r8 = defpackage.hec.fastscroll_minimum_range
            int r8 = r1.getDimensionPixelSize(r8)
            int r9 = defpackage.hec.fastscroll_margin
            int r9 = r1.getDimensionPixelOffset(r9)
            r1 = r2
            r2 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x020b
        L_0x01fa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Trying to set fast scroller without both required drawables."
            r1.<init>(r2)
            java.lang.String r1 = defpackage.a81.k(r10, r1)
            r0.<init>(r1)
            throw r0
        L_0x020b:
            r0.recycle()
            java.lang.String r1 = ": Could not instantiate the LayoutManager: "
            if (r16 == 0) goto L_0x0376
            java.lang.String r0 = r16.trim()
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0376
            char r2 = r0.charAt(r15)
            r3 = 46
            if (r2 != r3) goto L_0x0239
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r18.getPackageName()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x0237:
            r2 = r0
            goto L_0x025f
        L_0x0239:
            java.lang.String r2 = "."
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0242
            goto L_0x0237
        L_0x0242:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r4 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r4 = r4.getPackage()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0237
        L_0x025f:
            boolean r0 = r17.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            if (r0 == 0) goto L_0x027d
            java.lang.Class r0 = r17.getClass()     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            goto L_0x0281
        L_0x026e:
            r0 = move-exception
            goto L_0x02e4
        L_0x0271:
            r0 = move-exception
            goto L_0x0302
        L_0x0274:
            r0 = move-exception
            goto L_0x0320
        L_0x0277:
            r0 = move-exception
            goto L_0x033c
        L_0x027a:
            r0 = move-exception
            goto L_0x0358
        L_0x027d:
            java.lang.ClassLoader r0 = r18.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
        L_0x0281:
            java.lang.Class r0 = java.lang.Class.forName(r2, r15, r0)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            java.lang.Class<androidx.recyclerview.widget.a> r3 = androidx.recyclerview.widget.a.class
            java.lang.Class r3 = r0.asSubclass(r3)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            java.lang.Class[] r0 = Q1     // Catch:{ NoSuchMethodException -> 0x02ab }
            java.lang.reflect.Constructor r0 = r3.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x02ab }
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ NoSuchMethodException -> 0x02ab }
            r7[r15] = r11     // Catch:{ NoSuchMethodException -> 0x02ab }
            r8 = 1
            r7[r8] = r12     // Catch:{ NoSuchMethodException -> 0x02a7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)     // Catch:{ NoSuchMethodException -> 0x02a7 }
            r5 = 2
            r7[r5] = r4     // Catch:{ NoSuchMethodException -> 0x02a7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)     // Catch:{ NoSuchMethodException -> 0x02a7 }
            r5 = 3
            r7[r5] = r4     // Catch:{ NoSuchMethodException -> 0x02a7 }
            goto L_0x02b3
        L_0x02a7:
            r0 = move-exception
        L_0x02a8:
            r5 = r0
            r4 = 0
            goto L_0x02ae
        L_0x02ab:
            r0 = move-exception
            r8 = 1
            goto L_0x02a8
        L_0x02ae:
            java.lang.reflect.Constructor r0 = r3.getConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x02c1 }
            r7 = r4
        L_0x02b3:
            r0.setAccessible(r8)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            java.lang.Object r0 = r0.newInstance(r7)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            androidx.recyclerview.widget.a r0 = (androidx.recyclerview.widget.a) r0     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            r10.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            goto L_0x0377
        L_0x02c1:
            r0 = move-exception
            r3 = r0
            r3.initCause(r5)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            r4.<init>()     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            java.lang.String r5 = r19.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            java.lang.String r5 = ": Error creating LayoutManager "
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            r4.append(r2)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            r0.<init>(r4, r3)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
            throw r0     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }
        L_0x02e4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r19.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Class is not a LayoutManager "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0302:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r19.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Cannot access non-public constructor "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0320:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r19.getPositionDescription()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x033c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r19.getPositionDescription()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x0358:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r19.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Unable to find LayoutManager "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0376:
            r8 = 1
        L_0x0377:
            int[] r3 = L1
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r3, r13, r15)
            r7 = 0
            r1 = r17
            r2 = r18
            r4 = r19
            r5 = r0
            r6 = r20
            defpackage.bag.d(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r0.getBoolean(r15, r8)
            r0.recycle()
            r10.setNestedScrollingEnabled(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            int r1 = defpackage.tqb.b
            r10.setTag(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a aVar = this.z0;
        if (aVar != null) {
            return aVar.u(layoutParams);
        }
        throw new IllegalStateException(a81.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
