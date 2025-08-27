package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: zx1  reason: default package */
public final class zx1 implements nsf {
    public final xv1 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d = b(ax0.c);
    public final lzf e;
    public final lzf f;
    public final int g;

    public zx1(Context context, lzf lzf, lzf lzf2) {
        ep7 ep7 = new ep7();
        sx6.b.f(ep7);
        ep7.d = true;
        this.a = new xv1(25, (Object) ep7);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.e = lzf2;
        this.f = lzf;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(a81.m("Invalid url: ", str), e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a7, code lost:
        if (((defpackage.q6a) defpackage.q6a.a.get(r0)) != null) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ua0 a(defpackage.ua0 r7) {
        /*
            r6 = this;
            android.net.ConnectivityManager r0 = r6.b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            kq9 r7 = r7.c()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r2 = r7.w
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "Property \"autoMetadata\" has not been set"
            if (r2 == 0) goto L_0x0119
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "sdk-version"
            r2.put(r4, r1)
            java.lang.String r1 = "model"
            java.lang.String r2 = android.os.Build.MODEL
            r7.a(r1, r2)
            java.lang.String r1 = "hardware"
            java.lang.String r2 = android.os.Build.HARDWARE
            r7.a(r1, r2)
            java.lang.String r1 = "device"
            java.lang.String r2 = android.os.Build.DEVICE
            r7.a(r1, r2)
            java.lang.String r1 = "product"
            java.lang.String r2 = android.os.Build.PRODUCT
            r7.a(r1, r2)
            java.lang.String r1 = "os-uild"
            java.lang.String r2 = android.os.Build.ID
            r7.a(r1, r2)
            java.lang.String r1 = "manufacturer"
            java.lang.String r2 = android.os.Build.MANUFACTURER
            r7.a(r1, r2)
            java.lang.String r1 = "fingerprint"
            java.lang.String r2 = android.os.Build.FINGERPRINT
            r7.a(r1, r2)
            java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r4 = r2.getTimeInMillis()
            int r1 = r1.getOffset(r4)
            int r1 = r1 / 1000
            long r1 = (long) r1
            java.lang.Object r4 = r7.w
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L_0x0113
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "tz-offset"
            r4.put(r2, r1)
            r1 = -1
            if (r0 != 0) goto L_0x007a
            android.util.SparseArray r2 = defpackage.r6a.a
            r2 = r1
            goto L_0x007e
        L_0x007a:
            int r2 = r0.getType()
        L_0x007e:
            java.lang.Object r4 = r7.w
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L_0x010d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = "net-type"
            r4.put(r5, r2)
            r2 = 0
            if (r0 != 0) goto L_0x0094
            android.util.SparseArray r0 = defpackage.q6a.a
        L_0x0092:
            r0 = r2
            goto L_0x00a9
        L_0x0094:
            int r0 = r0.getSubtype()
            if (r0 != r1) goto L_0x009f
            android.util.SparseArray r0 = defpackage.q6a.a
            r0 = 100
            goto L_0x00a9
        L_0x009f:
            android.util.SparseArray r4 = defpackage.q6a.a
            java.lang.Object r4 = r4.get(r0)
            q6a r4 = (defpackage.q6a) r4
            if (r4 == 0) goto L_0x0092
        L_0x00a9:
            java.lang.Object r4 = r7.w
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L_0x0107
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "mobile-subtype"
            r4.put(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r3 = "country"
            r7.a(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r3 = "locale"
            r7.a(r3, r0)
            android.content.Context r6 = r6.c
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getSimOperator()
            java.lang.String r3 = "mcc_mnc"
            r7.a(r3, r0)
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00f4 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ NameNotFoundException -> 0x00f4 }
            android.content.pm.PackageInfo r6 = r0.getPackageInfo(r6, r2)     // Catch:{ NameNotFoundException -> 0x00f4 }
            int r1 = r6.versionCode     // Catch:{ NameNotFoundException -> 0x00f4 }
            goto L_0x00f9
        L_0x00f4:
            java.lang.String r6 = "CctTransportBackend"
            defpackage.y64.u(r6)
        L_0x00f9:
            java.lang.String r6 = java.lang.Integer.toString(r1)
            java.lang.String r0 = "application_build"
            r7.a(r0, r6)
            ua0 r6 = r7.b()
            return r6
        L_0x0107:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r3)
            throw r6
        L_0x010d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r3)
            throw r6
        L_0x0113:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r3)
            throw r6
        L_0x0119:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx1.a(ua0):ua0");
    }
}
