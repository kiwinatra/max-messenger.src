package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bvb  reason: default package */
public final class bvb extends yge {
    public static final Parcelable.Creator<bvb> CREATOR = new w0b(19);
    public final long a;
    public final long b;
    public final byte[] c;

    public bvb(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.a);
        sb.append(", identifier= ");
        return wj6.m(sb, this.b, " }");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }

    public bvb(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i = v0g.a;
        this.c = createByteArray;
    }
}
