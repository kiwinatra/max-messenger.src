package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.RectF;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.format.DateFormat;
import android.util.Range;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* renamed from: j4b  reason: default package */
public abstract class j4b implements SdpObserver {
    public static final /* synthetic */ int A = 0;
    public static boolean B = true;
    public static volatile List C;
    public static final /* synthetic */ int D = 0;
    public static SimpleDateFormat a;
    public static final Object b = new Object();
    public static SimpleDateFormat c;
    public static final Object d = new Object();
    public static SimpleDateFormat e;
    public static final Object f = new Object();
    public static SimpleDateFormat g;
    public static final Object h = new Object();
    public static SimpleDateFormat i;
    public static final Object j = new Object();
    public static SimpleDateFormat k;
    public static final Object l = new Object();
    public static SimpleDateFormat m;
    public static final Object n = new Object();
    public static final Object o = new Object();
    public static SimpleDateFormat p;
    public static SimpleDateFormat q;
    public static SimpleDateFormat r;
    public static Boolean s;
    public static final Object t = new Object();
    public static SimpleDateFormat u;
    public static final Object v = new Object();
    public static final h97 w = new h97("drawable", ".drawable");
    public static final int[] x = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static boolean y;
    public static AnimatedFactoryV2Impl z;

    public static String A(Locale locale, long j2, boolean z2) {
        String str;
        if (z2) {
            synchronized (j) {
                if (i == null) {
                    i = new SimpleDateFormat("d MMM yyyy", locale);
                }
                str = i.format(Long.valueOf(j2));
            }
        } else {
            synchronized (h) {
                if (g == null) {
                    g = new SimpleDateFormat("d MMM", locale);
                }
                str = g.format(Long.valueOf(j2));
            }
        }
        return str;
    }

    public static String B(Locale locale, long j2, boolean z2) {
        String format;
        String format2;
        if (z2) {
            synchronized (f) {
                if (e == null) {
                    e = new SimpleDateFormat("d MMM yyyy", locale);
                }
                format2 = e.format(Long.valueOf(j2));
            }
            return format2;
        }
        synchronized (d) {
            if (c == null) {
                c = new SimpleDateFormat("d MMM", locale);
            }
            format = c.format(Long.valueOf(j2));
        }
        return format;
    }

    public static String C(Context context, Locale locale, long j2, boolean z2) {
        String str;
        String string = context.getString(tmc.tt_at);
        if (z2) {
            synchronized (l) {
                if (k == null) {
                    k = new SimpleDateFormat("dd.MM.yy", locale);
                }
                str = k.format(Long.valueOf(j2));
            }
        } else {
            str = A(locale, j2, false);
        }
        return String.format(string, new Object[]{str, s(context, j2, locale)});
    }

    public static boolean D(Context context) {
        boolean booleanValue;
        synchronized (t) {
            try {
                if (s == null) {
                    s = Boolean.valueOf(DateFormat.is24HourFormat(context));
                }
                booleanValue = s.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static s8 E(dv7 dv7, ViewGroup viewGroup, Bundle bundle, bv7 bv7) {
        Map map = dv7.h().j;
        LinkedHashMap linkedHashMap = ev7.a;
        s8 s8Var = (s8) map.get(Integer.valueOf(viewGroup.getId()));
        if (s8Var != null) {
            s8Var.Z(bv7, viewGroup);
            return s8Var;
        }
        s8 s8Var2 = new s8();
        s8Var2.Z(bv7, viewGroup);
        if (bundle != null) {
            StringBuilder sb = new StringBuilder("LifecycleHandler.routerState");
            ViewGroup viewGroup2 = s8Var2.i;
            sb.append(viewGroup2 != null ? viewGroup2.getId() : 0);
            Bundle bundle2 = bundle.getBundle(sb.toString());
            if (bundle2 != null) {
                s8Var2.N(bundle2);
            }
        }
        dv7.h().j.put(Integer.valueOf(viewGroup.getId()), s8Var2);
        return s8Var2;
    }

    public static List F(dv7 dv7) {
        return CollectionsKt.toList(dv7.h().j.values());
    }

    public static int G(String str) {
        if (cvg.A(str)) {
            return 0;
        }
        if (!str.startsWith("MP4") && !str.startsWith("mp4")) {
            return 0;
        }
        try {
            return Integer.parseInt(str.split("_")[1]);
        } catch (Exception e2) {
            z68.f("j4b", "failed to parse mp4 video key: ".concat(str), e2);
            return 0;
        }
    }

    public static void H(dv7 dv7, int i2, int i3, Intent intent) {
        String str = (String) dv7.h().h.get(i2);
        if (str != null) {
            for (s8 f2 : F(dv7)) {
                zx3 f3 = f2.f(str);
                if (f3 != null) {
                    f3.onActivityResult(i2, i3, intent);
                }
            }
        }
    }

    public static void I(dv7 dv7, Context context) {
        if (context instanceof Activity) {
            dv7.h().b = (Activity) context;
        }
        dv7.h().d = false;
        if (!dv7.h().e) {
            dv7.h().e = true;
            int size = dv7.h().i.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = size - 1;
                    nbb nbb = (nbb) dv7.h().i.remove(size);
                    dv7.G(nbb.a, nbb.b, nbb.c);
                    if (i2 < 0) {
                        break;
                    }
                    size = i2;
                }
            }
            for (s8 u2 : F(dv7)) {
                u2.u();
            }
        }
    }

    public static void J(dv7 dv7, Bundle bundle) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        if (bundle != null) {
            cv7 h2 = dv7.h();
            cye cye = (cye) bundle.getParcelable("LifecycleHandler.permissionRequests");
            if (cye == null || (sparseArray = cye.a) == null) {
                sparseArray = new SparseArray();
            }
            h2.g = sparseArray;
            cv7 h3 = dv7.h();
            cye cye2 = (cye) bundle.getParcelable("LifecycleHandler.activityRequests");
            if (cye2 == null || (sparseArray2 = cye2.a) == null) {
                sparseArray2 = new SparseArray();
            }
            h3.h = sparseArray2;
            cv7 h4 = dv7.h();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("LifecycleHandler.pendingPermissionRequests");
            if (parcelableArrayList == null) {
                parcelableArrayList = new ArrayList();
            }
            h4.i = parcelableArrayList;
        }
    }

    public static void K(dv7 dv7) {
        Activity activity = dv7.h().b;
        if (activity != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(dv7);
            ev7.a.remove(activity);
            o(dv7, false);
            dv7.h().b = null;
        }
        dv7.h().j.clear();
    }

    public static boolean L(dv7 dv7, MenuItem menuItem, Function0 function0) {
        Iterable F = F(dv7);
        if (!(F instanceof Collection) || !((Collection) F).isEmpty()) {
            Iterator it = F.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((s8) it.next()).w(menuItem)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return ((Boolean) function0.invoke()).booleanValue();
    }

    public static void M(dv7 dv7, int i2, String[] strArr, int[] iArr) {
        String str = (String) dv7.h().g.get(i2);
        if (str != null) {
            for (s8 f2 : F(dv7)) {
                zx3 f3 = f2.f(str);
                if (f3 != null) {
                    f3.requestPermissionsResult(i2, strArr, iArr);
                }
            }
        }
    }

    public static void N(dv7 dv7, Bundle bundle) {
        bundle.putParcelable("LifecycleHandler.permissionRequests", new cye(dv7.h().g));
        bundle.putParcelable("LifecycleHandler.activityRequests", new cye(dv7.h().h));
        bundle.putParcelableArrayList("LifecycleHandler.pendingPermissionRequests", dv7.h().i);
    }

    public static void O(dv7 dv7, Activity activity, bv7 bv7) {
        dv7.h().b = activity;
        if (!dv7.h().c) {
            dv7.h().c = true;
            activity.getApplication().registerActivityLifecycleCallbacks(dv7);
            ev7.a.put(activity, bv7);
        }
    }

    public static void P(dv7 dv7, String str, String[] strArr, int i2) {
        if (dv7.h().e) {
            dv7.h().g.put(i2, str);
            dv7.requestPermissions(strArr, i2);
            return;
        }
        dv7.h().i.add(new nbb(str, strArr, i2));
    }

    public static void Q(dv7 dv7, String str) {
        int size = dv7.h().h.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (Intrinsics.areEqual((Object) str, dv7.h().h.get(dv7.h().h.keyAt(size)))) {
                dv7.h().h.removeAt(size);
            }
        }
    }

    public static void R(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            n(inputStream, fileOutputStream);
            fileOutputStream.flush();
        } finally {
            k(inputStream);
            j(fileOutputStream);
        }
    }

    public static String S(InputStream inputStream) {
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[20480];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, read);
        }
    }

    public static boolean T(int i2, boolean z2) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z2) {
            return true;
        }
        int[] iArr = x;
        for (int i3 = 0; i3 < 29; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean U(d84 d84, d84 d842) {
        return d84.c.equals(d842.c) && d84.b.equals(d842.b) && d84.a.equals(d842.a);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object V(java.util.ArrayList r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof defpackage.ve0
            if (r0 == 0) goto L_0x0013
            r0 = r5
            ve0 r0 = (defpackage.ve0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            ve0 r0 = new ve0
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.util.Iterator r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x003a
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x003a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0051
            java.lang.Object r5 = r4.next()
            pm7 r5 = (defpackage.pm7) r5
            r0.a = r4
            r0.c = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L_0x003a
            return r1
        L_0x0051:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j4b.V(java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object W(defpackage.pm7[] r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ue0
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ue0 r0 = (defpackage.ue0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            ue0 r0 = new ue0
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            int r6 = r0.c
            int r2 = r0.b
            java.lang.Object[] r4 = r0.a
            pm7[] r4 = (defpackage.pm7[]) r4
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r4
            goto L_0x0055
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0042:
            if (r2 >= r6) goto L_0x0057
            r4 = r7[r2]
            r0.a = r7
            r0.b = r2
            r0.c = r6
            r0.v = r3
            java.lang.Object r4 = r4.d(r0)
            if (r4 != r1) goto L_0x0055
            return r1
        L_0x0055:
            int r2 = r2 + r3
            goto L_0x0042
        L_0x0057:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j4b.W(pm7[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [q29, java.lang.Object, x04] */
    public static final x04 X(CoroutineContext coroutineContext, long j2, Function2 function2) {
        ? q29 = new q29();
        qm7 qm7 = new qm7((pm7) coroutineContext.get(om7.a));
        bi4 bi4 = dq4.a;
        q29.m = new pp0(q29, function2, j2, e14.a(lc8.a.t0().plus(coroutineContext).plus(qm7)), new ve(1, (Object) q29));
        return q29;
    }

    public static void Y(dv7 dv7, Activity activity) {
        if (ev7.a(activity, dv7.h().a) == dv7) {
            dv7.h().b = activity;
            for (s8 u2 : CollectionsKt.toList(dv7.h().j.values())) {
                u2.u();
            }
        }
    }

    public static void Z(dv7 dv7, Activity activity) {
        if (dv7.h().b == activity) {
            for (s8 q2 : F(dv7)) {
                q2.q(activity);
            }
        }
    }

    public static final void a(SpannableStringBuilder spannableStringBuilder, char c2, Object... objArr) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(c2);
        int length2 = spannableStringBuilder.length();
        for (Object span : objArr) {
            spannableStringBuilder.setSpan(span, length, length2, 33);
        }
    }

    public static void a0(dv7 dv7, Activity activity) {
        if (dv7.h().b == activity) {
            for (s8 r2 : F(dv7)) {
                r2.r(activity);
            }
        }
    }

    public static final void b(SpannableStringBuilder spannableStringBuilder, String str, Object... objArr) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(str);
        int length2 = spannableStringBuilder.length();
        for (Object span : objArr) {
            spannableStringBuilder.setSpan(span, length, length2, 33);
        }
    }

    public static void b0(dv7 dv7, Activity activity, Bundle bundle) {
        if (dv7.h().b == activity) {
            e0(dv7);
            for (s8 s8Var : F(dv7)) {
                Bundle bundle2 = new Bundle();
                s8Var.O(bundle2);
                StringBuilder sb = new StringBuilder("LifecycleHandler.routerState");
                ViewGroup viewGroup = s8Var.i;
                sb.append(viewGroup != null ? viewGroup.getId() : 0);
                bundle.putBundle(sb.toString(), bundle2);
            }
        }
    }

    public static void c(CaptureRequest.Builder builder, je3 je3) {
        wie E = er7.F(je3).E();
        for (la0 la0 : E.l()) {
            CaptureRequest.Key key = (CaptureRequest.Key) la0.c;
            try {
                builder.set(key, E.n(la0));
            } catch (IllegalArgumentException unused) {
                Objects.toString(key);
            }
        }
    }

    public static void c0(dv7 dv7, Activity activity) {
        if (dv7.h().b == activity) {
            dv7.h().f = false;
            for (s8 s2 : F(dv7)) {
                s2.s(activity);
            }
        }
    }

    public static void d(CaptureRequest.Builder builder, int i2, zq0 zq0) {
        Map map;
        if (i2 != 3 || !zq0.a) {
            if (i2 != 4) {
                zq0.getClass();
            } else if (zq0.b) {
                HashMap hashMap = new HashMap();
                hashMap.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                map = Collections.unmodifiableMap(hashMap);
            }
            map = Collections.emptyMap();
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            map = Collections.unmodifiableMap(hashMap2);
        }
        for (Map.Entry entry : map.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static void d0(dv7 dv7, Activity activity) {
        if (dv7.h().b == activity) {
            e0(dv7);
            for (s8 t2 : F(dv7)) {
                t2.t(activity);
            }
        }
    }

    public static void e0(dv7 dv7) {
        if (!dv7.h().f) {
            dv7.h().f = true;
            for (s8 F : F(dv7)) {
                F.F();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] f0(java.io.File r5) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream
            r1.<init>(r0)
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r5)
            r5 = 0
            r3 = 2
            r4 = 0
            kotlin.io.ByteStreamsKt.copyTo$default(r2, r1, r5, r3, r4)     // Catch:{ all -> 0x0020 }
            kotlin.io.CloseableKt.closeFinally(r2, r4)
            r1.close()
            byte[] r5 = r0.toByteArray()
            return r5
        L_0x0020:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j4b.f0(java.io.File):byte[]");
    }

    public static final Object g(Collection collection, Continuation continuation) {
        return collection.isEmpty() ? CollectionsKt.emptyList() : new te0((mk4[]) collection.toArray(new mk4[0])).a(continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0135, code lost:
        r3 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ife g0(defpackage.vf5 r21, boolean r22, boolean r23) {
        /*
            r0 = r21
            r1 = r23
            r2 = 7
            r3 = 1
            long r4 = r21.w()
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r9 = 4096(0x1000, double:2.0237E-320)
            if (r8 == 0) goto L_0x0018
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r9 = r4
        L_0x0018:
            int r9 = (int) r9
            l8b r10 = new l8b
            r11 = 64
            r10.<init>((int) r11)
            r11 = 0
            r12 = r11
            r13 = r12
        L_0x0023:
            if (r12 >= r9) goto L_0x0032
            r15 = 8
            r10.D(r15)
            byte[] r14 = r10.a
            boolean r14 = r0.q(r14, r11, r15, r3)
            if (r14 != 0) goto L_0x0035
        L_0x0032:
            r4 = r11
            goto L_0x0137
        L_0x0035:
            long r16 = r10.w()
            int r14 = r10.g()
            r18 = 1
            int r18 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r18 != 0) goto L_0x0056
            byte[] r3 = r10.a
            r0.m(r15, r3, r15)
            r3 = 16
            r10.F(r3)
            long r16 = r10.o()
        L_0x0051:
            r6 = r16
            r17 = r12
            goto L_0x006f
        L_0x0056:
            r19 = 0
            int r3 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x006d
            long r19 = r21.w()
            int r3 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x006d
            long r16 = r21.r()
            long r19 = r19 - r16
            long r6 = (long) r15
            long r16 = r19 + r6
        L_0x006d:
            r3 = r15
            goto L_0x0051
        L_0x006f:
            long r11 = (long) r3
            int r19 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r19 >= 0) goto L_0x007a
            p9a r0 = new p9a
            r0.<init>((int) r2)
            return r0
        L_0x007a:
            int r3 = r17 + r3
            r2 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r14 != r2) goto L_0x0092
            int r2 = (int) r6
            int r9 = r9 + r2
            if (r8 == 0) goto L_0x008b
            long r6 = (long) r9
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x008b
            int r9 = (int) r4
        L_0x008b:
            r12 = r3
            r2 = 7
            r3 = 1
            r6 = -1
            r11 = 0
            goto L_0x0023
        L_0x0092:
            r2 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r14 == r2) goto L_0x009c
            r2 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r14 != r2) goto L_0x009f
        L_0x009c:
            r6 = 1
            goto L_0x0135
        L_0x009f:
            r2 = 1835295092(0x6d646174, float:4.4175247E27)
            r19 = r4
            if (r14 != r2) goto L_0x00a7
            r13 = 1
        L_0x00a7:
            long r4 = (long) r3
            long r4 = r4 + r6
            long r4 = r4 - r11
            long r1 = (long) r9
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x00b2
            r3 = 0
            goto L_0x0138
        L_0x00b2:
            long r6 = r6 - r11
            int r1 = (int) r6
            int r12 = r3 + r1
            r2 = 1718909296(0x66747970, float:2.8862439E23)
            if (r14 != r2) goto L_0x0122
            if (r1 >= r15) goto L_0x00c4
            p9a r0 = new p9a
            r2 = 7
            r0.<init>((int) r2)
            return r0
        L_0x00c4:
            r2 = 7
            r10.D(r1)
            byte[] r3 = r10.a
            r4 = 0
            r0.m(r4, r3, r1)
            int r1 = r10.g()
            r3 = r23
            boolean r1 = T(r1, r3)
            if (r1 == 0) goto L_0x00db
            r13 = 1
        L_0x00db:
            r1 = 4
            r10.H(r1)
            int r5 = r10.a()
            int r5 = r5 / r1
            if (r13 != 0) goto L_0x0101
            if (r5 <= 0) goto L_0x0101
            int[] r14 = new int[r5]
            r1 = r4
        L_0x00eb:
            if (r1 >= r5) goto L_0x00ff
            int r6 = r10.g()
            r14[r1] = r6
            boolean r6 = T(r6, r3)
            if (r6 == 0) goto L_0x00fc
            r6 = 1
            r13 = 1
            goto L_0x0103
        L_0x00fc:
            r6 = 1
            int r1 = r1 + r6
            goto L_0x00eb
        L_0x00ff:
            r6 = 1
            goto L_0x0103
        L_0x0101:
            r6 = 1
            r14 = 0
        L_0x0103:
            if (r13 != 0) goto L_0x012c
            djd r0 = new djd
            r1 = 21
            r0.<init>((int) r1)
            if (r14 == 0) goto L_0x011f
            int r1 = defpackage.ob7.c
            int r1 = r14.length
            if (r1 != 0) goto L_0x0114
            goto L_0x0121
        L_0x0114:
            ob7 r1 = new ob7
            int r2 = r14.length
            int[] r2 = java.util.Arrays.copyOf(r14, r2)
            r1.<init>(r2)
            goto L_0x0121
        L_0x011f:
            int r1 = defpackage.ob7.c
        L_0x0121:
            return r0
        L_0x0122:
            r3 = r23
            r2 = 7
            r4 = 0
            r6 = 1
            if (r1 == 0) goto L_0x012c
            r0.s(r1)
        L_0x012c:
            r1 = r3
            r11 = r4
            r3 = r6
            r4 = r19
            r6 = -1
            goto L_0x0023
        L_0x0135:
            r3 = r6
            goto L_0x0138
        L_0x0137:
            r3 = r4
        L_0x0138:
            if (r13 != 0) goto L_0x013d
            t9a r0 = defpackage.t9a.w
            return r0
        L_0x013d:
            r0 = r22
            if (r0 == r3) goto L_0x0149
            if (r3 == 0) goto L_0x0146
            ejd r0 = defpackage.ejd.v
            goto L_0x0148
        L_0x0146:
            ejd r0 = defpackage.ejd.w
        L_0x0148:
            return r0
        L_0x0149:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j4b.g0(vf5, boolean, boolean):ife");
    }

    public static CaptureRequest h(bx1 bx1, CameraDevice cameraDevice, Map map, boolean z2, zq0 zq0) {
        CaptureRequest.Builder builder;
        it1 it1;
        if (cameraDevice == null) {
            return null;
        }
        List<lk4> unmodifiableList = Collections.unmodifiableList(bx1.a);
        ArrayList arrayList = new ArrayList();
        for (lk4 lk4 : unmodifiableList) {
            Surface surface = (Surface) map.get(lk4);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i2 = bx1.c;
        if (i2 == 5 && (it1 = bx1.h) != null && (it1.B() instanceof TotalCaptureResult)) {
            builder = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) it1.B());
        } else if (i2 == 5) {
            builder = cameraDevice.createCaptureRequest(z2 ? 1 : 2);
        } else {
            builder = cameraDevice.createCaptureRequest(i2);
        }
        d(builder, i2, zq0);
        la0 la0 = bx1.k;
        Range range = hc0.f;
        je3 je3 = bx1.b;
        Range range2 = (Range) je3.k(la0, range);
        Objects.requireNonNull(range2);
        if (!range2.equals(range)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            Range range3 = (Range) je3.k(la0, range);
            Objects.requireNonNull(range3);
            builder.set(key, range3);
        }
        if (bx1.b() == 1 || bx1.c() == 1) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (bx1.b() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (bx1.c() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        la0 la02 = bx1.i;
        if (je3.u(la02)) {
            builder.set(CaptureRequest.JPEG_ORIENTATION, (Integer) je3.n(la02));
        }
        la0 la03 = bx1.j;
        if (je3.u(la03)) {
            builder.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) je3.n(la03)).byteValue()));
        }
        c(builder, je3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            builder.addTarget((Surface) it.next());
        }
        builder.setTag(bx1.g);
        return builder.build();
    }

    public static final void h0(rvb rvb, WorkDatabase workDatabase, ve3 ve3, List list, xpg xpg, Set set) {
        ypg y2 = workDatabase.y();
        String str = xpg.a;
        xpg m2 = y2.m(str);
        if (m2 == null) {
            throw new IllegalArgumentException(wj6.k("Worker with ", str, " doesn't exist"));
        } else if (!m2.b.a()) {
            if (!(m2.d() ^ xpg.d())) {
                boolean d2 = rvb.d(str);
                if (!d2) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((mfd) it.next()).d(str);
                    }
                }
                workDatabase.q(new kqg(workDatabase, xpg, m2, list, str, set, d2));
                if (!d2) {
                    yfd.a(ve3, workDatabase, list);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Can't update ");
            m61 m61 = m61.B0;
            sb.append((String) m61.invoke(m2));
            sb.append(" Worker to ");
            throw new UnsupportedOperationException(wj6.n(sb, (String) m61.invoke(xpg), " Worker. Update operation must preserve worker's type."));
        }
    }

    public static void i(long j2, String str) {
        if (j2 < 0) {
            throw new IllegalArgumentException(str + " (" + j2 + ") must be >= 0");
        }
    }

    public static final void i0(fwf fwf) {
        fwf.e(edb.class, new zoa(29));
        fwf.e(ocb.class, new jcb(0));
    }

    public static void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static final void j0(fwf fwf) {
        fwf.e(yd9.class, new fm8(28));
        fwf.e(zqc.class, new fm8(29));
    }

    public static void k(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static scf k0(Context context) {
        Object obj;
        while (!(context instanceof xhf)) {
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                try {
                    Result.Companion companion = Result.Companion;
                    xhf xhf = scf.c0;
                    if (xhf == null) {
                        xhf = null;
                    }
                    obj = Result.m23constructorimpl(xhf.K0());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.m23constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m26exceptionOrNullimpl(obj) != null) {
                    obj = vi4.f0;
                }
                return (scf) obj;
            }
        }
        return ((xhf) context).K0();
    }

    public static a20 l(RectF rectF) {
        if (rectF == null) {
            return null;
        }
        return new a20(rectF.left, rectF.top, rectF.right, rectF.bottom, 3);
    }

    public static final int l0(float f2, int i2) {
        return Color.argb(MathKt.roundToInt(f2 * 255.0f), Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m(java.io.File r9, java.io.File r10) {
        /*
            boolean r0 = r10.exists()
            if (r0 != 0) goto L_0x0009
            r10.createNewFile()
        L_0x0009:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0033 }
            r1.<init>(r9)     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel r9 = r1.getChannel()     // Catch:{ all -> 0x0033 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x002e }
            r1.<init>(r10)     // Catch:{ all -> 0x002e }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ all -> 0x002e }
            long r6 = r9.size()     // Catch:{ all -> 0x002e }
            r4 = 0
            r2 = r0
            r3 = r9
            r2.transferFrom(r3, r4, r6)     // Catch:{ all -> 0x002e }
            r9.close()
            r0.close()
            return
        L_0x002e:
            r10 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L_0x0035
        L_0x0033:
            r10 = move-exception
            r9 = r0
        L_0x0035:
            if (r0 == 0) goto L_0x003a
            r0.close()
        L_0x003a:
            if (r9 == 0) goto L_0x003f
            r9.close()
        L_0x003f:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j4b.m(java.io.File, java.io.File):void");
    }

    public static long n(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[20480];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j2;
            }
            outputStream.write(bArr, 0, read);
            j2 += (long) read;
        }
    }

    public static void o(dv7 dv7, boolean z2) {
        if (!dv7.h().d) {
            dv7.h().d = true;
            Activity activity = dv7.h().b;
            if (activity != null) {
                for (s8 p2 : F(dv7)) {
                    p2.p(activity, z2);
                }
            }
        }
    }

    public static final apf p(String str) {
        List list = C;
        if (list == null) {
            List createListBuilder = CollectionsKt.createListBuilder();
            try {
                for (Object add : Arrays.asList(new apf[]{new mof()})) {
                    createListBuilder.add(add);
                }
                C = createListBuilder;
                list = CollectionsKt.build(createListBuilder);
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
        if (list.size() > 1) {
            throw new IllegalStateException(("More then one manifest found: " + CollectionsKt___CollectionsKt.joinToString$default(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, m61.w0, 31, (Object) null)).toString());
        } else if (list.size() != 1) {
            return null;
        } else {
            apf apf = (apf) list.get(0);
            if (Intrinsics.areEqual((Object) apf.a(), (Object) str)) {
                return apf;
            }
            throw new IllegalStateException(("Unexpected " + apf.getClass().getName() + ".applicationId()").toString());
        }
    }

    public static String q(long j2, Context context) {
        if (j2 < 60000) {
            return context.getString(tmc.tt_pin_lock_always);
        }
        if (j2 < 3600000) {
            return v(zjc.tt_dates_minutes_after, (int) (j2 / 60000), context);
        }
        if (j2 < 86400000) {
            return v(zjc.tt_dates_hours_after, (int) (j2 / 3600000), context);
        }
        return v(zjc.tt_dates_days, ((int) (j2 / 3600000)) / 24, context);
    }

    public static String r(Context context, Locale locale, long j2, long j3, boolean z2) {
        Context context2 = context;
        Locale locale2 = locale;
        long j4 = j2;
        long j5 = j3;
        long j6 = j5 - j4;
        d84 g2 = d84.g(j4, TimeZone.getDefault());
        if (j6 < 86400000) {
            return U(d84.g(j5, TimeZone.getDefault()), d84.g(j4, TimeZone.getDefault())) ? s(context2, j4, locale2) : z2 ? j6 < 14400000 ? s(context2, j4, locale2) : context2.getString(tmc.tt_dates_yesterday) : String.format(context2.getString(tmc.tt_dates_yesterday_at), new Object[]{s(context2, j4, locale2)});
        }
        d84 g3 = d84.g(j5, TimeZone.getDefault());
        g2.f();
        Integer num = g2.c;
        g2.f();
        d84 l2 = new d84(g2.a, g2.b, num, (Integer) null, (Integer) null, (Integer) null, 0).l(1);
        g3.f();
        Integer num2 = g3.c;
        g3.f();
        d84 d84 = r9;
        d84 d842 = new d84(g3.a, g3.b, num2, (Integer) null, (Integer) null, (Integer) null, 0);
        return l2.equals(d84) ? z2 ? context2.getString(tmc.tt_dates_yesterday) : String.format(context2.getString(tmc.tt_dates_yesterday_at), new Object[]{s(context2, j4, locale2)}) : g2.a.equals(g3.a) ? B(locale2, j4, false) : B(locale2, j4, true);
    }

    public static String s(Context context, long j2, Locale locale) {
        String format;
        synchronized (b) {
            if (a == null) {
                a = new SimpleDateFormat(D(context) ? "HH:mm" : "h:mm a", locale);
            }
            format = a.format(Long.valueOf(j2));
        }
        return format;
    }

    public static String t(long j2) {
        int i2 = ((int) j2) / 60;
        long j3 = j2 - ((long) (i2 * 60));
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(":");
        sb.append(j3 < 10 ? "0" : "");
        sb.append(j3);
        return sb.toString();
    }

    public static String u(Context context, long j2, long j3) {
        long j4 = j3 - j2;
        if (j3 == -1) {
            return context.getString(tmc.tt_off);
        }
        if (j2 > j3) {
            return null;
        }
        if (j4 < 3600000) {
            return v(zjc.tt_dates_minutes, (int) (j4 / 60000), context);
        } else if (j4 < 86400000) {
            return v(zjc.tt_dates_hours, Math.round(((float) j4) / 3600000.0f), context);
        } else {
            return v(zjc.tt_dates_days, ((int) (j4 / 3600000)) / 24, context);
        }
    }

    public static String v(int i2, int i3, Context context) {
        String[] strArr = ghf.c;
        return String.format(context.getResources().getQuantityString(i2, i3), new Object[]{Integer.valueOf(i3)});
    }

    public static String w(Locale locale, long j2) {
        String format;
        synchronized ("HH:mm dd.MM.yy") {
            if (p == null) {
                p = new SimpleDateFormat("HH:mm dd.MM.yy", locale);
            }
            format = p.format(Long.valueOf(j2));
        }
        return format;
    }

    public static String y(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str = null;
        for (Map.Entry entry : map.entrySet()) {
            int G = G((String) entry.getKey());
            if (G != 0 && (str == null || G > G(str))) {
                str = (String) entry.getKey();
            }
        }
        if (str != null) {
            return (String) map.get(str);
        }
        return null;
    }

    public static p01 z(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (j4 <= 0) {
            return new p01(0, 10, 1, false);
        }
        long j6 = j5 - j4;
        if (j6 < 0) {
            return new p01(0, 10, 1, false);
        }
        if (U(d84.g(j5, TimeZone.getDefault()), d84.g(j4, TimeZone.getDefault()))) {
            if (j6 < 60000) {
                return new p01(0, 1, 1, false);
            }
            if (j6 < 3600000) {
                return new p01((long) ((int) (j6 / 60000)), 2, 1, false);
            }
            if (j6 < 86400000) {
                return new p01((long) ((int) (j6 / 3600000)), 3, 1, false);
            }
        }
        if (j6 < 3600000) {
            return new p01((long) ((int) (j6 / 60000)), 2, 1, false);
        }
        if (j6 < 86400000) {
            return new p01(j2, 4, 1, false);
        }
        if (j6 < 129600000) {
            return new p01(0, 4, 1, false);
        }
        return d84.g(j4, TimeZone.getDefault()).a.equals(d84.g(j5, TimeZone.getDefault()).a) ? new p01(j2, 9, 1, false) : new p01(j2, 8, 1, false);
    }

    public abstract boolean e(Object obj, Object obj2);

    public abstract boolean f(Object obj, Object obj2);

    public void onCreateFailure(String str) {
        throw new RuntimeException(str);
    }

    public void onCreateSuccess(SessionDescription sessionDescription) {
    }

    public void onSetFailure(String str) {
        throw new RuntimeException(str);
    }

    public void onSetSuccess() {
    }

    public Object x(Object obj, Object obj2) {
        return null;
    }
}
