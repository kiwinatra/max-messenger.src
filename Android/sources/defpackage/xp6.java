package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: xp6  reason: default package */
public final class xp6 extends t77 {
    public static final Parcelable.Creator<xp6> CREATOR = new uv4(25);
    public final String b;
    public final String c;
    public final String o;
    public final byte[] v;

    public xp6(String str, byte[] bArr, String str2, String str3) {
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
        if (obj == null || xp6.class != obj.getClass()) {
            return false;
        }
        xp6 xp6 = (xp6) obj;
        return t0g.a(this.b, xp6.b) && t0g.a(this.c, xp6.c) && t0g.a(this.o, xp6.o) && Arrays.equals(this.v, xp6.v);
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
        String str = this.a;
        int f = g63.f(36, str);
        String str2 = this.b;
        int f2 = g63.f(f, str2);
        String str3 = this.c;
        int f3 = g63.f(f2, str3);
        String str4 = this.o;
        StringBuilder sb = new StringBuilder(g63.f(f3, str4));
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        return rae.q(sb, str3, ", description=", str4);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        parcel.writeByteArray(this.v);
    }

    public xp6(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = t0g.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readString();
        this.v = parcel.createByteArray();
    }
}
