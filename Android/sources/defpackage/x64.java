package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import kotlin.uuid.Uuid;

/* renamed from: x64  reason: default package */
public final class x64 {
    public final boolean a;

    public x64(Context context, String str) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context a2 = gw3.a(context);
        SharedPreferences sharedPreferences = a2.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        boolean z2 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = a2.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(a2.getPackageName(), Uuid.SIZE_BITS)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled"))) {
                    z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = z2;
        }
        this.a = z;
    }
}
