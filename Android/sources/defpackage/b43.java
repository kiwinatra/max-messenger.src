package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b43  reason: default package */
public final class b43 extends h3 {
    public static final Parcelable.Creator<b43> CREATOR = new ivg(8);
    public final Intent a;

    public b43(Intent intent) {
        this.a = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.u0(parcel, 1, this.a, i);
        tf6.E0(parcel, B0);
    }
}
