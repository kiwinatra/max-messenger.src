package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c41  reason: default package */
public final class c41 extends d41 {
    public static final Parcelable.Creator<c41> CREATOR = new s6(22);
    public final boolean a;

    public c41(boolean z) {
        this.a = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c41) && this.a == ((c41) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("VideoEnabled(isVideoEnabled="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
    }
}
