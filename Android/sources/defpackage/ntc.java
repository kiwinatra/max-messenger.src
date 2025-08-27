package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: ntc  reason: default package */
public final class ntc {
    public final long a;
    public final int b;
    public final Object c;
    public Object d;
    public final Object e;

    public ntc(fef fef, TimeUnit timeUnit) {
        this.b = 5;
        this.a = timeUnit.toNanos(5);
        this.c = fef.f();
        this.d = new y37(this, 1, wj6.n(new StringBuilder(), u0g.g, " ConnectionPool"));
        this.e = new ConcurrentLinkedQueue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0.contains(r1) != false) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = defpackage.cvg.A(r0)
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = "youtube"
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L_0x0013
            goto L_0x0026
        L_0x0013:
            java.lang.String r1 = "vimeo"
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L_0x001c
            goto L_0x0026
        L_0x001c:
            java.lang.String r1 = "instagram"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            r0 = 2
            int r3 = r3.b
            if (r3 == r0) goto L_0x0032
            r0 = 3
            if (r3 != r0) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            java.lang.String r3 = "player"
            goto L_0x0034
        L_0x0032:
            java.lang.String r3 = "attachment"
        L_0x0034:
            if (r1 == 0) goto L_0x003c
            java.lang.String r0 = "/"
            java.lang.String r3 = defpackage.g63.i(r3, r0, r1)
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntc.a():java.lang.String");
    }

    public boolean b(za zaVar, jtc jtc, ArrayList arrayList, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.e).iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                return false;
            }
            mtc mtc = (mtc) it.next();
            synchronized (mtc) {
                if (z) {
                    if (mtc.f != null) {
                        z2 = true;
                    }
                    if (!z2) {
                        Unit unit = Unit.INSTANCE;
                    }
                }
                if (mtc.h(zaVar, arrayList)) {
                    jtc.b(mtc);
                    return true;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public int c(mtc mtc, long j) {
        byte[] bArr = u0g.a;
        ArrayList arrayList = mtc.o;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                wnb wnb = wnb.a;
                wnb.a.j(((itc) reference).a, "A connection to " + mtc.q.a.a + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i);
                mtc.i = true;
                if (arrayList.isEmpty()) {
                    mtc.p = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public void d(Throwable th) {
        String str;
        boolean z;
        String a2 = a();
        if (!((rh3) ((qra) ym.e()).getAccessor().g(rh3.class)).e() || (((z = th instanceof FetcherException)) && ((FetcherException) th).a == 2)) {
            str = "offline";
        } else if (z && ((FetcherException) th).a == 4) {
            str = "parse_manifest";
        } else if (!z) {
            str = th instanceof TimeoutException ? "timeout" : "unknown";
        } else {
            return;
        }
        String str2 = str;
        int i = this.b;
        f("error", str2, (String) null, (String) null, i == 1, a2, i == 5, i == 3 ? "auto" : null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(java.lang.Object r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.d
            f4g r0 = (defpackage.f4g) r0
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r7 = r10.a()
            java.lang.Object r0 = r10.d
            f4g r0 = (defpackage.f4g) r0
            boolean r1 = r0 instanceof defpackage.r64
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "VIDEO_DASH"
        L_0x0016:
            r4 = r1
            goto L_0x0027
        L_0x0018:
            boolean r1 = r0 instanceof defpackage.k27
            if (r1 == 0) goto L_0x001f
            java.lang.String r1 = "HLS_PLAYLIST"
            goto L_0x0016
        L_0x001f:
            boolean r1 = r0 instanceof defpackage.wu9
            if (r1 == 0) goto L_0x0026
            java.lang.String r1 = "VIDEO_MP4"
            goto L_0x0016
        L_0x0026:
            r4 = r2
        L_0x0027:
            android.net.Uri r0 = r0.h()
            java.lang.String r5 = r0.getHost()
            r0 = 1
            r1 = 0
            int r3 = r10.b
            if (r3 != r0) goto L_0x0037
            r6 = r0
            goto L_0x0038
        L_0x0037:
            r6 = r1
        L_0x0038:
            r8 = 5
            if (r3 != r8) goto L_0x003d
            r8 = r0
            goto L_0x003e
        L_0x003d:
            r8 = r1
        L_0x003e:
            r0 = 3
            if (r3 != r0) goto L_0x0045
            java.lang.String r0 = "auto"
            r9 = r0
            goto L_0x0046
        L_0x0045:
            r9 = r2
        L_0x0046:
            r1 = r10
            r2 = r12
            r3 = r11
            r1.f(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntc.e(java.lang.Object, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [hj7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v1, types: [qae, java.util.Map] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010e, code lost:
        if (r1.equals("play") == false) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.lang.String r19, java.lang.Object r20, java.lang.String r21, java.lang.String r22, boolean r23, java.lang.String r24, boolean r25, java.lang.String r26) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = r22
            r4 = r24
            r5 = r26
            r10 = 0
            r11 = 1
            java.lang.Object r12 = r0.e
            ys7 r12 = (defpackage.ys7) r12
            java.lang.Object r13 = r12.get()
            if (r13 != 0) goto L_0x0019
            return
        L_0x0019:
            java.lang.Object r13 = r12.get()
            nd r13 = (defpackage.nd) r13
            r13.getClass()
            hj7 r14 = new hj7
            r14.<init>()
            java.lang.String r15 = "VIDEO_STATS"
            r14.v = r15
            long r6 = java.lang.System.currentTimeMillis()
            r14.a = r6
            r14.w = r1
            ts r6 = new ts
            r6.<init>(r10)
            long r8 = r0.a
            r16 = 0
            int r16 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r16 == 0) goto L_0x0049
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.String r9 = "vid"
            r6.put(r9, r8)
        L_0x0049:
            if (r20 == 0) goto L_0x0054
            java.lang.String r8 = "param"
            java.lang.String r9 = r20.toString()
            r6.put(r8, r9)
        L_0x0054:
            if (r2 == 0) goto L_0x0062
            int r8 = r21.length()
            if (r8 != 0) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            java.lang.String r8 = "ct"
            r6.put(r8, r2)
        L_0x0062:
            if (r3 == 0) goto L_0x0070
            int r2 = r22.length()
            if (r2 != 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            java.lang.String r2 = "cdn_host"
            r6.put(r2, r3)
        L_0x0070:
            java.lang.String r2 = "dst"
            if (r23 == 0) goto L_0x0079
            java.lang.String r3 = "pip"
            r6.put(r2, r3)
        L_0x0079:
            java.lang.String r3 = "place"
            if (r4 == 0) goto L_0x0087
            int r8 = r24.length()
            if (r8 != 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            r6.put(r3, r4)
        L_0x0087:
            if (r25 == 0) goto L_0x008e
            java.lang.String r8 = "chromecast"
            r6.put(r2, r8)
        L_0x008e:
            if (r5 == 0) goto L_0x009c
            int r2 = r26.length()
            if (r2 != 0) goto L_0x0097
            goto L_0x009c
        L_0x0097:
            java.lang.String r2 = "stat_type"
            r6.put(r2, r5)
        L_0x009c:
            boolean r2 = r6.isEmpty()
            r2 = r2 ^ r11
            if (r2 == 0) goto L_0x00a6
            r14.c(r6)
        L_0x00a6:
            n78 r2 = r14.d()
            r13.j(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int r0 = r0.b
            r5 = 2
            r6 = 3
            if (r0 == r11) goto L_0x00d1
            r7 = 4
            if (r0 == r5) goto L_0x00cd
            r8 = 5
            if (r0 == r6) goto L_0x00ca
            if (r0 == r7) goto L_0x00c7
            if (r0 != r8) goto L_0x00c5
            java.lang.String r0 = "CAST"
            goto L_0x00d5
        L_0x00c5:
            r0 = 0
            throw r0
        L_0x00c7:
            java.lang.String r0 = "PLAYER"
            goto L_0x00d5
        L_0x00ca:
            java.lang.String r0 = "INBUBBLE_AUTOPLAY"
            goto L_0x00d5
        L_0x00cd:
            r8 = 5
            java.lang.String r0 = "INBUBBLE"
            goto L_0x00d5
        L_0x00d1:
            r7 = 4
            r8 = 5
            java.lang.String r0 = "PIP"
        L_0x00d5:
            java.lang.String r9 = "sourceType"
            r2.put(r9, r0)
            r2.put(r3, r4)
            r0 = -1
            int r3 = r19.hashCode()
            switch(r3) {
                case -934524953: goto L_0x0127;
                case -702473442: goto L_0x011c;
                case -401282369: goto L_0x0111;
                case 3443508: goto L_0x0108;
                case 3540994: goto L_0x00fd;
                case 96784904: goto L_0x00f2;
                case 106440182: goto L_0x00e7;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            r6 = r0
            goto L_0x0131
        L_0x00e7:
            java.lang.String r3 = "pause"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00f0
            goto L_0x00e5
        L_0x00f0:
            r6 = 6
            goto L_0x0131
        L_0x00f2:
            java.lang.String r3 = "error"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00fb
            goto L_0x00e5
        L_0x00fb:
            r6 = r8
            goto L_0x0131
        L_0x00fd:
            java.lang.String r3 = "stop"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0106
            goto L_0x00e5
        L_0x0106:
            r6 = r7
            goto L_0x0131
        L_0x0108:
            java.lang.String r3 = "play"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0131
            goto L_0x00e5
        L_0x0111:
            java.lang.String r3 = "play_toggle"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x011a
            goto L_0x00e5
        L_0x011a:
            r6 = r5
            goto L_0x0131
        L_0x011c:
            java.lang.String r3 = "first_frame"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0125
            goto L_0x00e5
        L_0x0125:
            r6 = r11
            goto L_0x0131
        L_0x0127:
            java.lang.String r3 = "replay"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0130
            goto L_0x00e5
        L_0x0130:
            r6 = r10
        L_0x0131:
            switch(r6) {
                case 0: goto L_0x0194;
                case 1: goto L_0x0180;
                case 2: goto L_0x0174;
                case 3: goto L_0x0168;
                case 4: goto L_0x015c;
                case 5: goto L_0x014c;
                case 6: goto L_0x0135;
                default: goto L_0x0134;
            }
        L_0x0134:
            goto L_0x019f
        L_0x0135:
            r0 = r20
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x019f }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x019f }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.Object r2 = r12.get()     // Catch:{ Exception -> 0x019f }
            nd r2 = (defpackage.nd) r2     // Catch:{ Exception -> 0x019f }
            java.lang.String r3 = "ACTION_VIDEO_PAUSED"
            r2.h(r0, r3)     // Catch:{ Exception -> 0x019f }
            goto L_0x019f
        L_0x014c:
            r0 = r20
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x019f }
            java.lang.Object r1 = r12.get()     // Catch:{ Exception -> 0x019f }
            nd r1 = (defpackage.nd) r1     // Catch:{ Exception -> 0x019f }
            java.lang.String r2 = "ACTION_VIDEO_LOADING_ERROR"
            r1.f(r2, r0)     // Catch:{ Exception -> 0x019f }
            goto L_0x019f
        L_0x015c:
            java.lang.Object r0 = r12.get()
            nd r0 = (defpackage.nd) r0
            java.lang.String r1 = "ACTION_VIDEO_STOP"
            r0.g(r1, r2)
            goto L_0x019f
        L_0x0168:
            java.lang.Object r0 = r12.get()
            nd r0 = (defpackage.nd) r0
            java.lang.String r1 = "ACTION_VIDEO_PLAY"
            r0.g(r1, r2)
            goto L_0x019f
        L_0x0174:
            java.lang.Object r0 = r12.get()
            nd r0 = (defpackage.nd) r0
            java.lang.String r1 = "ACTION_VIDEO_PLAY_TOGGLE"
            r0.g(r1, r2)
            goto L_0x019f
        L_0x0180:
            r0 = r20
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x019f }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x019f }
            java.lang.Object r2 = r12.get()     // Catch:{ Exception -> 0x019f }
            nd r2 = (defpackage.nd) r2     // Catch:{ Exception -> 0x019f }
            java.lang.String r3 = "ACTION_VIDEO_FIRST_FRAME"
            r2.h(r0, r3)     // Catch:{ Exception -> 0x019f }
            goto L_0x019f
        L_0x0194:
            java.lang.Object r0 = r12.get()
            nd r0 = (defpackage.nd) r0
            java.lang.String r1 = "ACTION_VIDEO_REPLAY"
            r0.g(r1, r2)
        L_0x019f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntc.f(java.lang.String, java.lang.Object, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String):void");
    }

    public ntc(long j, int i, String str, ys7 ys7) {
        this.a = j;
        this.b = i;
        this.c = str != null ? str.toLowerCase() : null;
        this.e = ys7;
    }
}
