package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: vkb  reason: default package */
public final class vkb implements pp9 {
    public static final Parcelable.Creator<vkb> CREATOR = new w0b(8);
    public final int a;
    public final String b;
    public final String c;
    public final int o;
    public final int v;
    public final int w;
    public final int x;
    public final byte[] y;

    public vkb(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = i2;
        this.v = i3;
        this.w = i4;
        this.x = i5;
        this.y = bArr;
    }

    public static vkb a(g1g g1g) {
        int h = g1g.h();
        String t = g1g.t(g1g.h(), x22.a);
        String t2 = g1g.t(g1g.h(), x22.c);
        int h2 = g1g.h();
        int h3 = g1g.h();
        int h4 = g1g.h();
        int h5 = g1g.h();
        int h6 = g1g.h();
        byte[] bArr = new byte[h6];
        g1g.g(0, bArr, h6);
        return new vkb(h, t, t2, h2, h3, h4, h5, bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vkb.class != obj.getClass()) {
            return false;
        }
        vkb vkb = (vkb) obj;
        return this.a == vkb.a && this.b.equals(vkb.b) && this.c.equals(vkb.c) && this.o == vkb.o && this.v == vkb.v && this.w == vkb.w && this.x == vkb.x && Arrays.equals(this.y, vkb.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.y) + ((((((((g63.d(g63.d((527 + this.a) * 31, 31, this.b), 31, this.c) + this.o) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31);
    }

    public final void o(rs8 rs8) {
        rs8.a(this.a, this.y);
    }

    public final String toString() {
        String str = this.b;
        int f = g63.f(32, str);
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(g63.f(f, str2));
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
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

    public vkb(Parcel parcel) {
        this.a = parcel.readInt();
        String readString = parcel.readString();
        int i = t0g.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.createByteArray();
    }
}
