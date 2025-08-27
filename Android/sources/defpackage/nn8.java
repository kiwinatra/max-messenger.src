package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import kotlin.io.ConstantsKt;

/* renamed from: nn8  reason: default package */
public final class nn8 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public nn8(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = uq9.j(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(t0g.g(i, widthAlignment) * widthAlignment, t0g.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d2 == -1.0d || d2 < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if ("Nexus 10".equals(r1) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.nn8 g(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            nn8 r13 = new nn8
            r14 = 0
            r0 = 1
            if (r11 == 0) goto L_0x003d
            int r1 = defpackage.t0g.a
            r2 = 19
            if (r1 < r2) goto L_0x003d
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L_0x003d
            r2 = 22
            if (r1 > r2) goto L_0x003b
            java.lang.String r1 = defpackage.t0g.d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x002a
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x003b
        L_0x002a:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r6 = r0
            goto L_0x003e
        L_0x003d:
            r6 = r14
        L_0x003e:
            r1 = 21
            if (r11 == 0) goto L_0x004c
            int r2 = defpackage.t0g.a
            if (r2 < r1) goto L_0x004c
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L_0x004c:
            if (r15 != 0) goto L_0x005f
            if (r11 == 0) goto L_0x005d
            int r15 = defpackage.t0g.a
            if (r15 < r1) goto L_0x005d
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r7 = r14
            goto L_0x0060
        L_0x005f:
            r7 = r0
        L_0x0060:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn8.g(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):nn8");
    }

    public final da4 b(ca6 ca6, ca6 ca62) {
        int i = !t0g.a(ca6.Z, ca62.Z) ? 8 : 0;
        if (this.h) {
            if (ca6.C0 != ca62.C0) {
                i |= 1024;
            }
            if (!this.e && !(ca6.z0 == ca62.z0 && ca6.A0 == ca62.A0)) {
                i |= ConstantsKt.MINIMUM_BLOCK_SIZE;
            }
            if (!t0g.a(ca6.G0, ca62.G0)) {
                i |= 2048;
            }
            if (t0g.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !ca6.c(ca62)) {
                i |= 2;
            }
            if (i == 0) {
                return new da4(this.a, ca6, ca62, ca6.c(ca62) ? 3 : 2, 0);
            }
        } else {
            if (ca6.H0 != ca62.H0) {
                i |= ConstantsKt.DEFAULT_BLOCK_SIZE;
            }
            if (ca6.I0 != ca62.I0) {
                i |= ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            if (ca6.J0 != ca62.J0) {
                i |= 16384;
            }
            String str = this.b;
            if (i == 0 && "audio/mp4a-latm".equals(str)) {
                Pair d2 = eo8.d(ca6);
                Pair d3 = eo8.d(ca62);
                if (!(d2 == null || d3 == null)) {
                    int intValue = ((Integer) d2.first).intValue();
                    int intValue2 = ((Integer) d3.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new da4(this.a, ca6, ca62, 3, 0);
                    }
                }
            }
            if (!ca6.c(ca62)) {
                i |= 32;
            }
            if ("audio/opus".equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new da4(this.a, ca6, ca62, 1, 0);
            }
        }
        return new da4(this.a, ca6, ca62, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
        r9 = r3.getVideoCapabilities();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(defpackage.ca6 r15) {
        /*
            r14 = this;
            java.lang.String r0 = r15.Z
            java.lang.String r1 = r14.b
            boolean r0 = r1.equals(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = defpackage.eo8.b(r15)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            return r2
        L_0x0017:
            r0 = 1
            android.media.MediaCodecInfo$CodecCapabilities r3 = r14.d
            r4 = 16
            boolean r5 = r14.h
            java.lang.String r6 = r15.z
            if (r6 != 0) goto L_0x0024
            goto L_0x00fe
        L_0x0024:
            android.util.Pair r7 = defpackage.eo8.d(r15)
            if (r7 != 0) goto L_0x002c
            goto L_0x00fe
        L_0x002c:
            java.lang.Object r8 = r7.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r7 = r7.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.String r9 = "video/dolby-vision"
            java.lang.String r10 = r15.Z
            boolean r9 = r9.equals(r10)
            r10 = 2
            r11 = 8
            if (r9 == 0) goto L_0x005e
            java.lang.String r9 = "video/avc"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0054
            r7 = r2
            r8 = r11
            goto L_0x005e
        L_0x0054:
            java.lang.String r9 = "video/hevc"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x005e
            r7 = r2
            r8 = r10
        L_0x005e:
            if (r5 != 0) goto L_0x0066
            r9 = 42
            if (r8 == r9) goto L_0x0066
            goto L_0x00fe
        L_0x0066:
            if (r3 == 0) goto L_0x006c
            android.media.MediaCodecInfo$CodecProfileLevel[] r9 = r3.profileLevels
            if (r9 != 0) goto L_0x006e
        L_0x006c:
            android.media.MediaCodecInfo$CodecProfileLevel[] r9 = new android.media.MediaCodecInfo.CodecProfileLevel[r2]
        L_0x006e:
            int r12 = defpackage.t0g.a
            r13 = 23
            if (r12 > r13) goto L_0x00f0
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x00f0
            int r12 = r9.length
            if (r12 != 0) goto L_0x00f0
            if (r3 == 0) goto L_0x0096
            android.media.MediaCodecInfo$VideoCapabilities r9 = r3.getVideoCapabilities()
            if (r9 == 0) goto L_0x0096
            android.util.Range r9 = r9.getBitrateRange()
            java.lang.Comparable r9 = r9.getUpper()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            goto L_0x0097
        L_0x0096:
            r9 = r2
        L_0x0097:
            r12 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r9 < r12) goto L_0x009f
            r10 = 1024(0x400, float:1.435E-42)
            goto L_0x00e3
        L_0x009f:
            r12 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r9 < r12) goto L_0x00a7
            r10 = 512(0x200, float:7.175E-43)
            goto L_0x00e3
        L_0x00a7:
            r12 = 60000000(0x3938700, float:8.670878E-37)
            if (r9 < r12) goto L_0x00af
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x00e3
        L_0x00af:
            r12 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r9 < r12) goto L_0x00b7
            r10 = 128(0x80, float:1.794E-43)
            goto L_0x00e3
        L_0x00b7:
            r12 = 18000000(0x112a880, float:2.6936858E-38)
            if (r9 < r12) goto L_0x00bf
            r10 = 64
            goto L_0x00e3
        L_0x00bf:
            r12 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r9 < r12) goto L_0x00c7
            r10 = 32
            goto L_0x00e3
        L_0x00c7:
            r12 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r9 < r12) goto L_0x00ce
            r10 = r4
            goto L_0x00e3
        L_0x00ce:
            r12 = 3600000(0x36ee80, float:5.044674E-39)
            if (r9 < r12) goto L_0x00d5
            r10 = r11
            goto L_0x00e3
        L_0x00d5:
            r11 = 1800000(0x1b7740, float:2.522337E-39)
            if (r9 < r11) goto L_0x00dc
            r10 = 4
            goto L_0x00e3
        L_0x00dc:
            r11 = 800000(0xc3500, float:1.121039E-39)
            if (r9 < r11) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r10 = r0
        L_0x00e3:
            android.media.MediaCodecInfo$CodecProfileLevel r9 = new android.media.MediaCodecInfo$CodecProfileLevel
            r9.<init>()
            r9.profile = r0
            r9.level = r10
            android.media.MediaCodecInfo$CodecProfileLevel[] r9 = new android.media.MediaCodecInfo.CodecProfileLevel[]{r9}
        L_0x00f0:
            int r10 = r9.length
            r11 = r2
        L_0x00f2:
            if (r11 >= r10) goto L_0x0242
            r12 = r9[r11]
            int r13 = r12.profile
            if (r13 != r8) goto L_0x023e
            int r12 = r12.level
            if (r12 < r7) goto L_0x023e
        L_0x00fe:
            r6 = 21
            if (r5 == 0) goto L_0x0142
            int r1 = r15.z0
            if (r1 <= 0) goto L_0x0141
            int r3 = r15.A0
            if (r3 > 0) goto L_0x010b
            goto L_0x0141
        L_0x010b:
            int r4 = defpackage.t0g.a
            if (r4 < r6) goto L_0x0117
            float r15 = r15.B0
            double r4 = (double) r15
            boolean r14 = r14.e(r1, r3, r4)
            return r14
        L_0x0117:
            int r15 = r1 * r3
            int r4 = defpackage.eo8.i()
            if (r15 > r4) goto L_0x0120
            r2 = r0
        L_0x0120:
            if (r2 != 0) goto L_0x0140
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r0 = 40
            r15.<init>(r0)
            java.lang.String r0 = "legacyFrameSize, "
            r15.append(r0)
            r15.append(r1)
            java.lang.String r0 = "x"
            r15.append(r0)
            r15.append(r3)
            java.lang.String r15 = r15.toString()
            r14.f(r15)
        L_0x0140:
            return r2
        L_0x0141:
            return r0
        L_0x0142:
            int r5 = defpackage.t0g.a
            if (r5 < r6) goto L_0x023c
            r6 = -1
            int r7 = r15.I0
            if (r7 == r6) goto L_0x017f
            if (r3 != 0) goto L_0x0154
            java.lang.String r15 = "sampleRate.caps"
            r14.f(r15)
            goto L_0x023d
        L_0x0154:
            android.media.MediaCodecInfo$AudioCapabilities r8 = r3.getAudioCapabilities()
            if (r8 != 0) goto L_0x0161
            java.lang.String r15 = "sampleRate.aCaps"
            r14.f(r15)
            goto L_0x023d
        L_0x0161:
            boolean r8 = r8.isSampleRateSupported(r7)
            if (r8 != 0) goto L_0x017f
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r0 = 31
            r15.<init>(r0)
            java.lang.String r0 = "sampleRate.support, "
            r15.append(r0)
            r15.append(r7)
            java.lang.String r15 = r15.toString()
            r14.f(r15)
            goto L_0x023d
        L_0x017f:
            int r15 = r15.H0
            if (r15 == r6) goto L_0x023c
            if (r3 != 0) goto L_0x018c
            java.lang.String r15 = "channelCount.caps"
            r14.f(r15)
            goto L_0x023d
        L_0x018c:
            android.media.MediaCodecInfo$AudioCapabilities r3 = r3.getAudioCapabilities()
            if (r3 != 0) goto L_0x0199
            java.lang.String r15 = "channelCount.aCaps"
            r14.f(r15)
            goto L_0x023d
        L_0x0199:
            int r3 = r3.getMaxInputChannelCount()
            if (r3 > r0) goto L_0x0223
            r6 = 26
            if (r5 < r6) goto L_0x01a7
            if (r3 <= 0) goto L_0x01a7
            goto L_0x0223
        L_0x01a7:
            java.lang.String r5 = "audio/mpeg"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0223
            java.lang.String r5 = "audio/3gpp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0223
            java.lang.String r5 = "audio/amr-wb"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0223
            java.lang.String r5 = "audio/mp4a-latm"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0223
            java.lang.String r5 = "audio/vorbis"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0223
            java.lang.String r5 = "audio/opus"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0223
            java.lang.String r5 = "audio/raw"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0223
            java.lang.String r5 = "audio/flac"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0223
            java.lang.String r5 = "audio/g711-alaw"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0223
            java.lang.String r5 = "audio/g711-mlaw"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0223
            java.lang.String r5 = "audio/gsm"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0200
            goto L_0x0223
        L_0x0200:
            java.lang.String r3 = "audio/ac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x020a
            r4 = 6
            goto L_0x0215
        L_0x020a:
            java.lang.String r3 = "audio/eac3"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0213
            goto L_0x0215
        L_0x0213:
            r4 = 30
        L_0x0215:
            java.lang.String r1 = r14.a
            r3 = 59
            int r1 = defpackage.g63.f(r3, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3 = r4
        L_0x0223:
            if (r3 >= r15) goto L_0x023c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 33
            r0.<init>(r1)
            java.lang.String r1 = "channelCount.support, "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            r14.f(r15)
            goto L_0x023d
        L_0x023c:
            r2 = r0
        L_0x023d:
            return r2
        L_0x023e:
            int r11 = r11 + 1
            goto L_0x00f2
        L_0x0242:
            int r15 = r6.length()
            int r15 = r15 + 22
            java.lang.String r0 = r14.c
            int r15 = defpackage.g63.f(r15, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r15)
            java.lang.String r15 = "codec.profileLevel, "
            r1.append(r15)
            r1.append(r6)
            java.lang.String r15 = ", "
            r1.append(r15)
            r1.append(r0)
            java.lang.String r15 = r1.toString()
            r14.f(r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn8.c(ca6):boolean");
    }

    public final boolean d(ca6 ca6) {
        if (this.h) {
            return this.e;
        }
        Pair d2 = eo8.d(ca6);
        return d2 != null && ((Integer) d2.first).intValue() == 42;
    }

    public final boolean e(int i, int i2, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            f("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            f("sizeAndRate.vCaps");
            return false;
        } else if (a(videoCapabilities, i, i2, d2)) {
            return true;
        } else {
            if (i < i2) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(t0g.b)) && a(videoCapabilities, i2, i, d2)) {
                    StringBuilder sb = new StringBuilder(69);
                    sb.append("sizeAndRate.rotated, ");
                    sb.append(i);
                    sb.append("x");
                    sb.append(i2);
                    sb.append("x");
                    sb.append(d2);
                    String sb2 = sb.toString();
                    new StringBuilder(g63.f(g63.f(g63.f(g63.f(25, sb2), str), this.b), t0g.e));
                    return true;
                }
            }
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("sizeAndRate.support, ");
            sb3.append(i);
            sb3.append("x");
            sb3.append(i2);
            sb3.append("x");
            sb3.append(d2);
            f(sb3.toString());
            return false;
        }
    }

    public final void f(String str) {
        new StringBuilder(g63.f(g63.f(g63.f(g63.f(20, str), this.a), this.b), t0g.e));
    }

    public final String toString() {
        return this.a;
    }
}
