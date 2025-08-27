package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: d6b  reason: default package */
public final class d6b {
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public final hs7 a;

    public d6b(hs7 hs7) {
        this.a = hs7;
    }

    public static void a(long j) {
        ConcurrentHashMap concurrentHashMap = b;
        b6b b6b = (b6b) concurrentHashMap.get(Long.valueOf(j));
        if (b6b != null) {
            mq4 mq4 = b6b.b;
            if (mq4 != null && !mq4.f()) {
                mq4.dispose();
            }
            concurrentHashMap.remove(Long.valueOf(j));
        }
        c.remove(Long.valueOf(j));
    }

    public static void b(long j, long j2) {
        b6b b6b;
        if (j != 0 && (b6b = (b6b) b.get(Long.valueOf(j))) != null) {
            Iterator it = b6b.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((a6b) it.next()).b == j2) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
            if (b6b.a.isEmpty()) {
                mq4 mq4 = b6b.b;
                if (mq4 != null && !mq4.f()) {
                    mq4.dispose();
                }
                b.remove(Long.valueOf(j));
            }
        }
    }

    public static b6b c(long j) {
        ConcurrentHashMap concurrentHashMap = b;
        b6b b6b = (b6b) concurrentHashMap.get(Long.valueOf(j));
        if (b6b != null) {
            return b6b;
        }
        b6b b6b2 = new b6b();
        concurrentHashMap.put(Long.valueOf(j), b6b2);
        return b6b2;
    }

    public final void d(long j, b10 b10) {
        if (j != 0) {
            long nanoTime = System.nanoTime();
            ConcurrentHashMap concurrentHashMap = c;
            c6b c6b = (c6b) concurrentHashMap.get(Long.valueOf(j));
            if (c6b != null) {
                if (b10 != c6b.b) {
                    concurrentHashMap.remove(Long.valueOf(j));
                } else if (Math.abs(nanoTime - c6b.a) < 5000000000L) {
                    return;
                }
            }
            concurrentHashMap.put(Long.valueOf(j), new c6b(nanoTime, b10));
            jna jna = (jna) ((rl) this.a.get());
            jna.z(jna, new or3(2, ((ltb) jna.D()).a.n(), j, b10));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0009
            monitor-exit(r7)
            return
        L_0x0009:
            b6b r0 = c(r8)     // Catch:{ all -> 0x0018 }
            mq4 r1 = r0.b     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.f()     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0054
            goto L_0x001a
        L_0x0018:
            r8 = move-exception
            goto L_0x0056
        L_0x001a:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0018 }
            lfd r6 = defpackage.xfd.a()     // Catch:{ all -> 0x0018 }
            r1 = 0
            r3 = 6
            hja r1 = defpackage.jha.o(r1, r3, r5, r6)     // Catch:{ all -> 0x0018 }
            lfd r2 = defpackage.xfd.b()     // Catch:{ all -> 0x0018 }
            lja r1 = r1.s(r2)     // Catch:{ all -> 0x0018 }
            z5b r2 = new z5b     // Catch:{ all -> 0x0018 }
            r2.<init>(r7, r8)     // Catch:{ all -> 0x0018 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            jha r1 = r1.m(r2, r3)     // Catch:{ all -> 0x0018 }
            q0a r2 = new q0a     // Catch:{ all -> 0x0018 }
            r3 = 29
            r2.<init>((int) r3)     // Catch:{ all -> 0x0018 }
            z5b r3 = new z5b     // Catch:{ all -> 0x0018 }
            r3.<init>(r7, r8)     // Catch:{ all -> 0x0018 }
            dj6 r8 = defpackage.m58.e     // Catch:{ all -> 0x0018 }
            or7 r9 = new or7     // Catch:{ all -> 0x0018 }
            r9.<init>(r2, r3, r8)     // Catch:{ all -> 0x0018 }
            r1.a(r9)     // Catch:{ all -> 0x0018 }
            r0.b = r9     // Catch:{ all -> 0x0018 }
        L_0x0054:
            monitor-exit(r7)
            return
        L_0x0056:
            monitor-exit(r7)     // Catch:{ all -> 0x0018 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6b.e(long):void");
    }

    public final void f(long j, b10 b10, long j2) {
        if (j != 0) {
            if (b10 == b10.AUDIO || b10 == b10.VIDEO || b10 == b10.FILE) {
                LinkedBlockingDeque linkedBlockingDeque = c(j).a;
                Iterator it = linkedBlockingDeque.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((a6b) it.next()).b == j2) {
                            break;
                        }
                    } else {
                        linkedBlockingDeque.push(new a6b(j2, b10));
                        break;
                    }
                }
                e(j);
                return;
            }
            b6b b6b = (b6b) b.get(Long.valueOf(j));
            if (b6b == null || b6b.a.isEmpty() || b6b.b == null || b6b.b.f()) {
                d(j, b10);
            }
        }
    }
}
