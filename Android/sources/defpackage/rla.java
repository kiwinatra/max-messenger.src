package defpackage;

import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.protocol.HTTP;

/* renamed from: rla  reason: default package */
public final class rla implements Cloneable, fz0 {
    public static final List M0 = u0g.k(y8c.HTTP_2, y8c.HTTP_1_1);
    public static final List N0 = u0g.k(di3.e, di3.f);
    public final List A0;
    public final List B0;
    public final HostnameVerifier C0;
    public final wy1 D0;
    public final iq E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final long K0;
    public final d6a L0;
    public final ejd X;
    public final o9a Y;
    public final Proxy Z;
    public final srd a;
    public final u6h b;
    public final List c;
    public final List o;
    public final syc v;
    public final ProxySelector v0;
    public final boolean w;
    public final sq6 w0;
    public final sq6 x;
    public final SocketFactory x0;
    public final boolean y;
    public final SSLSocketFactory y0;
    public final boolean z;
    public final X509TrustManager z0;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rla(defpackage.qla r6) {
        /*
            r5 = this;
            r5.<init>()
            srd r0 = r6.a
            r5.a = r0
            u6h r0 = r6.b
            r5.b = r0
            java.util.ArrayList r0 = r6.c
            java.util.List r0 = defpackage.u0g.v(r0)
            r5.c = r0
            java.util.ArrayList r0 = r6.d
            java.util.List r0 = defpackage.u0g.v(r0)
            r5.o = r0
            syc r0 = r6.e
            r5.v = r0
            boolean r0 = r6.f
            r5.w = r0
            sq6 r0 = r6.g
            r5.x = r0
            boolean r0 = r6.h
            r5.y = r0
            boolean r0 = r6.i
            r5.z = r0
            ejd r0 = r6.j
            r5.X = r0
            o9a r0 = r6.k
            r5.Y = r0
            java.net.Proxy r0 = r6.l
            r5.Z = r0
            if (r0 == 0) goto L_0x0040
            qga r0 = defpackage.qga.a
            goto L_0x004e
        L_0x0040:
            java.net.ProxySelector r0 = r6.m
            if (r0 == 0) goto L_0x0045
            goto L_0x0049
        L_0x0045:
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
        L_0x0049:
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            qga r0 = defpackage.qga.a
        L_0x004e:
            r5.v0 = r0
            sq6 r0 = r6.n
            r5.w0 = r0
            javax.net.SocketFactory r0 = r6.o
            r5.x0 = r0
            java.util.List r0 = r6.r
            r5.A0 = r0
            java.util.List r1 = r6.s
            r5.B0 = r1
            javax.net.ssl.HostnameVerifier r1 = r6.t
            r5.C0 = r1
            int r1 = r6.w
            r5.F0 = r1
            int r1 = r6.x
            r5.G0 = r1
            int r1 = r6.y
            r5.H0 = r1
            int r1 = r6.z
            r5.I0 = r1
            int r1 = r6.A
            r5.J0 = r1
            long r1 = r6.B
            r5.K0 = r1
            d6a r1 = r6.C
            if (r1 == 0) goto L_0x0081
            goto L_0x0087
        L_0x0081:
            d6a r1 = new d6a
            r2 = 5
            r1.<init>(r2)
        L_0x0087:
            r5.L0 = r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L_0x009a
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x009a
            goto L_0x0102
        L_0x009a:
            java.util.Iterator r0 = r0.iterator()
        L_0x009e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0102
            java.lang.Object r1 = r0.next()
            di3 r1 = (defpackage.di3) r1
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x009e
            javax.net.ssl.SSLSocketFactory r0 = r6.p
            if (r0 == 0) goto L_0x00d2
            r5.y0 = r0
            iq r0 = r6.v
            r5.E0 = r0
            javax.net.ssl.X509TrustManager r1 = r6.q
            r5.z0 = r1
            wy1 r6 = r6.u
            iq r1 = r6.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            if (r1 == 0) goto L_0x00c7
            goto L_0x00cf
        L_0x00c7:
            wy1 r1 = new wy1
            java.util.Set r6 = r6.a
            r1.<init>(r6, r0)
            r6 = r1
        L_0x00cf:
            r5.D0 = r6
            goto L_0x010c
        L_0x00d2:
            wnb r0 = defpackage.wnb.a
            wnb r0 = defpackage.wnb.a
            javax.net.ssl.X509TrustManager r0 = r0.m()
            r5.z0 = r0
            wnb r1 = defpackage.wnb.a
            javax.net.ssl.SSLSocketFactory r1 = r1.l(r0)
            r5.y0 = r1
            wnb r1 = defpackage.wnb.a
            iq r0 = r1.b(r0)
            r5.E0 = r0
            wy1 r6 = r6.u
            iq r1 = r6.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            if (r1 == 0) goto L_0x00f7
            goto L_0x00ff
        L_0x00f7:
            wy1 r1 = new wy1
            java.util.Set r6 = r6.a
            r1.<init>(r6, r0)
            r6 = r1
        L_0x00ff:
            r5.D0 = r6
            goto L_0x010c
        L_0x0102:
            r5.y0 = r2
            r5.E0 = r2
            r5.z0 = r2
            wy1 r6 = defpackage.wy1.c
            r5.D0 = r6
        L_0x010c:
            java.util.List r6 = r5.c
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            if (r6 == 0) goto L_0x01f1
            boolean r1 = r6.contains(r2)
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x01d9
            java.util.List r6 = r5.o
            if (r6 == 0) goto L_0x01d3
            boolean r0 = r6.contains(r2)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x01bb
            java.util.List r6 = r5.A0
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            javax.net.ssl.X509TrustManager r1 = r5.z0
            iq r2 = r5.E0
            javax.net.ssl.SSLSocketFactory r4 = r5.y0
            if (r0 == 0) goto L_0x013d
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x013d
            goto L_0x017c
        L_0x013d:
            java.util.Iterator r6 = r6.iterator()
        L_0x0141:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x017c
            java.lang.Object r0 = r6.next()
            di3 r0 = (defpackage.di3) r0
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x0141
            if (r4 == 0) goto L_0x0170
            if (r2 == 0) goto L_0x0164
            if (r1 == 0) goto L_0x0158
            goto L_0x0192
        L_0x0158:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "x509TrustManager == null"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x0164:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "certificateChainCleaner == null"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x0170:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "sslSocketFactory == null"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x017c:
            if (r4 != 0) goto L_0x017f
            goto L_0x0180
        L_0x017f:
            r3 = 0
        L_0x0180:
            java.lang.String r6 = "Check failed."
            if (r3 == 0) goto L_0x01b1
            if (r2 != 0) goto L_0x01a7
            if (r1 != 0) goto L_0x019d
            wy1 r5 = r5.D0
            wy1 r0 = defpackage.wy1.c
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
            if (r5 == 0) goto L_0x0193
        L_0x0192:
            return
        L_0x0193:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x019d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x01a7:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x01b1:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x01bb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Null network interceptor: "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L_0x01d3:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r0)
            throw r5
        L_0x01d9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Null interceptor: "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L_0x01f1:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rla.<init>(qla):void");
    }

    public final qla a() {
        qla qla = new qla();
        qla.a = this.a;
        qla.b = this.b;
        CollectionsKt__MutableCollectionsKt.addAll(qla.c, this.c);
        CollectionsKt__MutableCollectionsKt.addAll(qla.d, this.o);
        qla.e = this.v;
        qla.f = this.w;
        qla.g = this.x;
        qla.h = this.y;
        qla.i = this.z;
        qla.j = this.X;
        qla.k = this.Y;
        qla.l = this.Z;
        qla.m = this.v0;
        qla.n = this.w0;
        qla.o = this.x0;
        qla.p = this.y0;
        qla.q = this.z0;
        qla.r = this.A0;
        qla.s = this.B0;
        qla.t = this.C0;
        qla.u = this.D0;
        qla.v = this.E0;
        qla.w = this.F0;
        qla.x = this.G0;
        qla.y = this.H0;
        qla.z = this.I0;
        qla.A = this.J0;
        qla.B = this.K0;
        qla.C = this.L0;
        return qla;
    }

    public final jtc b(y2d y2d) {
        return new jtc(this, y2d, false);
    }

    public final ttc c(y2d y2d, xga xga) {
        ttc ttc = new ttc(fef.h, y2d, xga, new Random(), (long) this.J0, this.K0);
        if (y2d.d.b("Sec-WebSocket-Extensions") != null) {
            ttc.c(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"));
        } else {
            qla a2 = a();
            byte[] bArr = u0g.a;
            a2.e = new syc(10);
            List mutableList = CollectionsKt.toMutableList(ttc.x);
            y8c y8c = y8c.H2_PRIOR_KNOWLEDGE;
            if (!mutableList.contains(y8c) && !mutableList.contains(y8c.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + mutableList).toString());
            } else if (mutableList.contains(y8c) && mutableList.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + mutableList).toString());
            } else if (!(!mutableList.contains(y8c.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + mutableList).toString());
            } else if (!mutableList.contains((Object) null)) {
                mutableList.remove(y8c.SPDY_3);
                if (!Intrinsics.areEqual((Object) mutableList, (Object) a2.s)) {
                    a2.C = null;
                }
                a2.s = Collections.unmodifiableList(mutableList);
                rla rla = new rla(a2);
                hr6 a3 = y2d.a();
                ((e4) a3.c).y("Upgrade", "websocket");
                ((e4) a3.c).y(HTTP.CONN_DIRECTIVE, "Upgrade");
                ((e4) a3.c).y("Sec-WebSocket-Key", ttc.a);
                ((e4) a3.c).y("Sec-WebSocket-Version", "13");
                ((e4) a3.c).y("Sec-WebSocket-Extensions", "permessage-deflate");
                y2d c2 = a3.c();
                jtc jtc = new jtc(rla, c2, true);
                ttc.b = jtc;
                jtc.f(new fj(19, (Object) ttc, (Object) c2));
            } else {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
        }
        return ttc;
    }

    public final Object clone() {
        return super.clone();
    }

    public rla() {
        this(new qla());
    }
}
