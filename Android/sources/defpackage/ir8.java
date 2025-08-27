package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: ir8  reason: default package */
public final class ir8 {
    public static final ir8 g;
    public static final String h = Integer.toString(0, 36);
    public static final String i = Integer.toString(1, 36);
    public static final String j = Integer.toString(2, 36);
    public static final String k = Integer.toString(3, 36);
    public static final String l = Integer.toString(4, 36);
    public static final String m = Integer.toString(5, 36);
    public final String a;
    public final xq8 b;
    public final wq8 c;
    public final us8 d;
    public final sq8 e;
    public final ar8 f;

    static {
        oq8 oq8 = new oq8();
        gc4 gc4 = new gc4();
        Collections.emptyList();
        k0d k0d = k0d.v;
        uq8 uq8 = new uq8();
        ar8 ar8 = ar8.d;
        n79.n(((Uri) gc4.e) == null || ((UUID) gc4.d) != null);
        g = new ir8("", oq8.c(), (xq8) null, uq8.a(), us8.J, ar8);
    }

    public ir8(String str, sq8 sq8, xq8 xq8, wq8 wq8, us8 us8, ar8 ar8) {
        this.a = str;
        this.b = xq8;
        this.c = wq8;
        this.d = us8;
        this.e = sq8;
        this.f = ar8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: qq8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: sq8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: qq8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: sq8} */
    /* JADX WARNING: type inference failed for: r2v2, types: [jk3, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ir8 b(android.os.Bundle r27) {
        /*
            r0 = r27
            java.lang.String r1 = h
            java.lang.String r2 = ""
            java.lang.String r4 = r0.getString(r1, r2)
            r4.getClass()
            java.lang.String r1 = i
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 != 0) goto L_0x0019
            wq8 r1 = defpackage.wq8.f
        L_0x0017:
            r7 = r1
            goto L_0x001e
        L_0x0019:
            wq8 r1 = defpackage.wq8.b(r1)
            goto L_0x0017
        L_0x001e:
            java.lang.String r1 = j
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 != 0) goto L_0x002a
            us8 r1 = defpackage.us8.J
        L_0x0028:
            r8 = r1
            goto L_0x002f
        L_0x002a:
            us8 r1 = defpackage.us8.b(r1)
            goto L_0x0028
        L_0x002f:
            java.lang.String r1 = k
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 != 0) goto L_0x003b
            sq8 r1 = defpackage.sq8.p
        L_0x0039:
            r5 = r1
            goto L_0x009e
        L_0x003b:
            oq8 r2 = new oq8
            r2.<init>()
            qq8 r3 = defpackage.qq8.h
            long r5 = r3.a
            java.lang.String r9 = defpackage.qq8.i
            long r5 = r1.getLong(r9, r5)
            r2.e(r5)
            java.lang.String r5 = defpackage.qq8.j
            long r9 = r3.c
            long r5 = r1.getLong(r5, r9)
            long r5 = defpackage.v0g.S(r5)
            r2.d(r5)
            java.lang.String r5 = defpackage.qq8.k
            boolean r6 = r3.e
            boolean r5 = r1.getBoolean(r5, r6)
            r2.c = r5
            java.lang.String r5 = defpackage.qq8.l
            boolean r6 = r3.f
            boolean r5 = r1.getBoolean(r5, r6)
            r2.d = r5
            java.lang.String r5 = defpackage.qq8.m
            boolean r6 = r3.g
            boolean r5 = r1.getBoolean(r5, r6)
            r2.e = r5
            java.lang.String r5 = defpackage.qq8.n
            long r9 = r3.b
            long r5 = r1.getLong(r5, r9)
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0089
            r2.f(r5)
        L_0x0089:
            java.lang.String r5 = defpackage.qq8.o
            long r9 = r3.d
            long r5 = r1.getLong(r5, r9)
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0098
            r2.d(r5)
        L_0x0098:
            sq8 r1 = new sq8
            r1.<init>(r2)
            goto L_0x0039
        L_0x009e:
            java.lang.String r1 = l
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 != 0) goto L_0x00aa
            ar8 r1 = defpackage.ar8.d
        L_0x00a8:
            r9 = r1
            goto L_0x00cf
        L_0x00aa:
            jk3 r2 = new jk3
            r2.<init>()
            java.lang.String r3 = defpackage.ar8.e
            android.os.Parcelable r3 = r1.getParcelable(r3)
            android.net.Uri r3 = (android.net.Uri) r3
            r2.a = r3
            java.lang.String r3 = defpackage.ar8.f
            java.lang.String r3 = r1.getString(r3)
            r2.b = r3
            java.lang.String r3 = defpackage.ar8.g
            android.os.Bundle r1 = r1.getBundle(r3)
            r2.c = r1
            ar8 r1 = new ar8
            r1.<init>(r2)
            goto L_0x00a8
        L_0x00cf:
            java.lang.String r1 = m
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 != 0) goto L_0x00da
            r6 = 0
            goto L_0x0242
        L_0x00da:
            java.lang.String r2 = defpackage.xq8.l
            android.os.Bundle r2 = r0.getBundle(r2)
            r3 = 0
            if (r2 != 0) goto L_0x00e7
            r19 = 0
            goto L_0x018e
        L_0x00e7:
            java.lang.String r6 = defpackage.tq8.i
            java.lang.String r6 = r2.getString(r6)
            r6.getClass()
            java.util.UUID r6 = java.util.UUID.fromString(r6)
            java.lang.String r10 = defpackage.tq8.j
            android.os.Parcelable r10 = r2.getParcelable(r10)
            android.net.Uri r10 = (android.net.Uri) r10
            android.os.Bundle r11 = android.os.Bundle.EMPTY
            java.lang.String r12 = defpackage.tq8.k
            android.os.Bundle r12 = r2.getBundle(r12)
            if (r12 == 0) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r12 = r11
        L_0x0108:
            if (r12 != r11) goto L_0x010d
            p0d r11 = defpackage.p0d.y
            goto L_0x0137
        L_0x010d:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            if (r12 != r11) goto L_0x0115
            goto L_0x0133
        L_0x0115:
            java.util.Set r11 = r12.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x011d:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x0133
            java.lang.Object r14 = r11.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = r12.getString(r14)
            if (r15 == 0) goto L_0x011d
            r13.put(r14, r15)
            goto L_0x011d
        L_0x0133:
            wb7 r11 = defpackage.wb7.b(r13)
        L_0x0137:
            java.lang.String r12 = defpackage.tq8.l
            boolean r12 = r2.getBoolean(r12, r3)
            java.lang.String r13 = defpackage.tq8.m
            boolean r13 = r2.getBoolean(r13, r3)
            java.lang.String r14 = defpackage.tq8.n
            boolean r14 = r2.getBoolean(r14, r3)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.String r1 = defpackage.tq8.o
            java.util.ArrayList r1 = r2.getIntegerArrayList(r1)
            if (r1 == 0) goto L_0x0157
            r15 = r1
        L_0x0157:
            tb7 r1 = defpackage.tb7.p(r15)
            java.lang.String r15 = defpackage.tq8.p
            byte[] r2 = r2.getByteArray(r15)
            gc4 r15 = new gc4
            r15.<init>()
            r15.d = r6
            r15.e = r10
            wb7 r6 = defpackage.wb7.b(r11)
            r15.f = r6
            r15.a = r12
            r15.c = r14
            r15.b = r13
            tb7 r1 = defpackage.tb7.p(r1)
            r15.g = r1
            if (r2 == 0) goto L_0x0184
            int r1 = r2.length
            byte[] r1 = java.util.Arrays.copyOf(r2, r1)
            goto L_0x0185
        L_0x0184:
            r1 = 0
        L_0x0185:
            r15.h = r1
            tq8 r1 = new tq8
            r1.<init>(r15)
            r19 = r1
        L_0x018e:
            java.lang.String r1 = defpackage.xq8.m
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 != 0) goto L_0x0199
            r20 = 0
            goto L_0x01b4
        L_0x0199:
            java.lang.String r2 = defpackage.mq8.b
            android.os.Parcelable r1 = r1.getParcelable(r2)
            android.net.Uri r1 = (android.net.Uri) r1
            r1.getClass()
            u6h r2 = new u6h
            r6 = 22
            r2.<init>((int) r6)
            r2.b = r1
            mq8 r1 = new mq8
            r1.<init>(r2)
            r20 = r1
        L_0x01b4:
            java.lang.String r1 = defpackage.xq8.n
            java.util.ArrayList r1 = r0.getParcelableArrayList(r1)
            if (r1 != 0) goto L_0x01c3
            lx5 r1 = defpackage.tb7.b
            k0d r1 = defpackage.k0d.v
        L_0x01c0:
            r21 = r1
            goto L_0x01f9
        L_0x01c3:
            qb7 r2 = defpackage.tb7.o()
            r6 = r3
        L_0x01c8:
            int r10 = r1.size()
            if (r6 >= r10) goto L_0x01f4
            java.lang.Object r10 = r1.get(r6)
            android.os.Bundle r10 = (android.os.Bundle) r10
            r10.getClass()
            fxe r11 = new fxe
            java.lang.String r12 = defpackage.fxe.o
            int r12 = r10.getInt(r12, r3)
            java.lang.String r13 = defpackage.fxe.v
            int r13 = r10.getInt(r13, r3)
            java.lang.String r14 = defpackage.fxe.w
            int r10 = r10.getInt(r14, r3)
            r11.<init>(r12, r13, r10)
            r2.a(r11)
            int r6 = r6 + 1
            goto L_0x01c8
        L_0x01f4:
            k0d r1 = r2.j()
            goto L_0x01c0
        L_0x01f9:
            java.lang.String r1 = defpackage.xq8.p
            java.util.ArrayList r1 = r0.getParcelableArrayList(r1)
            if (r1 != 0) goto L_0x0208
            lx5 r1 = defpackage.tb7.b
            k0d r1 = defpackage.k0d.v
        L_0x0205:
            r23 = r1
            goto L_0x0214
        L_0x0208:
            zc8 r2 = new zc8
            r3 = 28
            r2.<init>(r3)
            k0d r1 = defpackage.ev0.m(r2, r1)
            goto L_0x0205
        L_0x0214:
            java.lang.String r1 = defpackage.xq8.q
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r25 = r0.getLong(r1, r2)
            xq8 r1 = new xq8
            java.lang.String r2 = defpackage.xq8.j
            android.os.Parcelable r2 = r0.getParcelable(r2)
            r17 = r2
            android.net.Uri r17 = (android.net.Uri) r17
            r17.getClass()
            java.lang.String r2 = defpackage.xq8.k
            java.lang.String r18 = r0.getString(r2)
            java.lang.String r2 = defpackage.xq8.o
            java.lang.String r22 = r0.getString(r2)
            r24 = 0
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r6 = r1
        L_0x0242:
            ir8 r0 = new ir8
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir8.b(android.os.Bundle):ir8");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: qq8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: sq8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ir8 c(android.net.Uri r21) {
        /*
            oq8 r0 = new oq8
            r0.<init>()
            gc4 r1 = new gc4
            r1.<init>()
            java.util.List r7 = java.util.Collections.emptyList()
            k0d r9 = defpackage.k0d.v
            uq8 r13 = new uq8
            r13.<init>()
            ar8 r20 = defpackage.ar8.d
            java.lang.Object r2 = r1.e
            android.net.Uri r2 = (android.net.Uri) r2
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r1.d
            java.util.UUID r2 = (java.util.UUID) r2
            if (r2 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r2 = 0
            goto L_0x0027
        L_0x0026:
            r2 = 1
        L_0x0027:
            defpackage.n79.n(r2)
            r2 = 0
            if (r21 == 0) goto L_0x004d
            xq8 r14 = new xq8
            java.lang.Object r3 = r1.d
            java.util.UUID r3 = (java.util.UUID) r3
            if (r3 == 0) goto L_0x003a
            tq8 r2 = new tq8
            r2.<init>(r1)
        L_0x003a:
            r5 = r2
            r10 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            r6 = 0
            r8 = 0
            r2 = r14
            r3 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r17 = r14
            goto L_0x004f
        L_0x004d:
            r17 = r2
        L_0x004f:
            ir8 r1 = new ir8
            sq8 r2 = new sq8
            r2.<init>(r0)
            wq8 r0 = new wq8
            r0.<init>(r13)
            us8 r19 = defpackage.us8.J
            java.lang.String r15 = ""
            r14 = r1
            r16 = r2
            r18 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir8.c(android.net.Uri):ir8");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [nq8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [gc4, java.lang.Object] */
    public final nq8 a() {
        gc4 gc4;
        ? obj = new Object();
        obj.d = new oq8();
        obj.e = new gc4();
        obj.f = Collections.emptyList();
        obj.h = k0d.v;
        obj.m = new uq8();
        obj.n = ar8.d;
        obj.k = -9223372036854775807L;
        obj.d = this.e.a();
        obj.a = this.a;
        obj.l = this.d;
        obj.m = this.c.a();
        obj.n = this.f;
        xq8 xq8 = this.b;
        if (xq8 != null) {
            obj.g = xq8.f;
            obj.c = xq8.b;
            obj.b = xq8.a;
            obj.f = xq8.e;
            obj.h = xq8.g;
            obj.j = xq8.h;
            tq8 tq8 = xq8.c;
            if (tq8 != null) {
                ? obj2 = new Object();
                obj2.d = tq8.a;
                obj2.e = tq8.b;
                obj2.f = tq8.c;
                obj2.a = tq8.d;
                obj2.b = tq8.e;
                obj2.c = tq8.f;
                obj2.g = tq8.g;
                obj2.h = tq8.h;
                gc4 = obj2;
            } else {
                gc4 = new gc4();
            }
            obj.e = gc4;
            obj.i = xq8.d;
            obj.k = xq8.i;
        }
        return obj;
    }

    public final Bundle d(boolean z) {
        xq8 xq8;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        wq8 wq8 = wq8.f;
        wq8 wq82 = this.c;
        if (!wq82.equals(wq8)) {
            bundle.putBundle(i, wq82.c());
        }
        us8 us8 = us8.J;
        us8 us82 = this.d;
        if (!us82.equals(us8)) {
            bundle.putBundle(j, us82.c());
        }
        qq8 qq8 = qq8.h;
        sq8 sq8 = this.e;
        if (!sq8.equals(qq8)) {
            Bundle bundle2 = new Bundle();
            long j2 = qq8.a;
            long j3 = sq8.a;
            if (j3 != j2) {
                bundle2.putLong(qq8.i, j3);
            }
            long j4 = qq8.c;
            long j5 = sq8.c;
            if (j5 != j4) {
                bundle2.putLong(qq8.j, j5);
            }
            long j6 = qq8.b;
            long j7 = sq8.b;
            if (j7 != j6) {
                bundle2.putLong(qq8.n, j7);
            }
            long j8 = qq8.d;
            long j9 = sq8.d;
            if (j9 != j8) {
                bundle2.putLong(qq8.o, j9);
            }
            boolean z2 = qq8.e;
            boolean z3 = sq8.e;
            if (z3 != z2) {
                bundle2.putBoolean(qq8.k, z3);
            }
            boolean z4 = qq8.f;
            boolean z5 = sq8.f;
            if (z5 != z4) {
                bundle2.putBoolean(qq8.l, z5);
            }
            boolean z6 = qq8.g;
            boolean z7 = sq8.g;
            if (z7 != z6) {
                bundle2.putBoolean(qq8.m, z7);
            }
            bundle.putBundle(k, bundle2);
        }
        ar8 ar8 = ar8.d;
        ar8 ar82 = this.f;
        if (!ar82.equals(ar8)) {
            Bundle bundle3 = new Bundle();
            Uri uri = ar82.a;
            if (uri != null) {
                bundle3.putParcelable(ar8.e, uri);
            }
            String str2 = ar82.b;
            if (str2 != null) {
                bundle3.putString(ar8.f, str2);
            }
            Bundle bundle4 = ar82.c;
            if (bundle4 != null) {
                bundle3.putBundle(ar8.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (xq8 = this.b) != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(xq8.j, xq8.a);
            String str3 = xq8.b;
            if (str3 != null) {
                bundle5.putString(xq8.k, str3);
            }
            tq8 tq8 = xq8.c;
            if (tq8 != null) {
                Bundle bundle6 = new Bundle();
                bundle6.putString(tq8.i, tq8.a.toString());
                Uri uri2 = tq8.b;
                if (uri2 != null) {
                    bundle6.putParcelable(tq8.j, uri2);
                }
                wb7 wb7 = tq8.c;
                if (!wb7.isEmpty()) {
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : wb7.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(tq8.k, bundle7);
                }
                boolean z8 = tq8.d;
                if (z8) {
                    bundle6.putBoolean(tq8.l, z8);
                }
                boolean z9 = tq8.e;
                if (z9) {
                    bundle6.putBoolean(tq8.m, z9);
                }
                boolean z10 = tq8.f;
                if (z10) {
                    bundle6.putBoolean(tq8.n, z10);
                }
                tb7 tb7 = tq8.g;
                if (!tb7.isEmpty()) {
                    bundle6.putIntegerArrayList(tq8.o, new ArrayList(tb7));
                }
                byte[] bArr = tq8.h;
                if (bArr != null) {
                    bundle6.putByteArray(tq8.p, bArr);
                }
                bundle5.putBundle(xq8.l, bundle6);
            }
            mq8 mq8 = xq8.d;
            if (mq8 != null) {
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(mq8.b, mq8.a);
                bundle5.putBundle(xq8.m, bundle8);
            }
            List list = xq8.e;
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(xq8.n, ev0.G(list, new zc8(26)));
            }
            String str4 = xq8.f;
            if (str4 != null) {
                bundle5.putString(xq8.o, str4);
            }
            tb7 tb72 = xq8.g;
            if (!tb72.isEmpty()) {
                bundle5.putParcelableArrayList(xq8.p, ev0.G(tb72, new zc8(27)));
            }
            long j10 = xq8.i;
            if (j10 != -9223372036854775807L) {
                bundle5.putLong(xq8.q, j10);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir8)) {
            return false;
        }
        ir8 ir8 = (ir8) obj;
        return v0g.a(this.a, ir8.a) && this.e.equals(ir8.e) && v0g.a(this.b, ir8.b) && v0g.a(this.c, ir8.c) && v0g.a(this.d, ir8.d) && v0g.a(this.f, ir8.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xq8 xq8 = this.b;
        int hashCode2 = xq8 != null ? xq8.hashCode() : 0;
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.e.hashCode();
        return this.f.hashCode() + ((this.d.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31);
    }
}
