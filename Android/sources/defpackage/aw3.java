package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aw3  reason: default package */
public final class aw3 extends bw3 {
    public static final Parcelable.Creator<aw3> CREATOR = new j22(19);
    public static final aw3 a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
