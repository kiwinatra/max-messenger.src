package defpackage;

import org.webrtc.PeerConnectionFactory;
import org.webrtc.audio.JavaAudioDeviceModule;

/* renamed from: r6e  reason: default package */
public final /* synthetic */ class r6e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t6e b;

    public /* synthetic */ r6e(t6e t6e, int i) {
        this.a = i;
        this.b = t6e;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                JavaAudioDeviceModule javaAudioDeviceModule = this.b.g;
                if (javaAudioDeviceModule != null) {
                    javaAudioDeviceModule.restartAudioRecording();
                    return;
                }
                return;
            default:
                t6e t6e = this.b;
                t6e.b.log("SharedPeerConnectionFac", "releaseInternal");
                PeerConnectionFactory peerConnectionFactory = t6e.d;
                if (peerConnectionFactory != null) {
                    p6a p6a = t6e.i;
                    if (p6a != null) {
                        p6a.a(t6e.j);
                    }
                    peerConnectionFactory.dispose();
                    voc voc = t6e.b;
                    voc.log("SharedPeerConnectionFac", ur9.c(peerConnectionFactory) + " was disposed.");
                    t6e.d = null;
                }
                JavaAudioDeviceModule javaAudioDeviceModule2 = t6e.g;
                if (javaAudioDeviceModule2 != null) {
                    javaAudioDeviceModule2.release();
                    t6e.g = null;
                    return;
                }
                return;
        }
    }
}
