package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: yi8  reason: default package */
public final class yi8 implements qp9 {
    public static final Parcelable.Creator<yi8> CREATOR = new f27(20);
    public final String a;
    public final byte[] b;
    public final int c;
    public final int o;

    public yi8(byte[] bArr, int i, int i2, String str) {
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
        if (obj == null || yi8.class != obj.getClass()) {
            return false;
        }
        yi8 yi8 = (yi8) obj;
        return this.a.equals(yi8.a) && Arrays.equals(this.b, yi8.b) && this.c == yi8.c && this.o == yi8.o;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + g63.d(527, 31, this.a)) * 31) + this.c) * 31) + this.o;
    }

    public final String toString() {
        String str;
        byte[] bArr = this.b;
        int i = this.o;
        if (i == 1) {
            str = v0g.q(bArr);
        } else if (i == 23) {
            str = String.valueOf(Float.intBitsToFloat(cvg.v(bArr)));
        } else if (i != 67) {
            int i2 = v0g.a;
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (int i3 = 0; i3 < bArr.length; i3++) {
                sb.append(Character.forDigit((bArr[i3] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i3] & 15, 16));
            }
            str = sb.toString();
        } else {
            str = String.valueOf(cvg.v(bArr));
        }
        return rae.q(new StringBuilder("mdta: key="), this.a, ", value=", str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
    }

    public yi8(Parcel parcel) {
        String readString = parcel.readString();
        int i = v0g.a;
        this.a = readString;
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
    }
}
