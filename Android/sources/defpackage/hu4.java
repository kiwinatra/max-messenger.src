package defpackage;

import java.util.concurrent.Callable;

/* renamed from: hu4  reason: default package */
public final class hu4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7d b;
    public final /* synthetic */ iu4 c;

    public /* synthetic */ hu4(iu4 iu4, d7d d7d, int i) {
        this.a = i;
        this.c = iu4;
        this.b = d7d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r12v8, types: [i20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v24, types: [i20, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x00fe;
                default: goto L_0x0007;
            }
        L_0x0007:
            iu4 r1 = r0.c
            i6d r1 = r1.a
            d7d r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "path"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = "last_modified"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r4 = "upload_type"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = "chat_id"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = "attach_id"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = "video_quality"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x00ad }
            java.lang.String r8 = "video_start_trim_position"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x00ad }
            java.lang.String r9 = "video_end_trim_position"
            int r9 = defpackage.kne.u(r1, r9)     // Catch:{ all -> 0x00ad }
            java.lang.String r10 = "mute"
            int r10 = defpackage.kne.u(r1, r10)     // Catch:{ all -> 0x00ad }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x00ad }
            int r12 = r1.getCount()     // Catch:{ all -> 0x00ad }
            r11.<init>(r12)     // Catch:{ all -> 0x00ad }
        L_0x0051:
            boolean r12 = r1.moveToNext()     // Catch:{ all -> 0x00ad }
            if (r12 == 0) goto L_0x00f6
            boolean r12 = r1.isNull(r0)     // Catch:{ all -> 0x00ad }
            if (r12 == 0) goto L_0x005f
            r15 = r2
            goto L_0x0064
        L_0x005f:
            java.lang.String r12 = r1.getString(r0)     // Catch:{ all -> 0x00ad }
            r15 = r12
        L_0x0064:
            long r16 = r1.getLong(r3)     // Catch:{ all -> 0x00ad }
            boolean r12 = r1.isNull(r4)     // Catch:{ all -> 0x00ad }
            if (r12 == 0) goto L_0x0070
            r12 = r2
            goto L_0x0078
        L_0x0070:
            int r12 = r1.getInt(r4)     // Catch:{ all -> 0x00ad }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00ad }
        L_0x0078:
            xyf r18 = defpackage.n54.t(r12)     // Catch:{ all -> 0x00ad }
            long r12 = r1.getLong(r5)     // Catch:{ all -> 0x00ad }
            boolean r14 = r1.isNull(r6)     // Catch:{ all -> 0x00ad }
            if (r14 == 0) goto L_0x0088
            r14 = r2
            goto L_0x008c
        L_0x0088:
            java.lang.String r14 = r1.getString(r6)     // Catch:{ all -> 0x00ad }
        L_0x008c:
            tt4 r2 = new tt4     // Catch:{ all -> 0x00ad }
            r2.<init>(r12, r14)     // Catch:{ all -> 0x00ad }
            boolean r12 = r1.isNull(r7)     // Catch:{ all -> 0x00ad }
            if (r12 == 0) goto L_0x00af
            boolean r12 = r1.isNull(r8)     // Catch:{ all -> 0x00ad }
            if (r12 == 0) goto L_0x00af
            boolean r12 = r1.isNull(r9)     // Catch:{ all -> 0x00ad }
            if (r12 == 0) goto L_0x00af
            boolean r12 = r1.isNull(r10)     // Catch:{ all -> 0x00ad }
            if (r12 != 0) goto L_0x00aa
            goto L_0x00af
        L_0x00aa:
            r19 = 0
            goto L_0x00e9
        L_0x00ad:
            r0 = move-exception
            goto L_0x00fa
        L_0x00af:
            i20 r12 = new i20     // Catch:{ all -> 0x00ad }
            r12.<init>()     // Catch:{ all -> 0x00ad }
            boolean r13 = r1.isNull(r7)     // Catch:{ all -> 0x00ad }
            if (r13 == 0) goto L_0x00bc
            r13 = 0
            goto L_0x00c4
        L_0x00bc:
            int r13 = r1.getInt(r7)     // Catch:{ all -> 0x00ad }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00ad }
        L_0x00c4:
            qac[] r14 = defpackage.qac.values()     // Catch:{ all -> 0x00ad }
            int r13 = r13.intValue()     // Catch:{ all -> 0x00ad }
            r13 = r14[r13]     // Catch:{ all -> 0x00ad }
            r12.a = r13     // Catch:{ all -> 0x00ad }
            float r13 = r1.getFloat(r8)     // Catch:{ all -> 0x00ad }
            r12.b = r13     // Catch:{ all -> 0x00ad }
            float r13 = r1.getFloat(r9)     // Catch:{ all -> 0x00ad }
            r12.c = r13     // Catch:{ all -> 0x00ad }
            int r13 = r1.getInt(r10)     // Catch:{ all -> 0x00ad }
            if (r13 == 0) goto L_0x00e4
            r13 = 1
            goto L_0x00e5
        L_0x00e4:
            r13 = 0
        L_0x00e5:
            r12.d = r13     // Catch:{ all -> 0x00ad }
            r19 = r12
        L_0x00e9:
            cu4 r12 = new cu4     // Catch:{ all -> 0x00ad }
            r13 = r12
            r14 = r2
            r13.<init>(r14, r15, r16, r18, r19)     // Catch:{ all -> 0x00ad }
            r11.add(r12)     // Catch:{ all -> 0x00ad }
            r2 = 0
            goto L_0x0051
        L_0x00f6:
            r1.close()
            return r11
        L_0x00fa:
            r1.close()
            throw r0
        L_0x00fe:
            iu4 r1 = r0.c
            i6d r1 = r1.a
            d7d r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "path"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x01a4 }
            java.lang.String r3 = "last_modified"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x01a4 }
            java.lang.String r4 = "upload_type"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x01a4 }
            java.lang.String r5 = "chat_id"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x01a4 }
            java.lang.String r6 = "attach_id"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x01a4 }
            java.lang.String r7 = "video_quality"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x01a4 }
            java.lang.String r8 = "video_start_trim_position"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x01a4 }
            java.lang.String r9 = "video_end_trim_position"
            int r9 = defpackage.kne.u(r1, r9)     // Catch:{ all -> 0x01a4 }
            java.lang.String r10 = "mute"
            int r10 = defpackage.kne.u(r1, r10)     // Catch:{ all -> 0x01a4 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x01a4 }
            int r12 = r1.getCount()     // Catch:{ all -> 0x01a4 }
            r11.<init>(r12)     // Catch:{ all -> 0x01a4 }
        L_0x0148:
            boolean r12 = r1.moveToNext()     // Catch:{ all -> 0x01a4 }
            if (r12 == 0) goto L_0x01ed
            boolean r12 = r1.isNull(r0)     // Catch:{ all -> 0x01a4 }
            if (r12 == 0) goto L_0x0156
            r15 = r2
            goto L_0x015b
        L_0x0156:
            java.lang.String r12 = r1.getString(r0)     // Catch:{ all -> 0x01a4 }
            r15 = r12
        L_0x015b:
            long r16 = r1.getLong(r3)     // Catch:{ all -> 0x01a4 }
            boolean r12 = r1.isNull(r4)     // Catch:{ all -> 0x01a4 }
            if (r12 == 0) goto L_0x0167
            r12 = r2
            goto L_0x016f
        L_0x0167:
            int r12 = r1.getInt(r4)     // Catch:{ all -> 0x01a4 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x01a4 }
        L_0x016f:
            xyf r18 = defpackage.n54.t(r12)     // Catch:{ all -> 0x01a4 }
            long r12 = r1.getLong(r5)     // Catch:{ all -> 0x01a4 }
            boolean r14 = r1.isNull(r6)     // Catch:{ all -> 0x01a4 }
            if (r14 == 0) goto L_0x017f
            r14 = r2
            goto L_0x0183
        L_0x017f:
            java.lang.String r14 = r1.getString(r6)     // Catch:{ all -> 0x01a4 }
        L_0x0183:
            tt4 r2 = new tt4     // Catch:{ all -> 0x01a4 }
            r2.<init>(r12, r14)     // Catch:{ all -> 0x01a4 }
            boolean r12 = r1.isNull(r7)     // Catch:{ all -> 0x01a4 }
            if (r12 == 0) goto L_0x01a6
            boolean r12 = r1.isNull(r8)     // Catch:{ all -> 0x01a4 }
            if (r12 == 0) goto L_0x01a6
            boolean r12 = r1.isNull(r9)     // Catch:{ all -> 0x01a4 }
            if (r12 == 0) goto L_0x01a6
            boolean r12 = r1.isNull(r10)     // Catch:{ all -> 0x01a4 }
            if (r12 != 0) goto L_0x01a1
            goto L_0x01a6
        L_0x01a1:
            r19 = 0
            goto L_0x01e0
        L_0x01a4:
            r0 = move-exception
            goto L_0x01f1
        L_0x01a6:
            i20 r12 = new i20     // Catch:{ all -> 0x01a4 }
            r12.<init>()     // Catch:{ all -> 0x01a4 }
            boolean r13 = r1.isNull(r7)     // Catch:{ all -> 0x01a4 }
            if (r13 == 0) goto L_0x01b3
            r13 = 0
            goto L_0x01bb
        L_0x01b3:
            int r13 = r1.getInt(r7)     // Catch:{ all -> 0x01a4 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x01a4 }
        L_0x01bb:
            qac[] r14 = defpackage.qac.values()     // Catch:{ all -> 0x01a4 }
            int r13 = r13.intValue()     // Catch:{ all -> 0x01a4 }
            r13 = r14[r13]     // Catch:{ all -> 0x01a4 }
            r12.a = r13     // Catch:{ all -> 0x01a4 }
            float r13 = r1.getFloat(r8)     // Catch:{ all -> 0x01a4 }
            r12.b = r13     // Catch:{ all -> 0x01a4 }
            float r13 = r1.getFloat(r9)     // Catch:{ all -> 0x01a4 }
            r12.c = r13     // Catch:{ all -> 0x01a4 }
            int r13 = r1.getInt(r10)     // Catch:{ all -> 0x01a4 }
            if (r13 == 0) goto L_0x01db
            r13 = 1
            goto L_0x01dc
        L_0x01db:
            r13 = 0
        L_0x01dc:
            r12.d = r13     // Catch:{ all -> 0x01a4 }
            r19 = r12
        L_0x01e0:
            cu4 r12 = new cu4     // Catch:{ all -> 0x01a4 }
            r13 = r12
            r14 = r2
            r13.<init>(r14, r15, r16, r18, r19)     // Catch:{ all -> 0x01a4 }
            r11.add(r12)     // Catch:{ all -> 0x01a4 }
            r2 = 0
            goto L_0x0148
        L_0x01ed:
            r1.close()
            return r11
        L_0x01f1:
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu4.call():java.lang.Object");
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
