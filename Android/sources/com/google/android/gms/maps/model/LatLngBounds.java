package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LatLngBounds extends h3 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new o0h(8);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        vzg.n(latLng, "southwest must not be null.");
        vzg.n(latLng2, "northeast must not be null.");
        double d = latLng.a;
        Double valueOf = Double.valueOf(d);
        double d2 = latLng2.a;
        vzg.g(d2 >= d, "southern latitude exceeds northern latitude (%s > %s)", valueOf, Double.valueOf(d2));
        this.a = latLng;
        this.b = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        fj fjVar = new fj((Object) this);
        fjVar.k(this.a, "southwest");
        fjVar.k(this.b, "northeast");
        return fjVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.u0(parcel, 2, this.a, i);
        tf6.u0(parcel, 3, this.b, i);
        tf6.E0(parcel, B0);
    }
}
