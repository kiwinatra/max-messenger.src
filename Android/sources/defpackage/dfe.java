package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dfe  reason: default package */
public final class dfe implements qp9 {
    public static final Parcelable.Creator<dfe> CREATOR = new g9d(18);
    public final float a;
    public final int b;

    public dfe(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dfe.class != obj.getClass()) {
            return false;
        }
        dfe dfe = (dfe) obj;
        return this.a == dfe.a && this.b == dfe.b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b);
    }

    public dfe(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readInt();
    }
}
