package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: gw3  reason: default package */
public abstract class gw3 {
    public static Context a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static File b(Context context) {
        return context.getDataDir();
    }

    public static boolean c(Context context) {
        return context.isDeviceProtectedStorage();
    }
}
