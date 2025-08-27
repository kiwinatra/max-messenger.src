package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: du7  reason: default package */
public final class du7 {
    public final doa a;
    public final fq b;
    public final int c = 5;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;

    public du7() {
        sjd sjd = sjd.a;
        doa e2 = sjd.e();
        hq hqVar = ((ltb) sjd.u()).c;
        Lazy lazy = rjd.a;
        Lazy h = sjd.getAccessor().h(v13.class);
        Lazy lazy2 = LazyKt.lazy(new ck7(10));
        Lazy lazy3 = LazyKt.lazy(new ck7(11));
        Lazy lazy4 = rjd.a;
        this.a = e2;
        this.b = hqVar;
        this.d = h;
        this.e = lazy2;
        this.f = lazy3;
        this.g = lazy4;
    }

    public static void b(int i, Function0 function0) {
        long nanoTime = System.nanoTime();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, "LibraryUpgradeHelper", a81.j(i, "Upgrade to ", " started"), (Throwable) null);
        }
        function0.invoke();
        a67 a672 = z68.b;
        if (a672 != null && a672.c()) {
            w78 w78 = w78.o;
            Duration.Companion companion = Duration.Companion;
            String r0 = Duration.m1402toStringimpl(DurationKt.toDuration(System.nanoTime() - nanoTime, DurationUnit.NANOSECONDS));
            a672.d(w78, "LibraryUpgradeHelper", "Upgrade to " + i + " complete. It takes " + r0, (Throwable) null);
        }
    }

    public final void a() {
        pid pid = (pid) this.b;
        int i = pid.g.getInt("app.library.version", 5);
        int i2 = this.c;
        if (i == i2) {
            z68.c("LibraryUpgradeHelper", "upgrade not needed", new Object[0]);
            return;
        }
        if (this.a.e()) {
            if (i < 1) {
                b(1, new au7(this, 0));
            }
            if (i <= 1 && i2 > 1) {
                b(2, new au7(this, 1));
            }
            if (i <= 3 && i2 > 3) {
                b(4, new au7(this, 2));
            }
            if (i <= 4 && i2 > 4) {
                b(5, new au7(this, 3));
            }
        }
        pid.j(i2, "app.library.version");
    }
}
