package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ved  reason: default package */
public final class ved extends xed {
    public static final Parcelable.Creator<ved> CREATOR = new g9d(1);
    public final Parcelable a;

    public ved(Parcelable parcelable) {
        this.a = parcelable;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ved) && Intrinsics.areEqual((Object) this.a, (Object) ((ved) obj).a);
    }

    public final int hashCode() {
        Parcelable parcelable = this.a;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    public final String toString() {
        return "Close(input=" + this.a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
