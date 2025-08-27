package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zv3  reason: default package */
public final class zv3 extends bw3 {
    public static final Parcelable.Creator<zv3> CREATOR = new j22(18);
    public static final zv3 a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
