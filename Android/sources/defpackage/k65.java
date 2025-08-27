package defpackage;

import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import android.util.Size;

/* renamed from: k65  reason: default package */
public abstract class k65 {
    public static final ms a = new ms();

    public static int a(int i, int i2) {
        if (i % 10 != 1) {
            return Math.round(((float) i) / ((float) i2)) * i2;
        }
        return (int) (Math.floor((double) (((float) i) / ((float) i2))) * ((double) i2));
    }

    public static int b(MediaCodecInfo mediaCodecInfo, String str, int i) {
        int i2 = -1;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i) {
                i2 = Math.max(i2, codecProfileLevel.level);
            }
        }
        return i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r8.equals("video/avc") == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.k0d c(int r7, java.lang.String r8) {
        /*
            r8.getClass()
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 6
            r4 = 7
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1662735862: goto L_0x0039;
                case -1662541442: goto L_0x002e;
                case 1331836730: goto L_0x0025;
                case 1599127257: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r0 = r5
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0023
            goto L_0x0018
        L_0x0023:
            r0 = 3
            goto L_0x0043
        L_0x0025:
            java.lang.String r6 = "video/avc"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x0043
            goto L_0x0018
        L_0x002e:
            java.lang.String r0 = "video/hevc"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0037
            goto L_0x0018
        L_0x0037:
            r0 = 1
            goto L_0x0043
        L_0x0039:
            java.lang.String r0 = "video/av01"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0042
            goto L_0x0018
        L_0x0042:
            r0 = 0
        L_0x0043:
            switch(r0) {
                case 0: goto L_0x0071;
                case 1: goto L_0x0063;
                case 2: goto L_0x0056;
                case 3: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x007f
        L_0x0047:
            if (r7 == r4) goto L_0x004b
            if (r7 != r3) goto L_0x007f
        L_0x004b:
            r7 = 8192(0x2000, float:1.14794E-41)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            k0d r7 = defpackage.tb7.u(r2, r7)
            return r7
        L_0x0056:
            if (r7 != r4) goto L_0x007f
            r7 = 16
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            k0d r7 = defpackage.tb7.t(r7)
            return r7
        L_0x0063:
            if (r7 != r4) goto L_0x006a
            k0d r7 = defpackage.tb7.t(r1)
            return r7
        L_0x006a:
            if (r7 != r3) goto L_0x007f
            k0d r7 = defpackage.tb7.t(r2)
            return r7
        L_0x0071:
            if (r7 != r4) goto L_0x0078
            k0d r7 = defpackage.tb7.t(r1)
            return r7
        L_0x0078:
            if (r7 != r3) goto L_0x007f
            k0d r7 = defpackage.tb7.t(r2)
            return r7
        L_0x007f:
            lx5 r7 = defpackage.tb7.b
            k0d r7 = defpackage.k0d.v
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k65.c(int, java.lang.String):k0d");
    }

    public static Range d(MediaCodecInfo mediaCodecInfo, String str) {
        return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getBitrateRange();
    }

    public static tb7 e(MediaCodecInfo mediaCodecInfo, String str) {
        return tb7.p(cvg.d(mediaCodecInfo.getCapabilitiesForType(str).colorFormats));
    }

    public static synchronized tb7 f(String str) {
        tb7 p;
        synchronized (k65.class) {
            j();
            p = tb7.p(a.f(o54.P(str)));
        }
        return p;
    }

    public static k0d g(String str, m53 m53) {
        if (v0g.a < 33 || m53 == null) {
            return tb7.s();
        }
        tb7 f = f(str);
        k0d c = c(m53.c, str);
        qb7 qb7 = new qb7();
        for (int i = 0; i < f.size(); i++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) f.get(i);
            if (!mediaCodecInfo.isAlias() && mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("hdr-editing")) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                    if (c.contains(Integer.valueOf(codecProfileLevel.profile))) {
                        qb7.d(mediaCodecInfo);
                    }
                }
            }
        }
        return qb7.j();
    }

    public static Size h(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int a2 = a(i, widthAlignment);
        int a3 = a(i2, heightAlignment);
        if (i(mediaCodecInfo, str, a2, a3)) {
            return new Size(a2, a3);
        }
        float[] fArr = {0.95f, 0.9f, 0.85f, 0.8f, 0.75f, 0.7f, 0.6666667f, 0.6f, 0.55f, 0.5f, 0.4f, 0.33333334f, 0.25f};
        for (int i3 = 0; i3 < 13; i3++) {
            float f = fArr[i3];
            int a4 = a(Math.round(((float) i) * f), widthAlignment);
            int a5 = a(Math.round(((float) i2) * f), heightAlignment);
            if (i(mediaCodecInfo, str, a4, a5)) {
                return new Size(a4, a5);
            }
        }
        int intValue = videoCapabilities.getSupportedHeightsFor(videoCapabilities.getSupportedWidths().clamp(Integer.valueOf(i)).intValue()).clamp(Integer.valueOf(i2)).intValue();
        if (intValue != i2) {
            i = a((int) Math.round((((double) i) * ((double) intValue)) / ((double) i2)), widthAlignment);
            i2 = a(intValue, heightAlignment);
        }
        if (i(mediaCodecInfo, str, i, i2)) {
            return new Size(i, i2);
        }
        return null;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        if (mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().isSizeSupported(i, i2)) {
            return true;
        }
        if (i == 1920 && i2 == 1080) {
            return CamcorderProfile.hasProfile(6);
        }
        if (i == 3840 && i2 == 2160) {
            return CamcorderProfile.hasProfile(8);
        }
        return false;
    }

    public static synchronized void j() {
        synchronized (k65.class) {
            ms msVar = a;
            msVar.getClass();
            if (msVar.v == 0) {
                for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                    if (mediaCodecInfo.isEncoder()) {
                        for (String P : mediaCodecInfo.getSupportedTypes()) {
                            a.g(o54.P(P), mediaCodecInfo);
                        }
                    }
                }
            }
        }
    }
}
