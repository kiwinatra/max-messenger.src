package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: e3g  reason: default package */
public final /* synthetic */ class e3g implements Function2 {
    public final /* synthetic */ g3g a;
    public final /* synthetic */ n7g b;
    public final /* synthetic */ g4g c;
    public final /* synthetic */ h3g o;

    public /* synthetic */ e3g(g3g g3g, n7g n7g, g4g g4g, h3g h3g) {
        this.a = g3g;
        this.b = n7g;
        this.c = g4g;
        this.o = h3g;
    }

    public final Object invoke(Object obj, Object obj2) {
        o00 o00 = (o00) obj;
        long longValue = ((Long) obj2).longValue();
        boolean z = o00 instanceof ybe;
        String str = this.a.a;
        n7g n7g = this.b;
        this.o.b.invoke(new f3g(longValue, str, o00, n7g.F0(), z ? 0 : n7g.G0(), this.c.c()));
        return Unit.INSTANCE;
    }
}
