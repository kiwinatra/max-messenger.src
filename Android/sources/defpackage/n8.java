package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: n8  reason: default package */
public abstract class n8 {
    public static boolean a(Activity activity) {
        return activity.isLaunchedFromBubble();
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static boolean b(Activity activity, String str) {
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class}).invoke(activity.getApplication().getPackageManager(), new Object[]{str})).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
