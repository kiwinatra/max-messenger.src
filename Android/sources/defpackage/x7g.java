package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x7g  reason: default package */
public final class x7g extends y7g {
    public static final Parcelable.Creator<x7g> CREATOR = new nje(21);
    public final qac a;

    public x7g(qac qac) {
        this.a = qac;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
