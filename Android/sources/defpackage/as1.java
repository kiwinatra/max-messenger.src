package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: as1  reason: default package */
public final class as1 implements qu1 {
    public final String a;
    public final qt1 b;
    public final y35 c;
    public final Object d = new Object();
    public lr1 e;
    public zr1 f = null;
    public zr1 g = null;
    public final zr1 h;
    public ArrayList i = null;
    public final ykb j;
    public final gy k;

    public as1(vu1 vu1, String str) {
        str.getClass();
        this.a = str;
        qt1 a2 = vu1.a(str);
        this.b = a2;
        y35 y35 = new y35(9, false);
        y35.b = this;
        this.c = y35;
        ykb w = cjf.w(a2);
        this.j = w;
        this.k = new gy(str, w);
        this.h = new zr1(new fa0(5, (ga0) null));
    }

    public final u08 a() {
        return this.h;
    }

    public final Set b() {
        return ((zy4) b8d.i(this.b).a).b();
    }

    public final int c() {
        return m(0);
    }

    public final boolean d() {
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String e() {
        return this.a;
    }

    public final u08 f() {
        synchronized (this.d) {
            try {
                lr1 lr1 = this.e;
                if (lr1 == null) {
                    if (this.f == null) {
                        this.f = new zr1(0);
                    }
                    zr1 zr1 = this.f;
                    return zr1;
                }
                zr1 zr12 = this.f;
                if (zr12 != null) {
                    return zr12;
                }
                fz9 fz9 = lr1.j.b;
                return fz9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int h() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.LENS_FACING);
        bs0.m("Unable to get the lens facing of the camera.", num != null);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(a81.j(intValue, "The given lens facing integer: ", " can not be recognized."));
    }

    public final xjf i() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? xjf.a : xjf.b;
    }

    public final String k() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.util.Size[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.util.Size[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List l(int r5) {
        /*
            r4 = this;
            qt1 r4 = r4.b
            tgg r4 = r4.b()
            java.lang.Object r0 = r4.o
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r1 = r0.containsKey(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0034
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r0.get(r4)
            android.util.Size[] r4 = (android.util.Size[]) r4
            if (r4 != 0) goto L_0x0022
            goto L_0x005d
        L_0x0022:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r0.get(r4)
            android.util.Size[] r4 = (android.util.Size[]) r4
            java.lang.Object r4 = r4.clone()
            r2 = r4
            android.util.Size[] r2 = (android.util.Size[]) r2
            goto L_0x005d
        L_0x0034:
            java.lang.Object r1 = r4.a
            nob r1 = (defpackage.nob) r1
            java.lang.Object r1 = r1.a
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1
            android.util.Size[] r1 = r1.getHighResolutionOutputSizes(r5)
            if (r1 == 0) goto L_0x004d
            int r3 = r1.length
            if (r3 <= 0) goto L_0x004d
            java.lang.Object r4 = r4.b
            wsb r4 = (defpackage.wsb) r4
            android.util.Size[] r1 = r4.H(r1, r5)
        L_0x004d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0.put(r4, r1)
            if (r1 == 0) goto L_0x005d
            java.lang.Object r4 = r1.clone()
            r2 = r4
            android.util.Size[] r2 = (android.util.Size[]) r2
        L_0x005d:
            if (r2 == 0) goto L_0x0064
            java.util.List r4 = java.util.Arrays.asList(r2)
            goto L_0x0068
        L_0x0064:
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0068:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as1.l(int):java.util.List");
    }

    public final int m(int i2) {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        int intValue = num.intValue();
        int N = kne.N(i2);
        boolean z = true;
        if (1 != h()) {
            z = false;
        }
        return kne.x(N, intValue, z);
    }

    public final boolean n() {
        qt1 qt1 = this.b;
        Objects.requireNonNull(qt1);
        return b0h.E(new d9d(26, qt1));
    }

    public final void o(ep4 ep4, hr1 hr1) {
        synchronized (this.d) {
            try {
                lr1 lr1 = this.e;
                if (lr1 == null) {
                    if (this.i == null) {
                        this.i = new ArrayList();
                    }
                    this.i.add(new Pair(hr1, ep4));
                    return;
                }
                lr1.c.execute(new ktg(lr1, ep4, hr1, 14));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final h65 p() {
        return this.k;
    }

    public final ykb q() {
        return this.j;
    }

    public final List r(int i2) {
        Size[] v = this.b.b().v(i2);
        return v != null ? Arrays.asList(v) : Collections.emptyList();
    }

    public final u08 s() {
        synchronized (this.d) {
            try {
                lr1 lr1 = this.e;
                if (lr1 == null) {
                    if (this.g == null) {
                        urg g2 = ce.g(this.b);
                        zrg zrg = new zrg(g2.e(), g2.f());
                        zrg.f(1.0f);
                        this.g = new zr1(db0.e(zrg));
                    }
                    zr1 zr1 = this.g;
                    return zr1;
                }
                zr1 zr12 = this.g;
                if (zr12 != null) {
                    return zr12;
                }
                fz9 fz9 = (fz9) lr1.i.v;
                return fz9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(bt1 bt1) {
        synchronized (this.d) {
            try {
                lr1 lr1 = this.e;
                if (lr1 == null) {
                    ArrayList arrayList = this.i;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((Pair) it.next()).first == bt1) {
                                it.remove();
                            }
                        }
                        return;
                    }
                    return;
                }
                lr1.c.execute(new c(28, lr1, bt1));
            } finally {
            }
        }
    }

    public final void u(lr1 lr1) {
        synchronized (this.d) {
            try {
                this.e = lr1;
                zr1 zr1 = this.g;
                if (zr1 != null) {
                    zr1.m((fz9) lr1.i.v);
                }
                zr1 zr12 = this.f;
                if (zr12 != null) {
                    zr12.m(this.e.j.b);
                }
                ArrayList arrayList = this.i;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        lr1 lr12 = this.e;
                        lr12.getClass();
                        lr12.c.execute(new ktg(lr12, (Executor) pair.second, (bt1) pair.first, 14));
                    }
                    this.i = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ((Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).getClass();
    }
}
