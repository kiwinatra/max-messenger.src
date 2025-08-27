package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: kag  reason: default package */
public final class kag {
    public static final vl7 v = new vl7(3);
    public int a;
    public int b;
    public int c = -1;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public final float n;
    public final int o;
    public final OverScroller p;
    public final fqc q;
    public View r;
    public boolean s;
    public final ViewGroup t;
    public final haf u = new haf(9, (Object) this);

    public kag(Context context, ViewGroup viewGroup, fqc fqc) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (fqc != null) {
            this.t = viewGroup;
            this.q = fqc;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.p = new OverScroller(context, v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public static kag h(ViewGroup viewGroup, float f2, fqc fqc) {
        kag kag = new kag(viewGroup.getContext(), viewGroup, fqc);
        kag.b = (int) ((1.0f / f2) * ((float) kag.b));
        return kag;
    }

    public final void a() {
        b();
        if (this.a == 2) {
            OverScroller overScroller = this.p;
            overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX = overScroller.getCurrX();
            int currY2 = overScroller.getCurrY();
            this.q.H(this.r, currX, currY2, currY2 - currY);
        }
        o(0);
    }

    public final void b() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, c44.DEFAULT_ASPECT_RATIO);
            Arrays.fill(this.e, c44.DEFAULT_ASPECT_RATIO);
            Arrays.fill(this.f, c44.DEFAULT_ASPECT_RATIO);
            Arrays.fill(this.g, c44.DEFAULT_ASPECT_RATIO);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void c(View view, int i2) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.t;
        if (parent == viewGroup) {
            this.r = view;
            this.c = i2;
            this.q.F(view, i2);
            o(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        fqc fqc = this.q;
        boolean z = fqc.t(view) > 0;
        boolean z2 = fqc.u(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.b) : z2 && Math.abs(f3) > ((float) this.b);
        }
        float f4 = f3 * f3;
        int i2 = this.b;
        return f4 + (f2 * f2) > ((float) (i2 * i2));
    }

    public final void e(int i2) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i3 = this.k;
            int i4 = 1 << i2;
            if ((i3 & i4) != 0) {
                fArr[i2] = 0.0f;
                this.e[i2] = 0.0f;
                this.f[i2] = 0.0f;
                this.g[i2] = 0.0f;
                this.h[i2] = 0;
                this.i[i2] = 0;
                this.j[i2] = 0;
                this.k = (~i4) & i3;
            }
        }
    }

    public final int f(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.t.getWidth();
        float f2 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width)) - 0.5f) * 0.47123894f))) * f2) + f2;
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.a == 2) {
            OverScroller overScroller = this.p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                View view = this.r;
                WeakHashMap weakHashMap = gag.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.r;
                WeakHashMap weakHashMap2 = gag.a;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.q.H(this.r, currX, currY, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.t.post(this.u);
            }
        }
        return this.a == 2;
    }

    public final View i(int i2, int i3) {
        ViewGroup viewGroup = this.t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.q.q(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.p
            r11 = 0
            if (r4 != 0) goto L_0x001e
            if (r5 != 0) goto L_0x001e
            r1.abortAnimation()
            r10.o(r11)
            return r11
        L_0x001e:
            android.view.View r12 = r10.r
            float r0 = r10.n
            int r0 = (int) r0
            float r6 = r10.m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L_0x002e
            r13 = r11
            goto L_0x0035
        L_0x002e:
            if (r7 <= r6) goto L_0x0035
            if (r13 <= 0) goto L_0x0034
            r13 = r6
            goto L_0x0035
        L_0x0034:
            int r13 = -r6
        L_0x0035:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L_0x003d
        L_0x003b:
            r14 = r11
            goto L_0x0045
        L_0x003d:
            if (r7 <= r6) goto L_0x0045
            if (r14 <= 0) goto L_0x0043
            r14 = r6
            goto L_0x0045
        L_0x0043:
            int r11 = -r6
            goto L_0x003b
        L_0x0045:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L_0x005f
            float r11 = (float) r6
            float r6 = (float) r8
        L_0x005d:
            float r11 = r11 / r6
            goto L_0x0062
        L_0x005f:
            float r11 = (float) r11
            float r6 = (float) r9
            goto L_0x005d
        L_0x0062:
            if (r14 == 0) goto L_0x0068
            float r0 = (float) r7
            float r6 = (float) r8
        L_0x0066:
            float r0 = r0 / r6
            goto L_0x006b
        L_0x0068:
            float r0 = (float) r0
            float r6 = (float) r9
            goto L_0x0066
        L_0x006b:
            fqc r6 = r10.q
            int r7 = r6.t(r12)
            int r13 = r10.f(r4, r13, r7)
            int r12 = r6.u(r12)
            int r12 = r10.f(r5, r14, r12)
            float r13 = (float) r13
            float r13 = r13 * r11
            float r11 = (float) r12
            float r11 = r11 * r0
            float r11 = r11 + r13
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.o(r11)
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kag.j(int, int, int, int):boolean");
    }

    public final void k(MotionEvent motionEvent) {
        int i2;
        int i3 = 1;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i4 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View i5 = i((int) x, (int) y);
            m(x, y, pointerId);
            s(i5, pointerId);
            int i6 = this.h[pointerId];
        } else if (actionMasked != 1) {
            fqc fqc = this.q;
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.a == 1) {
                        this.s = true;
                        fqc.I(this.r, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
                        this.s = false;
                        if (this.a == 1) {
                            o(0);
                        }
                    }
                    b();
                } else if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x2 = motionEvent.getX(actionIndex);
                    float y2 = motionEvent.getY(actionIndex);
                    m(x2, y2, pointerId2);
                    if (this.a == 0) {
                        s(i((int) x2, (int) y2), pointerId2);
                        int i7 = this.h[pointerId2];
                        return;
                    }
                    int i8 = (int) x2;
                    int i9 = (int) y2;
                    View view = this.r;
                    if (view != null) {
                        if (i8 < view.getLeft() || i8 >= view.getRight() || i9 < view.getTop() || i9 >= view.getBottom()) {
                            i3 = 0;
                        }
                        i4 = i3;
                    }
                    if (i4 != 0) {
                        s(this.r, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    if (this.a == 1 && pointerId3 == this.c) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (true) {
                            if (i4 >= pointerCount) {
                                i2 = -1;
                                break;
                            }
                            int pointerId4 = motionEvent.getPointerId(i4);
                            if (pointerId4 != this.c) {
                                View i10 = i((int) motionEvent.getX(i4), (int) motionEvent.getY(i4));
                                View view2 = this.r;
                                if (i10 == view2 && s(view2, pointerId4)) {
                                    i2 = this.c;
                                    break;
                                }
                            }
                            i4++;
                        }
                        if (i2 == -1) {
                            l();
                        }
                    }
                    e(pointerId3);
                }
            } else if (this.a == 1) {
                int i11 = this.c;
                if ((this.k & (1 << i11)) == 0) {
                    i3 = 0;
                }
                if (i3 != 0) {
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f;
                    int i12 = this.c;
                    int i13 = (int) (x3 - fArr[i12]);
                    int i14 = (int) (y3 - this.g[i12]);
                    int left = this.r.getLeft() + i13;
                    int top = this.r.getTop() + i14;
                    int left2 = this.r.getLeft();
                    int top2 = this.r.getTop();
                    if (i13 != 0) {
                        left = fqc.f(this.r, left);
                        WeakHashMap weakHashMap = gag.a;
                        this.r.offsetLeftAndRight(left - left2);
                    }
                    if (i14 != 0) {
                        top = fqc.g(this.r, top);
                        WeakHashMap weakHashMap2 = gag.a;
                        this.r.offsetTopAndBottom(top - top2);
                    }
                    if (!(i13 == 0 && i14 == 0)) {
                        fqc.H(this.r, left, top, top - top2);
                    }
                    n(motionEvent);
                }
            } else {
                int pointerCount2 = motionEvent.getPointerCount();
                for (int i15 = 0; i15 < pointerCount2; i15++) {
                    int pointerId5 = motionEvent.getPointerId(i15);
                    if ((this.k & (1 << pointerId5)) != 0) {
                        float x4 = motionEvent.getX(i15);
                        float y4 = motionEvent.getY(i15);
                        float f2 = x4 - this.d[pointerId5];
                        float f3 = y4 - this.e[pointerId5];
                        Math.abs(f2);
                        Math.abs(f3);
                        int i16 = this.h[pointerId5];
                        Math.abs(f3);
                        Math.abs(f2);
                        int i17 = this.h[pointerId5];
                        Math.abs(f2);
                        Math.abs(f3);
                        int i18 = this.h[pointerId5];
                        Math.abs(f3);
                        Math.abs(f2);
                        int i19 = this.h[pointerId5];
                        if (this.a != 1) {
                            View i20 = i((int) x4, (int) y4);
                            if (d(i20, f2, f3) && s(i20, pointerId5)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                n(motionEvent);
            }
        } else {
            if (this.a == 1) {
                l();
            }
            b();
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.l;
        float f2 = this.m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.l.getXVelocity(this.c);
        float f3 = this.n;
        float abs = Math.abs(xVelocity);
        int i2 = (abs > f3 ? 1 : (abs == f3 ? 0 : -1));
        float f4 = c44.DEFAULT_ASPECT_RATIO;
        if (i2 < 0) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > c44.DEFAULT_ASPECT_RATIO ? f2 : -f2;
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f3) {
            if (abs2 > f2) {
                if (yVelocity <= c44.DEFAULT_ASPECT_RATIO) {
                    f2 = -f2;
                }
                f4 = f2;
            } else {
                f4 = yVelocity;
            }
        }
        this.s = true;
        this.q.I(this.r, xVelocity, f4);
        this.s = false;
        if (this.a == 1) {
            o(0);
        }
    }

    public final void m(float f2, float f3, int i2) {
        float[] fArr = this.d;
        int i3 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i4 = i2 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.e;
        this.g[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.h;
        int i5 = (int) f2;
        int i6 = (int) f3;
        ViewGroup viewGroup = this.t;
        int left = viewGroup.getLeft();
        int i7 = this.o;
        if (i5 < left + i7) {
            i3 = 1;
        }
        if (i6 < viewGroup.getTop() + i7) {
            i3 |= 4;
        }
        if (i5 > viewGroup.getRight() - i7) {
            i3 |= 2;
        }
        if (i6 > viewGroup.getBottom() - i7) {
            i3 |= 8;
        }
        iArr7[i2] = i3;
        this.k |= 1 << i2;
    }

    public final void n(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if ((this.k & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    public final void o(int i2) {
        this.t.removeCallbacks(this.u);
        if (this.a != i2) {
            this.a = i2;
            this.q.G(i2);
            if (this.a == 0) {
                this.r = null;
            }
        }
    }

    public final boolean p(int i2, int i3) {
        if (this.s) {
            return j(i2, i3, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        if (r12 != r11) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            int r3 = r18.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r17.b()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.l
            r4.addMovement(r1)
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x0117
            if (r2 == r4) goto L_0x0113
            if (r2 == r5) goto L_0x0067
            r7 = 3
            if (r2 == r7) goto L_0x0113
            r7 = 5
            if (r2 == r7) goto L_0x003d
            r5 = 6
            if (r2 == r5) goto L_0x0034
            goto L_0x013b
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.e(r1)
            goto L_0x013b
        L_0x003d:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m(r7, r1, r2)
            int r3 = r0.a
            if (r3 != 0) goto L_0x0056
            int[] r1 = r0.h
            r1 = r1[r2]
            goto L_0x013b
        L_0x0056:
            if (r3 != r5) goto L_0x013b
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.i(r3, r1)
            android.view.View r3 = r0.r
            if (r1 != r3) goto L_0x013b
            r0.s(r1, r2)
            goto L_0x013b
        L_0x0067:
            float[] r2 = r0.d
            if (r2 == 0) goto L_0x013b
            float[] r2 = r0.e
            if (r2 != 0) goto L_0x0071
            goto L_0x013b
        L_0x0071:
            int r2 = r18.getPointerCount()
            r3 = r6
        L_0x0076:
            if (r3 >= r2) goto L_0x010f
            int r5 = r1.getPointerId(r3)
            int r7 = r0.k
            int r8 = r4 << r5
            r7 = r7 & r8
            if (r7 == 0) goto L_0x010b
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.d
            r9 = r9[r5]
            float r9 = r7 - r9
            float[] r10 = r0.e
            r10 = r10[r5]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.i(r7, r8)
            if (r7 == 0) goto L_0x00a7
            boolean r8 = r0.d(r7, r9, r10)
            if (r8 == 0) goto L_0x00a7
            r8 = r4
            goto L_0x00a8
        L_0x00a7:
            r8 = r6
        L_0x00a8:
            if (r8 == 0) goto L_0x00d5
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r12 = r12 + r11
            fqc r13 = r0.q
            int r12 = r13.f(r7, r12)
            int r14 = r7.getTop()
            int r15 = (int) r10
            int r15 = r15 + r14
            int r15 = r13.g(r7, r15)
            int r16 = r13.t(r7)
            int r13 = r13.u(r7)
            if (r16 == 0) goto L_0x00ce
            if (r16 <= 0) goto L_0x00d5
            if (r12 != r11) goto L_0x00d5
        L_0x00ce:
            if (r13 == 0) goto L_0x010f
            if (r13 <= 0) goto L_0x00d5
            if (r15 != r14) goto L_0x00d5
            goto L_0x010f
        L_0x00d5:
            java.lang.Math.abs(r9)
            java.lang.Math.abs(r10)
            int[] r11 = r0.h
            r11 = r11[r5]
            java.lang.Math.abs(r10)
            java.lang.Math.abs(r9)
            int[] r11 = r0.h
            r11 = r11[r5]
            java.lang.Math.abs(r9)
            java.lang.Math.abs(r10)
            int[] r11 = r0.h
            r11 = r11[r5]
            java.lang.Math.abs(r10)
            java.lang.Math.abs(r9)
            int[] r9 = r0.h
            r9 = r9[r5]
            int r9 = r0.a
            if (r9 != r4) goto L_0x0102
            goto L_0x010f
        L_0x0102:
            if (r8 == 0) goto L_0x010b
            boolean r5 = r0.s(r7, r5)
            if (r5 == 0) goto L_0x010b
            goto L_0x010f
        L_0x010b:
            int r3 = r3 + 1
            goto L_0x0076
        L_0x010f:
            r17.n(r18)
            goto L_0x013b
        L_0x0113:
            r17.b()
            goto L_0x013b
        L_0x0117:
            float r2 = r18.getX()
            float r3 = r18.getY()
            int r1 = r1.getPointerId(r6)
            r0.m(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.i(r2, r3)
            android.view.View r3 = r0.r
            if (r2 != r3) goto L_0x0137
            int r3 = r0.a
            if (r3 != r5) goto L_0x0137
            r0.s(r2, r1)
        L_0x0137:
            int[] r2 = r0.h
            r1 = r2[r1]
        L_0x013b:
            int r0 = r0.a
            if (r0 != r4) goto L_0x0140
            goto L_0x0141
        L_0x0140:
            r4 = r6
        L_0x0141:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kag.q(android.view.MotionEvent):boolean");
    }

    public final boolean r(View view, int i2, int i3) {
        this.r = view;
        this.c = -1;
        boolean j2 = j(i2, i3, 0, 0);
        if (!j2 && this.a == 0 && this.r != null) {
            this.r = null;
        }
        return j2;
    }

    public final boolean s(View view, int i2) {
        if (view == this.r && this.c == i2) {
            return true;
        }
        if (view == null || !this.q.Q(view, i2)) {
            return false;
        }
        this.c = i2;
        c(view, i2);
        return true;
    }
}
