package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o0b  reason: default package */
public final class o0b implements s0b {
    public static final Parcelable.Creator<o0b> CREATOR = new ia9(23);
    public final int a;

    public o0b(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0b) && this.a == ((o0b) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("ContrastIcon(iconRes="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
