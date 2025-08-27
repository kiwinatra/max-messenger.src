package defpackage;

import android.content.Context;
import android.media.AudioManager;
import kotlin.jvm.functions.Function0;
import org.webrtc.MediaStreamTrack;

/* renamed from: o40  reason: default package */
public final /* synthetic */ class o40 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q40 b;

    public /* synthetic */ o40(q40 q40, int i) {
        this.a = i;
        this.b = q40;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ao(2, this.b);
            default:
                return (AudioManager) ((Context) this.b.a).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        }
    }
}
