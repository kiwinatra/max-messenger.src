package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: rf8  reason: default package */
public class rf8 extends h3 {
    public static final Parcelable.Creator<rf8> CREATOR = new o0h(12);
    public String A0;
    public float B0;
    public float X;
    public float Y;
    public float Z;
    public LatLng a;
    public String b;
    public String c;
    public y35 o;
    public float v;
    public float v0;
    public float w;
    public float w0;
    public boolean x;
    public int x0;
    public boolean y;
    public View y0;
    public boolean z;
    public int z0;

    public final void writeToParcel(Parcel parcel, int i) {
        int B02 = tf6.B0(parcel, 20293);
        tf6.u0(parcel, 2, this.a, i);
        tf6.w0(parcel, 3, this.b);
        tf6.w0(parcel, 4, this.c);
        y35 y35 = this.o;
        tf6.t0(parcel, 5, y35 == null ? null : ((p67) y35.b).asBinder());
        float f = this.v;
        tf6.G0(parcel, 6, 4);
        parcel.writeFloat(f);
        float f2 = this.w;
        tf6.G0(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z2 = this.x;
        tf6.G0(parcel, 8, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.y;
        tf6.G0(parcel, 9, 4);
        parcel.writeInt(z3 ? 1 : 0);
        tf6.G0(parcel, 10, 4);
        parcel.writeInt(this.z ? 1 : 0);
        tf6.G0(parcel, 11, 4);
        parcel.writeFloat(this.X);
        tf6.G0(parcel, 12, 4);
        parcel.writeFloat(this.Y);
        tf6.G0(parcel, 13, 4);
        parcel.writeFloat(this.Z);
        tf6.G0(parcel, 14, 4);
        parcel.writeFloat(this.v0);
        float f3 = this.w0;
        tf6.G0(parcel, 15, 4);
        parcel.writeFloat(f3);
        tf6.G0(parcel, 17, 4);
        parcel.writeInt(this.x0);
        tf6.t0(parcel, 18, new hha(this.y0));
        int i2 = this.z0;
        tf6.G0(parcel, 19, 4);
        parcel.writeInt(i2);
        tf6.w0(parcel, 20, this.A0);
        tf6.G0(parcel, 21, 4);
        parcel.writeFloat(this.B0);
        tf6.E0(parcel, B02);
    }
}
