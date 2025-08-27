package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: su9  reason: default package */
public final class su9 implements qp9 {
    public static final Parcelable.Creator<su9> CREATOR = new ia9(12);
    public final float a;
    public final float b;

    public su9(float f, float f2) {
        n79.f("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.a = f;
        this.b = f2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || su9.class != obj.getClass()) {
            return false;
        }
        su9 su9 = (su9) obj;
        return this.a == su9.a && this.b == su9.b;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
    }

    public su9(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
    }
}
