package defpackage;

import java.util.concurrent.Callable;

/* renamed from: qne  reason: default package */
public final class qne implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7d b;
    public final /* synthetic */ rne c;

    public /* synthetic */ qne(rne rne, d7d d7d, int i) {
        this.a = i;
        this.c = rne;
        this.b = d7d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r7v1, types: [hme] */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r13 = this;
            int r0 = r13.a
            switch(r0) {
                case 0: goto L_0x0110;
                case 1: goto L_0x0083;
                case 2: goto L_0x0044;
                default: goto L_0x0005;
            }
        L_0x0005:
            rne r0 = r13.c
            i6d r0 = r0.a
            d7d r13 = r13.b
            r1 = 0
            android.database.Cursor r0 = r0.o(r13, r1)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0034 }
            int r3 = r0.getCount()     // Catch:{ all -> 0x0034 }
            r2.<init>(r3)     // Catch:{ all -> 0x0034 }
        L_0x0019:
            boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0036
            r3 = 0
            boolean r4 = r0.isNull(r3)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x0028
            r3 = r1
            goto L_0x0030
        L_0x0028:
            long r3 = r0.getLong(r3)     // Catch:{ all -> 0x0034 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0034 }
        L_0x0030:
            r2.add(r3)     // Catch:{ all -> 0x0034 }
            goto L_0x0019
        L_0x0034:
            r1 = move-exception
            goto L_0x003d
        L_0x0036:
            r0.close()
            r13.o()
            return r2
        L_0x003d:
            r0.close()
            r13.o()
            throw r1
        L_0x0044:
            rne r0 = r13.c
            i6d r0 = r0.a
            d7d r13 = r13.b
            r1 = 0
            android.database.Cursor r0 = r0.o(r13, r1)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0073 }
            int r3 = r0.getCount()     // Catch:{ all -> 0x0073 }
            r2.<init>(r3)     // Catch:{ all -> 0x0073 }
        L_0x0058:
            boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x0073 }
            if (r3 == 0) goto L_0x0075
            r3 = 0
            boolean r4 = r0.isNull(r3)     // Catch:{ all -> 0x0073 }
            if (r4 == 0) goto L_0x0067
            r3 = r1
            goto L_0x006f
        L_0x0067:
            long r3 = r0.getLong(r3)     // Catch:{ all -> 0x0073 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0073 }
        L_0x006f:
            r2.add(r3)     // Catch:{ all -> 0x0073 }
            goto L_0x0058
        L_0x0073:
            r1 = move-exception
            goto L_0x007c
        L_0x0075:
            r0.close()
            r13.o()
            return r2
        L_0x007c:
            r0.close()
            r13.o()
            throw r1
        L_0x0083:
            rne r0 = r13.c
            i6d r0 = r0.a
            d7d r13 = r13.b
            r1 = 0
            android.database.Cursor r0 = r0.o(r13, r1)
            java.lang.String r2 = "id"
            int r2 = defpackage.kne.u(r0, r2)     // Catch:{ all -> 0x0100 }
            java.lang.String r3 = "status"
            int r3 = defpackage.kne.u(r0, r3)     // Catch:{ all -> 0x0100 }
            java.lang.String r4 = "entry"
            int r4 = defpackage.kne.u(r0, r4)     // Catch:{ all -> 0x0100 }
            java.lang.String r5 = "isCritical"
            int r5 = defpackage.kne.u(r0, r5)     // Catch:{ all -> 0x0100 }
            boolean r6 = r0.moveToFirst()     // Catch:{ all -> 0x0100 }
            if (r6 == 0) goto L_0x0102
            long r8 = r0.getLong(r2)     // Catch:{ all -> 0x0100 }
            int r2 = r0.getInt(r3)     // Catch:{ all -> 0x0100 }
            sx6 r3 = defpackage.r78.b     // Catch:{ all -> 0x0100 }
            r3.getClass()     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x00dc
            r3 = 10
            if (r2 != r3) goto L_0x00c3
            r78 r2 = defpackage.r78.SENDING     // Catch:{ all -> 0x0100 }
        L_0x00c1:
            r11 = r2
            goto L_0x00df
        L_0x00c3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0100 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0100 }
            java.lang.String r4 = "No such value "
            r3.<init>(r4)     // Catch:{ all -> 0x0100 }
            r3.append(r2)     // Catch:{ all -> 0x0100 }
            java.lang.String r2 = " for LogEntryStatus"
            r3.append(r2)     // Catch:{ all -> 0x0100 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0100 }
            r1.<init>(r2)     // Catch:{ all -> 0x0100 }
            throw r1     // Catch:{ all -> 0x0100 }
        L_0x00dc:
            r78 r2 = defpackage.r78.WAITING     // Catch:{ all -> 0x0100 }
            goto L_0x00c1
        L_0x00df:
            boolean r2 = r0.isNull(r4)     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x00e6
            goto L_0x00ea
        L_0x00e6:
            byte[] r1 = r0.getBlob(r4)     // Catch:{ all -> 0x0100 }
        L_0x00ea:
            n78 r10 = defpackage.yne.a(r1)     // Catch:{ all -> 0x0100 }
            int r1 = r0.getInt(r5)     // Catch:{ all -> 0x0100 }
            if (r1 == 0) goto L_0x00f7
            r1 = 1
        L_0x00f5:
            r12 = r1
            goto L_0x00f9
        L_0x00f7:
            r1 = 0
            goto L_0x00f5
        L_0x00f9:
            hme r1 = new hme     // Catch:{ all -> 0x0100 }
            r7 = r1
            r7.<init>(r8, r10, r11, r12)     // Catch:{ all -> 0x0100 }
            goto L_0x0102
        L_0x0100:
            r1 = move-exception
            goto L_0x0109
        L_0x0102:
            r0.close()
            r13.o()
            return r1
        L_0x0109:
            r0.close()
            r13.o()
            throw r1
        L_0x0110:
            rne r0 = r13.c
            i6d r0 = r0.a
            d7d r13 = r13.b
            r1 = 0
            android.database.Cursor r0 = r0.o(r13, r1)
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x0132 }
            if (r2 == 0) goto L_0x0134
            r2 = 0
            boolean r3 = r0.isNull(r2)     // Catch:{ all -> 0x0132 }
            if (r3 == 0) goto L_0x0129
            goto L_0x0134
        L_0x0129:
            long r1 = r0.getLong(r2)     // Catch:{ all -> 0x0132 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0132 }
            goto L_0x0134
        L_0x0132:
            r1 = move-exception
            goto L_0x013b
        L_0x0134:
            r0.close()
            r13.o()
            return r1
        L_0x013b:
            r0.close()
            r13.o()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qne.call():java.lang.Object");
    }
}
