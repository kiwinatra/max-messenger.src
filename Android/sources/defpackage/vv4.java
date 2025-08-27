package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: vv4  reason: default package */
public final class vv4 implements Parcelable {
    public static final Parcelable.Creator<vv4> CREATOR = new j22(29);
    public int a;
    public final UUID b;
    public final String c;
    public final String o;
    public final byte[] v;

    public vv4(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        str2.getClass();
        this.o = str2;
        this.v = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = ww0.a;
        UUID uuid3 = this.b;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vv4)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        vv4 vv4 = (vv4) obj;
        return t0g.a(this.c, vv4.c) && t0g.a(this.o, vv4.o) && t0g.a(this.b, vv4.b) && Arrays.equals(this.v, vv4.v);
    }

    public final int hashCode() {
        if (this.a == 0) {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            this.a = Arrays.hashCode(this.v) + g63.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.o);
        }
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        parcel.writeByteArray(this.v);
    }

    public vv4(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String readString = parcel.readString();
        int i = t0g.a;
        this.o = readString;
        this.v = parcel.createByteArray();
    }
}
