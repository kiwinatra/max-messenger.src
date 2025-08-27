package defpackage;

import android.media.MediaCodecInfo;

/* renamed from: j65  reason: default package */
public abstract class j65 {
    public static boolean a(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean b(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }
}
