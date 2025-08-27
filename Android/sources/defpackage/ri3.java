package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: ri3  reason: default package */
public final class ri3 implements sk4 {
    public final boolean a(SSLSocket sSLSocket) {
        boolean z = qi3.d;
        return oi3.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, ofe] */
    public final ofe b(SSLSocket sSLSocket) {
        return new Object();
    }
}
