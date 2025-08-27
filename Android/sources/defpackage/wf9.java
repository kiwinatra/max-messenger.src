package defpackage;

import java.util.concurrent.Callable;

/* renamed from: wf9  reason: default package */
public final class wf9 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7d b;
    public final /* synthetic */ xf9 c;

    public /* synthetic */ wf9(xf9 xf9, d7d d7d, int i) {
        this.a = i;
        this.c = xf9;
        this.b = d7d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: i20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: i20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: i20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v20, resolved type: i20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: i20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v28, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v23, resolved type: i20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v29, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r13v2, types: [ur1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v0, types: [sf9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v5, types: [i20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v5, types: [ur1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v14, types: [sf9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v16, types: [i20, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00de A[Catch:{ all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4 A[Catch:{ all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f7 A[Catch:{ all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9 A[Catch:{ all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01f3 A[Catch:{ all -> 0x018c }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f9 A[Catch:{ all -> 0x018c }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x020c A[Catch:{ all -> 0x018c }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x020e A[Catch:{ all -> 0x018c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x011c;
                default: goto L_0x0007;
            }
        L_0x0007:
            xf9 r1 = r0.c
            i6d r1 = r1.a
            d7d r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "path"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = "last_modified"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = "upload_type"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "message_id"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x0077 }
            java.lang.String r6 = "chat_id"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = "attach_id"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x0077 }
            java.lang.String r8 = "video_quality"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = "video_start_trim_position"
            int r9 = defpackage.kne.u(r1, r9)     // Catch:{ all -> 0x0077 }
            java.lang.String r10 = "video_end_trim_position"
            int r10 = defpackage.kne.u(r1, r10)     // Catch:{ all -> 0x0077 }
            java.lang.String r11 = "mute"
            int r11 = defpackage.kne.u(r1, r11)     // Catch:{ all -> 0x0077 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0077 }
            int r13 = r1.getCount()     // Catch:{ all -> 0x0077 }
            r12.<init>(r13)     // Catch:{ all -> 0x0077 }
        L_0x0057:
            boolean r13 = r1.moveToNext()     // Catch:{ all -> 0x0077 }
            if (r13 == 0) goto L_0x0114
            ur1 r13 = new ur1     // Catch:{ all -> 0x0077 }
            r13.<init>()     // Catch:{ all -> 0x0077 }
            long r14 = r1.getLong(r5)     // Catch:{ all -> 0x0077 }
            r13.a = r14     // Catch:{ all -> 0x0077 }
            long r14 = r1.getLong(r6)     // Catch:{ all -> 0x0077 }
            r13.b = r14     // Catch:{ all -> 0x0077 }
            boolean r14 = r1.isNull(r7)     // Catch:{ all -> 0x0077 }
            if (r14 == 0) goto L_0x007a
            r13.c = r2     // Catch:{ all -> 0x0077 }
            goto L_0x0080
        L_0x0077:
            r0 = move-exception
            goto L_0x0118
        L_0x007a:
            java.lang.String r14 = r1.getString(r7)     // Catch:{ all -> 0x0077 }
            r13.c = r14     // Catch:{ all -> 0x0077 }
        L_0x0080:
            boolean r14 = r1.isNull(r8)     // Catch:{ all -> 0x0077 }
            if (r14 == 0) goto L_0x009b
            boolean r14 = r1.isNull(r9)     // Catch:{ all -> 0x0077 }
            if (r14 == 0) goto L_0x009b
            boolean r14 = r1.isNull(r10)     // Catch:{ all -> 0x0077 }
            if (r14 == 0) goto L_0x009b
            boolean r14 = r1.isNull(r11)     // Catch:{ all -> 0x0077 }
            if (r14 != 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r14 = r2
            goto L_0x00d3
        L_0x009b:
            i20 r14 = new i20     // Catch:{ all -> 0x0077 }
            r14.<init>()     // Catch:{ all -> 0x0077 }
            boolean r15 = r1.isNull(r8)     // Catch:{ all -> 0x0077 }
            if (r15 == 0) goto L_0x00a8
            r15 = r2
            goto L_0x00b0
        L_0x00a8:
            int r15 = r1.getInt(r8)     // Catch:{ all -> 0x0077 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0077 }
        L_0x00b0:
            qac[] r16 = defpackage.qac.values()     // Catch:{ all -> 0x0077 }
            int r15 = r15.intValue()     // Catch:{ all -> 0x0077 }
            r15 = r16[r15]     // Catch:{ all -> 0x0077 }
            r14.a = r15     // Catch:{ all -> 0x0077 }
            float r15 = r1.getFloat(r9)     // Catch:{ all -> 0x0077 }
            r14.b = r15     // Catch:{ all -> 0x0077 }
            float r15 = r1.getFloat(r10)     // Catch:{ all -> 0x0077 }
            r14.c = r15     // Catch:{ all -> 0x0077 }
            int r15 = r1.getInt(r11)     // Catch:{ all -> 0x0077 }
            if (r15 == 0) goto L_0x00d0
            r15 = 1
            goto L_0x00d1
        L_0x00d0:
            r15 = 0
        L_0x00d1:
            r14.d = r15     // Catch:{ all -> 0x0077 }
        L_0x00d3:
            sf9 r15 = new sf9     // Catch:{ all -> 0x0077 }
            r15.<init>()     // Catch:{ all -> 0x0077 }
            boolean r16 = r1.isNull(r0)     // Catch:{ all -> 0x0077 }
            if (r16 == 0) goto L_0x00e4
            r15.b = r2     // Catch:{ all -> 0x0077 }
        L_0x00e0:
            r2 = r5
            r16 = r6
            goto L_0x00eb
        L_0x00e4:
            java.lang.String r2 = r1.getString(r0)     // Catch:{ all -> 0x0077 }
            r15.b = r2     // Catch:{ all -> 0x0077 }
            goto L_0x00e0
        L_0x00eb:
            long r5 = r1.getLong(r3)     // Catch:{ all -> 0x0077 }
            r15.c = r5     // Catch:{ all -> 0x0077 }
            boolean r5 = r1.isNull(r4)     // Catch:{ all -> 0x0077 }
            if (r5 == 0) goto L_0x00f9
            r5 = 0
            goto L_0x0101
        L_0x00f9:
            int r5 = r1.getInt(r4)     // Catch:{ all -> 0x0077 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0077 }
        L_0x0101:
            xyf r5 = defpackage.n54.t(r5)     // Catch:{ all -> 0x0077 }
            r15.d = r5     // Catch:{ all -> 0x0077 }
            r15.a = r13     // Catch:{ all -> 0x0077 }
            r15.e = r14     // Catch:{ all -> 0x0077 }
            r12.add(r15)     // Catch:{ all -> 0x0077 }
            r5 = r2
            r6 = r16
            r2 = 0
            goto L_0x0057
        L_0x0114:
            r1.close()
            return r12
        L_0x0118:
            r1.close()
            throw r0
        L_0x011c:
            xf9 r1 = r0.c
            i6d r1 = r1.a
            d7d r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "path"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x018c }
            java.lang.String r3 = "last_modified"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x018c }
            java.lang.String r4 = "upload_type"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x018c }
            java.lang.String r5 = "message_id"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x018c }
            java.lang.String r6 = "chat_id"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x018c }
            java.lang.String r7 = "attach_id"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x018c }
            java.lang.String r8 = "video_quality"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x018c }
            java.lang.String r9 = "video_start_trim_position"
            int r9 = defpackage.kne.u(r1, r9)     // Catch:{ all -> 0x018c }
            java.lang.String r10 = "video_end_trim_position"
            int r10 = defpackage.kne.u(r1, r10)     // Catch:{ all -> 0x018c }
            java.lang.String r11 = "mute"
            int r11 = defpackage.kne.u(r1, r11)     // Catch:{ all -> 0x018c }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x018c }
            int r13 = r1.getCount()     // Catch:{ all -> 0x018c }
            r12.<init>(r13)     // Catch:{ all -> 0x018c }
        L_0x016c:
            boolean r13 = r1.moveToNext()     // Catch:{ all -> 0x018c }
            if (r13 == 0) goto L_0x0229
            ur1 r13 = new ur1     // Catch:{ all -> 0x018c }
            r13.<init>()     // Catch:{ all -> 0x018c }
            long r14 = r1.getLong(r5)     // Catch:{ all -> 0x018c }
            r13.a = r14     // Catch:{ all -> 0x018c }
            long r14 = r1.getLong(r6)     // Catch:{ all -> 0x018c }
            r13.b = r14     // Catch:{ all -> 0x018c }
            boolean r14 = r1.isNull(r7)     // Catch:{ all -> 0x018c }
            if (r14 == 0) goto L_0x018f
            r13.c = r2     // Catch:{ all -> 0x018c }
            goto L_0x0195
        L_0x018c:
            r0 = move-exception
            goto L_0x022d
        L_0x018f:
            java.lang.String r14 = r1.getString(r7)     // Catch:{ all -> 0x018c }
            r13.c = r14     // Catch:{ all -> 0x018c }
        L_0x0195:
            boolean r14 = r1.isNull(r8)     // Catch:{ all -> 0x018c }
            if (r14 == 0) goto L_0x01b0
            boolean r14 = r1.isNull(r9)     // Catch:{ all -> 0x018c }
            if (r14 == 0) goto L_0x01b0
            boolean r14 = r1.isNull(r10)     // Catch:{ all -> 0x018c }
            if (r14 == 0) goto L_0x01b0
            boolean r14 = r1.isNull(r11)     // Catch:{ all -> 0x018c }
            if (r14 != 0) goto L_0x01ae
            goto L_0x01b0
        L_0x01ae:
            r14 = r2
            goto L_0x01e8
        L_0x01b0:
            i20 r14 = new i20     // Catch:{ all -> 0x018c }
            r14.<init>()     // Catch:{ all -> 0x018c }
            boolean r15 = r1.isNull(r8)     // Catch:{ all -> 0x018c }
            if (r15 == 0) goto L_0x01bd
            r15 = r2
            goto L_0x01c5
        L_0x01bd:
            int r15 = r1.getInt(r8)     // Catch:{ all -> 0x018c }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x018c }
        L_0x01c5:
            qac[] r16 = defpackage.qac.values()     // Catch:{ all -> 0x018c }
            int r15 = r15.intValue()     // Catch:{ all -> 0x018c }
            r15 = r16[r15]     // Catch:{ all -> 0x018c }
            r14.a = r15     // Catch:{ all -> 0x018c }
            float r15 = r1.getFloat(r9)     // Catch:{ all -> 0x018c }
            r14.b = r15     // Catch:{ all -> 0x018c }
            float r15 = r1.getFloat(r10)     // Catch:{ all -> 0x018c }
            r14.c = r15     // Catch:{ all -> 0x018c }
            int r15 = r1.getInt(r11)     // Catch:{ all -> 0x018c }
            if (r15 == 0) goto L_0x01e5
            r15 = 1
            goto L_0x01e6
        L_0x01e5:
            r15 = 0
        L_0x01e6:
            r14.d = r15     // Catch:{ all -> 0x018c }
        L_0x01e8:
            sf9 r15 = new sf9     // Catch:{ all -> 0x018c }
            r15.<init>()     // Catch:{ all -> 0x018c }
            boolean r16 = r1.isNull(r0)     // Catch:{ all -> 0x018c }
            if (r16 == 0) goto L_0x01f9
            r15.b = r2     // Catch:{ all -> 0x018c }
        L_0x01f5:
            r2 = r5
            r16 = r6
            goto L_0x0200
        L_0x01f9:
            java.lang.String r2 = r1.getString(r0)     // Catch:{ all -> 0x018c }
            r15.b = r2     // Catch:{ all -> 0x018c }
            goto L_0x01f5
        L_0x0200:
            long r5 = r1.getLong(r3)     // Catch:{ all -> 0x018c }
            r15.c = r5     // Catch:{ all -> 0x018c }
            boolean r5 = r1.isNull(r4)     // Catch:{ all -> 0x018c }
            if (r5 == 0) goto L_0x020e
            r5 = 0
            goto L_0x0216
        L_0x020e:
            int r5 = r1.getInt(r4)     // Catch:{ all -> 0x018c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x018c }
        L_0x0216:
            xyf r5 = defpackage.n54.t(r5)     // Catch:{ all -> 0x018c }
            r15.d = r5     // Catch:{ all -> 0x018c }
            r15.a = r13     // Catch:{ all -> 0x018c }
            r15.e = r14     // Catch:{ all -> 0x018c }
            r12.add(r15)     // Catch:{ all -> 0x018c }
            r5 = r2
            r6 = r16
            r2 = 0
            goto L_0x016c
        L_0x0229:
            r1.close()
            return r12
        L_0x022d:
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf9.call():java.lang.Object");
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
