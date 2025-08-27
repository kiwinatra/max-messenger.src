package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ec1  reason: default package */
public final class ec1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7d b;
    public final /* synthetic */ fc1 c;

    public /* synthetic */ ec1(fc1 fc1, d7d d7d, int i) {
        this.a = i;
        this.c = fc1;
        this.b = d7d;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [jb1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r10 = this;
            int r0 = r10.a
            switch(r0) {
                case 0: goto L_0x0054;
                default: goto L_0x0005;
            }
        L_0x0005:
            fc1 r0 = r10.c
            i6d r0 = r0.a
            d7d r10 = r10.b
            r1 = 0
            android.database.Cursor r10 = r0.o(r10, r1)
            java.lang.String r0 = "conversation_id"
            int r0 = defpackage.kne.u(r10, r0)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "join_link"
            int r2 = defpackage.kne.u(r10, r2)     // Catch:{ all -> 0x004a }
            java.lang.String r3 = "started_at"
            int r3 = defpackage.kne.u(r10, r3)     // Catch:{ all -> 0x004a }
            boolean r4 = r10.moveToFirst()     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x004c
            boolean r4 = r10.isNull(r0)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0030
            r0 = r1
            goto L_0x0034
        L_0x0030:
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x004a }
        L_0x0034:
            boolean r4 = r10.isNull(r2)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            java.lang.String r1 = r10.getString(r2)     // Catch:{ all -> 0x004a }
        L_0x003f:
            long r2 = r10.getLong(r3)     // Catch:{ all -> 0x004a }
            jb1 r4 = new jb1     // Catch:{ all -> 0x004a }
            r4.<init>(r2, r0, r1)     // Catch:{ all -> 0x004a }
            r1 = r4
            goto L_0x004c
        L_0x004a:
            r0 = move-exception
            goto L_0x0050
        L_0x004c:
            r10.close()
            return r1
        L_0x0050:
            r10.close()
            throw r0
        L_0x0054:
            fc1 r0 = r10.c
            i6d r0 = r0.a
            d7d r10 = r10.b
            r1 = 0
            android.database.Cursor r10 = r0.o(r10, r1)
            java.lang.String r0 = "conversation_id"
            int r0 = defpackage.kne.u(r10, r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = "join_link"
            int r2 = defpackage.kne.u(r10, r2)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "started_at"
            int r3 = defpackage.kne.u(r10, r3)     // Catch:{ all -> 0x00a5 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00a5 }
            int r5 = r10.getCount()     // Catch:{ all -> 0x00a5 }
            r4.<init>(r5)     // Catch:{ all -> 0x00a5 }
        L_0x007a:
            boolean r5 = r10.moveToNext()     // Catch:{ all -> 0x00a5 }
            if (r5 == 0) goto L_0x00a7
            boolean r5 = r10.isNull(r0)     // Catch:{ all -> 0x00a5 }
            if (r5 == 0) goto L_0x0088
            r5 = r1
            goto L_0x008c
        L_0x0088:
            java.lang.String r5 = r10.getString(r0)     // Catch:{ all -> 0x00a5 }
        L_0x008c:
            boolean r6 = r10.isNull(r2)     // Catch:{ all -> 0x00a5 }
            if (r6 == 0) goto L_0x0094
            r6 = r1
            goto L_0x0098
        L_0x0094:
            java.lang.String r6 = r10.getString(r2)     // Catch:{ all -> 0x00a5 }
        L_0x0098:
            long r7 = r10.getLong(r3)     // Catch:{ all -> 0x00a5 }
            jb1 r9 = new jb1     // Catch:{ all -> 0x00a5 }
            r9.<init>(r7, r5, r6)     // Catch:{ all -> 0x00a5 }
            r4.add(r9)     // Catch:{ all -> 0x00a5 }
            goto L_0x007a
        L_0x00a5:
            r0 = move-exception
            goto L_0x00ab
        L_0x00a7:
            r10.close()
            return r4
        L_0x00ab:
            r10.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec1.call():java.lang.Object");
    }

    public final void finalize() {
        switch (this.a) {
            case 0:
                this.b.o();
                return;
            default:
                this.b.o();
                return;
        }
    }
}
