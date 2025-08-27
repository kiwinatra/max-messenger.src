package defpackage;

import android.os.SystemClock;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: sp5  reason: default package */
public final class sp5 implements mne {
    public final o9g a;
    public final boolean b;
    public final Function0 c;
    public final j50 d;
    public final j50 e;
    public final em4 f;

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, em4] */
    public sp5(c51 c51, o9g o9g, sjf sjf, boolean z, ny0 ny0, cz0 cz0, voc voc) {
        boolean z2 = z;
        this.a = o9g;
        this.b = z2;
        this.c = ny0;
        this.d = new j50(sjf, c51, voc, "incomingP2PFirstDataStat", "direct_incoming");
        this.e = new j50(sjf, c51, voc, "outgoingP2PFirstDataStat", "direct_outgoing");
        ? obj = new Object();
        obj.a = z2;
        obj.c = sjf;
        obj.d = cz0;
        obj.e = c51;
        obj.f = voc;
        obj.g = "";
        this.f = obj;
    }

    public static boolean b(eud eud) {
        List<hie> list = (List) eud.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (hie hie : list) {
                BigInteger bigInteger = hie.j;
                if (bigInteger != null && bigInteger.compareTo(BigInteger.ZERO) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.xoc r8) {
        /*
            r7 = this;
            em4 r0 = r7.f
            boolean r1 = r0.b
            if (r1 != 0) goto L_0x00f9
            j50 r1 = r7.d
            boolean r2 = r1.b
            if (r2 != 0) goto L_0x00f9
            j50 r2 = r7.e
            boolean r3 = r2.b
            if (r3 == 0) goto L_0x0014
            goto L_0x00f9
        L_0x0014:
            kotlin.jvm.functions.Function0 r3 = r7.c
            java.lang.Object r4 = r3.invoke()
            xnf r5 = defpackage.xnf.o
            r6 = 1
            if (r4 != r5) goto L_0x009f
            uw1 r7 = r8.c()
            if (r7 != 0) goto L_0x0027
            goto L_0x00f9
        L_0x0027:
            java.util.List r8 = r8.c
            java.util.ArrayList r7 = defpackage.f6e.H(r8, r7)
            eud r7 = defpackage.f6e.G(r7)
            boolean r7 = b(r7)
            if (r7 == 0) goto L_0x00f9
            boolean r7 = r0.b
            if (r7 == 0) goto L_0x003d
            goto L_0x00f9
        L_0x003d:
            java.lang.Object r7 = r0.d
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            java.lang.Object r7 = r7.invoke()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L_0x0051
            r0.b = r6
            goto L_0x00f9
        L_0x0051:
            java.lang.Object r7 = r0.h
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 != 0) goto L_0x0064
            java.lang.Object r7 = r0.f
            voc r7 = (defpackage.voc) r7
            java.lang.String r8 = "ServerTopologyFirstDataStat"
            java.lang.String r0 = "Data is received but accept event wasn't triggered"
            r7.log(r8, r0)
            goto L_0x00f9
        L_0x0064:
            java.lang.Object r8 = r0.c
            rjf r8 = (defpackage.rjf) r8
            sjf r8 = (defpackage.sjf) r8
            r8.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7.longValue()
            long r1 = r1 - r7
            ru.ok.android.externcalls.analytics.events.EventItemValue r7 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((long) r1)
            ru.ok.android.externcalls.analytics.events.EventItemsMap r8 = new ru.ok.android.externcalls.analytics.events.EventItemsMap
            java.lang.Object r1 = r0.g
            java.lang.String r1 = (java.lang.String) r1
            ru.ok.android.externcalls.analytics.events.EventItemValue r1 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((java.lang.String) r1)
            java.lang.String r2 = "call_type"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r2, r1)
            java.util.Map r1 = kotlin.collections.MapsKt.mapOf(r1)
            r8.<init>(r1)
            java.lang.Object r1 = r0.e
            c51 r1 = (defpackage.c51) r1
            d51 r1 = (defpackage.d51) r1
            java.lang.String r2 = "first_media_received"
            r1.c(r2, r7, r8)
            r0.b = r6
            goto L_0x00f9
        L_0x009f:
            uw1 r0 = r8.c()
            if (r0 != 0) goto L_0x00a6
            goto L_0x00f9
        L_0x00a6:
            java.util.List r8 = r8.c
            java.util.ArrayList r8 = defpackage.f6e.H(r8, r0)
            eud r8 = defpackage.f6e.G(r8)
            boolean r0 = b(r8)
            java.lang.Object r8 = r8.c
            java.util.List r8 = (java.util.List) r8
            boolean r4 = r8 instanceof java.util.Collection
            if (r4 == 0) goto L_0x00c3
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x00c3
            goto L_0x00e0
        L_0x00c3:
            java.util.Iterator r8 = r8.iterator()
        L_0x00c7:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x00e0
            java.lang.Object r4 = r8.next()
            lie r4 = (defpackage.lie) r4
            java.math.BigInteger r4 = r4.j
            if (r4 == 0) goto L_0x00c7
            java.math.BigInteger r5 = java.math.BigInteger.ZERO
            int r4 = r4.compareTo(r5)
            if (r4 <= 0) goto L_0x00c7
            goto L_0x00e1
        L_0x00e0:
            r6 = 0
        L_0x00e1:
            if (r0 != 0) goto L_0x00e5
            if (r6 == 0) goto L_0x00f9
        L_0x00e5:
            java.lang.Object r8 = r3.invoke()
            xnf r0 = defpackage.xnf.o
            if (r8 != r0) goto L_0x00ee
            goto L_0x00f9
        L_0x00ee:
            boolean r7 = r7.b
            if (r7 == 0) goto L_0x00f6
            r2.f()
            goto L_0x00f9
        L_0x00f6:
            r1.f()
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sp5.a(xoc):void");
    }

    public final void c() {
        this.e.e();
        em4 em4 = this.f;
        if (!em4.b && em4.a) {
            ((sjf) ((rjf) em4.c)).getClass();
            em4.h = Long.valueOf(SystemClock.elapsedRealtime());
            em4.g = "server_change_topology";
        }
    }

    public final void d() {
        em4 em4 = this.f;
        if (!em4.b) {
            ((sjf) ((rjf) em4.c)).getClass();
            em4.h = Long.valueOf(SystemClock.elapsedRealtime());
            em4.g = "server_join_server";
        }
    }
}
