package defpackage;

import java.util.ArrayList;

/* renamed from: rv9  reason: default package */
public final class rv9 extends ibf {
    public ArrayList c;
    public ud9 o;
    public rd9 v;
    public Long w;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: rd9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.pf9 r8, java.lang.String r9) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x0103
            int r0 = r9.hashCode()
            r1 = 1
            r2 = 0
            java.lang.String r3 = "payloadCatching catch error"
            java.lang.String r4 = "ServerPayload/PayloadCatching"
            switch(r0) {
                case -1716357513: goto L_0x00f3;
                case -1370485892: goto L_0x00b2;
                case -1122997398: goto L_0x005a;
                case -1081306054: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0103
        L_0x0011:
            java.lang.String r0 = "marker"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x001b
            goto L_0x0103
        L_0x001b:
            r5 = 0
            long r8 = defpackage.ryg.d0(r8, r5)     // Catch:{ all -> 0x0026 }
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0026 }
            goto L_0x0056
        L_0x0026:
            r8 = move-exception
            defpackage.z68.o(r4, r3, r8)
            java.util.concurrent.CopyOnWriteArraySet r9 = defpackage.ytd.a
            java.util.Iterator r9 = r9.iterator()
        L_0x0030:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r9.next()
            xm r0 = (defpackage.xm) r0
            r0.a(r8)
            goto L_0x0030
        L_0x0040:
            gga r9 = defpackage.xtd.a
            r9.getClass()
            xtd r9 = defpackage.xtd.b
            int r9 = r9.ordinal()
            if (r9 == 0) goto L_0x0056
            if (r9 == r1) goto L_0x0055
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x0055:
            throw r8
        L_0x0056:
            r7.w = r2
            goto L_0x0106
        L_0x005a:
            java.lang.String r0 = "reactions"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0064
            goto L_0x0103
        L_0x0064:
            r9 = 0
            int r0 = defpackage.ryg.X(r8)     // Catch:{ all -> 0x006a }
            goto L_0x009b
        L_0x006a:
            r0 = move-exception
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r2 = defpackage.ytd.a
            java.util.Iterator r2 = r2.iterator()
        L_0x0074:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = r2.next()
            xm r3 = (defpackage.xm) r3
            r3.a(r0)
            goto L_0x0074
        L_0x0084:
            gga r2 = defpackage.xtd.a
            r2.getClass()
            xtd r2 = defpackage.xtd.b
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x009a
            if (r2 == r1) goto L_0x0099
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x0099:
            throw r0
        L_0x009a:
            r0 = r9
        L_0x009b:
            if (r0 != 0) goto L_0x009e
            return
        L_0x009e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x00a3:
            if (r9 >= r0) goto L_0x00af
            rd9 r2 = defpackage.qd9.a(r8)
            r1.add(r2)
            int r9 = r9 + 1
            goto L_0x00a3
        L_0x00af:
            r7.c = r1
            goto L_0x0106
        L_0x00b2:
            java.lang.String r0 = "yourReaction"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00bb
            goto L_0x0103
        L_0x00bb:
            rd9 r2 = defpackage.qd9.a(r8)     // Catch:{ all -> 0x00c0 }
            goto L_0x00f0
        L_0x00c0:
            r8 = move-exception
            defpackage.z68.o(r4, r3, r8)
            java.util.concurrent.CopyOnWriteArraySet r9 = defpackage.ytd.a
            java.util.Iterator r9 = r9.iterator()
        L_0x00ca:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00da
            java.lang.Object r0 = r9.next()
            xm r0 = (defpackage.xm) r0
            r0.a(r8)
            goto L_0x00ca
        L_0x00da:
            gga r9 = defpackage.xtd.a
            r9.getClass()
            xtd r9 = defpackage.xtd.b
            int r9 = r9.ordinal()
            if (r9 == 0) goto L_0x00f0
            if (r9 == r1) goto L_0x00ef
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x00ef:
            throw r8
        L_0x00f0:
            r7.v = r2
            goto L_0x0106
        L_0x00f3:
            java.lang.String r0 = "reactionInfo"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00fc
            goto L_0x0103
        L_0x00fc:
            ud9 r8 = defpackage.td9.a(r8)
            r7.o = r8
            goto L_0x0106
        L_0x0103:
            r8.A()
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv9.c(pf9, java.lang.String):void");
    }

    public final String toString() {
        ArrayList arrayList = this.c;
        String p = arrayList != null ? CollectionsKt___CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new oo9(1), 31, (Object) null) : null;
        ud9 ud9 = this.o;
        rd9 rd9 = this.v;
        Long l = this.w;
        return "MsgGetDetailedReactionsCmd, reactions = " + p + " + " + ud9 + " + " + rd9 + " + " + l;
    }
}
