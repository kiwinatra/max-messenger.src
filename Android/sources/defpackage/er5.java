package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: er5  reason: default package */
public final class er5 extends bzc implements br5 {
    public static final Parcelable.Creator<er5> CREATOR = new uv4(7);
    public int X;
    public int Y;
    public int Z;
    public float v;
    public boolean v0;
    public float w;
    public int x;
    public float y;
    public int z;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.v);
        parcel.writeFloat(this.w);
        parcel.writeInt(this.x);
        parcel.writeFloat(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeByte(this.v0 ? (byte) 1 : 0);
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }
}
