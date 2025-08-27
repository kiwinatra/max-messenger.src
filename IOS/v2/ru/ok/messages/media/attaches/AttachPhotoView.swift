package ru.ok.messages.media.attaches;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.collections.CollectionsKt;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;

public class AttachPhotoView extends ZoomableDraweeView implements uz {
    public static final /* synthetic */ int S0 = 0;
    public final id3 E0 = ym.e();
    public final GestureDetector F0;
    public r00 G0;
    public final vz H0;
    public a89 I0;
    public l20 J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public qa7 N0;
    public boolean O0;
    public a32 P0;
    public gsd Q0;
    public final bpa R0;

    public AttachPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        GestureDetector gestureDetector = new GestureDetector(context, new q00(0, this));
        this.F0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        tp6 tp6 = new tp6(getResources());
        tp6.l = ydd.p;
        tp6.b = 0;
        setHierarchy(tp6.a());
        this.H0 = new vz(this, this);
        this.R0 = new bpa(4, ((qra) this.E0).A());
    }

    private Animatable getAnimatable() {
        if (getController() != null) {
            return ((m0) getController()).c();
        }
        return null;
    }

    public final void a(l20 l20) {
        s(d20.b);
    }

    public final void c(l20 l20) {
        eg6 k3;
        if (this.O0) {
            ((qra) this.E0).u().v(this.I0.a, l20);
        } else if (TextUtils.isEmpty(l20.b.z) || !TextUtils.isEmpty(l20.r) || getAnimatable() != null) {
            if (getAnimatable() == null) {
                setController(this.H0.c(getController(), true, false, false).a());
                r00 r00 = this.G0;
                if (r00 != null) {
                    ((FrgAttachPhoto) r00).t3(false);
                }
            } else if (getAnimatable().isRunning()) {
                getAnimatable().stop();
            } else {
                getAnimatable().start();
            }
            invalidate();
        } else {
            r00 r002 = this.G0;
            if (r002 != null) {
                FrgAttachPhoto frgAttachPhoto = (FrgAttachPhoto) r002;
                o0a o0a = frgAttachPhoto.K1;
                if (!(o0a == null || !o0a.a() || (k3 = frgAttachPhoto.h3()) == null)) {
                    ((ActAttachesView) k3).c();
                }
                frgAttachPhoto.u3(true);
            }
        }
    }

    public final void d(l20 l20) {
        if (!l20.n.e()) {
            s(d20.a);
        } else {
            setController(this.H0.c(getController(), true, false, ld8.g0(l20, this.I0)).a());
        }
    }

    public final void e(l20 l20) {
    }

    public final void f(l20 l20, a89 a89) {
        r00 r00 = this.G0;
        if (r00 != null) {
            FrgAttachPhoto frgAttachPhoto = (FrgAttachPhoto) r00;
            jqg A = frgAttachPhoto.q1.A();
            ha9 ha9 = frgAttachPhoto.C1.a;
            long j = ha9.z;
            CollectionsKt.emptyList();
            bk3 bk3 = bl4.o;
            A.a(new nud(j, CollectionsKt.listOf(Long.valueOf(ha9.b)), (z93) null, true, ha9.S0));
        }
    }

    public final boolean j(l20 l20) {
        return getAnimatable() != null && getAnimatable().isRunning();
    }

    public final void n(Throwable th) {
        super.n(th);
        z68.f("ru.ok.messages.media.attaches.AttachPhotoView", "Set photo attach failed, messageId " + this.I0.a.b, th);
        if (!(th instanceof NullPointerException)) {
            s(d20.o);
        }
    }

    public final void o(k97 k97) {
        boolean z;
        super.o(k97);
        if (k97 instanceof t33) {
            m5a.j((t33) k97, this.J0);
        }
        if (!ld8.T(this.J0)) {
            if (!this.J0.f() || TextUtils.isEmpty(this.J0.b.z)) {
                ba7 B = ld9.B();
                qa7 qa7 = this.N0;
                if (qa7 == null) {
                    B.getClass();
                    z = false;
                } else {
                    y33 y33 = B.f.get(B.h.e(qa7, (Object) null));
                    try {
                        z = y33.m0(y33);
                    } finally {
                        y33.U(y33);
                    }
                }
                if (z && !this.J0.n.c()) {
                    s(d20.c);
                    if (((qra) this.E0).y().c.g.getBoolean("app.media.save.to.gallery", false)) {
                        p00 p00 = new p00(0, this, k97);
                        rx0 rx0 = new rx0(23);
                        jbf H = ((qra) this.E0).H();
                        H.getClass();
                        jbd.a(p00, ((kbf) H).a(), (x6) null, rx0, (lfd) null);
                    }
                }
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vz vzVar = this.H0;
        if (vzVar != null) {
            vzVar.j();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vz vzVar = this.H0;
        if (vzVar != null) {
            jbd.c(vzVar.t);
        }
    }

    public final void onDraw(Canvas canvas) {
        gsd gsd;
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
        if (!this.J0.n.c()) {
            this.H0.b(canvas, getDrawable().getBounds(), this.O0);
        }
        if (this.O0 && (gsd = this.Q0) != null) {
            gsd.draw(canvas);
        }
    }

    public final void onMeasure(int i, int i2) {
        l20 l20;
        boolean W = ld8.W(this.J0);
        if (!this.K0 || (!this.J0.f() && !W)) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size <= 0 || size2 <= 0 || (l20 = this.J0) == null) {
            super.onMeasure(i, i2);
            return;
        }
        x10 x10 = W ? l20.j.d.b : l20.b;
        int[] B = iq.B(size, size2, x10.c, x10.o);
        setMeasuredDimension(B[0], B[1]);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        gsd gsd = this.Q0;
        if (gsd != null) {
            gsd.setBounds(0, 0, i, i2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.F0;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (!this.J0.n.c()) {
            return true;
        }
        if (this.J0.f() && this.J0.b.v) {
            return true;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(defpackage.l20 r8, defpackage.a89 r9) {
        /*
            r7 = this;
            l20 r0 = r7.J0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r3 = r8.q
            java.lang.String r0 = r0.q
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x001b
            l20 r0 = r7.J0
            d20 r0 = r0.n
            d20 r3 = r8.n
            if (r0 == r3) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = r2
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            l20 r3 = r7.J0
            boolean r3 = defpackage.ld8.g0(r3, r9)
            boolean r4 = defpackage.ld8.g0(r8, r9)
            if (r3 == r4) goto L_0x002a
            r3 = r1
            goto L_0x002b
        L_0x002a:
            r3 = r2
        L_0x002b:
            l20 r4 = r7.J0
            if (r4 == 0) goto L_0x0051
            d20 r5 = r8.n
            d20 r4 = r4.n
            if (r4 == r5) goto L_0x0051
            boolean r4 = r5.c()
            if (r4 == 0) goto L_0x0051
            l20 r4 = r7.J0
            boolean r4 = r4.f()
            if (r4 == 0) goto L_0x0051
            l20 r4 = r7.J0
            x10 r4 = r4.b
            java.lang.String r4 = r4.z
            boolean r4 = defpackage.cvg.A(r4)
            if (r4 != 0) goto L_0x0051
            r4 = r1
            goto L_0x0052
        L_0x0051:
            r4 = r2
        L_0x0052:
            if (r0 != 0) goto L_0x005b
            if (r4 != 0) goto L_0x005b
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r0 = r2
            goto L_0x005c
        L_0x005b:
            r0 = r1
        L_0x005c:
            r7.I0 = r9
            r7.J0 = r8
            vz r4 = r7.H0
            r5 = 0
            r4.u = r5
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r4 = r4.s
            if (r4 != 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            r4.setCorners(r5)
        L_0x006d:
            vz r4 = r7.H0
            a32 r5 = r7.P0
            r4.g(r8, r9, r5)
            vz r4 = r7.H0
            lv4 r5 = r7.getHierarchy()
            sp6 r5 = (defpackage.sp6) r5
            ydd r6 = defpackage.ydd.p
            r4.a(r5, r6)
            if (r0 == 0) goto L_0x0111
            l20 r0 = r7.J0
            boolean r9 = defpackage.ld8.g0(r0, r9)
            r7.O0 = r9
            vz r9 = r7.H0
            gv4 r0 = r7.getController()
            boolean r4 = r7.O0
            knb r9 = r9.c(r0, r2, r2, r4)
            boolean r0 = r7.O0
            if (r0 == 0) goto L_0x00b7
            gsd r0 = new gsd
            android.content.Context r4 = r7.getContext()
            r5 = 48
            int r5 = defpackage.vo4.b(r5)
            r0.<init>(r4, r5)
            r7.Q0 = r0
            int r4 = r7.getMeasuredWidth()
            int r5 = r7.getMeasuredHeight()
            r0.setBounds(r2, r2, r4, r5)
        L_0x00b7:
            android.content.Context r0 = r7.getContext()
            boolean r2 = r7.M0
            boolean r4 = r7.L0
            r1 = r1 ^ r4
            defpackage.ryg.c(r0, r8, r9, r2, r1)
            boolean r0 = r7.L0
            if (r0 == 0) goto L_0x00fb
            l20 r0 = r7.J0
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x00fb
            l20 r0 = r7.J0
            x10 r0 = r0.b
            java.lang.String r0 = r0.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00fb
            l20 r0 = r7.J0
            x10 r0 = r0.b
            java.lang.String r0 = r0.a
            kl0 r1 = defpackage.kl0.b
            jl0 r2 = defpackage.jl0.b
            java.lang.String r0 = defpackage.cjf.A(r0, r1, r2)
            java.lang.String r0 = defpackage.o5a.z(r0)
            android.net.Uri r0 = defpackage.po5.s(r0)
            ra7 r0 = defpackage.ra7.d(r0)
            qa7 r0 = r0.a()
            r9.f = r0
        L_0x00fb:
            java.lang.Object r0 = r9.e
            qa7 r0 = (defpackage.qa7) r0
            r7.N0 = r0
            jnb r9 = r9.a()
            r7.setController(r9)
            if (r3 == 0) goto L_0x0111
            boolean r9 = r7.O0
            if (r9 != 0) goto L_0x0111
            r7.c(r8)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AttachPhotoView.r(l20, a89):void");
    }

    public final void s(d20 d20) {
        a89 w = ((qra) this.E0).u().w(this.I0.a, this.J0.q, d20);
        this.I0 = w;
        r00 r00 = this.G0;
        int i = 0;
        if (r00 != null) {
            FrgAttachPhoto frgAttachPhoto = (FrgAttachPhoto) r00;
            if (frgAttachPhoto.h3() != null) {
                ((ActAttachesView) frgAttachPhoto.h3()).a0(w);
            }
            frgAttachPhoto.C1 = w;
            int i2 = 0;
            while (true) {
                if (i2 >= frgAttachPhoto.C1.a.x0.G()) {
                    break;
                } else if (frgAttachPhoto.C1.a.x0.F(i2).q.equals(frgAttachPhoto.D1.q)) {
                    frgAttachPhoto.D1 = frgAttachPhoto.C1.a.x0.F(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        while (true) {
            if (i >= this.I0.a.x0.G()) {
                i = -1;
                break;
            } else if (this.I0.a.x0.F(i).q.equals(this.J0.q)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            r(this.I0.a.x0.F(i), this.I0);
        }
    }

    public void setListener(r00 r00) {
        this.G0 = r00;
    }

    public void setWrapContentMeasure(boolean z) {
        l20 l20;
        this.K0 = z;
        boolean W = ld8.W(this.J0);
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0 || (l20 = this.J0) == null || (!l20.f() && !W)) {
            requestLayout();
            return;
        }
        x10 x10 = W ? this.J0.j.d.b : this.J0.b;
        int[] B = iq.B(getMeasuredWidth(), getMeasuredHeight(), x10.c, x10.o);
        int i = B[0] / 2;
        int i2 = B[1] / 2;
        layout((getMeasuredWidth() / 2) - i, (getMeasuredHeight() / 2) - i2, (getMeasuredWidth() / 2) + i, (getMeasuredHeight() / 2) + i2);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable instanceof r20) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
