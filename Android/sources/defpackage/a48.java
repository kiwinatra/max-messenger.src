package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a48  reason: default package */
public final class a48 implements Parcelable {
    public static final Parcelable.Creator<a48> CREATOR = new f27(13);
    public final boolean X;
    public final int Y;
    public final int Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int o;
    public final String v;
    public final String w;
    public final int x;
    public final Rect y;
    public final float[] z;

    public a48(z38 z38) {
        this.a = z38.a;
        this.b = z38.b;
        this.c = true;
        this.o = z38.c;
        this.v = z38.d;
        this.w = z38.e;
        this.x = z38.f;
        this.y = z38.g;
        this.z = z38.h;
        this.X = z38.i;
        this.Y = z38.j;
        this.Z = z38.k;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, z38] */
    public static z38 a() {
        ? obj = new Object();
        obj.a = true;
        obj.b = false;
        obj.i = true;
        return obj;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : 0);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeInt(this.o);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeInt(this.x);
        parcel.writeParcelable(this.y, i);
        parcel.writeFloatArray(this.z);
        parcel.writeByte(this.X ? (byte) 1 : 0);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
    }

    public a48(Parcel parcel) {
        boolean z2 = false;
        this.a = parcel.readByte() != 0;
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
        this.o = parcel.readInt();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readInt();
        this.y = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.z = parcel.createFloatArray();
        this.X = parcel.readByte() != 0 ? true : z2;
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
    }
}
