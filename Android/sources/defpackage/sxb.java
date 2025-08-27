package defpackage;

import kotlin.Lazy;

/* renamed from: sxb  reason: default package */
public final class sxb implements oa4 {
    public final /* synthetic */ int a;
    public final Lazy b;
    public final wa4 c;

    public sxb(int i, Lazy lazy) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = lazy;
                this.c = gd2.b;
                return;
            default:
                this.b = lazy;
                this.c = uxb.b;
                return;
        }
    }

    public final wa4 a() {
        switch (this.a) {
            case 0:
                return (uxb) this.c;
            default:
                return (gd2) this.c;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ab4 b(java.lang.String r18, defpackage.ra4 r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r0 = r17
            r2 = r19
            r3 = r20
            r1 = 7
            r4 = 6
            java.lang.String r5 = "chat_id"
            r6 = 0
            wa4 r7 = r0.c
            r8 = 0
            int r9 = r0.a
            switch(r9) {
                case 0: goto L_0x00a6;
                default: goto L_0x0013;
            }
        L_0x0013:
            gd2 r7 = (defpackage.gd2) r7
            java.util.LinkedHashSet r7 = r7.a
            boolean r7 = r7.contains(r2)
            if (r7 != 0) goto L_0x001f
            goto L_0x0099
        L_0x001f:
            ra4 r6 = defpackage.gd2.c
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x009a
            long r10 = defpackage.o54.L(r5, r3)
            java.lang.String r5 = "attach_id"
            java.lang.String r12 = defpackage.o54.N(r5, r3)
            java.lang.String r5 = "msg_id"
            long r13 = defpackage.o54.L(r5, r3)
            java.lang.String r5 = "single"
            java.lang.Boolean r5 = defpackage.o54.E(r5, r3)
            if (r5 == 0) goto L_0x0045
            boolean r5 = r5.booleanValue()
            r15 = r5
            goto L_0x0046
        L_0x0045:
            r15 = r8
        L_0x0046:
            java.lang.String r5 = "desc"
            java.lang.Boolean r5 = defpackage.o54.E(r5, r3)
            if (r5 == 0) goto L_0x0055
            boolean r5 = r5.booleanValue()
            r16 = r5
            goto L_0x0057
        L_0x0055:
            r16 = r8
        L_0x0057:
            fd2 r6 = new fd2
            r9 = r6
            r9.<init>(r10, r12, r13, r15, r16)
            kotlin.Lazy r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            uj5 r0 = (defpackage.uj5) r0
            vj5 r0 = (defpackage.vj5) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r5 = ru.ok.tamtam.android.prefs.PmsKey.f18chatanim
            boolean r0 = r0.m(r5, r8)
            if (r0 == 0) goto L_0x0083
            xa4 r0 = new xa4
            r52 r5 = new r52
            r5.<init>(r4)
            r52 r4 = new r52
            r4.<init>(r1)
            r0.<init>(r5, r4)
        L_0x0081:
            r5 = r0
            goto L_0x0089
        L_0x0083:
            xa4 r0 = new xa4
            r0.<init>()
            goto L_0x0081
        L_0x0089:
            ab4 r8 = new ab4
            r7 = 8
            r4 = 0
            r0 = r8
            r1 = r18
            r2 = r19
            r3 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r6 = r8
        L_0x0099:
            return r6
        L_0x009a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unknown route "
            java.lang.String r1 = defpackage.tr1.i(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x00a6:
            uxb r7 = (defpackage.uxb) r7
            java.util.LinkedHashSet r0 = r7.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x00b2
            goto L_0x0268
        L_0x00b2:
            za4 r0 = defpackage.za4.a
            uxb r7 = defpackage.uxb.b
            r7.getClass()
            ra4 r7 = defpackage.uxb.c
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r7)
            java.lang.String r9 = "type"
            java.lang.String r10 = "id"
            if (r7 == 0) goto L_0x00de
            wc8 r1 = defpackage.txb.b
            java.lang.String r4 = defpackage.o54.N(r9, r3)
            r1.getClass()
            txb r1 = defpackage.wc8.v(r4)
            long r4 = defpackage.o54.L(r10, r3)
            oxb r6 = new oxb
            r6.<init>((java.lang.Enum) r1, (long) r4, (int) r8)
        L_0x00db:
            r4 = r0
            goto L_0x0231
        L_0x00de:
            ra4 r7 = defpackage.uxb.d
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0139
            long r4 = defpackage.o54.L(r10, r3)
            java.lang.String r1 = defpackage.o54.N(r9, r3)
            int r6 = r1.hashCode()
            r7 = -759091500(0xffffffffd2c12ed4, float:-4.14857167E11)
            if (r6 == r7) goto L_0x011a
            r7 = 951526432(0x38b72420, float:8.732849E-5)
            if (r6 == r7) goto L_0x010e
            r7 = 1303205804(0x4dad57ac, float:3.63525504E8)
            if (r6 == r7) goto L_0x0102
            goto L_0x0122
        L_0x0102:
            java.lang.String r6 = "local_chat"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x010b
            goto L_0x0122
        L_0x010b:
            txb r1 = defpackage.txb.LOCAL_CHAT
            goto L_0x0127
        L_0x010e:
            java.lang.String r6 = "contact"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0117
            goto L_0x0122
        L_0x0117:
            txb r1 = defpackage.txb.CONTACT
            goto L_0x0127
        L_0x011a:
            java.lang.String r6 = "server_chat"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0125
        L_0x0122:
            txb r1 = defpackage.txb.LOCAL_CHAT
            goto L_0x0127
        L_0x0125:
            txb r1 = defpackage.txb.SERVER_CHAT
        L_0x0127:
            java.lang.String r6 = "is_opened_from_dialog"
            java.lang.Boolean r6 = defpackage.o54.E(r6, r3)
            if (r6 == 0) goto L_0x0133
            boolean r8 = r6.booleanValue()
        L_0x0133:
            qxb r6 = new qxb
            r6.<init>(r4, r1, r8)
            goto L_0x00db
        L_0x0139:
            ra4 r7 = defpackage.uxb.h
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r7)
            java.lang.Class<sxb> r11 = defpackage.sxb.class
            if (r7 == 0) goto L_0x0195
            za4 r0 = defpackage.za4.c
            java.lang.String r1 = defpackage.o54.N(r9, r3)
            java.lang.String r4 = "chat"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
            y4 r5 = defpackage.y4.a
            if (r4 == 0) goto L_0x015e
            y4 r1 = defpackage.y4.c
            y4[] r1 = new defpackage.y4[]{r5, r1}
            java.util.ArrayList r1 = kotlin.collections.CollectionsKt.arrayListOf(r1)
            goto L_0x0170
        L_0x015e:
            java.lang.String r4 = "channel"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0178
            y4 r1 = defpackage.y4.b
            y4[] r1 = new defpackage.y4[]{r5, r1}
            java.util.ArrayList r1 = kotlin.collections.CollectionsKt.arrayListOf(r1)
        L_0x0170:
            hc8 r4 = new hc8
            r4.<init>((android.os.Bundle) r3, (java.util.ArrayList) r1)
            r6 = r4
            goto L_0x00db
        L_0x0178:
            java.lang.String r0 = r11.getName()
            java.lang.String r2 = "unknown type on pickAdmin route: "
            java.lang.String r2 = r2.concat(r1)
            defpackage.z68.f(r0, r2, r6)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "unknown pickAdminRoute "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0195:
            ra4 r7 = defpackage.uxb.e
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x01ab
            long r4 = defpackage.o54.L(r10, r3)
            ha3 r1 = new ha3
            r6 = 4
            r1.<init>(r4, r6)
        L_0x01a7:
            r4 = r0
            r6 = r1
            goto L_0x0231
        L_0x01ab:
            ra4 r7 = defpackage.uxb.f
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x01da
            long r4 = defpackage.o54.L(r10, r3)
            java.lang.String r1 = defpackage.o54.N(r9, r3)
            ij2 r6 = defpackage.ij2.MEMBER
            java.lang.String r7 = "BLOCKED_MEMBER"
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L_0x01d1
            java.lang.String r7 = "ADMIN"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x01ce
            goto L_0x01d3
        L_0x01ce:
            ij2 r6 = defpackage.ij2.ADMIN
            goto L_0x01d3
        L_0x01d1:
            ij2 r6 = defpackage.ij2.BLOCKED_MEMBER
        L_0x01d3:
            oxb r1 = new oxb
            r7 = 1
            r1.<init>((java.lang.Enum) r6, (long) r4, (int) r7)
            goto L_0x01a7
        L_0x01da:
            ra4 r7 = defpackage.uxb.g
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x01ed
            long r4 = defpackage.o54.L(r10, r3)
            ha3 r1 = new ha3
            r6 = 5
            r1.<init>(r4, r6)
            goto L_0x01a7
        L_0x01ed:
            ra4 r7 = defpackage.uxb.i
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x01ff
            long r5 = defpackage.o54.L(r5, r3)
            ha3 r1 = new ha3
            r1.<init>(r5, r4)
            goto L_0x01a7
        L_0x01ff:
            ra4 r4 = defpackage.uxb.j
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0212
            long r4 = defpackage.o54.L(r5, r3)
            ha3 r6 = new ha3
            r6.<init>(r4, r1)
            goto L_0x00db
        L_0x0212:
            ra4 r1 = defpackage.uxb.k
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x0242
            long r4 = defpackage.o54.L(r5, r3)
            java.lang.String r1 = "leave_chat"
            java.lang.Boolean r1 = defpackage.o54.E(r1, r3)
            if (r1 == 0) goto L_0x022a
            boolean r8 = r1.booleanValue()
        L_0x022a:
            rxb r1 = new rxb
            r1.<init>(r4, r8)
            goto L_0x01a7
        L_0x0231:
            ab4 r8 = new ab4
            r7 = 16
            r5 = 0
            r0 = r8
            r1 = r18
            r2 = r19
            r3 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r6 = r8
            goto L_0x0268
        L_0x0242:
            java.lang.String r0 = r11.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "invalid route "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            defpackage.z68.f(r0, r1, r4)
        L_0x0268:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxb.b(java.lang.String, ra4, android.os.Bundle):ab4");
    }
}
