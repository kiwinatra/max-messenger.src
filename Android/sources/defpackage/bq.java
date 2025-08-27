package defpackage;

import android.content.Context;
import android.media.AudioManager;
import org.webrtc.MediaStreamTrack;

/* renamed from: bq  reason: default package */
public final /* synthetic */ class bq implements u2f, e3f {
    public final /* synthetic */ Context a;

    public /* synthetic */ bq(Context context) {
        this.a = context;
    }

    public f3f c(g5b g5b) {
        ty tyVar = (ty) g5b.v;
        if (tyVar != null) {
            String str = (String) g5b.o;
            if (str != null && str.length() != 0) {
                return new ef6(this.a, str, tyVar, true, true);
            }
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
    }

    public Object get() {
        return (AudioManager) this.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }
}
