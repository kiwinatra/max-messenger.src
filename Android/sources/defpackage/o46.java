package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o46  reason: default package */
public final class o46 extends q46 {
    public static final Parcelable.Creator<o46> CREATOR = new uv4(14);
    public static final o46 a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
