package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: fj4  reason: default package */
public final class fj4 extends hqf {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final SparseArray M;
    public final SparseBooleanArray N;
    public boolean z;

    public fj4() {
        this.M = new SparseArray();
        this.N = new SparseBooleanArray();
        b();
    }

    public final hqf a(int i, int i2) {
        super.a(i, i2);
        return this;
    }

    public final void b() {
        this.z = true;
        this.A = false;
        this.B = true;
        this.C = false;
        this.D = true;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = true;
        this.K = false;
        this.L = true;
    }

    public final hqf c(String[] strArr) {
        qb7 o = tb7.o();
        for (String str : strArr) {
            str.getClass();
            o.a(t0g.E(str));
        }
        this.n = o.j();
        return this;
    }

    public final void d(Context context) {
        CaptioningManager captioningManager;
        int i = t0g.a;
        if (i < 19) {
            return;
        }
        if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.t = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.s = tb7.t(i >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
    }

    public final void e(int i, tpf tpf, gj4 gj4) {
        SparseArray sparseArray = this.M;
        Map map = (Map) sparseArray.get(i);
        if (map == null) {
            map = new HashMap();
            sparseArray.put(i, map);
        }
        if (!map.containsKey(tpf) || !t0g.a(map.get(tpf), gj4)) {
            map.put(tpf, gj4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = (android.hardware.display.DisplayManager) r9.getSystemService("display");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.content.Context r9) {
        /*
            r8 = this;
            int r0 = defpackage.t0g.a
            r1 = 0
            r2 = 17
            if (r0 < r2) goto L_0x0016
            java.lang.String r3 = "display"
            java.lang.Object r3 = r9.getSystemService(r3)
            android.hardware.display.DisplayManager r3 = (android.hardware.display.DisplayManager) r3
            if (r3 == 0) goto L_0x0016
            android.view.Display r3 = r3.getDisplay(r1)
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            if (r3 != 0) goto L_0x0028
            java.lang.String r3 = "window"
            java.lang.Object r3 = r9.getSystemService(r3)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            r3.getClass()
            android.view.Display r3 = r3.getDefaultDisplay()
        L_0x0028:
            int r4 = r3.getDisplayId()
            if (r4 != 0) goto L_0x00aa
            boolean r4 = defpackage.t0g.C(r9)
            if (r4 == 0) goto L_0x00aa
            r4 = 28
            if (r0 >= r4) goto L_0x003f
            java.lang.String r4 = "sys.display-size"
            java.lang.String r4 = defpackage.t0g.z(r4)
            goto L_0x0045
        L_0x003f:
            java.lang.String r4 = "vendor.display-size"
            java.lang.String r4 = defpackage.t0g.z(r4)
        L_0x0045:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x0080
            java.lang.String r5 = r4.trim()     // Catch:{ NumberFormatException -> 0x0071 }
            java.lang.String r6 = "x"
            r7 = -1
            java.lang.String[] r5 = r5.split(r6, r7)     // Catch:{ NumberFormatException -> 0x0071 }
            int r6 = r5.length     // Catch:{ NumberFormatException -> 0x0071 }
            r7 = 2
            if (r6 != r7) goto L_0x0071
            r1 = r5[r1]     // Catch:{ NumberFormatException -> 0x0071 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0071 }
            r6 = 1
            r5 = r5[r6]     // Catch:{ NumberFormatException -> 0x0071 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0071 }
            if (r1 <= 0) goto L_0x0071
            if (r5 <= 0) goto L_0x0071
            android.graphics.Point r6 = new android.graphics.Point     // Catch:{ NumberFormatException -> 0x0071 }
            r6.<init>(r1, r5)     // Catch:{ NumberFormatException -> 0x0071 }
            goto L_0x00cd
        L_0x0071:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x0080
            java.lang.String r4 = "Invalid display size: "
            r4.concat(r1)
        L_0x0080:
            java.lang.String r1 = "Sony"
            java.lang.String r4 = defpackage.t0g.c
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00aa
            java.lang.String r1 = defpackage.t0g.d
            java.lang.String r4 = "BRAVIA"
            boolean r1 = r1.startsWith(r4)
            if (r1 == 0) goto L_0x00aa
            android.content.pm.PackageManager r9 = r9.getPackageManager()
            java.lang.String r1 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r9 = r9.hasSystemFeature(r1)
            if (r9 == 0) goto L_0x00aa
            android.graphics.Point r6 = new android.graphics.Point
            r9 = 3840(0xf00, float:5.381E-42)
            r0 = 2160(0x870, float:3.027E-42)
            r6.<init>(r9, r0)
            goto L_0x00cd
        L_0x00aa:
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>()
            r9 = 23
            if (r0 < r9) goto L_0x00c4
            android.view.Display$Mode r9 = r3.getMode()
            int r0 = r9.getPhysicalWidth()
            r6.x = r0
            int r9 = r9.getPhysicalHeight()
            r6.y = r9
            goto L_0x00cd
        L_0x00c4:
            if (r0 < r2) goto L_0x00ca
            r3.getRealSize(r6)
            goto L_0x00cd
        L_0x00ca:
            r3.getSize(r6)
        L_0x00cd:
            int r9 = r6.x
            int r0 = r6.y
            r8.a(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj4.f(android.content.Context):void");
    }

    public fj4(Context context) {
        d(context);
        f(context);
        this.M = new SparseArray();
        this.N = new SparseBooleanArray();
        b();
    }

    public fj4(dj4 dj4) {
        this.a = dj4.a;
        this.b = dj4.b;
        this.c = dj4.c;
        this.d = dj4.o;
        this.e = dj4.v;
        this.f = dj4.w;
        this.g = dj4.x;
        this.h = dj4.y;
        this.i = dj4.z;
        this.j = dj4.X;
        this.k = dj4.Y;
        this.l = dj4.Z;
        this.m = dj4.v0;
        this.n = dj4.w0;
        this.o = dj4.x0;
        this.p = dj4.y0;
        this.q = dj4.z0;
        this.r = dj4.A0;
        this.s = dj4.B0;
        this.t = dj4.C0;
        this.u = dj4.D0;
        this.v = dj4.E0;
        this.w = dj4.F0;
        this.x = dj4.G0;
        this.y = dj4.H0;
        this.I = dj4.I0;
        this.z = dj4.J0;
        this.A = dj4.K0;
        this.B = dj4.L0;
        this.C = dj4.M0;
        this.D = dj4.N0;
        this.E = dj4.O0;
        this.F = dj4.P0;
        this.G = dj4.Q0;
        this.H = dj4.R0;
        this.J = dj4.S0;
        this.K = dj4.T0;
        this.L = dj4.U0;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = dj4.V0;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.M = sparseArray;
                this.N = dj4.W0.clone();
                return;
            }
        }
    }
}
