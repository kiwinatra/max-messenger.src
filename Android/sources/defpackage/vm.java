package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: vm  reason: default package */
public final class vm extends t77 {
    public static final Parcelable.Creator<vm> CREATOR = new s6(3);
    public final String b;
    public final String c;
    public final int o;
    public final byte[] v;

    public vm(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.o = i;
        this.v = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vm.class != obj.getClass()) {
            return false;
        }
        vm vmVar = (vm) obj;
        return this.o == vmVar.o && t0g.a(this.b, vmVar.b) && t0g.a(this.c, vmVar.c) && Arrays.equals(this.v, vmVar.v);
    }

    public final int hashCode() {
        int i = (527 + this.o) * 31;
        int i2 = 0;
        String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Arrays.hashCode(this.v) + ((hashCode + i2) * 31);
    }

    public final void o(rs8 rs8) {
        rs8.a(this.o, this.v);
    }

    public final String toString() {
        String str = this.a;
        int f = g63.f(25, str);
        String str2 = this.b;
        int f2 = g63.f(f, str2);
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(g63.f(f2, str3));
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeByteArray(this.v);
    }

    public vm(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = t0g.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.v = parcel.createByteArray();
    }
}
