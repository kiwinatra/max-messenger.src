package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a4g  reason: default package */
public final class a4g extends c4g {
    public static final Parcelable.Creator<a4g> CREATOR = new nje(18);
    public static final a4g a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
