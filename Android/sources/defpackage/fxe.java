package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fxe  reason: default package */
public final class fxe implements Comparable, Parcelable {
    public static final Parcelable.Creator<fxe> CREATOR = new nje(5);
    public static final String o = Integer.toString(0, 36);
    public static final String v = Integer.toString(1, 36);
    public static final String w = Integer.toString(2, 36);
    public final int a;
    public final int b;
    public final int c;

    static {
        int i = v0g.a;
    }

    public fxe(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int compareTo(Object obj) {
        fxe fxe = (fxe) obj;
        int i = this.a - fxe.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - fxe.b;
        return i2 == 0 ? this.c - fxe.c : i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fxe.class != obj.getClass()) {
            return false;
        }
        fxe fxe = (fxe) obj;
        return this.a == fxe.a && this.b == fxe.b && this.c == fxe.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.a + "." + this.b + "." + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public fxe(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
