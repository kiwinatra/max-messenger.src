package defpackage;

import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: lyf  reason: default package */
public final class lyf {
    public final jxf a;
    public final ooe b;
    public final lfd c;
    public final hs7 d;

    public lyf(jxf jxf, ooe ooe, lfd lfd, hs7 hs7) {
        this.a = jxf;
        this.d = hs7;
        this.b = ooe;
        this.c = lfd;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, u05] */
    public static kxf b(qf9 qf9) {
        ? obj = new Object();
        obj.o = cvg.A(qf9.f) ? qf9.a.c : qf9.f;
        obj.b = qf9.b;
        obj.c = qf9.d;
        obj.a = qf9.c;
        return new kxf(obj);
    }

    public final pka a(qf9 qf9) {
        yia yia = new yia(jha.q(qf9).g(new kyf(this, 0)), new kyf(this, 1), 3);
        jxf jxf = this.a;
        Objects.requireNonNull(jxf);
        return yia.g(new dxf(jxf, 9)).g(new kyf(this, 3)).j(new pbb(26, this, qf9)).u(LongCompanionObject.MAX_VALUE, new kyf(this, 2)).x(this.c);
    }
}
