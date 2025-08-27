package defpackage;

/* renamed from: atc  reason: default package */
public abstract class atc {
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ae, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00af, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b2, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(defpackage.ez r6, defpackage.r6 r7) {
        /*
            java.io.FileInputStream r6 = r6.c()
            if (r6 == 0) goto L_0x00b3
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r6, r1)
            java.io.DataInputStream r6 = new java.io.DataInputStream     // Catch:{ all -> 0x00a5 }
            r6.<init>(r0)     // Catch:{ all -> 0x00a5 }
            xe8 r1 = new xe8     // Catch:{ all -> 0x0055 }
            r2 = 20
            r1.<init>((int) r2)     // Catch:{ all -> 0x0055 }
        L_0x0019:
            int r2 = r6.available()     // Catch:{ all -> 0x0055 }
            if (r2 <= 0) goto L_0x009b
            java.lang.String r2 = r6.readUTF()     // Catch:{ all -> 0x0055 }
            int r3 = r6.readUnsignedByte()     // Catch:{ all -> 0x0055 }
            bk3 r4 = defpackage.guf.b     // Catch:{ all -> 0x0055 }
            r4.getClass()     // Catch:{ all -> 0x0055 }
            java.util.LinkedHashMap r4 = defpackage.guf.c     // Catch:{ all -> 0x0055 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0055 }
            java.lang.Object r3 = kotlin.collections.MapsKt.getValue(r4, r3)     // Catch:{ all -> 0x0055 }
            guf r3 = (defpackage.guf) r3     // Catch:{ all -> 0x0055 }
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)     // Catch:{ all -> 0x0055 }
            java.lang.Object r3 = r2.component1()     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.component2()     // Catch:{ all -> 0x0055 }
            guf r2 = (defpackage.guf) r2     // Catch:{ all -> 0x0055 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x0055 }
            switch(r2) {
                case 0: goto L_0x008e;
                case 1: goto L_0x0085;
                case 2: goto L_0x007c;
                case 3: goto L_0x0077;
                case 4: goto L_0x006e;
                case 5: goto L_0x0065;
                case 6: goto L_0x0060;
                case 7: goto L_0x0057;
                default: goto L_0x004f;
            }     // Catch:{ all -> 0x0055 }
        L_0x004f:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0055 }
            r7.<init>()     // Catch:{ all -> 0x0055 }
            throw r7     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r7 = move-exception
            goto L_0x00a7
        L_0x0057:
            java.lang.String r2 = defpackage.h88.R(r6, r1)     // Catch:{ all -> 0x0055 }
            java.util.Set r2 = defpackage.b59.d0(r2)     // Catch:{ all -> 0x0055 }
            goto L_0x0096
        L_0x0060:
            java.lang.String r2 = defpackage.h88.R(r6, r1)     // Catch:{ all -> 0x0055 }
            goto L_0x0096
        L_0x0065:
            boolean r2 = r6.readBoolean()     // Catch:{ all -> 0x0055 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0055 }
            goto L_0x0096
        L_0x006e:
            java.lang.String r2 = r6.readUTF()     // Catch:{ all -> 0x0055 }
            java.util.Set r2 = defpackage.b59.d0(r2)     // Catch:{ all -> 0x0055 }
            goto L_0x0096
        L_0x0077:
            java.lang.String r2 = r6.readUTF()     // Catch:{ all -> 0x0055 }
            goto L_0x0096
        L_0x007c:
            long r4 = r6.readLong()     // Catch:{ all -> 0x0055 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0055 }
            goto L_0x0096
        L_0x0085:
            float r2 = r6.readFloat()     // Catch:{ all -> 0x0055 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0055 }
            goto L_0x0096
        L_0x008e:
            int r2 = r6.readInt()     // Catch:{ all -> 0x0055 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0055 }
        L_0x0096:
            r7.invoke(r3, r2)     // Catch:{ all -> 0x0055 }
            goto L_0x0019
        L_0x009b:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0055 }
            r7 = 0
            kotlin.io.CloseableKt.closeFinally(r6, r7)     // Catch:{ all -> 0x00a5 }
            kotlin.io.CloseableKt.closeFinally(r0, r7)
            goto L_0x00b3
        L_0x00a5:
            r6 = move-exception
            goto L_0x00ad
        L_0x00a7:
            throw r7     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r6, r7)     // Catch:{ all -> 0x00a5 }
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x00ad:
            throw r6     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r7 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r6)
            throw r7
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atc.a(ez, r6):void");
    }
}
