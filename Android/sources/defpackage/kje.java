package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: kje  reason: default package */
public final class kje implements pje {
    public static final Parcelable.Creator<kje> CREATOR = new g9d(27);
    public static final kje a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
