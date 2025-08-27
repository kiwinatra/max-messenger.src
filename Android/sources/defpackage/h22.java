package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: h22  reason: default package */
public final class h22 extends t77 {
    public static final Parcelable.Creator<h22> CREATOR = new s6(28);
    public final String b;
    public final int c;
    public final int o;
    public final long v;
    public final long w;
    public final t77[] x;

    public h22(String str, int i, int i2, long j, long j2, t77[] t77Arr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.o = i2;
        this.v = j;
        this.w = j2;
        this.x = t77Arr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h22.class != obj.getClass()) {
            return false;
        }
        h22 h22 = (h22) obj;
        return this.c == h22.c && this.o == h22.o && this.v == h22.v && this.w == h22.w && t0g.a(this.b, h22.b) && Arrays.equals(this.x, h22.x);
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
        t77[] t77Arr = this.x;
        parcel.writeInt(t77Arr.length);
        for (t77 writeParcelable : t77Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public h22(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = t0g.a;
        this.b = readString;
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        this.v = parcel.readLong();
        this.w = parcel.readLong();
        int readInt = parcel.readInt();
        this.x = new t77[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.x[i2] = (t77) parcel.readParcelable(t77.class.getClassLoader());
        }
    }
}
