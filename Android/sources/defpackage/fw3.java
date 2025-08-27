package defpackage;

import android.content.Context;

/* renamed from: fw3  reason: default package */
public abstract class fw3 {
    public static int a(Context context, int i) {
        return context.getColor(i);
    }

    public static <T> T b(Context context, Class<T> cls) {
        return context.getSystemService(cls);
    }

    public static String c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
