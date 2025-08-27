package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.reflect.KProperty;

/* renamed from: iue  reason: default package */
public final class iue {
    public static final /* synthetic */ KProperty[] j = {rae.s(iue.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;", 0)};
    public static final fue k = new fue(3, false, (List) null);
    public final Lazy a;
    public final Lazy b;
    public final jx3 c;
    public final xme d;
    public final etc e;
    public final xme f;
    public final AtomicReference g = new AtomicReference(new eue((String) null, 3));
    public aje h;
    public final wie i = o5a.U();

    public iue(gaf gaf, Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
        jx3 a2 = e14.a(((osa) gaf).b());
        this.c = a2;
        xme a3 = f6e.a(k);
        this.d = a3;
        this.e = new etc(a3);
        xme a4 = f6e.a((Object) null);
        this.f = a4;
        bs0.K(new ps5(bs0.v(new eu5(a4, 0), 200), new p2c(2, this, iue.class, "searchSetsByQuery", "searchSetsByQuery(Ljava/lang/String;)V", 4, 13), 5), a2);
    }

    public final boolean a() {
        String str = ((eue) this.g.get()).b;
        return !(str == null || str.length() == 0);
    }
}
