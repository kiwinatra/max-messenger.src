package defpackage;

import java.util.UUID;

/* renamed from: jq9  reason: default package */
public final class jq9 implements zzf {
    public final pz9 a;

    public jq9() {
        pz9 c = pz9.c();
        c.f(zzf.l0, new Object());
        c.f(m97.D, 34);
        Class<kq9> cls = kq9.class;
        c.f(cdf.h0, cls);
        c.f(cdf.g0, cls.getCanonicalName() + "-" + UUID.randomUUID());
        this.a = c;
    }

    public final b0g O() {
        return b0g.w;
    }

    public final je3 getConfig() {
        return this.a;
    }
}
