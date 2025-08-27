package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: uvd  reason: default package */
public final class uvd implements Runnable {
    public final String a;
    public final Locale b = Locale.ENGLISH;
    public long c;
    public long o;
    public int v;
    public final /* synthetic */ xvd w;

    public uvd(xvd xvd) {
        this.w = xvd;
        this.a = wj6.h(xvd.j, "[CONN_WATCHDOG]#");
    }

    public final int a() {
        if (this.o > 0) {
            return this.v;
        }
        return -1;
    }

    public final void b(String str) {
        z68.c(this.w.a, "%s: %s", this.a, str);
    }

    public final void c(String str) {
        z68.n(this.w.a, (IOException) null, "%s: %s", Arrays.copyOf(new Object[]{this.a, str}, 2));
    }

    /* JADX WARNING: type inference failed for: r12v8, types: [hj7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v16, types: [qae, java.util.Map] */
    public final void run() {
        long j;
        uvd uvd = this;
        uvd.b("started ->");
        uvd.c = System.currentTimeMillis();
        long j2 = -1;
        long j3 = -1;
        while (true) {
            if (uvd.w.f.get() != 0) {
                break;
            }
            try {
                uvd.w.u.b(j3);
                if (uvd.w.f.get() == 1) {
                    uvd.c(String.format(uvd.b, "detect CLOSED session in %dms, EXIT", new Object[]{Long.valueOf(System.currentTimeMillis() - uvd.c)}));
                    break;
                }
                int i = uvd.w.c.get();
                if (i != 0) {
                    if (i == 1) {
                        uvd.b(String.format(uvd.b, "active_conn#%d, detect connected status", new Object[]{Integer.valueOf(a())}));
                    } else if (i == 2) {
                        uvd.b(String.format(uvd.b, "active_conn#%d, detect loggedIn status", new Object[]{Integer.valueOf(a())}));
                    }
                    j2 = -1;
                    j3 = -1;
                } else {
                    uvd.c(String.format(uvd.b, "active_conn#%d, detect disconnected status", new Object[]{Integer.valueOf(a())}));
                }
                if (uvd.w.e.get()) {
                    uvd.b(String.format(uvd.b, "active_conn#%d, detect tryToConnect status ...", new Object[]{Integer.valueOf(a())}));
                    long j4 = uvd.w.i.get();
                    uvd.w.getClass();
                    long convert = TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
                    long j5 = j4 - convert;
                    uvd.b(String.format(uvd.b, "curr_epoch=%dms, next conn_epoch=%dms | in %dms", new Object[]{Long.valueOf(convert), Long.valueOf(j4), Long.valueOf(j5)}));
                    if (j4 > 0 && convert < j4) {
                        uvd.b(String.format(uvd.b, "setup waiting timeout=%dms", new Object[]{Long.valueOf(j5)}));
                        j3 = j5;
                    } else if (uvd.w.f.get() == 0) {
                        if (uvd.w.h()) {
                            if (uvd.o > 0) {
                                uvd.c(String.format(uvd.b, "active_conn#%d, finished in %dms <-", new Object[]{Integer.valueOf(uvd.v), Long.valueOf(System.currentTimeMillis() - uvd.o)}));
                            }
                            uvd.o = j2;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        xvd xvd = uvd.w;
                        if (xvd.h()) {
                            try {
                                z68.c(xvd.a, "Connect", new Object[0]);
                                xvd.e();
                                long currentTimeMillis2 = System.currentTimeMillis();
                                xvd.n = xvd.k.connect();
                                xvd.o = new DataOutputStream(xvd.n.getOutputStream());
                                xvd.p = new DataInputStream(xvd.n.getInputStream());
                                xvd.l(1);
                                z68.c(xvd.a, "Connect success, time: %s, host: %s, port: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2), xvd.k.h(), Integer.valueOf(xvd.k.c()));
                                xvd.d.set(System.currentTimeMillis());
                                if (xvd.f.get() == 0) {
                                    jxd jxd = (jxd) xvd.q;
                                    jxd.i = 1;
                                    jxd.a();
                                }
                                xvd.h.set(0);
                                xvd.i.set(0);
                                uvd.v++;
                                eh3 j6 = uvd.w.k.j();
                                j6.c = uvd.v;
                                long j7 = j6.a;
                                long j8 = j6.b;
                                long j9 = j6.a;
                                long j10 = (1 > j9 || j9 > j8) ? -1 : j6.b - j6.a;
                                long j11 = j6.d;
                                long j12 = currentTimeMillis;
                                long j13 = j6.e;
                                long j14 = j6.f;
                                String str = j6.g;
                                long j15 = j11;
                                fh3 fh3 = r10;
                                int i2 = j6.h;
                                fh3 fh32 = new fh3(j7, j10, j15, j13, j14, str, i2, j6.c);
                                ybf ybf = (ybf) uvd.w.r;
                                nd ndVar = (nd) ybf.b.getValue();
                                mi3 b2 = ((rh3) ybf.d.getValue()).b();
                                boolean d = ((fn4) ybf.c.getValue()).d();
                                ndVar.getClass();
                                ? obj = new Object();
                                obj.a = j7;
                                obj.v = "CONN";
                                obj.b = ((qjd) ((x23) ndVar.a.getValue())).s();
                                obj.w = "TOTAL_CONNECT";
                                ? qae = new qae(0);
                                qae.put("dns_resolve", Long.valueOf(j15));
                                qae.put("tcp_handshake", Long.valueOf(j13));
                                qae.put("tls_handshake", Long.valueOf(j14));
                                qae.put("total_connect", Long.valueOf(j10));
                                boolean z = !d;
                                qae.put("background", Boolean.valueOf(z));
                                qae.put("conn", iq.C(b2));
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                qae.put("value", String.format(((qjd) ((x23) ndVar.a.getValue())).u(), "%s:%d", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2)}, 2)));
                                obj.c(qae);
                                ndVar.j(obj.d());
                                ((mq) ((qd) ndVar.d.getValue())).getClass();
                                Pair[] pairArr = {TuplesKt.to("in_background", Boolean.valueOf(z)), TuplesKt.to("connection_type", b2)};
                                mq.a("dns_resolve", j15, pairArr);
                                mq.a("tcp_handshake", j13, pairArr);
                                mq.a("tls_handshake", j14, pairArr);
                                mq.a("total_connect", j10, pairArr);
                                uvd = this;
                                uvd.b(String.format(uvd.b, "connectToSocket() took %dms, perf_metrics=%s", new Object[]{Long.valueOf(System.currentTimeMillis() - j12), fh3.toString()}));
                                uvd.o = System.currentTimeMillis();
                                uvd.b(String.format(uvd.b, "active_conn#%d, started ->", new Object[]{Integer.valueOf(uvd.v)}));
                            } catch (Exception e) {
                                z68.f(xvd.a, "connectToSocket failure!", e);
                                xvd.l(0);
                                xvd.g.set(false);
                                xvd.j();
                                xvd.k(e);
                                AtomicInteger atomicInteger = xvd.h;
                                Integer valueOf = Integer.valueOf(atomicInteger.get());
                                AtomicLong atomicLong = xvd.i;
                                Object[] objArr = {valueOf, Long.valueOf(atomicLong.get())};
                                String str2 = xvd.a;
                                z68.c(str2, "updateConnTimeoutAfterFail, curr_conn_errors=%d, curr_next_conn_epoch=%dms", objArr);
                                AtomicInteger atomicInteger2 = xvd.v;
                                atomicInteger2.incrementAndGet();
                                AtomicBoolean atomicBoolean = xvd.e;
                                if (!atomicBoolean.get() || atomicInteger2.get() >= 10) {
                                    atomicInteger.incrementAndGet();
                                    j = xvd.k.g(atomicInteger.get());
                                } else {
                                    j = 1000;
                                }
                                atomicLong.set(TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS) + j);
                                z68.h(str2, e, "updateConnTimeoutAfterFail, try_to_connect=%b, fa=%d, conn_errors=%d, next_conn_epoch=%d, delay=%dms", Boolean.valueOf(atomicBoolean.get()), Integer.valueOf(atomicInteger2.get()), Integer.valueOf(atomicInteger.get()), Long.valueOf(atomicLong.get()), Long.valueOf(j));
                            }
                        }
                    }
                }
                j2 = -1;
                j3 = -1;
            } catch (InterruptedException e2) {
                z68.h(uvd.w.a, e2, "%s: %s", uvd.a, String.format(uvd.b, "waiting for session state change was interrupted in %dms, EXIT", new Object[]{Long.valueOf(System.currentTimeMillis() - uvd.c)}));
                Thread.currentThread().interrupt();
            }
        }
        uvd.b(String.format(uvd.b, "finished in %dms <-", new Object[]{Long.valueOf(System.currentTimeMillis() - uvd.c)}));
    }
}
