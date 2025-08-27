package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

/* renamed from: s44  reason: default package */
public final class s44 {
    public static final s44 k = new s44((ld9) null, (String) null, (String) null, false, false, (me5) null, 1022);
    public final ld9 a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final oub i;
    public final me5 j;

    public s44(ld9 ld9, long j2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, oub oub, me5 me5) {
        this.a = ld9;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = oub;
        this.j = me5;
    }

    public static s44 a(s44 s44, ld9 ld9, long j2, String str, String str2, boolean z, boolean z2, boolean z3, oub oub, me5 me5, int i2) {
        s44 s442 = s44;
        int i3 = i2;
        ld9 ld92 = (i3 & 1) != 0 ? s442.a : ld9;
        long j3 = (i3 & 2) != 0 ? s442.b : j2;
        String str3 = (i3 & 4) != 0 ? s442.c : str;
        String str4 = (i3 & 8) != 0 ? s442.d : str2;
        boolean z4 = (i3 & 16) != 0 ? s442.e : z;
        boolean z5 = (i3 & 32) != 0 ? s442.f : z2;
        boolean z6 = s442.g;
        boolean z7 = (i3 & Uuid.SIZE_BITS) != 0 ? s442.h : z3;
        oub oub2 = (i3 & 256) != 0 ? s442.i : oub;
        me5 me52 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? s442.j : me5;
        s44.getClass();
        return new s44(ld92, j3, str3, str4, z4, z5, z6, z7, oub2, me52);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s44)) {
            return false;
        }
        s44 s44 = (s44) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) s44.a) && this.b == s44.b && Intrinsics.areEqual((Object) this.c, (Object) s44.c) && Intrinsics.areEqual((Object) this.d, (Object) s44.d) && this.e == s44.e && this.f == s44.f && this.g == s44.g && this.h == s44.h && Intrinsics.areEqual((Object) this.i, (Object) s44.i) && Intrinsics.areEqual((Object) this.j, (Object) s44.j);
    }

    public final int hashCode() {
        int i2 = 0;
        ld9 ld9 = this.a;
        int i3 = wzf.i((ld9 == null ? 0 : ld9.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (i3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int e2 = g63.e(g63.e(g63.e(g63.e((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        oub oub = this.i;
        if (oub != null) {
            i2 = oub.hashCode();
        }
        return this.j.hashCode() + ((e2 + i2) * 31);
    }

    public final String toString() {
        return "CurrentCallInfo(target=" + this.a + ", startedAt=" + this.b + ", conversationId=" + this.c + ", joinLink=" + this.d + ", hasOpponentsOnce=" + this.e + ", isConnectedOnce=" + this.f + ", isIncoming=" + this.g + ", isGroupCall=" + this.h + ", previousCallState=" + this.i + ", state=" + this.j + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ s44(defpackage.ld9 r14, java.lang.String r15, java.lang.String r16, boolean r17, boolean r18, defpackage.me5 r19, int r20) {
        /*
            r13 = this;
            r0 = r20
            long r2 = java.lang.System.currentTimeMillis()
            r1 = r0 & 4
            r4 = 0
            if (r1 == 0) goto L_0x000d
            r5 = r4
            goto L_0x000e
        L_0x000d:
            r5 = r15
        L_0x000e:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0014
            r6 = r4
            goto L_0x0016
        L_0x0014:
            r6 = r16
        L_0x0016:
            r1 = r0 & 64
            r4 = 0
            if (r1 == 0) goto L_0x001d
            r8 = r4
            goto L_0x001f
        L_0x001d:
            r8 = r17
        L_0x001f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0025
            r9 = r4
            goto L_0x0027
        L_0x0025:
            r9 = r18
        L_0x0027:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x002f
            ie5 r0 = defpackage.ie5.b
            r11 = r0
            goto L_0x0031
        L_0x002f:
            r11 = r19
        L_0x0031:
            r7 = 0
            r10 = 0
            r12 = 0
            r0 = r13
            r1 = r14
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r10 = r12
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s44.<init>(ld9, java.lang.String, java.lang.String, boolean, boolean, me5, int):void");
    }
}
