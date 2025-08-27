package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n84  reason: default package */
public final class n84 implements Parcelable {
    public static final Parcelable.Creator<n84> CREATOR = new j22(24);
    public final long a;
    public final int b;
    public final int c;
    public final int o;
    public final String v;

    public n84(int i, int i2, int i3, long j, String str) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.v = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n84)) {
            return false;
        }
        n84 n84 = (n84) obj;
        return this.a == n84.a && this.b == n84.b && this.c == n84.c && this.o == n84.o && Intrinsics.areEqual((Object) this.v, (Object) n84.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + rae.h(this.o, rae.h(this.c, rae.h(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Day(id=");
        sb.append(this.a);
        sb.append(", day=");
        sb.append(this.b);
        sb.append(", month=");
        sb.append(this.c);
        sb.append(", year=");
        sb.append(this.o);
        sb.append(", string=");
        return wj6.n(sb, this.v, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeString(this.v);
    }
}
