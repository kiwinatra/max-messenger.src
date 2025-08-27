package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.ranges.RangesKt;

/* renamed from: t5e  reason: default package */
public final class t5e implements dn4 {
    public static final Lazy y = LazyKt.lazy(LazyThreadSafetyMode.NONE, new red(24));
    public final Lazy a;
    public final Lazy b;
    public final jx3 c;
    public int o;
    public boolean v;
    public aje w;
    public final etc x;

    public t5e(Lazy lazy, Lazy lazy2) {
        this.a = lazy2;
        this.b = lazy;
        long nanoTime = System.nanoTime();
        this.c = e14.a(((osa) ((gaf) lazy2.getValue())).a());
        this.x = new etc(f6e.a(CollectionsKt.listOf(new o94(nanoTime, new igf(flc.oneme_settings_send_logs), cad.c, (ngf) null, (ev0) null, 24))));
    }

    public final ome a() {
        return this.x;
    }

    public final void b(o94 o94) {
        aje aje = this.w;
        if (aje == null || !aje.isActive()) {
            this.w = ev0.v(this.c, ((osa) ((gaf) this.a.getValue())).b(), (f14) null, new s5e(this, (Continuation) null), 2);
            return;
        }
        e0b e0b = (e0b) tm4.a.getAccessor().g(e0b.class);
        e0b.i("Логи уже скачиваются");
        if (this.v) {
            e0b.b((CharSequence) ((List) y.getValue()).get(RangesKt.coerceAtMost(this.o, 3)));
        }
        e0b.j();
        this.o++;
    }
}
