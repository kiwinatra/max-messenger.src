package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: qe8  reason: default package */
public abstract class qe8 {
    public static final /* synthetic */ int a = 0;

    public static l20 a(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                byte[] bArr2 = b.a;
                return b.c(Protos.Attaches.Attach.parseFrom(bArr));
            } catch (InvalidProtocolBufferNanoException e) {
                throw new IOException(e);
            } catch (ProtoException unused) {
            }
        }
        return null;
    }

    public static w28 b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            byte[] bArr2 = b.a;
            return b.e(Protos.Attaches.parseFrom(bArr));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        } catch (ProtoException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static int c(w28 w28) {
        if (w28 == null) {
            return 0;
        }
        if (w28.G() != 1) {
            return w28.G() > 1 ? 4 : 0;
        }
        switch (w28.F(0).a.ordinal()) {
            case 1:
            case 8:
            case 10:
            case 11:
                return 0;
            case 2:
                return 1;
            case 3:
                return 3;
            case 4:
                return 2;
            case 5:
                return 10;
            case 6:
                return 5;
            case 7:
                return 8;
            case 9:
                return 7;
            case 12:
                return 9;
            default:
                z68.e("qe8", "new attach type " + w28.F(0).a + " in calcMediaType method. developer, please add mapping logic for it");
                return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.gz d(defpackage.l20 r49) {
        /*
            r0 = r49
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            g20 r2 = r0.a
            int r2 = r2.ordinal()
            r3 = 6
            r4 = 5
            r5 = 4
            r6 = 1
            r7 = 2
            r8 = 3
            switch(r2) {
                case 0: goto L_0x0286;
                case 1: goto L_0x0229;
                case 2: goto L_0x0222;
                case 3: goto L_0x01f4;
                case 4: goto L_0x01c4;
                case 5: goto L_0x015d;
                case 6: goto L_0x012f;
                case 7: goto L_0x00e8;
                case 8: goto L_0x0015;
                case 9: goto L_0x00cb;
                case 10: goto L_0x00a1;
                case 11: goto L_0x005d;
                case 12: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            return r1
        L_0x0016:
            u10 r0 = r0.m
            java.util.List r1 = r0.e
            if (r1 == 0) goto L_0x0040
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003e
            java.lang.Object r3 = r1.next()
            v10 r3 = (defpackage.v10) r3
            t58 r4 = new t58
            s58 r5 = r3.a
            long r6 = r3.b
            r4.<init>(r5, r6)
            r2.add(r4)
            goto L_0x0025
        L_0x003e:
            r11 = r2
            goto L_0x0045
        L_0x0040:
            java.util.List r2 = java.util.Collections.emptyList()
            goto L_0x003e
        L_0x0045:
            n58 r1 = new n58
            r15 = 0
            r16 = 0
            s58 r4 = r0.a
            long r5 = r0.b
            long r7 = r0.c
            long r9 = r0.d
            java.lang.String r12 = r0.f
            float r13 = r0.g
            boolean r14 = r0.h
            r3 = r1
            r3.<init>(r4, r5, r7, r9, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x005d:
            y10 r0 = r0.l
            int r1 = r0.e
            if (r1 == 0) goto L_0x0071
            int r1 = defpackage.tr1.y(r1)
            if (r1 == r6) goto L_0x007b
            if (r1 == r7) goto L_0x0079
            if (r1 == r8) goto L_0x0077
            if (r1 == r5) goto L_0x0075
            if (r1 == r4) goto L_0x0073
        L_0x0071:
            r14 = r6
            goto L_0x007c
        L_0x0073:
            r14 = r3
            goto L_0x007c
        L_0x0075:
            r14 = r4
            goto L_0x007c
        L_0x0077:
            r14 = r5
            goto L_0x007c
        L_0x0079:
            r14 = r8
            goto L_0x007c
        L_0x007b:
            r14 = r7
        L_0x007c:
            utb r1 = new utb
            long r2 = r0.a
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            long r2 = r0.b
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            long r2 = r0.c
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            long r2 = r0.d
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.lang.String r15 = r0.f
            r16 = 0
            r17 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x00a1:
            al3 r1 = new al3
            n10 r0 = r0.k
            java.lang.String r2 = r0.a
            r27 = 0
            r28 = 0
            long r3 = r0.b
            java.lang.String r5 = r0.c
            java.lang.String r6 = r0.d
            java.lang.String r7 = r0.e
            java.lang.String r8 = r0.f
            java.lang.String r0 = r0.g
            r18 = r1
            r19 = r2
            r20 = r3
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r0
            r18.<init>(r19, r20, r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x00cb:
            nk5 r1 = new nk5
            s10 r0 = r0.j
            long r10 = r0.a
            l20 r2 = r0.d
            gz r15 = d(r2)
            java.lang.String r14 = r0.c
            r18 = 0
            long r12 = r0.b
            r16 = 0
            java.lang.String r0 = r0.e
            r9 = r1
            r17 = r0
            r9.<init>(r10, r12, r14, r15, r16, r17, r18)
            return r1
        L_0x00e8:
            l10 r0 = r0.i
            int r1 = r0.c
            if (r1 == 0) goto L_0x00fb
            int r1 = defpackage.tr1.y(r1)
            if (r1 == r6) goto L_0x00f9
            if (r1 == r7) goto L_0x00f7
            goto L_0x00fb
        L_0x00f7:
            r12 = r7
            goto L_0x00fc
        L_0x00f9:
            r12 = r8
            goto L_0x00fc
        L_0x00fb:
            r12 = r6
        L_0x00fc:
            int r1 = r0.d
            if (r1 == 0) goto L_0x0117
            int r1 = defpackage.tr1.y(r1)
            if (r1 == 0) goto L_0x0117
            if (r1 == r6) goto L_0x0115
            if (r1 == r7) goto L_0x0113
            if (r1 == r8) goto L_0x0111
            if (r1 == r5) goto L_0x010f
            goto L_0x0117
        L_0x010f:
            r13 = r4
            goto L_0x0118
        L_0x0111:
            r13 = r5
            goto L_0x0118
        L_0x0113:
            r13 = r8
            goto L_0x0118
        L_0x0115:
            r13 = r7
            goto L_0x0118
        L_0x0117:
            r13 = r6
        L_0x0118:
            h01 r1 = new h01
            long r2 = r0.e
            java.lang.Long r14 = java.lang.Long.valueOf(r2)
            r16 = 0
            r17 = 0
            java.lang.String r10 = r0.a
            java.lang.String r11 = r0.b
            java.util.List r15 = r0.f
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x012f:
            v4e r1 = new v4e
            c20 r0 = r0.g
            long r2 = r0.a
            x10 r4 = r0.f
            web r25 = x(r4)
            l20 r4 = r0.g
            gz r26 = d(r4)
            r27 = 0
            r28 = 0
            java.lang.String r4 = r0.b
            java.lang.String r5 = r0.c
            java.lang.String r6 = r0.d
            java.lang.String r0 = r0.e
            r18 = r1
            r19 = r2
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r0
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x015d:
            doe r1 = new doe
            f20 r0 = r0.f
            long r2 = r0.a
            int r4 = r0.j
            int r4 = defpackage.tr1.y(r4)
            if (r4 == r6) goto L_0x0178
            if (r4 == r7) goto L_0x0175
            if (r4 == r8) goto L_0x0172
            r41 = r6
            goto L_0x017a
        L_0x0172:
            r41 = r5
            goto L_0x017a
        L_0x0175:
            r41 = r8
            goto L_0x017a
        L_0x0178:
            r41 = r7
        L_0x017a:
            int r4 = r0.n
            int r4 = defpackage.tr1.y(r4)
            if (r4 == r6) goto L_0x018a
            if (r4 == r7) goto L_0x0187
            r46 = r6
            goto L_0x018c
        L_0x0187:
            r46 = r8
            goto L_0x018c
        L_0x018a:
            r46 = r7
        L_0x018c:
            java.lang.String r4 = r0.l
            r44 = r4
            boolean r4 = r0.m
            r45 = r4
            long r4 = r0.k
            r42 = r4
            r47 = 0
            r48 = 0
            int r4 = r0.c
            r32 = r4
            int r4 = r0.d
            r33 = r4
            java.lang.String r4 = r0.b
            r34 = r4
            long r4 = r0.i
            r35 = r4
            java.lang.String r4 = r0.e
            r37 = r4
            java.lang.String r4 = r0.f
            r38 = r4
            java.util.List r4 = r0.g
            r39 = r4
            java.lang.String r0 = r0.h
            r40 = r0
            r29 = r1
            r30 = r2
            r29.<init>(r30, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r44, r45, r46, r47, r48)
            return r1
        L_0x01c4:
            v20 r1 = new v20
            i10 r0 = r0.e
            long r2 = r0.a
            int r9 = r0.i
            if (r9 != 0) goto L_0x01d0
        L_0x01ce:
            r15 = r6
            goto L_0x01e4
        L_0x01d0:
            int r9 = defpackage.tr1.y(r9)
            if (r9 == r6) goto L_0x01e3
            if (r9 == r7) goto L_0x01e1
            if (r9 == r8) goto L_0x01df
            if (r9 == r5) goto L_0x01dd
            goto L_0x01ce
        L_0x01dd:
            r15 = r4
            goto L_0x01e4
        L_0x01df:
            r15 = r5
            goto L_0x01e4
        L_0x01e1:
            r15 = r8
            goto L_0x01e4
        L_0x01e3:
            r15 = r7
        L_0x01e4:
            r11 = 0
            java.lang.String r12 = r0.e
            r7 = 0
            r8 = 0
            r10 = 0
            java.lang.String r13 = r0.f
            r14 = 0
            r4 = r1
            r5 = r2
            r4.<init>(r5, r7, r8, r10, r11, r12, r13, r14, r15)
            return r1
        L_0x01f4:
            a3g r1 = new a3g
            k20 r0 = r0.d
            long r2 = r0.a
            r4 = 0
            java.lang.Long r19 = java.lang.Long.valueOf(r4)
            r30 = 0
            r31 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            java.lang.String r0 = r0.l
            r16 = r1
            r17 = r2
            r29 = r0
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r1
        L_0x0222:
            x10 r0 = r0.b
            web r0 = x(r0)
            return r0
        L_0x0229:
            q10 r0 = r0.c
            p10 r2 = r0.a
            int r2 = r2.ordinal()
            switch(r2) {
                case 1: goto L_0x0246;
                case 2: goto L_0x0244;
                case 3: goto L_0x0247;
                case 4: goto L_0x0242;
                case 5: goto L_0x0238;
                case 6: goto L_0x0240;
                case 7: goto L_0x023d;
                case 8: goto L_0x023a;
                case 9: goto L_0x0234;
                case 10: goto L_0x0236;
                default: goto L_0x0234;
            }
        L_0x0234:
            r5 = r6
            goto L_0x0247
        L_0x0236:
            r3 = 12
        L_0x0238:
            r5 = r3
            goto L_0x0247
        L_0x023a:
            r3 = 10
            goto L_0x0238
        L_0x023d:
            r3 = 9
            goto L_0x0238
        L_0x0240:
            r3 = 7
            goto L_0x0238
        L_0x0242:
            r5 = r4
            goto L_0x0247
        L_0x0244:
            r5 = r8
            goto L_0x0247
        L_0x0246:
            r5 = r7
        L_0x0247:
            a20 r2 = r0.h
            if (r2 == 0) goto L_0x025a
            a20 r1 = new a20
            float r9 = r2.d
            float r10 = r2.e
            float r7 = r2.b
            float r8 = r2.c
            r11 = 3
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x025a:
            r12 = r1
            ox3 r1 = new ox3
            long r2 = r0.b
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            java.util.ArrayList r7 = r0.c
            r19 = 0
            r20 = 0
            java.lang.String r8 = r0.d
            java.lang.String r9 = r0.e
            java.lang.String r10 = r0.f
            java.lang.String r11 = r0.g
            java.lang.String r13 = r0.i
            java.lang.String r14 = r0.j
            boolean r15 = r0.k
            int r2 = r0.l
            r16 = r2
            r17 = 0
            java.lang.String r0 = r0.o
            r18 = r0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0286:
            nvf r0 = new nvf
            r1 = 0
            r0.<init>(r1, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe8.d(l20):gz");
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Object, o10] */
    /* JADX WARNING: type inference failed for: r11v3, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v14, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v17, types: [h10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v14, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v19, types: [e20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v34, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v39, types: [b20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v34, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v24, types: [f10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v26, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v29, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v61, types: [r10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v63, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v36, types: [java.lang.Object, m10] */
    /* JADX WARNING: type inference failed for: r10v38, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v39, types: [y10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v41, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v42, types: [t10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v96, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v46, types: [j10, java.lang.Object] */
    public static l20 e(gz gzVar, bjd bjd, long j, long j2) {
        int i;
        List list;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        switch (gzVar.a.ordinal()) {
            case 1:
                ox3 ox3 = (ox3) gzVar;
                int i5 = q10.p;
                ? obj = new Object();
                int i6 = ox3.o;
                switch (tr1.y(i6)) {
                    case 0:
                        obj.a = p10.a;
                        break;
                    case 1:
                        obj.a = p10.b;
                        break;
                    case 2:
                        obj.a = p10.c;
                        break;
                    case 3:
                        obj.a = p10.o;
                        break;
                    case 4:
                        obj.a = p10.v;
                        break;
                    case 5:
                        obj.a = p10.w;
                        break;
                    case 6:
                        obj.a = p10.x;
                        break;
                    case 8:
                        obj.a = p10.y;
                        break;
                    case 9:
                        obj.a = p10.z;
                        break;
                    case 10:
                        obj.a = p10.X;
                        break;
                    case 11:
                        obj.a = p10.Y;
                        break;
                }
                Long l = ox3.v;
                if (l != null) {
                    obj.b = l.longValue();
                }
                List list2 = ox3.w;
                if (list2 != null && list2.size() > 0) {
                    if (obj.c == null) {
                        obj.c = new ArrayList();
                    }
                    obj.c.addAll(list2);
                }
                String str = ox3.x;
                if (str != null) {
                    obj.d = str;
                }
                String str2 = ox3.y;
                if (str2 != null) {
                    obj.e = str2;
                }
                String str3 = ox3.z;
                if (str3 != null) {
                    obj.f = str3;
                }
                String str4 = ox3.X;
                if (str4 != null) {
                    obj.g = str4;
                }
                a20 a20 = ox3.Y;
                if (a20 != null) {
                    obj.h = new a20(a20.b, a20.c, a20.d, a20.e, 0);
                }
                String str5 = ox3.Z;
                if (str5 != null) {
                    obj.i = str5;
                }
                String str6 = ox3.v0;
                if (str6 != null) {
                    obj.j = str6;
                }
                obj.k = ox3.w0;
                int i7 = ox3.x0;
                if (i7 != 0) {
                    obj.l = i7;
                }
                if (i6 == 11) {
                    obj.m = j;
                    obj.n = j2;
                }
                obj.o = ox3.z0;
                int i8 = l20.z;
                ? obj2 = new Object();
                obj2.l = UUID.randomUUID().toString();
                obj2.a = g20.b;
                obj2.c = obj.a();
                obj2.n = ox3.b;
                obj2.y = ox3.c;
                return obj2.a();
            case 2:
                return w((web) gzVar, bjd);
            case 3:
                a3g a3g = (a3g) gzVar;
                k20 k20 = k20.q;
                h20 h20 = new h20();
                Long l2 = a3g.v;
                if (l2 != null) {
                    h20.e = l2.longValue();
                }
                Integer num = a3g.y;
                if (num != null) {
                    h20.c = num.intValue();
                }
                Integer num2 = a3g.x;
                if (num2 != null) {
                    h20.b = num2.intValue();
                }
                byte[] bArr = a3g.Z;
                if (bArr != null && bArr.length > 0) {
                    try {
                        bjd.getClass();
                        h20.n = bArr;
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                String str7 = a3g.w;
                if (str7 != null) {
                    h20.d = str7;
                }
                h20.j = a3g.z;
                String str8 = a3g.X;
                if (str8 != null) {
                    h20.f = str8;
                }
                String str9 = a3g.Y;
                if (str9 != null) {
                    h20.g = str9;
                }
                Long l3 = a3g.o;
                if (l3 != null) {
                    h20.a = l3.longValue();
                }
                Long l4 = a3g.v0;
                if (l4 != null) {
                    h20.k = l4.longValue();
                }
                h20.h = a3g.w0;
                x3g x3g = a3g.x0;
                if (x3g != null) {
                    h20.p = new zy(x3g.b, x3g.c, x3g.o, x3g.v, x3g.a);
                }
                int i9 = l20.z;
                ? obj3 = new Object();
                obj3.l = UUID.randomUUID().toString();
                obj3.a = g20.o;
                obj3.n = a3g.b;
                obj3.y = a3g.c;
                obj3.d = new k20(h20);
                return obj3.a();
            case 4:
                v20 v20 = (v20) gzVar;
                i10 i10 = i10.j;
                ? obj4 = new Object();
                Long l5 = v20.o;
                if (l5 != null) {
                    obj4.a = l5.longValue();
                }
                Long l6 = v20.w;
                if (l6 != null) {
                    obj4.c = l6.longValue();
                }
                String str10 = v20.v;
                if (str10 != null) {
                    obj4.b = str10;
                }
                byte[] bArr2 = v20.x;
                if (bArr2 != null) {
                    obj4.d = bArr2;
                }
                String str11 = v20.z;
                if (str11 != null) {
                    obj4.f = str11;
                }
                int i11 = v20.X;
                if (i11 != 0) {
                    int y = tr1.y(i11);
                    if (y == 1) {
                        i2 = 2;
                    } else if (y == 2) {
                        i2 = 3;
                    } else if (y == 3) {
                        i2 = 4;
                    } else if (y != 4) {
                        i2 = 1;
                    }
                    obj4.i = i2;
                }
                obj4.e = v20.y;
                int i12 = l20.z;
                ? obj5 = new Object();
                obj5.l = UUID.randomUUID().toString();
                obj5.a = g20.v;
                obj5.n = v20.b;
                obj5.y = v20.c;
                obj5.e = new i10(obj4);
                return obj5.a();
            case 5:
                doe doe = (doe) gzVar;
                f20 f20 = f20.o;
                ? obj6 = new Object();
                obj6.a = doe.o;
                obj6.d = doe.x;
                obj6.b = doe.v;
                obj6.c = doe.w;
                obj6.e = doe.y;
                String str12 = doe.z;
                if (!cvg.A(str12)) {
                    obj6.f = str12;
                }
                String str13 = doe.X;
                if (!cvg.A(str13)) {
                    obj6.g = str13;
                }
                if (obj6.i == null) {
                    obj6.i = new ArrayList();
                }
                obj6.i.addAll(doe.Y);
                String str14 = doe.Z;
                if (!cvg.A(str14)) {
                    obj6.h = str14;
                }
                int i13 = doe.v0;
                if (i13 != 0) {
                    int y2 = tr1.y(i13);
                    if (y2 == 1) {
                        i3 = 2;
                    } else if (y2 == 2) {
                        i3 = 3;
                    } else if (y2 != 3) {
                        i3 = 1;
                    }
                    obj6.j = i3;
                }
                obj6.k = doe.w0;
                obj6.l = doe.x0;
                obj6.m = doe.y0;
                int i14 = doe.z0;
                if (i14 != 0) {
                    int y3 = tr1.y(i14);
                    if (y3 == 1) {
                        i4 = 2;
                    } else if (y3 != 2) {
                        i4 = 1;
                    }
                    obj6.n = i4;
                } else {
                    obj6.n = 1;
                }
                int i15 = l20.z;
                ? obj7 = new Object();
                obj7.l = UUID.randomUUID().toString();
                obj7.a = g20.w;
                obj7.f = obj6.a();
                obj7.n = doe.b;
                obj7.y = doe.c;
                return obj7.a();
            case 6:
                v4e v4e = (v4e) gzVar;
                int i16 = c20.i;
                ? obj8 = new Object();
                obj8.a = v4e.o;
                String str15 = v4e.w;
                if (str15 != null) {
                    obj8.c = str15;
                }
                String str16 = v4e.v;
                if (str16 != null) {
                    obj8.b = str16;
                }
                if (str15 != null) {
                    obj8.c = str15;
                }
                String str17 = v4e.x;
                if (str17 != null) {
                    obj8.d = str17;
                }
                String str18 = v4e.y;
                if (str18 != null) {
                    obj8.e = str18;
                }
                web web = v4e.z;
                if (web != null) {
                    obj8.f = w(web, bjd).b;
                }
                gz gzVar2 = v4e.X;
                if (gzVar2 != null) {
                    obj8.g = e(gzVar2, bjd, 0, 0);
                }
                boolean z = v4e.b;
                obj8.h = z;
                int i17 = l20.z;
                ? obj9 = new Object();
                obj9.l = UUID.randomUUID().toString();
                obj9.a = g20.x;
                obj9.g = new c20(obj8);
                obj9.n = z;
                obj9.y = v4e.c;
                return obj9.a();
            case 7:
                zm zmVar = (zm) gzVar;
                ? obj10 = new Object();
                obj10.a = zmVar.o;
                obj10.b = zmVar.v;
                obj10.c = zmVar.w;
                obj10.d = zmVar.x;
                obj10.e = zmVar.y;
                obj10.f = zmVar.z;
                g10 g10 = new g10(obj10);
                int i18 = l20.z;
                ? obj11 = new Object();
                obj11.l = UUID.randomUUID().toString();
                obj11.a = g20.z;
                obj11.n = zmVar.b;
                obj11.y = zmVar.c;
                obj11.h = g10;
                return obj11.a();
            case 8:
                h01 h01 = (h01) gzVar;
                k10 k10 = new k10();
                k10.a = h01.o;
                k10.b = h01.v;
                int i19 = 0;
                int i20 = h01.w;
                if (i20 != 0) {
                    int y4 = tr1.y(i20);
                    i = y4 != 1 ? y4 != 2 ? 1 : 2 : 3;
                } else {
                    i = 0;
                }
                k10.c = i;
                int i21 = h01.x;
                if (i21 != 0) {
                    int y5 = tr1.y(i21);
                    if (y5 == 1) {
                        i2 = 2;
                    } else if (y5 == 2) {
                        i2 = 3;
                    } else if (y5 == 3) {
                        i2 = 4;
                    } else if (y5 != 4) {
                        i2 = 1;
                    }
                    i19 = i2;
                }
                k10.d = i19;
                Long l7 = h01.y;
                k10.e = l7 != null ? l7.longValue() : 0;
                List list3 = h01.z;
                k10.f = list3;
                if (list3 == null) {
                    k10.f = Collections.emptyList();
                }
                l10 l10 = new l10(k10);
                int i22 = l20.z;
                ? obj12 = new Object();
                obj12.l = UUID.randomUUID().toString();
                obj12.a = g20.y;
                obj12.q = l10;
                obj12.n = h01.b;
                obj12.y = h01.c;
                return obj12.a();
            case 9:
                nk5 nk5 = (nk5) gzVar;
                ? obj13 = new Object();
                obj13.a = nk5.o;
                obj13.b = nk5.v;
                obj13.c = nk5.w;
                gz gzVar3 = nk5.x;
                obj13.e = gzVar3 != null ? e(gzVar3, bjd, 0, 0) : null;
                obj13.d = nk5.y;
                s10 s10 = new s10(obj13);
                int i23 = l20.z;
                ? obj14 = new Object();
                obj14.l = UUID.randomUUID().toString();
                obj14.a = g20.X;
                obj14.r = s10;
                obj14.n = nk5.b;
                obj14.y = nk5.c;
                return obj14.a();
            case 10:
                al3 al3 = (al3) gzVar;
                ? obj15 = new Object();
                obj15.a = al3.o;
                obj15.b = al3.v;
                obj15.c = al3.w;
                obj15.f = al3.z;
                obj15.g = al3.X;
                obj15.d = al3.x;
                obj15.e = al3.y;
                n10 n10 = new n10(obj15);
                int i24 = l20.z;
                ? obj16 = new Object();
                obj16.l = UUID.randomUUID().toString();
                obj16.a = g20.Y;
                obj16.s = n10;
                obj16.n = al3.b;
                obj16.y = al3.c;
                return obj16.a();
            case 11:
                utb utb = (utb) gzVar;
                ? obj17 = new Object();
                obj17.a = utb.o.longValue();
                obj17.b = utb.v.longValue();
                obj17.c = utb.w.longValue();
                obj17.d = utb.x.longValue();
                int i25 = utb.y;
                if (i25 != 0) {
                    int y6 = tr1.y(i25);
                    if (y6 == 1) {
                        i2 = 2;
                    } else if (y6 == 2) {
                        i2 = 3;
                    } else if (y6 == 3) {
                        i2 = 4;
                    } else if (y6 != 4) {
                        if (y6 == 5) {
                            i2 = 6;
                        }
                    }
                    obj17.e = i2;
                    obj17.f = utb.z;
                    y10 y10 = new y10(obj17);
                    int i26 = l20.z;
                    ? obj18 = new Object();
                    obj18.l = UUID.randomUUID().toString();
                    obj18.a = g20.Z;
                    obj18.t = y10;
                    obj18.n = utb.b;
                    obj18.y = utb.c;
                    return obj18.a();
                }
                i2 = 1;
                obj17.e = i2;
                obj17.f = utb.z;
                y10 y102 = new y10(obj17);
                int i262 = l20.z;
                ? obj182 = new Object();
                obj182.l = UUID.randomUUID().toString();
                obj182.a = g20.Z;
                obj182.t = y102;
                obj182.n = utb.b;
                obj182.y = utb.c;
                return obj182.a();
            case 13:
                n58 n58 = (n58) gzVar;
                ? obj19 = new Object();
                obj19.a = n58.o;
                obj19.b = n58.v;
                obj19.c = n58.w;
                obj19.d = n58.x;
                List<t58> list4 = n58.y;
                if (list4 == null) {
                    list = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList(list4.size());
                    for (t58 t58 : list4) {
                        arrayList.add(new v10(t58.a, t58.b));
                    }
                    list = arrayList;
                }
                obj19.e = list;
                obj19.f = n58.z;
                obj19.g = n58.X;
                obj19.h = n58.Y;
                u10 a2 = obj19.a();
                int i27 = l20.z;
                ? obj20 = new Object();
                obj20.l = UUID.randomUUID().toString();
                obj20.a = g20.v0;
                obj20.v = a2;
                obj20.n = n58.b;
                obj20.y = n58.c;
                return obj20.a();
            default:
                int i28 = l20.z;
                ? obj21 = new Object();
                obj21.a = g20.a;
                obj21.l = UUID.randomUUID().toString();
                obj21.n = gzVar.b;
                obj21.y = gzVar.c;
                return obj21.a();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [a00, java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v4, types: [g85, java.lang.Object] */
    public static a00 f(w28 w28) {
        wv0 wv0;
        w28 w282 = w28;
        if (w282 == null) {
            return null;
        }
        ? arrayList = new ArrayList();
        for (l20 d : (List) w282.b) {
            gz d2 = d(d);
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        zf7 zf7 = (zf7) w282.c;
        if (zf7 != null) {
            ? obj = new Object();
            ArrayList arrayList2 = new ArrayList();
            for (ew0 it : zf7.a) {
                ArrayList arrayList3 = new ArrayList();
                arrayList2.add(arrayList3);
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    xv0 xv0 = (xv0) it2.next();
                    String str = xv0.b.a;
                    wv0[] wv0Arr = wv0.c;
                    int length = wv0Arr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            wv0 = wv0.UNKNOWN;
                            break;
                        }
                        wv0 = wv0Arr[i];
                        if (wv0.a.equalsIgnoreCase(str)) {
                            break;
                        }
                        i++;
                    }
                    vv0 vv0 = vv0.UNKNOWN;
                    int y = tr1.y(xv0.c);
                    if (y == 0) {
                        vv0 = vv0.DEFAULT;
                    } else if (y == 1) {
                        vv0 = vv0.POSITIVE;
                    } else if (y == 2) {
                        vv0 = vv0.NEGATIVE;
                    }
                    eg egVar = new eg();
                    egVar.c = wv0;
                    egVar.v = vv0;
                    egVar.o = xv0.a;
                    egVar.w = xv0.o;
                    egVar.x = xv0.v;
                    egVar.a = xv0.w;
                    egVar.b = xv0.x;
                    arrayList3.add(new yv0(egVar));
                }
            }
            obj.a = arrayList2;
            arrayList.add(new ag7(new ak3((g85) obj), zf7.b, false, false));
        }
        i2d i2d = (i2d) w282.o;
        if (i2d != null) {
            ArrayList arrayList4 = new ArrayList();
            for (h2d it3 : i2d.a) {
                ArrayList arrayList5 = new ArrayList();
                arrayList4.add(arrayList5);
                Iterator it4 = it3.iterator();
                while (it4.hasNext()) {
                    f2d f2d = (f2d) it4.next();
                    String str2 = f2d.a.a;
                    e2d.b.getClass();
                    e2d w = mz4.w(str2);
                    c2d c2d = c2d.UNKNOWN;
                    int ordinal = f2d.b.ordinal();
                    if (ordinal == 0) {
                        c2d = c2d.DEFAULT;
                    } else if (ordinal == 1) {
                        c2d = c2d.POSITIVE;
                    } else if (ordinal == 2) {
                        c2d = c2d.NEGATIVE;
                    }
                    c2d c2d2 = c2d;
                    arrayList5.add(new g2d(w, c2d2, f2d.c, x(f2d.d), (v5b) null));
                }
            }
            arrayList.add(new k2d(i2d.b, new j2d(arrayList4), false, false));
        }
        return arrayList;
    }

    public static w28 g(a00 a00, bjd bjd) {
        return h(a00, bjd, 0, 0, (sk3) null);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, m20] */
    public static w28 h(a00 a00, bjd bjd, long j, long j2, sk3 sk3) {
        Iterator it;
        int i;
        fw0 fw0;
        Iterator it2;
        d2d d2d;
        long j3;
        sk3 sk32 = sk3;
        ? obj = new Object();
        if (a00 == null) {
            return obj.c();
        }
        Iterator it3 = a00.iterator();
        while (it3.hasNext()) {
            gz gzVar = (gz) it3.next();
            int ordinal = gzVar.a.ordinal();
            if (ordinal == 12) {
                it = it3;
                ag7 ag7 = (ag7) gzVar;
                int i2 = zf7.c;
                yf7 yf7 = new yf7();
                ArrayList arrayList = new ArrayList();
                for (List<yv0> it4 : (List) ag7.o.a) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList.add(arrayList2);
                    for (yv0 yv0 : it4) {
                        String str = yv0.a.a;
                        fw0[] fw0Arr = fw0.X;
                        int length = fw0Arr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i = 1;
                                fw0 = fw0.UNKNOWN;
                                break;
                            }
                            fw0 fw02 = fw0Arr[i3];
                            if (fw02.a.equalsIgnoreCase(str)) {
                                fw0 = fw02;
                                i = 1;
                                break;
                            }
                            i3++;
                        }
                        int ordinal2 = yv0.c.ordinal();
                        uv0 uv0 = new uv0(yv0.b, fw0, ordinal2 != 0 ? ordinal2 != i ? ordinal2 != 2 ? 4 : 3 : 2 : i);
                        uv0.d = yv0.o;
                        uv0.e = yv0.v;
                        uv0.f = yv0.w;
                        uv0.h = yv0.x;
                        arrayList2.add(new xv0(uv0));
                    }
                }
                yf7.a = arrayList;
                yf7.b = ag7.v;
                obj.b = new zf7(yf7);
            } else if (ordinal != 14) {
                obj.a(e(gzVar, bjd, j, j2));
                it = it3;
            } else {
                k2d k2d = (k2d) gzVar;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (List<g2d> it5 : k2d.v.a) {
                    h2d h2d = new h2d();
                    arrayList3.add(h2d);
                    for (g2d g2d : it5) {
                        String str2 = g2d.a.a;
                        d2d.b.getClass();
                        d2d[] values = d2d.values();
                        int length2 = values.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                it2 = it3;
                                d2d = null;
                                break;
                            }
                            d2d = values[i4];
                            it2 = it3;
                            if (Intrinsics.areEqual((Object) d2d.a, (Object) str2)) {
                                break;
                            }
                            i4++;
                            it3 = it2;
                        }
                        if (d2d == null) {
                            d2d = d2d.UNKNOWN;
                        }
                        d2d d2d2 = d2d;
                        b2d b2d = b2d.o;
                        int ordinal3 = g2d.b.ordinal();
                        if (ordinal3 == 0) {
                            b2d = b2d.a;
                        } else if (ordinal3 == 1) {
                            b2d = b2d.b;
                        } else if (ordinal3 == 2) {
                            b2d = b2d.c;
                        }
                        b2d b2d2 = b2d;
                        web web = g2d.o;
                        x10 x10 = web != null ? w(web, (bjd) null).b : null;
                        v5b v5b = g2d.v;
                        if (v5b != null) {
                            arrayList4.add(v5b);
                            j3 = v5b.a;
                        } else {
                            j3 = -1;
                        }
                        h2d.add(new f2d(d2d2, b2d2, g2d.c, x10, j3));
                        it3 = it2;
                    }
                }
                it = it3;
                if (sk32 != null) {
                    sk32.accept(arrayList4);
                }
                obj.c = new i2d(arrayList3, k2d.o);
            }
            it3 = it;
        }
        return obj.c();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, c72] */
    public static d72 i(rp2 rp2, d72 d72) {
        List list = d72.h;
        ? obj = new Object();
        obj.a = rp2.b;
        Long l = rp2.c;
        if (l != null) {
            obj.e = l.longValue();
        }
        ArrayList arrayList = new ArrayList();
        List<kl2> list2 = rp2.a;
        if (list2 != null) {
            for (kl2 ordinal : list2) {
                int ordinal2 = ordinal.ordinal();
                if (ordinal2 == 0) {
                    arrayList.add(a72.a);
                } else if (ordinal2 == 1) {
                    arrayList.add(a72.b);
                } else if (ordinal2 == 2) {
                    arrayList.add(a72.c);
                }
            }
        }
        if (obj.b == null) {
            obj.b = new ArrayList();
        }
        obj.b.addAll(arrayList);
        obj.c = d72.c;
        obj.d = d72.d;
        obj.f = d72.f;
        obj.g = d72.g;
        return obj.b();
    }

    public static ArrayList j(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            er3 er3 = (er3) it.next();
            String str = er3.a;
            int ordinal = er3.b.ordinal();
            arrayList.add(new pm3(str, ordinal != 0 ? ordinal != 2 ? ordinal != 3 ? null : om3.o : om3.c : om3.a, er3.c));
        }
        return arrayList;
    }

    public static ArrayList k(List list) {
        ArrayList arrayList = new ArrayList();
        if (cjf.B(list)) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nuc nuc = (nuc) it.next();
            if (nuc.b == muc.EMOJI) {
                String str = nuc.c;
                if (cvg.D(str)) {
                    arrayList.add(new d35(str));
                }
            }
            if (nuc.b == muc.ANIMOJI) {
                long j = nuc.a;
                if (j != 0) {
                    arrayList.add(new mj(j));
                }
            }
        }
        return arrayList;
    }

    public static mtb l(ntb ntb) {
        if (ntb == null) {
            return mtb.c;
        }
        int y = tr1.y(ntb.a);
        return new mtb(y != 1 ? y != 2 ? y != 3 ? y != 4 ? 0 : 40 : 30 : 20 : 10, ntb.b);
    }

    public static ntb m(mtb mtb) {
        int i = 1;
        if (mtb == null) {
            return new ntb(1, 0);
        }
        int i2 = mtb.a;
        if (i2 == 10) {
            i = 2;
        } else if (i2 == 20) {
            i = 3;
        } else if (i2 == 30) {
            i = 4;
        } else if (i2 == 40) {
            i = 5;
        }
        return new ntb(i, mtb.b);
    }

    public static HashMap n(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((Long) entry.getKey(), l((ntb) entry.getValue()));
        }
        return hashMap;
    }

    public static ArrayList o(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a72 a72 = (a72) it.next();
            if (a72 == a72.a) {
                arrayList.add(kl2.SOUND);
            } else if (a72 == a72.b) {
                arrayList.add(kl2.VIBRATION);
            } else if (a72 == a72.c) {
                arrayList.add(kl2.LED);
            }
        }
        return arrayList;
    }

    public static ArrayList p(List list, bjd bjd) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            puc puc = (puc) it.next();
            int y = tr1.y(puc.a);
            long j = puc.b;
            if (y == 1) {
                arrayList.add(new vpe(puc.c, j));
            } else if (y != 2) {
                Locale locale = Locale.ENGLISH;
                z68.f("qe8", "Unknown RecentItem " + puc, (Throwable) null);
            } else {
                arrayList.add(new rr6(w(puc.d, bjd).b, j));
            }
        }
        return arrayList;
    }

    public static qe9 q(re9 re9) {
        if (re9 == null) {
            return qe9.ACTIVE;
        }
        int ordinal = re9.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? qe9.ACTIVE : qe9.DELAYED_FIRE_ERROR : qe9.DELETED : qe9.EDITED : qe9.ACTIVE;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [h20, java.lang.Object] */
    public static boe r(coe coe) {
        ? obj = new Object();
        obj.a = coe.a;
        obj.b = coe.b;
        obj.c = coe.c;
        obj.d = coe.d;
        obj.e = coe.e;
        obj.f = coe.f;
        obj.g = coe.g;
        obj.h = coe.h;
        obj.n = coe.i;
        int y = tr1.y(coe.j);
        int i = 3;
        obj.i = y != 1 ? y != 2 ? y != 3 ? 1 : 4 : 3 : 2;
        obj.k = coe.k;
        obj.o = coe.l;
        obj.l = coe.m;
        int y2 = tr1.y(coe.n);
        if (y2 == 1) {
            i = 2;
        } else if (y2 != 2) {
            i = 1;
        }
        obj.m = i;
        return obj.b();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e20, java.lang.Object] */
    public static f20 s(boe boe) {
        ? obj = new Object();
        obj.a = boe.a;
        obj.d = boe.o;
        obj.b = boe.b;
        obj.c = boe.c;
        obj.f = boe.w;
        obj.g = boe.x;
        obj.i = boe.z;
        obj.h = boe.y;
        obj.e = boe.v;
        int y = tr1.y(boe.X);
        int i = 3;
        obj.j = y != 1 ? y != 2 ? y != 3 ? 1 : 4 : 3 : 2;
        obj.k = boe.Z;
        obj.l = boe.v0;
        obj.m = boe.w0;
        int y2 = tr1.y(boe.y0);
        if (y2 == 1) {
            i = 2;
        } else if (y2 != 2) {
            i = 1;
        }
        obj.n = i;
        return obj.a();
    }

    public static fo3 t(vk3 vk3) {
        os3 os3;
        int i;
        os3 os32;
        long r = vk3.r();
        vm3 vm3 = vk3.a;
        long j = vm3.c.g;
        String d = vk3.d();
        String str = vm3.c.d;
        um3 um3 = vm3.c;
        List<pm3> list = um3.f;
        ArrayList arrayList = new ArrayList();
        for (pm3 pm3 : list) {
            String str2 = pm3.a;
            int ordinal = pm3.c.ordinal();
            dr3 dr3 = dr3.c;
            dr3 dr32 = ordinal != 0 ? ordinal != 2 ? ordinal != 3 ? null : dr3 : dr3.b : dr3.a;
            if (dr32 == null) {
                dr32 = dr3;
            }
            arrayList.add(new er3(str2, dr32, pm3.b));
        }
        long j2 = um3.e;
        sm3 sm3 = vm3.c.i;
        int i2 = 1;
        if (sm3 == null) {
            os3 = null;
        } else {
            int ordinal2 = sm3.ordinal();
            if (ordinal2 == 0) {
                os32 = os3.BLOCKED;
            } else if (ordinal2 == 1) {
                os32 = os3.REMOVED;
            } else {
                throw new IllegalArgumentException("No such value for " + sm3 + " in ContactStatus");
            }
            os3 = os32;
        }
        int i3 = vm3.c.l;
        int y = tr1.y(i3);
        if (y == 0) {
            i = 1;
        } else if (y == 1) {
            i = 2;
        } else if (y == 2) {
            i = 3;
        } else {
            throw new IllegalArgumentException("No such value for " + g63.r(i3) + " in ContactInfo.Gender");
        }
        List<rm3> list2 = um3.n;
        ArrayList arrayList2 = new ArrayList();
        for (rm3 ordinal3 : list2) {
            int ordinal4 = ordinal3.ordinal();
            if (ordinal4 == 0) {
                arrayList2.add(eo3.OFFICIAL);
            } else if (ordinal4 == i2) {
                arrayList2.add(eo3.BOT);
            } else if (ordinal4 == 2) {
                arrayList2.add(eo3.SERVICE_ACCOUNT);
            } else if (ordinal4 == 3) {
                arrayList2.add(eo3.HAS_WEBAPP);
            }
            i2 = 1;
        }
        String str3 = um3.o;
        qm3 qm3 = um3.u;
        return new fo3(r, j, d, str, arrayList, j2, um3.h, os3, i, arrayList2, str3, um3.p, um3.q, qm3 == null ? null : new ak3(qm3.a), um3.v);
    }

    public static ArrayList u(List list) {
        sa9 sa9;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ra9 ra9 = (ra9) it.next();
            if (ra9 != null) {
                switch (ra9.c.ordinal()) {
                    case 1:
                        sa9 = sa9.a;
                        break;
                    case 2:
                        sa9 = sa9.b;
                        break;
                    case 3:
                        sa9 = sa9.c;
                        break;
                    case 4:
                        sa9 = sa9.o;
                        break;
                    case 5:
                        sa9 = sa9.v;
                        break;
                    case 6:
                        sa9 = sa9.w;
                        break;
                    case 7:
                        sa9 = sa9.x;
                        break;
                    case 8:
                        sa9 = sa9.z;
                        break;
                    case 9:
                        sa9 = sa9.X;
                        break;
                    case 10:
                        sa9 = sa9.y;
                        break;
                    case 11:
                        sa9 = sa9.Y;
                        break;
                }
                sa9 sa92 = sa9;
                Map map = ra9.w;
                arrayList.add(new ta9(ra9.a, ra9.b, sa92, ra9.o, ra9.v, map == null ? null : new HashMap(map)));
            }
        }
        return arrayList;
    }

    public static ArrayList v(List list) {
        va9 va9;
        HashMap hashMap;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ta9 ta9 = (ta9) it.next();
            switch (ta9.c.ordinal()) {
                case 0:
                    va9 = va9.b;
                    break;
                case 1:
                    va9 = va9.c;
                    break;
                case 2:
                    va9 = va9.o;
                    break;
                case 3:
                    va9 = va9.v;
                    break;
                case 4:
                    va9 = va9.w;
                    break;
                case 5:
                    va9 = va9.x;
                    break;
                case 6:
                    va9 = va9.y;
                    break;
                case 7:
                    va9 = va9.Y;
                    break;
                case 8:
                    va9 = va9.z;
                    break;
                case 9:
                    va9 = va9.X;
                    break;
                case 10:
                    va9 = va9.Z;
                    break;
            }
            va9 va92 = va9;
            short s = (short) ta9.d;
            short s2 = (short) ta9.e;
            Map map = ta9.f;
            if (map == null || map.size() == 0) {
                hashMap = Collections.emptyMap();
            } else {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue() instanceof Serializable) {
                        hashMap2.put((String) entry.getKey(), (Serializable) entry.getValue());
                    } else {
                        throw new IllegalStateException("attribute must be Serializable");
                    }
                }
                hashMap = hashMap2;
            }
            arrayList.add(new ra9(ta9.a, ta9.b, va92, s, s2, hashMap));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [w10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [j10, java.lang.Object] */
    public static l20 w(web web, bjd bjd) {
        x10 x10 = x10.Z;
        ? obj = new Object();
        String str = web.o;
        if (str != null) {
            obj.a = str;
        }
        String str2 = web.v;
        if (str2 != null) {
            obj.b = str2;
        }
        Integer num = web.w;
        if (num != null) {
            obj.c = num.intValue();
        }
        Integer num2 = web.x;
        if (num2 != null) {
            obj.d = num2.intValue();
        }
        obj.e = web.y;
        byte[] bArr = web.z;
        if (bArr != null && bArr.length > 0) {
            try {
                bjd.getClass();
                obj.f = bArr;
            } catch (Throwable unused) {
                obj.f = bArr;
            }
        }
        Long l = web.Z;
        if (l != null) {
            obj.h = l.longValue();
        }
        String str3 = web.Y;
        if (str3 != null) {
            obj.i = str3;
        }
        String str4 = web.X;
        if (str4 != null) {
            obj.g = str4;
        }
        obj.k = web.v0;
        x10 a2 = obj.a();
        int i = l20.z;
        ? obj2 = new Object();
        obj2.l = UUID.randomUUID().toString();
        obj2.a = g20.c;
        obj2.n = web.b;
        obj2.y = web.c;
        obj2.b = a2;
        return obj2.a();
    }

    public static web x(x10 x10) {
        if (x10 == null) {
            return null;
        }
        String str = !cvg.A(x10.a) ? x10.a : null;
        String str2 = x10.b;
        String str3 = !cvg.A(str2) ? str2 : null;
        int i = x10.c;
        Integer valueOf = i > 0 ? Integer.valueOf(i) : null;
        int i2 = x10.o;
        Integer valueOf2 = i2 > 0 ? Integer.valueOf(i2) : null;
        byte[] bArr = x10.w;
        byte[] bArr2 = (bArr == null || bArr.length <= 0) ? null : bArr;
        String str4 = x10.z;
        String str5 = !cvg.A(str4) ? str4 : null;
        String str6 = x10.x;
        String str7 = !cvg.A(str6) ? str6 : null;
        String str8 = x10.Y;
        return new web(str, str3, valueOf, valueOf2, x10.v, bArr2, Long.valueOf(x10.y), str5, str7, false, false, !cvg.A(str8) ? str8 : null);
    }
}
