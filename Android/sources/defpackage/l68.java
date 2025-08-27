package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l68  reason: default package */
public final class l68 extends h3 {
    public static final Parcelable.Creator<l68> CREATOR = new ivg(19);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final boolean v;
    public final boolean w;

    public l68(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.o = z4;
        this.v = z5;
        this.w = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        tf6.G0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        tf6.G0(parcel, 4, 4);
        parcel.writeInt(this.o ? 1 : 0);
        tf6.G0(parcel, 5, 4);
        parcel.writeInt(this.v ? 1 : 0);
        tf6.G0(parcel, 6, 4);
        parcel.writeInt(this.w ? 1 : 0);
        tf6.E0(parcel, B0);
    }
}
