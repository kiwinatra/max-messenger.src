package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: wm  reason: default package */
public final class wm extends u77 {
    public static final Parcelable.Creator<wm> CREATOR = new s6(4);
    public final String b;
    public final String c;
    public final int o;
    public final byte[] v;

    public wm(String str, String str2, int i, byte[] bArr) {
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
        if (obj == null || wm.class != obj.getClass()) {
            return false;
        }
        wm wmVar = (wm) obj;
        return this.o == wmVar.o && v0g.a(this.b, wmVar.b) && v0g.a(this.c, wmVar.c) && Arrays.equals(this.v, wmVar.v);
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

    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }

    public final void u(ss8 ss8) {
        ss8.b(this.o, this.v);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeByteArray(this.v);
    }

    public wm(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = v0g.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.v = parcel.createByteArray();
    }
}
