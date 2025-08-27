package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: l22  reason: default package */
public final class l22 extends u77 {
    public static final Parcelable.Creator<l22> CREATOR = new j22(1);
    public final String b;
    public final boolean c;
    public final boolean o;
    public final String[] v;
    public final u77[] w;

    public l22(String str, boolean z, boolean z2, String[] strArr, u77[] u77Arr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.o = z2;
        this.v = strArr;
        this.w = u77Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l22.class != obj.getClass()) {
            return false;
        }
        l22 l22 = (l22) obj;
        return this.c == l22.c && this.o == l22.o && v0g.a(this.b, l22.b) && Arrays.equals(this.v, l22.v) && Arrays.equals(this.w, l22.w);
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
        u77[] u77Arr = this.w;
        parcel.writeInt(u77Arr.length);
        for (u77 writeParcelable : u77Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public l22(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = v0g.a;
        this.b = readString;
        this.c = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
        this.v = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.w = new u77[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.w[i2] = (u77) parcel.readParcelable(u77.class.getClassLoader());
        }
    }
}
