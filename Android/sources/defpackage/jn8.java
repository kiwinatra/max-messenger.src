package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* renamed from: jn8  reason: default package */
public abstract class jn8 {
    public static void a(j70 j70, Object obj) {
        g40 g40;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        sc4 sc4 = (sc4) j70;
        if (audioDeviceInfo == null) {
            g40 = null;
        } else {
            sc4.getClass();
            g40 = new g40(audioDeviceInfo);
        }
        sc4.c0 = g40;
        y30 y30 = sc4.y;
        if (y30 != null) {
            y30.b(audioDeviceInfo);
        }
        AudioTrack audioTrack = sc4.w;
        if (audioTrack != null) {
            cc4.a(audioTrack, sc4.c0);
        }
    }
}
