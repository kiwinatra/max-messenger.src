package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w39  reason: default package */
public final class w39 implements Parcelable {
    public static final Parcelable.Creator<w39> CREATOR = new f27(29);
    public final long a;
    public final ij2 b;
    public final boolean c;
    public final Integer o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w39(long j, ij2 ij2, Integer num, int i) {
        this(j, ij2, true, (i & 8) != 0 ? null : num);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w39)) {
            return false;
        }
        w39 w39 = (w39) obj;
        return this.a == w39.a && this.b == w39.b && this.c == w39.c && Intrinsics.areEqual((Object) this.o, (Object) w39.o);
    }

    public final int hashCode() {
        int e = g63.e((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c);
        Integer num = this.o;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "MembersListArgs(chatId=" + this.a + ", chatMemberType=" + this.b + ", isLongClickEnabled=" + this.c + ", memberLimit=" + this.o + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.writeLong(this.a);
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
        Integer num = this.o;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public w39(long j, ij2 ij2, boolean z, Integer num) {
        this.a = j;
        this.b = ij2;
        this.c = z;
        this.o = num;
    }
}
