package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: ez  reason: default package */
public final class ez {
    public final String a;
    public final dz b;
    public final File c;
    public final File d;
    public final File e;

    public ez(File file, lc5 lc5) {
        this.b = lc5 == null ? dz.f : lc5;
        this.c = file;
        this.d = new File(file.getPath() + ".new");
        this.e = new File(file.getPath() + ".bak");
        StringBuilder sb = new StringBuilder("AtomicFile-");
        sb.append(file.getName());
        this.a = sb.toString();
    }

    public final void a(FileOutputStream fileOutputStream) {
        boolean z;
        try {
            fileOutputStream.getFD().sync();
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        String str = this.a;
        dz dzVar = this.b;
        if (!z) {
            dzVar.d(str + ": Failed to sync file output stream", (Throwable) null);
        }
        try {
            fileOutputStream.close();
        } catch (IOException e2) {
            dzVar.d(str + ": Failed to close file output stream", e2);
        }
        File file = this.d;
        if (!file.delete()) {
            dzVar.d(str + ": Failed to delete new file " + file, (Throwable) null);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r3.b.d(defpackage.wj6.n(new java.lang.StringBuilder(), r3.a, ": Failed to close file output stream"), r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.io.FileOutputStream r4) {
        /*
            r3 = this;
            java.io.FileDescriptor r0 = r4.getFD()     // Catch:{ IOException -> 0x0007 }
            r0.sync()     // Catch:{ IOException -> 0x0007 }
        L_0x0007:
            r4.close()     // Catch:{ IOException -> 0x000b }
            goto L_0x001e
        L_0x000b:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.a
            java.lang.String r2 = ": Failed to close file output stream"
            java.lang.String r0 = defpackage.wj6.n(r0, r1, r2)
            dz r1 = r3.b
            r1.d(r0, r4)
        L_0x001e:
            java.io.File r4 = r3.d
            java.io.File r0 = r3.c
            r3.e(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez.b(java.io.FileOutputStream):void");
    }

    public final FileInputStream c() {
        File file = this.e;
        boolean exists = file.exists();
        File file2 = this.c;
        if (exists) {
            e(file, file2);
        }
        File file3 = this.d;
        boolean exists2 = file3.exists();
        String str = this.a;
        dz dzVar = this.b;
        if (exists2 && file2.exists() && !file3.delete()) {
            dzVar.d(str + ": Failed to delete outdated new file " + file3, (Throwable) null);
        }
        try {
            if (file2.canRead()) {
                return new FileInputStream(file2);
            }
        } catch (Throwable th) {
            dzVar.d(str + ": Fail to create FileInputStream for file " + file2, th);
        }
        return null;
    }

    public final byte[] d() {
        FileInputStream c2 = c();
        if (c2 == null) {
            return new byte[0];
        }
        try {
            byte[] bArr = new byte[c2.available()];
            int i = 0;
            while (true) {
                int read = c2.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = c2.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[(available + i)];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            c2.close();
        }
    }

    public final void e(File file, File file2) {
        boolean isDirectory = file2.isDirectory();
        String str = this.a;
        dz dzVar = this.b;
        if (isDirectory && !file2.delete()) {
            dzVar.d(str + ": Failed to delete file which is a directory " + file2, (Throwable) null);
        }
        if (!file.renameTo(file2)) {
            dzVar.d(str + ": Failed to rename " + file + " to " + file2, (Throwable) null);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.FileOutputStream f() {
        /*
            r5 = this;
            java.io.File r0 = r5.e
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x000d
            java.io.File r1 = r5.c
            r5.e(r0, r1)
        L_0x000d:
            java.io.File r0 = r5.d
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0015 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0015 }
            goto L_0x0064
        L_0x0015:
            java.io.File r1 = r0.getParentFile()
            boolean r2 = r1.mkdir()
            java.lang.String r3 = r5.a
            dz r5 = r5.b
            r4 = 0
            if (r2 != 0) goto L_0x003c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = "Couldn't create directory for AtomicFile "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.d(r0, r4)
            goto L_0x0065
        L_0x003c:
            java.lang.String r1 = r1.getAbsolutePath()
            r2 = 505(0x1f9, float:7.08E-43)
            android.system.Os.chmod(r1, r2)     // Catch:{ ErrnoException -> 0x0045 }
        L_0x0045:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x004b }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x004b }
            goto L_0x0064
        L_0x004b:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = ": Couldn't create AtomicFile "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r5.d(r0, r1)
            r1 = r4
        L_0x0064:
            r4 = r1
        L_0x0065:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez.f():java.io.FileOutputStream");
    }
}
