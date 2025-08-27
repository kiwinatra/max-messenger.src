package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowManager;
import java.io.Closeable;
import java.io.IOException;
import java.lang.Thread;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: vzg  reason: default package */
public abstract class vzg {
    public static final gga a = new gga(11);
    public static final byte[] b = {0, 0, 0, 1};
    public static final float[] c = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object d = new Object();
    public static int[] e = new int[10];
    public static final Object f = new Object();

    public static w4a B(int i, byte[] bArr, int i2) {
        ky1 ky1 = new ky1(i + 2, i2, 3, bArr);
        int i3 = 4;
        ky1.t(4);
        int i4 = ky1.i(3);
        ky1.s();
        int i5 = ky1.i(2);
        boolean h = ky1.h();
        int i6 = ky1.i(5);
        int i7 = 0;
        for (int i8 = 0; i8 < 32; i8++) {
            if (ky1.h()) {
                i7 |= 1 << i8;
            }
        }
        int i9 = 6;
        int[] iArr = new int[6];
        for (int i10 = 0; i10 < 6; i10++) {
            iArr[i10] = ky1.i(8);
        }
        int i11 = ky1.i(8);
        int i12 = 0;
        for (int i13 = 0; i13 < i4; i13++) {
            if (ky1.h()) {
                i12 += 89;
            }
            if (ky1.h()) {
                i12 += 8;
            }
        }
        ky1.t(i12);
        if (i4 > 0) {
            ky1.t((8 - i4) * 2);
        }
        ky1.m();
        int m = ky1.m();
        if (m == 3) {
            ky1.s();
        }
        int m2 = ky1.m();
        int m3 = ky1.m();
        if (ky1.h()) {
            int m4 = ky1.m();
            int m5 = ky1.m();
            int m6 = ky1.m();
            int m7 = ky1.m();
            m2 -= (m4 + m5) * ((m == 1 || m == 2) ? 2 : 1);
            m3 -= (m6 + m7) * (m == 1 ? 2 : 1);
        }
        int i14 = m3;
        int i15 = m2;
        ky1.m();
        ky1.m();
        int m8 = ky1.m();
        for (int i16 = ky1.h() ? 0 : i4; i16 <= i4; i16++) {
            ky1.m();
            ky1.m();
            ky1.m();
        }
        ky1.m();
        ky1.m();
        ky1.m();
        ky1.m();
        ky1.m();
        ky1.m();
        if (ky1.h() && ky1.h()) {
            int i17 = 0;
            while (i17 < i3) {
                int i18 = 0;
                while (i18 < i9) {
                    if (!ky1.h()) {
                        ky1.m();
                    } else {
                        int min = Math.min(64, 1 << ((i17 << 1) + 4));
                        if (i17 > 1) {
                            ky1.n();
                        }
                        for (int i19 = 0; i19 < min; i19++) {
                            ky1.n();
                        }
                    }
                    i18 += i17 == 3 ? 3 : 1;
                    i9 = 6;
                }
                i17++;
                i3 = 4;
                i9 = 6;
            }
        }
        ky1.t(2);
        if (ky1.h()) {
            ky1.t(8);
            ky1.m();
            ky1.m();
            ky1.s();
        }
        int m9 = ky1.m();
        boolean z = false;
        int i20 = 0;
        for (int i21 = 0; i21 < m9; i21++) {
            if (i21 != 0) {
                z = ky1.h();
            }
            if (z) {
                ky1.s();
                ky1.m();
                for (int i22 = 0; i22 <= i20; i22++) {
                    if (!ky1.h()) {
                        ky1.s();
                    }
                }
            } else {
                int m10 = ky1.m();
                int m11 = ky1.m();
                int i23 = m10 + m11;
                for (int i24 = 0; i24 < m10; i24++) {
                    ky1.m();
                    ky1.s();
                }
                for (int i25 = 0; i25 < m11; i25++) {
                    ky1.m();
                    ky1.s();
                }
                i20 = i23;
            }
        }
        if (ky1.h()) {
            for (int i26 = 0; i26 < ky1.m(); i26++) {
                ky1.t(m8 + 5);
            }
        }
        ky1.t(2);
        float f2 = 1.0f;
        if (ky1.h()) {
            if (ky1.h()) {
                int i27 = ky1.i(8);
                if (i27 == 255) {
                    int i28 = ky1.i(16);
                    int i29 = ky1.i(16);
                    if (!(i28 == 0 || i29 == 0)) {
                        f2 = ((float) i28) / ((float) i29);
                    }
                } else if (i27 < 17) {
                    f2 = c[i27];
                }
            }
            if (ky1.h()) {
                ky1.s();
            }
            if (ky1.h()) {
                ky1.t(4);
                if (ky1.h()) {
                    ky1.t(24);
                }
            }
            if (ky1.h()) {
                ky1.m();
                ky1.m();
            }
            ky1.s();
            if (ky1.h()) {
                i14 *= 2;
            }
        }
        return new w4a(i5, h, i6, i7, iArr, i11, i15, i14, f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.a5a C(int r22, byte[] r23, int r24) {
        /*
            r0 = 1
            int r1 = r22 + 1
            ky1 r2 = new ky1
            r3 = 3
            r4 = r23
            r5 = r24
            r2.<init>((int) r1, (int) r5, (int) r3, (byte[]) r4)
            r1 = 8
            int r4 = r2.i(r1)
            int r5 = r2.i(r1)
            int r6 = r2.i(r1)
            int r7 = r2.m()
            r3 = 100
            r8 = 3
            if (r4 == r3) goto L_0x004c
            r3 = 110(0x6e, float:1.54E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 122(0x7a, float:1.71E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 244(0xf4, float:3.42E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 44
            if (r4 == r3) goto L_0x004c
            r3 = 83
            if (r4 == r3) goto L_0x004c
            r3 = 86
            if (r4 == r3) goto L_0x004c
            r3 = 118(0x76, float:1.65E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 128(0x80, float:1.794E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 138(0x8a, float:1.93E-43)
            if (r4 != r3) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r3 = r0
            r11 = 0
            goto L_0x009e
        L_0x004c:
            int r3 = r2.m()
            if (r3 != r8) goto L_0x0057
            boolean r11 = r2.h()
            goto L_0x0058
        L_0x0057:
            r11 = 0
        L_0x0058:
            r2.m()
            r2.m()
            r2.s()
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x009e
            if (r3 == r8) goto L_0x006b
            r12 = r1
            goto L_0x006d
        L_0x006b:
            r12 = 12
        L_0x006d:
            r13 = 0
        L_0x006e:
            if (r13 >= r12) goto L_0x009e
            boolean r14 = r2.h()
            if (r14 == 0) goto L_0x009b
            r14 = 6
            if (r13 >= r14) goto L_0x007c
            r14 = 16
            goto L_0x007e
        L_0x007c:
            r14 = 64
        L_0x007e:
            r16 = r1
            r17 = r16
            r15 = 0
        L_0x0083:
            if (r15 >= r14) goto L_0x009b
            if (r16 == 0) goto L_0x0093
            int r16 = r2.n()
            int r10 = r16 + r17
            int r10 = r10 + 256
            int r10 = r10 % 256
            r16 = r10
        L_0x0093:
            if (r16 != 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r17 = r16
        L_0x0098:
            int r15 = r15 + 1
            goto L_0x0083
        L_0x009b:
            int r13 = r13 + 1
            goto L_0x006e
        L_0x009e:
            int r10 = r2.m()
            int r13 = r10 + 4
            int r14 = r2.m()
            if (r14 != 0) goto L_0x00b3
            int r10 = r2.m()
            int r10 = r10 + 4
            r0 = r10
        L_0x00b1:
            r1 = 0
            goto L_0x00d5
        L_0x00b3:
            if (r14 != r0) goto L_0x00d3
            boolean r10 = r2.h()
            r2.n()
            r2.n()
            int r12 = r2.m()
            long r8 = (long) r12
            r12 = 0
        L_0x00c5:
            long r0 = (long) r12
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d0
            r2.m()
            int r12 = r12 + 1
            goto L_0x00c5
        L_0x00d0:
            r1 = r10
            r0 = 0
            goto L_0x00d5
        L_0x00d3:
            r0 = 0
            goto L_0x00b1
        L_0x00d5:
            r2.m()
            r2.s()
            int r8 = r2.m()
            r9 = 1
            int r8 = r8 + r9
            int r10 = r2.m()
            int r10 = r10 + r9
            boolean r12 = r2.h()
            int r9 = 2 - r12
            int r10 = r10 * r9
            if (r12 != 0) goto L_0x00f2
            r2.s()
        L_0x00f2:
            r2.s()
            r17 = 16
            int r8 = r8 * 16
            int r10 = r10 * 16
            boolean r17 = r2.h()
            if (r17 == 0) goto L_0x0134
            int r17 = r2.m()
            int r18 = r2.m()
            int r19 = r2.m()
            int r20 = r2.m()
            if (r3 != 0) goto L_0x0115
            r15 = 1
            goto L_0x0128
        L_0x0115:
            r21 = 2
            r15 = 3
            if (r3 != r15) goto L_0x011e
            r22 = 1
        L_0x011c:
            r15 = 1
            goto L_0x0121
        L_0x011e:
            r22 = r21
            goto L_0x011c
        L_0x0121:
            if (r3 != r15) goto L_0x0125
            r15 = r21
        L_0x0125:
            int r9 = r9 * r15
            r15 = r22
        L_0x0128:
            int r17 = r17 + r18
            int r17 = r17 * r15
            int r8 = r8 - r17
            int r19 = r19 + r20
            int r19 = r19 * r9
            int r10 = r10 - r19
        L_0x0134:
            r9 = r10
            boolean r3 = r2.h()
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0169
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x0169
            r3 = 8
            int r3 = r2.i(r3)
            r15 = 255(0xff, float:3.57E-43)
            if (r3 != r15) goto L_0x0160
            r15 = 16
            int r3 = r2.i(r15)
            int r2 = r2.i(r15)
            if (r3 == 0) goto L_0x0169
            if (r2 == 0) goto L_0x0169
            float r3 = (float) r3
            float r2 = (float) r2
            float r10 = r3 / r2
            goto L_0x0169
        L_0x0160:
            r2 = 17
            if (r3 >= r2) goto L_0x0169
            float[] r2 = c
            r2 = r2[r3]
            r10 = r2
        L_0x0169:
            a5a r2 = new a5a
            r3 = r2
            r15 = r0
            r16 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vzg.C(int, byte[], int):a5a");
    }

    public static void D(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        synchronized (f) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                uncaughtExceptionHandler = new zy1(uncaughtExceptionHandler, defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    public static fj E(l8b l8b) {
        l8b.H(1);
        int x = l8b.x();
        long j = ((long) l8b.b) + ((long) x);
        int i = x / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long o = l8b.o();
            if (o == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = o;
            jArr2[i2] = l8b.o();
            l8b.H(2);
            i2++;
        }
        l8b.H((int) (j - ((long) l8b.b)));
        return new fj(11, (Object) jArr, (Object) jArr2);
    }

    public static auf F(auf auf, String[] strArr, Map map) {
        int i = 0;
        if (auf == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (auf) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                auf auf2 = new auf();
                int length = strArr.length;
                while (i < length) {
                    auf2.a((auf) map.get(strArr[i]));
                    i++;
                }
                return auf2;
            }
        } else if (strArr != null && strArr.length == 1) {
            auf.a((auf) map.get(strArr[0]));
            return auf;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i < length2) {
                auf.a((auf) map.get(strArr[i]));
                i++;
            }
        }
        return auf;
    }

    public static final Uri G(Uri uri, ir8 ir8) {
        String str;
        Uri.Builder buildUpon = uri.buildUpon();
        jr8.a.getClass();
        Integer num = ir8.d.H;
        if (num == null || (str = num.toString()) == null) {
            str = String.valueOf(0);
        }
        return buildUpon.appendQueryParameter("MediaItemType", str).build();
    }

    public static final void H(int i, View view, Object obj) {
        Object tag = view.getTag();
        SparseArray sparseArray = tag instanceof SparseArray ? (SparseArray) tag : null;
        if (sparseArray == null) {
            sparseArray = new SparseArray(2);
            view.setTag(sparseArray);
        }
        sparseArray.put(i, obj);
    }

    public static void I(bt1 bt1, ArrayList arrayList) {
        if (bt1 instanceof ct1) {
            Iterator it = ((ct1) bt1).a.iterator();
            while (it.hasNext()) {
                I((bt1) it.next(), arrayList);
            }
        } else if (bt1 instanceof ax1) {
            arrayList.add(((ax1) bt1).a);
        } else {
            arrayList.add(new bs1(bt1));
        }
    }

    public static ArrayList J(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(Long.valueOf(jSONArray.getLong(i)));
            }
            return arrayList;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static int K(int i, byte[] bArr) {
        int i2;
        synchronized (d) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = e;
                    if (iArr.length <= i4) {
                        e = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    e[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = e[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    public static final void L(fwf fwf) {
        fwf.c(oa4.class, new qid(14));
    }

    public static Parcelable M(String str, Bundle bundle) {
        ClassLoader classLoader = vzg.class.getClassLoader();
        m(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void N(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = b0h.R("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException(wj6.h(i2, "negative size: "));
            } else {
                str = b0h.R("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void O(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(S(i, i2, "index"));
        }
    }

    public static void P(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable M = M("MapOptions", bundle);
            if (M != null) {
                Q(bundle2, "MapOptions", M);
            }
            Parcelable M2 = M("StreetViewPanoramaOptions", bundle);
            if (M2 != null) {
                Q(bundle2, "StreetViewPanoramaOptions", M2);
            }
            Parcelable M3 = M("camera", bundle);
            if (M3 != null) {
                Q(bundle2, "camera", M3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void Q(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = vzg.class.getClassLoader();
        m(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    public static void R(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? S(i, i3, "start index") : (i2 < 0 || i2 > i3) ? S(i2, i3, "end index") : b0h.R("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String S(int i, int i2, String str) {
        if (i < 0) {
            return b0h.R("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return b0h.R("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(wj6.h(i2, "negative size: "));
    }

    public static final boolean a(abe abe, String str) {
        Long l = (Long) ((Map) ((AtomicReference) abe.b.getValue()).get()).get(str);
        return l != null && System.currentTimeMillis() < l.longValue();
    }

    public static final void b(Map map, String str, Long l) {
        Long l2;
        if (l.longValue() <= 0) {
            l2 = null;
        } else {
            l2 = Long.valueOf(l.longValue() + System.currentTimeMillis());
        }
        map.put(str, l2);
    }

    public static Object c(jtc jtc, ContinuationImpl continuationImpl) {
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuationImpl));
        lw1.u();
        jtc.f(new ox0(18, (Object) lw1, (Object) null));
        lw1.k(new hw2(4, jtc));
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return t;
    }

    public static int d(Context context) {
        int i;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int i2 = point.x;
        int sqrt = (int) Math.sqrt(Math.pow((double) point.y, 2.0d) + Math.pow((double) i2, 2.0d));
        Canvas canvas = new Canvas();
        int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (min > 0) {
            sqrt = Math.min(sqrt, min);
        }
        try {
            i = ct.o();
        } catch (Exception unused) {
            i = 0;
        }
        return i > 0 ? Math.min(sqrt, i) : sqrt;
    }

    public static void f(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void g(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void h(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            throw new IllegalStateException(rae.p("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", myLooper != null ? myLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void i(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void j(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void k() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static void l(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void m(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void o(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void p(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void q(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void r(h74 h74) {
        if (h74 != null) {
            try {
                h74.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final List s() {
        return CollectionsKt.listOf(new xj7(wj7.c, new igf(xua.f), Integer.valueOf(cad.h1)), new xj7(wj7.b, new igf(xua.l), Integer.valueOf(cad.N1)), new xj7(wj7.a, new igf(xua.g), Integer.valueOf(cad.c0)));
    }

    public static int t(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        boolean z = false;
        y64.j(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            p(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            p(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b2 = bArr[i5];
                if ((b2 & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                        p(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            zArr[0] = i3 <= 2 ? !(i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 + -2] == 0 && bArr[i4] == 1)) : bArr[i2 + -3] == 0 && bArr[i2 + -2] == 0 && bArr[i4] == 1;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + -2] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z = true;
            }
            zArr[2] = z;
            return i2;
        } else {
            p(zArr);
            return i - 1;
        }
    }

    public static jw6 u(SSLSession sSLSession) {
        List list;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            int hashCode = cipherSuite.hashCode();
            if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            x03 j = x03.t.j(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            } else if (!Intrinsics.areEqual((Object) "NONE", (Object) protocol)) {
                ylf J = tf6.J(protocol);
                try {
                    Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                    list = peerCertificates != null ? u0g.k((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length)) : CollectionsKt.emptyList();
                } catch (SSLPeerUnverifiedException unused) {
                    list = CollectionsKt.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new jw6(J, j, localCertificates != null ? u0g.k((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length)) : CollectionsKt.emptyList(), new ve(3, (Object) list));
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IllegalStateException("cipherSuite == null".toString());
        }
    }

    public static final ArrayList v(sqd sqd) {
        sqd.getClass();
        ArrayList arrayList = new ArrayList(sqd.a);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((uqd) next).f) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            uqd uqd = (uqd) it2.next();
            k48 N = cvg.N(uqd.a);
            String g = sqd.g(uqd);
            d48 d48 = uqd.a;
            cbe n = g == null ? sqd.n(uqd) : sqd.k(d48.a, g);
            Uri a2 = dfb.b(uqd.c, d48) ? dfb.a(uqd.c, d48) : N.Y;
            boolean z = d48.a == 7;
            Uri parse = Uri.parse(n.b);
            dfb dfb = uqd.c;
            arrayList3.add(new tqd(N, z, parse, a2, dfb != null ? dfb.v : null, 112));
        }
        return arrayList3;
    }

    public static final Object w(View view, int i) {
        Object tag = view.getTag();
        SparseArray sparseArray = tag instanceof SparseArray ? (SparseArray) tag : null;
        if (sparseArray != null) {
            return sparseArray.get(i);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r1 = r3.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean x(ru.ok.android.api.core.ApiInvocationException r3) {
        /*
            int r0 = r3.a
            r1 = 102(0x66, float:1.43E-43)
            r2 = 1
            if (r0 == r1) goto L_0x0026
            r1 = 103(0x67, float:1.44E-43)
            if (r0 == r1) goto L_0x0026
            r1 = 100
            if (r0 != r1) goto L_0x0025
            java.lang.String r0 = "session_key"
            java.lang.String r1 = r3.b
            if (r1 == 0) goto L_0x001c
            boolean r1 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r1, (java.lang.CharSequence) r0, false, 2, (java.lang.Object) null)
            if (r1 != r2) goto L_0x001c
            goto L_0x0026
        L_0x001c:
            java.lang.String r3 = r3.c
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            if (r3 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vzg.x(ru.ok.android.api.core.ApiInvocationException):boolean");
    }

    public static final String y(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (CharsKt.isWhitespace(charAt)) {
                sb.append(charAt);
            } else {
                sb.append('*');
            }
        }
        return sb.toString();
    }

    public abstract void A(Typeface typeface);

    public void e(int i) {
        new Handler(Looper.getMainLooper()).post(new l40(this, i, 15));
    }

    public abstract void z(int i);
}
