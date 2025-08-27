package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: k22  reason: default package */
public final class k22 extends t77 {
    public static final Parcelable.Creator<k22> CREATOR = new j22(0);
    public final String b;
    public final boolean c;
    public final boolean o;
    public final String[] v;
    public final t77[] w;

    public k22(String str, boolean z, boolean z2, String[] strArr, t77[] t77Arr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.o = z2;
        this.v = strArr;
        this.w = t77Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k22.class != obj.getClass()) {
            return false;
        }
        k22 k22 = (k22) obj;
        return this.c == k22.c && this.o == k22.o && t0g.a(this.b, k22.b) && Arrays.equals(this.v, k22.v) && Arrays.equals(this.w, k22.w);
    }

    public final int hashCode() {
        int i = (((true + (this.c ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.o ? (byte) 1 : 0);
        parcel.writeStringArray(this.v);
        t77[] t77Arr = this.w;
        parcel.writeInt(t77Arr.length);
        for (t77 writeParcelable : t77Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public k22(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = t0g.a;
        this.b = readString;
        this.c = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
        this.v = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.w = new t77[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.w[i2] = (t77) parcel.readParcelable(t77.class.getClassLoader());
        }
    }
}
