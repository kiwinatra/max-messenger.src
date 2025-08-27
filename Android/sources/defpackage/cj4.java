package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: cj4  reason: default package */
public final class cj4 extends iqf {
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final SparseArray R;
    public final SparseBooleanArray S;

    public cj4(Context context) {
        i(context);
        j(context);
        this.R = new SparseArray();
        this.S = new SparseBooleanArray();
        g();
    }

    public final void a(dqf dqf) {
        this.A.put(dqf.a, dqf);
    }

    public final kqf b() {
        return new ej4(this);
    }

    public final iqf c() {
        super.c();
        return this;
    }

    public final iqf f(int i, int i2) {
        super.f(i, i2);
        return this;
    }

    public final void g() {
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = true;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = true;
        this.Q = false;
    }

    public final iqf h(String[] strArr) {
        this.n = iqf.e(strArr);
        return this;
    }

    public final void i(Context context) {
        CaptioningManager captioningManager;
        int i = v0g.a;
        if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.u = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.t = tb7.t(i >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
    }

    public final void j(Context context) {
        Point point;
        int i = v0g.a;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        int displayId = display.getDisplayId();
        int i2 = v0g.a;
        if (displayId == 0 && v0g.P(context)) {
            String G2 = i2 < 28 ? v0g.G("sys.display-size") : v0g.G("vendor.display-size");
            if (!TextUtils.isEmpty(G2)) {
                try {
                    String[] split = G2.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            point = new Point(parseInt, parseInt2);
                            f(point.x, point.y);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                i8b.o("Invalid display size: " + G2);
            }
            if ("Sony".equals(v0g.c) && v0g.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                f(point.x, point.y);
            }
        }
        point = new Point();
        if (i2 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else {
            display.getRealSize(point);
        }
        f(point.x, point.y);
    }

    public cj4(ej4 ej4) {
        d(ej4);
        this.C = ej4.i0;
        this.D = ej4.j0;
        this.E = ej4.k0;
        this.F = ej4.l0;
        this.G = ej4.m0;
        this.H = ej4.n0;
        this.I = ej4.o0;
        this.J = ej4.p0;
        this.K = ej4.q0;
        this.L = ej4.r0;
        this.M = ej4.s0;
        this.N = ej4.t0;
        this.O = ej4.u0;
        this.P = ej4.v0;
        this.Q = ej4.w0;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = ej4.x0;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.R = sparseArray;
                this.S = ej4.y0.clone();
                return;
            }
        }
    }

    public cj4() {
        this.R = new SparseArray();
        this.S = new SparseBooleanArray();
        g();
    }
}
