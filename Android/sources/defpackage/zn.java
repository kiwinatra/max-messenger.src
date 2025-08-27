package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* renamed from: zn  reason: default package */
public final class zn extends fbf {
    public final /* synthetic */ int v = 0;
    public final /* synthetic */ eo w;
    public final Object x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zn(eo eoVar, jk3 jk3) {
        super(eoVar);
        this.w = eoVar;
        this.x = jk3;
    }

    public final IntentFilter A() {
        switch (this.v) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [nn0, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int D() {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.v
            switch(r1) {
                case 0: goto L_0x00f4;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r0.x
            jk3 r0 = (defpackage.jk3) r0
            java.lang.Object r1 = r0.c
            hze r1 = (defpackage.hze) r1
            long r2 = r1.b
            long r4 = java.lang.System.currentTimeMillis()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            if (r2 <= 0) goto L_0x001e
            boolean r0 = r1.a
            goto L_0x00f0
        L_0x001e:
            java.lang.Object r2 = r0.a
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            int r4 = defpackage.i8b.h(r2, r4)
            r5 = 0
            java.lang.Object r0 = r0.b
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            if (r4 != 0) goto L_0x003c
            java.lang.String r4 = "network"
            boolean r6 = r0.isProviderEnabled(r4)     // Catch:{ Exception -> 0x003c }
            if (r6 == 0) goto L_0x003c
            android.location.Location r4 = r0.getLastKnownLocation(r4)     // Catch:{ Exception -> 0x003c }
            goto L_0x003d
        L_0x003c:
            r4 = r5
        L_0x003d:
            java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
            int r2 = defpackage.i8b.h(r2, r6)
            if (r2 != 0) goto L_0x0051
            java.lang.String r2 = "gps"
            boolean r6 = r0.isProviderEnabled(r2)     // Catch:{ Exception -> 0x0051 }
            if (r6 == 0) goto L_0x0051
            android.location.Location r5 = r0.getLastKnownLocation(r2)     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            if (r5 == 0) goto L_0x0063
            if (r4 == 0) goto L_0x0063
            long r6 = r5.getTime()
            long r8 = r4.getTime()
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
        L_0x0061:
            r4 = r5
            goto L_0x0066
        L_0x0063:
            if (r5 == 0) goto L_0x0066
            goto L_0x0061
        L_0x0066:
            r0 = 0
            if (r4 == 0) goto L_0x00de
            long r12 = java.lang.System.currentTimeMillis()
            nn0 r2 = defpackage.nn0.f
            if (r2 != 0) goto L_0x0078
            nn0 r2 = new nn0
            r2.<init>()
            defpackage.nn0.f = r2
        L_0x0078:
            nn0 r2 = defpackage.nn0.f
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            long r10 = r12 - r14
            double r6 = r4.getLatitude()
            double r8 = r4.getLongitude()
            r5 = r2
            r5.a(r6, r8, r10)
            double r6 = r4.getLatitude()
            double r8 = r4.getLongitude()
            r10 = r12
            r5.a(r6, r8, r10)
            int r5 = r2.a
            if (r5 != r3) goto L_0x009c
            r0 = r3
        L_0x009c:
            long r10 = r2.c
            long r8 = r2.b
            long r14 = r14 + r12
            double r6 = r4.getLatitude()
            double r16 = r4.getLongitude()
            r5 = r2
            r18 = r8
            r8 = r16
            r16 = r10
            r10 = r14
            r5.a(r6, r8, r10)
            long r10 = r2.c
            r4 = -1
            int r2 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00d4
            int r2 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x00c1
            goto L_0x00d4
        L_0x00c1:
            int r2 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c6
            goto L_0x00cf
        L_0x00c6:
            int r2 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x00cd
            r10 = r18
            goto L_0x00cf
        L_0x00cd:
            r10 = r16
        L_0x00cf:
            r4 = 60000(0xea60, double:2.9644E-319)
            long r10 = r10 + r4
            goto L_0x00d9
        L_0x00d4:
            r4 = 43200000(0x2932e00, double:2.1343636E-316)
            long r10 = r12 + r4
        L_0x00d9:
            r1.a = r0
            r1.b = r10
            goto L_0x00f0
        L_0x00de:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r2 = 11
            int r1 = r1.get(r2)
            r2 = 6
            if (r1 < r2) goto L_0x00ef
            r2 = 22
            if (r1 < r2) goto L_0x00f0
        L_0x00ef:
            r0 = r3
        L_0x00f0:
            if (r0 == 0) goto L_0x00f3
            r3 = 2
        L_0x00f3:
            return r3
        L_0x00f4:
            java.lang.Object r0 = r0.x
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            boolean r0 = defpackage.un.a(r0)
            if (r0 == 0) goto L_0x0100
            r0 = 2
            goto L_0x0101
        L_0x0100:
            r0 = 1
        L_0x0101:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn.D():int");
    }

    public final void W() {
        switch (this.v) {
            case 0:
                this.w.l(true, true);
                return;
            default:
                this.w.l(true, true);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zn(eo eoVar, Context context) {
        super(eoVar);
        this.w = eoVar;
        this.x = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
