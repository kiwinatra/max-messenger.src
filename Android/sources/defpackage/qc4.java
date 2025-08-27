package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* renamed from: qc4  reason: default package */
public final class qc4 {
    public final Handler a = new Handler(Looper.myLooper());
    public final pc4 b = new pc4(1, this);
    public final /* synthetic */ sc4 c;

    public qc4(sc4 sc4) {
        this.c = sc4;
    }

    public void a(AudioTrack audioTrack) {
        Handler handler = this.a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new oc4(handler, 0), this.b);
    }

    public void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages((Object) null);
    }
}
