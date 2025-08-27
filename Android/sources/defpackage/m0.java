package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.ForwardingControllerListener2;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: m0  reason: default package */
public abstract class m0 implements gv4, ok4, aq6 {
    public static final Map v = xb7.a("component_tag", "drawee");
    public static final Map w = xb7.b(HasExtraData.KEY_ORIGIN, "memory_bitmap", HasExtraData.KEY_ORIGIN_SUBCATEGORY, "shortcut");
    public static final Class x = m0.class;
    public final kv4 a;
    public final pk4 b;
    public final Executor c;
    public q77 d;
    public bq6 e;
    public jy3 f;
    public final ForwardingControllerListener2 g;
    public sp6 h;
    public Drawable i;
    public String j;
    public Object k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public i0 q;
    public Object r;
    public boolean s;
    public boolean t;
    public Drawable u;

    public m0(pk4 pk4, ExecutorService executorService) {
        this.a = kv4.c ? new kv4() : kv4.b;
        this.g = new ForwardingControllerListener2();
        this.s = true;
        this.t = false;
        this.b = pk4;
        this.c = executorService;
        g((Object) null, (String) null);
    }

    public final void a(jy3 jy3) {
        jy3.getClass();
        jy3 jy32 = this.f;
        if (jy32 instanceof l0) {
            ((l0) jy32).g(jy3);
        } else if (jy32 != null) {
            if (tf6.X()) {
                tf6.e("AbstractDraweeController#createInternal");
            }
            l0 l0Var = new l0();
            l0Var.g(jy32);
            l0Var.g(jy3);
            if (tf6.X()) {
                tf6.C();
            }
            this.f = l0Var;
        } else {
            this.f = jy3;
        }
    }

    public abstract Drawable b(Object obj);

    public final Animatable c() {
        Drawable drawable = this.u;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    public final jy3 d() {
        jy3 jy3 = this.f;
        return jy3 == null ? bj0.a : jy3;
    }

    public abstract k97 e(Object obj);

    public final sp6 f() {
        sp6 sp6 = this.h;
        if (sp6 != null) {
            return sp6;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.k);
    }

    public final synchronized void g(Object obj, String str) {
        pk4 pk4;
        try {
            tf6.P();
            this.a.a(jv4.w);
            if (!this.s && (pk4 = this.b) != null) {
                pk4.q(this);
            }
            this.l = false;
            o();
            this.o = false;
            q77 q77 = this.d;
            if (q77 != null) {
                q77.b = false;
                q77.a = 4;
                q77.c = 0;
            }
            bq6 bq6 = this.e;
            if (bq6 != null) {
                bq6.a = null;
                bq6.c = false;
                bq6.d = false;
                bq6.a = this;
            }
            jy3 jy3 = this.f;
            if (jy3 instanceof l0) {
                l0 l0Var = (l0) jy3;
                synchronized (l0Var) {
                    l0Var.a.clear();
                }
            } else {
                this.f = null;
            }
            sp6 sp6 = this.h;
            if (sp6 != null) {
                sp6.f.o(sp6.a);
                sp6.g();
                z7d z7d = this.h.d;
                z7d.v = null;
                z7d.invalidateSelf();
                this.h = null;
            }
            this.i = null;
            if (bg5.a.a(2)) {
                bg5.h(x, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.j, str);
            }
            this.j = str;
            this.k = obj;
            tf6.P();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final boolean h(String str, i0 i0Var) {
        if (i0Var == null && this.q == null) {
            return true;
        }
        return str.equals(this.j) && i0Var == this.q && this.m;
    }

    public final void i(String str, Throwable th) {
        if (bg5.a.a(2)) {
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.j;
            if (bg5.a.a(2)) {
                x.getSimpleName();
                String.format((Locale) null, "controller %x %s: %s: failure: %s", new Object[]{valueOf, str2, str, th});
            }
        }
    }

    public final void j(Object obj, String str) {
        if (bg5.a.a(2)) {
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.j;
            String simpleName = obj != null ? obj.getClass().getSimpleName() : "<null>";
            y33 y33 = (y33) obj;
            int i2 = 0;
            if (y33 != null && y33.k0()) {
                i2 = System.identityHashCode(y33.b.b());
            }
            Object[] objArr = {valueOf, str2, str, simpleName, Integer.valueOf(i2)};
            if (bg5.a.a(2)) {
                x.getSimpleName();
                String.format((Locale) null, "controller %x %s: %s: image: %s %x", objArr);
            }
        }
    }

    public final ControllerListener2.Extras k(Map map, Map map2, Uri uri) {
        String str;
        PointF pointF;
        sp6 sp6 = this.h;
        if (sp6 instanceof sp6) {
            str = String.valueOf(!(sp6.e(2) instanceof vdd) ? null : sp6.f(2).v);
            pointF = !(sp6.e(2) instanceof vdd) ? null : sp6.f(2).x;
        } else {
            pointF = null;
            str = null;
        }
        sp6 sp62 = this.h;
        Rect bounds = sp62 == null ? null : sp62.d.getBounds();
        Object obj = this.k;
        boolean z = this.t;
        ControllerListener2.Extras extras = new ControllerListener2.Extras();
        if (bounds != null) {
            extras.viewportWidth = bounds.width();
            extras.viewportHeight = bounds.height();
        }
        extras.scaleType = str;
        if (pointF != null) {
            extras.focusX = Float.valueOf(pointF.x);
            extras.focusY = Float.valueOf(pointF.y);
        }
        extras.callerContext = obj;
        extras.logWithHighSamplingRate = z;
        extras.mainUri = uri;
        extras.datasourceExtras = map;
        extras.imageExtras = map2;
        extras.shortcutExtras = w;
        extras.componentExtras = v;
        extras.imageSourceExtras = null;
        return extras;
    }

    public final void l(String str, i0 i0Var, Throwable th, boolean z) {
        Drawable drawable;
        tf6.P();
        if (!h(str, i0Var)) {
            i("ignore_old_datasource @ onFailure", th);
            i0Var.a();
            tf6.P();
            return;
        }
        this.a.a(z ? jv4.v0 : jv4.w0);
        ForwardingControllerListener2 forwardingControllerListener2 = this.g;
        if (z) {
            i("final_failed @ onFailure", th);
            this.q = null;
            this.n = true;
            sp6 sp6 = this.h;
            if (sp6 != null) {
                if (!this.o || (drawable = this.u) == null) {
                    boolean q2 = q();
                    ig5 ig5 = sp6.e;
                    if (q2) {
                        ig5.A0++;
                        sp6.c();
                        if (ig5.a(4) != null) {
                            sp6.b(4);
                        } else {
                            sp6.b(1);
                        }
                        ig5.c();
                    } else {
                        ig5.A0++;
                        sp6.c();
                        if (ig5.a(5) != null) {
                            sp6.b(5);
                        } else {
                            sp6.b(1);
                        }
                        ig5.c();
                    }
                } else {
                    sp6.j(drawable, 1.0f, true);
                }
            }
            ControllerListener2.Extras k2 = k(i0Var == null ? null : i0Var.a, (Map) null, (Uri) null);
            d().b(this.j, th);
            forwardingControllerListener2.onFailure(this.j, th, k2);
        } else {
            i("intermediate_failed @ onFailure", th);
            d().f(this.j, th);
            forwardingControllerListener2.onIntermediateImageFailed(this.j);
        }
        tf6.P();
    }

    public final void m(String str, i0 i0Var, Object obj, float f2, boolean z, boolean z2, boolean z3) {
        Drawable b2;
        Object obj2;
        Drawable drawable;
        try {
            tf6.P();
            if (!h(str, i0Var)) {
                j(obj, "ignore_old_datasource @ onNewResult");
                y33.U((y33) obj);
                i0Var.a();
                tf6.P();
                return;
            }
            this.a.a(z ? jv4.Y : jv4.Z);
            try {
                b2 = b(obj);
                obj2 = this.r;
                drawable = this.u;
                this.r = obj;
                this.u = b2;
                if (z) {
                    j(obj, "set_final_result @ onNewResult");
                    this.q = null;
                    f().j(b2, 1.0f, z2);
                    k97 e2 = e(obj);
                    d().a(str, e2, c());
                    this.g.onFinalImageSet(str, e2, k(i0Var == null ? null : i0Var.a, e2 == null ? null : e2.getExtras(), (Uri) null));
                } else if (z3) {
                    j(obj, "set_temporary_result @ onNewResult");
                    f().j(b2, 1.0f, z2);
                    k97 e3 = e(obj);
                    d().a(str, e3, c());
                    this.g.onFinalImageSet(str, e3, k(i0Var == null ? null : i0Var.a, e3 == null ? null : e3.getExtras(), (Uri) null));
                } else {
                    j(obj, "set_intermediate_result @ onNewResult");
                    f().j(b2, f2, z2);
                    k97 e4 = e(obj);
                    d().e(str, e4);
                    this.g.onIntermediateImageSet(str, e4);
                }
                if (!(drawable == null || drawable == b2)) {
                    if (drawable instanceof bv4) {
                        ((bv4) drawable).a();
                    }
                }
                if (!(obj2 == null || obj2 == obj)) {
                    j(obj2, "release_previous_result @ onNewResult");
                    y33.U((y33) obj2);
                }
                tf6.P();
            } catch (Exception e5) {
                j(obj, "drawable_failed @ onNewResult");
                y33.U((y33) obj);
                l(str, i0Var, e5, z);
                tf6.P();
            }
        } catch (Throwable th) {
            tf6.P();
            throw th;
        }
    }

    public final void n() {
        this.a.a(jv4.z);
        q77 q77 = this.d;
        if (q77 != null) {
            q77.c = 0;
        }
        bq6 bq6 = this.e;
        if (bq6 != null) {
            bq6.c = false;
            bq6.d = false;
        }
        sp6 sp6 = this.h;
        if (sp6 != null) {
            sp6.f.o(sp6.a);
            sp6.g();
        }
        o();
    }

    public final void o() {
        Map map;
        Map map2;
        boolean z = this.m;
        this.m = false;
        this.n = false;
        i0 i0Var = this.q;
        if (i0Var != null) {
            map = i0Var.a;
            i0Var.a();
            this.q = null;
        } else {
            map = null;
        }
        Drawable drawable = this.u;
        if (drawable != null && (drawable instanceof bv4)) {
            ((bv4) drawable).a();
        }
        if (this.p != null) {
            this.p = null;
        }
        this.u = null;
        Object obj = this.r;
        if (obj != null) {
            k97 e2 = e(obj);
            map2 = e2 == null ? null : e2.getExtras();
            j(this.r, "release");
            y33.U((y33) this.r);
            this.r = null;
        } else {
            map2 = null;
        }
        if (z) {
            d().d(this.j);
            this.g.onRelease(this.j, k(map, map2, (Uri) null));
        }
    }

    public final void p(i0 i0Var, k97 k97) {
        d().c(this.k, this.j);
        String str = this.j;
        Object obj = this.k;
        jnb jnb = (jnb) this;
        qa7 qa7 = jnb.H;
        qa7 qa72 = jnb.I;
        Map map = null;
        Uri uri = qa7 != null ? qa7.b : null;
        if (uri == null) {
            uri = qa72 != null ? qa72.b : null;
        }
        Map map2 = i0Var == null ? null : i0Var.a;
        if (k97 != null) {
            map = k97.getExtras();
        }
        this.g.onSubmit(str, obj, k(map2, map, uri));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r1 = this;
            boolean r0 = r1.n
            if (r0 == 0) goto L_0x0014
            q77 r1 = r1.d
            if (r1 == 0) goto L_0x0014
            boolean r0 = r1.b
            if (r0 == 0) goto L_0x0014
            int r0 = r1.c
            int r1 = r1.a
            if (r0 >= r1) goto L_0x0014
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0.q():boolean");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r() {
        /*
            r8 = this;
            defpackage.tf6.P()
            r0 = r8
            jnb r0 = (defpackage.jnb) r0
            defpackage.tf6.P()
            z59 r1 = r0.A     // Catch:{ all -> 0x0031 }
            r2 = 0
            if (r1 == 0) goto L_0x002c
            qx0 r3 = r0.B     // Catch:{ all -> 0x0031 }
            if (r3 != 0) goto L_0x0013
            goto L_0x002c
        L_0x0013:
            y33 r1 = r1.get(r3)     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0034
            java.lang.Object r3 = r1.e0()     // Catch:{ all -> 0x0031 }
            v33 r3 = (defpackage.v33) r3     // Catch:{ all -> 0x0031 }
            tac r3 = r3.getQualityInfo()     // Catch:{ all -> 0x0031 }
            bc7 r3 = (defpackage.bc7) r3     // Catch:{ all -> 0x0031 }
            boolean r3 = r3.c     // Catch:{ all -> 0x0031 }
            if (r3 != 0) goto L_0x0034
            r1.close()     // Catch:{ all -> 0x0031 }
        L_0x002c:
            defpackage.tf6.P()
            r3 = r2
            goto L_0x0038
        L_0x0031:
            r8 = move-exception
            goto L_0x00e5
        L_0x0034:
            defpackage.tf6.P()
            r3 = r1
        L_0x0038:
            r1 = 0
            r4 = 1
            if (r3 == 0) goto L_0x006e
            defpackage.tf6.P()
            r8.q = r2
            r8.m = r4
            r8.n = r1
            kv4 r1 = r8.a
            jv4 r2 = defpackage.jv4.B0
            r1.a(r2)
            i0 r1 = r8.q
            k97 r2 = r8.e(r3)
            r8.p(r1, r2)
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            java.lang.String r1 = r8.j
            i0 r2 = r8.q
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            r6 = 1
            r7 = 1
            r0 = r8
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            defpackage.tf6.P()
            defpackage.tf6.P()
            return
        L_0x006b:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            throw r8
        L_0x006e:
            kv4 r3 = r8.a
            jv4 r5 = defpackage.jv4.X
            r3.a(r5)
            sp6 r3 = r8.h
            r5 = 0
            r3.m(r5, r4)
            r8.m = r4
            r8.n = r1
            defpackage.tf6.P()
            cg5 r1 = defpackage.bg5.a
            r3 = 2
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L_0x009a
            int r1 = java.lang.System.identityHashCode(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Class<jnb> r4 = defpackage.jnb.class
            java.lang.String r5 = "controller %x: getDataSource"
            defpackage.bg5.f(r4, r1, r5)
        L_0x009a:
            r2f r0 = r0.C
            java.lang.Object r0 = r0.get()
            i0 r0 = (defpackage.i0) r0
            defpackage.tf6.P()
            r8.q = r0
            r8.p(r0, r2)
            cg5 r0 = defpackage.bg5.a
            boolean r0 = r0.a(r3)
            if (r0 == 0) goto L_0x00cd
            java.lang.Class r0 = x
            java.lang.String r1 = "controller %x %s: submitRequest: dataSource: %x"
            int r2 = java.lang.System.identityHashCode(r8)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = r8.j
            i0 r4 = r8.q
            int r4 = java.lang.System.identityHashCode(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            defpackage.bg5.h(r0, r1, r2, r3, r4)
        L_0x00cd:
            java.lang.String r0 = r8.j
            i0 r1 = r8.q
            boolean r1 = r1.f()
            k0 r2 = new k0
            r2.<init>(r8, r0, r1)
            i0 r0 = r8.q
            java.util.concurrent.Executor r8 = r8.c
            r0.m(r2, r8)
            defpackage.tf6.P()
            return
        L_0x00e5:
            defpackage.tf6.P()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0.r():void");
    }

    public String toString() {
        w28 K = hsg.K(this);
        K.w("isAttached", this.l);
        K.w("isRequestSubmitted", this.m);
        K.w("hasFetchFailed", this.n);
        y33 y33 = (y33) this.r;
        int i2 = 0;
        if (y33 != null && y33.k0()) {
            i2 = System.identityHashCode(y33.b.b());
        }
        K.v(i2, "fetchedImage");
        K.x(this.a.a.toString(), "events");
        return K.toString();
    }
}
