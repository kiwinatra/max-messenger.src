package defpackage;

import android.net.Uri;
import kotlin.Lazy;

/* renamed from: pjb  reason: default package */
public final class pjb {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public pjb(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    public final hhb a(vk3 vk3, boolean z) {
        ngf igf;
        vk3 vk32 = vk3;
        int i = ((ptb) this.c.getValue()).b(vk3.r()).a;
        boolean z2 = i == 10 || i == 20 || i == 40;
        Lazy lazy = this.a;
        String u = vk32.u(((qjd) ((x23) lazy.getValue())).p(), kl0.c);
        if (vk3.x()) {
            igf = new igf(qad.J);
        } else {
            CharSequence d = ((rtb) this.b.getValue()).d(vk32, true);
            igf = (d == null || d.length() == 0) ? new igf(jra.G) : new mgf(d);
        }
        ngf ngf = igf;
        long s = z ? ((qjd) ((x23) lazy.getValue())).s() ^ vk3.r() : vk3.r();
        long r = vk3.r();
        long r2 = vk3.r();
        String f = vk3.f();
        if (f != null) {
            return new hhb(r, r2, f, ngf, u != null ? Uri.parse(u) : null, z2, vk3.z(), new dkb(s, ckb.b), vk3.q());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
