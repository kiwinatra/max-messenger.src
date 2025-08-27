package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* renamed from: z03  reason: default package */
public final class z03 extends h3 {
    public static final Parcelable.Creator<z03> CREATOR = new ivg(27);
    public LatLng a;
    public double b;
    public float c;
    public int o;
    public int v;
    public float w;
    public boolean x;
    public boolean y;
    public List z;

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.u0(parcel, 2, this.a, i);
        double d = this.b;
        tf6.G0(parcel, 3, 8);
        parcel.writeDouble(d);
        float f = this.c;
        tf6.G0(parcel, 4, 4);
        parcel.writeFloat(f);
        int i2 = this.o;
        tf6.G0(parcel, 5, 4);
        parcel.writeInt(i2);
        int i3 = this.v;
        tf6.G0(parcel, 6, 4);
        parcel.writeInt(i3);
        float f2 = this.w;
        tf6.G0(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z2 = this.x;
        tf6.G0(parcel, 8, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.y;
        tf6.G0(parcel, 9, 4);
        parcel.writeInt(z3 ? 1 : 0);
        tf6.y0(parcel, this.z, 10);
        tf6.E0(parcel, B0);
    }
}
