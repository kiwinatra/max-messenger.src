package defpackage;

import android.app.Notification;
import android.media.session.MediaSession;

/* renamed from: o09  reason: default package */
public abstract class o09 {
    public static Notification.MediaStyle a() {
        return new Notification.MediaStyle();
    }

    public static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, int[] iArr, ex8 ex8) {
        mediaStyle.getClass();
        ex8.getClass();
        if (iArr != null) {
            d(mediaStyle, iArr);
        }
        mediaStyle.setMediaSession((MediaSession.Token) ex8.a.h.X.a.c.b);
        return mediaStyle;
    }

    public static void c(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    public static void d(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
