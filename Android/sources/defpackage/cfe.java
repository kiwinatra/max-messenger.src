package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cfe  reason: default package */
public final class cfe implements pp9 {
    public static final Parcelable.Creator<cfe> CREATOR = new g9d(17);
    public final float a;
    public final int b;

    public cfe(float f, int i) {
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
        if (obj == null || cfe.class != obj.getClass()) {
            return false;
        }
        cfe cfe = (cfe) obj;
        return this.a == cfe.a && this.b == cfe.b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(this.a);
        sb.append(", svcTemporalLayerCount=");
        sb.append(this.b);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b);
    }

    public cfe(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readInt();
    }
}
