package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c84  reason: default package */
public final class c84 implements Parcelable {
    public static final Parcelable.Creator<c84> CREATOR = new j22(22);
    public final n84 a;
    public final ejf b;
    public final ejf c;

    public c84(n84 n84, ejf ejf, ejf ejf2) {
        this.a = n84;
        this.b = ejf;
        this.c = ejf2;
    }

    public static c84 a(c84 c84, n84 n84, ejf ejf, ejf ejf2, int i) {
        if ((i & 1) != 0) {
            n84 = c84.a;
        }
        if ((i & 2) != 0) {
            ejf = c84.b;
        }
        if ((i & 4) != 0) {
            ejf2 = c84.c;
        }
        return new c84(n84, ejf, ejf2);
    }

    public final long b() {
        Calendar instance = Calendar.getInstance();
        n84 n84 = this.a;
        instance.set(1, n84.o);
        instance.set(2, n84.c);
        instance.set(5, n84.b);
        instance.set(11, this.b.a);
        instance.set(12, this.c.a);
        instance.set(13, 0);
        instance.set(14, 0);
        z68.c("DateTime", instance.getTime().toString(), new Object[0]);
        return instance.getTimeInMillis();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c84)) {
            return false;
        }
        c84 c84 = (c84) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) c84.a) && Intrinsics.areEqual((Object) this.b, (Object) c84.b) && Intrinsics.areEqual((Object) this.c, (Object) c84.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + rae.h(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DateTime(day=" + this.a + ", hour=" + this.b + ", minutes=" + this.c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b.a);
        parcel.writeInt(this.c.a);
    }
}
