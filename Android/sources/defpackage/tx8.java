package defpackage;

import android.content.Context;

/* renamed from: tx8  reason: default package */
public abstract class tx8 {
    public static boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.software.leanback");
    }
}
