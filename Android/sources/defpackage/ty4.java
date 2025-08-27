package defpackage;

import android.util.Log;
import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* renamed from: ty4  reason: default package */
public final class ty4 implements tp4 {
    public final int a;
    public final r2f b;
    public final String c;
    public final o9a d;
    public volatile ata e = new ata((Object) null, (Object) null, false, 11);

    public ty4(int i, r2f r2f, String str, o9a o9a) {
        this.a = i;
        this.d = o9a;
        this.b = r2f;
        this.c = str;
    }

    public final ml5 a(Object obj, String str) {
        return h().a(obj, str);
    }

    public final void b() {
        try {
            h().b();
        } catch (IOException e2) {
            if (bg5.a.a(6)) {
                Log.getStackTraceString(e2);
            }
        }
    }

    public final long c(yd4 yd4) {
        return h().c(yd4);
    }

    public final Collection d() {
        return h().d();
    }

    public final void e() {
        h().e();
    }

    public final w28 f(Object obj, String str) {
        return h().f(obj, str);
    }

    public final void g() {
        File file = new File((File) this.b.get(), this.c);
        try {
            kne.E(file);
            file.getAbsolutePath();
            bg5.a.getClass();
            this.e = new ata(file, new be4(file, this.a, this.d), false, 11);
        } catch (FileUtils$CreateDirectoryException e2) {
            this.d.getClass();
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b A[Catch:{ all -> 0x0038 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.tp4 h() {
        /*
            r2 = this;
            monitor-enter(r2)
            ata r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r1 = r0.b     // Catch:{ all -> 0x0038 }
            tp4 r1 = (defpackage.tp4) r1     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0018
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x0038 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            if (r0 == 0) goto L_0x003a
            ata r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0038 }
            tp4 r0 = (defpackage.tp4) r0     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0034
            ata r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x0038 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0034
            ata r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x0038 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0038 }
            defpackage.i8b.n(r0)     // Catch:{ all -> 0x0038 }
        L_0x0034:
            r2.g()     // Catch:{ all -> 0x0038 }
            goto L_0x003a
        L_0x0038:
            r0 = move-exception
            goto L_0x0045
        L_0x003a:
            ata r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0038 }
            tp4 r0 = (defpackage.tp4) r0     // Catch:{ all -> 0x0038 }
            r0.getClass()     // Catch:{ all -> 0x0038 }
            monitor-exit(r2)
            return r0
        L_0x0045:
            monitor-exit(r2)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty4.h():tp4");
    }

    public final boolean isExternal() {
        try {
            return h().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }
}
