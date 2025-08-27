package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: et6  reason: default package */
public class et6 {
    public static final int a = 12451000;
    public static final et6 b = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [et6, java.lang.Object] */
    static {
        int i = ot6.e;
    }

    public Intent a(int i, Context context, String str) {
        if (i == 1 || i == 2) {
            if (context == null || !b59.K(context)) {
                StringBuilder sb = new StringBuilder("gcore_");
                sb.append(a);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        xg4 a2 = rqg.a(context);
                        sb.append(a2.a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb2 = sb.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb2)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    public int b(int i, Context context) {
        int a2 = ot6.a(i, context);
        boolean z = true;
        if (a2 != 18) {
            z = a2 == 1 ? ot6.b(context) : false;
        }
        if (z) {
            return 18;
        }
        return a2;
    }
}
