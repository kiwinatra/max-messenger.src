package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: l84  reason: default package */
public final class l84 implements Parcelable {
    public static final Parcelable.Creator<l84> CREATOR = new j22(23);
    public final long a;

    public l84(long j) {
        this.a = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l84)) {
            return false;
        }
        return this.a == ((l84) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
