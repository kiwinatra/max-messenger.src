package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r2a  reason: default package */
public final class r2a implements Parcelable {
    public static final Parcelable.Creator<r2a> CREATOR = new ia9(15);
    public final int a;
    public final boolean b;
    public final boolean c;

    public r2a(n70 n70) {
        this.a = n70.a;
        this.b = n70.b;
        this.c = n70.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.c ? (byte) 1 : 0);
    }

    public r2a(Parcel parcel) {
        this.a = parcel.readInt();
        boolean z = false;
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0 ? true : z;
    }
}
