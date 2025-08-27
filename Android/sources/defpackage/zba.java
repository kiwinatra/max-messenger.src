package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zba  reason: default package */
public final class zba extends ibf {
    public final long c;
    public final long o;
    public final int v;
    public final List w;

    public zba(int i, long j, long j2, List list) {
        this.c = j;
        this.o = j2;
        this.v = i;
        this.w = list;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.zba d(defpackage.pf9 r23) {
        /*
            r1 = r23
            r2 = 1
            java.lang.String r3 = "payloadCatching catch error"
            java.lang.String r4 = "ServerPayload/PayloadCatching"
            boolean r0 = r23.m()
            if (r0 != 0) goto L_0x0010
        L_0x000d:
            r5 = 0
            goto L_0x0259
        L_0x0010:
            r6 = 0
            int r0 = defpackage.ryg.e0(r23)     // Catch:{ all -> 0x0017 }
            r7 = r0
            goto L_0x0049
        L_0x0017:
            r0 = move-exception
            r7 = r0
            defpackage.z68.o(r4, r3, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0032
            java.lang.Object r8 = r0.next()
            xm r8 = (defpackage.xm) r8
            r8.a(r7)
            goto L_0x0022
        L_0x0032:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0048
            if (r0 == r2) goto L_0x0047
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0047:
            throw r7
        L_0x0048:
            r7 = r6
        L_0x0049:
            if (r7 != 0) goto L_0x004c
            goto L_0x000d
        L_0x004c:
            kotlin.jvm.internal.Ref$LongRef r8 = new kotlin.jvm.internal.Ref$LongRef
            r8.<init>()
            kotlin.jvm.internal.Ref$LongRef r9 = new kotlin.jvm.internal.Ref$LongRef
            r9.<init>()
            kotlin.jvm.internal.Ref$IntRef r10 = new kotlin.jvm.internal.Ref$IntRef
            r10.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r11.element = r0
            r12 = r6
        L_0x0067:
            if (r12 >= r7) goto L_0x0240
            java.lang.String r0 = defpackage.ryg.g0(r23)     // Catch:{ all -> 0x006e }
            goto L_0x00a0
        L_0x006e:
            r0 = move-exception
            r13 = r0
            defpackage.z68.o(r4, r3, r13)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0079:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0089
            java.lang.Object r14 = r0.next()
            xm r14 = (defpackage.xm) r14
            r14.a(r13)
            goto L_0x0079
        L_0x0089:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x009f
            if (r0 == r2) goto L_0x009e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x009e:
            throw r13
        L_0x009f:
            r0 = 0
        L_0x00a0:
            if (r0 != 0) goto L_0x00a4
            goto L_0x023d
        L_0x00a4:
            int r13 = r0.hashCode()
            r14 = 0
            switch(r13) {
                case -1440013438: goto L_0x01ba;
                case -1361631597: goto L_0x016c;
                case -731385813: goto L_0x011d;
                case -372020745: goto L_0x00af;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            goto L_0x01c2
        L_0x00af:
            java.lang.String r13 = "counters"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x00b9
            goto L_0x01c2
        L_0x00b9:
            java.util.List r13 = kotlin.collections.CollectionsKt.emptyList()
            hb9 r0 = r23.n()     // Catch:{ all -> 0x00e9 }
            int r0 = r0.a()     // Catch:{ all -> 0x00e9 }
            r14 = 7
            if (r0 != r14) goto L_0x00dd
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00e9 }
            r0.<init>()     // Catch:{ all -> 0x00e9 }
            int r14 = r23.t0()     // Catch:{ all -> 0x00e9 }
            r15 = r6
        L_0x00d2:
            if (r15 >= r14) goto L_0x00e1
            pd9 r5 = defpackage.od9.a(r23)     // Catch:{ all -> 0x00e9 }
            r0.add(r5)     // Catch:{ all -> 0x00e9 }
            int r15 = r15 + r2
            goto L_0x00d2
        L_0x00dd:
            r23.A()     // Catch:{ all -> 0x00e9 }
            r0 = 0
        L_0x00e1:
            if (r0 != 0) goto L_0x00e7
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ all -> 0x00e9 }
        L_0x00e7:
            r13 = r0
            goto L_0x0119
        L_0x00e9:
            r0 = move-exception
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r5 = defpackage.ytd.a
            java.util.Iterator r5 = r5.iterator()
        L_0x00f3:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x0103
            java.lang.Object r14 = r5.next()
            xm r14 = (defpackage.xm) r14
            r14.a(r0)
            goto L_0x00f3
        L_0x0103:
            gga r5 = defpackage.xtd.a
            r5.getClass()
            xtd r5 = defpackage.xtd.b
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0119
            if (r5 == r2) goto L_0x0118
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0118:
            throw r0
        L_0x0119:
            r11.element = r13
            goto L_0x023d
        L_0x011d:
            java.lang.String r5 = "totalCount"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0127
            goto L_0x01c2
        L_0x0127:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            int r0 = defpackage.ryg.c0(r23)     // Catch:{ all -> 0x0134 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0134 }
            goto L_0x0164
        L_0x0134:
            r0 = move-exception
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r13 = defpackage.ytd.a
            java.util.Iterator r13 = r13.iterator()
        L_0x013e:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x014e
            java.lang.Object r14 = r13.next()
            xm r14 = (defpackage.xm) r14
            r14.a(r0)
            goto L_0x013e
        L_0x014e:
            gga r13 = defpackage.xtd.a
            r13.getClass()
            xtd r13 = defpackage.xtd.b
            int r13 = r13.ordinal()
            if (r13 == 0) goto L_0x0164
            if (r13 == r2) goto L_0x0163
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0163:
            throw r0
        L_0x0164:
            int r0 = r5.intValue()
            r10.element = r0
            goto L_0x023d
        L_0x016c:
            java.lang.String r5 = "chatId"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0175
            goto L_0x01c2
        L_0x0175:
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            long r13 = defpackage.ryg.d0(r1, r14)     // Catch:{ all -> 0x0182 }
            java.lang.Long r5 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0182 }
            goto L_0x01b2
        L_0x0182:
            r0 = move-exception
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r13 = defpackage.ytd.a
            java.util.Iterator r13 = r13.iterator()
        L_0x018c:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x019c
            java.lang.Object r14 = r13.next()
            xm r14 = (defpackage.xm) r14
            r14.a(r0)
            goto L_0x018c
        L_0x019c:
            gga r13 = defpackage.xtd.a
            r13.getClass()
            xtd r13 = defpackage.xtd.b
            int r13 = r13.ordinal()
            if (r13 == 0) goto L_0x01b2
            if (r13 == r2) goto L_0x01b1
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01b1:
            throw r0
        L_0x01b2:
            long r13 = r5.longValue()
            r8.element = r13
            goto L_0x023d
        L_0x01ba:
            java.lang.String r5 = "messageId"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x01fa
        L_0x01c2:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r23.A()     // Catch:{ all -> 0x01c9 }
            goto L_0x023d
        L_0x01c9:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01d4:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x01e4
            java.lang.Object r13 = r0.next()
            xm r13 = (defpackage.xm) r13
            r13.a(r5)
            goto L_0x01d4
        L_0x01e4:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x023d
            if (r0 == r2) goto L_0x01f9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01f9:
            throw r5
        L_0x01fa:
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            long r13 = defpackage.ryg.d0(r1, r14)     // Catch:{ all -> 0x0207 }
            java.lang.Long r5 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0207 }
            goto L_0x0237
        L_0x0207:
            r0 = move-exception
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r13 = defpackage.ytd.a
            java.util.Iterator r13 = r13.iterator()
        L_0x0211:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0221
            java.lang.Object r14 = r13.next()
            xm r14 = (defpackage.xm) r14
            r14.a(r0)
            goto L_0x0211
        L_0x0221:
            gga r13 = defpackage.xtd.a
            r13.getClass()
            xtd r13 = defpackage.xtd.b
            int r13 = r13.ordinal()
            if (r13 == 0) goto L_0x0237
            if (r13 == r2) goto L_0x0236
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0236:
            throw r0
        L_0x0237:
            long r13 = r5.longValue()
            r9.element = r13
        L_0x023d:
            int r12 = r12 + r2
            goto L_0x0067
        L_0x0240:
            zba r5 = new zba
            long r0 = r8.element
            long r2 = r9.element
            int r4 = r10.element
            T r6 = r11.element
            r22 = r6
            java.util.List r22 = (java.util.List) r22
            r16 = r5
            r17 = r4
            r18 = r0
            r20 = r2
            r16.<init>(r17, r18, r20, r22)
        L_0x0259:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zba.d(pf9):zba");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zba)) {
            return false;
        }
        zba zba = (zba) obj;
        return this.c == zba.c && this.o == zba.o && this.v == zba.v && Intrinsics.areEqual((Object) this.w, (Object) zba.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + rae.h(this.v, wzf.i(Long.hashCode(this.c) * 31, 31, this.o), 31);
    }

    public final String toString() {
        int size = this.w.size();
        return "{chatId=" + this.c + ", messageId=" + this.o + ", totalCount=" + this.v + ", counters count=" + size + " }";
    }
}
