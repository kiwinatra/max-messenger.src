package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: yub  reason: default package */
public final class yub extends u77 {
    public static final Parcelable.Creator<yub> CREATOR = new w0b(17);
    public final String b;
    public final byte[] c;

    public yub(byte[] bArr, String str) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yub.class != obj.getClass()) {
            return false;
        }
        yub yub = (yub) obj;
        return v0g.a(this.b, yub.b) && Arrays.equals(this.c, yub.c);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.a + ": owner=" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public yub(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = v0g.a;
        this.b = readString;
        this.c = parcel.createByteArray();
    }
}
