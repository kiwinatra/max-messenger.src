package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: uka  reason: default package */
public final class uka extends r2 {
    public final /* synthetic */ int b;
    public final lfd c;
    public final TimeUnit o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uka(oka oka, TimeUnit timeUnit, lfd lfd, int i) {
        super(oka);
        this.b = i;
        this.o = timeUnit;
        this.c = lfd;
    }

    public final void w(cla cla) {
        switch (this.b) {
            case 0:
                this.a.a(new tka(cla, this.o, this.c.b()));
                return;
            default:
                this.a.a(new vka(cla, this.o, this.c));
                return;
        }
    }
}
