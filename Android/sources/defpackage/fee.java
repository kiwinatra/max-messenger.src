package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: fee  reason: default package */
public final class fee implements Parcelable {
    public static final Parcelable.Creator<fee> CREATOR = new g9d(16);
    public static final oj4 o = new oj4(27);
    public final long a;
    public final long b;
    public final int c;

    public fee(int i, long j, long j2) {
        n79.g(j < j2);
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
        if (obj == null || fee.class != obj.getClass()) {
            return false;
        }
        fee fee = (fee) obj;
        return this.a == fee.a && this.b == fee.b && this.c == fee.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        int i = v0g.a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.a + ", endTimeMs=" + this.b + ", speedDivisor=" + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}
