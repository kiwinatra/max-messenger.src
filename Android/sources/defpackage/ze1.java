package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ze1  reason: default package */
public final class ze1 implements Parcelable {
    public static final Parcelable.Creator<ze1> CREATOR = new s6(24);
    public static final ze1 c = new ze1(0, 0);
    public final long a;
    public final int b;

    public ze1(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze1)) {
            return false;
        }
        ze1 ze1 = (ze1) obj;
        return this.a == ze1.a && this.b == ze1.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return this.a + ":" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
    }
}
