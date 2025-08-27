package defpackage;

import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* renamed from: lba  reason: default package */
public final class lba implements c43 {
    public static final lba a = new Object();
    public static final /* synthetic */ KProperty[] b = {Reflection.mutableProperty0(new MutablePropertyReference0Impl(lba.class, "message", "<v#0>", 0))};

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ibf p(defpackage.pf9 r23) {
        /*
            r22 = this;
            r1 = r23
            r2 = 1
            java.lang.String r3 = "payloadCatching catch error"
            java.lang.String r4 = "ServerPayload/PayloadCatching"
            boolean r0 = r23.m()
            if (r0 != 0) goto L_0x0010
        L_0x000d:
            r5 = 0
            goto L_0x026d
        L_0x0010:
            int r0 = defpackage.ryg.e0(r23)     // Catch:{ all -> 0x0016 }
            r7 = r0
            goto L_0x0048
        L_0x0016:
            r0 = move-exception
            r7 = r0
            defpackage.z68.o(r4, r3, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0031
            java.lang.Object r8 = r0.next()
            xm r8 = (defpackage.xm) r8
            r8.a(r7)
            goto L_0x0021
        L_0x0031:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0047
            if (r0 == r2) goto L_0x0046
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0046:
            throw r7
        L_0x0047:
            r7 = 0
        L_0x0048:
            if (r7 != 0) goto L_0x004b
            goto L_0x000d
        L_0x004b:
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            kotlin.properties.Delegates r0 = kotlin.properties.Delegates.INSTANCE
            kotlin.properties.ReadWriteProperty r9 = r0.notNull()
            r10 = 0
            r14 = r10
            r19 = r14
            r12 = 0
            r18 = 0
            r21 = 0
        L_0x0060:
            kotlin.reflect.KProperty[] r13 = b
            if (r12 >= r7) goto L_0x0254
            java.lang.String r0 = defpackage.ryg.g0(r23)     // Catch:{ all -> 0x0069 }
            goto L_0x009d
        L_0x0069:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0074:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x0086
            java.lang.Object r16 = r0.next()
            r6 = r16
            xm r6 = (defpackage.xm) r6
            r6.a(r5)
            goto L_0x0074
        L_0x0086:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x009c
            if (r0 == r2) goto L_0x009b
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x009b:
            throw r5
        L_0x009c:
            r0 = 0
        L_0x009d:
            if (r0 != 0) goto L_0x00a1
            goto L_0x0251
        L_0x00a1:
            int r5 = r0.hashCode()
            switch(r5) {
                case -1901805651: goto L_0x01d8;
                case -1361631597: goto L_0x0194;
                case 115180: goto L_0x014d;
                case 3052376: goto L_0x0108;
                case 954925063: goto L_0x00f1;
                case 1075866255: goto L_0x00aa;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            goto L_0x01e0
        L_0x00aa:
            java.lang.String r5 = "prevMessageId"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00b4
            goto L_0x01e0
        L_0x00b4:
            long r5 = defpackage.ryg.d0(r1, r10)     // Catch:{ all -> 0x00bc }
            r19 = r5
            goto L_0x0251
        L_0x00bc:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00c7:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x00d7
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r5)
            goto L_0x00c7
        L_0x00d7:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x00ed
            if (r0 == r2) goto L_0x00ec
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ec:
            throw r5
        L_0x00ed:
            r19 = r10
            goto L_0x0251
        L_0x00f1:
            java.lang.String r5 = "message"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00fb
            goto L_0x01e0
        L_0x00fb:
            b89 r0 = defpackage.z79.a(r23)
            r5 = 0
            r6 = r13[r5]
            r5 = 0
            r9.setValue(r5, r6, r0)
            goto L_0x0251
        L_0x0108:
            java.lang.String r5 = "chat"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0112
            goto L_0x01e0
        L_0x0112:
            b32 r5 = defpackage.b32.a(r23)     // Catch:{ all -> 0x0117 }
            goto L_0x0149
        L_0x0117:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0122:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0132
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r5)
            goto L_0x0122
        L_0x0132:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0148
            if (r0 == r2) goto L_0x0147
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0147:
            throw r5
        L_0x0148:
            r5 = 0
        L_0x0149:
            r8.element = r5
            goto L_0x0251
        L_0x014d:
            java.lang.String r5 = "ttl"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0157
            goto L_0x01e0
        L_0x0157:
            boolean r0 = defpackage.ryg.Y(r23)     // Catch:{ all -> 0x015f }
            r21 = r0
            goto L_0x0251
        L_0x015f:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x016a:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x017a
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r5)
            goto L_0x016a
        L_0x017a:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0190
            if (r0 == r2) goto L_0x018f
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x018f:
            throw r5
        L_0x0190:
            r21 = 0
            goto L_0x0251
        L_0x0194:
            java.lang.String r5 = "chatId"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x019d
            goto L_0x01e0
        L_0x019d:
            long r5 = defpackage.ryg.d0(r1, r10)     // Catch:{ all -> 0x01a4 }
            r14 = r5
            goto L_0x0251
        L_0x01a4:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01af:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x01bf
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r5)
            goto L_0x01af
        L_0x01bf:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01d5
            if (r0 == r2) goto L_0x01d4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01d4:
            throw r5
        L_0x01d5:
            r14 = r10
            goto L_0x0251
        L_0x01d8:
            java.lang.String r5 = "invisible"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0217
        L_0x01e0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r23.A()     // Catch:{ all -> 0x01e6 }
            goto L_0x0251
        L_0x01e6:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01f1:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0201
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r5)
            goto L_0x01f1
        L_0x0201:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0251
            if (r0 == r2) goto L_0x0216
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0216:
            throw r5
        L_0x0217:
            boolean r0 = defpackage.ryg.Y(r23)     // Catch:{ all -> 0x021e }
            r18 = r0
            goto L_0x0251
        L_0x021e:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0229:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0239
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r5)
            goto L_0x0229
        L_0x0239:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x024f
            if (r0 == r2) goto L_0x024e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x024e:
            throw r5
        L_0x024f:
            r18 = 0
        L_0x0251:
            int r12 = r12 + r2
            goto L_0x0060
        L_0x0254:
            kba r0 = new kba
            T r1 = r8.element
            r16 = r1
            b32 r16 = (defpackage.b32) r16
            r1 = 0
            r1 = r13[r1]
            r2 = 0
            java.lang.Object r1 = r9.getValue(r2, r1)
            r17 = r1
            b89 r17 = (defpackage.b89) r17
            r13 = r0
            r13.<init>(r14, r16, r17, r18, r19, r21)
            r5 = r0
        L_0x026d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lba.p(pf9):ibf");
    }
}
