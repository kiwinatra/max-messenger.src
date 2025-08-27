package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KMutableProperty1;

/* renamed from: rae  reason: default package */
public abstract /* synthetic */ class rae {
    public static /* synthetic */ String A(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "LOTTIE" : "LIVE" : "STATIC" : "UNKNOWN";
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [android.view.ViewParent] */
    /* JADX WARNING: type inference failed for: r4v6, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            int[] r0 = defpackage.rge.$EnumSwitchMapping$0
            int r4 = defpackage.tr1.y(r4)
            r4 = r0[r4]
            r0 = 1
            r1 = 0
            java.lang.String r2 = "FragmentManager"
            r3 = 2
            if (r4 == r0) goto L_0x005e
            if (r4 == r3) goto L_0x0034
            r6 = 3
            if (r4 == r6) goto L_0x0025
            r6 = 4
            if (r4 == r6) goto L_0x0018
            goto L_0x007a
        L_0x0018:
            boolean r4 = android.util.Log.isLoggable(r2, r3)
            if (r4 == 0) goto L_0x0021
            java.util.Objects.toString(r5)
        L_0x0021:
            r5.setVisibility(r6)
            goto L_0x007a
        L_0x0025:
            boolean r4 = android.util.Log.isLoggable(r2, r3)
            if (r4 == 0) goto L_0x002e
            java.util.Objects.toString(r5)
        L_0x002e:
            r4 = 8
            r5.setVisibility(r4)
            goto L_0x007a
        L_0x0034:
            boolean r4 = android.util.Log.isLoggable(r2, r3)
            if (r4 == 0) goto L_0x003d
            java.util.Objects.toString(r5)
        L_0x003d:
            android.view.ViewParent r4 = r5.getParent()
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0048
            r1 = r4
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x0048:
            if (r1 != 0) goto L_0x0059
            boolean r4 = android.util.Log.isLoggable(r2, r3)
            if (r4 == 0) goto L_0x0056
            r5.toString()
            java.util.Objects.toString(r6)
        L_0x0056:
            r6.addView(r5)
        L_0x0059:
            r4 = 0
            r5.setVisibility(r4)
            goto L_0x007a
        L_0x005e:
            android.view.ViewParent r4 = r5.getParent()
            boolean r6 = r4 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x0069
            r1 = r4
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x0069:
            if (r1 == 0) goto L_0x007a
            boolean r4 = android.util.Log.isLoggable(r2, r3)
            if (r4 == 0) goto L_0x0077
            r5.toString()
            r1.toString()
        L_0x0077:
            r1.removeView(r5)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rae.a(int, android.view.View, android.view.ViewGroup):void");
    }

    public static int b(int i) {
        for (int i2 : tr1.A(3)) {
            if (d(i2) == i) {
                return i2;
            }
        }
        Locale locale = Locale.ENGLISH;
        throw new IllegalArgumentException(a81.j(i, "No such value ", " for StickerAuthorType"));
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
        if (i == 40) {
            return 4;
        }
        throw new IllegalArgumentException(a81.j(i, "No such value ", " for StickerType"));
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
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "hold";
            case 2:
                return "pan";
            case 3:
                return "recents_promo";
            case 4:
                return "settings_promo";
            case 5:
                return "keyboard";
            case 6:
                return "recents_more_stickers";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int f(int i) {
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
            return 40;
        }
        throw null;
    }

    public static /* synthetic */ String g(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "SYSTEM";
        }
        if (i == 3) {
            return "USER";
        }
        throw null;
    }

    public static int h(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int i(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static k3f j(ArrayList arrayList, k3f k3f) {
        arrayList.add(k3f);
        return new k3f();
    }

    public static Object k(CharSequence charSequence, int i, Function1 function1) {
        return function1.invoke(Character.valueOf(charSequence.charAt(i)));
    }

    public static Object l(byte[] bArr, int i, Function1 function1) {
        return function1.invoke(UByte.m35boximpl(UByteArray.m99getw2LRezQ(bArr, i)));
    }

    public static Object m(int[] iArr, int i, Function1 function1) {
        return function1.invoke(UInt.m112boximpl(UIntArray.m178getpVg5ArA(iArr, i)));
    }

    public static Object n(long[] jArr, int i, Function1 function1) {
        return function1.invoke(ULong.m191boximpl(ULongArray.m257getsVKNKU(jArr, i)));
    }

    public static Object o(short[] sArr, int i, Function1 function1) {
        return function1.invoke(UShort.m298boximpl(UShortArray.m362getMh2AYeg(sArr, i)));
    }

    public static String p(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String q(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder r(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static KMutableProperty1 s(Class cls, String str, String str2, int i) {
        return Reflection.mutableProperty1(new MutablePropertyReference1Impl(cls, str, str2, i));
    }

    public static void t(int i, l3f l3f, long j, k3f k3f) {
        k3f.a(new jc0(i, l3f, j));
    }

    public static void u(long j, EnumMap enumMap, uy4 uy4) {
        enumMap.put(uy4, new so4(j));
    }

    public static /* synthetic */ void v(hnf hnf) {
        if (hnf != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void w(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void x(String str, String str2) {
        i8b.V(str + str2);
    }

    public static void y(long j, EnumMap enumMap, uy4 uy4) {
        enumMap.put(uy4, new so4(j));
    }

    public static /* synthetic */ String z(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "USER" : "SYSTEM" : "UNKNOWN";
    }
}
