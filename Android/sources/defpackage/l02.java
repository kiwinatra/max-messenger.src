package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l02  reason: default package */
public final class l02 extends m02 {
    public static final Parcelable.Creator<l02> CREATOR = new s6(27);
    public final d48 a;
    public final String b;

    public l02(d48 d48, String str) {
        this.a = d48;
        this.b = str;
    }

    public final d48 a() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
