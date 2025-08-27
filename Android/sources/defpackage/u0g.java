package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.http.auth.AUTH;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;

/* renamed from: u0g  reason: default package */
public abstract class u0g {
    public static final byte[] a;
    public static final lx6 b = ct.B(new String[0]);
    public static final ptc c;
    public static final b5b d;
    public static final TimeZone e = TimeZone.getTimeZone("GMT");
    public static final Regex f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final String g = StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removePrefix(rla.class.getName(), (CharSequence) "okhttp3."), (CharSequence) "Client");

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, rt0] */
    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, rt0] */
    static {
        int i = 0;
        byte[] bArr = new byte[0];
        a = bArr;
        ? obj = new Object();
        obj.write(bArr, 0, 0);
        c = new ptc((rt0) obj, (f19) null, (long) 0);
        sq6.t(bArr, (f19) null, 7);
        int i2 = b5b.c;
        vw0[] vw0Arr = {wc8.f("efbbbf"), wc8.f("feff"), wc8.f("fffe"), wc8.f("0000ffff"), wc8.f("ffff0000")};
        List mutableList = ArraysKt.toMutableList((T[]) vw0Arr);
        CollectionsKt.sort(mutableList);
        ArrayList arrayList = new ArrayList(5);
        for (int i3 = 0; i3 < 5; i3++) {
            vw0 vw0 = vw0Arr[i3];
            arrayList.add(-1);
        }
        Object[] array = arrayList.toArray(new Integer[0]);
        if (array != null) {
            Integer[] numArr = (Integer[]) array;
            List mutableListOf = CollectionsKt.mutableListOf((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int i4 = 0;
            int i5 = 0;
            while (i4 < 5) {
                mutableListOf.set(CollectionsKt__CollectionsKt.binarySearch$default(mutableList, (Comparable) vw0Arr[i4], 0, 0, 6, (Object) null), Integer.valueOf(i5));
                i4++;
                i5++;
            }
            if (((vw0) mutableList.get(0)).c() > 0) {
                int i6 = 0;
                while (i6 < mutableList.size()) {
                    vw0 vw02 = (vw0) mutableList.get(i6);
                    int i7 = i6 + 1;
                    int i8 = i7;
                    while (i8 < mutableList.size()) {
                        vw0 vw03 = (vw0) mutableList.get(i8);
                        vw03.getClass();
                        if (!vw03.h(vw02.c(), vw02)) {
                            continue;
                            break;
                        } else if (vw03.c() == vw02.c()) {
                            throw new IllegalArgumentException(("duplicate option: " + vw03).toString());
                        } else if (((Number) mutableListOf.get(i8)).intValue() > ((Number) mutableListOf.get(i6)).intValue()) {
                            mutableList.remove(i8);
                            mutableListOf.remove(i8);
                        } else {
                            i8++;
                        }
                    }
                    i6 = i7;
                }
                ? obj2 = new Object();
                n79.e(0, obj2, 0, mutableList, 0, mutableList.size(), mutableListOf);
                int[] iArr = new int[((int) (obj2.b / ((long) 4)))];
                while (!obj2.C()) {
                    iArr[i] = obj2.readInt();
                    i++;
                }
                d = new b5b((vw0[]) Arrays.copyOf(vw0Arr, 5), iArr);
                return;
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean a(m57 m57, m57 m572) {
        return Intrinsics.areEqual((Object) m57.e, (Object) m572.e) && m57.f == m572.f && Intrinsics.areEqual((Object) m57.b, (Object) m572.b);
    }

    public static final int b(TimeUnit timeUnit) {
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(10);
            if (millis > ((long) IntCompanionObject.MAX_VALUE)) {
                throw new IllegalArgumentException("timeout too large.".toString());
            } else if (millis != 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException("timeout too small.".toString());
            }
        } else {
            throw new IllegalStateException("unit == null".toString());
        }
    }

    public static final void c(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!Intrinsics.areEqual((Object) e3.getMessage(), (Object) "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(char c2, int i, int i2, String str) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (StringsKt__StringsKt.contains$default((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int g(String str, char c2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return e(c2, i, i2, str);
    }

    public static final String h(String str, Object... objArr) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        if (!(strArr.length == 0 || strArr2 == null || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(k4d k4d) {
        String b2 = k4d.w.b(HTTP.CONTENT_LEN);
        if (b2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(b2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static final List k(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        return Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr2, objArr2.length)));
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Intrinsics.compare((int) charAt, 31) <= 0 || Intrinsics.compare((int) charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(int i, int i2, String str) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int n(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean p(String str) {
        return StringsKt__StringsJVMKt.equals(str, AUTH.WWW_AUTH_RESP, true) || StringsKt__StringsJVMKt.equals(str, SM.COOKIE, true) || StringsKt__StringsJVMKt.equals(str, AUTH.PROXY_AUTH_RESP, true) || StringsKt__StringsJVMKt.equals(str, SM.SET_COOKIE, true);
    }

    public static final int q(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        return -1;
    }

    public static final int r(xu0 xu0) {
        return (xu0.readByte() & UByte.MAX_VALUE) | ((xu0.readByte() & UByte.MAX_VALUE) << 16) | ((xu0.readByte() & UByte.MAX_VALUE) << 8);
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [java.lang.Object, rt0] */
    public static final boolean s(yfe yfe, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c2 = yfe.q().e() ? yfe.q().c() - nanoTime : Long.MAX_VALUE;
        yfe.q().d(Math.min(c2, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            ? obj = new Object();
            while (yfe.e(obj, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                obj.m();
            }
            if (c2 == LongCompanionObject.MAX_VALUE) {
                yfe.q().a();
            } else {
                yfe.q().d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == LongCompanionObject.MAX_VALUE) {
                yfe.q().a();
            } else {
                yfe.q().d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == LongCompanionObject.MAX_VALUE) {
                yfe.q().a();
            } else {
                yfe.q().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final lx6 t(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zw6 zw6 = (zw6) it.next();
            String j = zw6.b.j();
            String j2 = zw6.c.j();
            arrayList.add(j);
            arrayList.add(StringsKt.trim((CharSequence) j2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new lx6((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String u(defpackage.m57 r3, boolean r4) {
        /*
            java.lang.String r0 = r3.e
            java.lang.String r1 = ":"
            boolean r0 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r0, (java.lang.CharSequence) r1, false, 2, (java.lang.Object) null)
            java.lang.String r1 = r3.e
            if (r0 == 0) goto L_0x001f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r0.<init>(r2)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L_0x001f:
            int r0 = r3.f
            if (r4 != 0) goto L_0x004d
            java.lang.String r3 = r3.b
            int r4 = r3.hashCode()
            r2 = 3213448(0x310888, float:4.503E-39)
            if (r4 == r2) goto L_0x003f
            r2 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r4 == r2) goto L_0x0034
            goto L_0x004a
        L_0x0034:
            java.lang.String r4 = "https"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x004a
            r3 = 443(0x1bb, float:6.21E-43)
            goto L_0x004b
        L_0x003f:
            java.lang.String r4 = "http"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x004a
            r3 = 80
            goto L_0x004b
        L_0x004a:
            r3 = -1
        L_0x004b:
            if (r0 == r3) goto L_0x0061
        L_0x004d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r4 = 58
            r3.append(r4)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u0g.u(m57, boolean):java.lang.String");
    }

    public static final List v(List list) {
        return Collections.unmodifiableList(CollectionsKt.toMutableList(list));
    }

    public static final int w(int i, String str) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) IntCompanionObject.MAX_VALUE)) {
                    return IntCompanionObject.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String x(int i, int i2, String str) {
        int m = m(i, i2, str);
        return str.substring(m, n(m, i2, str));
    }

    public static final void y(Exception exc, List list) {
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(exc, (Exception) it.next());
        }
    }
}
