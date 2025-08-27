package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: xub  reason: default package */
public final class xub extends t77 {
    public static final Parcelable.Creator<xub> CREATOR = new w0b(16);
    public final String b;
    public final byte[] c;

    public xub(byte[] bArr, String str) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xub.class != obj.getClass()) {
            return false;
        }
        xub xub = (xub) obj;
        return t0g.a(this.b, xub.b) && Arrays.equals(this.c, xub.c);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        int f = g63.f(8, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(g63.f(f, str2));
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public xub(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = t0g.a;
        this.b = readString;
        this.c = parcel.createByteArray();
    }
}
