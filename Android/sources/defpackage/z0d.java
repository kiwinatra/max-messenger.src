package defpackage;

import android.app.RemoteInput;

/* renamed from: z0d  reason: default package */
public abstract class z0d {
    public static int a(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    public static RemoteInput.Builder b(RemoteInput.Builder builder, int i) {
        return builder.setEditChoicesBeforeSending(i);
    }
}
