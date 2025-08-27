package defpackage;

import java.util.Map;

/* renamed from: n38  reason: default package */
public final class n38 extends cne {
    public final /* synthetic */ qa7 w;
    public final /* synthetic */ p38 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n38(p38 p38, zi0 zi0, bwb bwb, yvb yvb, qa7 qa7) {
        super(zi0, bwb, yvb, "LocalExifThumbnailProducer");
        this.x = p38;
        this.w = qa7;
    }

    public final void b(Object obj) {
        j55.b((j55) obj);
    }

    public final Map c(Object obj) {
        return xb7.a("createdThumbnail", Boolean.toString(((j55) obj) != null));
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: j55} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.util.Pair} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[SYNTHETIC, Splitter:B:18:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1 A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d() {
        /*
            r7 = this;
            qa7 r0 = r7.w
            android.net.Uri r0 = r0.b
            p38 r7 = r7.x
            android.content.ContentResolver r1 = r7.c
            java.lang.String r2 = defpackage.mzf.a(r1, r0)
            r3 = 0
            if (r2 != 0) goto L_0x0011
        L_0x000f:
            r0 = r3
            goto L_0x0052
        L_0x0011:
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            r4.<init>(r2)     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            boolean r5 = r4.exists()     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            if (r5 == 0) goto L_0x0028
            boolean r4 = r4.canRead()     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            if (r4 == 0) goto L_0x0028
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            r0.<init>(r2)     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            goto L_0x0052
        L_0x0028:
            java.lang.String r2 = defpackage.mzf.b(r0)     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            java.lang.String r4 = "content"
            boolean r2 = r4.equals(r2)     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            if (r2 == 0) goto L_0x003b
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r0 = r1.openAssetFileDescriptor(r0, r2)     // Catch:{ FileNotFoundException -> 0x003b }
            goto L_0x003c
        L_0x003b:
            r0 = r3
        L_0x003c:
            if (r0 == 0) goto L_0x000f
            java.io.FileDescriptor r1 = r0.getFileDescriptor()     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            android.media.ExifInterface r2 = new android.media.ExifInterface     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            r2.<init>(r1)     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            r0.close()     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            r0 = r2
            goto L_0x0052
        L_0x004c:
            java.lang.Class<p38> r0 = defpackage.p38.class
            defpackage.bg5.a(r0)
            goto L_0x000f
        L_0x0052:
            if (r0 == 0) goto L_0x012d
            boolean r1 = r0.hasThumbnail()
            if (r1 != 0) goto L_0x005c
            goto L_0x012d
        L_0x005c:
            byte[] r1 = r0.getThumbnail()
            r1.getClass()
            p7d r7 = r7.b
            r7.getClass()
            f69 r2 = new f69
            int r4 = r1.length
            java.lang.Object r7 = r7.b
            d69 r7 = (defpackage.d69) r7
            r2.<init>(r7, r4)
            int r7 = r1.length     // Catch:{ IOException -> 0x0124 }
            r4 = 0
            r2.write(r1, r4, r7)     // Catch:{ IOException -> 0x0124 }
            e69 r7 = r2.n()     // Catch:{ IOException -> 0x0124 }
            r2.close()
            sqb r1 = new sqb
            r1.<init>(r7)
            kotlin.Lazy r2 = defpackage.vo0.a
            java.lang.Object r4 = r2.getValue()
            xqb r4 = (defpackage.xqb) r4
            java.lang.Object r4 = r4.c()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            if (r4 != 0) goto L_0x009b
            qv0 r4 = defpackage.r94.a
            r4 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
        L_0x009b:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r6 = 1
            r5.inJustDecodeBounds = r6
            byte[] r6 = r4.array()     // Catch:{ all -> 0x00c8 }
            r5.inTempStorage = r6     // Catch:{ all -> 0x00c8 }
            android.graphics.BitmapFactory.decodeStream(r1, r3, r5)     // Catch:{ all -> 0x00c8 }
            int r1 = r5.outWidth     // Catch:{ all -> 0x00c8 }
            r6 = -1
            if (r1 == r6) goto L_0x00ca
            int r1 = r5.outHeight     // Catch:{ all -> 0x00c8 }
            if (r1 != r6) goto L_0x00b6
            goto L_0x00ca
        L_0x00b6:
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x00c8 }
            int r1 = r5.outWidth     // Catch:{ all -> 0x00c8 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00c8 }
            int r5 = r5.outHeight     // Catch:{ all -> 0x00c8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00c8 }
            r3.<init>(r1, r5)     // Catch:{ all -> 0x00c8 }
            goto L_0x00ca
        L_0x00c8:
            r7 = move-exception
            goto L_0x0116
        L_0x00ca:
            java.lang.Object r1 = r2.getValue()
            xqb r1 = (defpackage.xqb) r1
            r1.b(r4)
            java.lang.String r1 = "Orientation"
            java.lang.String r0 = r0.getAttribute(r1)
            r0.getClass()
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = defpackage.ev0.o(r0)
            if (r3 == 0) goto L_0x00ef
            java.lang.Object r1 = r3.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x00f0
        L_0x00ef:
            r1 = r6
        L_0x00f0:
            if (r3 == 0) goto L_0x00fa
            java.lang.Object r2 = r3.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r6 = r2.intValue()
        L_0x00fa:
            jd4 r7 = defpackage.y33.p0(r7)
            j55 r3 = new j55     // Catch:{ all -> 0x0111 }
            r3.<init>(r7)     // Catch:{ all -> 0x0111 }
            defpackage.y33.U(r7)
            h97 r7 = defpackage.eg4.a
            r3.c = r7
            r3.o = r0
            r3.w = r1
            r3.x = r6
            goto L_0x012d
        L_0x0111:
            r0 = move-exception
            defpackage.y33.U(r7)
            throw r0
        L_0x0116:
            kotlin.Lazy r0 = defpackage.vo0.a
            java.lang.Object r0 = r0.getValue()
            xqb r0 = (defpackage.xqb) r0
            r0.b(r4)
            throw r7
        L_0x0122:
            r7 = move-exception
            goto L_0x0129
        L_0x0124:
            r7 = move-exception
            defpackage.n54.I(r7)     // Catch:{ all -> 0x0122 }
            throw r3     // Catch:{ all -> 0x0122 }
        L_0x0129:
            r2.close()
            throw r7
        L_0x012d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n38.d():java.lang.Object");
    }
}
