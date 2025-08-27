package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gd4  reason: default package */
public final class gd4 extends xi0 {
    public final jtb j;
    public volatile List k = new ArrayList();
    public int l = 0;
    public final AtomicBoolean m = new AtomicBoolean();

    public gd4(jtb jtb, fn4 fn4, rh3 rh3, ni3 ni3, lfd lfd, cm cmVar, die die) {
        super(fn4, rh3, ni3, cmVar, die);
        this.j = jtb;
        q();
    }

    public final int c() {
        return Integer.valueOf(p().b).intValue();
    }

    public final void close() {
    }

    public final Socket connect() {
        try {
            Socket connect = super.connect();
            this.l = 0;
            return connect;
        } catch (Exception e) {
            synchronized (this) {
                this.l = (this.l + 1) % this.k.size();
                throw e;
            }
        }
    }

    public final void f(boolean z) {
        this.m.set(z);
    }

    public final String h() {
        return p().a;
    }

    public final int i() {
        return 15000;
    }

    public final Socket l(pfe pfe, String str, int i) {
        z68.c("gd4", "createConnection", new Object[0]);
        int i2 = 3000;
        while (this.m.get()) {
            Socket m2 = xi0.m(pfe);
            z68.c("gd4", "try to connect socket, timeout=%dms, max=%dms ...", Integer.valueOf(i2), 15000);
            long currentTimeMillis = System.currentTimeMillis();
            try {
                k(m2, str, i, i2);
                return m2;
            } catch (ConnectException | SocketTimeoutException e) {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                xi0.o(m2);
                if (i2 < 15000) {
                    z68.n("gd4", e, "socket failed to connect, after=%dms (timeout=%dms), try again ...", Long.valueOf(currentTimeMillis2), Integer.valueOf(i2));
                    i2 += 1000;
                } else {
                    throw e;
                }
            } catch (IOException e2) {
                xi0.o(m2);
                throw e2;
            } catch (Throwable th) {
                xi0.o(m2);
                throw new IOException("Failed to create connection", th);
            }
        }
        z68.c("xi0", "releaseSocketSafely", new Object[0]);
        throw new InterruptedIOException("Socket connection canceled");
    }

    public final synchronized ph3 p() {
        return (ph3) this.k.get(this.l);
    }

    public final synchronized void q() {
        List list;
        try {
            this.k.clear();
            ph3 s = b59.s(((ltb) this.j).a);
            if (s != null) {
                z68.c("gd4", "default host = %s", s.toString());
                this.k.add(s);
            }
            this.a.e();
            this.k.addAll(b59.B(((ltb) this.j).a));
            this.k.addAll(this.g);
            List list2 = this.k;
            if (list2.size() <= 1) {
                list = Collections.unmodifiableList(list2);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object next : list2) {
                    if (!arrayList.contains(next)) {
                        arrayList.add(next);
                    }
                }
                list = arrayList;
            }
            this.k = list;
            this.l = 0;
        } finally {
            while (true) {
            }
        }
    }
}
