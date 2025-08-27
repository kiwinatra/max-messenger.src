package defpackage;

import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import android.view.View;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;

/* renamed from: fm3  reason: default package */
public final /* synthetic */ class fm3 implements za3, r8f, eo1, vu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ fm3(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public void a() {
        gk4 gk4 = (gk4) this.a;
        Executor executor = (Executor) this.b;
        w5g w5g = (w5g) this.c;
        gy0 gy0 = (gy0) this.o;
        if (gk4.r) {
            Objects.requireNonNull(w5g);
            executor.execute(new ne4(5, w5g));
            p94.a();
            return;
        }
        synchronized (gk4.o) {
            try {
                cs csVar = gk4.l;
                if (csVar != null) {
                    gy0.v(new ck4(gk4, csVar, 1));
                    gk4.l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zz7 apply(Object obj) {
        zz7 zz7;
        u6f u6f = (u6f) this.a;
        CameraDevice cameraDevice = (CameraDevice) this.b;
        hwd hwd = (hwd) this.c;
        List list = (List) this.o;
        List list2 = (List) obj;
        if (u6f.u.b) {
            Iterator it = u6f.b.e().iterator();
            while (it.hasNext()) {
                ((t6f) it.next()).j();
            }
        }
        synchronized (u6f.a) {
            try {
                if (u6f.l) {
                    zz7 = new xa7(1, new CancellationException("Opener is disabled"));
                } else {
                    kq9 kq9 = u6f.b;
                    synchronized (kq9.b) {
                        ((LinkedHashSet) kq9.v).add(u6f);
                    }
                    go1 F = m5a.F(new fm3(u6f, list, new grg(cameraDevice), hwd));
                    u6f.g = F;
                    hd8.a(F, new p1e((Object) u6f), ryg.j());
                    zz7 = hd8.J(u6f.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zz7;
    }

    public void b(pa3 pa3) {
        km3 km3 = (km3) this.a;
        km3.getClass();
        fo3 fo3 = (fo3) this.b;
        km3.C(Collections.singletonList(fo3), (tm3) this.o);
        rtb rtb = (rtb) km3.l.get();
        long j = fo3.a;
        mtb l = qe8.l((ntb) this.c);
        rtb.getClass();
        rtb.l(Collections.singletonMap(Long.valueOf(j), l));
        pa3.b();
    }

    public void k(o8f o8f, int i) {
        c2b c2b = (c2b) this.a;
        int selectedTabPosition = c2b.getSelectedTabPosition();
        View view = o8f.f;
        b2b b2b = view instanceof b2b ? (b2b) view : null;
        he heVar = (he) this.b;
        y16 y16 = (y16) ((List) heVar.o).get(i);
        woa woa = new woa(y16.a, y16.b, i == selectedTabPosition ? voa.a : voa.b, new soa(y16.d.a), (Drawable) null, (Drawable) null);
        if (b2b != null) {
            b2b.setTabItem(woa);
        } else {
            b2b b2b2 = new b2b(c2b.getContext());
            b2b2.setIndicatorVisible(heVar.b);
            b2b2.setTabItem(woa);
            o8f.a(b2b2);
        }
        if (((Boolean) ((Function1) this.c).invoke(woa)).booleanValue()) {
            o8f.h.setOnLongClickListener(new yb1(7, (Function2) this.o, woa));
        }
        q8f q8f = o8f.h;
        float f = (float) 13;
        q8f.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), q8f.getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), q8f.getPaddingBottom());
        q8f q8f2 = o8f.h;
        u3b.a(q8f2, new cf(22, q8f2, heVar));
    }

    public Object r(do1 do1) {
        boolean z;
        String str;
        int i;
        t6f t6f = (t6f) this.a;
        List list = (List) this.b;
        grg grg = (grg) this.c;
        hwd hwd = (hwd) this.o;
        synchronized (t6f.a) {
            try {
                synchronized (t6f.a) {
                    synchronized (t6f.a) {
                        try {
                            List<lk4> list2 = t6f.j;
                            if (list2 != null) {
                                for (lk4 b2 : list2) {
                                    b2.b();
                                }
                                t6f.j = null;
                            }
                        } catch (DeferrableSurface$SurfaceClosedException e) {
                            for (int i2 = i - 1; i2 >= 0; i2--) {
                                ((lk4) list.get(i2)).b();
                            }
                            throw e;
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    z = false;
                    if (!list.isEmpty()) {
                        i = 0;
                        do {
                            ((lk4) list.get(i)).d();
                            i++;
                        } while (i < list.size());
                    }
                    t6f.j = list;
                }
                if (t6f.h == null) {
                    z = true;
                }
                bs0.r("The openCaptureSessionCompleter can only set once!", z);
                t6f.h = do1;
                fu1 fu1 = (fu1) grg.b;
                fu1.getClass();
                SessionConfiguration sessionConfiguration = hwd.a.a;
                sessionConfiguration.getClass();
                ((CameraDevice) fu1.b).createCaptureSession(sessionConfiguration);
                str = "openCaptureSession[session=" + t6f + "]";
            } catch (CameraAccessException e2) {
                throw new CameraAccessExceptionCompat(e2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
