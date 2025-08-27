package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bt  reason: default package */
public final class bt implements Parcelable {
    public static final Parcelable.Creator<bt> CREATOR = new s6(8);
    public final String a;
    public final float b;
    public final float c;

    public bt(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }
}
