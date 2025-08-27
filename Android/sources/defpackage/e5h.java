package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.apache.http.HttpStatus;

/* renamed from: e5h  reason: default package */
public final class e5h extends BasePendingResult {
    public final /* synthetic */ int p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e5h(mvg mvg, int i) {
        super(mvg);
        this.p = i;
        vzg.n(mvg, "GoogleApiClient must not be null");
        vzg.n(h80.a, "Api must not be null");
    }

    public final /* synthetic */ u4d U(Status status) {
        int i = this.p;
        return status;
    }

    public final void Y(ql qlVar) {
        switch (this.p) {
            case 0:
                a3h a3h = (a3h) qlVar;
                u7h u7h = (u7h) a3h.o();
                z5h z5h = new z5h(this, 0);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(u7h.e);
                int i = y2h.a;
                obtain.writeStrongBinder(z5h);
                GoogleSignInOptions googleSignInOptions = a3h.I0;
                if (googleSignInOptions == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    googleSignInOptions.writeToParcel(obtain, 0);
                }
                u7h.I0(obtain, HttpStatus.SC_PROCESSING);
                return;
            default:
                a3h a3h2 = (a3h) qlVar;
                u7h u7h2 = (u7h) a3h2.o();
                z5h z5h2 = new z5h(this, 1);
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(u7h2.e);
                int i2 = y2h.a;
                obtain2.writeStrongBinder(z5h2);
                GoogleSignInOptions googleSignInOptions2 = a3h2.I0;
                if (googleSignInOptions2 == null) {
                    obtain2.writeInt(0);
                } else {
                    obtain2.writeInt(1);
                    googleSignInOptions2.writeToParcel(obtain2, 0);
                }
                u7h2.I0(obtain2, 103);
                return;
        }
    }

    public final void Z(Status status) {
        vzg.f("Failed result must not be success", !(status.a <= 0));
        X(U(status));
    }
}
