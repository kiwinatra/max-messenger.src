package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: ew3  reason: default package */
public abstract class ew3 {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int i) {
        return context.getDrawable(i);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
