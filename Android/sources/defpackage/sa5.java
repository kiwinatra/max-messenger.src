package defpackage;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpStatus;

/* renamed from: sa5  reason: default package */
public final class sa5 {
    public static final eb5[] c;
    public static final eb5[][] d;
    public static final HashSet e = new HashSet(Arrays.asList(new String[]{"FNumber", "ExposureTime", "GPSTimeStamp"}));
    public final List a;
    public final ByteOrder b;

    static {
        String str = "SubIFDPointer";
        String str2 = str;
        eb5[] eb5Arr = {new eb5("ImageWidth", 256, 3, 4), new eb5("ImageLength", 257, 3, 4), new eb5("Make", 271, 2), new eb5("Model", 272, 2), new eb5("Orientation", 274, 3), new eb5("XResolution", 282, 5), new eb5("YResolution", 283, 5), new eb5("ResolutionUnit", 296, 3), new eb5("Software", HttpStatus.SC_USE_PROXY, 2), new eb5("DateTime", 306, 2), new eb5("YCbCrPositioning", 531, 3), new eb5("SubIFDPointer", 330, 4), new eb5("ExifIFDPointer", 34665, 4), new eb5("GPSInfoIFDPointer", 34853, 4)};
        eb5 eb5 = r1;
        eb5 eb52 = new eb5("ExposureTime", 33434, 5);
        eb5 eb53 = r1;
        eb5 eb54 = new eb5("FNumber", 33437, 5);
        eb5 eb55 = r1;
        eb5 eb56 = new eb5("ExposureProgram", 34850, 3);
        eb5 eb57 = r1;
        eb5 eb58 = new eb5("PhotographicSensitivity", 34855, 3);
        eb5 eb59 = r1;
        eb5 eb510 = new eb5("SensitivityType", 34864, 3);
        eb5 eb511 = r1;
        eb5 eb512 = new eb5("ExifVersion", 36864, 2);
        eb5 eb513 = r1;
        eb5 eb514 = new eb5("DateTimeOriginal", 36867, 2);
        eb5 eb515 = r1;
        eb5 eb516 = new eb5("DateTimeDigitized", 36868, 2);
        eb5 eb517 = r1;
        eb5 eb518 = new eb5("ComponentsConfiguration", 37121, 7);
        eb5 eb519 = r1;
        eb5 eb520 = new eb5("ShutterSpeedValue", 37377, 10);
        eb5 eb521 = r1;
        eb5 eb522 = new eb5("ApertureValue", 37378, 5);
        eb5 eb523 = r1;
        eb5 eb524 = new eb5("BrightnessValue", 37379, 10);
        eb5 eb525 = r1;
        eb5 eb526 = new eb5("ExposureBiasValue", 37380, 10);
        eb5 eb527 = r1;
        eb5 eb528 = new eb5("MaxApertureValue", 37381, 5);
        eb5 eb529 = r1;
        eb5 eb530 = new eb5("MeteringMode", 37383, 3);
        eb5 eb531 = r1;
        eb5 eb532 = new eb5("LightSource", 37384, 3);
        eb5 eb533 = r1;
        eb5 eb534 = new eb5("Flash", 37385, 3);
        eb5 eb535 = r1;
        eb5 eb536 = new eb5("FocalLength", 37386, 5);
        eb5 eb537 = r1;
        eb5 eb538 = new eb5("SubSecTime", 37520, 2);
        eb5 eb539 = r1;
        eb5 eb540 = new eb5("SubSecTimeOriginal", 37521, 2);
        eb5 eb541 = r1;
        eb5 eb542 = new eb5("SubSecTimeDigitized", 37522, 2);
        eb5 eb543 = r1;
        eb5 eb544 = new eb5("FlashpixVersion", 40960, 7);
        eb5 eb545 = r1;
        eb5 eb546 = new eb5("ColorSpace", 40961, 3);
        eb5 eb547 = r1;
        eb5 eb548 = new eb5("PixelXDimension", 40962, 3, 4);
        eb5 eb549 = r1;
        eb5 eb550 = new eb5("PixelYDimension", 40963, 3, 4);
        eb5 eb551 = r1;
        eb5 eb552 = new eb5("InteroperabilityIFDPointer", 40965, 4);
        eb5 eb553 = r1;
        eb5 eb554 = new eb5("FocalPlaneResolutionUnit", 41488, 3);
        eb5 eb555 = r1;
        eb5 eb556 = new eb5("SensingMethod", 41495, 3);
        eb5 eb557 = r1;
        eb5 eb558 = new eb5("FileSource", 41728, 7);
        eb5 eb559 = r1;
        eb5 eb560 = new eb5("SceneType", 41729, 7);
        eb5 eb561 = r1;
        eb5 eb562 = new eb5("CustomRendered", 41985, 3);
        eb5 eb563 = r1;
        eb5 eb564 = new eb5("ExposureMode", 41986, 3);
        eb5 eb565 = r1;
        eb5 eb566 = new eb5("WhiteBalance", 41987, 3);
        eb5 eb567 = r1;
        eb5 eb568 = new eb5("SceneCaptureType", 41990, 3);
        eb5 eb569 = r1;
        eb5 eb570 = new eb5("Contrast", 41992, 3);
        eb5 eb571 = r1;
        eb5 eb572 = new eb5("Saturation", 41993, 3);
        eb5 eb573 = r1;
        eb5 eb574 = new eb5("Sharpness", 41994, 3);
        eb5[] eb5Arr2 = {eb5, eb53, eb55, eb57, eb59, eb511, eb513, eb515, eb517, eb519, eb521, eb523, eb525, eb527, eb529, eb531, eb533, eb535, eb537, eb539, eb541, eb543, eb545, eb547, eb549, eb551, eb553, eb555, eb557, eb559, eb561, eb563, eb565, eb567, eb569, eb571, eb573};
        eb5 eb575 = new eb5("GPSVersionID", 0, 1);
        eb5 eb576 = new eb5("GPSLatitudeRef", 1, 2);
        eb5 eb577 = new eb5("GPSLatitude", 2, 5, 10);
        eb5 eb578 = new eb5("GPSLongitudeRef", 3, 2);
        eb5 eb579 = new eb5("GPSLongitude", 4, 5, 10);
        eb5 eb580 = new eb5("GPSAltitudeRef", 5, 1);
        eb5 eb581 = new eb5("GPSAltitude", 6, 5);
        eb5 eb582 = new eb5("GPSTimeStamp", 7, 5);
        eb5 eb583 = new eb5("GPSSpeedRef", 12, 2);
        eb5 eb584 = new eb5("GPSTrackRef", 14, 2);
        eb5[] eb5Arr3 = eb5Arr;
        eb5 eb585 = new eb5("GPSImgDirectionRef", 16, 2);
        eb5 eb586 = new eb5("GPSDestBearingRef", 23, 2);
        c = new eb5[]{new eb5(str, 330, 4), new eb5("ExifIFDPointer", 34665, 4), new eb5("GPSInfoIFDPointer", 34853, 4), new eb5("InteroperabilityIFDPointer", 40965, 4)};
        d = new eb5[][]{eb5Arr3, eb5Arr2, new eb5[]{eb575, eb576, eb577, eb578, eb579, eb580, eb581, eb582, eb583, eb584, eb585, eb586, new eb5("GPSDestDistanceRef", 25, 2)}, new eb5[]{new eb5("InteroperabilityIndex", 1, 2)}};
    }

    public sa5(ByteOrder byteOrder, ArrayList arrayList) {
        bs0.r("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.b = byteOrder;
        this.a = arrayList;
    }

    public final Map a(int i) {
        bs0.o(i, a81.j(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "), 0, 4);
        return (Map) this.a.get(i);
    }
}
