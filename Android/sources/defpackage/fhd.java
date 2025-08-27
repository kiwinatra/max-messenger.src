package defpackage;

import kotlin.math.MathKt;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

/* renamed from: fhd  reason: default package */
public final class fhd extends qj3 {
    public final PeerConnectionFactory w;
    public SurfaceTextureHelper x;
    public final g6d y;

    public fhd(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, voc voc, p1e p1e, i8d i8d) {
        super(str, mediaStream, voc);
        this.w = peerConnectionFactory;
        this.y = new g6d(14, (Object) i8d, (Object) p1e);
    }

    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.addTrack(videoTrack);
        }
    }

    public final void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.removeTrack(videoTrack);
        }
        SurfaceTextureHelper surfaceTextureHelper = this.x;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        this.x = null;
    }

    public final MediaSource g() {
        return this.w.createVideoSource(false);
    }

    public final MediaStreamTrack h(String str, MediaSource mediaSource) {
        return this.w.createVideoTrack(str, (VideoSource) mediaSource);
    }

    public final String toString() {
        return "OkSdkScreenShareRecord";
    }

    public final void u(int i, int i2, int i3) {
        x4g x4g;
        int i4;
        if (i <= 0 || i2 <= 0 || i < i2 || i3 <= 0) {
            x4g = null;
        } else {
            int i5 = 320;
            if (i < 320) {
                i4 = MathKt.roundToInt(((float) 320) * (((float) i2) / ((float) i))) / 16;
            } else {
                i5 = (i / 16) * 16;
                i4 = i2 / 16;
            }
            int i6 = i5;
            int i7 = i4 * 16;
            x4g = new x4g(i6, i7, i7, i6, i3);
        }
        if (x4g != null) {
            VideoSource videoSource = (VideoSource) ((MediaSource) this.o);
            if (videoSource != null) {
                videoSource.adaptOutputFormat(x4g.a, x4g.b, x4g.c, x4g.d, i3);
            }
            String j = j();
            StringBuilder sb = new StringBuilder("Set screenshare dimensions to ");
            sb.append(x4g.a);
            sb.append(" x ");
            g63.o(sb, x4g.b, " by requested ", i, " x ");
            sb.append(i2);
            sb.append(" fps ");
            sb.append(i3);
            ((voc) this.c).log(j, sb.toString());
        }
    }
}
