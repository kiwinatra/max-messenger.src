package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: tp  reason: default package */
public final class tp implements qp9 {
    public static final Parcelable.Creator<tp> CREATOR = new s6(7);
    public final int a;
    public final String b;

    public tp(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        return wj6.n(sb, this.b, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.a);
    }
}
