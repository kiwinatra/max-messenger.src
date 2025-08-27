package one.me.sdk.zoom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import com.yalantis.ucrop.util.MatrixUtils;

public class ZoomableDraweeView extends up6 implements asg {
    public static final /* synthetic */ int D0 = 0;
    public final j5 A0;
    public gv4 B0;
    public bsg C0;
    public boolean v0;
    public GestureDetector w0;
    public dsg x0;
    public final RectF y;
    public volatile l8g y0;
    public final RectF z;
    public final Runnable z0;

    public ZoomableDraweeView(Context context) {
        super(context);
        this.y = new RectF();
        this.z = new RectF();
        this.y0 = null;
        this.z0 = new csg((lfb) this, 0);
        this.A0 = new j5(6, this);
        this.C0 = new ik4(new ata(new o67()));
        m();
    }

    public void b(Matrix matrix) {
        bg5.f(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onTransformChanged: view %x");
        if (this.B0 != null && MatrixUtils.getMatrixScale(((ik4) this.C0).Y) > 1.1f) {
            p(this.B0);
        }
        invalidate();
    }

    public bsg getZoomableController() {
        return this.C0;
    }

    public final void invalidateDrawable(Drawable drawable) {
        removeCallbacks(this.y0);
        this.y0 = new l8g(7, this, drawable);
        y7e.Q(this, this.y0);
    }

    public final void m() {
        ((ik4) this.C0).b = this;
        this.w0 = new GestureDetector(getContext(), new q00(23, this));
    }

    public void n(Throwable th) {
        bg5.f(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onFinalImageSet: view %x");
        dsg dsg = this.x0;
        if (dsg != null) {
            dsg.g(th);
        }
        requestLayout();
        postInvalidate();
    }

    public void o(k97 k97) {
        bg5.f(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onFinalImageSet: view %x");
        if (!((ik4) this.C0).c) {
            q();
            bsg bsg = this.C0;
            boolean z2 = this.v0;
            ik4 ik4 = (ik4) bsg;
            ik4.c = z2;
            if (!z2) {
                ik4.reset();
            }
        }
        requestLayout();
        postInvalidate();
    }

    public void onDraw(Canvas canvas) {
        int i = 0;
        boolean z2 = this.v0 && !((ik4) this.C0).Y.isIdentity();
        if (z2) {
            i = canvas.save();
            canvas.concat(((ik4) this.C0).Y);
        }
        super.onDraw(canvas);
        if (z2) {
            canvas.restoreToCount(i);
        }
    }

    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        bg5.f(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onLayout: view %x");
        super.onLayout(z2, i, i2, i3, i4);
        q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r1 != 6) goto L_0x018b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            android.view.GestureDetector r0 = r14.w0
            r0.onTouchEvent(r15)
            bsg r0 = r14.C0
            ik4 r0 = (defpackage.ik4) r0
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x01a4
            ata r0 = r0.a
            java.lang.Object r0 = r0.b
            o67 r0 = (defpackage.o67) r0
            r0.getClass()
            int r1 = r15.getActionMasked()
            r2 = 1
            r3 = 0
            java.lang.Cloneable r4 = r0.g
            float[] r4 = (float[]) r4
            java.lang.Cloneable r5 = r0.f
            float[] r5 = (float[]) r5
            java.lang.Object r6 = r0.a
            int[] r6 = (int[]) r6
            r7 = 6
            r8 = -1
            r9 = 2
            if (r1 == 0) goto L_0x0132
            if (r1 == r2) goto L_0x0132
            if (r1 == r9) goto L_0x0043
            r10 = 3
            if (r1 == r10) goto L_0x003b
            r10 = 5
            if (r1 == r10) goto L_0x0132
            if (r1 == r7) goto L_0x0132
            goto L_0x018b
        L_0x003b:
            r0.e()
            r0.c()
            goto L_0x018b
        L_0x0043:
            r1 = r3
        L_0x0044:
            if (r1 >= r9) goto L_0x005d
            r7 = r6[r1]
            int r7 = r15.findPointerIndex(r7)
            if (r7 == r8) goto L_0x005a
            float r10 = r15.getX(r7)
            r5[r1] = r10
            float r7 = r15.getY(r7)
            r4[r1] = r7
        L_0x005a:
            int r1 = r1 + 1
            goto L_0x0044
        L_0x005d:
            boolean r15 = r0.b
            if (r15 != 0) goto L_0x0065
            if (r15 != 0) goto L_0x0065
            r0.b = r2
        L_0x0065:
            boolean r15 = r0.b
            if (r15 == 0) goto L_0x018b
            java.lang.Object r15 = r0.h
            ata r15 = (defpackage.ata) r15
            if (r15 == 0) goto L_0x018b
            java.lang.Object r0 = r15.c
            ik4 r0 = (defpackage.ik4) r0
            if (r0 == 0) goto L_0x018b
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x007b
            goto L_0x018b
        L_0x007b:
            android.graphics.Matrix r1 = r0.Y
            android.graphics.Matrix r4 = r0.X
            r1.set(r4)
            java.lang.Object r15 = r15.b
            o67 r15 = (defpackage.o67) r15
            int r4 = r15.c
            java.lang.Cloneable r5 = r15.g
            float[] r5 = (float[]) r5
            java.lang.Cloneable r6 = r15.f
            float[] r6 = (float[]) r6
            java.io.Serializable r7 = r15.e
            float[] r7 = (float[]) r7
            java.lang.Object r8 = r15.d
            float[] r8 = (float[]) r8
            if (r4 >= r9) goto L_0x009d
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00c1
        L_0x009d:
            r4 = r8[r2]
            r9 = r8[r3]
            float r4 = r4 - r9
            r9 = r7[r2]
            r10 = r7[r3]
            float r9 = r9 - r10
            r10 = r6[r2]
            r11 = r6[r3]
            float r10 = r10 - r11
            r11 = r5[r2]
            r3 = r5[r3]
            float r11 = r11 - r3
            double r3 = (double) r4
            double r12 = (double) r9
            double r3 = java.lang.Math.hypot(r3, r12)
            float r3 = (float) r3
            double r9 = (double) r10
            double r11 = (double) r11
            double r9 = java.lang.Math.hypot(r9, r11)
            float r4 = (float) r9
            float r3 = r4 / r3
        L_0x00c1:
            java.lang.Object r4 = r15.d
            float[] r4 = (float[]) r4
            int r9 = r15.c
            float r4 = defpackage.ata.r(r4, r9)
            java.io.Serializable r9 = r15.e
            float[] r9 = (float[]) r9
            int r10 = r15.c
            float r9 = defpackage.ata.r(r9, r10)
            r1.postScale(r3, r3, r4, r9)
            java.lang.Object r3 = r15.d
            float[] r3 = (float[]) r3
            int r4 = r15.c
            float r3 = defpackage.ata.r(r3, r4)
            java.io.Serializable r4 = r15.e
            float[] r4 = (float[]) r4
            int r9 = r15.c
            float r4 = defpackage.ata.r(r4, r9)
            float r9 = com.yalantis.ucrop.util.MatrixUtils.getMatrixScale(r1)
            float r10 = r0.v
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x0100
            float r10 = r10 / r9
            r1.postScale(r10, r10, r3, r4)
            ata r3 = r0.a
            r3.B()
            goto L_0x010a
        L_0x0100:
            float r10 = r0.w
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x010a
            float r10 = r10 / r9
            r1.postScale(r10, r10, r3, r4)
        L_0x010a:
            int r3 = r15.c
            float r3 = defpackage.ata.r(r6, r3)
            int r4 = r15.c
            float r4 = defpackage.ata.r(r8, r4)
            float r3 = r3 - r4
            int r4 = r15.c
            float r4 = defpackage.ata.r(r5, r4)
            int r15 = r15.c
            float r15 = defpackage.ata.r(r7, r15)
            float r4 = r4 - r15
            r1.postTranslate(r3, r4)
            r0.b()
            asg r15 = r0.b
            if (r15 == 0) goto L_0x018b
            r15.b(r1)
            goto L_0x018b
        L_0x0132:
            boolean r1 = r0.b
            r0.e()
            r0.c()
        L_0x013a:
            if (r3 >= r9) goto L_0x017f
            int r10 = r15.getPointerCount()
            int r11 = r15.getActionMasked()
            int r12 = r15.getActionIndex()
            if (r11 == r2) goto L_0x014c
            if (r11 != r7) goto L_0x0151
        L_0x014c:
            if (r3 < r12) goto L_0x0151
            int r11 = r3 + 1
            goto L_0x0152
        L_0x0151:
            r11 = r3
        L_0x0152:
            if (r11 >= r10) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r11 = r8
        L_0x0156:
            if (r11 != r8) goto L_0x0159
            goto L_0x017f
        L_0x0159:
            int r10 = r15.getPointerId(r11)
            r6[r3] = r10
            float r10 = r15.getX(r11)
            java.lang.Object r12 = r0.d
            float[] r12 = (float[]) r12
            r12[r3] = r10
            r5[r3] = r10
            float r10 = r15.getY(r11)
            java.io.Serializable r11 = r0.e
            float[] r11 = (float[]) r11
            r11[r3] = r10
            r4[r3] = r10
            int r10 = r0.c
            int r10 = r10 + r2
            r0.c = r10
            int r3 = r3 + 1
            goto L_0x013a
        L_0x017f:
            if (r1 == 0) goto L_0x018b
            int r15 = r0.c
            if (r15 <= 0) goto L_0x018b
            boolean r15 = r0.b
            if (r15 != 0) goto L_0x018b
            r0.b = r2
        L_0x018b:
            bsg r15 = r14.C0
            ik4 r15 = (defpackage.ik4) r15
            android.graphics.Matrix r15 = r15.Y
            float r15 = com.yalantis.ucrop.util.MatrixUtils.getMatrixScale(r15)
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            int r15 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x01a3
            android.view.ViewParent r14 = r14.getParent()
            r14.requestDisallowInterceptTouchEvent(r2)
        L_0x01a3:
            return r2
        L_0x01a4:
            boolean r14 = super.onTouchEvent(r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.zoom.ZoomableDraweeView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(gv4 gv4) {
        gv4 controller = getController();
        if (controller instanceof m0) {
            m0 m0Var = (m0) controller;
            j5 j5Var = this.A0;
            m0Var.getClass();
            j5Var.getClass();
            jy3 jy3 = m0Var.f;
            if (jy3 instanceof l0) {
                l0 l0Var = (l0) jy3;
                synchronized (l0Var) {
                    int indexOf = l0Var.a.indexOf(j5Var);
                    if (indexOf != -1) {
                        l0Var.a.set(indexOf, (Object) null);
                    }
                }
            } else if (jy3 == j5Var) {
                m0Var.f = null;
            }
        }
        if (gv4 instanceof m0) {
            ((m0) gv4).a(this.A0);
        }
        this.B0 = null;
        super.setController(gv4);
    }

    public final void q() {
        qb6 qb6 = ((sp6) getHierarchy()).f;
        Matrix matrix = qb6.o;
        qb6.n(matrix);
        Rect bounds = qb6.getBounds();
        RectF rectF = this.y;
        rectF.set(bounds);
        matrix.mapRect(rectF);
        RectF rectF2 = this.z;
        rectF2.set(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getWidth(), (float) getHeight());
        ((ik4) this.C0).y.set(rectF);
        ((ik4) this.C0).x.set(rectF2);
        bg5.h(ZoomableDraweeView.class, "updateZoomableControllerBounds: view %x, view bounds: %s, image bounds: %s", Integer.valueOf(hashCode()), rectF2, rectF);
    }

    public void setController(gv4 gv4) {
        p((gv4) null);
        ik4 ik4 = (ik4) this.C0;
        ik4.c = false;
        ik4.reset();
        p(gv4);
    }

    public void setListener(dsg dsg) {
        this.x0 = dsg;
    }

    public void setZoomEnabled(boolean z2) {
        this.v0 = z2;
        bsg bsg = this.C0;
        if (bsg != null) {
            ik4 ik4 = (ik4) bsg;
            ik4.c = z2;
            if (!z2) {
                ik4.reset();
            }
        }
    }

    public void setZoomableController(bsg bsg) {
        bsg.getClass();
        ((ik4) this.C0).b = null;
        this.C0 = bsg;
        ((ik4) bsg).b = this;
    }

    public ZoomableDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = new RectF();
        this.z = new RectF();
        this.y0 = null;
        this.z0 = new csg(this, 1);
        this.A0 = new j5(6, this);
        this.C0 = new ik4(new ata(new o67()));
        m();
    }

    public ZoomableDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.y = new RectF();
        this.z = new RectF();
        this.y0 = null;
        this.z0 = new csg(this, 1);
        this.A0 = new j5(6, this);
        this.C0 = new ik4(new ata(new o67()));
        m();
    }
}
