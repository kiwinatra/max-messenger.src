package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k48  reason: default package */
public final class k48 implements Parcelable {
    public static final Parcelable.Creator<k48> CREATOR = new f27(15);
    public final long X;
    public final Uri Y;
    public final j48 Z;
    public final long a;
    public final Uri b;
    public final String c;
    public final int o;
    public final long v;
    public final Integer w;
    public final Long x;
    public final int y;
    public final int z;

    public k48(long j, Uri uri, String str, int i, long j2, Integer num, Long l, int i2, int i3, long j3, Uri uri2) {
        this.a = j;
        this.b = uri;
        this.c = str;
        this.o = i;
        this.v = j2;
        this.w = num;
        this.x = l;
        this.y = i2;
        this.z = i3;
        this.X = j3;
        this.Y = uri2;
        j48.a.getClass();
        this.Z = ejd.c(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k48)) {
            return false;
        }
        k48 k48 = (k48) obj;
        return this.a == k48.a && Intrinsics.areEqual((Object) this.b, (Object) k48.b) && Intrinsics.areEqual((Object) this.c, (Object) k48.c) && this.o == k48.o && this.v == k48.v && Intrinsics.areEqual((Object) this.w, (Object) k48.w) && Intrinsics.areEqual((Object) this.x, (Object) k48.x) && this.y == k48.y && this.z == k48.z && this.X == k48.X && Intrinsics.areEqual((Object) this.Y, (Object) k48.Y);
    }

    public final int hashCode() {
        int i = wzf.i(rae.h(this.o, g63.d((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31), 31, this.v);
        int i2 = 0;
        Integer num = this.w;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.x;
        if (l != null) {
            i2 = l.hashCode();
        }
        return this.Y.hashCode() + wzf.i(rae.h(this.z, rae.h(this.y, (hashCode + i2) * 31, 31), 31), 31, this.X);
    }

    public final String toString() {
        return "LocalMediaItem(id=" + this.a + ", uri=" + this.b + ", mimeType=" + this.c + ", albumId=" + this.o + ", dateTaken=" + this.v + ", orientation=" + this.w + ", duration=" + this.x + ", width=" + this.y + ", height=" + this.z + ", size=" + this.X + ", thumbnailUri=" + this.Y + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeLong(this.v);
        Integer num = this.w;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.x;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeLong(this.X);
        parcel.writeParcelable(this.Y, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k48(long j, Uri uri, String str, int i, long j2, Integer num, Long l, Uri uri2, int i2) {
        this(j, uri, str, i, j2, num, (i2 & 64) != 0 ? null : l, 0, 0, 0, uri2);
    }
}
