package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: sp  reason: default package */
public final class sp implements pp9 {
    public static final Parcelable.Creator<sp> CREATOR = new s6(6);
    public final int a;
    public final String b;

    public sp(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = this.b;
        StringBuilder sb = new StringBuilder(g63.f(33, str));
        sb.append("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.a);
    }
}
