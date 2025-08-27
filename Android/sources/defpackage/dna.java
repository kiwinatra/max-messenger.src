package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;

/* renamed from: dna  reason: default package */
public final class dna implements Parcelable, Serializable {
    public static final Parcelable.Creator<dna> CREATOR = new ia9(18);
    public final List X;
    public final List Y;
    public final List Z;
    public final String a;
    public final long b;
    public final int c;
    public final String o;
    public final int v;
    public final long w;
    public final String x;
    public final String y;
    public final List z;

    public dna(String str, int i, String str2, int i2, long j, String str3, List list, List list2, List list3, List list4) {
        this.a = str;
        this.c = i;
        this.o = str2;
        this.v = i2;
        this.w = j;
        this.x = str3;
        this.y = null;
        this.z = list;
        this.X = list2;
        this.Y = list3;
        this.Z = list4;
        this.b = System.currentTimeMillis();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{collector: ");
        sb.append(this.a);
        sb.append(", timetamp: ");
        sb.append(this.b);
        sb.append(", type: ");
        sb.append(this.c);
        sb.append(", operation: ");
        sb.append(this.o);
        sb.append(", time: ");
        sb.append(this.w);
        String str = this.x;
        if (str != null) {
            sb.append(", uid: ");
            sb.append(str);
        }
        String str2 = this.y;
        if (str2 != null) {
            sb.append(", network: ");
            sb.append(str2);
        }
        int i = this.v;
        if (i != 1) {
            sb.append(", count: ");
            sb.append(i);
            sb.append(", ");
        }
        List list = this.X;
        if (!list.isEmpty()) {
            sb.append(", data: [");
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append((String) list.get(i2));
            }
            sb.append("]");
        }
        List list2 = this.z;
        if (!list2.isEmpty()) {
            sb.append(", groups: [");
            for (int i3 = 0; i3 < list2.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append((String) list2.get(i3));
            }
            sb.append("]");
        }
        List list3 = this.Y;
        if (!list3.isEmpty()) {
            sb.append(", custom: {");
            for (int i4 = 0; i4 < list3.size(); i4++) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append((String) list3.get(i4));
                sb.append(": ");
                sb.append((String) this.Z.get(i4));
            }
            sb.append("}");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.o);
        parcel.writeInt(this.v);
        parcel.writeLong(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeStringList(this.z);
        parcel.writeStringList(this.X);
        parcel.writeStringList(this.Y);
        parcel.writeStringList(this.Z);
    }

    public dna(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.o = parcel.readString();
        this.v = parcel.readInt();
        this.w = parcel.readLong();
        this.x = parcel.readString();
        this.y = parcel.readString();
        this.z = parcel.createStringArrayList();
        this.X = parcel.createStringArrayList();
        this.Y = parcel.createStringArrayList();
        this.Z = parcel.createStringArrayList();
    }
}
