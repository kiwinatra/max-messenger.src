package defpackage;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;

/* renamed from: yca  reason: default package */
public abstract class yca {
    @SuppressLint({"MissingPermission"})
    public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i, pendingIntent);
        }
        return mediaStyle;
    }
}
