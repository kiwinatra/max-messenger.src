package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.List;
import java.util.Objects;

/* renamed from: ud0  reason: default package */
public final /* synthetic */ class ud0 implements qk3, vu, i08, h08, vp8, hs6, p4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ud0(int i, k0d k0d) {
        this.a = 7;
        this.b = i;
        this.c = k0d;
    }

    public void a(is6 is6, gs6 gs6, long j) {
        qrf qrf = (qrf) this.c;
        int i = this.b;
        qrf.getClass();
        p94.a();
        zj4 zj4 = qrf.y0;
        zj4.getClass();
        m53 m53 = qrf.b;
        synchronized (zj4) {
            try {
                n79.n(v0g.l(zj4.g, i));
                yj4 yj4 = (yj4) zj4.g.get(i);
                n79.n(!yj4.b);
                m53 m532 = m53.h;
                if (zj4.l == null) {
                    zj4.l = m53;
                }
                n79.m("Mixing different ColorInfos is not supported.", zj4.l.equals(m53));
                zj4.d.getClass();
                Float valueOf = Float.valueOf(1.0f);
                Float valueOf2 = Float.valueOf(c44.DEFAULT_ASPECT_RATIO);
                yj4.a.add(new xj4(is6, gs6, j, new g6d(Pair.create(valueOf2, valueOf2), Pair.create(valueOf2, valueOf2), Pair.create(valueOf, valueOf), 12)));
                if (i == zj4.o) {
                    zj4.c();
                } else {
                    zj4.e(yj4);
                }
                zj4.f.v(new uj4(zj4, 2));
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) obj;
                int i = this.b;
                drawable.setBounds(0, 0, i, i);
                drawable.draw((Canvas) this.c);
                return;
            case 1:
                ce8 ce8 = (ce8) obj;
                vd8 vd8 = (vd8) this.c;
                vd8.c.put(Integer.valueOf(this.b), ce8);
                wsb wsb = (wsb) vd8.d.b;
                if (ce8 == null) {
                    wsb.f0((be8) null);
                    return;
                } else {
                    wsb.f0(ce8.a);
                    return;
                }
            default:
                w62 w62 = (w62) obj;
                ((r62) this.c).getClass();
                int i2 = this.b;
                w62.m = i2;
                if (i2 == 0) {
                    w62.N = false;
                    w62.O = false;
                    return;
                }
                return;
        }
    }

    public zz7 apply(Object obj) {
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        ks1 ks1 = (ks1) this.c;
        ks1.getClass();
        if (u40.g(this.b, totalCaptureResult)) {
            ks1.g = ks1.k;
        }
        return ks1.i.a(totalCaptureResult);
    }

    public void c(np8 np8) {
        if (np8.isConnected()) {
            k0d k0d = np8.p;
            List list = (List) this.c;
            np8.o = tb7.p(list);
            k0d a2 = e63.a(list, np8.q, np8.t);
            np8.p = a2;
            boolean equals = Objects.equals(a2, k0d);
            boolean z = true;
            boolean z2 = !equals;
            qo8 qo8 = np8.a;
            qo8.getClass();
            if (Looper.myLooper() != qo8.v.getLooper()) {
                z = false;
            }
            n79.n(z);
            oo8 oo8 = qo8.o;
            oo8.getClass();
            ya7 s = oo8.s();
            if (z2) {
                oo8.g();
            }
            np8.c1(this.b, s);
        }
    }

    public boolean e(View view) {
        int i = SideSheetBehavior.x;
        ((SideSheetBehavior) this.c).w(this.b);
        return true;
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 4:
                ((sob) obj).f0(((eob) this.c).a, this.b);
                return;
            case 5:
                ((rob) obj).B((gr8) this.c, this.b);
                return;
            default:
                ((sob) obj).H(this.b, (ir8) this.c);
                return;
        }
    }

    public /* synthetic */ ud0(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
