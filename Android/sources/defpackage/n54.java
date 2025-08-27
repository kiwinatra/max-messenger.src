package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.BlurMaskFilter;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import com.google.android.exoplayer2.ParserException;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.apache.http.HttpHost;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.messages.views.dialogs.FrgDlgPermissions;

/* renamed from: n54  reason: default package */
public abstract class n54 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, MultiFileUploader.MSG_TRY_UPLOAD_NEXT, 1000, 960, 800, 800, 480, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST, 2048};
    public static final frg b = new frg("PERFORMANCE_METRICS", 2);
    public static final String[] c = {"android.permission.READ_CONTACTS", "android.permission.GET_ACCOUNTS"};
    public static final String[] d = {"android.permission.READ_CONTACTS"};
    public static final String[] e = {"android.permission.CAMERA"};
    public static final String[] f = {"android.permission.RECORD_AUDIO"};
    public static final String[] g = {"android.permission.RECORD_AUDIO"};
    public static final String[] h = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
    public static final String[] i = {"android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE"};
    public static final String[] j = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE"};
    public static final String[] k = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public static final String[] l = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};
    public static final String[] m = {"android.permission.READ_PHONE_STATE"};
    public static final String[] n = {"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
    public static SharedPreferences o;
    public static String[] p;
    public static final Object q = new Object();
    public static boolean r;
    public static int s;
    public static ScheduledExecutorService t;
    public static String u;
    public static volatile qk3 v;
    public static volatile zi6 w;
    public static volatile zi6 x;
    public static volatile zi6 y;

    public static int A(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else if (i2 == 130) {
            i3 = rect2.top;
            i4 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i3 - i4);
    }

    public static int B(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final List C(qdb qdb) {
        Object obj;
        Iterator it = qdb.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Long) obj).longValue() > 0) {
                break;
            }
        }
        if (obj != null) {
            return qdb.f;
        }
        Iterable<String> iterable = qdb.e;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (String str : iterable) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            Long longOrNull = StringsKt.toLongOrNull(sb.toString());
            arrayList.add(Long.valueOf(longOrNull != null ? longOrNull.longValue() : 0));
        }
        return arrayList;
    }

    public static void D(Throwable th) {
        qk3 qk3 = v;
        if (th == null) {
            th = p95.b("onError called with a null Throwable.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof QueueOverflowException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new IllegalStateException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
        }
        if (qk3 != null) {
            try {
                qk3.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        th.printStackTrace();
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static void E(Context context, String[] strArr, int[] iArr) {
        if (Arrays.equals(strArr, c)) {
            SharedPreferences.Editor edit = m(context).edit();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                edit.putBoolean(strArr[i2], iArr[i2] == 0);
            }
            edit.commit();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        if (r9 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r9 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r9 != 8) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.r3 F(defpackage.ky1 r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L_0x0018
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L_0x0032
        L_0x0029:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L_0x0029
        L_0x0032:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L_0x0047
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L_0x0047
            r9.t(r1)
        L_0x0047:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L_0x0055
            r5 = r7
            goto L_0x0056
        L_0x0055:
            r5 = r6
        L_0x0056:
            int r9 = r9.i(r3)
            int[] r8 = a
            if (r5 != r6) goto L_0x0065
            r6 = 13
            if (r9 != r6) goto L_0x0065
            r9 = r8[r9]
            goto L_0x0093
        L_0x0065:
            if (r5 != r7) goto L_0x0092
            r6 = 14
            if (r9 >= r6) goto L_0x0092
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L_0x008b
            r7 = 11
            if (r2 == r1) goto L_0x0086
            if (r2 == r4) goto L_0x008b
            if (r2 == r3) goto L_0x007d
            goto L_0x0090
        L_0x007d:
            if (r9 == r4) goto L_0x0083
            if (r9 == r8) goto L_0x0083
            if (r9 != r7) goto L_0x0090
        L_0x0083:
            int r9 = r6 + 1
            goto L_0x0093
        L_0x0086:
            if (r9 == r8) goto L_0x0083
            if (r9 != r7) goto L_0x0090
            goto L_0x0083
        L_0x008b:
            if (r9 == r4) goto L_0x0083
            if (r9 != r8) goto L_0x0090
            goto L_0x0083
        L_0x0090:
            r9 = r6
            goto L_0x0093
        L_0x0092:
            r9 = 0
        L_0x0093:
            r3 r1 = new r3
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n54.F(ky1):r3");
    }

    public static rp9 G(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            int i3 = t0g.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                if (str.length() != 0) {
                    "Failed to parse Vorbis comment: ".concat(str);
                }
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(vkb.a(new g1g(Base64.decode(split[1], 0))));
                } catch (RuntimeException e2) {
                    iq.a("Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new eeg(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new rp9((List) arrayList);
    }

    public static void H(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj != null) {
            int i2 = 0;
            if (obj instanceof ad9) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(g(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray()) {
                            H(name, obj2, stringBuffer, stringBuffer2);
                        } else if (type.getComponentType() == Byte.TYPE) {
                            H(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                            for (int i3 = 0; i3 < length2; i3++) {
                                H(name, Array.get(obj2, i3), stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
                Method[] methods = cls.getMethods();
                int length3 = methods.length;
                while (i2 < length3) {
                    String name2 = methods[i2].getName();
                    if (name2.startsWith("set")) {
                        String substring = name2.substring(3);
                        try {
                            if (((Boolean) cls.getMethod("has" + substring, (Class[]) null).invoke(obj, (Object[]) null)).booleanValue()) {
                                H(substring, cls.getMethod("get" + substring, (Class[]) null).invoke(obj, (Object[]) null), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    i2++;
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                }
            } else if (obj instanceof Map) {
                String g2 = g(str);
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(g2);
                    stringBuffer2.append(" <\n");
                    int length4 = stringBuffer.length();
                    stringBuffer.append("  ");
                    H("key", entry.getKey(), stringBuffer, stringBuffer2);
                    H("value", entry.getValue(), stringBuffer, stringBuffer2);
                    stringBuffer.setLength(length4);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                }
            } else {
                String g3 = g(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(g3);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str2.startsWith(HttpHost.DEFAULT_SCHEME_NAME) && str2.length() > 200) {
                        str2 = str2.substring(0, 200) + "[...]";
                    }
                    int length5 = str2.length();
                    StringBuilder sb = new StringBuilder(length5);
                    while (i2 < length5) {
                        char charAt = str2.charAt(i2);
                        if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                            sb.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                        } else {
                            sb.append(charAt);
                        }
                        i2++;
                    }
                    String sb2 = sb.toString();
                    stringBuffer2.append("\"");
                    stringBuffer2.append(sb2);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer2.append(Typography.quote);
                    while (i2 < bArr.length) {
                        byte b2 = bArr[i2] & UByte.MAX_VALUE;
                        if (b2 == 92 || b2 == 34) {
                            stringBuffer2.append('\\');
                            stringBuffer2.append((char) b2);
                        } else if (b2 < 32 || b2 >= Byte.MAX_VALUE) {
                            stringBuffer2.append(String.format("\\%03o", new Object[]{Integer.valueOf(b2)}));
                        } else {
                            stringBuffer2.append((char) b2);
                        }
                        i2++;
                    }
                    stringBuffer2.append(Typography.quote);
                } else {
                    stringBuffer2.append(obj);
                }
                stringBuffer2.append("\n");
            }
        }
    }

    public static void I(Throwable th) {
        Class<Error> cls = Error.class;
        if (!cls.isInstance(th)) {
            Class<RuntimeException> cls2 = RuntimeException.class;
            if (!cls2.isInstance(th)) {
                throw new RuntimeException(th);
            }
            throw cls2.cast(th);
        }
        throw cls.cast(th);
    }

    public static void J(a aVar, String[] strArr, int i2) {
        SharedPreferences m2 = m(aVar.O1());
        int length = strArr.length;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            if (m2.getBoolean(strArr[i3] + "_req", false)) {
                z = true;
                break;
            }
            i3++;
        }
        K(aVar, strArr, i2, 164, !z);
    }

    public static void K(a aVar, String[] strArr, int i2, int i3, boolean z) {
        b M1;
        if (aVar != null && (M1 = aVar.M1()) != null) {
            if (z || Q(M1, strArr)) {
                FrgDlgPermissions b3 = FrgDlgPermissions.b3(strArr, FrgDlgPermissions.G1, i2, FrgDlgPermissions.H1, false);
                b3.P2(i3, aVar);
                b3.Y2(aVar.D0, "ru.ok.messages.views.dialogs.FrgDlgPermissions");
                return;
            }
            N(aVar, strArr, i3);
        }
    }

    public static d6a L(g1g g1g, boolean z, boolean z2) {
        if (z) {
            V(3, g1g, false);
        }
        g1g.t((int) g1g.m(), x22.c);
        long m2 = g1g.m();
        String[] strArr = new String[((int) m2)];
        for (int i2 = 0; ((long) i2) < m2; i2++) {
            strArr[i2] = g1g.t((int) g1g.m(), x22.c);
        }
        if (!z2 || (g1g.v() & 1) != 0) {
            return new d6a(15, (Object) strArr);
        }
        throw ParserException.a("framing bit expected to be set", (RuntimeException) null);
    }

    public static String M(long j2) {
        long millis = TimeUnit.MICROSECONDS.toMillis(j2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(millis);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(millis - timeUnit2.toMillis(hours));
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds))});
    }

    public static void N(a aVar, String[] strArr, int i2) {
        try {
            aVar.requestPermissions(strArr, i2);
            P(m(aVar.O1()), strArr);
        } catch (Exception e2) {
            kv0.J();
            z68.f("n54", "Can't request permission", e2);
        }
    }

    public static void O(a aVar, String[] strArr, int i2, int i3) {
        K(aVar, strArr, i3, i2, false);
    }

    public static void P(SharedPreferences sharedPreferences, String[] strArr) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : strArr) {
            edit.putBoolean(str + "_req", true);
        }
        edit.apply();
    }

    public static boolean Q(Activity activity, String[] strArr) {
        for (String str : strArr) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? i2 >= 32 ? o8.a(activity, str) : i2 == 31 ? n8.b(activity, str) : m8.c(activity, str) : false) {
                return true;
            }
        }
        return false;
    }

    public static void R(rqb rqb, long j2) {
        if (j2 >= 0) {
            while (j2 > 0) {
                long skip = rqb.skip(j2);
                if (skip <= 0) {
                    if (rqb.read() != -1) {
                        skip = 1;
                    } else {
                        return;
                    }
                }
                j2 -= skip;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static CharSequence S(CharSequence charSequence, List list, String[] strArr) {
        if (!(charSequence.length() == 0 || list.isEmpty() || strArr.length == 0)) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str.length() != 0) {
                        String str2 = strArr[i2];
                        Pattern pattern = hhf.a;
                        if (str2.regionMatches(true, 0, str, 0, str.length())) {
                            int l2 = StringsKt__StringsKt.indexOf$default((CharSequence) charSequence.toString(), strArr[i2], 0, false, 6, (Object) null);
                            return (i2 == 0 || l2 <= 10) ? charSequence : new SpannableString(new SpannableStringBuilder().append("...").append(charSequence.subSequence((int) Math.max(0.0d, (double) (l2 - 10)), charSequence.length())));
                        }
                    }
                }
                i2++;
            }
        }
        return charSequence;
    }

    public static final String T(Object obj, boolean z, boolean z2) {
        return obj == null ? "null" : obj instanceof f88 ? ((f88) obj).getClass().getName().concat(".NULL") : obj instanceof g88 ? ((g88) obj).a(z, z2) : obj.toString();
    }

    public static boolean U(String[] strArr, int[] iArr, String str) {
        if (strArr.length >= 1 && iArr.length >= 1) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (strArr[i2].equals(str)) {
                    return iArr[i2] == 0;
                }
            }
        }
        return false;
    }

    public static boolean V(int i2, g1g g1g, boolean z) {
        if (g1g.c() < 7) {
            if (z) {
                return false;
            }
            int c2 = g1g.c();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(c2);
            throw ParserException.a(sb.toString(), (RuntimeException) null);
        } else if (g1g.v() != i2) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i2));
            throw ParserException.a(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "), (RuntimeException) null);
        } else if (g1g.v() == 118 && g1g.v() == 111 && g1g.v() == 114 && g1g.v() == 98 && g1g.v() == 105 && g1g.v() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw ParserException.a("expected characters 'vorbis'", (RuntimeException) null);
        }
    }

    public static boolean W(m5 m5Var, a aVar, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3) {
        boolean z;
        int length = strArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                z = true;
                break;
            } else if (!U(strArr, iArr, strArr2[i4])) {
                z = false;
                break;
            } else {
                i4++;
            }
        }
        if (z) {
            z68.c("n54", "all permissions granted", new Object[0]);
            return true;
        }
        if (Q(m5Var, strArr2)) {
            z68.c("n54", "some permissions denied", new Object[0]);
            hi7.b0(0, m5Var, m5Var.getString(i3));
        } else {
            FrgDlgPermissions b3 = FrgDlgPermissions.b3((String[]) null, FrgDlgPermissions.G1, i2, FrgDlgPermissions.H1, true);
            if (aVar != null) {
                b3.Y2(aVar.N1(), "ru.ok.messages.views.dialogs.FrgDlgPermissions");
            } else {
                b3.Y2(m5Var.v(), "ru.ok.messages.views.dialogs.FrgDlgPermissions");
            }
            z68.c("n54", "some permissions denied forever", new Object[0]);
        }
        return false;
    }

    public static boolean X(a aVar, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3) {
        m5 m5Var = (m5) aVar.M1();
        return m5Var != null && W(m5Var, aVar, strArr, iArr, strArr2, i2, i3);
    }

    /* JADX INFO: finally extract failed */
    public static final Object Y(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation) {
        Object b2 = eif.b(coroutineContext, obj2);
        try {
            qie qie = new qie(continuation, coroutineContext);
            Object wrapWithContinuationImpl = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, obj, qie) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, qie);
            eif.a(coroutineContext, b2);
            if (wrapWithContinuationImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return wrapWithContinuationImpl;
        } catch (Throwable th) {
            eif.a(coroutineContext, b2);
            throw th;
        }
    }

    public static int Z(int i2) {
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    public static final ShapeDrawable a(int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i2);
        shapeDrawable.getPaint().setAntiAlias(true);
        shapeDrawable.getPaint().setMaskFilter(new BlurMaskFilter(1000.0f, BlurMaskFilter.Blur.NORMAL));
        return shapeDrawable;
    }

    public static long a0(long j2) {
        return (j2 >>> 1) ^ (-(1 & j2));
    }

    public static final ws b(Object... objArr) {
        ws wsVar = new ws(objArr.length);
        for (Object add : objArr) {
            wsVar.add(add);
        }
        return wsVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = d(r9, r10, r11)
            boolean r1 = d(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x0078
            if (r0 != 0) goto L_0x000f
            goto L_0x0078
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003d
            if (r9 == r3) goto L_0x0036
            if (r9 == r4) goto L_0x002f
            if (r9 != r1) goto L_0x0029
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0077
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0077
            goto L_0x0043
        L_0x0036:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0077
            goto L_0x0043
        L_0x003d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0077
        L_0x0043:
            if (r9 == r5) goto L_0x0077
            if (r9 != r4) goto L_0x0048
            goto L_0x0077
        L_0x0048:
            int r11 = A(r9, r10, r11)
            if (r9 == r5) goto L_0x006a
            if (r9 == r3) goto L_0x0065
            if (r9 == r4) goto L_0x0060
            if (r9 != r1) goto L_0x005a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L_0x0058:
            int r9 = r9 - r10
            goto L_0x006f
        L_0x005a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0060:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0058
        L_0x0065:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0058
        L_0x006a:
            int r9 = r10.left
            int r10 = r12.left
            goto L_0x0058
        L_0x006f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x0076
            r2 = r6
        L_0x0076:
            return r2
        L_0x0077:
            return r6
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n54.c(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean d(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean e(Context context, String[] strArr) {
        for (String d2 : strArr) {
            if (q8.d(context, d2) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(Context context) {
        if (e(context, n())) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return e(context, new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        }
        return false;
    }

    public static String g(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (i2 == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static void h(int i2, l8b l8b) {
        l8b.D(7);
        byte[] bArr = l8b.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[5] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[6] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static Set i() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", (Class[]) null).invoke((Object) null, (Object[]) null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set<Object> set = (Set) invoke;
            for (Object obj : set) {
                if (!(obj instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static List j(String str, List list) {
        return sjd.a.w().d(hhf.f(str), list);
    }

    public static Object k(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return fv0.a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static String[] l() {
        if (p == null) {
            ArrayList arrayList = new ArrayList(Arrays.asList(n()));
            arrayList.add("android.permission.CAMERA");
            p = (String[]) arrayList.toArray(new String[0]);
        }
        return p;
    }

    public static SharedPreferences m(Context context) {
        if (o == null) {
            o = context.getSharedPreferences("permissions_prefs", 0);
        }
        return o;
    }

    public static String[] n() {
        if (Build.VERSION.SDK_INT >= 33) {
            return n;
        }
        ggd.a.getClass();
        return fgd.c;
    }

    public static SpannableString o(CharSequence charSequence, List list, k2b k2b) {
        if (charSequence == null || charSequence.length() == 0) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(charSequence);
        if (charSequence.length() != 0 && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sld sld = (sld) it.next();
                spannableString.setSpan(new aif(k2b, new oo9(15)), sld.a, sld.b, 17);
            }
        }
        return spannableString;
    }

    public static SpannableString p(k2b k2b, isb isb, List list) {
        CharSequence charSequence = isb.a;
        return charSequence.length() == 0 ? new SpannableString("") : o(hhf.f(charSequence.toString()), list, k2b);
    }

    public static int q(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    public static final int r(ws wsVar, Object obj, int i2) {
        int i3 = wsVar.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int h2 = ld9.h(wsVar.a, i3, i2);
            if (h2 < 0 || Intrinsics.areEqual(obj, wsVar.b[h2])) {
                return h2;
            }
            int i4 = h2 + 1;
            while (i4 < i3 && wsVar.a[i4] == i2) {
                if (Intrinsics.areEqual(obj, wsVar.b[i4])) {
                    return i4;
                }
                i4++;
            }
            int i5 = h2 - 1;
            while (i5 >= 0 && wsVar.a[i5] == i2) {
                if (Intrinsics.areEqual(obj, wsVar.b[i5])) {
                    return i5;
                }
                i5--;
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static wyf s(Integer num) {
        int intValue = num.intValue();
        for (wyf wyf : wyf.v) {
            if (wyf.a == intValue) {
                return wyf;
            }
        }
        return wyf.UNKNOWN;
    }

    public static xyf t(Integer num) {
        xyf xyf;
        int intValue = num.intValue();
        xyf.b.getClass();
        xyf[] values = xyf.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                xyf = null;
                break;
            }
            xyf = values[i2];
            if (xyf.a == intValue) {
                break;
            }
            i2++;
        }
        return xyf == null ? xyf.UNKNOWN : xyf;
    }

    public static boolean u(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        } else if (i2 == 130) {
            int i9 = rect.top;
            int i10 = rect2.top;
            return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static boolean v(String str, List list) {
        return !sjd.a.w().d(str, list).isEmpty();
    }

    public static final String w(List list, boolean z, boolean z2) {
        return !z ? String.valueOf(list.size()) : CollectionsKt___CollectionsKt.joinToString$default(list, ",", "[", "]", 0, (CharSequence) null, new d88(z, z2), 24, (Object) null);
    }

    public static final String x(Map map, boolean z, boolean z2) {
        if (!z) {
            return String.valueOf(map.size());
        }
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            sb.append(String.valueOf(key));
            sb.append('=');
            sb.append(T(value, z, z2));
            sb.append(',');
        }
        sb.append('}');
        return sb.toString();
    }

    public static final void y(kn5 kn5, List list) {
        kn5.c("history↓");
        if (list.isEmpty()) {
            kn5.c("empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        gz6 r2 = kv0.r(list);
        if (r2 != null) {
            sb.append(r2.getId());
            sb.append(" ");
        }
        sb.append("║║");
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            gz6 gz6 = (gz6) list.get(i2);
            if (gz6 instanceof fz6) {
                sb.append(" GAP ║║");
            } else {
                gz6 gz62 = null;
                gz6 gz63 = i2 > 0 ? (gz6) list.get(i2 - 1) : null;
                if ((gz63 instanceof fz6) || gz63 == null) {
                    sb.append(" ");
                    sb.append(kn5.b(gz6.h()));
                    sb.append(" - ");
                    i3 = 0;
                }
                i3++;
                if (i2 < list.size() - 1) {
                    gz62 = (gz6) list.get(i2 + 1);
                }
                if ((gz62 instanceof fz6) || gz62 == null) {
                    sb.append(kn5.b(gz6.h()));
                    sb.append(" (" + i3 + ")");
                    sb.append(" ║║");
                }
            }
            i2++;
        }
        gz6 P = kv0.P(list);
        if (P != null) {
            sb.append(" ");
            sb.append(P.getId());
        }
        kn5.c(sb.toString());
    }

    public static final void z(kn5 kn5, dz6 dz6) {
        kn5.c("bounds↓");
        StringBuilder sb = new StringBuilder("firstId: ");
        sb.append(dz6.g());
        sb.append(" ║║ lastId: ");
        sb.append(dz6.h());
        sb.append(" ║║ chunks: ");
        if (dz6.i().isEmpty()) {
            sb.append("empty");
        } else {
            sb.append("║║");
            for (l03 l03 : dz6.i()) {
                sb.append(" ");
                sb.append(kn5.b(l03.a()));
                sb.append(" - ");
                sb.append(kn5.b(l03.b()));
                sb.append(" ║║");
            }
        }
        kn5.c(sb.toString());
    }
}
