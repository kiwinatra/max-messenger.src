package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: hac  reason: default package */
public final class hac implements Parcelable {
    public static final Parcelable.Creator<hac> CREATOR = new w0b(24);
    public final long a;
    public final String b;
    public final long c;
    public final Long o;
    public final long v;
    public final String w;
    public final long x;
    public final zk2 y;

    public hac(long j, String str, long j2, Long l, long j3, String str2, long j4, zk2 zk2) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.o = l;
        this.v = j3;
        this.w = str2;
        this.x = j4;
        this.y = zk2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hac)) {
            return false;
        }
        hac hac = (hac) obj;
        return this.a == hac.a && Intrinsics.areEqual((Object) this.b, (Object) hac.b) && this.c == hac.c && Intrinsics.areEqual((Object) this.o, (Object) hac.o) && this.v == hac.v && Intrinsics.areEqual((Object) this.w, (Object) hac.w) && this.x == hac.x && this.y == hac.y;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int i2 = wzf.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Long l = this.o;
        int i3 = wzf.i((i2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.v);
        String str2 = this.w;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.y.hashCode() + wzf.i((i3 + i) * 31, 31, this.x);
    }

    public final String toString() {
        return "PushInfo(pushId=" + this.a + ", eventKey=" + this.b + ", chatServerId=" + this.c + ", chatId=" + this.o + ", messageServerId=" + this.v + ", pushType=" + this.w + ", createdTime=" + this.x + ", chatType=" + this.y + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        Long l = this.o;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.v);
        parcel.writeString(this.w);
        parcel.writeLong(this.x);
        this.y.writeToParcel(parcel, i);
    }
}
