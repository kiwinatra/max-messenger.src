package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j8b  reason: default package */
public final class j8b implements Parcelable {
    public static final Parcelable.Creator<j8b> CREATOR = new w0b(2);
    public final int a;
    public final int b;
    public final int c;
    public final int o;
    public final int v;

    public j8b(Parcel parcel) {
        this.a = parcel.readInt();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        this.v = parcel.readInt();
        this.b = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeInt(this.v);
        parcel.writeInt(this.b);
    }
}
