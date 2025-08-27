package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o9e  reason: default package */
public final class o9e {
    public final yoc a;
    public final voc b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Handler d = new Handler(Looper.getMainLooper());
    public final AtomicLong e = new AtomicLong(1);
    public final Object f = new Object();
    public final meg g;
    public final ArrayList h = new ArrayList();
    public final LongSparseArray i = new LongSparseArray();
    public final ArrayList j = new ArrayList();
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet l = new CopyOnWriteArraySet();
    public final int m;
    public final int n;
    public final kz3 o;
    public boolean p = true;
    public boolean q;
    public boolean r;
    public volatile long s;
    public volatile long t;
    public final boolean u;
    public final boolean v;

    public o9e(meg meg, lz3 lz3, voc voc, yoc yoc, boolean z, boolean z2) {
        this.g = meg;
        this.o = lz3;
        this.b = voc;
        this.a = yoc;
        this.n = 5;
        this.m = 30000;
        this.u = z;
        this.v = z2;
        meg.m = new xv1(5, (Object) this);
    }

    public final r54 a(r9e r9e, long j2) {
        try {
            return new r54(r9e.a().put("sequence", j2).toString(), j2);
        } catch (JSONException e2) {
            this.b.reportException("OKSignaling", "signaling.create.command", e2);
            return null;
        }
    }

    public final ag5 b(long j2) {
        ag5 ag5;
        synchronized (this.f) {
            try {
                int indexOfKey = this.i.indexOfKey(j2);
                if (indexOfKey >= 0) {
                    ag5 = (ag5) this.i.valueAt(indexOfKey);
                    this.i.removeAt(indexOfKey);
                } else {
                    ag5 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ag5;
    }

    public final void c(r9e r9e, n9e n9e, n9e n9e2) {
        synchronized (this.f) {
            try {
                voc voc = this.b;
                voc.log("OKSignaling", "<!> postpone send " + r9e);
                if (!this.v || !e(r9e, n9e, n9e2)) {
                    r54 a2 = a(r9e, this.e.getAndIncrement());
                    if (a2 != null) {
                        this.h.add(new ag5(this, r9e, a2, n9e, n9e2));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.r9e r10, boolean r11, defpackage.n9e r12, defpackage.n9e r13) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f
            monitor-enter(r0)
            boolean r1 = r9.u     // Catch:{ all -> 0x000f }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0011
            boolean r4 = r9.q     // Catch:{ all -> 0x000f }
            if (r4 == 0) goto L_0x0011
            r4 = r3
            goto L_0x0012
        L_0x000f:
            r9 = move-exception
            goto L_0x004d
        L_0x0011:
            r4 = r2
        L_0x0012:
            if (r1 == 0) goto L_0x0019
            boolean r1 = r9.r     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x0019
            r2 = r3
        L_0x0019:
            if (r4 != 0) goto L_0x0024
            if (r2 != 0) goto L_0x0024
            if (r11 == 0) goto L_0x0020
            goto L_0x0024
        L_0x0020:
            r9.c(r10, r12, r13)     // Catch:{ all -> 0x000f }
            goto L_0x004b
        L_0x0024:
            java.util.concurrent.atomic.AtomicLong r11 = r9.e     // Catch:{ all -> 0x000f }
            long r1 = r11.getAndIncrement()     // Catch:{ all -> 0x000f }
            r54 r11 = r9.a(r10, r1)     // Catch:{ all -> 0x000f }
            if (r11 != 0) goto L_0x0032
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return
        L_0x0032:
            ag5 r1 = new ag5     // Catch:{ all -> 0x000f }
            r3 = r1
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x000f }
            android.util.LongSparseArray r10 = r9.i     // Catch:{ all -> 0x000f }
            long r12 = r11.b     // Catch:{ all -> 0x000f }
            r10.put(r12, r1)     // Catch:{ all -> 0x000f }
            meg r9 = r9.g     // Catch:{ all -> 0x000f }
            java.lang.String r10 = r11.a     // Catch:{ all -> 0x000f }
            r9.f(r10)     // Catch:{ all -> 0x000f }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9e.d(r9e, boolean, n9e, n9e):void");
    }

    public final boolean e(r9e r9e, n9e n9e, n9e n9e2) {
        String str;
        r9e r9e2 = r9e;
        ag5 ag5 = null;
        n79 n79 = r9e2 instanceof t9e ? new n79((t9e) r9e2, 1) : r9e2 instanceof s9e ? new n79((s9e) r9e2, 0) : null;
        if (n79 == null) {
            return false;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        while (size > 0) {
            if (size > 0) {
                int i2 = size - 1;
                x9e H = n79.H(((ag5) arrayList.get(i2)).a);
                if (!Intrinsics.areEqual((Object) H, (Object) u9e.a)) {
                    if (H instanceof w9e) {
                        ag5 ag52 = (ag5) arrayList.get(i2);
                        long longValue = Long.valueOf(ag52.b).longValue();
                        r9e r9e3 = ((w9e) H).a;
                        r54 a2 = a(r9e3, longValue);
                        if (a2 != null) {
                            ag5 = new ag5(this, r9e3, a2, n9e, n9e2);
                        }
                        if (ag5 == null) {
                            return false;
                        }
                        try {
                            if (ag52.e != null) {
                                ag52.f.c.post(new ne4(23, ag52));
                            }
                        } catch (Throwable th) {
                            try {
                                str = ag52.a.a().optString("command");
                            } catch (JSONException unused) {
                                str = "";
                            }
                            this.b.logException("SignalingCommandQueueIterator", a81.m("Error on discard command ", str), th);
                        }
                        arrayList.set(i2, ag5);
                    } else if (!Intrinsics.areEqual((Object) H, (Object) v9e.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return true;
                }
                size = i2;
            } else {
                throw new IndexOutOfBoundsException("No more elements in the list");
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: ag5} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v16, types: [n9e] */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.String r0 = "type"
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r1 = "stamp"
            r2 = 0
            long r4 = r11.optLong(r1, r2)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x001a
            long r6 = r10.s
            long r4 = java.lang.Math.max(r4, r6)
            r10.s = r4
        L_0x001a:
            java.lang.String r1 = "response"
            boolean r1 = r0.equals(r1)
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x0099
            java.lang.String r0 = "response"
            java.lang.String r0 = r11.optString(r0, r5)
            java.lang.String r1 = "sequence"
            long r1 = r11.getLong(r1)
            java.lang.String r3 = "recover"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0081
            boolean r0 = r10.u
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = "messages"
            org.json.JSONArray r11 = r11.optJSONArray(r0)
            if (r11 == 0) goto L_0x0055
            r0 = r4
        L_0x0045:
            int r3 = r11.length()
            if (r0 >= r3) goto L_0x0055
            org.json.JSONObject r3 = r11.getJSONObject(r0)
            r10.f(r3)
            int r0 = r0 + 1
            goto L_0x0045
        L_0x0055:
            java.lang.Object r0 = r10.f
            monitor-enter(r0)
        L_0x0058:
            android.util.LongSparseArray r11 = r10.i     // Catch:{ all -> 0x007b }
            int r11 = r11.size()     // Catch:{ all -> 0x007b }
            if (r4 >= r11) goto L_0x007d
            android.util.LongSparseArray r11 = r10.i     // Catch:{ all -> 0x007b }
            java.lang.Object r11 = r11.valueAt(r4)     // Catch:{ all -> 0x007b }
            ag5 r11 = (defpackage.ag5) r11     // Catch:{ all -> 0x007b }
            r54 r11 = r11.c     // Catch:{ all -> 0x007b }
            long r5 = r11.b     // Catch:{ all -> 0x007b }
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            goto L_0x0078
        L_0x0071:
            meg r3 = r10.g     // Catch:{ all -> 0x007b }
            java.lang.String r11 = r11.a     // Catch:{ all -> 0x007b }
            r3.f(r11)     // Catch:{ all -> 0x007b }
        L_0x0078:
            int r4 = r4 + 1
            goto L_0x0058
        L_0x007b:
            r10 = move-exception
            goto L_0x007f
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            return
        L_0x007f:
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            throw r10
        L_0x0081:
            ag5 r0 = r10.b(r1)
            if (r0 != 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            n9e r5 = r0.d
        L_0x008a:
            if (r5 == 0) goto L_0x031b
            android.os.Handler r0 = r10.c
            m9e r1 = new m9e
            r2 = 0
            r1.<init>(r10, r5, r11, r2)
            r0.post(r1)
            goto L_0x031b
        L_0x0099:
            java.lang.String r1 = "notification"
            boolean r1 = r0.equals(r1)
            r6 = 2
            if (r1 == 0) goto L_0x01f1
            java.lang.String r0 = "notification"
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r1 = "connection"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01e4
            java.lang.String r0 = "recoverMessages"
            org.json.JSONArray r0 = r11.optJSONArray(r0)
            if (r0 == 0) goto L_0x00ce
            boolean r1 = r10.u
            if (r1 == 0) goto L_0x00ce
            r1 = r4
        L_0x00be:
            int r5 = r0.length()
            if (r1 >= r5) goto L_0x00ce
            org.json.JSONObject r5 = r0.getJSONObject(r1)
            r10.f(r5)
            int r1 = r1 + 1
            goto L_0x00be
        L_0x00ce:
            java.lang.String r0 = "conversation"
            org.json.JSONObject r0 = r11.getJSONObject(r0)
            java.lang.String r1 = "id"
            java.lang.String r0 = r0.getString(r1)
            voc r1 = r10.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "cur cid="
            r5.<init>(r8)
            kz3 r8 = r10.o
            lz3 r8 = (defpackage.lz3) r8
            java.lang.String r8 = r8.a
            java.lang.String r9 = ", new cid="
            java.lang.String r5 = defpackage.rae.q(r5, r8, r9, r0)
            java.lang.String r8 = "OKSignaling"
            r1.log(r8, r5)
            kz3 r1 = r10.o
            boolean r5 = r1 instanceof defpackage.lz3
            if (r5 == 0) goto L_0x00fe
            lz3 r1 = (defpackage.lz3) r1
            r1.a = r0
        L_0x00fe:
            java.lang.String r0 = "conversationParams"
            org.json.JSONObject r0 = r11.optJSONObject(r0)
            if (r0 != 0) goto L_0x0107
            goto L_0x0162
        L_0x0107:
            java.lang.String r1 = "activityTimeout"
            r8 = -1
            long r0 = r0.optLong(r1, r8)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0162
            meg r5 = r10.g
            r5.getClass()
            long r6 = r0 / r6
            r8 = 60000(0xea60, double:2.9644E-319)
            long r8 = r0 - r8
            long r6 = java.lang.Math.max(r6, r8)
            r8 = 30000(0x7530, double:1.4822E-319)
            long r6 = java.lang.Math.max(r6, r8)
            r5.i = r6
            long r6 = r5.r
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0143
            r2 = 4
            long r0 = r0 / r2
            r2 = 61000(0xee48, double:3.0138E-319)
            long r0 = java.lang.Math.min(r0, r2)
            r2 = 11000(0x2af8, double:5.4347E-320)
            long r0 = java.lang.Math.max(r0, r2)
            r5.r = r0
        L_0x0143:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "updateTimeoutMS timeoutMS="
            r0.<init>(r1)
            long r1 = r5.i
            r0.append(r1)
            java.lang.String r1 = " serverPingTimeoutMs="
            r0.append(r1)
            long r1 = r5.r
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            xe8 r1 = r5.q
            r1.v(r0)
        L_0x0162:
            java.lang.Object r0 = r10.f
            monitor-enter(r0)
            r1 = 1
            r10.r = r1     // Catch:{ all -> 0x0196 }
            boolean r2 = r10.q     // Catch:{ all -> 0x0196 }
            if (r2 == 0) goto L_0x01a3
            boolean r2 = r10.u     // Catch:{ all -> 0x0196 }
            if (r2 != 0) goto L_0x01a3
            long r1 = r10.t     // Catch:{ all -> 0x0196 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0198 }
            r3.<init>()     // Catch:{ JSONException -> 0x0198 }
            java.lang.String r4 = "stamp"
            r3.put((java.lang.String) r4, (long) r1)     // Catch:{ JSONException -> 0x0198 }
            java.lang.String r1 = "recover"
            rp6 r1 = defpackage.tf6.a(r3, r1)     // Catch:{ JSONException -> 0x0198 }
            java.util.concurrent.atomic.AtomicLong r2 = r10.e     // Catch:{ JSONException -> 0x0198 }
            long r2 = r2.getAndIncrement()     // Catch:{ JSONException -> 0x0198 }
            r54 r1 = r10.a(r1, r2)     // Catch:{ JSONException -> 0x0198 }
            if (r1 == 0) goto L_0x01e0
            meg r2 = r10.g     // Catch:{ JSONException -> 0x0198 }
            java.lang.String r1 = r1.a     // Catch:{ JSONException -> 0x0198 }
            r2.f(r1)     // Catch:{ JSONException -> 0x0198 }
            goto L_0x01e0
        L_0x0196:
            r10 = move-exception
            goto L_0x01e2
        L_0x0198:
            r1 = move-exception
            voc r2 = r10.b     // Catch:{ all -> 0x0196 }
            java.lang.String r3 = "OKSignaling"
            java.lang.String r4 = "signaling.recover"
            r2.reportException(r3, r4, r1)     // Catch:{ all -> 0x0196 }
            goto L_0x01e0
        L_0x01a3:
            r10.q = r1     // Catch:{ all -> 0x0196 }
        L_0x01a5:
            java.util.ArrayList r1 = r10.h     // Catch:{ all -> 0x0196 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0196 }
            if (r1 != 0) goto L_0x01e0
            java.util.ArrayList r1 = r10.h     // Catch:{ all -> 0x0196 }
            java.lang.Object r1 = r1.remove(r4)     // Catch:{ all -> 0x0196 }
            ag5 r1 = (defpackage.ag5) r1     // Catch:{ all -> 0x0196 }
            r54 r2 = r1.c     // Catch:{ all -> 0x0196 }
            voc r3 = r10.b     // Catch:{ all -> 0x0196 }
            java.lang.String r5 = "OKSignaling"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0196 }
            r6.<init>()     // Catch:{ all -> 0x0196 }
            java.lang.String r7 = "send postponed "
            r6.append(r7)     // Catch:{ all -> 0x0196 }
            r6.append(r2)     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0196 }
            r3.log(r5, r2)     // Catch:{ all -> 0x0196 }
            r54 r2 = r1.c     // Catch:{ all -> 0x0196 }
            android.util.LongSparseArray r3 = r10.i     // Catch:{ all -> 0x0196 }
            long r5 = r2.b     // Catch:{ all -> 0x0196 }
            r3.put(r5, r1)     // Catch:{ all -> 0x0196 }
            meg r1 = r10.g     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = r2.a     // Catch:{ all -> 0x0196 }
            r1.f(r2)     // Catch:{ all -> 0x0196 }
            goto L_0x01a5
        L_0x01e0:
            monitor-exit(r0)     // Catch:{ all -> 0x0196 }
            goto L_0x01e4
        L_0x01e2:
            monitor-exit(r0)     // Catch:{ all -> 0x0196 }
            throw r10
        L_0x01e4:
            android.os.Handler r0 = r10.c
            s6e r1 = new s6e
            r2 = 1
            r1.<init>(r2, r10, r11)
            r0.post(r1)
            goto L_0x031b
        L_0x01f1:
            java.lang.String r1 = "error"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x031b
            java.lang.String r0 = "sequence"
            boolean r0 = r11.has(r0)
            if (r0 == 0) goto L_0x030e
            java.lang.String r0 = "sequence"
            long r0 = r11.getLong(r0)
            ag5 r2 = r10.b(r0)
            if (r2 != 0) goto L_0x020f
            r2 = r5
            goto L_0x0211
        L_0x020f:
            n9e r2 = r2.e
        L_0x0211:
            if (r2 == 0) goto L_0x021e
            android.os.Handler r3 = r10.c
            m9e r8 = new m9e
            r9 = 1
            r8.<init>(r10, r2, r11, r9)
            r3.post(r8)
        L_0x021e:
            java.lang.String r2 = "error"
            java.lang.String r2 = r11.getString(r2)
            java.lang.String r3 = "service-unavailable"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x02eb
            yoc r2 = r10.a
            jme r3 = defpackage.jme.app_event
            java.lang.String r8 = "rtc.cmd.service.unavailable"
            r2.log((defpackage.jme) r3, (java.lang.String) r8, (java.lang.String) r5)
            java.lang.String r2 = "recoverable"
            boolean r2 = r11.optBoolean(r2, r4)
            if (r2 != 0) goto L_0x024c
            java.lang.String r0 = "signaling.listener.response.error.seq"
            android.os.Handler r1 = r10.c
            o6d r2 = new o6d
            r3 = 5
            r2.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r0, (int) r3)
            r1.post(r2)
            goto L_0x031b
        L_0x024c:
            java.lang.String r11 = "<!> retrying "
            java.lang.String r2 = "<!> quit retrying "
            java.lang.Object r3 = r10.f
            monitor-enter(r3)
            android.util.LongSparseArray r4 = r10.i     // Catch:{ all -> 0x0265 }
            int r0 = r4.indexOfKey(r0)     // Catch:{ all -> 0x0265 }
            if (r0 < 0) goto L_0x0268
            android.util.LongSparseArray r1 = r10.i     // Catch:{ all -> 0x0265 }
            java.lang.Object r1 = r1.valueAt(r0)     // Catch:{ all -> 0x0265 }
            r5 = r1
            ag5 r5 = (defpackage.ag5) r5     // Catch:{ all -> 0x0265 }
            goto L_0x0268
        L_0x0265:
            r10 = move-exception
            goto L_0x02e9
        L_0x0268:
            if (r5 == 0) goto L_0x02e7
            r54 r1 = r5.c     // Catch:{ all -> 0x0265 }
            long r4 = r1.d     // Catch:{ all -> 0x0265 }
            r8 = 1
            long r4 = r4 + r8
            r1.d = r4     // Catch:{ all -> 0x0265 }
            int r8 = r10.n     // Catch:{ all -> 0x0265 }
            long r8 = (long) r8     // Catch:{ all -> 0x0265 }
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x02b2
            voc r11 = r10.b     // Catch:{ all -> 0x0265 }
            java.lang.String r4 = "OKSignaling"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0265 }
            r5.<init>(r2)     // Catch:{ all -> 0x0265 }
            kz3 r2 = r10.o     // Catch:{ all -> 0x0265 }
            lz3 r2 = (defpackage.lz3) r2     // Catch:{ all -> 0x0265 }
            java.lang.String r2 = r2.a     // Catch:{ all -> 0x0265 }
            r5.append(r2)     // Catch:{ all -> 0x0265 }
            java.lang.String r2 = " "
            r5.append(r2)     // Catch:{ all -> 0x0265 }
            r5.append(r1)     // Catch:{ all -> 0x0265 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0265 }
            r11.log(r4, r1)     // Catch:{ all -> 0x0265 }
            voc r11 = r10.b     // Catch:{ all -> 0x0265 }
            java.lang.String r1 = "OKSignaling"
            java.lang.String r2 = "signaling.retry"
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0265 }
            java.lang.String r5 = "retry.fail"
            r4.<init>(r5)     // Catch:{ all -> 0x0265 }
            r11.reportException(r1, r2, r4)     // Catch:{ all -> 0x0265 }
            android.util.LongSparseArray r10 = r10.i     // Catch:{ all -> 0x0265 }
            r10.removeAt(r0)     // Catch:{ all -> 0x0265 }
            monitor-exit(r3)     // Catch:{ all -> 0x0265 }
            goto L_0x031b
        L_0x02b2:
            uj6 r0 = new uj6     // Catch:{ all -> 0x0265 }
            r2 = 8
            r4 = 0
            r0.<init>((java.lang.Object) r10, (java.lang.Object) r1, (boolean) r4, (int) r2)     // Catch:{ all -> 0x0265 }
            java.util.ArrayList r2 = r10.j     // Catch:{ all -> 0x0265 }
            r2.add(r0)     // Catch:{ all -> 0x0265 }
            voc r2 = r10.b     // Catch:{ all -> 0x0265 }
            java.lang.String r4 = "OKSignaling"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0265 }
            r5.<init>(r11)     // Catch:{ all -> 0x0265 }
            r5.append(r1)     // Catch:{ all -> 0x0265 }
            java.lang.String r11 = r5.toString()     // Catch:{ all -> 0x0265 }
            r2.log(r4, r11)     // Catch:{ all -> 0x0265 }
            android.os.Handler r11 = r10.d     // Catch:{ all -> 0x0265 }
            long r4 = r1.c     // Catch:{ all -> 0x0265 }
            r11.postDelayed(r0, r4)     // Catch:{ all -> 0x0265 }
            long r4 = r1.c     // Catch:{ all -> 0x0265 }
            long r4 = r4 * r6
            r1.c = r4     // Catch:{ all -> 0x0265 }
            int r10 = r10.m     // Catch:{ all -> 0x0265 }
            long r10 = (long) r10     // Catch:{ all -> 0x0265 }
            long r10 = java.lang.Math.min(r4, r10)     // Catch:{ all -> 0x0265 }
            r1.c = r10     // Catch:{ all -> 0x0265 }
        L_0x02e7:
            monitor-exit(r3)     // Catch:{ all -> 0x0265 }
            goto L_0x031b
        L_0x02e9:
            monitor-exit(r3)     // Catch:{ all -> 0x0265 }
            throw r10
        L_0x02eb:
            yoc r0 = r10.a
            jme r1 = defpackage.jme.app_event
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "rtc.cmd.error."
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.log((defpackage.jme) r1, (java.lang.String) r2, (java.lang.String) r5)
            java.lang.String r0 = "signaling.listener.response.error.seq"
            android.os.Handler r1 = r10.c
            o6d r2 = new o6d
            r3 = 5
            r2.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r0, (int) r3)
            r1.post(r2)
            goto L_0x031b
        L_0x030e:
            java.lang.String r0 = "listener.response.error"
            android.os.Handler r1 = r10.c
            o6d r2 = new o6d
            r3 = 5
            r2.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r0, (int) r3)
            r1.post(r2)
        L_0x031b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9e.f(org.json.JSONObject):void");
    }

    public final void g() {
        this.g.b();
        synchronized (this.f) {
            try {
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    this.d.removeCallbacks((Runnable) it.next());
                }
                this.j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(rp6 rp6, n9e n9e) {
        d(rp6, false, n9e, (n9e) null);
    }

    public final void i(r9e r9e) {
        d(r9e, false, (n9e) null, (n9e) null);
    }

    public final void j(JSONObject jSONObject, n9e n9e, n9e n9e2) {
        d(new rp6(jSONObject), false, n9e, n9e2);
    }
}
