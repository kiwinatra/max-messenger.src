package defpackage;

import android.media.AudioManager;
import android.os.Vibrator;
import kotlin.jvm.functions.Function0;
import org.webrtc.MediaStreamTrack;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: rg1  reason: default package */
public final /* synthetic */ class rg1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg1 b;

    public /* synthetic */ rg1(tg1 tg1, int i) {
        this.a = i;
        this.b = tg1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (AudioManager) this.b.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            case 1:
                return (Vibrator) this.b.a.getSystemService("vibrator");
            default:
                akd akd = (akd) this.b.c;
                akd.getClass();
                return Boolean.valueOf(akd.m(PmsKey.f97reconnectcallringtone, false));
        }
    }
}
