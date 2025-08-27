package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: tzg  reason: default package */
public final class tzg extends h3 {
    public static final Parcelable.Creator<tzg> CREATOR = new o0h(0);
    public final String a;
    public final int b;

    public tzg(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.w0(parcel, 1, this.a);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(this.b);
        tf6.E0(parcel, B0);
    }
}
