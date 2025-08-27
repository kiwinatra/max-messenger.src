package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q0b  reason: default package */
public final class q0b implements s0b {
    public static final Parcelable.Creator<q0b> CREATOR = new ia9(25);
    public final int a;

    public q0b(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0b) && this.a == ((q0b) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("NegativeIcon(iconRes="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
