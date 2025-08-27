package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Point;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.NoCopySpan;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.KotlinVersion;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.uuid.Uuid;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ld8  reason: default package */
public abstract class ld8 {
    public static final int[] X = {16842913, 16842919};
    public static final int[] Y = {16842913};
    public static o9a Z;
    public static volatile ew6 a;
    public static final float[] b = new float[0];
    public static final int[] c = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] o = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int[] v = {12445, 13120, 12344, 12344};
    public static final int[] w = {12445, 13632, 12344, 12344};
    public static final int[] x = {12344};
    public static final int[] y = {16842919};
    public static final int[] z = {16842908};

    public static g8f A(String str) {
        LinkedHashMap linkedHashMap;
        Set set;
        String str2;
        String str3;
        String str4;
        Object obj;
        String string;
        JSONObject jSONObject = new JSONObject(str);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
        JSONArray names = jSONObject2.names();
        int length = names != null ? names.length() : 0;
        for (int i = 0; i < length; i++) {
            if (!(names == null || (string = names.getString(i)) == null)) {
                linkedHashMap2.put(string, jSONObject2.getString(string));
            }
        }
        String str5 = "versionName";
        String string2 = jSONObject.getString(str5);
        long j = jSONObject.getLong("versionCode");
        String str6 = "packageName";
        String optString = jSONObject.optString(str6);
        if (optString.length() <= 0) {
            optString = null;
        }
        if (optString == null) {
            try {
                Result.Companion companion = Result.Companion;
                Context context = kof.d;
                if (context == null) {
                    context = null;
                }
                obj = Result.m23constructorimpl(context.getPackageName());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m23constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m26exceptionOrNullimpl(obj) != null) {
                obj = "NA";
            }
            optString = (String) obj;
        }
        String str7 = "environment";
        String optString2 = jSONObject.optString(str7);
        if (optString2.length() <= 0) {
            optString2 = null;
        }
        String optString3 = jSONObject.optString("buildUuid");
        if (optString3.length() <= 0) {
            optString3 = null;
        }
        String optString4 = jSONObject.optString("sessionUuid");
        if (optString4.length() <= 0) {
            optString4 = null;
        }
        if (optString4 == null) {
            optString4 = UUID.randomUUID().toString();
        }
        String string3 = jSONObject.getString("device");
        String string4 = jSONObject.getString("deviceId");
        String string5 = jSONObject.getString("vendor");
        String string6 = jSONObject.getString("osVersion");
        boolean z2 = jSONObject.getBoolean("inBackground");
        boolean z3 = jSONObject.getBoolean("isRooted");
        JSONArray optJSONArray = jSONObject.optJSONArray("hostedLibrariesInfo");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            linkedHashMap = linkedHashMap2;
            set = SetsKt.emptySet();
        } else {
            Set createSetBuilder = SetsKt.createSetBuilder();
            int length2 = optJSONArray.length();
            linkedHashMap = linkedHashMap2;
            int i2 = 0;
            while (i2 < length2) {
                int i3 = length2;
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                JSONArray jSONArray = optJSONArray;
                String string7 = jSONObject3.getString(str6);
                String str8 = str6;
                String string8 = jSONObject3.getString(str5);
                String optString5 = jSONObject3.optString("buildUuid");
                if (optString5.length() > 0) {
                    String str9 = optString5;
                    str2 = str5;
                    str3 = str9;
                } else {
                    str2 = str5;
                    str3 = null;
                }
                String optString6 = jSONObject3.optString(str7);
                if (optString6.length() > 0) {
                    str4 = str7;
                } else {
                    str4 = str7;
                    optString6 = null;
                }
                createSetBuilder.add(new d37(string7, string8, str3, optString6));
                i2++;
                length2 = i3;
                optJSONArray = jSONArray;
                str6 = str8;
                str5 = str2;
                str7 = str4;
            }
            set = SetsKt.build(createSetBuilder);
        }
        return new g8f(string2, j, optString, optString2, optString3, optString4, string3, string4, string5, string6, z2, z3, linkedHashMap, set);
    }

    public static String A0(g8f g8f) {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("versionName", (Object) g8f.a);
        jSONObject.put("versionCode", g8f.b);
        jSONObject.put("packageName", (Object) g8f.c);
        jSONObject.put("environment", (Object) g8f.d);
        jSONObject.put("buildUuid", (Object) g8f.e);
        jSONObject.put("sessionUuid", (Object) g8f.f);
        jSONObject.put("device", (Object) g8f.g);
        jSONObject.put("deviceId", (Object) g8f.h);
        jSONObject.put("vendor", (Object) g8f.i);
        jSONObject.put("osVersion", (Object) g8f.j);
        jSONObject.put("inBackground", g8f.k);
        jSONObject.put("isRooted", g8f.l);
        jSONObject.put("properties", (Object) new JSONObject((Map<?, ?>) g8f.m));
        Set<d37> set = g8f.n;
        if (set == null || set.isEmpty()) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray();
            for (d37 d37 : set) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("packageName", (Object) d37.a);
                jSONObject2.put("versionName", (Object) d37.b);
                jSONObject2.put("buildUuid", (Object) d37.c);
                jSONObject2.put("environment", (Object) d37.d);
                jSONArray.put((Object) jSONObject2);
            }
        }
        jSONObject.put("hostedLibrariesInfo", (Object) jSONArray);
        return jSONObject.toString();
    }

    public static l20 B(ha9 ha9, String str) {
        if (ha9 == null || !ha9.o()) {
            return null;
        }
        int i = 0;
        while (true) {
            w28 w28 = ha9.x0;
            if (i >= w28.G()) {
                return null;
            }
            l20 F = w28.F(i);
            if (cvg.c(F.q, str)) {
                return F;
            }
            i++;
        }
    }

    public static final thf B0(m1g m1g, o5f o5f) {
        k1g k1g = m1g.b;
        shf shf = null;
        rhf rhf = k1g != null ? new rhf(k1g.a, k1g.b) : null;
        Iterable iterable = m1g.c;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            if (!(m1g.a == null || o5f == null)) {
                shf = new shf(o5f);
            }
            return new thf(shf, rhf, arrayList);
        }
        rae.w(it.next());
        throw null;
    }

    public static int C(l20 l20) {
        if (l20.f()) {
            return l20.b.o;
        }
        boolean W = W(l20);
        s10 s10 = l20.j;
        if (W) {
            return s10.d.b.o;
        }
        if (l20.i()) {
            return l20.d.e;
        }
        if (Y(l20)) {
            return s10.d.d.e;
        }
        if (l20.h()) {
            return l20.f.d;
        }
        return 0;
    }

    public static final void C0(fwf fwf) {
        fwf.c(dn4.class, new qid(19));
    }

    public static byte[] D(l20 l20) {
        if (l20.f()) {
            return l20.b.w;
        }
        if (l20.i()) {
            return l20.d.i;
        }
        boolean W = W(l20);
        s10 s10 = l20.j;
        if (W) {
            return s10.d.b.w;
        }
        if (Y(l20)) {
            return s10.d.d.i;
        }
        if (l20.g()) {
            c20 c20 = l20.g;
            if (c20.a()) {
                return c20.f.w;
            }
        }
        return null;
    }

    public static String E(l20 l20) {
        if (l20.f()) {
            x10 x10 = l20.b;
            if (!x10.v) {
                return x10.a();
            }
        } else if (l20.i()) {
            return l20.d.c;
        } else {
            if (Y(l20)) {
                return l20.j.d.d.c;
            }
            if (l20.h()) {
                f20 f20 = l20.f;
                return !cvg.A(f20.h) ? f20.h : f20.b;
            } else if (l20.g()) {
                c20 c20 = l20.g;
                if (c20.a()) {
                    return c20.f.a();
                }
            }
        }
        return null;
    }

    public static int F(l20 l20) {
        if (l20.f()) {
            return l20.b.c;
        }
        boolean W = W(l20);
        s10 s10 = l20.j;
        if (W) {
            return s10.d.b.c;
        }
        if (l20.i()) {
            return l20.d.d;
        }
        if (Y(l20)) {
            return s10.d.d.d;
        }
        if (l20.h()) {
            return l20.f.c;
        }
        return 0;
    }

    public static int G(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return w53.h(colorForState, Math.min(Color.alpha(colorForState) * 2, KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public static EGLDisplay H() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        i("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        i("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        h();
        return eglGetDisplay;
    }

    public static EGLConfig I(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new Exception("eglChooseConfig failed.");
    }

    public static String J(s10 s10) {
        int lastIndexOf;
        if (s10 == null) {
            return null;
        }
        String str = s10.c;
        if (!cvg.A(str) && (lastIndexOf = str.lastIndexOf(46)) != -1 && lastIndexOf < str.length()) {
            return str.substring(lastIndexOf + 1);
        }
        return null;
    }

    public static h97 K(InputStream inputStream) {
        int i;
        i97 i97 = (i97) i97.d.getValue();
        int i2 = i97.a;
        byte[] bArr = new byte[i2];
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i2);
                i = hi7.J(inputStream, bArr, i2);
            } finally {
                inputStream.reset();
            }
        } else {
            i = hi7.J(inputStream, bArr, i2);
        }
        h97 a2 = i97.c.a(i, bArr);
        boolean areEqual = Intrinsics.areEqual((Object) a2, (Object) eg4.m);
        h97 h97 = h97.c;
        if (areEqual) {
            a2 = h97;
        }
        if (a2 != h97) {
            return a2;
        }
        List<g97> list = i97.b;
        if (list == null) {
            return h97;
        }
        for (g97 a3 : list) {
            h97 a4 = a3.a(i, bArr);
            if (a4 != h97) {
                return a4;
            }
        }
        return h97;
    }

    public static float L(int i, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= c44.DEFAULT_ASPECT_RATIO && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final PackageInfo M(PackageManager packageManager, String str) {
        return Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of((long) 0)) : packageManager.getPackageInfo(str, 0);
    }

    public static final int N(Layout layout) {
        if (layout != null) {
            return layout.getHeight();
        }
        return 0;
    }

    public static final int O(Layout layout) {
        if (layout == null) {
            return 0;
        }
        return layout.getLineCount() > 0 ? (int) layout.getLineMax(0) : layout.getWidth();
    }

    public static void R(Context context) {
        boolean z2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (!te8.l(context).getBoolean("proxy_notification_initialized", false)) {
            try {
                Context applicationContext = context.getApplicationContext();
                PackageManager packageManager = applicationContext.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), Uuid.SIZE_BITS)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled"))) {
                    z2 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    new hu2((Object) context, z2, (Object) new qdf(), 3).run();
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z2 = true;
            new hu2((Object) context, z2, (Object) new qdf(), 3).run();
        }
    }

    public static boolean T(l20 l20) {
        if (l20 == null) {
            return false;
        }
        int ordinal = l20.a.ordinal();
        return ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal == 9 && l20.j.a == 0 : l20.e.a == 0 : l20.d.a == 0 : l20.b.y == 0;
    }

    public static boolean U(ha9 ha9) {
        if (!ha9.o()) {
            return false;
        }
        w28 w28 = ha9.x0;
        return w28.F(0).a() && cvg.D(w28.F(0).e.f);
    }

    public static boolean V(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = defpackage.g20.X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r1 = (r3 = r3.j).d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean W(defpackage.l20 r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0021
            g20 r1 = defpackage.g20.X
            g20 r2 = r3.a
            if (r2 == r1) goto L_0x000a
            goto L_0x0021
        L_0x000a:
            s10 r3 = r3.j
            if (r3 == 0) goto L_0x0021
            l20 r1 = r3.d
            if (r1 == 0) goto L_0x0021
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x0021
            l20 r3 = r3.d
            x10 r3 = r3.b
            boolean r3 = r3.v
            if (r3 != 0) goto L_0x0021
            r0 = 1
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld8.W(l20):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r3 = (r3 = r3.b()).d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean X(defpackage.j10 r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x001b
            g20 r1 = r3.a
            g20 r2 = defpackage.g20.X
            if (r1 == r2) goto L_0x000a
            goto L_0x001b
        L_0x000a:
            s10 r3 = r3.b()
            if (r3 == 0) goto L_0x001b
            l20 r3 = r3.d
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.i()
            if (r3 == 0) goto L_0x001b
            r0 = 1
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld8.X(j10):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = defpackage.g20.X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r3 = (r3 = r3.j).d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean Y(defpackage.l20 r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0019
            g20 r1 = defpackage.g20.X
            g20 r2 = r3.a
            if (r2 == r1) goto L_0x000a
            goto L_0x0019
        L_0x000a:
            s10 r3 = r3.j
            if (r3 == 0) goto L_0x0019
            l20 r3 = r3.d
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.i()
            if (r3 == 0) goto L_0x0019
            r0 = 1
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld8.Y(l20):boolean");
    }

    public static boolean Z(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static boolean a0(jtb jtb, k20 k20) {
        return k20 != null && k20.f && ((ltb) jtb).a.m() < k20.j;
    }

    public static boolean b(a89 a89, a89 a892) {
        if (a89.a.o() != a892.a.o()) {
            return true;
        }
        ha9 ha9 = a89.a;
        boolean o2 = ha9.o();
        ha9 ha92 = a892.a;
        if (!o2 && !ha92.o()) {
            return false;
        }
        List<l20> list = (List) ha9.x0.b;
        List list2 = (List) ha92.x0.b;
        if (list.size() != list2.size()) {
            return true;
        }
        Iterator it = list2.iterator();
        for (l20 l20 : list) {
            if (!cvg.c(l20.q, ((l20) it.next()).q)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b0(ltb ltb, l20 l20) {
        if (l20 == null) {
            return false;
        }
        return a0(ltb, Y(l20) ? l20.j.d.d : l20.d);
    }

    public static void c(int i, int i2) {
        boolean z2 = true;
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        if (i3 <= 0) {
            z2 = false;
        }
        n79.m("Create a OpenGL context first or run the GL methods on an OpenGL thread.", z2);
        if (i < 0 || i2 < 0) {
            throw new Exception("width or height is less than 0");
        } else if (i > i3 || i2 > i3) {
            throw new Exception(wj6.h(i3, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
    }

    public static boolean c0(l20 l20) {
        return C(l20) > F(l20);
    }

    public static void d(int i, int i2, int i3) {
        GLES20.glBindTexture(i, i2);
        h();
        GLES20.glTexParameteri(i, 10240, i3);
        h();
        GLES20.glTexParameteri(i, 10241, i3);
        h();
        GLES20.glTexParameteri(i, 10242, 33071);
        h();
        GLES20.glTexParameteri(i, 10243, 33071);
        h();
    }

    public static boolean d0(l20 l20) {
        if (l20 == null) {
            return false;
        }
        d20 d20 = l20.n;
        if (!d20.d()) {
            return false;
        }
        if (Y(l20)) {
            s10 s10 = l20.j;
            return s10 != null && s10.a == 0 && !d20.b();
        }
        k20 k20 = l20.d;
        return k20 != null && k20.a == 0 && !d20.b();
    }

    public static String e(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte valueOf : bArr) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
        }
        return sb.toString();
    }

    public static final void e0(Spannable spannable, int i, int i2) {
        jf8[] jf8Arr = (jf8[]) spannable.getSpans(i, i2, jf8.class);
        if (jf8Arr.length != 0) {
            for (jf8 l0 : jf8Arr) {
                l0(spannable, l0, i, i2);
            }
        }
    }

    public static final void f(Spannable spannable, boolean z2) {
        Object[] objArr;
        int spanStart;
        int spanEnd;
        int length;
        try {
            objArr = spannable.getSpans(0, spannable.length(), Object.class);
        } catch (Throwable unused) {
            objArr = null;
        }
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj == null || ((z2 && (obj instanceof NoCopySpan)) || (spanStart = spannable.getSpanStart(obj)) < 0 || (spanEnd = spannable.getSpanEnd(obj)) < 0 || spanEnd < spanStart || spanStart > (length = spannable.length()) || spanEnd > length)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static final int f0(Context context) {
        return Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
    }

    public static void g(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder m = g63.m(str, ", error code: 0x");
            m.append(Integer.toHexString(eglGetError));
            throw new Exception(m.toString());
        }
    }

    public static boolean g0(l20 l20, a89 a89) {
        s10 s10;
        l20 l202 = null;
        if (l20 != null) {
            if (!l20.f() && (l20.a != g20.X || (s10 = l20.j) == null || (l20 = s10.d) == null || !l20.f())) {
                l20 = null;
            }
            l202 = l20;
        }
        return l202 != null && l202.f() && l202.y && !l202.x && !a89.b.w;
    }

    public static void h() {
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z2) {
                sb.append(10);
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z2 = true;
        }
        if (z2) {
            throw new Exception(sb.toString());
        }
    }

    public static void i(String str, boolean z2) {
        if (!z2) {
            throw new Exception(str);
        }
    }

    public static Class j(String str, boolean z2) {
        if (z2 && TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (Exception e) {
            StringBuilder p = tr1.p("An exception occurred while finding class for name ", str, ". ");
            p.append(e.getMessage());
            throw new RuntimeException(p.toString());
        }
    }

    public static u21 j0(ze1 ze1, boolean z2, y8b y8b, Point point) {
        ze1 ze12 = ze1;
        y8b y8b2 = y8b;
        List createListBuilder = CollectionsKt.createListBuilder();
        if (!Intrinsics.areEqual((Object) y8b2.a.getId(), (Object) ze1)) {
            createListBuilder.add(new ow3(qqa.r, (ngf) new igf(sqa.I0), Integer.valueOf(pqa.E), (Integer) null, 20));
        } else {
            cf1 cf1 = y8b2.a;
            if (Intrinsics.areEqual((Object) cf1.getId(), (Object) ze1) && cf1.b()) {
                createListBuilder.add(new ow3(qqa.o, (ngf) new igf(sqa.L0), Integer.valueOf(pqa.M), (Integer) null, 20));
            }
        }
        if (z2) {
            createListBuilder.add(new ow3(qqa.q, (ngf) new igf(sqa.K0), Integer.valueOf(pqa.X), (Integer) null, 20));
        } else {
            createListBuilder.add(new ow3(qqa.p, (ngf) new igf(sqa.J0), Integer.valueOf(pqa.H), (Integer) null, 20));
        }
        List build = CollectionsKt.build(createListBuilder);
        Bundle bundle = new Bundle(0);
        bundle.putParcelable("call_participant_id", ze1);
        return new u21(bundle, build, point);
    }

    public static void k() {
        GLES20.glClearColor(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        h();
    }

    public static final void k0(Spannable spannable, int i, int i2, boolean z2, jf8 jf8) {
        Class<?> cls = jf8.getClass();
        String obj = spannable.toString();
        List<jf8> list = ArraysKt.toList((T[]) spannable.getSpans(i, i2, cls));
        for (jf8 jf82 : list) {
            if (spannable.getSpanStart(jf82) <= i && spannable.getSpanEnd(jf82) >= i2) {
                l0(spannable, jf82, i, i2);
                return;
            }
        }
        if (!z2) {
            for (int i3 = i; i3 < i2; i3++) {
                if (!CharsKt.isWhitespace(obj.charAt(i3))) {
                    for (jf8 jf83 : list) {
                        int spanStart = spannable.getSpanStart(jf83);
                        if (i3 > spannable.getSpanEnd(jf83) || spanStart > i3) {
                        }
                    }
                }
            }
            for (jf8 l0 : list) {
                l0(spannable, l0, i, i2);
            }
            return;
        }
        te8.B(spannable, jf8, i, i2);
    }

    public static void l(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static final void l0(Spannable spannable, zz3 zz3, int i, int i2) {
        int spanStart = spannable.getSpanStart(zz3);
        if (spanStart != -1) {
            int spanEnd = spannable.getSpanEnd(zz3);
            if (spanStart < i || spanEnd > i2) {
                int spanFlags = spannable.getSpanFlags(zz3);
                spannable.removeSpan(zz3);
                if (spanStart < i) {
                    spannable.setSpan(zz3.copy(), spanStart, i, spanFlags);
                }
                if (spanEnd > i2) {
                    spannable.setSpan(zz3.copy(), i2, spanEnd, spanFlags);
                    return;
                }
                return;
            }
            spannable.removeSpan(zz3);
        }
    }

    public static boolean m(String str) {
        HashMap hashMap = ey3.c;
        ay3 ay3 = (ay3) hashMap.get(str);
        if (ay3 == null) {
            return false;
        }
        ay3.a.a();
        hashMap.remove(str);
        return true;
    }

    public static final void m0(Spannable spannable, Class cls, int i, int i2) {
        try {
            for (Object removeSpan : spannable.getSpans(i, i2, cls)) {
                spannable.removeSpan(removeSpan);
            }
        } catch (Throwable unused) {
        }
    }

    public static long[] n(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static int n0(int i, int i2, Context context) {
        TypedValue T = b59.T(i, context);
        return (T == null || T.type != 16) ? i2 : T.data;
    }

    public static void o(va5 va5, OutputStream outputStream, int i) {
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
        while (i > 0) {
            int min = Math.min(i, ConstantsKt.DEFAULT_BUFFER_SIZE);
            int read = va5.read(bArr, 0, min);
            if (read == min) {
                i -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    public static TimeInterpolator o0(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!Z(valueOf, "cubic-bezier") && !Z(valueOf, ClientCookie.PATH_ATTR)) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (Z(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return kab.b(L(0, split), L(1, split), L(2, split), L(3, split));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (Z(valueOf, ClientCookie.PATH_ATTR)) {
                return kab.c(b59.p(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
    }

    public static void p(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static final CharSequence p0(CharSequence charSequence) {
        return q0(charSequence);
    }

    public static float[] q() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static CharSequence q0(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            if (charSequence instanceof gge) {
                return (SpannableString) charSequence;
            }
            int i = gge.a;
            return sq6.A(charSequence, true);
        } catch (Throwable th) {
            z68.f("Markdown", "fail to make safeCopy of " + charSequence, th);
            return charSequence;
        }
    }

    public static EGLContext r(EGLContext eGLContext, EGLDisplay eGLDisplay, int i, int[] iArr) {
        boolean z2 = true;
        n79.g(Arrays.equals(iArr, c) || Arrays.equals(iArr, o));
        if (!(i == 2 || i == 3)) {
            z2 = false;
        }
        n79.g(z2);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, I(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
        if (eglCreateContext != null) {
            h();
            return eglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new Exception(wj6.h(i, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
    }

    public static ColorStateList r0(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }

    public static EGLSurface s(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        EGLSurface eGLSurface;
        int[] iArr = c;
        if (V("EGL_KHR_surfaceless_context")) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, I(eGLDisplay, iArr), new int[]{12375, 1, 12374, 1, 12344}, 0);
            g("Error creating a new EGL Pbuffer surface");
        }
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        g("Error making context current");
        y(0, 1, 1);
        return eGLSurface;
    }

    public static long t() {
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        h();
        if (((long) iArr[0]) < 3) {
            return 0;
        }
        long glFenceSync = GLES30.glFenceSync(37143, 0);
        h();
        GLES20.glFlush();
        h();
        return glFenceSync;
    }

    public static float[] u(List list) {
        float[] fArr = new float[(list.size() * 4)];
        for (int i = 0; i < list.size(); i++) {
            System.arraycopy(list.get(i), 0, fArr, i * 4, 4);
        }
        return fArr;
    }

    public static void v(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        if (eGLDisplay != null) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            g("Error releasing context");
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                g("Error destroying context");
            }
            EGL14.eglReleaseThread();
            g("Error releasing thread");
            EGL14.eglTerminate(eGLDisplay);
            g("Error terminating display");
        }
    }

    public static void v0(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static boolean w(l20 l20) {
        if (Y(l20)) {
            l20 = l20.j.d;
        }
        k20 k20 = l20.d;
        return k20 != null && !k20.f && k20.b > 0 && k20.j > 0;
    }

    public static boolean w0(int[] iArr) {
        boolean z2 = false;
        boolean z3 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z2 = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z3 = true;
            }
        }
        return z2 && z3;
    }

    public static boolean x(String str, String str2) {
        return !cvg.A(str) && !cvg.A(str2) && cvg.c(str, str2);
    }

    public static boolean x0(jtb jtb, k20 k20) {
        if (k20 == null || !k20.f) {
            return false;
        }
        return a0(jtb, k20) || cvg.A(k20.c);
    }

    public static void y(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i) {
            GLES20.glBindFramebuffer(36160, i);
        }
        h();
        GLES20.glViewport(0, 0, i2, i3);
        h();
    }

    public static boolean y0(ltb ltb, l20 l20) {
        if (l20 == null) {
            return false;
        }
        return x0(ltb, Y(l20) ? l20.j.d.d : l20.d);
    }

    public static ey3 z(Bundle bundle) {
        String string;
        Bundle bundle2;
        if (bundle == null || (string = bundle.getString("ControllerChangeHandler.className")) == null || (bundle2 = bundle.getBundle("ControllerChangeHandler.savedState")) == null) {
            return null;
        }
        try {
            Class j = j(string, true);
            ey3 ey3 = (ey3) (j != null ? j.newInstance() : null);
            if (ey3 == null) {
                return null;
            }
            ey3.h(bundle2);
            return ey3;
        } catch (Exception e) {
            StringBuilder p = tr1.p("An exception occurred while creating a new instance of ", string, ". ");
            p.append(e.getMessage());
            throw new RuntimeException(p.toString());
        }
    }

    public abstract CharSequence P();

    public abstract void Q(int i);

    public abstract boolean S();

    public abstract View h0(int i);

    public abstract boolean i0();

    public abstract void s0(boolean z2);

    public abstract void t0(boolean z2);

    public abstract void u0();

    public abstract void z0(int i);
}
