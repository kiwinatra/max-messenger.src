package defpackage;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: yx4  reason: default package */
public final class yx4 implements lo0 {
    public final Set a = Collections.newSetFromMap(new IdentityHashMap());

    public final void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        this.a.remove(bitmap);
        bitmap.recycle();
    }

    public final Object get(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
        this.a.add(createBitmap);
        return createBitmap;
    }
}
