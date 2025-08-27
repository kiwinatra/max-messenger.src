package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: tu9  reason: default package */
public final class tu9 implements qp9 {
    public static final Parcelable.Creator<tu9> CREATOR = new ia9(13);
    public final long a;
    public final long b;
    public final long c;

    public tu9(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu9)) {
            return false;
        }
        tu9 tu9 = (tu9) obj;
        return this.a == tu9.a && this.b == tu9.b && this.c == tu9.c;
    }

    public final int hashCode() {
        int y = kr7.y(this.b);
        return kr7.y(this.c) + ((y + ((kr7.y(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }

    public tu9(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
    }
}
