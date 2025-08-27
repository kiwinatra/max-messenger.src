package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lq9  reason: default package */
public final class lq9 extends h3 {
    public static final Parcelable.Creator<lq9> CREATOR = new ivg(4);
    public final int a;
    public final int b;
    public final int c;
    public final long o;
    public final long v;
    public final String w;
    public final String x;
    public final int y;
    public final int z;

    public lq9(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.o = j;
        this.v = j2;
        this.w = str;
        this.x = str2;
        this.y = i4;
        this.z = i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(this.b);
        tf6.G0(parcel, 3, 4);
        parcel.writeInt(this.c);
        tf6.G0(parcel, 4, 8);
        parcel.writeLong(this.o);
        tf6.G0(parcel, 5, 8);
        parcel.writeLong(this.v);
        tf6.w0(parcel, 6, this.w);
        tf6.w0(parcel, 7, this.x);
        tf6.G0(parcel, 8, 4);
        parcel.writeInt(this.y);
        tf6.G0(parcel, 9, 4);
        parcel.writeInt(this.z);
        tf6.E0(parcel, B0);
    }
}
