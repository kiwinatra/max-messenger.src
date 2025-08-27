package defpackage;

import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.math.MathKt;

/* renamed from: g63  reason: default package */
public abstract /* synthetic */ class g63 {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "BLOCK";
        }
        if (i == 2) {
            return "UNBLOCK";
        }
        if (i == 3) {
            return "REMOVE";
        }
        if (i == 4) {
            return "ADD";
        }
        if (i == 5) {
            return "UPDATE";
        }
        throw null;
    }

    public static int b(float f, float f2, int i) {
        return MathKt.roundToInt(f * f2) + i;
    }

    public static int c(int i, float f, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int d(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int e(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int f(int i, String str) {
        return String.valueOf(str).length() + i;
    }

    public static String g(a aVar, String str, String str2) {
        return str + aVar + str2;
    }

    public static String h(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String k(StringBuilder sb, ngf ngf, String str) {
        sb.append(ngf);
        sb.append(str);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static ArrayList n(int i, HashMap hashMap, ArrayList arrayList, int i2, String str) {
        hashMap.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    public static void o(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static /* synthetic */ String p(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "INIT";
            case 2:
                return "TEXT";
            case 3:
                return "MEDIA";
            case 4:
                return "LOCATION";
            case 5:
                return "CONTACT";
            case 6:
                return "STICKER";
            case 7:
                return "CALLBACK";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "FEMALE" : "MALE" : "UNKNOWN";
    }

    public static /* synthetic */ String s(int i) {
        switch (i) {
            case 1:
                return "CONFIGURED";
            case 2:
                return "STARTED";
            case 3:
                return "PAUSED";
            case 4:
                return "STOPPING";
            case 5:
                return "PENDING_START";
            case 6:
                return "PENDING_START_PAUSED";
            case 7:
                return "PENDING_RELEASE";
            case 8:
                return "ERROR";
            case 9:
                return "RELEASED";
            default:
                return "null";
        }
    }
}
