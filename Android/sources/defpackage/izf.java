package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: izf  reason: default package */
public final class izf implements fzf {
    public final kzf a = new kzf();
    public final Lazy b;

    public izf(Lazy lazy) {
        this.b = LazyKt.lazy(new a2d(11, lazy));
    }

    public final ma3 a(bxf bxf) {
        return new qa3(0, new hzf(1, this, bxf));
    }

    public final ma3 b(long j) {
        return new qa3(0, new dr1((Object) this, j, 10));
    }

    public final ma3 c(kxf kxf) {
        return new qa3(0, new gzf(this, kxf));
    }

    public final ma3 clear() {
        return new qa3(0, new jrf(5, (Object) this));
    }

    public final nh8 d(kxf kxf) {
        return new sh8(0, new gzf(this, kxf));
    }

    public final ma3 e(String str) {
        return new qa3(0, new hzf(0, this, str));
    }

    public final nh8 f() {
        wyf wyf = wyf.UNKNOWN;
        return new sh8(0, new pbb(this));
    }
}
