package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: wd0  reason: default package */
public final class wd0 extends LruCache {
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Long l = (Long) obj;
        Bitmap bitmap = (Bitmap) obj2;
        Bitmap bitmap2 = (Bitmap) obj3;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
