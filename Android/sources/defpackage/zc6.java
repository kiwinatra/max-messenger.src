package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zc6  reason: default package */
public final class zc6 implements Parcelable {
    public static final Parcelable.Creator<zc6> CREATOR = new uv4(16);
    public String a;
    public int b;

    public zc6(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
