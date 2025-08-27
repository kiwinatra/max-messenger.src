package defpackage;

import android.net.Uri;
import kotlin.Lazy;

/* renamed from: gh4  reason: default package */
public class gh4 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public gh4(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    public ngf a(vk3 vk3) {
        return null;
    }

    public final x23 b() {
        return (x23) this.b.getValue();
    }

    public ngf c(vk3 vk3) {
        return vk3.r() == ((qjd) b()).s() ? new igf(jad.I) : (!vk3.x() || !vk3.A()) ? (!vk3.x() || vk3.A()) ? new mgf(((rtb) ((ttb) this.c.getValue()).a.getValue()).d(vk3, true)) : new igf(qad.J) : new igf(qad.T8);
    }

    public boolean d(vk3 vk3) {
        return true;
    }

    public boolean e(vk3 vk3) {
        return true;
    }

    public z29 f(vk3 vk3) {
        mtb b2 = ((ptb) this.a.getValue()).b(vk3.r());
        String u = vk3.u(((qjd) b()).p(), kl0.c);
        boolean z = vk3.r() == ((qjd) b()).s();
        long r = vk3.r();
        String f = vk3.f();
        if (f != null) {
            return new z29(r, f, hhf.b(vk3.j()), c(vk3), u != null ? Uri.parse(u) : null, vk3.q(), vk3.z(), z, false, d(vk3), e(vk3), b2.b, a(vk3));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
