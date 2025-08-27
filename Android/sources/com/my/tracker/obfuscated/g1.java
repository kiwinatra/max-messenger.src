package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerParams;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.config.AntiFraudConfig;
import com.my.tracker.obfuscated.c0;
import com.my.tracker.obfuscated.j;
import com.my.tracker.obfuscated.o1;
import com.my.tracker.obfuscated.y2;
import com.my.tracker.obfuscated.z1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.LongCompanionObject;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

public class g1 extends q1 {
    private static int a(int i) {
        switch (i) {
            case 1:
                return 12;
            case 2:
                return 13;
            case 3:
                return 11;
            case 5:
                return 17;
            case 6:
                return 22;
            case 7:
                return 18;
            case 8:
                return 19;
            case 9:
                return 20;
            case 10:
                return 23;
            case 13:
                return 21;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return 14;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return 16;
            case LangUtils.HASH_SEED /*17*/:
                return 25;
            case 18:
                return 26;
            case 19:
                return 27;
            case 20:
                return 28;
            case 21:
                return 29;
            case 22:
                return 30;
            case 23:
                return 31;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return 32;
            case 25:
                return 33;
            case 26:
                return 34;
            case 27:
                return 35;
            case 28:
                return 36;
            case 29:
                return 37;
            case 31:
                return 39;
            case 32:
                return 40;
            case 33:
                return 41;
            default:
                return -1;
        }
    }

    public static g1 b() {
        return new g1();
    }

    public synchronized byte[] c(long j) {
        try {
            this.a.a();
            this.a.a(2, j);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 29", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(AdEvent adEvent, String str) {
        try {
            this.a.a();
            this.a.a(1, adEvent.network);
            if (adEvent.a == 19) {
                this.a.a(2, str);
                this.a.a(3, adEvent.currency);
            }
            this.a.a(4, adEvent.source);
            this.a.a(5, adEvent.placementId);
            this.a.a(6, adEvent.adId);
            this.a.a(7, adEvent.adFormat);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: " + adEvent.a, th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(String str, String str2, long j, long j2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
            this.a.a(3, j2);
            this.a.a(4, j);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 31", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, long j, long j2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
            this.a.a(3, j2);
            this.a.a(4, j);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 14", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 13", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str) {
        try {
            this.a.a();
            this.a.a(1, str);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 33", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(long j, long j2, long j3) {
        try {
            this.a.a();
            this.a.a(2, j);
            this.a.a(3, j2);
            this.a.a(4, j3);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 26", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, int i, String str5, String str6, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.a.a(2, str2);
            this.a.a(3, str);
            this.a.a(4, str3);
            if (str != null) {
                this.a.a(5, str5);
                this.a.a(6, str6);
            }
            this.a.a(7, str4);
            this.a.a(8, i);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 32", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(long j) {
        try {
            this.a.a();
            this.a.a(2, j);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 28", th);
            return null;
        }
        return this.a.c();
    }

    private byte[] a(int i, boolean z, String str, String str2, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            if (!z) {
                this.a.a(2, str);
                this.a.a(3, str2);
            }
            return this.a.c();
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: " + i, th);
            return null;
        }
    }

    public synchronized byte[] b(String str, String str2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 2", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.a.a(2, str);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 6", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(boolean z, String str, String str2, Map map) {
        return a(8, z, str, str2, map);
    }

    public synchronized byte[] a(String str, String str2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 15", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, String str5, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.b.a();
            this.b.a(1, str2);
            this.b.a(2, str);
            this.b.a(3, str3);
            if (this.b.b() > 0) {
                this.a.a(2, this.b);
            }
            if (str3 != null) {
                this.a.a(4, str4);
                this.a.a(5, str5);
            }
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 10", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(long j, long j2, long j3) {
        try {
            this.a.a();
            this.a.a(2, j);
            this.a.a(3, j2);
            this.a.a(4, j3);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 27", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(long j, String str, o1.a aVar) {
        try {
            this.a.a();
            this.a.a(1, j);
            this.b.a();
            if (!TextUtils.isEmpty(str)) {
                this.b.a(1, str);
            }
            if (aVar != null) {
                this.b.a(2, aVar.a);
            }
            if (aVar != null) {
                this.b.a(3, aVar.b);
            }
            if (aVar != null) {
                this.b.a(4, aVar.c);
            }
            if (this.b.b() > 0) {
                this.a.a(2, this.b);
            }
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 1", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 9", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(int i, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.a.a(2, i);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 13", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(long j) {
        try {
            this.a.a();
            this.a.a(2, j);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 25", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(boolean z, String str, String str2, Map map) {
        return a(7, z, str, str2, map);
    }

    public synchronized byte[] a(int i, String str, String str2, String str3, String str4, String str5, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.a.a(2, str2);
            this.a.a(3, str4);
            this.a.a(4, str5);
            this.a.a(5, str);
            this.a.a(6, str3);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: " + i, th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, String str5) {
        try {
            this.a.a();
            this.a.a(1, str3);
            this.a.a(2, str4);
            this.a.a(3, str);
            this.a.a(4, str2);
            if (!TextUtils.isEmpty(str5)) {
                this.b.a();
                this.b.a(1, str5);
                if (this.b.b() > 0) {
                    this.a.a(5, this.b);
                }
            }
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 5", th);
            return null;
        }
        return this.a.c();
    }

    public static void a(r1 r1Var, j jVar, q qVar) {
        if (!jVar.a.isEmpty()) {
            for (j.a aVar : jVar.a) {
                qVar.a();
                qVar.a(1, aVar.a);
                qVar.a(2, aVar.b);
                r1Var.a(31, qVar);
            }
        }
    }

    private static int a(q qVar, int i, int i2) {
        if (i2 != Integer.MAX_VALUE) {
            return qVar.a(i, i2);
        }
        return 0;
    }

    private static int a(q qVar, int i, long j) {
        if (j != LongCompanionObject.MAX_VALUE) {
            return qVar.a(i, j);
        }
        return 0;
    }

    private static void a(r1 r1Var, c0.c cVar, q qVar) {
        qVar.a();
        a(qVar, 1, cVar.a);
        a(qVar, 2, cVar.b);
        a(qVar, 3, cVar.c);
        a(qVar, 4, cVar.d);
        a(qVar, 5, cVar.e);
        a(qVar, 6, cVar.f);
        a(qVar, 7, cVar.g);
        a(qVar, 8, cVar.h);
        a(qVar, 9, cVar.i);
        a(qVar, 10, cVar.j);
        a(qVar, 11, cVar.k);
        a(qVar, 12, cVar.l);
        r1Var.a(32, qVar);
    }

    public static void a(r1 r1Var, List list, q qVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0.b bVar = (c0.b) it.next();
            if (bVar instanceof c0.c) {
                a(r1Var, (c0.c) bVar, qVar);
            } else if (bVar instanceof c0.d) {
                a(r1Var, (c0.d) bVar, qVar);
            } else if (bVar instanceof c0.e) {
                a(r1Var, (c0.e) bVar, qVar);
            } else if (bVar instanceof c0.i) {
                a(r1Var, (c0.i) bVar, qVar);
            } else if (bVar instanceof c0.g) {
                a(r1Var, (c0.g) bVar, qVar);
            } else if (bVar instanceof c0.f) {
                a(r1Var, (c0.f) bVar, qVar);
            } else if (bVar instanceof c0.h) {
                a(r1Var, (c0.h) bVar, qVar);
            } else {
                x2.a("Unknown cell-info");
            }
        }
    }

    private static void a(r1 r1Var, c0.d dVar, q qVar) {
        qVar.a();
        qVar.a(1, dVar.a);
        qVar.a(2, dVar.b);
        a(qVar, 3, dVar.c);
        a(qVar, 4, dVar.d);
        a(qVar, 5, dVar.e);
        a(qVar, 6, dVar.f);
        a(qVar, 7, dVar.g);
        a(qVar, 8, dVar.h);
        a(qVar, 9, dVar.i);
        a(qVar, 10, dVar.j);
        r1Var.a(33, qVar);
    }

    private static void a(r1 r1Var, c0.e eVar, q qVar) {
        qVar.a();
        qVar.a(1, eVar.a);
        qVar.a(2, eVar.b);
        a(qVar, 3, eVar.c);
        a(qVar, 4, eVar.d);
        a(qVar, 5, eVar.e);
        a(qVar, 6, eVar.f);
        a(qVar, 7, eVar.g);
        a(qVar, 8, eVar.h);
        a(qVar, 9, eVar.i);
        a(qVar, 10, eVar.j);
        r1Var.a(34, qVar);
    }

    private static void a(r1 r1Var, c0.f fVar, q qVar) {
        qVar.a();
        qVar.a(1, fVar.a);
        qVar.a(2, fVar.b);
        a(qVar, 3, fVar.c);
        a(qVar, 4, fVar.d);
        a(qVar, 5, fVar.e);
        a(qVar, 6, fVar.f);
        a(qVar, 7, fVar.g);
        a(qVar, 8, fVar.h);
        a(qVar, 9, fVar.i);
        r1Var.a(37, qVar);
    }

    private static void a(r1 r1Var, c0.g gVar, q qVar) {
        qVar.a();
        qVar.a(1, gVar.a);
        qVar.a(2, gVar.b);
        a(qVar, 3, gVar.c);
        a(qVar, 4, gVar.d);
        a(qVar, 5, gVar.e);
        a(qVar, 6, gVar.f);
        a(qVar, 7, gVar.g);
        a(qVar, 8, gVar.h);
        a(qVar, 9, gVar.i);
        r1Var.a(36, qVar);
    }

    private static void a(r1 r1Var, c0.h hVar, q qVar) {
        qVar.a();
        qVar.a(1, hVar.a);
        qVar.a(2, hVar.b);
        a(qVar, 3, hVar.c);
        a(qVar, 4, hVar.d);
        r1Var.a(33, qVar);
    }

    private static void a(r1 r1Var, c0.i iVar, q qVar) {
        qVar.a();
        qVar.a(1, iVar.a);
        qVar.a(2, iVar.b);
        a(qVar, 3, iVar.c);
        a(qVar, 4, iVar.d);
        a(qVar, 5, iVar.e);
        a(qVar, 6, iVar.f);
        a(qVar, 7, iVar.g);
        a(qVar, 8, iVar.h);
        a(qVar, 9, iVar.i);
        r1Var.a(35, qVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b7, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bf, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r9.addSuppressed(r10);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:47:0x00b3, B:51:0x00bb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(com.my.tracker.obfuscated.r1 r9, com.my.tracker.obfuscated.x1 r10, com.my.tracker.obfuscated.q r11) {
        /*
            r0 = 0
            com.my.tracker.obfuscated.x1$a r10 = r10.a()     // Catch:{ all -> 0x00c4 }
            r1 = r0
        L_0x0006:
            boolean r2 = r10.b()     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x00b3
            long r2 = r10.g()     // Catch:{ all -> 0x00b1 }
            int r2 = (int) r2
            r11.a()     // Catch:{ all -> 0x004a }
            com.my.tracker.obfuscated.x1$b r3 = r10.d()     // Catch:{ all -> 0x004a }
        L_0x0018:
            boolean r4 = r3.b()     // Catch:{ all -> 0x0028 }
            if (r4 == 0) goto L_0x002a
            long r4 = r3.e()     // Catch:{ all -> 0x0028 }
            int r4 = (int) r4     // Catch:{ all -> 0x0028 }
            r5 = 2
            r11.a((int) r5, (int) r4)     // Catch:{ all -> 0x0028 }
            goto L_0x0018
        L_0x0028:
            r4 = move-exception
            goto L_0x0090
        L_0x002a:
            r3.close()     // Catch:{ all -> 0x004a }
            int r3 = r11.b()     // Catch:{ all -> 0x004a }
            java.lang.String r4 = ", event ignored"
            if (r3 != 0) goto L_0x004c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r3.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r5 = "Error: no timestamps for event "
            r3.append(r5)     // Catch:{ all -> 0x004a }
            r3.append(r2)     // Catch:{ all -> 0x004a }
            r3.append(r4)     // Catch:{ all -> 0x004a }
        L_0x0045:
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x004a }
            goto L_0x007e
        L_0x004a:
            r3 = move-exception
            goto L_0x009b
        L_0x004c:
            r3 = 1
            r11.a((int) r3, (int) r2)     // Catch:{ all -> 0x004a }
            long r5 = r10.c()     // Catch:{ all -> 0x004a }
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x005f
            int r3 = (int) r5     // Catch:{ all -> 0x004a }
            r5 = 3
            r11.a((int) r5, (int) r3)     // Catch:{ all -> 0x004a }
        L_0x005f:
            byte[] r3 = r10.l()     // Catch:{ all -> 0x004a }
            int r5 = r3.length     // Catch:{ all -> 0x004a }
            if (r5 <= 0) goto L_0x0085
            int r5 = a((int) r2)     // Catch:{ all -> 0x004a }
            r6 = -1
            if (r5 != r6) goto L_0x0082
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r3.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r5 = "Error: unrecognized eventType "
            r3.append(r5)     // Catch:{ all -> 0x004a }
            r3.append(r2)     // Catch:{ all -> 0x004a }
            r3.append(r4)     // Catch:{ all -> 0x004a }
            goto L_0x0045
        L_0x007e:
            com.my.tracker.obfuscated.x2.b(r3)     // Catch:{ all -> 0x004a }
            goto L_0x0006
        L_0x0082:
            r11.a((int) r5, (byte[]) r3)     // Catch:{ all -> 0x004a }
        L_0x0085:
            r3 = 41
            int r2 = r9.a((int) r3, (com.my.tracker.obfuscated.q) r11)     // Catch:{ all -> 0x004a }
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L_0x0006
        L_0x0090:
            if (r3 == 0) goto L_0x009a
            r3.close()     // Catch:{ all -> 0x0096 }
            goto L_0x009a
        L_0x0096:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ all -> 0x004a }
        L_0x009a:
            throw r4     // Catch:{ all -> 0x004a }
        L_0x009b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r4.<init>()     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = "Error: failed to pack event "
            r4.append(r5)     // Catch:{ all -> 0x00b1 }
            r4.append(r2)     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x00b1 }
            com.my.tracker.obfuscated.x2.b(r2, r3)     // Catch:{ all -> 0x00b1 }
            goto L_0x0006
        L_0x00b1:
            r9 = move-exception
            goto L_0x00b9
        L_0x00b3:
            r10.close()     // Catch:{ all -> 0x00b7 }
            goto L_0x00cb
        L_0x00b7:
            r9 = move-exception
            goto L_0x00c6
        L_0x00b9:
            if (r10 == 0) goto L_0x00c3
            r10.close()     // Catch:{ all -> 0x00bf }
            goto L_0x00c3
        L_0x00bf:
            r10 = move-exception
            r9.addSuppressed(r10)     // Catch:{ all -> 0x00b7 }
        L_0x00c3:
            throw r9     // Catch:{ all -> 0x00b7 }
        L_0x00c4:
            r9 = move-exception
            r1 = r0
        L_0x00c6:
            java.lang.String r10 = "Error: failed to get stored events"
            com.my.tracker.obfuscated.x2.b(r10, r9)
        L_0x00cb:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Written: events="
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r10 = ", bytes="
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            com.my.tracker.obfuscated.x2.a((java.lang.String) r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.g1.a(com.my.tracker.obfuscated.r1, com.my.tracker.obfuscated.x1, com.my.tracker.obfuscated.q):int");
    }

    public static void a(r1 r1Var, MyTrackerParams.a aVar, q qVar) {
        qVar.a();
        qVar.a(1, aVar.a);
        qVar.a(2, aVar.c);
        qVar.a(3, aVar.b);
        if (qVar.b() > 0) {
            r1Var.a(24, qVar);
        }
    }

    public synchronized int a(r1 r1Var, y2.a aVar, boolean z, b3 b3Var, String str, f0 f0Var, long j, long j2, x1 x1Var, z1 z1Var) {
        String str2;
        String str3;
        r1 r1Var2 = r1Var;
        y2.a aVar2 = aVar;
        boolean z2 = z;
        f0 f0Var2 = f0Var;
        long j3 = j;
        long j4 = j2;
        synchronized (this) {
            try {
                if (a(r1Var2, x1Var, this.a) + a(r1Var2, z1Var, this.a, this.b) == 0) {
                    x2.a("No events to send");
                    return 3;
                }
                r1Var2.a(1, MyTracker.VERSION);
                r1Var2.a(2, aVar2.a);
                if (j3 != -1) {
                    r1Var2.a(3, j3);
                }
                if (j4 > 0) {
                    r1Var2.a(5, (int) j4);
                }
                Map map = aVar2.k.e;
                r1Var2.a(43, map, this.b);
                if (z2 || map.isEmpty()) {
                    str3 = null;
                    str2 = null;
                } else {
                    String str4 = (String) map.get("android_id");
                    str2 = (String) map.get("mac");
                    str3 = str4;
                }
                q1.a(r1Var2, f0Var2.a, f0Var2.c, this.a, this.b);
                q1.a(r1Var2, z2, b3Var, this.a);
                q1.a(r1Var, str3, str2, f0Var, this.a, this.b);
                if (!z2) {
                    a(r1Var2, aVar2.k, this.a);
                }
                q1.a(r1Var2, f0Var2.f, f0Var2.b, f0Var2.c, this.a);
                a(r1Var2, aVar2, this.a);
                if (!z2) {
                    q1.a(r1Var2, f0Var2.g, this.a);
                }
                a(r1Var2, f0Var2.h, this.a);
                if (!z2) {
                    a(r1Var2, f0Var2.i.a, this.a);
                    a(r1Var2, f0Var2.i.b, this.a);
                }
                if (!TextUtils.isEmpty(str)) {
                    r1Var2.a(44, str.length() > 255 ? str.substring(0, KotlinVersion.MAX_COMPONENT_VALUE) : str);
                }
                a();
                return 1;
            } catch (Exception e) {
                x2.a("Create packet error: " + e, e);
                a();
                return 2;
            }
        }
    }

    public synchronized boolean a(r1 r1Var, long j) {
        if (j > 0) {
            try {
                r1Var.a(4, j);
            } catch (Exception e) {
                x2.a("Write timestamp send error: " + e, e);
                return false;
            }
        }
        return true;
    }

    public static int a(r1 r1Var, z1 z1Var, q qVar, q qVar2) {
        int i;
        z1.b d;
        int i2 = 0;
        try {
            z1.a a = z1Var.a();
            i = 0;
            while (a.b()) {
                try {
                    String k = a.k();
                    qVar.a();
                    try {
                        d = a.d();
                        while (d.b()) {
                            qVar2.a();
                            qVar2.a(1, (int) d.h());
                            if (!d.f()) {
                                qVar2.a(2, (int) d.j());
                            }
                            qVar.a(1, qVar2);
                        }
                        d.close();
                    } catch (Throwable th) {
                        x2.b("Error: failed to read session " + k + ": ", th);
                    }
                    if (qVar.b() == 0) {
                        x2.a("No periods for session " + k + ", id=" + a.a() + ", session ignored");
                    } else {
                        int c = (int) a.c();
                        if (c > 0) {
                            qVar.a(2, c);
                        }
                        i2 += r1Var.a(42, qVar);
                        i++;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            a.close();
        } catch (Throwable th3) {
            th = th3;
            i = 0;
            x2.b("Error: failed to get stored sessions", th);
            x2.a("Written: sessions=" + i + ", bytes=" + i2);
            return i2;
        }
        x2.a("Written: sessions=" + i + ", bytes=" + i2);
        return i2;
        throw th;
        throw th;
    }

    public static void a(r1 r1Var, y2.a aVar, q qVar) {
        qVar.a();
        int i = aVar.b;
        if (i >= 0) {
            qVar.a(1, i);
        }
        if (aVar.e == 0) {
            qVar.a(2, 0);
        }
        if (!aVar.g) {
            qVar.a(3, 0);
        }
        if (!aVar.f) {
            qVar.a(4, 0);
        }
        int i2 = aVar.c;
        if (i2 != 900) {
            qVar.a(5, i2);
        }
        int i3 = aVar.d;
        if (i3 != 0) {
            qVar.a(6, i3);
        }
        if (!aVar.h) {
            qVar.a(7, 0);
        }
        if (!aVar.i) {
            qVar.a(8, 0);
        }
        if (!aVar.j) {
            qVar.a(9, 0);
        }
        AntiFraudConfig antiFraudConfig = aVar.l;
        if (!antiFraudConfig.useLightSensor) {
            qVar.a(11, 0);
        }
        if (!antiFraudConfig.useMagneticFieldSensor) {
            qVar.a(12, 0);
        }
        if (!antiFraudConfig.useGyroscope) {
            qVar.a(13, 0);
        }
        if (!antiFraudConfig.usePressureSensor) {
            qVar.a(14, 0);
        }
        if (!antiFraudConfig.useProximitySensor) {
            qVar.a(15, 0);
        }
        if (qVar.b() > 0) {
            r1Var.a(27, qVar);
        }
    }

    public static void a(r1 r1Var, c0.k kVar, q qVar) {
        if (kVar.a != null) {
            qVar.a();
            qVar.a(1, kVar.a.b);
            qVar.a(2, kVar.a.a);
            qVar.a(3, kVar.a.c);
            qVar.a(5, kVar.a.d);
            qVar.a(6, kVar.a.e);
            r1Var.a(28, qVar);
        }
        for (c0.a aVar : kVar.b) {
            qVar.a();
            qVar.a(1, aVar.b);
            qVar.a(2, aVar.a);
            qVar.a(3, aVar.c);
            r1Var.a(29, qVar);
        }
    }
}
