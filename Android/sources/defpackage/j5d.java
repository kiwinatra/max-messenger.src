package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j5d  reason: default package */
public final class j5d {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final Set e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final Long i;
    public final Map j;
    public final List k;
    public final Set l;
    public final boolean m;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ j5d(java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, java.util.Set r22, boolean r23, boolean r24, java.util.List r25, java.lang.Long r26, java.util.Map r27, java.util.List r28, java.util.Set r29, int r30) {
        /*
            r17 = this;
            r0 = r30
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r11 = r2
            goto L_0x000b
        L_0x0009:
            r11 = r25
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0011
            r12 = r2
            goto L_0x0013
        L_0x0011:
            r12 = r26
        L_0x0013:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0019
            r13 = r2
            goto L_0x001b
        L_0x0019:
            r13 = r27
        L_0x001b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0021
            r14 = r2
            goto L_0x0023
        L_0x0021:
            r14 = r28
        L_0x0023:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0029
            r15 = r2
            goto L_0x002b
        L_0x0029:
            r15 = r29
        L_0x002b:
            r16 = 0
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r3.<init>((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (int) r7, (java.util.Set) r8, (boolean) r9, (boolean) r10, (java.util.List) r11, (java.lang.Long) r12, (java.util.Map) r13, (java.util.List) r14, (java.util.Set) r15, (boolean) r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5d.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.util.Set, boolean, boolean, java.util.List, java.lang.Long, java.util.Map, java.util.List, java.util.Set, int):void");
    }

    public static j5d a(j5d j5d, int i2, Set set, int i3) {
        j5d j5d2 = j5d;
        String str = j5d2.a;
        String str2 = j5d2.b;
        String str3 = j5d2.c;
        int i4 = (i3 & 8) != 0 ? j5d2.d : i2;
        Set set2 = (i3 & 16) != 0 ? j5d2.e : set;
        boolean z = j5d2.f;
        boolean z2 = j5d2.g;
        List list = j5d2.h;
        Long l2 = j5d2.i;
        Map map = j5d2.j;
        List list2 = j5d2.k;
        Set set3 = j5d2.l;
        boolean z3 = j5d2.m;
        j5d.getClass();
        return new j5d(str, str2, str3, i4, set2, z, z2, list, l2, map, list2, set3, z3);
    }

    public final zx5 b(List list, List list2, Set set, Set set2, xva xva) {
        wa9 wa9 = wa9.a;
        String str = this.b;
        List list3 = this.h;
        CharSequence b2 = xva.a(str, list3, wa9.b, false, 0, true);
        Set set3 = CollectionsKt.toSet(list2);
        List emptyList = list3 == null ? CollectionsKt.emptyList() : list3;
        Map map = this.j;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        Map map2 = map;
        List list4 = this.k;
        if (list4 == null) {
            list4 = CollectionsKt.emptyList();
        }
        List list5 = list4;
        Set set4 = this.l;
        if (set4 == null) {
            set4 = SetsKt.emptySet();
        }
        return new zx5(this.a, b2, this.c, this.d, list, this.e, true, this.f, list2, this.g, set3, set, set2, emptyList, this.i, map2, list5, set4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5d)) {
            return false;
        }
        j5d j5d = (j5d) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) j5d.a) && Intrinsics.areEqual((Object) this.b, (Object) j5d.b) && Intrinsics.areEqual((Object) this.c, (Object) j5d.c) && this.d == j5d.d && Intrinsics.areEqual((Object) this.e, (Object) j5d.e) && this.f == j5d.f && this.g == j5d.g && Intrinsics.areEqual((Object) this.h, (Object) j5d.h) && Intrinsics.areEqual((Object) this.i, (Object) j5d.i) && Intrinsics.areEqual((Object) this.j, (Object) j5d.j) && Intrinsics.areEqual((Object) this.k, (Object) j5d.k) && Intrinsics.areEqual((Object) this.l, (Object) j5d.l) && this.m == j5d.m;
    }

    public final int hashCode() {
        int d2 = g63.d(this.a.hashCode() * 31, 31, this.b);
        int i2 = 0;
        String str = this.c;
        int e2 = g63.e(g63.e((this.e.hashCode() + rae.h(this.d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.f), 31, this.g);
        List list = this.h;
        int hashCode = (e2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.i;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Map map = this.j;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List list2 = this.k;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Set set = this.l;
        if (set != null) {
            i2 = set.hashCode();
        }
        return Boolean.hashCode(this.m) + ((hashCode4 + i2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoomChatFolder(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", emoji=");
        sb.append(this.c);
        sb.append(", order=");
        sb.append(this.d);
        sb.append(", filters=");
        sb.append(this.e);
        sb.append(", isHiddenForAllFolder=");
        sb.append(this.f);
        sb.append(", hideIfEmpty=");
        sb.append(this.g);
        sb.append(", elements=");
        sb.append(this.h);
        sb.append(", creatorId=");
        sb.append(this.i);
        sb.append(", filterSubjects=");
        sb.append(this.j);
        sb.append(", widgets=");
        sb.append(this.k);
        sb.append(", options=");
        sb.append(this.l);
        sb.append(", isRemoved=");
        return tr1.m(sb, this.m, ")");
    }

    public j5d(String str, String str2, String str3, int i2, Set set, boolean z, boolean z2, List list, Long l2, Map map, List list2, Set set2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = set;
        this.f = z;
        this.g = z2;
        this.h = list;
        this.i = l2;
        this.j = map;
        this.k = list2;
        this.l = set2;
        this.m = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j5d(defpackage.zx5 r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.CharSequence r1 = r0.b
            java.lang.String r4 = r1.toString()
            java.util.List r13 = r0.z0
            java.util.Set r14 = r0.A0
            java.lang.String r3 = r0.a
            java.lang.String r5 = r0.c
            int r6 = r0.o
            java.util.Set r7 = r0.w
            boolean r8 = r0.y
            boolean r9 = r0.X
            java.util.List r10 = r0.w0
            java.lang.Long r11 = r0.x0
            java.util.Map r12 = r0.y0
            r15 = 4096(0x1000, float:5.74E-42)
            r2 = r16
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (int) r6, (java.util.Set) r7, (boolean) r8, (boolean) r9, (java.util.List) r10, (java.lang.Long) r11, (java.util.Map) r12, (java.util.List) r13, (java.util.Set) r14, (int) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5d.<init>(zx5):void");
    }
}
