package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: yi7  reason: default package */
public final class yi7 extends u77 {
    public static final Parcelable.Creator<yi7> CREATOR = new f27(8);
    public final String b;
    public final String c;
    public final String o;

    public yi7(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yi7.class != obj.getClass()) {
            return false;
        }
        yi7 yi7 = (yi7) obj;
        return v0g.a(this.c, yi7.c) && v0g.a(this.b, yi7.b) && v0g.a(this.o, yi7.o);
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
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.o);
    }

    public yi7(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = v0g.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readString();
    }
}
