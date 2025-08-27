package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: tk4  reason: default package */
public final class tk4 implements ofe {
    public ofe a;
    public final sk4 b;

    public tk4(sk4 sk4) {
        this.b = sk4;
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.b.a(sSLSocket);
    }

    public final boolean b() {
        return true;
    }

    public final String c(SSLSocket sSLSocket) {
        ofe e = e(sSLSocket);
        if (e != null) {
            return e.c(sSLSocket);
        }
        return null;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        ofe e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized ofe e(SSLSocket sSLSocket) {
        try {
            if (this.a == null && this.b.a(sSLSocket)) {
                this.a = this.b.b(sSLSocket);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.a;
    }
}
