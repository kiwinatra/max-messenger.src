package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gye  reason: default package */
public final class gye extends h3 {
    public static final Parcelable.Creator<gye> CREATOR = new ivg(13);
    public final float a;
    public final int b;
    public final int c;
    public final boolean o;
    public final yie v;

    public gye(float f, int i, int i2, boolean z, yie yie) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.o = z;
        this.v = yie;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 2, 4);
        parcel.writeFloat(this.a);
        tf6.G0(parcel, 3, 4);
        parcel.writeInt(this.b);
        tf6.G0(parcel, 4, 4);
        parcel.writeInt(this.c);
        tf6.G0(parcel, 5, 4);
        parcel.writeInt(this.o ? 1 : 0);
        tf6.u0(parcel, 6, this.v, i);
        tf6.E0(parcel, B0);
    }
}
