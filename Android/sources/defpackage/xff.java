package defpackage;

import android.content.Context;
import org.apache.http.util.LangUtils;

/* renamed from: xff  reason: default package */
public final /* synthetic */ class xff implements zi6, iv0, yi6, k08, fc3, yf5, zf5, qk3 {
    public static final xff b = new xff(17);
    public static final xff c = new xff(18);
    public static final xff o = new xff(19);
    public static final xff v = new xff(20);
    public static final xff w = new xff(21);
    public final /* synthetic */ int a;

    public /* synthetic */ xff(int i) {
        this.a = i;
    }

    public void a(xrf xrf, yrf yrf, boolean z) {
        switch (this.a) {
            case LangUtils.HASH_SEED:
                xrf.d(yrf);
                return;
            case 18:
                xrf.e(yrf);
                return;
            case 19:
                xrf.g(yrf);
                return;
            case 20:
                xrf.b();
                return;
            default:
                xrf.f();
                return;
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 27:
                z68.f("jxf", "clear: failed to clear uploads repository", (Throwable) obj);
                return;
            case 28:
                z68.c("jxf", "getUploadFromRepository: found upload in cache, upload=%s", (bxf) obj);
                return;
            default:
                z68.f("jxf", "getUploadFromRepository: failed to get upload from cache", (Throwable) obj);
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x038a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r51) {
        /*
            r50 = this;
            r1 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = r50
            int r6 = r6.a
            switch(r6) {
                case 0: goto L_0x045a;
                case 2: goto L_0x03d2;
                case 3: goto L_0x02b3;
                case 7: goto L_0x00a1;
                case 9: goto L_0x0096;
                case 12: goto L_0x0073;
                case 13: goto L_0x0046;
                default: goto L_0x000f;
            }
        L_0x000f:
            r0 = r51
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r1 = defpackage.pqf.f
            android.os.Bundle r1 = r0.getBundle(r1)
            r1.getClass()
            spf r1 = defpackage.spf.b(r1)
            java.lang.String r2 = defpackage.pqf.g
            int[] r2 = r0.getIntArray(r2)
            int r3 = r1.a
            int[] r4 = new int[r3]
            if (r2 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r2 = r4
        L_0x002e:
            java.lang.String r4 = defpackage.pqf.h
            boolean[] r4 = r0.getBooleanArray(r4)
            boolean[] r3 = new boolean[r3]
            if (r4 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r4 = r3
        L_0x003a:
            java.lang.String r3 = defpackage.pqf.i
            boolean r0 = r0.getBoolean(r3, r5)
            pqf r3 = new pqf
            r3.<init>(r1, r0, r2, r4)
            return r3
        L_0x0046:
            r0 = r51
            pqf r0 = (defpackage.pqf) r0
            r0.getClass()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            spf r2 = r0.b
            android.os.Bundle r2 = r2.f()
            java.lang.String r3 = defpackage.pqf.f
            r1.putBundle(r3, r2)
            java.lang.String r2 = defpackage.pqf.g
            int[] r3 = r0.d
            r1.putIntArray(r2, r3)
            java.lang.String r2 = defpackage.pqf.h
            boolean[] r3 = r0.e
            r1.putBooleanArray(r2, r3)
            java.lang.String r2 = defpackage.pqf.i
            boolean r0 = r0.c
            r1.putBoolean(r2, r0)
            return r1
        L_0x0073:
            r0 = r51
            dqf r0 = (defpackage.dqf) r0
            r0.getClass()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            spf r2 = r0.a
            android.os.Bundle r2 = r2.f()
            java.lang.String r3 = defpackage.dqf.c
            r1.putBundle(r3, r2)
            tb7 r0 = r0.b
            int[] r0 = defpackage.cvg.L(r0)
            java.lang.String r2 = defpackage.dqf.d
            r1.putIntArray(r2, r0)
            return r1
        L_0x0096:
            r0 = r51
            spf r0 = (defpackage.spf) r0
            int r0 = r0.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x00a1:
            r6 = r51
            android.os.Bundle r6 = (android.os.Bundle) r6
            ea6 r0 = defpackage.ea6.M
            ba6 r7 = new ba6
            r7.<init>()
            if (r6 == 0) goto L_0x00b9
            java.lang.Class<ev0> r0 = defpackage.ev0.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            int r1 = defpackage.v0g.a
            r6.setClassLoader(r0)
        L_0x00b9:
            java.lang.String r0 = defpackage.ea6.N
            java.lang.String r0 = r6.getString(r0)
            ea6 r8 = defpackage.ea6.M
            java.lang.String r1 = r8.a
            if (r0 == 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r0 = r1
        L_0x00c7:
            r7.a = r0
            java.lang.String r0 = defpackage.ea6.O
            java.lang.String r0 = r6.getString(r0)
            if (r0 == 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            java.lang.String r0 = r8.b
        L_0x00d4:
            r7.b = r0
            java.lang.String r0 = defpackage.ea6.t0
            java.util.ArrayList r0 = r6.getParcelableArrayList(r0)
            if (r0 != 0) goto L_0x00e1
            k0d r0 = defpackage.k0d.v
            goto L_0x0113
        L_0x00e1:
            qb7 r1 = defpackage.tb7.o()
            r2 = r5
        L_0x00e6:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x010f
            java.lang.Object r3 = r0.get(r2)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r3.getClass()
            lr7 r4 = new lr7
            java.lang.String r9 = defpackage.lr7.c
            java.lang.String r9 = r3.getString(r9)
            java.lang.String r10 = defpackage.lr7.d
            java.lang.String r3 = r3.getString(r10)
            r3.getClass()
            r4.<init>(r9, r3)
            r1.a(r4)
            int r2 = r2 + 1
            goto L_0x00e6
        L_0x010f:
            k0d r0 = r1.j()
        L_0x0113:
            tb7 r0 = defpackage.tb7.p(r0)
            r7.c = r0
            java.lang.String r0 = defpackage.ea6.P
            java.lang.String r0 = r6.getString(r0)
            if (r0 == 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            java.lang.String r0 = r8.d
        L_0x0124:
            r7.d = r0
            java.lang.String r0 = defpackage.ea6.Q
            int r1 = r8.e
            int r0 = r6.getInt(r0, r1)
            r7.e = r0
            java.lang.String r0 = defpackage.ea6.R
            int r1 = r8.f
            int r0 = r6.getInt(r0, r1)
            r7.f = r0
            java.lang.String r0 = defpackage.ea6.S
            int r1 = r8.g
            int r0 = r6.getInt(r0, r1)
            r7.g = r0
            java.lang.String r0 = defpackage.ea6.T
            int r1 = r8.h
            int r0 = r6.getInt(r0, r1)
            r7.h = r0
            java.lang.String r0 = defpackage.ea6.U
            java.lang.String r0 = r6.getString(r0)
            if (r0 == 0) goto L_0x0157
            goto L_0x0159
        L_0x0157:
            java.lang.String r0 = r8.j
        L_0x0159:
            r7.i = r0
            java.lang.String r0 = defpackage.ea6.V
            android.os.Parcelable r0 = r6.getParcelable(r0)
            sp9 r0 = (defpackage.sp9) r0
            if (r0 == 0) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            sp9 r0 = r8.k
        L_0x0168:
            r7.j = r0
            java.lang.String r0 = defpackage.ea6.W
            java.lang.String r0 = r6.getString(r0)
            if (r0 == 0) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            java.lang.String r0 = r8.m
        L_0x0175:
            java.lang.String r0 = defpackage.vq9.l(r0)
            r7.l = r0
            java.lang.String r0 = defpackage.ea6.X
            java.lang.String r0 = r6.getString(r0)
            if (r0 == 0) goto L_0x0184
            goto L_0x0186
        L_0x0184:
            java.lang.String r0 = r8.n
        L_0x0186:
            java.lang.String r0 = defpackage.vq9.l(r0)
            r7.m = r0
            java.lang.String r0 = defpackage.ea6.Y
            int r1 = r8.o
            int r0 = r6.getInt(r0, r1)
            r7.n = r0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x019b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = defpackage.ea6.Z
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            r1 = 36
            java.lang.String r1 = java.lang.Integer.toString(r5, r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r6.getByteArray(r0)
            if (r0 != 0) goto L_0x02ac
            r7.p = r9
            java.lang.String r0 = defpackage.ea6.a0
            android.os.Parcelable r0 = r6.getParcelable(r0)
            yv4 r0 = (defpackage.yv4) r0
            r7.q = r0
            java.lang.String r0 = defpackage.ea6.b0
            long r1 = r8.s
            long r0 = r6.getLong(r0, r1)
            r7.r = r0
            java.lang.String r0 = defpackage.ea6.c0
            int r1 = r8.t
            int r0 = r6.getInt(r0, r1)
            r7.s = r0
            java.lang.String r0 = defpackage.ea6.d0
            int r1 = r8.u
            int r0 = r6.getInt(r0, r1)
            r7.t = r0
            java.lang.String r0 = defpackage.ea6.e0
            float r1 = r8.v
            float r0 = r6.getFloat(r0, r1)
            r7.u = r0
            java.lang.String r0 = defpackage.ea6.f0
            int r1 = r8.w
            int r0 = r6.getInt(r0, r1)
            r7.v = r0
            java.lang.String r0 = defpackage.ea6.g0
            float r1 = r8.x
            float r0 = r6.getFloat(r0, r1)
            r7.w = r0
            java.lang.String r0 = defpackage.ea6.h0
            byte[] r0 = r6.getByteArray(r0)
            r7.x = r0
            java.lang.String r0 = defpackage.ea6.i0
            int r1 = r8.z
            int r0 = r6.getInt(r0, r1)
            r7.y = r0
            java.lang.String r0 = defpackage.ea6.j0
            android.os.Bundle r0 = r6.getBundle(r0)
            if (r0 == 0) goto L_0x024c
            m53 r1 = new m53
            java.lang.String r2 = defpackage.m53.j
            r3 = -1
            int r10 = r0.getInt(r2, r3)
            java.lang.String r2 = defpackage.m53.k
            int r11 = r0.getInt(r2, r3)
            java.lang.String r2 = defpackage.m53.l
            int r12 = r0.getInt(r2, r3)
            java.lang.String r2 = defpackage.m53.m
            byte[] r15 = r0.getByteArray(r2)
            java.lang.String r2 = defpackage.m53.n
            int r13 = r0.getInt(r2, r3)
            java.lang.String r2 = defpackage.m53.o
            int r14 = r0.getInt(r2, r3)
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r7.z = r1
        L_0x024c:
            java.lang.String r0 = defpackage.ea6.k0
            int r1 = r8.B
            int r0 = r6.getInt(r0, r1)
            r7.A = r0
            java.lang.String r0 = defpackage.ea6.l0
            int r1 = r8.C
            int r0 = r6.getInt(r0, r1)
            r7.B = r0
            java.lang.String r0 = defpackage.ea6.m0
            int r1 = r8.D
            int r0 = r6.getInt(r0, r1)
            r7.C = r0
            java.lang.String r0 = defpackage.ea6.n0
            int r1 = r8.E
            int r0 = r6.getInt(r0, r1)
            r7.D = r0
            java.lang.String r0 = defpackage.ea6.o0
            int r1 = r8.F
            int r0 = r6.getInt(r0, r1)
            r7.E = r0
            java.lang.String r0 = defpackage.ea6.p0
            int r1 = r8.G
            int r0 = r6.getInt(r0, r1)
            r7.F = r0
            java.lang.String r0 = defpackage.ea6.r0
            int r1 = r8.I
            int r0 = r6.getInt(r0, r1)
            r7.H = r0
            java.lang.String r0 = defpackage.ea6.s0
            int r1 = r8.J
            int r0 = r6.getInt(r0, r1)
            r7.I = r0
            java.lang.String r0 = defpackage.ea6.q0
            int r1 = r8.K
            int r0 = r6.getInt(r0, r1)
            r7.J = r0
            ea6 r0 = new ea6
            r0.<init>(r7)
            return r0
        L_0x02ac:
            r9.add(r0)
            int r5 = r5 + 1
            goto L_0x019b
        L_0x02b3:
            r6 = r51
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.String r7 = defpackage.ekf.h
            int r11 = r6.getInt(r7, r5)
            java.lang.String r7 = defpackage.ekf.i
            long r12 = r6.getLong(r7, r3)
            java.lang.String r7 = defpackage.ekf.j
            long r14 = r6.getLong(r7, r1)
            java.lang.String r7 = defpackage.ekf.k
            boolean r17 = r6.getBoolean(r7, r5)
            java.lang.String r7 = defpackage.ekf.l
            android.os.Bundle r6 = r6.getBundle(r7)
            if (r6 == 0) goto L_0x03c3
            java.lang.String r7 = defpackage.q9.i
            java.util.ArrayList r7 = r6.getParcelableArrayList(r7)
            if (r7 != 0) goto L_0x02e5
            o9[] r0 = new defpackage.o9[r5]
            r19 = r0
            goto L_0x03a0
        L_0x02e5:
            int r8 = r7.size()
            o9[] r8 = new defpackage.o9[r8]
            r9 = r5
        L_0x02ec:
            int r10 = r7.size()
            if (r9 >= r10) goto L_0x039e
            java.lang.Object r10 = r7.get(r9)
            android.os.Bundle r10 = (android.os.Bundle) r10
            java.lang.String r0 = defpackage.o9.j
            long r19 = r10.getLong(r0)
            java.lang.String r0 = defpackage.o9.k
            int r21 = r10.getInt(r0)
            java.lang.String r0 = defpackage.o9.q
            int r22 = r10.getInt(r0)
            java.lang.String r0 = defpackage.o9.l
            java.util.ArrayList r0 = r10.getParcelableArrayList(r0)
            java.lang.String r3 = defpackage.o9.r
            java.util.ArrayList r3 = r10.getParcelableArrayList(r3)
            java.lang.String r4 = defpackage.o9.m
            int[] r4 = r10.getIntArray(r4)
            java.lang.String r1 = defpackage.o9.n
            long[] r1 = r10.getLongArray(r1)
            java.lang.String r2 = defpackage.o9.o
            long r26 = r10.getLong(r2)
            java.lang.String r2 = defpackage.o9.p
            boolean r28 = r10.getBoolean(r2)
            o9 r2 = new o9
            if (r4 != 0) goto L_0x0334
            int[] r4 = new int[r5]
        L_0x0334:
            r23 = r4
            if (r3 == 0) goto L_0x035b
            int r0 = r3.size()
            ir8[] r0 = new defpackage.ir8[r0]
            r4 = r5
        L_0x033f:
            int r10 = r3.size()
            if (r4 >= r10) goto L_0x0358
            java.lang.Object r10 = r3.get(r4)
            android.os.Bundle r10 = (android.os.Bundle) r10
            if (r10 != 0) goto L_0x034f
            r10 = 0
            goto L_0x0353
        L_0x034f:
            ir8 r10 = defpackage.ir8.b(r10)
        L_0x0353:
            r0[r4] = r10
            int r4 = r4 + 1
            goto L_0x033f
        L_0x0358:
            r24 = r0
            goto L_0x0383
        L_0x035b:
            if (r0 == 0) goto L_0x0380
            int r3 = r0.size()
            ir8[] r3 = new defpackage.ir8[r3]
            r4 = r5
        L_0x0364:
            int r10 = r0.size()
            if (r4 >= r10) goto L_0x037d
            java.lang.Object r10 = r0.get(r4)
            android.net.Uri r10 = (android.net.Uri) r10
            if (r10 != 0) goto L_0x0374
            r10 = 0
            goto L_0x0378
        L_0x0374:
            ir8 r10 = defpackage.ir8.c(r10)
        L_0x0378:
            r3[r4] = r10
            int r4 = r4 + 1
            goto L_0x0364
        L_0x037d:
            r24 = r3
            goto L_0x0383
        L_0x0380:
            ir8[] r0 = new defpackage.ir8[r5]
            goto L_0x0358
        L_0x0383:
            if (r1 != 0) goto L_0x038a
            long[] r0 = new long[r5]
            r25 = r0
            goto L_0x038c
        L_0x038a:
            r25 = r1
        L_0x038c:
            r18 = r2
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r28)
            r8[r9] = r2
            int r9 = r9 + 1
            r1 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x02ec
        L_0x039e:
            r19 = r8
        L_0x03a0:
            java.lang.String r0 = defpackage.q9.j
            r1 = 0
            long r20 = r6.getLong(r0, r1)
            java.lang.String r0 = defpackage.q9.k
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r22 = r6.getLong(r0, r1)
            java.lang.String r0 = defpackage.q9.l
            int r24 = r6.getInt(r0, r5)
            q9 r0 = new q9
            r18 = r0
            r18.<init>(r19, r20, r22, r24)
        L_0x03c0:
            r16 = r0
            goto L_0x03c6
        L_0x03c3:
            q9 r0 = defpackage.q9.g
            goto L_0x03c0
        L_0x03c6:
            ekf r0 = new ekf
            r0.<init>()
            r9 = 0
            r10 = 0
            r8 = r0
            r8.j(r9, r10, r11, r12, r14, r16, r17)
            return r0
        L_0x03d2:
            r0 = r51
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r1 = defpackage.hkf.t
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 == 0) goto L_0x03e5
            ir8 r1 = defpackage.ir8.b(r1)
        L_0x03e2:
            r31 = r1
            goto L_0x03e8
        L_0x03e5:
            ir8 r1 = defpackage.ir8.g
            goto L_0x03e2
        L_0x03e8:
            java.lang.String r1 = defpackage.hkf.u
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r33 = r0.getLong(r1, r2)
            java.lang.String r1 = defpackage.hkf.v
            long r35 = r0.getLong(r1, r2)
            java.lang.String r1 = defpackage.hkf.w
            long r37 = r0.getLong(r1, r2)
            java.lang.String r1 = defpackage.hkf.x
            boolean r39 = r0.getBoolean(r1, r5)
            java.lang.String r1 = defpackage.hkf.y
            boolean r40 = r0.getBoolean(r1, r5)
            java.lang.String r1 = defpackage.hkf.z
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 == 0) goto L_0x041a
            wq8 r1 = defpackage.wq8.b(r1)
            r41 = r1
            goto L_0x041c
        L_0x041a:
            r41 = 0
        L_0x041c:
            java.lang.String r1 = defpackage.hkf.A
            boolean r1 = r0.getBoolean(r1, r5)
            java.lang.String r2 = defpackage.hkf.B
            r3 = 0
            long r42 = r0.getLong(r2, r3)
            java.lang.String r2 = defpackage.hkf.C
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r44 = r0.getLong(r2, r3)
            java.lang.String r2 = defpackage.hkf.D
            int r46 = r0.getInt(r2, r5)
            java.lang.String r2 = defpackage.hkf.E
            int r47 = r0.getInt(r2, r5)
            java.lang.String r2 = defpackage.hkf.F
            r3 = 0
            long r48 = r0.getLong(r2, r3)
            hkf r0 = new hkf
            r29 = r0
            r0.<init>()
            java.lang.Object r30 = defpackage.hkf.r
            r32 = 0
            r29.b(r30, r31, r32, r33, r35, r37, r39, r40, r41, r42, r44, r46, r47, r48)
            r0.k = r1
            return r0
        L_0x045a:
            r0 = r51
            yff r0 = (defpackage.yff) r0
            boolean r1 = r0.a
            if (r1 != 0) goto L_0x0465
            uh8 r0 = defpackage.uh8.a
            goto L_0x046b
        L_0x0465:
            java.lang.CharSequence r0 = r0.b
            ii8 r0 = defpackage.nh8.e(r0)
        L_0x046b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xff.apply(java.lang.Object):java.lang.Object");
    }

    public sf5[] c() {
        return new sf5[]{new mtf()};
    }

    public void f(Object obj, xq5 xq5) {
        c19 c19 = (c19) obj;
    }

    public Object g(soc soc) {
        switch (this.a) {
            case 22:
                return qsf.b((Context) soc.a(Context.class));
            case 23:
                return qsf.b((Context) soc.a(Context.class));
            default:
                return qsf.b((Context) soc.a(Context.class));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: rpf} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r26v2, types: [vq8] */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.jv0 h(android.os.Bundle r36) {
        /*
            r35 = this;
            r0 = r36
            r1 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = -1
            r6 = 0
            r7 = 4
            java.lang.String r8 = ""
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 36
            r13 = 0
            r14 = r35
            int r14 = r14.a
            switch(r14) {
                case 1: goto L_0x0262;
                case 2: goto L_0x001b;
                case 3: goto L_0x001b;
                case 4: goto L_0x021d;
                case 5: goto L_0x0151;
                case 6: goto L_0x0127;
                case 7: goto L_0x001b;
                case 8: goto L_0x0105;
                case 9: goto L_0x001b;
                case 10: goto L_0x00cb;
                case 11: goto L_0x007c;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.String r1 = java.lang.Integer.toString(r13, r12)
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 != 0) goto L_0x0026
            goto L_0x004d
        L_0x0026:
            ip5 r2 = defpackage.ca6.Q0
            java.lang.String r3 = java.lang.Integer.toString(r13, r12)
            java.util.ArrayList r3 = r1.getParcelableArrayList(r3)
            lx5 r4 = defpackage.tb7.b
            k0d r4 = defpackage.k0d.v
            java.util.List r2 = defpackage.kv0.u(r2, r3, r4)
            java.lang.String r3 = java.lang.Integer.toString(r11, r12)
            java.lang.String r1 = r1.getString(r3, r8)
            rpf r6 = new rpf
            ca6[] r3 = new defpackage.ca6[r13]
            java.lang.Object[] r2 = r2.toArray(r3)
            ca6[] r2 = (defpackage.ca6[]) r2
            r6.<init>(r1, r2)
        L_0x004d:
            r6.getClass()
            java.lang.String r1 = java.lang.Integer.toString(r11, r12)
            int[] r1 = r0.getIntArray(r1)
            int r2 = r6.a
            int[] r3 = new int[r2]
            if (r1 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = r3
        L_0x0060:
            java.lang.String r3 = java.lang.Integer.toString(r10, r12)
            int r3 = r0.getInt(r3, r5)
            java.lang.String r4 = java.lang.Integer.toString(r9, r12)
            boolean[] r0 = r0.getBooleanArray(r4)
            boolean[] r2 = new boolean[r2]
            if (r0 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r0 = r2
        L_0x0076:
            rqf r2 = new rqf
            r2.<init>(r6, r1, r3, r0)
            return r2
        L_0x007c:
            java.lang.String r1 = java.lang.Integer.toString(r13, r12)
            android.os.Bundle r1 = r0.getBundle(r1)
            r1.getClass()
            ip5 r2 = defpackage.ca6.Q0
            java.lang.String r3 = java.lang.Integer.toString(r13, r12)
            java.util.ArrayList r3 = r1.getParcelableArrayList(r3)
            lx5 r4 = defpackage.tb7.b
            k0d r4 = defpackage.k0d.v
            java.util.List r2 = defpackage.kv0.u(r2, r3, r4)
            java.lang.String r3 = java.lang.Integer.toString(r11, r12)
            java.lang.String r1 = r1.getString(r3, r8)
            rpf r3 = new rpf
            ca6[] r4 = new defpackage.ca6[r13]
            kb7 r2 = (defpackage.kb7) r2
            java.lang.Object[] r2 = r2.toArray(r4)
            ca6[] r2 = (defpackage.ca6[]) r2
            r3.<init>(r1, r2)
            java.lang.String r1 = java.lang.Integer.toString(r11, r12)
            int[] r0 = r0.getIntArray(r1)
            if (r0 != 0) goto L_0x00c0
            eqf r0 = new eqf
            r0.<init>(r3)
            goto L_0x00ca
        L_0x00c0:
            eqf r1 = new eqf
            java.util.List r0 = defpackage.cvg.d(r0)
            r1.<init>(r3, r0)
            r0 = r1
        L_0x00ca:
            return r0
        L_0x00cb:
            xff r1 = defpackage.eqf.c
            java.lang.String r2 = java.lang.Integer.toString(r13, r12)
            java.util.ArrayList r0 = r0.getParcelableArrayList(r2)
            lx5 r2 = defpackage.tb7.b
            k0d r2 = defpackage.k0d.v
            java.util.List r0 = defpackage.kv0.u(r1, r0, r2)
            cs r1 = new cs
            r1.<init>((int) r7)
        L_0x00e2:
            r2 = r0
            k0d r2 = (defpackage.k0d) r2
            int r2 = r2.o
            if (r13 >= r2) goto L_0x00f9
            r2 = r0
            k0d r2 = (defpackage.k0d) r2
            java.lang.Object r2 = r2.get(r13)
            eqf r2 = (defpackage.eqf) r2
            rpf r3 = r2.a
            r1.F(r3, r2)
            int r13 = r13 + r11
            goto L_0x00e2
        L_0x00f9:
            fqf r0 = new fqf
            wb7 r1 = r1.h()
            p0d r1 = (defpackage.p0d) r1
            r0.<init>(r1)
            return r0
        L_0x0105:
            xff r1 = defpackage.rpf.v
            java.lang.String r2 = java.lang.Integer.toString(r13, r12)
            java.util.ArrayList r0 = r0.getParcelableArrayList(r2)
            lx5 r2 = defpackage.tb7.b
            k0d r2 = defpackage.k0d.v
            java.util.List r0 = defpackage.kv0.u(r1, r0, r2)
            tpf r1 = new tpf
            rpf[] r2 = new defpackage.rpf[r13]
            kb7 r0 = (defpackage.kb7) r0
            java.lang.Object[] r0 = r0.toArray(r2)
            rpf[] r0 = (defpackage.rpf[]) r0
            r1.<init>(r0)
            return r1
        L_0x0127:
            ip5 r1 = defpackage.ca6.Q0
            java.lang.String r2 = java.lang.Integer.toString(r13, r12)
            java.util.ArrayList r2 = r0.getParcelableArrayList(r2)
            lx5 r3 = defpackage.tb7.b
            k0d r3 = defpackage.k0d.v
            java.util.List r1 = defpackage.kv0.u(r1, r2, r3)
            java.lang.String r2 = java.lang.Integer.toString(r11, r12)
            java.lang.String r0 = r0.getString(r2, r8)
            rpf r2 = new rpf
            ca6[] r3 = new defpackage.ca6[r13]
            kb7 r1 = (defpackage.kb7) r1
            java.lang.Object[] r1 = r1.toArray(r3)
            ca6[] r1 = (defpackage.ca6[]) r1
            r2.<init>(r0, r1)
            return r2
        L_0x0151:
            java.lang.String r5 = java.lang.Integer.toString(r11, r12)
            android.os.Bundle r5 = r0.getBundle(r5)
            if (r5 == 0) goto L_0x0166
            zc8 r8 = defpackage.gr8.w
            jv0 r5 = r8.h(r5)
            gr8 r5 = (defpackage.gr8) r5
            r16 = r5
            goto L_0x0168
        L_0x0166:
            r16 = r6
        L_0x0168:
            java.lang.String r5 = java.lang.Integer.toString(r10, r12)
            long r18 = r0.getLong(r5, r3)
            java.lang.String r5 = java.lang.Integer.toString(r9, r12)
            long r20 = r0.getLong(r5, r3)
            java.lang.String r5 = java.lang.Integer.toString(r7, r12)
            long r22 = r0.getLong(r5, r3)
            r5 = 5
            java.lang.String r5 = java.lang.Integer.toString(r5, r12)
            boolean r24 = r0.getBoolean(r5, r13)
            r5 = 6
            java.lang.String r5 = java.lang.Integer.toString(r5, r12)
            boolean r25 = r0.getBoolean(r5, r13)
            r5 = 7
            java.lang.String r5 = java.lang.Integer.toString(r5, r12)
            android.os.Bundle r5 = r0.getBundle(r5)
            if (r5 == 0) goto L_0x01cf
            vq8 r6 = new vq8
            java.lang.String r8 = java.lang.Integer.toString(r13, r12)
            long r27 = r5.getLong(r8, r3)
            java.lang.String r8 = java.lang.Integer.toString(r11, r12)
            long r29 = r5.getLong(r8, r3)
            java.lang.String r8 = java.lang.Integer.toString(r10, r12)
            long r31 = r5.getLong(r8, r3)
            java.lang.String r8 = java.lang.Integer.toString(r9, r12)
            r9 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r33 = r5.getFloat(r8, r9)
            java.lang.String r7 = java.lang.Integer.toString(r7, r12)
            float r34 = r5.getFloat(r7, r9)
            r26 = r6
            r26.<init>(r27, r29, r31, r33, r34)
        L_0x01cf:
            r26 = r6
            r5 = 8
            java.lang.String r5 = java.lang.Integer.toString(r5, r12)
            boolean r5 = r0.getBoolean(r5, r13)
            r6 = 9
            java.lang.String r6 = java.lang.Integer.toString(r6, r12)
            long r27 = r0.getLong(r6, r1)
            r6 = 10
            java.lang.String r6 = java.lang.Integer.toString(r6, r12)
            long r29 = r0.getLong(r6, r3)
            r3 = 11
            java.lang.String r3 = java.lang.Integer.toString(r3, r12)
            int r31 = r0.getInt(r3, r13)
            r3 = 12
            java.lang.String r3 = java.lang.Integer.toString(r3, r12)
            int r32 = r0.getInt(r3, r13)
            r3 = 13
            java.lang.String r3 = java.lang.Integer.toString(r3, r12)
            long r33 = r0.getLong(r3, r1)
            gkf r0 = new gkf
            r14 = r0
            r0.<init>()
            java.lang.Object r15 = defpackage.gkf.B0
            r17 = 0
            r14.b(r15, r16, r17, r18, r20, r22, r24, r25, r26, r27, r29, r31, r32, r33)
            r0.Z = r5
            return r0
        L_0x021d:
            java.lang.String r5 = java.lang.Integer.toString(r13, r12)
            int r17 = r0.getInt(r5, r13)
            java.lang.String r5 = java.lang.Integer.toString(r11, r12)
            long r18 = r0.getLong(r5, r3)
            java.lang.String r3 = java.lang.Integer.toString(r10, r12)
            long r20 = r0.getLong(r3, r1)
            java.lang.String r1 = java.lang.Integer.toString(r9, r12)
            boolean r23 = r0.getBoolean(r1)
            java.lang.String r1 = java.lang.Integer.toString(r7, r12)
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 == 0) goto L_0x0252
            rx0 r1 = defpackage.p9.y
            jv0 r0 = r1.h(r0)
            p9 r0 = (defpackage.p9) r0
        L_0x024f:
            r22 = r0
            goto L_0x0255
        L_0x0252:
            p9 r0 = defpackage.p9.w
            goto L_0x024f
        L_0x0255:
            dkf r0 = new dkf
            r0.<init>()
            r15 = 0
            r16 = 0
            r14 = r0
            r14.h(r15, r16, r17, r18, r20, r22, r23)
            return r0
        L_0x0262:
            java.lang.String r1 = java.lang.Integer.toString(r13, r12)
            int r1 = r0.getInt(r1, r5)
            if (r1 != r9) goto L_0x026e
            r1 = r11
            goto L_0x026f
        L_0x026e:
            r1 = r13
        L_0x026f:
            defpackage.y64.g(r1)
            java.lang.String r1 = java.lang.Integer.toString(r11, r12)
            boolean r1 = r0.getBoolean(r1, r13)
            if (r1 == 0) goto L_0x028a
            yif r1 = new yif
            java.lang.String r2 = java.lang.Integer.toString(r10, r12)
            boolean r0 = r0.getBoolean(r2, r13)
            r1.<init>(r0)
            goto L_0x028f
        L_0x028a:
            yif r1 = new yif
            r1.<init>()
        L_0x028f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xff.h(android.os.Bundle):jv0");
    }

    /* renamed from: c  reason: collision with other method in class */
    public tf5[] m1626c() {
        nfd nfd = gze.d0;
        rkf rkf = new rkf(0);
        lx5 lx5 = tb7.b;
        return new tf5[]{new ntf(1, 1, nfd, rkf, new kk3(k0d.v, 0, 3))};
    }
}
