package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: ypc  reason: default package */
public final class ypc extends cj0 {
    public long X;
    public boolean Y;
    public final Resources v;
    public final String w;
    public Uri x;
    public AssetFileDescriptor y;
    public FileInputStream z;

    public ypc(Context context) {
        super(false);
        this.v = context.getResources();
        this.w = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        if (r3.matches("\\d+") != false) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long N(defpackage.p74 r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            android.net.Uri r2 = r1.a
            r0.x = r2
            java.lang.String r3 = r2.getScheme()
            java.lang.String r4 = "rawresource"
            boolean r3 = android.text.TextUtils.equals(r4, r3)
            r4 = 1004(0x3ec, float:1.407E-42)
            r5 = 2005(0x7d5, float:2.81E-42)
            android.content.res.Resources r6 = r0.v
            r7 = 1
            r8 = 0
            if (r3 != 0) goto L_0x00a9
            java.lang.String r3 = r2.getScheme()
            java.lang.String r9 = "android.resource"
            boolean r3 = android.text.TextUtils.equals(r9, r3)
            if (r3 == 0) goto L_0x0042
            java.util.List r3 = r2.getPathSegments()
            int r3 = r3.size()
            if (r3 != r7) goto L_0x0042
            java.lang.String r3 = r2.getLastPathSegment()
            r3.getClass()
            java.lang.String r10 = "\\d+"
            boolean r3 = r3.matches(r10)
            if (r3 == 0) goto L_0x0042
            goto L_0x00a9
        L_0x0042:
            java.lang.String r3 = r2.getScheme()
            boolean r3 = android.text.TextUtils.equals(r9, r3)
            if (r3 == 0) goto L_0x00a1
            java.lang.String r3 = r2.getPath()
            r3.getClass()
            java.lang.String r4 = "/"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x005f
            java.lang.String r3 = r3.substring(r7)
        L_0x005f:
            java.lang.String r4 = r2.getHost()
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 == 0) goto L_0x006c
            java.lang.String r4 = ""
            goto L_0x0076
        L_0x006c:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r9 = ":"
            java.lang.String r4 = r4.concat(r9)
        L_0x0076:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r9 = r3.length()
            if (r9 == 0) goto L_0x0089
            java.lang.String r3 = r4.concat(r3)
            goto L_0x008e
        L_0x0089:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
        L_0x008e:
            java.lang.String r4 = "raw"
            java.lang.String r9 = r0.w
            int r3 = r6.getIdentifier(r3, r4, r9)
            if (r3 == 0) goto L_0x0099
            goto L_0x00b4
        L_0x0099:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r1 = "Resource not found."
            r0.<init>(r1, r8, r5)
            throw r0
        L_0x00a1:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r1 = "URI must either use scheme rawresource or android.resource"
            r0.<init>(r1, r8, r4)
            throw r0
        L_0x00a9:
            java.lang.String r3 = r2.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x018a }
            r3.getClass()     // Catch:{ NumberFormatException -> 0x018a }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x018a }
        L_0x00b4:
            r19.c()
            android.content.res.AssetFileDescriptor r3 = r6.openRawResourceFd(r3)     // Catch:{ NotFoundException -> 0x0182 }
            r0.y = r3
            if (r3 == 0) goto L_0x015f
            long r5 = r3.getLength()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.FileDescriptor r9 = r3.getFileDescriptor()
            r2.<init>(r9)
            r0.z = r2
            r9 = -1
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r12 = 2008(0x7d8, float:2.814E-42)
            long r13 = r1.f
            if (r11 == 0) goto L_0x00e9
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r15 > 0) goto L_0x00dd
            goto L_0x00e9
        L_0x00dd:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            r0.<init>(r8, r8, r12)     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            throw r0     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            goto L_0x0156
        L_0x00e6:
            r0 = move-exception
            goto L_0x015e
        L_0x00e9:
            long r15 = r3.getStartOffset()     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            r17 = r5
            long r4 = r15 + r13
            long r4 = r2.skip(r4)     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            long r4 = r4 - r15
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0150
            r13 = 0
            if (r11 != 0) goto L_0x0123
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            long r4 = r2.size()     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x010d
            r0.X = r9     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            goto L_0x012b
        L_0x010d:
            long r4 = r2.size()     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            long r15 = r2.position()     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            long r4 = r4 - r15
            r0.X = r4     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x011d
            goto L_0x012b
        L_0x011d:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            r0.<init>(r8, r8, r12)     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            throw r0     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
        L_0x0123:
            long r5 = r17 - r4
            r0.X = r5     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x014a
        L_0x012b:
            long r2 = r1.g
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x013f
            long r5 = r0.X
            int r8 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0139
            r5 = r2
            goto L_0x013d
        L_0x0139:
            long r5 = java.lang.Math.min(r5, r2)
        L_0x013d:
            r0.X = r5
        L_0x013f:
            r0.Y = r7
            r19.d(r20)
            if (r4 == 0) goto L_0x0147
            goto L_0x0149
        L_0x0147:
            long r2 = r0.X
        L_0x0149:
            return r2
        L_0x014a:
            com.google.android.exoplayer2.upstream.DataSourceException r0 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            r0.<init>(r12)     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            throw r0     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
        L_0x0150:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            r0.<init>(r8, r8, r12)     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
            throw r0     // Catch:{ RawResourceDataSource$RawResourceDataSourceException -> 0x00e6, IOException -> 0x00e3 }
        L_0x0156:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r1 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            r2 = 2000(0x7d0, float:2.803E-42)
            r1.<init>(r8, r0, r2)
            throw r1
        L_0x015e:
            throw r0
        L_0x015f:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r1 = java.lang.String.valueOf(r2)
            int r2 = r1.length()
            int r2 = r2 + 24
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.String r2 = "Resource is compressed: "
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r1, r8, r2)
            throw r0
        L_0x0182:
            r0 = move-exception
            r1 = r0
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            r0.<init>(r8, r1, r5)
            throw r0
        L_0x018a:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r1 = "Resource identifier must be an integer."
            r0.<init>(r1, r8, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypc.N(p74):long");
    }

    public final void close() {
        this.x = null;
        try {
            FileInputStream fileInputStream = this.z;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.z = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.y;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.y = null;
                if (this.Y) {
                    this.Y = false;
                    b();
                }
            } catch (IOException e) {
                throw new DataSourceException((String) null, e, 2000);
            } catch (Throwable th) {
                this.y = null;
                if (this.Y) {
                    this.Y = false;
                    b();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new DataSourceException((String) null, e2, 2000);
        } catch (Throwable th2) {
            this.z = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.y;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.y = null;
                if (this.Y) {
                    this.Y = false;
                    b();
                }
                throw th2;
            } catch (IOException e3) {
                throw new DataSourceException((String) null, e3, 2000);
            } catch (Throwable th3) {
                this.y = null;
                if (this.Y) {
                    this.Y = false;
                    b();
                }
                throw th3;
            }
        }
    }

    public final Uri getUri() {
        return this.x;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.X;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new DataSourceException((String) null, e, 2000);
            }
        }
        FileInputStream fileInputStream = this.z;
        int i3 = t0g.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.X;
            if (j2 != -1) {
                this.X = j2 - ((long) read);
            }
            a(read);
            return read;
        } else if (this.X == -1) {
            return -1;
        } else {
            throw new DataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }
}
