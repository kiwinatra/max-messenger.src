package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: tl7  reason: default package */
public final class tl7 implements ezc {
    public final /* synthetic */ yl7 a;

    public tl7(yl7 yl7) {
        this.a = yl7;
    }

    public final void a(MotionEvent motionEvent) {
        yl7 yl7 = this.a;
        ((GestureDetector) yl7.G0.b).onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = yl7.C0;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (yl7.Z != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(yl7.Z);
            if (findPointerIndex >= 0) {
                yl7.k(actionMasked, findPointerIndex, motionEvent);
            }
            pzc pzc = yl7.c;
            if (pzc != null) {
                int i = 0;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            VelocityTracker velocityTracker2 = yl7.C0;
                            if (velocityTracker2 != null) {
                                velocityTracker2.clear();
                            }
                        } else if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == yl7.Z) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                yl7.Z = motionEvent.getPointerId(i);
                                yl7.u(yl7.x0, actionIndex, motionEvent);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (findPointerIndex >= 0) {
                        yl7.u(yl7.x0, findPointerIndex, motionEvent);
                        yl7.q(pzc);
                        RecyclerView recyclerView = yl7.A0;
                        tj7 tj7 = yl7.B0;
                        recyclerView.removeCallbacks(tj7);
                        tj7.run();
                        yl7.A0.invalidate();
                        return;
                    } else {
                        return;
                    }
                }
                yl7.s((pzc) null, 0);
                yl7.Z = -1;
            }
        }
    }

    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        yl7 yl7 = this.a;
        ((GestureDetector) yl7.G0.b).onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        ul7 ul7 = null;
        if (actionMasked == 0) {
            yl7.Z = motionEvent.getPointerId(0);
            yl7.o = motionEvent.getX();
            yl7.v = motionEvent.getY();
            VelocityTracker velocityTracker = yl7.C0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            yl7.C0 = VelocityTracker.obtain();
            if (yl7.c == null) {
                ArrayList arrayList = yl7.y0;
                if (!arrayList.isEmpty()) {
                    View n = yl7.n(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        ul7 ul72 = (ul7) arrayList.get(size);
                        if (ul72.v.a == n) {
                            ul7 = ul72;
                            break;
                        }
                        size--;
                    }
                }
                if (ul7 != null) {
                    yl7.o -= ul7.z;
                    yl7.v -= ul7.X;
                    pzc pzc = ul7.v;
                    yl7.m(pzc, true);
                    if (yl7.a.remove(pzc.a)) {
                        yl7.v0.a(yl7.A0, pzc);
                    }
                    yl7.s(pzc, ul7.w);
                    yl7.u(yl7.x0, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            yl7.Z = -1;
            yl7.s((pzc) null, 0);
        } else {
            int i = yl7.Z;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                yl7.k(actionMasked, findPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = yl7.C0;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return yl7.c != null;
    }

    public final void e(boolean z) {
        if (z) {
            this.a.s((pzc) null, 0);
        }
    }
}
