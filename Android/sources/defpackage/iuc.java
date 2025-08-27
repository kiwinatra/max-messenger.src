package defpackage;

import java.util.concurrent.Callable;

/* renamed from: iuc  reason: default package */
public final class iuc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7d b;
    public final /* synthetic */ kuc c;

    public /* synthetic */ iuc(kuc kuc, d7d d7d, int i) {
        this.a = i;
        this.c = kuc;
        this.b = d7d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: yl4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: e35} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: jz2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: jz2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: e35} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: yl4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: jz2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: e35} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: e35} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: yl4} */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.Object, luc] */
    /* JADX WARNING: type inference failed for: r6v5, types: [e35, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.lang.Object, luc] */
    /* JADX WARNING: type inference failed for: r6v11, types: [e35, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v12, types: [java.lang.Object, luc] */
    /* JADX WARNING: type inference failed for: r6v17, types: [e35, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v17, types: [java.lang.Object, luc] */
    /* JADX WARNING: type inference failed for: r6v23, types: [e35, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Object, luc] */
    /* JADX WARNING: type inference failed for: r12v7, types: [e35, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0281 A[Catch:{ all -> 0x0226 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0282 A[Catch:{ all -> 0x0226 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x035c A[Catch:{ all -> 0x0301 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x035d A[Catch:{ all -> 0x0301 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0437 A[Catch:{ all -> 0x03dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0438 A[Catch:{ all -> 0x03dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c3 A[Catch:{ all -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5 A[Catch:{ all -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a6 A[Catch:{ all -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a7 A[Catch:{ all -> 0x014b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x0386;
                case 1: goto L_0x02ab;
                case 2: goto L_0x01d0;
                case 3: goto L_0x00f5;
                default: goto L_0x0007;
            }
        L_0x0007:
            kuc r1 = r0.c
            i6d r1 = r1.a
            d7d r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "id"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x0066 }
            java.lang.String r3 = "recent_type"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = "recent_time"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = "server_id"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x0066 }
            java.lang.String r6 = "sticker_id"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x0066 }
            java.lang.String r7 = "emoji"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x0066 }
            java.lang.String r8 = "gif"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x0066 }
            java.lang.String r9 = "gif_id"
            int r9 = defpackage.kne.u(r1, r9)     // Catch:{ all -> 0x0066 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0066 }
            int r11 = r1.getCount()     // Catch:{ all -> 0x0066 }
            r10.<init>(r11)     // Catch:{ all -> 0x0066 }
        L_0x004b:
            boolean r11 = r1.moveToNext()     // Catch:{ all -> 0x0066 }
            if (r11 == 0) goto L_0x00ed
            boolean r11 = r1.isNull(r6)     // Catch:{ all -> 0x0066 }
            if (r11 != 0) goto L_0x0069
            yl4 r11 = new yl4     // Catch:{ all -> 0x0066 }
            r12 = 18
            r13 = 0
            r11.<init>((int) r12, (boolean) r13)     // Catch:{ all -> 0x0066 }
            long r12 = r1.getLong(r6)     // Catch:{ all -> 0x0066 }
            r11.b = r12     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r0 = move-exception
            goto L_0x00f1
        L_0x0069:
            r11 = r2
        L_0x006a:
            boolean r12 = r1.isNull(r7)     // Catch:{ all -> 0x0066 }
            if (r12 != 0) goto L_0x0085
            e35 r12 = new e35     // Catch:{ all -> 0x0066 }
            r12.<init>()     // Catch:{ all -> 0x0066 }
            boolean r13 = r1.isNull(r7)     // Catch:{ all -> 0x0066 }
            if (r13 == 0) goto L_0x007e
            r12.a = r2     // Catch:{ all -> 0x0066 }
            goto L_0x0086
        L_0x007e:
            java.lang.String r13 = r1.getString(r7)     // Catch:{ all -> 0x0066 }
            r12.a = r13     // Catch:{ all -> 0x0066 }
            goto L_0x0086
        L_0x0085:
            r12 = r2
        L_0x0086:
            boolean r13 = r1.isNull(r8)     // Catch:{ all -> 0x0066 }
            if (r13 == 0) goto L_0x0095
            boolean r13 = r1.isNull(r9)     // Catch:{ all -> 0x0066 }
            if (r13 != 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r13 = r2
            goto L_0x00b0
        L_0x0095:
            jz2 r13 = new jz2     // Catch:{ all -> 0x0066 }
            r14 = 6
            r13.<init>((int) r14)     // Catch:{ all -> 0x0066 }
            boolean r14 = r1.isNull(r8)     // Catch:{ all -> 0x0066 }
            if (r14 == 0) goto L_0x00a4
            r13.c = r2     // Catch:{ all -> 0x0066 }
            goto L_0x00aa
        L_0x00a4:
            byte[] r14 = r1.getBlob(r8)     // Catch:{ all -> 0x0066 }
            r13.c = r14     // Catch:{ all -> 0x0066 }
        L_0x00aa:
            long r14 = r1.getLong(r9)     // Catch:{ all -> 0x0066 }
            r13.b = r14     // Catch:{ all -> 0x0066 }
        L_0x00b0:
            luc r14 = new luc     // Catch:{ all -> 0x0066 }
            r14.<init>()     // Catch:{ all -> 0x0066 }
            r15 = r3
            long r2 = r1.getLong(r0)     // Catch:{ all -> 0x0066 }
            r14.a = r2     // Catch:{ all -> 0x0066 }
            r2 = r15
            boolean r3 = r1.isNull(r2)     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x00c5
            r3 = 0
            goto L_0x00cd
        L_0x00c5:
            int r3 = r1.getInt(r2)     // Catch:{ all -> 0x0066 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0066 }
        L_0x00cd:
            cvc r3 = defpackage.h88.T(r3)     // Catch:{ all -> 0x0066 }
            r14.b = r3     // Catch:{ all -> 0x0066 }
            r15 = r2
            long r2 = r1.getLong(r4)     // Catch:{ all -> 0x0066 }
            r14.c = r2     // Catch:{ all -> 0x0066 }
            long r2 = r1.getLong(r5)     // Catch:{ all -> 0x0066 }
            r14.d = r2     // Catch:{ all -> 0x0066 }
            r14.e = r11     // Catch:{ all -> 0x0066 }
            r14.f = r12     // Catch:{ all -> 0x0066 }
            r14.g = r13     // Catch:{ all -> 0x0066 }
            r10.add(r14)     // Catch:{ all -> 0x0066 }
            r3 = r15
            r2 = 0
            goto L_0x004b
        L_0x00ed:
            r1.close()
            return r10
        L_0x00f1:
            r1.close()
            throw r0
        L_0x00f5:
            kuc r1 = r0.c
            i6d r1 = r1.a
            d7d r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "id"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "recent_type"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x014b }
            java.lang.String r4 = "recent_time"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x014b }
            java.lang.String r5 = "server_id"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x014b }
            java.lang.String r6 = "sticker_id"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x014b }
            java.lang.String r7 = "emoji"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x014b }
            java.lang.String r8 = "gif"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x014b }
            java.lang.String r9 = "gif_id"
            int r9 = defpackage.kne.u(r1, r9)     // Catch:{ all -> 0x014b }
            boolean r10 = r1.moveToFirst()     // Catch:{ all -> 0x014b }
            if (r10 == 0) goto L_0x01c8
            boolean r10 = r1.isNull(r6)     // Catch:{ all -> 0x014b }
            if (r10 != 0) goto L_0x014e
            yl4 r10 = new yl4     // Catch:{ all -> 0x014b }
            r11 = 18
            r12 = 0
            r10.<init>((int) r11, (boolean) r12)     // Catch:{ all -> 0x014b }
            long r11 = r1.getLong(r6)     // Catch:{ all -> 0x014b }
            r10.b = r11     // Catch:{ all -> 0x014b }
            goto L_0x014f
        L_0x014b:
            r0 = move-exception
            goto L_0x01cc
        L_0x014e:
            r10 = r2
        L_0x014f:
            boolean r6 = r1.isNull(r7)     // Catch:{ all -> 0x014b }
            if (r6 != 0) goto L_0x016a
            e35 r6 = new e35     // Catch:{ all -> 0x014b }
            r6.<init>()     // Catch:{ all -> 0x014b }
            boolean r11 = r1.isNull(r7)     // Catch:{ all -> 0x014b }
            if (r11 == 0) goto L_0x0163
            r6.a = r2     // Catch:{ all -> 0x014b }
            goto L_0x016b
        L_0x0163:
            java.lang.String r7 = r1.getString(r7)     // Catch:{ all -> 0x014b }
            r6.a = r7     // Catch:{ all -> 0x014b }
            goto L_0x016b
        L_0x016a:
            r6 = r2
        L_0x016b:
            boolean r7 = r1.isNull(r8)     // Catch:{ all -> 0x014b }
            if (r7 == 0) goto L_0x017a
            boolean r7 = r1.isNull(r9)     // Catch:{ all -> 0x014b }
            if (r7 != 0) goto L_0x0178
            goto L_0x017a
        L_0x0178:
            r7 = r2
            goto L_0x0195
        L_0x017a:
            jz2 r7 = new jz2     // Catch:{ all -> 0x014b }
            r11 = 6
            r7.<init>((int) r11)     // Catch:{ all -> 0x014b }
            boolean r11 = r1.isNull(r8)     // Catch:{ all -> 0x014b }
            if (r11 == 0) goto L_0x0189
            r7.c = r2     // Catch:{ all -> 0x014b }
            goto L_0x018f
        L_0x0189:
            byte[] r8 = r1.getBlob(r8)     // Catch:{ all -> 0x014b }
            r7.c = r8     // Catch:{ all -> 0x014b }
        L_0x018f:
            long r8 = r1.getLong(r9)     // Catch:{ all -> 0x014b }
            r7.b = r8     // Catch:{ all -> 0x014b }
        L_0x0195:
            luc r8 = new luc     // Catch:{ all -> 0x014b }
            r8.<init>()     // Catch:{ all -> 0x014b }
            long r11 = r1.getLong(r0)     // Catch:{ all -> 0x014b }
            r8.a = r11     // Catch:{ all -> 0x014b }
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x01a7
            goto L_0x01af
        L_0x01a7:
            int r0 = r1.getInt(r3)     // Catch:{ all -> 0x014b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x014b }
        L_0x01af:
            cvc r0 = defpackage.h88.T(r2)     // Catch:{ all -> 0x014b }
            r8.b = r0     // Catch:{ all -> 0x014b }
            long r2 = r1.getLong(r4)     // Catch:{ all -> 0x014b }
            r8.c = r2     // Catch:{ all -> 0x014b }
            long r2 = r1.getLong(r5)     // Catch:{ all -> 0x014b }
            r8.d = r2     // Catch:{ all -> 0x014b }
            r8.e = r10     // Catch:{ all -> 0x014b }
            r8.f = r6     // Catch:{ all -> 0x014b }
            r8.g = r7     // Catch:{ all -> 0x014b }
            r2 = r8
        L_0x01c8:
            r1.close()
            return r2
        L_0x01cc:
            r1.close()
            throw r0
        L_0x01d0:
            kuc r1 = r0.c
            i6d r1 = r1.a
            d7d r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "id"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x0226 }
            java.lang.String r3 = "recent_type"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x0226 }
            java.lang.String r4 = "recent_time"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x0226 }
            java.lang.String r5 = "server_id"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x0226 }
            java.lang.String r6 = "sticker_id"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x0226 }
            java.lang.String r7 = "emoji"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x0226 }
            java.lang.String r8 = "gif"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x0226 }
            java.lang.String r9 = "gif_id"
            int r9 = defpackage.kne.u(r1, r9)     // Catch:{ all -> 0x0226 }
            boolean r10 = r1.moveToFirst()     // Catch:{ all -> 0x0226 }
            if (r10 == 0) goto L_0x02a3
            boolean r10 = r1.isNull(r6)     // Catch:{ all -> 0x0226 }
            if (r10 != 0) goto L_0x0229
            yl4 r10 = new yl4     // Catch:{ all -> 0x0226 }
            r11 = 18
            r12 = 0
            r10.<init>((int) r11, (boolean) r12)     // Catch:{ all -> 0x0226 }
            long r11 = r1.getLong(r6)     // Catch:{ all -> 0x0226 }
            r10.b = r11     // Catch:{ all -> 0x0226 }
            goto L_0x022a
        L_0x0226:
            r0 = move-exception
            goto L_0x02a7
        L_0x0229:
            r10 = r2
        L_0x022a:
            boolean r6 = r1.isNull(r7)     // Catch:{ all -> 0x0226 }
            if (r6 != 0) goto L_0x0245
            e35 r6 = new e35     // Catch:{ all -> 0x0226 }
            r6.<init>()     // Catch:{ all -> 0x0226 }
            boolean r11 = r1.isNull(r7)     // Catch:{ all -> 0x0226 }
            if (r11 == 0) goto L_0x023e
            r6.a = r2     // Catch:{ all -> 0x0226 }
            goto L_0x0246
        L_0x023e:
            java.lang.String r7 = r1.getString(r7)     // Catch:{ all -> 0x0226 }
            r6.a = r7     // Catch:{ all -> 0x0226 }
            goto L_0x0246
        L_0x0245:
            r6 = r2
        L_0x0246:
            boolean r7 = r1.isNull(r8)     // Catch:{ all -> 0x0226 }
            if (r7 == 0) goto L_0x0255
            boolean r7 = r1.isNull(r9)     // Catch:{ all -> 0x0226 }
            if (r7 != 0) goto L_0x0253
            goto L_0x0255
        L_0x0253:
            r7 = r2
            goto L_0x0270
        L_0x0255:
            jz2 r7 = new jz2     // Catch:{ all -> 0x0226 }
            r11 = 6
            r7.<init>((int) r11)     // Catch:{ all -> 0x0226 }
            boolean r11 = r1.isNull(r8)     // Catch:{ all -> 0x0226 }
            if (r11 == 0) goto L_0x0264
            r7.c = r2     // Catch:{ all -> 0x0226 }
            goto L_0x026a
        L_0x0264:
            byte[] r8 = r1.getBlob(r8)     // Catch:{ all -> 0x0226 }
            r7.c = r8     // Catch:{ all -> 0x0226 }
        L_0x026a:
            long r8 = r1.getLong(r9)     // Catch:{ all -> 0x0226 }
            r7.b = r8     // Catch:{ all -> 0x0226 }
        L_0x0270:
            luc r8 = new luc     // Catch:{ all -> 0x0226 }
            r8.<init>()     // Catch:{ all -> 0x0226 }
            long r11 = r1.getLong(r0)     // Catch:{ all -> 0x0226 }
            r8.a = r11     // Catch:{ all -> 0x0226 }
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x0282
            goto L_0x028a
        L_0x0282:
            int r0 = r1.getInt(r3)     // Catch:{ all -> 0x0226 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0226 }
        L_0x028a:
            cvc r0 = defpackage.h88.T(r2)     // Catch:{ all -> 0x0226 }
            r8.b = r0     // Catch:{ all -> 0x0226 }
            long r2 = r1.getLong(r4)     // Catch:{ all -> 0x0226 }
            r8.c = r2     // Catch:{ all -> 0x0226 }
            long r2 = r1.getLong(r5)     // Catch:{ all -> 0x0226 }
            r8.d = r2     // Catch:{ all -> 0x0226 }
            r8.e = r10     // Catch:{ all -> 0x0226 }
            r8.f = r6     // Catch:{ all -> 0x0226 }
            r8.g = r7     // Catch:{ all -> 0x0226 }
            r2 = r8
        L_0x02a3:
            r1.close()
            return r2
        L_0x02a7:
            r1.close()
            throw r0
        L_0x02ab:
            kuc r1 = r0.c
            i6d r1 = r1.a
            d7d r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "id"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x0301 }
            java.lang.String r3 = "recent_type"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x0301 }
            java.lang.String r4 = "recent_time"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x0301 }
            java.lang.String r5 = "server_id"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x0301 }
            java.lang.String r6 = "sticker_id"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x0301 }
            java.lang.String r7 = "emoji"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x0301 }
            java.lang.String r8 = "gif"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x0301 }
            java.lang.String r9 = "gif_id"
            int r9 = defpackage.kne.u(r1, r9)     // Catch:{ all -> 0x0301 }
            boolean r10 = r1.moveToFirst()     // Catch:{ all -> 0x0301 }
            if (r10 == 0) goto L_0x037e
            boolean r10 = r1.isNull(r6)     // Catch:{ all -> 0x0301 }
            if (r10 != 0) goto L_0x0304
            yl4 r10 = new yl4     // Catch:{ all -> 0x0301 }
            r11 = 18
            r12 = 0
            r10.<init>((int) r11, (boolean) r12)     // Catch:{ all -> 0x0301 }
            long r11 = r1.getLong(r6)     // Catch:{ all -> 0x0301 }
            r10.b = r11     // Catch:{ all -> 0x0301 }
            goto L_0x0305
        L_0x0301:
            r0 = move-exception
            goto L_0x0382
        L_0x0304:
            r10 = r2
        L_0x0305:
            boolean r6 = r1.isNull(r7)     // Catch:{ all -> 0x0301 }
            if (r6 != 0) goto L_0x0320
            e35 r6 = new e35     // Catch:{ all -> 0x0301 }
            r6.<init>()     // Catch:{ all -> 0x0301 }
            boolean r11 = r1.isNull(r7)     // Catch:{ all -> 0x0301 }
            if (r11 == 0) goto L_0x0319
            r6.a = r2     // Catch:{ all -> 0x0301 }
            goto L_0x0321
        L_0x0319:
            java.lang.String r7 = r1.getString(r7)     // Catch:{ all -> 0x0301 }
            r6.a = r7     // Catch:{ all -> 0x0301 }
            goto L_0x0321
        L_0x0320:
            r6 = r2
        L_0x0321:
            boolean r7 = r1.isNull(r8)     // Catch:{ all -> 0x0301 }
            if (r7 == 0) goto L_0x0330
            boolean r7 = r1.isNull(r9)     // Catch:{ all -> 0x0301 }
            if (r7 != 0) goto L_0x032e
            goto L_0x0330
        L_0x032e:
            r7 = r2
            goto L_0x034b
        L_0x0330:
            jz2 r7 = new jz2     // Catch:{ all -> 0x0301 }
            r11 = 6
            r7.<init>((int) r11)     // Catch:{ all -> 0x0301 }
            boolean r11 = r1.isNull(r8)     // Catch:{ all -> 0x0301 }
            if (r11 == 0) goto L_0x033f
            r7.c = r2     // Catch:{ all -> 0x0301 }
            goto L_0x0345
        L_0x033f:
            byte[] r8 = r1.getBlob(r8)     // Catch:{ all -> 0x0301 }
            r7.c = r8     // Catch:{ all -> 0x0301 }
        L_0x0345:
            long r8 = r1.getLong(r9)     // Catch:{ all -> 0x0301 }
            r7.b = r8     // Catch:{ all -> 0x0301 }
        L_0x034b:
            luc r8 = new luc     // Catch:{ all -> 0x0301 }
            r8.<init>()     // Catch:{ all -> 0x0301 }
            long r11 = r1.getLong(r0)     // Catch:{ all -> 0x0301 }
            r8.a = r11     // Catch:{ all -> 0x0301 }
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x0301 }
            if (r0 == 0) goto L_0x035d
            goto L_0x0365
        L_0x035d:
            int r0 = r1.getInt(r3)     // Catch:{ all -> 0x0301 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0301 }
        L_0x0365:
            cvc r0 = defpackage.h88.T(r2)     // Catch:{ all -> 0x0301 }
            r8.b = r0     // Catch:{ all -> 0x0301 }
            long r2 = r1.getLong(r4)     // Catch:{ all -> 0x0301 }
            r8.c = r2     // Catch:{ all -> 0x0301 }
            long r2 = r1.getLong(r5)     // Catch:{ all -> 0x0301 }
            r8.d = r2     // Catch:{ all -> 0x0301 }
            r8.e = r10     // Catch:{ all -> 0x0301 }
            r8.f = r6     // Catch:{ all -> 0x0301 }
            r8.g = r7     // Catch:{ all -> 0x0301 }
            r2 = r8
        L_0x037e:
            r1.close()
            return r2
        L_0x0382:
            r1.close()
            throw r0
        L_0x0386:
            kuc r1 = r0.c
            i6d r1 = r1.a
            d7d r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "id"
            int r0 = defpackage.kne.u(r1, r0)     // Catch:{ all -> 0x03dc }
            java.lang.String r3 = "recent_type"
            int r3 = defpackage.kne.u(r1, r3)     // Catch:{ all -> 0x03dc }
            java.lang.String r4 = "recent_time"
            int r4 = defpackage.kne.u(r1, r4)     // Catch:{ all -> 0x03dc }
            java.lang.String r5 = "server_id"
            int r5 = defpackage.kne.u(r1, r5)     // Catch:{ all -> 0x03dc }
            java.lang.String r6 = "sticker_id"
            int r6 = defpackage.kne.u(r1, r6)     // Catch:{ all -> 0x03dc }
            java.lang.String r7 = "emoji"
            int r7 = defpackage.kne.u(r1, r7)     // Catch:{ all -> 0x03dc }
            java.lang.String r8 = "gif"
            int r8 = defpackage.kne.u(r1, r8)     // Catch:{ all -> 0x03dc }
            java.lang.String r9 = "gif_id"
            int r9 = defpackage.kne.u(r1, r9)     // Catch:{ all -> 0x03dc }
            boolean r10 = r1.moveToFirst()     // Catch:{ all -> 0x03dc }
            if (r10 == 0) goto L_0x0459
            boolean r10 = r1.isNull(r6)     // Catch:{ all -> 0x03dc }
            if (r10 != 0) goto L_0x03df
            yl4 r10 = new yl4     // Catch:{ all -> 0x03dc }
            r11 = 18
            r12 = 0
            r10.<init>((int) r11, (boolean) r12)     // Catch:{ all -> 0x03dc }
            long r11 = r1.getLong(r6)     // Catch:{ all -> 0x03dc }
            r10.b = r11     // Catch:{ all -> 0x03dc }
            goto L_0x03e0
        L_0x03dc:
            r0 = move-exception
            goto L_0x045d
        L_0x03df:
            r10 = r2
        L_0x03e0:
            boolean r6 = r1.isNull(r7)     // Catch:{ all -> 0x03dc }
            if (r6 != 0) goto L_0x03fb
            e35 r6 = new e35     // Catch:{ all -> 0x03dc }
            r6.<init>()     // Catch:{ all -> 0x03dc }
            boolean r11 = r1.isNull(r7)     // Catch:{ all -> 0x03dc }
            if (r11 == 0) goto L_0x03f4
            r6.a = r2     // Catch:{ all -> 0x03dc }
            goto L_0x03fc
        L_0x03f4:
            java.lang.String r7 = r1.getString(r7)     // Catch:{ all -> 0x03dc }
            r6.a = r7     // Catch:{ all -> 0x03dc }
            goto L_0x03fc
        L_0x03fb:
            r6 = r2
        L_0x03fc:
            boolean r7 = r1.isNull(r8)     // Catch:{ all -> 0x03dc }
            if (r7 == 0) goto L_0x040b
            boolean r7 = r1.isNull(r9)     // Catch:{ all -> 0x03dc }
            if (r7 != 0) goto L_0x0409
            goto L_0x040b
        L_0x0409:
            r7 = r2
            goto L_0x0426
        L_0x040b:
            jz2 r7 = new jz2     // Catch:{ all -> 0x03dc }
            r11 = 6
            r7.<init>((int) r11)     // Catch:{ all -> 0x03dc }
            boolean r11 = r1.isNull(r8)     // Catch:{ all -> 0x03dc }
            if (r11 == 0) goto L_0x041a
            r7.c = r2     // Catch:{ all -> 0x03dc }
            goto L_0x0420
        L_0x041a:
            byte[] r8 = r1.getBlob(r8)     // Catch:{ all -> 0x03dc }
            r7.c = r8     // Catch:{ all -> 0x03dc }
        L_0x0420:
            long r8 = r1.getLong(r9)     // Catch:{ all -> 0x03dc }
            r7.b = r8     // Catch:{ all -> 0x03dc }
        L_0x0426:
            luc r8 = new luc     // Catch:{ all -> 0x03dc }
            r8.<init>()     // Catch:{ all -> 0x03dc }
            long r11 = r1.getLong(r0)     // Catch:{ all -> 0x03dc }
            r8.a = r11     // Catch:{ all -> 0x03dc }
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x03dc }
            if (r0 == 0) goto L_0x0438
            goto L_0x0440
        L_0x0438:
            int r0 = r1.getInt(r3)     // Catch:{ all -> 0x03dc }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03dc }
        L_0x0440:
            cvc r0 = defpackage.h88.T(r2)     // Catch:{ all -> 0x03dc }
            r8.b = r0     // Catch:{ all -> 0x03dc }
            long r2 = r1.getLong(r4)     // Catch:{ all -> 0x03dc }
            r8.c = r2     // Catch:{ all -> 0x03dc }
            long r2 = r1.getLong(r5)     // Catch:{ all -> 0x03dc }
            r8.d = r2     // Catch:{ all -> 0x03dc }
            r8.e = r10     // Catch:{ all -> 0x03dc }
            r8.f = r6     // Catch:{ all -> 0x03dc }
            r8.g = r7     // Catch:{ all -> 0x03dc }
            r2 = r8
        L_0x0459:
            r1.close()
            return r2
        L_0x045d:
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuc.call():java.lang.Object");
    }

    public final void finalize() {
        switch (this.a) {
            case 0:
                this.b.o();
                return;
            case 1:
                this.b.o();
                return;
            case 2:
                this.b.o();
                return;
            case 3:
                this.b.o();
                return;
            default:
                this.b.o();
                return;
        }
    }
}
