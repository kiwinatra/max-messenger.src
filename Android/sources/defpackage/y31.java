package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y31  reason: default package */
public final class y31 extends d41 {
    public static final Parcelable.Creator<y31> CREATOR = new s6(18);
    public static final y31 a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
