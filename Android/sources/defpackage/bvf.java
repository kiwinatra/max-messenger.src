package defpackage;

import java.util.Objects;

/* renamed from: bvf  reason: default package */
public final class bvf {
    public final xme a;

    public bvf() {
        hq hqVar = ((qra) ym.e()).y().c;
        this.a = f6e.a(Float.valueOf(hqVar.g.getFloat("app.extra.text.size.sp", c44.DEFAULT_ASPECT_RATIO)));
        om0 om0 = hqVar.h;
        om0.getClass();
        or7 or7 = new or7(new yu9(12, (Object) this), m58.g, m58.e);
        Objects.requireNonNull(or7, "observer is null");
        try {
            om0.a(new fia(or7));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            hd8.Z(th);
            n54.D(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
