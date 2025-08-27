package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;

/* renamed from: ky8  reason: default package */
public final class ky8 {
    public Context a;
    public final ContentResolver b;

    static {
        boolean z = ny8.b;
    }

    public ky8(Context context) {
        this.a = context;
        this.b = context.getContentResolver();
        this.a = context;
    }

    public final boolean a(jy8 jy8, String str) {
        int i = jy8.b;
        return i < 0 ? this.a.getPackageManager().checkPermission(str, jy8.a) == 0 : this.a.checkPermission(str, i, jy8.c) == 0;
    }

    public boolean b(jy8 jy8) {
        if (this.a.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", jy8.b, jy8.c) != 0) {
            try {
                if (this.a.getPackageManager().getApplicationInfo(jy8.a, 0) == null) {
                    return false;
                }
                if (!a(jy8, "android.permission.STATUS_BAR_SERVICE") && !a(jy8, "android.permission.MEDIA_CONTENT_CONTROL") && jy8.c != 1000) {
                    String string = Settings.Secure.getString(this.b, "enabled_notification_listeners");
                    if (string == null) {
                        return false;
                    }
                    String[] split = string.split(":");
                    int i = 0;
                    while (i < split.length) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(split[i]);
                        if (unflattenFromString == null || !unflattenFromString.getPackageName().equals(jy8.a)) {
                            i++;
                        }
                    }
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return true;
    }
}
