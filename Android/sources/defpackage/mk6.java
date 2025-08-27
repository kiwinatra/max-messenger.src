package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mk6  reason: default package */
public final class mk6 extends h3 {
    public static final Parcelable.Creator<mk6> CREATOR = new uv4(20);
    public final String a;

    public mk6(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mk6) && Intrinsics.areEqual((Object) this.a, (Object) ((mk6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("AsString(string="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
