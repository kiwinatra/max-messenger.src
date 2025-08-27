package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yv3  reason: default package */
public final class yv3 extends bw3 {
    public static final Parcelable.Creator<yv3> CREATOR = new j22(17);
    public final xv3 a;

    public yv3(xv3 xv3) {
        this.a = xv3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv3) && Intrinsics.areEqual((Object) this.a, (Object) ((yv3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Action(action=" + this.a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
