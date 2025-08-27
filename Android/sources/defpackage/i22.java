package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: i22  reason: default package */
public final class i22 extends u77 {
    public static final Parcelable.Creator<i22> CREATOR = new s6(29);
    public final String b;
    public final int c;
    public final int o;
    public final long v;
    public final long w;
    public final u77[] x;

    public i22(String str, int i, int i2, long j, long j2, u77[] u77Arr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.o = i2;
        this.v = j;
        this.w = j2;
        this.x = u77Arr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i22.class != obj.getClass()) {
            return false;
        }
        i22 i22 = (i22) obj;
        return this.c == i22.c && this.o == i22.o && this.v == i22.v && this.w == i22.w && v0g.a(this.b, i22.b) && Arrays.equals(this.x, i22.x);
    }

    public final int hashCode() {
        int i = (((((((527 + this.c) * 31) + this.o) * 31) + ((int) this.v)) * 31) + ((int) this.w)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeLong(this.v);
        parcel.writeLong(this.w);
        u77[] u77Arr = this.x;
        parcel.writeInt(u77Arr.length);
        for (u77 writeParcelable : u77Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public i22(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = v0g.a;
        this.b = readString;
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        this.v = parcel.readLong();
        this.w = parcel.readLong();
        int readInt = parcel.readInt();
        this.x = new u77[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.x[i2] = (u77) parcel.readParcelable(u77.class.getClassLoader());
        }
    }
}
