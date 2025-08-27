package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lk6  reason: default package */
public final class lk6 extends h3 {
    public static final Parcelable.Creator<lk6> CREATOR = new uv4(19);
    public final int a;

    public lk6(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lk6) && this.a == ((lk6) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("AsRes(res="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
