package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ika  reason: default package */
public final class ika extends r2 {
    public final long b;
    public final TimeUnit c;
    public final lfd o;
    public final boolean v;

    public ika(oka oka, long j, TimeUnit timeUnit, lfd lfd, boolean z) {
        super(oka);
        this.b = j;
        this.c = timeUnit;
        this.o = lfd;
        this.v = z;
    }

    public final void w(cla cla) {
        btd btd = new btd(cla);
        boolean z = this.v;
        oka oka = this.a;
        if (z) {
            oka.a(new fka(btd, this.b, this.c, this.o));
            return;
        }
        oka.a(new hka(btd, this.b, this.c, this.o));
    }
}
