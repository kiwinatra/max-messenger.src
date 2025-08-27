package defpackage;

import android.content.res.AssetManager;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;
import org.apache.http.HttpStatus;

/* renamed from: ab5  reason: default package */
public final class ab5 {
    public static final byte[] A = {109, 105, 102, 49};
    public static final byte[] B = {104, 101, 105, 99};
    public static final byte[] C = {79, 76, 89, 77, 80, 0};
    public static final byte[] D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] E = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] F = {101, 88, 73, 102};
    public static final byte[] G = {73, 72, 68, 82};
    public static final byte[] H = {73, 69, 78, 68};
    public static final byte[] I = {82, 73, 70, 70};
    public static final byte[] J = {87, 69, 66, 80};
    public static final byte[] K = {69, 88, 73, 70};
    public static final byte[] L = {-99, 1, 42};
    public static final byte[] M = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] N = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] O = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] P = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] R = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] T = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final xa5 U = new xa5("StripOffsets", 273, 3);
    public static final xa5[][] V;
    public static final xa5[] W;
    public static final HashMap[] X = new HashMap[10];
    public static final HashMap[] Y = new HashMap[10];
    public static final HashSet Z = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final HashMap a0 = new HashMap();
    public static final Charset b0;
    public static final byte[] c0;
    public static final byte[] d0;
    public static final Pattern e0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final boolean t = Log.isLoggable("ExifInterface", 3);
    public static final List u = Arrays.asList(new Integer[]{1, 6, 3, 8});
    public static final List v = Arrays.asList(new Integer[]{2, 7, 4, 5});
    public static final int[] w = {8, 8, 8};
    public static final int[] x = {8};
    public static final byte[] y = {-1, -40, -1};
    public static final byte[] z = {102, 116, 121, 112};
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final HashMap[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public byte[] m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;

    static {
        xa5 xa5 = r15;
        xa5 xa52 = new xa5("NewSubfileType", 254, 4);
        xa5 xa53 = r15;
        xa5 xa54 = new xa5("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4);
        xa5 xa55 = r15;
        xa5 xa56 = new xa5("ImageWidth", 256, 3, 4);
        xa5 xa57 = r2;
        xa5 xa58 = new xa5("ImageLength", 257, 3, 4);
        xa5 xa59 = r2;
        xa5 xa510 = new xa5("BitsPerSample", 258, 3);
        xa5 xa511 = r2;
        xa5 xa512 = new xa5("Compression", 259, 3);
        xa5 xa513 = r2;
        xa5 xa514 = new xa5("PhotometricInterpretation", 262, 3);
        xa5 xa515 = r2;
        xa5 xa516 = new xa5("ImageDescription", 270, 2);
        xa5 xa517 = r2;
        xa5 xa518 = new xa5("Make", 271, 2);
        xa5 xa519 = r2;
        xa5 xa520 = new xa5("Model", 272, 2);
        xa5 xa521 = r2;
        xa5 xa522 = new xa5("StripOffsets", 273, 3, 4);
        xa5 xa523 = r1;
        xa5 xa524 = new xa5("Orientation", 274, 3);
        xa5 xa525 = r1;
        xa5 xa526 = new xa5("SamplesPerPixel", 277, 3);
        xa5 xa527 = r1;
        xa5 xa528 = new xa5("RowsPerStrip", 278, 3, 4);
        xa5 xa529 = r1;
        xa5 xa530 = new xa5("StripByteCounts", 279, 3, 4);
        xa5 xa531 = r1;
        xa5 xa532 = new xa5("XResolution", 282, 5);
        xa5 xa533 = r1;
        xa5 xa534 = new xa5("YResolution", 283, 5);
        xa5 xa535 = r1;
        xa5 xa536 = new xa5("PlanarConfiguration", 284, 3);
        xa5 xa537 = r1;
        xa5 xa538 = new xa5("ResolutionUnit", 296, 3);
        xa5 xa539 = r1;
        xa5 xa540 = new xa5("TransferFunction", HttpStatus.SC_MOVED_PERMANENTLY, 3);
        xa5 xa541 = r1;
        xa5 xa542 = new xa5("Software", HttpStatus.SC_USE_PROXY, 2);
        xa5 xa543 = r1;
        xa5 xa544 = new xa5("DateTime", 306, 2);
        xa5 xa545 = r1;
        xa5 xa546 = new xa5("Artist", 315, 2);
        xa5 xa547 = r1;
        xa5 xa548 = new xa5("WhitePoint", 318, 5);
        xa5 xa549 = r1;
        xa5 xa550 = new xa5("PrimaryChromaticities", 319, 5);
        xa5 xa551 = r1;
        xa5 xa552 = new xa5("SubIFDPointer", 330, 4);
        xa5 xa553 = r1;
        xa5 xa554 = new xa5("JPEGInterchangeFormat", 513, 4);
        xa5 xa555 = r1;
        xa5 xa556 = new xa5("JPEGInterchangeFormatLength", 514, 4);
        xa5 xa557 = r1;
        xa5 xa558 = new xa5("YCbCrCoefficients", 529, 5);
        xa5 xa559 = r1;
        xa5 xa560 = new xa5("YCbCrSubSampling", 530, 3);
        xa5 xa561 = r1;
        xa5 xa562 = new xa5("YCbCrPositioning", 531, 3);
        xa5 xa563 = r1;
        xa5 xa564 = new xa5("ReferenceBlackWhite", 532, 5);
        xa5 xa565 = r1;
        xa5 xa566 = new xa5("Copyright", 33432, 2);
        xa5 xa567 = r1;
        xa5 xa568 = new xa5("ExifIFDPointer", 34665, 4);
        xa5 xa569 = r1;
        xa5 xa570 = new xa5("GPSInfoIFDPointer", 34853, 4);
        xa5 xa571 = r1;
        xa5 xa572 = new xa5("SensorTopBorder", 4, 4);
        xa5 xa573 = r1;
        xa5 xa574 = new xa5("SensorLeftBorder", 5, 4);
        xa5 xa575 = r1;
        xa5 xa576 = new xa5("SensorBottomBorder", 6, 4);
        xa5 xa577 = r1;
        xa5 xa578 = new xa5("SensorRightBorder", 7, 4);
        xa5 xa579 = r1;
        xa5 xa580 = new xa5("ISO", 23, 3);
        xa5 xa581 = r1;
        xa5 xa582 = new xa5("JpgFromRaw", 46, 7);
        xa5 xa583 = r1;
        xa5 xa584 = new xa5("Xmp", 700, 1);
        xa5[] xa5Arr = {xa5, xa53, xa55, xa57, xa59, xa511, xa513, xa515, xa517, xa519, xa521, xa523, xa525, xa527, xa529, xa531, xa533, xa535, xa537, xa539, xa541, xa543, xa545, xa547, xa549, xa551, xa553, xa555, xa557, xa559, xa561, xa563, xa565, xa567, xa569, xa571, xa573, xa575, xa577, xa579, xa581, xa583};
        xa5 xa585 = r1;
        xa5 xa586 = new xa5("ExposureTime", 33434, 5);
        xa5 xa587 = r1;
        xa5 xa588 = new xa5("FNumber", 33437, 5);
        xa5 xa589 = r1;
        xa5 xa590 = new xa5("ExposureProgram", 34850, 3);
        xa5 xa591 = r1;
        xa5 xa592 = new xa5("SpectralSensitivity", 34852, 2);
        xa5 xa593 = r1;
        xa5 xa594 = new xa5("PhotographicSensitivity", 34855, 3);
        xa5 xa595 = r1;
        xa5 xa596 = new xa5("OECF", 34856, 7);
        xa5 xa597 = r1;
        xa5 xa598 = new xa5("SensitivityType", 34864, 3);
        xa5 xa599 = r1;
        xa5 xa5100 = new xa5("StandardOutputSensitivity", 34865, 4);
        xa5 xa5101 = r1;
        xa5 xa5102 = new xa5("RecommendedExposureIndex", 34866, 4);
        xa5 xa5103 = r1;
        xa5 xa5104 = new xa5("ISOSpeed", 34867, 4);
        xa5 xa5105 = r1;
        xa5 xa5106 = new xa5("ISOSpeedLatitudeyyy", 34868, 4);
        xa5 xa5107 = r1;
        xa5 xa5108 = new xa5("ISOSpeedLatitudezzz", 34869, 4);
        xa5 xa5109 = r1;
        xa5 xa5110 = new xa5("ExifVersion", 36864, 2);
        xa5 xa5111 = r1;
        xa5 xa5112 = new xa5("DateTimeOriginal", 36867, 2);
        xa5 xa5113 = r1;
        xa5 xa5114 = new xa5("DateTimeDigitized", 36868, 2);
        xa5 xa5115 = r1;
        xa5 xa5116 = new xa5("OffsetTime", 36880, 2);
        xa5 xa5117 = r1;
        xa5 xa5118 = new xa5("OffsetTimeOriginal", 36881, 2);
        xa5 xa5119 = r1;
        xa5 xa5120 = new xa5("OffsetTimeDigitized", 36882, 2);
        xa5 xa5121 = r1;
        xa5 xa5122 = new xa5("ComponentsConfiguration", 37121, 7);
        xa5 xa5123 = r1;
        xa5 xa5124 = new xa5("CompressedBitsPerPixel", 37122, 5);
        xa5 xa5125 = r1;
        xa5 xa5126 = new xa5("ShutterSpeedValue", 37377, 10);
        xa5 xa5127 = r1;
        xa5 xa5128 = new xa5("ApertureValue", 37378, 5);
        xa5 xa5129 = r1;
        xa5 xa5130 = new xa5("BrightnessValue", 37379, 10);
        xa5 xa5131 = r1;
        xa5 xa5132 = new xa5("ExposureBiasValue", 37380, 10);
        xa5 xa5133 = r1;
        xa5 xa5134 = new xa5("MaxApertureValue", 37381, 5);
        xa5 xa5135 = r1;
        xa5 xa5136 = new xa5("SubjectDistance", 37382, 5);
        xa5 xa5137 = r1;
        xa5 xa5138 = new xa5("MeteringMode", 37383, 3);
        xa5 xa5139 = r1;
        xa5 xa5140 = new xa5("LightSource", 37384, 3);
        xa5 xa5141 = r1;
        xa5 xa5142 = new xa5("Flash", 37385, 3);
        xa5 xa5143 = r1;
        xa5 xa5144 = new xa5("FocalLength", 37386, 5);
        xa5 xa5145 = r1;
        xa5 xa5146 = new xa5("SubjectArea", 37396, 3);
        xa5 xa5147 = r1;
        xa5 xa5148 = new xa5("MakerNote", 37500, 7);
        xa5 xa5149 = r1;
        xa5 xa5150 = new xa5("UserComment", 37510, 7);
        xa5 xa5151 = r1;
        xa5 xa5152 = new xa5("SubSecTime", 37520, 2);
        xa5 xa5153 = r1;
        xa5 xa5154 = new xa5("SubSecTimeOriginal", 37521, 2);
        xa5 xa5155 = r1;
        xa5 xa5156 = new xa5("SubSecTimeDigitized", 37522, 2);
        xa5 xa5157 = r1;
        xa5 xa5158 = new xa5("FlashpixVersion", 40960, 7);
        xa5 xa5159 = r1;
        xa5 xa5160 = new xa5("ColorSpace", 40961, 3);
        xa5 xa5161 = r1;
        xa5 xa5162 = new xa5("PixelXDimension", 40962, 3, 4);
        xa5 xa5163 = r1;
        xa5 xa5164 = new xa5("PixelYDimension", 40963, 3, 4);
        xa5 xa5165 = r1;
        xa5 xa5166 = new xa5("RelatedSoundFile", 40964, 2);
        xa5 xa5167 = r1;
        xa5 xa5168 = new xa5("InteroperabilityIFDPointer", 40965, 4);
        xa5 xa5169 = r1;
        xa5 xa5170 = new xa5("FlashEnergy", 41483, 5);
        xa5 xa5171 = r1;
        xa5 xa5172 = new xa5("SpatialFrequencyResponse", 41484, 7);
        xa5 xa5173 = r1;
        xa5 xa5174 = new xa5("FocalPlaneXResolution", 41486, 5);
        xa5 xa5175 = r1;
        xa5 xa5176 = new xa5("FocalPlaneYResolution", 41487, 5);
        xa5 xa5177 = r1;
        xa5 xa5178 = new xa5("FocalPlaneResolutionUnit", 41488, 3);
        xa5 xa5179 = r1;
        xa5 xa5180 = new xa5("SubjectLocation", 41492, 3);
        xa5 xa5181 = r1;
        xa5 xa5182 = new xa5("ExposureIndex", 41493, 5);
        xa5 xa5183 = r1;
        xa5 xa5184 = new xa5("SensingMethod", 41495, 3);
        xa5 xa5185 = r1;
        xa5 xa5186 = new xa5("FileSource", 41728, 7);
        xa5 xa5187 = r1;
        xa5 xa5188 = new xa5("SceneType", 41729, 7);
        xa5 xa5189 = r1;
        xa5 xa5190 = new xa5("CFAPattern", 41730, 7);
        xa5 xa5191 = r1;
        xa5 xa5192 = new xa5("CustomRendered", 41985, 3);
        xa5 xa5193 = r1;
        xa5 xa5194 = new xa5("ExposureMode", 41986, 3);
        xa5 xa5195 = r1;
        xa5 xa5196 = new xa5("WhiteBalance", 41987, 3);
        xa5 xa5197 = r1;
        xa5 xa5198 = new xa5("DigitalZoomRatio", 41988, 5);
        xa5 xa5199 = r1;
        xa5 xa5200 = new xa5("FocalLengthIn35mmFilm", 41989, 3);
        xa5 xa5201 = r1;
        xa5 xa5202 = new xa5("SceneCaptureType", 41990, 3);
        xa5 xa5203 = r1;
        xa5 xa5204 = new xa5("GainControl", 41991, 3);
        xa5 xa5205 = r1;
        xa5 xa5206 = new xa5("Contrast", 41992, 3);
        xa5 xa5207 = r1;
        xa5 xa5208 = new xa5("Saturation", 41993, 3);
        xa5 xa5209 = r1;
        xa5 xa5210 = new xa5("Sharpness", 41994, 3);
        xa5 xa5211 = r1;
        xa5 xa5212 = new xa5("DeviceSettingDescription", 41995, 7);
        xa5 xa5213 = r1;
        xa5 xa5214 = new xa5("SubjectDistanceRange", 41996, 3);
        xa5 xa5215 = r1;
        xa5 xa5216 = new xa5("ImageUniqueID", 42016, 2);
        xa5 xa5217 = r1;
        xa5 xa5218 = new xa5("CameraOwnerName", 42032, 2);
        xa5 xa5219 = r1;
        xa5 xa5220 = new xa5("BodySerialNumber", 42033, 2);
        xa5 xa5221 = r1;
        xa5 xa5222 = new xa5("LensSpecification", 42034, 5);
        xa5 xa5223 = r1;
        xa5 xa5224 = new xa5("LensMake", 42035, 2);
        xa5 xa5225 = r1;
        xa5 xa5226 = new xa5("LensModel", 42036, 2);
        xa5 xa5227 = r1;
        xa5 xa5228 = new xa5("Gamma", 42240, 5);
        xa5 xa5229 = r1;
        xa5 xa5230 = new xa5("DNGVersion", 50706, 1);
        xa5 xa5231 = r1;
        xa5 xa5232 = new xa5("DefaultCropSize", 50720, 3, 4);
        xa5 xa5233 = r1;
        xa5 xa5234 = new xa5("GPSVersionID", 0, 1);
        xa5 xa5235 = r1;
        xa5 xa5236 = new xa5("GPSLatitudeRef", 1, 2);
        xa5 xa5237 = r1;
        xa5 xa5238 = new xa5("GPSLatitude", 2, 5, 10);
        xa5 xa5239 = r1;
        xa5 xa5240 = new xa5("GPSLongitudeRef", 3, 2);
        xa5 xa5241 = r1;
        xa5 xa5242 = new xa5("GPSLongitude", 4, 5, 10);
        xa5 xa5243 = r1;
        xa5 xa5244 = new xa5("GPSAltitudeRef", 5, 1);
        xa5 xa5245 = r1;
        xa5 xa5246 = new xa5("GPSAltitude", 6, 5);
        xa5 xa5247 = r1;
        xa5 xa5248 = new xa5("GPSTimeStamp", 7, 5);
        xa5 xa5249 = r1;
        xa5 xa5250 = new xa5("GPSSatellites", 8, 2);
        xa5 xa5251 = r1;
        xa5 xa5252 = new xa5("GPSStatus", 9, 2);
        xa5 xa5253 = r1;
        xa5 xa5254 = new xa5("GPSMeasureMode", 10, 2);
        xa5 xa5255 = r1;
        xa5 xa5256 = new xa5("GPSDOP", 11, 5);
        xa5 xa5257 = r1;
        xa5 xa5258 = new xa5("GPSSpeedRef", 12, 2);
        xa5 xa5259 = r1;
        xa5 xa5260 = new xa5("GPSSpeed", 13, 5);
        xa5 xa5261 = r1;
        xa5 xa5262 = new xa5("GPSTrackRef", 14, 2);
        xa5 xa5263 = r1;
        xa5 xa5264 = new xa5("GPSTrack", 15, 5);
        xa5 xa5265 = r1;
        xa5 xa5266 = new xa5("GPSImgDirectionRef", 16, 2);
        xa5 xa5267 = r1;
        xa5 xa5268 = new xa5("GPSImgDirection", 17, 5);
        xa5 xa5269 = r1;
        xa5 xa5270 = new xa5("GPSMapDatum", 18, 2);
        xa5 xa5271 = r1;
        xa5 xa5272 = new xa5("GPSDestLatitudeRef", 19, 2);
        xa5 xa5273 = r1;
        xa5 xa5274 = new xa5("GPSDestLatitude", 20, 5);
        xa5 xa5275 = r1;
        xa5 xa5276 = new xa5("GPSDestLongitudeRef", 21, 2);
        xa5 xa5277 = r1;
        xa5 xa5278 = new xa5("GPSDestLongitude", 22, 5);
        xa5 xa5279 = r1;
        xa5 xa5280 = new xa5("GPSDestBearingRef", 23, 2);
        xa5 xa5281 = r1;
        xa5 xa5282 = new xa5("GPSDestBearing", 24, 5);
        xa5 xa5283 = r1;
        xa5 xa5284 = new xa5("GPSDestDistanceRef", 25, 2);
        xa5 xa5285 = r1;
        xa5 xa5286 = new xa5("GPSDestDistance", 26, 5);
        xa5 xa5287 = r1;
        xa5 xa5288 = new xa5("GPSProcessingMethod", 27, 7);
        xa5 xa5289 = r1;
        xa5 xa5290 = new xa5("GPSAreaInformation", 28, 7);
        xa5 xa5291 = r1;
        xa5 xa5292 = new xa5("GPSDateStamp", 29, 2);
        xa5 xa5293 = r1;
        xa5 xa5294 = new xa5("GPSDifferential", 30, 3);
        xa5 xa5295 = r1;
        xa5 xa5296 = new xa5("GPSHPositioningError", 31, 5);
        xa5[] xa5Arr2 = {xa5233, xa5235, xa5237, xa5239, xa5241, xa5243, xa5245, xa5247, xa5249, xa5251, xa5253, xa5255, xa5257, xa5259, xa5261, xa5263, xa5265, xa5267, xa5269, xa5271, xa5273, xa5275, xa5277, xa5279, xa5281, xa5283, xa5285, xa5287, xa5289, xa5291, xa5293, xa5295};
        xa5[] xa5Arr3 = {new xa5("InteroperabilityIndex", 1, 2)};
        xa5 xa5297 = r1;
        xa5 xa5298 = new xa5("NewSubfileType", 254, 4);
        xa5 xa5299 = r1;
        xa5 xa5300 = new xa5("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4);
        xa5 xa5301 = r1;
        xa5 xa5302 = new xa5("ThumbnailImageWidth", 256, 3, 4);
        xa5 xa5303 = r1;
        xa5 xa5304 = new xa5("ThumbnailImageLength", 257, 3, 4);
        xa5 xa5305 = r1;
        xa5 xa5306 = new xa5("BitsPerSample", 258, 3);
        xa5 xa5307 = r1;
        xa5 xa5308 = new xa5("Compression", 259, 3);
        xa5 xa5309 = r1;
        xa5 xa5310 = new xa5("PhotometricInterpretation", 262, 3);
        xa5 xa5311 = r1;
        xa5 xa5312 = new xa5("ImageDescription", 270, 2);
        xa5 xa5313 = r1;
        xa5 xa5314 = new xa5("Make", 271, 2);
        xa5 xa5315 = r0;
        xa5 xa5316 = new xa5("Model", 272, 2);
        xa5 xa5317 = r0;
        xa5 xa5318 = new xa5("StripOffsets", 273, 3, 4);
        xa5 xa5319 = r0;
        xa5 xa5320 = new xa5("ThumbnailOrientation", 274, 3);
        xa5 xa5321 = r0;
        xa5 xa5322 = new xa5("SamplesPerPixel", 277, 3);
        xa5 xa5323 = r0;
        xa5 xa5324 = new xa5("RowsPerStrip", 278, 3, 4);
        xa5 xa5325 = r0;
        xa5 xa5326 = new xa5("StripByteCounts", 279, 3, 4);
        xa5 xa5327 = r0;
        xa5 xa5328 = new xa5("XResolution", 282, 5);
        xa5 xa5329 = r0;
        xa5 xa5330 = new xa5("YResolution", 283, 5);
        xa5 xa5331 = r0;
        xa5 xa5332 = new xa5("PlanarConfiguration", 284, 3);
        xa5 xa5333 = r0;
        xa5 xa5334 = new xa5("ResolutionUnit", 296, 3);
        xa5 xa5335 = r0;
        xa5 xa5336 = new xa5("TransferFunction", HttpStatus.SC_MOVED_PERMANENTLY, 3);
        xa5 xa5337 = r0;
        xa5 xa5338 = new xa5("Software", HttpStatus.SC_USE_PROXY, 2);
        xa5 xa5339 = r0;
        xa5 xa5340 = new xa5("DateTime", 306, 2);
        xa5 xa5341 = r0;
        xa5 xa5342 = new xa5("Artist", 315, 2);
        xa5 xa5343 = r0;
        xa5 xa5344 = new xa5("WhitePoint", 318, 5);
        xa5 xa5345 = r0;
        xa5 xa5346 = new xa5("PrimaryChromaticities", 319, 5);
        xa5 xa5347 = r0;
        xa5 xa5348 = new xa5("SubIFDPointer", 330, 4);
        xa5 xa5349 = r0;
        xa5 xa5350 = new xa5("JPEGInterchangeFormat", 513, 4);
        xa5 xa5351 = r0;
        xa5 xa5352 = new xa5("JPEGInterchangeFormatLength", 514, 4);
        xa5 xa5353 = r0;
        xa5 xa5354 = new xa5("YCbCrCoefficients", 529, 5);
        xa5 xa5355 = r0;
        xa5 xa5356 = new xa5("YCbCrSubSampling", 530, 3);
        xa5 xa5357 = r0;
        xa5 xa5358 = new xa5("YCbCrPositioning", 531, 3);
        xa5 xa5359 = r0;
        xa5 xa5360 = new xa5("ReferenceBlackWhite", 532, 5);
        xa5 xa5361 = r0;
        xa5 xa5362 = new xa5("Copyright", 33432, 2);
        xa5 xa5363 = r0;
        xa5 xa5364 = new xa5("ExifIFDPointer", 34665, 4);
        xa5 xa5365 = r0;
        String str = "GPSInfoIFDPointer";
        xa5 xa5366 = new xa5(str, 34853, 4);
        xa5 xa5367 = r0;
        xa5 xa5368 = new xa5("DNGVersion", 50706, 1);
        xa5 xa5369 = r0;
        xa5 xa5370 = new xa5("DefaultCropSize", 50720, 3, 4);
        V = new xa5[][]{xa5Arr, new xa5[]{xa585, xa587, xa589, xa591, xa593, xa595, xa597, xa599, xa5101, xa5103, xa5105, xa5107, xa5109, xa5111, xa5113, xa5115, xa5117, xa5119, xa5121, xa5123, xa5125, xa5127, xa5129, xa5131, xa5133, xa5135, xa5137, xa5139, xa5141, xa5143, xa5145, xa5147, xa5149, xa5151, xa5153, xa5155, xa5157, xa5159, xa5161, xa5163, xa5165, xa5167, xa5169, xa5171, xa5173, xa5175, xa5177, xa5179, xa5181, xa5183, xa5185, xa5187, xa5189, xa5191, xa5193, xa5195, xa5197, xa5199, xa5201, xa5203, xa5205, xa5207, xa5209, xa5211, xa5213, xa5215, xa5217, xa5219, xa5221, xa5223, xa5225, xa5227, xa5229, xa5231}, xa5Arr2, xa5Arr3, new xa5[]{xa5297, xa5299, xa5301, xa5303, xa5305, xa5307, xa5309, xa5311, xa5313, xa5315, xa5317, xa5319, xa5321, xa5323, xa5325, xa5327, xa5329, xa5331, xa5333, xa5335, xa5337, xa5339, xa5341, xa5343, xa5345, xa5347, xa5349, xa5351, xa5353, xa5355, xa5357, xa5359, xa5361, xa5363, xa5365, xa5367, xa5369}, xa5Arr, new xa5[]{new xa5("ThumbnailImage", 256, 7), new xa5("CameraSettingsIFDPointer", 8224, 4), new xa5("ImageProcessingIFDPointer", 8256, 4)}, new xa5[]{new xa5("PreviewImageStart", 257, 4), new xa5("PreviewImageLength", 258, 4)}, new xa5[]{new xa5("AspectFrame", 4371, 3)}, new xa5[]{new xa5("ColorSpace", 55, 3)}};
        W = new xa5[]{new xa5("SubIFDPointer", 330, 4), new xa5("ExifIFDPointer", 34665, 4), new xa5(str, 34853, 4), new xa5("InteroperabilityIFDPointer", 40965, 4), new xa5("CameraSettingsIFDPointer", 8224, 1), new xa5("ImageProcessingIFDPointer", 8256, 1)};
        Charset forName = Charset.forName("US-ASCII");
        b0 = forName;
        c0 = "Exif\u0000\u0000".getBytes(forName);
        d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            xa5[][] xa5Arr4 = V;
            if (i2 < xa5Arr4.length) {
                X[i2] = new HashMap();
                Y[i2] = new HashMap();
                for (xa5 xa5371 : xa5Arr4[i2]) {
                    X[i2].put(Integer.valueOf(xa5371.a), xa5371);
                    Y[i2].put(xa5371.b, xa5371);
                }
                i2++;
            } else {
                HashMap hashMap = a0;
                xa5[] xa5Arr5 = W;
                hashMap.put(Integer.valueOf(xa5Arr5[0].a), 5);
                hashMap.put(Integer.valueOf(xa5Arr5[1].a), 1);
                hashMap.put(Integer.valueOf(xa5Arr5[2].a), 2);
                hashMap.put(Integer.valueOf(xa5Arr5[3].a), 3);
                hashMap.put(Integer.valueOf(xa5Arr5[4].a), 7);
                hashMap.put(Integer.valueOf(xa5Arr5[5].a), 8);
                Pattern.compile(".*[1-9].*");
                return;
            }
        }
    }

    public ab5(String str) {
        boolean z2;
        xa5[][] xa5Arr = V;
        this.e = new HashMap[xa5Arr.length];
        this.f = new HashSet(xa5Arr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.c = null;
            this.a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    try {
                        bb5.c(fileInputStream2.getFD(), 0, OsConstants.SEEK_CUR);
                        z2 = true;
                    } catch (Exception unused) {
                        z2 = false;
                    }
                    if (z2) {
                        this.b = fileInputStream2.getFD();
                    } else {
                        this.b = null;
                    }
                    t(fileInputStream2);
                    ld8.l(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    ld8.l(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                ld8.l(fileInputStream);
                throw th;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble2 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + parseDouble;
            if (!str2.equals("S")) {
                if (!str2.equals("W")) {
                    if (!str2.equals("N")) {
                        if (!str2.equals("E")) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble2;
                }
            }
            return -parseDouble2;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(va5 va5, pw0 pw0, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (va5.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = b0;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            int readInt = va5.readInt();
            pw0.write(bArr3);
            pw0.b(readInt);
            if (readInt % 2 == 1) {
                readInt++;
            }
            ld8.o(va5, pw0, readInt);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:67|68|69) */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        java.lang.Double.parseDouble(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
        return new android.util.Pair(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
        return new android.util.Pair(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x013c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair q(java.lang.String r10) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r10.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r10 = r10.split(r0, r6)
            r0 = r10[r2]
            android.util.Pair r0 = q(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r10.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r10[r3]
            android.util.Pair r1 = q(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r6
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r10.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r10 = r10.split(r0, r6)
            int r0 = r10.length
            if (r0 != r4) goto L_0x00ff
            r0 = r10[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r10 = r10[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r4 = 10
            if (r10 < 0) goto L_0x00f5
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r0 = 5
            if (r10 > 0) goto L_0x00eb
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00eb:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00f5:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00ff:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x013c }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r3 = 4
            if (r2 < 0) goto L_0x0124
            r8 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0124
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x0124:
            if (r2 >= 0) goto L_0x0132
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x0132:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x013c:
            java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x014b }
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014b }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014b }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x014b }
            return r10
        L_0x014b:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab5.q(java.lang.String):android.util.Pair");
    }

    public static ByteOrder w(va5 va5) {
        short readShort = va5.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void A(int i2, String str, String str2) {
        HashMap[] hashMapArr = this.e;
        if (!hashMapArr[i2].isEmpty() && hashMapArr[i2].get(str) != null) {
            HashMap hashMap = hashMapArr[i2];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i2].remove(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: type inference failed for: r9v8, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009c, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009d, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ea, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00eb, code lost:
        r11 = null;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ed, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00ee, code lost:
        r10 = null;
        r11 = null;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00fa, code lost:
        defpackage.bb5.c(r14.b, 0, android.system.OsConstants.SEEK_SET);
        r4 = new java.io.FileOutputStream(r14.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0110, code lost:
        r4 = new java.io.FileOutputStream(r14.a);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c A[Catch:{ Exception -> 0x00a0, all -> 0x009c }, ExcHandler: all (th java.lang.Throwable), Splitter:B:41:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00fa A[Catch:{ Exception -> 0x010d, all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0110 A[Catch:{ Exception -> 0x010d, all -> 0x010a }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B() {
        /*
            r14 = this;
            java.lang.String r0 = "Failed to save new file. Original file is stored in "
            int r1 = r14.d
            r2 = 14
            r3 = 13
            r4 = 4
            if (r1 == r4) goto L_0x0018
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats."
            r14.<init>(r0)
            throw r14
        L_0x0018:
            java.io.FileDescriptor r1 = r14.b
            if (r1 != 0) goto L_0x0029
            java.lang.String r1 = r14.a
            if (r1 == 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "ExifInterface does not support saving attributes for the current input."
            r14.<init>(r0)
            throw r14
        L_0x0029:
            boolean r1 = r14.h
            if (r1 == 0) goto L_0x003e
            boolean r1 = r14.i
            if (r1 == 0) goto L_0x003e
            boolean r1 = r14.j
            if (r1 == 0) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            r14.<init>(r0)
            throw r14
        L_0x003e:
            int r1 = r14.n
            r5 = 6
            r6 = 0
            if (r1 == r5) goto L_0x004a
            r5 = 7
            if (r1 != r5) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r1 = r6
            goto L_0x004e
        L_0x004a:
            byte[] r1 = r14.o()
        L_0x004e:
            r14.m = r1
            java.lang.String r1 = "temp"
            java.lang.String r5 = "tmp"
            java.io.File r1 = java.io.File.createTempFile(r1, r5)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            java.lang.String r5 = r14.a     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            r7 = 0
            if (r5 == 0) goto L_0x006e
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            java.lang.String r9 = r14.a     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            r5.<init>(r9)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            goto L_0x007c
        L_0x0066:
            r14 = move-exception
            r9 = r6
            goto L_0x016b
        L_0x006a:
            r14 = move-exception
            r9 = r6
            goto L_0x0162
        L_0x006e:
            java.io.FileDescriptor r5 = r14.b     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            int r9 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            defpackage.bb5.c(r5, r7, r9)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            java.io.FileDescriptor r9 = r14.b     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            r5.<init>(r9)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
        L_0x007c:
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x015f, all -> 0x015c }
            r9.<init>(r1)     // Catch:{ Exception -> 0x015f, all -> 0x015c }
            defpackage.ld8.p(r5, r9)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            defpackage.ld8.l(r5)
            defpackage.ld8.l(r9)
            r5 = 0
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00ed, all -> 0x009c }
            r9.<init>(r1)     // Catch:{ Exception -> 0x00ed, all -> 0x009c }
            java.lang.String r10 = r14.a     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            if (r10 == 0) goto L_0x00a6
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.lang.String r11 = r14.a     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r10.<init>(r11)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            goto L_0x00b4
        L_0x009c:
            r14 = move-exception
            r12 = r6
            goto L_0x014a
        L_0x00a0:
            r2 = move-exception
            r10 = r6
            r11 = r10
        L_0x00a3:
            r12 = r11
        L_0x00a4:
            r6 = r9
            goto L_0x00f1
        L_0x00a6:
            java.io.FileDescriptor r10 = r14.b     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            int r11 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            defpackage.bb5.c(r10, r7, r11)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.io.FileDescriptor r11 = r14.b     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r10.<init>(r11)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
        L_0x00b4:
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00ea, all -> 0x009c }
            r11.<init>(r9)     // Catch:{ Exception -> 0x00ea, all -> 0x009c }
            java.io.BufferedOutputStream r12 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00e7, all -> 0x00e4 }
            r12.<init>(r10)     // Catch:{ Exception -> 0x00e7, all -> 0x00e4 }
            int r13 = r14.d     // Catch:{ Exception -> 0x00e2 }
            if (r13 != r4) goto L_0x00c9
            r14.C(r11, r12)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x00d4
        L_0x00c6:
            r6 = r11
            goto L_0x014a
        L_0x00c9:
            if (r13 != r3) goto L_0x00cf
            r14.D(r11, r12)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x00d4
        L_0x00cf:
            if (r13 != r2) goto L_0x00d4
            r14.E(r11, r12)     // Catch:{ Exception -> 0x00e2 }
        L_0x00d4:
            defpackage.ld8.l(r11)
            defpackage.ld8.l(r12)
            r1.delete()
            r14.m = r6
            return
        L_0x00e0:
            r14 = move-exception
            goto L_0x00c6
        L_0x00e2:
            r2 = move-exception
            goto L_0x00a4
        L_0x00e4:
            r14 = move-exception
            r12 = r6
            goto L_0x00c6
        L_0x00e7:
            r2 = move-exception
            r12 = r6
            goto L_0x00a4
        L_0x00ea:
            r2 = move-exception
            r11 = r6
            goto L_0x00a3
        L_0x00ed:
            r2 = move-exception
            r10 = r6
            r11 = r10
            r12 = r11
        L_0x00f1:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x012b }
            r3.<init>(r1)     // Catch:{ Exception -> 0x012b }
            java.lang.String r4 = r14.a     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            if (r4 != 0) goto L_0x0110
            java.io.FileDescriptor r4 = r14.b     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            int r6 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            defpackage.bb5.c(r4, r7, r6)     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            java.io.FileDescriptor r14 = r14.b     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            r4.<init>(r14)     // Catch:{ Exception -> 0x010d, all -> 0x010a }
        L_0x0108:
            r10 = r4
            goto L_0x0118
        L_0x010a:
            r14 = move-exception
            r6 = r3
            goto L_0x0143
        L_0x010d:
            r14 = move-exception
            r6 = r3
            goto L_0x012c
        L_0x0110:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            java.lang.String r14 = r14.a     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            r4.<init>(r14)     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            goto L_0x0108
        L_0x0118:
            defpackage.ld8.p(r3, r10)     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            defpackage.ld8.l(r3)     // Catch:{ all -> 0x00e0 }
            defpackage.ld8.l(r10)     // Catch:{ all -> 0x00e0 }
            java.io.IOException r14 = new java.io.IOException     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "Failed to save new file"
            r14.<init>(r0, r2)     // Catch:{ all -> 0x00e0 }
            throw r14     // Catch:{ all -> 0x00e0 }
        L_0x0129:
            r14 = move-exception
            goto L_0x0143
        L_0x012b:
            r14 = move-exception
        L_0x012c:
            r5 = 1
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0129 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r3.<init>(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ all -> 0x0129 }
            r3.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0129 }
            r2.<init>(r0, r14)     // Catch:{ all -> 0x0129 }
            throw r2     // Catch:{ all -> 0x0129 }
        L_0x0143:
            defpackage.ld8.l(r6)     // Catch:{ all -> 0x00e0 }
            defpackage.ld8.l(r10)     // Catch:{ all -> 0x00e0 }
            throw r14     // Catch:{ all -> 0x00e0 }
        L_0x014a:
            defpackage.ld8.l(r6)
            defpackage.ld8.l(r12)
            if (r5 != 0) goto L_0x0155
            r1.delete()
        L_0x0155:
            throw r14
        L_0x0156:
            r14 = move-exception
        L_0x0157:
            r6 = r5
            goto L_0x016b
        L_0x0159:
            r14 = move-exception
        L_0x015a:
            r6 = r5
            goto L_0x0162
        L_0x015c:
            r14 = move-exception
            r9 = r6
            goto L_0x0157
        L_0x015f:
            r14 = move-exception
            r9 = r6
            goto L_0x015a
        L_0x0162:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x016a }
            java.lang.String r1 = "Failed to copy original file to temp file"
            r0.<init>(r1, r14)     // Catch:{ all -> 0x016a }
            throw r0     // Catch:{ all -> 0x016a }
        L_0x016a:
            r14 = move-exception
        L_0x016b:
            defpackage.ld8.l(r6)
            defpackage.ld8.l(r9)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab5.B():void");
    }

    public final void C(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        va5 va5 = new va5((InputStream) bufferedInputStream);
        pw0 pw0 = new pw0(bufferedOutputStream, ByteOrder.BIG_ENDIAN, 1);
        if (va5.readByte() == -1) {
            pw0.a(-1);
            if (va5.readByte() == -40) {
                pw0.a(-40);
                String d2 = d("Xmp");
                HashMap[] hashMapArr = this.e;
                wa5 wa5 = (d2 == null || !this.s) ? null : (wa5) hashMapArr[0].remove("Xmp");
                pw0.a(-1);
                pw0.a(-31);
                K(pw0);
                if (wa5 != null) {
                    hashMapArr[0].put("Xmp", wa5);
                }
                byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
                while (va5.readByte() == -1) {
                    byte readByte = va5.readByte();
                    if (readByte == -39 || readByte == -38) {
                        pw0.a(-1);
                        pw0.a(readByte);
                        ld8.p(va5, pw0);
                        return;
                    } else if (readByte != -31) {
                        pw0.a(-1);
                        pw0.a(readByte);
                        int readUnsignedShort = va5.readUnsignedShort();
                        pw0.d((short) readUnsignedShort);
                        int i2 = readUnsignedShort - 2;
                        if (i2 >= 0) {
                            while (i2 > 0) {
                                int read = va5.read(bArr, 0, Math.min(i2, ConstantsKt.DEFAULT_BLOCK_SIZE));
                                if (read < 0) {
                                    break;
                                }
                                pw0.write(bArr, 0, read);
                                i2 -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = va5.readUnsignedShort();
                        int i3 = readUnsignedShort2 - 2;
                        if (i3 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (i3 >= 6) {
                                if (va5.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, c0)) {
                                    va5.a(readUnsignedShort2 - 8);
                                }
                            }
                            pw0.a(-1);
                            pw0.a(readByte);
                            pw0.d((short) readUnsignedShort2);
                            if (i3 >= 6) {
                                i3 = readUnsignedShort2 - 8;
                                pw0.write(bArr2);
                            }
                            while (i3 > 0) {
                                int read2 = va5.read(bArr, 0, Math.min(i3, ConstantsKt.DEFAULT_BLOCK_SIZE));
                                if (read2 < 0) {
                                    break;
                                }
                                pw0.write(bArr, 0, read2);
                                i3 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        va5 va5 = new va5((InputStream) bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        pw0 pw0 = new pw0(bufferedOutputStream, byteOrder, 1);
        byte[] bArr = E;
        ld8.o(va5, pw0, bArr.length);
        int i2 = this.o;
        if (i2 == 0) {
            int readInt = va5.readInt();
            pw0.b(readInt);
            ld8.o(va5, pw0, readInt + 8);
        } else {
            ld8.o(va5, pw0, (i2 - bArr.length) - 8);
            va5.a(va5.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                pw0 pw02 = new pw0(byteArrayOutputStream2, byteOrder, 1);
                K(pw02);
                byte[] byteArray = ((ByteArrayOutputStream) pw02.b).toByteArray();
                pw0.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                pw0.b((int) crc32.getValue());
                ld8.l(byteArrayOutputStream2);
                ld8.p(va5, pw0);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                ld8.l(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ld8.l(byteArrayOutputStream);
            throw th;
        }
    }

    public final void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        pw0 pw0;
        byte[] bArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        BufferedInputStream bufferedInputStream2 = bufferedInputStream;
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        va5 va5 = new va5(bufferedInputStream2, byteOrder);
        pw0 pw02 = new pw0(bufferedOutputStream, byteOrder, 1);
        byte[] bArr2 = I;
        ld8.o(va5, pw02, bArr2.length);
        byte[] bArr3 = J;
        va5.a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                pw0 pw03 = new pw0(byteArrayOutputStream2, byteOrder, 1);
                int i5 = this.o;
                if (i5 != 0) {
                    ld8.o(va5, pw03, (i5 - ((bArr2.length + 4) + bArr3.length)) - 8);
                    va5.a(4);
                    int readInt = va5.readInt();
                    if (readInt % 2 != 0) {
                        readInt++;
                    }
                    va5.a(readInt);
                    K(pw03);
                } else {
                    byte[] bArr4 = new byte[4];
                    if (va5.read(bArr4) == 4) {
                        byte[] bArr5 = M;
                        boolean equals = Arrays.equals(bArr4, bArr5);
                        byte[] bArr6 = O;
                        byte[] bArr7 = N;
                        boolean z3 = false;
                        if (equals) {
                            int readInt2 = va5.readInt();
                            byte[] bArr8 = new byte[(readInt2 % 2 == 1 ? readInt2 + 1 : readInt2)];
                            va5.read(bArr8);
                            byte b2 = (byte) (bArr8[0] | 8);
                            bArr8[0] = b2;
                            if (((b2 >> 1) & 1) == 1) {
                                z3 = true;
                            }
                            pw03.write(bArr5);
                            pw03.b(readInt2);
                            pw03.write(bArr8);
                            if (z3) {
                                c(va5, pw03, P, (byte[]) null);
                                while (true) {
                                    byte[] bArr9 = new byte[4];
                                    bufferedInputStream2.read(bArr9);
                                    if (!Arrays.equals(bArr9, Q)) {
                                        break;
                                    }
                                    int readInt3 = va5.readInt();
                                    pw03.write(bArr9);
                                    pw03.b(readInt3);
                                    if (readInt3 % 2 == 1) {
                                        readInt3++;
                                    }
                                    ld8.o(va5, pw03, readInt3);
                                }
                                K(pw03);
                            } else {
                                c(va5, pw03, bArr6, bArr7);
                                K(pw03);
                            }
                        } else if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                            int readInt4 = va5.readInt();
                            int i6 = readInt4 % 2 == 1 ? readInt4 + 1 : readInt4;
                            byte[] bArr10 = new byte[3];
                            boolean equals2 = Arrays.equals(bArr4, bArr6);
                            byte[] bArr11 = L;
                            if (equals2) {
                                va5.read(bArr10);
                                byte[] bArr12 = new byte[3];
                                pw0 = pw02;
                                if (va5.read(bArr12) != 3 || !Arrays.equals(bArr11, bArr12)) {
                                    throw new IOException("Encountered error while checking VP8 signature");
                                }
                                i4 = va5.readInt();
                                i3 = (i4 << 18) >> 18;
                                i6 -= 10;
                                i2 = (i4 << 2) >> 18;
                                z2 = false;
                            } else {
                                pw0 = pw02;
                                if (!Arrays.equals(bArr4, bArr7)) {
                                    i4 = 0;
                                    i3 = 0;
                                    z2 = false;
                                    i2 = 0;
                                } else if (va5.readByte() == 47) {
                                    i4 = va5.readInt();
                                    z2 = true;
                                    i3 = (i4 & 16383) + 1;
                                    i2 = ((i4 & 268419072) >>> 14) + 1;
                                    if ((i4 & 268435456) == 0) {
                                        z2 = false;
                                    }
                                    i6 -= 5;
                                } else {
                                    throw new IOException("Encountered error while checking VP8L signature");
                                }
                            }
                            pw03.write(bArr5);
                            pw03.b(10);
                            byte[] bArr13 = new byte[10];
                            if (z2) {
                                bArr13[0] = (byte) (bArr13[0] | 16);
                            }
                            bArr13[0] = (byte) (bArr13[0] | 8);
                            int i7 = i3 - 1;
                            int i8 = i2 - 1;
                            bArr = bArr3;
                            bArr13[4] = (byte) i7;
                            bArr13[5] = (byte) (i7 >> 8);
                            bArr13[6] = (byte) (i7 >> 16);
                            bArr13[7] = (byte) i8;
                            bArr13[8] = (byte) (i8 >> 8);
                            bArr13[9] = (byte) (i8 >> 16);
                            pw03.write(bArr13);
                            pw03.write(bArr4);
                            pw03.b(readInt4);
                            if (Arrays.equals(bArr4, bArr6)) {
                                pw03.write(bArr10);
                                pw03.write(bArr11);
                                pw03.b(i4);
                            } else if (Arrays.equals(bArr4, bArr7)) {
                                pw03.write(47);
                                pw03.b(i4);
                            }
                            ld8.o(va5, pw03, i6);
                            K(pw03);
                            ld8.p(va5, pw03);
                            byte[] bArr14 = bArr;
                            pw0 pw04 = pw0;
                            pw04.b(byteArrayOutputStream2.size() + bArr14.length);
                            pw04.write(bArr14);
                            byteArrayOutputStream2.writeTo(pw04);
                            ld8.l(byteArrayOutputStream2);
                        }
                    } else {
                        throw new IOException("Encountered invalid length while parsing WebP chunk type");
                    }
                }
                pw0 = pw02;
                bArr = bArr3;
                ld8.p(va5, pw03);
                byte[] bArr142 = bArr;
                pw0 pw042 = pw0;
                pw042.b(byteArrayOutputStream2.size() + bArr142.length);
                pw042.write(bArr142);
                byteArrayOutputStream2.writeTo(pw042);
                ld8.l(byteArrayOutputStream2);
            } catch (Exception e2) {
                e = e2;
                byteArrayOutputStream = byteArrayOutputStream2;
                try {
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    ld8.l(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                ld8.l(byteArrayOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            throw new IOException("Failed to save WebP file", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020f, code lost:
        r4 = 0;
        r5 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 0
            r4 = 1
            java.lang.String r5 = "DateTime"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0020
            java.lang.String r5 = "DateTimeOriginal"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0020
            java.lang.String r5 = "DateTimeDigitized"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004f
        L_0x0020:
            if (r2 == 0) goto L_0x004f
            java.util.regex.Pattern r5 = f0
            java.util.regex.Matcher r5 = r5.matcher(r2)
            boolean r5 = r5.find()
            java.util.regex.Pattern r6 = g0
            java.util.regex.Matcher r6 = r6.matcher(r2)
            boolean r6 = r6.find()
            int r7 = r20.length()
            r8 = 19
            if (r7 != r8) goto L_0x004e
            if (r5 != 0) goto L_0x0043
            if (r6 != 0) goto L_0x0043
            goto L_0x004e
        L_0x0043:
            if (r6 == 0) goto L_0x004f
            java.lang.String r5 = "-"
            java.lang.String r6 = ":"
            java.lang.String r2 = r2.replaceAll(r5, r6)
            goto L_0x004f
        L_0x004e:
            return
        L_0x004f:
            java.lang.String r5 = "ISOSpeedRatings"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0059
            java.lang.String r1 = "PhotographicSensitivity"
        L_0x0059:
            r5 = 2
            if (r2 == 0) goto L_0x00ca
            java.util.HashSet r6 = Z
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L_0x00ca
            java.lang.String r6 = "GPSTimeStamp"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x00b2
            java.util.regex.Pattern r6 = e0
            java.util.regex.Matcher r2 = r6.matcher(r2)
            boolean r6 = r2.find()
            if (r6 != 0) goto L_0x0079
            return
        L_0x0079:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r2.group(r4)
            int r7 = java.lang.Integer.parseInt(r7)
            r6.append(r7)
            java.lang.String r7 = "/1,"
            r6.append(r7)
            java.lang.String r8 = r2.group(r5)
            int r8 = java.lang.Integer.parseInt(r8)
            r6.append(r8)
            r6.append(r7)
            r7 = 3
            java.lang.String r2 = r2.group(r7)
            int r2 = java.lang.Integer.parseInt(r2)
            r6.append(r2)
            java.lang.String r2 = "/1"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            goto L_0x00ca
        L_0x00b2:
            double r6 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x00c9 }
            ya5 r2 = new ya5     // Catch:{ NumberFormatException -> 0x00c9 }
            r8 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r6 = r6 * r8
            long r6 = (long) r6     // Catch:{ NumberFormatException -> 0x00c9 }
            r8 = 10000(0x2710, double:4.9407E-320)
            r2.<init>(r6, r8)     // Catch:{ NumberFormatException -> 0x00c9 }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x00c9 }
            goto L_0x00ca
        L_0x00c9:
            return
        L_0x00ca:
            r6 = r3
        L_0x00cb:
            xa5[][] r7 = V
            int r7 = r7.length
            if (r6 >= r7) goto L_0x0320
            r7 = 4
            if (r6 != r7) goto L_0x00db
            boolean r7 = r0.h
            if (r7 != 0) goto L_0x00db
        L_0x00d7:
            r5 = r4
            r4 = r3
            goto L_0x031a
        L_0x00db:
            java.util.HashMap[] r7 = Y
            r7 = r7[r6]
            java.lang.Object r7 = r7.get(r1)
            xa5 r7 = (defpackage.xa5) r7
            if (r7 == 0) goto L_0x00d7
            java.util.HashMap[] r8 = r0.e
            if (r2 != 0) goto L_0x00f1
            r7 = r8[r6]
            r7.remove(r1)
            goto L_0x00d7
        L_0x00f1:
            android.util.Pair r9 = q(r2)
            java.lang.Object r10 = r9.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r11 = -1
            int r12 = r7.c
            if (r12 == r10) goto L_0x015d
            java.lang.Object r10 = r9.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r12 != r10) goto L_0x010d
            goto L_0x015d
        L_0x010d:
            int r7 = r7.d
            if (r7 == r11) goto L_0x0127
            java.lang.Object r10 = r9.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r7 == r10) goto L_0x0125
            java.lang.Object r10 = r9.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r7 != r10) goto L_0x0127
        L_0x0125:
            r12 = r7
            goto L_0x015d
        L_0x0127:
            if (r12 == r4) goto L_0x015d
            r10 = 7
            if (r12 == r10) goto L_0x015d
            if (r12 != r5) goto L_0x012f
            goto L_0x015d
        L_0x012f:
            boolean r8 = t
            if (r8 == 0) goto L_0x00d7
            java.lang.String[] r8 = R
            r10 = r8[r12]
            if (r7 != r11) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r7 = r8[r7]
        L_0x013c:
            java.lang.Object r7 = r9.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r7 = r8[r7]
            java.lang.Object r7 = r9.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r11) goto L_0x0151
            goto L_0x00d7
        L_0x0151:
            java.lang.Object r7 = r9.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r7 = r8[r7]
            goto L_0x00d7
        L_0x015d:
            java.lang.String r7 = "/"
            int[] r9 = S
            java.lang.String r10 = ","
            switch(r12) {
                case 1: goto L_0x02df;
                case 2: goto L_0x02d4;
                case 3: goto L_0x02b0;
                case 4: goto L_0x028c;
                case 5: goto L_0x0254;
                case 6: goto L_0x0166;
                case 7: goto L_0x02d4;
                case 8: goto L_0x0166;
                case 9: goto L_0x0213;
                case 10: goto L_0x01a7;
                case 11: goto L_0x0166;
                case 12: goto L_0x0168;
                default: goto L_0x0166;
            }
        L_0x0166:
            goto L_0x00d7
        L_0x0168:
            java.lang.String[] r7 = r2.split(r10, r11)
            int r10 = r7.length
            double[] r11 = new double[r10]
            r12 = r3
        L_0x0170:
            int r13 = r7.length
            if (r12 >= r13) goto L_0x017d
            r13 = r7[r12]
            double r13 = java.lang.Double.parseDouble(r13)
            r11[r12] = r13
            int r12 = r12 + r4
            goto L_0x0170
        L_0x017d:
            r7 = r8[r6]
            java.nio.ByteOrder r8 = r0.g
            r12 = 12
            r9 = r9[r12]
            int r9 = r9 * r10
            byte[] r9 = new byte[r9]
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            r9.order(r8)
            r8 = r3
        L_0x0190:
            if (r8 >= r10) goto L_0x0199
            r13 = r11[r8]
            r9.putDouble(r13)
            int r8 = r8 + r4
            goto L_0x0190
        L_0x0199:
            wa5 r8 = new wa5
            byte[] r9 = r9.array()
            r8.<init>(r12, r9, r10)
            r7.put(r1, r8)
            goto L_0x00d7
        L_0x01a7:
            java.lang.String[] r10 = r2.split(r10, r11)
            int r12 = r10.length
            ya5[] r13 = new defpackage.ya5[r12]
            r14 = r3
        L_0x01af:
            int r15 = r10.length
            if (r14 >= r15) goto L_0x01d8
            r15 = r10[r14]
            java.lang.String[] r15 = r15.split(r7, r11)
            ya5 r5 = new ya5
            r16 = r15[r3]
            r17 = r12
            double r11 = java.lang.Double.parseDouble(r16)
            long r11 = (long) r11
            r15 = r15[r4]
            double r3 = java.lang.Double.parseDouble(r15)
            long r3 = (long) r3
            r5.<init>(r11, r3)
            r13[r14] = r5
            r3 = 1
            int r14 = r14 + r3
            r4 = r3
            r12 = r17
            r3 = 0
            r5 = 2
            r11 = -1
            goto L_0x01af
        L_0x01d8:
            r17 = r12
            r3 = r8[r6]
            java.nio.ByteOrder r4 = r0.g
            r5 = 10
            r7 = r9[r5]
            int r7 = r7 * r17
            byte[] r7 = new byte[r7]
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            r7.order(r4)
            r8 = r17
            r4 = 0
        L_0x01f0:
            if (r4 >= r8) goto L_0x0203
            r9 = r13[r4]
            long r10 = r9.a
            int r10 = (int) r10
            r7.putInt(r10)
            long r9 = r9.b
            int r9 = (int) r9
            r7.putInt(r9)
            r9 = 1
            int r4 = r4 + r9
            goto L_0x01f0
        L_0x0203:
            wa5 r4 = new wa5
            byte[] r7 = r7.array()
            r4.<init>(r5, r7, r8)
            r3.put(r1, r4)
        L_0x020f:
            r4 = 0
            r5 = 1
            goto L_0x031a
        L_0x0213:
            r3 = r11
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            int[] r5 = new int[r4]
            r7 = 0
        L_0x021c:
            int r10 = r3.length
            if (r7 >= r10) goto L_0x022a
            r10 = r3[r7]
            int r10 = java.lang.Integer.parseInt(r10)
            r5[r7] = r10
            r10 = 1
            int r7 = r7 + r10
            goto L_0x021c
        L_0x022a:
            r3 = r8[r6]
            java.nio.ByteOrder r7 = r0.g
            r8 = 9
            r9 = r9[r8]
            int r9 = r9 * r4
            byte[] r9 = new byte[r9]
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            r9.order(r7)
            r7 = 0
        L_0x023d:
            if (r7 >= r4) goto L_0x0247
            r10 = r5[r7]
            r9.putInt(r10)
            r10 = 1
            int r7 = r7 + r10
            goto L_0x023d
        L_0x0247:
            wa5 r5 = new wa5
            byte[] r7 = r9.array()
            r5.<init>(r8, r7, r4)
            r3.put(r1, r5)
            goto L_0x020f
        L_0x0254:
            r3 = r11
            java.lang.String[] r4 = r2.split(r10, r3)
            int r5 = r4.length
            ya5[] r5 = new defpackage.ya5[r5]
            r9 = 0
        L_0x025d:
            int r10 = r4.length
            if (r9 >= r10) goto L_0x0280
            r10 = r4[r9]
            java.lang.String[] r10 = r10.split(r7, r3)
            ya5 r3 = new ya5
            r11 = 0
            r12 = r10[r11]
            double r11 = java.lang.Double.parseDouble(r12)
            long r11 = (long) r11
            r13 = 1
            r10 = r10[r13]
            double r14 = java.lang.Double.parseDouble(r10)
            long r14 = (long) r14
            r3.<init>(r11, r14)
            r5[r9] = r3
            int r9 = r9 + r13
            r3 = -1
            goto L_0x025d
        L_0x0280:
            r3 = r8[r6]
            java.nio.ByteOrder r4 = r0.g
            wa5 r4 = defpackage.wa5.d(r5, r4)
            r3.put(r1, r4)
            goto L_0x020f
        L_0x028c:
            r3 = r11
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            long[] r4 = new long[r4]
            r11 = 0
        L_0x0295:
            int r5 = r3.length
            if (r11 >= r5) goto L_0x02a3
            r5 = r3[r11]
            long r9 = java.lang.Long.parseLong(r5)
            r4[r11] = r9
            r5 = 1
            int r11 = r11 + r5
            goto L_0x0295
        L_0x02a3:
            r3 = r8[r6]
            java.nio.ByteOrder r5 = r0.g
            wa5 r4 = defpackage.wa5.c(r4, r5)
            r3.put(r1, r4)
            goto L_0x020f
        L_0x02b0:
            r3 = r11
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r11 = 0
        L_0x02b9:
            int r5 = r3.length
            if (r11 >= r5) goto L_0x02c7
            r5 = r3[r11]
            int r5 = java.lang.Integer.parseInt(r5)
            r4[r11] = r5
            r5 = 1
            int r11 = r11 + r5
            goto L_0x02b9
        L_0x02c7:
            r3 = r8[r6]
            java.nio.ByteOrder r5 = r0.g
            wa5 r4 = defpackage.wa5.f(r4, r5)
            r3.put(r1, r4)
            goto L_0x020f
        L_0x02d4:
            r3 = r8[r6]
            wa5 r4 = defpackage.wa5.a(r2)
            r3.put(r1, r4)
            goto L_0x020f
        L_0x02df:
            r3 = r8[r6]
            int r4 = r2.length()
            r5 = 1
            if (r4 != r5) goto L_0x0309
            r4 = 0
            char r7 = r2.charAt(r4)
            r8 = 48
            if (r7 < r8) goto L_0x030a
            char r7 = r2.charAt(r4)
            r9 = 49
            if (r7 > r9) goto L_0x030a
            char r7 = r2.charAt(r4)
            int r7 = r7 - r8
            byte r7 = (byte) r7
            byte[] r8 = new byte[r5]
            r8[r4] = r7
            wa5 r7 = new wa5
            r7.<init>(r5, r8, r5)
            goto L_0x0317
        L_0x0309:
            r4 = 0
        L_0x030a:
            java.nio.charset.Charset r7 = b0
            byte[] r7 = r2.getBytes(r7)
            wa5 r8 = new wa5
            int r9 = r7.length
            r8.<init>(r5, r7, r9)
            r7 = r8
        L_0x0317:
            r3.put(r1, r7)
        L_0x031a:
            int r6 = r6 + r5
            r3 = r4
            r4 = r5
            r5 = 2
            goto L_0x00cb
        L_0x0320:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab5.F(java.lang.String, java.lang.String):void");
    }

    public final void G(va5 va5) {
        wa5 wa5;
        va5 va52 = va5;
        HashMap hashMap = this.e[4];
        wa5 wa52 = (wa5) hashMap.get("Compression");
        if (wa52 != null) {
            int h2 = wa52.h(this.g);
            this.n = h2;
            if (h2 != 1) {
                if (h2 == 6) {
                    r(va52, hashMap);
                    return;
                } else if (h2 != 7) {
                    return;
                }
            }
            wa5 wa53 = (wa5) hashMap.get("BitsPerSample");
            if (wa53 != null) {
                int[] iArr = (int[]) wa53.j(this.g);
                int[] iArr2 = w;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.d == 3 && (wa5 = (wa5) hashMap.get("PhotometricInterpretation")) != null) {
                        int h3 = wa5.h(this.g);
                        if ((h3 != 1 || !Arrays.equals(iArr, x)) && (h3 != 6 || !Arrays.equals(iArr, iArr2))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                wa5 wa54 = (wa5) hashMap.get("StripOffsets");
                wa5 wa55 = (wa5) hashMap.get("StripByteCounts");
                if (wa54 != null && wa55 != null) {
                    long[] n2 = ld8.n(wa54.j(this.g));
                    long[] n3 = ld8.n(wa55.j(this.g));
                    if (n2 != null && n2.length != 0 && n3 != null && n3.length != 0 && n2.length == n3.length) {
                        long j2 = 0;
                        for (long j3 : n3) {
                            j2 += j3;
                        }
                        int i2 = (int) j2;
                        byte[] bArr = new byte[i2];
                        this.j = true;
                        this.i = true;
                        this.h = true;
                        int i3 = 0;
                        int i4 = 0;
                        int i5 = 0;
                        while (i3 < n2.length) {
                            int i6 = (int) n2[i3];
                            int i7 = (int) n3[i3];
                            if (i3 < n2.length - 1 && ((long) (i6 + i7)) != n2[i3 + 1]) {
                                this.j = false;
                            }
                            int i8 = i6 - i4;
                            if (i8 >= 0) {
                                long j4 = (long) i8;
                                if (va52.skip(j4) == j4) {
                                    int i9 = i4 + i8;
                                    byte[] bArr2 = new byte[i7];
                                    if (va52.read(bArr2) == i7) {
                                        i4 = i9 + i7;
                                        System.arraycopy(bArr2, 0, bArr, i5, i7);
                                        i5 += i7;
                                        i3++;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        this.m = bArr;
                        if (this.j) {
                            this.k = (int) n2[0];
                            this.l = i2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.n = 6;
        r(va52, hashMap);
    }

    public final void H(int i2, int i3) {
        HashMap[] hashMapArr = this.e;
        if (!hashMapArr[i2].isEmpty() && !hashMapArr[i3].isEmpty()) {
            wa5 wa5 = (wa5) hashMapArr[i2].get("ImageLength");
            wa5 wa52 = (wa5) hashMapArr[i2].get("ImageWidth");
            wa5 wa53 = (wa5) hashMapArr[i3].get("ImageLength");
            wa5 wa54 = (wa5) hashMapArr[i3].get("ImageWidth");
            if (wa5 != null && wa52 != null && wa53 != null && wa54 != null) {
                int h2 = wa5.h(this.g);
                int h3 = wa52.h(this.g);
                int h4 = wa53.h(this.g);
                int h5 = wa54.h(this.g);
                if (h2 < h4 && h3 < h5) {
                    HashMap hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            }
        }
    }

    public final void I(za5 za5, int i2) {
        wa5 wa5;
        wa5 wa52;
        HashMap[] hashMapArr = this.e;
        wa5 wa53 = (wa5) hashMapArr[i2].get("DefaultCropSize");
        wa5 wa54 = (wa5) hashMapArr[i2].get("SensorTopBorder");
        wa5 wa55 = (wa5) hashMapArr[i2].get("SensorLeftBorder");
        wa5 wa56 = (wa5) hashMapArr[i2].get("SensorBottomBorder");
        wa5 wa57 = (wa5) hashMapArr[i2].get("SensorRightBorder");
        if (wa53 != null) {
            if (wa53.a == 5) {
                ya5[] ya5Arr = (ya5[]) wa53.j(this.g);
                if (ya5Arr == null || ya5Arr.length != 2) {
                    Arrays.toString(ya5Arr);
                    return;
                }
                wa52 = wa5.d(new ya5[]{ya5Arr[0]}, this.g);
                wa5 = wa5.d(new ya5[]{ya5Arr[1]}, this.g);
            } else {
                int[] iArr = (int[]) wa53.j(this.g);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    wa52 = wa5.e(iArr[0], this.g);
                    wa5 = wa5.e(iArr[1], this.g);
                }
            }
            hashMapArr[i2].put("ImageWidth", wa52);
            hashMapArr[i2].put("ImageLength", wa5);
        } else if (wa54 == null || wa55 == null || wa56 == null || wa57 == null) {
            wa5 wa58 = (wa5) hashMapArr[i2].get("ImageLength");
            wa5 wa59 = (wa5) hashMapArr[i2].get("ImageWidth");
            if (wa58 == null || wa59 == null) {
                wa5 wa510 = (wa5) hashMapArr[i2].get("JPEGInterchangeFormat");
                wa5 wa511 = (wa5) hashMapArr[i2].get("JPEGInterchangeFormatLength");
                if (wa510 != null && wa511 != null) {
                    int h2 = wa510.h(this.g);
                    int h3 = wa510.h(this.g);
                    za5.b((long) h2);
                    byte[] bArr = new byte[h3];
                    za5.read(bArr);
                    h(new va5(bArr), h2, i2);
                }
            }
        } else {
            int h4 = wa54.h(this.g);
            int h5 = wa56.h(this.g);
            int h6 = wa57.h(this.g);
            int h7 = wa55.h(this.g);
            if (h5 > h4 && h6 > h7) {
                wa5 e2 = wa5.e(h5 - h4, this.g);
                wa5 e3 = wa5.e(h6 - h7, this.g);
                hashMapArr[i2].put("ImageLength", e2);
                hashMapArr[i2].put("ImageWidth", e3);
            }
        }
    }

    public final void J() {
        H(0, 5);
        H(0, 4);
        H(5, 4);
        HashMap[] hashMapArr = this.e;
        wa5 wa5 = (wa5) hashMapArr[1].get("PixelXDimension");
        wa5 wa52 = (wa5) hashMapArr[1].get("PixelYDimension");
        if (!(wa5 == null || wa52 == null)) {
            hashMapArr[0].put("ImageWidth", wa5);
            hashMapArr[0].put("ImageLength", wa52);
        }
        if (hashMapArr[4].isEmpty() && s(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        s(hashMapArr[4]);
        A(0, "ThumbnailOrientation", "Orientation");
        A(0, "ThumbnailImageLength", "ImageLength");
        A(0, "ThumbnailImageWidth", "ImageWidth");
        A(5, "ThumbnailOrientation", "Orientation");
        A(5, "ThumbnailImageLength", "ImageLength");
        A(5, "ThumbnailImageWidth", "ImageWidth");
        A(4, "Orientation", "ThumbnailOrientation");
        A(4, "ImageLength", "ThumbnailImageLength");
        A(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void K(pw0 pw0) {
        HashMap[] hashMapArr;
        int[] iArr;
        Object[] objArr;
        pw0 pw02 = pw0;
        xa5[][] xa5Arr = V;
        int[] iArr2 = new int[xa5Arr.length];
        int[] iArr3 = new int[xa5Arr.length];
        xa5[] xa5Arr2 = W;
        for (xa5 xa5 : xa5Arr2) {
            z(xa5.b);
        }
        if (this.h) {
            if (this.i) {
                z("StripOffsets");
                z("StripByteCounts");
            } else {
                z("JPEGInterchangeFormat");
                z("JPEGInterchangeFormatLength");
            }
        }
        int i2 = 0;
        while (true) {
            int length = xa5Arr.length;
            hashMapArr = this.e;
            if (i2 >= length) {
                break;
            }
            Object[] array = hashMapArr[i2].entrySet().toArray();
            int length2 = array.length;
            int i3 = 0;
            while (i3 < length2) {
                Map.Entry entry = (Map.Entry) array[i3];
                if (entry.getValue() == null) {
                    objArr = array;
                    hashMapArr[i2].remove(entry.getKey());
                } else {
                    objArr = array;
                }
                i3++;
                array = objArr;
            }
            i2++;
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(xa5Arr2[1].b, wa5.b(0, this.g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(xa5Arr2[2].b, wa5.b(0, this.g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(xa5Arr2[3].b, wa5.b(0, this.g));
        }
        if (this.h) {
            if (this.i) {
                hashMapArr[4].put("StripOffsets", wa5.e(0, this.g));
                hashMapArr[4].put("StripByteCounts", wa5.e(this.l, this.g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", wa5.b(0, this.g));
                hashMapArr[4].put("JPEGInterchangeFormatLength", wa5.b((long) this.l, this.g));
            }
        }
        int i4 = 0;
        while (true) {
            int length3 = xa5Arr.length;
            iArr = S;
            if (i4 >= length3) {
                break;
            }
            int i5 = 0;
            for (Map.Entry value : hashMapArr[i4].entrySet()) {
                wa5 wa5 = (wa5) value.getValue();
                wa5.getClass();
                int i6 = iArr[wa5.a] * wa5.b;
                if (i6 > 4) {
                    i5 += i6;
                }
            }
            iArr3[i4] = iArr3[i4] + i5;
            i4++;
        }
        int i7 = 8;
        for (int i8 = 0; i8 < xa5Arr.length; i8++) {
            if (!hashMapArr[i8].isEmpty()) {
                iArr2[i8] = i7;
                i7 = (hashMapArr[i8].size() * 12) + 6 + iArr3[i8] + i7;
            }
        }
        if (this.h) {
            if (this.i) {
                hashMapArr[4].put("StripOffsets", wa5.e(i7, this.g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", wa5.b((long) i7, this.g));
            }
            this.k = i7;
            i7 += this.l;
        }
        if (this.d == 4) {
            i7 += 8;
        }
        if (t) {
            for (int i9 = 0; i9 < xa5Arr.length; i9++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(i9), Integer.valueOf(iArr2[i9]), Integer.valueOf(hashMapArr[i9].size()), Integer.valueOf(iArr3[i9]), Integer.valueOf(i7)});
            }
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(xa5Arr2[1].b, wa5.b((long) iArr2[1], this.g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(xa5Arr2[2].b, wa5.b((long) iArr2[2], this.g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(xa5Arr2[3].b, wa5.b((long) iArr2[3], this.g));
        }
        int i10 = this.d;
        if (i10 == 4) {
            pw02.d((short) i7);
            pw02.write(c0);
        } else if (i10 == 13) {
            pw02.b(i7);
            pw02.write(F);
        } else if (i10 == 14) {
            pw02.write(K);
            pw02.b(i7);
        }
        pw02.d(this.g == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
        pw02.c = this.g;
        pw02.d((short) 42);
        pw02.b((int) 8);
        for (int i11 = 0; i11 < xa5Arr.length; i11++) {
            if (!hashMapArr[i11].isEmpty()) {
                pw02.d((short) hashMapArr[i11].size());
                int size = (hashMapArr[i11].size() * 12) + iArr2[i11] + 2 + 4;
                for (Map.Entry entry2 : hashMapArr[i11].entrySet()) {
                    int i12 = ((xa5) Y[i11].get(entry2.getKey())).a;
                    wa5 wa52 = (wa5) entry2.getValue();
                    wa52.getClass();
                    int i13 = wa52.a;
                    int i14 = iArr[i13];
                    int i15 = wa52.b;
                    int i16 = i14 * i15;
                    pw02.d((short) i12);
                    pw02.d((short) i13);
                    pw02.b(i15);
                    if (i16 > 4) {
                        pw02.b((int) ((long) size));
                        size += i16;
                    } else {
                        pw02.write(wa52.d);
                        if (i16 < 4) {
                            while (i16 < 4) {
                                pw02.a(0);
                                i16++;
                            }
                        }
                    }
                }
                if (i11 != 0 || hashMapArr[4].isEmpty()) {
                    pw02.b((int) 0);
                } else {
                    pw02.b((int) ((long) iArr2[4]));
                }
                for (Map.Entry value2 : hashMapArr[i11].entrySet()) {
                    byte[] bArr = ((wa5) value2.getValue()).d;
                    if (bArr.length > 4) {
                        pw02.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.h) {
            pw02.write(o());
        }
        if (this.d == 14 && i7 % 2 == 1) {
            pw02.a(0);
        }
        pw02.c = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String d2 = d("DateTimeOriginal");
        HashMap[] hashMapArr = this.e;
        if (d2 != null && d("DateTime") == null) {
            hashMapArr[0].put("DateTime", wa5.a(d2));
        }
        if (d("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", wa5.b(0, this.g));
        }
        if (d("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", wa5.b(0, this.g));
        }
        if (d("Orientation") == null) {
            hashMapArr[0].put("Orientation", wa5.b(0, this.g));
        }
        if (d("LightSource") == null) {
            hashMapArr[1].put("LightSource", wa5.b(0, this.g));
        }
    }

    public final String d(String str) {
        if (str != null) {
            wa5 f2 = f(str);
            if (f2 != null) {
                if (!Z.contains(str)) {
                    return f2.i(this.g);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i2 = f2.a;
                    if (i2 != 5 && i2 != 10) {
                        return null;
                    }
                    ya5[] ya5Arr = (ya5[]) f2.j(this.g);
                    if (ya5Arr == null || ya5Arr.length != 3) {
                        Arrays.toString(ya5Arr);
                        return null;
                    }
                    ya5 ya5 = ya5Arr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) ya5.a) / ((float) ya5.b)));
                    ya5 ya52 = ya5Arr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) ya52.a) / ((float) ya52.b)));
                    ya5 ya53 = ya5Arr[2];
                    return String.format("%02d:%02d:%02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) (((float) ya53.a) / ((float) ya53.b)))});
                }
                try {
                    return Double.toString(f2.g(this.g));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final int e(int i2, String str) {
        wa5 f2 = f(str);
        if (f2 == null) {
            return i2;
        }
        try {
            return f2.h(this.g);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public final wa5 f(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                str = "PhotographicSensitivity";
            }
            for (int i2 = 0; i2 < V.length; i2++) {
                wa5 wa5 = (wa5) this.e[i2].get(str);
                if (wa5 != null) {
                    return wa5;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:51|52|53) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010e, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010f, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0112, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0040, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0107 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.za5 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "yes"
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            ua5 r2 = new ua5     // Catch:{ RuntimeException -> 0x0107 }
            r2.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            defpackage.cb5.a(r1, r2)     // Catch:{ RuntimeException -> 0x0107 }
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch:{ RuntimeException -> 0x0107 }
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x0107 }
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0107 }
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0107 }
            boolean r4 = r0.equals(r4)     // Catch:{ RuntimeException -> 0x0107 }
            if (r4 == 0) goto L_0x0043
            r0 = 29
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0107 }
            r4 = 30
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0107 }
            r5 = 31
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0107 }
            goto L_0x005f
        L_0x0040:
            r11 = move-exception
            goto L_0x010f
        L_0x0043:
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0107 }
            if (r0 == 0) goto L_0x005c
            r0 = 18
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0107 }
            r4 = 19
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0107 }
            r5 = 24
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0107 }
            goto L_0x005f
        L_0x005c:
            r0 = 0
            r4 = r0
            r5 = r4
        L_0x005f:
            java.util.HashMap[] r6 = r11.e
            r7 = 0
            if (r0 == 0) goto L_0x0075
            r8 = r6[r7]     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r9 = "ImageWidth"
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x0107 }
            java.nio.ByteOrder r10 = r11.g     // Catch:{ RuntimeException -> 0x0107 }
            wa5 r0 = defpackage.wa5.e(r0, r10)     // Catch:{ RuntimeException -> 0x0107 }
            r8.put(r9, r0)     // Catch:{ RuntimeException -> 0x0107 }
        L_0x0075:
            if (r4 == 0) goto L_0x0088
            r0 = r6[r7]     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r8 = "ImageLength"
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x0107 }
            java.nio.ByteOrder r9 = r11.g     // Catch:{ RuntimeException -> 0x0107 }
            wa5 r4 = defpackage.wa5.e(r4, r9)     // Catch:{ RuntimeException -> 0x0107 }
            r0.put(r8, r4)     // Catch:{ RuntimeException -> 0x0107 }
        L_0x0088:
            r0 = 6
            if (r5 == 0) goto L_0x00b0
            int r4 = java.lang.Integer.parseInt(r5)     // Catch:{ RuntimeException -> 0x0107 }
            r5 = 90
            if (r4 == r5) goto L_0x00a2
            r5 = 180(0xb4, float:2.52E-43)
            if (r4 == r5) goto L_0x00a0
            r5 = 270(0x10e, float:3.78E-43)
            if (r4 == r5) goto L_0x009d
            r4 = 1
            goto L_0x00a3
        L_0x009d:
            r4 = 8
            goto L_0x00a3
        L_0x00a0:
            r4 = 3
            goto L_0x00a3
        L_0x00a2:
            r4 = r0
        L_0x00a3:
            r5 = r6[r7]     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r6 = "Orientation"
            java.nio.ByteOrder r8 = r11.g     // Catch:{ RuntimeException -> 0x0107 }
            wa5 r4 = defpackage.wa5.e(r4, r8)     // Catch:{ RuntimeException -> 0x0107 }
            r5.put(r6, r4)     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00b0:
            if (r2 == 0) goto L_0x0103
            if (r3 == 0) goto L_0x0103
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ RuntimeException -> 0x0107 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x0107 }
            if (r3 <= r0) goto L_0x00fb
            long r4 = (long) r2     // Catch:{ RuntimeException -> 0x0107 }
            r12.b(r4)     // Catch:{ RuntimeException -> 0x0107 }
            byte[] r4 = new byte[r0]     // Catch:{ RuntimeException -> 0x0107 }
            int r5 = r12.read(r4)     // Catch:{ RuntimeException -> 0x0107 }
            if (r5 != r0) goto L_0x00f3
            int r2 = r2 + r0
            int r3 = r3 + -6
            byte[] r0 = c0     // Catch:{ RuntimeException -> 0x0107 }
            boolean r0 = java.util.Arrays.equals(r4, r0)     // Catch:{ RuntimeException -> 0x0107 }
            if (r0 == 0) goto L_0x00eb
            byte[] r0 = new byte[r3]     // Catch:{ RuntimeException -> 0x0107 }
            int r12 = r12.read(r0)     // Catch:{ RuntimeException -> 0x0107 }
            if (r12 != r3) goto L_0x00e3
            r11.o = r2     // Catch:{ RuntimeException -> 0x0107 }
            r11.x(r7, r0)     // Catch:{ RuntimeException -> 0x0107 }
            goto L_0x0103
        L_0x00e3:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r12 = "Can't read exif"
            r11.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            throw r11     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00eb:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r12 = "Invalid identifier"
            r11.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            throw r11     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00f3:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r12 = "Can't read identifier"
            r11.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            throw r11     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00fb:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r12 = "Invalid exif length"
            r11.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            throw r11     // Catch:{ RuntimeException -> 0x0107 }
        L_0x0103:
            r1.release()
            return
        L_0x0107:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0040 }
            java.lang.String r12 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r11.<init>(r12)     // Catch:{ all -> 0x0040 }
            throw r11     // Catch:{ all -> 0x0040 }
        L_0x010f:
            r1.release()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab5.g(za5):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0141 A[LOOP:0: B:8:0x0023->B:73:0x0141, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0148 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.va5 r23, int r24, int r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            boolean r3 = t
            if (r3 == 0) goto L_0x000d
            java.util.Objects.toString(r23)
        L_0x000d:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.b = r4
            byte r4 = r23.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r4 != r6) goto L_0x018b
            byte r7 = r23.readByte()
            r8 = -40
            if (r7 != r8) goto L_0x0173
            r4 = 2
        L_0x0023:
            byte r5 = r23.readByte()
            if (r5 != r6) goto L_0x0159
            byte r5 = r23.readByte()
            if (r3 == 0) goto L_0x0034
            r7 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer.toHexString(r7)
        L_0x0034:
            r7 = -39
            if (r5 == r7) goto L_0x0154
            r7 = -38
            if (r5 != r7) goto L_0x003e
            goto L_0x0154
        L_0x003e:
            int r7 = r23.readUnsignedShort()
            int r8 = r7 + -2
            r9 = 4
            int r4 = r4 + r9
            if (r3 == 0) goto L_0x004d
            r10 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer.toHexString(r10)
        L_0x004d:
            java.lang.String r10 = "Invalid length"
            if (r8 < 0) goto L_0x014e
            r11 = 0
            r12 = 1
            r13 = -31
            java.util.HashMap[] r14 = r0.e
            if (r5 == r13) goto L_0x00ca
            r13 = -2
            if (r5 == r13) goto L_0x009f
            switch(r5) {
                case -64: goto L_0x006a;
                case -63: goto L_0x006a;
                case -62: goto L_0x006a;
                case -61: goto L_0x006a;
                default: goto L_0x005f;
            }
        L_0x005f:
            switch(r5) {
                case -59: goto L_0x006a;
                case -58: goto L_0x006a;
                case -57: goto L_0x006a;
                default: goto L_0x0062;
            }
        L_0x0062:
            switch(r5) {
                case -55: goto L_0x006a;
                case -54: goto L_0x006a;
                case -53: goto L_0x006a;
                default: goto L_0x0065;
            }
        L_0x0065:
            switch(r5) {
                case -51: goto L_0x006a;
                case -50: goto L_0x006a;
                case -49: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x013f
        L_0x006a:
            r1.a(r12)
            r5 = r14[r2]
            if (r2 == r9) goto L_0x0074
            java.lang.String r8 = "ImageLength"
            goto L_0x0076
        L_0x0074:
            java.lang.String r8 = "ThumbnailImageLength"
        L_0x0076:
            int r11 = r23.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.g
            wa5 r11 = defpackage.wa5.b(r11, r13)
            r5.put(r8, r11)
            r5 = r14[r2]
            if (r2 == r9) goto L_0x008b
            java.lang.String r8 = "ImageWidth"
            goto L_0x008d
        L_0x008b:
            java.lang.String r8 = "ThumbnailImageWidth"
        L_0x008d:
            int r9 = r23.readUnsignedShort()
            long r11 = (long) r9
            java.nio.ByteOrder r9 = r0.g
            wa5 r9 = defpackage.wa5.b(r11, r9)
            r5.put(r8, r9)
            int r8 = r7 + -7
            goto L_0x013f
        L_0x009f:
            byte[] r5 = new byte[r8]
            int r7 = r1.read(r5)
            if (r7 != r8) goto L_0x00c2
            java.lang.String r7 = "UserComment"
            java.lang.String r8 = r0.d(r7)
            if (r8 != 0) goto L_0x00bf
            r8 = r14[r12]
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r12 = b0
            r9.<init>(r5, r12)
            wa5 r5 = defpackage.wa5.a(r9)
            r8.put(r7, r5)
        L_0x00bf:
            r8 = r11
            goto L_0x013f
        L_0x00c2:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Invalid exif"
            r0.<init>(r1)
            throw r0
        L_0x00ca:
            byte[] r5 = new byte[r8]
            r1.readFully(r5)
            int r7 = r4 + r8
            byte[] r9 = c0
            if (r9 != 0) goto L_0x00d6
            goto L_0x00e4
        L_0x00d6:
            int r13 = r9.length
            if (r8 >= r13) goto L_0x00da
            goto L_0x00e4
        L_0x00da:
            r13 = r11
        L_0x00db:
            int r15 = r9.length
            if (r13 >= r15) goto L_0x0127
            byte r15 = r5[r13]
            byte r6 = r9[r13]
            if (r15 == r6) goto L_0x0123
        L_0x00e4:
            byte[] r6 = d0
            if (r6 != 0) goto L_0x00e9
            goto L_0x013d
        L_0x00e9:
            int r9 = r6.length
            if (r8 >= r9) goto L_0x00ed
            goto L_0x013d
        L_0x00ed:
            r9 = r11
        L_0x00ee:
            int r13 = r6.length
            if (r9 >= r13) goto L_0x00fb
            byte r13 = r5[r9]
            byte r15 = r6[r9]
            if (r13 == r15) goto L_0x00f8
            goto L_0x013d
        L_0x00f8:
            int r9 = r9 + 1
            goto L_0x00ee
        L_0x00fb:
            int r9 = r6.length
            int r4 = r4 + r9
            int r6 = r6.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r6, r8)
            java.lang.String r6 = "Xmp"
            java.lang.String r8 = r0.d(r6)
            if (r8 != 0) goto L_0x013d
            r8 = r14[r11]
            wa5 r9 = new wa5
            int r13 = r5.length
            long r14 = (long) r4
            r20 = 1
            r16 = r9
            r17 = r14
            r19 = r5
            r21 = r13
            r16.<init>(r17, r19, r20, r21)
            r8.put(r6, r9)
            r0.s = r12
            goto L_0x013d
        L_0x0123:
            int r13 = r13 + 1
            r6 = -1
            goto L_0x00db
        L_0x0127:
            int r6 = r9.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r6, r8)
            int r4 = r24 + r4
            int r6 = r9.length
            int r4 = r4 + r6
            r0.o = r4
            r0.x(r2, r5)
            va5 r4 = new va5
            r4.<init>((byte[]) r5)
            r0.G(r4)
        L_0x013d:
            r4 = r7
            goto L_0x00bf
        L_0x013f:
            if (r8 < 0) goto L_0x0148
            r1.a(r8)
            int r4 = r4 + r8
            r6 = -1
            goto L_0x0023
        L_0x0148:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r10)
            throw r0
        L_0x014e:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r10)
            throw r0
        L_0x0154:
            java.nio.ByteOrder r0 = r0.g
            r1.b = r0
            return
        L_0x0159:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid marker:"
            r1.<init>(r2)
            r2 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0173:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r2 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x018b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r2 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab5.h(va5, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b6, code lost:
        if (r6 != null) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0126 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f2 A[SYNTHETIC, Splitter:B:86:0x00f2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(java.io.BufferedInputStream r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r1.mark(r2)
            byte[] r3 = new byte[r2]
            r1.read(r3)
            r18.reset()
            r1 = 0
            r4 = r1
        L_0x0013:
            byte[] r5 = y
            int r6 = r5.length
            r7 = 4
            if (r4 >= r6) goto L_0x0176
            byte r6 = r3[r4]
            byte r5 = r5[r4]
            if (r6 == r5) goto L_0x0172
            java.lang.String r4 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.defaultCharset()
            byte[] r4 = r4.getBytes(r5)
            r5 = r1
        L_0x002a:
            int r6 = r4.length
            if (r5 >= r6) goto L_0x016f
            byte r6 = r3[r5]
            byte r8 = r4[r5]
            if (r6 == r8) goto L_0x016b
            va5 r6 = new va5     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r6.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            int r8 = r6.readInt()     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            long r8 = (long) r8     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            byte[] r10 = new byte[r7]     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            r6.read(r10)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            byte[] r11 = z     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            boolean r10 = java.util.Arrays.equals(r10, r11)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            if (r10 != 0) goto L_0x004f
        L_0x004a:
            r6.close()
            goto L_0x00b9
        L_0x004f:
            r10 = 1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r13 = 8
            if (r12 != 0) goto L_0x0065
            long r8 = r6.readLong()     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            r15 = 16
            int r12 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r12 >= 0) goto L_0x0066
            goto L_0x004a
        L_0x0062:
            r0 = move-exception
            r5 = r6
            goto L_0x00b0
        L_0x0065:
            r15 = r13
        L_0x0066:
            long r4 = (long) r2     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x006c
            r8 = r4
        L_0x006c:
            long r8 = r8 - r15
            int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0072
            goto L_0x004a
        L_0x0072:
            byte[] r2 = new byte[r7]     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            r4 = 0
            r13 = r1
            r14 = r13
        L_0x0078:
            r15 = 4
            long r15 = r8 / r15
            int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r15 >= 0) goto L_0x004a
            int r15 = r6.read(r2)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            if (r15 == r7) goto L_0x0087
            goto L_0x004a
        L_0x0087:
            int r15 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r15 != 0) goto L_0x008c
            goto L_0x00a9
        L_0x008c:
            byte[] r15 = A     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            boolean r15 = java.util.Arrays.equals(r2, r15)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            if (r15 == 0) goto L_0x0096
            r13 = 1
            goto L_0x009f
        L_0x0096:
            byte[] r15 = B     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            boolean r15 = java.util.Arrays.equals(r2, r15)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            if (r15 == 0) goto L_0x009f
            r14 = 1
        L_0x009f:
            if (r13 == 0) goto L_0x00a9
            if (r14 == 0) goto L_0x00a9
            r6.close()
            r0 = 12
            return r0
        L_0x00a9:
            long r4 = r4 + r10
            goto L_0x0078
        L_0x00ab:
            r0 = move-exception
            r5 = 0
            goto L_0x00b0
        L_0x00ae:
            r6 = 0
            goto L_0x00b6
        L_0x00b0:
            if (r5 == 0) goto L_0x00b5
            r5.close()
        L_0x00b5:
            throw r0
        L_0x00b6:
            if (r6 == 0) goto L_0x00b9
            goto L_0x004a
        L_0x00b9:
            va5 r2 = new va5     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            java.nio.ByteOrder r4 = w(r2)     // Catch:{ Exception -> 0x00e8, all -> 0x00da }
            r0.g = r4     // Catch:{ Exception -> 0x00e8, all -> 0x00da }
            r2.b = r4     // Catch:{ Exception -> 0x00e8, all -> 0x00da }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x00e8, all -> 0x00da }
            r5 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r5) goto L_0x00d5
            r5 = 21330(0x5352, float:2.989E-41)
            if (r4 != r5) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r4 = r1
            goto L_0x00d6
        L_0x00d5:
            r4 = 1
        L_0x00d6:
            r2.close()
            goto L_0x00ee
        L_0x00da:
            r0 = move-exception
            r5 = r2
            goto L_0x00e2
        L_0x00dd:
            r0 = move-exception
            r5 = 0
            goto L_0x00e2
        L_0x00e0:
            r2 = 0
            goto L_0x00e8
        L_0x00e2:
            if (r5 == 0) goto L_0x00e7
            r5.close()
        L_0x00e7:
            throw r0
        L_0x00e8:
            if (r2 == 0) goto L_0x00ed
            r2.close()
        L_0x00ed:
            r4 = r1
        L_0x00ee:
            if (r4 == 0) goto L_0x00f2
            r0 = 7
            return r0
        L_0x00f2:
            va5 r2 = new va5     // Catch:{ Exception -> 0x0116, all -> 0x0113 }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x0116, all -> 0x0113 }
            java.nio.ByteOrder r4 = w(r2)     // Catch:{ Exception -> 0x0111, all -> 0x010e }
            r0.g = r4     // Catch:{ Exception -> 0x0111, all -> 0x010e }
            r2.b = r4     // Catch:{ Exception -> 0x0111, all -> 0x010e }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0111, all -> 0x010e }
            r4 = 85
            if (r0 != r4) goto L_0x0109
            r0 = 1
            goto L_0x010a
        L_0x0109:
            r0 = r1
        L_0x010a:
            r2.close()
            goto L_0x0124
        L_0x010e:
            r0 = move-exception
            r5 = r2
            goto L_0x0118
        L_0x0111:
            r5 = r2
            goto L_0x011e
        L_0x0113:
            r0 = move-exception
            r5 = 0
            goto L_0x0118
        L_0x0116:
            r5 = 0
            goto L_0x011e
        L_0x0118:
            if (r5 == 0) goto L_0x011d
            r5.close()
        L_0x011d:
            throw r0
        L_0x011e:
            if (r5 == 0) goto L_0x0123
            r5.close()
        L_0x0123:
            r0 = r1
        L_0x0124:
            if (r0 == 0) goto L_0x0129
            r0 = 10
            return r0
        L_0x0129:
            r0 = r1
        L_0x012a:
            byte[] r2 = E
            int r4 = r2.length
            if (r0 >= r4) goto L_0x013a
            byte r4 = r3[r0]
            byte r2 = r2[r0]
            if (r4 == r2) goto L_0x0137
            r0 = r1
            goto L_0x013b
        L_0x0137:
            int r0 = r0 + 1
            goto L_0x012a
        L_0x013a:
            r0 = 1
        L_0x013b:
            if (r0 == 0) goto L_0x0140
            r0 = 13
            return r0
        L_0x0140:
            r0 = r1
        L_0x0141:
            byte[] r2 = I
            int r4 = r2.length
            if (r0 >= r4) goto L_0x0151
            byte r4 = r3[r0]
            byte r2 = r2[r0]
            if (r4 == r2) goto L_0x014e
        L_0x014c:
            r4 = r1
            goto L_0x0165
        L_0x014e:
            int r0 = r0 + 1
            goto L_0x0141
        L_0x0151:
            r0 = r1
        L_0x0152:
            byte[] r4 = J
            int r5 = r4.length
            if (r0 >= r5) goto L_0x0164
            int r5 = r2.length
            int r5 = r5 + r0
            int r5 = r5 + r7
            byte r5 = r3[r5]
            byte r4 = r4[r0]
            if (r5 == r4) goto L_0x0161
            goto L_0x014c
        L_0x0161:
            int r0 = r0 + 1
            goto L_0x0152
        L_0x0164:
            r4 = 1
        L_0x0165:
            if (r4 == 0) goto L_0x016a
            r0 = 14
            return r0
        L_0x016a:
            return r1
        L_0x016b:
            int r5 = r5 + 1
            goto L_0x002a
        L_0x016f:
            r0 = 9
            return r0
        L_0x0172:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0176:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab5.i(java.io.BufferedInputStream):int");
    }

    public final void j(za5 za5) {
        int i2;
        int i3;
        m(za5);
        HashMap[] hashMapArr = this.e;
        wa5 wa5 = (wa5) hashMapArr[1].get("MakerNote");
        if (wa5 != null) {
            za5 za52 = new za5(wa5.d);
            za52.b = this.g;
            byte[] bArr = C;
            byte[] bArr2 = new byte[bArr.length];
            za52.readFully(bArr2);
            za52.b(0);
            byte[] bArr3 = D;
            byte[] bArr4 = new byte[bArr3.length];
            za52.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                za52.b(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                za52.b(12);
            }
            y(za52, 6);
            wa5 wa52 = (wa5) hashMapArr[7].get("PreviewImageStart");
            wa5 wa53 = (wa5) hashMapArr[7].get("PreviewImageLength");
            if (!(wa52 == null || wa53 == null)) {
                hashMapArr[5].put("JPEGInterchangeFormat", wa52);
                hashMapArr[5].put("JPEGInterchangeFormatLength", wa53);
            }
            wa5 wa54 = (wa5) hashMapArr[8].get("AspectFrame");
            if (wa54 != null) {
                int[] iArr = (int[]) wa54.j(this.g);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i4 = iArr[2];
                int i5 = iArr[0];
                if (i4 > i5 && (i2 = iArr[3]) > (i3 = iArr[1])) {
                    int i6 = (i4 - i5) + 1;
                    int i7 = (i2 - i3) + 1;
                    if (i6 < i7) {
                        int i8 = i6 + i7;
                        i7 = i8 - i7;
                        i6 = i8 - i7;
                    }
                    wa5 e2 = wa5.e(i6, this.g);
                    wa5 e3 = wa5.e(i7, this.g);
                    hashMapArr[0].put("ImageWidth", e2);
                    hashMapArr[0].put("ImageLength", e3);
                }
            }
        }
    }

    public final void k(va5 va5) {
        if (t) {
            Objects.toString(va5);
        }
        va5.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = E;
        va5.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = va5.readInt();
                byte[] bArr2 = new byte[4];
                if (va5.read(bArr2) == 4) {
                    int i2 = length + 8;
                    if (i2 == 16) {
                        if (!Arrays.equals(bArr2, G)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, H)) {
                        if (Arrays.equals(bArr2, F)) {
                            byte[] bArr3 = new byte[readInt];
                            if (va5.read(bArr3) == readInt) {
                                int readInt2 = va5.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.o = i2;
                                    x(0, bArr3);
                                    J();
                                    G(new va5(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + ld8.e(bArr2));
                        }
                        int i3 = readInt + 4;
                        va5.a(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void l(va5 va5) {
        if (t) {
            Objects.toString(va5);
        }
        va5.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        va5.read(bArr);
        va5.read(bArr2);
        va5.read(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        int i4 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i3];
        va5.a(i2 - va5.c);
        va5.read(bArr4);
        h(new va5(bArr4), i2, 5);
        va5.a(i4 - va5.c);
        va5.b = ByteOrder.BIG_ENDIAN;
        int readInt = va5.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            int readUnsignedShort = va5.readUnsignedShort();
            int readUnsignedShort2 = va5.readUnsignedShort();
            if (readUnsignedShort == U.a) {
                short readShort = va5.readShort();
                short readShort2 = va5.readShort();
                wa5 e2 = wa5.e(readShort, this.g);
                wa5 e3 = wa5.e(readShort2, this.g);
                HashMap[] hashMapArr = this.e;
                hashMapArr[0].put("ImageLength", e2);
                hashMapArr[0].put("ImageWidth", e3);
                return;
            }
            va5.a(readUnsignedShort2);
        }
    }

    public final void m(za5 za5) {
        u(za5);
        y(za5, 0);
        I(za5, 0);
        I(za5, 5);
        I(za5, 4);
        J();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.e;
            wa5 wa5 = (wa5) hashMapArr[1].get("MakerNote");
            if (wa5 != null) {
                za5 za52 = new za5(wa5.d);
                za52.b = this.g;
                za52.a(6);
                y(za52, 9);
                wa5 wa52 = (wa5) hashMapArr[9].get("ColorSpace");
                if (wa52 != null) {
                    hashMapArr[1].put("ColorSpace", wa52);
                }
            }
        }
    }

    public final void n(za5 za5) {
        if (t) {
            Objects.toString(za5);
        }
        m(za5);
        HashMap[] hashMapArr = this.e;
        wa5 wa5 = (wa5) hashMapArr[0].get("JpgFromRaw");
        if (wa5 != null) {
            h(new va5(wa5.d), (int) wa5.c, 5);
        }
        wa5 wa52 = (wa5) hashMapArr[0].get("ISO");
        wa5 wa53 = (wa5) hashMapArr[1].get("PhotographicSensitivity");
        if (wa52 != null && wa53 == null) {
            hashMapArr[1].put("PhotographicSensitivity", wa52);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063 A[SYNTHETIC, Splitter:B:37:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0082 A[Catch:{ Exception -> 0x0097, all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0093 A[SYNTHETIC, Splitter:B:59:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x009c A[SYNTHETIC, Splitter:B:66:0x009c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] o() {
        /*
            r8 = this;
            boolean r0 = r8.h
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            byte[] r0 = r8.m
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.res.AssetManager$AssetInputStream r0 = r8.c     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            if (r0 == 0) goto L_0x0026
            boolean r2 = r0.markSupported()     // Catch:{ Exception -> 0x001f, all -> 0x001a }
            if (r2 == 0) goto L_0x0022
            r0.reset()     // Catch:{ Exception -> 0x001f, all -> 0x001a }
        L_0x0018:
            r2 = r1
            goto L_0x004d
        L_0x001a:
            r8 = move-exception
            r2 = r1
        L_0x001c:
            r1 = r0
            goto L_0x008e
        L_0x001f:
            r2 = r1
            goto L_0x0097
        L_0x0022:
            defpackage.ld8.l(r0)
            return r1
        L_0x0026:
            java.lang.String r0 = r8.a     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            if (r0 == 0) goto L_0x0038
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            java.lang.String r2 = r8.a     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            goto L_0x0018
        L_0x0032:
            r8 = move-exception
            r2 = r1
            goto L_0x008e
        L_0x0035:
            r0 = r1
            r2 = r0
            goto L_0x0097
        L_0x0038:
            java.io.FileDescriptor r0 = r8.b     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            java.io.FileDescriptor r0 = defpackage.bb5.b(r0)     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            int r2 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r3 = 0
            defpackage.bb5.c(r0, r3, r2)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r7 = r2
            r2 = r0
            r0 = r7
        L_0x004d:
            int r3 = r8.k     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r4 = r8.o     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r3 = r3 + r4
            long r3 = (long) r3     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            long r3 = r0.skip(r3)     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r5 = r8.k     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r6 = r8.o     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r5 = r5 + r6
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r4 = "Corrupted image"
            if (r3 != 0) goto L_0x0082
            int r3 = r8.l     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r5 = r0.read(r3)     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r6 = r8.l     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            if (r5 != r6) goto L_0x007c
            r8.m = r3     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            defpackage.ld8.l(r0)
            if (r2 == 0) goto L_0x0079
            defpackage.bb5.a(r2)     // Catch:{ Exception -> 0x0079 }
        L_0x0079:
            return r3
        L_0x007a:
            r8 = move-exception
            goto L_0x001c
        L_0x007c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            r8.<init>(r4)     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            throw r8     // Catch:{ Exception -> 0x0097, all -> 0x007a }
        L_0x0082:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            r8.<init>(r4)     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            throw r8     // Catch:{ Exception -> 0x0097, all -> 0x007a }
        L_0x0088:
            r8 = move-exception
            r2 = r0
            goto L_0x008e
        L_0x008b:
            r2 = r0
            r0 = r1
            goto L_0x0097
        L_0x008e:
            defpackage.ld8.l(r1)
            if (r2 == 0) goto L_0x0096
            defpackage.bb5.a(r2)     // Catch:{ Exception -> 0x0096 }
        L_0x0096:
            throw r8
        L_0x0097:
            defpackage.ld8.l(r0)
            if (r2 == 0) goto L_0x009f
            defpackage.bb5.a(r2)     // Catch:{ Exception -> 0x009f }
        L_0x009f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab5.o():byte[]");
    }

    public final void p(va5 va5) {
        if (t) {
            Objects.toString(va5);
        }
        va5.b = ByteOrder.LITTLE_ENDIAN;
        va5.a(I.length);
        int readInt = va5.readInt() + 8;
        byte[] bArr = J;
        va5.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (va5.read(bArr2) == 4) {
                    int readInt2 = va5.readInt();
                    int i2 = length + 8;
                    if (Arrays.equals(K, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (va5.read(bArr3) == readInt2) {
                            this.o = i2;
                            x(0, bArr3);
                            G(new va5(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ld8.e(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i2 + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            va5.a(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void r(va5 va5, HashMap hashMap) {
        wa5 wa5 = (wa5) hashMap.get("JPEGInterchangeFormat");
        wa5 wa52 = (wa5) hashMap.get("JPEGInterchangeFormatLength");
        if (wa5 != null && wa52 != null) {
            int h2 = wa5.h(this.g);
            int h3 = wa52.h(this.g);
            if (this.d == 7) {
                h2 += this.p;
            }
            if (h2 > 0 && h3 > 0) {
                this.h = true;
                if (this.a == null && this.c == null && this.b == null) {
                    byte[] bArr = new byte[h3];
                    va5.skip((long) h2);
                    va5.read(bArr);
                    this.m = bArr;
                }
                this.k = h2;
                this.l = h3;
            }
        }
    }

    public final boolean s(HashMap hashMap) {
        wa5 wa5 = (wa5) hashMap.get("ImageLength");
        wa5 wa52 = (wa5) hashMap.get("ImageWidth");
        if (wa5 == null || wa52 == null) {
            return false;
        }
        return wa5.h(this.g) <= 512 && wa52.h(this.g) <= 512;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = t
            r1 = 0
            r2 = r1
        L_0x0004:
            xa5[][] r3 = V     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r3 = r3.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            if (r2 >= r3) goto L_0x0018
            java.util.HashMap[] r3 = r7.e     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r4.<init>()     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r3[r2] = r4     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0015:
            r8 = move-exception
            goto L_0x0087
        L_0x0018:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r8 = r7.i(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r7.d = r8     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L_0x0060
            if (r8 == r5) goto L_0x0060
            if (r8 == r4) goto L_0x0060
            if (r8 != r3) goto L_0x0035
            goto L_0x0060
        L_0x0035:
            za5 r8 = new za5     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r8.<init>((java.io.InputStream) r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r1 = r7.d     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r2 = 12
            if (r1 != r2) goto L_0x0044
            r7.g(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x0056
        L_0x0044:
            r2 = 7
            if (r1 != r2) goto L_0x004b
            r7.j(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x0056
        L_0x004b:
            r2 = 10
            if (r1 != r2) goto L_0x0053
            r7.n(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x0056
        L_0x0053:
            r7.m(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
        L_0x0056:
            int r1 = r7.o     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            long r1 = (long) r1     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r8.b(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r7.G(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x007e
        L_0x0060:
            va5 r8 = new va5     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r8.<init>((java.io.InputStream) r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r2 = r7.d     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            if (r2 != r6) goto L_0x006d
            r7.h(r8, r1, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x007e
        L_0x006d:
            if (r2 != r4) goto L_0x0073
            r7.k(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x007e
        L_0x0073:
            if (r2 != r5) goto L_0x0079
            r7.l(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x007e
        L_0x0079:
            if (r2 != r3) goto L_0x007e
            r7.p(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
        L_0x007e:
            r7.a()
            if (r0 == 0) goto L_0x0096
        L_0x0083:
            r7.v()
            goto L_0x0096
        L_0x0087:
            r7.a()
            if (r0 == 0) goto L_0x008f
            r7.v()
        L_0x008f:
            throw r8
        L_0x0090:
            r7.a()
            if (r0 == 0) goto L_0x0096
            goto L_0x0083
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab5.t(java.io.InputStream):void");
    }

    public final void u(va5 va5) {
        ByteOrder w2 = w(va5);
        this.g = w2;
        va5.b = w2;
        int readUnsignedShort = va5.readUnsignedShort();
        int i2 = this.d;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = va5.readInt();
            if (readInt >= 8) {
                int i3 = readInt - 8;
                if (i3 > 0) {
                    va5.a(i3);
                    return;
                }
                return;
            }
            throw new IOException(wj6.h(readInt, "Invalid first Ifd offset: "));
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    public final void v() {
        int i2 = 0;
        while (true) {
            HashMap[] hashMapArr = this.e;
            if (i2 < hashMapArr.length) {
                hashMapArr[i2].size();
                for (Map.Entry entry : hashMapArr[i2].entrySet()) {
                    wa5 wa5 = (wa5) entry.getValue();
                    String str = (String) entry.getKey();
                    wa5.toString();
                    wa5.i(this.g);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void x(int i2, byte[] bArr) {
        za5 za5 = new za5(bArr);
        u(za5);
        y(za5, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(defpackage.za5 r27, int r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            int r3 = r1.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.HashSet r4 = r0.f
            r4.add(r3)
            short r3 = r27.readShort()
            if (r3 > 0) goto L_0x0018
            return
        L_0x0018:
            r6 = 0
        L_0x0019:
            boolean r7 = t
            java.util.HashMap[] r10 = r0.e
            if (r6 >= r3) goto L_0x0235
            int r12 = r27.readUnsignedShort()
            int r13 = r27.readUnsignedShort()
            int r15 = r27.readInt()
            int r14 = r1.c
            r20 = r6
            long r5 = (long) r14
            r16 = 4
            long r5 = r5 + r16
            java.util.HashMap[] r14 = X
            r14 = r14[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            java.lang.Object r8 = r14.get(r8)
            xa5 r8 = (defpackage.xa5) r8
            if (r7 == 0) goto L_0x0069
            java.lang.Integer r9 = java.lang.Integer.valueOf(r28)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            if (r8 == 0) goto L_0x0053
            java.lang.String r11 = r8.b
        L_0x0050:
            r21 = r3
            goto L_0x0055
        L_0x0053:
            r11 = 0
            goto L_0x0050
        L_0x0055:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r22 = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r14, r11, r3, r4}
            java.lang.String r4 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String.format(r4, r3)
            goto L_0x006d
        L_0x0069:
            r21 = r3
            r22 = r4
        L_0x006d:
            r9 = 3
            r11 = 7
            if (r8 != 0) goto L_0x0075
        L_0x0071:
            r23 = r10
            goto L_0x00cf
        L_0x0075:
            if (r13 <= 0) goto L_0x0071
            int[] r14 = S
            int r4 = r14.length
            if (r13 < r4) goto L_0x007d
            goto L_0x0071
        L_0x007d:
            int r4 = r8.c
            if (r4 == r11) goto L_0x0096
            if (r13 != r11) goto L_0x0084
            goto L_0x0096
        L_0x0084:
            if (r4 == r13) goto L_0x0096
            int r11 = r8.d
            if (r11 != r13) goto L_0x008b
            goto L_0x0096
        L_0x008b:
            r3 = 4
            if (r4 == r3) goto L_0x0094
            if (r11 != r3) goto L_0x0091
            goto L_0x0094
        L_0x0091:
            r3 = 9
            goto L_0x0098
        L_0x0094:
            if (r13 != r9) goto L_0x0091
        L_0x0096:
            r3 = 7
            goto L_0x00b3
        L_0x0098:
            if (r4 == r3) goto L_0x009c
            if (r11 != r3) goto L_0x00a1
        L_0x009c:
            r3 = 8
            if (r13 != r3) goto L_0x00a1
            goto L_0x0096
        L_0x00a1:
            r3 = 12
            if (r4 == r3) goto L_0x00a7
            if (r11 != r3) goto L_0x00ac
        L_0x00a7:
            r3 = 11
            if (r13 != r3) goto L_0x00ac
            goto L_0x0096
        L_0x00ac:
            if (r7 == 0) goto L_0x0071
            java.lang.String[] r3 = R
            r3 = r3[r13]
            goto L_0x0071
        L_0x00b3:
            if (r13 != r3) goto L_0x00b6
            r13 = r4
        L_0x00b6:
            long r3 = (long) r15
            r11 = r14[r13]
            r23 = r10
            long r9 = (long) r11
            long r3 = r3 * r9
            r9 = 0
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00cd
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r9 = 1
            goto L_0x00d2
        L_0x00cd:
            r9 = 0
            goto L_0x00d2
        L_0x00cf:
            r3 = 0
            goto L_0x00cd
        L_0x00d2:
            if (r9 != 0) goto L_0x00db
            r1.b(r5)
            r9 = r22
            goto L_0x022b
        L_0x00db:
            int r9 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            java.lang.String r10 = "Compression"
            if (r9 <= 0) goto L_0x0142
            int r9 = r27.readInt()
            int r11 = r0.d
            r14 = 7
            if (r11 != r14) goto L_0x00f6
            java.lang.String r11 = r8.b
            java.lang.String r14 = "MakerNote"
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x00fb
            r0.p = r9
        L_0x00f6:
            r24 = r3
            r16 = r15
            goto L_0x013d
        L_0x00fb:
            r11 = 6
            if (r2 != r11) goto L_0x00f6
            java.lang.String r14 = "ThumbnailImage"
            java.lang.String r11 = r8.b
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x00f6
            r0.q = r9
            r0.r = r15
            java.nio.ByteOrder r11 = r0.g
            r14 = 6
            wa5 r11 = defpackage.wa5.e(r14, r11)
            int r14 = r0.q
            r16 = r15
            long r14 = (long) r14
            java.nio.ByteOrder r2 = r0.g
            wa5 r2 = defpackage.wa5.b(r14, r2)
            int r14 = r0.r
            long r14 = (long) r14
            r24 = r3
            java.nio.ByteOrder r3 = r0.g
            wa5 r3 = defpackage.wa5.b(r14, r3)
            r4 = 4
            r14 = r23[r4]
            r14.put(r10, r11)
            r11 = r23[r4]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r11.put(r14, r2)
            r2 = r23[r4]
            java.lang.String r4 = "JPEGInterchangeFormatLength"
            r2.put(r4, r3)
        L_0x013d:
            long r2 = (long) r9
            r1.b(r2)
            goto L_0x0146
        L_0x0142:
            r24 = r3
            r16 = r15
        L_0x0146:
            java.util.HashMap r2 = a0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x01bb
            r3 = 3
            if (r13 == r3) goto L_0x0180
            r3 = 4
            if (r13 == r3) goto L_0x0174
            r3 = 8
            if (r13 == r3) goto L_0x016f
            r3 = 9
            if (r13 == r3) goto L_0x0169
            r3 = 13
            if (r13 == r3) goto L_0x0169
            r3 = -1
            goto L_0x0185
        L_0x0169:
            int r3 = r27.readInt()
        L_0x016d:
            long r3 = (long) r3
            goto L_0x0185
        L_0x016f:
            short r3 = r27.readShort()
            goto L_0x016d
        L_0x0174:
            int r3 = r27.readInt()
            long r3 = (long) r3
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r9
            goto L_0x0185
        L_0x0180:
            int r3 = r27.readUnsignedShort()
            goto L_0x016d
        L_0x0185:
            if (r7 == 0) goto L_0x0196
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.String r8 = r8.b
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}
            java.lang.String r8 = "Offset: %d, tagName: %s"
            java.lang.String.format(r8, r7)
        L_0x0196:
            r7 = 0
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x01b4
            int r7 = (int) r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = r22
            boolean r7 = r9.contains(r7)
            if (r7 != 0) goto L_0x01b6
            r1.b(r3)
            int r2 = r2.intValue()
            r0.y(r1, r2)
            goto L_0x01b6
        L_0x01b4:
            r9 = r22
        L_0x01b6:
            r1.b(r5)
            goto L_0x022b
        L_0x01bb:
            r9 = r22
            int r2 = r1.c
            int r3 = r0.o
            int r2 = r2 + r3
            r3 = r24
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            wa5 r4 = new wa5
            long r11 = (long) r2
            r14 = r4
            r2 = r16
            r15 = r11
            r17 = r3
            r18 = r13
            r19 = r2
            r14.<init>(r15, r17, r18, r19)
            r2 = r23[r28]
            java.lang.String r3 = r8.b
            r2.put(r3, r4)
            java.lang.String r2 = "DNGVersion"
            java.lang.String r3 = r8.b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ee
            r2 = 3
            r0.d = r2
        L_0x01ee:
            java.lang.String r2 = "Make"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01fe
            java.lang.String r2 = "Model"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x020c
        L_0x01fe:
            java.nio.ByteOrder r2 = r0.g
            java.lang.String r2 = r4.i(r2)
            java.lang.String r7 = "PENTAX"
            boolean r2 = r2.contains(r7)
            if (r2 != 0) goto L_0x021d
        L_0x020c:
            boolean r2 = r10.equals(r3)
            if (r2 == 0) goto L_0x0221
            java.nio.ByteOrder r2 = r0.g
            int r2 = r4.h(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x0221
        L_0x021d:
            r2 = 8
            r0.d = r2
        L_0x0221:
            int r2 = r1.c
            long r2 = (long) r2
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x022b
            r1.b(r5)
        L_0x022b:
            int r6 = r20 + 1
            short r6 = (short) r6
            r2 = r28
            r4 = r9
            r3 = r21
            goto L_0x0019
        L_0x0235:
            r9 = r4
            r23 = r10
            int r2 = r27.readInt()
            if (r7 == 0) goto L_0x024b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "nextIfdOffset: %d"
            java.lang.String.format(r4, r3)
        L_0x024b:
            long r3 = (long) r2
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0278
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r9.contains(r2)
            if (r2 != 0) goto L_0x0278
            r1.b(r3)
            r2 = 4
            r3 = r23[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x026c
            r0.y(r1, r2)
            goto L_0x0278
        L_0x026c:
            r2 = 5
            r3 = r23[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0278
            r0.y(r1, r2)
        L_0x0278:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab5.y(za5, int):void");
    }

    public final void z(String str) {
        for (int i2 = 0; i2 < V.length; i2++) {
            this.e[i2].remove(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0052 A[SYNTHETIC, Splitter:B:28:0x0052] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ab5(java.io.FileDescriptor r5) {
        /*
            r4 = this;
            r4.<init>()
            xa5[][] r0 = V
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r4.e = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r4.f = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r4.g = r0
            if (r5 == 0) goto L_0x0056
            r0 = 0
            r4.c = r0
            r4.a = r0
            int r1 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x0035 }
            r2 = 0
            defpackage.bb5.c(r5, r2, r1)     // Catch:{ Exception -> 0x0035 }
            r4.b = r5
            java.io.FileDescriptor r5 = defpackage.bb5.b(r5)     // Catch:{ Exception -> 0x002c }
            r1 = 1
            goto L_0x0038
        L_0x002c:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Failed to duplicate file descriptor"
            r5.<init>(r0, r4)
            throw r5
        L_0x0035:
            r4.b = r0
            r1 = 0
        L_0x0038:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004c }
            r2.<init>(r5)     // Catch:{ all -> 0x004c }
            r4.t(r2)     // Catch:{ all -> 0x0049 }
            defpackage.ld8.l(r2)
            if (r1 == 0) goto L_0x0048
            defpackage.bb5.a(r5)     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            return
        L_0x0049:
            r4 = move-exception
            r0 = r2
            goto L_0x004d
        L_0x004c:
            r4 = move-exception
        L_0x004d:
            defpackage.ld8.l(r0)
            if (r1 == 0) goto L_0x0055
            defpackage.bb5.a(r5)     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            throw r4
        L_0x0056:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "fileDescriptor cannot be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab5.<init>(java.io.FileDescriptor):void");
    }

    public ab5(InputStream inputStream) {
        xa5[][] xa5Arr = V;
        this.e = new HashMap[xa5Arr.length];
        this.f = new HashSet(xa5Arr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        this.a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    bb5.c(fileInputStream.getFD(), 0, OsConstants.SEEK_CUR);
                    this.c = null;
                    this.b = fileInputStream.getFD();
                } catch (Exception unused) {
                }
            }
            this.c = null;
            this.b = null;
        }
        t(inputStream);
    }
}
