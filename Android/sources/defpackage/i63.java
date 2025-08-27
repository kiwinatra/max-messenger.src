package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: i63  reason: default package */
public final class i63 extends t77 {
    public static final Parcelable.Creator<i63> CREATOR = new j22(8);
    public final String b;
    public final String c;
    public final String o;

    public i63(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i63.class != obj.getClass()) {
            return false;
        }
        i63 i63 = (i63) obj;
        return t0g.a(this.c, i63.c) && t0g.a(this.b, i63.b) && t0g.a(this.o, i63.o);
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
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.a;
        int f = g63.f(25, str);
        String str2 = this.b;
        int f2 = g63.f(f, str2);
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(g63.f(f2, str3));
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.o);
    }

    public i63(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = t0g.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readString();
    }
}
