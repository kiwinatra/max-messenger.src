package defpackage;

import org.webrtc.audio.JavaAudioDeviceModule;

/* renamed from: q6e  reason: default package */
public final /* synthetic */ class q6e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t6e b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ q6e(t6e t6e, boolean z, int i) {
        this.a = i;
        this.b = t6e;
        this.c = z;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                JavaAudioDeviceModule javaAudioDeviceModule = this.b.g;
                if (javaAudioDeviceModule != null) {
                    javaAudioDeviceModule.setMicrophoneMute(this.c);
                    return;
                }
                return;
            case 1:
                JavaAudioDeviceModule javaAudioDeviceModule2 = this.b.g;
                if (javaAudioDeviceModule2 != null) {
                    javaAudioDeviceModule2.setSpeakerMute(this.c);
                    return;
                }
                return;
            default:
                JavaAudioDeviceModule javaAudioDeviceModule3 = this.b.g;
                if (javaAudioDeviceModule3 != null) {
                    javaAudioDeviceModule3.setNoiseSuppressorEnabled(this.c);
                    return;
                }
                return;
        }
    }
}
