package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* renamed from: zb4  reason: default package */
public abstract class zb4 {
    /* JADX WARNING: type inference failed for: r0v2, types: [z50, java.lang.Object] */
    public static a60 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return a60.d;
        }
        ? obj = new Object();
        obj.a = true;
        obj.c = z;
        return obj.a();
    }
}
