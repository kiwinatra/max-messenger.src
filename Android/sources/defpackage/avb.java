package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: avb  reason: default package */
public final class avb extends xge {
    public static final Parcelable.Creator<avb> CREATOR = new w0b(18);
    public final long a;
    public final long b;
    public final byte[] c;

    public avb(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }

    public avb(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i = t0g.a;
        this.c = createByteArray;
    }
}
