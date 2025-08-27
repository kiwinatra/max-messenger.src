package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u0b  reason: default package */
public final class u0b implements y0b {
    public static final Parcelable.Creator<u0b> CREATOR = new ia9(28);
    public static final u0b a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u0b);
    }

    public final int hashCode() {
        return 1634881352;
    }

    public final String toString() {
        return "Chevron";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
