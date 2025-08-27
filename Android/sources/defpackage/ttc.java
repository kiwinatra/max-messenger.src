package defpackage;

import java.net.ProtocolException;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.HTTP;

/* renamed from: ttc  reason: default package */
public final class ttc implements jlg, llg {
    public static final List x = CollectionsKt.listOf(y8c.HTTP_1_1);
    public final String a;
    public jtc b;
    public stc c;
    public mlg d;
    public nlg e;
    public final cef f;
    public String g;
    public ltc h;
    public final ArrayDeque i;
    public final ArrayDeque j;
    public long k;
    public boolean l;
    public int m;
    public String n;
    public boolean o;
    public int p;
    public boolean q;
    public final y2d r;
    public final xga s;
    public final Random t;
    public final long u;
    public klg v = null;
    public final long w;

    public ttc(fef fef, y2d y2d, xga xga, Random random, long j2, long j3) {
        this.r = y2d;
        this.s = xga;
        this.t = random;
        this.u = j2;
        this.w = j3;
        this.f = fef.f();
        this.i = new ArrayDeque();
        this.j = new ArrayDeque();
        this.m = -1;
        String str = y2d.c;
        if (Intrinsics.areEqual((Object) HttpGet.METHOD_NAME, (Object) str)) {
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            Unit unit = Unit.INSTANCE;
            this.a = wc8.r(bArr).a();
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + str).toString());
    }

    public final void a(k4d k4d, ce ceVar) {
        int i2 = k4d.o;
        if (i2 == 101) {
            lx6 lx6 = k4d.w;
            String b2 = lx6.b(HTTP.CONN_DIRECTIVE);
            String str = null;
            if (b2 == null) {
                b2 = null;
            }
            if (StringsKt__StringsJVMKt.equals("Upgrade", b2, true)) {
                String b3 = lx6.b("Upgrade");
                if (b3 == null) {
                    b3 = null;
                }
                if (StringsKt__StringsJVMKt.equals("websocket", b3, true)) {
                    String b4 = lx6.b("Sec-WebSocket-Accept");
                    if (b4 != null) {
                        str = b4;
                    }
                    String a2 = new vw0(MessageDigest.getInstance("SHA-1").digest(wj6.n(new StringBuilder(), this.a, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes(Charsets.UTF_8))).a();
                    if (!Intrinsics.areEqual((Object) a2, (Object) str)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a2 + "' but was '" + str + '\'');
                    } else if (ceVar == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + b3 + '\'');
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + b2 + '\'');
            }
        } else {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i2);
            sb.append(' ');
            throw new ProtocolException(g63.l(sb, k4d.c, '\''));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "reason.size() > 123: "
            monitor-enter(r7)
            r1 = 1000(0x3e8, float:1.401E-42)
            r2 = 0
            if (r8 < r1) goto L_0x0034
            r1 = 5000(0x1388, float:7.006E-42)
            if (r8 < r1) goto L_0x000d
            goto L_0x0034
        L_0x000d:
            r1 = 1004(0x3ec, float:1.407E-42)
            if (r1 > r8) goto L_0x0015
            r1 = 1006(0x3ee, float:1.41E-42)
            if (r1 >= r8) goto L_0x001e
        L_0x0015:
            r1 = 1015(0x3f7, float:1.422E-42)
            if (r1 <= r8) goto L_0x001a
            goto L_0x0032
        L_0x001a:
            r1 = 2999(0xbb7, float:4.202E-42)
            if (r1 < r8) goto L_0x0032
        L_0x001e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "Code "
            r1.<init>(r3)     // Catch:{ all -> 0x006a }
            r1.append(r8)     // Catch:{ all -> 0x006a }
            java.lang.String r3 = " is reserved and may not be used."
            r1.append(r3)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x006a }
            goto L_0x0042
        L_0x0032:
            r1 = r2
            goto L_0x0042
        L_0x0034:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "Code must be in range [1000,5000): "
            r1.<init>(r3)     // Catch:{ all -> 0x006a }
            r1.append(r8)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x006a }
        L_0x0042:
            if (r1 != 0) goto L_0x008a
            if (r9 == 0) goto L_0x006c
            vw0 r2 = new vw0     // Catch:{ all -> 0x006a }
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8     // Catch:{ all -> 0x006a }
            byte[] r1 = r9.getBytes(r1)     // Catch:{ all -> 0x006a }
            r2.<init>(r1)     // Catch:{ all -> 0x006a }
            r2.b = r9     // Catch:{ all -> 0x006a }
            int r1 = r1.length     // Catch:{ all -> 0x006a }
            long r3 = (long) r1     // Catch:{ all -> 0x006a }
            r5 = 123(0x7b, double:6.1E-322)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x005c
            goto L_0x006c
        L_0x005c:
            java.lang.String r8 = r0.concat(r9)     // Catch:{ all -> 0x006a }
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006a }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x006a }
            r9.<init>(r8)     // Catch:{ all -> 0x006a }
            throw r9     // Catch:{ all -> 0x006a }
        L_0x006a:
            r8 = move-exception
            goto L_0x0094
        L_0x006c:
            boolean r9 = r7.o     // Catch:{ all -> 0x006a }
            if (r9 != 0) goto L_0x0087
            boolean r9 = r7.l     // Catch:{ all -> 0x006a }
            if (r9 == 0) goto L_0x0075
            goto L_0x0087
        L_0x0075:
            r9 = 1
            r7.l = r9     // Catch:{ all -> 0x006a }
            java.util.ArrayDeque r0 = r7.j     // Catch:{ all -> 0x006a }
            qtc r1 = new qtc     // Catch:{ all -> 0x006a }
            r1.<init>(r8, r2)     // Catch:{ all -> 0x006a }
            r0.add(r1)     // Catch:{ all -> 0x006a }
            r7.f()     // Catch:{ all -> 0x006a }
            monitor-exit(r7)
            goto L_0x0089
        L_0x0087:
            monitor-exit(r7)
            r9 = 0
        L_0x0089:
            return r9
        L_0x008a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006a }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x006a }
            r8.<init>(r9)     // Catch:{ all -> 0x006a }
            throw r8     // Catch:{ all -> 0x006a }
        L_0x0094:
            monitor-exit(r7)     // Catch:{ all -> 0x006a }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttc.b(int, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r5 = ((defpackage.leg) r5.s.b).b;
        r5.q.v("handleWebSocketFailure");
        r5.n.onFailedByException(r6);
        r5.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r0 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        defpackage.u0g.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r2 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        defpackage.u0g.c(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r3 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        defpackage.u0g.c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.Exception r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.o     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return
        L_0x0007:
            r0 = 1
            r5.o = r0     // Catch:{ all -> 0x0057 }
            ltc r0 = r5.h     // Catch:{ all -> 0x0057 }
            r1 = 0
            r5.h = r1     // Catch:{ all -> 0x0057 }
            mlg r2 = r5.d     // Catch:{ all -> 0x0057 }
            r5.d = r1     // Catch:{ all -> 0x0057 }
            nlg r3 = r5.e     // Catch:{ all -> 0x0057 }
            r5.e = r1     // Catch:{ all -> 0x0057 }
            cef r1 = r5.f     // Catch:{ all -> 0x0057 }
            r1.e()     // Catch:{ all -> 0x0057 }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0057 }
            monitor-exit(r5)
            xga r5 = r5.s     // Catch:{ all -> 0x0046 }
            java.lang.Object r5 = r5.b     // Catch:{ all -> 0x0046 }
            leg r5 = (defpackage.leg) r5     // Catch:{ all -> 0x0046 }
            meg r5 = r5.b     // Catch:{ all -> 0x0046 }
            xe8 r1 = r5.q     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "handleWebSocketFailure"
            r1.v(r4)     // Catch:{ all -> 0x0046 }
            ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat r1 = r5.n     // Catch:{ all -> 0x0046 }
            r1.onFailedByException(r6)     // Catch:{ all -> 0x0046 }
            r5.d()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x003b
            defpackage.u0g.c(r0)
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            defpackage.u0g.c(r2)
        L_0x0040:
            if (r3 == 0) goto L_0x0045
            defpackage.u0g.c(r3)
        L_0x0045:
            return
        L_0x0046:
            r5 = move-exception
            if (r0 == 0) goto L_0x004c
            defpackage.u0g.c(r0)
        L_0x004c:
            if (r2 == 0) goto L_0x0051
            defpackage.u0g.c(r2)
        L_0x0051:
            if (r3 == 0) goto L_0x0056
            defpackage.u0g.c(r3)
        L_0x0056:
            throw r5
        L_0x0057:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttc.c(java.lang.Exception):void");
    }

    public final void d(String str, ltc ltc) {
        klg klg = this.v;
        synchronized (this) {
            try {
                this.g = str;
                this.h = ltc;
                this.e = new nlg((ftc) ltc.b, this.t, klg.a, klg.c, this.w);
                this.c = new stc(this);
                long j2 = this.u;
                if (j2 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
                    cef cef = this.f;
                    cef.c(new o37(str + " ping", nanos, this), nanos);
                }
                if (!this.j.isEmpty()) {
                    f();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = new mlg((gtc) ltc.a, this, klg.a, klg.e);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void e() {
        /*
            r15 = this;
            r0 = 1
        L_0x0001:
            int r1 = r15.m
            r2 = -1
            if (r1 != r2) goto L_0x0222
            mlg r1 = r15.d
            r1.n()
            boolean r2 = r1.v
            if (r2 == 0) goto L_0x0013
            r1.m()
            goto L_0x0001
        L_0x0013:
            int r2 = r1.b
            r3 = 2
            if (r2 == r0) goto L_0x0035
            if (r2 != r3) goto L_0x001b
            goto L_0x0035
        L_0x001b:
            java.net.ProtocolException r15 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown opcode: "
            r0.<init>(r1)
            byte[] r1 = defpackage.u0g.a
            java.lang.String r1 = java.lang.Integer.toHexString(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0035:
            boolean r4 = r1.a
            if (r4 != 0) goto L_0x021a
            long r4 = r1.c
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0048
            xu0 r8 = r1.Y
            rt0 r9 = r1.y
            r8.R(r9, r4)
        L_0x0048:
            boolean r4 = r1.o
            if (r4 == 0) goto L_0x01e8
            boolean r4 = r1.w
            if (r4 == 0) goto L_0x00a4
            ka9 r4 = r1.z
            if (r4 == 0) goto L_0x0055
            goto L_0x005e
        L_0x0055:
            ka9 r4 = new ka9
            boolean r5 = r1.w0
            r4.<init>(r5, r0)
            r1.z = r4
        L_0x005e:
            rt0 r5 = r1.y
            rt0 r8 = r4.b
            long r9 = r8.b
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0098
            boolean r9 = r4.c
            java.lang.Object r10 = r4.o
            java.util.zip.Inflater r10 = (java.util.zip.Inflater) r10
            if (r9 == 0) goto L_0x0073
            r10.reset()
        L_0x0073:
            r8.t0(r5)
            r9 = 65535(0xffff, float:9.1834E-41)
            r8.x0(r9)
            long r11 = r10.getBytesRead()
            long r8 = r8.b
            long r11 = r11 + r8
        L_0x0083:
            java.io.Closeable r8 = r4.v
            cf7 r8 = (defpackage.cf7) r8
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.a(r5, r13)
            long r8 = r10.getBytesRead()
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 < 0) goto L_0x0083
            goto L_0x00a4
        L_0x0098:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x00a4:
            if (r2 != r0) goto L_0x01d6
            llg r2 = r1.Z
            rt0 r1 = r1.y
            java.lang.String r1 = r1.q0()
            ttc r2 = (defpackage.ttc) r2
            xga r2 = r2.s
            java.lang.Object r2 = r2.b
            leg r2 = (defpackage.leg) r2
            meg r2 = r2.b
            xe8 r4 = r2.q
            java.lang.Object r5 = r4.c
            woc r5 = (defpackage.woc) r5
            boolean r5 = r5.shouldHideSensitiveInformation()
            if (r5 == 0) goto L_0x00d8
            java.lang.String r5 = defpackage.hi7.n(r1)
            java.lang.String r8 = " <- "
            java.lang.String r5 = defpackage.a81.m(r8, r5)
            java.lang.Object r4 = r4.b
            voc r4 = (defpackage.voc) r4
            java.lang.String r8 = "OKWSSignaling"
            r4.log(r8, r5)
            goto L_0x00e7
        L_0x00d8:
            java.lang.String r5 = " <- "
            java.lang.String r5 = r5.concat(r1)
            java.lang.Object r4 = r4.b
            voc r4 = (defpackage.voc) r4
            java.lang.String r8 = "OKWSSignaling"
            r4.log(r8, r5)
        L_0x00e7:
            ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat r4 = r2.n
            r4.onMessageReceived()
            long r4 = r2.r
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x010c
            android.os.Handler r4 = r2.d
            r4.removeMessages(r3)
            java.lang.Object r4 = r2.b
            monitor-enter(r4)
            jlg r5 = r2.c     // Catch:{ all -> 0x0106 }
            if (r5 == 0) goto L_0x0108
            android.os.Handler r5 = r2.d     // Catch:{ all -> 0x0106 }
            long r8 = r2.r     // Catch:{ all -> 0x0106 }
            r5.sendEmptyMessageDelayed(r3, r8)     // Catch:{ all -> 0x0106 }
            goto L_0x0108
        L_0x0106:
            r15 = move-exception
            goto L_0x010a
        L_0x0108:
            monitor-exit(r4)     // Catch:{ all -> 0x0106 }
            goto L_0x010c
        L_0x010a:
            monitor-exit(r4)     // Catch:{ all -> 0x0106 }
            throw r15
        L_0x010c:
            java.lang.String r3 = "ping"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0132
            java.lang.Object r3 = r2.b
            monitor-enter(r3)
            jlg r1 = r2.c     // Catch:{ all -> 0x012b }
            if (r1 == 0) goto L_0x012d
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x012b }
            r2.j = r4     // Catch:{ all -> 0x012b }
            jlg r1 = r2.c     // Catch:{ all -> 0x012b }
            java.lang.String r2 = "pong"
            ttc r1 = (defpackage.ttc) r1     // Catch:{ all -> 0x012b }
            r1.g(r2)     // Catch:{ all -> 0x012b }
            goto L_0x012d
        L_0x012b:
            r15 = move-exception
            goto L_0x0130
        L_0x012d:
            monitor-exit(r3)     // Catch:{ all -> 0x012b }
            goto L_0x0001
        L_0x0130:
            monitor-exit(r3)     // Catch:{ all -> 0x012b }
            throw r15
        L_0x0132:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            r3.<init>((java.lang.String) r1)     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            java.lang.String r1 = "type"
            r4 = 0
            java.lang.String r1 = r3.optString(r1, r4)     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            java.lang.String r5 = "error"
            java.lang.String r5 = r3.optString(r5, r4)     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            java.lang.String r8 = "error"
            boolean r8 = r8.equals(r1)     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            if (r8 == 0) goto L_0x015c
            java.lang.String r8 = "conversation-ended"
            boolean r5 = r8.equals(r5)     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            if (r5 == 0) goto L_0x015c
            r2.b()     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            goto L_0x015c
        L_0x0158:
            r1 = move-exception
            goto L_0x01b8
        L_0x015a:
            r1 = move-exception
            goto L_0x01c7
        L_0x015c:
            java.lang.String r5 = "stamp"
            long r8 = r3.optLong(r5, r6)     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0176
            java.lang.Object r5 = r2.b     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            monitor-enter(r5)     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            long r6 = r2.l     // Catch:{ all -> 0x0173 }
            long r6 = java.lang.Math.max(r8, r6)     // Catch:{ all -> 0x0173 }
            r2.l = r6     // Catch:{ all -> 0x0173 }
            monitor-exit(r5)     // Catch:{ all -> 0x0173 }
            goto L_0x0176
        L_0x0173:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0173 }
            throw r1     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
        L_0x0176:
            xv1 r5 = r2.m     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            if (r5 == 0) goto L_0x0181
            java.lang.Object r5 = r5.b     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            o9e r5 = (defpackage.o9e) r5     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            r5.f(r3)     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
        L_0x0181:
            java.lang.String r5 = "notification"
            java.lang.String r5 = r3.optString(r5, r4)     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            java.lang.String r6 = "endpoint"
            java.lang.String r3 = r3.optString(r6, r4)     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            java.lang.String r4 = "notification"
            boolean r1 = r4.equals(r1)     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            if (r1 == 0) goto L_0x0001
            java.lang.String r1 = "connection"
            boolean r1 = r1.equals(r5)     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            if (r1 == 0) goto L_0x0001
            if (r3 == 0) goto L_0x0001
            java.lang.Object r1 = r2.b     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            monitor-enter(r1)     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ all -> 0x01b5 }
            android.net.Uri$Builder r3 = r3.buildUpon()     // Catch:{ all -> 0x01b5 }
            a75 r4 = r2.p     // Catch:{ all -> 0x01b5 }
            java.lang.String r3 = defpackage.meg.c(r3, r4)     // Catch:{ all -> 0x01b5 }
            r2.h = r3     // Catch:{ all -> 0x01b5 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b5 }
            goto L_0x0001
        L_0x01b5:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b5 }
            throw r3     // Catch:{ JSONException -> 0x015a, all -> 0x0158 }
        L_0x01b8:
            xe8 r2 = r2.q
            java.lang.String r3 = "ws.signaling.unexpected_throwable"
            java.lang.Object r2 = r2.b
            voc r2 = (defpackage.voc) r2
            java.lang.String r4 = "OKWSSignaling"
            r2.reportException(r4, r3, r1)
            goto L_0x0001
        L_0x01c7:
            xe8 r2 = r2.q
            java.lang.String r3 = "ws.signaling.json"
            java.lang.Object r2 = r2.b
            voc r2 = (defpackage.voc) r2
            java.lang.String r4 = "OKWSSignaling"
            r2.reportException(r4, r3, r1)
            goto L_0x0001
        L_0x01d6:
            llg r2 = r1.Z
            rt0 r1 = r1.y
            long r3 = r1.b
            r1.f(r3)
            ttc r2 = (defpackage.ttc) r2
            xga r1 = r2.s
            r1.getClass()
            goto L_0x0001
        L_0x01e8:
            boolean r4 = r1.a
            if (r4 != 0) goto L_0x01f8
            r1.n()
            boolean r4 = r1.v
            if (r4 != 0) goto L_0x01f4
            goto L_0x01f8
        L_0x01f4:
            r1.m()
            goto L_0x01e8
        L_0x01f8:
            int r4 = r1.b
            if (r4 != 0) goto L_0x01fe
            goto L_0x0035
        L_0x01fe:
            java.net.ProtocolException r15 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected continuation opcode. Got: "
            r0.<init>(r2)
            int r1 = r1.b
            byte[] r2 = defpackage.u0g.a
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x021a:
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "closed"
            r15.<init>(r0)
            throw r15
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttc.e():void");
    }

    public final void f() {
        byte[] bArr = u0g.a;
        stc stc = this.c;
        if (stc != null) {
            this.f.c(stc, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(java.lang.String r10) {
        /*
            r9 = this;
            vw0 r0 = new vw0
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            byte[] r1 = r10.getBytes(r1)
            r0.<init>(r1)
            r0.b = r10
            monitor-enter(r9)
            boolean r10 = r9.o     // Catch:{ all -> 0x002c }
            r2 = 0
            if (r10 != 0) goto L_0x0043
            boolean r10 = r9.l     // Catch:{ all -> 0x002c }
            if (r10 == 0) goto L_0x0018
            goto L_0x0043
        L_0x0018:
            long r3 = r9.k     // Catch:{ all -> 0x002c }
            int r10 = r1.length     // Catch:{ all -> 0x002c }
            long r5 = (long) r10     // Catch:{ all -> 0x002c }
            long r5 = r5 + r3
            r7 = 16777216(0x1000000, double:8.289046E-317)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x002e
            r10 = 1001(0x3e9, float:1.403E-42)
            r0 = 0
            r9.b(r10, r0)     // Catch:{ all -> 0x002c }
            monitor-exit(r9)
            goto L_0x0044
        L_0x002c:
            r10 = move-exception
            goto L_0x0045
        L_0x002e:
            int r10 = r1.length     // Catch:{ all -> 0x002c }
            long r1 = (long) r10     // Catch:{ all -> 0x002c }
            long r3 = r3 + r1
            r9.k = r3     // Catch:{ all -> 0x002c }
            java.util.ArrayDeque r10 = r9.j     // Catch:{ all -> 0x002c }
            rtc r1 = new rtc     // Catch:{ all -> 0x002c }
            r1.<init>(r0)     // Catch:{ all -> 0x002c }
            r10.add(r1)     // Catch:{ all -> 0x002c }
            r9.f()     // Catch:{ all -> 0x002c }
            monitor-exit(r9)
            r2 = 1
            goto L_0x0044
        L_0x0043:
            monitor-exit(r9)
        L_0x0044:
            return r2
        L_0x0045:
            monitor-exit(r9)     // Catch:{ all -> 0x002c }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttc.g(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        if (r10 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r8.b(10, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        r0 = r0.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        if ((r0 instanceof defpackage.rtc) == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
        if (r0 == null) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
        r0 = (defpackage.rtc) r0;
        r1 = r0.a;
        r8.d(r0.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r13.k -= (long) r0.b.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d4, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e0, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e3, code lost:
        if ((r0 instanceof defpackage.qtc) == false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e5, code lost:
        if (r0 == null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e7, code lost:
        r0 = (defpackage.qtc) r0;
        r8.a(r0.a, r0.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f4, code lost:
        if (((defpackage.ltc) r5.element) == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f6, code lost:
        r13.s.i((java.lang.String) r4.element);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ff, code lost:
        r13 = (defpackage.ltc) r5.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0103, code lost:
        if (r13 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0105, code lost:
        defpackage.u0g.c(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0108, code lost:
        r13 = (defpackage.mlg) r6.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010c, code lost:
        if (r13 == null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010e, code lost:
        defpackage.u0g.c(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0111, code lost:
        r13 = (defpackage.nlg) r7.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0115, code lost:
        if (r13 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0117, code lost:
        defpackage.u0g.c(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0123, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0129, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012a, code lost:
        r0 = (defpackage.ltc) r5.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012e, code lost:
        if (r0 != null) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0130, code lost:
        defpackage.u0g.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0133, code lost:
        r0 = (defpackage.mlg) r6.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0137, code lost:
        if (r0 != null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0139, code lost:
        defpackage.u0g.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013c, code lost:
        r0 = (defpackage.nlg) r7.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0140, code lost:
        if (r0 != null) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0142, code lost:
        defpackage.u0g.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0145, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return true;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h() {
        /*
            r13 = this;
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            r1 = 0
            r0.element = r1
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            r3 = -1
            r2.element = r3
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            r4.element = r1
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            r5.element = r1
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            r6.element = r1
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r7.element = r1
            monitor-enter(r13)
            boolean r8 = r13.o     // Catch:{ all -> 0x006e }
            r9 = 0
            if (r8 == 0) goto L_0x0034
            monitor-exit(r13)
            return r9
        L_0x0034:
            nlg r8 = r13.e     // Catch:{ all -> 0x006e }
            java.util.ArrayDeque r10 = r13.i     // Catch:{ all -> 0x006e }
            java.lang.Object r10 = r10.poll()     // Catch:{ all -> 0x006e }
            vw0 r10 = (defpackage.vw0) r10     // Catch:{ all -> 0x006e }
            if (r10 != 0) goto L_0x00a9
            java.util.ArrayDeque r11 = r13.j     // Catch:{ all -> 0x006e }
            java.lang.Object r11 = r11.poll()     // Catch:{ all -> 0x006e }
            r0.element = r11     // Catch:{ all -> 0x006e }
            boolean r12 = r11 instanceof defpackage.qtc     // Catch:{ all -> 0x006e }
            if (r12 == 0) goto L_0x00a5
            int r9 = r13.m     // Catch:{ all -> 0x006e }
            r2.element = r9     // Catch:{ all -> 0x006e }
            java.lang.String r2 = r13.n     // Catch:{ all -> 0x006e }
            r4.element = r2     // Catch:{ all -> 0x006e }
            if (r9 == r3) goto L_0x0071
            ltc r2 = r13.h     // Catch:{ all -> 0x006e }
            r5.element = r2     // Catch:{ all -> 0x006e }
            r13.h = r1     // Catch:{ all -> 0x006e }
            mlg r2 = r13.d     // Catch:{ all -> 0x006e }
            r6.element = r2     // Catch:{ all -> 0x006e }
            r13.d = r1     // Catch:{ all -> 0x006e }
            nlg r2 = r13.e     // Catch:{ all -> 0x006e }
            r7.element = r2     // Catch:{ all -> 0x006e }
            r13.e = r1     // Catch:{ all -> 0x006e }
            cef r1 = r13.f     // Catch:{ all -> 0x006e }
            r1.e()     // Catch:{ all -> 0x006e }
            goto L_0x00a9
        L_0x006e:
            r0 = move-exception
            goto L_0x0146
        L_0x0071:
            T r1 = r0.element     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x009d
            qtc r1 = (defpackage.qtc) r1     // Catch:{ all -> 0x006e }
            long r1 = r1.c     // Catch:{ all -> 0x006e }
            cef r3 = r13.f     // Catch:{ all -> 0x006e }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r9.<init>()     // Catch:{ all -> 0x006e }
            java.lang.String r11 = r13.g     // Catch:{ all -> 0x006e }
            r9.append(r11)     // Catch:{ all -> 0x006e }
            java.lang.String r11 = " cancel"
            r9.append(r11)     // Catch:{ all -> 0x006e }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x006e }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x006e }
            long r1 = r11.toNanos(r1)     // Catch:{ all -> 0x006e }
            stc r11 = new stc     // Catch:{ all -> 0x006e }
            r11.<init>(r9, r13)     // Catch:{ all -> 0x006e }
            r3.c(r11, r1)     // Catch:{ all -> 0x006e }
            goto L_0x00a9
        L_0x009d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x006e }
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"
            r0.<init>(r1)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x00a5:
            if (r11 != 0) goto L_0x00a9
            monitor-exit(r13)
            return r9
        L_0x00a9:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x006e }
            monitor-exit(r13)
            if (r10 == 0) goto L_0x00b4
            r13 = 10
            r8.b(r13, r10)     // Catch:{ all -> 0x00d4 }
            goto L_0x00ff
        L_0x00b4:
            T r0 = r0.element     // Catch:{ all -> 0x00d4 }
            boolean r1 = r0 instanceof defpackage.rtc     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x00e1
            if (r0 == 0) goto L_0x00d9
            rtc r0 = (defpackage.rtc) r0     // Catch:{ all -> 0x00d4 }
            int r1 = r0.a     // Catch:{ all -> 0x00d4 }
            vw0 r1 = r0.b     // Catch:{ all -> 0x00d4 }
            r8.d(r1)     // Catch:{ all -> 0x00d4 }
            monitor-enter(r13)     // Catch:{ all -> 0x00d4 }
            long r1 = r13.k     // Catch:{ all -> 0x00d6 }
            vw0 r0 = r0.b     // Catch:{ all -> 0x00d6 }
            int r0 = r0.c()     // Catch:{ all -> 0x00d6 }
            long r3 = (long) r0     // Catch:{ all -> 0x00d6 }
            long r1 = r1 - r3
            r13.k = r1     // Catch:{ all -> 0x00d6 }
            monitor-exit(r13)     // Catch:{ all -> 0x00d4 }
            goto L_0x00ff
        L_0x00d4:
            r13 = move-exception
            goto L_0x012a
        L_0x00d6:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00d4 }
            throw r0     // Catch:{ all -> 0x00d4 }
        L_0x00d9:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message"
            r13.<init>(r0)     // Catch:{ all -> 0x00d4 }
            throw r13     // Catch:{ all -> 0x00d4 }
        L_0x00e1:
            boolean r1 = r0 instanceof defpackage.qtc     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x0124
            if (r0 == 0) goto L_0x011c
            qtc r0 = (defpackage.qtc) r0     // Catch:{ all -> 0x00d4 }
            int r1 = r0.a     // Catch:{ all -> 0x00d4 }
            vw0 r0 = r0.b     // Catch:{ all -> 0x00d4 }
            r8.a(r1, r0)     // Catch:{ all -> 0x00d4 }
            T r0 = r5.element     // Catch:{ all -> 0x00d4 }
            ltc r0 = (defpackage.ltc) r0     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x00ff
            xga r13 = r13.s     // Catch:{ all -> 0x00d4 }
            T r0 = r4.element     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00d4 }
            r13.i(r0)     // Catch:{ all -> 0x00d4 }
        L_0x00ff:
            T r13 = r5.element
            ltc r13 = (defpackage.ltc) r13
            if (r13 == 0) goto L_0x0108
            defpackage.u0g.c(r13)
        L_0x0108:
            T r13 = r6.element
            mlg r13 = (defpackage.mlg) r13
            if (r13 == 0) goto L_0x0111
            defpackage.u0g.c(r13)
        L_0x0111:
            T r13 = r7.element
            nlg r13 = (defpackage.nlg) r13
            if (r13 == 0) goto L_0x011a
            defpackage.u0g.c(r13)
        L_0x011a:
            r13 = 1
            return r13
        L_0x011c:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"
            r13.<init>(r0)     // Catch:{ all -> 0x00d4 }
            throw r13     // Catch:{ all -> 0x00d4 }
        L_0x0124:
            java.lang.AssertionError r13 = new java.lang.AssertionError     // Catch:{ all -> 0x00d4 }
            r13.<init>()     // Catch:{ all -> 0x00d4 }
            throw r13     // Catch:{ all -> 0x00d4 }
        L_0x012a:
            T r0 = r5.element
            ltc r0 = (defpackage.ltc) r0
            if (r0 == 0) goto L_0x0133
            defpackage.u0g.c(r0)
        L_0x0133:
            T r0 = r6.element
            mlg r0 = (defpackage.mlg) r0
            if (r0 == 0) goto L_0x013c
            defpackage.u0g.c(r0)
        L_0x013c:
            T r0 = r7.element
            nlg r0 = (defpackage.nlg) r0
            if (r0 == 0) goto L_0x0145
            defpackage.u0g.c(r0)
        L_0x0145:
            throw r13
        L_0x0146:
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttc.h():boolean");
    }
}
