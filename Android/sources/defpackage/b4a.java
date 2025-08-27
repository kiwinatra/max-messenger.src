package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import androidx.fragment.app.a;
import java.io.File;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Lazy;
import ru.ok.messages.views.widgets.quickcamera.QuickCameraView;

/* renamed from: b4a  reason: default package */
public final class b4a extends q2 implements acc, bif, f2a {
    public static final /* synthetic */ int a1 = 0;
    public l5b A0 = l5b.c;
    public l5b B0;
    public boolean C0 = false;
    public at1 D0;
    public View E0;
    public ImageView F0;
    public ImageView G0;
    public View H0;
    public View I0;
    public ImageView J0;
    public View K0;
    public View L0;
    public ImageView M0;
    public View N0;
    public Chronometer O0;
    public View P0;
    public View Q0;
    public nbc R0;
    public nbc S0;
    public int T0 = 100;
    public scf U0;
    public w3a V0;
    public npg W0;
    public final ln5 X;
    public ro4 X0;
    public final ggd Y;
    public boolean Y0;
    public final nd Z;
    public int Z0 = 1;
    public final hn4 o;
    public final dm4 v;
    public final aua v0;
    public final a33 w;
    public n5b w0;
    public final fq x;
    public v3a x0 = v3a.a;
    public final dac y;
    public z3a y0;
    public final m95 z;
    public a4a z0;

    public b4a(Context context, QuickCameraView quickCameraView, hn4 hn4, a33 a33, fq fqVar, m95 m95, dm4 dm4, ln5 ln5, ggd ggd, nd ndVar, aua aua) {
        super(context);
        dac dac = new dac();
        this.y = dac;
        y64.I(dac);
        this.o = hn4;
        this.w = a33;
        this.x = fqVar;
        this.z = m95;
        this.v = dm4;
        this.X = ln5;
        this.Y = ggd;
        this.Z = ndVar;
        this.v0 = aua;
        dm4.c = this;
        J(quickCameraView);
    }

    public final void M() {
        u7g u7g;
        this.X0 = ro4.b();
        Lazy lazy = scf.b0;
        Context context = (Context) this.b;
        this.U0 = j4b.k0(context);
        ((View) this.c).setBackgroundColor(-16777216);
        this.D0 = (at1) ((View) this.c).findViewById(lic.quick_camera_view__cv_camera);
        int ordinal = ((pid) this.x).p().ordinal();
        if (ordinal != 0) {
            u7g = u7g.b;
            if (ordinal != 1 && ordinal == 2) {
                u7g = u7g.a;
            }
        } else {
            u7g = u7g.c;
        }
        this.D0.setVideoQuality(u7g);
        ((View) this.c).setVisibility(8);
        l5b l5b = this.A0;
        h0(l5b == l5b.b || l5b == l5b.a);
        this.N0 = ((View) this.c).findViewById(lic.quick_camera_view__v_open_full_camera);
        this.G0 = (ImageView) ((View) this.c).findViewById(lic.quick_camera_view__iv_camera_image);
        this.H0 = ((View) this.c).findViewById(lic.quick_camera_view__fl_wrapper_controls_camera);
        this.E0 = ((View) this.c).findViewById(lic.quick_camera_view__fl_wrapper_take);
        this.F0 = (ImageView) ((View) this.c).findViewById(lic.quick_camera_view__iv_take);
        this.L0 = ((View) this.c).findViewById(lic.quick_camera_view__fl_wrapper_switch_state);
        this.M0 = (ImageView) ((View) this.c).findViewById(lic.quick_camera_view__iv_switch_state);
        this.P0 = ((View) this.c).findViewById(lic.quick_camera_view__fl_wrapper_close);
        this.Q0 = ((View) this.c).findViewById(lic.quick_camera_view__fl_wrapper_flash);
        this.K0 = ((View) this.c).findViewById(lic.quick_camera_view__iv_close);
        this.I0 = ((View) this.c).findViewById(lic.quick_camera_view__fl_wrapper_switch);
        this.J0 = (ImageView) ((View) this.c).findViewById(lic.media_bar_view__iv_switch);
        this.O0 = (Chronometer) ((View) this.c).findViewById(lic.quick_camera_view__ch_video_chronometer);
        ((QuickCameraView) ((View) this.c)).setDelegate(this);
        z3a z3a = new z3a(0, this);
        this.y0 = z3a;
        this.D0.setCameraListener(z3a);
        this.z0 = new a4a(this);
        if (this.K0 != null) {
            y64.n(this.P0, new x3a(this, 5));
        }
        View view = this.N0;
        if (view != null) {
            view.setOnClickListener(new u99(6, (Object) this));
            this.N0.setOnLongClickListener(new z20(13, this));
        }
        View view2 = this.E0;
        if (view2 != null) {
            y64.m(view2, 500, new x3a(this, 1));
        }
        View view3 = this.L0;
        if (view3 != null) {
            y64.l(view3, new x3a(this, 2));
        }
        View view4 = this.I0;
        if (view4 != null) {
            y64.l(view4, new x3a(this, 3));
        }
        a4a a4a = this.z0;
        npg npg = new npg(20, false);
        npg.b = a4a;
        this.W0 = npg;
        ValueAnimator I = npg.I(this.E0, fw3.a(context, lad.p), this.U0.J);
        if (I != null) {
            I.start();
        }
        w3a w3a = new w3a(context, (View) this.c, this.D0);
        this.V0 = w3a;
        new r1a(w3a, this.w);
        y3a y3a = new y3a(0, (Object) this);
        WeakHashMap weakHashMap = gag.a;
        v9g.u((View) this.c, y3a);
        t9g.c((View) this.c);
        this.D0.f(false);
    }

    public final boolean Z() {
        return this.x0 == v3a.b;
    }

    public final boolean a0() {
        return this.B0 == l5b.c || this.A0 == l5b.o;
    }

    public final void c() {
        ImageView imageView = this.F0;
        int i = nad.B;
        int i2 = this.U0.x;
        Context context = (Context) this.b;
        imageView.setImageDrawable(iq.E(i, i2, context));
        this.M0.setImageDrawable(iq.E(nad.a2, this.U0.x, context));
        int i3 = this.X0.u;
        View view = this.E0;
        scf scf = this.U0;
        view.setBackground(i8b.f(scf.J, scf.j, 0, i3));
        View view2 = this.L0;
        scf scf2 = this.U0;
        view2.setBackground(i8b.f(scf2.J, scf2.j, 0, i3));
        View view3 = this.I0;
        scf scf3 = this.U0;
        view3.setBackground(i8b.f(scf3.J, scf3.j, 0, i3));
        this.J0.setImageDrawable(iq.E(nad.q1, this.U0.x, context));
    }

    public final boolean c0() {
        return this.Z0 == 2;
    }

    public final void d0(boolean z2) {
        Context context = (Context) this.b;
        if (z2) {
            m5 m5Var = (m5) context;
            hn4.j(m5Var, this.A0);
            hn4.l(m5Var, true);
            return;
        }
        m5 m5Var2 = (m5) context;
        if (m5Var2 != null) {
            m5Var2.setRequestedOrientation(-1);
        }
        hn4.l(m5Var2, false);
    }

    public final void e0() {
        int i;
        this.Z.e("MEDIA_SEND_QUICK_CAMERA_PICTURE");
        if (!c0() && this.Z0 != 3) {
            z68.c("b4a", "onClickTake: %s", "Take picture");
            this.D0.d(this.v0.c());
        } else if (c0()) {
            z68.c("b4a", "onClickTake: %s", "Start record video");
            a aVar = (a) this.v.b;
            Context O1 = aVar.O1();
            String[] strArr = n54.f;
            if (!n54.e(O1, strArr)) {
                n54.O(aVar, strArr, 171, qad.v6);
                return;
            }
            k0(true);
            File n = ((po5) this.X).n(this.Y.a());
            z68.c("b4a", "startRecordVideo", new Object[0]);
            npg npg = this.W0;
            View view = this.E0;
            int i2 = lad.p;
            Context context = (Context) this.b;
            int a = fw3.a(context, i2);
            int i3 = this.U0.J;
            npg.getClass();
            ValueAnimator I = npg.I(view, a, i3);
            if (I != null) {
                I.start();
            }
            this.F0.setImageDrawable(iq.E(nad.f, this.U0.x, context));
            npg npg2 = this.W0;
            if (a0()) {
                View view2 = this.H0;
                Rect rect = rcg.a;
                rcg.d(rect, view2);
                i = rect.bottom;
            } else {
                View view3 = this.H0;
                Rect rect2 = rcg.a;
                rcg.d(rect2, view3);
                i = rect2.right;
            }
            npg2.u(0, -80, 0, i, false, this.V0.y, this.P0, this.L0, this.I0, this.O0, a0());
            this.D0.a(n);
        } else {
            z68.c("b4a", "onClickTake: %s", "Stop record video");
            z68.c("b4a", "stopRecordVideo", new Object[0]);
            n0();
            k0(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r11 != 3) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (r11 != 4) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        if (r11 != 4) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        if (r11 != 4) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g0(defpackage.l5b r11) {
        /*
            r10 = this;
            r0 = 3
            r1 = 2
            l5b r2 = defpackage.l5b.b
            r3 = 1
            r4 = 0
            if (r11 == r2) goto L_0x000f
            l5b r2 = defpackage.l5b.a
            if (r11 != r2) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r2 = r4
            goto L_0x0010
        L_0x000f:
            r2 = r3
        L_0x0010:
            r10.h0(r2)
            r10.A0 = r11
            boolean r2 = r10.Z()
            if (r2 != 0) goto L_0x001f
            r10.d0(r4)
            return
        L_0x001f:
            java.lang.Object r2 = r10.b
            android.content.Context r2 = (android.content.Context) r2
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r5 = "accelerometer_rotation"
            int r2 = android.provider.Settings.System.getInt(r2, r5, r4)
            if (r2 != 0) goto L_0x0030
            return
        L_0x0030:
            l5b r2 = r10.B0
            int r5 = defpackage.n5b.d
            int[] r5 = defpackage.k5b.$EnumSwitchMapping$0
            int r6 = r2.ordinal()
            r6 = r5[r6]
            if (r2 != r11) goto L_0x0040
        L_0x003e:
            r2 = r4
            goto L_0x0087
        L_0x0040:
            r2 = 180(0xb4, float:2.52E-43)
            r7 = -90
            r8 = 90
            r9 = 4
            if (r6 != r9) goto L_0x0058
            int r11 = r11.ordinal()
            r11 = r5[r11]
            if (r11 == r3) goto L_0x0087
            if (r11 == r1) goto L_0x0056
            if (r11 == r0) goto L_0x0067
            goto L_0x003e
        L_0x0056:
            r2 = r7
            goto L_0x0087
        L_0x0058:
            if (r6 != r1) goto L_0x0069
            int r11 = r11.ordinal()
            r11 = r5[r11]
            if (r11 == r3) goto L_0x0056
            if (r11 == r0) goto L_0x0087
            if (r11 == r9) goto L_0x0067
            goto L_0x003e
        L_0x0067:
            r2 = r8
            goto L_0x0087
        L_0x0069:
            if (r6 != r3) goto L_0x0078
            int r11 = r11.ordinal()
            r11 = r5[r11]
            if (r11 == r1) goto L_0x0067
            if (r11 == r0) goto L_0x0056
            if (r11 == r9) goto L_0x0087
            goto L_0x003e
        L_0x0078:
            if (r6 != r0) goto L_0x00c7
            int r11 = r11.ordinal()
            r11 = r5[r11]
            if (r11 == r3) goto L_0x0067
            if (r11 == r1) goto L_0x0087
            if (r11 == r9) goto L_0x0056
            goto L_0x003e
        L_0x0087:
            float r11 = (float) r2
            int r2 = r10.Z0
            if (r2 != r0) goto L_0x00a6
            npg r0 = r10.W0
            android.widget.ImageView r2 = r10.F0
            float r2 = r2.getRotation()
            android.widget.ImageView r5 = r10.F0
            android.widget.Chronometer r10 = r10.O0
            android.view.View[] r1 = new android.view.View[r1]
            r1[r4] = r5
            r1[r3] = r10
            r0.getClass()
            r10 = 0
            defpackage.npg.t(r2, r11, r10, r1)
            goto L_0x00c6
        L_0x00a6:
            npg r2 = r10.W0
            android.widget.ImageView r5 = r10.F0
            float r5 = r5.getRotation()
            w3a r6 = r10.V0
            he r6 = r6.y
            android.widget.ImageView r7 = r10.F0
            android.widget.ImageView r8 = r10.J0
            android.widget.ImageView r10 = r10.M0
            android.view.View[] r0 = new android.view.View[r0]
            r0[r4] = r7
            r0[r3] = r8
            r0[r1] = r10
            r2.getClass()
            defpackage.npg.t(r5, r11, r6, r0)
        L_0x00c6:
            return
        L_0x00c7:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b4a.g0(l5b):void");
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Object, nbc] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.Object, nbc] */
    public final void h0(boolean z2) {
        nbc nbc;
        at1 at1 = this.D0;
        Context context = (Context) this.b;
        hn4 hn4 = this.o;
        if (z2) {
            if (this.R0 == null) {
                hn4.getClass();
                Size k = hn4.k(context);
                k.getWidth();
                k.getHeight();
                this.R0 = new Object();
            }
            nbc = this.R0;
        } else {
            if (this.S0 == null) {
                hn4.getClass();
                Size k2 = hn4.k(context);
                k2.getWidth();
                k2.getHeight();
                this.S0 = new Object();
            }
            nbc = this.S0;
        }
        at1.setPictureSize(nbc);
    }

    public final void i0(v3a v3a) {
        z68.c("b4a", "setMode: newMode = %s, currentMode = %s", v3a.name(), this.x0.name());
        this.B0 = this.A0;
        this.x0 = v3a;
        int i = 0;
        this.Y0 = false;
        ((View) this.c).setFocusable(Z());
        ((View) this.c).setClickable(Z());
        ((View) this.c).setFocusableInTouchMode(Z());
        ((View) this.c).requestFocus();
        boolean Z2 = Z();
        if (Z2) {
            this.N0.setVisibility(8);
        } else {
            this.N0.setVisibility(0);
        }
        this.G0.setAlpha(1.0f);
        this.G0.setVisibility(Z2 ? 8 : 0);
        w3a w3a = this.V0;
        w3a.v.setAlpha(1.0f);
        w3a.v.setVisibility(Z2 ? 0 : 8);
        if (Z2) {
            if (w3a.x) {
                for (r1a W : (Set) w3a.a) {
                    W.W((String) null);
                }
            } else {
                w3a.w.setVisibility(8);
            }
        }
        this.K0.setAlpha(1.0f);
        this.K0.setVisibility(Z2 ? 0 : 8);
        this.H0.setAlpha(1.0f);
        this.H0.setVisibility(Z2 ? 0 : 8);
        if (this.D0.m()) {
            View view = this.I0;
            if (!Z2) {
                i = 8;
            }
            view.setVisibility(i);
        } else {
            this.I0.setVisibility(8);
        }
        if (!Z2) {
            ((View) this.c).postDelayed(new o99(9, this), 100);
        }
        this.W0.c = null;
    }

    public final void j0(int i) {
        iq.O(this.P0, i);
        iq.O(this.V0.w, i);
    }

    public final void k0(boolean z2) {
        this.Z0 = z2 ? 3 : 2;
        this.D0.l();
    }

    public final void n0() {
        npg npg = this.W0;
        View view = this.E0;
        int i = this.U0.J;
        int i2 = lad.p;
        Context context = (Context) this.b;
        int a = fw3.a(context, i2);
        npg.getClass();
        ValueAnimator I = npg.I(view, i, a);
        if (I != null) {
            I.start();
        }
        this.F0.setImageDrawable(iq.E(nad.a2, -1, context));
        this.W0.u(-80, 0, (int) (a0() ? this.L0.getTranslationY() : this.L0.getTranslationX()), 0, true, this.V0.y, this.P0, this.L0, this.I0, this.O0, a0());
        k0(false);
    }

    public final boolean p0() {
        if (!this.D0.h()) {
            return false;
        }
        n5b n5b = this.w0;
        Context context = (Context) this.b;
        if (n5b == null) {
            this.w0 = new n5b(context, this);
        }
        this.w0.enable();
        if (((View) this.c).getVisibility() == 0 && this.D0.j()) {
            return false;
        }
        if (n54.e(context, n54.e)) {
            z68.c("b4a", "startPreviewCamera", new Object[0]);
            if (this.y0 == null) {
                z3a z3a = new z3a(0, this);
                this.y0 = z3a;
                this.D0.setCameraListener(z3a);
            }
            this.D0.e();
        }
        if (n54.f(context)) {
            for (v1a v1a : (Set) this.a) {
                ok8 ok8 = (ok8) v1a.b;
                ok8.getClass();
                ok8.O0.post(new jk8(ok8, 0));
                ok8.post(new jk8(ok8, 1));
            }
        }
        return true;
    }

    public final void q0() {
        z68.a("b4a", "stopPreviewCamera");
        this.D0.k();
    }

    public final void release() {
        try {
            z68.c("b4a", "destroyCamera", new Object[0]);
            this.D0.c();
            z68.c("b4a", "removeAllListeners", new Object[0]);
            this.D0.setCameraListener((uu1) null);
            this.y0 = null;
        } catch (Exception e) {
            z68.g("b4a", "No found camera, error message: %s", e.getMessage());
        }
    }
}
