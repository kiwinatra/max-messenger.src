package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qs9  reason: default package */
public final class qs9 extends ss9 {
    public static final Parcelable.Creator<qs9> CREATOR = new ia9(7);
    public final long a;

    public qs9(long j) {
        this.a = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
