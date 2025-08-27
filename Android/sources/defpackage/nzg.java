package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import org.apache.http.HttpStatus;

/* renamed from: nzg  reason: default package */
public abstract class nzg extends hvg implements c7h {
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case HttpStatus.SC_SWITCHING_PROTOCOLS /*101*/:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) y2h.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) y2h.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case HttpStatus.SC_PROCESSING /*102*/:
                h((Status) y2h.a(parcel, Status.CREATOR));
                break;
            case 103:
                o((Status) y2h.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public void h(Status status) {
        throw new UnsupportedOperationException();
    }

    public void o(Status status) {
        throw new UnsupportedOperationException();
    }
}
