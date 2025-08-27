package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpStatus;
import org.webrtc.MediaStreamTrack;

/* renamed from: uq9  reason: default package */
public abstract class uq9 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] L = t0g.L(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : L) {
            if (str2.equals(c(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static int b(String str, String str2) {
        ft e;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (e = e(str2)) == null) {
                    return 0;
                }
                return e.b();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case 8:
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        ft e;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String P = o54.P(str.trim());
        if (P.startsWith("avc1") || P.startsWith("avc3")) {
            return "video/avc";
        }
        if (P.startsWith("hev1") || P.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (P.startsWith("dvav") || P.startsWith("dva1") || P.startsWith("dvhe") || P.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (P.startsWith("av01")) {
            return "video/av01";
        }
        if (P.startsWith("vp9") || P.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (P.startsWith("vp8") || P.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (P.startsWith("mp4a")) {
            if (P.startsWith("mp4a.") && (e = e(P)) != null) {
                str2 = d(e.b);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (P.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (P.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (P.startsWith("ac-3") || P.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (P.startsWith("ec-3") || P.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (P.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (P.startsWith("ac-4") || P.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (P.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (P.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (P.startsWith("dtsh") || P.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (P.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (P.startsWith("opus")) {
                return "audio/opus";
            }
            if (P.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (P.startsWith("flac")) {
                return "audio/flac";
            }
            if (P.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (P.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (P.contains("cea708")) {
                return "application/cea-708";
            }
            if (P.contains("eia608") || P.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = a;
            if (arrayList.size() <= 0) {
                return null;
            }
            rae.w(arrayList.get(0));
            throw null;
        }
    }

    public static String d(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case HttpStatus.SC_SWITCHING_PROTOCOLS /*101*/:
                return "video/mpeg2";
            case HttpStatus.SC_PROCESSING /*102*/:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static ft e(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new ft(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0, 4);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String f(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (j(str)) {
            return 2;
        }
        if (i(str)) {
            return 3;
        }
        if ("image".equals(f(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        rae.w(arrayList.get(0));
        throw null;
    }

    public static boolean h(String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(f(str));
    }

    public static boolean i(String str) {
        return "text".equals(f(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean j(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(f(str));
    }
}
