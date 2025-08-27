package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: stb  reason: default package */
public final class stb implements Parcelable {
    public static final Parcelable.Creator<stb> CREATOR = new w0b(14);
    public final mtb a;

    public stb(mtb mtb) {
        this.a = mtb;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        mtb mtb = this.a;
        parcel.writeInt(mtb.a);
        parcel.writeInt(mtb.b);
    }

    public stb(Parcel parcel) {
        this.a = new mtb(parcel.readInt(), parcel.readInt());
    }
}
