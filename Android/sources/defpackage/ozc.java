package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ozc  reason: default package */
public final class ozc implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator o;
    public boolean v = false;
    public boolean w = false;
    public final /* synthetic */ RecyclerView x;

    public ozc(RecyclerView recyclerView) {
        this.x = recyclerView;
        vl7 vl7 = RecyclerView.R1;
        this.o = vl7;
        this.c = new OverScroller(recyclerView.getContext(), vl7);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.x;
        recyclerView.setScrollState(2);
        this.b = 0;
        this.a = 0;
        Interpolator interpolator = this.o;
        vl7 vl7 = RecyclerView.R1;
        if (interpolator != vl7) {
            this.o = vl7;
            this.c = new OverScroller(recyclerView.getContext(), vl7);
        }
        this.c.fling(0, 0, i, i2, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.v) {
            this.w = true;
            return;
        }
        RecyclerView recyclerView = this.x;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = gag.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.x;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.R1;
        }
        if (this.o != interpolator) {
            this.o = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        b();
    }

    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.x;
        if (recyclerView.z0 == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.w = false;
        this.v = true;
        recyclerView.s();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int r = RecyclerView.r(currX - this.a, recyclerView.U0, recyclerView.W0, recyclerView.getWidth());
            int r2 = RecyclerView.r(i5, recyclerView.V0, recyclerView.X0, recyclerView.getHeight());
            int[] iArr = recyclerView.C1;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean y = recyclerView.y(iArr, (int[]) null, r, r2, 1);
            int[] iArr2 = recyclerView.C1;
            if (y) {
                r -= iArr2[0];
                r2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.q(r, r2);
            }
            if (recyclerView.y0 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.y0(iArr2, r, r2);
                int i6 = iArr2[0];
                int i7 = iArr2[1];
                int i8 = r - i6;
                int i9 = r2 - i7;
                ew7 ew7 = recyclerView.z0.e;
                if (ew7 != null && !ew7.d && ew7.e) {
                    int b2 = recyclerView.q1.b();
                    if (b2 == 0) {
                        ew7.k();
                    } else if (ew7.a >= b2) {
                        ew7.a = b2 - 1;
                        ew7.i(i6, i7);
                    } else {
                        ew7.i(i6, i7);
                    }
                }
                i3 = i6;
                i2 = i8;
                i = i9;
                i4 = i7;
            } else {
                i2 = r;
                i = r2;
                i4 = 0;
                i3 = 0;
            }
            if (!recyclerView.B0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.C1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i10 = i4;
            recyclerView.z(i3, i4, i2, i, (int[]) null, 1, iArr3);
            int i11 = i2 - iArr2[0];
            int i12 = i - iArr2[1];
            if (!(i3 == 0 && i10 == 0)) {
                recyclerView.A(i3, i10);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            ew7 ew72 = recyclerView.z0.e;
            if ((ew72 == null || !ew72.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.C();
                        if (recyclerView.U0.isFinished()) {
                            recyclerView.U0.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.D();
                        if (recyclerView.W0.isFinished()) {
                            recyclerView.W0.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.E();
                        if (recyclerView.V0.isFinished()) {
                            recyclerView.V0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.B();
                        if (recyclerView.X0.isFinished()) {
                            recyclerView.X0.onAbsorb(currVelocity);
                        }
                    }
                    if (!(i13 == 0 && currVelocity == 0)) {
                        WeakHashMap weakHashMap = gag.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.P1) {
                    e13 e13 = recyclerView.p1;
                    int[] iArr4 = e13.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    e13.d = 0;
                }
            } else {
                b();
                kp6 kp6 = recyclerView.o1;
                if (kp6 != null) {
                    kp6.a(recyclerView, i3, i10);
                }
            }
        }
        ew7 ew73 = recyclerView.z0.e;
        if (ew73 != null && ew73.d) {
            ew73.i(0, 0);
        }
        this.v = false;
        if (this.w) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = gag.a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.a(1);
    }
}
