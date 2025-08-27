package defpackage;

import java.net.Socket;
import kotlin.Lazy;

/* renamed from: jwd  reason: default package */
public final class jwd implements r23 {
    public final Lazy a;

    public jwd(Lazy lazy) {
        this.a = lazy;
    }

    public final ni3 a() {
        return k().a();
    }

    public final void b(Socket socket) {
        k().b(socket);
    }

    public final int c() {
        return k().c();
    }

    public final void close() {
        k().close();
    }

    public final Socket connect() {
        return k().connect();
    }

    public final boolean d() {
        return k().d();
    }

    public final void e() {
        k().e();
    }

    public final void f(boolean z) {
        k().f(z);
    }

    public final long g(int i) {
        return k().g(i);
    }

    public final String h() {
        return k().h();
    }

    public final eh3 j() {
        return k().j();
    }

    public final r23 k() {
        return (r23) this.a.getValue();
    }
}
