package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;

/* renamed from: ey8  reason: default package */
public abstract class ey8 {
    public static void a(px8 px8, ComponentName componentName) {
        MediaSession mediaSession = px8.a.a;
        mediaSession.getClass();
        mediaSession.setMediaButtonBroadcastReceiver(componentName);
    }
}
