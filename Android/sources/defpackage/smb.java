package defpackage;

import android.animation.ValueAnimator;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Size;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.services.PipWorker;
import ru.ok.messages.video.widgets.FloatingVideoView;

/* renamed from: smb  reason: default package */
public final class smb implements ComponentCallbacks, zr5, i0a {
    public FloatingVideoView A0;
    public yr5 B0;
    public n0a C0;
    public l20 D0;
    public a89 E0;
    public a32 F0;
    public final HashSet G0 = new HashSet();
    public long H0;
    public volatile boolean I0 = false;
    public final is7 X;
    public final o20 Y;
    public final omb Z;
    public final Context a;
    public final ys7 b;
    public final hn4 c;
    public final ltb o;
    public final ch v;
    public final bnb v0;
    public final fa9 w;
    public final sv0 w0;
    public final p8g x;
    public final r62 x0;
    public final ro4 y;
    public final m95 y0;
    public final jbf z;
    public j0a z0;

    public smb(Context context, ys7 ys7, hn4 hn4, ltb ltb, ch chVar, fa9 fa9, p8g p8g, jbf jbf, dm4 dm4, o20 o20, bnb bnb, sv0 sv0, r62 r62, m95 m95) {
        this.a = context;
        this.b = ys7;
        this.c = hn4;
        this.o = ltb;
        this.v = chVar;
        this.w = fa9;
        this.x = p8g;
        this.z = jbf;
        this.X = dm4;
        this.Y = o20;
        this.v0 = bnb;
        this.Z = new omb(context, this);
        this.w0 = sv0;
        this.x0 = r62;
        this.y0 = m95;
        this.y = ro4.b();
        context.registerComponentCallbacks(this);
    }

    public final void D0() {
        if (this.F0 != null && this.D0 != null) {
            this.I0 = false;
        }
    }

    public final void Q(String str) {
    }

    public final void W0(Throwable th) {
        Context context = this.a;
        hi7.b0(0, context, fhf.f(context, th));
    }

    public final void a(boolean z2) {
        yr5 yr5 = this.B0;
        if (yr5 != null) {
            if (z2) {
                this.v.g(yr5).v(new ek8(2, this));
                return;
            }
            try {
                ValueAnimator valueAnimator = yr5.y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                f6e.v(this.B0).removeView(this.B0);
            } catch (Exception unused) {
            }
            this.B0 = null;
        }
    }

    public final void b() {
        if (this.E0 != null && this.D0 != null && this.F0 != null && this.z0 != null) {
            this.I0 = true;
        }
    }

    public final int[] c(Context context) {
        int i;
        int i2;
        WindowManager a2 = kw3.a(context);
        this.c.getClass();
        Size k = hn4.k(context);
        int rotation = a2.getDefaultDisplay().getRotation();
        if (rotation == 1 || rotation == 3) {
            i = k.getHeight();
            i2 = k.getWidth();
        } else {
            i = k.getWidth();
            i2 = k.getHeight();
        }
        return new int[]{i, i2};
    }

    public final void d(int i) {
        if (this.z0 != null && this.F0 != null) {
            int y2 = tr1.y(i);
            if (y2 == 0) {
                this.z0.A();
                this.I0 = true;
            } else if (y2 == 1) {
                this.z0.b0();
                this.I0 = false;
            } else if (y2 == 2) {
                h(true);
            }
        }
    }

    public final void d0() {
    }

    public final void e(boolean z2) {
        n0a n0a = this.C0;
        if (n0a != null) {
            v2a v2a = (v2a) n0a.a;
            if (v2a.x != z2) {
                if (z2) {
                    qw6.VIRTUAL_KEY.e(v2a.w);
                }
                v2a.x = z2;
                v2a.c();
            }
        }
    }

    public final void f(Context context, a32 a32, a89 a89, l20 l20, Rect rect, boolean z2) {
        j0a j0a;
        Context context2 = context;
        a32 a322 = a32;
        a89 a892 = a89;
        l20 l202 = l20;
        Rect rect2 = rect;
        h(false);
        this.H0 = SystemClock.elapsedRealtime();
        this.D0 = l202;
        this.E0 = a892;
        this.F0 = a322;
        WindowManager a2 = kw3.a(context);
        FloatingVideoView floatingVideoView = new FloatingVideoView(context2);
        this.A0 = floatingVideoView;
        floatingVideoView.setListener(this);
        int[] c2 = c(context);
        FloatingVideoView floatingVideoView2 = this.A0;
        int i = c2[0];
        int i2 = c2[1];
        floatingVideoView2.o = i;
        floatingVideoView2.v = i2;
        ld9.B().f(qa7.b((ld8.Y(l20) ? l202.j.d.d : l202.d).c), (f0) null);
        float f = (float) this.y.f;
        g4a g4a = new g4a(context2, this.v, new float[]{f, f, f, f, f, f, f, f});
        m95 m95 = this.y0;
        hn4 hn4 = this.c;
        p8g p8g = this.x;
        jbf jbf = this.z;
        ys7 ys7 = this.b;
        m95 m952 = m95;
        j0a j0a2 = r0;
        p8g p8g2 = p8g;
        g4a g4a2 = g4a;
        g4a g4a3 = g4a2;
        WindowManager windowManager = a2;
        a89 a893 = a892;
        j0a j0a3 = new j0a(g4a, (ju8) this.X.get(), p8g2, jbf, ys7, this.Y, this.w, this.o, this, m952, hn4, false, true);
        j0a j0a4 = j0a2;
        this.z0 = j0a4;
        j0a4.W(l20, a322.b.a, a89.a, 1, true);
        this.A0.setVisibility(4);
        this.A0.addView((View) g4a3.c);
        this.A0.c(this.z0.p(), this.z0.B());
        int width = rect.width();
        int height = rect.height();
        if (!(this.A0 == null || (j0a = this.z0) == null)) {
            int p = j0a.p();
            int B = this.z0.B();
            if (p > 0 && B > 0) {
                width = p;
                height = B;
            }
            this.A0.c(width, height);
        }
        ltb ltb = this.o;
        a33 a33 = ltb.a;
        a33.getClass();
        ls7 ls7 = a33.g;
        Point point = new Point(ls7.getInt("app.video.pip.pos.x", 0), ls7.getInt("app.video.pip.pos.y", 0));
        if (point.x == 0 && point.y == 0) {
            point.x = this.A0.getLeftMargin();
            point.y = this.A0.getTopMargin();
        }
        FloatingVideoView floatingVideoView3 = this.A0;
        int i3 = point.x;
        int i4 = point.y;
        WindowManager.LayoutParams layoutParams = floatingVideoView3.z0;
        layoutParams.x = i3;
        layoutParams.y = i4;
        floatingVideoView3.b(true);
        FloatingVideoView floatingVideoView4 = this.A0;
        WindowManager windowManager2 = windowManager;
        windowManager2.addView(floatingVideoView4, floatingVideoView4.getWindowManagerLayoutParams());
        Uri a3 = this.Y.a(l20);
        if (!ltb.c.u() || a3 == null || !z2) {
            Context context3 = context;
            FloatingVideoView floatingVideoView5 = this.A0;
            if (floatingVideoView5 != null) {
                floatingVideoView5.setVisibility(0);
            }
            a(false);
        } else {
            this.A0.setVisibility(4);
            yr5 yr5 = new yr5(context);
            this.B0 = yr5;
            Rect rect3 = rect;
            yr5.b(a3, rect3.left, rect3.top, rect.width(), rect.height());
            this.B0.setListener(new y3a(11, (Object) this));
            yr5 yr52 = this.B0;
            windowManager2.addView(yr52, yr52.getWindowLayoutParams());
            this.B0.a(this.A0.getXPos(), this.A0.getYPos(), this.A0.getWindowWidth(), this.A0.getWindowHeight());
        }
        context.getApplicationContext();
        z68.c("PIP_WORKER", "start", new Object[0]);
        ((ipg) ((qra) ym.e()).getAccessor().g(ipg.class)).b("PIP_WORKER", fb5.b, (w3b) ((v3b) new v3b(PipWorker.class).setExpedited(t5b.a)).build(), true).v();
        omb omb = this.Z;
        if (!omb.d) {
            q8.K(omb.a, omb, omb.c, (String) null, 4);
            omb.d = true;
        }
        try {
            this.w0.d(this);
        } catch (Exception unused) {
        }
    }

    public final void h(boolean z2) {
        z68.c("PIP_WORKER", "stop", new Object[0]);
        ((ipg) ((qra) ym.e()).getAccessor().g(ipg.class)).c("PIP_WORKER");
        j(z2);
        yr5 yr5 = this.B0;
        if (yr5 != null) {
            yr5.setListener((xr5) null);
            ValueAnimator valueAnimator = this.B0.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            try {
                kw3.a(this.B0.getContext()).removeView(this.B0);
            } catch (Exception unused) {
            }
            this.B0 = null;
        }
        this.D0 = null;
        this.E0 = null;
        this.F0 = null;
        Iterator it = this.G0.iterator();
        if (it.hasNext()) {
            rae.w(it.next());
            throw null;
        }
    }

    public final void j(boolean z2) {
        j0a j0a = this.z0;
        if (j0a != null) {
            j0a.I(z2);
            this.z0 = null;
        }
        FloatingVideoView floatingVideoView = this.A0;
        if (floatingVideoView != null) {
            try {
                kw3.a(floatingVideoView.getContext()).removeView(this.A0);
            } catch (Exception unused) {
            }
            this.A0 = null;
        }
        n0a n0a = this.C0;
        if (n0a != null) {
            View view = (View) ((v2a) n0a.a).c;
            if (view != null) {
                try {
                    kw3.a(view.getContext()).removeView(view);
                } catch (Exception unused2) {
                }
            }
            this.C0 = null;
        }
        omb omb = this.Z;
        if (omb.d) {
            omb.a.unregisterReceiver(omb);
            omb.d = false;
        }
        try {
            this.w0.f(this);
        } catch (Exception unused3) {
        }
    }

    public final void j0() {
        a89 a89;
        a89 a892;
        if (this.z0 != null && this.A0 != null && this.D0 != null && this.E0 != null) {
            ys7 ys7 = this.b;
            if (ys7.get() != null) {
                ((nd) ys7.get()).d(SystemClock.elapsedRealtime() - this.H0, "ACTION_PIP_DURATION", (String) null);
            }
            this.z0.u();
            WindowManager.LayoutParams windowManagerLayoutParams = this.A0.getWindowManagerLayoutParams();
            if (this.o.c.u()) {
                Uri a2 = this.Y.a(this.D0);
                if (a2 != null) {
                    WindowManager v2 = f6e.v(this.A0);
                    Display defaultDisplay = v2.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    yr5 yr5 = new yr5(this.A0.getContext());
                    this.B0 = yr5;
                    yr5.b(a2, windowManagerLayoutParams.x, windowManagerLayoutParams.y, windowManagerLayoutParams.width, windowManagerLayoutParams.height);
                    int[] B = iq.B(point.x, point.y, windowManagerLayoutParams.width, windowManagerLayoutParams.height);
                    int i = B[0];
                    int i2 = B[1];
                    a89 a893 = this.E0;
                    l20 l20 = this.D0;
                    j(false);
                    this.B0.setListener(new u00(this, a893, l20));
                    yr5 yr52 = this.B0;
                    v2.addView(yr52, yr52.getWindowLayoutParams());
                    this.B0.a((point.x / 2) - (i / 2), (point.y / 2) - (i2 / 2), i, i2);
                    return;
                }
                Context context = this.A0.getContext();
                l20 l202 = this.D0;
                if (!(l202 == null || (a892 = this.E0) == null)) {
                    l(context, a892, l202);
                }
                h(true);
                return;
            }
            Context context2 = this.A0.getContext();
            l20 l203 = this.D0;
            if (!(l203 == null || (a89 = this.E0) == null)) {
                l(context2, a89, l203);
            }
            h(true);
        }
    }

    public final void k(int i, int i2, int i3) {
        FloatingVideoView floatingVideoView = this.A0;
        if (floatingVideoView != null) {
            floatingVideoView.c(i, i2);
        }
    }

    public final void l(Context context, a89 a89, l20 l20) {
        String str;
        Intent Y2 = ActAttachesView.Y(context, a89.a.z, a89, l20.q, false, true, true, true);
        Y2.setFlags(268435456);
        Bundle bundle = ActivityOptions.makeCustomAnimation(context, qcc.pip_to_fullscreen, 0).toBundle();
        int v2 = ld9.v(134217728);
        boolean z2 = (33554432 & v2) != 0;
        if (Build.VERSION.SDK_INT >= 34 && (((str = Y2.getPackage()) == null || str.length() == 0 || Y2.getComponent() == null) && z2)) {
            v2 |= 16777216;
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, Y2, v2, bundle);
        if (activity != null) {
            try {
                activity.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        } else {
            z68.n("smb", (IOException) null, "Pending intent for open video is null", Arrays.copyOf(new Object[0], 0));
        }
        ch chVar = this.v;
        y64.C(chVar.a.b(), new rmb(this, 0));
        y64.C(chVar.a.b() * 2, new rmb(this, 1));
    }

    public final void m() {
        j0a j0a = this.z0;
        if (j0a != null) {
            j0a.G(true);
        }
    }

    public final void m1() {
        h(true);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        FloatingVideoView floatingVideoView = this.A0;
        if (floatingVideoView != null) {
            int[] c2 = c(floatingVideoView.getContext());
            FloatingVideoView floatingVideoView2 = this.A0;
            int i = c2[0];
            int i2 = c2[1];
            floatingVideoView2.o = i;
            floatingVideoView2.v = i2;
            floatingVideoView2.b(true);
            floatingVideoView2.x.updateViewLayout(floatingVideoView2, floatingVideoView2.z0);
            floatingVideoView2.a();
        }
    }

    @oye
    public void onEvent(kv9 kv9) {
        a89 a89 = this.E0;
        if (a89 != null && this.D0 != null && this.F0 != null && this.z0 != null && kv9.v.contains(Long.valueOf(a89.a.b))) {
            h(false);
        }
    }

    public final void onLowMemory() {
    }

    public final void q() {
        if (this.E0 != null && this.D0 != null && this.F0 != null && this.z0 != null) {
            this.I0 = false;
        }
    }

    public final void x1() {
    }

    @oye
    public void onEvent(z41 z41) {
        j0a j0a;
        if (this.E0 != null && this.D0 != null && this.F0 != null && (j0a = this.z0) != null) {
            j0a.b0();
            this.I0 = false;
        }
    }

    @oye
    public void onEvent(fb2 fb2) {
        a32 a32;
        if (this.E0 != null && this.D0 != null && (a32 = this.F0) != null && this.z0 != null && fb2.b == a32.a) {
            h(false);
        }
    }

    @oye
    public void onEvent(xy2 xy2) {
        a32 a32;
        if (this.E0 != null && this.D0 != null && (a32 = this.F0) != null && this.z0 != null && xy2.b.contains(Long.valueOf(a32.a))) {
            k72 k72 = this.x0.G(this.F0.a).b.c;
            if (k72 == k72.o || k72 == k72.v) {
                h(false);
            }
        }
    }
}
