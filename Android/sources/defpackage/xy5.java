package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xy5  reason: default package */
public final class xy5 extends az5 {
    public static final Parcelable.Creator<xy5> CREATOR = new uv4(9);
    public static final xy5 a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
