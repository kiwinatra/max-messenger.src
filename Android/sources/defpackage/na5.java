package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: na5  reason: default package */
public final class na5 {
    public static final qv0 b = new qv0(4);
    public static final qv0 c = new qv0(5);
    public static final qv0 d = new qv0(6);
    public static final List e = Arrays.asList(new String[]{"ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType"});
    public static final List f = Arrays.asList(new String[]{"ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation"});
    public final ab5 a;

    public na5(ab5 ab5) {
        this.a = ab5;
    }

    public final int a() {
        switch (this.a.e(0, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01b5 A[SYNTHETIC, Splitter:B:103:0x01b5] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089 A[SYNTHETIC, Splitter:B:23:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3 A[SYNTHETIC, Splitter:B:38:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2 A[SYNTHETIC, Splitter:B:49:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fa A[Catch:{ ParseException -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r31 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r4 = "ImageWidth"
            r5 = r31
            ab5 r6 = r5.a
            int r4 = r6.e(r2, r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "ImageLength"
            int r4 = r6.e(r2, r4)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            int r4 = r31.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Orientation"
            int r5 = r6.e(r2, r4)
            r10 = 4
            if (r5 == r10) goto L_0x0036
            r10 = 5
            if (r5 == r10) goto L_0x0036
            r10 = 7
            if (r5 == r10) goto L_0x0036
            r5 = r2
            goto L_0x0037
        L_0x0036:
            r5 = r1
        L_0x0037:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
            int r4 = r6.e(r2, r4)
            if (r4 == r0) goto L_0x0043
            r4 = r2
            goto L_0x0044
        L_0x0043:
            r4 = r1
        L_0x0044:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
            java.lang.String r4 = "GPSProcessingMethod"
            java.lang.String r4 = r6.d(r4)
            java.lang.String r5 = "GPSLatitude"
            java.lang.String r5 = r6.d(r5)
            java.lang.String r12 = "GPSLatitudeRef"
            java.lang.String r12 = r6.d(r12)
            java.lang.String r13 = "GPSLongitude"
            java.lang.String r13 = r6.d(r13)
            java.lang.String r14 = "GPSLongitudeRef"
            java.lang.String r14 = r6.d(r14)
            if (r5 == 0) goto L_0x007d
            if (r12 == 0) goto L_0x007d
            if (r13 == 0) goto L_0x007d
            if (r14 == 0) goto L_0x007d
            double r16 = defpackage.ab5.b(r5, r12)     // Catch:{ IllegalArgumentException -> 0x007d }
            double r12 = defpackage.ab5.b(r13, r14)     // Catch:{ IllegalArgumentException -> 0x007d }
            double[] r5 = new double[r0]     // Catch:{ IllegalArgumentException -> 0x007d }
            r5[r2] = r16     // Catch:{ IllegalArgumentException -> 0x007d }
            r5[r1] = r12     // Catch:{ IllegalArgumentException -> 0x007d }
            goto L_0x007e
        L_0x007d:
            r5 = 0
        L_0x007e:
            java.lang.String r12 = "GPSAltitude"
            wa5 r12 = r6.f(r12)
            r13 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r12 != 0) goto L_0x0089
            goto L_0x008f
        L_0x0089:
            java.nio.ByteOrder r0 = r6.g     // Catch:{ NumberFormatException -> 0x008f }
            double r13 = r12.g(r0)     // Catch:{ NumberFormatException -> 0x008f }
        L_0x008f:
            java.lang.String r0 = "GPSAltitudeRef"
            r12 = -1
            int r0 = r6.e(r12, r0)
            r17 = 0
            int r19 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r19 < 0) goto L_0x00a6
            if (r0 < 0) goto L_0x00a6
            if (r0 != r1) goto L_0x00a2
            r0 = r12
            goto L_0x00a3
        L_0x00a2:
            r0 = r1
        L_0x00a3:
            double r1 = (double) r0
            double r13 = r13 * r1
            goto L_0x00a8
        L_0x00a6:
            r13 = r17
        L_0x00a8:
            java.lang.String r0 = "GPSSpeed"
            wa5 r0 = r6.f(r0)
            if (r0 != 0) goto L_0x00b3
        L_0x00b0:
            r0 = r17
            goto L_0x00b9
        L_0x00b3:
            java.nio.ByteOrder r1 = r6.g     // Catch:{ NumberFormatException -> 0x00b0 }
            double r0 = r0.g(r1)     // Catch:{ NumberFormatException -> 0x00b0 }
        L_0x00b9:
            java.lang.String r2 = "GPSSpeedRef"
            java.lang.String r2 = r6.d(r2)
            java.lang.String r12 = "K"
            if (r2 != 0) goto L_0x00c4
            r2 = r12
        L_0x00c4:
            java.lang.String r15 = "GPSDateStamp"
            java.lang.String r15 = r6.d(r15)
            r22 = r3
            java.lang.String r3 = "GPSTimeStamp"
            java.lang.String r3 = r6.d(r3)
            qv0 r23 = d
            r24 = -1
            if (r15 != 0) goto L_0x00e0
            if (r3 != 0) goto L_0x00e0
        L_0x00da:
            r3 = r10
            r26 = r11
            r10 = r24
            goto L_0x012b
        L_0x00e0:
            if (r3 != 0) goto L_0x00fa
            qv0 r3 = b     // Catch:{ ParseException -> 0x00da }
            java.lang.Object r3 = r3.get()     // Catch:{ ParseException -> 0x00da }
            java.text.SimpleDateFormat r3 = (java.text.SimpleDateFormat) r3     // Catch:{ ParseException -> 0x00da }
            java.util.Date r3 = r3.parse(r15)     // Catch:{ ParseException -> 0x00da }
            long r26 = r3.getTime()     // Catch:{ ParseException -> 0x00da }
        L_0x00f2:
            r3 = r10
            r29 = r26
            r26 = r11
            r10 = r29
            goto L_0x012b
        L_0x00fa:
            if (r15 != 0) goto L_0x010d
            qv0 r15 = c     // Catch:{ ParseException -> 0x00da }
            java.lang.Object r15 = r15.get()     // Catch:{ ParseException -> 0x00da }
            java.text.SimpleDateFormat r15 = (java.text.SimpleDateFormat) r15     // Catch:{ ParseException -> 0x00da }
            java.util.Date r3 = r15.parse(r3)     // Catch:{ ParseException -> 0x00da }
            long r26 = r3.getTime()     // Catch:{ ParseException -> 0x00da }
            goto L_0x00f2
        L_0x010d:
            r26 = r11
            java.lang.String r11 = " "
            java.lang.String r3 = defpackage.g63.i(r15, r11, r3)
            if (r3 != 0) goto L_0x011a
        L_0x0117:
            r27 = r24
            goto L_0x0128
        L_0x011a:
            java.lang.Object r11 = r23.get()     // Catch:{ ParseException -> 0x0117 }
            java.text.SimpleDateFormat r11 = (java.text.SimpleDateFormat) r11     // Catch:{ ParseException -> 0x0117 }
            java.util.Date r3 = r11.parse(r3)     // Catch:{ ParseException -> 0x0117 }
            long r27 = r3.getTime()     // Catch:{ ParseException -> 0x0117 }
        L_0x0128:
            r3 = r10
            r10 = r27
        L_0x012b:
            if (r5 != 0) goto L_0x0134
            r20 = r8
            r21 = r9
            r12 = 0
            goto L_0x01aa
        L_0x0134:
            if (r4 != 0) goto L_0x0138
            java.lang.String r4 = "na5"
        L_0x0138:
            android.location.Location r15 = new android.location.Location
            r15.<init>(r4)
            r20 = r8
            r21 = r9
            r4 = 0
            r8 = r5[r4]
            r15.setLatitude(r8)
            r8 = 1
            r4 = r5[r8]
            r15.setLongitude(r4)
            int r4 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0154
            r15.setAltitude(r13)
        L_0x0154:
            int r4 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x01a2
            int r4 = r2.hashCode()
            r5 = 75
            if (r4 == r5) goto L_0x017d
            r5 = 77
            if (r4 == r5) goto L_0x0173
            r5 = 78
            if (r4 == r5) goto L_0x0169
            goto L_0x0185
        L_0x0169:
            java.lang.String r4 = "N"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0185
            r9 = 1
            goto L_0x0186
        L_0x0173:
            java.lang.String r4 = "M"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0185
            r9 = 0
            goto L_0x0186
        L_0x017d:
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x0185
            r9 = 2
            goto L_0x0186
        L_0x0185:
            r9 = -1
        L_0x0186:
            r4 = 4612219559875242487(0x4001e540cc78e9f7, double:2.23694)
            if (r9 == 0) goto L_0x0196
            r2 = 1
            if (r9 == r2) goto L_0x0198
            r8 = 4603772031953394081(0x3fe3e2456f75d9a1, double:0.621371)
        L_0x0195:
            double r0 = r0 * r8
        L_0x0196:
            double r0 = r0 / r4
            goto L_0x019e
        L_0x0198:
            r8 = 4607861471551832331(0x3ff269984a0e410b, double:1.15078)
            goto L_0x0195
        L_0x019e:
            float r0 = (float) r0
            r15.setSpeed(r0)
        L_0x01a2:
            int r0 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            if (r0 == 0) goto L_0x01a9
            r15.setTime(r10)
        L_0x01a9:
            r12 = r15
        L_0x01aa:
            java.lang.String r0 = "DateTimeOriginal"
            java.lang.String r0 = r6.d(r0)
            if (r0 != 0) goto L_0x01b5
        L_0x01b2:
            r0 = r24
            goto L_0x01c3
        L_0x01b5:
            java.lang.Object r1 = r23.get()     // Catch:{ ParseException -> 0x01b2 }
            java.text.SimpleDateFormat r1 = (java.text.SimpleDateFormat) r1     // Catch:{ ParseException -> 0x01b2 }
            java.util.Date r0 = r1.parse(r0)     // Catch:{ ParseException -> 0x01b2 }
            long r0 = r0.getTime()     // Catch:{ ParseException -> 0x01b2 }
        L_0x01c3:
            int r2 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r2 != 0) goto L_0x01c8
            goto L_0x01e1
        L_0x01c8:
            java.lang.String r2 = "SubSecTimeOriginal"
            java.lang.String r2 = r6.d(r2)
            if (r2 == 0) goto L_0x01df
            long r4 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x01df }
        L_0x01d4:
            r8 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x01de
            r8 = 10
            long r4 = r4 / r8
            goto L_0x01d4
        L_0x01de:
            long r0 = r0 + r4
        L_0x01df:
            r24 = r0
        L_0x01e1:
            java.lang.Long r13 = java.lang.Long.valueOf(r24)
            java.lang.String r0 = "ImageDescription"
            java.lang.String r14 = r6.d(r0)
            r8 = r20
            r9 = r21
            r10 = r3
            r11 = r26
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r8, r9, r10, r11, r12, r13, r14}
            java.lang.String r1 = "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}"
            r2 = r22
            java.lang.String r0 = java.lang.String.format(r2, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na5.toString():java.lang.String");
    }
}
