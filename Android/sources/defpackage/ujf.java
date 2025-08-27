package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ujf  reason: default package */
public final class ujf extends yge {
    public static final Parcelable.Creator<ujf> CREATOR = new nje(12);
    public final long a;
    public final long b;

    public ujf(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long a(long j, l8b l8b) {
        long u = (long) l8b.u();
        if ((128 & u) != 0) {
            return 8589934591L & ((((u & 1) << 32) | l8b.w()) + j);
        }
        return -9223372036854775807L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.a);
        sb.append(", playbackPositionUs= ");
        return wj6.m(sb, this.b, " }");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
