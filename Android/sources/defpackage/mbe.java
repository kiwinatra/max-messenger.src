package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* renamed from: mbe  reason: default package */
public final class mbe implements dn4 {
    public final Function0 a;
    public final long b;
    public final etc c;

    public mbe(mgf mgf, int i, pjd pjd) {
        this.a = pjd;
        long incrementAndGet = cw0.a.incrementAndGet();
        this.b = incrementAndGet;
        this.c = new etc(f6e.a(CollectionsKt.listOf(new o94(incrementAndGet, mgf, i, (ngf) null, l94.m, 8))));
    }

    public final ome a() {
        return this.c;
    }

    public final void b(o94 o94) {
        if (o94.a == this.b) {
            this.a.invoke();
        }
    }
}
