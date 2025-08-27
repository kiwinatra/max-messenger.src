package defpackage;

import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: qx6  reason: default package */
public final class qx6 implements dn4 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final jx3 v;
    public aje w;
    public final etc x;

    public qx6(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy3;
        this.c = lazy2;
        this.o = lazy4;
        long nanoTime = System.nanoTime();
        this.v = e14.a(((osa) ((gaf) lazy3.getValue())).a());
        this.x = new etc(f6e.a(CollectionsKt.listOf(new o94(nanoTime, new igf(flc.oneme_settings_dump_heap), cad.c, (ngf) null, (ev0) null, 24))));
    }

    public final ome a() {
        return this.x;
    }

    public final void b(o94 o94) {
        aje aje = this.w;
        if (aje == null || !aje.isActive()) {
            this.w = ev0.v(this.v, ((osa) ((gaf) this.b.getValue())).b(), (f14) null, new px6(this, (Continuation) null), 2);
            return;
        }
        e0b e0b = (e0b) this.o.getValue();
        e0b.i("Дамп памяти уже происходит, нужно немного подождать");
        e0b.j();
    }
}
