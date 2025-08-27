package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.api.SessionSendLimitException;

/* renamed from: vvd  reason: default package */
public final class vvd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xvd b;

    public /* synthetic */ vvd(xvd xvd, int i) {
        this.a = i;
        this.b = xvd;
    }

    public boolean a(f7b f7b) {
        xvd xvd = this.b;
        if (xvd.c.get() != 2 && !xvd.a(xvd, f7b, k88.class)) {
            return false;
        }
        f7b.b.c.h(new qaf("session.state", "session is in logged in state or login already in progress", (String) null));
        return true;
    }

    public void b() {
        boolean z;
        boolean z2;
        d7b d7b;
        long currentTimeMillis = System.currentTimeMillis();
        ni3 a2 = this.b.k.a();
        mi3 b2 = ((rh3) ((Lazy) a2.b).getValue()).b();
        Class<ni3> cls = ni3.class;
        if (((mi3) ((AtomicReference) a2.f).getAndSet(b2)) != b2) {
            String name = cls.getName();
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.o, name, "reset timeoutIndex", (Throwable) null);
            }
            ((AtomicInteger) a2.e).set(0);
            z = true;
        } else {
            z = false;
        }
        long[] jArr = (long[]) ((Map) ((Lazy) a2.d).getValue()).getOrDefault(b2, b59.a);
        int i = ((AtomicInteger) a2.e).get();
        long last = (i < 0 || i >= jArr.length) ? i >= jArr.length ? ArraysKt.last(jArr) : ArraysKt.first(jArr) : jArr[i];
        if (z) {
            String name2 = cls.getName();
            a67 a672 = z68.b;
            if (a672 != null && a672.c()) {
                a672.d(w78.o, name2, "connType=" + b2 + ", timeout = " + last, (Throwable) null);
            }
        }
        xvd xvd = this.b;
        boolean z3 = xvd.w > 0 && xvd.h();
        if (z3 && !xvd.x && xvd.w < xvd.t.size()) {
            z68.n(xvd.a, (IOException) null, "amount of send_tasks=%d has exceeded the specified limit=%d", Arrays.copyOf(new Object[]{Integer.valueOf(xvd.t.size()), Integer.valueOf(xvd.w)}, 2));
            xvd.k(new SessionSendLimitException(xvd.w, xvd.t.size()));
            xvd.x = true;
        }
        if (z3) {
            xvd xvd2 = this.b;
            z68.c(xvd2.a, "!==! invalidate start time for cmds, tasks=%d, limit=%d", Integer.valueOf(xvd2.t.size()), Integer.valueOf(this.b.w));
        }
        synchronized (this.b.t) {
            try {
                if (this.b.t.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (f7b f7b : this.b.t) {
                        if (!(f7b == null || f7b.a != e7b.a || (d7b = f7b.b) == null)) {
                            if (z3) {
                                int i2 = bq7.a;
                                Duration.Companion companion = Duration.Companion;
                                d7b.d = DurationKt.toDuration(System.currentTimeMillis(), DurationUnit.MILLISECONDS);
                            } else {
                                long r13 = currentTimeMillis - Duration.m1371getInWholeMillisecondsimpl(d7b.d);
                                if (r13 > last) {
                                    this.b.i(f78.EXCEPTION, f7b.b.c.m(), 0, f7b.b.a.N(), true, "send timeout: diff=" + r13 + " requestTimeout=" + last);
                                    f7b.b.c.h(new aaf());
                                    this.b.k.e();
                                    arrayList.add(f7b);
                                }
                            }
                        }
                    }
                    this.b.t.removeAll(arrayList);
                }
            } finally {
                while (true) {
                }
            }
        }
        if (this.b.s.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = this.b.s.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - Duration.m1371getInWholeMillisecondsimpl(((c7b) entry.getValue()).c) > last && currentTimeMillis - this.b.d.get() > last) {
                    this.b.i(f78.EXCEPTION, ((c7b) entry.getValue()).a.m(), ((Short) entry.getKey()).shortValue(), ((c7b) entry.getValue()).b.b.a.N(), false, "read timeout");
                    this.b.k.e();
                    arrayList2.add((Short) entry.getKey());
                    z2 = true;
                    break;
                }
            }
            aaf aaf = new aaf();
            if (z2) {
                z68.n(this.b.a, (IOException) null, "session timeout", Arrays.copyOf(new Object[0], 0));
                for (c7b c7b : this.b.s.values()) {
                    c7b.a.h(aaf);
                }
                this.b.s.clear();
                this.b.l(0);
                this.b.g.set(false);
                return;
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Short sh = (Short) it2.next();
                c7b c7b2 = (c7b) this.b.s.get(sh);
                if (c7b2 != null) {
                    c7b2.a.h(aaf);
                    this.b.s.remove(sh);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01fe, code lost:
        r3.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0105, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0106, code lost:
        r25 = r4;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x014c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014d, code lost:
        r25 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c9, code lost:
        r1.b.i(defpackage.f78.EXCEPTION, r10.m(), r13, r12.N(), true, r0.getMessage());
        r10.h(new defpackage.aaf());
        r15.remove(java.lang.Short.valueOf(r13));
        r2.l(0);
        r11.set(false);
        r2.j();
        r2.k(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010a A[ExcHandler: IOException (r0v28 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:56:0x00f8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
            r26 = this;
            r1 = r26
            xvd r2 = r1.b
            java.util.List r0 = r2.t
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.concurrent.atomic.AtomicInteger r4 = r2.c
            int r0 = r4.get()
            r5 = 1
            r6 = 2
            java.util.List r7 = r2.t
            if (r0 != r5) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            int r0 = r4.get()
            if (r0 != r6) goto L_0x026a
        L_0x0025:
            java.util.Iterator r5 = r7.iterator()
        L_0x0029:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x026a
            java.lang.Object r0 = r5.next()
            r8 = r0
            f7b r8 = (defpackage.f7b) r8
            e7b r0 = r8.a
            e7b r9 = defpackage.e7b.a
            java.util.concurrent.atomic.AtomicBoolean r11 = r2.g
            if (r0 != r9) goto L_0x0206
            d7b r9 = r8.b
            if (r9 == 0) goto L_0x0206
            fbf r12 = r9.a
            boolean r0 = r12 instanceof defpackage.k88
            boolean r13 = r12 instanceof defpackage.n98
            boolean r14 = r12 instanceof defpackage.mwd
            java.util.concurrent.ConcurrentHashMap r15 = r2.s
            if (r0 != 0) goto L_0x0098
            if (r13 != 0) goto L_0x0098
            java.util.Iterator r13 = r7.iterator()
        L_0x0054:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L_0x006f
            java.lang.Object r16 = r13.next()
            r10 = r16
            f7b r10 = (defpackage.f7b) r10
            d7b r10 = r10.b
            if (r10 == 0) goto L_0x0054
            fbf r10 = r10.a
            if (r10 == 0) goto L_0x0054
            boolean r10 = r10 instanceof defpackage.n98
            if (r10 == 0) goto L_0x0054
            goto L_0x0029
        L_0x006f:
            java.util.Set r10 = r15.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0077:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0098
            java.lang.Object r13 = r10.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getValue()
            c7b r13 = (defpackage.c7b) r13
            f7b r13 = r13.b
            d7b r13 = r13.b
            if (r13 == 0) goto L_0x0077
            fbf r13 = r13.a
            if (r13 == 0) goto L_0x0077
            boolean r13 = r13 instanceof defpackage.n98
            if (r13 == 0) goto L_0x0077
            goto L_0x0029
        L_0x0098:
            boolean r10 = r12.U()
            if (r10 == 0) goto L_0x00a4
            int r10 = r4.get()
            if (r10 != r6) goto L_0x0029
        L_0x00a4:
            boolean r10 = r11.get()
            if (r10 != 0) goto L_0x00ae
            if (r14 != 0) goto L_0x00ae
            goto L_0x0029
        L_0x00ae:
            s9f r10 = r9.c
            r13 = 0
            if (r14 == 0) goto L_0x00de
            boolean r14 = r11.get()
            java.lang.String r6 = "session.state"
            if (r14 == 0) goto L_0x00c6
            qaf r0 = new qaf
            java.lang.String r9 = "SESSION_INIT already initialized"
            r0.<init>(r6, r9, r13)
            r10.h(r0)
            goto L_0x00d8
        L_0x00c6:
            java.lang.Class<mwd> r14 = defpackage.mwd.class
            boolean r14 = defpackage.xvd.a(r2, r8, r14)
            if (r14 == 0) goto L_0x00de
            qaf r0 = new qaf
            java.lang.String r9 = "SESSION_INIT already requested"
            r0.<init>(r6, r9, r13)
            r10.h(r0)
        L_0x00d8:
            r3.add(r8)
        L_0x00db:
            r6 = 2
            goto L_0x0029
        L_0x00de:
            long r17 = java.lang.System.currentTimeMillis()
            long r13 = r8.c
            long r13 = kotlin.time.Duration.m1371getInWholeMillisecondsimpl(r13)
            int r13 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x00ed
            goto L_0x00db
        L_0x00ed:
            java.util.concurrent.atomic.AtomicInteger r13 = r2.b
            r13.incrementAndGet()
            short r13 = r13.shortValue()
            if (r0 == 0) goto L_0x010d
            boolean r0 = r1.a(r8)     // Catch:{ IOException -> 0x010a, Exception -> 0x0105 }
            if (r0 == 0) goto L_0x010d
            r3.add(r8)
            goto L_0x00db
        L_0x0102:
            r0 = move-exception
            goto L_0x0202
        L_0x0105:
            r0 = move-exception
            r25 = r4
            r6 = 0
            goto L_0x0163
        L_0x010a:
            r0 = move-exception
            goto L_0x01c9
        L_0x010d:
            c7b r0 = new c7b     // Catch:{ IOException -> 0x010a, Exception -> 0x0105 }
            r0.<init>(r10, r8)     // Catch:{ IOException -> 0x010a, Exception -> 0x0105 }
            java.lang.Short r14 = java.lang.Short.valueOf(r13)     // Catch:{ IOException -> 0x010a, Exception -> 0x0105 }
            r15.put(r14, r0)     // Catch:{ IOException -> 0x010a, Exception -> 0x0105 }
            boolean r0 = r9.b     // Catch:{ IOException -> 0x010a, Exception -> 0x0105 }
            if (r0 == 0) goto L_0x0120
            r0 = 2
        L_0x011e:
            r9 = 0
            goto L_0x0122
        L_0x0120:
            r0 = 0
            goto L_0x011e
        L_0x0122:
            b7b r6 = defpackage.b7b.a(r12, r0, r9)     // Catch:{ IOException -> 0x010a, Exception -> 0x0105 }
            xvd r0 = r1.b     // Catch:{ IOException -> 0x010a, Exception -> 0x014c }
            f78 r18 = defpackage.f78.SEND     // Catch:{ IOException -> 0x010a, Exception -> 0x014c }
            long r19 = r10.m()     // Catch:{ IOException -> 0x010a, Exception -> 0x014c }
            short r22 = r12.N()     // Catch:{ IOException -> 0x010a, Exception -> 0x014c }
            java.lang.String r24 = r12.toString()     // Catch:{ IOException -> 0x010a, Exception -> 0x014c }
            r23 = 1
            r17 = r0
            r21 = r13
            r17.i(r18, r19, r21, r22, r23, r24)     // Catch:{ IOException -> 0x010a, Exception -> 0x014c }
            r23 r0 = r2.k     // Catch:{ IOException -> 0x010a, Exception -> 0x014c }
            boolean r0 = r0.d()     // Catch:{ IOException -> 0x010a, Exception -> 0x014c }
            if (r0 == 0) goto L_0x0150
            byte[] r0 = r6.c(r13)     // Catch:{ IOException -> 0x010a, Exception -> 0x014c }
            goto L_0x0154
        L_0x014c:
            r0 = move-exception
            r25 = r4
            goto L_0x0163
        L_0x0150:
            byte[] r0 = r6.b(r13)     // Catch:{ IOException -> 0x010a, Exception -> 0x014c }
        L_0x0154:
            java.io.DataOutputStream r9 = r2.o     // Catch:{ IOException -> 0x010a, Exception -> 0x014c }
            int r14 = r0.length     // Catch:{ IOException -> 0x010a, Exception -> 0x014c }
            r25 = r4
            r4 = 0
            r9.write(r0, r4, r14)     // Catch:{ IOException -> 0x010a, Exception -> 0x0162 }
        L_0x015d:
            r3.add(r8)
            goto L_0x0266
        L_0x0162:
            r0 = move-exception
        L_0x0163:
            xvd r4 = r1.b     // Catch:{ all -> 0x0102 }
            f78 r18 = defpackage.f78.EXCEPTION     // Catch:{ all -> 0x0102 }
            long r19 = r10.m()     // Catch:{ all -> 0x0102 }
            short r22 = r12.N()     // Catch:{ all -> 0x0102 }
            java.lang.String r24 = r0.getMessage()     // Catch:{ all -> 0x0102 }
            r23 = 1
            r17 = r4
            r21 = r13
            r17.i(r18, r19, r21, r22, r23, r24)     // Catch:{ all -> 0x0102 }
            boolean r4 = r0 instanceof java.lang.ArrayIndexOutOfBoundsException     // Catch:{ all -> 0x0102 }
            if (r4 != 0) goto L_0x0184
            boolean r4 = r0 instanceof net.jpountz.lz4.LZ4Exception     // Catch:{ all -> 0x0102 }
            if (r4 == 0) goto L_0x01b6
        L_0x0184:
            if (r6 == 0) goto L_0x01b6
            java.lang.String r4 = r2.a     // Catch:{ all -> 0x0102 }
            byte[] r6 = r6.b(r13)     // Catch:{ all -> 0x0102 }
            java.lang.String r9 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x01af }
            byte[] r6 = defpackage.f6e.o(r6)     // Catch:{ UnsupportedEncodingException -> 0x01af }
            java.lang.String r11 = "US-ASCII"
            r9.<init>(r6, r11)     // Catch:{ UnsupportedEncodingException -> 0x01af }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r6.<init>()     // Catch:{ all -> 0x0102 }
            java.lang.String r11 = "exception in LZ4, packet = "
            r6.append(r11)     // Catch:{ all -> 0x0102 }
            r6.append(r9)     // Catch:{ all -> 0x0102 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0102 }
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0102 }
            defpackage.z68.h(r4, r0, r6, r9)     // Catch:{ all -> 0x0102 }
            goto L_0x01b6
        L_0x01af:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0102 }
            r1.<init>(r0)     // Catch:{ all -> 0x0102 }
            throw r1     // Catch:{ all -> 0x0102 }
        L_0x01b6:
            aaf r4 = new aaf     // Catch:{ all -> 0x0102 }
            r4.<init>()     // Catch:{ all -> 0x0102 }
            r10.h(r4)     // Catch:{ all -> 0x0102 }
            java.lang.Short r4 = java.lang.Short.valueOf(r13)     // Catch:{ all -> 0x0102 }
            r15.remove(r4)     // Catch:{ all -> 0x0102 }
            r2.k(r0)     // Catch:{ all -> 0x0102 }
            goto L_0x015d
        L_0x01c9:
            xvd r1 = r1.b     // Catch:{ all -> 0x0102 }
            f78 r18 = defpackage.f78.EXCEPTION     // Catch:{ all -> 0x0102 }
            long r19 = r10.m()     // Catch:{ all -> 0x0102 }
            short r22 = r12.N()     // Catch:{ all -> 0x0102 }
            java.lang.String r24 = r0.getMessage()     // Catch:{ all -> 0x0102 }
            r23 = 1
            r17 = r1
            r21 = r13
            r17.i(r18, r19, r21, r22, r23, r24)     // Catch:{ all -> 0x0102 }
            aaf r1 = new aaf     // Catch:{ all -> 0x0102 }
            r1.<init>()     // Catch:{ all -> 0x0102 }
            r10.h(r1)     // Catch:{ all -> 0x0102 }
            java.lang.Short r1 = java.lang.Short.valueOf(r13)     // Catch:{ all -> 0x0102 }
            r15.remove(r1)     // Catch:{ all -> 0x0102 }
            r1 = 0
            r2.l(r1)     // Catch:{ all -> 0x0102 }
            r11.set(r1)     // Catch:{ all -> 0x0102 }
            r2.j()     // Catch:{ all -> 0x0102 }
            r2.k(r0)     // Catch:{ all -> 0x0102 }
            r3.add(r8)
            goto L_0x026a
        L_0x0202:
            r3.add(r8)
            throw r0
        L_0x0206:
            r25 = r4
            e7b r4 = defpackage.e7b.b
            if (r0 != r4) goto L_0x0266
            b7b r4 = r8.d
            if (r4 == 0) goto L_0x0266
            xvd r0 = r1.b     // Catch:{ IOException -> 0x023a }
            f78 r18 = defpackage.f78.SEND_ACK     // Catch:{ IOException -> 0x023a }
            short r6 = r4.c     // Catch:{ IOException -> 0x023a }
            short r9 = r4.d     // Catch:{ IOException -> 0x023a }
            java.lang.String r24 = ""
            r19 = 0
            r23 = 1
            r17 = r0
            r21 = r6
            r22 = r9
            r17.i(r18, r19, r21, r22, r23, r24)     // Catch:{ IOException -> 0x023a }
            short r0 = r4.c     // Catch:{ IOException -> 0x023a }
            byte[] r0 = r4.b(r0)     // Catch:{ IOException -> 0x023a }
            java.io.DataOutputStream r6 = r2.o     // Catch:{ IOException -> 0x023a }
            int r9 = r0.length     // Catch:{ IOException -> 0x023a }
            r10 = 0
            r6.write(r0, r10, r9)     // Catch:{ IOException -> 0x023a }
        L_0x0234:
            r3.add(r8)
            goto L_0x0266
        L_0x0238:
            r0 = move-exception
            goto L_0x0262
        L_0x023a:
            r0 = move-exception
            xvd r6 = r1.b     // Catch:{ all -> 0x0238 }
            f78 r18 = defpackage.f78.EXCEPTION     // Catch:{ all -> 0x0238 }
            short r9 = r4.c     // Catch:{ all -> 0x0238 }
            short r4 = r4.d     // Catch:{ all -> 0x0238 }
            java.lang.String r24 = r0.getMessage()     // Catch:{ all -> 0x0238 }
            r19 = 0
            r23 = 1
            r17 = r6
            r21 = r9
            r22 = r4
            r17.i(r18, r19, r21, r22, r23, r24)     // Catch:{ all -> 0x0238 }
            r4 = 0
            r2.l(r4)     // Catch:{ all -> 0x0238 }
            r11.set(r4)     // Catch:{ all -> 0x0238 }
            r2.j()     // Catch:{ all -> 0x0238 }
            r2.k(r0)     // Catch:{ all -> 0x0238 }
            goto L_0x0234
        L_0x0262:
            r3.add(r8)
            throw r0
        L_0x0266:
            r4 = r25
            goto L_0x00db
        L_0x026a:
            r7.removeAll(r3)
            r3.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvd.c():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: raf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: qaf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: raf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v18, resolved type: raf} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(defpackage.b7b r28, byte[] r29) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = 1
            xvd r4 = r1.b
            java.util.concurrent.ConcurrentHashMap r0 = r4.s
            short r5 = r2.c
            java.lang.Short r6 = java.lang.Short.valueOf(r5)
            java.lang.Object r0 = r0.get(r6)
            r6 = r0
            c7b r6 = (defpackage.c7b) r6
            java.lang.String r7 = r4.a
            if (r6 == 0) goto L_0x0382
            s9f r10 = r6.a
            byte r0 = r2.b
            if (r0 == r3) goto L_0x0370
            r11 = 3
            if (r0 == r11) goto L_0x0035
            java.lang.String r1 = "illegal state in handleResponse, cmd: "
            java.lang.String r0 = defpackage.wj6.h(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            defpackage.z68.f(r7, r0, r1)
            r4.k(r1)
            return
        L_0x0035:
            hbf r0 = defpackage.ibf.b
            pf9 r11 = defpackage.fd9.a(r29)
            java.lang.String r12 = "payloadCatching catch error"
            java.lang.String r13 = "ServerPayload/PayloadCatching"
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
            r15.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            boolean r0 = r11.m()
            if (r0 == 0) goto L_0x02d8
            int r0 = defpackage.ryg.e0(r11)     // Catch:{ all -> 0x0068 }
            r16 = r5
            r17 = r7
            r5 = r0
            goto L_0x00a5
        L_0x0068:
            r0 = move-exception
            r16 = r5
            r5 = r0
            defpackage.z68.o(r13, r12, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0075:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x008b
            java.lang.Object r17 = r0.next()
            r29 = r0
            r0 = r17
            xm r0 = (defpackage.xm) r0
            r0.a(r5)
            r0 = r29
            goto L_0x0075
        L_0x008b:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x00a2
            r7 = 1
            if (r0 == r7) goto L_0x00a1
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00a1:
            throw r5
        L_0x00a2:
            r17 = r7
            r5 = 0
        L_0x00a5:
            r7 = 0
        L_0x00a6:
            if (r7 >= r5) goto L_0x02d5
            java.lang.String r0 = defpackage.ryg.g0(r11)     // Catch:{ all -> 0x00b1 }
            r18 = r4
            r29 = r5
            goto L_0x00ee
        L_0x00b1:
            r0 = move-exception
            r29 = r5
            r5 = r0
            defpackage.z68.o(r13, r12, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00be:
            boolean r18 = r0.hasNext()
            if (r18 == 0) goto L_0x00d4
            java.lang.Object r18 = r0.next()
            r19 = r0
            r0 = r18
            xm r0 = (defpackage.xm) r0
            r0.a(r5)
            r0 = r19
            goto L_0x00be
        L_0x00d4:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x00eb
            r4 = 1
            if (r0 == r4) goto L_0x00ea
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ea:
            throw r5
        L_0x00eb:
            r18 = r4
            r0 = 0
        L_0x00ee:
            if (r0 != 0) goto L_0x00f3
        L_0x00f0:
            r4 = 1
            goto L_0x02ce
        L_0x00f3:
            int r4 = r0.hashCode()
            switch(r4) {
                case -1724546052: goto L_0x0242;
                case 96784904: goto L_0x01f1;
                case 110371416: goto L_0x019f;
                case 954925063: goto L_0x014d;
                case 1122960396: goto L_0x00fc;
                default: goto L_0x00fa;
            }
        L_0x00fa:
            goto L_0x024a
        L_0x00fc:
            java.lang.String r4 = "localizedMessage"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0106
            goto L_0x024a
        L_0x0106:
            T r0 = r3.element
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = defpackage.ryg.g0(r11)     // Catch:{ all -> 0x0110 }
            goto L_0x014a
        L_0x0110:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r13, r12, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x011b:
            boolean r19 = r0.hasNext()
            if (r19 == 0) goto L_0x0131
            java.lang.Object r19 = r0.next()
            r20 = r0
            r0 = r19
            xm r0 = (defpackage.xm) r0
            r0.a(r5)
            r0 = r20
            goto L_0x011b
        L_0x0131:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0148
            r4 = 1
            if (r0 == r4) goto L_0x0147
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0147:
            throw r5
        L_0x0148:
            r19 = r4
        L_0x014a:
            r3.element = r4
            goto L_0x00f0
        L_0x014d:
            java.lang.String r4 = "message"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0157
            goto L_0x024a
        L_0x0157:
            T r0 = r15.element
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = defpackage.ryg.g0(r11)     // Catch:{ all -> 0x0161 }
            goto L_0x019b
        L_0x0161:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r13, r12, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x016c:
            boolean r19 = r0.hasNext()
            if (r19 == 0) goto L_0x0182
            java.lang.Object r19 = r0.next()
            r20 = r0
            r0 = r19
            xm r0 = (defpackage.xm) r0
            r0.a(r5)
            r0 = r20
            goto L_0x016c
        L_0x0182:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0199
            r4 = 1
            if (r0 == r4) goto L_0x0198
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0198:
            throw r5
        L_0x0199:
            r19 = r4
        L_0x019b:
            r15.element = r4
            goto L_0x00f0
        L_0x019f:
            java.lang.String r4 = "title"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01a9
            goto L_0x024a
        L_0x01a9:
            T r0 = r9.element
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = defpackage.ryg.g0(r11)     // Catch:{ all -> 0x01b3 }
            goto L_0x01ed
        L_0x01b3:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r13, r12, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01be:
            boolean r19 = r0.hasNext()
            if (r19 == 0) goto L_0x01d4
            java.lang.Object r19 = r0.next()
            r20 = r0
            r0 = r19
            xm r0 = (defpackage.xm) r0
            r0.a(r5)
            r0 = r20
            goto L_0x01be
        L_0x01d4:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01eb
            r4 = 1
            if (r0 == r4) goto L_0x01ea
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01ea:
            throw r5
        L_0x01eb:
            r19 = r4
        L_0x01ed:
            r9.element = r4
            goto L_0x00f0
        L_0x01f1:
            java.lang.String r4 = "error"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01fa
            goto L_0x024a
        L_0x01fa:
            T r0 = r14.element
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = defpackage.ryg.g0(r11)     // Catch:{ all -> 0x0204 }
            goto L_0x023e
        L_0x0204:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r13, r12, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x020f:
            boolean r19 = r0.hasNext()
            if (r19 == 0) goto L_0x0225
            java.lang.Object r19 = r0.next()
            r20 = r0
            r0 = r19
            xm r0 = (defpackage.xm) r0
            r0.a(r5)
            r0 = r20
            goto L_0x020f
        L_0x0225:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x023c
            r4 = 1
            if (r0 == r4) goto L_0x023b
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x023b:
            throw r5
        L_0x023c:
            r19 = r4
        L_0x023e:
            r14.element = r4
            goto L_0x00f0
        L_0x0242:
            java.lang.String r4 = "description"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0283
        L_0x024a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r11.A()     // Catch:{ all -> 0x0251 }
            goto L_0x00f0
        L_0x0251:
            r0 = move-exception
            r4 = r0
            defpackage.z68.o(r13, r12, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x025c:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x026c
            java.lang.Object r5 = r0.next()
            xm r5 = (defpackage.xm) r5
            r5.a(r4)
            goto L_0x025c
        L_0x026c:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x00f0
            r5 = 1
            if (r0 == r5) goto L_0x0282
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0282:
            throw r4
        L_0x0283:
            T r0 = r8.element
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = defpackage.ryg.g0(r11)     // Catch:{ all -> 0x028f }
            r0 = r4
            r4 = 1
            goto L_0x02cc
        L_0x028f:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r13, r12, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x029a:
            boolean r19 = r0.hasNext()
            if (r19 == 0) goto L_0x02b0
            java.lang.Object r19 = r0.next()
            r20 = r0
            r0 = r19
            xm r0 = (defpackage.xm) r0
            r0.a(r5)
            r0 = r20
            goto L_0x029a
        L_0x02b0:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x02c7
            r4 = 1
            if (r0 == r4) goto L_0x02c6
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02c6:
            throw r5
        L_0x02c7:
            r19 = r4
            r4 = 1
            r0 = r19
        L_0x02cc:
            r8.element = r0
        L_0x02ce:
            int r7 = r7 + r4
            r5 = r29
            r4 = r18
            goto L_0x00a6
        L_0x02d5:
            r18 = r4
            goto L_0x02de
        L_0x02d8:
            r18 = r4
            r16 = r5
            r17 = r7
        L_0x02de:
            T r0 = r8.element
            if (r0 == 0) goto L_0x0306
            raf r4 = new raf
            T r5 = r14.element
            r20 = r5
            java.lang.String r20 = (java.lang.String) r20
            T r5 = r15.element
            r21 = r5
            java.lang.String r21 = (java.lang.String) r21
            T r3 = r3.element
            r22 = r3
            java.lang.String r22 = (java.lang.String) r22
            T r3 = r9.element
            r23 = r3
            java.lang.String r23 = (java.lang.String) r23
            r24 = r0
            java.lang.String r24 = (java.lang.String) r24
            r19 = r4
            r19.<init>(r20, r21, r22, r23, r24)
            goto L_0x0317
        L_0x0306:
            qaf r4 = new qaf
            T r0 = r14.element
            java.lang.String r0 = (java.lang.String) r0
            T r5 = r15.element
            java.lang.String r5 = (java.lang.String) r5
            T r3 = r3.element
            java.lang.String r3 = (java.lang.String) r3
            r4.<init>(r0, r5, r3)
        L_0x0317:
            f78 r20 = defpackage.f78.ERROR
            long r21 = r10.m()
            f7b r0 = r6.b
            d7b r0 = r0.b
            fbf r0 = r0.a
            short r24 = r0.N()
            java.lang.String r26 = r4.toString()
            r25 = 0
            short r0 = r2.c
            xvd r1 = r1.b
            r19 = r1
            r23 = r0
            r19.i(r20, r21, r23, r24, r25, r26)
            java.lang.String r0 = "proto.state"
            java.lang.String r1 = r4.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x036a
            r18.e()     // Catch:{ IOException -> 0x0353, all -> 0x034d }
            r3 = r18
            r1 = 0
            r2 = 1
        L_0x0349:
            r3.f(r2, r1)
            goto L_0x036c
        L_0x034d:
            r0 = move-exception
            r3 = r18
        L_0x0350:
            r1 = 0
            r2 = 1
            goto L_0x0366
        L_0x0353:
            r0 = move-exception
            r3 = r18
            r1 = r0
            java.lang.String r0 = "exception in handleError"
            r2 = r17
            defpackage.z68.f(r2, r0, r1)     // Catch:{ all -> 0x0364 }
            r3.k(r1)     // Catch:{ all -> 0x0364 }
            r1 = 0
            r2 = 1
            goto L_0x0349
        L_0x0364:
            r0 = move-exception
            goto L_0x0350
        L_0x0366:
            r3.f(r2, r1)
            throw r0
        L_0x036a:
            r3 = r18
        L_0x036c:
            r10.h(r4)
            goto L_0x0378
        L_0x0370:
            r0 = r29
            r3 = r4
            r16 = r5
            r1.e(r0, r2, r10)
        L_0x0378:
            java.util.concurrent.ConcurrentHashMap r0 = r3.s
            java.lang.Short r1 = java.lang.Short.valueOf(r16)
            r0.remove(r1)
            goto L_0x0390
        L_0x0382:
            r2 = r7
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "illegal state in handleResponse, reader task is null"
            r3 = 0
            defpackage.z68.n(r2, r3, r1, r0)
        L_0x0390:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvd.d(b7b, byte[]):void");
    }

    public void e(byte[] bArr, b7b b7b, s9f s9f) {
        String o9f;
        f78 f78 = b7b.b == 1 ? f78.RECEIVE : f78.NOTIF;
        if (bArr.length > 0) {
            ibf b2 = ibf.b(b7b.d, bArr);
            boolean z = b2 instanceof nwd;
            if (z && ((nwd) b2).v != 1) {
                this.b.g.set(true);
            } else if (z && ((nwd) b2).v == 1) {
                s9f.e(b2);
                this.b.d(true);
                return;
            }
            if (b2 instanceof l88) {
                this.b.l(2);
                xvd xvd = this.b;
                if (xvd.f.get() == 0) {
                    jxd jxd = (jxd) xvd.q;
                    jxd.i = 2;
                    jxd.a();
                }
            }
            if (b2 == null) {
                short s = b7b.d;
                x3b.c.getClass();
                String concat = "Unknown response type, define it in TamResponse.decode: ".concat(s9a.f(s));
                IllegalStateException illegalStateException = new IllegalStateException(concat);
                this.b.i(f78, s9f.m(), b7b.c, b7b.d, false, illegalStateException.toString());
                z68.f(this.b.a, concat, illegalStateException);
                this.b.k(illegalStateException);
                return;
            }
            if (b2 instanceof g88) {
                Class<bud> cls = bud.class;
                akd akd = (akd) ((bud) this.b.m.a.g(cls));
                akd.getClass();
                boolean m = akd.m(PmsKey.f58logfull, false);
                akd akd2 = (akd) ((bud) this.b.m.a.g(cls));
                akd2.getClass();
                o9f = ((g88) b2).a(m, akd2.m(PmsKey.f59logsensitive, false));
            } else {
                o9f = b2.toString();
            }
            this.b.i(f78, s9f.m(), b7b.c, b7b.d, false, o9f);
            s9f.e(b2);
            return;
        }
        this.b.i(f78, s9f.m(), b7b.c, b7b.d, false, "empty");
        short s2 = b7b.d;
        s9a s9a = x3b.c;
        if (s2 == 20) {
            this.b.s.remove(Short.valueOf(b7b.c));
            s9f.e(ibf.b);
            this.b.f(false, false);
            return;
        }
        s9f.e(ibf.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r13.b.f.get() != 0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = r13.b.t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        defpackage.z68.f(r13.b.a, "exception in packet sender", r0);
        r13.b.k(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r13.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        r0 = r13.b;
        r1 = r0.f;
        r2 = r0.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        if (r1.get() != 0) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
        if (r0.h() == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006c, code lost:
        if (r0.f.get() != 1) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0.f.get() != 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        java.lang.Thread.sleep(100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0076, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0079, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r5 = new byte[10];
        r0.p.readFully(r5, 0, 10);
        r3 = new defpackage.b7b(r5);
        r9 = r3.g;
        r7 = new byte[r9];
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008f, code lost:
        r5 = r3.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0091, code lost:
        if (r4 >= r5) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0093, code lost:
        r5 = r0.p.read(r7, r4, java.lang.Math.min(256, r9 - r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a1, code lost:
        if (r5 < 0) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a3, code lost:
        r4 = r4 + r5;
        r0.d.set(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b3, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b4, code lost:
        r4 = r3.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b6, code lost:
        if (r4 == 0) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b8, code lost:
        r12 = r5 * r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r4 = new byte[r12];
        defpackage.kr7.u().safeDecompressor().decompress(r7, 0, r9, r4, 0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ca, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cc, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        defpackage.z68.h(r2, r4, "LZ4Utils.decompress failure! packet = %s", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d6, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00d9, code lost:
        if (r3.b != 0) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00db, code lost:
        e(r7, r3, new defpackage.zqd(r13, r3, false, 23));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e8, code lost:
        d(r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ed, code lost:
        defpackage.z68.f(r2, "exception in packet reader", r1);
        r0.k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f7, code lost:
        defpackage.z68.n(r2, r3, "IOException in packet reader", new java.lang.Object[0]);
        r0.f(false, false);
        r0.k(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        defpackage.z68.f(r0.a, "exception in timeout handler", r1);
        r0.k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.a
            switch(r0) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0025;
                default: goto L_0x0005;
            }
        L_0x0005:
            xvd r0 = r13.b
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f
            int r1 = r1.get()
            if (r1 != 0) goto L_0x0024
            r13.b()     // Catch:{ Exception -> 0x0013 }
            goto L_0x001e
        L_0x0013:
            r1 = move-exception
            java.lang.String r2 = r0.a
            java.lang.String r3 = "exception in timeout handler"
            defpackage.z68.f(r2, r3, r1)
            r0.k(r1)
        L_0x001e:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0024 }
            goto L_0x0005
        L_0x0024:
            return
        L_0x0025:
            xvd r0 = r13.b
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f
            int r0 = r0.get()
            if (r0 != 0) goto L_0x0051
            xvd r0 = r13.b     // Catch:{ Exception -> 0x003c }
            java.util.List r0 = r0.t     // Catch:{ Exception -> 0x003c }
            monitor-enter(r0)     // Catch:{ Exception -> 0x003c }
            r13.c()     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x004b
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r1     // Catch:{ Exception -> 0x003c }
        L_0x003c:
            r0 = move-exception
            xvd r1 = r13.b
            java.lang.String r1 = r1.a
            java.lang.String r2 = "exception in packet sender"
            defpackage.z68.f(r1, r2, r0)
            xvd r1 = r13.b
            r1.k(r0)
        L_0x004b:
            r0 = 100
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0051 }
            goto L_0x0025
        L_0x0051:
            return
        L_0x0052:
            xvd r0 = r13.b
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f
            java.lang.String r2 = r0.a
            int r1 = r1.get()
            if (r1 != 0) goto L_0x0106
        L_0x005e:
            r1 = 0
            boolean r3 = r0.h()     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            if (r3 == 0) goto L_0x007c
            java.util.concurrent.atomic.AtomicInteger r3 = r0.f     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            int r3 = r3.get()     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            r4 = 1
            if (r3 != r4) goto L_0x0070
            goto L_0x0106
        L_0x0070:
            r3 = 100
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0106 }
            goto L_0x005e
        L_0x0076:
            r1 = move-exception
            goto L_0x00ed
        L_0x0079:
            r3 = move-exception
            goto L_0x00f7
        L_0x007c:
            java.io.DataInputStream r3 = r0.p     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            r4 = 10
            byte[] r5 = new byte[r4]     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            r3.readFully(r5, r1, r4)     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            b7b r3 = new b7b     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            int r9 = r3.g     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            byte[] r7 = new byte[r9]     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            r4 = r1
        L_0x008f:
            int r5 = r3.g     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            if (r4 >= r5) goto L_0x00b4
            java.io.DataInputStream r5 = r0.p     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            int r6 = r9 - r4
            r8 = 256(0x100, float:3.59E-43)
            int r6 = java.lang.Math.min(r8, r6)     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            int r5 = r5.read(r7, r4, r6)     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            if (r5 < 0) goto L_0x00ae
            int r4 = r4 + r5
            java.util.concurrent.atomic.AtomicLong r5 = r0.d     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            r5.set(r10)     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            goto L_0x008f
        L_0x00ae:
            java.io.EOFException r3 = new java.io.EOFException     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            r3.<init>()     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            throw r3     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
        L_0x00b4:
            byte r4 = r3.e     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            if (r4 == 0) goto L_0x00d7
            int r12 = r5 * r4
            byte[] r4 = new byte[r12]     // Catch:{ all -> 0x00cc }
            net.jpountz.lz4.LZ4Factory r5 = defpackage.kr7.u()     // Catch:{ all -> 0x00cc }
            net.jpountz.lz4.LZ4SafeDecompressor r6 = r5.safeDecompressor()     // Catch:{ all -> 0x00cc }
            r11 = 0
            r8 = 0
            r10 = r4
            r6.decompress((byte[]) r7, (int) r8, (int) r9, (byte[]) r10, (int) r11, (int) r12)     // Catch:{ all -> 0x00cc }
            r7 = r4
            goto L_0x00d7
        L_0x00cc:
            r4 = move-exception
            java.lang.String r5 = "LZ4Utils.decompress failure! packet = %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            defpackage.z68.h(r2, r4, r5, r3)     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            throw r4     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
        L_0x00d7:
            byte r4 = r3.b     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            if (r4 != 0) goto L_0x00e8
            zqd r4 = new zqd     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            r5 = 23
            r6 = 0
            r4.<init>(r13, r3, r6, r5)     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            r13.e(r7, r3, r4)     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            goto L_0x0052
        L_0x00e8:
            r13.d(r3, r7)     // Catch:{ IOException -> 0x0079, Exception -> 0x0076 }
            goto L_0x0052
        L_0x00ed:
            java.lang.String r3 = "exception in packet reader"
            defpackage.z68.f(r2, r3, r1)
            r0.k(r1)
            goto L_0x0052
        L_0x00f7:
            java.lang.String r4 = "IOException in packet reader"
            java.lang.Object[] r5 = new java.lang.Object[r1]
            defpackage.z68.n(r2, r3, r4, r5)
            r0.f(r1, r1)
            r0.k(r3)
            goto L_0x0052
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvd.run():void");
    }
}
