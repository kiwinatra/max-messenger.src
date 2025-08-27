package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a1e  reason: default package */
public final class a1e extends f1e {
    public static final Parcelable.Creator<a1e> CREATOR = new g9d(8);
    public static final a1e a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a1e);
    }

    public final int hashCode() {
        return 1237842843;
    }

    public final String toString() {
        return "Arrow";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
