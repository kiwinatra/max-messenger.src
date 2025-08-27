package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.os.Trace;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {
    public static final boolean a = true;
    public static srd b;
    public static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    public static Context d = null;
    public static volatile nfe[] e = null;
    public static final AtomicInteger f = new AtomicInteger(0);
    public static fj g = null;
    public static final HashSet h = new HashSet();
    public static final HashMap i = new HashMap();
    public static final Set j = Collections.newSetFromMap(new ConcurrentHashMap());
    public static boolean k = true;
    public static int l;
    public static int m = 0;

    public static void a(Context context, ArrayList arrayList) {
        if ((l & 8) != 0) {
            File f2 = zvf.f(context, "lib-main");
            try {
                if (f2.exists()) {
                    w6f.b(f2);
                    return;
                }
                return;
            } catch (Throwable unused) {
                f2.getCanonicalPath();
                return;
            }
        } else {
            File file = new File(context.getApplicationInfo().sourceDir);
            ArrayList arrayList2 = new ArrayList();
            cg0 cg0 = new cg0(context, file, "lib-main");
            arrayList2.add(cg0);
            cg0.toString();
            if (context.getApplicationInfo().splitSourceDirs != null) {
                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                int length = strArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    File file2 = new File(strArr[i2]);
                    StringBuilder sb = new StringBuilder("lib-");
                    int i4 = i3 + 1;
                    sb.append(i3);
                    cg0 cg02 = new cg0(context, file2, sb.toString());
                    cg02.toString();
                    a aVar = new a(cg02, cg02, false);
                    try {
                        boolean z = aVar.o().length != 0;
                        aVar.close();
                        if (z) {
                            arrayList2.add(cg02);
                        }
                        i2++;
                        i3 = i4;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
            arrayList.addAll(0, arrayList2);
            return;
        }
        throw th;
    }

    public static void b(ArrayList arrayList) {
        String str = SysUtil$MarshmallowSysdeps.is64Bit() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = g63.i(str2, ":", str);
        }
        Iterator it = new HashSet(Arrays.asList(str.split(":"))).iterator();
        while (it.hasNext()) {
            arrayList.add(new gp4(new File((String) it.next()), 2));
        }
    }

    public static void c(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (e != null) {
                reentrantReadWriteLock.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (a) {
                    Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
                }
                try {
                    reentrantReadWriteLock.readLock().lock();
                    for (nfe c2 : e) {
                        if (c2.c(str, i2, threadPolicy) != 0) {
                            if (a) {
                                Trace.endSection();
                            }
                            if (z) {
                                StrictMode.setThreadPolicy(threadPolicy);
                                return;
                            }
                            return;
                        }
                    }
                    throw lfe.a(str, d, e);
                } catch (IOException e2) {
                    mfe mfe = new mfe(str, e2.toString());
                    mfe.initCause(e2);
                    throw mfe;
                } catch (Throwable th) {
                    if (a) {
                        Trace.endSection();
                    }
                    if (z) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    throw th;
                }
            } else {
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
        } finally {
            c.readLock().unlock();
        }
    }

    public static synchronized ni0 d() {
        ni0 q;
        synchronized (SoLoader.class) {
            fj fjVar = g;
            q = fjVar == null ? null : fjVar.q();
        }
        return q;
    }

    public static void e() {
        if (e == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = c;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (e != null) {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
                e = new nfe[0];
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                c.writeLock().unlock();
                throw th;
            }
        }
    }

    public static synchronized void f(Context context) {
        synchronized (SoLoader.class) {
            if (context != null) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        String str = context.getApplicationInfo().nativeLibraryDir;
                    } else {
                        context = applicationContext;
                    }
                    d = context;
                    g = new fj(context, 9);
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (b == null) {
                b = new srd(11);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v32, types: [r7f, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0082 A[Catch:{ all -> 0x011f, all -> 0x006a }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009a A[Catch:{ all -> 0x011f, all -> 0x006a }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a7 A[Catch:{ all -> 0x011f, all -> 0x006a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(int r8, android.content.Context r9) {
        /*
            nfe[] r0 = e
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r0.writeLock()
            r1.lock()
            nfe[] r1 = e     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x001a
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r0.writeLock()
            r8.unlock()
            return
        L_0x001a:
            l = r8     // Catch:{ all -> 0x006a }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x006a }
            r1.<init>()     // Catch:{ all -> 0x006a }
            r2 = r8 & 512(0x200, float:7.175E-43)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            r7f r8 = new r7f     // Catch:{ all -> 0x006a }
            r8.<init>()     // Catch:{ all -> 0x006a }
            r8.toString()     // Catch:{ all -> 0x006a }
            r1.add(r4, r8)     // Catch:{ all -> 0x006a }
            goto L_0x00b8
        L_0x0034:
            b(r1)     // Catch:{ all -> 0x006a }
            if (r9 == 0) goto L_0x00b8
            r8 = r8 & r3
            java.lang.String r2 = "Unsupported app type, we should not reach here"
            r5 = 3
            r6 = 2
            if (r8 == 0) goto L_0x006d
            int r8 = m     // Catch:{ all -> 0x006a }
            if (r8 == r3) goto L_0x0051
            if (r8 == r6) goto L_0x004f
            if (r8 != r5) goto L_0x0049
            goto L_0x004f
        L_0x0049:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x006a }
            r8.<init>(r2)     // Catch:{ all -> 0x006a }
            throw r8     // Catch:{ all -> 0x006a }
        L_0x004f:
            r8 = r3
            goto L_0x0052
        L_0x0051:
            r8 = r4
        L_0x0052:
            es r2 = new es     // Catch:{ all -> 0x006a }
            android.content.Context r5 = d     // Catch:{ all -> 0x006a }
            r2.<init>(r5, r8)     // Catch:{ all -> 0x006a }
            r2.toString()     // Catch:{ all -> 0x006a }
            r1.add(r4, r2)     // Catch:{ all -> 0x006a }
            id5 r8 = new id5     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "lib-main"
            r8.<init>(r9, r2)     // Catch:{ all -> 0x006a }
            r1.add(r4, r8)     // Catch:{ all -> 0x006a }
            goto L_0x00b8
        L_0x006a:
            r8 = move-exception
            goto L_0x0128
        L_0x006d:
            int r8 = m     // Catch:{ all -> 0x006a }
            if (r8 != r6) goto L_0x0073
        L_0x0071:
            r8 = r3
            goto L_0x0080
        L_0x0073:
            android.content.pm.ApplicationInfo r8 = r9.getApplicationInfo()     // Catch:{ all -> 0x006a }
            int r8 = r8.flags     // Catch:{ all -> 0x006a }
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r8 = r8 & r7
            if (r8 != 0) goto L_0x007f
            goto L_0x0071
        L_0x007f:
            r8 = r4
        L_0x0080:
            if (r8 == 0) goto L_0x0096
            com.facebook.soloader.b r8 = new com.facebook.soloader.b     // Catch:{ all -> 0x006a }
            r8.<init>(r9)     // Catch:{ all -> 0x006a }
            r8.toString()     // Catch:{ all -> 0x006a }
            java.util.HashSet r7 = r8.c     // Catch:{ all -> 0x006a }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x006a }
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x0096
            r1.add(r4, r8)     // Catch:{ all -> 0x006a }
        L_0x0096:
            int r8 = m     // Catch:{ all -> 0x006a }
            if (r8 == r3) goto L_0x00a7
            if (r8 == r6) goto L_0x00a5
            if (r8 != r5) goto L_0x009f
            goto L_0x00a5
        L_0x009f:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x006a }
            r8.<init>(r2)     // Catch:{ all -> 0x006a }
            throw r8     // Catch:{ all -> 0x006a }
        L_0x00a5:
            r8 = r3
            goto L_0x00a8
        L_0x00a7:
            r8 = r4
        L_0x00a8:
            es r2 = new es     // Catch:{ all -> 0x006a }
            android.content.Context r5 = d     // Catch:{ all -> 0x006a }
            r2.<init>(r5, r8)     // Catch:{ all -> 0x006a }
            r2.toString()     // Catch:{ all -> 0x006a }
            r1.add(r4, r2)     // Catch:{ all -> 0x006a }
            a(r9, r1)     // Catch:{ all -> 0x006a }
        L_0x00b8:
            int r8 = r1.size()     // Catch:{ all -> 0x006a }
            nfe[] r8 = new defpackage.nfe[r8]     // Catch:{ all -> 0x006a }
            java.lang.Object[] r8 = r1.toArray(r8)     // Catch:{ all -> 0x006a }
            nfe[] r8 = (defpackage.nfe[]) r8     // Catch:{ all -> 0x006a }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r0.writeLock()     // Catch:{ all -> 0x006a }
            r9.lock()     // Catch:{ all -> 0x006a }
            int r9 = l     // Catch:{ all -> 0x011f }
            r1 = r9 & 2
            if (r1 == 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r3 = r4
        L_0x00d3:
            r9 = r9 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x00d9
            r3 = r3 | 4
        L_0x00d9:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r0.writeLock()     // Catch:{ all -> 0x006a }
            r9.unlock()     // Catch:{ all -> 0x006a }
            int r9 = r8.length     // Catch:{ all -> 0x006a }
        L_0x00e1:
            int r0 = r9 + -1
            if (r9 <= 0) goto L_0x010b
            r9 = r8[r0]     // Catch:{ all -> 0x006a }
            java.util.Objects.toString(r9)     // Catch:{ all -> 0x006a }
            boolean r9 = a     // Catch:{ all -> 0x006a }
            if (r9 == 0) goto L_0x00ff
            java.lang.String r1 = "SoLoader"
            java.lang.String r2 = "_"
            r4 = r8[r0]     // Catch:{ all -> 0x006a }
            java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x006a }
            java.lang.String r4 = r4.getSimpleName()     // Catch:{ all -> 0x006a }
            com.facebook.soloader.Api18TraceUtils.a(r1, r2, r4)     // Catch:{ all -> 0x006a }
        L_0x00ff:
            r1 = r8[r0]     // Catch:{ all -> 0x006a }
            r1.d(r3)     // Catch:{ all -> 0x006a }
            if (r9 == 0) goto L_0x0109
            android.os.Trace.endSection()     // Catch:{ all -> 0x006a }
        L_0x0109:
            r9 = r0
            goto L_0x00e1
        L_0x010b:
            e = r8     // Catch:{ all -> 0x006a }
            java.util.concurrent.atomic.AtomicInteger r8 = f     // Catch:{ all -> 0x006a }
            r8.getAndIncrement()     // Catch:{ all -> 0x006a }
            nfe[] r8 = e     // Catch:{ all -> 0x006a }
            int r8 = r8.length     // Catch:{ all -> 0x006a }
            java.util.concurrent.locks.ReentrantReadWriteLock r8 = c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r8.writeLock()
            r8.unlock()
            return
        L_0x011f:
            r8 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r0.writeLock()     // Catch:{ all -> 0x006a }
            r9.unlock()     // Catch:{ all -> 0x006a }
            throw r8     // Catch:{ all -> 0x006a }
        L_0x0128:
            java.util.concurrent.locks.ReentrantReadWriteLock r9 = c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r9.writeLock()
            r9.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.g(int, android.content.Context):void");
    }

    public static boolean h() {
        boolean z = true;
        if (e != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (e == null) {
                z = false;
            }
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            c.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r0 = c;
        r0.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        r4 = com.facebook.soloader.SoLoader.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        if (r2.contains(r6) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        r0.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0053, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        c(r6, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005c, code lost:
        r9 = com.facebook.soloader.SoLoader.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r2.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0062, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0065, code lost:
        if ((r8 & 16) != 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x006b, code lost:
        if (android.text.TextUtils.isEmpty(r7) != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x006d, code lost:
        r6 = j.contains(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0073, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0074, code lost:
        r0.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0080, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0081, code lost:
        r7 = r6.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0085, code lost:
        if (r7 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008f, code lost:
        r7 = r7.substring(r7.lastIndexOf("unexpected e_machine:"));
        r8 = new java.lang.UnsatisfiedLinkError("APK was built for a different platform. Supported ABIs: " + java.util.Arrays.toString(com.facebook.soloader.SysUtil$MarshmallowSysdeps.getSupportedAbis()) + " error: " + r7);
        r8.initCause(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00bf, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c0, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c5, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00c6, code lost:
        c.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00cf, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean i(java.lang.String r6, java.lang.String r7, int r8, android.os.StrictMode.ThreadPolicy r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            java.util.Set r0 = j
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x0010
            return r1
        L_0x0010:
            java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class
            monitor-enter(r0)
            java.util.HashSet r2 = h     // Catch:{ all -> 0x001d }
            boolean r3 = r2.contains(r6)     // Catch:{ all -> 0x001d }
            if (r3 == 0) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return r1
        L_0x001d:
            r6 = move-exception
            goto L_0x00d0
        L_0x0020:
            java.util.HashMap r3 = i     // Catch:{ all -> 0x001d }
            boolean r4 = r3.containsKey(r6)     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x002d
            java.lang.Object r3 = r3.get(r6)     // Catch:{ all -> 0x001d }
            goto L_0x0036
        L_0x002d:
            java.lang.Object r4 = new java.lang.Object     // Catch:{ all -> 0x001d }
            r4.<init>()     // Catch:{ all -> 0x001d }
            r3.put(r6, r4)     // Catch:{ all -> 0x001d }
            r3 = r4
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r0.readLock()
            r4.lock()
            monitor-enter(r3)     // Catch:{ all -> 0x00c5 }
            java.lang.Class<com.facebook.soloader.SoLoader> r4 = com.facebook.soloader.SoLoader.class
            monitor-enter(r4)     // Catch:{ all -> 0x0054 }
            boolean r5 = r2.contains(r6)     // Catch:{ all -> 0x0056 }
            if (r5 == 0) goto L_0x0058
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            monitor-exit(r3)     // Catch:{ all -> 0x0054 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r6 = r0.readLock()
            r6.unlock()
            return r1
        L_0x0054:
            r6 = move-exception
            goto L_0x00c3
        L_0x0056:
            r6 = move-exception
            goto L_0x00c1
        L_0x0058:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            c(r6, r8, r9)     // Catch:{ UnsatisfiedLinkError -> 0x0080 }
            java.lang.Class<com.facebook.soloader.SoLoader> r9 = com.facebook.soloader.SoLoader.class
            monitor-enter(r9)     // Catch:{ all -> 0x0054 }
            r2.add(r6)     // Catch:{ all -> 0x007d }
            monitor-exit(r9)     // Catch:{ all -> 0x007d }
            r6 = r8 & 16
            if (r6 != 0) goto L_0x0073
            boolean r6 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0054 }
            if (r6 != 0) goto L_0x0073
            java.util.Set r6 = j     // Catch:{ all -> 0x0054 }
            boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x0054 }
        L_0x0073:
            monitor-exit(r3)     // Catch:{ all -> 0x0054 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r6 = r0.readLock()
            r6.unlock()
            r6 = 1
            return r6
        L_0x007d:
            r6 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x007d }
            throw r6     // Catch:{ all -> 0x0054 }
        L_0x0080:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()     // Catch:{ all -> 0x0054 }
            if (r7 == 0) goto L_0x00c0
            java.lang.String r8 = "unexpected e_machine:"
            boolean r8 = r7.contains(r8)     // Catch:{ all -> 0x0054 }
            if (r8 == 0) goto L_0x00c0
            java.lang.String r8 = "unexpected e_machine:"
            int r8 = r7.lastIndexOf(r8)     // Catch:{ all -> 0x0054 }
            java.lang.String r7 = r7.substring(r8)     // Catch:{ all -> 0x0054 }
            jfe r8 = new jfe     // Catch:{ all -> 0x0054 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "APK was built for a different platform. Supported ABIs: "
            r9.<init>(r0)     // Catch:{ all -> 0x0054 }
            java.lang.String[] r0 = com.facebook.soloader.SysUtil$MarshmallowSysdeps.getSupportedAbis()     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch:{ all -> 0x0054 }
            r9.append(r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = " error: "
            r9.append(r0)     // Catch:{ all -> 0x0054 }
            r9.append(r7)     // Catch:{ all -> 0x0054 }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x0054 }
            r8.<init>(r7)     // Catch:{ all -> 0x0054 }
            r8.initCause(r6)     // Catch:{ all -> 0x0054 }
            throw r8     // Catch:{ all -> 0x0054 }
        L_0x00c0:
            throw r6     // Catch:{ all -> 0x0054 }
        L_0x00c1:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            throw r6     // Catch:{ all -> 0x0054 }
        L_0x00c3:
            monitor-exit(r3)     // Catch:{ all -> 0x0054 }
            throw r6     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r6 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r7 = c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r7.readLock()
            r7.unlock()
            throw r6
        L_0x00d0:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.i(java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032 A[Catch:{ all -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007d A[Catch:{ all -> 0x007b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void init(android.content.Context r7, int r8) throws java.io.IOException {
        /*
            boolean r0 = h()
            if (r0 == 0) goto L_0x0008
            goto L_0x008d
        L_0x0008:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            r1 = 128(0x80, float:1.794E-43)
            java.lang.String r2 = r7.getPackageName()     // Catch:{ Exception -> 0x001d }
            android.content.pm.PackageManager r3 = r7.getPackageManager()     // Catch:{ Exception -> 0x001d }
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r1)     // Catch:{ Exception -> 0x001d }
            android.os.Bundle r2 = r2.metaData     // Catch:{ Exception -> 0x001d }
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x002d
            java.lang.String r5 = "com.facebook.soloader.enabled"
            boolean r2 = r2.getBoolean(r5, r4)     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r2 = r3
            goto L_0x002e
        L_0x002d:
            r2 = r4
        L_0x002e:
            k = r2     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x007d
            int r2 = m     // Catch:{ all -> 0x007b }
            r5 = 2
            if (r2 == 0) goto L_0x0038
            goto L_0x004e
        L_0x0038:
            if (r7 != 0) goto L_0x003c
        L_0x003a:
            r2 = r4
            goto L_0x004e
        L_0x003c:
            android.content.pm.ApplicationInfo r2 = r7.getApplicationInfo()     // Catch:{ all -> 0x007b }
            int r2 = r2.flags     // Catch:{ all -> 0x007b }
            r6 = r2 & 1
            if (r6 != 0) goto L_0x0047
            goto L_0x003a
        L_0x0047:
            r1 = r1 & r2
            if (r1 == 0) goto L_0x004d
            r1 = 3
            r2 = r1
            goto L_0x004e
        L_0x004d:
            r2 = r5
        L_0x004e:
            m = r2     // Catch:{ all -> 0x007b }
            r1 = r8 & 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L_0x006a
            if (r2 != r5) goto L_0x0057
            goto L_0x0066
        L_0x0057:
            if (r7 == 0) goto L_0x0065
            android.content.pm.ApplicationInfo r1 = r7.getApplicationInfo()     // Catch:{ all -> 0x007b }
            int r1 = r1.flags     // Catch:{ all -> 0x007b }
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r2
            if (r1 != 0) goto L_0x0065
            r3 = r4
        L_0x0065:
            r4 = r3
        L_0x0066:
            if (r4 == 0) goto L_0x006a
            r8 = r8 | 8
        L_0x006a:
            f(r7)     // Catch:{ all -> 0x007b }
            g(r8, r7)     // Catch:{ all -> 0x007b }
            v9a r7 = new v9a     // Catch:{ all -> 0x007b }
            r8 = 15
            r7.<init>((int) r8)     // Catch:{ all -> 0x007b }
            defpackage.o5a.G(r7)     // Catch:{ all -> 0x007b }
            goto L_0x008a
        L_0x007b:
            r7 = move-exception
            goto L_0x008e
        L_0x007d:
            e()     // Catch:{ all -> 0x007b }
            djd r7 = new djd     // Catch:{ all -> 0x007b }
            r8 = 20
            r7.<init>((int) r8)     // Catch:{ all -> 0x007b }
            defpackage.o5a.G(r7)     // Catch:{ all -> 0x007b }
        L_0x008a:
            android.os.StrictMode.setThreadPolicy(r0)
        L_0x008d:
            return
        L_0x008e:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.init(android.content.Context, int):void");
    }
}
