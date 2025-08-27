package defpackage;

import android.os.Parcel;

/* renamed from: q6h  reason: default package */
public abstract class q6h extends hvg implements y6h {
    public q6h() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 5);
    }

    public final boolean J0(Parcel parcel, int i) {
        if (i == 1) {
            gzg.c(parcel);
            i((q5h) gzg.a(parcel, q5h.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            a();
        }
        return true;
    }
}
