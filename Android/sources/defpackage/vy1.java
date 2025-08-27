package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: vy1  reason: default package */
public final class vy1 extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vy1(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public List a() {
        Proxy proxy = (Proxy) this.c;
        if (proxy != null) {
            return CollectionsKt.listOf(proxy);
        }
        URI h = ((m57) this.o).h();
        if (h.getHost() == null) {
            return u0g.k(Proxy.NO_PROXY);
        }
        List<Proxy> select = ((za) ((sb0) this.b).e).k.select(h);
        Collection collection = select;
        return (collection == null || collection.isEmpty()) ? u0g.k(Proxy.NO_PROXY) : u0g.v(select);
    }

    public final Object invoke() {
        List w;
        switch (this.a) {
            case 0:
                iq iqVar = ((wy1) this.b).b;
                List list = (List) this.c;
                if (!(iqVar == null || (w = iqVar.w((String) this.o, list)) == null)) {
                    list = w;
                }
                Iterable<Certificate> iterable = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                for (Certificate certificate : iterable) {
                    if (certificate != null) {
                        arrayList.add((X509Certificate) certificate);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                }
                return arrayList;
            case 1:
                return ((wy1) this.b).b.w(((za) this.o).a.e, ((jw6) this.c).a());
            default:
                return a();
        }
    }
}
