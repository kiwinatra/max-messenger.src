package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.UInt;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;

/* renamed from: tr1  reason: default package */
public abstract /* synthetic */ class tr1 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

    public static /* synthetic */ int[] A(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ Integer a(int i) {
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(i - 1);
    }

    public static /* synthetic */ int b(int i, int i2) {
        if (i != 0 && i2 != 0) {
            return i - i2;
        }
        throw null;
    }

    public static /* synthetic */ boolean c(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "STICKER";
            case 3:
                return "STICKER_SET";
            case 4:
                return "FAVORITE_STICKER";
            case 5:
                return "FAVORITE_STICKER_SET";
            case 6:
                return "RECENT";
            case 7:
                return "BACKGROUND";
            case 8:
                return "ANIMOJI";
            case 9:
                return "ANIMOJI_SET";
            case 10:
                return "REACTION";
            default:
                throw null;
        }
    }

    public static int e(float f, float f2, int i, int i2) {
        return MathKt.roundToInt(f * f2) + i + i2;
    }

    public static int f(int i, IntRange intRange) {
        return intRange.getEndInclusive().intValue() + i;
    }

    public static int g(UInt uInt, int i) {
        return UInt.m118constructorimpl(uInt.m170unboximpl() + i);
    }

    public static z9f h(qra qra) {
        qra.F().getClass();
        return eaf.b();
    }

    public static String i(String str, ra4 ra4) {
        return (str + ra4).toString();
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String l(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder n(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder p(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static ArrayList q(LinkedHashMap linkedHashMap, Object obj) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(obj, arrayList);
        return arrayList;
    }

    public static ArrayList r(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }

    public static HashMap s(Class cls, oy oyVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, oyVar);
        return hashMap;
    }

    public static Map t(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void u(float f, float f2, ila ila) {
        ila.e(MathKt.roundToInt(f * f2));
    }

    public static void v(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "CREATE_CHAT";
            case 2:
                return "CREATE_GROUP_CALL";
            case 3:
                return "ADD_TO_CHAT";
            case 4:
                return "SHARE_CONTACTS";
            case 5:
                return "PICK_ADMIN";
            case 6:
                return "MOVE_OWNER";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String x(int i) {
        if (i == 1) {
            return "SINGLE";
        }
        if (i == 2) {
            return "MULTI";
        }
        if (i == 3) {
            return "SUBSCRIBERS";
        }
        if (i == 4) {
            return "MULTI_PHONES_AND_CONTACTS";
        }
        throw null;
    }

    public static /* synthetic */ int y(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String z(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "STICKER";
            case 3:
                return "STICKER_SET";
            case 4:
                return "FAVORITE_STICKER";
            case 5:
                return "FAVORITE_STICKER_SET";
            case 6:
                return "RECENT";
            case 7:
                return "BACKGROUND";
            case 8:
                return "ANIMOJI";
            case 9:
                return "ANIMOJI_SET";
            case 10:
                return "REACTION";
            default:
                return "null";
        }
    }
}
