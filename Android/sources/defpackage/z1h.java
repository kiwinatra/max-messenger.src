package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z1h  reason: default package */
public final class z1h extends h3 {
    public static final Parcelable.Creator<z1h> CREATOR = new o0h(3);
    public final int a;
    public final x1h b;
    public final z7h c;
    public final r7h o;
    public final PendingIntent v;
    public final y6h w;
    public final String x;

    /* JADX WARNING: type inference failed for: r5v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v2, types: [bvg] */
    /* JADX WARNING: type inference failed for: r6v5, types: [bvg] */
    /* JADX WARNING: type inference failed for: r1v3, types: [bvg] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z1h(int r4, defpackage.x1h r5, android.os.IBinder r6, android.os.IBinder r7, android.app.PendingIntent r8, android.os.IBinder r9, java.lang.String r10) {
        /*
            r3 = this;
            r0 = 2
            r3.<init>()
            r3.a = r4
            r3.b = r5
            r4 = 0
            if (r6 == 0) goto L_0x0020
            int r5 = defpackage.y7h.d
            java.lang.String r5 = "com.google.android.gms.location.ILocationListener"
            android.os.IInterface r1 = r6.queryLocalInterface(r5)
            boolean r2 = r1 instanceof defpackage.z7h
            if (r2 == 0) goto L_0x001a
            z7h r1 = (defpackage.z7h) r1
            goto L_0x0021
        L_0x001a:
            w7h r1 = new w7h
            r1.<init>(r6, r5, r0)
            goto L_0x0021
        L_0x0020:
            r1 = r4
        L_0x0021:
            r3.c = r1
            r3.v = r8
            if (r7 == 0) goto L_0x003c
            int r5 = defpackage.e1h.e
            java.lang.String r5 = "com.google.android.gms.location.ILocationCallback"
            android.os.IInterface r6 = r7.queryLocalInterface(r5)
            boolean r8 = r6 instanceof defpackage.r7h
            if (r8 == 0) goto L_0x0036
            r7h r6 = (defpackage.r7h) r6
            goto L_0x003d
        L_0x0036:
            l7h r6 = new l7h
            r6.<init>(r7, r5, r0)
            goto L_0x003d
        L_0x003c:
            r6 = r4
        L_0x003d:
            r3.o = r6
            if (r9 == 0) goto L_0x0055
            java.lang.String r4 = "com.google.android.gms.location.internal.IFusedLocationProviderCallback"
            android.os.IInterface r5 = r9.queryLocalInterface(r4)
            boolean r6 = r5 instanceof defpackage.y6h
            if (r6 == 0) goto L_0x004f
            r4 = r5
            y6h r4 = (defpackage.y6h) r4
            goto L_0x0055
        L_0x004f:
            k6h r5 = new k6h
            r5.<init>(r9, r4, r0)
            r4 = r5
        L_0x0055:
            r3.w = r4
            r3.x = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1h.<init>(int, x1h, android.os.IBinder, android.os.IBinder, android.app.PendingIntent, android.os.IBinder, java.lang.String):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.u0(parcel, 2, this.b, i);
        IBinder iBinder = null;
        z7h z7h = this.c;
        tf6.t0(parcel, 3, z7h == null ? null : z7h.asBinder());
        tf6.u0(parcel, 4, this.v, i);
        r7h r7h = this.o;
        tf6.t0(parcel, 5, r7h == null ? null : r7h.asBinder());
        y6h y6h = this.w;
        if (y6h != null) {
            iBinder = y6h.asBinder();
        }
        tf6.t0(parcel, 6, iBinder);
        tf6.w0(parcel, 8, this.x);
        tf6.E0(parcel, B0);
    }
}
