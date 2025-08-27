package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.a;

/* renamed from: f9e  reason: default package */
public final class f9e extends a implements ql {
    public static final /* synthetic */ int M0 = 0;
    public final boolean I0 = true;
    public final b33 J0;
    public final Bundle K0;
    public final Integer L0;

    public f9e(Context context, Looper looper, b33 b33, Bundle bundle, ft6 ft6, gt6 gt6) {
        super(context, looper, 44, b33, ft6, gt6);
        this.J0 = b33;
        this.K0 = bundle;
        this.L0 = (Integer) b33.y;
    }

    public final int f() {
        return 12451000;
    }

    public final boolean j() {
        return this.I0;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof iwg ? (iwg) queryLocalInterface : new bvg(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    public final Bundle n() {
        b33 b33 = this.J0;
        boolean equals = this.c.getPackageName().equals((String) b33.v);
        Bundle bundle = this.K0;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) b33.v);
        }
        return bundle;
    }

    public final String p() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String q() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void w() {
        e(new rt6(5, (Object) this));
    }

    public final void x(fwg fwg) {
        Parcel obtain;
        Parcel obtain2;
        vzg.n(fwg, "Expecting a valid ISignInCallbacks");
        try {
            Account account = (Account) this.J0.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount b = "<<default account>>".equals(account.name) ? twe.a(this.c).b() : null;
            Integer num = this.L0;
            vzg.m(num);
            wwg wwg = new wwg(2, account, num.intValue(), b);
            iwg iwg = (iwg) o();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(iwg.e);
            int i = rvg.a;
            obtain.writeInt(1);
            int B0 = tf6.B0(obtain, 20293);
            tf6.G0(obtain, 1, 4);
            obtain.writeInt(1);
            tf6.u0(obtain, 2, wwg, 0);
            tf6.E0(obtain, B0);
            obtain.writeStrongBinder(fwg.asBinder());
            obtain2 = Parcel.obtain();
            iwg.d.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        } catch (RemoteException e) {
            try {
                yvg yvg = (yvg) fwg;
                yvg.e.post(new vj6((Object) yvg, (Object) new rwg(1, new bi3(8, (PendingIntent) null), (xwg) null), false, 29));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            throw th;
        }
    }
}
