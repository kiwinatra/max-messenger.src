package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: kye  reason: default package */
public final class kye extends h3 {
    public static final Parcelable.Creator<kye> CREATOR = new ivg(14);
    public final gye a;
    public final double b;

    public kye(gye gye, double d) {
        if (d > 0.0d) {
            this.a = gye;
            this.b = d;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.u0(parcel, 2, this.a, i);
        tf6.G0(parcel, 3, 8);
        parcel.writeDouble(this.b);
        tf6.E0(parcel, B0);
    }
}
