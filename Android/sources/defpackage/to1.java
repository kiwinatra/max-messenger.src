package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import org.webrtc.MediaStreamTrack;
import org.webrtc.ThreadUtils;

/* renamed from: to1  reason: default package */
public final class to1 {
    public static final /* synthetic */ int g = 0;
    public final ko1 a;
    public final AudioManager b;
    public final Handler c;
    public int d;
    public int e;
    public final b f = new b(26, (Object) this);

    public to1(Context context, ko1 ko1) {
        ThreadUtils.checkIsOnMainThread();
        this.a = ko1;
        this.b = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.e = 1;
        new ao(6, this);
        this.c = new Handler(Looper.getMainLooper());
    }

    public static String a(int i) {
        if (i == 0) {
            return "DISCONNECTED";
        }
        if (i == 1) {
            return "CONNECTING";
        }
        if (i == 2) {
            return "CONNECTED";
        }
        if (i == 3) {
            return "DISCONNECTING";
        }
        switch (i) {
            case 10:
                return "OFF";
            case 11:
                return "TURNING_ON";
            case 12:
                return "ON";
            case 13:
                return "TURNING_OFF";
            default:
                return "INVALID";
        }
    }

    public final void b() {
        ThreadUtils.checkIsOnMainThread();
        StringBuilder sb = new StringBuilder("stopScoAudio: BT state=");
        sb.append(a81.y(this.e));
        sb.append(", SCO is on: ");
        AudioManager audioManager = this.b;
        sb.append(audioManager.isBluetoothScoOn());
        z68.c("to1", sb.toString(), new Object[0]);
        int i = this.e;
        if (i == 6 || i == 7) {
            ThreadUtils.checkIsOnMainThread();
            z68.c("to1", "cancelTimer", new Object[0]);
            this.c.removeCallbacks(this.f);
            audioManager.stopBluetoothSco();
            audioManager.setBluetoothScoOn(false);
            this.e = 5;
            z68.c("to1", "stopScoAudio done: BT state=" + a81.y(this.e) + ", SCO is on: " + audioManager.isBluetoothScoOn(), new Object[0]);
        }
    }

    public final void c() {
        ThreadUtils.checkIsOnMainThread();
        z68.a("to1", "updateAudioDeviceState");
        this.a.k();
    }
}
