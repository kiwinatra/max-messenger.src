package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: w0h  reason: default package */
public final class w0h extends hvg {
    public final /* synthetic */ Object d;
    public final /* synthetic */ qdf e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w0h(Boolean bool, qdf qdf) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
        this.d = bool;
        this.e = qdf;
    }

    public final boolean H0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        rvg.b(parcel);
        gsg.z((Status) rvg.a(parcel, Status.CREATOR), this.d, this.e);
        return true;
    }
}
