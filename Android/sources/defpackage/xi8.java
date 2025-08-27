package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: xi8  reason: default package */
public final class xi8 implements pp9 {
    public static final Parcelable.Creator<xi8> CREATOR = new f27(19);
    public final String a;
    public final byte[] b;
    public final int c;
    public final int o;

    public xi8(byte[] bArr, int i, int i2, String str) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.o = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xi8.class != obj.getClass()) {
            return false;
        }
        xi8 xi8 = (xi8) obj;
        return this.a.equals(xi8.a) && Arrays.equals(this.b, xi8.b) && this.c == xi8.c && this.o == xi8.o;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + g63.d(527, 31, this.a)) * 31) + this.c) * 31) + this.o;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
    }

    public xi8(Parcel parcel) {
        String readString = parcel.readString();
        int i = t0g.a;
        this.a = readString;
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
    }
}
