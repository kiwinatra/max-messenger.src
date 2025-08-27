package defpackage;

import java.io.Serializable;

/* renamed from: gv6  reason: default package */
public final class gv6 implements Serializable {
    public final hv6 X;
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final String v;
    public final String w;
    public final boolean x;
    public final boolean y;
    public final int z;

    public gv6(long j, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5, boolean z6, int i, hv6 hv6) {
        this.a = j;
        this.b = z2;
        this.c = z3;
        this.o = z4;
        this.v = str;
        this.w = str2;
        this.x = z5;
        this.y = z6;
        this.z = i;
        this.X = hv6;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.gv6 a(defpackage.pf9 r24) {
        /*
            r5 = 1
            hv6 r6 = defpackage.hv6.b
            int r7 = defpackage.ryg.e0(r24)
            r9 = 0
            r23 = r6
            r13 = r9
            r11 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x001c:
            if (r11 >= r7) goto L_0x0202
            java.lang.String r0 = defpackage.ryg.g0(r24)
            r0.getClass()
            int r12 = r0.hashCode()
            switch(r12) {
                case -1598903521: goto L_0x0096;
                case -1440008444: goto L_0x008b;
                case -1292829657: goto L_0x0080;
                case -826284293: goto L_0x0075;
                case -403735452: goto L_0x006a;
                case -354744795: goto L_0x005f;
                case 3373707: goto L_0x0054;
                case 293428218: goto L_0x0049;
                case 969894424: goto L_0x003c;
                case 1096925661: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = -1
            goto L_0x00a0
        L_0x002f:
            java.lang.String r12 = "isCustomTitle"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0038
            goto L_0x002c
        L_0x0038:
            r0 = 9
            goto L_0x00a0
        L_0x003c:
            java.lang.String r12 = "isImportant"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0045
            goto L_0x002c
        L_0x0045:
            r0 = 8
            goto L_0x00a0
        L_0x0049:
            java.lang.String r12 = "groupId"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0052
            goto L_0x002c
        L_0x0052:
            r0 = 7
            goto L_0x00a0
        L_0x0054:
            java.lang.String r12 = "name"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x005d
            goto L_0x002c
        L_0x005d:
            r0 = 6
            goto L_0x00a0
        L_0x005f:
            java.lang.String r12 = "baseIconUrl"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0068
            goto L_0x002c
        L_0x0068:
            r0 = 5
            goto L_0x00a0
        L_0x006a:
            java.lang.String r12 = "isMember"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0073
            goto L_0x002c
        L_0x0073:
            r0 = 4
            goto L_0x00a0
        L_0x0075:
            java.lang.String r12 = "isModerator"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x007e
            goto L_0x002c
        L_0x007e:
            r0 = 3
            goto L_0x00a0
        L_0x0080:
            java.lang.String r12 = "isAnswered"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0089
            goto L_0x002c
        L_0x0089:
            r0 = 2
            goto L_0x00a0
        L_0x008b:
            java.lang.String r12 = "messaging"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0094
            goto L_0x002c
        L_0x0094:
            r0 = r5
            goto L_0x00a0
        L_0x0096:
            java.lang.String r12 = "groupOptions"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x009f
            goto L_0x002c
        L_0x009f:
            r0 = 0
        L_0x00a0:
            switch(r0) {
                case 0: goto L_0x0130;
                case 1: goto L_0x00e4;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00d4;
                case 4: goto L_0x00cc;
                case 5: goto L_0x00c4;
                case 6: goto L_0x00bc;
                case 7: goto L_0x00b4;
                case 8: goto L_0x00af;
                case 9: goto L_0x00aa;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            r24.A()
        L_0x00a6:
            r12 = r24
            goto L_0x01fd
        L_0x00aa:
            boolean r20 = defpackage.ryg.Y(r24)
            goto L_0x00a6
        L_0x00af:
            boolean r17 = defpackage.ryg.Y(r24)
            goto L_0x00a6
        L_0x00b4:
            r12 = r24
            long r13 = defpackage.ryg.d0(r12, r9)
            goto L_0x01fd
        L_0x00bc:
            r12 = r24
            java.lang.String r18 = defpackage.ryg.g0(r24)
            goto L_0x01fd
        L_0x00c4:
            r12 = r24
            java.lang.String r19 = defpackage.ryg.g0(r24)
            goto L_0x01fd
        L_0x00cc:
            r12 = r24
            boolean r21 = defpackage.ryg.Y(r24)
            goto L_0x01fd
        L_0x00d4:
            r12 = r24
            boolean r16 = defpackage.ryg.Y(r24)
            goto L_0x01fd
        L_0x00dc:
            r12 = r24
            boolean r15 = defpackage.ryg.Y(r24)
            goto L_0x01fd
        L_0x00e4:
            r12 = r24
            java.lang.String r0 = defpackage.ryg.g0(r24)
            if (r0 != 0) goto L_0x00f0
        L_0x00ec:
            r22 = r5
            goto L_0x01fd
        L_0x00f0:
            int r1 = r0.hashCode()
            r2 = 64897(0xfd81, float:9.094E-41)
            if (r1 == r2) goto L_0x0118
            r2 = 1053567612(0x3ecc2a7c, float:0.39876163)
            if (r1 == r2) goto L_0x010e
            r2 = 1666864377(0x635a54f9, float:4.027513E21)
            if (r1 == r2) goto L_0x0104
            goto L_0x0122
        L_0x0104:
            java.lang.String r1 = "MEMBERS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0122
            r0 = 0
            goto L_0x0123
        L_0x010e:
            java.lang.String r1 = "DISABLED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0122
            r0 = 2
            goto L_0x0123
        L_0x0118:
            java.lang.String r1 = "ALL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0122
            r0 = r5
            goto L_0x0123
        L_0x0122:
            r0 = -1
        L_0x0123:
            if (r0 == 0) goto L_0x012c
            if (r0 == r5) goto L_0x0128
            goto L_0x00ec
        L_0x0128:
            r22 = 3
            goto L_0x01fd
        L_0x012c:
            r22 = 2
            goto L_0x01fd
        L_0x0130:
            r12 = r24
            java.lang.String r1 = "payloadCatching catch error"
            java.lang.String r2 = "ServerPayload/PayloadCatching"
            int r0 = defpackage.ryg.X(r24)     // Catch:{ all -> 0x013c }
            r3 = r0
            goto L_0x0170
        L_0x013c:
            r0 = move-exception
            r3 = r0
            defpackage.z68.o(r2, r1, r3)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0147:
            boolean r23 = r0.hasNext()
            if (r23 == 0) goto L_0x0159
            java.lang.Object r23 = r0.next()
            r4 = r23
            xm r4 = (defpackage.xm) r4
            r4.a(r3)
            goto L_0x0147
        L_0x0159:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x016f
            if (r0 == r5) goto L_0x016e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x016e:
            throw r3
        L_0x016f:
            r3 = 0
        L_0x0170:
            if (r3 != 0) goto L_0x0176
            r23 = r6
            goto L_0x01fd
        L_0x0176:
            r4 = 0
            r8 = 0
        L_0x0178:
            if (r4 >= r3) goto L_0x01f6
            java.lang.String r0 = defpackage.ryg.g0(r24)     // Catch:{ all -> 0x017f }
            goto L_0x01b1
        L_0x017f:
            r0 = move-exception
            r9 = r0
            defpackage.z68.o(r2, r1, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x018a:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x019a
            java.lang.Object r10 = r0.next()
            xm r10 = (defpackage.xm) r10
            r10.a(r9)
            goto L_0x018a
        L_0x019a:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01b0
            if (r0 == r5) goto L_0x01af
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01af:
            throw r9
        L_0x01b0:
            r0 = 0
        L_0x01b1:
            java.lang.String r9 = "GroupPremium"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r9)
            if (r0 == 0) goto L_0x01bb
            r8 = r5
            goto L_0x01f2
        L_0x01bb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r24.A()     // Catch:{ all -> 0x01c1 }
            goto L_0x01f2
        L_0x01c1:
            r0 = move-exception
            r9 = r0
            defpackage.z68.o(r2, r1, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01cc:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x01dc
            java.lang.Object r10 = r0.next()
            xm r10 = (defpackage.xm) r10
            r10.a(r9)
            goto L_0x01cc
        L_0x01dc:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01f2
            if (r0 == r5) goto L_0x01f1
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01f1:
            throw r9
        L_0x01f2:
            int r4 = r4 + r5
            r9 = 0
            goto L_0x0178
        L_0x01f6:
            hv6 r0 = new hv6
            r0.<init>(r8)
            r23 = r0
        L_0x01fd:
            int r11 = r11 + r5
            r9 = 0
            goto L_0x001c
        L_0x0202:
            gv6 r0 = new gv6
            r12 = r0
            r12.<init>(r13, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv6.a(pf9):gv6");
    }

    public final String toString() {
        String str;
        int i = this.z;
        if (i == 1) {
            str = "DISABLED";
        } else if (i == 2) {
            str = "MEMBERS";
        } else if (i == 3) {
            str = "ALL";
        } else {
            throw null;
        }
        String hv6 = this.X.toString();
        StringBuilder sb = new StringBuilder("{groupId=");
        sb.append(this.a);
        sb.append(", isAnswered=");
        sb.append(this.b);
        sb.append(", isModerator=");
        sb.append(this.c);
        sb.append(", isImportant=");
        sb.append(this.o);
        sb.append(", name=");
        sb.append(this.v);
        sb.append(", baseIconUrl=");
        sb.append(this.w);
        sb.append(", isCustomTitle=");
        sb.append(this.x);
        sb.append(", isMember=");
        sb.append(this.y);
        sb.append(", messagingPermissions=");
        sb.append(str);
        sb.append(", groupOptions=");
        return wj6.n(sb, hv6, "}");
    }
}
