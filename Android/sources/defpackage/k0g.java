package defpackage;

import android.content.Context;
import android.os.UserManager;

/* renamed from: k0g  reason: default package */
public abstract class k0g {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
