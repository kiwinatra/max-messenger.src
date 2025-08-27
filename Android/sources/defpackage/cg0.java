package defpackage;

import android.content.Context;
import com.facebook.soloader.a;
import com.facebook.soloader.e;
import java.io.File;

/* renamed from: cg0  reason: default package */
public final class cg0 extends zvf {
    public final File e;
    public final String f = "^lib/([^/]+)/([^/]+\\.so)$";
    public final int g = 1;

    public cg0(Context context, File file, String str) {
        super(context, str);
        this.e = file;
    }

    public final String b() {
        return "BackupSoSource";
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a A[Catch:{ all -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047 A[SYNTHETIC, Splitter:B:16:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] e() {
        /*
            r6 = this;
            android.content.Context r0 = r6.d
            java.io.File r1 = r6.e
            java.io.File r1 = r1.getCanonicalFile()
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r3 = 2
            r2.writeByte(r3)     // Catch:{ all -> 0x0045 }
            java.lang.String r4 = r1.getPath()     // Catch:{ all -> 0x0045 }
            r2.writeString(r4)     // Catch:{ all -> 0x0045 }
            long r4 = r1.lastModified()     // Catch:{ all -> 0x0045 }
            r2.writeLong(r4)     // Catch:{ all -> 0x0045 }
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ all -> 0x0045 }
            r4 = 0
            if (r1 == 0) goto L_0x0030
            java.lang.String r5 = r0.getPackageName()     // Catch:{ NameNotFoundException | RuntimeException -> 0x0030 }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r5, r4)     // Catch:{ NameNotFoundException | RuntimeException -> 0x0030 }
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException | RuntimeException -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r1 = r4
        L_0x0031:
            r2.writeInt(r1)     // Catch:{ all -> 0x0045 }
            int r6 = r6.g     // Catch:{ all -> 0x0045 }
            r1 = 1
            r6 = r6 & r1
            if (r6 != 0) goto L_0x0047
            r2.writeByte(r4)     // Catch:{ all -> 0x0045 }
            byte[] r6 = r2.marshall()     // Catch:{ all -> 0x0045 }
            r2.recycle()
            return r6
        L_0x0045:
            r6 = move-exception
            goto L_0x008d
        L_0x0047:
            android.content.pm.ApplicationInfo r6 = r0.getApplicationInfo()     // Catch:{ all -> 0x0045 }
            java.lang.String r6 = r6.nativeLibraryDir     // Catch:{ all -> 0x0045 }
            if (r6 != 0) goto L_0x005a
            r2.writeByte(r1)     // Catch:{ all -> 0x0045 }
            byte[] r6 = r2.marshall()     // Catch:{ all -> 0x0045 }
            r2.recycle()
            return r6
        L_0x005a:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0045 }
            r0.<init>(r6)     // Catch:{ all -> 0x0045 }
            java.io.File r6 = r0.getCanonicalFile()     // Catch:{ all -> 0x0045 }
            boolean r0 = r6.exists()     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0074
            r2.writeByte(r1)     // Catch:{ all -> 0x0045 }
            byte[] r6 = r2.marshall()     // Catch:{ all -> 0x0045 }
            r2.recycle()
            return r6
        L_0x0074:
            r2.writeByte(r3)     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = r6.getPath()     // Catch:{ all -> 0x0045 }
            r2.writeString(r0)     // Catch:{ all -> 0x0045 }
            long r0 = r6.lastModified()     // Catch:{ all -> 0x0045 }
            r2.writeLong(r0)     // Catch:{ all -> 0x0045 }
            byte[] r6 = r2.marshall()     // Catch:{ all -> 0x0045 }
            r2.recycle()
            return r6
        L_0x008d:
            r2.recycle()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg0.e():byte[]");
    }

    public final e g(boolean z) {
        return new a(this, this, z);
    }
}
