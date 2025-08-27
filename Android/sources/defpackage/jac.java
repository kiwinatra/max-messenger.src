package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.reflect.KProperty;

/* renamed from: jac  reason: default package */
public final class jac {
    public static final /* synthetic */ KProperty[] e;
    public static final String f;
    public final bud a;
    public final AtomicLong b = new AtomicLong();
    public final hs7 c;
    public final hs7 d;

    static {
        Class<jac> cls = jac.class;
        e = new KProperty[]{wj6.p(cls, "connectionController", "getConnectionController()Lru/ok/tamtam/controllers/ConnectionController;", 0), wj6.p(cls, "device", "getDevice()Lru/ok/tamtam/Device;", 0)};
        f = cls.getName();
    }

    public jac(bud bud, hs7 hs7, hs7 hs72) {
        this.a = bud;
        this.c = hs7;
        this.d = hs72;
    }

    public final fn4 a() {
        KProperty kProperty = e[1];
        return (fn4) this.d.get();
    }
}
