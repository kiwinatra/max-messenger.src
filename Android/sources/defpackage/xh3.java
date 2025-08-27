package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import ru.ok.tamtam.android.connection.ConnectionInfoNougatImpl$RegisterDefaultNetworkCallbackException;

/* renamed from: xh3  reason: default package */
public final class xh3 implements rh3 {
    public final Context a;
    public final Executor b;
    public final er7 c;
    public final Lazy d;
    public final AtomicReference e;
    public final Lazy f = LazyKt.lazy(new uh3(this, 0));
    public final Lazy g = LazyKt.lazy(new uh3(this, 1));
    public volatile mi3 h = mi3.a;
    public final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    public final wh3 j = new wh3(0, this);
    public final AtomicReference k = new AtomicReference(new vh3(false, false, true, false));
    public final String l = xh3.class.getName();

    public xh3(Context context, Executor executor, er7 er7, Lazy lazy) {
        this.a = context;
        this.b = executor;
        this.c = er7;
        this.d = lazy;
        AtomicReference atomicReference = new AtomicReference();
        this.e = atomicReference;
        atomicReference.set(Boolean.valueOf(j(false)));
        ao aoVar = new ao(7, this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
        Unit unit = Unit.INSTANCE;
        q8.K(context, aoVar, intentFilter, (String) null, 4);
    }

    public static mi3 g(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return mi3.a;
        }
        if (networkCapabilities.hasTransport(1)) {
            return mi3.b;
        }
        if (!networkCapabilities.hasTransport(0)) {
            return mi3.a;
        }
        int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
        return linkDownstreamBandwidthKbps <= 150 ? mi3.c : linkDownstreamBandwidthKbps <= 23000 ? mi3.o : mi3.v;
    }

    public final boolean a() {
        return h().getRestrictBackgroundStatus() != 3;
    }

    public final mi3 b() {
        mi3 mi3 = this.h;
        mi3 mi32 = mi3.a;
        if (mi3 != mi32) {
            return this.h;
        }
        Network activeNetwork = h().getActiveNetwork();
        if (activeNetwork != null) {
            try {
                mi32 = g(h().getNetworkCapabilities(activeNetwork));
            } catch (SecurityException e2) {
                i("failed getNetworkCapabilities", e2);
                mi32 = mi3.a;
            }
        }
        this.h = mi32;
        return mi32;
    }

    public final void c(qh3 qh3) {
        if (qh3 != null) {
            this.i.add(qh3);
        }
    }

    public final void d(qh3 qh3) {
        if (qh3 != null) {
            this.i.remove(qh3);
        }
    }

    public final boolean e() {
        boolean z = false;
        if (((Boolean) this.e.get()).booleanValue()) {
            vh3 vh3 = (vh3) this.k.get();
            if (!vh3.a) {
                return false;
            }
            return vh3.b;
        }
        ConnectionInfoNougatImpl$RegisterDefaultNetworkCallbackException connectionInfoNougatImpl$RegisterDefaultNetworkCallbackException = new ConnectionInfoNougatImpl$RegisterDefaultNetworkCallbackException();
        z68.o(this.l, "default network callback is not registered yet", connectionInfoNougatImpl$RegisterDefaultNetworkCallbackException);
        ((uta) ((m95) this.d.getValue())).c(connectionInfoNougatImpl$RegisterDefaultNetworkCallbackException, false);
        NetworkInfo activeNetworkInfo = h().getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            z = true;
        }
        String str = this.l;
        a67 a67 = z68.b;
        if (a67 == null || !a67.c()) {
            return z;
        }
        a67.d(w78.o, str, i2a.i("fallbackOnDeprecatedCheckOfConnection: isConnected = ", z), (Throwable) null);
        return z;
    }

    public final boolean f() {
        return ((TelephonyManager) this.g.getValue()).isNetworkRoaming();
    }

    public final ConnectivityManager h() {
        return (ConnectivityManager) this.f.getValue();
    }

    public final void i(String str, Throwable th) {
        z68.f(this.l, str, th);
        er7 er7 = this.c;
        er7.getClass();
        z68.f("ConnectionInfo", str, th);
        ((f8f) ((q4) er7.b).g(f8f.class)).d().a((String) null, th);
    }

    public final void invalidate() {
        String str = this.l;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, "invalidate", (Throwable) null);
        }
        this.e.set(Boolean.valueOf(j(true)));
        if (!((Boolean) this.e.get()).booleanValue()) {
            l((Pair) null);
        }
    }

    public final boolean j(boolean z) {
        String str = this.l;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, "registerNetworkCallback", (Throwable) null);
        }
        if (z) {
            try {
                h().unregisterNetworkCallback(this.j);
            } catch (Throwable th) {
                z68.f(this.l, "registerNetworkCallback, unable to unregister default network callback", th);
            }
        }
        try {
            h().registerDefaultNetworkCallback(this.j);
            String str2 = this.l;
            a67 a672 = z68.b;
            if (a672 != null) {
                if (a672.c()) {
                    a672.d(w78.v, str2, "registerNetworkCallback, default network callback successfully registered", (Throwable) null);
                }
            }
            return true;
        } catch (Throwable th2) {
            i("Unable to register default network callback", th2);
            return false;
        }
    }

    public final void k(vh3 vh3) {
        this.k.set(vh3);
        vh3 vh32 = (vh3) this.k.get();
        if (!vh32.a ? false : vh32.b) {
            String str = this.l;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                w78 w78 = w78.v;
                a67.d(w78, str, "updateInet, " + vh3 + " has working connection", (Throwable) null);
            }
        } else {
            String str2 = this.l;
            z68.p(str2, "updateInet, " + vh3 + " has no working connection");
        }
        this.b.execute(new pr1(20, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r15 == null) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        if (r2 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bc, code lost:
        if (r2.isConnected() == true) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ff, code lost:
        if (((android.net.NetworkCapabilities) r15.getSecond()).hasTransport(3) != false) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[SYNTHETIC, Splitter:B:23:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076 A[Catch:{ all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(kotlin.Pair r15) {
        /*
            r14 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = r14.l
            r3 = 0
            android.net.ConnectivityManager r4 = r14.h()     // Catch:{ all -> 0x0017 }
            android.net.Network r4 = r4.getActiveNetwork()     // Catch:{ all -> 0x0017 }
            if (r4 != 0) goto L_0x001e
            java.lang.String r4 = "Unable to get active network (background/blocked?)"
            defpackage.z68.p(r2, r4)     // Catch:{ all -> 0x0017 }
            goto L_0x001d
        L_0x0017:
            r4 = move-exception
            java.lang.String r5 = "Failed to get active network"
            defpackage.z68.f(r2, r5, r4)
        L_0x001d:
            r4 = r3
        L_0x001e:
            if (r4 != 0) goto L_0x0022
        L_0x0020:
            r2 = r3
            goto L_0x0040
        L_0x0022:
            android.net.ConnectivityManager r5 = r14.h()     // Catch:{ all -> 0x0032 }
            android.net.NetworkCapabilities r5 = r5.getNetworkCapabilities(r4)     // Catch:{ all -> 0x0032 }
            if (r5 != 0) goto L_0x0039
            java.lang.String r5 = "Unable to get active network capabilities (background/blocked?)"
            defpackage.z68.p(r2, r5)     // Catch:{ all -> 0x0032 }
            goto L_0x0038
        L_0x0032:
            r5 = move-exception
            java.lang.String r6 = "Failed to get active network capabilities"
            defpackage.z68.f(r2, r6, r5)
        L_0x0038:
            r5 = r3
        L_0x0039:
            if (r5 != 0) goto L_0x003c
            goto L_0x0020
        L_0x003c:
            kotlin.Pair r2 = kotlin.TuplesKt.to(r4, r5)
        L_0x0040:
            if (r2 != 0) goto L_0x0046
            if (r15 != 0) goto L_0x0047
            goto L_0x014c
        L_0x0046:
            r15 = r2
        L_0x0047:
            if (r2 == 0) goto L_0x0066
            android.net.ConnectivityManager r2 = r14.h()     // Catch:{ all -> 0x005b }
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch:{ all -> 0x005b }
            if (r2 != 0) goto L_0x0064
            java.lang.String r2 = r14.l     // Catch:{ all -> 0x005b }
            java.lang.String r4 = "Unable to get active network info"
            defpackage.z68.p(r2, r4)     // Catch:{ all -> 0x005b }
            goto L_0x0063
        L_0x005b:
            r2 = move-exception
            java.lang.String r4 = r14.l
            java.lang.String r5 = "Failed to get active network info"
            defpackage.z68.f(r4, r5, r2)
        L_0x0063:
            r2 = r3
        L_0x0064:
            if (r2 != 0) goto L_0x0088
        L_0x0066:
            android.net.ConnectivityManager r2 = r14.h()     // Catch:{ all -> 0x007f }
            java.lang.Object r4 = r15.getFirst()     // Catch:{ all -> 0x007f }
            android.net.Network r4 = (android.net.Network) r4     // Catch:{ all -> 0x007f }
            android.net.NetworkInfo r2 = r2.getNetworkInfo(r4)     // Catch:{ all -> 0x007f }
            if (r2 != 0) goto L_0x0088
            java.lang.String r2 = r14.l     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "Unable to get network info"
            defpackage.z68.p(r2, r4)     // Catch:{ all -> 0x007f }
        L_0x007d:
            r2 = r3
            goto L_0x0088
        L_0x007f:
            r2 = move-exception
            java.lang.String r4 = r14.l
            java.lang.String r5 = "Failed to get network info"
            defpackage.z68.f(r4, r5, r2)
            goto L_0x007d
        L_0x0088:
            android.net.ConnectivityManager r4 = r14.h()
            boolean r4 = r4.isActiveNetworkMetered()
            java.lang.Object r5 = r15.getSecond()
            android.net.NetworkCapabilities r5 = (android.net.NetworkCapabilities) r5
            r6 = 16
            boolean r5 = r5.hasCapability(r6)
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x00a8
            boolean r8 = r2.isRoaming()
            if (r8 != r7) goto L_0x00a8
            r8 = r7
            goto L_0x00a9
        L_0x00a8:
            r8 = r6
        L_0x00a9:
            java.lang.Object r9 = r15.getSecond()
            android.net.NetworkCapabilities r9 = (android.net.NetworkCapabilities) r9
            r10 = 4
            boolean r9 = r9.hasTransport(r10)
            if (r9 != 0) goto L_0x00c0
            if (r2 == 0) goto L_0x0102
            boolean r9 = r2.isConnected()
            if (r9 != r7) goto L_0x0102
        L_0x00be:
            r6 = r7
            goto L_0x0102
        L_0x00c0:
            java.lang.String r9 = r14.l
            a67 r10 = defpackage.z68.b
            if (r10 != 0) goto L_0x00c7
            goto L_0x00d4
        L_0x00c7:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x00d4
            w78 r11 = defpackage.w78.v
            java.lang.String r12 = "retrieveInet, VPN detected"
            r10.d(r11, r9, r12, r3)
        L_0x00d4:
            if (r2 == 0) goto L_0x0102
            boolean r9 = r2.isConnected()
            if (r9 != r7) goto L_0x0102
            java.lang.Object r9 = r15.getSecond()
            android.net.NetworkCapabilities r9 = (android.net.NetworkCapabilities) r9
            boolean r9 = r9.hasTransport(r6)
            if (r9 != 0) goto L_0x00be
            java.lang.Object r9 = r15.getSecond()
            android.net.NetworkCapabilities r9 = (android.net.NetworkCapabilities) r9
            boolean r9 = r9.hasTransport(r7)
            if (r9 != 0) goto L_0x00be
            java.lang.Object r9 = r15.getSecond()
            android.net.NetworkCapabilities r9 = (android.net.NetworkCapabilities) r9
            r10 = 3
            boolean r9 = r9.hasTransport(r10)
            if (r9 == 0) goto L_0x0102
            goto L_0x00be
        L_0x0102:
            java.lang.String r7 = r14.l
            a67 r9 = defpackage.z68.b
            if (r9 != 0) goto L_0x0109
            goto L_0x0147
        L_0x0109:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x0147
            w78 r10 = defpackage.w78.o
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r0
            java.lang.Object r0 = r15.getFirst()
            java.lang.Object r15 = r15.getSecond()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r13 = "retrieveInet, took="
            r1.<init>(r13)
            r1.append(r11)
            java.lang.String r11 = "ms\nnet="
            r1.append(r11)
            r1.append(r0)
            java.lang.String r0 = "\ncaps="
            r1.append(r0)
            r1.append(r15)
            java.lang.String r15 = "\ninfo="
            r1.append(r15)
            r1.append(r2)
            java.lang.String r15 = r1.toString()
            r9.d(r10, r7, r15, r3)
        L_0x0147:
            vh3 r3 = new vh3
            r3.<init>(r6, r5, r4, r8)
        L_0x014c:
            if (r3 != 0) goto L_0x014f
            return
        L_0x014f:
            r14.k(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh3.l(kotlin.Pair):void");
    }
}
