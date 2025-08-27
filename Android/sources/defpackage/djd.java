package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: djd  reason: default package */
public final class djd implements op7, qk3, zi6, mn0, i74, p5a, ife {
    public static final djd b = new djd(0);
    public static final djd c = new djd(1);
    public static final djd o = new djd(2);
    public static final djd v = new djd(3);
    public static final djd w = new djd(5);
    public static final djd x = new djd(6);
    public final /* synthetic */ int a;

    public /* synthetic */ djd(int i) {
        this.a = i;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((y8c) next) != y8c.HTTP_1_0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((y8c) it.next()).a);
        }
        return arrayList2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, rt0] */
    public static byte[] d(List list) {
        ? obj = new Object();
        Iterator it = b(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            obj.u0(str.length());
            obj.z0(0, str.length(), str);
        }
        return obj.m0(obj.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String f(java.lang.Throwable r4) {
        /*
            java.lang.String r0 = "\n"
            if (r4 != 0) goto L_0x0007
            java.lang.String r4 = ""
            return r4
        L_0x0007:
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x003b }
            r1.<init>()     // Catch:{ all -> 0x003b }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x003b }
            r2.<init>(r1)     // Catch:{ all -> 0x003b }
            r4.printStackTrace(r2)     // Catch:{ all -> 0x0034 }
            r2.flush()     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0034 }
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r1)     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0034 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r3.<init>(r0)     // Catch:{ all -> 0x0034 }
            r3.append(r1)     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0034 }
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r2, r1)     // Catch:{ all -> 0x003b }
            goto L_0x0049
        L_0x0034:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r0)     // Catch:{ all -> 0x003b }
            throw r1     // Catch:{ all -> 0x003b }
        L_0x003b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\ncould not get stacktrace from error: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djd.f(java.lang.Throwable):java.lang.String");
    }

    public static boolean g() {
        return Intrinsics.areEqual((Object) "Dalvik", (Object) System.getProperty("java.vm.name"));
    }

    public long a(long j) {
        return j;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                j4g j4g = (j4g) obj;
                if (!j4g.b || !cjf.p(j4g.d)) {
                    throw new RuntimeException("conversion failed");
                }
                return;
            default:
                z68.f("gj5", "onLogout: clear failed", (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        oga oga = (oga) obj;
        oga.getClass();
        return new qa3(2, new fc2(11, oga));
    }

    public List c(long j, gz6 gz6, int i, int i2, long j2, long j3) {
        return CollectionsKt.emptyList();
    }

    public boolean e(String str) {
        System.loadLibrary(str);
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0102, code lost:
        if (r1.equals("error_msg") == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010b, code lost:
        if (r1.equals("error") == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010e, code lost:
        r6 = r13.I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013a, code lost:
        r13.A();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object parse(defpackage.sp7 r13) {
        /*
            r12 = this;
            r13.t()
            r12 = 0
            r0 = 0
            r4 = r12
            r12 = r0
            r6 = r12
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
        L_0x000c:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0144
            java.lang.String r1 = r13.name()
            int r2 = r1.hashCode()
            r3 = 110(0x6e, float:1.54E-43)
            switch(r2) {
                case -1125973592: goto L_0x0132;
                case -830722045: goto L_0x0123;
                case -22145738: goto L_0x0114;
                case 96784904: goto L_0x0105;
                case 329868490: goto L_0x00fc;
                case 438353305: goto L_0x00ed;
                case 717465530: goto L_0x00c1;
                case 1635686852: goto L_0x00b1;
                case 1635703681: goto L_0x00a1;
                case 1636060774: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x013a
        L_0x0021:
            java.lang.String r2 = "error_page"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x002b
            goto L_0x013a
        L_0x002b:
            int r1 = r13.peek()
            if (r1 == r3) goto L_0x009c
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x0039
            r13.I()
            goto L_0x000c
        L_0x0039:
            r13.t()
        L_0x003c:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0097
            java.lang.String r1 = r13.name()
            int r5 = r1.hashCode()
            r8 = 954925063(0x38eb0007, float:1.1205678E-4)
            if (r5 == r8) goto L_0x0050
            goto L_0x0093
        L_0x0050:
            java.lang.String r5 = "message"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0093
            int r1 = r13.peek()
            if (r1 == r3) goto L_0x008f
            if (r1 == r2) goto L_0x0064
            r13.I()
            goto L_0x003c
        L_0x0064:
            r13.t()
        L_0x0067:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x008b
            java.lang.String r1 = r13.name()
            int r5 = r1.hashCode()
            r8 = 106748362(0x65cd9ca, float:4.1537407E-35)
            if (r5 == r8) goto L_0x007b
            goto L_0x0087
        L_0x007b:
            java.lang.String r5 = "plain"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0087
            r13.I()
            goto L_0x0067
        L_0x0087:
            r13.A()
            goto L_0x0067
        L_0x008b:
            r13.r()
            goto L_0x003c
        L_0x008f:
            r13.A()
            goto L_0x003c
        L_0x0093:
            r13.A()
            goto L_0x003c
        L_0x0097:
            r13.r()
            goto L_0x000c
        L_0x009c:
            r13.A()
            goto L_0x000c
        L_0x00a1:
            java.lang.String r2 = "error_data"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00ab
            goto L_0x013a
        L_0x00ab:
            java.lang.String r9 = r13.g0()
            goto L_0x000c
        L_0x00b1:
            java.lang.String r2 = "error_code"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00bb
            goto L_0x013a
        L_0x00bb:
            int r4 = r13.E()
            goto L_0x000c
        L_0x00c1:
            java.lang.String r2 = "custom_error"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00cb
            goto L_0x013a
        L_0x00cb:
            int r1 = r13.peek()
            if (r1 == r3) goto L_0x00e8
            r13.t()
        L_0x00d4:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x00e3
            java.lang.String r10 = r13.name()
            java.lang.String r11 = r13.W()
            goto L_0x00d4
        L_0x00e3:
            r13.r()
            goto L_0x000c
        L_0x00e8:
            r13.A()
            goto L_0x000c
        L_0x00ed:
            java.lang.String r2 = "session_secret_key"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00f6
            goto L_0x013a
        L_0x00f6:
            java.lang.String r12 = r13.I()
            goto L_0x000c
        L_0x00fc:
            java.lang.String r2 = "error_msg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x010e
            goto L_0x013a
        L_0x0105:
            java.lang.String r2 = "error"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x010e
            goto L_0x013a
        L_0x010e:
            java.lang.String r6 = r13.I()
            goto L_0x000c
        L_0x0114:
            java.lang.String r2 = "session_key"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x011d
            goto L_0x013a
        L_0x011d:
            java.lang.String r0 = r13.I()
            goto L_0x000c
        L_0x0123:
            java.lang.String r2 = "error_field"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x012c
            goto L_0x013a
        L_0x012c:
            java.lang.String r7 = r13.g0()
            goto L_0x000c
        L_0x0132:
            java.lang.String r2 = "ver_redirect_url"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x013f
        L_0x013a:
            r13.A()
            goto L_0x000c
        L_0x013f:
            r13.I()
            goto L_0x000c
        L_0x0144:
            r13.r()
            r13 = 100
            if (r4 == r13) goto L_0x019d
            r13 = 107(0x6b, float:1.5E-43)
            if (r4 == r13) goto L_0x0183
            r12 = 401(0x191, float:5.62E-43)
            if (r4 == r12) goto L_0x017a
            r12 = 403(0x193, float:5.65E-43)
            if (r4 == r12) goto L_0x0171
            r12 = 102(0x66, float:1.43E-43)
            if (r4 == r12) goto L_0x016b
            r12 = 103(0x67, float:1.44E-43)
            if (r4 == r12) goto L_0x016b
            ru.ok.android.api.core.ApiInvocationException r12 = new ru.ok.android.api.core.ApiInvocationException
            r1 = r12
            r2 = r6
            r3 = r7
            r5 = r9
            r6 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x01a5
        L_0x016b:
            ru.ok.android.api.session.ApiRecreateSessionException r12 = new ru.ok.android.api.session.ApiRecreateSessionException
            r12.<init>(r4, r6)
            goto L_0x01a5
        L_0x0171:
            ru.ok.android.api.core.ApiCaptchaException r12 = new ru.ok.android.api.core.ApiCaptchaException
            r8 = 403(0x193, float:5.65E-43)
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x01a5
        L_0x017a:
            ru.ok.android.api.core.ApiLoginException r12 = new ru.ok.android.api.core.ApiLoginException
            r8 = 401(0x191, float:5.62E-43)
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x01a5
        L_0x0183:
            if (r0 == 0) goto L_0x0195
            if (r12 == 0) goto L_0x018d
            ru.ok.android.api.session.ApiSessionChangedException r13 = new ru.ok.android.api.session.ApiSessionChangedException
            r13.<init>(r6, r0, r12)
            goto L_0x01a6
        L_0x018d:
            ru.ok.android.api.json.JsonParseException r12 = new ru.ok.android.api.json.JsonParseException
            java.lang.String r13 = "No sessionSecretKey"
            r12.<init>(r13)
            throw r12
        L_0x0195:
            ru.ok.android.api.json.JsonParseException r12 = new ru.ok.android.api.json.JsonParseException
            java.lang.String r13 = "No sessionKey"
            r12.<init>(r13)
            throw r12
        L_0x019d:
            ru.ok.android.api.core.ApiInvocationParamException r12 = new ru.ok.android.api.core.ApiInvocationParamException
            r8 = 100
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x01a5:
            r13 = r12
        L_0x01a6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djd.parse(sp7):java.lang.Object");
    }

    public djd(Context context) {
        this.a = 22;
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public djd(FrgBase frgBase, ni0 ni0, y50 y50, v02 v02, j4a j4a, fa9 fa9) {
        this.a = 15;
        y64.I(new dac());
    }

    public djd(jr7 jr7, jr7 jr72) {
        this.a = 9;
        jr7.getClass();
        jr72.getClass();
        bs0.n(c44.DEFAULT_ASPECT_RATIO <= c44.DEFAULT_ASPECT_RATIO);
    }
}
