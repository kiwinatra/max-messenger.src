package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zy5  reason: default package */
public final class zy5 extends az5 {
    public static final Parcelable.Creator<zy5> CREATOR = new uv4(11);
    public final String a;

    public zy5(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
