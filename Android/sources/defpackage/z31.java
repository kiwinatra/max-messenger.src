package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z31  reason: default package */
public final class z31 extends d41 {
    public static final Parcelable.Creator<z31> CREATOR = new s6(19);
    public final boolean a;

    public z31(boolean z) {
        this.a = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z31) && this.a == ((z31) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("MicrophoneMute(isMute="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
    }
}
