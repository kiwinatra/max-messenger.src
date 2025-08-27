package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t23  reason: default package */
public final class t23 extends h3 {
    public static final Parcelable.Creator<t23> CREATOR = new nje(27);
    public final int a;
    public final String b;

    public t23(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t23)) {
            return false;
        }
        t23 t23 = (t23) obj;
        return t23.a == this.a && kne.o(t23.b, this.b);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.a + ":" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.w0(parcel, 2, this.b);
        tf6.E0(parcel, B0);
    }
}
