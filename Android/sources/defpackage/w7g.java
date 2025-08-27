package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w7g  reason: default package */
public final class w7g extends y7g {
    public static final Parcelable.Creator<w7g> CREATOR = new nje(20);
    public static final w7g a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
