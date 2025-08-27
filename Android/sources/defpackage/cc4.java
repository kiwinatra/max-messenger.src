package defpackage;

import android.media.AudioTrack;

/* renamed from: cc4  reason: default package */
public abstract class cc4 {
    public static void a(AudioTrack audioTrack, g40 g40) {
        audioTrack.setPreferredDevice(g40 == null ? null : g40.a);
    }
}
