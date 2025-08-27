package defpackage;

import java.util.concurrent.Callable;

/* renamed from: p6d  reason: default package */
public final /* synthetic */ class p6d implements Callable {
    public final /* synthetic */ z6d a;
    public final /* synthetic */ long b;
    public final /* synthetic */ b89 c;
    public final /* synthetic */ long o;

    public /* synthetic */ p6d(z6d z6d, long j, b89 b89, long j2) {
        this.a = z6d;
        this.b = j;
        this.c = b89;
        this.o = j2;
    }

    public final Object call() {
        return Long.valueOf(this.a.f(this.b, this.o, this.c, false));
    }
}
