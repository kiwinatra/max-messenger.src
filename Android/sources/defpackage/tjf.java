package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: tjf  reason: default package */
public final class tjf extends xge {
    public static final Parcelable.Creator<tjf> CREATOR = new nje(11);
    public final long a;
    public final long b;

    public tjf(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long a(long j, g1g g1g) {
        long v = (long) g1g.v();
        if ((128 & v) != 0) {
            return 8589934591L & ((((v & 1) << 32) | g1g.w()) + j);
        }
        return -9223372036854775807L;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
