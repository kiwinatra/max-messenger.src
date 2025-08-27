package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: k68  reason: default package */
public final class k68 extends h3 implements u4d {
    public static final Parcelable.Creator<k68> CREATOR = new ivg(18);
    public final Status a;
    public final l68 b;

    public k68(Status status, l68 l68) {
        this.a = status;
        this.b = l68;
    }

    public final Status a() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.u0(parcel, 1, this.a, i);
        tf6.u0(parcel, 2, this.b, i);
        tf6.E0(parcel, B0);
    }
}
