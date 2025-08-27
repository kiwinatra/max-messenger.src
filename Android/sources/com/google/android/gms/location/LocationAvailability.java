package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LocationAvailability extends h3 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new ivg(11);
    public final int a;
    public final int b;
    public final long c;
    public final int o;
    public final xxg[] v;

    public LocationAvailability(int i, int i2, int i3, long j, xxg[] xxgArr) {
        this.o = i < 1000 ? 0 : 1000;
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.v = xxgArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r7 = (com.google.android.gms.location.LocationAvailability) r7;
        r0 = r7.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.location.LocationAvailability
            r1 = 0
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.location.LocationAvailability r7 = (com.google.android.gms.location.LocationAvailability) r7
            int r0 = r7.a
            int r2 = r6.a
            if (r2 != r0) goto L_0x002d
            int r0 = r6.b
            int r2 = r7.b
            if (r0 != r2) goto L_0x002d
            long r2 = r6.c
            long r4 = r7.c
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
            int r0 = r6.o
            int r2 = r7.o
            if (r0 != r2) goto L_0x002d
            xxg[] r6 = r6.v
            xxg[] r7 = r7.v
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 == 0) goto L_0x002d
            r6 = 1
            return r6
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationAvailability.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.o)});
    }

    public final String toString() {
        boolean z = this.o < 1000;
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 22);
        sb.append("LocationAvailability[");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        int i2 = 1;
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(this.b);
        tf6.G0(parcel, 3, 8);
        parcel.writeLong(this.c);
        tf6.G0(parcel, 4, 4);
        int i3 = this.o;
        parcel.writeInt(i3);
        tf6.x0(parcel, 5, this.v, i);
        if (i3 >= 1000) {
            i2 = 0;
        }
        tf6.G0(parcel, 6, 4);
        parcel.writeInt(i2);
        tf6.E0(parcel, B0);
    }
}
