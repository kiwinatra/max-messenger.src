package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sl6  reason: default package */
public final class sl6 extends tl6 {
    public static final Parcelable.Creator<sl6> CREATOR = new uv4(24);
    public final tqd a;

    public sl6(tqd tqd) {
        this.a = tqd;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sl6) && Intrinsics.areEqual((Object) this.a, (Object) ((sl6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Single(item=" + this.a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
