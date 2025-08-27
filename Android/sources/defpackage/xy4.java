package defpackage;

import android.content.pm.ShortcutInfo;
import android.hardware.camera2.CameraCharacteristics;
import android.media.EncoderProfiles;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xy4  reason: default package */
public abstract class xy4 {
    public static ra0 a(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new qa0(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new sa0(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return ra0.e(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static vy4 b(qt1 qt1) {
        Long l = (Long) qt1.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l != null) {
            return (vy4) wy4.a.get(l);
        }
        return null;
    }

    public static void c(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }
}
