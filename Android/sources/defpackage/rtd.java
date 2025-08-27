package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: rtd  reason: default package */
public final class rtd implements dn4 {
    public final ngf a;
    public final PmsKey b;
    public final int c;
    public final Lazy o;
    public final Lazy v;
    public final long w;
    public final xme x;
    public final etc y;

    public rtd(mgf mgf, PmsKey pmsKey, int i) {
        this.a = mgf;
        this.b = pmsKey;
        this.c = i;
        rn4 rn4 = rn4.a;
        this.o = rn4.getAccessor().h(xjd.class);
        this.v = rn4.getAccessor().h(akd.class);
        this.w = cw0.a.incrementAndGet();
        xme a2 = f6e.a(d());
        this.x = a2;
        this.y = new etc(a2);
    }

    public final ome a() {
        return this.y;
    }

    public final void b(o94 o94) {
        if (o94.a == this.w) {
            Lazy lazy = this.o;
            PmsKey pmsKey = this.b;
            boolean m = ((xjd) lazy.getValue()).m(pmsKey, false);
            xjd xjd = (xjd) lazy.getValue();
            xjd.getClass();
            xjd.i(pmsKey.name(), !m);
            this.x.setValue(d());
        }
    }

    public final List d() {
        PmsKey pmsKey = this.b;
        n94 n94 = new n94(((xjd) this.o.getValue()).m(pmsKey, false));
        mgf mgf = new mgf(i2a.i("Server: ", ((akd) this.v.getValue()).g.getBoolean(pmsKey.name(), false)));
        return CollectionsKt.listOf(new o94(this.w, this.a, this.c, mgf, n94));
    }

    public rtd(String str, PmsKey pmsKey) {
        this(new mgf(str), pmsKey, 0);
    }
}
