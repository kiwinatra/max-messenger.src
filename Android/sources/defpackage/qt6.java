package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qt6  reason: default package */
public final class qt6 extends h3 {
    public static final Parcelable.Creator<qt6> CREATOR = new nje(26);
    public final int a;
    public final int b;
    public final Bundle c;

    public qt6(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(this.b);
        tf6.r0(parcel, 3, this.c);
        tf6.E0(parcel, B0);
    }
}
