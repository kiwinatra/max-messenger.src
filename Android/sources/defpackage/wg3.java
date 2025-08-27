package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wg3  reason: default package */
public final class wg3 implements xg3 {
    public static final Parcelable.Creator<wg3> CREATOR = new j22(13);
    public final Bundle a;

    public wg3(Bundle bundle) {
        this.a = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
