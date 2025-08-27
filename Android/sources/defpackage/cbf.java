package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import kotlin.Lazy;
import kotlin.reflect.KProperty;

/* renamed from: cbf  reason: default package */
public final class cbf {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public cbf(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
    }

    public final iac a() {
        return (iac) this.c.getValue();
    }

    public final void b(String str, String str2, String str3, String str4) {
        iac a2 = a();
        a2.h(false, !a2.b().d());
        ((nd) this.b.getValue()).e("ACTION_DEEP_LINK_PUSH_RECEIVE");
        ((jna) ((rl) this.d.getValue())).F(str, false);
        qa4 qa4 = (qa4) this.a.getValue();
        Lazy lazy = qa4.b;
        ((ed4) qa4.c.getValue()).getClass();
        eda h = ((pwa) lazy.getValue()).h(true, "ru.oneme.app.misc", false);
        if (!TextUtils.isEmpty(str3)) {
            h.f(str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            h.e(str2);
            cda cda = new cda(0);
            cda.f = eda.c(str2);
            h.q(cda);
        }
        if (!TextUtils.isEmpty(str4)) {
            h.k(yd0.a(qa4.a, (yva) qa4.d.getValue(), (r62) qa4.e.getValue(), (ce0) qa4.f.getValue(), (vk3) null, (a32) null, str4, 1000, ((qjd) ((x23) qa4.g.getValue())).p(), (lfd) qa4.h.getValue()));
        }
        int i = f6.z0;
        Intent intent = new Intent(qa4.a, f6.class);
        intent.putExtra("ru.ok.tamtam.extra.INTERCEPTED_LINK", Uri.parse(str));
        intent.putExtra("ru.ok.tamtam.extra.OPENED_FROM_DEEP_LINK_PUSH", true);
        pwa pwa = (pwa) lazy.getValue();
        ((jwa) pwa.d.getValue()).getClass();
        pwa.k(h, intent, (Intent) null, 6, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(long r17, long r19, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24) {
        /*
            r16 = this;
            iac r0 = r16.a()
            r1 = 1
            r0.h(r1, r1)
            kotlin.reflect.KProperty[] r2 = defpackage.iac.z0
            r3 = 12
            r2 = r2[r3]
            hs7 r0 = r0.x0
            java.lang.Object r0 = r0.get()
            jac r0 = (defpackage.jac) r0
            r0.getClass()
            kotlin.reflect.KProperty[] r2 = defpackage.jac.e
            r3 = 0
            r4 = r2[r3]
            hs7 r4 = r0.c
            java.lang.Object r4 = r4.get()
            nh3 r4 = (defpackage.nh3) r4
            boolean r4 = r4.d()
            r5 = 0
            if (r4 == 0) goto L_0x0038
            java.lang.String r0 = defpackage.jac.f
            java.lang.String r1 = "onPush: skip wakelock, backgroundDataDisabledAndOnMobileNetwork"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
        L_0x0034:
            r0 = r16
            goto L_0x015e
        L_0x0038:
            bud r4 = r0.a
            akd r4 = (defpackage.akd) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f119wakelockonpush
            boolean r4 = r4.m(r6, r3)
            if (r4 == 0) goto L_0x006d
            r6 = r2[r3]
            hs7 r6 = r0.c
            java.lang.Object r6 = r6.get()
            nh3 r6 = (defpackage.nh3) r6
            boolean r6 = r6.f()
            if (r6 != 0) goto L_0x006d
            fn4 r6 = r0.a()
            boolean r6 = r6.d()
            if (r6 != 0) goto L_0x006d
            fn4 r6 = r0.a()
            boolean r6 = r6.c()
            if (r6 != 0) goto L_0x006d
            r6 = r1
            goto L_0x006e
        L_0x006d:
            r6 = r3
        L_0x006e:
            java.lang.String r7 = defpackage.jac.f
            a67 r8 = defpackage.z68.b
            if (r8 != 0) goto L_0x0075
            goto L_0x00cc
        L_0x0075:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x00cc
            w78 r9 = defpackage.w78.o
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "needWakelockForLogin="
            r10.<init>(r11)
            r10.append(r6)
            java.lang.String r11 = ", wakelockOnPushEnabled="
            r10.append(r11)
            r10.append(r4)
            java.lang.String r4 = ", online="
            r10.append(r4)
            r2 = r2[r3]
            hs7 r2 = r0.c
            java.lang.Object r2 = r2.get()
            nh3 r2 = (defpackage.nh3) r2
            boolean r2 = r2.f()
            r10.append(r2)
            java.lang.String r2 = ", appVisible="
            r10.append(r2)
            fn4 r2 = r0.a()
            boolean r2 = r2.d()
            r10.append(r2)
            java.lang.String r2 = ", hasForegroundServicesAlive="
            r10.append(r2)
            fn4 r2 = r0.a()
            boolean r2 = r2.c()
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            r8.d(r9, r7, r2, r5)
        L_0x00cc:
            fn4 r2 = r0.a()
            android.content.Context r3 = r2.a
            android.os.PowerManager r4 = r2.d
            java.lang.String r8 = "power"
            if (r4 != 0) goto L_0x00e0
            java.lang.Object r3 = r3.getSystemService(r8)
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            r2.d = r3
        L_0x00e0:
            android.os.PowerManager r2 = r2.d
            boolean r2 = r2.isDeviceIdleMode()
            if (r6 != 0) goto L_0x00f1
            if (r2 != 0) goto L_0x00f1
            java.lang.String r0 = "onPush: skip wakelock"
            defpackage.z68.c(r7, r0, new java.lang.Object[0])
            goto L_0x0034
        L_0x00f1:
            java.util.concurrent.atomic.AtomicLong r3 = r0.b
            long r3 = r3.get()
            fn4 r9 = r0.a()
            r9.getClass()
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r3 = r9 - r3
            r11 = 10000(0x2710, float:1.4013E-41)
            long r12 = (long) r11
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0112
            java.lang.String r0 = "onPush: already acquired wakelock"
            defpackage.z68.c(r7, r0, new java.lang.Object[0])
            goto L_0x0034
        L_0x0112:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "onPush: wakelock, wakelockForLogin=%b, isInDoze=%b"
            defpackage.z68.c(r7, r3, r2)
            java.util.concurrent.atomic.AtomicLong r2 = r0.b
            r2.set(r9)
            if (r6 == 0) goto L_0x012d
            java.lang.String r2 = "ru.ok.tamtam:push"
            goto L_0x012f
        L_0x012d:
            java.lang.String r2 = "ru.ok.tamtam:doze-wakelock"
        L_0x012f:
            fn4 r0 = r0.a()
            r0.getClass()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2}
            java.lang.String r4 = "fn4"
            java.lang.String r6 = "wakeLock: period=%d, tag=%s"
            defpackage.z68.c(r4, r6, r3)
            android.content.Context r3 = r0.a
            android.os.PowerManager r4 = r0.d
            if (r4 != 0) goto L_0x0153
            java.lang.Object r3 = r3.getSystemService(r8)
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            r0.d = r3
        L_0x0153:
            android.os.PowerManager r0 = r0.d
            android.os.PowerManager$WakeLock r0 = r0.newWakeLock(r1, r2)
            r0.acquire(r12)
            goto L_0x0034
        L_0x015e:
            kotlin.Lazy r0 = r0.f
            java.lang.Object r0 = r0.getValue()
            dp1 r0 = (defpackage.dp1) r0
            sf1 r1 = new sf1
            r13 = 0
            r6 = r1
            r7 = r17
            r9 = r19
            r11 = r22
            r12 = r21
            r14 = r24
            r15 = r23
            r6.<init>(r7, r9, r11, r12, r13, r14, r15)
            mp1 r0 = (defpackage.mp1) r0
            kotlin.Lazy r2 = r0.s
            java.lang.Object r2 = r2.getValue()
            gaf r2 = (defpackage.gaf) r2
            osa r2 = (defpackage.osa) r2
            gc8 r2 = r2.c()
            gc8 r2 = r2.t0()
            lp1 r3 = new lp1
            r3.<init>(r1, r0, r5)
            r1 = 2
            cp1 r0 = r0.a
            defpackage.ev0.v(r0, r2, r5, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbf.c(long, long, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final void d(ap0 ap0) {
        iac a2 = a();
        a2.getClass();
        KProperty[] kPropertyArr = iac.z0;
        KProperty kProperty = kPropertyArr[11];
        zq0 d2 = ((doa) a2.w0.get()).d();
        boolean z = d2.b;
        boolean z2 = d2.a;
        if (!z2 || z) {
            z68.p(iac.A0, "onReadOnOtherDevice: skipped, authorized=" + z2 + ", external=" + z);
            return;
        }
        KProperty kProperty2 = kPropertyArr[10];
        ((qfa) a2.v0.get()).g(ap0.b, ap0.c);
        a2.h(false, a2.c());
    }

    public final void e() {
        iac a2 = a();
        a2.h(false, !a2.b().d());
    }
}
