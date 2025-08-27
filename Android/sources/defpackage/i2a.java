package defpackage;

import kotlin.Pair;
import kotlin.TuplesKt;

/* renamed from: i2a  reason: default package */
public abstract /* synthetic */ class i2a {
    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        throw new IllegalArgumentException(a81.j(i, "unknown value ", " for PhoneType"));
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1 || i == 2) {
            return "so";
        }
        if (i == 3) {
            return "dylib";
        }
        if (i == 4) {
            return "so";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "cv";
        }
        if (i == 2) {
            return "cn";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "HUAWEI";
        }
        if (i == 2) {
            return "GCM";
        }
        if (i == 3) {
            return "RUSTORE";
        }
        throw null;
    }

    public static float f(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int g(int i, int i2, ngf ngf) {
        return (ngf.hashCode() + i) * i2;
    }

    public static String h(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static String i(String str, boolean z) {
        return str + z;
    }

    public static String j(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder k(String str, long j, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static Pair l(String str, String str2) {
        return TuplesKt.to(str2, new egd(str));
    }

    public static void m(int i, String str) {
        i8b.V(str + i);
    }

    public static /* synthetic */ void n(lz7 lz7) {
        if (lz7 != null) {
            throw new ClassCastException();
        }
    }

    public static void o(d7d d7d, int i, long j, aj9 aj9) {
        d7d.k(i, j);
        aj9.a().getClass();
    }

    public static /* synthetic */ String p(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "GLOBAL" : "CONTACT" : "MESSAGE" : "CHANNEL" : "CHAT";
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PHONE_CONFIRM" : "PHONE_REBINDING" : "PHONE_BINDING" : "UNKNOWN";
    }

    public static /* synthetic */ String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "INVALID" : "VALID" : "UNKNOWN";
    }

    public static /* synthetic */ String t(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNSPECIFIED" : "FROM_DEFAULT_COUNTRY" : "FROM_NUMBER_WITHOUT_PLUS_SIGN" : "FROM_NUMBER_WITH_IDD" : "FROM_NUMBER_WITH_PLUS_SIGN";
    }

    public static /* synthetic */ String u(int i) {
        switch (i) {
            case 1:
                return "INITIALIZING";
            case 2:
                return "IDLING";
            case 3:
                return "DISABLED";
            case 4:
                return "ENABLED";
            case 5:
                return "ERROR_ENCODER";
            case 6:
                return "ERROR_SOURCE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int v(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("UNKNOWN")) {
            return 1;
        } else {
            if (str.equals("PHONE_BINDING")) {
                return 2;
            }
            if (str.equals("PHONE_REBINDING")) {
                return 3;
            }
            if (str.equals("PHONE_CONFIRM")) {
                return 4;
            }
            throw new IllegalArgumentException("No enum constant ru.ok.tamtam.api.commands.base.PhoneBindTokenType.".concat(str));
        }
    }

    public static /* synthetic */ int w(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("CRASH")) {
            return 1;
        } else {
            if (str.equals("NON_FATAL")) {
                return 2;
            }
            if (str.equals("FATAL")) {
                return 3;
            }
            if (str.equals("ERROR")) {
                return 4;
            }
            if (str.equals("WARNING")) {
                return 5;
            }
            if (str.equals("NOTICE")) {
                return 6;
            }
            if (str.equals("INFO")) {
                return 7;
            }
            if (str.equals("DEBUG")) {
                return 8;
            }
            if (str.equals("MINIDUMP")) {
                return 9;
            }
            if (str.equals("ANR")) {
                return 10;
            }
            throw new IllegalArgumentException("No enum constant ru.ok.tracer.crash.report.ReportType.".concat(str));
        }
    }
}
