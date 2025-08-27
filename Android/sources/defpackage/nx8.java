package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* renamed from: nx8  reason: default package */
public final class nx8 implements Parcelable {
    public static final Parcelable.Creator<nx8> CREATOR = new f27(26);
    public ResultReceiver a;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
