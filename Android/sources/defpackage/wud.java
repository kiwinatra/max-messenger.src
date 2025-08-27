package defpackage;

import java.util.concurrent.ExecutorService;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: wud  reason: default package */
public final class wud extends gud {
    public static long c = Duration.Companion.m1456getZEROUwyO8pc();
    public static final /* synthetic */ int o = 0;
    public final boolean b;

    public wud(boolean z) {
        this.b = z;
    }

    public final ExecutorService k(aua aua, kn4 kn4) {
        ExecutorService f = aua.f(10, "logout");
        f.submit(new gc(12));
        return f;
    }

    public final boolean x() {
        return true;
    }

    public final void z() {
        Class<wud> cls = wud.class;
        String name = cls.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            Duration.Companion companion = Duration.Companion;
            a67.d(w78, name, a81.m("process ", Duration.m1402toStringimpl(Duration.m1388minusLRDsOJo(DurationKt.toDuration(System.nanoTime(), DurationUnit.NANOSECONDS), c))), (Throwable) null);
        }
        Duration.Companion companion2 = Duration.Companion;
        long nanoTime = System.nanoTime();
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long duration = DurationKt.toDuration(nanoTime, durationUnit);
        hud hud = this.a;
        if (hud == null) {
            hud = null;
        }
        ((m98) hud.l0.getValue()).a(this.b);
        u().c(new ij0());
        String name2 = cls.getName();
        a67 a672 = z68.b;
        if (a672 != null && a672.c()) {
            a672.d(w78.o, name2, a81.m("process finish ", Duration.m1402toStringimpl(Duration.m1388minusLRDsOJo(DurationKt.toDuration(System.nanoTime(), durationUnit), duration))), (Throwable) null);
        }
    }
}
