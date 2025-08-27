package defpackage;

import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;

/* renamed from: n60  reason: default package */
public final class n60 extends qj3 {
    public final PeerConnectionFactory w;

    public n60(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, voc voc) {
        super(str, mediaStream, voc);
        this.w = peerConnectionFactory;
    }

    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        AudioTrack audioTrack = (AudioTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.addTrack(audioTrack);
        }
    }

    public final void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        AudioTrack audioTrack = (AudioTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.removeTrack(audioTrack);
        }
    }

    public final MediaSource g() {
        return this.w.createAudioSource(new MediaConstraints());
    }

    public final MediaStreamTrack h(String str, MediaSource mediaSource) {
        return this.w.createAudioTrack(str, (AudioSource) mediaSource);
    }

    public final String toString() {
        return "OkSdkAudioRecord";
    }
}
