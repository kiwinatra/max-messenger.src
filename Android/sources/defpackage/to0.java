package defpackage;

import android.graphics.Bitmap;
import android.media.VolumeProvider;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;

/* renamed from: to0  reason: default package */
public final class to0 implements hgd {
    public final int a;
    public final int b;
    public final String c;
    public int o;
    public Object v;
    public final Object w;
    public final Object x;

    public to0(String str, Bitmap bitmap) {
        this.v = bitmap;
        this.c = str;
        this.w = sq9.IMAGE_JPEG;
        this.a = bitmap.getByteCount();
        this.b = bitmap.getWidth();
        this.o = bitmap.getHeight();
        this.x = MediaStore.Images.Media.getContentUri("external_primary");
    }

    public VolumeProvider a() {
        if (((VolumeProvider) this.v) == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.v = new zdg(this, this.a, this.b, this.o, this.c);
            } else {
                this.v = new pj1(this, this.a, this.b, this.o);
            }
        }
        return (VolumeProvider) this.v;
    }

    public sq9 b() {
        return (sq9) this.w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.content.ContentResolver r2, android.net.Uri r3) {
        /*
            r1 = this;
            java.lang.String r0 = "w"
            java.io.OutputStream r2 = r2.openOutputStream(r3, r0)
            if (r2 == 0) goto L_0x001f
            java.lang.Object r1 = r1.v     // Catch:{ all -> 0x0018 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x0018 }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0018 }
            r0 = 100
            r1.compress(r3, r0, r2)     // Catch:{ all -> 0x0018 }
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r2, r1)
            goto L_0x001f
        L_0x0018:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001a }
        L_0x001a:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r1)
            throw r3
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to0.c(android.content.ContentResolver, android.net.Uri):void");
    }

    public Uri g() {
        return (Uri) this.x;
    }

    public Integer getHeight() {
        return Integer.valueOf(this.o);
    }

    public Integer getWidth() {
        return Integer.valueOf(this.b);
    }

    public String i() {
        return this.c;
    }

    public Integer j() {
        return Integer.valueOf(this.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(java.io.File r3) {
        /*
            r2 = this;
            java.io.File r3 = r3.getAbsoluteFile()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r3)
            java.lang.Object r2 = r2.v     // Catch:{ all -> 0x0019 }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ all -> 0x0019 }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0019 }
            r1 = 100
            r2.compress(r3, r1, r0)     // Catch:{ all -> 0x0019 }
            r2 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            return
        L_0x0019:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001b }
        L_0x001b:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to0.m(java.io.File):void");
    }

    public /* synthetic */ to0(Bitmap bitmap) {
        this(Environment.DIRECTORY_PICTURES, bitmap);
    }

    public to0(ypb ypb, int i, int i2, int i3, String str, Handler handler) {
        this.x = ypb;
        this.w = handler;
        this.a = i;
        this.b = i2;
        this.o = i3;
        this.c = str;
    }
}
