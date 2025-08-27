package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x58  reason: default package */
public final class x58 implements Parcelable {
    public static final Parcelable.Creator<x58> CREATOR = new f27(16);
    public final w58 a;

    public x58(w58 w58) {
        this.a = w58;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        w58 w58 = this.a;
        parcel.writeByte(w58 == null ? (byte) 1 : 0);
        if (w58 != null) {
            parcel.writeByte(w58.a ? (byte) 1 : 0);
            parcel.writeByte(w58.b ? (byte) 1 : 0);
            parcel.writeInt(tr1.y(w58.c));
            parcel.writeInt(tr1.y(w58.d));
            parcel.writeInt(w58.e.ordinal());
            parcel.writeLong(w58.h);
            parcel.writeByte(w58.i ? (byte) 1 : 0);
            parcel.writeByte(w58.f ? (byte) 1 : 0);
            parcel.writeByte(w58.g ? (byte) 1 : 0);
            parcel.writeByte(w58.j ? (byte) 1 : 0);
            parcel.writeByte(w58.k ? (byte) 1 : 0);
            parcel.writeByte(w58.l ? (byte) 1 : 0);
            parcel.writeByte(w58.m ? (byte) 1 : 0);
            parcel.writeByte(w58.n ? (byte) 1 : 0);
            parcel.writeLong(w58.o);
            parcel.writeLong(w58.p);
            parcel.writeLong(w58.q);
            parcel.writeByte(w58.r ? (byte) 1 : 0);
        }
    }

    public x58(Parcel parcel) {
        if (!te8.s(parcel)) {
            u58 u58 = new u58();
            boolean z = false;
            u58.a = parcel.readByte() == 1;
            u58.b = parcel.readByte() == 1;
            u58.c = tr1.A(3)[parcel.readInt()];
            u58.d = tr1.A(3)[parcel.readInt()];
            u58.e = v58.values()[parcel.readInt()];
            u58.f = parcel.readByte() == 1;
            u58.g = parcel.readByte() == 1;
            u58.h = parcel.readLong();
            u58.i = parcel.readByte() == 1;
            u58.j = parcel.readByte() == 1;
            u58.k = parcel.readByte() == 1;
            u58.l = parcel.readByte() == 1;
            u58.m = parcel.readByte() == 1;
            u58.n = parcel.readByte() == 1;
            u58.o = parcel.readLong();
            u58.p = parcel.readLong();
            u58.q = parcel.readLong();
            u58.r = parcel.readByte() == 1 ? true : z;
            this.a = new w58(u58);
            return;
        }
        this.a = null;
    }
}
