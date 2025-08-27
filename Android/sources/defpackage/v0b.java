package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v0b  reason: default package */
public final class v0b implements y0b {
    public static final Parcelable.Creator<v0b> CREATOR = new ia9(29);
    public static final v0b a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v0b);
    }

    public final int hashCode() {
        return -1194056294;
    }

    public final String toString() {
        return "Empty";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
