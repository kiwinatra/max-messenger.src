package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lje  reason: default package */
public final class lje implements pje {
    public static final Parcelable.Creator<lje> CREATOR = new g9d(28);
    public final long a;
    public final long b;
    public final boolean c;

    public lje(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lje)) {
            return false;
        }
        lje lje = (lje) obj;
        return this.a == lje.a && this.b == lje.b && this.c == lje.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + wzf.i(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatInternal(chatId=");
        sb.append(this.a);
        sb.append(", chatServerId=");
        sb.append(this.b);
        sb.append(", isJoin=");
        return tr1.m(sb, this.c, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
