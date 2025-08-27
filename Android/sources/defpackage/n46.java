package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: n46  reason: default package */
public final class n46 extends q46 {
    public static final Parcelable.Creator<n46> CREATOR = new uv4(13);
    public static final n46 a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
