package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.io.File;
import kotlin.Pair;

/* renamed from: wj0  reason: default package */
public abstract class wj0 implements ou8 {
    public final Context a;
    public final ln5 b;
    public final bud c;
    public final kn5 d;
    public final d19 e;

    public wj0(Context context, kn5 kn5, ln5 ln5, bud bud, epa epa, m95 m95) {
        this.a = context;
        this.d = kn5;
        this.b = ln5;
        this.c = bud;
        this.e = new d19(context, epa, m95);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r1 = r8.lastIndexOf(".");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b A[Catch:{ all -> 0x006f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.a
            int r1 = defpackage.o5a.f
            boolean r1 = defpackage.cvg.A(r8)
            r2 = 0
            if (r1 == 0) goto L_0x000d
        L_0x000b:
            r8 = r2
            goto L_0x001c
        L_0x000d:
            java.lang.String r1 = "."
            int r1 = r8.lastIndexOf(r1)
            if (r1 >= 0) goto L_0x0016
            goto L_0x000b
        L_0x0016:
            int r1 = r1 + 1
            java.lang.String r8 = r8.substring(r1)
        L_0x001c:
            boolean r1 = defpackage.cvg.A(r7)
            if (r1 == 0) goto L_0x0024
            r1 = r2
            goto L_0x0038
        L_0x0024:
            java.lang.String r1 = ":"
            java.lang.String r3 = "_"
            java.lang.String r1 = r7.replaceAll(r1, r3)
            java.lang.String r4 = "//"
            java.lang.String r1 = r1.replaceAll(r4, r3)
            java.lang.String r4 = "/"
            java.lang.String r1 = r1.replaceAll(r4, r3)
        L_0x0038:
            java.lang.Object[] r3 = new java.lang.Object[]{r7, r1}
            java.lang.String r4 = "copyFromUri: generate file name from uri: uri = %s, generated name = %s"
            java.lang.String r5 = "o5a"
            defpackage.z68.c(r5, r4, r3)
            ln5 r6 = r6.b
            po5 r6 = (defpackage.po5) r6
            java.io.File r6 = r6.o(r1, r8)
            java.lang.String r8 = r6.getAbsolutePath()
            java.lang.Object[] r8 = new java.lang.Object[]{r7, r8}
            java.lang.String r1 = "copyFromUri fromUriString = %s, copy = %s"
            defpackage.z68.c(r5, r1, r8)
            android.net.Uri r8 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
            java.io.InputStream r8 = r0.openInputStream(r8)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
            defpackage.j4b.R(r8, r6)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r2 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x0072 }
        L_0x006b:
            defpackage.j4b.k(r8)
            goto L_0x008f
        L_0x006f:
            r6 = move-exception
            r2 = r8
            goto L_0x0090
        L_0x0072:
            r0 = move-exception
            goto L_0x0078
        L_0x0074:
            r6 = move-exception
            goto L_0x0090
        L_0x0076:
            r0 = move-exception
            r8 = r2
        L_0x0078:
            java.lang.String r1 = "copyFromUri: failed to copy for uri %s, e: %s"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006f }
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r0}     // Catch:{ all -> 0x006f }
            defpackage.z68.g(r5, r1, r7)     // Catch:{ all -> 0x006f }
            boolean r7 = r6.exists()     // Catch:{ all -> 0x006f }
            if (r7 == 0) goto L_0x006b
            r6.delete()     // Catch:{ all -> 0x006f }
            goto L_0x006b
        L_0x008f:
            return r2
        L_0x0090:
            defpackage.j4b.k(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj0.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public final void b(File file, File file2) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(file.toString());
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0, 0);
        if (frameAtTime != null) {
            o5a.d0(file2.toString(), frameAtTime, this.c);
            frameAtTime.recycle();
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable th) {
                z68.f("wj0", "fail to release", th);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.os.ParcelFileDescriptor} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01bb, code lost:
        if (r14 != null) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01d8, code lost:
        if (r14 != null) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013d, code lost:
        if (r4.isClosed() == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0160, code lost:
        if (r4.isClosed() == false) goto L_0x013f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ff A[SYNTHETIC, Splitter:B:120:0x01ff] */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.sv3 c(java.lang.String r14) {
        /*
            r13 = this;
            android.content.Context r0 = r13.a
            kn5 r13 = r13.d
            int r1 = defpackage.o5a.f
            boolean r1 = defpackage.cvg.A(r14)
            r2 = 0
            java.lang.String r3 = "o5a"
            if (r1 == 0) goto L_0x0016
            java.lang.String r13 = "getContentUriParams: failed, uri is empty or null"
            defpackage.z68.e(r3, r13)
            goto L_0x0214
        L_0x0016:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "getContentUriParams: uri: "
            r1.<init>(r4)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            defpackage.z68.a(r3, r1)
            android.net.Uri r1 = android.net.Uri.parse(r14)     // Catch:{ Exception -> 0x0203 }
            java.lang.String r4 = "getContentUriParams: failed, cant get path to file from uri "
            java.lang.String r5 = "getContentUriParams: failed, file not found for uri "
            java.lang.String r13 = defpackage.o5a.u(r0, r1, r13)     // Catch:{ Exception -> 0x0072 }
            boolean r6 = defpackage.cvg.A(r13)     // Catch:{ Exception -> 0x0072 }
            if (r6 != 0) goto L_0x0084
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0072 }
            r4.<init>(r13)     // Catch:{ Exception -> 0x0072 }
            boolean r6 = defpackage.cjf.o(r4)     // Catch:{ Exception -> 0x0072 }
            if (r6 == 0) goto L_0x0074
            java.lang.String r5 = r4.getName()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r6 = defpackage.o5a.r(r5)     // Catch:{ Exception -> 0x0072 }
            boolean r7 = defpackage.cvg.A(r6)     // Catch:{ Exception -> 0x0072 }
            if (r7 != 0) goto L_0x0053
            goto L_0x005b
        L_0x0053:
            android.content.ContentResolver r6 = r0.getContentResolver()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r6 = r6.getType(r1)     // Catch:{ Exception -> 0x0072 }
        L_0x005b:
            sv3 r7 = new sv3     // Catch:{ Exception -> 0x0072 }
            r7.<init>()     // Catch:{ Exception -> 0x0072 }
            long r8 = r4.length()     // Catch:{ Exception -> 0x0072 }
            r7.b = r8     // Catch:{ Exception -> 0x0072 }
            r7.c = r5     // Catch:{ Exception -> 0x0072 }
            r7.d = r6     // Catch:{ Exception -> 0x0072 }
            r7.e = r13     // Catch:{ Exception -> 0x0072 }
            sv3 r13 = new sv3     // Catch:{ Exception -> 0x0072 }
            r13.<init>(r7)     // Catch:{ Exception -> 0x0072 }
            goto L_0x00aa
        L_0x0072:
            r13 = move-exception
            goto L_0x0094
        L_0x0074:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            r13.<init>(r5)     // Catch:{ Exception -> 0x0072 }
            r13.append(r14)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0072 }
            defpackage.z68.e(r3, r13)     // Catch:{ Exception -> 0x0072 }
            goto L_0x00a9
        L_0x0084:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            r13.<init>(r4)     // Catch:{ Exception -> 0x0072 }
            r13.append(r14)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0072 }
            defpackage.z68.e(r3, r13)     // Catch:{ Exception -> 0x0072 }
            goto L_0x00a9
        L_0x0094:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "getContentUriParams: failed with get path, e: "
            r4.<init>(r5)
            java.lang.String r13 = r13.toString()
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            defpackage.z68.e(r3, r13)
        L_0x00a9:
            r13 = r2
        L_0x00aa:
            if (r13 == 0) goto L_0x00af
            r2 = r13
            goto L_0x0214
        L_0x00af:
            java.lang.String r13 = "getContentUriParams: failed with cursor, e: "
            java.lang.String r10 = "getContentUriParams: moveToFirst failed for uri "
            java.lang.String r4 = "content://"
            boolean r4 = r14.startsWith(r4)
            r11 = 0
            if (r4 == 0) goto L_0x016f
            android.content.ContentResolver r4 = r0.getContentResolver()     // Catch:{ Exception -> 0x0145, all -> 0x0143 }
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            r5 = r1
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0145, all -> 0x0143 }
            if (r4 == 0) goto L_0x0132
            java.lang.String r5 = "_display_name"
            int r5 = r4.getColumnIndex(r5)     // Catch:{ Exception -> 0x00fd }
            java.lang.String r6 = "_size"
            int r6 = r4.getColumnIndex(r6)     // Catch:{ Exception -> 0x00fd }
            boolean r7 = r4.moveToFirst()     // Catch:{ Exception -> 0x00fd }
            if (r7 == 0) goto L_0x012a
            r14 = -1
            if (r5 == r14) goto L_0x00ff
            java.lang.String r5 = r4.getString(r5)     // Catch:{ Exception -> 0x00fd }
            java.lang.String r7 = defpackage.o5a.r(r5)     // Catch:{ Exception -> 0x00fd }
            boolean r8 = defpackage.cvg.A(r7)     // Catch:{ Exception -> 0x00fd }
            if (r8 != 0) goto L_0x00f0
            goto L_0x0108
        L_0x00f0:
            android.content.ContentResolver r7 = r0.getContentResolver()     // Catch:{ Exception -> 0x00fd }
            java.lang.String r7 = r7.getType(r1)     // Catch:{ Exception -> 0x00fd }
            goto L_0x0108
        L_0x00f9:
            r13 = move-exception
            r2 = r4
            goto L_0x0163
        L_0x00fd:
            r14 = move-exception
            goto L_0x0147
        L_0x00ff:
            android.content.ContentResolver r5 = r0.getContentResolver()     // Catch:{ Exception -> 0x00fd }
            java.lang.String r7 = r5.getType(r1)     // Catch:{ Exception -> 0x00fd }
            r5 = r2
        L_0x0108:
            if (r6 == r14) goto L_0x010f
            long r8 = r4.getLong(r6)     // Catch:{ Exception -> 0x00fd }
            goto L_0x0110
        L_0x010f:
            r8 = r11
        L_0x0110:
            sv3 r14 = new sv3     // Catch:{ Exception -> 0x00fd }
            r14.<init>()     // Catch:{ Exception -> 0x00fd }
            r14.b = r8     // Catch:{ Exception -> 0x00fd }
            r14.c = r5     // Catch:{ Exception -> 0x00fd }
            r14.d = r7     // Catch:{ Exception -> 0x00fd }
            sv3 r5 = new sv3     // Catch:{ Exception -> 0x00fd }
            r5.<init>(r14)     // Catch:{ Exception -> 0x00fd }
            boolean r13 = r4.isClosed()
            if (r13 != 0) goto L_0x0170
            r4.close()     // Catch:{ Exception -> 0x0170 }
            goto L_0x0170
        L_0x012a:
            java.lang.String r14 = r10.concat(r14)     // Catch:{ Exception -> 0x00fd }
            defpackage.z68.e(r3, r14)     // Catch:{ Exception -> 0x00fd }
            goto L_0x0137
        L_0x0132:
            java.lang.String r14 = "getContentUriParams: failed with cursor, cursor is null"
            defpackage.z68.e(r3, r14)     // Catch:{ Exception -> 0x00fd }
        L_0x0137:
            if (r4 == 0) goto L_0x016f
            boolean r13 = r4.isClosed()
            if (r13 != 0) goto L_0x016f
        L_0x013f:
            r4.close()     // Catch:{ Exception -> 0x016f }
            goto L_0x016f
        L_0x0143:
            r13 = move-exception
            goto L_0x0163
        L_0x0145:
            r14 = move-exception
            r4 = r2
        L_0x0147:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r5.<init>(r13)     // Catch:{ all -> 0x00f9 }
            java.lang.String r13 = r14.toString()     // Catch:{ all -> 0x00f9 }
            r5.append(r13)     // Catch:{ all -> 0x00f9 }
            java.lang.String r13 = r5.toString()     // Catch:{ all -> 0x00f9 }
            defpackage.z68.e(r3, r13)     // Catch:{ all -> 0x00f9 }
            if (r4 == 0) goto L_0x016f
            boolean r13 = r4.isClosed()
            if (r13 != 0) goto L_0x016f
            goto L_0x013f
        L_0x0163:
            if (r2 == 0) goto L_0x016e
            boolean r14 = r2.isClosed()
            if (r14 != 0) goto L_0x016e
            r2.close()     // Catch:{ Exception -> 0x016e }
        L_0x016e:
            throw r13
        L_0x016f:
            r5 = r2
        L_0x0170:
            if (r5 == 0) goto L_0x017b
            long r13 = r5.b
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x017b
            r2 = r5
            goto L_0x0214
        L_0x017b:
            java.lang.String r13 = "getContentUriParams: failed with file descriptor, e: "
            android.content.ContentResolver r14 = r0.getContentResolver()     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
            java.lang.String r4 = "r"
            android.os.ParcelFileDescriptor r14 = r14.openFileDescriptor(r1, r4)     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
            if (r14 == 0) goto L_0x0194
            long r6 = r14.getStatSize()     // Catch:{ Exception -> 0x0192 }
            goto L_0x0196
        L_0x018e:
            r13 = move-exception
            r2 = r14
            goto L_0x01fd
        L_0x0192:
            r0 = move-exception
            goto L_0x01c5
        L_0x0194:
            r6 = -1
        L_0x0196:
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x0192 }
            java.lang.String r0 = r0.getType(r1)     // Catch:{ Exception -> 0x0192 }
            int r1 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r1 < 0) goto L_0x01b6
            sv3 r1 = new sv3     // Catch:{ Exception -> 0x0192 }
            r1.<init>()     // Catch:{ Exception -> 0x0192 }
            r1.b = r6     // Catch:{ Exception -> 0x0192 }
            r1.d = r0     // Catch:{ Exception -> 0x0192 }
            sv3 r0 = new sv3     // Catch:{ Exception -> 0x0192 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0192 }
            if (r14 == 0) goto L_0x01dc
            r14.close()     // Catch:{ IOException -> 0x01dc }
            goto L_0x01dc
        L_0x01b6:
            java.lang.String r0 = "getContentUriParams: failed, cant get size from parcelFileDescriptor"
            defpackage.z68.e(r3, r0)     // Catch:{ Exception -> 0x0192 }
            if (r14 == 0) goto L_0x01db
        L_0x01bd:
            r14.close()     // Catch:{ IOException -> 0x01db }
            goto L_0x01db
        L_0x01c1:
            r13 = move-exception
            goto L_0x01fd
        L_0x01c3:
            r0 = move-exception
            r14 = r2
        L_0x01c5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018e }
            r1.<init>(r13)     // Catch:{ all -> 0x018e }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x018e }
            r1.append(r13)     // Catch:{ all -> 0x018e }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x018e }
            defpackage.z68.e(r3, r13)     // Catch:{ all -> 0x018e }
            if (r14 == 0) goto L_0x01db
            goto L_0x01bd
        L_0x01db:
            r0 = r2
        L_0x01dc:
            if (r0 == 0) goto L_0x0214
            if (r5 == 0) goto L_0x01fb
            sv3 r13 = new sv3
            r13.<init>()
            java.lang.String r14 = r5.c
            r13.c = r14
            java.lang.String r14 = r5.e
            r13.e = r14
            long r1 = r0.b
            r13.b = r1
            java.lang.String r14 = r0.d
            r13.d = r14
            sv3 r2 = new sv3
            r2.<init>(r13)
            goto L_0x0214
        L_0x01fb:
            r2 = r0
            goto L_0x0214
        L_0x01fd:
            if (r2 == 0) goto L_0x0202
            r2.close()     // Catch:{ IOException -> 0x0202 }
        L_0x0202:
            throw r13
        L_0x0203:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "getContentUriParams: failed to parse uri: "
            r13.<init>(r0)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            defpackage.z68.e(r3, r13)
        L_0x0214:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj0.c(java.lang.String):sv3");
    }

    public final i7g d(String str) {
        String str2;
        iq5 C = o5a.C(this.a, Uri.parse(str));
        bud bud = this.c;
        Bitmap bitmap = (Bitmap) C.e;
        if (bitmap != null) {
            str2 = new File(((po5) this.b).m(), String.valueOf(System.currentTimeMillis())).getAbsolutePath();
            o5a.d0(str2, bitmap, bud);
            bitmap.recycle();
        } else {
            str2 = null;
        }
        String str3 = str2;
        Point point = (Point) C.f;
        int i = point.x;
        if (i == 0) {
            i = ((Number) ((Pair) ((akd) bud).o.getValue()).getFirst()).intValue();
        }
        int i2 = i;
        int i3 = point.y;
        if (i3 == 0) {
            i3 = ((Number) ((Pair) ((akd) bud).o.getValue()).getSecond()).intValue();
        }
        return new i7g(C.c, str3, i2, i3);
    }
}
