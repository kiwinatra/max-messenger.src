package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.mediarouter.app.d;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* renamed from: lv8  reason: default package */
public final class lv8 extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public long d;
    public final /* synthetic */ d e;

    public lv8(d dVar) {
        this.e = dVar;
        MediaDescriptionCompat mediaDescriptionCompat = dVar.d1;
        Uri uri = null;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        if (iconBitmap != null && iconBitmap.isRecycled()) {
            iconBitmap = null;
        }
        this.a = iconBitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = dVar.d1;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : uri;
    }

    public final BufferedInputStream a(Uri uri) {
        InputStream inputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            inputStream = this.e.X.getContentResolver().openInputStream(uri);
        } else {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            int i = d.x1;
            openConnection.setConnectTimeout(i);
            openConnection.setReadTimeout(i);
            inputStream = openConnection.getInputStream();
        }
        if (inputStream == null) {
            return null;
        }
        return new BufferedInputStream(inputStream);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:19|20|21|22|(2:24|(1:26)(1:65))|27|(1:29)(3:30|31|32)) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        java.util.Objects.toString(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0076, code lost:
        if (r3 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0073 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042 A[Catch:{ IOException -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007e A[SYNTHETIC, Splitter:B:42:0x007e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        /*
            r8 = this;
            java.lang.Void[] r9 = (java.lang.Void[]) r9
            r9 = 0
            r0 = 1
            r1 = 0
            android.graphics.Bitmap r2 = r8.a
            if (r2 == 0) goto L_0x000b
            goto L_0x0083
        L_0x000b:
            android.net.Uri r2 = r8.b
            if (r2 == 0) goto L_0x0082
            java.io.BufferedInputStream r3 = r8.a(r2)     // Catch:{ IOException -> 0x0072, all -> 0x0070 }
            if (r3 != 0) goto L_0x0022
            java.util.Objects.toString(r2)     // Catch:{ IOException -> 0x0073 }
            if (r3 == 0) goto L_0x00c4
        L_0x001a:
            r3.close()     // Catch:{ IOException -> 0x00c4 }
            goto L_0x00c4
        L_0x001f:
            r8 = move-exception
            r1 = r3
            goto L_0x007c
        L_0x0022:
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0073 }
            r4.<init>()     // Catch:{ IOException -> 0x0073 }
            r4.inJustDecodeBounds = r0     // Catch:{ IOException -> 0x0073 }
            android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch:{ IOException -> 0x0073 }
            int r5 = r4.outWidth     // Catch:{ IOException -> 0x0073 }
            if (r5 == 0) goto L_0x001a
            int r5 = r4.outHeight     // Catch:{ IOException -> 0x0073 }
            if (r5 != 0) goto L_0x0035
            goto L_0x001a
        L_0x0035:
            r3.reset()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0048
        L_0x0039:
            r3.close()     // Catch:{ IOException -> 0x0073 }
            java.io.BufferedInputStream r3 = r8.a(r2)     // Catch:{ IOException -> 0x0073 }
            if (r3 != 0) goto L_0x0048
            java.util.Objects.toString(r2)     // Catch:{ IOException -> 0x0073 }
            if (r3 == 0) goto L_0x00c4
            goto L_0x001a
        L_0x0048:
            r4.inJustDecodeBounds = r9     // Catch:{ IOException -> 0x0073 }
            androidx.mediarouter.app.d r5 = r8.e     // Catch:{ IOException -> 0x0073 }
            int r6 = r4.outWidth     // Catch:{ IOException -> 0x0073 }
            int r7 = r4.outHeight     // Catch:{ IOException -> 0x0073 }
            int r5 = r5.l(r6, r7)     // Catch:{ IOException -> 0x0073 }
            int r6 = r4.outHeight     // Catch:{ IOException -> 0x0073 }
            int r6 = r6 / r5
            int r5 = java.lang.Integer.highestOneBit(r6)     // Catch:{ IOException -> 0x0073 }
            int r5 = java.lang.Math.max(r0, r5)     // Catch:{ IOException -> 0x0073 }
            r4.inSampleSize = r5     // Catch:{ IOException -> 0x0073 }
            boolean r5 = r8.isCancelled()     // Catch:{ IOException -> 0x0073 }
            if (r5 == 0) goto L_0x0068
            goto L_0x001a
        L_0x0068:
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch:{ IOException -> 0x0073 }
            r3.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0083
        L_0x0070:
            r8 = move-exception
            goto L_0x007c
        L_0x0072:
            r3 = r1
        L_0x0073:
            java.util.Objects.toString(r2)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x0082
            r3.close()     // Catch:{ IOException -> 0x0082 }
            goto L_0x0082
        L_0x007c:
            if (r1 == 0) goto L_0x0081
            r1.close()     // Catch:{ IOException -> 0x0081 }
        L_0x0081:
            throw r8
        L_0x0082:
            r2 = r1
        L_0x0083:
            if (r2 == 0) goto L_0x008f
            boolean r3 = r2.isRecycled()
            if (r3 == 0) goto L_0x008f
            java.util.Objects.toString(r2)
            goto L_0x00c4
        L_0x008f:
            if (r2 == 0) goto L_0x00c3
            int r1 = r2.getWidth()
            int r3 = r2.getHeight()
            if (r1 >= r3) goto L_0x00c3
            x7b r1 = new x7b
            r1.<init>(r2)
            r1.c = r0
            zc4 r0 = r1.a()
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00b5
            goto L_0x00c1
        L_0x00b5:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r9 = r0.get(r9)
            y7b r9 = (defpackage.y7b) r9
            int r9 = r9.d
        L_0x00c1:
            r8.c = r9
        L_0x00c3:
            r1 = r2
        L_0x00c4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv8.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        d dVar = this.e;
        dVar.e1 = null;
        Bitmap bitmap2 = dVar.f1;
        Bitmap bitmap3 = this.a;
        boolean equals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.b;
        if (!equals || !Objects.equals(dVar.g1, uri)) {
            dVar.f1 = bitmap3;
            dVar.i1 = bitmap;
            dVar.g1 = uri;
            dVar.j1 = this.c;
            boolean z = true;
            dVar.h1 = true;
            if (SystemClock.uptimeMillis() - this.d <= 120) {
                z = false;
            }
            dVar.q(z);
        }
    }

    public final void onPreExecute() {
        this.d = SystemClock.uptimeMillis();
        d dVar = this.e;
        dVar.h1 = false;
        dVar.i1 = null;
        dVar.j1 = 0;
    }
}
