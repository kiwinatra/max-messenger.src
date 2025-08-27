package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: km8  reason: default package */
public final class km8 implements Parcelable {
    public static final Parcelable.Creator<km8> CREATOR = new f27(22);
    public final int a;
    public final zp8 b;

    public km8(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = zp8.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
