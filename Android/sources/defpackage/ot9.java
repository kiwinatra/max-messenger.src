package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ot9  reason: default package */
public final class ot9 implements qp9 {
    public static final Parcelable.Creator<ot9> CREATOR = new ia9(11);
    public final long a;
    public final long b;
    public final long c;
    public final long o;
    public final long v;

    public ot9(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = j4;
        this.v = j5;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ot9.class != obj.getClass()) {
            return false;
        }
        ot9 ot9 = (ot9) obj;
        return this.a == ot9.a && this.b == ot9.b && this.c == ot9.c && this.o == ot9.o && this.v == ot9.v;
    }

    public final int hashCode() {
        int y = kr7.y(this.b);
        int y2 = kr7.y(this.c);
        int y3 = kr7.y(this.o);
        return kr7.y(this.v) + ((y3 + ((y2 + ((y + ((kr7.y(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.o + ", videoSize=" + this.v;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        parcel.writeLong(this.v);
    }

    public ot9(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.v = parcel.readLong();
    }
}
