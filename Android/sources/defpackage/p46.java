package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p46  reason: default package */
public final class p46 extends q46 {
    public static final Parcelable.Creator<p46> CREATOR = new uv4(15);
    public static final p46 a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
