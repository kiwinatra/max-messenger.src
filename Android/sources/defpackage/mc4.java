package defpackage;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* renamed from: mc4  reason: default package */
public final class mc4 {
    public final AudioTrack a;
    public final y30 b;
    public lc4 c = new lc4(this);

    public mc4(AudioTrack audioTrack, y30 y30) {
        this.a = audioTrack;
        this.b = y30;
        audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
    }

    /* access modifiers changed from: private */
    public void b(AudioRouting audioRouting) {
        if (this.c != null && audioRouting.getRoutedDevice() != null) {
            this.b.b(audioRouting.getRoutedDevice());
        }
    }

    public void c() {
        lc4 lc4 = this.c;
        lc4.getClass();
        this.a.removeOnRoutingChangedListener(lc4);
        this.c = null;
    }
}
