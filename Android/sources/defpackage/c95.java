package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: c95  reason: default package */
public final class c95 implements qp9 {
    public static final Parcelable.Creator<c95> CREATOR = new uv4(4);
    public static final ea6 x;
    public static final ea6 y;
    public final String a;
    public final String b;
    public final long c;
    public final long o;
    public final byte[] v;
    public int w;

    static {
        ba6 ba6 = new ba6();
        ba6.m = vq9.l("application/id3");
        x = ba6.a();
        ba6 ba62 = new ba6();
        ba62.m = vq9.l("application/x-scte35");
        y = ba62.a();
    }

    public c95(String str, String str2, long j, long j2, byte[] bArr) {
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
        if (obj == null || c95.class != obj.getClass()) {
            return false;
        }
        c95 c95 = (c95) obj;
        return this.c == c95.c && this.o == c95.o && v0g.a(this.a, c95.a) && v0g.a(this.b, c95.b) && Arrays.equals(this.v, c95.v);
    }

    public final ea6 h() {
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
        return "EMSG: scheme=" + this.a + ", id=" + this.o + ", durationMs=" + this.c + ", value=" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        parcel.writeByteArray(this.v);
    }

    public c95(Parcel parcel) {
        String readString = parcel.readString();
        int i = v0g.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.v = parcel.createByteArray();
    }
}
