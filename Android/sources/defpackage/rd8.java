package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rd8  reason: default package */
public final class rd8 implements Parcelable {
    public static final Parcelable.Creator<rd8> CREATOR = new f27(17);
    public final qd8 a;

    public rd8(qd8 qd8) {
        this.a = qd8;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        qd8 qd8 = this.a;
        parcel.writeByte(qd8 == null ? (byte) 1 : 0);
        if (qd8 != null) {
            parcel.writeDouble(qd8.a);
            parcel.writeDouble(qd8.b);
            parcel.writeByte(qd8.c ? (byte) 1 : 0);
            parcel.writeByte(qd8.d ? (byte) 1 : 0);
            parcel.writeByte(qd8.e ? (byte) 1 : 0);
            parcel.writeInt(qd8.f);
            parcel.writeFloat(qd8.g);
            parcel.writeFloat(qd8.h);
            parcel.writeFloat(qd8.i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [qd8, java.lang.Object] */
    public rd8(Parcel parcel) {
        if (!te8.s(parcel)) {
            ? obj = new Object();
            obj.a = parcel.readDouble();
            obj.b = parcel.readDouble();
            boolean z = false;
            obj.c = parcel.readByte() == 1;
            obj.d = parcel.readByte() == 1;
            obj.e = parcel.readByte() == 1 ? true : z;
            obj.f = parcel.readInt();
            obj.g = parcel.readFloat();
            obj.h = parcel.readFloat();
            obj.i = parcel.readFloat();
            this.a = new qd8(obj);
            return;
        }
        this.a = null;
    }
}
