package defpackage;

import android.media.AudioManager;
import android.os.PowerManager;
import kotlin.jvm.functions.Function0;
import org.webrtc.MediaStreamTrack;

/* renamed from: a40  reason: default package */
public final /* synthetic */ class a40 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ a40(f40 f40, int i) {
        this.a = i;
        this.b = f40;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (AudioManager) this.b.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            case 1:
                return ((PowerManager) this.b.a.getSystemService("power")).newWakeLock(32, "ru.ok.tamtam:tam-tam-prox");
            default:
                return ((PowerManager) this.b.a.getSystemService("power")).newWakeLock(536870918, "ru.ok.tamtam:tam-tam-screen-dim");
        }
    }
}
