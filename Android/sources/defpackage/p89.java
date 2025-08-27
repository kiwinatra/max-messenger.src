package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.sequences.SequencesKt;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.views.widgets.VideoInfoTextView;
import ru.ok.tamtam.util.HandledException;

/* renamed from: p89  reason: default package */
public class p89 extends ViewGroup implements GestureDetector.OnGestureListener, uz, dq7, i0a, s00, o23 {
    public static final Drawable W0 = iq.E(nad.s1, -1, ym.v);
    public static final int X0 = ((int) ym.v.getResources().getDimension(ydc.attach_drawable));
    public static final float Y0 = ym.v.getResources().getDimension(ydc.divider_item_collage);
    public w1 A0;
    public l20 B0;
    public TextPaint C0;
    public Paint D0;
    public TextPaint E0;
    public Paint F0;
    public boolean G0;
    public boolean H0;
    public boolean I0 = true;
    public View J0;
    public Drawable K0;
    public ju8 L0;
    public ju8 M0;
    public o20 N0;
    public iz O0;
    public bpa P0;
    public a32 Q0;
    public boolean R0;
    public gsd S0;
    public Drawable T0;
    public final dac U0 = new dac();
    public or7 V0;
    public id3 a;
    public ro4 b;
    public int c;
    public final qr0 o = new qr0();
    public po5 v;
    public l20 v0;
    public float[] w;
    public a89 w0;
    public List x;
    public l89 x0;
    public int y = 0;
    public m89 y0;
    public w28 z;
    public vs6 z0;

    public p89(Context context) {
        super(context);
        B();
    }

    public static boolean I(l20 l20, l20 l202) {
        d20 d20;
        d20 d202 = l202.n;
        d20 d203 = l20.n;
        return (d202 != d203 && !d203.c()) || (l20.f() && !TextUtils.isEmpty(l20.b.z) && l202.n != (d20 = l20.n) && d20.c());
    }

    private float[] getCornersForVideo() {
        float[] y2 = y(0);
        if (y2 != null) {
            for (int i = 0; i < y2.length; i++) {
                float f = y2[i];
                if (f > c44.DEFAULT_ASPECT_RATIO) {
                    y2[i] = f - ((float) this.b.a);
                }
            }
        }
        return y2;
    }

    public static void o(sp6 sp6, int i, int i2, int i3, boolean z2, boolean z3, boolean z4) {
        float f;
        float f2;
        ym ymVar = ym.v;
        ro4.b();
        float b2 = (float) vo4.b((int) 11.0f);
        float f3 = c44.DEFAULT_ASPECT_RATIO;
        if (i2 != 1) {
            float f4 = (i == 0 && z4 && i3 == 1) ? b2 : 0.0f;
            f2 = f4;
            if (i == 0 && z4 && f4 == c44.DEFAULT_ASPECT_RATIO) {
                f4 = b2;
            }
            if (i == 1 && i3 > 1 && !z2 && z4) {
                f2 = b2;
            }
            int i4 = i2 - 1;
            if (i == i4 && i3 == 1) {
                f = b2;
                f3 = f;
            } else {
                f = 0.0f;
            }
            if (i == i4 && i3 > 1) {
                f = b2;
            }
            if (i == i2 - 2 && !z3) {
                f3 = b2;
            }
            b2 = f4;
        } else if (z4) {
            f = b2;
            f3 = f;
            f2 = f3;
        } else {
            f = b2;
            f2 = 0.0f;
            b2 = 0.0f;
            f3 = f;
        }
        b9d a2 = b9d.a(b2, f2, f, f3);
        a2.h = true;
        sp6.n(a2);
    }

    /* access modifiers changed from: private */
    public void setCornersForCollage(List<m43> list) {
        for (int i = 0; i < list.size(); i++) {
            if (this.z.F(((n43) list.get(i).get(0)).c) != null) {
                N(list, i, ((n43) list.get(i).get(0)).c);
                if (list.get(i).size() > 1 && this.z.F(((n43) list.get(i).get(1)).c) != null) {
                    N(list, i, ((n43) list.get(i).get(1)).c);
                }
            }
        }
    }

    public final String A(int i) {
        return this.z.F(i).s ? fhf.b(getContext(), this.z.F(i)) : getContext().getString(qad.ga);
    }

    public final void B() {
        this.a = ym.e();
        getContext();
        this.b = ro4.b();
        this.v = ((qra) this.a).p();
        this.N0 = ((qra) this.a).h();
        this.O0 = (iz) ((sjd) tr1.h((qra) this.a)).getAccessor().g(iz.class);
        this.c = this.b.j;
        this.P0 = new bpa(4, ((qra) this.a).A());
        setWillNotDraw(false);
        setTransitionGroup(true);
        this.z0 = new vs6(getContext(), (GestureDetector.OnGestureListener) this);
        this.S0 = new gsd(getContext(), this.b.k);
        Drawable b2 = ew3.b(getContext(), nad.w1);
        this.T0 = b2;
        b2.setTint(-1);
    }

    public final void C(int i) {
        qr0 qr0 = this.o;
        Rect bounds = (i >= ((ArrayList) qr0.b).size() || ((ArrayList) qr0.b).size() <= 1) ? null : qr0.c(i).e().getBounds();
        if (bounds != null) {
            View view = new View(getContext());
            this.J0 = view;
            view.setLeft(bounds.left);
            this.J0.setTop(bounds.top);
            this.J0.setRight(bounds.right);
            this.J0.setBottom(bounds.bottom);
            addView(this.J0);
            return;
        }
        this.J0 = this;
    }

    public final boolean D() {
        l20 a2 = this.w0.a.a(g20.X);
        if (ld8.Y(a2) || ld8.W(a2)) {
            return true;
        }
        return TextUtils.isEmpty(this.w0.a.y) && this.w0.c == null && !this.G0 && !this.H0;
    }

    public final void D0() {
        post(new k89(this, 1));
    }

    public final boolean E() {
        l20 I = this.z.I(g20.c);
        l20 I2 = this.z.I(g20.o);
        return ((I != null && I.b.y > 0) || (I2 != null && I2.d.a > 0)) && this.w0.a.v();
    }

    public final boolean F(l20 l20) {
        boolean isEmpty = TextUtils.isEmpty(l20.b.X);
        x10 x10 = l20.b;
        File n = !isEmpty ? this.v.n(x10.X) : null;
        if (n == null || !n.exists()) {
            n = this.v.k(x10.y);
        }
        return l20.n.c() && n.exists();
    }

    public final boolean G(int i) {
        return !this.z.F(i).s && (this.z.F(i).a == g20.c || this.z.F(i).a == g20.o);
    }

    public final boolean H(l20 l20) {
        if ((this.z.G() <= 1 && this.I0 && !this.w0.a.v()) || this.x0 == null) {
            return false;
        }
        C(w(l20));
        this.x0.b(l20, this.J0);
        return true;
    }

    public final boolean J() {
        return (!((qra) this.a).t().v() || this.w0 == null || ((qra) this.a).l().G(this.w0.a.z) == null) ? false : true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [e2a, w1] */
    /* JADX WARNING: type inference failed for: r0v5, types: [e2a, w1] */
    public final void K() {
        if (this.A0 != null) {
            if (this.z.G() == 1) {
                this.A0.o().measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            } else {
                this.A0.o().measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() / 2, 1073741824));
            }
        }
    }

    public final void L(int i) {
        if (this.x0 != null) {
            C(i);
            l20 F = this.z.F(i);
            if (this.z.G() != 1 || !F.i()) {
                this.x0.b(this.z.F(i), this.J0);
            } else {
                e(F);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [e2a, w1] */
    /* JADX WARNING: type inference failed for: r0v3, types: [e2a, w1] */
    public final void M() {
        if (this.A0 != null) {
            z68.c("p89", "removeVideoView: ", new Object[0]);
            this.A0.I(false);
            removeView(this.A0.o());
            this.A0 = null;
            P();
            this.v0 = null;
            this.B0 = null;
            requestLayout();
        }
    }

    public final void N(List list, int i, int i2) {
        lv4 lv4 = v(this.w0, i2, this.z.F(i2)).o;
        lv4.getClass();
        o((sp6) lv4, i2, this.z.G(), ((m43) list.get(i)).size(), ((m43) list.get(0)).size() == 1, ((m43) a81.i(1, list)).size() == 1, D());
    }

    public final void O(l20 l20, wz wzVar, boolean z2) {
        gv4 gv4 = wzVar.v;
        boolean g0 = ld8.g0(l20, this.w0);
        this.R0 = g0;
        knb c2 = wzVar.x.c(gv4, z2, true, g0);
        ryg.c(getContext(), l20, c2, ryg.j0(this.z), false);
        if (l20.a == g20.c || ld8.W(l20)) {
            c2.h = new n89(this, this.w0, l20);
        } else {
            this.R0 = false;
        }
        if (this.w0.a.v()) {
            ryg.b(c2);
            c2.j = false;
        }
        wzVar.i(c2.a());
    }

    public final void P() {
        int w2;
        m89 m89;
        if (!(this.v0 == null || (m89 = this.y0) == null)) {
            ((gg9) m89).E0.setVisibility(0);
        }
        l20 l20 = this.v0;
        if (l20 != null && (w2 = w(l20)) >= 0) {
            vz vzVar = ((wz) this.o.c(w2)).x;
            vzVar.o = true;
            VideoInfoTextView videoInfoTextView = vzVar.m;
            if (videoInfoTextView != null) {
                videoInfoTextView.setVisibility(0);
            }
            VideoPlayerSeekBar videoPlayerSeekBar = vzVar.n;
            if (videoPlayerSeekBar != null) {
                videoPlayerSeekBar.setVisibility(0);
            }
            if (vzVar.s != null && ld8.y0(((qra) ym.e()).y(), vzVar.i)) {
                vzVar.s.setVisibility(0);
            }
        }
    }

    public final void Q(String str) {
        M();
        gsg.v(getContext(), str);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [e2a, w1] */
    public final void R() {
        if (this.A0 != null) {
            z68.c("p89", "switchVideoToFullScreen", new Object[0]);
            this.A0.u();
            l89 l89 = this.x0;
            if (l89 != null) {
                l89.b(this.B0, this);
            }
            y64.C(((qra) this.a).d().a.b(), new k89(this, 1));
        }
    }

    public final void S(a89 a89, l20 l20, d20 d20, boolean z2) {
        if (w(l20) >= 0) {
            a89 w2 = ((qra) this.a).u().w(a89.a, l20.q, d20);
            if (z2) {
                p(w2);
            }
        }
    }

    public final void W0(Throwable th) {
        M();
        hi7.b0(0, getContext(), fhf.f(getContext(), th));
    }

    public final void a(l20 l20) {
        S(this.w0, l20, d20.b, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.l20 r8) {
        /*
            r7 = this;
            boolean r0 = r7.R0
            if (r0 == 0) goto L_0x0014
            id3 r0 = r7.a
            qra r0 = (defpackage.qra) r0
            fa9 r0 = r0.u()
            a89 r7 = r7.w0
            ha9 r7 = r7.a
            r0.v(r7, r8)
            return
        L_0x0014:
            int r0 = r7.w(r8)
            if (r0 < 0) goto L_0x0122
            qr0 r1 = r7.o
            java.lang.Object r2 = r1.b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            if (r2 <= r0) goto L_0x0122
            x10 r2 = r8.b
            java.lang.String r2 = r2.z
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            r4 = 0
            java.lang.String r5 = r8.r
            if (r2 != 0) goto L_0x0042
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L_0x0042
            android.graphics.drawable.Animatable r2 = r7.u(r0)
            if (r2 != 0) goto L_0x0042
            r2 = r3
            goto L_0x0043
        L_0x0042:
            r2 = r4
        L_0x0043:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0055
            int r6 = defpackage.cjf.g
            java.lang.String r6 = ".mp4"
            boolean r5 = r5.endsWith(r6)
            if (r5 == 0) goto L_0x0055
            r5 = r3
            goto L_0x0056
        L_0x0055:
            r5 = r4
        L_0x0056:
            if (r2 != 0) goto L_0x00be
            if (r5 == 0) goto L_0x005b
            goto L_0x00be
        L_0x005b:
            android.graphics.drawable.Animatable r2 = r7.u(r0)
            mv4 r1 = r1.c(r0)
            if (r2 == 0) goto L_0x00b2
            boolean r3 = r2.isRunning()
            if (r3 == 0) goto L_0x00ae
            r2.stop()
            r2 = r1
            wz r2 = (defpackage.wz) r2
            vz r2 = r2.x
            float[] r3 = r7.getCornersForVideo()
            r2.u = r3
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r5 = r2.s
            if (r5 != 0) goto L_0x007e
            goto L_0x0081
        L_0x007e:
            r5.setCorners(r3)
        L_0x0081:
            w28 r3 = r7.z
            l20 r3 = r3.F(r0)
            a89 r5 = r7.w0
            a32 r6 = r7.Q0
            r2.g(r3, r5, r6)
            lv4 r3 = r1.o
            r3.getClass()
            sp6 r3 = (defpackage.sp6) r3
            ydd r5 = defpackage.ydd.m
            r2.a(r3, r5)
            w28 r2 = r7.z
            l20 r0 = r2.F(r0)
            wz r1 = (defpackage.wz) r1
            r7.O(r0, r1, r4)
            l89 r0 = r7.x0
            if (r0 == 0) goto L_0x0122
            r0.b(r8, r7)
            goto L_0x0122
        L_0x00ae:
            r2.start()
            goto L_0x0122
        L_0x00b2:
            w28 r8 = r7.z
            l20 r8 = r8.F(r0)
            wz r1 = (defpackage.wz) r1
            r7.O(r8, r1, r3)
            goto L_0x0122
        L_0x00be:
            a89 r0 = r7.w0
            ha9 r0 = r0.a
            boolean r0 = r0.v()
            if (r0 == 0) goto L_0x00ce
            l89 r0 = r7.x0
            r0.b(r8, r7)
            goto L_0x0122
        L_0x00ce:
            boolean r0 = r7.F(r8)
            if (r0 == 0) goto L_0x011f
            boolean r0 = r7.H(r8)
            if (r0 != 0) goto L_0x0122
            boolean r0 = r8.s
            if (r0 == 0) goto L_0x00df
            goto L_0x0122
        L_0x00df:
            r7.M()
            u3a r0 = new u3a
            android.content.Context r1 = r7.getContext()
            float[] r2 = r7.getCornersForVideo()
            r0.<init>(r1, r2)
            o0a r1 = new o0a
            ju8 r2 = r7.M0
            po5 r3 = r7.v
            r1.<init>(r0, r2, r3, r7)
            r7.A0 = r1
            android.view.View r0 = r1.o()
            r7.addView(r0)
            r7.B0 = r8
            w1 r7 = r7.A0
            o0a r7 = (defpackage.o0a) r7
            sr6 r0 = new sr6
            ln5 r1 = r7.c
            r0.<init>(r1, r8)
            r7.v = r0
            ju8 r8 = r7.b
            m48 r8 = (defpackage.m48) r8
            r8.t(r0, r7)
            f2a r8 = r7.a
            o4a r8 = (defpackage.o4a) r8
            r8.i(r7)
            goto L_0x0122
        L_0x011f:
            r7.r(r8)
        L_0x0122:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p89.c(l20):void");
    }

    public final void d(l20 l20) {
        if (!l20.n.e()) {
            S(this.w0, l20, d20.a, true);
            return;
        }
        int w2 = w(l20);
        if (w2 >= 0) {
            qr0 qr0 = this.o;
            if (((ArrayList) qr0.b).size() > w2) {
                O(l20, (wz) qr0.c(w2), true);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [e2a, w1] */
    /* JADX WARNING: type inference failed for: r0v5, types: [e2a, w1] */
    /* JADX WARNING: type inference failed for: r1v6, types: [e2a, w1] */
    /* JADX WARNING: type inference failed for: r1v7, types: [e2a, w1] */
    /* JADX WARNING: type inference failed for: r1v8, types: [e2a, w1] */
    public final void d0() {
        Context context = getContext();
        String[] strArr = n54.c;
        if (context == null ? false : Settings.canDrawOverlays(context)) {
            ? r0 = this.A0;
            if (r0 != 0 && this.v0 != null) {
                View o2 = r0.o();
                Rect rect = rcg.a;
                rcg.d(rect, o2);
                this.A0.Q();
                this.Q0 = ((qra) this.a).l().G(this.w0.a.z);
                j10 j = this.v0.j();
                kr7.M(j, this.A0.h(), this.A0.e(), this.A0.c());
                this.v0 = j.a();
                ((qra) this.a).t().X.f(getContext(), this.Q0, this.w0, this.v0, rect, true);
                P();
                M();
                return;
            }
            return;
        }
        z68.f("p89", "Pip request listener is null", (Throwable) null);
    }

    /* JADX WARNING: type inference failed for: r0v55, types: [e2a, w1] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (android.text.TextUtils.equals(r15.q, r14.v0.q) != false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.l20 r19) {
        /*
            r18 = this;
            r14 = r18
            r15 = r19
            l20 r0 = r14.v0
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            boolean r0 = r18.H(r19)
            r13 = 0
            if (r0 != 0) goto L_0x002a
            boolean r0 = r15.s
            if (r0 == 0) goto L_0x0015
            goto L_0x002a
        L_0x0015:
            id3 r0 = r14.a
            qra r0 = (defpackage.qra) r0
            ltb r0 = r0.y()
            boolean r0 = defpackage.ld8.b0(r0, r15)
            if (r0 == 0) goto L_0x002d
            l89 r0 = r14.x0
            if (r0 == 0) goto L_0x002a
            r0.b(r15, r14)
        L_0x002a:
            r7 = r15
            goto L_0x015d
        L_0x002d:
            l20 r0 = r14.v0
            if (r0 == 0) goto L_0x0048
            w1 r0 = r14.A0
            if (r0 == 0) goto L_0x0048
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0048
            l20 r0 = r14.v0
            java.lang.String r0 = r0.q
            java.lang.String r1 = r15.q
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x0048
            goto L_0x002a
        L_0x0048:
            r18.M()
            boolean r0 = defpackage.ld8.Y(r19)
            if (r0 == 0) goto L_0x0058
            s10 r0 = r15.j
            l20 r0 = r0.d
            k20 r0 = r0.d
            goto L_0x005a
        L_0x0058:
            k20 r0 = r15.d
        L_0x005a:
            id3 r1 = r14.a
            qra r1 = (defpackage.qra) r1
            r62 r1 = r1.l()
            a89 r2 = r14.w0
            ha9 r2 = r2.a
            long r2 = r2.z
            a32 r1 = r1.G(r2)
            if (r1 != 0) goto L_0x0070
            r1 = 1
            goto L_0x0071
        L_0x0070:
            r1 = r13
        L_0x0071:
            if (r1 == 0) goto L_0x008a
            n2a r0 = new n2a
            android.content.Context r1 = r18.getContext()
            id3 r2 = r14.a
            qra r2 = (defpackage.qra) r2
            ch r2 = r2.d()
            float[] r3 = r18.getCornersForVideo()
            r0.<init>(r1, r2, r3)
        L_0x0088:
            r1 = r0
            goto L_0x00c0
        L_0x008a:
            boolean r1 = r18.J()
            if (r1 == 0) goto L_0x00aa
            boolean r0 = r0.n
            if (r0 != 0) goto L_0x00aa
            h2a r0 = new h2a
            android.content.Context r1 = r18.getContext()
            id3 r2 = r14.a
            qra r2 = (defpackage.qra) r2
            ch r2 = r2.d()
            float[] r3 = r18.getCornersForVideo()
            r0.<init>(r1, r2, r3)
            goto L_0x0088
        L_0x00aa:
            g4a r0 = new g4a
            android.content.Context r1 = r18.getContext()
            id3 r2 = r14.a
            qra r2 = (defpackage.qra) r2
            ch r2 = r2.d()
            float[] r3 = r18.getCornersForVideo()
            r0.<init>(r1, r2, r3)
            goto L_0x0088
        L_0x00c0:
            j0a r12 = new j0a
            ju8 r2 = r14.L0
            id3 r0 = r14.a
            qra r0 = (defpackage.qra) r0
            p8g r3 = r0.K()
            id3 r0 = r14.a
            qra r0 = (defpackage.qra) r0
            jbf r4 = r0.H()
            id3 r0 = r14.a
            qra r0 = (defpackage.qra) r0
            q4 r0 = r0.getAccessor()
            java.lang.Class<ys7> r5 = defpackage.ys7.class
            java.lang.Object r0 = r0.g(r5)
            r5 = r0
            ys7 r5 = (defpackage.ys7) r5
            o20 r6 = r14.N0
            id3 r0 = r14.a
            qra r0 = (defpackage.qra) r0
            fa9 r7 = r0.u()
            id3 r0 = r14.a
            qra r0 = (defpackage.qra) r0
            ltb r8 = r0.y()
            id3 r0 = r14.a
            qra r0 = (defpackage.qra) r0
            m95 r10 = r0.o()
            id3 r0 = r14.a
            qra r0 = (defpackage.qra) r0
            hn4 r11 = r0.n()
            r16 = 1
            r17 = 0
            r0 = r12
            r9 = r18
            r15 = r12
            r12 = r16
            r13 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A0 = r15
            android.view.View r0 = r15.o()
            r14.addView(r0)
            r7 = r19
            r14.v0 = r7
            r14.B0 = r7
            id3 r0 = r14.a
            qra r0 = (defpackage.qra) r0
            r62 r0 = r0.l()
            a89 r1 = r14.w0
            ha9 r1 = r1.a
            long r1 = r1.z
            a32 r0 = r0.G(r1)
            r14.Q0 = r0
            if (r0 == 0) goto L_0x0141
            m72 r0 = r0.b
            long r0 = r0.a
        L_0x013f:
            r2 = r0
            goto L_0x0144
        L_0x0141:
            r0 = 0
            goto L_0x013f
        L_0x0144:
            boolean r0 = r18.J()
            if (r0 == 0) goto L_0x014d
            r0 = 3
        L_0x014b:
            r5 = r0
            goto L_0x014f
        L_0x014d:
            r0 = 2
            goto L_0x014b
        L_0x014f:
            w1 r0 = r14.A0
            j0a r0 = (defpackage.j0a) r0
            a89 r1 = r14.w0
            ha9 r4 = r1.a
            r6 = 1
            r1 = r19
            r0.W(r1, r2, r4, r5, r6)
        L_0x015d:
            boolean r0 = r18.J()
            if (r0 == 0) goto L_0x017f
            id3 r0 = r14.a
            qra r0 = (defpackage.qra) r0
            fa9 r0 = r0.u()
            a89 r1 = r14.w0
            ha9 r1 = r1.a
            r0.getClass()
            java.lang.String r2 = r7.q
            vz0 r3 = new vz0
            r4 = 11
            r5 = 0
            r3.<init>(r5, r4)
            r0.u(r1, r2, r3)
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p89.e(l20):void");
    }

    public final void f(l20 l20, a89 a89) {
        sjd sjd = (sjd) tr1.h((qra) this.a);
        sjd.r().a(a89, l20.q, (rf9) sjd.getAccessor().g(rf9.class));
    }

    public List<View> getClickableChildren() {
        return SequencesKt.toList(SequencesKt.filter(cjf.x(this), new wg7(18)));
    }

    public final void h() {
        invalidate();
    }

    public final boolean j(l20 l20) {
        int w2 = w(l20);
        if (w2 < 0) {
            return false;
        }
        qr0 qr0 = this.o;
        return ((ArrayList) qr0.b).size() > w2 && qr0.c(w2).v != null && ((m0) qr0.c(w2).v).c() != null && ((m0) qr0.c(w2).v).c().isRunning();
    }

    public final void j0() {
        R();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [e2a, w1] */
    public final void m() {
        if (this.A0 != null) {
            if (!J()) {
                ? r0 = this.A0;
                if ((r0 instanceof j0a) && !r0.w0.a) {
                    r0.G(true);
                    return;
                }
            }
            R();
        }
    }

    public final void m1() {
    }

    public final void n() {
        int w2 = this.z.G() == 1 ? 0 : w(this.v0);
        l89 l89 = this.x0;
        this.z.F(w2);
        l89.a();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o.p();
        this.N0.g.add(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qr0 qr0 = this.o;
        qr0.q();
        for (int i = 0; i < ((ArrayList) qr0.b).size(); i++) {
            jbd.c(((wz) qr0.c(i)).x.t);
        }
        M();
        this.N0.g.remove(this);
        or7 or7 = this.V0;
        if (or7 != null) {
            qq4.a(or7);
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onDraw(Canvas canvas) {
        gsd gsd;
        Canvas canvas2 = canvas;
        int G = this.z.G();
        qr0 qr0 = this.o;
        if (G != 1) {
            for (m43 it : this.x) {
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    n43 n43 = (n43) it2.next();
                    if (this.z.F(n43.c) != null) {
                        int i = n43.c;
                        boolean G2 = G(i);
                        Rect rect = n43.d;
                        if (!G2) {
                            s(canvas, A(i), rect.left, rect.top, rect.right, rect.bottom, n43.c);
                        } else {
                            z7d e = qr0.c(i).e();
                            if (e != null) {
                                e.setBounds(rect.left, rect.top, rect.right, rect.bottom);
                                e.draw(canvas2);
                                boolean g0 = ld8.g0(this.z.F(i), this.w0);
                                if (g0) {
                                    int i2 = rect.left;
                                    int intrinsicWidth = this.T0.getIntrinsicWidth();
                                    int i3 = n43.a;
                                    int i4 = ((i3 - intrinsicWidth) / 2) + i2;
                                    int i5 = rect.top;
                                    int intrinsicHeight = this.T0.getIntrinsicHeight();
                                    int i6 = n43.b;
                                    this.T0.setBounds(i4, ((i6 - intrinsicHeight) / 2) + i5, rect.right - ((i3 - this.T0.getIntrinsicWidth()) / 2), rect.bottom - ((i6 - this.T0.getIntrinsicHeight()) / 2));
                                    this.T0.draw(canvas2);
                                }
                                if (!E()) {
                                    ((wz) qr0.c(i)).x.b(canvas2, e.getBounds(), g0);
                                }
                            }
                        }
                    }
                }
            }
        } else if (G(0) || ((!this.z.F(0).s && ld8.Y(this.z.F(0))) || (!this.z.F(0).s && ld8.W(this.z.F(0))))) {
            z7d e2 = qr0.c(0).e();
            if (e2 != null) {
                e2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                e2.draw(canvas2);
                if (this.R0 && (gsd = this.S0) != null) {
                    gsd.draw(canvas2);
                }
                if (!E()) {
                    ((wz) qr0.c(0)).x.b(canvas2, e2.getBounds(), this.R0);
                }
            }
        } else {
            s(canvas, A(0), 0, 0, getMeasuredWidth(), getMeasuredHeight(), 0);
        }
        if (E()) {
            if (this.F0 == null) {
                Paint paint = new Paint();
                this.F0 = paint;
                Context context = getContext();
                Lazy lazy = scf.b0;
                paint.setColor(j4b.k0(context).s);
                this.F0.setStyle(Paint.Style.FILL);
                this.F0.setAntiAlias(true);
            }
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            float f = (float) measuredWidth;
            float f2 = (float) measuredHeight;
            canvas2.drawCircle(f, f2, ((float) X0) / 2.0f, this.F0);
            if (this.w0.a.L0 == 0) {
                if (this.E0 == null) {
                    TextPaint textPaint = new TextPaint();
                    this.E0 = textPaint;
                    textPaint.setTextSize(getContext().getResources().getDimension(mad.b));
                    TextPaint textPaint2 = this.E0;
                    Context context2 = getContext();
                    Lazy lazy2 = scf.b0;
                    textPaint2.setColor(j4b.k0(context2).u);
                    this.E0.setTypeface(Typeface.DEFAULT);
                    this.E0.setTextAlign(Paint.Align.CENTER);
                    this.E0.setAntiAlias(true);
                }
                canvas2.drawText(fhf.e(this.w0.a.K0, getContext()), f, (float) ((int) (f2 - ((this.E0.ascent() + this.E0.descent()) / 2.0f))), this.E0);
                return;
            }
            if (this.K0 == null) {
                Drawable b2 = ew3.b(getContext(), nad.f2);
                this.K0 = b2;
                Context context3 = getContext();
                Lazy lazy3 = scf.b0;
                b2.setColorFilter(j4b.k0(context3).u, PorterDuff.Mode.SRC_IN);
            }
            Drawable drawable = this.K0;
            if (drawable != null) {
                int intrinsicWidth2 = drawable.getIntrinsicWidth() / 2;
                int intrinsicHeight2 = this.K0.getIntrinsicHeight() / 2;
                this.K0.setBounds(measuredWidth - intrinsicWidth2, measuredHeight - intrinsicHeight2, measuredWidth + intrinsicWidth2, measuredHeight + intrinsicHeight2);
                this.K0.draw(canvas2);
            }
        }
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.o.p();
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [e2a, w1] */
    /* JADX WARNING: type inference failed for: r1v8, types: [e2a, w1] */
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        if (this.A0 != null && this.B0 != null) {
            if (this.z.G() == 1) {
                this.A0.o().layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            int measuredWidth = getMeasuredWidth() / 2;
            int w2 = w(this.B0);
            int i5 = (w2 % 2) * measuredWidth;
            int i6 = (w2 / 2) * measuredWidth;
            this.A0.o().layout(i5, i6, i5 + measuredWidth, measuredWidth + i6);
        }
    }

    public final void onLongPress(MotionEvent motionEvent) {
        qw6.VIRTUAL_KEY.e(this);
        if (this.x0 != null) {
            int x2 = this.z.G() == 1 ? 0 : x(motionEvent);
            if (x2 < this.z.G()) {
                l89 l89 = this.x0;
                this.z.F(x2);
                l89.a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x013e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            w28 r1 = r0.z
            if (r1 == 0) goto L_0x0245
            int r1 = r1.G()
            if (r1 != 0) goto L_0x000e
            goto L_0x0245
        L_0x000e:
            w28 r1 = r0.z
            int r1 = r1.G()
            r2 = 1
            qr0 r3 = r0.o
            r4 = 0
            if (r1 != r2) goto L_0x0062
            super.onMeasure(r25, r26)
            w28 r1 = r0.z
            l20 r1 = r1.F(r4)
            g20 r1 = r1.a
            g20 r2 = defpackage.g20.c
            if (r1 == r2) goto L_0x004d
            w28 r1 = r0.z
            l20 r1 = r1.F(r4)
            g20 r1 = r1.a
            g20 r2 = defpackage.g20.o
            if (r1 == r2) goto L_0x004d
            w28 r1 = r0.z
            l20 r1 = r1.F(r4)
            boolean r1 = defpackage.ld8.Y(r1)
            if (r1 != 0) goto L_0x004d
            w28 r1 = r0.z
            l20 r1 = r1.F(r4)
            boolean r1 = defpackage.ld8.W(r1)
            if (r1 == 0) goto L_0x0248
        L_0x004d:
            mv4 r1 = r3.c(r4)
            wz r1 = (defpackage.wz) r1
            vz r1 = r1.x
            int r2 = r24.getMeasuredWidth()
            int r3 = r24.getMeasuredHeight()
            r1.e(r2, r3)
            goto L_0x0248
        L_0x0062:
            int r1 = android.view.View.MeasureSpec.getSize(r25)
            int r5 = r0.y
            int r5 = java.lang.Math.max(r5, r4)
            r0.setMeasuredDimension(r1, r5)
            java.util.List r1 = r0.x
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x01fa
            float[] r1 = r0.w
            int r5 = r24.getMeasuredWidth()
            m43 r6 = new m43
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = r1[r4]
            float r5 = (float) r5
            r9 = 1058642330(0x3f19999a, float:0.6)
            float r9 = r9 * r5
            r10 = 1055286886(0x3ee66666, float:0.45)
            float r10 = r10 * r5
            float r8 = r10 / r8
            int r11 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x009a
            r8 = r9
            goto L_0x009f
        L_0x009a:
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x009f
            r8 = r10
        L_0x009f:
            int r8 = java.lang.Math.round(r8)
            float r8 = (float) r8
            r11 = r4
            r12 = r11
            r13 = r12
            r15 = r13
            r14 = 0
        L_0x00a9:
            int r2 = r1.length
            float r4 = Y0
            if (r12 >= r2) goto L_0x01dc
            r2 = r1[r12]
            float r2 = r2 * r8
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            r17 = 0
            r18 = r1[r17]
            r19 = 1065353216(0x3f800000, float:1.0)
            int r18 = (r18 > r19 ? 1 : (r18 == r19 ? 0 : -1))
            if (r18 <= 0) goto L_0x00c7
            if (r12 != 0) goto L_0x00c7
            r26 = r8
            r18 = 1
            goto L_0x00cb
        L_0x00c7:
            r26 = r8
            r18 = 0
        L_0x00cb:
            int r8 = r1.length
            r16 = 1
            int r8 = r8 + -1
            r19 = r3
            if (r12 != r8) goto L_0x00d7
            r8 = r16
            goto L_0x00d8
        L_0x00d7:
            r8 = 0
        L_0x00d8:
            if (r18 != 0) goto L_0x012a
            if (r8 == 0) goto L_0x00dd
            goto L_0x012a
        L_0x00dd:
            int r8 = r12 + 1
            int r3 = r1.length
            int r3 = r3 + -1
            if (r8 > r3) goto L_0x00fc
            r3 = r1[r12]
            r8 = r1[r8]
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x00fc
            int r3 = r6.size()
            if (r3 != 0) goto L_0x00fc
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r5 / r2
        L_0x00f6:
            r8 = r26
            r18 = r5
            r3 = 0
            goto L_0x0137
        L_0x00fc:
            float r3 = r5 - r14
            float r8 = r3 - r2
            r18 = 1053609165(0x3ecccccd, float:0.4)
            float r18 = r18 * r5
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 >= 0) goto L_0x011e
        L_0x0109:
            float r8 = r3 - r2
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 >= 0) goto L_0x00f6
            r8 = 1063675494(0x3f666666, float:0.9)
            float r2 = r2 * r8
            int r8 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r8 > 0) goto L_0x0109
            r8 = r26
            r2 = r3
        L_0x011a:
            r18 = r5
            r3 = 1
            goto L_0x0137
        L_0x011e:
            int r3 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r3 >= 0) goto L_0x00f6
            r8 = r26
            r2 = r18
            r3 = 0
            r18 = r5
            goto L_0x0137
        L_0x012a:
            if (r18 == 0) goto L_0x0132
            int r2 = r1.length
            r3 = 3
            if (r2 <= r3) goto L_0x0132
            r8 = r9
            goto L_0x0134
        L_0x0132:
            r8 = r26
        L_0x0134:
            float r2 = r5 - r14
            goto L_0x011a
        L_0x0137:
            int r5 = r6.size()
            r0 = 1
            if (r5 != r0) goto L_0x0143
            if (r3 != 0) goto L_0x0143
            r16 = r0
            goto L_0x0145
        L_0x0143:
            r16 = r3
        L_0x0145:
            n43 r3 = new n43
            int r5 = java.lang.Math.round(r2)
            int r0 = java.lang.Math.round(r8)
            r20 = r9
            android.graphics.Rect r9 = new android.graphics.Rect
            int r21 = java.lang.Math.round(r2)
            r22 = r10
            int r10 = r21 + r11
            int r21 = java.lang.Math.round(r8)
            r23 = r1
            int r1 = r21 + r15
            r9.<init>(r11, r15, r10, r1)
            r3.<init>(r5, r0, r12, r9)
            float r0 = r2 + r4
            int r0 = (int) r0
            int r11 = r11 + r0
            r6.add(r3)
            int r0 = r6.size()
            r1 = 3
            if (r0 != r1) goto L_0x019d
            java.util.Locale r0 = java.util.Locale.UK
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r14)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r16)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "Three items in Collage in one row. PossibleWidth: %f, RowWidth: %f, ShouldCompleteRow: %b"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            r3 = 0
            java.lang.String r9 = "CollageHelper"
            defpackage.z68.n(r9, r3, r0, r2)
            goto L_0x019e
        L_0x019d:
            r1 = 0
        L_0x019e:
            float r0 = (float) r5
            float r0 = r0 + r4
            float r0 = r0 + r14
            if (r16 == 0) goto L_0x01ca
            float r8 = r8 + r4
            int r0 = (int) r8
            int r15 = r15 + r0
            r7.add(r6)
            int r13 = r13 + r0
            r0 = r23[r12]
            float r10 = r22 / r0
            int r0 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b5
            r10 = r20
            goto L_0x01bb
        L_0x01b5:
            int r0 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x01bb
            r10 = r22
        L_0x01bb:
            int r0 = java.lang.Math.round(r10)
            float r0 = (float) r0
            m43 r2 = new m43
            r2.<init>()
            r8 = r0
            r11 = r1
            r6 = r2
            r14 = 0
            goto L_0x01cb
        L_0x01ca:
            r14 = r0
        L_0x01cb:
            int r12 = r12 + 1
            r0 = r24
            r4 = r1
            r5 = r18
            r3 = r19
            r9 = r20
            r10 = r22
            r1 = r23
            goto L_0x00a9
        L_0x01dc:
            r19 = r3
            r1 = 0
            int r0 = (int) r4
            int r13 = r13 - r0
            r0 = r24
            r0.x = r7
            r0.y = r13
            int r2 = r24.getMeasuredWidth()
            int r3 = r0.y
            r0.setMeasuredDimension(r2, r3)
            k89 r2 = new k89
            r3 = 0
            r2.<init>(r0, r3)
            r0.post(r2)
            goto L_0x01fd
        L_0x01fa:
            r19 = r3
            r1 = r4
        L_0x01fd:
            r2 = r1
        L_0x01fe:
            java.util.List r3 = r0.x
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x0248
            java.util.List r3 = r0.x
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = r1
        L_0x020f:
            int r5 = r3.size()
            if (r4 >= r5) goto L_0x0240
            java.lang.Object r5 = r3.get(r4)
            n43 r5 = (defpackage.n43) r5
            int r6 = r5.c
            r7 = r19
            java.lang.Object r8 = r7.b
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r8 = r8.size()
            if (r6 < r8) goto L_0x022a
            goto L_0x023b
        L_0x022a:
            int r6 = r5.c
            mv4 r6 = r7.c(r6)
            wz r6 = (defpackage.wz) r6
            vz r6 = r6.x
            int r8 = r5.a
            int r5 = r5.b
            r6.e(r8, r5)
        L_0x023b:
            int r4 = r4 + 1
            r19 = r7
            goto L_0x020f
        L_0x0240:
            r7 = r19
            int r2 = r2 + 1
            goto L_0x01fe
        L_0x0245:
            super.onMeasure(r25, r26)
        L_0x0248:
            r24.K()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p89.onMeasure(int, int):void");
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.z.G() != 0) {
            int x2 = this.z.G() == 1 ? 0 : x(motionEvent);
            if (x2 < this.z.G()) {
                qr0 qr0 = this.o;
                if (x2 < ((ArrayList) qr0.b).size()) {
                    z7d e = qr0.c(x2).e();
                    if (!((wz) qr0.c(x2)).x.f(e.getBounds().centerX(), e.getBounds().centerY(), motionEvent)) {
                        this.U0.d(Integer.valueOf(x2));
                    }
                }
            }
        }
        return true;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        gsd gsd = this.S0;
        if (gsd != null) {
            gsd.setBounds(0, 0, i, i2);
        }
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.o.q();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.z0.b).onTouchEvent(motionEvent);
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0 && this.A0 != null) {
            M();
        }
    }

    public void p(a89 a89) {
        float[] fArr;
        a32 a32;
        k20 k20;
        int i;
        int i2;
        x10 x10;
        bia z2 = this.U0.z(1000, TimeUnit.MILLISECONDS);
        td8 td8 = new td8(11, this);
        ekd ekd = m58.g;
        dj6 dj6 = m58.e;
        or7 or7 = new or7(td8, ekd, dj6);
        z2.a(or7);
        this.V0 = or7;
        View view = this.J0;
        if (view != null && !view.equals(this)) {
            removeView(this.J0);
            this.J0 = null;
        }
        a89 a892 = this.w0;
        w28 w28 = a89.a.x0;
        this.z = w28;
        this.w0 = a89;
        int G = w28.G();
        g20 g20 = g20.o;
        if (G == 1) {
            fArr = ld8.b;
        } else {
            float[] fArr2 = new float[G];
            for (int i3 = 0; i3 < G; i3++) {
                l20 F = w28.F(i3);
                if (F != null) {
                    g20 g202 = g20.c;
                    g20 g203 = F.a;
                    float f = 1.0f;
                    if (g203 != g202 ? !(g203 != g20 || (i = (k20 = F.d).e) == 0 || (i2 = k20.d) == 0) : !((i = (x10 = F.b).o) == 0 || (i2 = x10.c) == 0)) {
                        f = ((float) i2) / ((float) i);
                    }
                    fArr2[i3] = f;
                } else {
                    fArr2[i3] = 0.0f;
                }
            }
            fArr = fArr2;
        }
        this.w = fArr;
        a89 a893 = this.w0;
        boolean z3 = a892 == null || a892.a.b != a893.a.b || ld8.b(a892, a893);
        if (this.z.G() == 1) {
            l20 F2 = this.z.F(0);
            if (F2.a == g20 || ld8.Y(F2)) {
                y00 y00 = this.N0.b;
                y00.getClass();
                if (!y00.d.containsKey(F2.q)) {
                    sh8 sh8 = new sh8(0, new w00(y00, F2, 2));
                    jbf jbf = y00.a;
                    jbf.getClass();
                    kbf kbf = (kbf) jbf;
                    oi8 f2 = sh8.h(kbf.a()).f(kbf.c());
                    rx0 rx0 = new rx0(24);
                    oh8 oh8 = new oh8(new w00(y00, F2, 1), new x00(y00), dj6);
                    Objects.requireNonNull(oh8, "observer is null");
                    try {
                        f2.a(new ab3(1, oh8, rx0));
                        y00.f.a(oh8);
                    } catch (NullPointerException e) {
                        throw e;
                    } catch (Throwable th) {
                        hd8.Z(th);
                        NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                        nullPointerException.initCause(th);
                        throw nullPointerException;
                    }
                }
                a32 G2 = ((qra) this.a).l().G(this.w0.a.z);
                this.Q0 = G2;
                if (G2 != null) {
                    long j = this.Q0.b.a;
                    long j2 = this.w0.a.c;
                    ((s7g) ((qra) this.a).getAccessor().g(s7g.class)).getClass();
                }
                this.O0.a(this.w0.a);
            }
        }
        for (int i4 = 0; i4 < this.z.G(); i4++) {
            l20 F3 = this.z.F(i4);
            wz v2 = v(a89, i4, F3);
            int G3 = this.z.G();
            ydd ydd = ydd.m;
            if (G3 == 1) {
                if (ld8.Y(F3)) {
                    lv4 lv4 = v2.o;
                    lv4.getClass();
                    ((sp6) lv4).h(ydd.p);
                } else {
                    lv4 lv42 = v2.o;
                    lv42.getClass();
                    ((sp6) lv42).h(ydd);
                }
                lv4 lv43 = v2.o;
                lv43.getClass();
                o((sp6) lv43, i4, this.z.G(), 1, false, false, D());
            } else {
                lv4 lv44 = v2.o;
                lv44.getClass();
                ((sp6) lv44).h(ydd);
            }
            a32 G4 = ((qra) this.a).l().G(this.w0.a.z);
            boolean z4 = (G4 == null || a892 == null || ld8.g0(F3, this.w0) == ld8.g0(a892.a.x0.F(i4), this.w0)) ? false : true;
            boolean z5 = (G4 == null || (a32 = this.Q0) == null || !a32.N() || this.Q0.m().a.c.k == G4.m().a.c.k) ? false : true;
            this.Q0 = G4;
            if (z5 || z4 || z3 || a892 == null || I(F3, a892.a.x0.F(i4))) {
                O(F3, v2, false);
            }
        }
        List list = this.x;
        if (list == null) {
            this.x = new ArrayList();
        } else {
            list.clear();
        }
        if (z3) {
            M();
            if (((sjd) tr1.h((qra) this.a)).h().c(true)) {
                for (int i5 = 0; i5 < this.z.G(); i5++) {
                    l20 F4 = this.z.F(i5);
                    boolean f3 = F4.f();
                    x10 x102 = F4.b;
                    boolean z6 = f3 && !TextUtils.isEmpty(x102.X) && this.v.n(x102.X).exists();
                    if (F4.f() && !TextUtils.isEmpty(x102.z) && !z6) {
                        d20 d20 = F4.n;
                        if (d20.e() || d20.b() || !F(F4)) {
                            r(F4);
                        }
                    }
                }
            }
        }
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [odf, java.lang.Object] */
    public final void r(l20 l20) {
        S(this.w0, l20, d20.v, true);
        ? obj = new Object();
        obj.a = this.w0.a.b;
        obj.b = l20.q;
        x10 x10 = l20.b;
        obj.e = x10.y;
        obj.g = x10.z;
        obj.h = true;
        ((uk5) ((qra) this.a).getAccessor().g(uk5.class)).a(new pdf(obj));
    }

    public final void s(Canvas canvas, String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        Canvas canvas2 = canvas;
        String str2 = str;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        if (this.C0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.C0 = textPaint;
            textPaint.setTextSize(getContext().getResources().getDimension(mad.e));
            this.C0.setColor(getContext().getResources().getColor(lad.v));
            this.C0.setTypeface(Typeface.DEFAULT);
        }
        if (this.D0 == null) {
            Paint paint = new Paint(1);
            this.D0 = paint;
            paint.setColor(getContext().getResources().getColor(lad.n));
            this.D0.setStyle(Paint.Style.FILL);
        }
        float[] y2 = y(i5);
        if (y2 == null) {
            canvas.drawRect((float) i7, (float) i8, (float) i9, (float) i10, this.D0);
        } else {
            Path path = new Path();
            path.addRoundRect((float) i7, (float) i8, (float) i9, (float) i10, y2, Path.Direction.CW);
            canvas2.drawPath(path, this.D0);
        }
        int i11 = i9 - i7;
        int i12 = i11 - (this.c * 2);
        if (i12 < 0) {
            ((uta) ((qra) this.a).o()).c(new HandledException("when draw unknown attach, width < 0. text: %s, left: %d, top: %d, right: %d, bottom: %d", str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)), false);
            i12 = i7 - i9;
        }
        if (i12 < 0) {
            ((uta) ((qra) this.a).o()).c(new HandledException("when draw unknown attach, width < 0, return 0. text: %s, left: %d, top: %d, right: %d, bottom: %d", str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)), false);
            i6 = 0;
        } else {
            i6 = i12;
        }
        StaticLayout staticLayout = new StaticLayout(str, this.C0, i6, Layout.Alignment.ALIGN_CENTER, 1.0f, c44.DEFAULT_ASPECT_RATIO, false);
        int i13 = this.b.C;
        Drawable drawable = W0;
        drawable.setBounds(0, 0, i13, i13);
        int height = staticLayout.getHeight();
        ro4 ro4 = this.b;
        int i14 = (ro4.d * 2) + height + ro4.C;
        canvas.save();
        int i15 = (i11 / 2) + i;
        int i16 = ((i4 - i2) / 2) + i2;
        int i17 = i14 / 2;
        canvas2.translate((float) (i15 - (this.b.C / 2)), (float) (i16 - i17));
        drawable.draw(canvas2);
        canvas.restore();
        canvas.save();
        canvas2.translate((float) (i15 - (staticLayout.getWidth() / 2)), (float) ((i16 + i17) - staticLayout.getHeight()));
        staticLayout.draw(canvas2);
        canvas.restore();
    }

    public void setAttachClickListener(l89 l89) {
        this.x0 = l89;
    }

    public void setAttachVideoListener(m89 m89) {
        this.y0 = m89;
    }

    public void setEmbeddedPlayer(boolean z2) {
        this.I0 = z2;
    }

    public void setForwarded(boolean z2) {
        this.H0 = z2;
    }

    public void setPipRequestListener(o89 o89) {
    }

    public void setSenderVisible(boolean z2) {
        this.G0 = z2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [e2a, w1] */
    public final boolean t(int i, KeyEvent keyEvent) {
        ? r0 = this.A0;
        if (r0 == 0) {
            return false;
        }
        return r0.t(i, keyEvent);
    }

    public final Animatable u(int i) {
        qr0 qr0 = this.o;
        if (((ArrayList) qr0.b).size() <= i || qr0.c(i).v == null) {
            return null;
        }
        return ((m0) qr0.c(i).v).c();
    }

    public final wz v(a89 a89, int i, l20 l20) {
        wz wzVar = (wz) z(i);
        vz vzVar = wzVar.x;
        float[] cornersForVideo = getCornersForVideo();
        vzVar.u = cornersForVideo;
        LiveVideoPlaceHolderView liveVideoPlaceHolderView = vzVar.s;
        if (liveVideoPlaceHolderView != null) {
            liveVideoPlaceHolderView.setCorners(cornersForVideo);
        }
        wzVar.x.g(l20, a89, this.Q0);
        vz vzVar2 = wzVar.x;
        lv4 lv4 = wzVar.o;
        lv4.getClass();
        vzVar2.a((sp6) lv4, ydd.m);
        if (E()) {
            lv4 lv42 = wzVar.o;
            lv42.getClass();
            ((sp6) lv42).m(-0.1f, true);
        }
        return wzVar;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable instanceof r20) {
            return true;
        }
        int i = 0;
        while (true) {
            qr0 qr0 = this.o;
            if (i >= ((ArrayList) qr0.b).size()) {
                return super.verifyDrawable(drawable);
            }
            if (qr0.c(i).e() == drawable) {
                return true;
            }
            i++;
        }
    }

    public int w(l20 l20) {
        for (int i = 0; i < this.z.G(); i++) {
            if (this.z.F(i).q.equals(l20.q)) {
                return i;
            }
        }
        return -1;
    }

    public final int x(MotionEvent motionEvent) {
        if (this.x.size() == 0) {
            return 0;
        }
        int y2 = (int) (motionEvent.getY() / ((float) (getMeasuredHeight() / this.x.size())));
        if (y2 >= this.x.size()) {
            z68.c("p89", "getAttachPosition: wrong calculated row: %d", Integer.valueOf(y2));
            y2 = this.x.size() - 1;
        }
        if (((m43) this.x.get(y2)).size() == 0) {
            return 0;
        }
        int x2 = (int) (motionEvent.getX() / ((float) (getMeasuredWidth() / ((m43) this.x.get(y2)).size())));
        if (x2 >= ((m43) this.x.get(y2)).size()) {
            z68.c("p89", "getAttachPosition: wrong calculated column: %d", Integer.valueOf(x2));
            x2 = ((m43) this.x.get(y2)).size() - 1;
        }
        return ((n43) ((m43) this.x.get(y2)).get(x2)).c;
    }

    public final void x1() {
    }

    public final float[] y(int i) {
        if (i < 0 || ((ArrayList) this.o.b).size() <= 0) {
            return null;
        }
        lv4 lv4 = z(i).o;
        lv4.getClass();
        b9d b9d = ((sp6) lv4).c;
        if (b9d != null) {
            return b9d.c;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [wz, mv4] */
    public final mv4 z(int i) {
        qr0 qr0 = this.o;
        if (((ArrayList) qr0.b).size() > i) {
            return qr0.c(i);
        }
        tp6 tp6 = new tp6(getContext().getResources());
        tp6.b = 0;
        sp6 a2 = tp6.a();
        getContext();
        ? mv4 = new mv4(a2);
        mv4.e().setCallback(this);
        mv4.x = new vz(this, this);
        qr0.b(mv4);
        return mv4;
    }

    public p89(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        B();
    }
}
