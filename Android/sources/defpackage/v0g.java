package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.uuid.Uuid;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import org.webrtc.MediaStreamTrack;
import ru.ok.tamtam.nano.Protos;

/* renamed from: v0g  reason: default package */
public abstract class v0g {
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f = new byte[0];
    public static final long[] g = new long[0];
    public static final Pattern h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    public static final Pattern i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    public static final Pattern j = Pattern.compile("%([A-Fa-f0-9]{2})");
    public static final Pattern k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
    public static HashMap l;
    public static final String[] m = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
    public static final String[] n = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
    public static final int[] o = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    public static final int[] p = {0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
    public static final int[] q = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, HttpStatus.SC_SWITCHING_PROTOCOLS, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, HttpStatus.SC_ACCEPTED, HttpStatus.SC_RESET_CONTENT, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, HttpStatus.SC_CREATED, HttpStatus.SC_PARTIAL_CONTENT, 219, 220, 213, 210, KotlinVersion.MAX_COMPONENT_VALUE, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, HttpStatus.SC_PROCESSING, 115, 116, 125, 122, 137, 142, 135, Uuid.SIZE_BITS, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, HttpStatus.SC_MULTI_STATUS, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2;
        String str = Build.DEVICE;
        b = str;
        String str2 = Build.MANUFACTURER;
        c = str2;
        String str3 = Build.MODEL;
        d = str3;
        e = str + ", " + str3 + ", " + str2 + ", " + i2;
    }

    public static long A(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(((double) j2) * ((double) f2));
    }

    public static long B(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime();
    }

    public static int C(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static int D(int i2, int i3) {
        if (i2 != 2) {
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i3 * 3;
            }
            return i3 * 4;
        }
        return i3 * 2;
    }

    public static long E(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(((double) j2) / ((double) f2));
    }

    public static String[] F() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i2 = a;
        if (i2 >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArr = new String[]{i2 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            strArr[i3] = T(strArr[i3]);
        }
        return strArr;
    }

    public static String G(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e2) {
            i8b.p("Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String H(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
            case 2:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i2 >= 10000 ? a81.j(i2, "custom (", ")") : "?";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean I(defpackage.vob r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.getPlaybackState()
            r2 = 1
            if (r1 != r2) goto L_0x0017
            r3 = 2
            boolean r3 = r4.J0(r3)
            if (r3 == 0) goto L_0x0017
            r4.prepare()
        L_0x0015:
            r0 = r2
            goto L_0x0024
        L_0x0017:
            r3 = 4
            if (r1 != r3) goto L_0x0024
            boolean r1 = r4.J0(r3)
            if (r1 == 0) goto L_0x0024
            r4.A()
            goto L_0x0015
        L_0x0024:
            boolean r1 = r4.J0(r2)
            if (r1 == 0) goto L_0x002e
            r4.play()
            goto L_0x002f
        L_0x002e:
            r2 = r0
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v0g.I(vob):boolean");
    }

    public static int J(Uri uri, String str) {
        int i2;
        char c2 = 65535;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme != null && o54.l("rtsp", scheme)) {
                return 3;
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int lastIndexOf = lastPathSegment.lastIndexOf(46);
                if (lastIndexOf >= 0) {
                    String P = o54.P(lastPathSegment.substring(lastIndexOf + 1));
                    P.getClass();
                    switch (P.hashCode()) {
                        case 104579:
                            if (P.equals("ism")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 108321:
                            if (P.equals("mpd")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 3242057:
                            if (P.equals("isml")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 3299913:
                            if (P.equals("m3u8")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 2:
                            i2 = 1;
                            break;
                        case 1:
                            i2 = 0;
                            break;
                        case 3:
                            i2 = 2;
                            break;
                        default:
                            i2 = 4;
                            break;
                    }
                    if (i2 != 4) {
                        return i2;
                    }
                }
                String path = uri.getPath();
                path.getClass();
                Matcher matcher = k.matcher(path);
                if (matcher.matches()) {
                    String group = matcher.group(2);
                    if (group == null) {
                        return 1;
                    }
                    if (group.contains("format=mpd-time-csf")) {
                        return 0;
                    }
                    return group.contains("format=m3u8-aapl") ? 2 : 1;
                }
            }
            return 4;
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c2 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c2 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public static boolean K(String str) {
        str.getClass();
        int i2 = a;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1487656890:
                if (str.equals("image/avif")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1487464693:
                if (str.equals("image/heic")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1487464690:
                if (str.equals("image/heif")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1487394660:
                if (str.equals("image/jpeg")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1487018032:
                if (str.equals("image/webp")) {
                    c2 = 4;
                    break;
                }
                break;
            case -879272239:
                if (str.equals("image/bmp")) {
                    c2 = 5;
                    break;
                }
                break;
            case -879258763:
                if (str.equals("image/png")) {
                    c2 = 6;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return i2 >= 34;
            case 1:
            case 2:
                return i2 >= 26;
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public static boolean L(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4;
    }

    public static boolean M(Context context) {
        int i2 = a;
        if (i2 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i2 == 30) {
                String str = d;
                if (o54.l(str, "moto g(20)") || o54.l(str, "rmx3231")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean N(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean O() {
        String P = o54.P(b);
        return P.contains("emulator") || P.contains("emu64a") || P.contains("emu64x") || P.contains("generic");
    }

    public static boolean P(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static String Q(Context context, String str) {
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            return q(uw0.b(inputStream));
        } finally {
            h(inputStream);
        }
    }

    public static void R(List list, int i2, int i3, int i4) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
            arrayDeque.addFirst(list.remove(i2 + i5));
        }
        list.addAll(Math.min(i4, list.size()), arrayDeque);
    }

    public static long S(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static String T(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String P = o54.P(str);
        int i2 = 0;
        String str2 = P.split("-", 2)[0];
        if (l == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = m;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                hashMap.put(strArr[i3], strArr[i3 + 1]);
            }
            l = hashMap;
        }
        String str4 = (String) l.get(str2);
        if (str4 != null) {
            StringBuilder o2 = tr1.o(str4);
            o2.append(P.substring(str2.length()));
            P = o2.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return P;
        }
        while (true) {
            String[] strArr2 = n;
            if (i2 >= strArr2.length) {
                return P;
            }
            if (P.startsWith(strArr2[i2])) {
                return strArr2[i2 + 1] + P.substring(strArr2[i2].length());
            }
            i2 += 2;
        }
    }

    public static Object[] U(int i2, Object[] objArr) {
        n79.g(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static long V(String str) {
        Matcher matcher = h.matcher(str);
        if (matcher.matches()) {
            int i2 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i2 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                if ("-".equals(matcher.group(11))) {
                    i2 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i2 != 0 ? timeInMillis - (((long) i2) * 60000) : timeInMillis;
        }
        throw ParserException.a("Invalid date/time format: " + str, (RuntimeException) null);
    }

    public static void W(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void X(List list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        } else if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    public static long Y(int i2, long j2) {
        return a0(j2, 1000000, (long) i2, RoundingMode.FLOOR);
    }

    public static void Z(long[] jArr, long j2) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i2 = (j2 > 1000000 ? 1 : (j2 == 1000000 ? 0 : -1));
        int i3 = 0;
        if (i2 >= 0 && j2 % 1000000 == 0) {
            long k2 = hi7.k(j2, 1000000, RoundingMode.UNNECESSARY);
            while (i3 < jArr.length) {
                jArr[i3] = hi7.k(jArr[i3], k2, roundingMode);
                i3++;
            }
        } else if (i2 >= 0 || 1000000 % j2 != 0) {
            for (int i4 = 0; i4 < jArr.length; i4++) {
                long j3 = jArr[i4];
                if (j3 != 0) {
                    int i5 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                    if (i5 >= 0 && j2 % j3 == 0) {
                        jArr[i4] = hi7.k(1000000, hi7.k(j2, j3, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (i5 >= 0 || j3 % j2 != 0) {
                        jArr[i4] = b0(j3, 1000000, j2, roundingMode);
                    } else {
                        jArr[i4] = hi7.X(1000000, hi7.k(j3, j2, RoundingMode.UNNECESSARY));
                    }
                }
            }
        } else {
            long k3 = hi7.k(1000000, j2, RoundingMode.UNNECESSARY);
            while (i3 < jArr.length) {
                jArr[i3] = hi7.X(jArr[i3], k3);
                i3++;
            }
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static long a0(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0;
        }
        int i2 = (j4 > j3 ? 1 : (j4 == j3 ? 0 : -1));
        if (i2 >= 0 && j4 % j3 == 0) {
            return hi7.k(j2, hi7.k(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i2 < 0 && j3 % j4 == 0) {
            return hi7.X(j2, hi7.k(j3, j4, RoundingMode.UNNECESSARY));
        }
        int i3 = (j4 > j2 ? 1 : (j4 == j2 ? 0 : -1));
        return (i3 < 0 || j4 % j2 != 0) ? (i3 >= 0 || j2 % j4 != 0) ? b0(j2, j3, j4, roundingMode) : hi7.X(j3, hi7.k(j2, j4, RoundingMode.UNNECESSARY)) : hi7.k(j3, hi7.k(j4, j2, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(long[] r4, long r5, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0008
            int r4 = ~r0
            goto L_0x001a
        L_0x0008:
            int r1 = r0 + 1
            int r2 = r4.length
            if (r1 >= r2) goto L_0x0015
            r2 = r4[r1]
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0015
            r0 = r1
            goto L_0x0008
        L_0x0015:
            if (r7 == 0) goto L_0x0019
            r4 = r0
            goto L_0x001a
        L_0x0019:
            r4 = r1
        L_0x001a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v0g.b(long[], long, boolean):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0094, code lost:
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d1, code lost:
        r2 = (double) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ee, code lost:
        if ((-9.223372036854776E18d - r2) >= 1.0d) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f2, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f5, code lost:
        if (r2 >= 9.223372036854776E18d) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f8, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fb, code lost:
        if ((r13 & r1) == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fe, code lost:
        return (long) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011a, code lost:
        throw new java.lang.ArithmeticException("rounded value is out of range for input " + r9 + " and rounding mode " + r15);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long b0(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            long r0 = defpackage.hi7.X(r9, r11)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = -9223372036854775808
            if (r4 == 0) goto L_0x0018
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0018
            long r9 = defpackage.hi7.k(r0, r13, r15)
            return r9
        L_0x0018:
            long r0 = java.lang.Math.abs(r11)
            long r7 = java.lang.Math.abs(r13)
            long r0 = defpackage.hi7.r(r0, r7)
            java.math.RoundingMode r4 = java.math.RoundingMode.UNNECESSARY
            long r11 = defpackage.hi7.k(r11, r0, r4)
            long r13 = defpackage.hi7.k(r13, r0, r4)
            long r0 = java.lang.Math.abs(r9)
            long r7 = java.lang.Math.abs(r13)
            long r0 = defpackage.hi7.r(r0, r7)
            long r9 = defpackage.hi7.k(r9, r0, r4)
            long r13 = defpackage.hi7.k(r13, r0, r4)
            long r0 = defpackage.hi7.X(r9, r11)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0053
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0053
            long r9 = defpackage.hi7.k(r0, r13, r15)
            return r9
        L_0x0053:
            double r11 = (double) r11
            double r13 = (double) r13
            double r11 = r11 / r13
            double r9 = (double) r9
            double r9 = r9 * r11
            r11 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x005f
            return r2
        L_0x005f:
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0066
            return r5
        L_0x0066:
            int r0 = defpackage.ir4.a
            int r0 = java.lang.Math.getExponent(r9)
            r1 = 1023(0x3ff, float:1.434E-42)
            if (r0 > r1) goto L_0x0123
            int[] r0 = defpackage.hr4.a
            int r1 = r15.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 1
            r4 = 0
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            switch(r0) {
                case 1: goto L_0x00e1;
                case 2: goto L_0x00d3;
                case 3: goto L_0x00c4;
                case 4: goto L_0x0096;
                case 5: goto L_0x00b1;
                case 6: goto L_0x00ac;
                case 7: goto L_0x0098;
                case 8: goto L_0x0088;
                default: goto L_0x0082;
            }
        L_0x0082:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x0088:
            double r2 = java.lang.Math.rint(r9)
            double r4 = r9 - r2
            double r4 = java.lang.Math.abs(r4)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00e8
        L_0x0096:
            r2 = r9
            goto L_0x00e8
        L_0x0098:
            double r2 = java.lang.Math.rint(r9)
            double r4 = r9 - r2
            double r4 = java.lang.Math.abs(r4)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00e8
            double r2 = java.lang.Math.copySign(r6, r9)
            double r2 = r2 + r9
            goto L_0x00e8
        L_0x00ac:
            double r2 = java.lang.Math.rint(r9)
            goto L_0x00e8
        L_0x00b1:
            boolean r0 = defpackage.ir4.a(r9)
            if (r0 == 0) goto L_0x00b8
            goto L_0x0096
        L_0x00b8:
            long r2 = (long) r9
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bf
            r0 = r1
            goto L_0x00c0
        L_0x00bf:
            r0 = -1
        L_0x00c0:
            long r4 = (long) r0
            long r2 = r2 + r4
            double r2 = (double) r2
            goto L_0x00e8
        L_0x00c4:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0096
            boolean r0 = defpackage.ir4.a(r9)
            if (r0 == 0) goto L_0x00cf
            goto L_0x0096
        L_0x00cf:
            long r4 = (long) r9
            long r4 = r4 + r2
        L_0x00d1:
            double r2 = (double) r4
            goto L_0x00e8
        L_0x00d3:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            boolean r0 = defpackage.ir4.a(r9)
            if (r0 == 0) goto L_0x00de
            goto L_0x0096
        L_0x00de:
            long r4 = (long) r9
            long r4 = r4 - r2
            goto L_0x00d1
        L_0x00e1:
            boolean r0 = defpackage.ir4.a(r9)
            if (r0 == 0) goto L_0x011b
            goto L_0x0096
        L_0x00e8:
            double r13 = r13 - r2
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            r14 = 0
            if (r13 >= 0) goto L_0x00f2
            r13 = r1
            goto L_0x00f3
        L_0x00f2:
            r13 = r14
        L_0x00f3:
            int r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r1 = r14
        L_0x00f9:
            r11 = r13 & r1
            if (r11 == 0) goto L_0x00ff
            long r9 = (long) r2
            return r9
        L_0x00ff:
            java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "rounded value is out of range for input "
            r12.<init>(r13)
            r12.append(r9)
            java.lang.String r9 = " and rounding mode "
            r12.append(r9)
            r12.append(r15)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9)
            throw r11
        L_0x011b:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "mode was UNNECESSARY, but rounding was necessary"
            r9.<init>(r10)
            throw r9
        L_0x0123:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "input is infinite or NaN"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v0g.b0(long, long, long, java.math.RoundingMode):long");
    }

    public static int c(pa8 pa8, long j2) {
        int i2 = pa8.b - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (pa8.b(i4) < j2) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        int i5 = i2 + 1;
        if (i5 < pa8.b && pa8.b(i5) == j2) {
            return i5;
        }
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    public static boolean c0(vob vob, boolean z) {
        if (vob == null || !vob.q() || vob.getPlaybackState() == 1 || vob.getPlaybackState() == 4) {
            return true;
        }
        return z && vob.j0() != 0;
    }

    public static int d(Long l2, List list, boolean z) {
        int i2;
        int binarySearch = Collections.binarySearch(list, l2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || ((Comparable) list.get(i3)).compareTo(l2) != 0) {
                    i2 = binarySearch;
                } else {
                    binarySearch = i3;
                }
            }
            i2 = binarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static String[] d0(String str) {
        return str.split("/", -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(int[] r3, int r4, boolean r5, boolean r6) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r3 = -r0
            goto L_0x0019
        L_0x000a:
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x0014
            r2 = r3[r1]
            if (r2 != r4) goto L_0x0014
            r0 = r1
            goto L_0x000a
        L_0x0014:
            if (r5 == 0) goto L_0x0018
            r3 = r0
            goto L_0x0019
        L_0x0018:
            r3 = r1
        L_0x0019:
            if (r6 == 0) goto L_0x0020
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v0g.e(int[], int, boolean, boolean):int");
    }

    public static String[] e0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int f(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    i2 = binarySearch;
                } else {
                    binarySearch = i3;
                }
            }
            i2 = binarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static boolean f0(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static int g(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [n1, java.lang.Object, byd] */
    public static byd g0(zz7 zz7, uu uuVar) {
        ? obj = new Object();
        s6e s6e = new s6e(18, obj, zz7);
        dp4 dp4 = dp4.a;
        obj.d(s6e, dp4);
        zz7.d(new o6d((Object) zz7, (Object) obj, (Object) uuVar, 12), dp4);
        return obj;
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long h0(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static float i(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int j(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long k(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static boolean l(SparseArray sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static boolean m(Object[] objArr, Object obj) {
        for (Object a2 : objArr) {
            if (a(a2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int n(int i2, int i3, int i4, byte[] bArr) {
        while (i2 < i3) {
            i4 = o[((i4 >>> 24) ^ (bArr[i2] & UByte.MAX_VALUE)) & UByte.MAX_VALUE] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static Handler o(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        n79.o(myLooper);
        return new Handler(myLooper, callback);
    }

    public static Handler p(xp4 xp4) {
        return new Handler(w(), xp4);
    }

    public static String q(byte[] bArr) {
        return new String(bArr, x22.c);
    }

    public static int r(int i2) {
        if (i2 == 20) {
            return 30;
        }
        if (i2 == 22) {
            return 31;
        }
        if (i2 == 30) {
            return 34;
        }
        switch (i2) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i2) {
                    case Protos.Attaches.Attach.LOCATION /*14*/:
                        return 25;
                    case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                    case 16:
                    case LangUtils.HASH_SEED /*17*/:
                    case 18:
                        return 28;
                    default:
                        return IntCompanionObject.MAX_VALUE;
                }
        }
    }

    public static AudioFormat s(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public static int t(int i2) {
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return HttpStatus.SC_NO_CONTENT;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                break;
            case 10:
                if (a >= 32) {
                    return 737532;
                }
                break;
            case 12:
                return 743676;
            default:
                return 0;
        }
        return 6396;
    }

    public static int u(int i2, String str) {
        int i3 = 0;
        for (String c2 : e0(str)) {
            if (i2 == vq9.g(vq9.c(c2))) {
                i3++;
            }
        }
        return i3;
    }

    public static String v(int i2, String str) {
        String[] e0 = e0(str);
        if (e0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : e0) {
            if (i2 == vq9.g(vq9.c(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static Looper w() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static int x(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return 6003;
        }
        switch (i2) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case LangUtils.HASH_SEED /*17*/:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i2) {
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int y(String str) {
        String[] split;
        int length;
        if (str == null || (length = split.length) < 2) {
            return 0;
        }
        String str2 = (split = str.split("_", -1))[length - 1];
        boolean z = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            int parseInt = Integer.parseInt(str2);
            return z ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static String z(int i2) {
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i2 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i2 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i2 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }
}
