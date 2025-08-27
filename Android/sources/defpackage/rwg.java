package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rwg  reason: default package */
public final class rwg extends h3 {
    public static final Parcelable.Creator<rwg> CREATOR = new ivg(3);
    public final int a;
    public final bi3 b;
    public final xwg c;

    public rwg(int i, bi3 bi3, xwg xwg) {
        this.a = i;
        this.b = bi3;
        this.c = xwg;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.u0(parcel, 2, this.b, i);
        tf6.u0(parcel, 3, this.c, i);
        tf6.E0(parcel, B0);
    }
}
