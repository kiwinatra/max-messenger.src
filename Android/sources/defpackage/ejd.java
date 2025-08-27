package defpackage;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: ejd  reason: default package */
public final class ejd implements m30, qk3, ife, zi6, wv9, i8d {
    public static final ejd a = new Object();
    public static final ejd b = new Object();
    public static final ejd c = new Object();
    public static final ejd o = new Object();
    public static final ejd v = new Object();
    public static final ejd w = new Object();
    public static final ejd x = new Object();
    public static final ejd y = new Object();

    public static r89 a(k2b k2b) {
        return new r89(k2b.a().e().a.l, k2b.a().i().a.l, false, bt0.c, false, false, 1008);
    }

    public static pj5 b(String str) {
        pj5 pj5;
        pj5[] pj5Arr = pj5.c;
        int length = pj5Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                pj5 = null;
                break;
            }
            pj5 = pj5Arr[i];
            if (Intrinsics.areEqual((Object) pj5.a, (Object) str)) {
                break;
            }
            i++;
        }
        return pj5 == null ? pj5.UNKNOWN : pj5;
    }

    public static j48 c(String str) {
        sq9.b.getClass();
        switch (o9a.k(str).ordinal()) {
            case 1:
            case 2:
            case 5:
            case 6:
                return j48.c;
            case 4:
                return j48.o;
            case 7:
            case 8:
                return j48.v;
            default:
                return j48.b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f0 A[Catch:{ all -> 0x01e3, all -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01f1 A[Catch:{ all -> 0x01e3, all -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01de A[Catch:{ all -> 0x01e3, all -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e6 A[Catch:{ all -> 0x01e3, all -> 0x01f8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(defpackage.a24 r16, java.util.Collection r17) {
        /*
            r0 = r16
            java.lang.String r1 = "CRASH"
            java.lang.String r2 = "MINIDUMP"
            java.lang.String r3 = "NON_FATAL"
            r4 = 1
            r5 = 0
            kof r6 = defpackage.kof.a
            java.lang.String r6 = defpackage.kof.a()
            if (r6 != 0) goto L_0x0013
            return
        L_0x0013:
            java.io.File r7 = new java.io.File
            java.lang.String r8 = r0.d
            r7.<init>(r8)
            boolean r8 = r7.exists()
            if (r8 != 0) goto L_0x0021
            return
        L_0x0021:
            java.lang.String r7 = kotlin.io.FilesKt__FileReadWriteKt.readText$default(r7, (java.nio.charset.Charset) null, 1, (java.lang.Object) null)
            java.io.File r8 = new java.io.File
            java.lang.String r9 = r0.e
            r8.<init>(r9)
            boolean r9 = r8.exists()
            if (r9 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r8 = r5
        L_0x0034:
            if (r8 == 0) goto L_0x003b
            java.lang.String r8 = kotlin.io.FilesKt__FileReadWriteKt.readText$default(r8, (java.nio.charset.Charset) null, 1, (java.lang.Object) null)
            goto L_0x003c
        L_0x003b:
            r8 = r5
        L_0x003c:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>((java.lang.String) r7)
            if (r8 == 0) goto L_0x004d
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>((java.lang.String) r8)
            java.lang.String r8 = "tags"
            r9.put((java.lang.String) r8, (java.lang.Object) r7)
        L_0x004d:
            java.lang.String r7 = r9.toString()
            java.io.File r8 = new java.io.File
            java.lang.String r9 = r0.f
            r8.<init>(r9)
            byte[] r8 = defpackage.j4b.f0(r8)
            java.io.File r9 = new java.io.File
            java.lang.String r10 = r0.g
            r9.<init>(r10)
            boolean r10 = r9.exists()
            if (r10 == 0) goto L_0x006e
            byte[] r9 = defpackage.j4b.f0(r9)
            goto L_0x006f
        L_0x006e:
            r9 = r5
        L_0x006f:
            java.io.File r10 = new java.io.File
            java.lang.String r11 = r0.h
            r10.<init>(r11)
            boolean r11 = r10.exists()
            if (r11 == 0) goto L_0x0081
            byte[] r10 = defpackage.j4b.f0(r10)
            goto L_0x0082
        L_0x0081:
            r10 = r5
        L_0x0082:
            if (r17 == 0) goto L_0x00ca
            boolean r11 = r17.isEmpty()
            r11 = r11 ^ r4
            if (r11 == 0) goto L_0x008e
            r11 = r17
            goto L_0x008f
        L_0x008e:
            r11 = r5
        L_0x008f:
            if (r11 == 0) goto L_0x00ca
            org.json.JSONArray r12 = new org.json.JSONArray
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x009a:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00c5
            java.lang.Object r13 = r11.next()
            ix4 r13 = (defpackage.ix4) r13
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r15 = r13.a
            java.lang.String r4 = "event"
            r14.put((java.lang.String) r4, (java.lang.Object) r15)
            java.lang.String r4 = "reason"
            java.lang.String r15 = r13.b
            r14.put((java.lang.String) r4, (java.lang.Object) r15)
            java.lang.String r4 = "count"
            int r13 = r13.c
            r14.put((java.lang.String) r4, (int) r13)
            r12.put((java.lang.Object) r14)
            r4 = 1
            goto L_0x009a
        L_0x00c5:
            java.lang.String r4 = r12.toString()
            goto L_0x00cb
        L_0x00ca:
            r4 = r5
        L_0x00cb:
            int r0 = r0.b
            int r11 = defpackage.tr1.y(r0)
            r12 = 9
            r13 = 8
            if (r11 == r13) goto L_0x00dc
            if (r11 == r12) goto L_0x00dc
            java.lang.String r11 = "stackTrace"
            goto L_0x00de
        L_0x00dc:
            java.lang.String r11 = "file"
        L_0x00de:
            int r14 = defpackage.tr1.y(r0)
            if (r14 == r13) goto L_0x00e9
            if (r14 == r12) goto L_0x00e9
            java.lang.String r14 = "stack.gzip"
            goto L_0x00eb
        L_0x00e9:
            java.lang.String r14 = "file.gzip"
        L_0x00eb:
            int r15 = defpackage.tr1.y(r0)
            if (r15 == r13) goto L_0x00f9
            if (r15 == r12) goto L_0x00f6
            java.lang.String r12 = "api/crash/upload"
            goto L_0x00fb
        L_0x00f6:
            java.lang.String r12 = "api/crash/uploadAnr"
            goto L_0x00fb
        L_0x00f9:
            java.lang.String r12 = "api/crash/uploadNative"
        L_0x00fb:
            kof r13 = defpackage.kof.a
            java.util.Map r13 = defpackage.kof.c()
            frg r15 = defpackage.iq.c
            java.lang.Object r13 = r13.get(r15)
            boolean r15 = r13 instanceof defpackage.l04
            if (r15 == 0) goto L_0x010e
            l04 r13 = (defpackage.l04) r13
            goto L_0x010f
        L_0x010e:
            r13 = r5
        L_0x010f:
            if (r13 != 0) goto L_0x0119
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            kotlin.collections.MapsKt.toMap(r13)
        L_0x0119:
            java.lang.String r13 = defpackage.l04.b()
            android.net.Uri r13 = android.net.Uri.parse(r13)
            android.net.Uri$Builder r13 = r13.buildUpon()
            android.net.Uri$Builder r12 = r13.appendEncodedPath(r12)
            java.lang.String r13 = "crashToken"
            android.net.Uri$Builder r6 = r12.appendQueryParameter(r13, r6)
            java.lang.String r6 = r6.toString()
            xv1 r12 = new xv1
            r13 = 23
            r12.<init>((int) r13)
            switch(r0) {
                case 1: goto L_0x0145;
                case 2: goto L_0x0143;
                case 3: goto L_0x0143;
                case 4: goto L_0x0143;
                case 5: goto L_0x0143;
                case 6: goto L_0x0143;
                case 7: goto L_0x0143;
                case 8: goto L_0x0143;
                case 9: goto L_0x0141;
                case 10: goto L_0x013e;
                default: goto L_0x013d;
            }
        L_0x013d:
            throw r5
        L_0x013e:
            java.lang.String r13 = "ANR"
            goto L_0x0146
        L_0x0141:
            r13 = r2
            goto L_0x0146
        L_0x0143:
            r13 = r3
            goto L_0x0146
        L_0x0145:
            r13 = r1
        L_0x0146:
            java.lang.String r15 = "type"
            r12.j(r15, r13)
            java.lang.String r13 = "JVM_STACKTRACE"
            switch(r0) {
                case 1: goto L_0x0154;
                case 2: goto L_0x0154;
                case 3: goto L_0x0154;
                case 4: goto L_0x0154;
                case 5: goto L_0x0154;
                case 6: goto L_0x0154;
                case 7: goto L_0x0154;
                case 8: goto L_0x0154;
                case 9: goto L_0x0155;
                case 10: goto L_0x0151;
                default: goto L_0x0150;
            }
        L_0x0150:
            throw r5
        L_0x0151:
            java.lang.String r2 = "ANDROID_ANR"
            goto L_0x0155
        L_0x0154:
            r2 = r13
        L_0x0155:
            java.lang.String r13 = "format"
            r12.j(r13, r2)
            switch(r0) {
                case 1: goto L_0x0173;
                case 2: goto L_0x0172;
                case 3: goto L_0x016f;
                case 4: goto L_0x016c;
                case 5: goto L_0x0169;
                case 6: goto L_0x0166;
                case 7: goto L_0x0163;
                case 8: goto L_0x0160;
                case 9: goto L_0x0173;
                case 10: goto L_0x015e;
                default: goto L_0x015d;
            }
        L_0x015d:
            throw r5
        L_0x015e:
            r1 = r5
            goto L_0x0173
        L_0x0160:
            java.lang.String r1 = "DEBUG"
            goto L_0x0173
        L_0x0163:
            java.lang.String r1 = "INFO"
            goto L_0x0173
        L_0x0166:
            java.lang.String r1 = "NOTICE"
            goto L_0x0173
        L_0x0169:
            java.lang.String r1 = "WARNING"
            goto L_0x0173
        L_0x016c:
            java.lang.String r1 = "ERROR"
            goto L_0x0173
        L_0x016f:
            java.lang.String r1 = "FATAL"
            goto L_0x0173
        L_0x0172:
            r1 = r3
        L_0x0173:
            if (r1 == 0) goto L_0x017a
            java.lang.String r0 = "severity"
            r12.j(r0, r1)
        L_0x017a:
            mm5 r0 = new mm5
            java.lang.String r1 = "application/octet-stream"
            r2 = 1
            r0.<init>(r2, r1, r8)
            r12.i(r11, r14, r0)
            java.lang.String r0 = "application/json; charset=utf-8"
            mm5 r0 = defpackage.pf6.i(r0, r7)
            java.lang.String r3 = "uploadBean"
            r12.i(r3, r5, r0)
            if (r9 == 0) goto L_0x019e
            mm5 r0 = new mm5
            r0.<init>(r2, r1, r9)
            java.lang.String r3 = "threadDump"
            java.lang.String r7 = "threads.gzip"
            r12.i(r3, r7, r0)
        L_0x019e:
            if (r10 == 0) goto L_0x01ac
            mm5 r0 = new mm5
            r0.<init>(r2, r1, r10)
            java.lang.String r1 = "logs"
            java.lang.String r2 = "logs.gzip"
            r12.i(r1, r2, r0)
        L_0x01ac:
            if (r4 == 0) goto L_0x01bb
            java.lang.String r0 = "application/json"
            mm5 r0 = defpackage.pf6.i(r0, r4)
            java.lang.String r1 = "drops"
            java.lang.String r2 = "drops.json"
            r12.i(r1, r2, r0)
        L_0x01bb:
            u05 r0 = r12.n()
            d19 r1 = new d19
            r1.<init>((java.lang.String) r6, (defpackage.h57) r0)
            kotlin.Lazy r0 = defpackage.kof.h
            java.lang.Object r0 = r0.getValue()
            n57 r0 = (defpackage.n57) r0
            i57 r1 = r0.b(r1)
            int r0 = r1.b     // Catch:{ all -> 0x01e3 }
            java.io.Closeable r2 = r1.o     // Catch:{ all -> 0x01e3 }
            mm5 r2 = (defpackage.mm5) r2     // Catch:{ all -> 0x01e3 }
            if (r2 == 0) goto L_0x01e6
            java.lang.Object r2 = r2.c     // Catch:{ all -> 0x01e3 }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x01e3 }
            if (r2 == 0) goto L_0x01e6
            java.lang.String r2 = kotlin.text.StringsKt.decodeToString(r2)     // Catch:{ all -> 0x01e3 }
            goto L_0x01e7
        L_0x01e3:
            r0 = move-exception
            r2 = r0
            goto L_0x01f7
        L_0x01e6:
            r2 = r5
        L_0x01e7:
            java.lang.String r3 = "CRASH_REPORT"
            defpackage.s9a.i(r2, r3, r5)     // Catch:{ all -> 0x01e3 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 == r2) goto L_0x01f1
            goto L_0x01f3
        L_0x01f1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01e3 }
        L_0x01f3:
            kotlin.io.CloseableKt.closeFinally(r1, r5)
            return
        L_0x01f7:
            throw r2     // Catch:{ all -> 0x01f8 }
        L_0x01f8:
            r0 = move-exception
            r3 = r0
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejd.d(a24, java.util.Collection):void");
    }

    public static void e(List list) {
        Collection collection;
        list.size();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a24 a24 = (a24) list.get(i);
            if (i == 0) {
                kof kof = kof.a;
                collection = kof.b().d();
            } else {
                collection = null;
            }
            try {
                d(a24, collection);
                a24.getClass();
                FilesKt.deleteRecursively(new File(a24.c));
            } catch (Throwable unused) {
                if (collection != null) {
                    kof kof2 = kof.a;
                    kof.b().a(collection);
                }
            }
        }
    }

    public static long f() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    public void accept(Object obj) {
        z68.h(kj5.y0, (Throwable) obj, "failed to delete", new Object[0]);
    }

    public Object apply(Object obj) {
        return ((OneMeRoomDatabase) obj).K();
    }

    public Object m(pf9 pf9) {
        long j = 0;
        try {
            j = ryg.d0(pf9, 0);
        } catch (Throwable th) {
            z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            for (xm a2 : ytd.a) {
                a2.a(th);
            }
            xtd.a.getClass();
            int ordinal = xtd.b.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
        }
        return Long.valueOf(j);
    }
}
