package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* renamed from: nxe  reason: default package */
public final class nxe {
    public final Handler a;
    public final mc5 b;
    public final AudioManager c;
    public int d = 3;
    public int e;
    public boolean f;

    public nxe(Context context, Handler handler, mc5 mc5) {
        Context applicationContext = context.getApplicationContext();
        this.a = handler;
        this.b = mc5;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        y64.k(audioManager);
        this.c = audioManager;
        this.e = a(audioManager, 3);
        int i = this.d;
        this.f = t0g.a >= 23 ? audioManager.isStreamMute(i) : a(audioManager, i) == 0;
        try {
            applicationContext.registerReceiver(new ao(15, this), new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        } catch (RuntimeException e2) {
            iq.a("Error registering stream volume receiver", e2);
        }
    }

    public static int a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            iq.a(sb.toString(), e2);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final void b() {
        int i = this.d;
        AudioManager audioManager = this.c;
        int a2 = a(audioManager, i);
        int i2 = this.d;
        boolean isStreamMute = t0g.a >= 23 ? audioManager.isStreamMute(i2) : a(audioManager, i2) == 0;
        if (this.e != a2 || this.f != isStreamMute) {
            this.e = a2;
            this.f = isStreamMute;
            this.b.a.Z.r(30, new hm3(a2, isStreamMute));
        }
    }
}
