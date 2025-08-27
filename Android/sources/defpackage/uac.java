package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: uac  reason: default package */
public final class uac implements Parcelable {
    public static final Parcelable.Creator<uac> CREATOR = new w0b(25);
    public final rac a;

    public uac(rac rac) {
        this.a = rac;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uac) && Intrinsics.areEqual((Object) this.a, (Object) ((uac) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QualityParc(value=" + this.a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        rac rac = this.a;
        parcel.writeString(rac.a.a);
        parcel.writeInt(rac.b);
        parcel.writeInt(rac.c);
        parcel.writeInt(rac.d);
        parcel.writeLong(rac.e);
        parcel.writeByte(rac.f ? (byte) 1 : 0);
    }
}
