package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: be8  reason: default package */
public final class be8 extends h3 {
    public static final Parcelable.Creator<be8> CREATOR = new o0h(11);
    public final String a;

    public be8(String str) {
        vzg.n(str, "json must not be null");
        this.a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.w0(parcel, 2, this.a);
        tf6.E0(parcel, B0);
    }
}
