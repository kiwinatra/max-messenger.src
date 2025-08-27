package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ki3  reason: default package */
public final class ki3 extends h3 {
    public static final Parcelable.Creator<ki3> CREATOR = new o0h(6);
    public final c8d a;
    public final boolean b;
    public final boolean c;
    public final int[] o;
    public final int v;
    public final int[] w;

    public ki3(c8d c8d, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = c8d;
        this.b = z;
        this.c = z2;
        this.o = iArr;
        this.v = i;
        this.w = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.u0(parcel, 1, this.a, i);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        tf6.G0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        int[] iArr = this.o;
        if (iArr != null) {
            int B02 = tf6.B0(parcel, 4);
            parcel.writeIntArray(iArr);
            tf6.E0(parcel, B02);
        }
        tf6.G0(parcel, 5, 4);
        parcel.writeInt(this.v);
        int[] iArr2 = this.w;
        if (iArr2 != null) {
            int B03 = tf6.B0(parcel, 6);
            parcel.writeIntArray(iArr2);
            tf6.E0(parcel, B03);
        }
        tf6.E0(parcel, B0);
    }
}
