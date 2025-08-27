package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mje  reason: default package */
public final class mje implements pje {
    public static final Parcelable.Creator<mje> CREATOR = new g9d(29);
    public final d4g a;

    public mje(d4g d4g) {
        this.a = d4g;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mje) && Intrinsics.areEqual((Object) this.a, (Object) ((mje) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "JoinLinkInternal(videoConference=" + this.a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
    }
}
