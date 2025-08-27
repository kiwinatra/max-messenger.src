package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoderFactory;

/* renamed from: fab  reason: default package */
public final class fab implements VideoEncoderFactory.VideoEncoderSelector, bj8 {
    public final dab a;
    public final voc b;
    public VideoCodecInfo c;
    public VideoCodecInfo o;
    public volatile xug v = new xug(cj8.a, false);

    public fab(dab dab, voc voc) {
        this.a = dab;
        this.b = voc;
    }

    public static VideoCodecInfo b(VideoCodecInfo[] videoCodecInfoArr, String str) {
        if (videoCodecInfoArr != null) {
            for (VideoCodecInfo videoCodecInfo : videoCodecInfoArr) {
                if (Intrinsics.areEqual((Object) videoCodecInfo.name, (Object) str)) {
                    return videoCodecInfo;
                }
            }
        }
        return null;
    }

    public final VideoCodecInfo a() {
        VideoCodecInfo videoCodecInfo;
        if (this.o == null) {
            return null;
        }
        xug xug = this.v;
        if (eab.$EnumSwitchMapping$0[xug.a.ordinal()] == 1) {
            videoCodecInfo = this.o;
        } else if (xug.b) {
            VideoCodecInfo[] supportedCodecs = this.a.a.getSupportedCodecs();
            VideoCodecInfo b2 = b(supportedCodecs, "VP9");
            if (b2 == null) {
                videoCodecInfo = b(supportedCodecs, "VP8");
                if (videoCodecInfo == null) {
                    videoCodecInfo = b(this.a.b.getSupportedCodecs(), "VP8");
                }
            } else {
                videoCodecInfo = b2;
            }
        } else {
            videoCodecInfo = b(this.a.b.getSupportedCodecs(), "VP8");
            if (videoCodecInfo == null) {
                this.b.log("PatchedVideoEncoderFactoryCodecSelector", "Software VP8 encoder not found");
            }
        }
        if (Intrinsics.areEqual((Object) videoCodecInfo, (Object) this.c)) {
            return null;
        }
        voc voc = this.b;
        VideoCodecInfo videoCodecInfo2 = this.c;
        voc.log("PatchedVideoEncoderFactoryCodecSelector", "Selected encoder " + videoCodecInfo + " differs from current one " + videoCodecInfo2 + ". Let us suggest an update");
        return videoCodecInfo;
    }

    public final VideoCodecInfo onAvailableBitrate(int i) {
        return a();
    }

    public final void onCurrentEncoder(VideoCodecInfo videoCodecInfo) {
        if (this.o == null && videoCodecInfo != null) {
            voc voc = this.b;
            voc.log("PatchedVideoEncoderFactoryCodecSelector", "Encoder  " + videoCodecInfo + " was selected as default");
            this.o = videoCodecInfo;
        }
        this.c = videoCodecInfo;
        voc voc2 = this.b;
        xug xug = this.v;
        voc2.log("PatchedVideoEncoderFactoryCodecSelector", "Codec selected: " + videoCodecInfo + " for condition " + xug);
    }

    public final VideoCodecInfo onEncoderBroken() {
        boolean areEqual = Intrinsics.areEqual((Object) this.c, (Object) this.o);
        voc voc = this.b;
        if (areEqual) {
            VideoCodecInfo videoCodecInfo = this.o;
            if (videoCodecInfo != null) {
                voc.log("PatchedVideoEncoderFactoryCodecSelector", "Default encoder " + videoCodecInfo + " was broken. reset");
            }
            this.o = null;
        }
        VideoCodecInfo videoCodecInfo2 = this.c;
        if (videoCodecInfo2 != null) {
            voc.log("PatchedVideoEncoderFactoryCodecSelector", "Current encoder " + videoCodecInfo2 + " was broken. reset");
        }
        this.c = null;
        return a();
    }

    public final VideoCodecInfo onResolutionChange(int i, int i2) {
        return a();
    }

    public final void q(dj8 dj8) {
        voc voc = this.b;
        voc.log("PatchedVideoEncoderFactoryCodecSelector", "Network condition did change. New condition is " + dj8);
        this.v = new xug(dj8.a, dj8.c);
    }
}
