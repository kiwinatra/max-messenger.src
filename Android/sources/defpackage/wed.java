package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wed  reason: default package */
public final class wed extends xed {
    public static final Parcelable.Creator<wed> CREATOR = new g9d(2);
    public final c84 a;
    public final boolean b;
    public final Parcelable c;

    public wed(c84 c84, boolean z, Parcelable parcelable) {
        this.a = c84;
        this.b = z;
        this.c = parcelable;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wed)) {
            return false;
        }
        wed wed = (wed) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wed.a) && this.b == wed.b && Intrinsics.areEqual((Object) this.c, (Object) wed.c);
    }

    public final int hashCode() {
        int e = g63.e(this.a.hashCode() * 31, 31, this.b);
        Parcelable parcelable = this.c;
        return e + (parcelable == null ? 0 : parcelable.hashCode());
    }

    public final String toString() {
        return "DelayedAttrs(sendTime=" + this.a + ", notifySender=" + this.b + ", input=" + this.c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
    }
}
