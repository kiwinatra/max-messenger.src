package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* renamed from: ac4  reason: default package */
public abstract class ac4 {
    /* JADX WARNING: type inference failed for: r4v1, types: [z50, java.lang.Object] */
    public static a60 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int a = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (a == 0) {
            return a60.d;
        }
        ? obj = new Object();
        boolean z2 = v0g.a > 32 && a == 2;
        obj.a = true;
        obj.b = z2;
        obj.c = z;
        return obj.a();
    }
}
