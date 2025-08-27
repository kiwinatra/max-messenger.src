package ru.ok.messages.video.widgets;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import java.util.ArrayList;

public class FloatingVideoView extends FrameLayout {
    public static final /* synthetic */ int C0 = 0;
    public final ch A0;
    public VelocityTracker B0;
    public final int a;
    public final int b;
    public final int c;
    public int o;
    public int v;
    public float v0;
    public final int w = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    public float w0;
    public final WindowManager x = kw3.a(getContext());
    public AnimatorSet x0;
    public int y;
    public zr5 y0;
    public int z;
    public final WindowManager.LayoutParams z0;

    public FloatingVideoView(Context context) {
        super(context);
        getContext();
        ro4 b2 = ro4.b();
        this.A0 = ((qra) ym.e()).d();
        this.a = vo4.b((int) 140.0f);
        int i = b2.h;
        this.b = i;
        this.c = i;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(0, 0, 0, 0, 2038, 16779016, -3);
        this.z0 = layoutParams;
        layoutParams.gravity = 51;
        setLayoutParams(layoutParams);
    }

    public final void a() {
        AnimatorSet animatorSet = this.x0;
        if (animatorSet == null || !animatorSet.isStarted()) {
            AnimatorSet animatorSet2 = this.x0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.x0.removeAllListeners();
                this.x0 = null;
            }
            ArrayList arrayList = new ArrayList();
            WindowManager.LayoutParams layoutParams = this.z0;
            int i = (layoutParams.width / 2) + layoutParams.x;
            int i2 = this.o;
            arrayList.add(ObjectAnimator.ofInt(this, "x", new int[]{this.z0.x, i < i2 / 2 ? getLeftMargin() : (i2 - getRightMargin()) - this.z0.width}));
            if (!arrayList.isEmpty()) {
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.x0 = animatorSet3;
                animatorSet3.setInterpolator(this.A0.a.l());
                this.x0.setDuration(120);
                this.x0.playTogether(arrayList);
                this.x0.addListener(new uf(3, this));
                this.x0.start();
                return;
            }
            a33 a33 = ym.v.c().a;
            WindowManager.LayoutParams layoutParams2 = this.z0;
            int i3 = layoutParams2.x;
            int i4 = layoutParams2.y;
            a33.j(i3, "app.video.pip.pos.x");
            a33.j(i4, "app.video.pip.pos.y");
            return;
        }
        z68.c("ru.ok.messages.video.widgets.FloatingVideoView", "Frontier animation is already started", new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r6 = r1.y;
        r2 = r1.height;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r6) {
        /*
            r5 = this;
            int r0 = r5.getLeftMargin()
            int r1 = r5.getRightMargin()
            android.view.WindowManager$LayoutParams r2 = r5.z0
            int r3 = r2.x
            if (r3 >= r0) goto L_0x0011
            r2.x = r0
            goto L_0x001c
        L_0x0011:
            int r0 = r2.width
            int r3 = r3 + r0
            int r4 = r5.o
            int r4 = r4 - r1
            if (r3 <= r4) goto L_0x001c
            int r4 = r4 - r0
            r2.x = r4
        L_0x001c:
            int r0 = r5.getTopMargin()
            android.view.WindowManager$LayoutParams r1 = r5.z0
            int r2 = r1.y
            if (r2 >= r0) goto L_0x0028
            r1.y = r0
        L_0x0028:
            if (r6 == 0) goto L_0x0037
            int r6 = r1.y
            int r2 = r1.height
            int r6 = r6 + r2
            int r5 = r5.v
            int r5 = r5 - r0
            if (r6 <= r5) goto L_0x0037
            int r5 = r5 - r2
            r1.y = r5
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.video.widgets.FloatingVideoView.b(boolean):void");
    }

    public final void c(int i, int i2) {
        int i3;
        int min = (int) (((double) Math.min(this.o, this.v)) * 0.62d);
        if (i <= 0) {
            i = this.a;
        }
        if (i2 <= 0) {
            i2 = this.a;
        }
        if (i > i2) {
            i3 = (i2 * min) / i;
        } else {
            int i4 = (i * min) / i2;
            i3 = min;
            min = i4;
        }
        int i5 = this.a;
        if (min < i5) {
            i3 = (i3 * i5) / min;
            min = i5;
        }
        WindowManager.LayoutParams layoutParams = this.z0;
        layoutParams.width = min;
        layoutParams.height = i3;
        post(new ne4(26, this));
    }

    public int getLeftMargin() {
        return this.b;
    }

    public int getRightMargin() {
        return this.b;
    }

    public int getTopMargin() {
        return ((qra) ym.e()).n().m() + this.c;
    }

    public int getWindowHeight() {
        return this.z0.height;
    }

    public WindowManager.LayoutParams getWindowManagerLayoutParams() {
        return this.z0;
    }

    public int getWindowWidth() {
        return this.z0.width;
    }

    public int getXPos() {
        return this.z0.x;
    }

    public int getYPos() {
        return this.z0.y;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.x0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x0.removeAllListeners();
            this.x0 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [w1, java.lang.Object, n0a] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Action "
            r0.<init>(r1)
            int r1 = r15.getAction()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ru.ok.messages.video.widgets.FloatingVideoView"
            defpackage.z68.c(r1, r0, new java.lang.Object[0])
            int r0 = r15.getAction()
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L_0x0036
            int r0 = r15.getActionMasked()
            r1 = 5
            if (r0 == r1) goto L_0x0036
            int r0 = r15.getActionMasked()
            r1 = 6
            if (r0 != r1) goto L_0x002e
            goto L_0x0036
        L_0x002e:
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            r14.v0 = r15
            r14.w0 = r15
            goto L_0x0117
        L_0x0036:
            int r0 = r14.y
            if (r0 <= 0) goto L_0x0101
            float r0 = r14.w0
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0101
            float r1 = r14.v0
            double r3 = (double) r1
            double r5 = (double) r0
            float r0 = r15.getRawX()
            double r7 = (double) r0
            float r15 = r15.getRawY()
            double r9 = (double) r15
            double r0 = defpackage.fqc.k(r3, r5, r7, r9)
            int r15 = (int) r0
            int r0 = r14.w
            if (r15 <= r0) goto L_0x0117
            zr5 r15 = r14.y0
            r0 = 1
            if (r15 == 0) goto L_0x0100
            android.content.Context r14 = r14.getContext()
            smb r15 = (defpackage.smb) r15
            n0a r1 = r15.C0
            if (r1 == 0) goto L_0x0069
            goto L_0x0100
        L_0x0069:
            android.view.WindowManager r1 = defpackage.kw3.a(r14)
            int[] r3 = r15.c(r14)
            android.view.Display r4 = r1.getDefaultDisplay()
            int r4 = r4.getRotation()
            if (r4 == r0) goto L_0x0081
            r5 = 3
            if (r4 != r5) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r4 = r2
            goto L_0x0082
        L_0x0081:
            r4 = r0
        L_0x0082:
            android.view.WindowManager$LayoutParams r13 = new android.view.WindowManager$LayoutParams
            r5 = r3[r2]
            hn4 r6 = r15.c
            if (r4 == 0) goto L_0x008f
            int r7 = r6.m()
            goto L_0x0090
        L_0x008f:
            r7 = r2
        L_0x0090:
            int r5 = r5 + r7
            int r7 = r5 + 1
            r3 = r3[r0]
            int r5 = r6.m()
            int r5 = r5 + r3
            if (r4 != 0) goto L_0x00b7
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics
            r3.<init>()
            android.view.Display r8 = r1.getDefaultDisplay()
            r8.getMetrics(r3)
            int r8 = r3.heightPixels
            android.view.Display r9 = r1.getDefaultDisplay()
            r9.getRealMetrics(r3)
            int r3 = r3.heightPixels
            if (r3 <= r8) goto L_0x00b7
            int r3 = r3 - r8
            goto L_0x00b8
        L_0x00b7:
            r3 = r2
        L_0x00b8:
            int r3 = r3 + r5
            if (r4 != 0) goto L_0x00bf
            int r2 = r6.m()
        L_0x00bf:
            r9 = r2
            r11 = 67384(0x10738, float:9.4425E-41)
            r12 = -3
            r8 = 0
            r10 = 2038(0x7f6, float:2.856E-42)
            r5 = r13
            r6 = r7
            r7 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            v2a r2 = new v2a
            ch r3 = r15.v
            r2.<init>(r14, r3)
            n0a r14 = new n0a
            u00 r3 = new u00
            r4 = 22
            r3.<init>((java.lang.Object) r15, (java.lang.Object) r1, (java.lang.Object) r2, (int) r4)
            r14.<init>(r2)
            r14.b = r3
            r2.R(r14)
            r15.C0 = r14
            java.lang.Object r14 = r2.c
            android.view.View r14 = (android.view.View) r14
            r1.addView(r14, r13)
            n0a r14 = r15.C0
            f2a r14 = r14.a
            v2a r14 = (defpackage.v2a) r14
            android.widget.TextView r15 = r14.v
            ch r1 = r14.o
            r1.i(r15)
            android.view.View r14 = r14.w
            r1.j(r14)
        L_0x0100:
            return r0
        L_0x0101:
            android.view.WindowManager$LayoutParams r0 = r14.z0
            int r1 = r0.x
            r14.y = r1
            int r0 = r0.y
            r14.z = r0
            float r0 = r15.getRawX()
            r14.v0 = r0
            float r15 = r15.getRawY()
            r14.w0 = r15
        L_0x0117:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.video.widgets.FloatingVideoView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n0a n0a;
        a89 a89;
        l20 l20;
        if (this.B0 == null) {
            this.B0 = VelocityTracker.obtain();
        }
        this.B0.addMovement(motionEvent);
        this.B0.computeCurrentVelocity(1);
        float abs = Math.abs(this.B0.getYVelocity());
        if (motionEvent.getAction() == 2 || motionEvent.getAction() == 0 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6) {
            this.z0.x = this.y + ((int) (motionEvent.getRawX() - this.v0));
            this.z0.y = this.z + ((int) (motionEvent.getRawY() - this.w0));
            b(false);
            this.x.updateViewLayout(this, this.z0);
            if (abs <= 4.0f) {
                WindowManager.LayoutParams layoutParams = this.z0;
                if (layoutParams.y + layoutParams.height > this.v) {
                    zr5 zr5 = this.y0;
                    if (zr5 != null) {
                        ((smb) zr5).e(true);
                    }
                }
            }
            zr5 zr52 = this.y0;
            if (zr52 != null) {
                ((smb) zr52).e(false);
            }
        } else {
            this.v0 = -1.0f;
            this.w0 = -1.0f;
            VelocityTracker velocityTracker = this.B0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.B0 = null;
            }
            if (abs <= 4.0f) {
                WindowManager.LayoutParams layoutParams2 = this.z0;
                if (layoutParams2.y + layoutParams2.height > this.v) {
                    zr5 zr53 = this.y0;
                    if (zr53 != null) {
                        smb smb = (smb) zr53;
                        ys7 ys7 = smb.b;
                        if (ys7.get() != null) {
                            ((nd) ys7.get()).d(SystemClock.elapsedRealtime() - smb.H0, "ACTION_PIP_DURATION", (String) null);
                        }
                        j0a j0a = smb.z0;
                        if (!(j0a == null || (a89 = smb.E0) == null || (l20 = smb.D0) == null)) {
                            long h = j0a.h();
                            long e = smb.z0.e();
                            boolean c2 = smb.z0.c();
                            fa9 fa9 = smb.w;
                            fa9.getClass();
                            fa9.u(a89.a, l20.q, new ea9(h, e, c2));
                        }
                        smb.h(true);
                    }
                    return true;
                }
            }
            zr5 zr54 = this.y0;
            if (!(zr54 == null || (n0a = ((smb) zr54).C0) == null)) {
                v2a v2a = (v2a) n0a.a;
                TextView textView = v2a.v;
                ch chVar = v2a.o;
                chVar.g(textView);
                chVar.m(v2a.w).v(new ek8(1, v2a));
            }
            a();
        }
        return true;
    }

    public void setListener(zr5 zr5) {
        this.y0 = zr5;
    }

    @Keep
    public void setX(int i) {
        WindowManager.LayoutParams layoutParams = this.z0;
        layoutParams.x = i;
        this.x.updateViewLayout(this, layoutParams);
    }

    @Keep
    public void setY(int i) {
        WindowManager.LayoutParams layoutParams = this.z0;
        layoutParams.y = i;
        this.x.updateViewLayout(this, layoutParams);
    }
}
