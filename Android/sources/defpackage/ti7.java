package defpackage;

import android.content.Intent;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: ti7  reason: default package */
public abstract class ti7 {
    public static <T> T[] a(Intent intent, String str, Class<T> cls) {
        return intent.getParcelableArrayExtra(str, cls);
    }

    public static <T> ArrayList<T> b(Intent intent, String str, Class<? extends T> cls) {
        return intent.getParcelableArrayListExtra(str, cls);
    }

    public static <T> T c(Intent intent, String str, Class<T> cls) {
        return intent.getParcelableExtra(str, cls);
    }

    public static <T extends Serializable> T d(Intent intent, String str, Class<T> cls) {
        return intent.getSerializableExtra(str, cls);
    }
}
