package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t0b  reason: default package */
public final class t0b implements y0b {
    public static final Parcelable.Creator<t0b> CREATOR = new ia9(27);
    public static final t0b a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof t0b);
    }

    public final int hashCode() {
        return -1310310577;
    }

    public final String toString() {
        return "CancelBtn";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
