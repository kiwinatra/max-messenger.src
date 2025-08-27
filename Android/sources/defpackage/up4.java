package defpackage;

import android.os.StatFs;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: up4  reason: default package */
public final class up4 implements nl5 {
    public static final long n = TimeUnit.HOURS.toMillis(2);
    public static final long o = TimeUnit.MINUTES.toMillis(30);
    public final long a;
    public final long b;
    public long c;
    public final HashSet d;
    public long e;
    public final ime f;
    public final tp4 g;
    public final s9a h;
    public final o9a i;
    public final boolean j;
    public final yw0 k;
    public final djd l;
    public final Object m = new Object();

    /* JADX WARNING: type inference failed for: r5v4, types: [yw0, java.lang.Object] */
    public up4(ty4 ty4, s9a s9a, ap0 ap0, p9a p9a, o9a o9a, ExecutorService executorService) {
        ime ime;
        this.a = ap0.b;
        long j2 = ap0.c;
        this.b = j2;
        this.c = j2;
        ime ime2 = ime.h;
        synchronized (ime.class) {
            try {
                if (ime.h == null) {
                    ime.h = new ime();
                }
                ime = ime.h;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f = ime;
        this.g = ty4;
        this.h = s9a;
        this.e = -1;
        this.i = o9a;
        ? obj = new Object();
        obj.a = false;
        obj.b = -1;
        obj.c = -1;
        this.k = obj;
        this.l = djd.x;
        this.j = false;
        this.d = new HashSet();
        new CountDownLatch(0);
    }

    public final void a() {
        synchronized (this.m) {
            try {
                this.g.e();
                this.d.clear();
            } catch (IOException | NullPointerException e2) {
                o9a o9a = this.i;
                e2.getMessage();
                o9a.getClass();
            }
            yw0 yw0 = this.k;
            synchronized (yw0) {
                yw0.a = false;
                yw0.c = -1;
                yw0.b = -1;
            }
        }
    }

    public final void b(long j2) {
        tp4 tp4 = this.g;
        try {
            ArrayList d2 = d(tp4.d());
            yw0 yw0 = this.k;
            long a2 = yw0.a() - j2;
            Iterator it = d2.iterator();
            int i2 = 0;
            long j3 = 0;
            while (it.hasNext()) {
                yd4 yd4 = (yd4) it.next();
                if (j3 > a2) {
                    break;
                }
                long c2 = tp4.c(yd4);
                this.d.remove(yd4.a);
                if (c2 > 0) {
                    i2++;
                    j3 += c2;
                    vs6.r().u();
                }
            }
            yw0.b(-j3, (long) (-i2));
            tp4.b();
        } catch (IOException e2) {
            e2.getMessage();
            this.i.getClass();
            throw e2;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ml5 c(defpackage.qx0 r9) {
        /*
            r8 = this;
            vs6 r0 = defpackage.vs6.r()
            r1 = 0
            java.lang.Object r2 = r8.m     // Catch:{ IOException -> 0x0042 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0042 }
            java.util.ArrayList r3 = defpackage.m58.v(r9)     // Catch:{ all -> 0x0027 }
            r4 = 0
            r5 = r1
            r6 = r5
        L_0x000f:
            int r7 = r3.size()     // Catch:{ all -> 0x0027 }
            if (r4 >= r7) goto L_0x0029
            java.lang.Object r5 = r3.get(r4)     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0027 }
            tp4 r6 = r8.g     // Catch:{ all -> 0x0027 }
            ml5 r6 = r6.a(r9, r5)     // Catch:{ all -> 0x0027 }
            if (r6 == 0) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0027:
            r9 = move-exception
            goto L_0x003e
        L_0x0029:
            if (r6 != 0) goto L_0x0031
            java.util.HashSet r9 = r8.d     // Catch:{ all -> 0x0027 }
            r9.remove(r5)     // Catch:{ all -> 0x0027 }
            goto L_0x0039
        L_0x0031:
            r5.getClass()     // Catch:{ all -> 0x0027 }
            java.util.HashSet r9 = r8.d     // Catch:{ all -> 0x0027 }
            r9.add(r5)     // Catch:{ all -> 0x0027 }
        L_0x0039:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            r0.u()
            return r6
        L_0x003e:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            throw r9     // Catch:{ IOException -> 0x0042 }
        L_0x0040:
            r8 = move-exception
            goto L_0x004b
        L_0x0042:
            o9a r8 = r8.i     // Catch:{ all -> 0x0040 }
            r8.getClass()     // Catch:{ all -> 0x0040 }
            r0.u()
            return r1
        L_0x004b:
            r0.u()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up4.c(qx0):ml5");
    }

    public final ArrayList d(Collection collection) {
        this.l.getClass();
        long currentTimeMillis = System.currentTimeMillis() + n;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            yd4 yd4 = (yd4) it.next();
            if (yd4.a() > currentTimeMillis) {
                arrayList.add(yd4);
            } else {
                arrayList2.add(yd4);
            }
        }
        this.h.getClass();
        Collections.sort(arrayList2, new cx4(22));
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final ml5 e(qx0 qx0, ba baVar) {
        boolean z;
        String encodeToString;
        w28 g2;
        ml5 B;
        vs6 r = vs6.r();
        synchronized (this.m) {
            try {
                byte[] bytes = qx0.c().getBytes(Charset.forName("UTF-8"));
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                z = false;
                instance.update(bytes, 0, bytes.length);
                encodeToString = Base64.encodeToString(instance.digest(), 11);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            } catch (UnsupportedEncodingException e3) {
                throw new RuntimeException(e3);
            }
        }
        try {
            g2 = g(encodeToString, qx0);
            g2.S(baVar);
            synchronized (this.m) {
                B = g2.B();
                this.d.add(encodeToString);
                this.k.b(B.a.length(), 1);
            }
            B.a.length();
            this.k.a();
            File file = (File) g2.c;
            if (!file.exists() || file.delete()) {
                z = true;
            }
            if (!z) {
                bg5.a(up4.class);
            }
            r.u();
            return B;
        } catch (IOException e4) {
            if (bg5.a.a(6)) {
                Log.getStackTraceString(e4);
            }
            throw e4;
        } catch (Throwable th) {
            r.u();
            throw th;
        }
    }

    public final boolean f() {
        boolean z;
        long j2;
        boolean z2;
        this.l.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        yw0 yw0 = this.k;
        synchronized (yw0) {
            z = yw0.a;
        }
        long j3 = -1;
        if (z) {
            long j4 = this.e;
            if (j4 != -1 && currentTimeMillis - j4 <= o) {
                return false;
            }
        }
        this.l.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        long j5 = n + currentTimeMillis2;
        HashSet hashSet = (!this.j || !this.d.isEmpty()) ? this.j ? new HashSet() : null : this.d;
        try {
            boolean z3 = false;
            int i2 = 0;
            long j6 = 0;
            for (yd4 yd4 : this.g.d()) {
                boolean z4 = z3;
                int i3 = i2 + 1;
                if (yd4.c < 0) {
                    yd4.c = yd4.b.a.length();
                }
                j6 += yd4.c;
                if (yd4.a() > j5) {
                    if (yd4.c < 0) {
                        yd4.c = yd4.b.a.length();
                    }
                    j3 = Math.max(yd4.a() - currentTimeMillis2, j3);
                    z3 = true;
                } else {
                    if (this.j) {
                        hashSet.getClass();
                        hashSet.add(yd4.a);
                    }
                    z3 = z4;
                }
                i2 = i3;
            }
            if (z3) {
                this.i.getClass();
            }
            yw0 yw02 = this.k;
            synchronized (yw02) {
                j2 = yw02.c;
            }
            long j7 = (long) i2;
            if (j2 == j7) {
                if (this.k.a() == j6) {
                    z2 = true;
                    this.e = currentTimeMillis2;
                    return z2;
                }
            }
            if (this.j && this.d != hashSet) {
                hashSet.getClass();
                this.d.clear();
                this.d.addAll(hashSet);
            }
            yw0 yw03 = this.k;
            synchronized (yw03) {
                yw03.c = j7;
                yw03.b = j6;
                z2 = true;
                yw03.a = true;
            }
            this.e = currentTimeMillis2;
            return z2;
        } catch (IOException e2) {
            o9a o9a = this.i;
            e2.getMessage();
            o9a.getClass();
            return false;
        }
    }

    public final w28 g(String str, qx0 qx0) {
        synchronized (this.m) {
            boolean f2 = f();
            h();
            long a2 = this.k.a();
            if (a2 > this.c && !f2) {
                yw0 yw0 = this.k;
                synchronized (yw0) {
                    yw0.a = false;
                    yw0.c = -1;
                    yw0.b = -1;
                }
                f();
            }
            long j2 = this.c;
            if (a2 > j2) {
                b((j2 * 9) / 10);
            }
        }
        return this.g.f(qx0, str);
    }

    public final void h() {
        char c2 = this.g.isExternal() ? (char) 2 : 1;
        ime ime = this.f;
        long a2 = this.b - this.k.a();
        ime.a();
        ime.a();
        ReentrantLock reentrantLock = ime.f;
        if (reentrantLock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - ime.e > ime.i) {
                    ime.a = ime.b(ime.a, ime.b);
                    ime.c = ime.b(ime.c, ime.d);
                    ime.e = SystemClock.uptimeMillis();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        StatFs statFs = c2 == 1 ? ime.a : ime.c;
        long availableBlocksLong = statFs != null ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : 0;
        if (availableBlocksLong <= 0 || availableBlocksLong < a2) {
            this.c = this.a;
        } else {
            this.c = this.b;
        }
    }
}
