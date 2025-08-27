package defpackage;

import java.util.Collections;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: yr3  reason: default package */
public final class yr3 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public yr3(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
    }

    public final Unit a(long j) {
        long j2 = j;
        String name = yr3.class.getName();
        z68.c(name, "remove, id = " + j2, new Object[0]);
        Lazy lazy = this.a;
        ((km3) lazy.getValue()).h(j2, tm3.b, sm3.b);
        ((km3) lazy.getValue()).A(j2, true);
        Duration.Companion companion = Duration.Companion;
        rtb rtb = (rtb) this.d.getValue();
        mtb mtb = new mtb(0, (int) Duration.m1374getInWholeSecondsimpl(DurationKt.toDuration(((qjd) ((x23) this.c.getValue())).m(), DurationUnit.MILLISECONDS)));
        rtb.getClass();
        rtb.l(Collections.singletonMap(Long.valueOf(j), mtb));
        jna jna = (jna) ((rl) this.e.getValue());
        ts3 ts3 = r1;
        ts3 ts32 = new ts3(3, ((ltb) jna.D()).a.n(), j, (String) null, (String) null, (String) null, (String) null);
        ocf.d(jna.E(), ts3, false, 0, 12);
        ((uu3) this.b.getValue()).b(CollectionsKt.listOf(Boxing.boxLong(j)));
        km3 km3 = (km3) lazy.getValue();
        km3.getClass();
        jbd.a(new jm3(0, j, 0, km3), km3.n, (x6) null, new zb2(12), (lfd) null);
        ((sv0) this.f.getValue()).c(new zu3(j));
        return Unit.INSTANCE;
    }
}
