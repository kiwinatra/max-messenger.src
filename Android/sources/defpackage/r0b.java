package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r0b  reason: default package */
public final class r0b implements s0b {
    public static final Parcelable.Creator<r0b> CREATOR = new ia9(26);
    public static final r0b a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof r0b);
    }

    public final int hashCode() {
        return -2008676385;
    }

    public final String toString() {
        return "Timer";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
