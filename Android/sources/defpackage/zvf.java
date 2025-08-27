package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.facebook.soloader.e;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

/* renamed from: zvf  reason: default package */
public abstract class zvf extends gp4 {
    public final Context d;

    public zvf(Context context, String str) {
        super(f(context, str), 1);
        this.d = context;
    }

    public static File f(Context context, String str) {
        return new File(rae.q(new StringBuilder(), context.getApplicationInfo().dataDir, "/", str));
    }

    public static void i(File file, byte b, boolean z) {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0);
            randomAccessFile.write(b);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            if (z) {
                randomAccessFile.getFD().sync();
            }
            randomAccessFile.close();
            return;
        } catch (SyncFailedException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cc A[SYNTHETIC, Splitter:B:44:0x00cc] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3 A[Catch:{ all -> 0x009d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(int r10) {
        /*
            r9 = this;
            java.lang.String r0 = "error removing "
            java.io.File r1 = r9.a
            boolean r2 = r1.mkdirs()
            if (r2 != 0) goto L_0x0025
            boolean r2 = r1.isDirectory()
            if (r2 == 0) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "cannot mkdir: "
            r10.<init>(r0)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0025:
            boolean r2 = r1.canWrite()
            r3 = 1
            java.lang.String r4 = " write permission"
            java.lang.String r5 = "error adding "
            if (r2 != 0) goto L_0x0050
            boolean r2 = r1.setWritable(r3)
            if (r2 == 0) goto L_0x0037
            goto L_0x0050
        L_0x0037:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r5)
            java.lang.String r0 = r1.getCanonicalPath()
            r10.append(r0)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0050:
            r2 = 0
            r6 = 0
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x00c9 }
            java.lang.String r8 = "dso_lock"
            r7.<init>(r1, r8)     // Catch:{ all -> 0x00c9 }
            mm5 r7 = defpackage.w6f.d(r1, r7)     // Catch:{ all -> 0x00c9 }
            java.util.Objects.toString(r1)     // Catch:{ all -> 0x0086 }
            boolean r8 = r1.canWrite()     // Catch:{ all -> 0x0086 }
            if (r8 != 0) goto L_0x0089
            boolean r3 = r1.setWritable(r3)     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x006d
            goto L_0x0089
        L_0x006d:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0086 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r10.<init>(r5)     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = r1.getCanonicalPath()     // Catch:{ all -> 0x0086 }
            r10.append(r3)     // Catch:{ all -> 0x0086 }
            r10.append(r4)     // Catch:{ all -> 0x0086 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0086 }
            r9.<init>(r10)     // Catch:{ all -> 0x0086 }
            throw r9     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r9 = move-exception
            r6 = r7
            goto L_0x00ca
        L_0x0089:
            boolean r9 = r9.h(r7, r10)     // Catch:{ all -> 0x0086 }
            if (r9 == 0) goto L_0x0090
            goto L_0x0094
        L_0x0090:
            java.util.Objects.toString(r1)     // Catch:{ all -> 0x0086 }
            r6 = r7
        L_0x0094:
            if (r6 == 0) goto L_0x009f
            java.util.Objects.toString(r1)     // Catch:{ all -> 0x009d }
            r6.close()     // Catch:{ all -> 0x009d }
            goto L_0x00a2
        L_0x009d:
            r9 = move-exception
            goto L_0x00d7
        L_0x009f:
            java.util.Objects.toString(r1)     // Catch:{ all -> 0x009d }
        L_0x00a2:
            boolean r9 = r1.canWrite()
            if (r9 == 0) goto L_0x00c8
            boolean r9 = r1.setWritable(r2)
            if (r9 == 0) goto L_0x00af
            goto L_0x00c8
        L_0x00af:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r0)
            java.lang.String r0 = r1.getCanonicalPath()
            r10.append(r0)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x00c8:
            return
        L_0x00c9:
            r9 = move-exception
        L_0x00ca:
            if (r6 == 0) goto L_0x00d3
            java.util.Objects.toString(r1)     // Catch:{ all -> 0x009d }
            r6.close()     // Catch:{ all -> 0x009d }
            goto L_0x00d6
        L_0x00d3:
            java.util.Objects.toString(r1)     // Catch:{ all -> 0x009d }
        L_0x00d6:
            throw r9     // Catch:{ all -> 0x009d }
        L_0x00d7:
            boolean r10 = r1.canWrite()
            if (r10 == 0) goto L_0x00fc
            boolean r10 = r1.setWritable(r2)
            if (r10 != 0) goto L_0x00fc
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r0)
            java.lang.String r0 = r1.getCanonicalPath()
            r10.append(r0)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x00fc:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zvf.d(int):void");
    }

    public byte[] e() {
        Parcel obtain = Parcel.obtain();
        e g = g(false);
        try {
            fbf[] m = g.m();
            obtain.writeInt(m.length);
            for (fbf fbf : m) {
                obtain.writeString((String) fbf.b);
                obtain.writeString((String) fbf.c);
            }
            g.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public abstract e g(boolean z);

    /* JADX WARNING: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(defpackage.mm5 r16, int r17) {
        /*
            r15 = this;
            r1 = r15
            java.io.File r2 = new java.io.File
            java.io.File r3 = r1.a
            java.lang.String r0 = "dso_state"
            r2.<init>(r3, r0)
            byte[] r4 = r15.e()
            r0 = r17 & 2
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0016
            r7 = r5
            goto L_0x0017
        L_0x0016:
            r7 = r6
        L_0x0017:
            java.lang.String r8 = "dso_deps"
            java.lang.String r9 = "rw"
            if (r7 != 0) goto L_0x008f
            java.io.File r0 = new java.io.File
            r0.<init>(r3, r8)
            java.io.RandomAccessFile r10 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0034 }
            r10.<init>(r0, r9)     // Catch:{ IOException -> 0x0034 }
            long r11 = r10.length()     // Catch:{ all -> 0x004f }
            r13 = 0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0036
        L_0x0031:
            r10.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            r0 = r5
            goto L_0x005b
        L_0x0036:
            long r11 = r10.length()     // Catch:{ all -> 0x004f }
            int r0 = (int) r11     // Catch:{ all -> 0x004f }
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x004f }
            int r12 = r10.read(r11)     // Catch:{ all -> 0x004f }
            if (r12 == r0) goto L_0x0044
            goto L_0x0031
        L_0x0044:
            boolean r0 = java.util.Arrays.equals(r11, r4)     // Catch:{ all -> 0x004f }
            r0 = r0 ^ r5
            r10.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x005b
        L_0x004d:
            r11 = r0
            goto L_0x0051
        L_0x004f:
            r0 = move-exception
            goto L_0x004d
        L_0x0051:
            r10.close()     // Catch:{ all -> 0x0055 }
            goto L_0x005a
        L_0x0055:
            r0 = move-exception
            r10 = r0
            r11.addSuppressed(r10)     // Catch:{ IOException -> 0x0034 }
        L_0x005a:
            throw r11     // Catch:{ IOException -> 0x0034 }
        L_0x005b:
            if (r0 != 0) goto L_0x008f
            java.io.RandomAccessFile r10 = new java.io.RandomAccessFile
            r10.<init>(r2, r9)
            long r11 = r10.length()     // Catch:{ all -> 0x0076 }
            r13 = 1
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0080
            byte r0 = r10.readByte()     // Catch:{ IOException -> 0x0079 }
            if (r0 != r5) goto L_0x0080
            java.util.Objects.toString(r3)     // Catch:{ IOException -> 0x0079 }
            goto L_0x0081
        L_0x0076:
            r0 = move-exception
            r1 = r0
            goto L_0x0085
        L_0x0079:
            r0 = move-exception
            java.util.Objects.toString(r3)     // Catch:{ all -> 0x0076 }
            r0.getMessage()     // Catch:{ all -> 0x0076 }
        L_0x0080:
            r0 = r6
        L_0x0081:
            r10.close()
            goto L_0x0090
        L_0x0085:
            r10.close()     // Catch:{ all -> 0x0089 }
            goto L_0x008e
        L_0x0089:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L_0x008e:
            throw r1
        L_0x008f:
            r0 = r6
        L_0x0090:
            if (r0 != r5) goto L_0x0093
            return r6
        L_0x0093:
            r0 = r17 & 4
            if (r0 != 0) goto L_0x0099
            r0 = r5
            goto L_0x009a
        L_0x0099:
            r0 = r6
        L_0x009a:
            i(r2, r6, r0)
            k5a r10 = new k5a
            r11 = 1
            r10.<init>(r11)
            java.io.File[] r10 = r3.listFiles(r10)
            if (r10 == 0) goto L_0x011e
            int r11 = r10.length
            r12 = r6
        L_0x00ab:
            if (r12 >= r11) goto L_0x00b8
            r13 = r10[r12]
            java.util.Objects.toString(r13)
            defpackage.w6f.b(r13)
            int r12 = r12 + 1
            goto L_0x00ab
        L_0x00b8:
            com.facebook.soloader.e r7 = r15.g(r7)
            r7.n(r3)     // Catch:{ all -> 0x0112 }
            r7.close()
            java.io.File r7 = new java.io.File
            r7.<init>(r3, r8)
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile
            r8.<init>(r7, r9)
            r8.write(r4)     // Catch:{ all -> 0x0106 }
            long r9 = r8.getFilePointer()     // Catch:{ all -> 0x0106 }
            r8.setLength(r9)     // Catch:{ all -> 0x0106 }
            r8.close()
            yvf r4 = new yvf
            r7 = r16
            r4.<init>(r15, r0, r2, r7)
            r0 = r17 & 1
            if (r0 == 0) goto L_0x00e5
            r6 = r5
        L_0x00e5:
            if (r6 == 0) goto L_0x0102
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SoSync:"
            r1.<init>(r2)
            java.lang.String r2 = r3.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r4, r1)
            r0.start()
            goto L_0x0105
        L_0x0102:
            r4.run()
        L_0x0105:
            return r5
        L_0x0106:
            r0 = move-exception
            r1 = r0
            r8.close()     // Catch:{ all -> 0x010c }
            goto L_0x0111
        L_0x010c:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L_0x0111:
            throw r1
        L_0x0112:
            r0 = move-exception
            r1 = r0
            r7.close()     // Catch:{ all -> 0x0118 }
            goto L_0x011d
        L_0x0118:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L_0x011d:
            throw r1
        L_0x011e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unable to list directory "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zvf.h(mm5, int):boolean");
    }
}
