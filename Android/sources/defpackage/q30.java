package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: q30  reason: default package */
public abstract class q30 {
    public static tb7 a(i30 i30) {
        qb7 o = tb7.o();
        wvf m = u30.e.keySet().iterator();
        while (m.hasNext()) {
            Integer num = (Integer) m.next();
            int intValue = num.intValue();
            if (v0g.a >= v0g.r(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), (AudioAttributes) i30.b().b)) {
                o.a(num);
            }
        }
        o.a(2);
        return o.j();
    }

    public static int b(int i, int i2, i30 i30) {
        for (int i3 = 10; i3 > 0; i3--) {
            int t = v0g.t(i3);
            if (t != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(t).build(), (AudioAttributes) i30.b().b)) {
                return i3;
            }
        }
        return 0;
    }
}
