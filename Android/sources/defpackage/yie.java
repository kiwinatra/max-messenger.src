package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: yie  reason: default package */
public final class yie extends h3 {
    public static final Parcelable.Creator<yie> CREATOR = new o0h(15);
    public final y35 a;

    public yie(IBinder iBinder) {
        this.a = new y35(hha.L0(iBinder));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.t0(parcel, 2, ((p67) this.a.b).asBinder());
        tf6.E0(parcel, B0);
    }
}
