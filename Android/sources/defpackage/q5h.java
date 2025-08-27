package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: q5h  reason: default package */
public final class q5h extends h3 implements u4d {
    public static final Parcelable.Creator<q5h> CREATOR = new o0h(7);
    public final Status a;

    public q5h(Status status) {
        this.a = status;
    }

    public final Status a() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.u0(parcel, 1, this.a, i);
        tf6.E0(parcel, B0);
    }
}
