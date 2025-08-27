package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Lazy;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import ru.ok.tamtam.ExceptionHandler$HandledException;
import ru.ok.tamtam.api.SessionSendLimitException;

/* renamed from: xvd  reason: default package */
public final class xvd {
    public static final AtomicInteger y = new AtomicInteger(0);
    public final String a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicLong d = new AtomicLong(0);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicInteger h = new AtomicInteger(0);
    public final AtomicLong i = new AtomicLong(0);
    public final int j;
    public final r23 k;
    public final ajd l;
    public final dpa m;
    public Socket n;
    public DataOutputStream o;
    public DataInputStream p;
    public final yh3 q;
    public final fba r;
    public final ConcurrentHashMap s = new ConcurrentHashMap();
    public final List t = Collections.synchronizedList(new ArrayList());
    public final gac u;
    public final AtomicInteger v = new AtomicInteger();
    public final int w;
    public boolean x;

    public xvd(sb0 sb0) {
        this.l = (ajd) sb0.d;
        this.m = (dpa) sb0.g;
        int incrementAndGet = y.incrementAndGet();
        this.j = incrementAndGet;
        String h2 = wj6.h(incrementAndGet, "TTSession#");
        this.a = h2;
        this.k = (r23) sb0.b;
        this.q = (yh3) sb0.f;
        this.r = (fba) sb0.e;
        int max = Math.max(0, sb0.a);
        this.w = max;
        z68.c(h2, "init, sendLimitIfNoSession=%d", Integer.valueOf(max));
        this.u = new gac();
        uvd uvd = new uvd(this);
        mxd mxd = (mxd) sb0.c;
        mxd.a("session-conn-handler", uvd).start();
        mxd.a("session-timeout-handler", new vvd(this, 2)).start();
        mxd.a("session-packet-reader", new vvd(this, 0)).start();
        mxd.a("session-packet-sender", new vvd(this, 1)).start();
    }

    public static boolean a(xvd xvd, f7b f7b, Class cls) {
        xvd.getClass();
        d7b d7b = f7b.b;
        if (d7b == null || !cls.isInstance(d7b.a)) {
            throw new IllegalStateException("wrong usage of method 'containsInPacketReader'");
        }
        for (Map.Entry value : xvd.s.entrySet()) {
            d7b d7b2 = ((c7b) value.getValue()).b.b;
            if (d7b2 != null && cls.isInstance(d7b2.a)) {
                return true;
            }
        }
        return false;
    }

    public static void b(xvd xvd, b7b b7b) {
        synchronized (xvd.t) {
            List list = xvd.t;
            e7b e7b = e7b.b;
            int i2 = bq7.a;
            Duration.Companion companion = Duration.Companion;
            list.add(new f7b(e7b, (d7b) null, DurationKt.toDuration(System.currentTimeMillis(), DurationUnit.MILLISECONDS), b7b));
        }
    }

    public final void c(long j2) {
        z68.c(this.a, "cancel: %d", Long.valueOf(j2));
        synchronized (this.t) {
            try {
                Iterator it = this.t.iterator();
                while (true) {
                    if (it.hasNext()) {
                        f7b f7b = (f7b) it.next();
                        d7b d7b = f7b.b;
                        if (d7b != null && d7b.c.m() == j2) {
                            this.t.remove(f7b);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        for (Map.Entry entry : this.s.entrySet()) {
            if (((c7b) entry.getValue()).a.m() == j2) {
                this.s.remove(entry.getKey());
                return;
            }
        }
    }

    public final void d(boolean z) {
        m(false);
        this.f.set(1);
        this.u.a();
        String str = this.a;
        z68.c(str, "close session", new Object[0]);
        Socket socket = this.n;
        if (socket != null && !socket.isClosed()) {
            try {
                e();
            } catch (IOException e2) {
                z68.f(str, "exception in close", e2);
                k(e2);
            } catch (Throwable th) {
                f(true, z);
                throw th;
            }
            f(true, z);
        }
        r23 r23 = this.k;
        if (r23 != null) {
            r23.close();
        }
    }

    public final void e() {
        z68.a(this.a, "closeSocket");
        Socket socket = this.n;
        if (socket != null) {
            socket.close();
            r23 r23 = this.k;
            if (r23 != null) {
                r23.b(this.n);
            }
        }
    }

    public final void f(boolean z, boolean z2) {
        s9f s9f;
        z68.c(this.a, "disconnect: clearSenderTasks %b", Boolean.valueOf(z));
        l(0);
        this.g.set(false);
        j();
        for (Map.Entry value : this.s.entrySet()) {
            ((c7b) value.getValue()).a.h(new aaf());
        }
        this.s.clear();
        if (z) {
            synchronized (this.t) {
                try {
                    for (f7b f7b : this.t) {
                        d7b d7b = f7b.b;
                        if (!(d7b == null || (s9f = d7b.c) == null || z2)) {
                            s9f.h(new aaf());
                        }
                    }
                    this.t.clear();
                } finally {
                }
            }
        }
    }

    public final void g(fbf fbf, boolean z, long j2, s9f s9f) {
        fbf fbf2;
        i(f78.QUEUE, s9f.m(), 0, fbf.N(), true, fbf.toString());
        if (fbf instanceof n98) {
            this.s.clear();
            this.t.clear();
        }
        if (fbf.w()) {
            synchronized (this.t) {
                try {
                    ArrayList<Long> arrayList = null;
                    for (f7b f7b : this.t) {
                        d7b d7b = f7b.b;
                        if (d7b != null && (fbf2 = d7b.a) != null && fbf2.N() == fbf.N() && f7b.b.a.O() == fbf.O()) {
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            arrayList.add(Long.valueOf(f7b.b.c.m()));
                            z68.c(this.a, "cancel duplicated task: %s", x3b.b(f7b.b.a.N()));
                        }
                    }
                    if (arrayList != null) {
                        for (Long longValue : arrayList) {
                            c(longValue.longValue());
                        }
                    }
                } finally {
                }
            }
        }
        synchronized (this.t) {
            List list = this.t;
            e7b e7b = e7b.a;
            d7b d7b2 = new d7b(fbf, z, s9f);
            Duration.Companion companion = Duration.Companion;
            list.add(new f7b(e7b, d7b2, DurationKt.toDuration(j2, DurationUnit.MILLISECONDS), (b7b) null));
        }
    }

    public final boolean h() {
        return this.c.get() == 0;
    }

    public final void i(f78 f78, long j2, short s2, short s3, boolean z, String str) {
        x3b.c.getClass();
        String f2 = s9a.f(s3);
        String str2 = x3b.b(s3) + "(" + f2 + ")";
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "->" : "<-");
        sb.append(' ');
        sb.append(f78.b);
        sb.append(" [");
        sb.append(j2);
        sb.append(',');
        sb.append(s2);
        sb.append("] ");
        sb.append(str2);
        sb.append(' ');
        if (str == null) {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        z68.k(f78.a, this.a, sb2);
        if (f78 == f78.ERROR) {
            k(new IllegalStateException(g63.i(str2, ": ", sb2)));
        }
    }

    public final void j() {
        if (this.f.get() == 0) {
            jxd jxd = (jxd) this.q;
            jxd.i = 0;
            jxd.a();
        }
    }

    public final void k(Exception exc) {
        String message;
        if (this.f.get() == 0) {
            jxd jxd = (jxd) this.q;
            jxd.getClass();
            boolean z = exc instanceof SessionSendLimitException;
            m95 m95 = jxd.b;
            if (z) {
                m95.a(new ExceptionHandler$HandledException((String) null, ((SessionSendLimitException) exc).c, exc));
                return;
            }
            boolean z2 = exc instanceof IOException;
            Lazy lazy = jxd.c;
            if (!z2 && !(exc instanceof SecurityException)) {
                ((uta) m95).c(exc, true);
                ((fn4) lazy.getValue()).getClass();
            }
            if ((exc instanceof SSLHandshakeException) && ((fn4) lazy.getValue()).d() && (message = exc.getMessage()) != null) {
                if ((message.contains("current time") && message.contains("validation time")) || message.contains("not valid until")) {
                    ((fn4) lazy.getValue()).getClass();
                }
            }
        }
    }

    public final void l(int i2) {
        z68.c(this.a, "setConnectionsStatus %s", i2 != 0 ? i2 != 1 ? i2 != 2 ? "" : "CONNECTION_STATUS_LOGGED_IN" : "CONNECTION_STATUS_CONNECTED" : "CONNECTION_STATUS_DISCONNECTED");
        this.c.set(i2);
        this.u.a();
    }

    public final void m(boolean z) {
        String str = this.a;
        z68.c(str, "setTryToConnect, tryToConnect=%b", Boolean.valueOf(z));
        AtomicBoolean atomicBoolean = this.e;
        if (atomicBoolean.compareAndSet(!z, z) && z) {
            this.v.set(0);
            z68.c(str, "setTryToConnect, reset counter of failed attempts to connect", new Object[0]);
        }
        atomicBoolean.set(z);
        this.k.f(z);
        this.u.a();
    }
}
