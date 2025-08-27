package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat;

/* renamed from: fz7  reason: default package */
public final class fz7 implements cm {
    public static final fz7 q;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;

    /* JADX WARNING: type inference failed for: r0v0, types: [uy7, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.a = "https";
        obj.b = "max";
        obj.c = "api.oneme.ru";
        obj.d = "443";
        obj.e = "max.ru";
        obj.f = "api-test.oneme.ru";
        obj.g = "api-tg.oneme.ru";
        obj.h = "api";
        obj.i = "chat";
        obj.j = ConversationStartedStat.CALL_TYPE_JOIN;
        obj.k = ConversationStartedStat.CALL_TYPE_JOIN;
        obj.l = "joincall";
        obj.m = "u";
        obj.n = "stickerset";
        obj.o = "startapp";
        obj.p = ":folder";
        q = new fz7(obj);
    }

    public fz7(uy7 uy7) {
        this.a = uy7.a;
        this.b = uy7.b;
        this.c = uy7.c;
        this.d = uy7.d;
        this.e = uy7.e;
        this.f = uy7.f;
        this.g = uy7.g;
        this.h = uy7.h;
        this.i = uy7.i;
        this.j = uy7.j;
        this.k = uy7.k;
        this.l = uy7.l;
        this.m = uy7.m;
        this.n = uy7.n;
        this.o = uy7.o;
        this.p = uy7.p;
    }

    public final String a(String str) {
        return new Uri.Builder().scheme(this.a).authority(this.e).appendPath(str.replace("@", "")).build().toString();
    }

    public final List b(r62 r62, Uri uri) {
        ez7 d2 = d(uri, new ty7(this, 0));
        r62.f();
        ArrayList arrayList = null;
        for (a32 a32 : r62.h.values()) {
            try {
                String str = a32.b.I;
                if (TextUtils.isEmpty(str) ? false : d2.equals(d(Uri.parse(str), new ty7(this, 0)))) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(a32);
                }
            } catch (Exception e2) {
                z68.g("r62", "exception in traverse predicate: %s", e2.getMessage());
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0323  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dz7 c(android.net.Uri r31, defpackage.r62 r32, defpackage.km3 r33, defpackage.u82 r34) {
        /*
            r30 = this;
            r1 = r30
            r2 = r31
            r3 = r32
            r0 = r33
            r4 = 1
            java.lang.String r5 = r31.toString()
            java.lang.String r6 = r1.e
            boolean r7 = r5.equalsIgnoreCase(r6)
            r8 = 0
            if (r7 == 0) goto L_0x0019
            r1 = r8
            goto L_0x040b
        L_0x0019:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = r1.a
            java.lang.String r10 = "://"
            java.lang.String r7 = defpackage.rae.q(r7, r9, r10, r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "http://"
            r9.<init>(r11)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            boolean r9 = r5.equalsIgnoreCase(r9)
            if (r9 != 0) goto L_0x040a
            boolean r5 = r5.equalsIgnoreCase(r7)
            if (r5 == 0) goto L_0x0042
            goto L_0x040a
        L_0x0042:
            java.lang.String r5 = r31.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = r1.b
            java.lang.String r7 = defpackage.rae.q(r7, r9, r10, r6)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r10)
            r11.append(r6)
            java.lang.String r9 = "/"
            r11.append(r9)
            java.lang.String r10 = r11.toString()
            boolean r7 = r5.equalsIgnoreCase(r7)
            if (r7 != 0) goto L_0x03fb
            boolean r5 = r5.equalsIgnoreCase(r10)
            if (r5 == 0) goto L_0x0076
            goto L_0x03fb
        L_0x0076:
            java.lang.String r5 = r31.getHost()
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L_0x0087
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 != 0) goto L_0x0087
            return r8
        L_0x0087:
            java.util.List r5 = r31.getPathSegments()
            r7 = 0
            java.lang.String r10 = r1.l
            java.lang.String r11 = r1.j
            if (r5 == 0) goto L_0x0174
            int r12 = r5.size()
            if (r12 != r4) goto L_0x0174
            java.lang.String r12 = r1.o
            java.lang.String r12 = r2.getQueryParameter(r12)
            if (r12 == 0) goto L_0x00b2
            android.net.Uri$Builder r0 = r31.buildUpon()
            android.net.Uri$Builder r0 = r0.clearQuery()
            android.net.Uri r0 = r0.build()
            zy7 r1 = new zy7
            r1.<init>(r0, r12)
            return r1
        L_0x00b2:
            java.lang.Object r12 = r5.get(r7)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = r1.p
            boolean r13 = r13.equalsIgnoreCase(r12)
            if (r13 == 0) goto L_0x00e8
            java.lang.String r13 = "id"
            java.lang.String r13 = r2.getQueryParameter(r13)
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 != 0) goto L_0x00e8
            r0 = r34
            ia2 r0 = (defpackage.ia2) r0
            java.util.concurrent.ConcurrentHashMap r0 = r0.X
            java.lang.Object r0 = r0.get(r13)
            zx5 r0 = (defpackage.zx5) r0
            if (r0 == 0) goto L_0x00e2
            wy7 r1 = new wy7
            java.lang.String r0 = r0.a
            r1.<init>(r0)
            return r1
        L_0x00e2:
            cz7 r0 = new cz7
            r0.<init>(r13)
            return r0
        L_0x00e8:
            java.lang.String r13 = "@"
            boolean r14 = r12.startsWith(r13)
            r15 = -1
            if (r14 != 0) goto L_0x0108
            boolean r16 = r12.equals(r11)
            if (r16 != 0) goto L_0x0106
            boolean r16 = r12.equals(r10)
            if (r16 != 0) goto L_0x0106
            java.lang.String r7 = r1.k
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r7 = r15
            goto L_0x0109
        L_0x0108:
            r7 = 0
        L_0x0109:
            if (r7 == r15) goto L_0x0174
            java.lang.Object r7 = r5.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r12 = r7.startsWith(r13)
            if (r12 == 0) goto L_0x011b
            java.lang.String r7 = r7.substring(r4)
        L_0x011b:
            java.util.concurrent.ConcurrentHashMap r12 = r0.b
            java.util.Collection r12 = r12.values()
            java.util.Iterator r12 = r12.iterator()
        L_0x0125:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x014e
            java.lang.Object r13 = r12.next()
            vk3 r13 = (defpackage.vk3) r13
            vm3 r15 = r13.a
            um3 r15 = r15.c
            java.lang.String r15 = r15.p
            boolean r17 = android.text.TextUtils.isEmpty(r15)
            if (r17 != 0) goto L_0x0146
            android.net.Uri r15 = android.net.Uri.parse(r15)
            java.lang.String r15 = r15.getLastPathSegment()
            goto L_0x0147
        L_0x0146:
            r15 = r8
        L_0x0147:
            boolean r15 = defpackage.gsg.i(r15, r7)
            if (r15 == 0) goto L_0x0125
            goto L_0x014f
        L_0x014e:
            r13 = r8
        L_0x014f:
            if (r13 == 0) goto L_0x0163
            long r22 = r13.r()
            dz7 r0 = new dz7
            r24 = 0
            r18 = 0
            r20 = 0
            r17 = r0
            r17.<init>(r18, r20, r22, r24)
            return r0
        L_0x0163:
            if (r14 == 0) goto L_0x0174
            bz7 r0 = new bz7
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r1 = r0
            r1.<init>(r2, r4, r6, r8)
            return r0
        L_0x0174:
            java.lang.String r7 = r31.getHost()
            boolean r6 = defpackage.gsg.i(r7, r6)
            if (r6 != 0) goto L_0x017f
            return r8
        L_0x017f:
            java.lang.String r6 = "uid"
            java.lang.String r6 = r2.getQueryParameter(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x01af
            r12 = -1
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0192 }
            goto L_0x0193
        L_0x0192:
            r6 = r12
        L_0x0193:
            int r12 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x01af
            r12 = 0
            vk3 r6 = r0.p(r6, r12)
            if (r6 == 0) goto L_0x01af
            long r18 = r6.r()
            dz7 r0 = new dz7
            r20 = 0
            r14 = 0
            r16 = 0
            r13 = r0
            r13.<init>(r14, r16, r18, r20)
            return r0
        L_0x01af:
            java.lang.String r6 = "cid"
            java.lang.String r6 = r2.getQueryParameter(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            r12 = 0
            if (r7 != 0) goto L_0x01ff
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x01c2 }
            goto L_0x01c3
        L_0x01c2:
            r6 = r12
        L_0x01c3:
            int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x01ff
            a32 r14 = r3.D(r6)
            if (r14 != 0) goto L_0x01eb
            java.util.concurrent.ConcurrentHashMap r14 = r3.c
            java.lang.Long r15 = java.lang.Long.valueOf(r6)
            java.lang.Object r15 = r14.get(r15)
            a32 r15 = (defpackage.a32) r15
            if (r15 == 0) goto L_0x01dd
            r14 = r15
            goto L_0x01eb
        L_0x01dd:
            r32.f()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r6 = r14.get(r6)
            a32 r6 = (defpackage.a32) r6
            r14 = r6
        L_0x01eb:
            if (r14 == 0) goto L_0x01ff
            dz7 r0 = new dz7
            r24 = 0
            r20 = 0
            long r1 = r14.a
            r22 = 0
            r17 = r0
            r18 = r1
            r17.<init>(r18, r20, r22, r24)
            return r0
        L_0x01ff:
            java.lang.String r6 = r31.toString()
            r7 = 2
            if (r5 == 0) goto L_0x022b
            int r14 = r5.size()
            if (r14 != r7) goto L_0x022b
            r14 = 0
            java.lang.Object r15 = r5.get(r14)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r14 = r1.n
            boolean r14 = r14.equalsIgnoreCase(r15)
            if (r14 == 0) goto L_0x022b
            az7 r0 = new az7
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r17 = r0
            r17.<init>(r18, r20, r22, r24)
            return r0
        L_0x022b:
            ty7 r14 = new ty7
            r14.<init>(r1, r4)
            ez7 r14 = r1.d(r2, r14)
            boolean r15 = android.text.TextUtils.isEmpty(r8)
            if (r15 != 0) goto L_0x023f
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x028f
        L_0x023f:
            java.util.concurrent.ConcurrentHashMap r0 = r0.b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r15 = r8
        L_0x024a:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x0287
            java.lang.Object r17 = r0.next()
            r8 = r17
            vk3 r8 = (defpackage.vk3) r8
            vm3 r12 = r8.a
            um3 r12 = r12.c
            java.lang.String r12 = r12.p
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L_0x0276
            android.net.Uri r12 = android.net.Uri.parse(r12)
            ty7 r13 = new ty7
            r13.<init>(r1, r4)
            ez7 r12 = r1.d(r12, r13)
            boolean r12 = r14.equals(r12)
            goto L_0x0277
        L_0x0276:
            r12 = 0
        L_0x0277:
            if (r12 == 0) goto L_0x0283
            if (r15 != 0) goto L_0x0280
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x0280:
            r15.add(r8)
        L_0x0283:
            r8 = 0
            r12 = 0
            goto L_0x024a
        L_0x0287:
            if (r15 != 0) goto L_0x028e
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x028f
        L_0x028e:
            r0 = r15
        L_0x028f:
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L_0x02ad
            r8 = 0
            java.lang.Object r0 = r0.get(r8)
            vk3 r0 = (defpackage.vk3) r0
            long r6 = r0.r()
            dz7 r0 = new dz7
            r8 = 0
            r2 = 0
            r4 = 0
            r1 = r0
            r1.<init>(r2, r4, r6, r8)
            return r0
        L_0x02ad:
            java.util.List r0 = r31.getPathSegments()
            if (r0 == 0) goto L_0x02dd
            int r8 = r0.size()
            if (r8 == r7) goto L_0x02ba
            goto L_0x02dd
        L_0x02ba:
            r8 = 0
            java.lang.Object r12 = r0.get(r8)
            java.lang.String r12 = (java.lang.String) r12
            boolean r8 = android.text.TextUtils.isEmpty(r12)
            if (r8 != 0) goto L_0x02dd
            java.lang.String r8 = "stickerset"
            boolean r8 = android.text.TextUtils.equals(r12, r8)
            if (r8 != 0) goto L_0x02d0
            goto L_0x02dd
        L_0x02d0:
            java.lang.Object r0 = r0.get(r4)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x02e2
        L_0x02dd:
            r12 = 0
            r28 = 0
            goto L_0x0311
        L_0x02e2:
            java.lang.String r0 = "-"
            int r0 = r8.indexOf(r0)
            if (r0 <= 0) goto L_0x02fa
            r12 = 0
            java.lang.String r0 = r8.substring(r12, r0)     // Catch:{ NumberFormatException -> 0x02f8 }
            long r12 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x02f8 }
        L_0x02f3:
            r28 = r12
            r12 = 0
            goto L_0x0311
        L_0x02f8:
            r0 = move-exception
            goto L_0x02ff
        L_0x02fa:
            long r12 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x02f8 }
            goto L_0x02f3
        L_0x02ff:
            java.util.Locale r12 = java.util.Locale.ENGLISH
            java.lang.String r13 = "Can't parse to long %s from uri %s"
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r2}
            java.lang.String r8 = java.lang.String.format(r12, r13, r8)
            java.lang.String r12 = "fz7"
            defpackage.z68.f(r12, r8, r0)
            goto L_0x02dd
        L_0x0311:
            int r0 = (r28 > r12 ? 1 : (r28 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0323
            dz7 r0 = new dz7
            r22 = 0
            r24 = 0
            r26 = 0
            r21 = r0
            r21.<init>(r22, r24, r26, r28)
            return r0
        L_0x0323:
            if (r5 == 0) goto L_0x033e
            int r0 = r5.size()
            if (r0 != r7) goto L_0x033e
            r8 = 0
            java.lang.Object r0 = r5.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x033e
            vy7 r0 = new vy7
            r0.<init>(r6)
            return r0
        L_0x033e:
            if (r5 == 0) goto L_0x0374
            int r0 = r5.size()
            if (r0 != r7) goto L_0x0374
            r7 = 0
            java.lang.Object r0 = r5.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r11.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0374
            java.lang.String r0 = r31.getPath()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r9)
            java.lang.Object r8 = r5.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = r6.replace(r0, r2)
            java.lang.Object r0 = r5.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0375
        L_0x0374:
            r0 = 0
        L_0x0375:
            android.net.Uri r2 = android.net.Uri.parse(r6)
            java.util.List r1 = r1.b(r3, r2)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0392
            xy7 r0 = new xy7
            r8 = 0
            r10 = 0
            r4 = 0
            r6 = 0
            r3 = r0
            r3.<init>(r4, r6, r8, r10)
            return r0
        L_0x0392:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            a32 r1 = (defpackage.a32) r1
            boolean r2 = defpackage.cvg.A(r0)
            if (r2 != 0) goto L_0x03ec
            byte[] r0 = defpackage.f6e.l(r0)     // Catch:{ all -> 0x03b9 }
            r2 = 8
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)     // Catch:{ all -> 0x03b9 }
            java.nio.ByteBuffer r0 = r2.put(r0)     // Catch:{ all -> 0x03b9 }
            r0.flip()     // Catch:{ all -> 0x03b9 }
            long r2 = r0.getLong()     // Catch:{ all -> 0x03b9 }
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x03b9 }
            goto L_0x03ca
        L_0x03b9:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r2 = "a89"
            java.lang.String r3 = "decodeServerId error: %s"
            defpackage.z68.g(r2, r3, r0)
            r8 = 0
        L_0x03ca:
            if (r8 == 0) goto L_0x03dd
            long r10 = r1.a
            long r12 = r8.longValue()
            dz7 r0 = new dz7
            r14 = 0
            r16 = 0
            r9 = r0
            r9.<init>(r10, r12, r14, r16)
            return r0
        L_0x03dd:
            long r2 = r1.a
            dz7 r0 = new dz7
            r8 = 0
            r4 = 0
            r6 = 0
            r1 = r0
            r1.<init>(r2, r4, r6, r8)
            return r0
        L_0x03ec:
            long r11 = r1.a
            dz7 r0 = new dz7
            r17 = 0
            r13 = 0
            r15 = 0
            r10 = r0
            r10.<init>(r11, r13, r15, r17)
            return r0
        L_0x03fb:
            yy7 r0 = new yy7
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r1 = r0
            r1.<init>(r2, r4, r6, r8)
            return r0
        L_0x040a:
            r1 = 0
        L_0x040b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz7.c(android.net.Uri, r62, km3, u82):dz7");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[LOOP:0: B:12:0x002d->B:17:0x0045, LOOP_START, PHI: r1 
      PHI: (r1v1 int) = (r1v0 int), (r1v5 int) binds: [B:11:0x002b, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ez7 d(android.net.Uri r6, defpackage.nsb r7) {
        /*
            r5 = this;
            android.net.Uri r6 = r5.f(r6)
            java.util.List r6 = r6.getPathSegments()
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0016
            java.lang.Object r0 = r6.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x002a
            boolean r7 = r7.test(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x002b
        L_0x0022:
            r7 = move-exception
            java.lang.String r2 = "fz7"
            java.lang.String r3 = "getLinkEntity: privacyPredicate fail"
            defpackage.z68.f(r2, r3, r7)
        L_0x002a:
            r7 = r1
        L_0x002b:
            if (r7 == 0) goto L_0x0058
        L_0x002d:
            int r2 = r6.size()
            r3 = -1
            if (r1 >= r2) goto L_0x0048
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = r5.j
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0045
            int r1 = r1 + 1
            goto L_0x0049
        L_0x0045:
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0048:
            r1 = r3
        L_0x0049:
            if (r1 == r3) goto L_0x0058
            int r5 = r6.size()
            if (r1 >= r5) goto L_0x0058
            java.lang.Object r5 = r6.get(r1)
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
        L_0x0058:
            ez7 r5 = new ez7
            r5.<init>(r0, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz7.d(android.net.Uri, nsb):ez7");
    }

    public final boolean e(Uri uri) {
        if (uri == null) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        boolean isEmpty = TextUtils.isEmpty(uri.getScheme());
        String str = this.g;
        String str2 = this.f;
        String str3 = this.e;
        if (!isEmpty) {
            String host = uri.getHost();
            if (uri.getScheme().equalsIgnoreCase(this.b)) {
                if (TextUtils.isEmpty(host) || pathSegments.size() <= 0) {
                    return false;
                }
                if (!host.equalsIgnoreCase(this.i) && !host.equalsIgnoreCase(this.h)) {
                    return false;
                }
            } else if (TextUtils.isEmpty(host) || pathSegments.size() <= 0) {
                return false;
            } else {
                if (!host.equalsIgnoreCase(str3) && !host.equalsIgnoreCase(str2) && !host.equalsIgnoreCase(str)) {
                    return false;
                }
            }
        } else if (pathSegments.isEmpty()) {
            return false;
        } else {
            String str4 = pathSegments.get(0);
            if (TextUtils.isEmpty(str4) || pathSegments.size() <= 1) {
                return false;
            }
            if (!str4.equalsIgnoreCase(str3) && !str4.equalsIgnoreCase(str2) && !str4.equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    public final Uri f(Uri uri) {
        String uri2 = uri.toString();
        boolean startsWith = uri2.startsWith(":");
        String str = this.b;
        if (!startsWith) {
            if (!uri2.startsWith(str + "://:")) {
                if (uri2.startsWith("@") || uri2.contains("://") || !TextUtils.isEmpty(uri.getScheme())) {
                    return uri;
                }
                return Uri.parse("https://" + uri);
            }
        }
        return y64.c(uri2.replace(str + "://:", ":"), str, (String) null);
    }
}
