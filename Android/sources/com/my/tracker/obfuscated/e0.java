package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.o1;
import com.my.tracker.obfuscated.s0;
import com.my.tracker.obfuscated.y2;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class e0 {
    public static final DecimalFormat l;
    final Map a = new HashMap();
    final y2 b;
    final Context c;
    final b d;
    protected boolean e = false;
    protected b3 f = b3.j;
    protected String g = "";
    f1 h;
    private final q i = new q(65536);
    final g1 j = g1.b();
    long k = 0;

    public interface a {
        void b(List list);
    }

    public interface b {
        void a();

        void a(String str);
    }

    public interface c {
        void a(List list);
    }

    static {
        DecimalFormat decimalFormat = new DecimalFormat("0.0#####");
        l = decimalFormat;
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
    }

    private e0(y2 y2Var, b bVar, Context context) {
        this.b = y2Var;
        this.d = bVar;
        this.c = context.getApplicationContext();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        if (!a(this.h)) {
            c();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.h != null) {
            x2.b("EventTracker error: tracker has already been initialized");
            return;
        }
        d1 a2 = d1.a(this.b.g(), this.c);
        if (a2 != null) {
            f1 a3 = f1.a(a2);
            this.h = a3;
            if (!a(a3)) {
                this.k = p1.a(this.c).l();
                this.b.m().a(new dtg(this, 3), new dtg(this, 4));
                b();
            }
        }
    }

    public void a(List list, a aVar) {
        a((Runnable) new o6d(22, (Object) this, (Object) aVar, list));
    }

    public void b(boolean z, b3 b3Var, String str, f1 f1Var) {
        x2.a("createAndStorePartialPacket: start");
        y2.a o = this.b.o();
        String h2 = this.b.h();
        MyTrackerConfig.OkHttpClientProvider n = this.b.n();
        this.i.a();
        int a2 = a(this.i, f1Var, o, z, b3Var, str, this.j, h2, n, this.c);
        x2.a("createAndStorePartialPacket: writeResult=" + a2);
        if (a2 == 1) {
            f1Var.a();
            f1Var.a(this.i.c());
        } else if (a2 == 2) {
            f1Var.a();
        }
        this.i.d();
    }

    public void c() {
        if (!a(this.h)) {
            this.d.a();
            if (!s0.a(this.c)) {
                x2.a("MyTrackerRepository: no network connection");
                return;
            }
            String a2 = a(this.e, this.f, this.g, this.h);
            if (a2 != null) {
                this.d.a(a2);
            }
            b(this.h);
        }
    }

    public void d() {
        a((Runnable) new wtg(this, 1));
    }

    public void g() {
        a((Runnable) new z60(this, v2.a(), 10));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(long j2, float f2) {
        if (!a(this.h) && !a(29, j2)) {
            long b2 = v2.b(j2);
            byte[] c2 = this.j.c((long) (f2 * 1000.0f));
            if (c2 != null) {
                this.h.p(c2, b2);
            }
        }
    }

    public void a(List list, c cVar) {
        a((Runnable) new o6d(21, (Object) this, (Object) cVar, list));
    }

    public void b() {
        int f2;
        if (!a(this.h)) {
            if (this.h.h() != 0 || ((f2 = this.b.f()) > 0 && v2.a() - this.k <= ((long) f2))) {
                c();
            }
        }
    }

    public void d(String str) {
        a((Runnable) new ca2((Object) this, (Object) str, v2.a(), 10));
    }

    private static Map a(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(a aVar) {
        aVar.b(a(this.h) ? Collections.emptyList() : this.h.e());
    }

    /* access modifiers changed from: private */
    public void c(b3 b3Var) {
        a((Runnable) new l8g(18, this, b3Var));
    }

    public void d(List list) {
        a((Runnable) new qtg(this, list, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(boolean r14, com.my.tracker.obfuscated.b3 r15, java.lang.String r16, com.my.tracker.obfuscated.f1 r17) {
        /*
            r13 = this;
            r0 = r13
            com.my.tracker.obfuscated.y2 r1 = r0.b
            com.my.tracker.obfuscated.y2$a r4 = r1.o()
            com.my.tracker.obfuscated.y2 r1 = r0.b
            java.lang.String r1 = r1.q()
            com.my.tracker.obfuscated.y2 r2 = r0.b
            java.lang.String r9 = r2.h()
            com.my.tracker.obfuscated.y2 r2 = r0.b
            com.my.tracker.MyTrackerConfig$OkHttpClientProvider r12 = r2.n()
            com.my.tracker.obfuscated.q r2 = r0.i
            r2.a()
            com.my.tracker.obfuscated.q r2 = r0.i
            com.my.tracker.obfuscated.g1 r8 = r0.j
            android.content.Context r11 = r0.c
            r3 = r17
            r5 = r14
            r6 = r15
            r7 = r16
            r10 = r12
            int r2 = a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r3 = 1
            if (r2 == r3) goto L_0x0033
            goto L_0x0057
        L_0x0033:
            com.my.tracker.obfuscated.q r2 = r0.i
            com.my.tracker.obfuscated.s0$b r1 = r13.a((java.lang.String) r1, (com.my.tracker.MyTrackerConfig.OkHttpClientProvider) r12, (com.my.tracker.obfuscated.q) r2)
            if (r1 != 0) goto L_0x003c
            goto L_0x0057
        L_0x003c:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x004a
            java.lang.String r2 = "Events were sent successfully"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r2)
            r17.a()
        L_0x004a:
            java.lang.Object r1 = r1.b()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            com.my.tracker.obfuscated.q r0 = r0.i
            r0.d()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.e0.a(boolean, com.my.tracker.obfuscated.b3, java.lang.String, com.my.tracker.obfuscated.f1):java.lang.String");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(c cVar) {
        cVar.a(a(this.h) ? Collections.emptyList() : this.h.g());
    }

    public static boolean c(String str) {
        if (str == null || str.length() <= 255) {
            return false;
        }
        x2.b("EventTracker error: length of the string " + str + " is more than 255, event ignored");
        return true;
    }

    public void d(Map map) {
        a((Runnable) new vtg(0, v2.a(), this, a(map)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(b3 b3Var) {
        x2.a("onUserInfoStateChanged: customUserIds=" + Arrays.toString(b3Var.g));
        if (l.a(this.f.g, b3Var.g) != 0 && !a(this.h)) {
            b(this.e, this.f, this.g, this.h);
        }
        this.f = b3Var;
    }

    public void a() {
        a((Runnable) new wtg(this, 0));
    }

    public void c(List list) {
        a((Runnable) new qtg(this, list, 1));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        if (!a(this.h)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                o0 o0Var = (o0) it.next();
                a(o0Var.e(), o0Var.d(), o0Var.a(), (Map) null, o0Var.f());
                this.h.b(o0Var);
            }
            b();
        }
    }

    public void a(a aVar) {
        a((Runnable) new l8g(17, this, aVar));
    }

    public void c(Map map) {
        a((Runnable) new vtg(1, v2.a(), this, a(map)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, long j2, long j3, long j4) {
        byte[] b2;
        if (!a(this.h) && (b2 = this.j.b(str, str2, j2, j3)) != null && this.h.h(b2, j4)) {
            b();
        }
    }

    public void a(c cVar) {
        a((Runnable) new l8g(20, this, cVar));
    }

    public void c(float f2) {
        a((Runnable) new xtg(this, System.currentTimeMillis(), f2, 2));
    }

    public static boolean a(f1 f1Var) {
        if (f1Var != null) {
            return false;
        }
        x2.b("EventTracker error: repository is null");
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Map map, long j2) {
        byte[] b2;
        if (!a(this.h) && !b(map) && (b2 = this.j.b(map)) != null && this.h.k(b2, j2)) {
            b();
        }
    }

    public void c(Boolean bool) {
        a((Runnable) new l8g(21, this, bool));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, List list) {
        if (a(this.h)) {
            aVar.b(Collections.emptyList());
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.h.a((f) it.next());
        }
        aVar.b(list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(long j2, float f2, float f3, float f4) {
        if (!a(this.h) && !a(26, j2)) {
            long b2 = v2.b(j2);
            byte[] b3 = this.j.b((long) (f2 * 1000.0f), (long) (f3 * 1000.0f), (long) (f4 * 1000.0f));
            if (b3 != null) {
                this.h.n(b3, b2);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, List list) {
        if (a(this.h)) {
            cVar.a(Collections.emptyList());
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.h.a((o0) it.next());
        }
        cVar.a(list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(long j2, float f2) {
        if (!a(this.h) && !a(28, j2)) {
            long b2 = v2.b(j2);
            byte[] b3 = this.j.b((long) (f2 * 1000.0f));
            if (b3 != null) {
                this.h.o(b3, b2);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b3 b3Var) {
        this.f = b3Var;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Map map, String str, String str2, long j2) {
        byte[] b2;
        if (!a(this.h) && !b(map) && (b2 = this.j.b(this.e, str, str2, map)) != null && this.h.r(b2, j2)) {
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        x2.a("setRemoteConfig: remoteConfig=" + str);
        if (!this.g.equals(str)) {
            if (!a(this.h)) {
                b(this.e, this.f, this.g, this.h);
            }
            this.g = str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.util.Map r2) {
        /*
            if (r2 == 0) goto L_0x0030
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x000a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = c((java.lang.String) r1)
            if (r1 != 0) goto L_0x002e
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = c((java.lang.String) r0)
            if (r0 == 0) goto L_0x000a
        L_0x002e:
            r2 = 1
            return r2
        L_0x0030:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.e0.b(java.util.Map):boolean");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AdEvent adEvent, long j2) {
        byte[] a2;
        if (!a(this.h) && (a2 = this.j.a(adEvent, l.format(adEvent.revenue))) != null && this.h.a(adEvent.a, a2, j2)) {
            b();
        }
    }

    public void b(Boolean bool) {
        this.e = bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j2, long j3, long j4) {
        byte[] a2;
        if (!a(this.h) && (a2 = this.j.a(str, str2, j2, j3)) != null && this.h.a(a2, j4)) {
            b();
        }
    }

    public void b(String str) {
        a((Runnable) new l8g(19, this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, long j2) {
        byte[] a2;
        if (!a(this.h) && (a2 = this.j.a(str)) != null && this.h.b(a2, j2)) {
            b();
        }
    }

    public void b(String str, String str2, long j2, long j3) {
        a((Runnable) new ttg(this, str, str2, j2, j3, v2.a(), 0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Map map, JSONObject jSONObject, String str, String str2, String str3, long j2) {
        if (!a(this.h) && !b(map) && a(jSONObject, str, str2, str3, map, j2)) {
            b();
        }
    }

    public void b(float f2, float f3, float f4) {
        a((Runnable) new rtg(this, System.currentTimeMillis(), f2, f3, f4, 1));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        String str;
        if (!a(this.h)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                try {
                    str = fVar.e().toString();
                } catch (Throwable th) {
                    x2.a("Error: purchase data: ", th);
                    str = null;
                }
                a(fVar.d(), str, fVar.a(), fVar.f(), (Map) null, fVar.h());
                this.h.b(fVar);
            }
            b();
        }
    }

    public void b(float f2) {
        a((Runnable) new xtg(this, System.currentTimeMillis(), f2, 1));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, long j2) {
        byte[] a2;
        if (!a(this.h) && !c(str) && !b(map) && (a2 = this.j.a(str, map)) != null && this.h.d(a2, j2)) {
            b();
        }
    }

    public void b(String str, String str2, Map map) {
        a((Runnable) new utg(this, a(map), str, str2, v2.a(), 0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j2) {
        byte[] a2;
        if (!a(this.h) && (a2 = this.j.a(str, str2)) != null && this.h.e(a2, j2)) {
            b();
        }
    }

    public void b(f1 f1Var) {
        b d2;
        String q = this.b.q();
        MyTrackerConfig.OkHttpClientProvider n = this.b.n();
        try {
            d2 = f1Var.d();
            if (d2 == null) {
                x2.a("EventTracker error: iterator is null");
                if (d2 != null) {
                    d2.close();
                    return;
                }
                return;
            }
            while (d2.b()) {
                long a2 = d2.a();
                byte[] i2 = d2.i();
                this.i.a();
                this.i.b(i2);
                s0.b a3 = a(q, n, this.i);
                if (a3 == null) {
                    d2.close();
                    return;
                } else if (a3.c()) {
                    String str = (String) a3.b();
                    if (!TextUtils.isEmpty(str)) {
                        this.d.a(str);
                    }
                    f1Var.a(a2);
                } else {
                    d2.close();
                    return;
                }
            }
            d2.close();
            return;
        } catch (Throwable th) {
            x2.b("EventTracker error: ", th);
            return;
        }
        throw th;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Map map, JSONObject jSONObject, JSONObject jSONObject2, String str, long j2) {
        if (!a(this.h) && !b(map) && a(jSONObject, jSONObject2, str, map, j2)) {
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(long j2, float f2, float f3, float f4) {
        if (!a(this.h) && !a(27, j2)) {
            long b2 = v2.b(j2);
            byte[] a2 = this.j.a((long) (f2 * 1000.0f), (long) (f3 * 1000.0f), (long) (f4 * 1000.0f));
            if (a2 != null) {
                this.h.g(a2, b2);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(long j2, String str, o1.a aVar, long j3) {
        byte[] a2;
        if (!a(this.h) && (a2 = this.j.a(j2, str, aVar)) != null && this.h.i(a2, j3)) {
            p1.a(this.c).c(j3);
            this.k = j3;
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Map map, long j2) {
        byte[] a2;
        if (!a(this.h) && !b(map) && (a2 = this.j.a(map)) != null && this.h.j(a2, j2)) {
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(long j2) {
        if (!a(this.h)) {
            boolean a2 = this.h.a(j2, p1.a(this.c).n());
            if (this.h.b(j2) || a2) {
                c();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Map map, int i2, long j2) {
        byte[] a2;
        if (!a(this.h) && !b(map) && (a2 = this.j.a(i2, map)) != null && this.h.k(a2, j2)) {
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(long j2, float f2) {
        if (!a(this.h) && !a(25, j2)) {
            long b2 = v2.b(j2);
            byte[] a2 = this.j.a((long) (f2 * 1000.0f));
            if (a2 != null) {
                this.h.l(a2, b2);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Map map, String str, String str2, long j2) {
        byte[] a2;
        if (!a(this.h) && !b(map) && (a2 = this.j.a(this.e, str, str2, map)) != null && this.h.m(a2, j2)) {
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MiniAppEvent miniAppEvent, long j2) {
        Map<String, String> map;
        String str;
        if (!a(this.h) && !c(miniAppEvent.name) && !b((Map) miniAppEvent.eventParams)) {
            int i2 = miniAppEvent.a;
            String str2 = (i2 == 24 || i2 == 22 || i2 == 23) ? miniAppEvent.customUserId : null;
            if (i2 == 24) {
                str = miniAppEvent.name;
                map = miniAppEvent.eventParams;
            } else {
                str = null;
                map = null;
            }
            byte[] a2 = this.j.a(i2, str2, miniAppEvent.miniAppId, str, miniAppEvent.platformUserId, i2 == 20 ? miniAppEvent.query : null, map);
            if (a2 != null && this.h.b(i2, a2, j2)) {
                b();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, byte[] bArr, boolean z, boolean z2, long j2, Runnable runnable) {
        if (!a(this.h) && this.h.a(i2, bArr, z, z2, j2)) {
            b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j2, Runnable runnable) {
        if (!a(this.h)) {
            byte[] b2 = this.j.b(str, str2);
            if (b2 != null && this.h.q(b2, j2)) {
                b();
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, long j2) {
        byte[] a2;
        if (!a(this.h) && (a2 = this.j.a(str, str2, str3, str4, str5)) != null && this.h.s(a2, j2)) {
            p1.a(this.c).c(j2);
            this.k = j2;
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        x2.a("updateKidMode: newKidMode=" + bool);
        if (bool.booleanValue() != this.e) {
            if (!a(this.h)) {
                b(this.e, this.f, this.g, this.h);
            }
            this.e = bool.booleanValue();
        }
    }

    public static e0 a(y2 y2Var, b bVar, Context context) {
        return new e0(y2Var, bVar, context);
    }

    private static void a(Runnable runnable) {
        m.a(runnable);
    }

    private s0.b a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, q qVar) {
        if (this.j.a((r1) qVar, v2.a())) {
            return s0.a(new r(qVar), okHttpClientProvider, true).a(str);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        r1 = r1.h;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(org.json.JSONObject r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.Map r17, long r18) {
        /*
            r12 = this;
            r1 = r12
            r2 = r13
            r4 = r14
            java.lang.String r0 = "Error: empty productId in data "
            r11 = 0
            if (r4 != 0) goto L_0x001a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error: empty data "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.my.tracker.obfuscated.x2.a((java.lang.String) r0)
            return r11
        L_0x001a:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x0033 }
            r3.<init>((java.lang.String) r14)     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = "productId"
            java.lang.String r3 = r3.optString(r5)     // Catch:{ all -> 0x0033 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0033 }
            if (r3 == 0) goto L_0x0035
            java.lang.String r0 = r0.concat(r14)     // Catch:{ all -> 0x0033 }
            com.my.tracker.obfuscated.x2.a((java.lang.String) r0)     // Catch:{ all -> 0x0033 }
            return r11
        L_0x0033:
            r0 = move-exception
            goto L_0x0083
        L_0x0035:
            r3 = 0
            if (r2 == 0) goto L_0x0045
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x003e }
            r5 = r0
            goto L_0x0046
        L_0x003e:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = "Error: can't convert productInfo json to string"
            com.my.tracker.obfuscated.x2.a(r0, r5)
        L_0x0045:
            r5 = r3
        L_0x0046:
            java.lang.String r0 = "microsPrice"
            double r6 = r13.optDouble(r0)     // Catch:{ all -> 0x0058 }
            r8 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r6 = r6 / r8
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0058 }
            r8 = r0
            goto L_0x005f
        L_0x0058:
            r0 = move-exception
            java.lang.String r6 = "Error: wrong price in micros in sku details: "
            com.my.tracker.obfuscated.x2.a(r6, r0)
            r8 = r3
        L_0x005f:
            java.lang.String r0 = "currency"
            java.lang.String r9 = r13.optString(r0)
            com.my.tracker.obfuscated.g1 r2 = r1.j
            r7 = 0
            r3 = r5
            r4 = r14
            r5 = r15
            r6 = r16
            r10 = r17
            byte[] r0 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L_0x0082
            com.my.tracker.obfuscated.f1 r1 = r1.h
            if (r1 == 0) goto L_0x0082
            r2 = r18
            boolean r0 = r1.c(r0, r2)
            if (r0 == 0) goto L_0x0082
            r11 = 1
        L_0x0082:
            return r11
        L_0x0083:
            java.lang.String r1 = "Error: creating object failed"
            com.my.tracker.obfuscated.x2.b(r1, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.e0.a(org.json.JSONObject, java.lang.String, java.lang.String, java.lang.String, java.util.Map, long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        r9 = r9.h;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(org.json.JSONObject r10, org.json.JSONObject r11, java.lang.String r12, java.util.Map r13, long r14) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0007 }
            r4 = r11
            goto L_0x000e
        L_0x0007:
            r11 = move-exception
            java.lang.String r1 = "Error: can't convert purchaseData json to string"
            com.my.tracker.obfuscated.x2.a(r1, r11)
            r4 = r0
        L_0x000e:
            if (r10 == 0) goto L_0x001c
            java.lang.String r11 = r10.toString()     // Catch:{ all -> 0x0016 }
            r5 = r11
            goto L_0x001d
        L_0x0016:
            r11 = move-exception
            java.lang.String r1 = "Error: can't convert skuDetails json to string"
            com.my.tracker.obfuscated.x2.a(r1, r11)
        L_0x001c:
            r5 = r0
        L_0x001d:
            java.lang.String r11 = "price_amount_micros"
            java.lang.String r11 = r10.optString(r11)     // Catch:{ all -> 0x0035 }
            java.text.DecimalFormat r1 = l     // Catch:{ all -> 0x0035 }
            double r2 = java.lang.Double.parseDouble(r11)     // Catch:{ all -> 0x0035 }
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r2 = r2 / r6
            java.lang.String r11 = r1.format(r2)     // Catch:{ all -> 0x0035 }
            r6 = r11
            goto L_0x003c
        L_0x0035:
            r11 = move-exception
            java.lang.String r1 = "Error: wrong price in micros in sku details: "
            com.my.tracker.obfuscated.x2.a(r1, r11)
            r6 = r0
        L_0x003c:
            java.lang.String r11 = "price_currency_code"
            java.lang.String r0 = r10.optString(r11)     // Catch:{ all -> 0x0044 }
        L_0x0042:
            r7 = r0
            goto L_0x004b
        L_0x0044:
            r10 = move-exception
            java.lang.String r11 = "Error: wrong currency in sku details: "
            com.my.tracker.obfuscated.x2.a(r11, r10)
            goto L_0x0042
        L_0x004b:
            com.my.tracker.obfuscated.g1 r2 = r9.j
            r3 = r12
            r8 = r13
            byte[] r10 = r2.a(r3, r4, r5, r6, r7, r8)
            if (r10 == 0) goto L_0x0061
            com.my.tracker.obfuscated.f1 r9 = r9.h
            if (r9 == 0) goto L_0x0061
            boolean r9 = r9.f(r10, r14)
            if (r9 == 0) goto L_0x0061
            r9 = 1
            goto L_0x0062
        L_0x0061:
            r9 = 0
        L_0x0062:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.e0.a(org.json.JSONObject, org.json.JSONObject, java.lang.String, java.util.Map, long):boolean");
    }

    public boolean a(int i2, long j2) {
        Long l2 = (Long) this.a.get(Integer.valueOf(i2));
        if (l2 == null || j2 - l2.longValue() >= 800) {
            this.a.put(Integer.valueOf(i2), Long.valueOf(j2));
            return false;
        }
        x2.a("EventTracker: event with type " + i2 + " was throttled");
        return true;
    }

    public void a(AdEvent adEvent) {
        a((Runnable) new ca2((Object) this, (Object) adEvent, v2.a(), 11));
    }

    public void a(String str, String str2, long j2, long j3) {
        a((Runnable) new ttg(this, str, str2, j2, j3, v2.a(), 1));
    }

    public void a(JSONObject jSONObject, String str, String str2, String str3, Map map) {
        a((Runnable) new stg(this, a(map), jSONObject, str, str2, str3, v2.a()));
    }

    public void a(String str, Map map) {
        String str2 = str;
        a((Runnable) new sx5(this, str2, a(map), v2.a(), 2));
    }

    public void a(String str, String str2) {
        a((Runnable) new sx5(this, str, str2, v2.a(), 3));
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        a((Runnable) new ztg(this, a(map), jSONObject, jSONObject2, str, v2.a()));
    }

    public void a(float f2, float f3, float f4) {
        a((Runnable) new rtg(this, System.currentTimeMillis(), f2, f3, f4, 0));
    }

    public void a(long j2, String str, o1.a aVar) {
        a((Runnable) new aug(this, j2, str, aVar, v2.a()));
    }

    public void a(int i2, Map map) {
        a((Runnable) new qbf(i2, v2.a(), this, a(map)));
    }

    public void a(float f2) {
        a((Runnable) new xtg(this, System.currentTimeMillis(), f2, 0));
    }

    public void a(String str, String str2, Map map) {
        a((Runnable) new utg(this, a(map), str, str2, v2.a(), 1));
    }

    public void a(MiniAppEvent miniAppEvent) {
        a((Runnable) new ca2((Object) this, (Object) miniAppEvent, v2.a(), 9));
    }

    public void a(int i2, byte[] bArr, boolean z, boolean z2, Runnable runnable) {
        a((Runnable) new ytg(this, i2, bArr, z, z2, v2.a(), runnable));
    }

    public void a(String str, String str2, Runnable runnable) {
        a((Runnable) new utg(this, str, str2, v2.a(), runnable));
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        a((Runnable) new stg(this, str, str2, str3, str4, str5, v2.a()));
    }

    private static int a(r1 r1Var, f1 f1Var, y2.a aVar, boolean z, b3 b3Var, String str, g1 g1Var, String str2, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        y2.a aVar2 = aVar;
        if (!f1Var.j()) {
            return 3;
        }
        long i2 = f1Var.i();
        x1 b2 = f1Var.b();
        z1 c2 = f1Var.c();
        return g1Var.a(r1Var, aVar, z, b3Var, str, g0.a().a(aVar2.m, aVar2.g, aVar2.e, z, str2, okHttpClientProvider, context), i2, f1Var.f(), b2, c2);
    }
}
