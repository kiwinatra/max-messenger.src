package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c9d  reason: default package */
public final class c9d {
    public final za a;
    public final Proxy b;
    public final InetSocketAddress c;

    public c9d(za zaVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.a = zaVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c9d) {
            c9d c9d = (c9d) obj;
            return Intrinsics.areEqual((Object) c9d.a, (Object) this.a) && Intrinsics.areEqual((Object) c9d.b, (Object) this.b) && Intrinsics.areEqual((Object) c9d.c, (Object) this.c);
        }
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
