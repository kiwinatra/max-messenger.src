package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: h27  reason: default package */
public final class h27 implements Parcelable {
    public static final Parcelable.Creator<h27> CREATOR = new f27(1);
    public final int a;
    public final int b;
    public final String c;
    public final String o;
    public final String v;
    public final String w;

    public h27(int i, int i2, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.o = str2;
        this.v = str3;
        this.w = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h27.class != obj.getClass()) {
            return false;
        }
        h27 h27 = (h27) obj;
        return this.a == h27.a && this.b == h27.b && TextUtils.equals(this.c, h27.c) && TextUtils.equals(this.o, h27.o) && TextUtils.equals(this.v, h27.v) && TextUtils.equals(this.w, h27.w);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        int i2 = 0;
        String str = this.c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.o;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.v;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.w;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
    }

    public h27(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.o = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
    }
}
