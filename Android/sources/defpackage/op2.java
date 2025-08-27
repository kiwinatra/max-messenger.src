package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: op2  reason: default package */
public final class op2 extends ibf {
    public final List c;
    public final boolean o;
    public final Long v;

    public op2(Long l, List list, boolean z) {
        this.c = list;
        this.o = z;
        this.v = l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0113, code lost:
        if (r9 >= 0) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0146, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0147, code lost:
        r8.element = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.op2 d(defpackage.pf9 r14) {
        /*
            r0 = 1
            java.lang.String r1 = "payloadCatching catch error"
            java.lang.String r2 = "ServerPayload/PayloadCatching"
            boolean r3 = r14.m()
            r4 = 0
            if (r3 != 0) goto L_0x000e
            goto L_0x01d6
        L_0x000e:
            r3 = 0
            int r5 = defpackage.ryg.e0(r14)     // Catch:{ all -> 0x0014 }
            goto L_0x0045
        L_0x0014:
            r5 = move-exception
            defpackage.z68.o(r2, r1, r5)
            java.util.concurrent.CopyOnWriteArraySet r6 = defpackage.ytd.a
            java.util.Iterator r6 = r6.iterator()
        L_0x001e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x002e
            java.lang.Object r7 = r6.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r5)
            goto L_0x001e
        L_0x002e:
            gga r6 = defpackage.xtd.a
            r6.getClass()
            xtd r6 = defpackage.xtd.b
            int r6 = r6.ordinal()
            if (r6 == 0) goto L_0x0044
            if (r6 == r0) goto L_0x0043
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x0043:
            throw r5
        L_0x0044:
            r5 = r3
        L_0x0045:
            if (r5 != 0) goto L_0x0049
            goto L_0x01d6
        L_0x0049:
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            r6.element = r7
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
        L_0x005e:
            if (r3 >= r5) goto L_0x01c7
            java.lang.String r9 = defpackage.ryg.g0(r14)     // Catch:{ all -> 0x0065 }
            goto L_0x0096
        L_0x0065:
            r9 = move-exception
            defpackage.z68.o(r2, r1, r9)
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.ytd.a
            java.util.Iterator r10 = r10.iterator()
        L_0x006f:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x007f
            java.lang.Object r11 = r10.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r9)
            goto L_0x006f
        L_0x007f:
            gga r10 = defpackage.xtd.a
            r10.getClass()
            xtd r10 = defpackage.xtd.b
            int r10 = r10.ordinal()
            if (r10 == 0) goto L_0x0095
            if (r10 == r0) goto L_0x0094
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x0094:
            throw r9
        L_0x0095:
            r9 = r4
        L_0x0096:
            if (r9 != 0) goto L_0x009a
            goto L_0x01c4
        L_0x009a:
            int r10 = r9.hashCode()
            r11 = -1950992144(0xffffffff8bb638f0, float:-7.018952E-32)
            if (r10 == r11) goto L_0x014b
            r11 = -1081306054(0xffffffffbf8c943a, float:-1.0982735)
            if (r10 == r11) goto L_0x00fc
            r11 = 696739087(0x2987650f, float:6.012735E-14)
            if (r10 == r11) goto L_0x00af
            goto L_0x0153
        L_0x00af:
            java.lang.String r10 = "hasMore"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00b9
            goto L_0x0153
        L_0x00b9:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            boolean r10 = defpackage.ryg.Y(r14)     // Catch:{ all -> 0x00c4 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x00c4 }
            goto L_0x00f4
        L_0x00c4:
            r10 = move-exception
            defpackage.z68.o(r2, r1, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = defpackage.ytd.a
            java.util.Iterator r11 = r11.iterator()
        L_0x00ce:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00de
            java.lang.Object r12 = r11.next()
            xm r12 = (defpackage.xm) r12
            r12.a(r10)
            goto L_0x00ce
        L_0x00de:
            gga r11 = defpackage.xtd.a
            r11.getClass()
            xtd r11 = defpackage.xtd.b
            int r11 = r11.ordinal()
            if (r11 == 0) goto L_0x00f4
            if (r11 == r0) goto L_0x00f3
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x00f3:
            throw r10
        L_0x00f4:
            boolean r9 = r9.booleanValue()
            r7.element = r9
            goto L_0x01c4
        L_0x00fc:
            java.lang.String r10 = "marker"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0105
            goto L_0x0153
        L_0x0105:
            r9 = -1
            long r9 = defpackage.ryg.d0(r14, r9)     // Catch:{ all -> 0x0116 }
            java.lang.Long r11 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0116 }
            r12 = 0
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 < 0) goto L_0x0146
            goto L_0x0147
        L_0x0116:
            r9 = move-exception
            defpackage.z68.o(r2, r1, r9)
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.ytd.a
            java.util.Iterator r10 = r10.iterator()
        L_0x0120:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0130
            java.lang.Object r11 = r10.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r9)
            goto L_0x0120
        L_0x0130:
            gga r10 = defpackage.xtd.a
            r10.getClass()
            xtd r10 = defpackage.xtd.b
            int r10 = r10.ordinal()
            if (r10 == 0) goto L_0x0146
            if (r10 == r0) goto L_0x0145
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x0145:
            throw r9
        L_0x0146:
            r11 = r4
        L_0x0147:
            r8.element = r11
            goto L_0x01c4
        L_0x014b:
            java.lang.String r10 = "commonChats"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0189
        L_0x0153:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            r14.A()     // Catch:{ all -> 0x0159 }
            goto L_0x01c4
        L_0x0159:
            r9 = move-exception
            defpackage.z68.o(r2, r1, r9)
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.ytd.a
            java.util.Iterator r10 = r10.iterator()
        L_0x0163:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0173
            java.lang.Object r11 = r10.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r9)
            goto L_0x0163
        L_0x0173:
            gga r10 = defpackage.xtd.a
            r10.getClass()
            xtd r10 = defpackage.xtd.b
            int r10 = r10.ordinal()
            if (r10 == 0) goto L_0x01c4
            if (r10 == r0) goto L_0x0188
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x0188:
            throw r9
        L_0x0189:
            java.util.List r9 = kotlin.collections.CollectionsKt.emptyList()
            a00 r9 = defpackage.a00.d(r14)     // Catch:{ all -> 0x0192 }
            goto L_0x01c2
        L_0x0192:
            r10 = move-exception
            defpackage.z68.o(r2, r1, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = defpackage.ytd.a
            java.util.Iterator r11 = r11.iterator()
        L_0x019c:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01ac
            java.lang.Object r12 = r11.next()
            xm r12 = (defpackage.xm) r12
            r12.a(r10)
            goto L_0x019c
        L_0x01ac:
            gga r11 = defpackage.xtd.a
            r11.getClass()
            xtd r11 = defpackage.xtd.b
            int r11 = r11.ordinal()
            if (r11 == 0) goto L_0x01c2
            if (r11 == r0) goto L_0x01c1
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x01c1:
            throw r10
        L_0x01c2:
            r6.element = r9
        L_0x01c4:
            int r3 = r3 + r0
            goto L_0x005e
        L_0x01c7:
            op2 r4 = new op2
            T r14 = r6.element
            java.util.List r14 = (java.util.List) r14
            boolean r0 = r7.element
            T r1 = r8.element
            java.lang.Long r1 = (java.lang.Long) r1
            r4.<init>(r1, r14, r0)
        L_0x01d6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op2.d(pf9):op2");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op2)) {
            return false;
        }
        op2 op2 = (op2) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) op2.c) && this.o == op2.o && Intrinsics.areEqual((Object) this.v, (Object) op2.v);
    }

    public final int hashCode() {
        int e = g63.e(this.c.hashCode() * 31, 31, this.o);
        Long l = this.v;
        return e + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Response(commonChats=" + this.c + ", hasMore=" + this.o + ", marker=" + this.v + ")";
    }
}
