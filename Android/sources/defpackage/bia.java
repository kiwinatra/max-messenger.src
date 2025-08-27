package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bia  reason: default package */
public final class bia extends r2 {
    public final /* synthetic */ int b;
    public final long c;
    public final TimeUnit o;
    public final lfd v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bia(oka oka, long j, TimeUnit timeUnit, lfd lfd, int i) {
        super(oka);
        this.b = i;
        this.c = j;
        this.o = timeUnit;
        this.v = lfd;
    }

    public final void w(cla cla) {
        switch (this.b) {
            case 0:
                this.a.a(new aia(new btd(cla), this.c, this.o, this.v.b()));
                return;
            default:
                this.a.a(new ska(new btd(cla), this.c, this.o, this.v.b()));
                return;
        }
    }
}
