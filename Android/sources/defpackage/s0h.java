package defpackage;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: s0h  reason: default package */
public final class s0h extends hvg {
    public final /* synthetic */ int d;
    public final /* synthetic */ qdf e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s0h(int i, qdf qdf) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 5);
        this.d = i;
        switch (i) {
            case 1:
                this.e = qdf;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 5);
                return;
            default:
                this.e = qdf;
                return;
        }
    }

    public final boolean J0(Parcel parcel, int i) {
        switch (this.d) {
            case 0:
                if (i != 1) {
                    return false;
                }
                gzg.c(parcel);
                gsg.z(((k68) gzg.a(parcel, k68.CREATOR)).a, new Object(), this.e);
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                gzg.c(parcel);
                gsg.z((Status) gzg.a(parcel, Status.CREATOR), (Location) gzg.a(parcel, Location.CREATOR), this.e);
                return true;
        }
    }
}
