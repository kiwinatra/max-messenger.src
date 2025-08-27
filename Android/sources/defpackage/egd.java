package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: egd  reason: default package */
public final class egd implements Parcelable {
    public static final Parcelable.Creator<egd> CREATOR = new g9d(3);
    public final String a;

    public /* synthetic */ egd(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof egd)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.a, (Object) ((egd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("ScopeId(value="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
