package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h5h  reason: default package */
public final class h5h extends h3 {
    public static final Parcelable.Creator<h5h> CREATOR = new o0h(5);
    public Bundle a;
    public tj5[] b;
    public int c;
    public ki3 o;

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.r0(parcel, 1, this.a);
        tf6.x0(parcel, 2, this.b, i);
        tf6.G0(parcel, 3, 4);
        parcel.writeInt(this.c);
        tf6.u0(parcel, 4, this.o, i);
        tf6.E0(parcel, B0);
    }
}
