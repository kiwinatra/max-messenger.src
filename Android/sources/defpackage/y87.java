package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

/* renamed from: y87  reason: default package */
public final class y87 extends vzf {
    public static final w87 z = new Object();
    public final int o;
    public final AtomicReference p = new AtomicReference((Object) null);
    public final int q;
    public int r = -1;
    public Rational s = null;
    public ugd t;
    public bwd u;
    public zc4 v;
    public k9f w;
    public cwd x;
    public final b8d y = new b8d((Object) this);

    public y87(z87 z87) {
        super(z87);
        z87 z872 = (z87) this.f;
        la0 la0 = z87.b;
        if (z872.u(la0)) {
            this.o = ((Integer) z872.n(la0)).intValue();
        } else {
            this.o = 1;
        }
        this.q = ((Integer) z872.k(z87.z, 0)).intValue();
        this.t = new ugd((x87) z872.k(z87.Y, (Object) null));
    }

    public static boolean G(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final void D(boolean z2) {
        k9f k9f;
        ev0.g();
        cwd cwd = this.x;
        if (cwd != null) {
            cwd.b();
            this.x = null;
        }
        zc4 zc4 = this.v;
        if (zc4 != null) {
            zc4.b();
            this.v = null;
        }
        if (!z2 && (k9f = this.w) != null) {
            k9f.b();
            this.w = null;
        }
    }

    public final bwd E(String str, z87 z87, hc0 hc0) {
        ev0.g();
        Objects.toString(hc0);
        Size size = hc0.a;
        su1 c = c();
        Objects.requireNonNull(c);
        boolean z2 = true;
        boolean z3 = !c.l();
        if (this.v != null) {
            bs0.r((String) null, z3);
            this.v.b();
        }
        if (((Boolean) this.f.k(z87.Z, Boolean.FALSE)).booleanValue()) {
            c().g().Q();
        }
        this.v = new zc4(z87, size, z3);
        if (this.w == null) {
            this.w = new k9f(this.y);
        }
        k9f k9f = this.w;
        zc4 zc4 = this.v;
        k9f.getClass();
        ev0.g();
        k9f.c = zc4;
        zc4.getClass();
        ev0.g();
        pk4 pk4 = (pk4) zc4.c;
        pk4.getClass();
        ev0.g();
        if (((obd) pk4.b) == null) {
            z2 = false;
        }
        bs0.r("The ImageReader is not initialized.", z2);
        obd obd = (obd) pk4.b;
        synchronized (obd.c) {
            obd.w = k9f;
        }
        zc4 zc42 = this.v;
        bwd d = bwd.d((z87) zc42.a, hc0.a);
        ja0 ja0 = (ja0) zc42.v;
        za7 za7 = ja0.b;
        Objects.requireNonNull(za7);
        vy4 vy4 = vy4.d;
        kwd a = dc0.a(za7);
        a.f = vy4;
        d.a.add(a.b());
        za7 za72 = ja0.c;
        if (za72 != null) {
            d.i = dc0.a(za72).b();
        }
        if (this.o == 2 && !hc0.e) {
            d().j(d);
        }
        je3 je3 = hc0.d;
        if (je3 != null) {
            d.b.c(je3);
        }
        cwd cwd = this.x;
        if (cwd != null) {
            cwd.b();
        }
        cwd cwd2 = new cwd(new b87(1, this));
        this.x = cwd2;
        d.f = cwd2;
        return d;
    }

    public final int F() {
        int i;
        synchronized (this.p) {
            i = this.r;
            if (i == -1) {
                i = ((Integer) ((z87) this.f).k(z87.c, 2)).intValue();
            }
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl, java.lang.Exception] */
    public final void H(Executor executor, xv1 xv1) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        xv1 xv12 = xv1;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ryg.G().execute(new x55((Object) this, (Object) executor, (Object) xv12, 11));
            return;
        }
        Executor executor2 = executor;
        ev0.g();
        if (F() == 3 && this.t.a == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        su1 c = c();
        Rect rect = null;
        if (c == null) {
            Exception exc = new Exception("Not bound to a valid Camera [" + this + "]", (Throwable) null);
            z68.c(xv1.class.getName(), "capture image with error", new Object[0]);
            uu1 uu1 = ((CameraxCameraApiView) xv12.b).v;
            if (uu1 != null) {
                uu1.h(new Exception(exc));
                return;
            }
            return;
        }
        k9f k9f = this.w;
        Objects.requireNonNull(k9f);
        Rect rect2 = this.i;
        hc0 hc0 = this.g;
        Size size = hc0 != null ? hc0.a : null;
        Objects.requireNonNull(size);
        if (rect2 != null) {
            rect = rect2;
        } else {
            Rational rational = this.s;
            if (rational == null || rational.floatValue() <= c44.DEFAULT_ASPECT_RATIO || rational.isNaN()) {
                rect = new Rect(0, 0, size.getWidth(), size.getHeight());
            } else {
                su1 c2 = c();
                Objects.requireNonNull(c2);
                int h = h(c2, false);
                Rational rational2 = new Rational(this.s.getDenominator(), this.s.getNumerator());
                if (!grf.c(h)) {
                    rational2 = this.s;
                }
                if (rational2 != null && rational2.floatValue() > c44.DEFAULT_ASPECT_RATIO && !rational2.isNaN()) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    float f = (float) width;
                    float f2 = (float) height;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f / f2) {
                        int round = Math.round((f / ((float) numerator)) * ((float) denominator));
                        i4 = (height - round) / 2;
                        i2 = round;
                        i3 = width;
                        i5 = 0;
                    } else {
                        i3 = Math.round((f2 / ((float) denominator)) * ((float) numerator));
                        i5 = (width - i3) / 2;
                        i2 = height;
                        i4 = 0;
                    }
                    rect = new Rect(i5, i4, i3 + i5, i2 + i4);
                }
                Objects.requireNonNull(rect);
            }
        }
        Matrix matrix = this.j;
        int h2 = h(c, false);
        z87 z87 = (z87) this.f;
        la0 la0 = z87.X;
        if (z87.u(la0)) {
            i = ((Integer) z87.n(la0)).intValue();
        } else {
            int i6 = this.o;
            if (i6 == 0) {
                i = 100;
            } else if (i6 == 1 || i6 == 2) {
                i = 95;
            } else {
                throw new IllegalStateException(a81.j(i6, "CaptureMode ", " is invalid"));
            }
        }
        rc0 rc0 = new rc0(executor, xv1, rect, matrix, h2, i, this.o, Collections.unmodifiableList(this.u.e));
        ev0.g();
        k9f.a.offer(rc0);
        k9f.c();
    }

    public final void I() {
        synchronized (this.p) {
            try {
                if (this.p.get() == null) {
                    d().f(F());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzf f(boolean z2, c0g c0g) {
        z.getClass();
        z87 z87 = w87.a;
        je3 a = c0g.a(z87.O(), this.o);
        if (z2) {
            a = je3.L(a, z87);
        }
        if (a == null) {
            return null;
        }
        return new z87(c5b.a(((d87) k(a)).b));
    }

    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public final yzf k(je3 je3) {
        return new d87(pz9.d(je3), 1);
    }

    public final void q() {
        bs0.q(c(), "Attached camera cannot be null");
        if (F() == 3) {
            su1 c = c();
            if ((c != null ? c.n().h() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    public final void r() {
        I();
        d().g(this.t);
    }

    public final zzf s(qu1 qu1, yzf yzf) {
        Object obj;
        Object obj2;
        Object obj3;
        if (qu1.q().e(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            yy9 q2 = yzf.q();
            la0 la0 = z87.y;
            Object obj4 = Boolean.TRUE;
            c5b c5b = (c5b) q2;
            c5b.getClass();
            try {
                obj4 = c5b.n(la0);
            } catch (IllegalArgumentException unused) {
            }
            if (!bool.equals(obj4)) {
                ((pz9) yzf.q()).f(z87.y, Boolean.TRUE);
            }
        }
        yy9 q3 = yzf.q();
        Boolean bool2 = Boolean.TRUE;
        la0 la02 = z87.y;
        Object obj5 = Boolean.FALSE;
        c5b c5b2 = (c5b) q3;
        c5b2.getClass();
        try {
            obj5 = c5b2.n(la02);
        } catch (IllegalArgumentException unused2) {
        }
        boolean equals = bool2.equals(obj5);
        Object obj6 = null;
        boolean z2 = false;
        if (equals) {
            if (c() != null) {
                c().g().Q();
            }
            try {
                obj3 = c5b2.n(z87.v);
            } catch (IllegalArgumentException unused3) {
                obj3 = null;
            }
            Integer num = (Integer) obj3;
            if (num == null || num.intValue() == 256) {
                z2 = true;
            }
            if (!z2) {
                ((pz9) q3).f(z87.y, Boolean.FALSE);
            }
        }
        yy9 q4 = yzf.q();
        la0 la03 = z87.v;
        c5b c5b3 = (c5b) q4;
        c5b3.getClass();
        try {
            obj = c5b3.n(la03);
        } catch (IllegalArgumentException unused4) {
            obj = null;
        }
        Integer num2 = (Integer) obj;
        int i = 35;
        if (num2 != null) {
            if (c() != null) {
                c().g().Q();
            }
            yy9 q5 = yzf.q();
            la0 la04 = m97.D;
            if (!z2) {
                i = num2.intValue();
            }
            ((pz9) q5).f(la04, Integer.valueOf(i));
        } else {
            yy9 q6 = yzf.q();
            la0 la05 = z87.w;
            c5b c5b4 = (c5b) q6;
            c5b4.getClass();
            try {
                obj2 = c5b4.n(la05);
            } catch (IllegalArgumentException unused5) {
                obj2 = null;
            }
            if (Objects.equals(obj2, 1)) {
                ((pz9) yzf.q()).f(m97.D, 4101);
                ((pz9) yzf.q()).f(m97.E, vy4.c);
            } else if (z2) {
                ((pz9) yzf.q()).f(m97.D, 35);
            } else {
                yy9 q7 = yzf.q();
                la0 la06 = x97.M;
                c5b c5b5 = (c5b) q7;
                c5b5.getClass();
                try {
                    obj6 = c5b5.n(la06);
                } catch (IllegalArgumentException unused6) {
                }
                List list = (List) obj6;
                if (list == null) {
                    ((pz9) yzf.q()).f(m97.D, 256);
                } else if (G(256, list)) {
                    ((pz9) yzf.q()).f(m97.D, 256);
                } else if (G(35, list)) {
                    ((pz9) yzf.q()).f(m97.D, 35);
                }
            }
        }
        return yzf.s();
    }

    public final String toString() {
        return "ImageCapture:".concat(g());
    }

    public final void u() {
        ugd ugd = this.t;
        ugd.c();
        ugd.b();
        k9f k9f = this.w;
        if (k9f != null) {
            k9f.b();
        }
    }

    public final hc0 v(je3 je3) {
        this.u.a(je3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.u.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        q13 a = this.g.a();
        a.v = je3;
        return a.h();
    }

    public final hc0 w(hc0 hc0, hc0 hc02) {
        bwd E = E(e(), (z87) this.f, hc0);
        this.u = E;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{E.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        n();
        return hc0;
    }

    public final void x() {
        ugd ugd = this.t;
        ugd.c();
        ugd.b();
        k9f k9f = this.w;
        if (k9f != null) {
            k9f.b();
        }
        D(false);
        d().g((x87) null);
    }
}
