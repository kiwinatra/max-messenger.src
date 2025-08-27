package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: enb  reason: default package */
public final class enb implements View.OnTouchListener {
    public int A0;
    public final int B0;
    public boolean C0;
    public View D0;
    public ila X;
    public float Y;
    public float Z;
    public final ch a;
    public final hn4 b;
    public final View c;
    public final int o;
    public final Rect v = new Rect();
    public int v0;
    public ila w;
    public int w0;
    public ila x;
    public int x0;
    public ila y;
    public int y0;
    public ila z;
    public boolean z0 = true;

    public enb(Context context, ch chVar, hn4 hn4, View view) {
        this.a = chVar;
        this.b = hn4;
        this.c = view;
        this.o = ViewConfiguration.get(context).getScaledTouchSlop();
        this.B0 = ro4.b().n;
    }

    public final void a() {
        int left = this.D0.getLeft();
        int right = this.D0.getRight();
        int top = this.D0.getTop();
        int bottom = this.D0.getBottom();
        this.x = new ila(left, bottom, dnb.b);
        this.w = new ila(left, top, dnb.a);
        ila ila = new ila(right, bottom, dnb.c);
        this.y = ila;
        this.z = new ila(right, top, dnb.o);
        if (this.X == null) {
            this.X = ila;
        }
        int m = this.b.m();
        int i = this.B0;
        this.w0 = m + i;
        this.v0 = i;
        this.x0 = i;
        this.y0 = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.ila r12, boolean r13) {
        /*
            r11 = this;
            ch r0 = r11.a
            if (r13 == 0) goto L_0x0008
            boolean r13 = r0.q()
        L_0x0008:
            r11.X = r12
            android.view.View r1 = r11.c
            int r2 = r1.getWidth()
            int r3 = r1.getHeight()
            java.lang.Object r4 = r12.o
            dnb r4 = (defpackage.dnb) r4
            int r4 = r4.ordinal()
            int r5 = r12.c
            int r12 = r12.b
            if (r4 == 0) goto L_0x0091
            java.lang.String r6 = "window"
            hn4 r7 = r11.b
            r8 = 3
            r9 = 1
            if (r4 == r9) goto L_0x0068
            r10 = 2
            if (r4 == r10) goto L_0x003c
            if (r4 == r8) goto L_0x0032
            r11 = 0
            r2 = r11
            goto L_0x0097
        L_0x0032:
            int r12 = r12 - r2
            int r2 = r11.y0
            int r12 = r12 - r2
            int r11 = r11.w0
        L_0x0038:
            int r11 = r11 + r5
        L_0x0039:
            r2 = r11
        L_0x003a:
            r11 = r12
            goto L_0x0097
        L_0x003c:
            int r12 = r12 - r2
            int r2 = r11.y0
            int r12 = r12 - r2
            int r5 = r5 - r3
            int r2 = r11.v0
            int r2 = r5 - r2
            boolean r3 = r11.z0
            if (r3 == 0) goto L_0x003a
            android.content.Context r3 = r1.getContext()
            r7.getClass()
            java.lang.Object r3 = r3.getSystemService(r6)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r3 = r3.getDefaultDisplay()
            int r3 = r3.getRotation()
            if (r3 == r9) goto L_0x003a
            if (r3 != r8) goto L_0x0063
            goto L_0x003a
        L_0x0063:
            int r11 = r11.A0
        L_0x0065:
            int r11 = r2 - r11
            goto L_0x0039
        L_0x0068:
            int r2 = r11.x0
            int r12 = r12 + r2
            int r5 = r5 - r3
            int r2 = r11.v0
            int r2 = r5 - r2
            boolean r3 = r11.z0
            if (r3 == 0) goto L_0x003a
            android.content.Context r3 = r1.getContext()
            r7.getClass()
            java.lang.Object r3 = r3.getSystemService(r6)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r3 = r3.getDefaultDisplay()
            int r3 = r3.getRotation()
            if (r3 == r9) goto L_0x003a
            if (r3 != r8) goto L_0x008e
            goto L_0x003a
        L_0x008e:
            int r11 = r11.A0
            goto L_0x0065
        L_0x0091:
            int r2 = r11.x0
            int r12 = r12 + r2
            int r11 = r11.w0
            goto L_0x0038
        L_0x0097:
            android.graphics.Point r12 = new android.graphics.Point
            r12.<init>(r11, r2)
            android.view.ViewPropertyAnimator r11 = r1.animate()
            r11.cancel()
            if (r13 == 0) goto L_0x00cf
            android.view.ViewPropertyAnimator r11 = r1.animate()
            int r13 = r12.x
            float r13 = (float) r13
            android.view.ViewPropertyAnimator r11 = r11.x(r13)
            int r12 = r12.y
            float r12 = (float) r12
            android.view.ViewPropertyAnimator r11 = r11.y(r12)
            ug r12 = r0.a
            long r12 = r12.b()
            android.view.ViewPropertyAnimator r11 = r11.setDuration(r12)
            ug r12 = r0.a
            android.view.animation.Interpolator r12 = r12.n()
            android.view.ViewPropertyAnimator r11 = r11.setInterpolator(r12)
            r11.start()
            goto L_0x00db
        L_0x00cf:
            int r11 = r12.x
            float r11 = (float) r11
            r1.setX(r11)
            int r11 = r12.y
            float r11 = (float) r11
            r1.setY(r11)
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enb.b(ila, boolean):void");
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view;
        int action = motionEvent.getAction();
        Rect rect = this.v;
        if (action == 0) {
            this.Y = motionEvent.getRawX();
            this.Z = motionEvent.getRawY();
            view2.getHitRect(rect);
        } else if (action == 1) {
            Rect rect2 = new Rect();
            view2.getHitRect(rect2);
            if (rect2.equals(rect)) {
                view.performClick();
                return true;
            }
            ila ila = this.w;
            double x2 = (double) ((int) view.getX());
            double y2 = (double) ((int) view.getY());
            int k = (int) fqc.k((double) ila.b, (double) ila.c, x2, y2);
            ila ila2 = this.x;
            double d = (double) ila2.c;
            double d2 = y2;
            double d3 = x2;
            double d4 = d2;
            int k2 = (int) fqc.k((double) ila2.b, d, d3, d4);
            ila ila3 = this.y;
            int k3 = (int) fqc.k((double) ila3.b, (double) ila3.c, d3, d4);
            ila ila4 = this.z;
            int k4 = (int) fqc.k((double) ila4.b, (double) ila4.c, d3, d4);
            int min = Math.min(Math.min(k, k2), Math.min(k3, k4));
            if (this.z0 && min == k4) {
                min = Math.min(k2, Math.min(k3, k2));
            }
            b(min == k ? this.w : min == k2 ? this.x : min == k4 ? this.z : this.y, true);
        } else if (action == 2) {
            float rawX = motionEvent.getRawX() - this.Y;
            float rawY = motionEvent.getRawY() - this.Z;
            float abs = Math.abs(rawX);
            int i = this.o;
            if (abs > ((float) i)) {
                view2.setX((this.Y + rawX) - (((float) view.getWidth()) * 0.5f));
            }
            if (Math.abs(rawY) > ((float) i)) {
                view2.setY((this.Z + rawY) - (((float) view.getHeight()) * 0.5f));
            }
        }
        return true;
    }
}
