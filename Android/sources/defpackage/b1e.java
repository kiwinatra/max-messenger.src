package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b1e  reason: default package */
public final class b1e extends f1e {
    public static final Parcelable.Creator<b1e> CREATOR = new g9d(9);
    public final ngf a;
    public final Integer b;

    public b1e(ngf ngf, Integer num) {
        this.a = ngf;
        this.b = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1e)) {
            return false;
        }
        b1e b1e = (b1e) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) b1e.a) && Intrinsics.areEqual((Object) this.b, (Object) b1e.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Property(text=" + this.a + ", icon=" + this.b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.writeParcelable(this.a, i);
        Integer num = this.b;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }
}
