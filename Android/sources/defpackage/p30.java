package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: p30  reason: default package */
public abstract class p30 {
    public static int[] a() {
        qb7 o = tb7.o();
        for (int i : t30.e) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                o.a(Integer.valueOf(i));
            }
        }
        o.a(2);
        return cvg.L(o.j());
    }
}
