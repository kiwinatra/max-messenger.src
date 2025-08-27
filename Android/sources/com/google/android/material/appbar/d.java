package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

public final class d extends z {
    public static final Parcelable.Creator<d> CREATOR = new Object();
    public boolean c;
    public boolean o;
    public int v;
    public float w;
    public boolean x;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z = false;
        this.c = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
        this.v = parcel.readInt();
        this.w = parcel.readFloat();
        this.x = parcel.readByte() != 0 ? true : z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.o ? (byte) 1 : 0);
        parcel.writeInt(this.v);
        parcel.writeFloat(this.w);
        parcel.writeByte(this.x ? (byte) 1 : 0);
    }
}
