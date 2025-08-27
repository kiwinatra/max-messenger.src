package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.ui.common.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: jnb  reason: default package */
public final class jnb extends m0 {
    public final z59 A;
    public qx0 B;
    public r2f C;
    public boolean D;
    public a00 E;
    public cy3 F;
    public HashSet G;
    public qa7 H;
    public qa7 I;
    public final fe4 y;
    public final a00 z;

    public jnb(Resources resources, pk4 pk4, xc4 xc4, ExecutorService executorService, zqd zqd, a00 a00) {
        super(pk4, executorService);
        this.y = new fe4(resources, xc4);
        this.z = a00;
        this.A = zqd;
    }

    public static vdd s(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof vdd) {
            return (vdd) drawable;
        }
        if (drawable instanceof uu4) {
            return s(((uu4) drawable).j());
        }
        if (drawable instanceof ks) {
            ks ksVar = (ks) drawable;
            int length = ksVar.c.length;
            for (int i = 0; i < length; i++) {
                vdd s = s(ksVar.a(i));
                if (s != null) {
                    return s;
                }
            }
        }
        return null;
    }

    public static Drawable u(a00 a00, v33 v33) {
        Drawable a;
        if (a00 == null) {
            return null;
        }
        Iterator it = a00.iterator();
        while (it.hasNext()) {
            tu4 tu4 = (tu4) it.next();
            if (tu4.b(v33) && (a = tu4.a(v33)) != null) {
                return a;
            }
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    public final Drawable b(Object obj) {
        y33 y33 = (y33) obj;
        try {
            tf6.P();
            cvg.q(y33.m0(y33));
            v33 v33 = (v33) y33.e0();
            v(v33);
            Drawable u = u(this.E, v33);
            if (u == null) {
                u = u(this.z, v33);
                if (u == null) {
                    u = this.y.a(v33);
                    if (u == null) {
                        throw new UnsupportedOperationException("Unrecognized image class: " + v33);
                    }
                }
            }
            tf6.P();
            return u;
        } catch (Throwable th) {
            tf6.P();
            throw th;
        }
    }

    public final k97 e(Object obj) {
        y33 y33 = (y33) obj;
        cvg.q(y33.m0(y33));
        return ((v33) y33.e0()).getImageInfo();
    }

    public final synchronized void t(ImagePerfDataListener imagePerfDataListener, p0 p0Var) {
        try {
            cy3 cy3 = this.F;
            if (cy3 != null) {
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cy3.h;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                cy3.r(false);
                ((d) cy3.d).n1();
            }
            if (imagePerfDataListener != null) {
                if (this.F == null) {
                    this.F = new cy3(AwakeTimeSinceBootClock.get(), this);
                }
                cy3 cy32 = this.F;
                if (((CopyOnWriteArrayList) cy32.h) == null) {
                    cy32.h = new CopyOnWriteArrayList();
                }
                ((CopyOnWriteArrayList) cy32.h).add(imagePerfDataListener);
                this.F.r(true);
            }
            this.H = (qa7) p0Var.e;
            this.I = (qa7) p0Var.f;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final String toString() {
        w28 K = hsg.K(this);
        K.x(super.toString(), "super");
        K.x(this.C, "dataSourceSupplier");
        return K.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r1 = s(r1.d);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(defpackage.v33 r4) {
        /*
            r3 = this;
            boolean r0 = r3.D
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.graphics.drawable.Drawable r0 = r3.i
            if (r0 != 0) goto L_0x0023
            h94 r0 = new h94
            r0.<init>()
            t97 r1 = new t97
            r1.<init>(r0)
            r3.a(r1)
            r3.i = r0
            sp6 r1 = r3.h
            if (r1 == 0) goto L_0x0023
            z7d r1 = r1.d
            r1.v = r0
            r1.invalidateSelf()
        L_0x0023:
            android.graphics.drawable.Drawable r0 = r3.i
            boolean r1 = r0 instanceof defpackage.h94
            if (r1 == 0) goto L_0x007a
            h94 r0 = (defpackage.h94) r0
            java.lang.String r1 = r3.j
            r0.getClass()
            if (r1 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            java.lang.String r1 = "none"
        L_0x0035:
            r0.a = r1
            r0.invalidateSelf()
            sp6 r1 = r3.h
            r2 = 0
            if (r1 == 0) goto L_0x004a
            z7d r1 = r1.d
            vdd r1 = s(r1)
            if (r1 == 0) goto L_0x004a
            xdd r1 = r1.v
            goto L_0x004b
        L_0x004a:
            r1 = r2
        L_0x004b:
            r0.v = r1
            java.lang.Object r3 = r3.k
            if (r3 != 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            java.lang.String r2 = r3.toString()
        L_0x0056:
            if (r2 == 0) goto L_0x005f
            java.util.HashMap r3 = r0.w
            java.lang.String r1 = "cc"
            r3.put(r1, r2)
        L_0x005f:
            if (r4 == 0) goto L_0x0077
            int r3 = r4.getWidth()
            int r1 = r4.getHeight()
            r0.b = r3
            r0.c = r1
            r0.invalidateSelf()
            int r3 = r4.getSizeInBytes()
            r0.o = r3
            goto L_0x007a
        L_0x0077:
            r0.b()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jnb.v(v33):void");
    }

    public final void w(lv4 lv4) {
        if (bg5.a.a(2)) {
            bg5.h(m0.x, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.j, lv4);
        }
        this.a.a(lv4 != null ? jv4.a : jv4.b);
        if (this.m) {
            this.b.q(this);
            n();
        }
        sp6 sp6 = this.h;
        if (sp6 != null) {
            z7d z7d = sp6.d;
            z7d.v = null;
            z7d.invalidateSelf();
            this.h = null;
        }
        if (lv4 != null) {
            if (lv4 instanceof sp6) {
                sp6 sp62 = (sp6) lv4;
                this.h = sp62;
                z7d z7d2 = sp62.d;
                z7d2.v = (h94) this.i;
                z7d2.invalidateSelf();
            } else {
                throw new IllegalArgumentException();
            }
        }
        v((v33) null);
    }
}
