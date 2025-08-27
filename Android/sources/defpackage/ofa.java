package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ofa  reason: default package */
public final /* synthetic */ class ofa implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qfa b;
    public final /* synthetic */ long c;

    public /* synthetic */ ofa(qfa qfa, long j, int i) {
        this.a = i;
        this.b = qfa;
        this.c = j;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                return this.b.c().D(this.c);
            default:
                return this.b.c().G(this.c);
        }
    }
}
