package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u1h  reason: default package */
public final class u1h extends h3 {
    public static final Parcelable.Creator<u1h> CREATOR = new o0h(1);
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent o;
    public final String v;

    public u1h(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = iBinder;
        this.c = iBinder2;
        this.o = pendingIntent;
        this.v = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.t0(parcel, 2, this.b);
        tf6.t0(parcel, 3, this.c);
        tf6.u0(parcel, 4, this.o, i);
        tf6.w0(parcel, 6, this.v);
        tf6.E0(parcel, B0);
    }
}
