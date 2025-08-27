package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* renamed from: cyb  reason: default package */
public final class cyb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final byb g;
    public final byb h;
    public final byb i;
    public final byb j;
    public final byb k;
    public final byb l;
    public final byb m;

    public cyb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, byb byb, byb byb2, byb byb3, byb byb4, byb byb5, byb byb6, byb byb7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = byb;
        this.h = byb2;
        this.i = byb3;
        this.j = byb4;
        this.k = byb5;
        this.l = byb6;
        this.m = byb7;
    }

    public static cyb a(cyb cyb, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, byb byb, byb byb2, byb byb3, byb byb4, byb byb5, byb byb6, byb byb7, int i2) {
        cyb cyb2 = cyb;
        int i3 = i2;
        return new cyb((i3 & 1) != 0 ? cyb2.a : z, (i3 & 2) != 0 ? cyb2.b : z2, (i3 & 4) != 0 ? cyb2.c : z3, (i3 & 8) != 0 ? cyb2.d : z4, (i3 & 16) != 0 ? cyb2.e : z5, (i3 & 32) != 0 ? cyb2.f : z6, (i3 & 64) != 0 ? cyb2.g : byb, (i3 & Uuid.SIZE_BITS) != 0 ? cyb2.h : byb2, (i3 & 256) != 0 ? cyb2.i : byb3, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? cyb2.j : byb4, (i3 & 1024) != 0 ? cyb2.k : byb5, (i3 & 2048) != 0 ? cyb2.l : byb6, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? cyb2.m : byb7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.cyb) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.cyb
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            cyb r5 = (defpackage.cyb) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L_0x002f
            return r2
        L_0x002f:
            boolean r1 = r4.f
            boolean r3 = r5.f
            if (r1 == r3) goto L_0x0036
            return r2
        L_0x0036:
            byb r1 = r4.g
            byb r3 = r5.g
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0041
            return r2
        L_0x0041:
            byb r1 = r4.h
            byb r3 = r5.h
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x004c
            return r2
        L_0x004c:
            byb r1 = r4.i
            byb r3 = r5.i
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0057
            return r2
        L_0x0057:
            byb r1 = r4.j
            byb r3 = r5.j
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0062
            return r2
        L_0x0062:
            byb r1 = r4.k
            byb r3 = r5.k
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x006d
            return r2
        L_0x006d:
            byb r1 = r4.l
            byb r3 = r5.l
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0078
            return r2
        L_0x0078:
            byb r4 = r4.m
            byb r5 = r5.m
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0083
            return r2
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int e2 = g63.e(g63.e(g63.e(g63.e(g63.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        int hashCode = this.h.hashCode();
        int hashCode2 = this.i.hashCode();
        int hashCode3 = this.j.hashCode();
        int hashCode4 = this.k.hashCode();
        int hashCode5 = this.l.hashCode();
        return this.m.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.g.hashCode() + e2) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProfileEditAdminPermissionsModel(isSuperAdmin=" + this.a + ", editSendDeleteMessagesEnabled=" + this.b + ", pinMessagesEnabled=" + this.c + ", changeChatInfoEnabled=" + this.d + ", changeMembersEnabled=" + this.e + ", editLinkEnabled=" + this.f + ", sendMessagePermState=" + this.g + ", editMessagePermState=" + this.h + ", deleteMessagePermState=" + this.i + ", pinMessagePermState=" + this.j + ", changeChatInfoPermState=" + this.k + ", controlMembersPermState=" + this.l + ", controlAdminsPermState=" + this.m + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ cyb(boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, defpackage.byb r24, defpackage.byb r25, defpackage.byb r26, defpackage.byb r27, defpackage.byb r28, defpackage.byb r29, defpackage.byb r30, int r31) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r18
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r19
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r20
        L_0x001b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r21
        L_0x0023:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0029
            r8 = r2
            goto L_0x002b
        L_0x0029:
            r8 = r22
        L_0x002b:
            r1 = r0 & 64
            r2 = 1
            if (r1 == 0) goto L_0x0037
            byb r1 = new byb
            r1.<init>(r5, r2)
            r10 = r1
            goto L_0x0039
        L_0x0037:
            r10 = r24
        L_0x0039:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0044
            byb r1 = new byb
            r1.<init>(r5, r2)
            r11 = r1
            goto L_0x0046
        L_0x0044:
            r11 = r25
        L_0x0046:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0051
            byb r1 = new byb
            r1.<init>(r5, r2)
            r12 = r1
            goto L_0x0053
        L_0x0051:
            r12 = r26
        L_0x0053:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x005e
            byb r1 = new byb
            r1.<init>(r6, r2)
            r13 = r1
            goto L_0x0060
        L_0x005e:
            r13 = r27
        L_0x0060:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x006b
            byb r1 = new byb
            r1.<init>(r7, r2)
            r14 = r1
            goto L_0x006d
        L_0x006b:
            r14 = r28
        L_0x006d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0078
            byb r1 = new byb
            r1.<init>(r8, r2)
            r15 = r1
            goto L_0x007a
        L_0x0078:
            r15 = r29
        L_0x007a:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0086
            byb r0 = new byb
            r0.<init>(r4, r2)
            r16 = r0
            goto L_0x0088
        L_0x0086:
            r16 = r30
        L_0x0088:
            r3 = r17
            r9 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyb.<init>(boolean, boolean, boolean, boolean, boolean, boolean, byb, byb, byb, byb, byb, byb, byb, int):void");
    }
}
