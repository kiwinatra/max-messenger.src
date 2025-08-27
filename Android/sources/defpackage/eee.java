package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: eee  reason: default package */
public final class eee implements Parcelable {
    public static final Parcelable.Creator<eee> CREATOR = new g9d(15);
    public final long a;
    public final long b;
    public final int c;

    public eee(int i, long j, long j2) {
        y64.g(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eee.class != obj.getClass()) {
            return false;
        }
        eee eee = (eee) obj;
        return this.a == eee.a && this.b == eee.b && this.c == eee.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        int i = t0g.a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.a + ", endTimeMs=" + this.b + ", speedDivisor=" + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}
