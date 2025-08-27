package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: m6c  reason: default package */
public abstract class m6c {
    public static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
    }
}
