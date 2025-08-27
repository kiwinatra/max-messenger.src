package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;

public final class LocationRequest extends h3 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new ivg(15);
    public final int X;
    public final int Y;
    public final boolean Z;
    public int a;
    public long b;
    public long c;
    public final long o;
    public final long v;
    public final WorkSource v0;
    public final int w;
    public final o1h w0;
    public final float x;
    public final boolean y;
    public long z;

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z2, long j6, int i3, int i4, boolean z3, WorkSource workSource, o1h o1h) {
        long j7;
        long j8;
        int i5 = i;
        this.a = i5;
        if (i5 == 105) {
            this.b = LongCompanionObject.MAX_VALUE;
            j7 = j;
        } else {
            j7 = j;
            this.b = j7;
        }
        this.c = j2;
        this.o = j3;
        if (j4 == LongCompanionObject.MAX_VALUE) {
            j8 = j5;
        } else {
            j8 = Math.min(Math.max(1, j4 - SystemClock.elapsedRealtime()), j5);
        }
        this.v = j8;
        this.w = i2;
        this.x = f;
        this.y = z2;
        this.z = j6 != -1 ? j6 : j7;
        this.X = i3;
        this.Y = i4;
        this.Z = z3;
        this.v0 = workSource;
        this.w0 = o1h;
    }

    public static String c(long j) {
        String sb;
        if (j == LongCompanionObject.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb2 = d2h.b;
        synchronized (sb2) {
            sb2.setLength(0);
            d2h.a(sb2, j);
            sb = sb2.toString();
        }
        return sb;
    }

    public final boolean b() {
        long j = this.o;
        return j > 0 && (j >> 1) >= this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            int i = this.a;
            return i == locationRequest.a && (i == 105 || this.b == locationRequest.b) && this.c == locationRequest.c && b() == locationRequest.b() && ((!b() || this.o == locationRequest.o) && this.v == locationRequest.v && this.w == locationRequest.w && this.x == locationRequest.x && this.y == locationRequest.y && this.X == locationRequest.X && this.Y == locationRequest.Y && this.Z == locationRequest.Z && this.v0.equals(locationRequest.v0) && kne.o(this.w0, locationRequest.w0));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.v0});
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r11 = this;
            java.lang.String r0 = "Request["
            java.lang.StringBuilder r0 = defpackage.tr1.o(r0)
            int r1 = r11.a
            r2 = 0
            r3 = 105(0x69, float:1.47E-43)
            r4 = 1
            if (r1 != r3) goto L_0x0010
            r5 = r4
            goto L_0x0011
        L_0x0010:
            r5 = r2
        L_0x0011:
            long r6 = r11.o
            java.lang.String r8 = "/"
            if (r5 == 0) goto L_0x002b
            java.lang.String r1 = defpackage.iq.j0(r1)
            r0.append(r1)
            r9 = 0
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0055
            r0.append(r8)
            defpackage.d2h.a(r0, r6)
            goto L_0x0055
        L_0x002b:
            java.lang.String r1 = "@"
            r0.append(r1)
            boolean r1 = r11.b()
            if (r1 == 0) goto L_0x0042
            long r9 = r11.b
            defpackage.d2h.a(r0, r9)
            r0.append(r8)
            defpackage.d2h.a(r0, r6)
            goto L_0x0047
        L_0x0042:
            long r5 = r11.b
            defpackage.d2h.a(r0, r5)
        L_0x0047:
            java.lang.String r1 = " "
            r0.append(r1)
            int r1 = r11.a
            java.lang.String r1 = defpackage.iq.j0(r1)
            r0.append(r1)
        L_0x0055:
            int r1 = r11.a
            if (r1 != r3) goto L_0x005a
            goto L_0x0062
        L_0x005a:
            long r5 = r11.c
            long r7 = r11.b
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0070
        L_0x0062:
            java.lang.String r1 = ", minUpdateInterval="
            r0.append(r1)
            long r5 = r11.c
            java.lang.String r1 = c(r5)
            r0.append(r1)
        L_0x0070:
            float r1 = r11.x
            double r5 = (double) r1
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0081
            java.lang.String r5 = ", minUpdateDistance="
            r0.append(r5)
            r0.append(r1)
        L_0x0081:
            int r1 = r11.a
            if (r1 != r3) goto L_0x0087
            r1 = r4
            goto L_0x0088
        L_0x0087:
            r1 = r2
        L_0x0088:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L_0x0096
            long r7 = r11.z
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00ac
            goto L_0x009e
        L_0x0096:
            long r7 = r11.z
            long r9 = r11.b
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x00ac
        L_0x009e:
            java.lang.String r1 = ", maxUpdateAge="
            r0.append(r1)
            long r7 = r11.z
            java.lang.String r1 = c(r7)
            r0.append(r1)
        L_0x00ac:
            long r7 = r11.v
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00ba
            java.lang.String r1 = ", duration="
            r0.append(r1)
            defpackage.d2h.a(r0, r7)
        L_0x00ba:
            int r1 = r11.w
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r3) goto L_0x00c9
            java.lang.String r3 = ", maxUpdates="
            r0.append(r3)
            r0.append(r1)
        L_0x00c9:
            r1 = 2
            int r3 = r11.Y
            java.lang.String r5 = ", "
            if (r3 == 0) goto L_0x00ea
            r0.append(r5)
            if (r3 == 0) goto L_0x00e5
            if (r3 == r4) goto L_0x00e2
            if (r3 != r1) goto L_0x00dc
            java.lang.String r3 = "THROTTLE_NEVER"
            goto L_0x00e7
        L_0x00dc:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        L_0x00e2:
            java.lang.String r3 = "THROTTLE_ALWAYS"
            goto L_0x00e7
        L_0x00e5:
            java.lang.String r3 = "THROTTLE_BACKGROUND"
        L_0x00e7:
            r0.append(r3)
        L_0x00ea:
            int r3 = r11.X
            if (r3 == 0) goto L_0x0108
            r0.append(r5)
            if (r3 == 0) goto L_0x0103
            if (r3 == r4) goto L_0x0100
            if (r3 != r1) goto L_0x00fa
            java.lang.String r1 = "GRANULARITY_FINE"
            goto L_0x0105
        L_0x00fa:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        L_0x0100:
            java.lang.String r1 = "GRANULARITY_COARSE"
            goto L_0x0105
        L_0x0103:
            java.lang.String r1 = "GRANULARITY_PERMISSION_LEVEL"
        L_0x0105:
            r0.append(r1)
        L_0x0108:
            boolean r1 = r11.y
            if (r1 == 0) goto L_0x0111
            java.lang.String r1 = ", waitForAccurateLocation"
            r0.append(r1)
        L_0x0111:
            boolean r1 = r11.Z
            if (r1 == 0) goto L_0x011a
            java.lang.String r1 = ", bypass"
            r0.append(r1)
        L_0x011a:
            java.lang.reflect.Method r1 = defpackage.upg.d
            android.os.WorkSource r3 = r11.v0
            r6 = 0
            if (r1 == 0) goto L_0x012f
            java.lang.Object r1 = r1.invoke(r3, r6)     // Catch:{ Exception -> 0x012f }
            defpackage.vzg.m(r1)     // Catch:{ Exception -> 0x012f }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x012f }
            boolean r2 = r1.booleanValue()     // Catch:{ Exception -> 0x012f }
            goto L_0x014d
        L_0x012f:
            java.lang.reflect.Method r1 = defpackage.upg.c
            if (r1 == 0) goto L_0x0149
            java.lang.Object r1 = r1.invoke(r3, r6)     // Catch:{ Exception -> 0x0141 }
            defpackage.vzg.m(r1)     // Catch:{ Exception -> 0x0141 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0141 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0141 }
            goto L_0x014a
        L_0x0141:
            r1 = move-exception
            java.lang.String r6 = "WorkSourceUtil"
            java.lang.String r7 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r6, r7, r1)
        L_0x0149:
            r1 = r2
        L_0x014a:
            if (r1 != 0) goto L_0x014d
            r2 = r4
        L_0x014d:
            if (r2 != 0) goto L_0x0155
            r0.append(r5)
            r0.append(r3)
        L_0x0155:
            o1h r11 = r11.w0
            if (r11 == 0) goto L_0x0161
            java.lang.String r1 = ", impersonation="
            r0.append(r1)
            r0.append(r11)
        L_0x0161:
            r11 = 93
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.toString():java.lang.String");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        int i2 = this.a;
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(i2);
        long j = this.b;
        tf6.G0(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.c;
        tf6.G0(parcel, 3, 8);
        parcel.writeLong(j2);
        tf6.G0(parcel, 6, 4);
        parcel.writeInt(this.w);
        tf6.G0(parcel, 7, 4);
        parcel.writeFloat(this.x);
        tf6.G0(parcel, 8, 8);
        parcel.writeLong(this.o);
        tf6.G0(parcel, 9, 4);
        parcel.writeInt(this.y ? 1 : 0);
        tf6.G0(parcel, 10, 8);
        parcel.writeLong(this.v);
        long j3 = this.z;
        tf6.G0(parcel, 11, 8);
        parcel.writeLong(j3);
        tf6.G0(parcel, 12, 4);
        parcel.writeInt(this.X);
        tf6.G0(parcel, 13, 4);
        parcel.writeInt(this.Y);
        tf6.G0(parcel, 15, 4);
        parcel.writeInt(this.Z ? 1 : 0);
        tf6.u0(parcel, 16, this.v0, i);
        tf6.u0(parcel, 17, this.w0, i);
        tf6.E0(parcel, B0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocationRequest() {
        /*
            r22 = this;
            r0 = r22
            android.os.WorkSource r1 = new android.os.WorkSource
            r20 = r1
            r1.<init>()
            r21 = 0
            r1 = 102(0x66, float:1.43E-43)
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            r4 = 600000(0x927c0, double:2.964394E-318)
            r6 = 0
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = r10
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            r14 = 1
            r15 = 3600000(0x36ee80, double:1.7786363E-317)
            r17 = 0
            r18 = 0
            r19 = 0
            r0.<init>(r1, r2, r4, r6, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.<init>():void");
    }
}
