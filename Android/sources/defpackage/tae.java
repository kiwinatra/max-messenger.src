package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: tae  reason: default package */
public final class tae implements bx0 {
    public static final HashSet j = new HashSet();
    public final File a;
    public final lx0 b;
    public final d23 c;
    public final ox0 d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public Cache$CacheException i;

    public tae(File file, lx0 lx0, u74 u74, boolean z) {
        boolean add;
        d23 d23 = new d23(u74, file, z);
        ox0 ox0 = (u74 == null || z) ? null : new ox0(0, (Object) u74);
        synchronized (tae.class) {
            add = j.add(file.getAbsoluteFile());
        }
        if (add) {
            this.a = file;
            this.b = lx0;
            this.c = d23;
            this.d = ox0;
            this.e = new HashMap();
            this.f = new Random();
            this.g = true;
            this.h = -1;
            ConditionVariable conditionVariable = new ConditionVariable();
            new bc4(this, conditionVariable, 2).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.IOException, androidx.media3.datasource.cache.Cache$CacheException] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.io.IOException, androidx.media3.datasource.cache.Cache$CacheException] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.io.IOException, androidx.media3.datasource.cache.Cache$CacheException] */
    public static void a(tae tae) {
        long j2;
        d23 d23 = tae.c;
        File file = tae.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (Cache$CacheException e2) {
                tae.i = e2;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            i8b.o(str);
            tae.i = new IOException(str);
            return;
        }
        int length = listFiles.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                j2 = -1;
                break;
            }
            File file2 = listFiles[i2];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    i8b.o("Malformed UID file: " + file2);
                    file2.delete();
                }
            } else {
                i2++;
            }
        }
        tae.h = j2;
        if (j2 == -1) {
            try {
                tae.h = f(file);
            } catch (IOException e3) {
                String str2 = "Failed to create cache UID: " + file;
                i8b.p(str2, e3);
                tae.i = new IOException(str2, e3);
                return;
            }
        }
        try {
            d23.m(tae.h);
            ox0 ox0 = tae.d;
            if (ox0 != null) {
                ox0.z(tae.h);
                HashMap x = ox0.x();
                tae.j(file, true, listFiles, x);
                ox0.G(x.keySet());
            } else {
                tae.j(file, true, listFiles, (HashMap) null);
            }
            wvf m = dc7.p(((HashMap) d23.a).keySet()).iterator();
            while (m.hasNext()) {
                d23.o((String) m.next());
            }
            try {
                d23.s();
            } catch (IOException e4) {
                i8b.p("Storing index file failed", e4);
            }
        } catch (IOException e5) {
            String str3 = "Failed to initialize cache indices: " + file;
            i8b.p(str3, e5);
            tae.i = new IOException(str3, e5);
        }
    }

    public static void e(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String str = "Failed to create cache directory: " + file;
            i8b.o(str);
            throw new IOException(str);
        }
    }

    public static long f(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0 : Math.abs(nextLong);
        File file2 = new File(file, tr1.j(Long.toString(abs, 16), ".uid"));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public final void b(wae wae) {
        d23 d23 = this.c;
        String str = wae.a;
        d23.k(str).c.add(wae);
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((lx0) arrayList.get(size)).b(this, wae);
            }
        }
        this.b.b(this, wae);
    }

    public final synchronized void c(String str, dm4 dm4) {
        d();
        d23 d23 = this.c;
        fy0 k = d23.k(str);
        od4 od4 = k.e;
        od4 b2 = od4.b(dm4);
        k.e = b2;
        if (!b2.equals(od4)) {
            ((hy0) d23.v).d(k);
        }
        try {
            this.c.s();
        } catch (IOException e2) {
            throw new IOException(e2);
        }
    }

    public final synchronized void d() {
        Cache$CacheException cache$CacheException = this.i;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    public final synchronized long g(long j2, String str, long j3) {
        long j4;
        long j5 = j3 == -1 ? Long.MAX_VALUE : j2 + j3;
        long j6 = j5 < 0 ? Long.MAX_VALUE : j5;
        long j7 = j2;
        j4 = 0;
        while (j7 < j6) {
            long h2 = h(j7, str, j6 - j7);
            if (h2 > 0) {
                j4 += h2;
            } else {
                h2 = -h2;
            }
            j7 += h2;
        }
        return j4;
    }

    public final synchronized long h(long j2, String str, long j3) {
        fy0 j4;
        if (j3 == -1) {
            j3 = LongCompanionObject.MAX_VALUE;
        }
        j4 = this.c.j(str);
        return j4 != null ? j4.a(j2, j3) : -j3;
    }

    public final synchronized od4 i(String str) {
        fy0 j2;
        j2 = this.c.j(str);
        return j2 != null ? j2.e : od4.c;
    }

    public final void j(File file, boolean z, File[] fileArr, HashMap hashMap) {
        long j2;
        long j3;
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    j(file2, false, file2.listFiles(), hashMap);
                } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                    mx0 mx0 = hashMap != null ? (mx0) hashMap.remove(name) : null;
                    if (mx0 != null) {
                        j3 = mx0.a;
                        j2 = mx0.b;
                    } else {
                        j2 = -9223372036854775807L;
                        j3 = -1;
                    }
                    wae b2 = wae.b(file2, j3, j2, this.c);
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

    public final synchronized void k(wae wae) {
        fy0 j2 = this.c.j(wae.a);
        j2.getClass();
        long j3 = wae.b;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = j2.d;
            if (i2 >= arrayList.size()) {
                throw new IllegalStateException();
            } else if (((dy0) arrayList.get(i2)).a == j3) {
                arrayList.remove(i2);
                this.c.o(j2.b);
                notifyAll();
            } else {
                i2++;
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void l(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x0037 }
            d23 r0 = r1.c     // Catch:{ all -> 0x001b }
            fy0 r2 = r0.j(r2)     // Catch:{ all -> 0x001b }
            if (r2 == 0) goto L_0x001d
            java.util.TreeSet r0 = r2.c     // Catch:{ all -> 0x001b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0013
            goto L_0x001d
        L_0x0013:
            java.util.TreeSet r0 = new java.util.TreeSet     // Catch:{ all -> 0x001b }
            java.util.TreeSet r2 = r2.c     // Catch:{ all -> 0x001b }
            r0.<init>(r2)     // Catch:{ all -> 0x001b }
            goto L_0x0022
        L_0x001b:
            r2 = move-exception
            goto L_0x003b
        L_0x001d:
            java.util.TreeSet r0 = new java.util.TreeSet     // Catch:{ all -> 0x001b }
            r0.<init>()     // Catch:{ all -> 0x001b }
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0027:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0037 }
            yx0 r0 = (defpackage.yx0) r0     // Catch:{ all -> 0x0037 }
            r1.m(r0)     // Catch:{ all -> 0x0037 }
            goto L_0x0027
        L_0x0037:
            r2 = move-exception
            goto L_0x003d
        L_0x0039:
            monitor-exit(r1)
            return
        L_0x003b:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2     // Catch:{ all -> 0x0037 }
        L_0x003d:
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tae.l(java.lang.String):void");
    }

    public final void m(yx0 yx0) {
        String str = yx0.a;
        d23 d23 = this.c;
        fy0 j2 = d23.j(str);
        if (j2 != null && j2.c.remove(yx0)) {
            File file = yx0.v;
            if (file != null) {
                file.delete();
            }
            ox0 ox0 = this.d;
            if (ox0 != null) {
                file.getClass();
                String name = file.getName();
                try {
                    ((String) ox0.b).getClass();
                    ((u74) ox0.c).getWritableDatabase().delete((String) ox0.b, "name = ?", new String[]{name});
                } catch (SQLException e2) {
                    throw new IOException(e2);
                } catch (IOException unused) {
                    rae.x("Failed to remove file index entry for: ", name);
                }
            }
            d23.o(j2.b);
            ArrayList arrayList = (ArrayList) this.e.get(yx0.a);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((lx0) arrayList.get(size)).a(this, yx0);
                }
            }
            this.b.a(this, yx0);
        }
    }

    public final void n() {
        ArrayList arrayList = new ArrayList();
        for (fy0 fy0 : Collections.unmodifiableCollection(((HashMap) this.c.a).values())) {
            Iterator it = fy0.c.iterator();
            while (it.hasNext()) {
                yx0 yx0 = (yx0) it.next();
                File file = yx0.v;
                file.getClass();
                if (file.length() != yx0.c) {
                    arrayList.add(yx0);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            m((yx0) arrayList.get(i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: wae} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r1v5, types: [yx0] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.wae o(long r11, java.lang.String r13, long r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.d()     // Catch:{ all -> 0x0042 }
            d23 r0 = r10.c     // Catch:{ all -> 0x0042 }
            fy0 r0 = r0.j(r13)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x001c
            wae r0 = new wae     // Catch:{ all -> 0x0042 }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            r1 = r0
            r2 = r13
            r3 = r11
            r5 = r14
            r1.<init>(r2, r3, r5, r7, r9)     // Catch:{ all -> 0x0042 }
            goto L_0x0038
        L_0x001c:
            wae r1 = r0.b(r11, r14)     // Catch:{ all -> 0x0042 }
            boolean r2 = r1.o     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x0037
            java.io.File r2 = r1.v     // Catch:{ all -> 0x0042 }
            r2.getClass()     // Catch:{ all -> 0x0042 }
            long r2 = r2.length()     // Catch:{ all -> 0x0042 }
            long r4 = r1.c     // Catch:{ all -> 0x0042 }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0037
            r10.n()     // Catch:{ all -> 0x0042 }
            goto L_0x001c
        L_0x0037:
            r0 = r1
        L_0x0038:
            boolean r14 = r0.o     // Catch:{ all -> 0x0042 }
            if (r14 == 0) goto L_0x0044
            wae r11 = r10.p(r13, r0)     // Catch:{ all -> 0x0042 }
            monitor-exit(r10)
            return r11
        L_0x0042:
            r11 = move-exception
            goto L_0x008a
        L_0x0044:
            d23 r14 = r10.c     // Catch:{ all -> 0x0042 }
            fy0 r13 = r14.k(r13)     // Catch:{ all -> 0x0042 }
            long r14 = r0.c     // Catch:{ all -> 0x0042 }
            r1 = 0
        L_0x004d:
            java.util.ArrayList r2 = r13.d     // Catch:{ all -> 0x0042 }
            int r3 = r2.size()     // Catch:{ all -> 0x0042 }
            if (r1 >= r3) goto L_0x0080
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0042 }
            dy0 r2 = (defpackage.dy0) r2     // Catch:{ all -> 0x0042 }
            long r3 = r2.a     // Catch:{ all -> 0x0042 }
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            r6 = -1
            if (r5 > 0) goto L_0x006f
            long r8 = r2.b     // Catch:{ all -> 0x0042 }
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x007d
            long r3 = r3 + r8
            int r2 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x007a
            goto L_0x007d
        L_0x006f:
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x007d
            long r5 = r11 + r14
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x007d:
            monitor-exit(r10)
            r10 = 0
            return r10
        L_0x0080:
            dy0 r13 = new dy0     // Catch:{ all -> 0x0042 }
            r13.<init>(r11, r14)     // Catch:{ all -> 0x0042 }
            r2.add(r13)     // Catch:{ all -> 0x0042 }
            monitor-exit(r10)
            return r0
        L_0x008a:
            monitor-exit(r10)     // Catch:{ all -> 0x0042 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tae.o(long, java.lang.String, long):wae");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.wae p(java.lang.String r18, defpackage.wae r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r0.g
            if (r2 != 0) goto L_0x0009
            return r1
        L_0x0009:
            java.io.File r2 = r1.v
            r2.getClass()
            java.lang.String r6 = r2.getName()
            long r4 = r1.c
            long r13 = java.lang.System.currentTimeMillis()
            r16 = 1
            ox0 r3 = r0.d
            if (r3 == 0) goto L_0x002a
            r7 = r13
            r3.J(r4, r6, r7)     // Catch:{ IOException -> 0x0023 }
            goto L_0x0028
        L_0x0023:
            java.lang.String r3 = "Failed to update index with new touch timestamp."
            defpackage.i8b.V(r3)
        L_0x0028:
            r3 = 0
            goto L_0x002c
        L_0x002a:
            r3 = r16
        L_0x002c:
            d23 r4 = r0.c
            r5 = r18
            fy0 r4 = r4.j(r5)
            r4.getClass()
            java.util.TreeSet r5 = r4.c
            boolean r6 = r5.remove(r1)
            defpackage.n79.n(r6)
            r2.getClass()
            if (r3 == 0) goto L_0x0076
            java.io.File r7 = r2.getParentFile()
            r7.getClass()
            long r9 = r1.b
            int r8 = r4.a
            r11 = r13
            java.io.File r3 = defpackage.wae.c(r7, r8, r9, r11)
            boolean r4 = r2.renameTo(r3)
            if (r4 == 0) goto L_0x005d
            r15 = r3
            goto L_0x0077
        L_0x005d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to rename "
            r4.<init>(r6)
            r4.append(r2)
            java.lang.String r6 = " to "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            defpackage.i8b.V(r3)
        L_0x0076:
            r15 = r2
        L_0x0077:
            boolean r2 = r1.o
            defpackage.n79.n(r2)
            wae r2 = new wae
            java.lang.String r8 = r1.a
            long r9 = r1.b
            long r11 = r1.c
            r7 = r2
            r7.<init>(r8, r9, r11, r13, r15)
            r5.add(r2)
            java.util.HashMap r3 = r0.e
            java.lang.String r4 = r1.a
            java.lang.Object r3 = r3.get(r4)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L_0x00ab
            int r4 = r3.size()
            int r4 = r4 + -1
        L_0x009d:
            if (r4 < 0) goto L_0x00ab
            java.lang.Object r5 = r3.get(r4)
            lx0 r5 = (defpackage.lx0) r5
            r5.d(r0, r1, r2)
            int r4 = r4 + -1
            goto L_0x009d
        L_0x00ab:
            lx0 r3 = r0.b
            r3.d(r0, r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tae.p(java.lang.String, wae):wae");
    }
}
