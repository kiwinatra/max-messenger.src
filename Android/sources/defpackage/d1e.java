package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d1e  reason: default package */
public final class d1e extends f1e {
    public static final Parcelable.Creator<d1e> CREATOR = new g9d(11);
    public boolean a;
    public final boolean b;

    public d1e(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1e)) {
            return false;
        }
        d1e d1e = (d1e) obj;
        return this.a == d1e.a && this.b == d1e.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        boolean z = this.a;
        return "Switch(isChecked=" + z + ", isEnabled=" + this.b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
