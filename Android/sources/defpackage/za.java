package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.HttpHost;

/* renamed from: za  reason: default package */
public final class za {
    public final m57 a;
    public final List b;
    public final List c;
    public final o9a d;
    public final SocketFactory e;
    public final SSLSocketFactory f;
    public final HostnameVerifier g;
    public final wy1 h;
    public final sq6 i;
    public final Proxy j;
    public final ProxySelector k;

    public za(String str, int i2, o9a o9a, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, wy1 wy1, sq6 sq6, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        this.d = o9a;
        this.e = socketFactory;
        this.f = sSLSocketFactory;
        this.g = hostnameVerifier;
        this.h = wy1;
        this.i = sq6;
        this.j = proxy;
        this.k = proxySelector;
        sd3 sd3 = new sd3();
        sd3.r(sSLSocketFactory != null ? "https" : HttpHost.DEFAULT_SCHEME_NAME);
        sd3.l(str);
        sd3.o(i2);
        this.a = sd3.c();
        this.b = u0g.v(list);
        this.c = u0g.v(list2);
    }

    public final boolean a(za zaVar) {
        return Intrinsics.areEqual((Object) this.d, (Object) zaVar.d) && Intrinsics.areEqual((Object) this.i, (Object) zaVar.i) && Intrinsics.areEqual((Object) this.b, (Object) zaVar.b) && Intrinsics.areEqual((Object) this.c, (Object) zaVar.c) && Intrinsics.areEqual((Object) this.k, (Object) zaVar.k) && Intrinsics.areEqual((Object) this.j, (Object) zaVar.j) && Intrinsics.areEqual((Object) this.f, (Object) zaVar.f) && Intrinsics.areEqual((Object) this.g, (Object) zaVar.g) && Intrinsics.areEqual((Object) this.h, (Object) zaVar.h) && this.a.f == zaVar.a.f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof za) {
            za zaVar = (za) obj;
            return Intrinsics.areEqual((Object) this.a, (Object) zaVar.a) && a(zaVar);
        }
    }

    public final int hashCode() {
        int d2 = g63.d(527, 31, this.a.j);
        int hashCode = this.i.hashCode();
        int i2 = rae.i(this.c, rae.i(this.b, (hashCode + ((this.d.hashCode() + d2) * 31)) * 31, 31), 31);
        int hashCode2 = Objects.hashCode(this.j);
        int hashCode3 = Objects.hashCode(this.f);
        int hashCode4 = Objects.hashCode(this.g);
        return Objects.hashCode(this.h) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((this.k.hashCode() + i2) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        m57 m57 = this.a;
        sb.append(m57.e);
        sb.append(':');
        sb.append(m57.f);
        sb.append(", ");
        Proxy proxy = this.j;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.k;
        }
        return wj6.n(sb, str, "}");
    }
}
