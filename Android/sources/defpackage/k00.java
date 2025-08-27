package defpackage;

import android.net.Uri;
import java.io.File;

/* renamed from: k00  reason: default package */
public final class k00 extends d48 {
    public static final /* synthetic */ int x0 = 0;
    public l20 X;
    public final long Y;
    public final long Z;
    public File v0;
    public final Uri w0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k00(defpackage.l20 r16, defpackage.x10 r17, long r18, long r20, android.net.Uri r22) {
        /*
            r15 = this;
            r13 = r15
            r14 = r16
            r0 = r17
            java.lang.String r1 = r14.q
            int r1 = r1.hashCode()
            long r2 = (long) r1
            java.lang.String r1 = r14.r
            if (r1 == 0) goto L_0x001c
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            java.lang.String r4 = defpackage.o5a.z(r1)
            goto L_0x0020
        L_0x001c:
            java.lang.String r4 = r17.a()
        L_0x0020:
            boolean r5 = r0.v
            java.lang.String r6 = r0.Y
            if (r5 == 0) goto L_0x0030
            if (r6 != 0) goto L_0x002e
            java.lang.String r1 = r17.a()
        L_0x002c:
            r5 = r1
            goto L_0x0045
        L_0x002e:
            r5 = r6
            goto L_0x0045
        L_0x0030:
            if (r1 == 0) goto L_0x003e
            int r5 = r1.length()
            if (r5 != 0) goto L_0x0039
            goto L_0x003e
        L_0x0039:
            java.lang.String r1 = defpackage.o5a.z(r1)
            goto L_0x002c
        L_0x003e:
            if (r6 != 0) goto L_0x002e
            java.lang.String r1 = r17.a()
            goto L_0x002c
        L_0x0045:
            boolean r0 = r0.v
            if (r0 == 0) goto L_0x004f
            o9a r0 = defpackage.sq9.b
            java.lang.String r0 = "image/gif"
        L_0x004d:
            r9 = r0
            goto L_0x0054
        L_0x004f:
            o9a r0 = defpackage.sq9.b
            java.lang.String r0 = "image/jpeg"
            goto L_0x004d
        L_0x0054:
            r6 = 0
            r7 = 0
            r1 = 1
            r10 = 0
            r12 = 0
            r0 = r15
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r10, r12)
            r13.X = r14
            r0 = r18
            r13.Y = r0
            r0 = r20
            r13.Z = r0
            r0 = r22
            r13.w0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.<init>(l20, x10, long, long, android.net.Uri):void");
    }

    public final String a() {
        Uri uri = this.w0;
        if (uri != null) {
            return String.valueOf(uri);
        }
        File file = this.v0;
        if (file == null) {
            return super.a();
        }
        String path = file.getPath();
        if (path != null) {
            return path;
        }
        Uri c = c();
        if (c != null) {
            return c.getPath();
        }
        return null;
    }

    public final Uri c() {
        Uri uri = this.w0;
        if (uri != null) {
            return uri;
        }
        Uri x = o5a.x(this.X.r);
        return x != null ? x : super.c();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k00(defpackage.l20 r16, defpackage.k20 r17, long r18, long r20, android.net.Uri r22) {
        /*
            r15 = this;
            r13 = r15
            r14 = r16
            r0 = r17
            java.lang.String r1 = r14.q
            int r1 = r1.hashCode()
            long r2 = (long) r1
            java.lang.String r1 = r14.r
            if (r1 == 0) goto L_0x0026
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0017
            goto L_0x0026
        L_0x0017:
            java.io.File r4 = new java.io.File
            r4.<init>(r1)
            android.net.Uri r1 = android.net.Uri.fromFile(r4)
            java.lang.String r1 = r1.toString()
        L_0x0024:
            r4 = r1
            goto L_0x0029
        L_0x0026:
            java.lang.String r1 = r0.g
            goto L_0x0024
        L_0x0029:
            java.lang.String r5 = r0.c
            o9a r1 = defpackage.sq9.b
            long r7 = r0.b
            r12 = 0
            r1 = 3
            r6 = 0
            java.lang.String r9 = "video/mp4"
            r10 = 0
            r0 = r15
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r10, r12)
            r13.X = r14
            r0 = r18
            r13.Y = r0
            r0 = r20
            r13.Z = r0
            r0 = r22
            r13.w0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.<init>(l20, k20, long, long, android.net.Uri):void");
    }
}
