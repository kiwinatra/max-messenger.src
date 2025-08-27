package defpackage;

import kotlin.Lazy;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: rk  reason: default package */
public final class rk {
    public static final /* synthetic */ KProperty[] k = {rae.s(rk.class, "invalidateCacheJob", "getInvalidateCacheJob()Lkotlinx/coroutines/Job;", 0)};
    public final String a = rk.class.getName();
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final jx3 h;
    public final wie i;
    public final boolean j;

    public rk(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, fn4 fn4, gaf gaf) {
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        this.e = lazy4;
        this.f = lazy5;
        this.g = lazy6;
        this.h = e14.a(((osa) gaf).a().plus(new qk(this)));
        this.i = o5a.U();
        this.j = fn4.b().compareTo(kn4.v) >= 0;
    }

    public final boolean a() {
        if (!((hq) ((fq) this.c.getValue())).g.getBoolean("app.media.animoji.enabled", this.j)) {
            return false;
        }
        akd akd = (akd) ((bud) this.b.getValue());
        akd.getClass();
        return akd.m(PmsKey.f19chatanimojienabled, false);
    }
}
