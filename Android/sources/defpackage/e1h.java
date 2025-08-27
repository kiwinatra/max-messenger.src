package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: e1h  reason: default package */
public final class e1h extends hvg implements r7h {
    public static final /* synthetic */ int e = 0;
    public final he d;

    public e1h(he heVar) {
        super("com.google.android.gms.location.ILocationCallback", 5);
        this.d = heVar;
    }

    public final boolean J0(Parcel parcel, int i) {
        he heVar = this.d;
        if (i == 1) {
            gzg.c(parcel);
            heVar.v().b(new p3a((Object) (LocationResult) gzg.a(parcel, LocationResult.CREATOR)));
        } else if (i == 2) {
            gzg.c(parcel);
            heVar.v().b(new z3a(18, (LocationAvailability) gzg.a(parcel, LocationAvailability.CREATOR)));
        } else if (i != 3) {
            return false;
        } else {
            u();
        }
        return true;
    }

    public final void u() {
        this.d.v().b(new d6a(18, (Object) this));
    }
}
