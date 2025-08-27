package com.google.android.gms.location;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class LocationResult extends h3 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new ivg(16);
    public static final List b = Collections.emptyList();
    public final List a;

    public LocationResult(List list) {
        this.a = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.location.LocationResult
            r1 = 0
            if (r0 == 0) goto L_0x0088
            com.google.android.gms.location.LocationResult r8 = (com.google.android.gms.location.LocationResult) r8
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            java.util.List r7 = r7.a
            if (r0 < r2) goto L_0x0016
            java.util.List r8 = r8.a
            boolean r7 = r7.equals(r8)
            return r7
        L_0x0016:
            int r0 = r7.size()
            java.util.List r2 = r8.a
            int r2 = r2.size()
            if (r0 == r2) goto L_0x0023
            return r1
        L_0x0023:
            java.util.Iterator r7 = r7.iterator()
            java.util.List r8 = r8.a
            java.util.Iterator r8 = r8.iterator()
        L_0x002d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r7.next()
            android.location.Location r0 = (android.location.Location) r0
            java.lang.Object r2 = r8.next()
            android.location.Location r2 = (android.location.Location) r2
            double r3 = r0.getLatitude()
            double r5 = r2.getLatitude()
            int r3 = java.lang.Double.compare(r3, r5)
            if (r3 == 0) goto L_0x004e
            return r1
        L_0x004e:
            double r3 = r0.getLongitude()
            double r5 = r2.getLongitude()
            int r3 = java.lang.Double.compare(r3, r5)
            if (r3 == 0) goto L_0x005d
            return r1
        L_0x005d:
            long r3 = r0.getTime()
            long r5 = r2.getTime()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x006a
            return r1
        L_0x006a:
            long r3 = r0.getElapsedRealtimeNanos()
            long r5 = r2.getElapsedRealtimeNanos()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0077
            return r1
        L_0x0077:
            java.lang.String r0 = r0.getProvider()
            java.lang.String r2 = r2.getProvider()
            boolean r0 = defpackage.kne.o(r0, r2)
            if (r0 != 0) goto L_0x002d
            return r1
        L_0x0086:
            r7 = 1
            return r7
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationResult.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = wxg.a;
        List<Location> list = this.a;
        sb.ensureCapacity(list.size() * 100);
        sb.append("[");
        boolean z = false;
        for (Location location : list) {
            sb.ensureCapacity(100);
            String str2 = null;
            if (location == null) {
                sb.append((String) null);
            } else {
                sb.append("{");
                sb.append(location.getProvider());
                sb.append(", ");
                if (location.isFromMockProvider()) {
                    sb.append("mock, ");
                }
                DecimalFormat decimalFormat2 = wxg.a;
                sb.append(decimalFormat2.format(location.getLatitude()));
                sb.append(",");
                sb.append(decimalFormat2.format(location.getLongitude()));
                boolean hasAccuracy = location.hasAccuracy();
                DecimalFormat decimalFormat3 = wxg.b;
                if (hasAccuracy) {
                    sb.append("±");
                    sb.append(decimalFormat3.format((double) location.getAccuracy()));
                    sb.append("m");
                }
                if (location.hasAltitude()) {
                    sb.append(", alt=");
                    sb.append(decimalFormat3.format(location.getAltitude()));
                    if (r58.f(location)) {
                        sb.append("±");
                        sb.append(decimalFormat3.format((double) r58.c(location)));
                    }
                    sb.append("m");
                }
                if (location.hasSpeed()) {
                    sb.append(", spd=");
                    sb.append(decimalFormat3.format((double) location.getSpeed()));
                    if (r58.e(location)) {
                        sb.append("±");
                        sb.append(decimalFormat3.format((double) r58.b(location)));
                    }
                    sb.append("m/s");
                }
                if (location.hasBearing()) {
                    sb.append(", brg=");
                    sb.append(decimalFormat3.format((double) location.getBearing()));
                    if (r58.d(location)) {
                        sb.append("±");
                        sb.append(decimalFormat3.format((double) r58.a(location)));
                    }
                    sb.append("°");
                }
                Bundle extras = location.getExtras();
                String string = extras != null ? extras.getString("floorLabel") : null;
                if (string != null) {
                    sb.append(", fl=");
                    sb.append(string);
                }
                Bundle extras2 = location.getExtras();
                if (extras2 != null) {
                    str2 = extras2.getString("levelId");
                }
                if (str2 != null) {
                    sb.append(", lv=");
                    sb.append(str2);
                }
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb.append(", ert=");
                long millis = TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + currentTimeMillis;
                if (millis >= 0) {
                    str = d2h.a.format(new Date(millis));
                } else {
                    SimpleDateFormat simpleDateFormat = d2h.a;
                    str = Long.toString(millis);
                }
                sb.append(str);
                sb.append('}');
            }
            sb.append(", ");
            z = true;
        }
        if (z) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.y0(parcel, this.a, 1);
        tf6.E0(parcel, B0);
    }
}
