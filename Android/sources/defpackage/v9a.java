package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.List;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* renamed from: v9a  reason: default package */
public final class v9a implements qqb, qk3, zi6, fc3, q17, Provider, p5a, g8b, lla {
    public static v9a b;
    public static final v9a c = new v9a(1);
    public static final v9a o = new v9a(2);
    public static final v9a v = new v9a(3);
    public static final v9a w = new v9a(4);
    public static final v9a x = new v9a(5);
    public static final v9a y = new v9a(6);
    public final /* synthetic */ int a;

    public /* synthetic */ v9a(int i) {
        this.a = i;
    }

    public static synchronized v9a a() {
        v9a v9a;
        synchronized (v9a.class) {
            try {
                if (b == null) {
                    b = new v9a(0);
                }
                v9a = b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return v9a;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                z68.f(dl2.i, "failed to put notifications history items", (Throwable) obj);
                return;
            case 4:
                mfa.b.getClass();
                z68.f(mfa.o, "onLogout: clear failed", (Throwable) obj);
                return;
            default:
                z68.f(ipg.o, "failure!", (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        return jha.n((List) obj);
    }

    public rnd b() {
        return new tq5(-9223372036854775807L);
    }

    public void c(long j) {
    }

    public Object d() {
        throw new RuntimeException("No update");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00b5 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(java.lang.String r5) {
        /*
            r4 = this;
            nfe[] r4 = com.facebook.soloader.SoLoader.e
            r0 = 0
            if (r4 != 0) goto L_0x0065
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r4.readLock()
            r1.lock()
            nfe[] r1 = com.facebook.soloader.SoLoader.e     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = "http://www.android.com/"
            java.lang.String r2 = "java.vendor.url"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x0051 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x002f
            boolean r1 = com.facebook.soloader.SoLoader.h()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0027
            goto L_0x0053
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = "SoLoader.init() not yet called"
            r4.<init>(r5)     // Catch:{ all -> 0x0051 }
            throw r4     // Catch:{ all -> 0x0051 }
        L_0x002f:
            java.lang.Class<com.facebook.soloader.SoLoader> r1 = com.facebook.soloader.SoLoader.class
            monitor-enter(r1)     // Catch:{ all -> 0x0051 }
            java.util.HashSet r2 = com.facebook.soloader.SoLoader.h     // Catch:{ all -> 0x0040 }
            boolean r2 = r2.contains(r5)     // Catch:{ all -> 0x0040 }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0042
            java.lang.System.loadLibrary(r5)     // Catch:{ all -> 0x0040 }
            goto L_0x0042
        L_0x0040:
            r4 = move-exception
            goto L_0x004f
        L_0x0042:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0040 }
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r4.readLock()
            r4.unlock()
            goto L_0x0066
        L_0x004f:
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            throw r4     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r4 = move-exception
            goto L_0x005b
        L_0x0053:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r4.readLock()
            r4.unlock()
            goto L_0x0065
        L_0x005b:
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r5.readLock()
            r5.unlock()
            throw r4
        L_0x0065:
            r2 = r0
        L_0x0066:
            if (r2 == 0) goto L_0x006d
            boolean r4 = r2.booleanValue()
            goto L_0x0086
        L_0x006d:
            boolean r4 = com.facebook.soloader.SoLoader.k
            if (r4 != 0) goto L_0x0076
            boolean r4 = defpackage.o5a.P(r5)
            goto L_0x0086
        L_0x0076:
            int r4 = com.facebook.soloader.SoLoader.m
            r1 = 2
            if (r4 == r1) goto L_0x007c
            r1 = 3
        L_0x007c:
            java.lang.String r4 = java.lang.System.mapLibraryName(r5)
            r1 = r0
        L_0x0081:
            r2 = 0
            boolean r4 = com.facebook.soloader.SoLoader.i(r4, r5, r2, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0087 }
        L_0x0086:
            return r4
        L_0x0087:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r3.writeLock()
            r3.lock()
            if (r1 != 0) goto L_0x009c
            ni0 r1 = com.facebook.soloader.SoLoader.d()     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            goto L_0x009c
        L_0x0098:
            r4 = move-exception
            goto L_0x00b7
        L_0x009a:
            r4 = move-exception
            goto L_0x00b6
        L_0x009c:
            if (r1 == 0) goto L_0x00c1
            nfe[] r3 = com.facebook.soloader.SoLoader.e     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            boolean r3 = r1.j(r2, r3)     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            if (r3 == 0) goto L_0x00c1
            java.util.concurrent.atomic.AtomicInteger r3 = com.facebook.soloader.SoLoader.f     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            r3.getAndIncrement()     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r2.writeLock()
            r2.unlock()
            goto L_0x0081
        L_0x00b5:
            throw r2     // Catch:{ all -> 0x0098 }
        L_0x00b6:
            throw r4     // Catch:{ all -> 0x0098 }
        L_0x00b7:
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r5.writeLock()
            r5.unlock()
            throw r4
        L_0x00c1:
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()
            r4.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9a.e(java.lang.String):boolean");
    }

    public o8b f() {
        return new o17();
    }

    public Object g(soc soc) {
        return new y95((Executor) soc.g(new pac(cvf.class, Executor.class)));
    }

    public Object get() {
        switch (this.a) {
            case 11:
                return "com.google.android.datatransport.events";
            default:
                return new lzf(1);
        }
    }

    public boolean h() {
        return false;
    }

    public long i(gf4 gf4) {
        return -1;
    }

    public o8b j(k17 k17, c17 c17) {
        return new o17(k17, c17);
    }

    public Object k() {
        return null;
    }

    public v9a(Context context) {
        this.a = 21;
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
