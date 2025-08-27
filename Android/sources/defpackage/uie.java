package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: uie  reason: default package */
public final class uie implements Parcelable {
    public static final Parcelable.Creator<uie> CREATOR = new g9d(26);
    public boolean X;
    public int a;
    public int b;
    public int c;
    public int[] o;
    public int v;
    public int[] w;
    public List x;
    public boolean y;
    public boolean z;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.c > 0) {
            parcel.writeIntArray(this.o);
        }
        parcel.writeInt(this.v);
        if (this.v > 0) {
            parcel.writeIntArray(this.w);
        }
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeList(this.x);
    }
}
