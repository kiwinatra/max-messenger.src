package defpackage;

import android.graphics.Color;
import com.android.billingclient.api.BillingResult;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: wzf  reason: default package */
public abstract /* synthetic */ class wzf {
    public static int a(String str) {
        if (str == null) {
            return 1;
        }
        int hashCode = str.hashCode();
        if (hashCode == 2527) {
            str.equals("ON");
        } else if (hashCode == 78159 && str.equals("OFF")) {
            return 2;
        }
        return 1;
    }

    public static int b(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1986891037:
                if (str.equals("NOBODY")) {
                    c = 0;
                    break;
                }
                break;
            case -1500732632:
                if (str.equals("_NONE_")) {
                    c = 1;
                    break;
                }
                break;
            case 215175251:
                if (str.equals("CONTACTS")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 1;
        }
    }

    public static int c(String str) {
        if (str == null) {
            return 1;
        }
        int hashCode = str.hashCode();
        if (hashCode == 2527) {
            str.equals("ON");
        } else if (hashCode == 78159 && str.equals("OFF")) {
            return 2;
        }
        return 1;
    }

    public static /* synthetic */ boolean d(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return false;
            case 5:
            case 6:
                return true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "ON";
        }
        if (i == 2) {
            return "OFF";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "ALL";
        }
        if (i == 2) {
            return "_NONE_";
        }
        if (i == 3) {
            return "CONTACTS";
        }
        throw null;
    }

    public static /* synthetic */ String g(int i) {
        if (i == 1) {
            return "ON";
        }
        if (i == 2) {
            return "OFF";
        }
        throw null;
    }

    public static int h(int i, int i2, int i3) {
        return wzg.Y(i) + i2 + i3;
    }

    public static int i(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static BillingResult j(int i, String str) {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(i);
        newBuilder.setDebugMessage(str);
        return newBuilder.build();
    }

    public static String k(String str, z8f z8f, String str2, z8f z8f2) {
        return str + z8f + str2 + z8f2;
    }

    public static String l(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static HashSet m(HashMap hashMap, String str, v8f v8f, int i) {
        hashMap.put(str, v8f);
        return new HashSet(i);
    }

    public static void n(int i, int i2, int i3, HashMap hashMap, String str) {
        hashMap.put(str, Integer.valueOf(Color.rgb(i, i2, i3)));
    }

    public static /* synthetic */ void o(x0h x0h) {
        if (x0h != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String p(int i) {
        switch (i) {
            case 1:
                return "NIL";
            case 2:
                return "BOOLEAN";
            case 3:
                return "INTEGER";
            case 4:
                return "FLOAT";
            case 5:
                return "STRING";
            case 6:
                return "BINARY";
            case 7:
                return "ARRAY";
            case 8:
                return "MAP";
            case 9:
                return "EXTENSION";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "CONTACTS" : "NONE" : "ALL";
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RELEASED" : "READY" : "PENDING_RELEASE" : "INITIALIZING" : "NOT_INITIALIZED";
    }
}
