package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.ULong;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty1;

/* renamed from: wj6  reason: default package */
public abstract /* synthetic */ class wj6 implements fg9 {
    public static final boolean a(int i, int i2) {
        return (b(i) & i2) != 0;
    }

    public static final int b(int i) {
        return 1 << tr1.y(i);
    }

    public static int c(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 20) {
            return 3;
        }
        if (i != 30) {
            return i != 40 ? 2 : 5;
        }
        return 4;
    }

    public static /* synthetic */ int d(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 10;
        }
        if (i == 3) {
            return 20;
        }
        if (i == 4) {
            return 30;
        }
        if (i == 5) {
            return 40;
        }
        throw null;
    }

    public static int e(CharSequence charSequence, int i, int i2) {
        return (charSequence.hashCode() + i) * i2;
    }

    public static long f(long j, long j2) {
        return ULong.m197constructorimpl(ULong.m197constructorimpl(j) * j2);
    }

    public static Bundle g(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i);
        return bundle;
    }

    public static String h(int i, String str) {
        return str + i;
    }

    public static String i(long j, String str) {
        return str + j;
    }

    public static String j(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String n(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder o(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static KProperty1 p(Class cls, String str, String str2, int i) {
        return Reflection.property1(new PropertyReference1Impl(cls, str, str2, i));
    }

    public static void q(int i, ts tsVar, String str, int i2, String str2) {
        tsVar.put(str, Integer.valueOf(i));
        tsVar.put(str2, Integer.valueOf(i2));
    }

    public static void r(af6 af6, String str, String str2, String str3, String str4) {
        af6.V(str);
        af6.V(str2);
        af6.V(str3);
        af6.V(str4);
    }

    public static /* synthetic */ void s(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void t(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ String u(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "PRIORITY_HIGH_ACCURACY" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_NO_POWER";
    }

    public static /* synthetic */ String v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "FORWARD" : "REPLY" : "UNKNOWN";
    }

    public static /* synthetic */ String w(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CHANNEL_ADMIN" : "CHANNEL" : "GROUP" : "USER" : "UNKNOWN";
    }
}
