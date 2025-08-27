package defpackage;

/* renamed from: vt8  reason: default package */
public final class vt8 implements oa4 {
    public final /* synthetic */ int a;
    public final wa4 b;

    public vt8(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = k66.b;
                return;
            case 2:
                this.b = rc7.b;
                return;
            case 3:
                this.b = kt7.b;
                return;
            case 4:
                this.b = dhb.b;
                return;
            default:
                this.b = wt8.b;
                return;
        }
    }

    public final wa4 a() {
        switch (this.a) {
            case 0:
                return (wt8) this.b;
            case 1:
                return (k66) this.b;
            case 2:
                return (rc7) this.b;
            case 3:
                return (kt7) this.b;
            default:
                return (dhb) this.b;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: chb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: o72} */
    /* JADX WARNING: type inference failed for: r1v49 */
    /* JADX WARNING: type inference failed for: r4v45, types: [gt7] */
    /* JADX WARNING: type inference failed for: r12v1, types: [jt7] */
    /* JADX WARNING: type inference failed for: r1v65 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ab4 b(java.lang.String r21, defpackage.ra4 r22, android.os.Bundle r23) {
        /*
            r20 = this;
            r0 = r20
            r2 = r22
            r3 = r23
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x02e7;
                case 1: goto L_0x01fc;
                case 2: goto L_0x01ab;
                case 3: goto L_0x006e;
                default: goto L_0x000b;
            }
        L_0x000b:
            wa4 r0 = r0.b
            dhb r0 = (defpackage.dhb) r0
            java.util.LinkedHashSet r0 = r0.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0019
            r0 = 0
            goto L_0x0061
        L_0x0019:
            xa4 r0 = defpackage.xa4.c
            ra4 r1 = defpackage.dhb.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x002d
            o72 r1 = new o72
            r4 = 9
            r1.<init>(r3, r4)
            r5 = r0
            r6 = r1
            goto L_0x0053
        L_0x002d:
            ra4 r0 = defpackage.dhb.d
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0062
            xa4 r0 = new xa4
            lgb r1 = new lgb
            r4 = 3
            r1.<init>((int) r4)
            lgb r4 = new lgb
            r5 = 4
            r4.<init>((int) r5)
            r0.<init>(r1, r4)
            java.lang.String r1 = "request_code"
            int r1 = defpackage.o54.K(r1, r3)
            chb r4 = new chb
            r4.<init>(r1)
            r5 = r0
            r6 = r4
        L_0x0053:
            ab4 r7 = new ab4
            za4 r4 = defpackage.za4.a
            r0 = r7
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L_0x0061:
            return r0
        L_0x0062:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "invalid route "
            java.lang.String r1 = defpackage.tr1.i(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x006e:
            wa4 r0 = r0.b
            kt7 r0 = (defpackage.kt7) r0
            java.util.LinkedHashSet r0 = r0.a
            boolean r0 = r0.contains(r2)
            r1 = 0
            if (r0 != 0) goto L_0x007d
            goto L_0x019e
        L_0x007d:
            za4 r0 = defpackage.za4.a
            ra4 r4 = defpackage.kt7.c
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x00ac
            java.lang.String r1 = "type"
            java.lang.String r1 = defpackage.o54.N(r1, r3)
            java.lang.String r4 = "multi"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
            if (r1 == 0) goto L_0x00a0
            i r1 = new i
            r4 = 17
            r1.<init>(r4)
        L_0x009c:
            r4 = r0
            r6 = r1
            goto L_0x018e
        L_0x00a0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unsupported type!"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ac:
            ra4 r4 = defpackage.kt7.d
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            r5 = 0
            java.lang.String r7 = "chat_id"
            if (r4 == 0) goto L_0x010d
            java.lang.String r4 = "lat"
            double r8 = defpackage.o54.J(r4, r3)
            java.lang.String r4 = "lon"
            double r10 = defpackage.o54.J(r4, r3)
            s58 r4 = new s58
            r4.<init>(r8, r10)
            java.lang.String r8 = "z"
            java.lang.String r8 = r3.getString(r8)
            if (r8 == 0) goto L_0x00d9
            float r1 = java.lang.Float.parseFloat(r8)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
        L_0x00d9:
            if (r1 == 0) goto L_0x00e2
            float r1 = r1.floatValue()
        L_0x00df:
            r18 = r1
            goto L_0x00e4
        L_0x00e2:
            r1 = 0
            goto L_0x00df
        L_0x00e4:
            java.lang.Long r1 = defpackage.o54.F(r7, r3)
            if (r1 == 0) goto L_0x00f0
            long r7 = r1.longValue()
            r13 = r7
            goto L_0x00f1
        L_0x00f0:
            r13 = r5
        L_0x00f1:
            java.lang.String r1 = "msg_id"
            java.lang.Long r1 = defpackage.o54.F(r1, r3)
            if (r1 == 0) goto L_0x00fd
            long r5 = r1.longValue()
        L_0x00fd:
            r15 = r5
            java.lang.String r1 = "sender_id"
            java.lang.Long r19 = defpackage.o54.F(r1, r3)
            jt7 r1 = new jt7
            r12 = r1
            r17 = r4
            r12.<init>(r13, r15, r17, r18, r19)
            goto L_0x009c
        L_0x010d:
            ra4 r1 = defpackage.kt7.e
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x012e
            java.lang.String r1 = "request_code"
            int r1 = defpackage.o54.K(r1, r3)
            java.lang.Long r4 = defpackage.o54.F(r7, r3)
            if (r4 == 0) goto L_0x0125
            long r5 = r4.longValue()
        L_0x0125:
            ht7 r4 = new ht7
            r4.<init>(r1, r5)
            r6 = r4
            r4 = r0
            goto L_0x018e
        L_0x012e:
            ra4 r0 = defpackage.kt7.f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x019f
            java.lang.String r0 = "attachment_id"
            java.lang.String r6 = defpackage.o54.N(r0, r3)
            java.lang.String r0 = "message"
            android.os.Parcelable r0 = r3.getParcelable(r0)
            hd9 r0 = (defpackage.hd9) r0
            a89 r5 = r0.a
            java.lang.String r0 = "single_attach"
            java.lang.Boolean r0 = defpackage.o54.E(r0, r3)
            r1 = 1
            if (r0 == 0) goto L_0x0155
            boolean r0 = r0.booleanValue()
            r8 = r0
            goto L_0x0156
        L_0x0155:
            r8 = r1
        L_0x0156:
            java.lang.String r0 = "desc_order"
            java.lang.Boolean r0 = defpackage.o54.E(r0, r3)
            if (r0 == 0) goto L_0x0164
            boolean r0 = r0.booleanValue()
        L_0x0162:
            r7 = r0
            goto L_0x0166
        L_0x0164:
            r0 = 0
            goto L_0x0162
        L_0x0166:
            java.lang.String r0 = "start_auto_play"
            java.lang.Boolean r0 = defpackage.o54.E(r0, r3)
            if (r0 == 0) goto L_0x0174
            boolean r0 = r0.booleanValue()
            r9 = r0
            goto L_0x0175
        L_0x0174:
            r9 = r1
        L_0x0175:
            java.lang.String r0 = "cast_enabled"
            java.lang.Boolean r0 = defpackage.o54.E(r0, r3)
            if (r0 == 0) goto L_0x0183
            boolean r0 = r0.booleanValue()
            r10 = r0
            goto L_0x0184
        L_0x0183:
            r10 = r1
        L_0x0184:
            za4 r0 = defpackage.za4.c
            gt7 r1 = new gt7
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x009c
        L_0x018e:
            ab4 r8 = new ab4
            r7 = 16
            r5 = 0
            r0 = r8
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = r8
        L_0x019e:
            return r1
        L_0x019f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unknown route "
            java.lang.String r1 = defpackage.tr1.i(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x01ab:
            wa4 r0 = r0.b
            rc7 r0 = (defpackage.rc7) r0
            java.util.LinkedHashSet r0 = r0.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x01b9
            r0 = 0
            goto L_0x01ef
        L_0x01b9:
            rc7 r0 = defpackage.rc7.b
            r0.getClass()
            ra4 r0 = defpackage.rc7.c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x01f0
            xa4 r5 = new xa4
            a46 r0 = new a46
            r1 = 24
            r0.<init>(r1)
            a46 r1 = new a46
            r4 = 25
            r1.<init>(r4)
            r5.<init>(r0, r1)
            ab4 r7 = new ab4
            za4 r4 = defpackage.za4.a
            i r6 = new i
            r0 = 14
            r6.<init>(r0)
            r0 = r7
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r7
        L_0x01ef:
            return r0
        L_0x01f0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "invalid route "
            java.lang.String r1 = defpackage.tr1.i(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x01fc:
            wa4 r0 = r0.b
            k66 r0 = (defpackage.k66) r0
            java.util.LinkedHashSet r0 = r0.a
            boolean r0 = r0.contains(r2)
            r1 = 0
            if (r0 != 0) goto L_0x020b
            goto L_0x02e6
        L_0x020b:
            za4 r0 = defpackage.za4.b
            k66 r4 = defpackage.k66.b
            r4.getClass()
            ra4 r4 = defpackage.k66.c
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0227
            za4 r0 = defpackage.za4.a
            i r1 = new i
            r4 = 13
            r1.<init>(r4)
        L_0x0223:
            r4 = r0
            r6 = r1
            goto L_0x02d6
        L_0x0227:
            ra4 r4 = defpackage.k66.h
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0236
            o72 r1 = new o72
            r4 = 3
            r1.<init>(r3, r4)
            goto L_0x0223
        L_0x0236:
            ra4 r4 = defpackage.k66.i
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0245
            o72 r1 = new o72
            r4 = 4
            r1.<init>(r3, r4)
            goto L_0x0223
        L_0x0245:
            ra4 r0 = defpackage.k66.e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0256
            za4 r0 = defpackage.za4.a
            o72 r1 = new o72
            r4 = 5
            r1.<init>(r3, r4)
            goto L_0x0223
        L_0x0256:
            ra4 r0 = defpackage.k66.f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0276
            za4 r0 = defpackage.za4.a
            java.lang.String r1 = "chat_id"
            java.lang.Long r1 = defpackage.o54.F(r1, r3)
            if (r1 == 0) goto L_0x026d
            long r4 = r1.longValue()
            goto L_0x026f
        L_0x026d:
            r4 = 0
        L_0x026f:
            ha3 r1 = new ha3
            r6 = 1
            r1.<init>(r4, r6)
            goto L_0x0223
        L_0x0276:
            ra4 r0 = defpackage.k66.j
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x02ac
            za4 r0 = defpackage.za4.a
            java.lang.String r1 = "folder_id"
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x028b
            r1 = r4
        L_0x028b:
            java.lang.String r5 = "tag"
            java.lang.String r5 = r3.getString(r5)
            if (r5 != 0) goto L_0x0294
            goto L_0x0295
        L_0x0294:
            r4 = r5
        L_0x0295:
            java.lang.String r5 = "members_ids"
            boolean r6 = r3.containsKey(r5)
            if (r6 == 0) goto L_0x02a2
            long[] r5 = defpackage.o54.M(r5, r3)
            goto L_0x02a5
        L_0x02a2:
            r5 = 0
            long[] r5 = new long[r5]
        L_0x02a5:
            ky5 r6 = new ky5
            r6.<init>(r1, r4, r5)
            r4 = r0
            goto L_0x02d6
        L_0x02ac:
            ra4 r0 = defpackage.k66.d
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x02be
            za4 r0 = defpackage.za4.a
            o72 r1 = new o72
            r4 = 6
            r1.<init>(r3, r4)
            goto L_0x0223
        L_0x02be:
            ra4 r0 = defpackage.k66.g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x02e6
            za4 r0 = defpackage.za4.a
            java.lang.String r1 = "id"
            long r4 = defpackage.o54.L(r1, r3)
            ha3 r1 = new ha3
            r6 = 2
            r1.<init>(r4, r6)
            goto L_0x0223
        L_0x02d6:
            ab4 r8 = new ab4
            r7 = 16
            r5 = 0
            r0 = r8
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = r8
        L_0x02e6:
            return r1
        L_0x02e7:
            wa4 r0 = r0.b
            wt8 r0 = (defpackage.wt8) r0
            java.util.LinkedHashSet r0 = r0.a
            boolean r0 = r0.contains(r2)
            r1 = 0
            if (r0 != 0) goto L_0x02f5
            goto L_0x0344
        L_0x02f5:
            za4 r4 = defpackage.za4.a
            wt8 r0 = defpackage.wt8.b
            r0.getClass()
            ra4 r0 = defpackage.wt8.c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x031c
            i r6 = new i
            r0 = 20
            r6.<init>(r0)
            ab4 r8 = new ab4
            r7 = 16
            r5 = 0
            r0 = r8
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = r8
            goto L_0x0344
        L_0x031c:
            java.lang.Class<vt8> r0 = defpackage.vt8.class
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "invalid route "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.<init>(r2)
            defpackage.z68.f(r0, r3, r5)
        L_0x0344:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt8.b(java.lang.String, ra4, android.os.Bundle):ab4");
    }
}
