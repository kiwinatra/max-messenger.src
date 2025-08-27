package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: vzf  reason: default package */
public abstract class vzf {
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public int c = 2;
    public zzf d;
    public zzf e;
    public zzf f;
    public hc0 g;
    public zzf h;
    public Rect i;
    public Matrix j = new Matrix();
    public su1 k;
    public su1 l;
    public fwd m = fwd.a();
    public fwd n = fwd.a();

    public vzf(zzf zzf) {
        this.e = zzf;
        this.f = zzf;
    }

    public void A(Rect rect) {
        this.i = rect;
    }

    public final void B(su1 su1) {
        x();
        synchronized (this.b) {
            try {
                su1 su12 = this.k;
                if (su1 == su12) {
                    this.a.remove(su12);
                    this.k = null;
                }
                su1 su13 = this.l;
                if (su1 == su13) {
                    this.a.remove(su13);
                    this.l = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.g = null;
        this.i = null;
        this.f = this.e;
        this.d = null;
        this.h = null;
    }

    public final void C(List list) {
        if (!list.isEmpty()) {
            this.m = (fwd) list.get(0);
            if (list.size() > 1) {
                this.n = (fwd) list.get(1);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (lk4 lk4 : ((fwd) it.next()).b()) {
                    if (lk4.j == null) {
                        lk4.j = getClass();
                    }
                }
            }
        }
    }

    public final void a(su1 su1, su1 su12, zzf zzf, zzf zzf2) {
        synchronized (this.b) {
            this.k = su1;
            this.l = su12;
            this.a.add(su1);
            if (su12 != null) {
                this.a.add(su12);
            }
        }
        this.d = zzf;
        this.h = zzf2;
        this.f = m(su1.n(), this.d, this.h);
        q();
    }

    public final int b() {
        return ((Integer) ((x97) this.f).k(x97.H, -1)).intValue();
    }

    public final su1 c() {
        su1 su1;
        synchronized (this.b) {
            su1 = this.k;
        }
        return su1;
    }

    public final au1 d() {
        synchronized (this.b) {
            try {
                su1 su1 = this.k;
                if (su1 == null) {
                    zt1 zt1 = au1.a;
                    return zt1;
                }
                au1 f2 = su1.f();
                return f2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String e() {
        su1 c2 = c();
        bs0.q(c2, "No camera attached to use case: " + this);
        return c2.n().e();
    }

    public abstract zzf f(boolean z, c0g c0g);

    public final String g() {
        zzf zzf = this.f;
        String str = (String) zzf.k(cdf.g0, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int h(su1 su1, boolean z) {
        int m2 = su1.n().m(((x97) this.f).Y(0));
        return (su1.l() || !z) ? m2 : grf.h(-m2);
    }

    public final su1 i() {
        su1 su1;
        synchronized (this.b) {
            su1 = this.l;
        }
        return su1;
    }

    public Set j() {
        return Collections.emptySet();
    }

    public abstract yzf k(je3 je3);

    public final boolean l(su1 su1) {
        int intValue = ((Integer) ((x97) this.f).k(x97.I, -1)).intValue();
        if (intValue == -1 || intValue == 0) {
            return false;
        }
        if (intValue == 1) {
            return true;
        }
        if (intValue == 2) {
            return su1.n().h() == 0;
        }
        throw new AssertionError(wj6.h(intValue, "Unknown mirrorMode: "));
    }

    public final zzf m(qu1 qu1, zzf zzf, zzf zzf2) {
        pz9 pz9;
        if (zzf2 != null) {
            pz9 = pz9.d(zzf2);
            pz9.a.remove(cdf.g0);
        } else {
            pz9 = pz9.c();
        }
        boolean u = this.e.u(x97.F);
        TreeMap treeMap = pz9.a;
        if (u || this.e.u(x97.J)) {
            la0 la0 = x97.N;
            if (treeMap.containsKey(la0)) {
                treeMap.remove(la0);
            }
        }
        zzf zzf3 = this.e;
        la0 la02 = x97.N;
        if (zzf3.u(la02)) {
            la0 la03 = x97.L;
            if (treeMap.containsKey(la03) && ((w3d) this.e.n(la02)).b != null) {
                treeMap.remove(la03);
            }
        }
        for (la0 I : this.e.l()) {
            je3.I(pz9, pz9, this.e, I);
        }
        if (zzf != null) {
            for (la0 la04 : zzf.l()) {
                if (!la04.a.equals(cdf.g0.a)) {
                    je3.I(pz9, pz9, zzf, la04);
                }
            }
        }
        if (treeMap.containsKey(x97.J)) {
            la0 la05 = x97.F;
            if (treeMap.containsKey(la05)) {
                treeMap.remove(la05);
            }
        }
        la0 la06 = x97.N;
        if (treeMap.containsKey(la06) && ((w3d) pz9.n(la06)).c != 0) {
            pz9.f(zzf.p0, Boolean.TRUE);
        }
        return s(qu1, k(pz9));
    }

    public final void n() {
        this.c = 1;
        p();
    }

    public final void o() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((uzf) it.next()).d(this);
        }
    }

    public final void p() {
        int y = tr1.y(this.c);
        HashSet hashSet = this.a;
        if (y == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((uzf) it.next()).e(this);
            }
        } else if (y == 1) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((uzf) it2.next()).o(this);
            }
        }
    }

    public void q() {
    }

    public void r() {
    }

    public abstract zzf s(qu1 qu1, yzf yzf);

    public void t() {
    }

    public void u() {
    }

    public abstract hc0 v(je3 je3);

    public abstract hc0 w(hc0 hc0, hc0 hc02);

    public void x() {
    }

    public void y(Matrix matrix) {
        this.j = new Matrix(matrix);
    }

    public final boolean z(int i2) {
        Size size;
        int Y = ((x97) this.f).Y(-1);
        if (Y != -1 && Y == i2) {
            return false;
        }
        yzf k2 = k(this.e);
        x97 x97 = (x97) k2.s();
        int Y2 = x97.Y(-1);
        if (Y2 == -1 || Y2 != i2) {
            ((d87) k2).e(i2);
        }
        if (!(Y2 == -1 || i2 == -1 || Y2 == i2)) {
            if (Math.abs(kne.N(i2) - kne.N(Y2)) % 180 == 90 && (size = (Size) x97.k(x97.J, (Object) null)) != null) {
                ((d87) k2).d(new Size(size.getHeight(), size.getWidth()));
            }
        }
        this.e = k2.s();
        su1 c2 = c();
        if (c2 == null) {
            this.f = this.e;
            return true;
        }
        this.f = m(c2.n(), this.d, this.h);
        return true;
    }
}
