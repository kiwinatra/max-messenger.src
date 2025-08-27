package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import kotlin.math.MathKt;

/* renamed from: a81  reason: default package */
public abstract /* synthetic */ class a81 {
    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "INITIALIZED";
            case 3:
                return "GET_SURFACE";
            case 4:
                return "OPENING";
            case 5:
                return "OPENED";
            case 6:
                return "CLOSED";
            case 7:
                return "RELEASING";
            case 8:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String B(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "GROUP_CHAT" : "CHANNEL" : "CHAT" : "DIALOG" : "UNKNOWN";
    }

    public static int a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 2332679:
                if (str.equals("LEFT")) {
                    c = 0;
                    break;
                }
                break;
            case 269808705:
                if (str.equals("REMOVING")) {
                    c = 1;
                    break;
                }
                break;
            case 1809818688:
                if (str.equals("REMOVED")) {
                    c = 2;
                    break;
                }
                break;
            case 1925346054:
                if (str.equals("ACTIVE")) {
                    c = 3;
                    break;
                }
                break;
            case 1990776172:
                if (str.equals("CLOSED")) {
                    c = 4;
                    break;
                }
                break;
            case 2130809258:
                if (str.equals("HIDDEN")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 5;
            case 5:
                return 6;
            default:
                throw new IllegalArgumentException(wj6.k("No such value ", str, " for ChatStatus"));
        }
    }

    public static /* synthetic */ char b(int i) {
        if (i == 1) {
            return 'u';
        }
        if (i == 2) {
            return 'g';
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "add";
        }
        if (i == 2) {
            return "remove";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "DIALOG";
        }
        if (i == 3) {
            return "CHAT";
        }
        if (i == 4) {
            return "CHANNEL";
        }
        if (i == 5) {
            return "GROUP_CHAT";
        }
        throw null;
    }

    public static int e(float f, float f2, int i) {
        return i - MathKt.roundToInt(f * f2);
    }

    public static int f(float f, float f2, int i, int i2) {
        return i2 - (MathKt.roundToInt(f * f2) * i);
    }

    public static u67 g(js9 js9, Context context) {
        return js9.e(context).f().getIcon();
    }

    public static Object h(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static Object i(int i, List list) {
        return list.get(list.size() - i);
    }

    public static String j(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String k(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.F());
        return sb.toString();
    }

    public static String l(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder n(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static EnumMap o(float f, int i, EnumMap enumMap, uy4 uy4, ogf ogf) {
        enumMap.put(uy4, so4.a(so4.b(f, i)));
        return ogf.e();
    }

    public static void p(float f, int i, EnumMap enumMap, uy4 uy4) {
        enumMap.put(uy4, so4.a(so4.b(f, i)));
    }

    public static void q(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void r(String str, s85 s85) {
        xag.h(s85, new pa4(str));
    }

    public static void s(HashMap hashMap, String str, Integer num, int i, String str2) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i));
    }

    public static void t(boolean z, i9d i9d, boolean z2, String str) {
        i9d.c(new jbe(z));
        i9d.a(new jbe(z2));
        i9d.d(str);
    }

    public static EnumMap u(float f, int i, EnumMap enumMap, uy4 uy4, ogf ogf) {
        enumMap.put(uy4, so4.a(so4.b(f, i)));
        return ogf.f();
    }

    public static /* synthetic */ String v(int i) {
        if (i == 1) {
            return "USER";
        }
        if (i == 2) {
            return "GROUP";
        }
        throw null;
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String x(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "VIDEO" : "AUDIO" : "UNKNOWN";
    }

    public static /* synthetic */ String y(int i) {
        switch (i) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "ERROR";
            case 3:
                return "HEADSET_UNAVAILABLE";
            case 4:
                return "HEADSET_AVAILABLE";
            case 5:
                return "SCO_DISCONNECTING";
            case 6:
                return "SCO_CONNECTING";
            case 7:
                return "SCO_CONNECTED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String z(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                return "null";
        }
    }
}
