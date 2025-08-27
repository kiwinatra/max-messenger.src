package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: yy5  reason: default package */
public final class yy5 extends az5 {
    public static final Parcelable.Creator<yy5> CREATOR = new uv4(10);
    public final String a;

    public yy5(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
