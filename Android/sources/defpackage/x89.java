package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: x89  reason: default package */
public final /* synthetic */ class x89 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ x89(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        k2b k2b = (k2b) obj;
        switch (this.a) {
            case 0:
                return new k2g(0, this.b ? k2b.a().e().c.n : k2b.a().i().c.n);
            case 1:
                return new k2g(0, this.b ? k2b.a().e().c.l : k2b.a().i().c.l);
            default:
                return new k2g(0, this.b ? k2b.getIcon().a.c : k2b.a().l().b.a);
        }
    }
}
