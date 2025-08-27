package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: wkb  reason: default package */
public final class wkb implements qp9 {
    public static final Parcelable.Creator<wkb> CREATOR = new w0b(9);
    public final int a;
    public final String b;
    public final String c;
    public final int o;
    public final int v;
    public final int w;
    public final int x;
    public final byte[] y;

    public wkb(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = i2;
        this.v = i3;
        this.w = i4;
        this.x = i5;
        this.y = bArr;
    }

    public static wkb a(l8b l8b) {
        int g = l8b.g();
        String l = vq9.l(l8b.s(l8b.g(), x22.a));
        String s = l8b.s(l8b.g(), x22.c);
        int g2 = l8b.g();
        int g3 = l8b.g();
        int g4 = l8b.g();
        int g5 = l8b.g();
        int g6 = l8b.g();
        byte[] bArr = new byte[g6];
        l8b.e(0, bArr, g6);
        return new wkb(g, l, s, g2, g3, g4, g5, bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wkb.class != obj.getClass()) {
            return false;
        }
        wkb wkb = (wkb) obj;
        return this.a == wkb.a && this.b.equals(wkb.b) && this.c.equals(wkb.c) && this.o == wkb.o && this.v == wkb.v && this.w == wkb.w && this.x == wkb.x && Arrays.equals(this.y, wkb.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.y) + ((((((((g63.d(g63.d((527 + this.a) * 31, 31, this.b), 31, this.c) + this.o) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }

    public final void u(ss8 ss8) {
        ss8.b(this.a, this.y);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeByteArray(this.y);
    }

    public wkb(Parcel parcel) {
        this.a = parcel.readInt();
        String readString = parcel.readString();
        int i = v0g.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.createByteArray();
    }
}
