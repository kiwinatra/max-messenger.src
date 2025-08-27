package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: qga  reason: default package */
public final class qga extends ProxySelector {
    public static final qga a = new ProxySelector();

    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public final List select(URI uri) {
        if (uri != null) {
            return CollectionsKt.listOf(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
