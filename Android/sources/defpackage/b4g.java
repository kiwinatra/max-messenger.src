package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b4g  reason: default package */
public final class b4g extends c4g {
    public static final Parcelable.Creator<b4g> CREATOR = new nje(19);
    public final y3g a;

    public b4g(y3g y3g) {
        this.a = y3g;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
