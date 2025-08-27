package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p0b  reason: default package */
public final class p0b implements s0b {
    public static final Parcelable.Creator<p0b> CREATOR = new ia9(24);
    public static final p0b a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p0b);
    }

    public final int hashCode() {
        return -2022406681;
    }

    public final String toString() {
        return "Empty";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
