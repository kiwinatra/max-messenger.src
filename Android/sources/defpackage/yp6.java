package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: yp6  reason: default package */
public final class yp6 extends u77 {
    public static final Parcelable.Creator<yp6> CREATOR = new uv4(26);
    public final String b;
    public final String c;
    public final String o;
    public final byte[] v;

    public yp6(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.v = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yp6.class != obj.getClass()) {
            return false;
        }
        yp6 yp6 = (yp6) obj;
        return v0g.a(this.b, yp6.b) && v0g.a(this.c, yp6.c) && v0g.a(this.o, yp6.o) && Arrays.equals(this.v, yp6.v);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.o;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return Arrays.hashCode(this.v) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        parcel.writeByteArray(this.v);
    }

    public yp6(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = v0g.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readString();
        this.v = parcel.createByteArray();
    }
}
