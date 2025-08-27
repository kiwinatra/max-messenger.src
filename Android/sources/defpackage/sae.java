package defpackage;

import android.os.ConditionVariable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* renamed from: sae  reason: default package */
public final class sae implements cx0 {
    public static final HashSet i = new HashSet();
    public final File a;
    public final os7 b;
    public final q40 c;
    public final HashMap d;
    public final Random e;
    public final boolean f;
    public long g;
    public Cache$CacheException h;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, q40] */
    public sae(File file, os7 os7) {
        boolean add;
        ? obj = new Object();
        obj.a = new HashMap();
        obj.b = new SparseArray();
        obj.c = new SparseBooleanArray();
        obj.o = new SparseBooleanArray();
        gy0 gy0 = new gy0(new File(file, "cached_content_index.exi"), 0);
        int i2 = t0g.a;
        obj.v = gy0;
        obj.w = null;
        synchronized (sae.class) {
            add = i.add(file.getAbsoluteFile());
        }
        if (add) {
            this.a = file;
            this.b = os7;
            this.c = obj;
            this.d = new HashMap();
            this.e = new Random();
            this.f = true;
            this.g = -1;
            ConditionVariable conditionVariable = new ConditionVariable();
            new bc4(this, conditionVariable, 1).start();
            conditionVariable.block();
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46);
        sb.append("Another SimpleCache instance uses the folder: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.io.IOException, com.google.android.exoplayer2.upstream.cache.Cache$CacheException] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.io.IOException, com.google.android.exoplayer2.upstream.cache.Cache$CacheException] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.io.IOException, com.google.android.exoplayer2.upstream.cache.Cache$CacheException] */
    public static void a(sae sae) {
        long j;
        q40 q40 = sae.c;
        File file = sae.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (Cache$CacheException e2) {
                sae.h = e2;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(valueOf.length() + 38);
            sb.append("Failed to list cache directory files: ");
            sb.append(valueOf);
            sae.h = new IOException(sb.toString());
            return;
        }
        int length = listFiles.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                j = -1;
                break;
            }
            File file2 = listFiles[i2];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    new StringBuilder(String.valueOf(file2).length() + 20);
                    file2.delete();
                }
            } else {
                i2++;
            }
        }
        sae.g = j;
        if (j == -1) {
            try {
                sae.g = f(file);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 28);
                sb2.append("Failed to create cache UID: ");
                sb2.append(valueOf2);
                String sb3 = sb2.toString();
                iq.a(sb3, e3);
                sae.h = new IOException(sb3, e3);
                return;
            }
        }
        try {
            q40.q(sae.g);
            sae.getClass();
            sae.h(file, true, listFiles);
            wvf m = dc7.p(((HashMap) q40.a).keySet()).iterator();
            while (m.hasNext()) {
                q40.s((String) m.next());
            }
            try {
                q40.x();
            } catch (IOException e4) {
                iq.a("Storing index file failed", e4);
            }
        } catch (IOException e5) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 36);
            sb4.append("Failed to initialize cache indices: ");
            sb4.append(valueOf3);
            String sb5 = sb4.toString();
            iq.a(sb5, e5);
            sae.h = new IOException(sb5, e5);
        }
    }

    public static void e(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(valueOf.length() + 34);
            sb.append("Failed to create cache directory: ");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
    }

    public static long f(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0 : Math.abs(nextLong);
        String valueOf = String.valueOf(Long.toString(abs, 16));
        File file2 = new File(file, ".uid".length() != 0 ? valueOf.concat(".uid") : new String(valueOf));
        if (file2.createNewFile()) {
            return abs;
        }
        String valueOf2 = String.valueOf(file2);
        StringBuilder sb = new StringBuilder(valueOf2.length() + 27);
        sb.append("Failed to create UID file: ");
        sb.append(valueOf2);
        throw new IOException(sb.toString());
    }

    public final void b(vae vae) {
        q40 q40 = this.c;
        String str = vae.a;
        q40.n(str).c.add(vae);
        ArrayList arrayList = (ArrayList) this.d.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((os7) arrayList.get(size)).b(this, vae);
            }
        }
        this.b.b(this, vae);
    }

    public final synchronized void c(String str, npg npg) {
        d();
        q40 q40 = this.c;
        ey0 n = q40.n(str);
        nd4 nd4 = n.e;
        nd4 b2 = nd4.b(npg);
        n.e = b2;
        if (!b2.equals(nd4)) {
            ((gy0) q40.v).q(n);
        }
        try {
            this.c.x();
        } catch (IOException e2) {
            throw new IOException(e2);
        }
    }

    public final synchronized void d() {
        Cache$CacheException cache$CacheException = this.h;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    public final synchronized nd4 g(String str) {
        ey0 m;
        m = this.c.m(str);
        return m != null ? m.e : nd4.c;
    }

    public final void h(File file, boolean z, File[] fileArr) {
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    h(file2, false, file2.listFiles());
                } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                    vae b2 = vae.b(file2, -1, this.c);
                    if (b2 != null) {
                        b(b2);
                    } else {
                        file2.delete();
                    }
                }
            }
        } else if (!z) {
            file.delete();
        }
    }

    public final synchronized void i(vae vae) {
        ey0 m = this.c.m(vae.a);
        m.getClass();
        long j = vae.b;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = m.d;
            if (i2 >= arrayList.size()) {
                throw new IllegalStateException();
            } else if (((cy0) arrayList.get(i2)).a == j) {
                arrayList.remove(i2);
                this.c.s(m.b);
                notifyAll();
            } else {
                i2++;
            }
        }
    }

    public final void j(xx0 xx0) {
        String str = xx0.a;
        q40 q40 = this.c;
        ey0 m = q40.m(str);
        if (m != null && m.c.remove(xx0)) {
            File file = xx0.v;
            if (file != null) {
                file.delete();
            }
            q40.s(m.b);
            ArrayList arrayList = (ArrayList) this.d.get(xx0.a);
            long j = xx0.c;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    os7 os7 = (os7) arrayList.get(size);
                    os7.a.remove(xx0);
                    os7.b -= j;
                }
            }
            os7 os72 = this.b;
            os72.a.remove(xx0);
            os72.b -= j;
        }
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        for (ey0 ey0 : Collections.unmodifiableCollection(((HashMap) this.c.a).values())) {
            Iterator it = ey0.c.iterator();
            while (it.hasNext()) {
                xx0 xx0 = (xx0) it.next();
                if (xx0.v.length() != xx0.c) {
                    arrayList.add(xx0);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            j((xx0) arrayList.get(i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: vae} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r1v5, types: [xx0] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.vae l(long r11, java.lang.String r13, long r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.d()     // Catch:{ all -> 0x003f }
            q40 r0 = r10.c     // Catch:{ all -> 0x003f }
            ey0 r0 = r0.m(r13)     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x001c
            vae r0 = new vae     // Catch:{ all -> 0x003f }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            r1 = r0
            r2 = r13
            r3 = r11
            r5 = r14
            r1.<init>(r2, r3, r5, r7, r9)     // Catch:{ all -> 0x003f }
            goto L_0x0035
        L_0x001c:
            vae r1 = r0.a(r11, r14)     // Catch:{ all -> 0x003f }
            boolean r2 = r1.o     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0034
            java.io.File r2 = r1.v     // Catch:{ all -> 0x003f }
            long r2 = r2.length()     // Catch:{ all -> 0x003f }
            long r4 = r1.c     // Catch:{ all -> 0x003f }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0034
            r10.k()     // Catch:{ all -> 0x003f }
            goto L_0x001c
        L_0x0034:
            r0 = r1
        L_0x0035:
            boolean r14 = r0.o     // Catch:{ all -> 0x003f }
            if (r14 == 0) goto L_0x0041
            vae r11 = r10.m(r13, r0)     // Catch:{ all -> 0x003f }
            monitor-exit(r10)
            return r11
        L_0x003f:
            r11 = move-exception
            goto L_0x0087
        L_0x0041:
            q40 r14 = r10.c     // Catch:{ all -> 0x003f }
            ey0 r13 = r14.n(r13)     // Catch:{ all -> 0x003f }
            long r14 = r0.c     // Catch:{ all -> 0x003f }
            r1 = 0
        L_0x004a:
            java.util.ArrayList r2 = r13.d     // Catch:{ all -> 0x003f }
            int r3 = r2.size()     // Catch:{ all -> 0x003f }
            if (r1 >= r3) goto L_0x007d
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x003f }
            cy0 r2 = (defpackage.cy0) r2     // Catch:{ all -> 0x003f }
            long r3 = r2.a     // Catch:{ all -> 0x003f }
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            r6 = -1
            if (r5 > 0) goto L_0x006c
            long r8 = r2.b     // Catch:{ all -> 0x003f }
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x007a
            long r3 = r3 + r8
            int r2 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0077
            goto L_0x007a
        L_0x006c:
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x007a
            long r5 = r11 + r14
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0077
            goto L_0x007a
        L_0x0077:
            int r1 = r1 + 1
            goto L_0x004a
        L_0x007a:
            monitor-exit(r10)
            r10 = 0
            return r10
        L_0x007d:
            cy0 r13 = new cy0     // Catch:{ all -> 0x003f }
            r13.<init>(r11, r14)     // Catch:{ all -> 0x003f }
            r2.add(r13)     // Catch:{ all -> 0x003f }
            monitor-exit(r10)
            return r0
        L_0x0087:
            monitor-exit(r10)     // Catch:{ all -> 0x003f }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sae.l(long, java.lang.String, long):vae");
    }

    public final vae m(String str, vae vae) {
        File file;
        if (!this.f) {
            return vae;
        }
        File file2 = vae.v;
        file2.getClass();
        file2.getName();
        long currentTimeMillis = System.currentTimeMillis();
        ey0 m = this.c.m(str);
        TreeSet treeSet = m.c;
        y64.j(treeSet.remove(vae));
        file2.getClass();
        File parentFile = file2.getParentFile();
        parentFile.getClass();
        File c2 = vae.c(parentFile, m.a, vae.b, currentTimeMillis);
        if (file2.renameTo(c2)) {
            file = c2;
        } else {
            new StringBuilder(String.valueOf(c2).length() + String.valueOf(file2).length() + 21);
            file = file2;
        }
        y64.j(vae.o);
        xx0 xx0 = new xx0(vae.a, vae.b, vae.c, currentTimeMillis, file);
        treeSet.add(xx0);
        ArrayList arrayList = (ArrayList) this.d.get(vae.a);
        long j = vae.c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                os7 os7 = (os7) arrayList.get(size);
                os7.a.remove(vae);
                os7.b -= j;
                os7.b(this, xx0);
            }
        }
        os7 os72 = this.b;
        os72.a.remove(vae);
        os72.b -= j;
        os72.b(this, xx0);
        return xx0;
    }
}
