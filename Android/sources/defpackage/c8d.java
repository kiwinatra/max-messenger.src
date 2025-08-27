package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c8d  reason: default package */
public final class c8d extends h3 {
    public static final Parcelable.Creator<c8d> CREATOR = new ivg(20);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int o;
    public final int v;

    public c8d(int i, int i2, int i3, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.o = i2;
        this.v = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        tf6.G0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        tf6.G0(parcel, 4, 4);
        parcel.writeInt(this.o);
        tf6.G0(parcel, 5, 4);
        parcel.writeInt(this.v);
        tf6.E0(parcel, B0);
    }
}
