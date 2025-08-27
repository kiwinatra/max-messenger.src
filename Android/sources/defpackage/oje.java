package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: oje  reason: default package */
public final class oje implements pje {
    public static final Parcelable.Creator<oje> CREATOR = new nje(0);
    public final long a;

    public oje(long j) {
        this.a = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oje) && this.a == ((oje) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("UserInternal(contactServerId="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
