package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f5d  reason: default package */
public abstract class f5d implements Parcelable {
    public static final Parcelable.Creator<f5d> CREATOR = new ivg(23);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        bxg bxg = (bxg) this;
        parcel.writeParcelable(bxg.a, 0);
        parcel.writeInt(bxg.b ? 1 : 0);
    }
}
