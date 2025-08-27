package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Rect;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Range;
import android.util.Rational;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.exoplayer2.ParserException;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import one.me.chats.picker.ActChatPickerCompat;
import org.apache.http.protocol.HTTP;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: te8  reason: default package */
public abstract class te8 implements tde {
    public static boolean a = false;
    public static int b = 1;
    public static final bpa c = new bpa(10, "REHASH");
    public static final lf8 d = new lf8((Object) null);
    public static final lf8 e = new lf8(Boolean.TRUE);
    public static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Object g = new Object();
    public static final /* synthetic */ int h = 0;

    public static final gg1 A(dae dae) {
        return new gg1(dae.a, dae.b, dae.c, dae.d, dae.e, dae.f);
    }

    public static void B(Spannable spannable, zz3 zz3, int i, int i2) {
        Object obj;
        int coerceAtLeast = RangesKt.coerceAtLeast(i, 0);
        if (coerceAtLeast < spannable.length()) {
            int coerceAtMost = RangesKt.coerceAtMost(i2, spannable.length());
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.m23constructorimpl((zz3[]) spannable.getSpans(coerceAtLeast, coerceAtMost, zz3.getClass()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m23constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m29isFailureimpl(obj)) {
                obj = null;
            }
            zz3[] zz3Arr = (zz3[]) obj;
            if (!(zz3Arr == null || zz3Arr.length == 0)) {
                for (zz3 l0 : zz3Arr) {
                    ld8.l0(spannable, l0, coerceAtLeast, coerceAtMost);
                }
            }
            try {
                spannable.setSpan(zz3, coerceAtLeast, coerceAtMost, 33);
            } catch (Throwable th2) {
                z68.f("Markdown", "error while try to set span", th2);
            }
        }
    }

    public static void C(Parcel parcel, byte[] bArr) {
        if (E(parcel, bArr)) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    public static void D(Parcel parcel, String str) {
        if (E(parcel, str)) {
            parcel.writeString(str);
        }
    }

    public static boolean E(Parcel parcel, Object obj) {
        boolean z = obj != null;
        parcel.writeByte(z ? (byte) 1 : 0);
        return z;
    }

    public static final uy4 c(int i) {
        if (i == 0) {
            return uy4.a;
        }
        if (i == 1) {
            return uy4.b;
        }
        if (i == 2) {
            return uy4.c;
        }
        if (i == 3) {
            return uy4.o;
        }
        if (i == 4) {
            return uy4.v;
        }
        if (i == 5) {
            return uy4.w;
        }
        z68.f("OneMeDynamicFont", wj6.h(i, "unknown font size mode "), new IllegalStateException(wj6.h(i, "unknown font size mode ")));
        return uy4.w;
    }

    public static final byte[] d(String str) {
        try {
            return str.getBytes(Charset.forName(HTTP.ASCII));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    public static void e(String str, boolean z) {
        if (!z) {
            throw ParserException.a(str, (RuntimeException) null);
        }
    }

    public static void f(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Copied Text", str));
    }

    public static yia g(OneMeRoomDatabase oneMeRoomDatabase, String[] strArr, Callable callable) {
        Executor executor = oneMeRoomDatabase.b;
        if (executor == null) {
            executor = null;
        }
        wce wce = xfd.a;
        ea5 ea5 = new ea5(executor, false);
        return new yia(new pka(new gb3(3, new pbb(12, strArr, oneMeRoomDatabase)).x(ea5), ea5, 1).s(ea5), new y3a(24, (Object) new bi8(callable)), 0);
    }

    public static final g8f h(Context context) {
        String str;
        String str2;
        boolean z;
        gy8 gy8 = kof.c;
        String str3 = (String) (gy8 != null ? gy8 : null).a;
        long j = (gy8 != null ? gy8 : null).o;
        String str4 = (String) (gy8 != null ? gy8 : null).b;
        String str5 = (String) (gy8 != null ? gy8 : null).v;
        if (gy8 == null) {
            gy8 = null;
        }
        String str6 = (String) gy8.c;
        String str7 = rxd.a;
        String str8 = Build.MODEL;
        String u = i8b.u(context);
        String str9 = Build.MANUFACTURER;
        int i = Build.VERSION.SDK_INT;
        String valueOf = String.valueOf(i);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i2 = runningAppProcessInfo.importance;
        boolean z2 = true;
        boolean z3 = !(i2 == 100 || i2 == 200);
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String str10 = Build.PRODUCT;
        boolean z4 = Intrinsics.areEqual((Object) "sdk", (Object) str10) || Intrinsics.areEqual((Object) "google_sdk", (Object) str10) || string == null;
        String str11 = Build.TAGS;
        if ((z4 || str11 == null || !StringsKt__StringsKt.contains$default((CharSequence) str11, (CharSequence) "test-keys", false, 2, (Object) null)) && !new File("/system/app/Superuser.apk").exists()) {
            File file = new File("/system/xbin/su");
            if (z4 || !file.exists()) {
                z2 = false;
            }
        }
        Map createMapBuilder = MapsKt.createMapBuilder();
        context.getApplicationContext();
        createMapBuilder.put("board", Build.BOARD);
        createMapBuilder.put("brand", Build.BRAND);
        createMapBuilder.put("cpuABI", TextUtils.join(", ", Build.SUPPORTED_ABIS));
        createMapBuilder.put("device", Build.DEVICE);
        createMapBuilder.put("manufacturer", str9);
        createMapBuilder.put("model", str8);
        createMapBuilder.put("cpuCount", String.valueOf(Runtime.getRuntime().availableProcessors()));
        createMapBuilder.put("osVersionSdkInt", String.valueOf(i));
        createMapBuilder.put("osVersionRelease", Build.VERSION.RELEASE);
        String r = o54.r();
        String packageName = context.getPackageName();
        if (r == null || Intrinsics.areEqual((Object) r, (Object) packageName)) {
            str = str9;
            str2 = valueOf;
            z = z3;
            r = null;
        } else {
            z = z3;
            str2 = valueOf;
            str = str9;
            int k = StringsKt__StringsKt.indexOf$default((CharSequence) r, ':', 0, false, 6, (Object) null);
            if (k == packageName.length() && StringsKt__StringsJVMKt.startsWith$default(r, packageName, false, 2, (Object) null)) {
                r = r.substring(k);
            }
        }
        if (r != null) {
            String str12 = (String) createMapBuilder.put("processName", r);
        }
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        if (networkOperatorName != null) {
            String str13 = (String) createMapBuilder.put("operatorName", networkOperatorName);
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName2 = context.getPackageName();
        String g2 = i >= 30 ? packageManager.getInstallSourceInfo(packageName2).getInstallingPackageName() : packageManager.getInstallerPackageName(packageName2);
        if (g2 != null) {
            createMapBuilder.put("installer", g2);
        }
        Map build = MapsKt.build(createMapBuilder);
        Set j2 = o5a.j();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(j2, 10));
        for (Iterator it = j2.iterator(); it.hasNext(); it = it) {
            zof zof = (zof) it.next();
            arrayList.add(new d37(zof.namespace(), zof.versionName(), zof.buildUuid(), zof.environment()));
        }
        return new g8f(str3, j, str4, str5, str6, str7, str8, u, str, str2, z, z2, build, CollectionsKt.toSet(arrayList));
    }

    public static int i(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1011:0x116e, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x08bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1020:0x1199, code lost:
        if (r10.equals("1280x720") == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1022:0x11a4, code lost:
        if (r10.equals("1280x720") == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1024:0x11af, code lost:
        if (r10.equals("1280x720") == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1027:0x11c1, code lost:
        if (r8.equals("Nokia 7.2") == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1031:0x11d6, code lost:
        if (r8.equals("MI 5s") == false) goto L_0x0764;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025a, code lost:
        if (r11 != 30) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0265, code lost:
        r23 = 0.14d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1067:0x1268, code lost:
        if (r10.equals("1280x720") == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0269, code lost:
        r23 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x026d, code lost:
        r23 = 0.245d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1102:0x12f5, code lost:
        if (r10.equals("1280x720") == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1107:0x130c, code lost:
        if (r8.equals("Infinix X650") == false) goto L_0x1303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1119:0x133e, code lost:
        if (r10.equals("640x480") == false) goto L_0x0733;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1121:0x1349, code lost:
        if (r10.equals("1280x720") == false) goto L_0x07a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1127:0x136c, code lost:
        if (r8.equals("Moto C") == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1132:0x1383, code lost:
        if (r8.equals("LG-K430") == false) goto L_0x137a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1144:0x13b5, code lost:
        if (r10.equals("1280x720") == false) goto L_0x080e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1186:0x1461, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x145a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1194:0x147c, code lost:
        if (r11 != 30) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1196:0x1487, code lost:
        if (r10.equals("1280x720") == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1228:0x150a, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1233:0x151f, code lost:
        if (r11 != 60) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1238:0x1534, code lost:
        if (r10.equals("3840x2160") == false) goto L_0x152d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1256:0x157f, code lost:
        if (r11 != 60) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1261:0x1596, code lost:
        if (r8.equals("SM-M205F") == false) goto L_0x158d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1276:0x15d2, code lost:
        if (r11 != 60) goto L_0x04aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1280:0x15e3, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x080e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1308:0x1657, code lost:
        if (r11 != 30) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1313:0x166c, code lost:
        if (r10.equals("3840x2160") == false) goto L_0x1665;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1322:0x168e, code lost:
        if (r11 != 60) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1329:0x16b5, code lost:
        if (r8.equals("SM-G935F") == false) goto L_0x07df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02d2, code lost:
        r23 = 0.7d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1347:0x16ff, code lost:
        if (r10.equals("3840x2160") == false) goto L_0x16f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1356:0x1720, code lost:
        if (r11 != 60) goto L_0x0561;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1358:0x172d, code lost:
        return (int) (((double) (((float) (r1 * r2)) * r75)) * r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02e3, code lost:
        if (r10.equals("1280x720") == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02ee, code lost:
        if (r10.equals("1280x720") == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02f0, code lost:
        r23 = 0.35d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0301, code lost:
        if (r10.equals("1280x720") == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0315, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x032f, code lost:
        if (r11 != 30) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0343, code lost:
        if (r11 != 30) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x036b, code lost:
        if (r10.equals("3840x2160") == false) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0390, code lost:
        r23 = 0.08704d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0394, code lost:
        if (r11 != 30) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0398, code lost:
        r23 = 0.1925d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03a9, code lost:
        if (r10.equals("1280x720") == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03eb, code lost:
        r23 = 1.05d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0400, code lost:
        if (r11 != 30) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04a2, code lost:
        if (r11 != 30) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04a6, code lost:
        r23 = 0.175d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04aa, code lost:
        r23 = 0.315d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0548, code lost:
        if (r10.equals("1280x720") == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x055d, code lost:
        if (r11 != 30) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0561, code lost:
        r23 = 0.2625d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x05a0, code lost:
        if (r8.equals("ONEPLUS A5010") == false) goto L_0x056f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x012e, code lost:
        r23 = r47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x072f, code lost:
        if (r11 != 30) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0733, code lost:
        r23 = 0.4375d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0744, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x074f, code lost:
        if (r10.equals("640x480") == false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0760, code lost:
        if (r10.equals("3840x2160") == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0768, code lost:
        if (r11 != 30) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0777, code lost:
        if (r11 != 30) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x078c, code lost:
        if (r10.equals("3840x2160") == false) goto L_0x0785;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x07a7, code lost:
        r23 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x07ab, code lost:
        if (r11 != 30) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x07c0, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x07b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x07db, code lost:
        if (r11 != 30) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x07df, code lost:
        r23 = 0.37188d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x07f4, code lost:
        if (r11 != 30) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x07ff, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x0801;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0159, code lost:
        r23 = 0.28d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0801, code lost:
        r23 = 0.39375d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x080c, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x080e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x080e, code lost:
        r23 = 0.525d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x081c, code lost:
        if (r11 != 30) goto L_0x080e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0826, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x082a, code lost:
        if (r11 != 30) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x083f, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x085a, code lost:
        if (r11 != 30) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x086f, code lost:
        if (r11 != 30) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0873, code lost:
        if (r11 != 30) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0888, code lost:
        if (r10.equals("3840x2160") == false) goto L_0x0881;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x08a3, code lost:
        if (r11 != 30) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x08b8, code lost:
        if (r11 != 30) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x08bc, code lost:
        r23 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x08c0, code lost:
        r23 = 0.3325d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016d, code lost:
        if (r11 != 30) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x08d5, code lost:
        if (r11 != 60) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x08ea, code lost:
        if (r11 != 30) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0170, code lost:
        r23 = 0.21d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x08fb, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0910, code lost:
        if (r11 != 30) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0174, code lost:
        r23 = 0.2275d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x091f, code lost:
        if (r11 != 30) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0a17, code lost:
        if (r11 != 60) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0a2b, code lost:
        if (r11 != 30) goto L_0x0733;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0a47, code lost:
        if (r11 != 60) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0a5c, code lost:
        if (r11 != 30) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0a6d, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x0a7e, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0a93, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x0a8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0aae, code lost:
        if (r11 != 30) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0ac3, code lost:
        if (r10.equals("3840x2160") == false) goto L_0x0abc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x0ae8, code lost:
        if (r11 != 30) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x0af3, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0afe, code lost:
        if (r10.equals("640x480") == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x0b0f, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:628:0x0b13, code lost:
        if (r11 != 60) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x0bbc, code lost:
        if (r8.equals("SM-G950U1") == false) goto L_0x0b21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:756:0x0d52, code lost:
        if (r11 != 30) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:761:0x0d67, code lost:
        if (r11 != 60) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:766:0x0d7c, code lost:
        if (r10.equals("3840x2160") == false) goto L_0x0d75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:774:0x0d97, code lost:
        if (r11 != 30) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:779:0x0dac, code lost:
        if (r10.equals("3840x2160") == false) goto L_0x0da5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:787:0x0dc7, code lost:
        if (r11 != 30) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:792:0x0ddc, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x0dd5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:800:0x0df7, code lost:
        if (r11 != 30) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:804:0x0e08, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:808:0x0e19, code lost:
        if (r10.equals("3840x2160") == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:809:0x0e1d, code lost:
        if (r11 != 30) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:811:0x0e28, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:813:0x0e33, code lost:
        if (r10.equals("640x480") == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:818:0x0e48, code lost:
        if (r10.equals("3840x2160") == false) goto L_0x0e41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:826:0x0e63, code lost:
        if (r11 != 60) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:829:0x0e72, code lost:
        if (r11 != 30) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:834:0x0e87, code lost:
        if (r11 != 60) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:839:0x0e9c, code lost:
        if (r11 != 30) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:844:0x0eb1, code lost:
        if (r11 != 60) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:847:0x0ec0, code lost:
        if (r11 != 60) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:852:0x0ed5, code lost:
        if (r11 != 60) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:855:0x0ee4, code lost:
        if (r11 != 30) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:856:0x0ee8, code lost:
        if (r11 != 60) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:897:0x0f91, code lost:
        if (r11 != 60) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:902:0x0fa6, code lost:
        if (r11 != 30) goto L_0x080e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:907:0x0fbd, code lost:
        if (r8.equals("Nexus 6P") == false) goto L_0x0fb4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:922:0x0ff9, code lost:
        if (r10.equals("3840x2160") == false) goto L_0x0ff2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:930:0x1014, code lost:
        if (r11 != 30) goto L_0x0801;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:931:0x1018, code lost:
        if (r11 != 60) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:963:0x109e, code lost:
        if (r11 != 30) goto L_0x0801;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:967:0x10b2, code lost:
        if (r11 != 60) goto L_0x0733;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:970:0x10c1, code lost:
        if (r11 != 60) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:973:0x10d0, code lost:
        if (r11 != 60) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:977:0x10e1, code lost:
        if (r10.equals("1920x1080") == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:982:0x10f6, code lost:
        if (r11 != 60) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:989:0x110f, code lost:
        if (r8.equals("HMA-L29") == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:994:0x1126, code lost:
        if (r8.equals("EML-AL00") == false) goto L_0x111d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int j(java.lang.String r72, int r73, int r74, float r75) {
        /*
            r0 = r72
            r1 = r73
            r2 = r74
            r3 = 28
            java.lang.String r9 = "Pixel 4"
            java.lang.String r13 = "3840x2160"
            r16 = 4
            r17 = 3
            java.lang.String r4 = "1280x720"
            r18 = 2
            r19 = 1
            r20 = 0
            r21 = -1
            java.lang.String r5 = "640x480"
            java.lang.String r6 = "1920x1080"
            int r7 = defpackage.v0g.a
            java.lang.String r8 = android.os.Build.MODEL
            java.lang.String r10 = ""
            java.lang.String r11 = "x"
            java.lang.String r10 = defpackage.g63.h(r10, r1, r2, r11)
            int r11 = java.lang.Math.round(r75)
            r72.getClass()
            r23 = 4592230468037147361(0x3fbae147ae147ae1, double:0.105)
            r25 = 4599030903474476810(0x3fd30a3d70a3d70a, double:0.2975)
            r27 = 4590936313648226176(0x3fb64840e1719f80, double:0.08704)
            r29 = 4596418815690601923(0x3fc9c28f5c28f5c3, double:0.20125)
            r31 = 4594842555821022249(0x3fc428f5c28f5c29, double:0.1575)
            r33 = 4603298064121410355(0x3fe2333333333333, double:0.56875)
            r35 = 4594212051873190380(0x3fc1eb851eb851ec, double:0.14)
            r37 = 4600370814435612080(0x3fd7cce1c58255b0, double:0.37188)
            r39 = 4607407598781385933(0x3ff0cccccccccccd, double:1.05)
            r41 = 4601552919265804288(0x3fdc000000000000, double:0.4375)
            r43 = 4598400399526644941(0x3fd0cccccccccccd, double:0.2625)
            r45 = 4596103563716685988(0x3fc8a3d70a3d70a4, double:0.1925)
            r47 = 4608983858650965606(0x3ff6666666666666, double:1.4)
            r49 = 4599661407422308680(0x3fd547ae147ae148, double:0.3325)
            r51 = 4599346155448392745(0x3fd428f5c28f5c29, double:0.315)
            r53 = 4602903999154015437(0x3fe0cccccccccccd, double:0.525)
            r55 = 4595473059768854118(0x3fc6666666666666, double:0.175)
            r57 = 4600764789331014451(0x3fd9333333333333, double:0.39375)
            r12 = 60
            r59 = 4597364571612349727(0x3fcd1eb851eb851f, double:0.2275)
            r14 = 30
            r61 = 4599976659396224614(0x3fd6666666666666, double:0.35)
            r63 = 4597995075560181596(0x3fcf5c28f5c28f5c, double:0.245)
            r65 = 4598715651500560876(0x3fd1eb851eb851ec, double:0.28)
            r67 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            r69 = 4596734067664517857(0x3fcae147ae147ae1, double:0.21)
            int r71 = r72.hashCode()
            switch(r71) {
                case -1520327126: goto L_0x0120;
                case -1221990898: goto L_0x0114;
                case -1112627957: goto L_0x0108;
                case -782354407: goto L_0x00fc;
                case -579904071: goto L_0x00f0;
                case -8329946: goto L_0x00e5;
                case 113303871: goto L_0x00da;
                case 265661798: goto L_0x00cf;
                case 728806133: goto L_0x00c2;
                case 1301817791: goto L_0x00b5;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            r0 = r21
            goto L_0x012b
        L_0x00b5:
            java.lang.String r15 = "c2.qti.hevc.encoder"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x00be
            goto L_0x00b1
        L_0x00be:
            r0 = 9
            goto L_0x012b
        L_0x00c2:
            java.lang.String r15 = "c2.qti.avc.encoder"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x00cb
            goto L_0x00b1
        L_0x00cb:
            r0 = 8
            goto L_0x012b
        L_0x00cf:
            java.lang.String r15 = "OMX.Exynos.HEVC.Encoder"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x00d8
            goto L_0x00b1
        L_0x00d8:
            r0 = 7
            goto L_0x012b
        L_0x00da:
            java.lang.String r15 = "OMX.qcom.video.encoder.avc"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x00e3
            goto L_0x00b1
        L_0x00e3:
            r0 = 6
            goto L_0x012b
        L_0x00e5:
            java.lang.String r15 = "OMX.hisi.video.encoder.avc"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x00ee
            goto L_0x00b1
        L_0x00ee:
            r0 = 5
            goto L_0x012b
        L_0x00f0:
            java.lang.String r15 = "c2.exynos.h264.encoder"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x00f9
            goto L_0x00b1
        L_0x00f9:
            r0 = r16
            goto L_0x012b
        L_0x00fc:
            java.lang.String r15 = "OMX.qcom.video.encoder.hevc"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0105
            goto L_0x00b1
        L_0x0105:
            r0 = r17
            goto L_0x012b
        L_0x0108:
            java.lang.String r15 = "OMX.MTK.VIDEO.ENCODER.AVC"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0111
            goto L_0x00b1
        L_0x0111:
            r0 = r18
            goto L_0x012b
        L_0x0114:
            java.lang.String r15 = "OMX.Exynos.AVC.Encoder"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x011d
            goto L_0x00b1
        L_0x011d:
            r0 = r19
            goto L_0x012b
        L_0x0120:
            java.lang.String r15 = "OMX.IMG.TOPAZ.VIDEO.Encoder"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0129
            goto L_0x00b1
        L_0x0129:
            r0 = r20
        L_0x012b:
            switch(r0) {
                case 0: goto L_0x16b9;
                case 1: goto L_0x13b9;
                case 2: goto L_0x11da;
                case 3: goto L_0x11b3;
                case 4: goto L_0x1172;
                case 5: goto L_0x10fa;
                case 6: goto L_0x03ca;
                case 7: goto L_0x03ad;
                case 8: goto L_0x0144;
                case 9: goto L_0x0132;
                default: goto L_0x012e;
            }
        L_0x012e:
            r23 = r47
            goto L_0x1724
        L_0x0132:
            r8.getClass()
            boolean r0 = r8.equals(r9)
            if (r0 != 0) goto L_0x013d
            goto L_0x1724
        L_0x013d:
            r23 = 4590969460141483622(0x3fb6666666666666, double:0.0875)
            goto L_0x1724
        L_0x0144:
            switch(r7) {
                case 29: goto L_0x0347;
                case 30: goto L_0x0271;
                case 31: goto L_0x0178;
                case 32: goto L_0x0148;
                default: goto L_0x0147;
            }
        L_0x0147:
            goto L_0x012e
        L_0x0148:
            r8.getClass()
            boolean r0 = r8.equals(r9)
            if (r0 != 0) goto L_0x0170
            java.lang.String r0 = "Pixel 5"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x015d
        L_0x0159:
            r23 = r65
            goto L_0x1724
        L_0x015d:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0174
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x016d
        L_0x016c:
            goto L_0x0159
        L_0x016d:
            if (r11 == r14) goto L_0x0170
            goto L_0x016c
        L_0x0170:
            r23 = r69
            goto L_0x1724
        L_0x0174:
            r23 = r59
            goto L_0x1724
        L_0x0178:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -1069982836: goto L_0x0239;
                case -870267800: goto L_0x022d;
                case -407354123: goto L_0x0221;
                case -78464376: goto L_0x0215;
                case -78464345: goto L_0x0209;
                case -78464314: goto L_0x01fd;
                case 401880992: goto L_0x01f1;
                case 403762630: goto L_0x01e4;
                case 432595513: goto L_0x01d6;
                case 432602240: goto L_0x01c8;
                case 775883933: goto L_0x01ba;
                case 1105847545: goto L_0x01ac;
                case 1105847546: goto L_0x01a0;
                case 1105847547: goto L_0x0192;
                case 1905086331: goto L_0x0184;
                default: goto L_0x0182;
            }
        L_0x0182:
            goto L_0x0244
        L_0x0184:
            java.lang.String r0 = "Pixel 3 XL"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x018e
            goto L_0x0244
        L_0x018e:
            r21 = 14
            goto L_0x0244
        L_0x0192:
            java.lang.String r0 = "Pixel 5"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x019c
            goto L_0x0244
        L_0x019c:
            r21 = 13
            goto L_0x0244
        L_0x01a0:
            boolean r0 = r8.equals(r9)
            if (r0 != 0) goto L_0x01a8
            goto L_0x0244
        L_0x01a8:
            r21 = 12
            goto L_0x0244
        L_0x01ac:
            java.lang.String r0 = "Pixel 3"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x01b6
            goto L_0x0244
        L_0x01b6:
            r21 = 11
            goto L_0x0244
        L_0x01ba:
            java.lang.String r0 = "SM-S908U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x01c4
            goto L_0x0244
        L_0x01c4:
            r21 = 10
            goto L_0x0244
        L_0x01c8:
            java.lang.String r0 = "SM-G998U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x01d2
            goto L_0x0244
        L_0x01d2:
            r21 = 9
            goto L_0x0244
        L_0x01d6:
            java.lang.String r0 = "SM-G991U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x01e0
            goto L_0x0244
        L_0x01e0:
            r21 = 8
            goto L_0x0244
        L_0x01e4:
            java.lang.String r0 = "SM-F926U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x01ee
            goto L_0x0244
        L_0x01ee:
            r21 = 7
            goto L_0x0244
        L_0x01f1:
            java.lang.String r0 = "SM-F711U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x01fa
            goto L_0x0244
        L_0x01fa:
            r21 = 6
            goto L_0x0244
        L_0x01fd:
            java.lang.String r0 = "Pixel 5a"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0206
            goto L_0x0244
        L_0x0206:
            r21 = 5
            goto L_0x0244
        L_0x0209:
            java.lang.String r0 = "Pixel 4a"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0212
            goto L_0x0244
        L_0x0212:
            r21 = r16
            goto L_0x0244
        L_0x0215:
            java.lang.String r0 = "Pixel 3a"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x021e
            goto L_0x0244
        L_0x021e:
            r21 = r17
            goto L_0x0244
        L_0x0221:
            java.lang.String r0 = "SM-A528B"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x022a
            goto L_0x0244
        L_0x022a:
            r21 = r18
            goto L_0x0244
        L_0x022d:
            java.lang.String r0 = "Pixel 4a (5G)"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0236
            goto L_0x0244
        L_0x0236:
            r21 = r19
            goto L_0x0244
        L_0x0239:
            java.lang.String r0 = "Pixel 3a XL"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0242
            goto L_0x0244
        L_0x0242:
            r21 = r20
        L_0x0244:
            switch(r21) {
                case 0: goto L_0x026d;
                case 1: goto L_0x0174;
                case 2: goto L_0x0269;
                case 3: goto L_0x026d;
                case 4: goto L_0x0170;
                case 5: goto L_0x0174;
                case 6: goto L_0x0174;
                case 7: goto L_0x0174;
                case 8: goto L_0x0170;
                case 9: goto L_0x0174;
                case 10: goto L_0x0265;
                case 11: goto L_0x026d;
                case 12: goto L_0x025e;
                case 13: goto L_0x0249;
                case 14: goto L_0x026d;
                default: goto L_0x0247;
            }
        L_0x0247:
            goto L_0x016c
        L_0x0249:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0174
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x025a
            goto L_0x0159
        L_0x025a:
            if (r11 == r14) goto L_0x0170
            goto L_0x016c
        L_0x025e:
            r23 = 4596576621821544985(0x3fca52157689ca19, double:0.20563)
            goto L_0x1724
        L_0x0265:
            r23 = r35
            goto L_0x1724
        L_0x0269:
            r23 = r29
            goto L_0x1724
        L_0x026d:
            r23 = r63
            goto L_0x1724
        L_0x0271:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -78464314: goto L_0x02c4;
                case 401880992: goto L_0x02b8;
                case 403762630: goto L_0x02ac;
                case 432595513: goto L_0x02a0;
                case 1105847546: goto L_0x0296;
                case 1105847547: goto L_0x028a;
                case 1905116122: goto L_0x027e;
                default: goto L_0x027b;
            }
        L_0x027b:
            r71 = r21
            goto L_0x02cf
        L_0x027e:
            java.lang.String r0 = "Pixel 4 XL"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0287
            goto L_0x027b
        L_0x0287:
            r71 = 6
            goto L_0x02cf
        L_0x028a:
            java.lang.String r0 = "Pixel 5"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0293
            goto L_0x027b
        L_0x0293:
            r71 = 5
            goto L_0x02cf
        L_0x0296:
            boolean r0 = r8.equals(r9)
            if (r0 != 0) goto L_0x029d
            goto L_0x027b
        L_0x029d:
            r71 = r16
            goto L_0x02cf
        L_0x02a0:
            java.lang.String r0 = "SM-G991U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x02a9
            goto L_0x027b
        L_0x02a9:
            r71 = r17
            goto L_0x02cf
        L_0x02ac:
            java.lang.String r0 = "SM-F926U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x02b5
            goto L_0x027b
        L_0x02b5:
            r71 = r18
            goto L_0x02cf
        L_0x02b8:
            java.lang.String r0 = "SM-F711U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x02c1
            goto L_0x027b
        L_0x02c1:
            r71 = r19
            goto L_0x02cf
        L_0x02c4:
            java.lang.String r0 = "Pixel 5a"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x02cd
            goto L_0x027b
        L_0x02cd:
            r71 = r20
        L_0x02cf:
            switch(r71) {
                case 0: goto L_0x0332;
                case 1: goto L_0x0304;
                case 2: goto L_0x02f4;
                case 3: goto L_0x0174;
                case 4: goto L_0x02e7;
                case 5: goto L_0x02d6;
                case 6: goto L_0x0170;
                default: goto L_0x02d2;
            }
        L_0x02d2:
            r23 = r67
            goto L_0x1724
        L_0x02d6:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0269
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0174
            goto L_0x0159
        L_0x02e7:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0170
        L_0x02f0:
            r23 = r61
            goto L_0x1724
        L_0x02f4:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0170
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0174
            goto L_0x02d2
        L_0x0304:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x0322;
                case -1719904874: goto L_0x0318;
                case 802059049: goto L_0x0311;
                default: goto L_0x030e;
            }
        L_0x030e:
            r18 = r21
            goto L_0x032b
        L_0x0311:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x032b
            goto L_0x030e
        L_0x0318:
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x031f
            goto L_0x030e
        L_0x031f:
            r18 = r19
            goto L_0x032b
        L_0x0322:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0329
            goto L_0x030e
        L_0x0329:
            r18 = r20
        L_0x032b:
            switch(r18) {
                case 0: goto L_0x0170;
                case 1: goto L_0x0174;
                case 2: goto L_0x032f;
                default: goto L_0x032e;
            }
        L_0x032e:
            goto L_0x02d2
        L_0x032f:
            if (r11 == r14) goto L_0x026d
            goto L_0x02d2
        L_0x0332:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0174
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0343
            goto L_0x016c
        L_0x0343:
            if (r11 == r14) goto L_0x0170
            goto L_0x0159
        L_0x0347:
            r8.getClass()
            java.lang.String r0 = "Pixel 3"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x039c
            boolean r0 = r8.equals(r9)
            if (r0 != 0) goto L_0x035a
            goto L_0x012e
        L_0x035a:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x0382;
                case -1719904874: goto L_0x0378;
                case 802059049: goto L_0x036e;
                case 1514345136: goto L_0x0367;
                default: goto L_0x0364;
            }
        L_0x0364:
            r17 = r21
            goto L_0x038b
        L_0x0367:
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x038b
            goto L_0x0364
        L_0x036e:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0375
            goto L_0x0364
        L_0x0375:
            r17 = r18
            goto L_0x038b
        L_0x0378:
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x037f
            goto L_0x0364
        L_0x037f:
            r17 = r19
            goto L_0x038b
        L_0x0382:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0389
            goto L_0x0364
        L_0x0389:
            r17 = r20
        L_0x038b:
            switch(r17) {
                case 0: goto L_0x0398;
                case 1: goto L_0x0398;
                case 2: goto L_0x0394;
                case 3: goto L_0x0390;
                default: goto L_0x038e;
            }
        L_0x038e:
            goto L_0x012e
        L_0x0390:
            r23 = r27
            goto L_0x1724
        L_0x0394:
            if (r11 == r14) goto L_0x0170
            goto L_0x012e
        L_0x0398:
            r23 = r45
            goto L_0x1724
        L_0x039c:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0170
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x026d
            goto L_0x02d2
        L_0x03ad:
            r23 = 4589708452245819884(0x3fb1eb851eb851ec, double:0.07)
            if (r7 == r3) goto L_0x03b6
            goto L_0x1724
        L_0x03b6:
            r8.getClass()
            java.lang.String r0 = "SM-G965N"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x03c3
            goto L_0x1724
        L_0x03c3:
            r23 = 4587726868409776865(0x3faae147ae147ae1, double:0.0525)
            goto L_0x1724
        L_0x03ca:
            r23 = 4596694796275767187(0x3fcabd9018e75793, double:0.20891)
            r25 = 4596067534919667024(0x3fc883126e978d50, double:0.1915)
            r29 = 4603692129088805274(0x3fe399999999999a, double:0.6125)
            r31 = 4591563935292296528(0x3fb883126e978d50, double:0.09575)
            r33 = 4595788311742770053(0x3fc7851eb851eb85, double:0.18375)
            r47 = 4602341049200594125(0x3fdecccccccccccd, double:0.48125)
            switch(r7) {
                case 23: goto L_0x101c;
                case 24: goto L_0x0faa;
                case 25: goto L_0x0eec;
                case 26: goto L_0x0b17;
                case 27: goto L_0x0923;
                case 28: goto L_0x0565;
                case 29: goto L_0x04ae;
                case 30: goto L_0x0404;
                case 31: goto L_0x0170;
                case 32: goto L_0x03ef;
                default: goto L_0x03eb;
            }
        L_0x03eb:
            r23 = r39
            goto L_0x1724
        L_0x03ef:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0265
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0400
            goto L_0x02f0
        L_0x0400:
            if (r11 == r14) goto L_0x0174
            goto L_0x02f0
        L_0x0404:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -2038157987: goto L_0x0481;
                case -407445445: goto L_0x0475;
                case -407295591: goto L_0x0469;
                case -396392085: goto L_0x045d;
                case -395223463: goto L_0x0451;
                case 403732839: goto L_0x0445;
                case 768522173: goto L_0x0439;
                case 1241611957: goto L_0x042c;
                case 1465879103: goto L_0x041e;
                case 1691568319: goto L_0x0410;
                default: goto L_0x040e;
            }
        L_0x040e:
            goto L_0x048c
        L_0x0410:
            java.lang.String r0 = "CPH2127"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x041a
            goto L_0x048c
        L_0x041a:
            r21 = 9
            goto L_0x048c
        L_0x041e:
            java.lang.String r0 = "M2101K7AG"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0428
            goto L_0x048c
        L_0x0428:
            r21 = 8
            goto L_0x048c
        L_0x042c:
            java.lang.String r0 = "Redmi Note 9S"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0436
            goto L_0x048c
        L_0x0436:
            r21 = 7
            goto L_0x048c
        L_0x0439:
            java.lang.String r0 = "SM-S115DL"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0442
            goto L_0x048c
        L_0x0442:
            r21 = 6
            goto L_0x048c
        L_0x0445:
            java.lang.String r0 = "SM-F916U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x044e
            goto L_0x048c
        L_0x044e:
            r21 = 5
            goto L_0x048c
        L_0x0451:
            java.lang.String r0 = "SM-N986U"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x045a
            goto L_0x048c
        L_0x045a:
            r21 = r16
            goto L_0x048c
        L_0x045d:
            java.lang.String r0 = "SM-M115F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0466
            goto L_0x048c
        L_0x0466:
            r21 = r17
            goto L_0x048c
        L_0x0469:
            java.lang.String r0 = "SM-A715F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0472
            goto L_0x048c
        L_0x0472:
            r21 = r18
            goto L_0x048c
        L_0x0475:
            java.lang.String r0 = "SM-A207F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x047e
            goto L_0x048c
        L_0x047e:
            r21 = r19
            goto L_0x048c
        L_0x0481:
            java.lang.String r0 = "Redmi Note 8"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x048a
            goto L_0x048c
        L_0x048a:
            r21 = r20
        L_0x048c:
            switch(r21) {
                case 0: goto L_0x0174;
                case 1: goto L_0x04aa;
                case 2: goto L_0x0174;
                case 3: goto L_0x04aa;
                case 4: goto L_0x0398;
                case 5: goto L_0x0491;
                case 6: goto L_0x04aa;
                case 7: goto L_0x0174;
                case 8: goto L_0x0174;
                case 9: goto L_0x0174;
                default: goto L_0x048f;
            }
        L_0x048f:
            goto L_0x02f0
        L_0x0491:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x04a6
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x04a2
            goto L_0x02f0
        L_0x04a2:
            if (r11 == r14) goto L_0x0174
            goto L_0x02f0
        L_0x04a6:
            r23 = r55
            goto L_0x1724
        L_0x04aa:
            r23 = r51
            goto L_0x1724
        L_0x04ae:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -1546863963: goto L_0x052b;
                case -1288580290: goto L_0x051f;
                case -478880298: goto L_0x0513;
                case -395224492: goto L_0x0507;
                case -78463250: goto L_0x04fb;
                case 432505179: goto L_0x04ef;
                case 432565722: goto L_0x04e3;
                case 602019019: goto L_0x04d6;
                case 1691546241: goto L_0x04c8;
                case 1905056540: goto L_0x04ba;
                default: goto L_0x04b8;
            }
        L_0x04b8:
            goto L_0x0536
        L_0x04ba:
            java.lang.String r0 = "Pixel 2 XL"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x04c4
            goto L_0x0536
        L_0x04c4:
            r21 = 9
            goto L_0x0536
        L_0x04c8:
            java.lang.String r0 = "CPH1931"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x04d2
            goto L_0x0536
        L_0x04d2:
            r21 = 8
            goto L_0x0536
        L_0x04d6:
            java.lang.String r0 = "Redmi Note 9 Pro"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x04e0
            goto L_0x0536
        L_0x04e0:
            r21 = 7
            goto L_0x0536
        L_0x04e3:
            java.lang.String r0 = "SM-G981U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x04ec
            goto L_0x0536
        L_0x04ec:
            r21 = 6
            goto L_0x0536
        L_0x04ef:
            java.lang.String r0 = "SM-G960U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x04f8
            goto L_0x0536
        L_0x04f8:
            r21 = 5
            goto L_0x0536
        L_0x04fb:
            java.lang.String r0 = "Pixel XL"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0504
            goto L_0x0536
        L_0x0504:
            r21 = r16
            goto L_0x0536
        L_0x0507:
            java.lang.String r0 = "SM-N9750"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0510
            goto L_0x0536
        L_0x0510:
            r21 = r17
            goto L_0x0536
        L_0x0513:
            java.lang.String r0 = "moto g(7)"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x051c
            goto L_0x0536
        L_0x051c:
            r21 = r18
            goto L_0x0536
        L_0x051f:
            java.lang.String r0 = "moto g(7) play"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0528
            goto L_0x0536
        L_0x0528:
            r21 = r19
            goto L_0x0536
        L_0x052b:
            java.lang.String r0 = "Redmi 8"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0534
            goto L_0x0536
        L_0x0534:
            r21 = r20
        L_0x0536:
            switch(r21) {
                case 0: goto L_0x02f0;
                case 1: goto L_0x04aa;
                case 2: goto L_0x04aa;
                case 3: goto L_0x0170;
                case 4: goto L_0x0561;
                case 5: goto L_0x0561;
                case 6: goto L_0x054c;
                case 7: goto L_0x0174;
                case 8: goto L_0x0174;
                case 9: goto L_0x053b;
                default: goto L_0x0539;
            }
        L_0x0539:
            goto L_0x02d2
        L_0x053b:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x04aa
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x012e
            goto L_0x02d2
        L_0x054c:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x02f0
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x055d
            goto L_0x02d2
        L_0x055d:
            if (r11 == r14) goto L_0x0174
            goto L_0x02d2
        L_0x0561:
            r23 = r43
            goto L_0x1724
        L_0x0565:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -1910414559: goto L_0x070d;
                case -1890032429: goto L_0x0700;
                case -1855483508: goto L_0x06f3;
                case -1855483477: goto L_0x06e6;
                case -1850865933: goto L_0x06d9;
                case -1850865872: goto L_0x06cd;
                case -1809870076: goto L_0x06c1;
                case -1398045836: goto L_0x06b5;
                case -1288579676: goto L_0x06a7;
                case -509282085: goto L_0x0699;
                case -399073275: goto L_0x068b;
                case -389717862: goto L_0x067d;
                case -389716901: goto L_0x066f;
                case -78464376: goto L_0x0661;
                case 53196885: goto L_0x0653;
                case 68211431: goto L_0x0645;
                case 68211586: goto L_0x0637;
                case 68213353: goto L_0x0629;
                case 68243389: goto L_0x061b;
                case 74271988: goto L_0x060d;
                case 78881479: goto L_0x05ff;
                case 206187613: goto L_0x05f1;
                case 513630441: goto L_0x05e4;
                case 599248456: goto L_0x05d7;
                case 632879445: goto L_0x05ca;
                case 979275507: goto L_0x05bd;
                case 979419631: goto L_0x05b0;
                case 1105847545: goto L_0x05a3;
                case 1311300219: goto L_0x059a;
                case 1311330013: goto L_0x058d;
                case 1682561561: goto L_0x0580;
                case 1905056540: goto L_0x0573;
                default: goto L_0x056f;
            }
        L_0x056f:
            r3 = r21
            goto L_0x0719
        L_0x0573:
            java.lang.String r0 = "Pixel 2 XL"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x057c
            goto L_0x056f
        L_0x057c:
            r3 = 31
            goto L_0x0719
        L_0x0580:
            java.lang.String r0 = "ASUS_X00TD"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0589
            goto L_0x056f
        L_0x0589:
            r3 = 30
            goto L_0x0719
        L_0x058d:
            java.lang.String r0 = "ONEPLUS A6013"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0596
            goto L_0x056f
        L_0x0596:
            r3 = 29
            goto L_0x0719
        L_0x059a:
            java.lang.String r0 = "ONEPLUS A5010"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0719
            goto L_0x056f
        L_0x05a3:
            java.lang.String r0 = "Pixel 3"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x05ac
            goto L_0x056f
        L_0x05ac:
            r3 = 27
            goto L_0x0719
        L_0x05b0:
            java.lang.String r0 = "LM-V405"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x05b9
            goto L_0x056f
        L_0x05b9:
            r3 = 26
            goto L_0x0719
        L_0x05bd:
            java.lang.String r0 = "LM-Q910"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x05c6
            goto L_0x056f
        L_0x05c6:
            r3 = 25
            goto L_0x0719
        L_0x05ca:
            java.lang.String r0 = "SM-N950U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x05d3
            goto L_0x056f
        L_0x05d3:
            r3 = 24
            goto L_0x0719
        L_0x05d7:
            java.lang.String r0 = "Redmi Note 6 Pro"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x05e0
            goto L_0x056f
        L_0x05e0:
            r3 = 23
            goto L_0x0719
        L_0x05e4:
            java.lang.String r0 = "SM-J415FN"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x05ed
            goto L_0x056f
        L_0x05ed:
            r3 = 22
            goto L_0x0719
        L_0x05f1:
            java.lang.String r0 = "Nokia 7.2"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x05fb
            goto L_0x056f
        L_0x05fb:
            r3 = 21
            goto L_0x0719
        L_0x05ff:
            java.lang.String r0 = "SHV39"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0609
            goto L_0x056f
        L_0x0609:
            r3 = 20
            goto L_0x0719
        L_0x060d:
            java.lang.String r0 = "Mi A1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0617
            goto L_0x056f
        L_0x0617:
            r3 = 19
            goto L_0x0719
        L_0x061b:
            java.lang.String r0 = "H9493"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0625
            goto L_0x056f
        L_0x0625:
            r3 = 18
            goto L_0x0719
        L_0x0629:
            java.lang.String r0 = "H8416"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0633
            goto L_0x056f
        L_0x0633:
            r3 = 17
            goto L_0x0719
        L_0x0637:
            java.lang.String r0 = "H8266"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0641
            goto L_0x056f
        L_0x0641:
            r3 = 16
            goto L_0x0719
        L_0x0645:
            java.lang.String r0 = "H8216"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x064f
            goto L_0x056f
        L_0x064f:
            r3 = 15
            goto L_0x0719
        L_0x0653:
            java.lang.String r0 = "801SO"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x065d
            goto L_0x056f
        L_0x065d:
            r3 = 14
            goto L_0x0719
        L_0x0661:
            java.lang.String r0 = "Pixel 3a"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x066b
            goto L_0x056f
        L_0x066b:
            r3 = 13
            goto L_0x0719
        L_0x066f:
            java.lang.String r0 = "SM-T837V"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0679
            goto L_0x056f
        L_0x0679:
            r3 = 12
            goto L_0x0719
        L_0x067d:
            java.lang.String r0 = "SM-T827V"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0687
            goto L_0x056f
        L_0x0687:
            r3 = 11
            goto L_0x0719
        L_0x068b:
            java.lang.String r0 = "SM-J415F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0695
            goto L_0x056f
        L_0x0695:
            r3 = 10
            goto L_0x0719
        L_0x0699:
            java.lang.String r0 = "Nokia 9"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x06a3
            goto L_0x056f
        L_0x06a3:
            r3 = 9
            goto L_0x0719
        L_0x06a7:
            java.lang.String r0 = "moto g(7) plus"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x06b1
            goto L_0x056f
        L_0x06b1:
            r3 = 8
            goto L_0x0719
        L_0x06b5:
            java.lang.String r0 = "SM-T720"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x06bf
            goto L_0x056f
        L_0x06bf:
            r3 = 7
            goto L_0x0719
        L_0x06c1:
            java.lang.String r0 = "U693CL"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x06cb
            goto L_0x056f
        L_0x06cb:
            r3 = 6
            goto L_0x0719
        L_0x06cd:
            java.lang.String r0 = "SH-03K"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x06d7
            goto L_0x056f
        L_0x06d7:
            r3 = 5
            goto L_0x0719
        L_0x06d9:
            java.lang.String r0 = "SH-01L"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x06e3
            goto L_0x056f
        L_0x06e3:
            r3 = r16
            goto L_0x0719
        L_0x06e6:
            java.lang.String r0 = "SC-03K"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x06f0
            goto L_0x056f
        L_0x06f0:
            r3 = r17
            goto L_0x0719
        L_0x06f3:
            java.lang.String r0 = "SC-02K"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x06fd
            goto L_0x056f
        L_0x06fd:
            r3 = r18
            goto L_0x0719
        L_0x0700:
            java.lang.String r0 = "MI MAX 3"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x070a
            goto L_0x056f
        L_0x070a:
            r3 = r19
            goto L_0x0719
        L_0x070d:
            java.lang.String r0 = "MI 8 Pro"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0717
            goto L_0x056f
        L_0x0717:
            r3 = r20
        L_0x0719:
            switch(r3) {
                case 0: goto L_0x0914;
                case 1: goto L_0x08ff;
                case 2: goto L_0x0914;
                case 3: goto L_0x08ee;
                case 4: goto L_0x08d9;
                case 5: goto L_0x08c4;
                case 6: goto L_0x08c0;
                case 7: goto L_0x08a7;
                case 8: goto L_0x0877;
                case 9: goto L_0x0873;
                case 10: goto L_0x08c0;
                case 11: goto L_0x085e;
                case 12: goto L_0x082e;
                case 13: goto L_0x082a;
                case 14: goto L_0x081f;
                case 15: goto L_0x0812;
                case 16: goto L_0x0805;
                case 17: goto L_0x07f8;
                case 18: goto L_0x081f;
                case 19: goto L_0x07e3;
                case 20: goto L_0x07af;
                case 21: goto L_0x077b;
                case 22: goto L_0x08c0;
                case 23: goto L_0x077b;
                case 24: goto L_0x0174;
                case 25: goto L_0x082e;
                case 26: goto L_0x076c;
                case 27: goto L_0x0753;
                case 28: goto L_0x0748;
                case 29: goto L_0x0737;
                case 30: goto L_0x071e;
                case 31: goto L_0x082e;
                default: goto L_0x071c;
            }
        L_0x071c:
            goto L_0x03eb
        L_0x071e:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0733
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x072f
            goto L_0x02d2
        L_0x072f:
            if (r11 == r14) goto L_0x026d
            goto L_0x02d2
        L_0x0733:
            r23 = r41
            goto L_0x1724
        L_0x0737:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0170
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x04a6
            goto L_0x02f0
        L_0x0748:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0170
            goto L_0x0174
        L_0x0753:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0768
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x0764
            goto L_0x0170
        L_0x0764:
            r23 = r31
            goto L_0x1724
        L_0x0768:
            if (r11 == r14) goto L_0x04a6
            goto L_0x0170
        L_0x076c:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0777
            goto L_0x02f0
        L_0x0777:
            if (r11 == r14) goto L_0x04a6
            goto L_0x0170
        L_0x077b:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x0799;
                case 802059049: goto L_0x078f;
                case 1514345136: goto L_0x0788;
                default: goto L_0x0785;
            }
        L_0x0785:
            r18 = r21
            goto L_0x07a2
        L_0x0788:
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x07a2
            goto L_0x0785
        L_0x078f:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0796
            goto L_0x0785
        L_0x0796:
            r18 = r19
            goto L_0x07a2
        L_0x0799:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x07a0
            goto L_0x0785
        L_0x07a0:
            r18 = r20
        L_0x07a2:
            switch(r18) {
                case 0: goto L_0x0159;
                case 1: goto L_0x07ab;
                case 2: goto L_0x07a7;
                default: goto L_0x07a5;
            }
        L_0x07a5:
            goto L_0x02d2
        L_0x07a7:
            r23 = r25
            goto L_0x1724
        L_0x07ab:
            if (r11 == r14) goto L_0x026d
            goto L_0x02d2
        L_0x07af:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x07cd;
                case -1719904874: goto L_0x07c3;
                case 802059049: goto L_0x07bc;
                default: goto L_0x07b9;
            }
        L_0x07b9:
            r18 = r21
            goto L_0x07d6
        L_0x07bc:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x07d6
            goto L_0x07b9
        L_0x07c3:
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x07ca
            goto L_0x07b9
        L_0x07ca:
            r18 = r19
            goto L_0x07d6
        L_0x07cd:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x07d4
            goto L_0x07b9
        L_0x07d4:
            r18 = r20
        L_0x07d6:
            switch(r18) {
                case 0: goto L_0x0561;
                case 1: goto L_0x07df;
                case 2: goto L_0x07db;
                default: goto L_0x07d9;
            }
        L_0x07d9:
            goto L_0x02d2
        L_0x07db:
            if (r11 == r14) goto L_0x026d
            goto L_0x02d2
        L_0x07df:
            r23 = r37
            goto L_0x1724
        L_0x07e3:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0174
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x07f4
            goto L_0x02d2
        L_0x07f4:
            if (r11 == r14) goto L_0x0159
            goto L_0x02d2
        L_0x07f8:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x02f0
        L_0x0801:
            r23 = r57
            goto L_0x1724
        L_0x0805:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x02f0
        L_0x080e:
            r23 = r53
            goto L_0x1724
        L_0x0812:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x081c
            goto L_0x080e
        L_0x081c:
            if (r11 == r14) goto L_0x02f0
        L_0x081e:
            goto L_0x080e
        L_0x081f:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0170
            goto L_0x02f0
        L_0x082a:
            if (r11 == r14) goto L_0x026d
            goto L_0x02d2
        L_0x082e:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x084c;
                case -1719904874: goto L_0x0842;
                case 802059049: goto L_0x083b;
                default: goto L_0x0838;
            }
        L_0x0838:
            r18 = r21
            goto L_0x0855
        L_0x083b:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0855
            goto L_0x0838
        L_0x0842:
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0849
            goto L_0x0838
        L_0x0849:
            r18 = r19
            goto L_0x0855
        L_0x084c:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0853
            goto L_0x0838
        L_0x0853:
            r18 = r20
        L_0x0855:
            switch(r18) {
                case 0: goto L_0x0170;
                case 1: goto L_0x02f0;
                case 2: goto L_0x085a;
                default: goto L_0x0858;
            }
        L_0x0858:
            goto L_0x02d2
        L_0x085a:
            if (r11 == r14) goto L_0x026d
            goto L_0x02d2
        L_0x085e:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0174
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x086f
            goto L_0x02d2
        L_0x086f:
            if (r11 == r14) goto L_0x026d
            goto L_0x02d2
        L_0x0873:
            if (r11 == r14) goto L_0x04a6
            goto L_0x0170
        L_0x0877:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x0895;
                case 802059049: goto L_0x088b;
                case 1514345136: goto L_0x0884;
                default: goto L_0x0881;
            }
        L_0x0881:
            r18 = r21
            goto L_0x089e
        L_0x0884:
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x089e
            goto L_0x0881
        L_0x088b:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0892
            goto L_0x0881
        L_0x0892:
            r18 = r19
            goto L_0x089e
        L_0x0895:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x089c
            goto L_0x0881
        L_0x089c:
            r18 = r20
        L_0x089e:
            switch(r18) {
                case 0: goto L_0x04aa;
                case 1: goto L_0x08a3;
                case 2: goto L_0x1724;
                default: goto L_0x08a1;
            }
        L_0x08a1:
            goto L_0x02d2
        L_0x08a3:
            if (r11 == r14) goto L_0x0159
            goto L_0x02d2
        L_0x08a7:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0170
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x08b8
            goto L_0x02f0
        L_0x08b8:
            if (r11 == r14) goto L_0x08bc
            goto L_0x0170
        L_0x08bc:
            r23 = r33
            goto L_0x1724
        L_0x08c0:
            r23 = r49
            goto L_0x1724
        L_0x08c4:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x080e
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x08d5
            goto L_0x03eb
        L_0x08d5:
            if (r11 == r12) goto L_0x02d2
            goto L_0x03eb
        L_0x08d9:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x04aa
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x08ea
            goto L_0x02d2
        L_0x08ea:
            if (r11 == r14) goto L_0x0159
            goto L_0x02d2
        L_0x08ee:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0170
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0170
            goto L_0x02f0
        L_0x08ff:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0159
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0910
            goto L_0x02d2
        L_0x0910:
            if (r11 == r14) goto L_0x026d
            goto L_0x02d2
        L_0x0914:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x091f
            goto L_0x0170
        L_0x091f:
            if (r11 == r14) goto L_0x04a6
            goto L_0x0170
        L_0x0923:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -2038157990: goto L_0x09f5;
                case -1578412503: goto L_0x09e8;
                case -1157762381: goto L_0x09db;
                case -929944936: goto L_0x09ce;
                case -398982863: goto L_0x09c1;
                case 2568591: goto L_0x09b4;
                case 66034788: goto L_0x09a7;
                case 136552289: goto L_0x099b;
                case 206182807: goto L_0x098e;
                case 340385120: goto L_0x0981;
                case 511927773: goto L_0x0974;
                case 632909236: goto L_0x0967;
                case 1105847544: goto L_0x095a;
                case 1467059320: goto L_0x094d;
                case 1682561561: goto L_0x0940;
                case 1905056540: goto L_0x0931;
                default: goto L_0x092d;
            }
        L_0x092d:
            r22 = r21
            goto L_0x0a01
        L_0x0931:
            java.lang.String r0 = "Pixel 2 XL"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x093a
            goto L_0x092d
        L_0x093a:
            r0 = 15
            r22 = r0
            goto L_0x0a01
        L_0x0940:
            java.lang.String r0 = "ASUS_X00TD"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0949
            goto L_0x092d
        L_0x0949:
            r22 = 14
            goto L_0x0a01
        L_0x094d:
            java.lang.String r0 = "Redmi 5 Plus"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0956
            goto L_0x092d
        L_0x0956:
            r22 = 13
            goto L_0x0a01
        L_0x095a:
            java.lang.String r0 = "Pixel 2"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0963
            goto L_0x092d
        L_0x0963:
            r22 = 12
            goto L_0x0a01
        L_0x0967:
            java.lang.String r0 = "SM-N960U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0970
            goto L_0x092d
        L_0x0970:
            r22 = 11
            goto L_0x0a01
        L_0x0974:
            java.lang.String r0 = "SM-J260MU"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x097d
            goto L_0x092d
        L_0x097d:
            r22 = 10
            goto L_0x0a01
        L_0x0981:
            java.lang.String r0 = "vivo 1805"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x098a
            goto L_0x092d
        L_0x098a:
            r22 = 9
            goto L_0x0a01
        L_0x098e:
            java.lang.String r0 = "Nokia 2.1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0997
            goto L_0x092d
        L_0x0997:
            r22 = 8
            goto L_0x0a01
        L_0x099b:
            java.lang.String r0 = "moto e5 play"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x09a4
            goto L_0x092d
        L_0x09a4:
            r22 = 7
            goto L_0x0a01
        L_0x09a7:
            java.lang.String r0 = "F-01L"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x09b1
            goto L_0x092d
        L_0x09b1:
            r22 = 6
            goto L_0x0a01
        L_0x09b4:
            java.lang.String r0 = "TC77"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x09be
            goto L_0x092d
        L_0x09be:
            r22 = 5
            goto L_0x0a01
        L_0x09c1:
            java.lang.String r0 = "SM-J727V"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x09cb
            goto L_0x092d
        L_0x09cb:
            r22 = r16
            goto L_0x0a01
        L_0x09ce:
            java.lang.String r0 = "Moto Z3 Play"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x09d8
            goto L_0x092d
        L_0x09d8:
            r22 = r17
            goto L_0x0a01
        L_0x09db:
            java.lang.String r0 = "Lenovo TB-8504F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x09e5
            goto L_0x092d
        L_0x09e5:
            r22 = r18
            goto L_0x0a01
        L_0x09e8:
            java.lang.String r0 = "DUB-LX1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x09f2
            goto L_0x092d
        L_0x09f2:
            r22 = r19
            goto L_0x0a01
        L_0x09f5:
            java.lang.String r0 = "Redmi Note 5"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x09ff
            goto L_0x092d
        L_0x09ff:
            r22 = r20
        L_0x0a01:
            switch(r22) {
                case 0: goto L_0x0b13;
                case 1: goto L_0x0174;
                case 2: goto L_0x0b02;
                case 3: goto L_0x0af7;
                case 4: goto L_0x0aec;
                case 5: goto L_0x0ab2;
                case 6: goto L_0x0a82;
                case 7: goto L_0x0b02;
                case 8: goto L_0x0a71;
                case 9: goto L_0x0a60;
                case 10: goto L_0x08c0;
                case 11: goto L_0x0a4b;
                case 12: goto L_0x0170;
                case 13: goto L_0x0a2f;
                case 14: goto L_0x0a1b;
                case 15: goto L_0x0a06;
                default: goto L_0x0a04;
            }
        L_0x0a04:
            goto L_0x02d2
        L_0x0a06:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0170
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0a17
            goto L_0x026d
        L_0x0a17:
            if (r11 == r12) goto L_0x0170
            goto L_0x026d
        L_0x0a1b:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0a2b
            r23 = 4601946894161206659(0x3fdd66516db0dd83, double:0.45937)
            goto L_0x1724
        L_0x0a2b:
            if (r11 == r14) goto L_0x0159
            goto L_0x0733
        L_0x0a2f:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0a47
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x0a40
            goto L_0x04aa
        L_0x0a40:
            r23 = 4595440273563566861(0x3fc64894c447c30d, double:0.17409)
            goto L_0x1724
        L_0x0a47:
            if (r11 == r12) goto L_0x026d
            goto L_0x016c
        L_0x0a4b:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0170
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0a5c
        L_0x0a5a:
            goto L_0x02f0
        L_0x0a5c:
            if (r11 == r14) goto L_0x08bc
            goto L_0x0170
        L_0x0a60:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0170
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0170
            goto L_0x02f0
        L_0x0a71:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0801
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x02f0
            goto L_0x012e
        L_0x0a82:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x0aa0;
                case -1719904874: goto L_0x0a96;
                case 802059049: goto L_0x0a8f;
                default: goto L_0x0a8c;
            }
        L_0x0a8c:
            r18 = r21
            goto L_0x0aa9
        L_0x0a8f:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0aa9
            goto L_0x0a8c
        L_0x0a96:
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0a9d
            goto L_0x0a8c
        L_0x0a9d:
            r18 = r19
            goto L_0x0aa9
        L_0x0aa0:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0aa7
            goto L_0x0a8c
        L_0x0aa7:
            r18 = r20
        L_0x0aa9:
            switch(r18) {
                case 0: goto L_0x04aa;
                case 1: goto L_0x012e;
                case 2: goto L_0x0aae;
                default: goto L_0x0aac;
            }
        L_0x0aac:
            goto L_0x02d2
        L_0x0aae:
            if (r11 == r14) goto L_0x0159
            goto L_0x02d2
        L_0x0ab2:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x0ada;
                case -1719904874: goto L_0x0ad0;
                case 802059049: goto L_0x0ac6;
                case 1514345136: goto L_0x0abf;
                default: goto L_0x0abc;
            }
        L_0x0abc:
            r17 = r21
            goto L_0x0ae3
        L_0x0abf:
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x0ae3
            goto L_0x0abc
        L_0x0ac6:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0acd
            goto L_0x0abc
        L_0x0acd:
            r17 = r18
            goto L_0x0ae3
        L_0x0ad0:
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0ad7
            goto L_0x0abc
        L_0x0ad7:
            r17 = r19
            goto L_0x0ae3
        L_0x0ada:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0ae1
            goto L_0x0abc
        L_0x0ae1:
            r17 = r20
        L_0x0ae3:
            switch(r17) {
                case 0: goto L_0x0801;
                case 1: goto L_0x0269;
                case 2: goto L_0x0ae8;
                case 3: goto L_0x07a7;
                default: goto L_0x0ae6;
            }
        L_0x0ae6:
            goto L_0x02d2
        L_0x0ae8:
            if (r11 == r14) goto L_0x0159
            goto L_0x02d2
        L_0x0aec:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0170
            goto L_0x0159
        L_0x0af7:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x04aa
            goto L_0x02d2
        L_0x0b02:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0801
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x02f0
            goto L_0x012e
        L_0x0b13:
            if (r11 == r12) goto L_0x026d
            goto L_0x0159
        L_0x0b17:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -1899903032: goto L_0x0d30;
                case -1844401288: goto L_0x0d23;
                case -615500520: goto L_0x0d16;
                case -615476526: goto L_0x0d09;
                case -478880329: goto L_0x0cfc;
                case -407235225: goto L_0x0cf0;
                case -407235203: goto L_0x0ce4;
                case -401717969: goto L_0x0cd8;
                case -401717934: goto L_0x0cca;
                case -401717084: goto L_0x0cbc;
                case -401717064: goto L_0x0cae;
                case -401693100: goto L_0x0ca0;
                case -401692947: goto L_0x0c92;
                case -401691024: goto L_0x0c84;
                case -401691022: goto L_0x0c76;
                case -401690100: goto L_0x0c68;
                case -395226532: goto L_0x0c5a;
                case 66365407: goto L_0x0c4c;
                case 66365408: goto L_0x0c3e;
                case 67288960: goto L_0x0c30;
                case 67289920: goto L_0x0c22;
                case 68212390: goto L_0x0c14;
                case 68212421: goto L_0x0c06;
                case 73318370: goto L_0x0bf8;
                case 77128294: goto L_0x0bea;
                case 79090010: goto L_0x0bdc;
                case 136552289: goto L_0x0bce;
                case 432420521: goto L_0x0bc0;
                case 432475388: goto L_0x0bb6;
                case 432480193: goto L_0x0ba8;
                case 432505179: goto L_0x0b9a;
                case 432509984: goto L_0x0b8d;
                case 740519914: goto L_0x0b80;
                case 807232546: goto L_0x0b73;
                case 1105847544: goto L_0x0b66;
                case 1311240609: goto L_0x0b59;
                case 1743099574: goto L_0x0b4c;
                case 1882314478: goto L_0x0b3f;
                case 2005978936: goto L_0x0b32;
                case 2140902952: goto L_0x0b25;
                default: goto L_0x0b21;
            }
        L_0x0b21:
            r3 = r21
            goto L_0x0d3c
        L_0x0b25:
            java.lang.String r0 = "HTC 10"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0b2e
            goto L_0x0b21
        L_0x0b2e:
            r3 = 39
            goto L_0x0d3c
        L_0x0b32:
            java.lang.String r0 = "MI 5s Plus"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0b3b
            goto L_0x0b21
        L_0x0b3b:
            r3 = 38
            goto L_0x0d3c
        L_0x0b3f:
            java.lang.String r0 = "HTC U11 plus"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0b48
            goto L_0x0b21
        L_0x0b48:
            r3 = 37
            goto L_0x0d3c
        L_0x0b4c:
            java.lang.String r0 = "Nokia 8 Sirocco"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0b55
            goto L_0x0b21
        L_0x0b55:
            r3 = 36
            goto L_0x0d3c
        L_0x0b59:
            java.lang.String r0 = "ONEPLUS A3003"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0b62
            goto L_0x0b21
        L_0x0b62:
            r3 = 35
            goto L_0x0d3c
        L_0x0b66:
            java.lang.String r0 = "Pixel 2"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0b6f
            goto L_0x0b21
        L_0x0b6f:
            r3 = 34
            goto L_0x0d3c
        L_0x0b73:
            java.lang.String r0 = "LG-H932"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0b7c
            goto L_0x0b21
        L_0x0b7c:
            r3 = 33
            goto L_0x0d3c
        L_0x0b80:
            java.lang.String r0 = "Mi MIX 2"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0b89
            goto L_0x0b21
        L_0x0b89:
            r3 = 32
            goto L_0x0d3c
        L_0x0b8d:
            java.lang.String r0 = "SM-G965U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0b96
            goto L_0x0b21
        L_0x0b96:
            r3 = 31
            goto L_0x0d3c
        L_0x0b9a:
            java.lang.String r0 = "SM-G960U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0ba4
            goto L_0x0b21
        L_0x0ba4:
            r3 = 30
            goto L_0x0d3c
        L_0x0ba8:
            java.lang.String r0 = "SM-G955U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0bb2
            goto L_0x0b21
        L_0x0bb2:
            r3 = 29
            goto L_0x0d3c
        L_0x0bb6:
            java.lang.String r0 = "SM-G950U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0d3c
            goto L_0x0b21
        L_0x0bc0:
            java.lang.String r0 = "SM-G935R4"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0bca
            goto L_0x0b21
        L_0x0bca:
            r3 = 27
            goto L_0x0d3c
        L_0x0bce:
            java.lang.String r0 = "moto e5 play"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0bd8
            goto L_0x0b21
        L_0x0bd8:
            r3 = 26
            goto L_0x0d3c
        L_0x0bdc:
            java.lang.String r0 = "SOV33"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0be6
            goto L_0x0b21
        L_0x0be6:
            r3 = 25
            goto L_0x0d3c
        L_0x0bea:
            java.lang.String r0 = "Pixel"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0bf4
            goto L_0x0b21
        L_0x0bf4:
            r3 = 24
            goto L_0x0d3c
        L_0x0bf8:
            java.lang.String r0 = "MI 5s"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0c02
            goto L_0x0b21
        L_0x0c02:
            r3 = 23
            goto L_0x0d3c
        L_0x0c06:
            java.lang.String r0 = "H8324"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0c10
            goto L_0x0b21
        L_0x0c10:
            r3 = 22
            goto L_0x0d3c
        L_0x0c14:
            java.lang.String r0 = "H8314"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0c1e
            goto L_0x0b21
        L_0x0c1e:
            r3 = 21
            goto L_0x0d3c
        L_0x0c22:
            java.lang.String r0 = "G8441"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0c2c
            goto L_0x0b21
        L_0x0c2c:
            r3 = 20
            goto L_0x0d3c
        L_0x0c30:
            java.lang.String r0 = "G8342"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0c3a
            goto L_0x0b21
        L_0x0c3a:
            r3 = 19
            goto L_0x0d3c
        L_0x0c3e:
            java.lang.String r0 = "F8332"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0c48
            goto L_0x0b21
        L_0x0c48:
            r3 = 18
            goto L_0x0d3c
        L_0x0c4c:
            java.lang.String r0 = "F8331"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0c56
            goto L_0x0b21
        L_0x0c56:
            r3 = 17
            goto L_0x0d3c
        L_0x0c5a:
            java.lang.String r0 = "SM-N950U"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0c64
            goto L_0x0b21
        L_0x0c64:
            r3 = 16
            goto L_0x0d3c
        L_0x0c68:
            java.lang.String r0 = "SM-G9650"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0c72
            goto L_0x0b21
        L_0x0c72:
            r3 = 15
            goto L_0x0d3c
        L_0x0c76:
            java.lang.String r0 = "SM-G955W"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0c80
            goto L_0x0b21
        L_0x0c80:
            r3 = 14
            goto L_0x0d3c
        L_0x0c84:
            java.lang.String r0 = "SM-G955U"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0c8e
            goto L_0x0b21
        L_0x0c8e:
            r3 = 13
            goto L_0x0d3c
        L_0x0c92:
            java.lang.String r0 = "SM-G935T"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0c9c
            goto L_0x0b21
        L_0x0c9c:
            r3 = 12
            goto L_0x0d3c
        L_0x0ca0:
            java.lang.String r0 = "SM-G930V"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0caa
            goto L_0x0b21
        L_0x0caa:
            r3 = 11
            goto L_0x0d3c
        L_0x0cae:
            java.lang.String r0 = "SM-G892U"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0cb8
            goto L_0x0b21
        L_0x0cb8:
            r3 = 10
            goto L_0x0d3c
        L_0x0cbc:
            java.lang.String r0 = "SM-G892A"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0cc6
            goto L_0x0b21
        L_0x0cc6:
            r3 = 9
            goto L_0x0d3c
        L_0x0cca:
            java.lang.String r0 = "SM-G885S"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0cd4
            goto L_0x0b21
        L_0x0cd4:
            r3 = 8
            goto L_0x0d3c
        L_0x0cd8:
            java.lang.String r0 = "SM-G8850"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0ce2
            goto L_0x0b21
        L_0x0ce2:
            r3 = 7
            goto L_0x0d3c
        L_0x0ce4:
            java.lang.String r0 = "SM-A920F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0cee
            goto L_0x0b21
        L_0x0cee:
            r3 = 6
            goto L_0x0d3c
        L_0x0cf0:
            java.lang.String r0 = "SM-A9200"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0cfa
            goto L_0x0b21
        L_0x0cfa:
            r3 = 5
            goto L_0x0d3c
        L_0x0cfc:
            java.lang.String r0 = "moto g(6)"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0d06
            goto L_0x0b21
        L_0x0d06:
            r3 = r16
            goto L_0x0d3c
        L_0x0d09:
            java.lang.String r0 = "SAMSUNG-SM-G930A"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0d13
            goto L_0x0b21
        L_0x0d13:
            r3 = r17
            goto L_0x0d3c
        L_0x0d16:
            java.lang.String r0 = "SAMSUNG-SM-G891A"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0d20
            goto L_0x0b21
        L_0x0d20:
            r3 = r18
            goto L_0x0d3c
        L_0x0d23:
            java.lang.String r0 = "SO-01J"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0d2d
            goto L_0x0b21
        L_0x0d2d:
            r3 = r19
            goto L_0x0d3c
        L_0x0d30:
            java.lang.String r0 = "SAMSUNG-SM-G930AZ"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0d3a
            goto L_0x0b21
        L_0x0d3a:
            r3 = r20
        L_0x0d3c:
            switch(r3) {
                case 0: goto L_0x0ee8;
                case 1: goto L_0x0ed9;
                case 2: goto L_0x0159;
                case 3: goto L_0x0ec4;
                case 4: goto L_0x0174;
                case 5: goto L_0x0eb5;
                case 6: goto L_0x0eb5;
                case 7: goto L_0x0ea0;
                case 8: goto L_0x0e8b;
                case 9: goto L_0x0e76;
                case 10: goto L_0x0ee8;
                case 11: goto L_0x0174;
                case 12: goto L_0x0ed9;
                case 13: goto L_0x0170;
                case 14: goto L_0x0174;
                case 15: goto L_0x0e67;
                case 16: goto L_0x0170;
                case 17: goto L_0x0e37;
                case 18: goto L_0x0ed9;
                case 19: goto L_0x0ec4;
                case 20: goto L_0x0e2c;
                case 21: goto L_0x0e21;
                case 22: goto L_0x0e1d;
                case 23: goto L_0x0ec4;
                case 24: goto L_0x0ed9;
                case 25: goto L_0x0e0c;
                case 26: goto L_0x0dfb;
                case 27: goto L_0x0ee8;
                case 28: goto L_0x0170;
                case 29: goto L_0x0dcb;
                case 30: goto L_0x0d9b;
                case 31: goto L_0x0d6b;
                case 32: goto L_0x0ee8;
                case 33: goto L_0x0e21;
                case 34: goto L_0x0e2c;
                case 35: goto L_0x0ee8;
                case 36: goto L_0x0d56;
                case 37: goto L_0x0d41;
                case 38: goto L_0x0174;
                case 39: goto L_0x0174;
                default: goto L_0x0d3f;
            }
        L_0x0d3f:
            goto L_0x012e
        L_0x0d41:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0174
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0d52
            goto L_0x0159
        L_0x0d52:
            if (r11 == r14) goto L_0x026d
            goto L_0x016c
        L_0x0d56:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0170
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0d67
            goto L_0x0159
        L_0x0d67:
            if (r11 == r12) goto L_0x0170
            goto L_0x026d
        L_0x0d6b:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x0d89;
                case 802059049: goto L_0x0d7f;
                case 1514345136: goto L_0x0d78;
                default: goto L_0x0d75;
            }
        L_0x0d75:
            r18 = r21
            goto L_0x0d92
        L_0x0d78:
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x0d92
            goto L_0x0d75
        L_0x0d7f:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0d86
            goto L_0x0d75
        L_0x0d86:
            r18 = r19
            goto L_0x0d92
        L_0x0d89:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0d90
            goto L_0x0d75
        L_0x0d90:
            r18 = r20
        L_0x0d92:
            switch(r18) {
                case 0: goto L_0x0170;
                case 1: goto L_0x0d97;
                case 2: goto L_0x0764;
                default: goto L_0x0d95;
            }
        L_0x0d95:
            goto L_0x0174
        L_0x0d97:
            if (r11 == r14) goto L_0x08bc
            goto L_0x0170
        L_0x0d9b:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x0db9;
                case 802059049: goto L_0x0daf;
                case 1514345136: goto L_0x0da8;
                default: goto L_0x0da5;
            }
        L_0x0da5:
            r18 = r21
            goto L_0x0dc2
        L_0x0da8:
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x0dc2
            goto L_0x0da5
        L_0x0daf:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0db6
            goto L_0x0da5
        L_0x0db6:
            r18 = r19
            goto L_0x0dc2
        L_0x0db9:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0dc0
            goto L_0x0da5
        L_0x0dc0:
            r18 = r20
        L_0x0dc2:
            switch(r18) {
                case 0: goto L_0x0170;
                case 1: goto L_0x0dc7;
                case 2: goto L_0x0764;
                default: goto L_0x0dc5;
            }
        L_0x0dc5:
            goto L_0x02f0
        L_0x0dc7:
            if (r11 == r14) goto L_0x08bc
            goto L_0x0170
        L_0x0dcb:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x0de9;
                case -1719904874: goto L_0x0ddf;
                case 802059049: goto L_0x0dd8;
                default: goto L_0x0dd5;
            }
        L_0x0dd5:
            r18 = r21
            goto L_0x0df2
        L_0x0dd8:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0df2
            goto L_0x0dd5
        L_0x0ddf:
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0de6
            goto L_0x0dd5
        L_0x0de6:
            r18 = r19
            goto L_0x0df2
        L_0x0de9:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0df0
            goto L_0x0dd5
        L_0x0df0:
            r18 = r20
        L_0x0df2:
            switch(r18) {
                case 0: goto L_0x0170;
                case 1: goto L_0x0561;
                case 2: goto L_0x0df7;
                default: goto L_0x0df5;
            }
        L_0x0df5:
            goto L_0x0159
        L_0x0df7:
            if (r11 == r14) goto L_0x026d
            goto L_0x016c
        L_0x0dfb:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0801
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x02f0
            goto L_0x012e
        L_0x0e0c:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0174
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x0390
            goto L_0x0159
        L_0x0e1d:
            if (r11 == r14) goto L_0x08bc
            goto L_0x0170
        L_0x0e21:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0170
            goto L_0x0174
        L_0x0e2c:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0174
            goto L_0x016c
        L_0x0e37:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x0e55;
                case 802059049: goto L_0x0e4b;
                case 1514345136: goto L_0x0e44;
                default: goto L_0x0e41;
            }
        L_0x0e41:
            r18 = r21
            goto L_0x0e5e
        L_0x0e44:
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x0e5e
            goto L_0x0e41
        L_0x0e4b:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0e52
            goto L_0x0e41
        L_0x0e52:
            r18 = r19
            goto L_0x0e5e
        L_0x0e55:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0e5c
            goto L_0x0e41
        L_0x0e5c:
            r18 = r20
        L_0x0e5e:
            switch(r18) {
                case 0: goto L_0x0174;
                case 1: goto L_0x0e63;
                case 2: goto L_0x0390;
                default: goto L_0x0e61;
            }
        L_0x0e61:
            goto L_0x026d
        L_0x0e63:
            if (r11 == r12) goto L_0x0170
            goto L_0x026d
        L_0x0e67:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0e72
            goto L_0x0170
        L_0x0e72:
            if (r11 == r14) goto L_0x08bc
            goto L_0x0170
        L_0x0e76:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0170
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0e87
            goto L_0x026d
        L_0x0e87:
            if (r11 == r12) goto L_0x0170
            goto L_0x026d
        L_0x0e8b:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0159
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0e9c
            goto L_0x02f0
        L_0x0e9c:
            if (r11 == r14) goto L_0x026d
            goto L_0x016c
        L_0x0ea0:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0159
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0eb1
            goto L_0x02f0
        L_0x0eb1:
            if (r11 == r12) goto L_0x0170
            goto L_0x026d
        L_0x0eb5:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0ec0
            goto L_0x0159
        L_0x0ec0:
            if (r11 == r12) goto L_0x0170
            goto L_0x026d
        L_0x0ec4:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0174
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0ed5
            goto L_0x026d
        L_0x0ed5:
            if (r11 == r12) goto L_0x0170
            goto L_0x026d
        L_0x0ed9:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0ee4
            goto L_0x016c
        L_0x0ee4:
            if (r11 == r14) goto L_0x026d
            goto L_0x0159
        L_0x0ee8:
            if (r11 == r12) goto L_0x0170
            goto L_0x026d
        L_0x0eec:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -708142656: goto L_0x0f80;
                case -708142633: goto L_0x0f73;
                case -708142625: goto L_0x0f67;
                case -399017595: goto L_0x0f5b;
                case -78463250: goto L_0x0f4f;
                case 2453916: goto L_0x0f44;
                case 67287038: goto L_0x0f39;
                case 77128294: goto L_0x0f2e;
                case 514549157: goto L_0x0f21;
                case 1311300188: goto L_0x0f14;
                case 1467059320: goto L_0x0f07;
                case 1691545187: goto L_0x0efa;
                default: goto L_0x0ef6;
            }
        L_0x0ef6:
            r7 = r21
            goto L_0x0f8c
        L_0x0efa:
            java.lang.String r0 = "CPH1801"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0f03
            goto L_0x0ef6
        L_0x0f03:
            r7 = 11
            goto L_0x0f8c
        L_0x0f07:
            java.lang.String r0 = "Redmi 5 Plus"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0f10
            goto L_0x0ef6
        L_0x0f10:
            r7 = 10
            goto L_0x0f8c
        L_0x0f14:
            java.lang.String r0 = "ONEPLUS A5000"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0f1d
            goto L_0x0ef6
        L_0x0f1d:
            r7 = 9
            goto L_0x0f8c
        L_0x0f21:
            java.lang.String r0 = "SM-J510FN"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0f2a
            goto L_0x0ef6
        L_0x0f2a:
            r7 = 8
            goto L_0x0f8c
        L_0x0f2e:
            java.lang.String r0 = "Pixel"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0f37
            goto L_0x0ef6
        L_0x0f37:
            r7 = 7
            goto L_0x0f8c
        L_0x0f39:
            java.lang.String r0 = "G8142"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0f42
            goto L_0x0ef6
        L_0x0f42:
            r7 = 6
            goto L_0x0f8c
        L_0x0f44:
            java.lang.String r0 = "PH-1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0f4d
            goto L_0x0ef6
        L_0x0f4d:
            r7 = 5
            goto L_0x0f8c
        L_0x0f4f:
            java.lang.String r0 = "Pixel XL"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0f58
            goto L_0x0ef6
        L_0x0f58:
            r7 = r16
            goto L_0x0f8c
        L_0x0f5b:
            java.lang.String r0 = "LM-X210(G)"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0f64
            goto L_0x0ef6
        L_0x0f64:
            r7 = r17
            goto L_0x0f8c
        L_0x0f67:
            java.lang.String r0 = "Redmi 5A"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0f70
            goto L_0x0ef6
        L_0x0f70:
            r7 = r18
            goto L_0x0f8c
        L_0x0f73:
            java.lang.String r0 = "Redmi 4X"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0f7d
            goto L_0x0ef6
        L_0x0f7d:
            r7 = r19
            goto L_0x0f8c
        L_0x0f80:
            java.lang.String r0 = "Redmi 4A"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0f8a
            goto L_0x0ef6
        L_0x0f8a:
            r7 = r20
        L_0x0f8c:
            switch(r7) {
                case 0: goto L_0x0801;
                case 1: goto L_0x0801;
                case 2: goto L_0x0801;
                case 3: goto L_0x0801;
                case 4: goto L_0x0f95;
                case 5: goto L_0x0f91;
                case 6: goto L_0x0f95;
                case 7: goto L_0x0f95;
                case 8: goto L_0x02f0;
                case 9: goto L_0x02f0;
                case 10: goto L_0x02f0;
                case 11: goto L_0x02f0;
                default: goto L_0x0f8f;
            }
        L_0x0f8f:
            goto L_0x080e
        L_0x0f91:
            if (r11 == r12) goto L_0x0801
            goto L_0x012e
        L_0x0f95:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0801
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0fa6
            goto L_0x080e
        L_0x0fa6:
            if (r11 == r14) goto L_0x012e
            goto L_0x081e
        L_0x0faa:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -1696512900: goto L_0x0fd8;
                case -401692945: goto L_0x0fcc;
                case 3272512: goto L_0x0fc0;
                case 1490819771: goto L_0x0fb7;
                default: goto L_0x0fb4;
            }
        L_0x0fb4:
            r17 = r21
            goto L_0x0fe3
        L_0x0fb7:
            java.lang.String r0 = "Nexus 6P"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0fe3
            goto L_0x0fb4
        L_0x0fc0:
            java.lang.String r0 = "Moto G (5)"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0fc9
            goto L_0x0fb4
        L_0x0fc9:
            r17 = r18
            goto L_0x0fe3
        L_0x0fcc:
            java.lang.String r0 = "SM-G935V"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0fd5
            goto L_0x0fb4
        L_0x0fd5:
            r17 = r19
            goto L_0x0fe3
        L_0x0fd8:
            java.lang.String r0 = "XT1650"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0fe1
            goto L_0x0fb4
        L_0x0fe1:
            r17 = r20
        L_0x0fe3:
            switch(r17) {
                case 0: goto L_0x1018;
                case 1: goto L_0x08c0;
                case 2: goto L_0x0801;
                case 3: goto L_0x0fe8;
                default: goto L_0x0fe6;
            }
        L_0x0fe6:
            goto L_0x012e
        L_0x0fe8:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x1006;
                case 802059049: goto L_0x0ffc;
                case 1514345136: goto L_0x0ff5;
                default: goto L_0x0ff2;
            }
        L_0x0ff2:
            r18 = r21
            goto L_0x100f
        L_0x0ff5:
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x100f
            goto L_0x0ff2
        L_0x0ffc:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x1003
            goto L_0x0ff2
        L_0x1003:
            r18 = r19
            goto L_0x100f
        L_0x1006:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x100d
            goto L_0x0ff2
        L_0x100d:
            r18 = r20
        L_0x100f:
            switch(r18) {
                case 0: goto L_0x08c0;
                case 1: goto L_0x1014;
                case 2: goto L_0x1724;
                default: goto L_0x1012;
            }
        L_0x1012:
            goto L_0x0801
        L_0x1014:
            if (r11 == r14) goto L_0x02f0
            goto L_0x0801
        L_0x1018:
            if (r11 == r12) goto L_0x0801
            goto L_0x012e
        L_0x101c:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -1984447159: goto L_0x107d;
                case -783193036: goto L_0x1071;
                case -751286836: goto L_0x1065;
                case -401695999: goto L_0x1059;
                case 3272481: goto L_0x104d;
                case 102694224: goto L_0x1041;
                case 340383224: goto L_0x1035;
                case 1490819771: goto L_0x1028;
                default: goto L_0x1026;
            }
        L_0x1026:
            goto L_0x1088
        L_0x1028:
            java.lang.String r0 = "Nexus 6P"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1032
            goto L_0x1088
        L_0x1032:
            r21 = 7
            goto L_0x1088
        L_0x1035:
            java.lang.String r0 = "vivo 1610"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x103e
            goto L_0x1088
        L_0x103e:
            r21 = 6
            goto L_0x1088
        L_0x1041:
            java.lang.String r0 = "Moto G Play"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x104a
            goto L_0x1088
        L_0x104a:
            r21 = 5
            goto L_0x1088
        L_0x104d:
            java.lang.String r0 = "Moto G (4)"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1056
            goto L_0x1088
        L_0x1056:
            r21 = r16
            goto L_0x1088
        L_0x1059:
            java.lang.String r0 = "SM-G900F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1062
            goto L_0x1088
        L_0x1062:
            r21 = r17
            goto L_0x1088
        L_0x1065:
            java.lang.String r0 = "LG-AS110"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x106e
            goto L_0x1088
        L_0x106e:
            r21 = r18
            goto L_0x1088
        L_0x1071:
            java.lang.String r0 = "Nexus 5"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x107a
            goto L_0x1088
        L_0x107a:
            r21 = r19
            goto L_0x1088
        L_0x107d:
            java.lang.String r0 = "MotoG3"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1086
            goto L_0x1088
        L_0x1086:
            r21 = r20
        L_0x1088:
            switch(r21) {
                case 0: goto L_0x07df;
                case 1: goto L_0x10e5;
                case 2: goto L_0x10d4;
                case 3: goto L_0x02f0;
                case 4: goto L_0x10c5;
                case 5: goto L_0x10b6;
                case 6: goto L_0x10a2;
                case 7: goto L_0x108d;
                default: goto L_0x108b;
            }
        L_0x108b:
            goto L_0x0269
        L_0x108d:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x08c0
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x109e
            goto L_0x0269
        L_0x109e:
            if (r11 == r14) goto L_0x02f0
            goto L_0x0801
        L_0x10a2:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x10b2
            r23 = 4603101076673709170(0x3fe1800a7c5ac472, double:0.54688)
            goto L_0x1724
        L_0x10b2:
            if (r11 == r12) goto L_0x04aa
            goto L_0x0733
        L_0x10b6:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x10c1
            goto L_0x07df
        L_0x10c1:
            if (r11 == r12) goto L_0x08c0
            goto L_0x0a5a
        L_0x10c5:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x10d0
            goto L_0x0733
        L_0x10d0:
            if (r11 == r12) goto L_0x08c0
            goto L_0x02f0
        L_0x10d4:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0801
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x02f0
            goto L_0x012e
        L_0x10e5:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x08c0
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x10f6
            goto L_0x012e
        L_0x10f6:
            if (r11 == r12) goto L_0x0159
            goto L_0x02f0
        L_0x10fa:
            r0 = 24
            if (r7 == r0) goto L_0x1161
            r0 = 27
            if (r7 == r0) goto L_0x1113
            if (r7 == r3) goto L_0x1106
            goto L_0x08bc
        L_0x1106:
            r8.getClass()
            java.lang.String r0 = "HMA-L29"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x04a6
            goto L_0x0170
        L_0x1113:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case 1588010961: goto L_0x1135;
                case 1672051372: goto L_0x1129;
                case 1832520436: goto L_0x1120;
                default: goto L_0x111d;
            }
        L_0x111d:
            r18 = r21
            goto L_0x1140
        L_0x1120:
            java.lang.String r0 = "EML-AL00"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1140
            goto L_0x111d
        L_0x1129:
            java.lang.String r0 = "COR-L29"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1132
            goto L_0x111d
        L_0x1132:
            r18 = r19
            goto L_0x1140
        L_0x1135:
            java.lang.String r0 = "CLT-L29"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x113e
            goto L_0x111d
        L_0x113e:
            r18 = r20
        L_0x1140:
            switch(r18) {
                case 0: goto L_0x0398;
                case 1: goto L_0x1145;
                case 2: goto L_0x0398;
                default: goto L_0x1143;
            }
        L_0x1143:
            goto L_0x026d
        L_0x1145:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0398
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x1156
            goto L_0x026d
        L_0x1156:
            if (r11 == r12) goto L_0x115a
            goto L_0x0265
        L_0x115a:
            r23 = 4593896799899274445(0x3fc0cccccccccccd, double:0.13125)
            goto L_0x1724
        L_0x1161:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x080e
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x026d
            goto L_0x08bc
        L_0x1172:
            switch(r7) {
                case 31: goto L_0x11a8;
                case 32: goto L_0x1177;
                case 33: goto L_0x026d;
                default: goto L_0x1175;
            }
        L_0x1175:
            goto L_0x02d2
        L_0x1177:
            r8.getClass()
            java.lang.String r0 = "Pixel 6 Pro"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x119d
            java.lang.String r0 = "Pixel 6"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x118c
            goto L_0x02d2
        L_0x118c:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0159
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x026d
            goto L_0x02d2
        L_0x119d:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x026d
            goto L_0x02d2
        L_0x11a8:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x026d
            goto L_0x02d2
        L_0x11b3:
            switch(r7) {
                case 26: goto L_0x11c5;
                case 27: goto L_0x0764;
                case 28: goto L_0x11b8;
                default: goto L_0x11b6;
            }
        L_0x11b6:
            goto L_0x02f0
        L_0x11b8:
            r8.getClass()
            java.lang.String r0 = "Nokia 7.2"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0764
            goto L_0x02f0
        L_0x11c5:
            r8.getClass()
            java.lang.String r0 = "F8331"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1724
            java.lang.String r0 = "MI 5s"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1724
            goto L_0x0764
        L_0x11da:
            switch(r7) {
                case 22: goto L_0x026d;
                case 23: goto L_0x1370;
                case 24: goto L_0x1363;
                case 25: goto L_0x11dd;
                case 26: goto L_0x11dd;
                case 27: goto L_0x12f9;
                case 28: goto L_0x0561;
                case 29: goto L_0x126c;
                case 30: goto L_0x11df;
                default: goto L_0x11dd;
            }
        L_0x11dd:
            goto L_0x02d2
        L_0x11df:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -1390526813: goto L_0x124b;
                case -407502129: goto L_0x123f;
                case -407475236: goto L_0x1233;
                case -407475229: goto L_0x1227;
                case -407473376: goto L_0x121b;
                case -407413794: goto L_0x1210;
                case 48050974: goto L_0x1205;
                case 340386080: goto L_0x11fa;
                case 1255552637: goto L_0x11ed;
                default: goto L_0x11e9;
            }
        L_0x11e9:
            r11 = r21
            goto L_0x1256
        L_0x11ed:
            java.lang.String r0 = "M1908C3JGG"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x11f6
            goto L_0x11e9
        L_0x11f6:
            r11 = 8
            goto L_0x1256
        L_0x11fa:
            java.lang.String r0 = "vivo 1904"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1203
            goto L_0x11e9
        L_0x1203:
            r11 = 7
            goto L_0x1256
        L_0x1205:
            java.lang.String r0 = "W-K610-TVM"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x120e
            goto L_0x11e9
        L_0x120e:
            r11 = 6
            goto L_0x1256
        L_0x1210:
            java.lang.String r0 = "SM-A325F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1219
            goto L_0x11e9
        L_0x1219:
            r11 = 5
            goto L_0x1256
        L_0x121b:
            java.lang.String r0 = "SM-A125F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1224
            goto L_0x11e9
        L_0x1224:
            r11 = r16
            goto L_0x1256
        L_0x1227:
            java.lang.String r0 = "SM-A107M"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1230
            goto L_0x11e9
        L_0x1230:
            r11 = r17
            goto L_0x1256
        L_0x1233:
            java.lang.String r0 = "SM-A107F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x123c
            goto L_0x11e9
        L_0x123c:
            r11 = r18
            goto L_0x1256
        L_0x123f:
            java.lang.String r0 = "SM-A037U"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1248
            goto L_0x11e9
        L_0x1248:
            r11 = r19
            goto L_0x1256
        L_0x124b:
            java.lang.String r0 = "wembley_2GB_full"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1254
            goto L_0x11e9
        L_0x1254:
            r11 = r20
        L_0x1256:
            switch(r11) {
                case 0: goto L_0x125b;
                case 1: goto L_0x0159;
                case 2: goto L_0x0159;
                case 3: goto L_0x0159;
                case 4: goto L_0x0159;
                case 5: goto L_0x0561;
                case 6: goto L_0x0159;
                case 7: goto L_0x0159;
                case 8: goto L_0x0561;
                default: goto L_0x1259;
            }
        L_0x1259:
            goto L_0x02d2
        L_0x125b:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x02f0
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x080e
            goto L_0x02d2
        L_0x126c:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -407504183: goto L_0x12d8;
                case 132773294: goto L_0x12cc;
                case 254121476: goto L_0x12c0;
                case 582751196: goto L_0x12b4;
                case 674860964: goto L_0x12a8;
                case 791410201: goto L_0x129d;
                case 979092886: goto L_0x1292;
                case 979273647: goto L_0x1287;
                case 1691568476: goto L_0x127a;
                default: goto L_0x1276;
            }
        L_0x1276:
            r11 = r21
            goto L_0x12e3
        L_0x127a:
            java.lang.String r0 = "CPH2179"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1283
            goto L_0x1276
        L_0x1283:
            r11 = 8
            goto L_0x12e3
        L_0x1287:
            java.lang.String r0 = "LM-Q730"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1290
            goto L_0x1276
        L_0x1290:
            r11 = 7
            goto L_0x12e3
        L_0x1292:
            java.lang.String r0 = "LM-K500"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x129b
            goto L_0x1276
        L_0x129b:
            r11 = 6
            goto L_0x12e3
        L_0x129d:
            java.lang.String r0 = "Infinix X688B"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x12a6
            goto L_0x1276
        L_0x12a6:
            r11 = 5
            goto L_0x12e3
        L_0x12a8:
            java.lang.String r0 = "k61v1_basic_ref"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x12b1
            goto L_0x1276
        L_0x12b1:
            r11 = r16
            goto L_0x12e3
        L_0x12b4:
            java.lang.String r0 = "M2006C3LG"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x12bd
            goto L_0x1276
        L_0x12bd:
            r11 = r17
            goto L_0x12e3
        L_0x12c0:
            java.lang.String r0 = "SM-A215U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x12c9
            goto L_0x1276
        L_0x12c9:
            r11 = r18
            goto L_0x12e3
        L_0x12cc:
            java.lang.String r0 = "TECNO KE5"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x12d5
            goto L_0x1276
        L_0x12d5:
            r11 = r19
            goto L_0x12e3
        L_0x12d8:
            java.lang.String r0 = "SM-A013M"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x12e1
            goto L_0x1276
        L_0x12e1:
            r11 = r20
        L_0x12e3:
            switch(r11) {
                case 0: goto L_0x0159;
                case 1: goto L_0x0159;
                case 2: goto L_0x0159;
                case 3: goto L_0x0159;
                case 4: goto L_0x12e8;
                case 5: goto L_0x0159;
                case 6: goto L_0x0159;
                case 7: goto L_0x0159;
                case 8: goto L_0x0159;
                default: goto L_0x12e6;
            }
        L_0x12e6:
            goto L_0x02d2
        L_0x12e8:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x02f0
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x080e
            goto L_0x02d2
        L_0x12f9:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -708142594: goto L_0x1327;
                case -509282093: goto L_0x131b;
                case 1691546209: goto L_0x130f;
                case 1965191908: goto L_0x1306;
                default: goto L_0x1303;
            }
        L_0x1303:
            r17 = r21
            goto L_0x1332
        L_0x1306:
            java.lang.String r0 = "Infinix X650"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1332
            goto L_0x1303
        L_0x130f:
            java.lang.String r0 = "CPH1920"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1318
            goto L_0x1303
        L_0x1318:
            r17 = r18
            goto L_0x1332
        L_0x131b:
            java.lang.String r0 = "Nokia 1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1324
            goto L_0x1303
        L_0x1324:
            r17 = r19
            goto L_0x1332
        L_0x1327:
            java.lang.String r0 = "Redmi 6A"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1330
            goto L_0x1303
        L_0x1330:
            r17 = r20
        L_0x1332:
            switch(r17) {
                case 0: goto L_0x134d;
                case 1: goto L_0x1342;
                case 2: goto L_0x0561;
                case 3: goto L_0x1337;
                default: goto L_0x1335;
            }
        L_0x1335:
            goto L_0x0733
        L_0x1337:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0159
            goto L_0x0733
        L_0x1342:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0170
            goto L_0x07a7
        L_0x134d:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x1358
            goto L_0x04aa
        L_0x1358:
            if (r11 == r12) goto L_0x135c
            goto L_0x04a6
        L_0x135c:
            r23 = 4594527303847106314(0x3fc30a3d70a3d70a, double:0.14875)
            goto L_0x1724
        L_0x1363:
            r8.getClass()
            java.lang.String r0 = "Moto C"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0561
            goto L_0x016c
        L_0x1370:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -2038157991: goto L_0x139e;
                case -401812218: goto L_0x1392;
                case -401812217: goto L_0x1386;
                case 807317112: goto L_0x137d;
                default: goto L_0x137a;
            }
        L_0x137a:
            r17 = r21
            goto L_0x13a9
        L_0x137d:
            java.lang.String r0 = "LG-K430"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x13a9
            goto L_0x137a
        L_0x1386:
            java.lang.String r0 = "SM-G532G"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x138f
            goto L_0x137a
        L_0x138f:
            r17 = r18
            goto L_0x13a9
        L_0x1392:
            java.lang.String r0 = "SM-G532F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x139b
            goto L_0x137a
        L_0x139b:
            r17 = r19
            goto L_0x13a9
        L_0x139e:
            java.lang.String r0 = "Redmi Note 4"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x13a7
            goto L_0x137a
        L_0x13a7:
            r17 = r20
        L_0x13a9:
            switch(r17) {
                case 0: goto L_0x02f0;
                case 1: goto L_0x0801;
                case 2: goto L_0x13ae;
                case 3: goto L_0x0159;
                default: goto L_0x13ac;
            }
        L_0x13ac:
            goto L_0x081e
        L_0x13ae:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0801
            goto L_0x081e
        L_0x13b9:
            r23 = 4601158944370401917(0x3fda99ae924f227d, double:0.41563)
            switch(r7) {
                case 24: goto L_0x16a4;
                case 25: goto L_0x13c1;
                case 26: goto L_0x15e7;
                case 27: goto L_0x1583;
                case 28: goto L_0x148b;
                case 29: goto L_0x141b;
                case 30: goto L_0x13c3;
                case 31: goto L_0x026d;
                default: goto L_0x13c1;
            }
        L_0x13c1:
            goto L_0x012e
        L_0x13c3:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -407473314: goto L_0x140b;
                case -407444484: goto L_0x13ff;
                case -407356134: goto L_0x13f3;
                case -407355173: goto L_0x13e7;
                case -396332503: goto L_0x13db;
                case 256892039: goto L_0x13d0;
                default: goto L_0x13cd;
            }
        L_0x13cd:
            r15 = r21
            goto L_0x1416
        L_0x13d0:
            java.lang.String r0 = "SM-A515U1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x13d9
            goto L_0x13cd
        L_0x13d9:
            r15 = 5
            goto L_0x1416
        L_0x13db:
            java.lang.String r0 = "SM-M315F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x13e4
            goto L_0x13cd
        L_0x13e4:
            r15 = r16
            goto L_0x1416
        L_0x13e7:
            java.lang.String r0 = "SM-A515F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x13f0
            goto L_0x13cd
        L_0x13f0:
            r15 = r17
            goto L_0x1416
        L_0x13f3:
            java.lang.String r0 = "SM-A505F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x13fc
            goto L_0x13cd
        L_0x13fc:
            r15 = r18
            goto L_0x1416
        L_0x13ff:
            java.lang.String r0 = "SM-A217F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1408
            goto L_0x13cd
        L_0x1408:
            r15 = r19
            goto L_0x1416
        L_0x140b:
            java.lang.String r0 = "SM-A127F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1414
            goto L_0x13cd
        L_0x1414:
            r15 = r20
        L_0x1416:
            switch(r15) {
                case 0: goto L_0x02f0;
                case 1: goto L_0x02f0;
                case 2: goto L_0x0398;
                case 3: goto L_0x0398;
                case 4: goto L_0x0398;
                case 5: goto L_0x0398;
                default: goto L_0x1419;
            }
        L_0x1419:
            goto L_0x07df
        L_0x141b:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -401689047: goto L_0x1440;
                case -395224625: goto L_0x1434;
                case 253167728: goto L_0x1428;
                default: goto L_0x1425;
            }
        L_0x1425:
            r0 = r21
            goto L_0x144b
        L_0x1428:
            java.lang.String r0 = "SM-A105FN"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1431
            goto L_0x1425
        L_0x1431:
            r0 = r18
            goto L_0x144b
        L_0x1434:
            java.lang.String r0 = "SM-N970F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x143d
            goto L_0x1425
        L_0x143d:
            r0 = r19
            goto L_0x144b
        L_0x1440:
            java.lang.String r0 = "SM-G977N"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1449
            goto L_0x1425
        L_0x1449:
            r0 = r20
        L_0x144b:
            switch(r0) {
                case 0: goto L_0x1480;
                case 1: goto L_0x026d;
                case 2: goto L_0x1450;
                default: goto L_0x144e;
            }
        L_0x144e:
            goto L_0x012e
        L_0x1450:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x146e;
                case -1719904874: goto L_0x1464;
                case 802059049: goto L_0x145d;
                default: goto L_0x145a;
            }
        L_0x145a:
            r18 = r21
            goto L_0x1477
        L_0x145d:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x1477
            goto L_0x145a
        L_0x1464:
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x146b
            goto L_0x145a
        L_0x146b:
            r18 = r19
            goto L_0x1477
        L_0x146e:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x1475
            goto L_0x145a
        L_0x1475:
            r18 = r20
        L_0x1477:
            switch(r18) {
                case 0: goto L_0x0733;
                case 1: goto L_0x02d2;
                case 2: goto L_0x147c;
                default: goto L_0x147a;
            }
        L_0x147a:
            goto L_0x012e
        L_0x147c:
            if (r11 == r14) goto L_0x03eb
            goto L_0x012e
        L_0x1480:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0733
            goto L_0x02d2
        L_0x148b:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -401691194: goto L_0x14ed;
                case -401691039: goto L_0x14e1;
                case -401690078: goto L_0x14d5;
                case -401690070: goto L_0x14c9;
                case -398984987: goto L_0x14bd;
                case -395225586: goto L_0x14b1;
                case -395225578: goto L_0x14a5;
                case 253167728: goto L_0x1499;
                default: goto L_0x1495;
            }
        L_0x1495:
            r71 = r21
            goto L_0x14f8
        L_0x1499:
            java.lang.String r0 = "SM-A105FN"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x14a2
            goto L_0x1495
        L_0x14a2:
            r71 = 7
            goto L_0x14f8
        L_0x14a5:
            java.lang.String r0 = "SM-N960N"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x14ae
            goto L_0x1495
        L_0x14ae:
            r71 = 6
            goto L_0x14f8
        L_0x14b1:
            java.lang.String r0 = "SM-N960F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x14ba
            goto L_0x1495
        L_0x14ba:
            r71 = 5
            goto L_0x14f8
        L_0x14bd:
            java.lang.String r0 = "SM-J701F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x14c6
            goto L_0x1495
        L_0x14c6:
            r71 = r16
            goto L_0x14f8
        L_0x14c9:
            java.lang.String r0 = "SM-G965N"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x14d2
            goto L_0x1495
        L_0x14d2:
            r71 = r17
            goto L_0x14f8
        L_0x14d5:
            java.lang.String r0 = "SM-G965F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x14de
            goto L_0x1495
        L_0x14de:
            r71 = r18
            goto L_0x14f8
        L_0x14e1:
            java.lang.String r0 = "SM-G955F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x14ea
            goto L_0x1495
        L_0x14ea:
            r71 = r19
            goto L_0x14f8
        L_0x14ed:
            java.lang.String r0 = "SM-G950F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x14f6
            goto L_0x1495
        L_0x14f6:
            r71 = r20
        L_0x14f8:
            switch(r71) {
                case 0: goto L_0x156e;
                case 1: goto L_0x0398;
                case 2: goto L_0x1556;
                case 3: goto L_0x1523;
                case 4: goto L_0x08c0;
                case 5: goto L_0x150e;
                case 6: goto L_0x150e;
                case 7: goto L_0x14fd;
                default: goto L_0x14fb;
            }
        L_0x14fb:
            goto L_0x02d2
        L_0x14fd:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x1724
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x02f0
            goto L_0x02d2
        L_0x150e:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0170
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x151f
            goto L_0x0801
        L_0x151f:
            if (r11 == r12) goto L_0x04a6
            goto L_0x0398
        L_0x1523:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x1541;
                case 802059049: goto L_0x1537;
                case 1514345136: goto L_0x1530;
                default: goto L_0x152d;
            }
        L_0x152d:
            r18 = r21
            goto L_0x154a
        L_0x1530:
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x154a
            goto L_0x152d
        L_0x1537:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x153e
            goto L_0x152d
        L_0x153e:
            r18 = r19
            goto L_0x154a
        L_0x1541:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x1548
            goto L_0x152d
        L_0x1548:
            r18 = r20
        L_0x154a:
            switch(r18) {
                case 0: goto L_0x0170;
                case 1: goto L_0x04a6;
                case 2: goto L_0x154f;
                default: goto L_0x154d;
            }
        L_0x154d:
            goto L_0x0801
        L_0x154f:
            r23 = 4590622863114161189(0x3fb52b2bfdb4cc25, double:0.08269)
            goto L_0x1724
        L_0x1556:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x0170
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x1567
            goto L_0x0801
        L_0x1567:
            r23 = 4592860971984979231(0x3fbd1eb851eb851f, double:0.11375)
            goto L_0x1724
        L_0x156e:
            r10.getClass()
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x0398
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x157f
            goto L_0x026d
        L_0x157f:
            if (r11 == r12) goto L_0x04a6
            goto L_0x0170
        L_0x1583:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -401784411: goto L_0x15b1;
                case -399128207: goto L_0x15a5;
                case -399128206: goto L_0x1599;
                case -396363255: goto L_0x1590;
                default: goto L_0x158d;
            }
        L_0x158d:
            r17 = r21
            goto L_0x15bc
        L_0x1590:
            java.lang.String r0 = "SM-M205F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x15bc
            goto L_0x158d
        L_0x1599:
            java.lang.String r0 = "SM-J260G"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x15a2
            goto L_0x158d
        L_0x15a2:
            r17 = r18
            goto L_0x15bc
        L_0x15a5:
            java.lang.String r0 = "SM-J260F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x15ae
            goto L_0x158d
        L_0x15ae:
            r17 = r19
            goto L_0x15bc
        L_0x15b1:
            java.lang.String r0 = "SM-G610F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x15ba
            goto L_0x158d
        L_0x15ba:
            r17 = r20
        L_0x15bc:
            switch(r17) {
                case 0: goto L_0x08c0;
                case 1: goto L_0x08c0;
                case 2: goto L_0x15d6;
                case 3: goto L_0x15c1;
                default: goto L_0x15bf;
            }
        L_0x15bf:
            goto L_0x08bc
        L_0x15c1:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x1724
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x15d2
            goto L_0x08bc
        L_0x15d2:
            if (r11 == r12) goto L_0x0159
            goto L_0x04aa
        L_0x15d6:
            r10.getClass()
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x1724
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0733
            goto L_0x081e
        L_0x15e7:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -407354367: goto L_0x163c;
                case -401693116: goto L_0x1630;
                case -401692961: goto L_0x1624;
                case -401691194: goto L_0x1618;
                case -401691039: goto L_0x160c;
                case -401690233: goto L_0x1600;
                case -399014808: goto L_0x15f4;
                default: goto L_0x15f1;
            }
        L_0x15f1:
            r71 = r21
            goto L_0x1647
        L_0x15f4:
            java.lang.String r0 = "SM-J600G"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x15fd
            goto L_0x15f1
        L_0x15fd:
            r71 = 6
            goto L_0x1647
        L_0x1600:
            java.lang.String r0 = "SM-G960F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1609
            goto L_0x15f1
        L_0x1609:
            r71 = 5
            goto L_0x1647
        L_0x160c:
            java.lang.String r0 = "SM-G955F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1615
            goto L_0x15f1
        L_0x1615:
            r71 = r16
            goto L_0x1647
        L_0x1618:
            java.lang.String r0 = "SM-G950F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1621
            goto L_0x15f1
        L_0x1621:
            r71 = r17
            goto L_0x1647
        L_0x1624:
            java.lang.String r0 = "SM-G935F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x162d
            goto L_0x15f1
        L_0x162d:
            r71 = r18
            goto L_0x1647
        L_0x1630:
            java.lang.String r0 = "SM-G930F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1639
            goto L_0x15f1
        L_0x1639:
            r71 = r19
            goto L_0x1647
        L_0x163c:
            java.lang.String r0 = "SM-A520F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1645
            goto L_0x15f1
        L_0x1645:
            r71 = r20
        L_0x1647:
            switch(r71) {
                case 0: goto L_0x08c0;
                case 1: goto L_0x0269;
                case 2: goto L_0x1692;
                case 3: goto L_0x07a7;
                case 4: goto L_0x165b;
                case 5: goto L_0x164c;
                case 6: goto L_0x08c0;
                default: goto L_0x164a;
            }
        L_0x164a:
            goto L_0x02f0
        L_0x164c:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x1657
            goto L_0x02f0
        L_0x1657:
            if (r11 == r14) goto L_0x0764
            goto L_0x04a6
        L_0x165b:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -2077737242: goto L_0x1679;
                case 802059049: goto L_0x166f;
                case 1514345136: goto L_0x1668;
                default: goto L_0x1665;
            }
        L_0x1665:
            r18 = r21
            goto L_0x1682
        L_0x1668:
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x1682
            goto L_0x1665
        L_0x166f:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x1676
            goto L_0x1665
        L_0x1676:
            r18 = r19
            goto L_0x1682
        L_0x1679:
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x1680
            goto L_0x1665
        L_0x1680:
            r18 = r20
        L_0x1682:
            switch(r18) {
                case 0: goto L_0x026d;
                case 1: goto L_0x168e;
                case 2: goto L_0x1687;
                default: goto L_0x1685;
            }
        L_0x1685:
            goto L_0x07a7
        L_0x1687:
            r23 = 4591250484758231541(0x3fb765fd8adab9f5, double:0.0914)
            goto L_0x1724
        L_0x168e:
            if (r11 == r12) goto L_0x0265
            goto L_0x04a6
        L_0x1692:
            r10.getClass()
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x169d
            goto L_0x04aa
        L_0x169d:
            r23 = 4593491475932811100(0x3fbf5c28f5c28f5c, double:0.1225)
            goto L_0x1724
        L_0x16a4:
            r8.getClass()
            java.lang.String r0 = "SM-G920V"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x026d
            java.lang.String r0 = "SM-G935F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0561
            goto L_0x07df
        L_0x16b9:
            r8.getClass()
            int r0 = r8.hashCode()
            switch(r0) {
                case -143589744: goto L_0x16de;
                case -143589743: goto L_0x16d2;
                case -142337348: goto L_0x16c6;
                default: goto L_0x16c3;
            }
        L_0x16c3:
            r0 = r21
            goto L_0x16e9
        L_0x16c6:
            java.lang.String r0 = "FIG-LX1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x16cf
            goto L_0x16c3
        L_0x16cf:
            r0 = r18
            goto L_0x16e9
        L_0x16d2:
            java.lang.String r0 = "ANE-LX2"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x16db
            goto L_0x16c3
        L_0x16db:
            r0 = r19
            goto L_0x16e9
        L_0x16de:
            java.lang.String r0 = "ANE-LX1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x16e7
            goto L_0x16c3
        L_0x16e7:
            r0 = r20
        L_0x16e9:
            switch(r0) {
                case 0: goto L_0x16ee;
                case 1: goto L_0x16ee;
                case 2: goto L_0x026d;
                default: goto L_0x16ec;
            }
        L_0x16ec:
            goto L_0x0159
        L_0x16ee:
            r10.getClass()
            int r0 = r10.hashCode()
            switch(r0) {
                case -1719904874: goto L_0x170c;
                case 802059049: goto L_0x1702;
                case 1514345136: goto L_0x16fb;
                default: goto L_0x16f8;
            }
        L_0x16f8:
            r18 = r21
            goto L_0x1715
        L_0x16fb:
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x1715
            goto L_0x16f8
        L_0x1702:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x1709
            goto L_0x16f8
        L_0x1709:
            r18 = r19
            goto L_0x1715
        L_0x170c:
            boolean r0 = r10.equals(r4)
            if (r0 != 0) goto L_0x1713
            goto L_0x16f8
        L_0x1713:
            r18 = r20
        L_0x1715:
            switch(r18) {
                case 0: goto L_0x026d;
                case 1: goto L_0x1720;
                case 2: goto L_0x171a;
                default: goto L_0x1718;
            }
        L_0x1718:
            goto L_0x0159
        L_0x171a:
            r23 = 4597529583502696582(0x3fcdb4cc25072086, double:0.23208)
            goto L_0x1724
        L_0x1720:
            if (r11 == r12) goto L_0x0398
            goto L_0x0561
        L_0x1724:
            int r0 = r1 * r2
            float r0 = (float) r0
            float r0 = r0 * r75
            double r0 = (double) r0
            double r0 = r0 * r23
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te8.j(java.lang.String, int, int, float):int");
    }

    public static Integer k(huf huf, KClass kClass) {
        if (Intrinsics.areEqual((Object) kClass, (Object) Reflection.getOrCreateKotlinClass(vt7.class))) {
            return Integer.valueOf(ead.j0);
        }
        if (Intrinsics.areEqual((Object) kClass, (Object) Reflection.getOrCreateKotlinClass(id.class))) {
            return Integer.valueOf(ead.i0);
        }
        if (Intrinsics.areEqual((Object) kClass, (Object) Reflection.getOrCreateKotlinClass(n9a.class))) {
            return Integer.valueOf(ead.k0);
        }
        if (Intrinsics.areEqual((Object) kClass, (Object) Reflection.getOrCreateKotlinClass(r45.class))) {
            int i = a1g.$EnumSwitchMapping$0[huf.ordinal()];
            if (i == 1) {
                return Integer.valueOf(ead.h0);
            }
            if (i == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(kClass.getClass());
        throw new IllegalStateException("Such validation rule (" + orCreateKotlinClass + " is not implemented");
    }

    public static SharedPreferences l(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static wgd m(Context context) {
        int safeInsetTop;
        int i;
        int i2;
        int safeInsetBottom;
        if (Build.VERSION.SDK_INT >= 30) {
            Rect d2 = kw3.a(context).getMaximumWindowMetrics().getBounds();
            Insets y = ((WindowManager) context.getSystemService("window")).getMaximumWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.systemBars());
            int width = d2.width();
            int height = d2.height();
            safeInsetTop = y.top;
            i = height;
            safeInsetBottom = y.bottom;
            i2 = width;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            kw3.a(context).getDefaultDisplay().getMetrics(displayMetrics);
            int i3 = displayMetrics.widthPixels;
            int i4 = displayMetrics.heightPixels;
            DisplayCutout cutout = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getCutout();
            safeInsetTop = cutout != null ? cutout.getSafeInsetTop() : 0;
            DisplayCutout cutout2 = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getCutout();
            i = i4;
            i2 = i3;
            safeInsetBottom = cutout2 != null ? cutout2.getSafeInsetBottom() : 0;
        }
        int i5 = safeInsetTop;
        kn4.a.getClass();
        double d3 = (double) (((float) i) / ((float) i2));
        return new wgd(i, i2, i5, safeInsetBottom, jn4.a(context).compareTo(kn4.v) < 0, d3 >= 2.33d, d3 <= 1.8d);
    }

    public static final Integer n(a32 a32) {
        if (a32.e0() && a32.L() && !a32.R()) {
            return Integer.valueOf(qad.m1);
        }
        if (a32.e0() && a32.K()) {
            return Integer.valueOf(qad.G0);
        }
        if (a32.c0() && !a32.e0()) {
            return Integer.valueOf(qad.x0);
        }
        if (!a32.d0() || !a32.K()) {
            return null;
        }
        return Integer.valueOf(qad.N0);
    }

    public static boolean o(Parcel parcel) {
        return parcel.readByte() == 1;
    }

    public static final boolean p(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        IntRange indices = ArraysKt.getIndices(bArr2);
        if (!(indices instanceof Collection) || !((Collection) indices).isEmpty()) {
            Iterator it = indices.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                if (bArr[i + nextInt] != bArr2[nextInt]) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:7|8|9|10|(1:12)(1:13)|14|15|16|17|18|(1:20)|23|24|25|(2:27|(1:29)(1:30))(1:31)|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[Catch:{ RemoteException -> 0x0079, all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070 A[Catch:{ RemoteException -> 0x0079, all -> 0x004c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int q(android.content.Context r5) {
        /*
            java.lang.Class<te8> r0 = defpackage.te8.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            defpackage.vzg.n(r5, r1)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "null"
            java.lang.String r2 = "preferredRenderer: "
            r2.concat(r1)     // Catch:{ all -> 0x004c }
            boolean r1 = a     // Catch:{ all -> 0x004c }
            r2 = 0
            if (r1 == 0) goto L_0x0015
            goto L_0x0077
        L_0x0015:
            q1h r1 = defpackage.kv0.c0(r5)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0080 }
            qyg r3 = r1.J0()     // Catch:{ RemoteException -> 0x0079 }
            defpackage.vzg.m(r3)     // Catch:{ RemoteException -> 0x0079 }
            defpackage.hsg.j = r3     // Catch:{ RemoteException -> 0x0079 }
            j5h r3 = r1.M0()     // Catch:{ RemoteException -> 0x0079 }
            j5h r4 = defpackage.cvg.h     // Catch:{ RemoteException -> 0x0079 }
            if (r4 == 0) goto L_0x002b
            goto L_0x0032
        L_0x002b:
            java.lang.String r4 = "delegate must not be null"
            defpackage.vzg.n(r3, r4)     // Catch:{ RemoteException -> 0x0079 }
            defpackage.cvg.h = r3     // Catch:{ RemoteException -> 0x0079 }
        L_0x0032:
            r3 = 1
            a = r3     // Catch:{ all -> 0x004c }
            android.os.Parcel r3 = r1.H0()     // Catch:{ RemoteException -> 0x0062 }
            r4 = 9
            android.os.Parcel r3 = r1.R(r3, r4)     // Catch:{ RemoteException -> 0x0062 }
            int r4 = r3.readInt()     // Catch:{ RemoteException -> 0x0062 }
            r3.recycle()     // Catch:{ RemoteException -> 0x0062 }
            r3 = 2
            if (r4 != r3) goto L_0x004e
            b = r3     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x004e
        L_0x004c:
            r5 = move-exception
            goto L_0x0085
        L_0x004e:
            hha r3 = new hha     // Catch:{ RemoteException -> 0x0062 }
            r3.<init>(r5)     // Catch:{ RemoteException -> 0x0062 }
            android.os.Parcel r5 = r1.H0()     // Catch:{ RemoteException -> 0x0062 }
            defpackage.hzg.c(r5, r3)     // Catch:{ RemoteException -> 0x0062 }
            r5.writeInt(r2)     // Catch:{ RemoteException -> 0x0062 }
            r3 = 10
            r1.I0(r5, r3)     // Catch:{ RemoteException -> 0x0062 }
        L_0x0062:
            int r5 = b     // Catch:{ all -> 0x004c }
            r1 = 1
            if (r5 == r1) goto L_0x0070
            r1 = 2
            if (r5 == r1) goto L_0x006d
            java.lang.String r5 = "null"
            goto L_0x0072
        L_0x006d:
            java.lang.String r5 = "LATEST"
            goto L_0x0072
        L_0x0070:
            java.lang.String r5 = "LEGACY"
        L_0x0072:
            java.lang.String r1 = "loadedRenderer: "
            r1.concat(r5)     // Catch:{ all -> 0x004c }
        L_0x0077:
            monitor-exit(r0)
            return r2
        L_0x0079:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch:{ all -> 0x004c }
            r1.<init>(r5)     // Catch:{ all -> 0x004c }
            throw r1     // Catch:{ all -> 0x004c }
        L_0x0080:
            r5 = move-exception
            int r5 = r5.a     // Catch:{ all -> 0x004c }
            monitor-exit(r0)
            return r5
        L_0x0085:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te8.q(android.content.Context):int");
    }

    public static long r(int i, String str) {
        int i2 = i(str, 0, i, false);
        Matcher matcher = qz3.m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (i2 < i) {
            int i9 = i(str, i2 + 1, i, true);
            matcher.region(i2, i9);
            if (i4 == -1 && matcher.usePattern(qz3.m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 != -1 || !matcher.usePattern(qz3.l).matches()) {
                if (i6 == -1) {
                    Pattern pattern = qz3.k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group = matcher.group(1);
                        Locale locale = Locale.US;
                        if (group != null) {
                            i6 = StringsKt__StringsKt.indexOf$default((CharSequence) pattern.pattern(), group.toLowerCase(locale), 0, false, 6, (Object) null) / 4;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
                if (i3 == -1 && matcher.usePattern(qz3.j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i5 = Integer.parseInt(matcher.group(1));
            }
            i2 = i(str, i9 + 1, i, false);
        }
        if (70 <= i3 && 99 >= i3) {
            i3 += 1900;
        }
        if (i3 >= 0 && 69 >= i3) {
            i3 += 2000;
        }
        if (!(i3 >= 1601)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i6 == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (1 > i5 || 31 < i5) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i4 < 0 || 23 < i4) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i7 < 0 || 59 < i7) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i8 < 0 || 59 < i8) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(u0g.e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public static boolean s(Parcel parcel) {
        return parcel.readByte() == 1;
    }

    public static byte[] t(Parcel parcel) {
        if (!o(parcel)) {
            return null;
        }
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        return bArr;
    }

    public static String u(Parcel parcel) {
        if (o(parcel)) {
            return parcel.readString();
        }
        return null;
    }

    public static ArrayList v(Parcel parcel) {
        if (!o(parcel)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(parcel.readInt());
        parcel.readStringList(arrayList);
        return arrayList;
    }

    public static final Activity w(e9d e9d) {
        Activity d2 = e9d.d();
        if (d2 != null) {
            return d2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static int x(int i, int i2, int i3, int i4, int i5, Range range) {
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        double doubleValue = rational.doubleValue();
        int doubleValue2 = (int) (rational2.doubleValue() * doubleValue * ((double) i));
        if (o54.C(3, "AudioConfigUtil")) {
            String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(doubleValue2)});
        }
        if (!z90.f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(doubleValue2));
            doubleValue2 = num.intValue();
            if (o54.C(3, "AudioConfigUtil")) {
                String.format("\nClamped to range %s -> %dbps", new Object[]{range, num});
            }
        }
        return doubleValue2;
    }

    public static int y(Range range, int i, int i2, int i3) {
        ArrayList arrayList = null;
        int i4 = i3;
        int i5 = 0;
        while (true) {
            if (range.contains(Integer.valueOf(i4))) {
                int i6 = q70.n;
                if (i4 > 0 && i > 0) {
                    if (AudioRecord.getMinBufferSize(i4, i == 1 ? 16 : 12, i2) > 0) {
                        return i4;
                    }
                }
            } else {
                range.toString();
            }
            if (arrayList == null) {
                arrayList = new ArrayList(y90.e);
                Collections.sort(arrayList, new z30(i3, 0));
            }
            if (i5 >= arrayList.size()) {
                return 44100;
            }
            int intValue = ((Integer) arrayList.get(i5)).intValue();
            i5++;
            i4 = intValue;
        }
    }

    public static Intent z(Context context, Bundle bundle, ArrayList arrayList, long j, long j2) {
        Intent intent = new Intent(context, ActChatPickerCompat.class);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGES", CollectionsKt.toLongArray(arrayList));
        Long valueOf = Long.valueOf(j);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        Long l = null;
        if (i == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            intent.putExtra("ru.ok.tamtam.extra.FROM_CHAT", valueOf.longValue());
        }
        intent.putExtra("ru.ok.tamtam.extra.TRANSIT_BUNDLE", bundle);
        Long valueOf2 = Long.valueOf(j2);
        if (j2 != 0) {
            l = valueOf2;
        }
        if (l != null) {
            intent.putExtra("ru.ok.tamtam.extra.ATTACH_ID", l.longValue());
        }
        intent.putExtra("picker_chat_controller_purpose", tkb.FORWARD);
        return intent;
    }

    public float b(View view, ViewGroup viewGroup) {
        return view.getTranslationY();
    }
}
