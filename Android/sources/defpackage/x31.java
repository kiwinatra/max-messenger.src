package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x31  reason: default package */
public final class x31 extends d41 {
    public static final Parcelable.Creator<x31> CREATOR = new s6(17);
    public static final x31 a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
