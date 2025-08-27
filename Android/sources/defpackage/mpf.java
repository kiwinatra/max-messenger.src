package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mpf  reason: default package */
public final class mpf implements Parcelable {
    public static final Parcelable.Creator<mpf> CREATOR = new nje(14);
    public static final mpf X = new mpf((String) null, (String) null, (String) null, -1, -1, 0, 0, 0, 0);
    public final String a;
    public final String b;
    public final String c;
    public final int o;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public mpf(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.o = i;
        this.v = i2;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        this.z = i6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mpf.class != obj.getClass()) {
            return false;
        }
        mpf mpf = (mpf) obj;
        if (this.o != mpf.o || this.v != mpf.v || this.w != mpf.w || this.x != mpf.x || this.y != mpf.y || this.z != mpf.z) {
            return false;
        }
        String str = mpf.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = mpf.b;
        String str4 = this.b;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = mpf.c;
        String str6 = this.c;
        return str6 != null ? str6.equals(str5) : str5 == null;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((((((((((hashCode2 + i) * 31) + this.o) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Track{id='");
        sb.append(this.a);
        sb.append("', label='");
        sb.append(this.b);
        sb.append("', language='");
        sb.append(this.c);
        sb.append("', width=");
        sb.append(this.o);
        sb.append(", height=");
        sb.append(this.v);
        sb.append(", bitrate=");
        sb.append(this.w);
        sb.append(", rendererIndex=");
        sb.append(this.x);
        sb.append(", groupIndex=");
        sb.append(this.y);
        sb.append(", trackIndex=");
        return tr1.k(sb, this.z, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
    }

    public mpf(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readInt();
    }
}
