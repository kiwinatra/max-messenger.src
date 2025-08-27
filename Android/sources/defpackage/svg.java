package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: svg  reason: default package */
public abstract class svg extends hvg implements fwg {
    public final boolean H0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                bi3 bi3 = (bi3) rvg.a(parcel, bi3.CREATOR);
                dvg dvg = (dvg) rvg.a(parcel, dvg.CREATOR);
                rvg.b(parcel);
                break;
            case 4:
                Status status = (Status) rvg.a(parcel, Status.CREATOR);
                rvg.b(parcel);
                break;
            case 6:
                Status status2 = (Status) rvg.a(parcel, Status.CREATOR);
                rvg.b(parcel);
                break;
            case 7:
                Status status3 = (Status) rvg.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) rvg.a(parcel, GoogleSignInAccount.CREATOR);
                rvg.b(parcel);
                break;
            case 8:
                rvg.b(parcel);
                yvg yvg = (yvg) this;
                yvg.e.post(new vj6((Object) yvg, (Object) (rwg) rvg.a(parcel, rwg.CREATOR), false, 29));
                break;
            case 9:
                mwg mwg = (mwg) rvg.a(parcel, mwg.CREATOR);
                rvg.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
