package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: tqg  reason: default package */
public abstract class tqg {
    public static final ColorDrawable a = new ColorDrawable(0);

    public static Drawable a(Drawable drawable, b9d b9d, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint = bitmapDrawable.getPaint();
            b9d.getClass();
            t8d t8d = new t8d(resources, bitmap, paint);
            b(t8d, b9d);
            return t8d;
        } else if (drawable instanceof NinePatchDrawable) {
            y8d y8d = new y8d((NinePatchDrawable) drawable);
            b(y8d, b9d);
            return y8d;
        } else if (drawable instanceof ColorDrawable) {
            v8d v8d = new v8d(((ColorDrawable) drawable).getColor());
            b(v8d, b9d);
            return v8d;
        } else {
            bg5.o("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
    }

    public static void b(s8d s8d, b9d b9d) {
        s8d.a(b9d.b);
        s8d.m(b9d.c);
        s8d.c(b9d.e, b9d.f);
        s8d.i(b9d.g);
        s8d.k();
        s8d.e(b9d.h);
        s8d.g();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable c(android.graphics.drawable.Drawable r3, defpackage.b9d r4, android.content.res.Resources r5) {
        /*
            defpackage.tf6.P()     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x003e
            if (r4 == 0) goto L_0x003e
            int r0 = r4.a     // Catch:{ all -> 0x0034 }
            r1 = 2
            if (r0 == r1) goto L_0x000d
            goto L_0x003e
        L_0x000d:
            boolean r0 = r3 instanceof defpackage.qb6     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0036
            r0 = r3
            qb6 r0 = (defpackage.qb6) r0     // Catch:{ all -> 0x0034 }
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r0.j()     // Catch:{ all -> 0x0034 }
            if (r1 == r0) goto L_0x0023
            boolean r2 = r1 instanceof defpackage.uu4     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            r0 = r1
            uu4 r0 = (defpackage.uu4) r0     // Catch:{ all -> 0x0034 }
            goto L_0x0014
        L_0x0023:
            android.graphics.drawable.ColorDrawable r1 = a     // Catch:{ all -> 0x0034 }
            android.graphics.drawable.Drawable r1 = r0.f(r1)     // Catch:{ all -> 0x0034 }
            android.graphics.drawable.Drawable r4 = a(r1, r4, r5)     // Catch:{ all -> 0x0034 }
            r0.f(r4)     // Catch:{ all -> 0x0034 }
            defpackage.tf6.P()
            return r3
        L_0x0034:
            r3 = move-exception
            goto L_0x0042
        L_0x0036:
            android.graphics.drawable.Drawable r3 = a(r3, r4, r5)     // Catch:{ all -> 0x0034 }
            defpackage.tf6.P()
            return r3
        L_0x003e:
            defpackage.tf6.P()
            return r3
        L_0x0042:
            defpackage.tf6.P()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqg.c(android.graphics.drawable.Drawable, b9d, android.content.res.Resources):android.graphics.drawable.Drawable");
    }

    public static Drawable d(Drawable drawable, b9d b9d) {
        try {
            if (!(drawable == null || b9d == null)) {
                if (b9d.a == 1) {
                    x8d x8d = new x8d(drawable);
                    b(x8d, b9d);
                    x8d.x0 = b9d.d;
                    x8d.invalidateSelf();
                    tf6.P();
                    return x8d;
                }
            }
            tf6.P();
            return drawable;
        } finally {
            tf6.P();
        }
    }

    public static Drawable e(Drawable drawable, xdd xdd) {
        tf6.P();
        if (drawable == null || xdd == null) {
            tf6.P();
            return drawable;
        }
        vdd vdd = new vdd(drawable, xdd);
        tf6.P();
        return vdd;
    }
}
