package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: dvg  reason: default package */
public final class dvg extends h3 implements u4d {
    public static final Parcelable.Creator<dvg> CREATOR = new nje(29);
    public final int a;
    public final int b;
    public final Intent c;

    public dvg(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final Status a() {
        return this.b == 0 ? Status.v : Status.z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(this.b);
        tf6.u0(parcel, 3, this.c, i);
        tf6.E0(parcel, B0);
    }
}
