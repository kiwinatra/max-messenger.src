package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b1d  reason: default package */
public final class b1d extends h3 {
    public static final Parcelable.Creator<b1d> CREATOR = new w0b(28);
    public final Bundle a;
    public ts b;

    public b1d(Bundle bundle) {
        this.a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.r0(parcel, 2, this.a);
        tf6.E0(parcel, B0);
    }
}
