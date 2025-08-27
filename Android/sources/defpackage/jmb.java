package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: jmb  reason: default package */
public final class jmb implements anb {
    public final View a;
    public final pf1 b;
    public final b91 c;
    public int o;
    public int v;
    public float w;
    public float x;
    public ValueAnimator y;
    public zmb z = zmb.e;

    public jmb(View view, xv1 xv1, b91 b91) {
        this.a = view;
        this.b = xv1;
        this.c = b91;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (r1 > r3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            pf1 r0 = r6.b
            android.graphics.PointF r0 = r0.e()
            float r1 = r0.x
            zmb r2 = r6.z
            float r3 = r2.a
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0012
        L_0x0010:
            r1 = r3
            goto L_0x0019
        L_0x0012:
            float r3 = r2.b
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0019
            goto L_0x0010
        L_0x0019:
            float r3 = r0.y
            float r4 = r2.c
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x0023
            r3 = r4
            goto L_0x002a
        L_0x0023:
            float r2 = r2.d
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x002a
            r3 = r2
        L_0x002a:
            android.animation.ValueAnimator r2 = r6.y
            if (r2 == 0) goto L_0x0031
            r2.end()
        L_0x0031:
            r2 = 2
            float[] r2 = new float[r2]
            r2 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            r4 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r4)
            imb r4 = new imb
            r4.<init>(r0, r1, r3, r6)
            r2.addUpdateListener(r4)
            r6.y = r2
            r2.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmb.a():void");
    }

    public final boolean b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        pf1 pf1 = this.b;
        if (action == 0) {
            PointF e = pf1.e();
            this.o = (int) e.x;
            this.v = (int) e.y;
            this.w = motionEvent.getRawX();
            this.x = motionEvent.getRawY();
        }
        int action2 = motionEvent.getAction();
        if (action2 == 1) {
            a();
            return motionEvent.getAction() == 1 && motionEvent.getEventTime() - motionEvent.getDownTime() < 100;
        } else if (action2 == 2) {
            float rawX = motionEvent.getRawX() - this.w;
            float rawY = motionEvent.getRawY() - this.x;
            float f = ((float) this.o) + rawX;
            float f2 = ((float) this.v) + rawY;
            pf1.l(f, f2);
            PointF pointF = ((c91) this.c).b;
            pointF.x = f;
            pointF.y = f2;
            return true;
        } else if (action2 != 3) {
            return true;
        } else {
            a();
            return true;
        }
    }

    public final void d(float f, float f2) {
        this.b.l(f, f2);
        PointF pointF = ((c91) this.c).b;
        pointF.x = f;
        pointF.y = f2;
    }

    public final void i(float f, float f2, int i, int i2, nmb nmb) {
        this.z = kne.f(this.a.getContext(), f, f2, i, i2, nmb);
    }
}
