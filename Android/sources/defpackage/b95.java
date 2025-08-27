package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: b95  reason: default package */
public final class b95 implements pp9 {
    public static final Parcelable.Creator<b95> CREATOR = new uv4(3);
    public static final ca6 x;
    public static final ca6 y;
    public final String a;
    public final String b;
    public final long c;
    public final long o;
    public final byte[] v;
    public int w;

    static {
        aa6 aa6 = new aa6();
        aa6.k = "application/id3";
        x = aa6.a();
        aa6 aa62 = new aa6();
        aa62.k = "application/x-scte35";
        y = aa62.a();
    }

    public b95(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.o = j2;
        this.v = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b95.class != obj.getClass()) {
            return false;
        }
        b95 b95 = (b95) obj;
        return this.c == b95.c && this.o == b95.o && t0g.a(this.a, b95.a) && t0g.a(this.b, b95.b) && Arrays.equals(this.v, b95.v);
    }

    public final ca6 h() {
        String str = this.a;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c2 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return y;
            case 1:
            case 2:
                return x;
            default:
                return null;
        }
    }

    public final int hashCode() {
        if (this.w == 0) {
            int i = 0;
            String str = this.a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.c;
            long j2 = this.o;
            this.w = Arrays.hashCode(this.v) + ((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.w;
    }

    public final byte[] n() {
        if (h() != null) {
            return this.v;
        }
        return null;
    }

    public final String toString() {
        String str = this.a;
        int f = g63.f(79, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(g63.f(f, str2));
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(this.o);
        sb.append(", durationMs=");
        sb.append(this.c);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        parcel.writeByteArray(this.v);
    }

    public b95(Parcel parcel) {
        String readString = parcel.readString();
        int i = t0g.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.v = parcel.createByteArray();
    }
}
