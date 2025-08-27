package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: v67  reason: default package */
public abstract class v67 {
    public static IconCompat a(Icon icon) {
        icon.getClass();
        int c = x67.c(icon);
        if (c == 2) {
            return IconCompat.d((Resources) null, x67.b(icon), x67.a(icon));
        }
        if (c == 4) {
            Uri b = b(icon);
            PorterDuff.Mode mode = IconCompat.k;
            b.getClass();
            String uri = b.toString();
            uri.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.b = uri;
            return iconCompat;
        } else if (c != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.b = icon;
            return iconCompat2;
        } else {
            Uri b2 = b(icon);
            PorterDuff.Mode mode2 = IconCompat.k;
            b2.getClass();
            String uri2 = b2.toString();
            uri2.getClass();
            IconCompat iconCompat3 = new IconCompat(6);
            iconCompat3.b = uri2;
            return iconCompat3;
        }
    }

    public static Uri b(Object obj) {
        return x67.d(obj);
    }

    public static Drawable c(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Icon d(androidx.core.graphics.drawable.IconCompat r3, android.content.Context r4) {
        /*
            int r0 = r3.a
            switch(r0) {
                case -1: goto L_0x00d6;
                case 0: goto L_0x0005;
                case 1: goto L_0x00bd;
                case 2: goto L_0x00b2;
                case 3: goto L_0x00a5;
                case 4: goto L_0x009c;
                case 5: goto L_0x0093;
                case 6: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Unknown type"
            r3.<init>(r4)
            throw r3
        L_0x000d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L_0x001d
            android.net.Uri r4 = r3.g()
            android.graphics.drawable.Icon r4 = defpackage.y67.a(r4)
            goto L_0x00c5
        L_0x001d:
            if (r4 == 0) goto L_0x007b
            android.net.Uri r0 = r3.g()
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x004b
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0038
            goto L_0x004b
        L_0x0038:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0047 }
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0047 }
            java.lang.Object r2 = r3.b     // Catch:{ FileNotFoundException -> 0x0047 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ FileNotFoundException -> 0x0047 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0047 }
            r4.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0047 }
            goto L_0x0058
        L_0x0047:
            r0.toString()
            goto L_0x0057
        L_0x004b:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ Exception -> 0x0054 }
            java.io.InputStream r4 = r4.openInputStream(r0)     // Catch:{ Exception -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r0.toString()
        L_0x0057:
            r4 = 0
        L_0x0058:
            if (r4 == 0) goto L_0x0063
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4)
            android.graphics.drawable.Icon r4 = defpackage.w67.b(r4)
            goto L_0x00c5
        L_0x0063:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.<init>(r1)
            android.net.Uri r3 = r3.g()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L_0x007b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.<init>(r1)
            android.net.Uri r3 = r3.g()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L_0x0093:
            java.lang.Object r4 = r3.b
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            android.graphics.drawable.Icon r4 = defpackage.w67.b(r4)
            goto L_0x00c5
        L_0x009c:
            java.lang.Object r4 = r3.b
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithContentUri(r4)
            goto L_0x00c5
        L_0x00a5:
            java.lang.Object r4 = r3.b
            byte[] r4 = (byte[]) r4
            int r0 = r3.e
            int r1 = r3.f
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithData(r4, r0, r1)
            goto L_0x00c5
        L_0x00b2:
            java.lang.String r4 = r3.f()
            int r0 = r3.e
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithResource(r4, r0)
            goto L_0x00c5
        L_0x00bd:
            java.lang.Object r4 = r3.b
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithBitmap(r4)
        L_0x00c5:
            android.content.res.ColorStateList r0 = r3.g
            if (r0 == 0) goto L_0x00cc
            r4.setTintList(r0)
        L_0x00cc:
            android.graphics.PorterDuff$Mode r3 = r3.h
            android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.k
            if (r3 == r0) goto L_0x00d5
            r4.setTintMode(r3)
        L_0x00d5:
            return r4
        L_0x00d6:
            java.lang.Object r3 = r3.b
            android.graphics.drawable.Icon r3 = (android.graphics.drawable.Icon) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v67.d(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }
}
