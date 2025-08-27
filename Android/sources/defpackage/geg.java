package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: geg  reason: default package */
public class geg implements qp9 {
    public static final Parcelable.Creator<geg> CREATOR = new nje(25);
    public final String a;
    public final String b;

    public geg(String str, String str2) {
        this.a = o54.Q(str);
        this.b = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        geg geg = (geg) obj;
        return this.a.equals(geg.a) && this.b.equals(geg.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + g63.d(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }

    public final void u(ss8 ss8) {
        String str = this.a;
        str.getClass();
        String str2 = this.b;
        char c = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ss8.c = str2;
                return;
            case 1:
                ss8.a = str2;
                return;
            case 2:
                ss8.g = str2;
                return;
            case 3:
                ss8.d = str2;
                return;
            case 4:
                ss8.b = str2;
                return;
            default:
                return;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public geg(Parcel parcel) {
        String readString = parcel.readString();
        int i = v0g.a;
        this.a = readString;
        this.b = parcel.readString();
    }
}
