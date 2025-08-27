package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j02  reason: default package */
public final class j02 extends m02 {
    public static final Parcelable.Creator<j02> CREATOR = new s6(25);
    public final d48 a;
    public final Uri b;

    public j02(d48 d48, Uri uri) {
        this.a = d48;
        this.b = uri;
    }

    public final d48 a() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
