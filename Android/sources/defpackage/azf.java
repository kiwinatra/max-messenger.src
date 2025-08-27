package defpackage;

import java.util.concurrent.Callable;

/* renamed from: azf  reason: default package */
public final class azf implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7d b;
    public final /* synthetic */ dzf c;

    public /* synthetic */ azf(dzf dzf, d7d d7d, int i) {
        this.a = i;
        this.c = dzf;
        this.b = d7d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: lxf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r15v1, types: [no5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v8, types: [uyf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v10, types: [no5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v12, types: [uyf, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0279 A[Catch:{ all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e5 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e9 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f5 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0109 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0115 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0119 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0134 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0136 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0230 A[Catch:{ all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0233 A[Catch:{ all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x023f A[Catch:{ all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0242 A[Catch:{ all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x024e A[Catch:{ all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0251 A[Catch:{ all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x025d A[Catch:{ all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0260 A[Catch:{ all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0278 A[Catch:{ all -> 0x01d7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x016a;
                default: goto L_0x0007;
            }
        L_0x0007:
            dzf r1 = r0.c
            i6d r1 = r1.a
            d7d r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "attach_local_id"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r3 = "prepared_path"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "file_name"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = "upload_url"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x0083 }
            java.lang.String r6 = "upload_progress"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x0083 }
            java.lang.String r7 = "total_bytes"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x0083 }
            java.lang.String r8 = "upload_status"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x0083 }
            java.lang.String r9 = "created_time"
            int r9 = defpackage.kne.u(r1, r9)     // Catch:{ all -> 0x0083 }
            java.lang.String r10 = "path"
            int r10 = defpackage.kne.u(r1, r10)     // Catch:{ all -> 0x0083 }
            java.lang.String r11 = "last_modified"
            int r11 = defpackage.kne.u(r1, r11)     // Catch:{ all -> 0x0083 }
            java.lang.String r12 = "upload_type"
            int r12 = defpackage.kne.u(r1, r12)     // Catch:{ all -> 0x0083 }
            java.lang.String r13 = "photo_token"
            int r13 = defpackage.kne.u(r1, r13)     // Catch:{ all -> 0x0083 }
            java.lang.String r14 = "attach_id"
            int r14 = defpackage.kne.u(r1, r14)     // Catch:{ all -> 0x0083 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0083 }
            int r2 = r1.getCount()     // Catch:{ all -> 0x0083 }
            r15.<init>(r2)     // Catch:{ all -> 0x0083 }
        L_0x0069:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0161
            no5 r2 = new no5     // Catch:{ all -> 0x0083 }
            r2.<init>()     // Catch:{ all -> 0x0083 }
            boolean r16 = r1.isNull(r10)     // Catch:{ all -> 0x0083 }
            if (r16 == 0) goto L_0x0086
            r16 = r15
            r15 = 0
            r2.c = r15     // Catch:{ all -> 0x0083 }
        L_0x007f:
            r15 = r9
            r17 = r10
            goto L_0x008f
        L_0x0083:
            r0 = move-exception
            goto L_0x0166
        L_0x0086:
            r16 = r15
            java.lang.String r15 = r1.getString(r10)     // Catch:{ all -> 0x0083 }
            r2.c = r15     // Catch:{ all -> 0x0083 }
            goto L_0x007f
        L_0x008f:
            long r9 = r1.getLong(r11)     // Catch:{ all -> 0x0083 }
            r2.a = r9     // Catch:{ all -> 0x0083 }
            boolean r9 = r1.isNull(r12)     // Catch:{ all -> 0x0083 }
            if (r9 == 0) goto L_0x009d
            r9 = 0
            goto L_0x00a5
        L_0x009d:
            int r9 = r1.getInt(r12)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0083 }
        L_0x00a5:
            xyf r9 = defpackage.n54.t(r9)     // Catch:{ all -> 0x0083 }
            r2.b = r9     // Catch:{ all -> 0x0083 }
            boolean r9 = r1.isNull(r13)     // Catch:{ all -> 0x0083 }
            if (r9 == 0) goto L_0x00bc
            boolean r9 = r1.isNull(r14)     // Catch:{ all -> 0x0083 }
            if (r9 != 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            r18 = r11
            r9 = 0
            goto L_0x00da
        L_0x00bc:
            uyf r9 = new uyf     // Catch:{ all -> 0x0083 }
            r9.<init>()     // Catch:{ all -> 0x0083 }
            boolean r10 = r1.isNull(r13)     // Catch:{ all -> 0x0083 }
            if (r10 == 0) goto L_0x00cd
            r10 = 0
            r9.a = r10     // Catch:{ all -> 0x0083 }
        L_0x00ca:
            r18 = r11
            goto L_0x00d4
        L_0x00cd:
            java.lang.String r10 = r1.getString(r13)     // Catch:{ all -> 0x0083 }
            r9.a = r10     // Catch:{ all -> 0x0083 }
            goto L_0x00ca
        L_0x00d4:
            long r10 = r1.getLong(r14)     // Catch:{ all -> 0x0083 }
            r9.b = r10     // Catch:{ all -> 0x0083 }
        L_0x00da:
            lxf r10 = new lxf     // Catch:{ all -> 0x0083 }
            r10.<init>()     // Catch:{ all -> 0x0083 }
            boolean r11 = r1.isNull(r0)     // Catch:{ all -> 0x0083 }
            if (r11 == 0) goto L_0x00e9
            r11 = 0
            r10.b = r11     // Catch:{ all -> 0x0083 }
            goto L_0x00ef
        L_0x00e9:
            java.lang.String r11 = r1.getString(r0)     // Catch:{ all -> 0x0083 }
            r10.b = r11     // Catch:{ all -> 0x0083 }
        L_0x00ef:
            boolean r11 = r1.isNull(r3)     // Catch:{ all -> 0x0083 }
            if (r11 == 0) goto L_0x00f9
            r11 = 0
            r10.c = r11     // Catch:{ all -> 0x0083 }
            goto L_0x00ff
        L_0x00f9:
            java.lang.String r11 = r1.getString(r3)     // Catch:{ all -> 0x0083 }
            r10.c = r11     // Catch:{ all -> 0x0083 }
        L_0x00ff:
            boolean r11 = r1.isNull(r4)     // Catch:{ all -> 0x0083 }
            if (r11 == 0) goto L_0x0109
            r11 = 0
            r10.d = r11     // Catch:{ all -> 0x0083 }
            goto L_0x010f
        L_0x0109:
            java.lang.String r11 = r1.getString(r4)     // Catch:{ all -> 0x0083 }
            r10.d = r11     // Catch:{ all -> 0x0083 }
        L_0x010f:
            boolean r11 = r1.isNull(r5)     // Catch:{ all -> 0x0083 }
            if (r11 == 0) goto L_0x0119
            r11 = 0
            r10.e = r11     // Catch:{ all -> 0x0083 }
            goto L_0x011f
        L_0x0119:
            java.lang.String r11 = r1.getString(r5)     // Catch:{ all -> 0x0083 }
            r10.e = r11     // Catch:{ all -> 0x0083 }
        L_0x011f:
            float r11 = r1.getFloat(r6)     // Catch:{ all -> 0x0083 }
            r10.f = r11     // Catch:{ all -> 0x0083 }
            r11 = r3
            r19 = r4
            long r3 = r1.getLong(r7)     // Catch:{ all -> 0x0083 }
            r10.g = r3     // Catch:{ all -> 0x0083 }
            boolean r3 = r1.isNull(r8)     // Catch:{ all -> 0x0083 }
            if (r3 == 0) goto L_0x0136
            r3 = 0
            goto L_0x013e
        L_0x0136:
            int r3 = r1.getInt(r8)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0083 }
        L_0x013e:
            wyf r3 = defpackage.n54.s(r3)     // Catch:{ all -> 0x0083 }
            r10.h = r3     // Catch:{ all -> 0x0083 }
            r3 = r15
            r15 = r5
            long r4 = r1.getLong(r3)     // Catch:{ all -> 0x0083 }
            r10.j = r4     // Catch:{ all -> 0x0083 }
            r10.a = r2     // Catch:{ all -> 0x0083 }
            r10.i = r9     // Catch:{ all -> 0x0083 }
            r2 = r16
            r2.add(r10)     // Catch:{ all -> 0x0083 }
            r9 = r3
            r3 = r11
            r5 = r15
            r10 = r17
            r11 = r18
            r4 = r19
            r15 = r2
            goto L_0x0069
        L_0x0161:
            r2 = r15
            r1.close()
            return r2
        L_0x0166:
            r1.close()
            throw r0
        L_0x016a:
            dzf r1 = r0.c
            i6d r1 = r1.a
            d7d r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "attach_local_id"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x01d7 }
            java.lang.String r3 = "prepared_path"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "file_name"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = "upload_url"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r6 = "upload_progress"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x01d7 }
            java.lang.String r7 = "total_bytes"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x01d7 }
            java.lang.String r8 = "upload_status"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x01d7 }
            java.lang.String r9 = "created_time"
            int r9 = defpackage.kne.u(r1, r9)     // Catch:{ all -> 0x01d7 }
            java.lang.String r10 = "path"
            int r10 = defpackage.kne.u(r1, r10)     // Catch:{ all -> 0x01d7 }
            java.lang.String r11 = "last_modified"
            int r11 = defpackage.kne.u(r1, r11)     // Catch:{ all -> 0x01d7 }
            java.lang.String r12 = "upload_type"
            int r12 = defpackage.kne.u(r1, r12)     // Catch:{ all -> 0x01d7 }
            java.lang.String r13 = "photo_token"
            int r13 = defpackage.kne.u(r1, r13)     // Catch:{ all -> 0x01d7 }
            java.lang.String r14 = "attach_id"
            int r14 = defpackage.kne.u(r1, r14)     // Catch:{ all -> 0x01d7 }
            boolean r15 = r1.moveToFirst()     // Catch:{ all -> 0x01d7 }
            if (r15 == 0) goto L_0x0292
            no5 r15 = new no5     // Catch:{ all -> 0x01d7 }
            r15.<init>()     // Catch:{ all -> 0x01d7 }
            boolean r16 = r1.isNull(r10)     // Catch:{ all -> 0x01d7 }
            if (r16 == 0) goto L_0x01da
            r15.c = r2     // Catch:{ all -> 0x01d7 }
            goto L_0x01e0
        L_0x01d7:
            r0 = move-exception
            goto L_0x0296
        L_0x01da:
            java.lang.String r10 = r1.getString(r10)     // Catch:{ all -> 0x01d7 }
            r15.c = r10     // Catch:{ all -> 0x01d7 }
        L_0x01e0:
            long r10 = r1.getLong(r11)     // Catch:{ all -> 0x01d7 }
            r15.a = r10     // Catch:{ all -> 0x01d7 }
            boolean r10 = r1.isNull(r12)     // Catch:{ all -> 0x01d7 }
            if (r10 == 0) goto L_0x01ee
            r10 = r2
            goto L_0x01f6
        L_0x01ee:
            int r10 = r1.getInt(r12)     // Catch:{ all -> 0x01d7 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01d7 }
        L_0x01f6:
            xyf r10 = defpackage.n54.t(r10)     // Catch:{ all -> 0x01d7 }
            r15.b = r10     // Catch:{ all -> 0x01d7 }
            boolean r10 = r1.isNull(r13)     // Catch:{ all -> 0x01d7 }
            if (r10 == 0) goto L_0x020b
            boolean r10 = r1.isNull(r14)     // Catch:{ all -> 0x01d7 }
            if (r10 != 0) goto L_0x0209
            goto L_0x020b
        L_0x0209:
            r10 = r2
            goto L_0x0225
        L_0x020b:
            uyf r10 = new uyf     // Catch:{ all -> 0x01d7 }
            r10.<init>()     // Catch:{ all -> 0x01d7 }
            boolean r11 = r1.isNull(r13)     // Catch:{ all -> 0x01d7 }
            if (r11 == 0) goto L_0x0219
            r10.a = r2     // Catch:{ all -> 0x01d7 }
            goto L_0x021f
        L_0x0219:
            java.lang.String r11 = r1.getString(r13)     // Catch:{ all -> 0x01d7 }
            r10.a = r11     // Catch:{ all -> 0x01d7 }
        L_0x021f:
            long r11 = r1.getLong(r14)     // Catch:{ all -> 0x01d7 }
            r10.b = r11     // Catch:{ all -> 0x01d7 }
        L_0x0225:
            lxf r11 = new lxf     // Catch:{ all -> 0x01d7 }
            r11.<init>()     // Catch:{ all -> 0x01d7 }
            boolean r12 = r1.isNull(r0)     // Catch:{ all -> 0x01d7 }
            if (r12 == 0) goto L_0x0233
            r11.b = r2     // Catch:{ all -> 0x01d7 }
            goto L_0x0239
        L_0x0233:
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x01d7 }
            r11.b = r0     // Catch:{ all -> 0x01d7 }
        L_0x0239:
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x0242
            r11.c = r2     // Catch:{ all -> 0x01d7 }
            goto L_0x0248
        L_0x0242:
            java.lang.String r0 = r1.getString(r3)     // Catch:{ all -> 0x01d7 }
            r11.c = r0     // Catch:{ all -> 0x01d7 }
        L_0x0248:
            boolean r0 = r1.isNull(r4)     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x0251
            r11.d = r2     // Catch:{ all -> 0x01d7 }
            goto L_0x0257
        L_0x0251:
            java.lang.String r0 = r1.getString(r4)     // Catch:{ all -> 0x01d7 }
            r11.d = r0     // Catch:{ all -> 0x01d7 }
        L_0x0257:
            boolean r0 = r1.isNull(r5)     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x0260
            r11.e = r2     // Catch:{ all -> 0x01d7 }
            goto L_0x0266
        L_0x0260:
            java.lang.String r0 = r1.getString(r5)     // Catch:{ all -> 0x01d7 }
            r11.e = r0     // Catch:{ all -> 0x01d7 }
        L_0x0266:
            float r0 = r1.getFloat(r6)     // Catch:{ all -> 0x01d7 }
            r11.f = r0     // Catch:{ all -> 0x01d7 }
            long r3 = r1.getLong(r7)     // Catch:{ all -> 0x01d7 }
            r11.g = r3     // Catch:{ all -> 0x01d7 }
            boolean r0 = r1.isNull(r8)     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x0279
            goto L_0x0281
        L_0x0279:
            int r0 = r1.getInt(r8)     // Catch:{ all -> 0x01d7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01d7 }
        L_0x0281:
            wyf r0 = defpackage.n54.s(r2)     // Catch:{ all -> 0x01d7 }
            r11.h = r0     // Catch:{ all -> 0x01d7 }
            long r2 = r1.getLong(r9)     // Catch:{ all -> 0x01d7 }
            r11.j = r2     // Catch:{ all -> 0x01d7 }
            r11.a = r15     // Catch:{ all -> 0x01d7 }
            r11.i = r10     // Catch:{ all -> 0x01d7 }
            r2 = r11
        L_0x0292:
            r1.close()
            return r2
        L_0x0296:
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azf.call():java.lang.Object");
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
