package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: exe  reason: default package */
public final class exe implements Comparable, Parcelable {
    public static final Parcelable.Creator<exe> CREATOR = new nje(4);
    public final int a;
    public final int b;
    public final int c;

    public exe() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }

    public final int compareTo(Object obj) {
        exe exe = (exe) obj;
        int i = this.a - exe.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - exe.b;
        return i2 == 0 ? this.c - exe.c : i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || exe.class != obj.getClass()) {
            return false;
        }
        exe exe = (exe) obj;
        return this.a == exe.a && this.b == exe.b && this.c == exe.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append(this.a);
        sb.append(".");
        sb.append(this.b);
        sb.append(".");
        sb.append(this.c);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public exe(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
